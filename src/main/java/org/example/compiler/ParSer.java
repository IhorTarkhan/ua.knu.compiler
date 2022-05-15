package org.example.compiler;

import java.io.FileInputStream;
import java.sql.SQLOutput;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * This class {@link ParSer} is the main class
 *
 */

public class ParSer {
    /**
     * The main method takes an input file and print the output in a file
     * @param args
     * @throws IOException
     */
    public static  void main(String[] args) throws IOException{
        String srcFile = "good.cl";
        if(args.length >= 1)
            srcFile =args[0];
        Lexer_IO lexer = new Lexer_IO(srcFile);
        lexer.writeTokens(srcFile +"-lex");
        Parser_IO parser = new Parser_IO(lexer);
        parser.writeCST(srcFile + "-cst");

    }
}
/*
import java.io.IOException;


public class Main {
    public static  void main(String[] args) throws IOException{
        String srcFile = "good.cl";
        if(args.length >= 1)
            srcFile =args[0];
        Lexer_IO lexer = new Lexer_IO(srcFile);
        lexer.writeTokens(srcFile +"-lex");
    }
}

 */