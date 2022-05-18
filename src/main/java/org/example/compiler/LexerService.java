package org.example.compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.example.compiler.gen.CoolCompilerLexer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LexerService {
  public static final String DIVIDER = "\n";

  public static LexerResult lexer(String inputFileData) {
    CharStream charStream = CharStreams.fromString(inputFileData);

    CoolCompilerLexer lexer = new CoolCompilerLexer(charStream);
    CommonTokenStream tokensStream = new CommonTokenStream(lexer);
    tokensStream.fill();
    Map<Boolean, List<Token>> errorTokensMap =
        tokensStream.getTokens().stream()
            .filter(token -> token.getType() > 0)
            .collect(
                Collectors.partitioningBy(
                    token -> {
                      int type = token.getType();
                      String ruleName = lexer.getRuleNames()[type - 1];
                      return "ERROR".equals(ruleName);
                    }));
    List<Token> errors = errorTokensMap.get(true);
    List<Token> result = errorTokensMap.get(false);
    return new LexerResult(tokensStream, getTokens(lexer, result), errors);
  }

  public static String getTokens(CoolCompilerLexer lexer, List<Token> resultTokens) {
    String[] ruleNames = lexer.getRuleNames();
    return resultTokens.stream()
        .map(
            token -> {
              String ruleName = ruleNames[token.getType() - 1];
              if ("ID".equals(ruleName)) {
                return token.getLine() + DIVIDER + ruleName + DIVIDER + token.getText();
              } else {
                return token.getLine() + DIVIDER + ruleName;
              }
            })
        .collect(Collectors.joining(DIVIDER));
  }
}
