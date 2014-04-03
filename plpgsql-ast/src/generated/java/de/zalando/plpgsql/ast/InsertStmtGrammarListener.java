// Generated from de/zalando/plpgsql/ast/InsertStmtGrammar.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InsertStmtGrammarParser}.
 */
public interface InsertStmtGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull InsertStmtGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull InsertStmtGrammarParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(@NotNull InsertStmtGrammarParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(@NotNull InsertStmtGrammarParser.FunctionCallExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void enterFetchClause(@NotNull InsertStmtGrammarParser.FetchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void exitFetchClause(@NotNull InsertStmtGrammarParser.FetchClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(@NotNull InsertStmtGrammarParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(@NotNull InsertStmtGrammarParser.LimitClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull InsertStmtGrammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull InsertStmtGrammarParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#leftJoin}.
	 * @param ctx the parse tree
	 */
	void enterLeftJoin(@NotNull InsertStmtGrammarParser.LeftJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#leftJoin}.
	 * @param ctx the parse tree
	 */
	void exitLeftJoin(@NotNull InsertStmtGrammarParser.LeftJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void enterDistinctClause(@NotNull InsertStmtGrammarParser.DistinctClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void exitDistinctClause(@NotNull InsertStmtGrammarParser.DistinctClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(@NotNull InsertStmtGrammarParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(@NotNull InsertStmtGrammarParser.ArrayAccessExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#usingOrdering}.
	 * @param ctx the parse tree
	 */
	void enterUsingOrdering(@NotNull InsertStmtGrammarParser.UsingOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#usingOrdering}.
	 * @param ctx the parse tree
	 */
	void exitUsingOrdering(@NotNull InsertStmtGrammarParser.UsingOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(@NotNull InsertStmtGrammarParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(@NotNull InsertStmtGrammarParser.InsertStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#rightJoin}.
	 * @param ctx the parse tree
	 */
	void enterRightJoin(@NotNull InsertStmtGrammarParser.RightJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#rightJoin}.
	 * @param ctx the parse tree
	 */
	void exitRightJoin(@NotNull InsertStmtGrammarParser.RightJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterArbitraryConstantExpression(@NotNull InsertStmtGrammarParser.ArbitraryConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitArbitraryConstantExpression(@NotNull InsertStmtGrammarParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#selectSpecific}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecific(@NotNull InsertStmtGrammarParser.SelectSpecificContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#selectSpecific}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecific(@NotNull InsertStmtGrammarParser.SelectSpecificContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#crossJoin}.
	 * @param ctx the parse tree
	 */
	void enterCrossJoin(@NotNull InsertStmtGrammarParser.CrossJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#crossJoin}.
	 * @param ctx the parse tree
	 */
	void exitCrossJoin(@NotNull InsertStmtGrammarParser.CrossJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalLiteralExpression(@NotNull InsertStmtGrammarParser.NumericalLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalLiteralExpression(@NotNull InsertStmtGrammarParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnList(@NotNull InsertStmtGrammarParser.InsertColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnList(@NotNull InsertStmtGrammarParser.InsertColumnListContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(@NotNull InsertStmtGrammarParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(@NotNull InsertStmtGrammarParser.FromTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull InsertStmtGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull InsertStmtGrammarParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#fullJoin}.
	 * @param ctx the parse tree
	 */
	void enterFullJoin(@NotNull InsertStmtGrammarParser.FullJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#fullJoin}.
	 * @param ctx the parse tree
	 */
	void exitFullJoin(@NotNull InsertStmtGrammarParser.FullJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#fullOuterJoin}.
	 * @param ctx the parse tree
	 */
	void enterFullOuterJoin(@NotNull InsertStmtGrammarParser.FullOuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#fullOuterJoin}.
	 * @param ctx the parse tree
	 */
	void exitFullOuterJoin(@NotNull InsertStmtGrammarParser.FullOuterJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(@NotNull InsertStmtGrammarParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(@NotNull InsertStmtGrammarParser.MulExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull InsertStmtGrammarParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull InsertStmtGrammarParser.SelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(@NotNull InsertStmtGrammarParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(@NotNull InsertStmtGrammarParser.JoinClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#nullsOrdering}.
	 * @param ctx the parse tree
	 */
	void enterNullsOrdering(@NotNull InsertStmtGrammarParser.NullsOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#nullsOrdering}.
	 * @param ctx the parse tree
	 */
	void exitNullsOrdering(@NotNull InsertStmtGrammarParser.NullsOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull InsertStmtGrammarParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull InsertStmtGrammarParser.DecimalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(@NotNull InsertStmtGrammarParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(@NotNull InsertStmtGrammarParser.AssignOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#lockedTables}.
	 * @param ctx the parse tree
	 */
	void enterLockedTables(@NotNull InsertStmtGrammarParser.LockedTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#lockedTables}.
	 * @param ctx the parse tree
	 */
	void exitLockedTables(@NotNull InsertStmtGrammarParser.LockedTablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(@NotNull InsertStmtGrammarParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(@NotNull InsertStmtGrammarParser.DivExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(@NotNull InsertStmtGrammarParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(@NotNull InsertStmtGrammarParser.ExponentiationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#insertColumn}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumn(@NotNull InsertStmtGrammarParser.InsertColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#insertColumn}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumn(@NotNull InsertStmtGrammarParser.InsertColumnContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#orderByUsing}.
	 * @param ctx the parse tree
	 */
	void enterOrderByUsing(@NotNull InsertStmtGrammarParser.OrderByUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#orderByUsing}.
	 * @param ctx the parse tree
	 */
	void exitOrderByUsing(@NotNull InsertStmtGrammarParser.OrderByUsingContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull InsertStmtGrammarParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull InsertStmtGrammarParser.FunctionCallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#columnAliasItem}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliasItem(@NotNull InsertStmtGrammarParser.ColumnAliasItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#columnAliasItem}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliasItem(@NotNull InsertStmtGrammarParser.ColumnAliasItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(@NotNull InsertStmtGrammarParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(@NotNull InsertStmtGrammarParser.InnerJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull InsertStmtGrammarParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull InsertStmtGrammarParser.ComparisonExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull InsertStmtGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull InsertStmtGrammarParser.ForClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(@NotNull InsertStmtGrammarParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(@NotNull InsertStmtGrammarParser.ModExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlias(@NotNull InsertStmtGrammarParser.ColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlias(@NotNull InsertStmtGrammarParser.ColumnAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(@NotNull InsertStmtGrammarParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(@NotNull InsertStmtGrammarParser.FromClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralExpression(@NotNull InsertStmtGrammarParser.BooleanLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralExpression(@NotNull InsertStmtGrammarParser.BooleanLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGroup(@NotNull InsertStmtGrammarParser.ExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGroup(@NotNull InsertStmtGrammarParser.ExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#lockedTable}.
	 * @param ctx the parse tree
	 */
	void enterLockedTable(@NotNull InsertStmtGrammarParser.LockedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#lockedTable}.
	 * @param ctx the parse tree
	 */
	void exitLockedTable(@NotNull InsertStmtGrammarParser.LockedTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(@NotNull InsertStmtGrammarParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(@NotNull InsertStmtGrammarParser.VarExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull InsertStmtGrammarParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull InsertStmtGrammarParser.AddExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(@NotNull InsertStmtGrammarParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(@NotNull InsertStmtGrammarParser.SelectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(@NotNull InsertStmtGrammarParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(@NotNull InsertStmtGrammarParser.HavingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull InsertStmtGrammarParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull InsertStmtGrammarParser.IntegerLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void enterLabelExpression(@NotNull InsertStmtGrammarParser.LabelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void exitLabelExpression(@NotNull InsertStmtGrammarParser.LabelExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void enterValuesClause(@NotNull InsertStmtGrammarParser.ValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void exitValuesClause(@NotNull InsertStmtGrammarParser.ValuesClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void enterConstantOfOtherTypes(@NotNull InsertStmtGrammarParser.ConstantOfOtherTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void exitConstantOfOtherTypes(@NotNull InsertStmtGrammarParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(@NotNull InsertStmtGrammarParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(@NotNull InsertStmtGrammarParser.IntoClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#rightOuterJoin}.
	 * @param ctx the parse tree
	 */
	void enterRightOuterJoin(@NotNull InsertStmtGrammarParser.RightOuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#rightOuterJoin}.
	 * @param ctx the parse tree
	 */
	void exitRightOuterJoin(@NotNull InsertStmtGrammarParser.RightOuterJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConjunctionExpression(@NotNull InsertStmtGrammarParser.LogicalConjunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConjunctionExpression(@NotNull InsertStmtGrammarParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#leftOuterJoin}.
	 * @param ctx the parse tree
	 */
	void enterLeftOuterJoin(@NotNull InsertStmtGrammarParser.LeftOuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#leftOuterJoin}.
	 * @param ctx the parse tree
	 */
	void exitLeftOuterJoin(@NotNull InsertStmtGrammarParser.LeftOuterJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpression(@NotNull InsertStmtGrammarParser.StringLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpression(@NotNull InsertStmtGrammarParser.StringLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(@NotNull InsertStmtGrammarParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(@NotNull InsertStmtGrammarParser.VariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(@NotNull InsertStmtGrammarParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(@NotNull InsertStmtGrammarParser.NumericConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#valueTuple}.
	 * @param ctx the parse tree
	 */
	void enterValueTuple(@NotNull InsertStmtGrammarParser.ValueTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#valueTuple}.
	 * @param ctx the parse tree
	 */
	void exitValueTuple(@NotNull InsertStmtGrammarParser.ValueTupleContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(@NotNull InsertStmtGrammarParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(@NotNull InsertStmtGrammarParser.SubExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(@NotNull InsertStmtGrammarParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(@NotNull InsertStmtGrammarParser.OrderByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#fromSelect}.
	 * @param ctx the parse tree
	 */
	void enterFromSelect(@NotNull InsertStmtGrammarParser.FromSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#fromSelect}.
	 * @param ctx the parse tree
	 */
	void exitFromSelect(@NotNull InsertStmtGrammarParser.FromSelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull InsertStmtGrammarParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull InsertStmtGrammarParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(@NotNull InsertStmtGrammarParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(@NotNull InsertStmtGrammarParser.SelectStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#standardOrdering}.
	 * @param ctx the parse tree
	 */
	void enterStandardOrdering(@NotNull InsertStmtGrammarParser.StandardOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#standardOrdering}.
	 * @param ctx the parse tree
	 */
	void exitStandardOrdering(@NotNull InsertStmtGrammarParser.StandardOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpr(@NotNull InsertStmtGrammarParser.StringLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpr(@NotNull InsertStmtGrammarParser.StringLiteralExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#selectAll}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(@NotNull InsertStmtGrammarParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#selectAll}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(@NotNull InsertStmtGrammarParser.SelectAllContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(@NotNull InsertStmtGrammarParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(@NotNull InsertStmtGrammarParser.OffsetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 */
	void enterBulkOperationClause(@NotNull InsertStmtGrammarParser.BulkOperationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 */
	void exitBulkOperationClause(@NotNull InsertStmtGrammarParser.BulkOperationClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpression(@NotNull InsertStmtGrammarParser.NegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpression(@NotNull InsertStmtGrammarParser.NegateExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalConstantExpression(@NotNull InsertStmtGrammarParser.NumericalConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalConstantExpression(@NotNull InsertStmtGrammarParser.NumericalConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(@NotNull InsertStmtGrammarParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(@NotNull InsertStmtGrammarParser.GroupByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link InsertStmtGrammarParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull InsertStmtGrammarParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link InsertStmtGrammarParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull InsertStmtGrammarParser.InsertContext ctx);
}