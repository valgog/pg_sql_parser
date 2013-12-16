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
	 * Enter a parse tree produced by {@link PlPgSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PlPgSqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PlPgSqlParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PlPgSqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PlPgSqlParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#notNullExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotNullExpression(@NotNull PlPgSqlParser.NotNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#notNullExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotNullExpression(@NotNull PlPgSqlParser.NotNullExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#copyType}.
	 * @param ctx the parse tree
	 */
	void enterCopyType(@NotNull PlPgSqlParser.CopyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#copyType}.
	 * @param ctx the parse tree
	 */
	void exitCopyType(@NotNull PlPgSqlParser.CopyTypeContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#rowType}.
	 * @param ctx the parse tree
	 */
	void enterRowType(@NotNull PlPgSqlParser.RowTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#rowType}.
	 * @param ctx the parse tree
	 */
	void exitRowType(@NotNull PlPgSqlParser.RowTypeContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(@NotNull PlPgSqlParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(@NotNull PlPgSqlParser.LiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#isNullExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsNullExpression(@NotNull PlPgSqlParser.IsNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#isNullExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsNullExpression(@NotNull PlPgSqlParser.IsNullExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#betweenExpression}.
	 * @param ctx the parse tree
	 */
	void enterBetweenExpression(@NotNull PlPgSqlParser.BetweenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#betweenExpression}.
	 * @param ctx the parse tree
	 */
	void exitBetweenExpression(@NotNull PlPgSqlParser.BetweenExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull PlPgSqlParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull PlPgSqlParser.ConstantExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#isDistinctFromExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsDistinctFromExpression(@NotNull PlPgSqlParser.IsDistinctFromExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#isDistinctFromExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsDistinctFromExpression(@NotNull PlPgSqlParser.IsDistinctFromExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PlPgSqlParser#isExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(@NotNull PlPgSqlParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#isExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(@NotNull PlPgSqlParser.IsExpressionContext ctx);

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
	 * Enter a parse tree produced by {@link PlPgSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(@NotNull PlPgSqlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlPgSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(@NotNull PlPgSqlParser.FunctionNameContext ctx);

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
}