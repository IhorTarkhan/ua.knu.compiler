// Generated from C:/Users/Abdullah alashry/IdeaProjects/Compiler/src\CoolCompiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolCompilerParser}.
 */
public interface CoolCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolCompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolCompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolCompilerParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(CoolCompilerParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolCompilerParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(CoolCompilerParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolCompilerParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CoolCompilerParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolCompilerParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CoolCompilerParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolCompilerParser#parm}.
	 * @param ctx the parse tree
	 */
	void enterParm(CoolCompilerParser.ParmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolCompilerParser#parm}.
	 * @param ctx the parse tree
	 */
	void exitParm(CoolCompilerParser.ParmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CoolCompilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CoolCompilerParser.ExprContext ctx);
}