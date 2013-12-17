// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlPgSqlParser}.
 */
public interface PlPgSqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(@NotNull PlPgSqlParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(@NotNull PlPgSqlParser.FunctionCallExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(@NotNull PlPgSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(@NotNull PlPgSqlParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionCosts}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCosts(@NotNull PlPgSqlParser.FunctionCostsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionCosts}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCosts(@NotNull PlPgSqlParser.FunctionCostsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void enterFetchClause(@NotNull PlPgSqlParser.FetchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fetchClause}.
	 * @param ctx the parse tree
	 */
	void exitFetchClause(@NotNull PlPgSqlParser.FetchClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(@NotNull PlPgSqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(@NotNull PlPgSqlParser.LimitClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull PlPgSqlParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull PlPgSqlParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionSettings}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSettings(@NotNull PlPgSqlParser.FunctionSettingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionSettings}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSettings(@NotNull PlPgSqlParser.FunctionSettingsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void enterDistinctClause(@NotNull PlPgSqlParser.DistinctClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void exitDistinctClause(@NotNull PlPgSqlParser.DistinctClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(@NotNull PlPgSqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(@NotNull PlPgSqlParser.StringLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#likeExpression}.
	 * @param ctx the parse tree
	 */
	void enterLikeExpression(@NotNull PlPgSqlParser.LikeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#likeExpression}.
	 * @param ctx the parse tree
	 */
	void exitLikeExpression(@NotNull PlPgSqlParser.LikeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exceptionWhenCondition}.
	 * @param ctx the parse tree
	 */
	void enterExceptionWhenCondition(@NotNull PlPgSqlParser.ExceptionWhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exceptionWhenCondition}.
	 * @param ctx the parse tree
	 */
	void exitExceptionWhenCondition(@NotNull PlPgSqlParser.ExceptionWhenConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(@NotNull PlPgSqlParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(@NotNull PlPgSqlParser.ArrayAccessExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#usingOrdering}.
	 * @param ctx the parse tree
	 */
	void enterUsingOrdering(@NotNull PlPgSqlParser.UsingOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#usingOrdering}.
	 * @param ctx the parse tree
	 */
	void exitUsingOrdering(@NotNull PlPgSqlParser.UsingOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(@NotNull PlPgSqlParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(@NotNull PlPgSqlParser.FunctionArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterArbitraryConstantExpression(@NotNull PlPgSqlParser.ArbitraryConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitArbitraryConstantExpression(@NotNull PlPgSqlParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#selectSpecific}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecific(@NotNull PlPgSqlParser.SelectSpecificContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#selectSpecific}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecific(@NotNull PlPgSqlParser.SelectSpecificContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalLiteralExpression(@NotNull PlPgSqlParser.NumericalLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalLiteralExpression(@NotNull PlPgSqlParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionRows}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRows(@NotNull PlPgSqlParser.FunctionRowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionRows}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRows(@NotNull PlPgSqlParser.FunctionRowsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(@NotNull PlPgSqlParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(@NotNull PlPgSqlParser.FromTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exceptionHandlingBlock}.
	 * @param ctx the parse tree
	 */
	void enterExceptionHandlingBlock(@NotNull PlPgSqlParser.ExceptionHandlingBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exceptionHandlingBlock}.
	 * @param ctx the parse tree
	 */
	void exitExceptionHandlingBlock(@NotNull PlPgSqlParser.ExceptionHandlingBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull PlPgSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull PlPgSqlParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(@NotNull PlPgSqlParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(@NotNull PlPgSqlParser.MulExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull PlPgSqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull PlPgSqlParser.SelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionBehavior}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBehavior(@NotNull PlPgSqlParser.FunctionBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionBehavior}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBehavior(@NotNull PlPgSqlParser.FunctionBehaviorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#nullsOrdering}.
	 * @param ctx the parse tree
	 */
	void enterNullsOrdering(@NotNull PlPgSqlParser.NullsOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#nullsOrdering}.
	 * @param ctx the parse tree
	 */
	void exitNullsOrdering(@NotNull PlPgSqlParser.NullsOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(@NotNull PlPgSqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(@NotNull PlPgSqlParser.DecimalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(@NotNull PlPgSqlParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(@NotNull PlPgSqlParser.AssignOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionSecurity}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSecurity(@NotNull PlPgSqlParser.FunctionSecurityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionSecurity}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSecurity(@NotNull PlPgSqlParser.FunctionSecurityContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(@NotNull PlPgSqlParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(@NotNull PlPgSqlParser.DivExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#lockedTables}.
	 * @param ctx the parse tree
	 */
	void enterLockedTables(@NotNull PlPgSqlParser.LockedTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#lockedTables}.
	 * @param ctx the parse tree
	 */
	void exitLockedTables(@NotNull PlPgSqlParser.LockedTablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(@NotNull PlPgSqlParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(@NotNull PlPgSqlParser.ExponentiationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#window}.
	 * @param ctx the parse tree
	 */
	void enterWindow(@NotNull PlPgSqlParser.WindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#window}.
	 * @param ctx the parse tree
	 */
	void exitWindow(@NotNull PlPgSqlParser.WindowContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#orderByUsing}.
	 * @param ctx the parse tree
	 */
	void enterOrderByUsing(@NotNull PlPgSqlParser.OrderByUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#orderByUsing}.
	 * @param ctx the parse tree
	 */
	void exitOrderByUsing(@NotNull PlPgSqlParser.OrderByUsingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull PlPgSqlParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull PlPgSqlParser.FunctionCallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#columnAliasItem}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliasItem(@NotNull PlPgSqlParser.ColumnAliasItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#columnAliasItem}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliasItem(@NotNull PlPgSqlParser.ColumnAliasItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#similarToExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimilarToExpression(@NotNull PlPgSqlParser.SimilarToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#similarToExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimilarToExpression(@NotNull PlPgSqlParser.SimilarToExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull PlPgSqlParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull PlPgSqlParser.ComparisonExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#plFunction}.
	 * @param ctx the parse tree
	 */
	void enterPlFunction(@NotNull PlPgSqlParser.PlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#plFunction}.
	 * @param ctx the parse tree
	 */
	void exitPlFunction(@NotNull PlPgSqlParser.PlFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(@NotNull PlPgSqlParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(@NotNull PlPgSqlParser.ModExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(@NotNull PlPgSqlParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(@NotNull PlPgSqlParser.ForClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(@NotNull PlPgSqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(@NotNull PlPgSqlParser.FromClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlias(@NotNull PlPgSqlParser.ColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlias(@NotNull PlPgSqlParser.ColumnAliasContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralExpression(@NotNull PlPgSqlParser.BooleanLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#booleanLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralExpression(@NotNull PlPgSqlParser.BooleanLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGroup(@NotNull PlPgSqlParser.ExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGroup(@NotNull PlPgSqlParser.ExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#lockedTable}.
	 * @param ctx the parse tree
	 */
	void enterLockedTable(@NotNull PlPgSqlParser.LockedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#lockedTable}.
	 * @param ctx the parse tree
	 */
	void exitLockedTable(@NotNull PlPgSqlParser.LockedTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull PlPgSqlParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull PlPgSqlParser.AddExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(@NotNull PlPgSqlParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#varExpr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(@NotNull PlPgSqlParser.VarExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsList(@NotNull PlPgSqlParser.FunctionArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionArgsList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsList(@NotNull PlPgSqlParser.FunctionArgsListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(@NotNull PlPgSqlParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(@NotNull PlPgSqlParser.StmtsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(@NotNull PlPgSqlParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(@NotNull PlPgSqlParser.SelectListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(@NotNull PlPgSqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(@NotNull PlPgSqlParser.HavingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull PlPgSqlParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull PlPgSqlParser.IntegerLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void enterLabelExpression(@NotNull PlPgSqlParser.LabelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#labelExpression}.
	 * @param ctx the parse tree
	 */
	void exitLabelExpression(@NotNull PlPgSqlParser.LabelExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void enterConstantOfOtherTypes(@NotNull PlPgSqlParser.ConstantOfOtherTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void exitConstantOfOtherTypes(@NotNull PlPgSqlParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationList(@NotNull PlPgSqlParser.VarDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#varDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationList(@NotNull PlPgSqlParser.VarDeclarationListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(@NotNull PlPgSqlParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(@NotNull PlPgSqlParser.IntoClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConjunctionExpression(@NotNull PlPgSqlParser.LogicalConjunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConjunctionExpression(@NotNull PlPgSqlParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull PlPgSqlParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull PlPgSqlParser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpression(@NotNull PlPgSqlParser.StringLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpression(@NotNull PlPgSqlParser.StringLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(@NotNull PlPgSqlParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(@NotNull PlPgSqlParser.VariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(@NotNull PlPgSqlParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(@NotNull PlPgSqlParser.NumericConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(@NotNull PlPgSqlParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(@NotNull PlPgSqlParser.SubExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionInputHandling}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInputHandling(@NotNull PlPgSqlParser.FunctionInputHandlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionInputHandling}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInputHandling(@NotNull PlPgSqlParser.FunctionInputHandlingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#exceptionWhenConditions}.
	 * @param ctx the parse tree
	 */
	void enterExceptionWhenConditions(@NotNull PlPgSqlParser.ExceptionWhenConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#exceptionWhenConditions}.
	 * @param ctx the parse tree
	 */
	void exitExceptionWhenConditions(@NotNull PlPgSqlParser.ExceptionWhenConditionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull PlPgSqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull PlPgSqlParser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(@NotNull PlPgSqlParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(@NotNull PlPgSqlParser.FunctionBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(@NotNull PlPgSqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(@NotNull PlPgSqlParser.OrderByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(@NotNull PlPgSqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(@NotNull PlPgSqlParser.BooleanLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(@NotNull PlPgSqlParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(@NotNull PlPgSqlParser.SelectStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#fromSelect}.
	 * @param ctx the parse tree
	 */
	void enterFromSelect(@NotNull PlPgSqlParser.FromSelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fromSelect}.
	 * @param ctx the parse tree
	 */
	void exitFromSelect(@NotNull PlPgSqlParser.FromSelectContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#standardOrdering}.
	 * @param ctx the parse tree
	 */
	void enterStandardOrdering(@NotNull PlPgSqlParser.StandardOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#standardOrdering}.
	 * @param ctx the parse tree
	 */
	void exitStandardOrdering(@NotNull PlPgSqlParser.StandardOrderingContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#selectAll}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(@NotNull PlPgSqlParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#selectAll}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(@NotNull PlPgSqlParser.SelectAllContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void enterOffsetClause(@NotNull PlPgSqlParser.OffsetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#offsetClause}.
	 * @param ctx the parse tree
	 */
	void exitOffsetClause(@NotNull PlPgSqlParser.OffsetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(@NotNull PlPgSqlParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(@NotNull PlPgSqlParser.AssignStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(@NotNull PlPgSqlParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(@NotNull PlPgSqlParser.UnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 */
	void enterBulkOperationClause(@NotNull PlPgSqlParser.BulkOperationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#bulkOperationClause}.
	 * @param ctx the parse tree
	 */
	void exitBulkOperationClause(@NotNull PlPgSqlParser.BulkOperationClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionReturns}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturns(@NotNull PlPgSqlParser.FunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionReturns}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturns(@NotNull PlPgSqlParser.FunctionReturnsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpression(@NotNull PlPgSqlParser.NegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpression(@NotNull PlPgSqlParser.NegateExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(@NotNull PlPgSqlParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(@NotNull PlPgSqlParser.BlockStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasDeclaration(@NotNull PlPgSqlParser.AliasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#aliasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasDeclaration(@NotNull PlPgSqlParser.AliasDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalConstantExpression(@NotNull PlPgSqlParser.NumericalConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#numericalConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalConstantExpression(@NotNull PlPgSqlParser.NumericalConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(@NotNull PlPgSqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(@NotNull PlPgSqlParser.GroupByClauseContext ctx);
}