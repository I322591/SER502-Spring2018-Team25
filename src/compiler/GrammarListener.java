// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull GrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(@NotNull GrammarParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(@NotNull GrammarParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull GrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull GrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull GrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(@NotNull GrammarParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(@NotNull GrammarParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#disp}.
	 * @param ctx the parse tree
	 */
	void enterDisp(@NotNull GrammarParser.DispContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#disp}.
	 * @param ctx the parse tree
	 */
	void exitDisp(@NotNull GrammarParser.DispContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull GrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull GrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull GrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull GrammarParser.CommandContext ctx);
}