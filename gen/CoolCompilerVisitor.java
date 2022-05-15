// Generated from C:/Users/Abdullah alashry/IdeaProjects/Compiler/src\CoolCompiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolCompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolCompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolCompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolCompilerParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(CoolCompilerParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolCompilerParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(CoolCompilerParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolCompilerParser#parm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParm(CoolCompilerParser.ParmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CoolCompilerParser.ExprContext ctx);
}