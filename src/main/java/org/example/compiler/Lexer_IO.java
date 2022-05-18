package org.example.compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.example.compiler.gen.CoolCompilerLexer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Lexer_IO {
    private CoolCompilerLexer lexer;
    public CommonTokenStream tokensStream;
    private List<Token> tokens;
    private List<Token> errors;
    private List<String> outputTokens;
    private List<Token> outputTokens2;

    public Lexer_IO(String fileName) {
        CharStream charStream;
        try {
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new CoolCompilerLexer(charStream);
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        outputTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String[] ruleNames = lexer.getRuleNames();
        for (Token token : tokens) {
            int type = token.getType();
            int line = token.getLine();
            String text = token.getText();
            if (type > 0) {
                if (ruleNames[type - 1].equals("ERROR")) {
                    errors.add(token);
                } else {
                    outputTokens.add(Integer.toString(line));
                    outputTokens.add(ruleNames[type - 1]);
                    if ((ruleNames[type - 1]) == "ID") {
                        outputTokens.add(text);
                    }
                }
            }
        }

        if (errors.size() > 0)
            printError();
    }

    public List<String> getTokens() {
        return outputTokens;
    }

    public void writeTokens(String outputFile) {
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


    public void printError() {
        for (Token errorToken : errors) {
            System.err.println("lexical Error line Number :" + errorToken.getLine());
            System.err.println("lexical Error Name :" + errorToken.getText());
            System.err.println();
        }
        System.exit(0);
    }
}