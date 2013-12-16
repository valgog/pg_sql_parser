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
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull SelectStmtGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull SelectStmtGrammarParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(@NotNull SelectStmtGrammarParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(@NotNull SelectStmtGrammarParser.FunctionCallExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void enterFetchClause(@NotNull SelectStmtGrammarParser.FetchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void exitFetchClause(@NotNull SelectStmtGrammarParser.FetchClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(@NotNull SelectStmtGrammarParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(@NotNull SelectStmtGrammarParser.LimitClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull SelectStmtGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull SelectStmtGrammarParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void enterDistinctClause(@NotNull SelectStmtGrammarParser.DistinctClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void exitDistinctClause(@NotNull SelectStmtGrammarParser.DistinctClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SelectStmtGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SelectStmtGrammarParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(@NotNull SelectStmtGrammarParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(@NotNull SelectStmtGrammarParser.ArrayAccessExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#usingOrdering}.
	 * @param ctx the parse tree
	 */
	void enterUsingOrdering(@NotNull SelectStmtGrammarParser.UsingOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#usingOrdering}.
	 * @param ctx the parse tree
	 */
	void exitUsingOrdering(@NotNull SelectStmtGrammarParser.UsingOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterArbitraryConstantExpression(@NotNull SelectStmtGrammarParser.ArbitraryConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitArbitraryConstantExpression(@NotNull SelectStmtGrammarParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#selectSpecific}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecific(@NotNull SelectStmtGrammarParser.SelectSpecificContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#selectSpecific}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecific(@NotNull SelectStmtGrammarParser.SelectSpecificContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalLiteralExpression(@NotNull SelectStmtGrammarParser.NumericalLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalLiteralExpression(@NotNull SelectStmtGrammarParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(@NotNull SelectStmtGrammarParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(@NotNull SelectStmtGrammarParser.FromTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(@NotNull SelectStmtGrammarParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(@NotNull SelectStmtGrammarParser.BooleanConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull SelectStmtGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull SelectStmtGrammarParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull SelectStmtGrammarParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull SelectStmtGrammarParser.SelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(@NotNull SelectStmtGrammarParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(@NotNull SelectStmtGrammarParser.MulExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#nullsOrdering}.
	 * @param ctx the parse tree
	 */
	void enterNullsOrdering(@NotNull SelectStmtGrammarParser.NullsOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#nullsOrdering}.
	 * @param ctx the parse tree
	 */
	void exitNullsOrdering(@NotNull SelectStmtGrammarParser.NullsOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#numericalFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalFunctionExpression(@NotNull SelectStmtGrammarParser.NumericalFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#numericalFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalFunctionExpression(@NotNull SelectStmtGrammarParser.NumericalFunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(@NotNull SelectStmtGrammarParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(@NotNull SelectStmtGrammarParser.AssignOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#lockedTables}.
	 * @param ctx the parse tree
	 */
	void enterLockedTables(@NotNull SelectStmtGrammarParser.LockedTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#lockedTables}.
	 * @param ctx the parse tree
	 */
	void exitLockedTables(@NotNull SelectStmtGrammarParser.LockedTablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(@NotNull SelectStmtGrammarParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(@NotNull SelectStmtGrammarParser.DivExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(@NotNull SelectStmtGrammarParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(@NotNull SelectStmtGrammarParser.ExponentiationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#orderByUsing}.
	 * @param ctx the parse tree
	 */
	void enterOrderByUsing(@NotNull SelectStmtGrammarParser.OrderByUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#orderByUsing}.
	 * @param ctx the parse tree
	 */
	void exitOrderByUsing(@NotNull SelectStmtGrammarParser.OrderByUsingContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull SelectStmtGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull SelectStmtGrammarParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull SelectStmtGrammarParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull SelectStmtGrammarParser.FunctionCallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#columnAliasItem}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliasItem(@NotNull SelectStmtGrammarParser.ColumnAliasItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#columnAliasItem}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliasItem(@NotNull SelectStmtGrammarParser.ColumnAliasItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull SelectStmtGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull SelectStmtGrammarParser.ComparisonExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull SelectStmtGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull SelectStmtGrammarParser.ForClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(@NotNull SelectStmtGrammarParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(@NotNull SelectStmtGrammarParser.ModExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlias(@NotNull SelectStmtGrammarParser.ColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlias(@NotNull SelectStmtGrammarParser.ColumnAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(@NotNull SelectStmtGrammarParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(@NotNull SelectStmtGrammarParser.FromClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGroup(@NotNull SelectStmtGrammarParser.ExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGroup(@NotNull SelectStmtGrammarParser.ExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#lockedTable}.
	 * @param ctx the parse tree
	 */
	void enterLockedTable(@NotNull SelectStmtGrammarParser.LockedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#lockedTable}.
	 * @param ctx the parse tree
	 */
	void exitLockedTable(@NotNull SelectStmtGrammarParser.LockedTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#numericalExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterNumericalExpressionGroup(@NotNull SelectStmtGrammarParser.NumericalExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#numericalExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitNumericalExpressionGroup(@NotNull SelectStmtGrammarParser.NumericalExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull SelectStmtGrammarParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull SelectStmtGrammarParser.AddExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(@NotNull SelectStmtGrammarParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(@NotNull SelectStmtGrammarParser.SelectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(@NotNull SelectStmtGrammarParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(@NotNull SelectStmtGrammarParser.HavingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void enterConstantOfOtherTypes(@NotNull SelectStmtGrammarParser.ConstantOfOtherTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void exitConstantOfOtherTypes(@NotNull SelectStmtGrammarParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#copyType}.
	 * @param ctx the parse tree
	 */
	void enterCopyType(@NotNull SelectStmtGrammarParser.CopyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#copyType}.
	 * @param ctx the parse tree
	 */
	void exitCopyType(@NotNull SelectStmtGrammarParser.CopyTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(@NotNull SelectStmtGrammarParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(@NotNull SelectStmtGrammarParser.IntoClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConjunctionExpression(@NotNull SelectStmtGrammarParser.LogicalConjunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConjunctionExpression(@NotNull SelectStmtGrammarParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#booleanVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVariableExpression(@NotNull SelectStmtGrammarParser.BooleanVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#booleanVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVariableExpression(@NotNull SelectStmtGrammarParser.BooleanVariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpression(@NotNull SelectStmtGrammarParser.StringLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpression(@NotNull SelectStmtGrammarParser.StringLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#rowType}.
	 * @param ctx the parse tree
	 */
	void enterRowType(@NotNull SelectStmtGrammarParser.RowTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#rowType}.
	 * @param ctx the parse tree
	 */
	void exitRowType(@NotNull SelectStmtGrammarParser.RowTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(@NotNull SelectStmtGrammarParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(@NotNull SelectStmtGrammarParser.VariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalExpression(@NotNull SelectStmtGrammarParser.NumericalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalExpression(@NotNull SelectStmtGrammarParser.NumericalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(@NotNull SelectStmtGrammarParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(@NotNull SelectStmtGrammarParser.NumericConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(@NotNull SelectStmtGrammarParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(@NotNull SelectStmtGrammarParser.SubExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(@NotNull SelectStmtGrammarParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(@NotNull SelectStmtGrammarParser.OrderByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#fromSelect}.
	 * @param ctx the parse tree
	 */
	void enterFromSelect(@NotNull SelectStmtGrammarParser.FromSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#fromSelect}.
	 * @param ctx the parse tree
	 */
	void exitFromSelect(@NotNull SelectStmtGrammarParser.FromSelectContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#standardOrdering}.
	 * @param ctx the parse tree
	 */
	void enterStandardOrdering(@NotNull SelectStmtGrammarParser.StandardOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#standardOrdering}.
	 * @param ctx the parse tree
	 */
	void exitStandardOrdering(@NotNull SelectStmtGrammarParser.StandardOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#selectAll}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(@NotNull SelectStmtGrammarParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#selectAll}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(@NotNull SelectStmtGrammarParser.SelectAllContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#numericVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericVariableExpression(@NotNull SelectStmtGrammarParser.NumericVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#numericVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericVariableExpression(@NotNull SelectStmtGrammarParser.NumericVariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(@NotNull SelectStmtGrammarParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(@NotNull SelectStmtGrammarParser.OffsetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 */
	void enterBulkOperationClause(@NotNull SelectStmtGrammarParser.BulkOperationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 */
	void exitBulkOperationClause(@NotNull SelectStmtGrammarParser.BulkOperationClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpression(@NotNull SelectStmtGrammarParser.NegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpression(@NotNull SelectStmtGrammarParser.NegateExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull SelectStmtGrammarParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull SelectStmtGrammarParser.BooleanExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#booleanArbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArbitraryConstantExpression(@NotNull SelectStmtGrammarParser.BooleanArbitraryConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#booleanArbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArbitraryConstantExpression(@NotNull SelectStmtGrammarParser.BooleanArbitraryConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#booeleanExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterBooeleanExpressionGroup(@NotNull SelectStmtGrammarParser.BooeleanExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#booeleanExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitBooeleanExpressionGroup(@NotNull SelectStmtGrammarParser.BooeleanExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link SelectStmtGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(@NotNull SelectStmtGrammarParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SelectStmtGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(@NotNull SelectStmtGrammarParser.GroupByClauseContext ctx);
}