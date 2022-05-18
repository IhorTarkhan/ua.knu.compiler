package org.example.compiler;

import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readString;
import static java.nio.file.Files.writeString;
import static org.example.compiler.LexerService.lexer;

public class Main {
  public static void main(String[] args) throws IOException {
    String inputFile = "good.cl";
    String inputFileData = readString(Path.of(inputFile));

    LexerResult lexerResult = lexer(inputFileData);
    printLexerErrors(lexerResult.errors());
    writeString(Path.of(inputFile + "-lex"), lexerResult.tokens());

    Parser_IO parser = new Parser_IO(lexerResult.tokensStream());
    parser.writeCST(inputFile + "-cst");
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
