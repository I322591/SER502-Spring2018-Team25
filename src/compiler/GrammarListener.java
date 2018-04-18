// Generated from Grammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(@NotNull GrammarParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(@NotNull GrammarParser.PContext ctx);
}