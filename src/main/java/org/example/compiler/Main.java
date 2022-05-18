package org.example.compiler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String srcFile = "good.cl";
        Lexer_IO lexer = new Lexer_IO(srcFile);
        writeTokens(lexer.getTokens(), srcFile + "-lex");
        Parser_IO parser = new Parser_IO(lexer);
        parser.writeCST(srcFile + "-cst");

    }

    public static void writeTokens(List<String> outputTokens, String outputFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String token : outputTokens) {
                writer.write(token + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
