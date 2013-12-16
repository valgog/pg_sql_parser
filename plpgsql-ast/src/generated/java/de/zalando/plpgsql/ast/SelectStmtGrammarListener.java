// Generated from de/zalando/plpgsql/ast/SelectStmtGrammar.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SelectStmtGrammarParser}.
 */
public interface SelectStmtGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(@NotNull SelectStmtGrammarParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(@NotNull SelectStmtGrammarParser.SelectStmtContext ctx);
}