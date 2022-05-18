package org.example.compiler;

import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readString;
import static java.nio.file.Files.writeString;
import static org.example.compiler.LexerService.lex;
import static org.example.compiler.ParserService.parse;

public class Main {
  public static void main(String[] args) throws IOException {
    String inputFile = "good.cl";
    String inputFileData = readString(Path.of(inputFile));

    LexerResult lexerResult = lex(inputFileData);
    printLexerErrors(lexerResult.errors());
    writeString(Path.of(inputFile + "-lex"), lexerResult.tokens());

    String parseResult = parse(lexerResult.tokensStream());
    writeString(Path.of(inputFile + "-cst"), parseResult);
  }

  public static void printLexerErrors(List<Token> errors) {
    errors.forEach(
        error -> {
          System.err.println("lexical Error line Number :" + error.getLine());
          System.err.println("lexical Error Name :" + error.getText());
          System.err.println();
        });
    if (!errors.isEmpty()) {
      System.exit(0);
    }
  }
}
