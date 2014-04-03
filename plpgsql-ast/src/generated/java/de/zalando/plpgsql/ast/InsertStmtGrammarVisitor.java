// Generated from de/zalando/plpgsql/ast/InsertStmtGrammar.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InsertStmtGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InsertStmtGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(@NotNull InsertStmtGrammarParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#functionCallExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(@NotNull InsertStmtGrammarParser.FunctionCallExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#fetchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchClause(@NotNull InsertStmtGrammarParser.FetchClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(@NotNull InsertStmtGrammarParser.LimitClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(@NotNull InsertStmtGrammarParser.UnaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#leftJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftJoin(@NotNull InsertStmtGrammarParser.LeftJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#distinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctClause(@NotNull InsertStmtGrammarParser.DistinctClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(@NotNull InsertStmtGrammarParser.ArrayAccessExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#usingOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingOrdering(@NotNull InsertStmtGrammarParser.UsingOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(@NotNull InsertStmtGrammarParser.InsertStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#rightJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightJoin(@NotNull InsertStmtGrammarParser.RightJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArbitraryConstantExpression(@NotNull InsertStmtGrammarParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#selectSpecific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecific(@NotNull InsertStmtGrammarParser.SelectSpecificContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#crossJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossJoin(@NotNull InsertStmtGrammarParser.CrossJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalLiteralExpression(@NotNull InsertStmtGrammarParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#insertColumnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumnList(@NotNull InsertStmtGrammarParser.InsertColumnListContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(@NotNull InsertStmtGrammarParser.FromTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull InsertStmtGrammarParser.ConditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#fullJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullJoin(@NotNull InsertStmtGrammarParser.FullJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#fullOuterJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullOuterJoin(@NotNull InsertStmtGrammarParser.FullOuterJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#mulExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpression(@NotNull InsertStmtGrammarParser.MulExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull InsertStmtGrammarParser.SelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(@NotNull InsertStmtGrammarParser.JoinClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#nullsOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullsOrdering(@NotNull InsertStmtGrammarParser.NullsOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(@NotNull InsertStmtGrammarParser.DecimalLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(@NotNull InsertStmtGrammarParser.AssignOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#lockedTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedTables(@NotNull InsertStmtGrammarParser.LockedTablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#divExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpression(@NotNull InsertStmtGrammarParser.DivExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentiationExpression(@NotNull InsertStmtGrammarParser.ExponentiationExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#insertColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumn(@NotNull InsertStmtGrammarParser.InsertColumnContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#orderByUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByUsing(@NotNull InsertStmtGrammarParser.OrderByUsingContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull InsertStmtGrammarParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#columnAliasItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliasItem(@NotNull InsertStmtGrammarParser.ColumnAliasItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#innerJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(@NotNull InsertStmtGrammarParser.InnerJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(@NotNull InsertStmtGrammarParser.ComparisonExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(@NotNull InsertStmtGrammarParser.ForClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#modExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpression(@NotNull InsertStmtGrammarParser.ModExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#columnAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAlias(@NotNull InsertStmtGrammarParser.ColumnAliasContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(@NotNull InsertStmtGrammarParser.FromClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralExpression(@NotNull InsertStmtGrammarParser.BooleanLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#expressionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGroup(@NotNull InsertStmtGrammarParser.ExpressionGroupContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#lockedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedTable(@NotNull InsertStmtGrammarParser.LockedTableContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#varExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(@NotNull InsertStmtGrammarParser.VarExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull InsertStmtGrammarParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(@NotNull InsertStmtGrammarParser.SelectListContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(@NotNull InsertStmtGrammarParser.HavingClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull InsertStmtGrammarParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#labelExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelExpression(@NotNull InsertStmtGrammarParser.LabelExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#valuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesClause(@NotNull InsertStmtGrammarParser.ValuesClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantOfOtherTypes(@NotNull InsertStmtGrammarParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(@NotNull InsertStmtGrammarParser.IntoClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#rightOuterJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightOuterJoin(@NotNull InsertStmtGrammarParser.RightOuterJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConjunctionExpression(@NotNull InsertStmtGrammarParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#leftOuterJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftOuterJoin(@NotNull InsertStmtGrammarParser.LeftOuterJoinContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpression(@NotNull InsertStmtGrammarParser.StringLiteralExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#variableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(@NotNull InsertStmtGrammarParser.VariableExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#numericConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericConstant(@NotNull InsertStmtGrammarParser.NumericConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#valueTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueTuple(@NotNull InsertStmtGrammarParser.ValueTupleContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(@NotNull InsertStmtGrammarParser.SubExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(@NotNull InsertStmtGrammarParser.OrderByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#fromSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSelect(@NotNull InsertStmtGrammarParser.FromSelectContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull InsertStmtGrammarParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(@NotNull InsertStmtGrammarParser.SelectStmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#standardOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardOrdering(@NotNull InsertStmtGrammarParser.StandardOrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(@NotNull InsertStmtGrammarParser.StringLiteralExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#selectAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(@NotNull InsertStmtGrammarParser.SelectAllContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#offsetClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetClause(@NotNull InsertStmtGrammarParser.OffsetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulkOperationClause(@NotNull InsertStmtGrammarParser.BulkOperationClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#negateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpression(@NotNull InsertStmtGrammarParser.NegateExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalConstantExpression(@NotNull InsertStmtGrammarParser.NumericalConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(@NotNull InsertStmtGrammarParser.GroupByClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link InsertStmtGrammarParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(@NotNull InsertStmtGrammarParser.InsertContext ctx);
}