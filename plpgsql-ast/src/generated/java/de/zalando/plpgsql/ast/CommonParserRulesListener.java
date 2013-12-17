// Generated from de/zalando/plpgsql/ast/CommonParserRules.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommonParserRulesParser}.
 */
public interface CommonParserRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(@NotNull CommonParserRulesParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#functionCallExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(@NotNull CommonParserRulesParser.FunctionCallExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGroup(@NotNull CommonParserRulesParser.ExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#expressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGroup(@NotNull CommonParserRulesParser.ExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull CommonParserRulesParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull CommonParserRulesParser.UnaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#numericalExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterNumericalExpressionGroup(@NotNull CommonParserRulesParser.NumericalExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#numericalExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitNumericalExpressionGroup(@NotNull CommonParserRulesParser.NumericalExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull CommonParserRulesParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull CommonParserRulesParser.AddExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(@NotNull CommonParserRulesParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#arrayAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(@NotNull CommonParserRulesParser.ArrayAccessExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void enterConstantOfOtherTypes(@NotNull CommonParserRulesParser.ConstantOfOtherTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#constantOfOtherTypes}.
	 * @param ctx the parse tree
	 */
	void exitConstantOfOtherTypes(@NotNull CommonParserRulesParser.ConstantOfOtherTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterArbitraryConstantExpression(@NotNull CommonParserRulesParser.ArbitraryConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#arbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitArbitraryConstantExpression(@NotNull CommonParserRulesParser.ArbitraryConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConjunctionExpression(@NotNull CommonParserRulesParser.LogicalConjunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#logicalConjunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConjunctionExpression(@NotNull CommonParserRulesParser.LogicalConjunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#booleanVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVariableExpression(@NotNull CommonParserRulesParser.BooleanVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#booleanVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVariableExpression(@NotNull CommonParserRulesParser.BooleanVariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpression(@NotNull CommonParserRulesParser.StringLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#stringLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpression(@NotNull CommonParserRulesParser.StringLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalLiteralExpression(@NotNull CommonParserRulesParser.NumericalLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#numericalLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalLiteralExpression(@NotNull CommonParserRulesParser.NumericalLiteralExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(@NotNull CommonParserRulesParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#variableExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(@NotNull CommonParserRulesParser.VariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(@NotNull CommonParserRulesParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(@NotNull CommonParserRulesParser.NumericConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalExpression(@NotNull CommonParserRulesParser.NumericalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#numericalExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalExpression(@NotNull CommonParserRulesParser.NumericalExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(@NotNull CommonParserRulesParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(@NotNull CommonParserRulesParser.BooleanConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(@NotNull CommonParserRulesParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(@NotNull CommonParserRulesParser.SubExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(@NotNull CommonParserRulesParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#mulExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(@NotNull CommonParserRulesParser.MulExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#numericalFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericalFunctionExpression(@NotNull CommonParserRulesParser.NumericalFunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#numericalFunctionExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericalFunctionExpression(@NotNull CommonParserRulesParser.NumericalFunctionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(@NotNull CommonParserRulesParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(@NotNull CommonParserRulesParser.AssignOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#numericVariableExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericVariableExpression(@NotNull CommonParserRulesParser.NumericVariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#numericVariableExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericVariableExpression(@NotNull CommonParserRulesParser.NumericVariableExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpression(@NotNull CommonParserRulesParser.DivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#divExpression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpression(@NotNull CommonParserRulesParser.DivExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterExponentiationExpression(@NotNull CommonParserRulesParser.ExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#exponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitExponentiationExpression(@NotNull CommonParserRulesParser.ExponentiationExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull CommonParserRulesParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull CommonParserRulesParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void enterNegateExpression(@NotNull CommonParserRulesParser.NegateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#negateExpression}.
	 * @param ctx the parse tree
	 */
	void exitNegateExpression(@NotNull CommonParserRulesParser.NegateExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull CommonParserRulesParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull CommonParserRulesParser.FunctionCallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(@NotNull CommonParserRulesParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(@NotNull CommonParserRulesParser.BooleanExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#booleanArbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArbitraryConstantExpression(@NotNull CommonParserRulesParser.BooleanArbitraryConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#booleanArbitraryConstantExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArbitraryConstantExpression(@NotNull CommonParserRulesParser.BooleanArbitraryConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#booeleanExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void enterBooeleanExpressionGroup(@NotNull CommonParserRulesParser.BooeleanExpressionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#booeleanExpressionGroup}.
	 * @param ctx the parse tree
	 */
	void exitBooeleanExpressionGroup(@NotNull CommonParserRulesParser.BooeleanExpressionGroupContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(@NotNull CommonParserRulesParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(@NotNull CommonParserRulesParser.ComparisonExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link CommonParserRulesParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void enterModExpression(@NotNull CommonParserRulesParser.ModExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommonParserRulesParser#modExpression}.
	 * @param ctx the parse tree
	 */
	void exitModExpression(@NotNull CommonParserRulesParser.ModExpressionContext ctx);
}