package org.example.compiler;

import org.antlr.v4.runtime.CommonTokenStream;
import org.example.compiler.gen.CoolCompilerParser;

public class ParserService {
  public static String parse(CommonTokenStream tokenStream) {
    CoolCompilerParser coolParser = new CoolCompilerParser(tokenStream);
    coolParser.removeErrorListeners();
    coolParser.addErrorListener(new ParsingErrorListener());
    return coolParser.program().toStringTree(coolParser);
  }
}
