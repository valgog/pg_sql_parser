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
	 * Enter a parse tree produced by {@link PlPgSqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(@NotNull PlPgSqlParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(@NotNull PlPgSqlParser.DeleteStmtContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateMultiSetAssignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdateMultiSetAssignment(@NotNull PlPgSqlParser.UpdateMultiSetAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateMultiSetAssignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdateMultiSetAssignment(@NotNull PlPgSqlParser.UpdateMultiSetAssignmentContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumnList(@NotNull PlPgSqlParser.InsertColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertColumnList}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumnList(@NotNull PlPgSqlParser.InsertColumnListContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#fullJoin}.
	 * @param ctx the parse tree
	 */
	void enterFullJoin(@NotNull PlPgSqlParser.FullJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fullJoin}.
	 * @param ctx the parse tree
	 */
	void exitFullJoin(@NotNull PlPgSqlParser.FullJoinContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertColumn}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumn(@NotNull PlPgSqlParser.InsertColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertColumn}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumn(@NotNull PlPgSqlParser.InsertColumnContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#returningIntoTargets}.
	 * @param ctx the parse tree
	 */
	void enterReturningIntoTargets(@NotNull PlPgSqlParser.ReturningIntoTargetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returningIntoTargets}.
	 * @param ctx the parse tree
	 */
	void exitReturningIntoTargets(@NotNull PlPgSqlParser.ReturningIntoTargetsContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateMultiSetColumn}.
	 * @param ctx the parse tree
	 */
	void enterUpdateMultiSetColumn(@NotNull PlPgSqlParser.UpdateMultiSetColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateMultiSetColumn}.
	 * @param ctx the parse tree
	 */
	void exitUpdateMultiSetColumn(@NotNull PlPgSqlParser.UpdateMultiSetColumnContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateMultiSetValues}.
	 * @param ctx the parse tree
	 */
	void enterUpdateMultiSetValues(@NotNull PlPgSqlParser.UpdateMultiSetValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateMultiSetValues}.
	 * @param ctx the parse tree
	 */
	void exitUpdateMultiSetValues(@NotNull PlPgSqlParser.UpdateMultiSetValuesContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertDefaultValues}.
	 * @param ctx the parse tree
	 */
	void enterInsertDefaultValues(@NotNull PlPgSqlParser.InsertDefaultValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertDefaultValues}.
	 * @param ctx the parse tree
	 */
	void exitInsertDefaultValues(@NotNull PlPgSqlParser.InsertDefaultValuesContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#withRecursiveClause}.
	 * @param ctx the parse tree
	 */
	void enterWithRecursiveClause(@NotNull PlPgSqlParser.WithRecursiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#withRecursiveClause}.
	 * @param ctx the parse tree
	 */
	void exitWithRecursiveClause(@NotNull PlPgSqlParser.WithRecursiveClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull PlPgSqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull PlPgSqlParser.DeleteContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingClause(@NotNull PlPgSqlParser.UsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingClause(@NotNull PlPgSqlParser.UsingClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#leftOuterJoin}.
	 * @param ctx the parse tree
	 */
	void enterLeftOuterJoin(@NotNull PlPgSqlParser.LeftOuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#leftOuterJoin}.
	 * @param ctx the parse tree
	 */
	void exitLeftOuterJoin(@NotNull PlPgSqlParser.LeftOuterJoinContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateSingleSetAssignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSingleSetAssignment(@NotNull PlPgSqlParser.UpdateSingleSetAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateSingleSetAssignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSingleSetAssignment(@NotNull PlPgSqlParser.UpdateSingleSetAssignmentContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void enterReturningClause(@NotNull PlPgSqlParser.ReturningClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returningClause}.
	 * @param ctx the parse tree
	 */
	void exitReturningClause(@NotNull PlPgSqlParser.ReturningClauseContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#withQueries}.
	 * @param ctx the parse tree
	 */
	void enterWithQueries(@NotNull PlPgSqlParser.WithQueriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#withQueries}.
	 * @param ctx the parse tree
	 */
	void exitWithQueries(@NotNull PlPgSqlParser.WithQueriesContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpr(@NotNull PlPgSqlParser.StringLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#stringLiteralExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpr(@NotNull PlPgSqlParser.StringLiteralExprContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull PlPgSqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull PlPgSqlParser.InsertContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateSingleSetClause}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSingleSetClause(@NotNull PlPgSqlParser.UpdateSingleSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateSingleSetClause}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSingleSetClause(@NotNull PlPgSqlParser.UpdateSingleSetClauseContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateMultiSetColumns}.
	 * @param ctx the parse tree
	 */
	void enterUpdateMultiSetColumns(@NotNull PlPgSqlParser.UpdateMultiSetColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateMultiSetColumns}.
	 * @param ctx the parse tree
	 */
	void exitUpdateMultiSetColumns(@NotNull PlPgSqlParser.UpdateMultiSetColumnsContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#leftJoin}.
	 * @param ctx the parse tree
	 */
	void enterLeftJoin(@NotNull PlPgSqlParser.LeftJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#leftJoin}.
	 * @param ctx the parse tree
	 */
	void exitLeftJoin(@NotNull PlPgSqlParser.LeftJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(@NotNull PlPgSqlParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(@NotNull PlPgSqlParser.InsertValuesClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#returningAll}.
	 * @param ctx the parse tree
	 */
	void enterReturningAll(@NotNull PlPgSqlParser.ReturningAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returningAll}.
	 * @param ctx the parse tree
	 */
	void exitReturningAll(@NotNull PlPgSqlParser.ReturningAllContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertValueTuple}.
	 * @param ctx the parse tree
	 */
	void enterInsertValueTuple(@NotNull PlPgSqlParser.InsertValueTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertValueTuple}.
	 * @param ctx the parse tree
	 */
	void exitInsertValueTuple(@NotNull PlPgSqlParser.InsertValueTupleContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(@NotNull PlPgSqlParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(@NotNull PlPgSqlParser.InsertStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateSetValue}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSetValue(@NotNull PlPgSqlParser.UpdateSetValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateSetValue}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSetValue(@NotNull PlPgSqlParser.UpdateSetValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(@NotNull PlPgSqlParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(@NotNull PlPgSqlParser.WithClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#rightJoin}.
	 * @param ctx the parse tree
	 */
	void enterRightJoin(@NotNull PlPgSqlParser.RightJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#rightJoin}.
	 * @param ctx the parse tree
	 */
	void exitRightJoin(@NotNull PlPgSqlParser.RightJoinContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#crossJoin}.
	 * @param ctx the parse tree
	 */
	void enterCrossJoin(@NotNull PlPgSqlParser.CrossJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#crossJoin}.
	 * @param ctx the parse tree
	 */
	void exitCrossJoin(@NotNull PlPgSqlParser.CrossJoinContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmt(@NotNull PlPgSqlParser.UpdateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmt(@NotNull PlPgSqlParser.UpdateStmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#updateMultiSetClause}.
	 * @param ctx the parse tree
	 */
	void enterUpdateMultiSetClause(@NotNull PlPgSqlParser.UpdateMultiSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#updateMultiSetClause}.
	 * @param ctx the parse tree
	 */
	void exitUpdateMultiSetClause(@NotNull PlPgSqlParser.UpdateMultiSetClauseContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#fullOuterJoin}.
	 * @param ctx the parse tree
	 */
	void enterFullOuterJoin(@NotNull PlPgSqlParser.FullOuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#fullOuterJoin}.
	 * @param ctx the parse tree
	 */
	void exitFullOuterJoin(@NotNull PlPgSqlParser.FullOuterJoinContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(@NotNull PlPgSqlParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(@NotNull PlPgSqlParser.JoinClauseContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(@NotNull PlPgSqlParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#innerJoin}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(@NotNull PlPgSqlParser.InnerJoinContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#usingTable}.
	 * @param ctx the parse tree
	 */
	void enterUsingTable(@NotNull PlPgSqlParser.UsingTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#usingTable}.
	 * @param ctx the parse tree
	 */
	void exitUsingTable(@NotNull PlPgSqlParser.UsingTableContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#performStmt}.
	 * @param ctx the parse tree
	 */
	void enterPerformStmt(@NotNull PlPgSqlParser.PerformStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#performStmt}.
	 * @param ctx the parse tree
	 */
	void exitPerformStmt(@NotNull PlPgSqlParser.PerformStmtContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull PlPgSqlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull PlPgSqlParser.UpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#withQuery}.
	 * @param ctx the parse tree
	 */
	void enterWithQuery(@NotNull PlPgSqlParser.WithQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#withQuery}.
	 * @param ctx the parse tree
	 */
	void exitWithQuery(@NotNull PlPgSqlParser.WithQueryContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#returningOutputExpression}.
	 * @param ctx the parse tree
	 */
	void enterReturningOutputExpression(@NotNull PlPgSqlParser.ReturningOutputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returningOutputExpression}.
	 * @param ctx the parse tree
	 */
	void exitReturningOutputExpression(@NotNull PlPgSqlParser.ReturningOutputExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#returningIntoTarget}.
	 * @param ctx the parse tree
	 */
	void enterReturningIntoTarget(@NotNull PlPgSqlParser.ReturningIntoTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returningIntoTarget}.
	 * @param ctx the parse tree
	 */
	void exitReturningIntoTarget(@NotNull PlPgSqlParser.ReturningIntoTargetContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#subQueryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubQueryExpression(@NotNull PlPgSqlParser.SubQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#subQueryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubQueryExpression(@NotNull PlPgSqlParser.SubQueryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#rightOuterJoin}.
	 * @param ctx the parse tree
	 */
	void enterRightOuterJoin(@NotNull PlPgSqlParser.RightOuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#rightOuterJoin}.
	 * @param ctx the parse tree
	 */
	void exitRightOuterJoin(@NotNull PlPgSqlParser.RightOuterJoinContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#returningIntoClause}.
	 * @param ctx the parse tree
	 */
	void enterReturningIntoClause(@NotNull PlPgSqlParser.ReturningIntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returningIntoClause}.
	 * @param ctx the parse tree
	 */
	void exitReturningIntoClause(@NotNull PlPgSqlParser.ReturningIntoClauseContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#inExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull PlPgSqlParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#inExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull PlPgSqlParser.InExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#returningExpressions}.
	 * @param ctx the parse tree
	 */
	void enterReturningExpressions(@NotNull PlPgSqlParser.ReturningExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#returningExpressions}.
	 * @param ctx the parse tree
	 */
	void exitReturningExpressions(@NotNull PlPgSqlParser.ReturningExpressionsContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(@NotNull PlPgSqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(@NotNull PlPgSqlParser.GroupByClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#insertValues}.
	 * @param ctx the parse tree
	 */
	void enterInsertValues(@NotNull PlPgSqlParser.InsertValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#insertValues}.
	 * @param ctx the parse tree
	 */
	void exitInsertValues(@NotNull PlPgSqlParser.InsertValuesContext ctx);
}