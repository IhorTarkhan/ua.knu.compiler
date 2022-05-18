package org.example.compiler;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.List;

public record LexerResult(CommonTokenStream tokensStream, String tokens, List<Token> errors) {}
