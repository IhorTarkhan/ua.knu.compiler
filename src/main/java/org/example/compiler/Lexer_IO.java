package org.example.compiler;//import com.sun.jdi.event.MethodExitEvent;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

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

    public Lexer_IO(String fileName) {
        CharStream charStream;
        try{
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new CoolCompilerLexer(charStream);
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        lex();
    }

    private void lex() {
        outputTokens = new ArrayList<>();
        errors = new ArrayList<>();
        String[] ruleNames = lexer.getRuleNames();
        for (Token token : tokens) {
            if (token.getType() > 0) {        //Not EOF
                if (ruleNames[token.getType() - 1].equals("ERROR")) {
                    errors.add(token);
                } else {
                    outputTokens.add(Integer.toString(token.getLine()));
                    outputTokens.add(ruleNames[token.getType() - 1]);
                    if ((ruleNames[token.getType()-1])=="ID")
                        outputTokens.add(token.getText());
                }
            }
        }

        if ( errors.size() > 0 )
            printError() ;
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

            System.out.print("\nlexical Error line Number :");
            System.out.println(errorToken.getLine());
            System.out.print("lexical Error Name :");
            System.out.println(errorToken.getText());
        }
        System.exit(0);
    }
}