// Generated from de/zalando/plpgsql/ast/SelectStmtGrammar.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SelectStmtGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SelectStmtGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull SelectStmtGrammarParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#functionCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(@NotNull SelectStmtGrammarParser.FunctionCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#fetchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchClause(@NotNull SelectStmtGrammarParser.FetchClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(@NotNull SelectStmtGrammarParser.LimitClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull SelectStmtGrammarParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#distinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctClause(@NotNull SelectStmtGrammarParser.DistinctClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull SelectStmtGrammarParser.StringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#likeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeExpression(@NotNull SelectStmtGrammarParser.LikeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(@NotNull SelectStmtGrammarParser.ArrayAccessExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#usingOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingOrdering(@NotNull SelectStmtGrammarParser.UsingOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#selectSpecific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecific(@NotNull SelectStmtGrammarParser.SelectSpecificContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitraryConstantExpression(@NotNull SelectStmtGrammarParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalLiteralExpression(@NotNull SelectStmtGrammarParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(@NotNull SelectStmtGrammarParser.FromTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull SelectStmtGrammarParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull SelectStmtGrammarParser.SelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull SelectStmtGrammarParser.MulExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#nullsOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullsOrdering(@NotNull SelectStmtGrammarParser.NullsOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(@NotNull SelectStmtGrammarParser.DecimalLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(@NotNull SelectStmtGrammarParser.AssignOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull SelectStmtGrammarParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#lockedTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedTables(@NotNull SelectStmtGrammarParser.LockedTablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationExpression(@NotNull SelectStmtGrammarParser.ExponentiationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#orderByUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByUsing(@NotNull SelectStmtGrammarParser.OrderByUsingContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull SelectStmtGrammarParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#columnAliasItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliasItem(@NotNull SelectStmtGrammarParser.ColumnAliasItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#similarToExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimilarToExpression(@NotNull SelectStmtGrammarParser.SimilarToExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(@NotNull SelectStmtGrammarParser.ComparisonExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(@NotNull SelectStmtGrammarParser.ModExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(@NotNull SelectStmtGrammarParser.ForClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#columnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(@NotNull SelectStmtGrammarParser.ColumnAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(@NotNull SelectStmtGrammarParser.FromClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralExpression(@NotNull SelectStmtGrammarParser.BooleanLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#expressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGroup(@NotNull SelectStmtGrammarParser.ExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#lockedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedTable(@NotNull SelectStmtGrammarParser.LockedTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull SelectStmtGrammarParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(@NotNull SelectStmtGrammarParser.VarExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(@NotNull SelectStmtGrammarParser.SelectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(@NotNull SelectStmtGrammarParser.HavingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull SelectStmtGrammarParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#labelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelExpression(@NotNull SelectStmtGrammarParser.LabelExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantOfOtherTypes(@NotNull SelectStmtGrammarParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(@NotNull SelectStmtGrammarParser.IntoClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConjunctionExpression(@NotNull SelectStmtGrammarParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(@NotNull SelectStmtGrammarParser.StringLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull SelectStmtGrammarParser.VariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(@NotNull SelectStmtGrammarParser.NumericConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(@NotNull SelectStmtGrammarParser.SubExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(@NotNull SelectStmtGrammarParser.OrderByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#fromSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSelect(@NotNull SelectStmtGrammarParser.FromSelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(@NotNull SelectStmtGrammarParser.SelectStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull SelectStmtGrammarParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#standardOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardOrdering(@NotNull SelectStmtGrammarParser.StandardOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#selectAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(@NotNull SelectStmtGrammarParser.SelectAllContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(@NotNull SelectStmtGrammarParser.OffsetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulkOperationClause(@NotNull SelectStmtGrammarParser.BulkOperationClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#negateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(@NotNull SelectStmtGrammarParser.NegateExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalConstantExpression(@NotNull SelectStmtGrammarParser.NumericalConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link SelectStmtGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(@NotNull SelectStmtGrammarParser.GroupByClauseContext ctx);
}