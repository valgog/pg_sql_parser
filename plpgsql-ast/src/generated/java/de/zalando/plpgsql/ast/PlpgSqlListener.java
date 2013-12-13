// Generated from de/zalando/plpgsql/ast/PlpgSql.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlpgSqlParser}.
 */
public interface PlpgSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlpgSqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(@NotNull PlpgSqlParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgSqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(@NotNull PlpgSqlParser.Function_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlpgSqlParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(@NotNull PlpgSqlParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgSqlParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(@NotNull PlpgSqlParser.StmtsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlpgSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PlpgSqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PlpgSqlParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlpgSqlParser#plpgsql}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsql(@NotNull PlpgSqlParser.PlpgsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgSqlParser#plpgsql}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsql(@NotNull PlpgSqlParser.PlpgsqlContext ctx);
}