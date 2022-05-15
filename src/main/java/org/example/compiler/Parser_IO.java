package org.example.compiler;

import org.antlr.v4.runtime.tree.ParseTree;
import org.example.compiler.gen.CoolCompilerParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Parser_IO {
    public CoolCompilerParser coolParser;

    public Parser_IO(Lexer_IO lexer) {

        coolParser = new CoolCompilerParser(lexer.tokensStream);
        coolParser.removeErrorListeners();
        coolParser.addErrorListener(ParsingErrorListener.ParsingErrorListenerObject);

    }

    public void writeCST(String fileName) {
        ParseTree Tree = coolParser.program();
        String tree = Tree.toStringTree(coolParser);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(tree);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
