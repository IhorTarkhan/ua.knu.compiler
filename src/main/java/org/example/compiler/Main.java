package org.example.compiler;

import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.example.compiler.LexerService.lexer;

public class Main {
  public static void main(String[] args) throws IOException {
    String inputFile = "good.cl";
    String inputFileData = Files.readString(Path.of(inputFile));

    LexerResult lexerResult = lexer(inputFileData);
    printLexerErrors(lexerResult.errors());
    saveTokenToFile(lexerResult.tokens(), inputFile + "-lex");

    Parser_IO parser = new Parser_IO(lexerResult);
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

  public static void saveTokenToFile(String outputTokens, String outputFile) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
      writer.write(outputTokens + "\n");
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
