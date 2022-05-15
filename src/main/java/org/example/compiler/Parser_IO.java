package org.example.compiler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.v4.runtime.tree.*;
import org.example.compiler.gen.CoolCompilerParser;

/**
 * This class {@link Parser_IO} to deal with the input file, parse it and detect the parse error
 * print CST in a file in case of right code
 *
 */
public class Parser_IO {
    public CoolCompilerParser coolParser;

    /**
     * This constructor {@link Parser_IO} to get the tokenstream of the file and parse it
     * print errors
     * @param lexer
     */
    public Parser_IO(Lexer_IO lexer) {

        coolParser = new CoolCompilerParser(lexer.tokensStream);
        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.ParsingErrorListenerObject);

    }

    /**
     * This function to write the CST in a file
     * @param fileName
     */

    public void writeCST(String fileName){

        ParseTree Tree = coolParser.program();
        String tree = Tree.toStringTree(coolParser);
        try{
            BufferedWriter bw =new BufferedWriter(new FileWriter(fileName));
            bw.write(tree);
            bw.close();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
