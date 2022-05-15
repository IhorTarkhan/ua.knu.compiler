package org.example.compiler;

public class Main {
    public static void main(String[] args) {
        String srcFile = "good.cl";
        Lexer_IO lexer = new Lexer_IO(srcFile);
        lexer.writeTokens(srcFile + "-lex");
        Parser_IO parser = new Parser_IO(lexer);
        parser.writeCST(srcFile + "-cst");

    }
}
