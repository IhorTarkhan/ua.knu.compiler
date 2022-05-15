package org.example.compiler;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 * This class {@link ParsingErrorListener} is override the syntaxError()method in the BaseErrorListener class to print the error
 */
public class ParsingErrorListener extends BaseErrorListener {

    public static final ParsingErrorListener ParsingErrorListenerObject = new ParsingErrorListener();

    /**
     * This method is called when the listener detects an error
     * @param recognizer
     * @param offendingSymbol
     * @param line
     * @param charPositionInLine
     * @param msg
     * @param e
     * @throws ParseCancellationException
     */

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        throw new ParseCancellationException("\n line"+ line + ":" + msg);
    }
}

