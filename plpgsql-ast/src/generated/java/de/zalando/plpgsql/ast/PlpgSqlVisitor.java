// Generated from de/zalando/plpgsql/ast/PlpgSql.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlpgSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlpgSqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlpgSqlParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(@NotNull PlpgSqlParser.Function_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlpgSqlParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(@NotNull PlpgSqlParser.StmtsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlpgSqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull PlpgSqlParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link PlpgSqlParser#plpgsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsql(@NotNull PlpgSqlParser.PlpgsqlContext ctx);
}