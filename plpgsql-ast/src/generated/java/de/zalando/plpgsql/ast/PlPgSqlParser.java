// Generated from de/zalando/plpgsql/ast/PlPgSql.g4 by ANTLR 4.1
package de.zalando.plpgsql.ast;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlPgSqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		L_BRACKET=10, R_BRACKET=11, DEBUG1=12, DEBUG2=13, DEBUG3=14, DEBUG4=15, 
		DEBUG5=16, INFO=17, NOTICE=18, WARNING=19, ERROR=20, LOG=21, FATAL=22, 
		PANIC=23, LIKE=24, SIMILAR=25, TO=26, AND=27, OR=28, ASSIGN_OP=29, BETWEEN=30, 
		IS=31, NOT=32, ISNULL=33, NOTNULL=34, MUL=35, DIV=36, MOD=37, ADD=38, 
		SUB=39, EQ=40, NEQ=41, LT=42, LTE=43, GT=44, GTE=45, SQLSTATE=46, RAISE=47, 
		DIAGNOSTICS=48, GET=49, ARRAY=50, SLICE=51, FOREACH=52, REVERSE=53, WHILE=54, 
		CONTINUE=55, EXIT=56, LOOP=57, CASE=58, IF=59, ELSIF=60, ELSE=61, QUERY=62, 
		RETURN=63, EXECUTE=64, PERFORM=65, WITH=66, RECURSIVE=67, DELETE=68, RETURNING=69, 
		INSERT=70, VALUES=71, SET=72, JOIN=73, INNER=74, LEFT=75, RIGHT=76, FULL=77, 
		CROSS=78, OUTER=79, NATURAL=80, SELECT=81, ALL=82, DISTINCT=83, FROM=84, 
		WHERE=85, GROUP_BY=86, GROUP=87, BY=88, ORDER_BY=89, ORDER=90, LIMIT=91, 
		OFFSET=92, ROW=93, ROWS=94, FETCH=95, ONLY=96, UPDATE=97, SHARE=98, OF=99, 
		NOWAIT=100, INTO=101, STRICT=102, UNION=103, INTERSECT=104, EXCEPT=105, 
		ASC=106, DESC=107, USING=108, NULLS=109, FIRST=110, NEXT=111, LAST=112, 
		CAST=113, ALIAS=114, FOR=115, CREATE=116, REPLACE=117, FUNCTION=118, IN=119, 
		OUT=120, INOUT=121, VARIADIC=122, ON=123, HAVING=124, LANGUAGE=125, LANGUAGE_NAME=126, 
		EXCEPTION=127, DEFAULT=128, RETURNS=129, TABLE=130, AS=131, DECLARE=132, 
		BEGIN=133, END=134, WHEN=135, THEN=136, WINDOW=137, IMMUTABLE=138, STABLE=139, 
		VOLATILE=140, CALLED_ON_NULL_INPUT=141, RETURNS_NULL_ON_NULL_INPUT=142, 
		EXTERNAL=143, SECURITY=144, SECURITY_INVOKER=145, SECURITY_DEFINER=146, 
		COST=147, CONSTANT=148, COLLATE=149, NULL=150, TRUE=151, FALSE=152, UNKNOWN=153, 
		F_DOLLAR_QUOTE=154, F_QUOTE=155, DOLLAR_QUOTE=156, QUOTE=157, INTEGER_VALUE=158, 
		DECIMAL_VALUE=159, ANONYMOUS_PARAMETER=160, ID=161, QNAME=162, ARRAY_TYPE=163, 
		COPY_TYPE=164, ROW_TYPE=165, STRING=166, WS=167, SL_COMMENT=168, ML_COMMENT=169, 
		ESC=170;
	public static final String[] tokenNames = {
		"<INVALID>", "'<<'", "']'", "'^'", "','", "'::'", "'['", "';'", "'>>'", 
		"'..'", "'('", "')'", "DEBUG1", "DEBUG2", "DEBUG3", "DEBUG4", "DEBUG5", 
		"INFO", "NOTICE", "WARNING", "ERROR", "LOG", "FATAL", "PANIC", "LIKE", 
		"SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", "ISNULL", 
		"NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", "'<'", "'<='", 
		"'>'", "'>='", "SQLSTATE", "RAISE", "DIAGNOSTICS", "GET", "ARRAY", "SLICE", 
		"FOREACH", "REVERSE", "WHILE", "CONTINUE", "EXIT", "LOOP", "CASE", "IF", 
		"ELSIF", "ELSE", "QUERY", "RETURN", "EXECUTE", "PERFORM", "WITH", "RECURSIVE", 
		"DELETE", "RETURNING", "INSERT", "VALUES", "SET", "JOIN", "INNER", "LEFT", 
		"RIGHT", "FULL", "CROSS", "OUTER", "NATURAL", "SELECT", "ALL", "DISTINCT", 
		"FROM", "WHERE", "GROUP_BY", "GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", 
		"OFFSET", "ROW", "ROWS", "FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", 
		"INTO", "STRICT", "UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", 
		"NULLS", "FIRST", "NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", 
		"FUNCTION", "IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", 
		"LANGUAGE_NAME", "EXCEPTION", "DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", 
		"BEGIN", "END", "WHEN", "THEN", "WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", 
		"CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", "EXTERNAL", "SECURITY", 
		"SECURITY_INVOKER", "SECURITY_DEFINER", "COST", "CONSTANT", "COLLATE", 
		"NULL", "TRUE", "FALSE", "UNKNOWN", "F_DOLLAR_QUOTE", "F_QUOTE", "DOLLAR_QUOTE", 
		"'''", "INTEGER_VALUE", "DECIMAL_VALUE", "ANONYMOUS_PARAMETER", "ID", 
		"QNAME", "ARRAY_TYPE", "COPY_TYPE", "ROW_TYPE", "STRING", "WS", "SL_COMMENT", 
		"ML_COMMENT", "ESC"
	};
	public static final int
		RULE_varExpr = 0, RULE_functionCallExpr = 1, RULE_numericConstant = 2, 
		RULE_constantOfOtherTypes = 3, RULE_numericalLiteralExpr = 4, RULE_booleanLiteralExpr = 5, 
		RULE_expression = 6, RULE_condition = 7, RULE_unit = 8, RULE_plFunction = 9, 
		RULE_functionArgsList = 10, RULE_functionArg = 11, RULE_functionReturns = 12, 
		RULE_functionBody = 13, RULE_blockStmt = 14, RULE_exceptionHandlingBlock = 15, 
		RULE_exceptionWhenConditions = 16, RULE_exceptionWhenCondition = 17, RULE_functionSettings = 18, 
		RULE_functionBehavior = 19, RULE_window = 20, RULE_functionInputHandling = 21, 
		RULE_functionSecurity = 22, RULE_functionCosts = 23, RULE_functionRows = 24, 
		RULE_varDeclarationList = 25, RULE_varDeclaration = 26, RULE_aliasDeclaration = 27, 
		RULE_assignStmt = 28, RULE_assignExpr = 29, RULE_returningClause = 30, 
		RULE_returningExpressions = 31, RULE_returningOutputExpression = 32, RULE_returningAll = 33, 
		RULE_returningIntoClause = 34, RULE_returningIntoTargets = 35, RULE_returningIntoTarget = 36, 
		RULE_withClause = 37, RULE_withRecursiveClause = 38, RULE_withQueries = 39, 
		RULE_withQuery = 40, RULE_selectStmt = 41, RULE_select = 42, RULE_selectList = 43, 
		RULE_distinctClause = 44, RULE_selectSpecific = 45, RULE_selectAll = 46, 
		RULE_intoClause = 47, RULE_limitClause = 48, RULE_offsetClause = 49, RULE_orderByClause = 50, 
		RULE_orderByItem = 51, RULE_orderByUsing = 52, RULE_nullsOrdering = 53, 
		RULE_fromClause = 54, RULE_joinClause = 55, RULE_tableExpression = 56, 
		RULE_join = 57, RULE_columnAlias = 58, RULE_columnAliasItem = 59, RULE_whereClause = 60, 
		RULE_groupByClause = 61, RULE_havingClause = 62, RULE_bulkOperationClause = 63, 
		RULE_fetchClause = 64, RULE_forClause = 65, RULE_lockedTables = 66, RULE_lockedTable = 67, 
		RULE_performStmt = 68, RULE_executeStmt = 69, RULE_execute = 70, RULE_executeCommand = 71, 
		RULE_executeIntoClause = 72, RULE_executeIntoTargets = 73, RULE_executeIntoTarget = 74, 
		RULE_executeUsingClause = 75, RULE_executeUsingExpression = 76, RULE_insertStmt = 77, 
		RULE_insert = 78, RULE_insertColumnList = 79, RULE_insertColumn = 80, 
		RULE_insertValuesClause = 81, RULE_insertDefaultValues = 82, RULE_insertValues = 83, 
		RULE_insertValueTuple = 84, RULE_insertValue = 85, RULE_updateStmt = 86, 
		RULE_update = 87, RULE_updateSingleSetClause = 88, RULE_updateSingleSetAssignment = 89, 
		RULE_updateMultiSetClause = 90, RULE_updateMultiSetAssignment = 91, RULE_updateMultiSetColumns = 92, 
		RULE_updateMultiSetColumn = 93, RULE_updateMultiSetValues = 94, RULE_updateSetValue = 95, 
		RULE_deleteStmt = 96, RULE_delete = 97, RULE_deleteUsingClause = 98, RULE_deleteUsingTable = 99, 
		RULE_returnStmt = 100, RULE_returnSimple = 101, RULE_returnNext = 102, 
		RULE_returnQuery = 103, RULE_returnQueryExecute = 104, RULE_ifStmt = 105, 
		RULE_ifCondition = 106, RULE_elsifCondition = 107, RULE_caseStmt = 108, 
		RULE_caseExpr = 109, RULE_whenExpressions = 110, RULE_searchExpr = 111, 
		RULE_whenExpr = 112, RULE_loopStmt = 113, RULE_exitStmt = 114, RULE_exitWhenClause = 115, 
		RULE_continueStmt = 116, RULE_continueWhenClause = 117, RULE_whileStmt = 118, 
		RULE_forInIntStmt = 119, RULE_forInIntByExpression = 120, RULE_forInIntFromExpression = 121, 
		RULE_forInIntToExpression = 122, RULE_forInQueryStmt = 123, RULE_forInQuery = 124, 
		RULE_forInExecuteStmt = 125, RULE_forEachStmt = 126, RULE_forEachArrayExpression = 127, 
		RULE_getDiagnosticsStmt = 128, RULE_raiseStmt = 129, RULE_raiseUsingClause = 130, 
		RULE_raiseOptionAssign = 131, RULE_stmts = 132, RULE_stmt = 133;
	public static final String[] ruleNames = {
		"varExpr", "functionCallExpr", "numericConstant", "constantOfOtherTypes", 
		"numericalLiteralExpr", "booleanLiteralExpr", "expression", "condition", 
		"unit", "plFunction", "functionArgsList", "functionArg", "functionReturns", 
		"functionBody", "blockStmt", "exceptionHandlingBlock", "exceptionWhenConditions", 
		"exceptionWhenCondition", "functionSettings", "functionBehavior", "window", 
		"functionInputHandling", "functionSecurity", "functionCosts", "functionRows", 
		"varDeclarationList", "varDeclaration", "aliasDeclaration", "assignStmt", 
		"assignExpr", "returningClause", "returningExpressions", "returningOutputExpression", 
		"returningAll", "returningIntoClause", "returningIntoTargets", "returningIntoTarget", 
		"withClause", "withRecursiveClause", "withQueries", "withQuery", "selectStmt", 
		"select", "selectList", "distinctClause", "selectSpecific", "selectAll", 
		"intoClause", "limitClause", "offsetClause", "orderByClause", "orderByItem", 
		"orderByUsing", "nullsOrdering", "fromClause", "joinClause", "tableExpression", 
		"join", "columnAlias", "columnAliasItem", "whereClause", "groupByClause", 
		"havingClause", "bulkOperationClause", "fetchClause", "forClause", "lockedTables", 
		"lockedTable", "performStmt", "executeStmt", "execute", "executeCommand", 
		"executeIntoClause", "executeIntoTargets", "executeIntoTarget", "executeUsingClause", 
		"executeUsingExpression", "insertStmt", "insert", "insertColumnList", 
		"insertColumn", "insertValuesClause", "insertDefaultValues", "insertValues", 
		"insertValueTuple", "insertValue", "updateStmt", "update", "updateSingleSetClause", 
		"updateSingleSetAssignment", "updateMultiSetClause", "updateMultiSetAssignment", 
		"updateMultiSetColumns", "updateMultiSetColumn", "updateMultiSetValues", 
		"updateSetValue", "deleteStmt", "delete", "deleteUsingClause", "deleteUsingTable", 
		"returnStmt", "returnSimple", "returnNext", "returnQuery", "returnQueryExecute", 
		"ifStmt", "ifCondition", "elsifCondition", "caseStmt", "caseExpr", "whenExpressions", 
		"searchExpr", "whenExpr", "loopStmt", "exitStmt", "exitWhenClause", "continueStmt", 
		"continueWhenClause", "whileStmt", "forInIntStmt", "forInIntByExpression", 
		"forInIntFromExpression", "forInIntToExpression", "forInQueryStmt", "forInQuery", 
		"forInExecuteStmt", "forEachStmt", "forEachArrayExpression", "getDiagnosticsStmt", 
		"raiseStmt", "raiseUsingClause", "raiseOptionAssign", "stmts", "stmt"
	};

	@Override
	public String getGrammarFileName() { return "PlPgSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlPgSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarExprContext extends ParserRuleContext {
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode ANONYMOUS_PARAMETER() { return getToken(PlPgSqlParser.ANONYMOUS_PARAMETER, 0); }
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & ((1L << (ANONYMOUS_PARAMETER - 160)) | (1L << (ID - 160)) | (1L << (QNAME - 160)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallExprContext extends ParserRuleContext {
		public Token functionCallName;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public FunctionCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallExprContext functionCallExpr() throws RecognitionException {
		FunctionCallExprContext _localctx = new FunctionCallExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionCallExpr);
		int _la;
		try {
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
				setState(271); match(L_BRACKET);
				setState(272); match(R_BRACKET);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
				setState(274); match(L_BRACKET);
				setState(275); expression(0);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(276); match(4);
					setState(277); expression(0);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283); match(R_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericConstantContext extends ParserRuleContext {
		public Token value;
		public Token type;
		public Token typeName;
		public TerminalNode QUOTE(int i) {
			return getToken(PlPgSqlParser.QUOTE, i);
		}
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(PlPgSqlParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(PlPgSqlParser.QUOTE); }
		public TerminalNode ROW_TYPE() { return getToken(PlPgSqlParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(PlPgSqlParser.DECIMAL_VALUE, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericConstant);
		int _la;
		try {
			setState(294);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(288); match(5);
				setState(289);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
					((NumericConstantContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(291); match(QUOTE);
				setState(292);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(293); match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantOfOtherTypesContext extends ParserRuleContext {
		public Token type;
		public Token value;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(PlPgSqlParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public TerminalNode ROW_TYPE() { return getToken(PlPgSqlParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public TerminalNode CAST() { return getToken(PlPgSqlParser.CAST, 0); }
		public ConstantOfOtherTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantOfOtherTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterConstantOfOtherTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitConstantOfOtherTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitConstantOfOtherTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantOfOtherTypesContext constantOfOtherTypes() throws RecognitionException {
		ConstantOfOtherTypesContext _localctx = new ConstantOfOtherTypesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constantOfOtherTypes);
		int _la;
		try {
			setState(307);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(297); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(299); match(5);
				setState(300);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(301); match(CAST);
				setState(302); match(L_BRACKET);
				setState(303); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(304); match(AS);
				setState(305);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(306); match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalLiteralExprContext extends ParserRuleContext {
		public NumericalLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalLiteralExpr; }
	 
		public NumericalLiteralExprContext() { }
		public void copyFrom(NumericalLiteralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericalConstantExpressionContext extends NumericalLiteralExprContext {
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public NumericalConstantExpressionContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericalConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericalConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericalConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(PlPgSqlParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalLiteralExprContext numericalLiteralExpr() throws RecognitionException {
		NumericalLiteralExprContext _localctx = new NumericalLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numericalLiteralExpr);
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NumericalConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(309); numericConstant();
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310); match(INTEGER_VALUE);
				}
				break;

			case 3:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(311); match(DECIMAL_VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralExprContext extends ParserRuleContext {
		public BooleanLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteralExpr; }
	 
		public BooleanLiteralExprContext() { }
		public void copyFrom(BooleanLiteralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegateExpressionContext extends BooleanLiteralExprContext {
		public TerminalNode NOT() { return getToken(PlPgSqlParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateExpressionContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends BooleanLiteralExprContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(PlPgSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlPgSqlParser.FALSE, 0); }
		public BooleanLiteralContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralExprContext booleanLiteralExpr() throws RecognitionException {
		BooleanLiteralExprContext _localctx = new BooleanLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanLiteralExpr);
		int _la;
		try {
			setState(317);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314); match(NOT);
				setState(315); expression(0);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				((BooleanLiteralContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class NumericalLiteralExpressionContext extends ExpressionContext {
		public NumericalLiteralExprContext numericalLiteralExpr() {
			return getRuleContext(NumericalLiteralExprContext.class,0);
		}
		public NumericalLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNumericalLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNumericalLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNumericalLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public StringLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStringLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStringLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralExpressionContext extends ExpressionContext {
		public BooleanLiteralExprContext booleanLiteralExpr() {
			return getRuleContext(BooleanLiteralExprContext.class,0);
		}
		public BooleanLiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBooleanLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBooleanLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBooleanLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionGroupContext extends ExpressionContext {
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public ExpressionGroupContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(PlPgSqlParser.SUB, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token unaryOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(PlPgSqlParser.SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(PlPgSqlParser.MUL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ADD() { return getToken(PlPgSqlParser.ADD, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(PlPgSqlParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public Token operator;
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubQueryExpressionContext extends ExpressionContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SubQueryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSubQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSubQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSubQueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentiationExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExponentiationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExponentiationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenExpressionContext extends ExpressionContext {
		public ExpressionContext subject;
		public Token operator;
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode BETWEEN() { return getToken(PlPgSqlParser.BETWEEN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PlPgSqlParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BetweenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBetweenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBetweenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBetweenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelExpressionContext extends ExpressionContext {
		public Token label;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLabelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLabelExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseExpressionContext extends ExpressionContext {
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public CaseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext arrayIndexExpr;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallExprContext functionCallExpr() {
			return getRuleContext(FunctionCallExprContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArbitraryConstantExpressionContext extends ExpressionContext {
		public ConstantOfOtherTypesContext constantOfOtherTypes() {
			return getRuleContext(ConstantOfOtherTypesContext.class,0);
		}
		public ArbitraryConstantExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitArbitraryConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token operator;
		public Token not;
		public TerminalNode SIMILAR() { return getToken(PlPgSqlParser.SIMILAR, 0); }
		public TerminalNode NOT() { return getToken(PlPgSqlParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TO() { return getToken(PlPgSqlParser.TO, 0); }
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalConjunctionExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(PlPgSqlParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LogicalConjunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLogicalConjunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLogicalConjunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLogicalConjunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MOD() { return getToken(PlPgSqlParser.MOD, 0); }
		public ModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitModExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(320); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(321); expression(16);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(323); expression(15);
				}
				break;

			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325); match(L_BRACKET);
				setState(326); expression(0);
				setState(327); match(R_BRACKET);
				}
				break;

			case 5:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329); varExpr();
				}
				break;

			case 6:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330); booleanLiteralExpr();
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331); numericalLiteralExpr();
				}
				break;

			case 8:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332); match(STRING);
				}
				break;

			case 9:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333); constantOfOtherTypes();
				}
				break;

			case 10:
				{
				_localctx = new SubQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334); select();
				}
				break;

			case 11:
				{
				_localctx = new CaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335); caseExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(24 >= _localctx._p)) throw new FailedPredicateException(this, "24 >= $_p");
						setState(339); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(340); expression(25);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(342); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(343); expression(24);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(345); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(346); expression(23);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(348); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(349); expression(22);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(351); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(352); expression(21);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(354); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(355); expression(20);
						}
						break;

					case 7:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(357); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(358); expression(15);
						}
						break;

					case 8:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(360); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(361); expression(14);
						}
						break;

					case 9:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(363); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(364); expression(13);
						}
						break;

					case 10:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(366); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(367); expression(12);
						}
						break;

					case 11:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(369); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(370); expression(11);
						}
						break;

					case 12:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(371);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(372); match(3);
						setState(373); expression(9);
						}
						break;

					case 13:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(375); ((InExpressionContext)_localctx).operator = match(IN);
						setState(376); expression(7);
						}
						break;

					case 14:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(378); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(379); expression(6);
						}
						break;

					case 15:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(380);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(381); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(382); expression(5);
						}
						break;

					case 16:
						{
						_localctx = new BetweenExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						((BetweenExpressionContext)_localctx).subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(383);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(384); ((BetweenExpressionContext)_localctx).operator = match(BETWEEN);
						setState(385); ((BetweenExpressionContext)_localctx).left = expression(0);
						setState(386); match(AND);
						setState(387); ((BetweenExpressionContext)_localctx).right = expression(2);
						}
						break;

					case 17:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(29 >= _localctx._p)) throw new FailedPredicateException(this, "29 >= $_p");
						setState(394); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(390); match(6);
								setState(391); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = expression(0);
								setState(392); match(2);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(396); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 18:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(400);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(399); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(402); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(403); match(STRING);
						}
						break;

					case 19:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(406);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(405); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(408); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR);
						setState(409); match(TO);
						setState(410); match(STRING);
						}
						break;

					case 20:
						{
						_localctx = new LabelExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(411);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(412); match(AS);
						setState(413); ((LabelExpressionContext)_localctx).label = match(ID);
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public List<PlFunctionContext> plFunction() {
			return getRuleContexts(PlFunctionContext.class);
		}
		public PlFunctionContext plFunction(int i) {
			return getRuleContext(PlFunctionContext.class,i);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(421); plFunction();
				}
				}
				setState(424); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CREATE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlFunctionContext extends ParserRuleContext {
		public Token functionName;
		public TerminalNode CREATE() { return getToken(PlPgSqlParser.CREATE, 0); }
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public TerminalNode OR() { return getToken(PlPgSqlParser.OR, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(PlPgSqlParser.FUNCTION, 0); }
		public TerminalNode REPLACE() { return getToken(PlPgSqlParser.REPLACE, 0); }
		public TerminalNode LANGUAGE_NAME() { return getToken(PlPgSqlParser.LANGUAGE_NAME, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public TerminalNode LANGUAGE() { return getToken(PlPgSqlParser.LANGUAGE, 0); }
		public FunctionReturnsContext functionReturns() {
			return getRuleContext(FunctionReturnsContext.class,0);
		}
		public FunctionArgsListContext functionArgsList() {
			return getRuleContext(FunctionArgsListContext.class,0);
		}
		public FunctionSettingsContext functionSettings() {
			return getRuleContext(FunctionSettingsContext.class,0);
		}
		public PlFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterPlFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitPlFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitPlFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlFunctionContext plFunction() throws RecognitionException {
		PlFunctionContext _localctx = new PlFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_plFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); match(CREATE);
			setState(429);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(427); match(OR);
				setState(428); match(REPLACE);
				}
			}

			setState(431); match(FUNCTION);
			setState(432); ((PlFunctionContext)_localctx).functionName = match(ID);
			setState(433); match(L_BRACKET);
			setState(434); functionArgsList();
			setState(435); match(R_BRACKET);
			setState(436); functionReturns();
			setState(437); functionBody();
			setState(438); match(LANGUAGE);
			setState(439); match(LANGUAGE_NAME);
			setState(441);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(440); functionSettings();
				}
			}

			setState(443); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgsListContext extends ParserRuleContext {
		public List<FunctionArgContext> functionArg() {
			return getRuleContexts(FunctionArgContext.class);
		}
		public FunctionArgContext functionArg(int i) {
			return getRuleContext(FunctionArgContext.class,i);
		}
		public FunctionArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsListContext functionArgsList() throws RecognitionException {
		FunctionArgsListContext _localctx = new FunctionArgsListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionArgsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (IN - 119)) | (1L << (OUT - 119)) | (1L << (INOUT - 119)) | (1L << (VARIADIC - 119)) | (1L << (ID - 119)))) != 0)) {
				{
				setState(445); functionArg();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(446); match(4);
					setState(447); functionArg();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgContext extends ParserRuleContext {
		public Token argMode;
		public Token argName;
		public Token type;
		public Token initOperator;
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode OUT() { return getToken(PlPgSqlParser.OUT, 0); }
		public TerminalNode VARIADIC() { return getToken(PlPgSqlParser.VARIADIC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INOUT() { return getToken(PlPgSqlParser.INOUT, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(PlPgSqlParser.EQ, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if (((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (IN - 119)) | (1L << (OUT - 119)) | (1L << (INOUT - 119)) | (1L << (VARIADIC - 119)))) != 0)) {
				{
				setState(455);
				((FunctionArgContext)_localctx).argMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (IN - 119)) | (1L << (OUT - 119)) | (1L << (INOUT - 119)) | (1L << (VARIADIC - 119)))) != 0)) ) {
					((FunctionArgContext)_localctx).argMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(458); ((FunctionArgContext)_localctx).argName = match(ID);
			setState(459);
			((FunctionArgContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)))) != 0)) ) {
				((FunctionArgContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(462);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(460);
				((FunctionArgContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((FunctionArgContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(461); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionReturnsContext extends ParserRuleContext {
		public Token type;
		public Token outName;
		public List<TerminalNode> ARRAY_TYPE() { return getTokens(PlPgSqlParser.ARRAY_TYPE); }
		public TerminalNode QNAME(int i) {
			return getToken(PlPgSqlParser.QNAME, i);
		}
		public TerminalNode ROW_TYPE(int i) {
			return getToken(PlPgSqlParser.ROW_TYPE, i);
		}
		public List<TerminalNode> COPY_TYPE() { return getTokens(PlPgSqlParser.COPY_TYPE); }
		public List<TerminalNode> QNAME() { return getTokens(PlPgSqlParser.QNAME); }
		public List<TerminalNode> ROW_TYPE() { return getTokens(PlPgSqlParser.ROW_TYPE); }
		public TerminalNode COPY_TYPE(int i) {
			return getToken(PlPgSqlParser.COPY_TYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ARRAY_TYPE(int i) {
			return getToken(PlPgSqlParser.ARRAY_TYPE, i);
		}
		public TerminalNode RETURNS() { return getToken(PlPgSqlParser.RETURNS, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public FunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionReturns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionReturns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnsContext functionReturns() throws RecognitionException {
		FunctionReturnsContext _localctx = new FunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionReturns);
		int _la;
		try {
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464); match(RETURNS);
				setState(465);
				((FunctionReturnsContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
					((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466); match(RETURNS);
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(467);
					((FunctionReturnsContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
						((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(468); ((FunctionReturnsContext)_localctx).outName = match(ID);
					}
					}
					setState(471); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(PlPgSqlParser.QUOTE, 0); }
		public TerminalNode DOLLAR_QUOTE() { return getToken(PlPgSqlParser.DOLLAR_QUOTE, 0); }
		public TerminalNode F_DOLLAR_QUOTE() { return getToken(PlPgSqlParser.F_DOLLAR_QUOTE, 0); }
		public TerminalNode F_QUOTE() { return getToken(PlPgSqlParser.F_QUOTE, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionBody);
		try {
			setState(483);
			switch (_input.LA(1)) {
			case F_DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(475); match(F_DOLLAR_QUOTE);
				setState(476); blockStmt();
				setState(477); match(DOLLAR_QUOTE);
				}
				break;
			case F_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(479); match(F_QUOTE);
				setState(480); blockStmt();
				setState(481); match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStmtContext extends ParserRuleContext {
		public ExceptionHandlingBlockContext exceptionHandlingBlock() {
			return getRuleContext(ExceptionHandlingBlockContext.class,0);
		}
		public TerminalNode DECLARE(int i) {
			return getToken(PlPgSqlParser.DECLARE, i);
		}
		public TerminalNode EXCEPTION() { return getToken(PlPgSqlParser.EXCEPTION, 0); }
		public VarDeclarationListContext varDeclarationList(int i) {
			return getRuleContext(VarDeclarationListContext.class,i);
		}
		public List<TerminalNode> DECLARE() { return getTokens(PlPgSqlParser.DECLARE); }
		public List<VarDeclarationListContext> varDeclarationList() {
			return getRuleContexts(VarDeclarationListContext.class);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(PlPgSqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE) {
				{
				{
				setState(485); match(DECLARE);
				setState(486); varDeclarationList();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492); match(BEGIN);
			setState(493); stmts();
			setState(496);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(494); match(EXCEPTION);
				setState(495); exceptionHandlingBlock();
				}
			}

			setState(498); match(END);
			setState(499); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionHandlingBlockContext extends ParserRuleContext {
		public List<TerminalNode> THEN() { return getTokens(PlPgSqlParser.THEN); }
		public ExceptionWhenConditionsContext exceptionWhenConditions(int i) {
			return getRuleContext(ExceptionWhenConditionsContext.class,i);
		}
		public TerminalNode WHEN(int i) {
			return getToken(PlPgSqlParser.WHEN, i);
		}
		public TerminalNode THEN(int i) {
			return getToken(PlPgSqlParser.THEN, i);
		}
		public List<ExceptionWhenConditionsContext> exceptionWhenConditions() {
			return getRuleContexts(ExceptionWhenConditionsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public List<TerminalNode> WHEN() { return getTokens(PlPgSqlParser.WHEN); }
		public ExceptionHandlingBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandlingBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExceptionHandlingBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExceptionHandlingBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExceptionHandlingBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionHandlingBlockContext exceptionHandlingBlock() throws RecognitionException {
		ExceptionHandlingBlockContext _localctx = new ExceptionHandlingBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exceptionHandlingBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(501); match(WHEN);
				setState(502); exceptionWhenConditions();
				setState(503); match(THEN);
				setState(504); stmts();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511); stmts();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionWhenConditionsContext extends ParserRuleContext {
		public List<ExceptionWhenConditionContext> exceptionWhenCondition() {
			return getRuleContexts(ExceptionWhenConditionContext.class);
		}
		public ExceptionWhenConditionContext exceptionWhenCondition(int i) {
			return getRuleContext(ExceptionWhenConditionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PlPgSqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PlPgSqlParser.OR, i);
		}
		public ExceptionWhenConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionWhenConditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExceptionWhenConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExceptionWhenConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExceptionWhenConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionWhenConditionsContext exceptionWhenConditions() throws RecognitionException {
		ExceptionWhenConditionsContext _localctx = new ExceptionWhenConditionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exceptionWhenConditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); exceptionWhenCondition();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(514); match(OR);
				setState(515); exceptionWhenCondition();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionWhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExceptionWhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionWhenCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExceptionWhenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExceptionWhenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExceptionWhenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionWhenConditionContext exceptionWhenCondition() throws RecognitionException {
		ExceptionWhenConditionContext _localctx = new ExceptionWhenConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exceptionWhenCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSettingsContext extends ParserRuleContext {
		public FunctionInputHandlingContext functionInputHandling() {
			return getRuleContext(FunctionInputHandlingContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public FunctionRowsContext functionRows() {
			return getRuleContext(FunctionRowsContext.class,0);
		}
		public FunctionSecurityContext functionSecurity() {
			return getRuleContext(FunctionSecurityContext.class,0);
		}
		public FunctionCostsContext functionCosts() {
			return getRuleContext(FunctionCostsContext.class,0);
		}
		public FunctionBehaviorContext functionBehavior() {
			return getRuleContext(FunctionBehaviorContext.class,0);
		}
		public FunctionSettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSettings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionSettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionSettings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionSettings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSettingsContext functionSettings() throws RecognitionException {
		FunctionSettingsContext _localctx = new FunctionSettingsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionSettings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); window();
			setState(524); functionBehavior();
			setState(525); functionInputHandling();
			setState(526); functionSecurity();
			setState(527); functionCosts();
			setState(528); functionRows();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBehaviorContext extends ParserRuleContext {
		public TerminalNode STABLE() { return getToken(PlPgSqlParser.STABLE, 0); }
		public TerminalNode VOLATILE() { return getToken(PlPgSqlParser.VOLATILE, 0); }
		public TerminalNode IMMUTABLE() { return getToken(PlPgSqlParser.IMMUTABLE, 0); }
		public FunctionBehaviorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBehavior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionBehavior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionBehavior(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionBehavior(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBehaviorContext functionBehavior() throws RecognitionException {
		FunctionBehaviorContext _localctx = new FunctionBehaviorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionBehavior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (IMMUTABLE - 138)) | (1L << (STABLE - 138)) | (1L << (VOLATILE - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(PlPgSqlParser.WINDOW, 0); }
		public WindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowContext window() throws RecognitionException {
		WindowContext _localctx = new WindowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); match(WINDOW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionInputHandlingContext extends ParserRuleContext {
		public TerminalNode CALLED_ON_NULL_INPUT() { return getToken(PlPgSqlParser.CALLED_ON_NULL_INPUT, 0); }
		public TerminalNode RETURNS_NULL_ON_NULL_INPUT() { return getToken(PlPgSqlParser.RETURNS_NULL_ON_NULL_INPUT, 0); }
		public TerminalNode STRICT() { return getToken(PlPgSqlParser.STRICT, 0); }
		public FunctionInputHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInputHandling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionInputHandling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionInputHandling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionInputHandling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInputHandlingContext functionInputHandling() throws RecognitionException {
		FunctionInputHandlingContext _localctx = new FunctionInputHandlingContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionInputHandling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (STRICT - 102)) | (1L << (CALLED_ON_NULL_INPUT - 102)) | (1L << (RETURNS_NULL_ON_NULL_INPUT - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSecurityContext extends ParserRuleContext {
		public TerminalNode SECURITY_DEFINER() { return getToken(PlPgSqlParser.SECURITY_DEFINER, 0); }
		public TerminalNode SECURITY_INVOKER() { return getToken(PlPgSqlParser.SECURITY_INVOKER, 0); }
		public FunctionSecurityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSecurity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionSecurity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionSecurity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionSecurity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSecurityContext functionSecurity() throws RecognitionException {
		FunctionSecurityContext _localctx = new FunctionSecurityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionSecurity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if ( !(_la==SECURITY_INVOKER || _la==SECURITY_DEFINER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCostsContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode COST() { return getToken(PlPgSqlParser.COST, 0); }
		public FunctionCostsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCosts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionCosts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionCosts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionCosts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCostsContext functionCosts() throws RecognitionException {
		FunctionCostsContext _localctx = new FunctionCostsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCosts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); match(COST);
			setState(539); ((FunctionCostsContext)_localctx).value = match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionRowsContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode ROWS() { return getToken(PlPgSqlParser.ROWS, 0); }
		public FunctionRowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionRows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFunctionRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFunctionRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFunctionRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionRowsContext functionRows() throws RecognitionException {
		FunctionRowsContext _localctx = new FunctionRowsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(ROWS);
			setState(542); ((FunctionRowsContext)_localctx).value = match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationListContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public AliasDeclarationContext aliasDeclaration(int i) {
			return getRuleContext(AliasDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<AliasDeclarationContext> aliasDeclaration() {
			return getRuleContexts(AliasDeclarationContext.class);
		}
		public VarDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterVarDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitVarDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitVarDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationListContext varDeclarationList() throws RecognitionException {
		VarDeclarationListContext _localctx = new VarDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(546);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(544); varDeclaration();
					}
					break;

				case 2:
					{
					setState(545); aliasDeclaration();
					}
					break;
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public Token varName;
		public Token type;
		public Token collationName;
		public Token initOperator;
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ROW_TYPE() { return getToken(PlPgSqlParser.ROW_TYPE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PlPgSqlParser.EQ, 0); }
		public TerminalNode CONSTANT() { return getToken(PlPgSqlParser.CONSTANT, 0); }
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode COPY_TYPE() { return getToken(PlPgSqlParser.COPY_TYPE, 0); }
		public TerminalNode COLLATE() { return getToken(PlPgSqlParser.COLLATE, 0); }
		public TerminalNode NOT() { return getToken(PlPgSqlParser.NOT, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode NULL() { return getToken(PlPgSqlParser.NULL, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); ((VarDeclarationContext)_localctx).varName = match(ID);
			setState(553);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(552); match(CONSTANT);
				}
			}

			setState(555);
			((VarDeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & ((1L << (ID - 161)) | (1L << (QNAME - 161)) | (1L << (ARRAY_TYPE - 161)) | (1L << (COPY_TYPE - 161)) | (1L << (ROW_TYPE - 161)))) != 0)) ) {
				((VarDeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(558);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(556); match(COLLATE);
				setState(557); ((VarDeclarationContext)_localctx).collationName = match(ID);
				}
			}

			setState(562);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(560); match(NOT);
				setState(561); match(NULL);
				}
			}

			setState(566);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(564);
				((VarDeclarationContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((VarDeclarationContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(565); expression(0);
				}
			}

			setState(568); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasDeclarationContext extends ParserRuleContext {
		public Token newVarName;
		public Token oldVarName;
		public TerminalNode FOR() { return getToken(PlPgSqlParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ALIAS() { return getToken(PlPgSqlParser.ALIAS, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public AliasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAliasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAliasDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAliasDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasDeclarationContext aliasDeclaration() throws RecognitionException {
		AliasDeclarationContext _localctx = new AliasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aliasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); ((AliasDeclarationContext)_localctx).newVarName = match(ID);
			setState(571); match(ALIAS);
			setState(572); match(FOR);
			setState(573); ((AliasDeclarationContext)_localctx).oldVarName = match(ID);
			setState(574); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmtContext extends ParserRuleContext {
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAssignStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); assignExpr();
			setState(577); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExprContext extends ParserRuleContext {
		public ExpressionContext receiver;
		public Token assignOperator;
		public ExpressionContext value;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(PlPgSqlParser.EQ, 0); }
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); ((AssignExprContext)_localctx).receiver = expression(0);
			setState(580);
			((AssignExprContext)_localctx).assignOperator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN_OP || _la==EQ) ) {
				((AssignExprContext)_localctx).assignOperator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(581); ((AssignExprContext)_localctx).value = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningClauseContext extends ParserRuleContext {
		public ReturningAllContext returningAll() {
			return getRuleContext(ReturningAllContext.class,0);
		}
		public ReturningExpressionsContext returningExpressions() {
			return getRuleContext(ReturningExpressionsContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(PlPgSqlParser.RETURNING, 0); }
		public ReturningClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturningClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturningClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturningClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningClauseContext returningClause() throws RecognitionException {
		ReturningClauseContext _localctx = new ReturningClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_returningClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(RETURNING);
			setState(586);
			switch (_input.LA(1)) {
			case L_BRACKET:
			case NOT:
			case ADD:
			case SUB:
			case CASE:
			case WITH:
			case SELECT:
			case CAST:
			case TRUE:
			case FALSE:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ANONYMOUS_PARAMETER:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
			case STRING:
				{
				setState(584); returningExpressions();
				}
				break;
			case MUL:
				{
				setState(585); returningAll();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningExpressionsContext extends ParserRuleContext {
		public List<ReturningOutputExpressionContext> returningOutputExpression() {
			return getRuleContexts(ReturningOutputExpressionContext.class);
		}
		public ReturningOutputExpressionContext returningOutputExpression(int i) {
			return getRuleContext(ReturningOutputExpressionContext.class,i);
		}
		public ReturningIntoClauseContext returningIntoClause() {
			return getRuleContext(ReturningIntoClauseContext.class,0);
		}
		public ReturningExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturningExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturningExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturningExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningExpressionsContext returningExpressions() throws RecognitionException {
		ReturningExpressionsContext _localctx = new ReturningExpressionsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returningExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); returningOutputExpression();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(589); match(4);
				setState(590); returningOutputExpression();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(596); returningIntoClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningOutputExpressionContext extends ParserRuleContext {
		public Token aliasName;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturningOutputExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningOutputExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturningOutputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturningOutputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturningOutputExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningOutputExpressionContext returningOutputExpression() throws RecognitionException {
		ReturningOutputExpressionContext _localctx = new ReturningOutputExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_returningOutputExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599); expression(0);
			setState(602);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(600); match(AS);
				setState(601); ((ReturningOutputExpressionContext)_localctx).aliasName = match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningAllContext extends ParserRuleContext {
		public ReturningAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturningAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturningAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturningAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningAllContext returningAll() throws RecognitionException {
		ReturningAllContext _localctx = new ReturningAllContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returningAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604); match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningIntoClauseContext extends ParserRuleContext {
		public Token hasStrict;
		public ReturningIntoTargetsContext returningIntoTargets() {
			return getRuleContext(ReturningIntoTargetsContext.class,0);
		}
		public TerminalNode INTO() { return getToken(PlPgSqlParser.INTO, 0); }
		public TerminalNode STRICT() { return getToken(PlPgSqlParser.STRICT, 0); }
		public ReturningIntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningIntoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturningIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturningIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturningIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningIntoClauseContext returningIntoClause() throws RecognitionException {
		ReturningIntoClauseContext _localctx = new ReturningIntoClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returningIntoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); match(INTO);
			setState(608);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(607); ((ReturningIntoClauseContext)_localctx).hasStrict = match(STRICT);
				}
			}

			setState(610); returningIntoTargets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningIntoTargetsContext extends ParserRuleContext {
		public List<ReturningIntoTargetContext> returningIntoTarget() {
			return getRuleContexts(ReturningIntoTargetContext.class);
		}
		public ReturningIntoTargetContext returningIntoTarget(int i) {
			return getRuleContext(ReturningIntoTargetContext.class,i);
		}
		public ReturningIntoTargetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningIntoTargets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturningIntoTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturningIntoTargets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturningIntoTargets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningIntoTargetsContext returningIntoTargets() throws RecognitionException {
		ReturningIntoTargetsContext _localctx = new ReturningIntoTargetsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_returningIntoTargets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612); returningIntoTarget();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(613); match(4);
				setState(614); returningIntoTarget();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningIntoTargetContext extends ParserRuleContext {
		public Token target;
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ReturningIntoTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returningIntoTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturningIntoTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturningIntoTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturningIntoTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturningIntoTargetContext returningIntoTarget() throws RecognitionException {
		ReturningIntoTargetContext _localctx = new ReturningIntoTargetContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returningIntoTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			((ReturningIntoTargetContext)_localctx).target = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((ReturningIntoTargetContext)_localctx).target = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PlPgSqlParser.WITH, 0); }
		public WithQueriesContext withQueries() {
			return getRuleContext(WithQueriesContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); match(WITH);
			setState(623); withQueries();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithRecursiveClauseContext extends ParserRuleContext {
		public TerminalNode RECURSIVE() { return getToken(PlPgSqlParser.RECURSIVE, 0); }
		public TerminalNode WITH() { return getToken(PlPgSqlParser.WITH, 0); }
		public WithQueriesContext withQueries() {
			return getRuleContext(WithQueriesContext.class,0);
		}
		public WithRecursiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withRecursiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWithRecursiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWithRecursiveClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWithRecursiveClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithRecursiveClauseContext withRecursiveClause() throws RecognitionException {
		WithRecursiveClauseContext _localctx = new WithRecursiveClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_withRecursiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); match(WITH);
			setState(626); match(RECURSIVE);
			setState(627); withQueries();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithQueriesContext extends ParserRuleContext {
		public List<WithQueryContext> withQuery() {
			return getRuleContexts(WithQueryContext.class);
		}
		public WithQueryContext withQuery(int i) {
			return getRuleContext(WithQueryContext.class,i);
		}
		public WithQueriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withQueries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWithQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWithQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWithQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithQueriesContext withQueries() throws RecognitionException {
		WithQueriesContext _localctx = new WithQueriesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_withQueries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); withQuery();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(630); match(4);
				setState(631); withQuery();
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithQueryContext extends ParserRuleContext {
		public Token withTempTable;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public WithQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWithQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWithQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWithQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithQueryContext withQuery() throws RecognitionException {
		WithQueryContext _localctx = new WithQueryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_withQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); ((WithQueryContext)_localctx).withTempTable = match(ID);
			setState(638); match(AS);
			setState(639); match(L_BRACKET);
			setState(640); select();
			setState(641); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); select();
			setState(644); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public BulkOperationClauseContext bulkOperationClause() {
			return getRuleContext(BulkOperationClauseContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(PlPgSqlParser.SELECT, 0); }
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_select);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(646); withClause();
				}
			}

			setState(649); match(SELECT);
			setState(650); selectList();
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(652);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(651); intoClause();
					}
				}

				setState(654); fromClause();
				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(655); joinClause();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(662);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(661); whereClause();
					}
					break;
				}
				setState(665);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(664); groupByClause();
					}
					break;
				}
				setState(668);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(667); havingClause();
					}
					break;
				}
				setState(671);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(670); bulkOperationClause();
					}
					break;
				}
				setState(674);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(673); orderByClause();
					}
					break;
				}
				setState(677);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(676); limitClause();
					}
					break;
				}
				setState(680);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(679); offsetClause();
					}
					break;
				}
				setState(683);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(682); fetchClause();
					}
					break;
				}
				setState(686);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(685); forClause();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public DistinctClauseContext distinctClause() {
			return getRuleContext(DistinctClauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PlPgSqlParser.ALL, 0); }
		public SelectSpecificContext selectSpecific() {
			return getRuleContext(SelectSpecificContext.class,0);
		}
		public SelectAllContext selectAll() {
			return getRuleContext(SelectAllContext.class,0);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_selectList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(690); match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(691); distinctClause();
				}
				break;
			case L_BRACKET:
			case NOT:
			case MUL:
			case ADD:
			case SUB:
			case CASE:
			case WITH:
			case SELECT:
			case CAST:
			case TRUE:
			case FALSE:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ANONYMOUS_PARAMETER:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
			case STRING:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(696);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(694); selectAll();
				}
				break;
			case L_BRACKET:
			case NOT:
			case ADD:
			case SUB:
			case CASE:
			case WITH:
			case SELECT:
			case CAST:
			case TRUE:
			case FALSE:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ANONYMOUS_PARAMETER:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
			case STRING:
				{
				setState(695); selectSpecific();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctClauseContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode DISTINCT() { return getToken(PlPgSqlParser.DISTINCT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DistinctClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDistinctClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDistinctClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDistinctClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctClauseContext distinctClause() throws RecognitionException {
		DistinctClauseContext _localctx = new DistinctClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_distinctClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698); match(DISTINCT);
			setState(699); match(ON);
			setState(700); expression(0);
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(701); match(4);
				setState(702); expression(0);
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectSpecificContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SelectSpecificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectSpecific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectSpecific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectSpecific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecificContext selectSpecific() throws RecognitionException {
		SelectSpecificContext _localctx = new SelectSpecificContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selectSpecific);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708); expression(0);
			setState(713);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(709); match(4);
					setState(710); expression(0);
					}
					} 
				}
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectAllContext extends ParserRuleContext {
		public SelectAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectAllContext selectAll() throws RecognitionException {
		SelectAllContext _localctx = new SelectAllContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716); match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntoClauseContext extends ParserRuleContext {
		public Token strict;
		public Token target;
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode INTO() { return getToken(PlPgSqlParser.INTO, 0); }
		public TerminalNode STRICT() { return getToken(PlPgSqlParser.STRICT, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718); match(INTO);
			setState(720);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(719); ((IntoClauseContext)_localctx).strict = match(STRICT);
				}
			}

			setState(722); ((IntoClauseContext)_localctx).target = match(ID);
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(723); match(4);
				setState(724); ((IntoClauseContext)_localctx).target = match(ID);
				}
				}
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public Token limit;
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode LIMIT() { return getToken(PlPgSqlParser.LIMIT, 0); }
		public TerminalNode ALL() { return getToken(PlPgSqlParser.ALL, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730); match(LIMIT);
			setState(731);
			((LimitClauseContext)_localctx).limit = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
				((LimitClauseContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetClauseContext extends ParserRuleContext {
		public Token offset;
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode OFFSET() { return getToken(PlPgSqlParser.OFFSET, 0); }
		public TerminalNode ROW() { return getToken(PlPgSqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PlPgSqlParser.ROWS, 0); }
		public OffsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterOffsetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitOffsetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitOffsetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetClauseContext offsetClause() throws RecognitionException {
		OffsetClauseContext _localctx = new OffsetClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); match(OFFSET);
			setState(734); ((OffsetClauseContext)_localctx).offset = match(INTEGER_VALUE);
			setState(736);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(735);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public TerminalNode ORDER_BY() { return getToken(PlPgSqlParser.ORDER_BY, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738); match(ORDER_BY);
			setState(739); orderByItem();
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(740); match(4);
					setState(741); orderByItem();
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByItemContext extends ParserRuleContext {
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	 
		public OrderByItemContext() { }
		public void copyFrom(OrderByItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingOrderingContext extends OrderByItemContext {
		public OrderByUsingContext orderByUsing() {
			return getRuleContext(OrderByUsingContext.class,0);
		}
		public NullsOrderingContext nullsOrdering() {
			return getRuleContext(NullsOrderingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UsingOrderingContext(OrderByItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUsingOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUsingOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUsingOrdering(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StandardOrderingContext extends OrderByItemContext {
		public Token ordering;
		public NullsOrderingContext nullsOrdering() {
			return getRuleContext(NullsOrderingContext.class,0);
		}
		public TerminalNode DESC() { return getToken(PlPgSqlParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(PlPgSqlParser.ASC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StandardOrderingContext(OrderByItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStandardOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStandardOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStandardOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_orderByItem);
		int _la;
		try {
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new StandardOrderingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(747); expression(0);
				setState(749);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(748);
					((StandardOrderingContext)_localctx).ordering = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
						((StandardOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(752);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(751); nullsOrdering();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new UsingOrderingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(754); expression(0);
				setState(755); orderByUsing();
				setState(757);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(756); nullsOrdering();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByUsingContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode GTE() { return getToken(PlPgSqlParser.GTE, 0); }
		public TerminalNode LT() { return getToken(PlPgSqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PlPgSqlParser.LTE, 0); }
		public TerminalNode USING() { return getToken(PlPgSqlParser.USING, 0); }
		public TerminalNode GT() { return getToken(PlPgSqlParser.GT, 0); }
		public OrderByUsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByUsing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterOrderByUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitOrderByUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitOrderByUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByUsingContext orderByUsing() throws RecognitionException {
		OrderByUsingContext _localctx = new OrderByUsingContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_orderByUsing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761); match(USING);
			setState(762);
			((OrderByUsingContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
				((OrderByUsingContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullsOrderingContext extends ParserRuleContext {
		public Token ordering;
		public TerminalNode FIRST() { return getToken(PlPgSqlParser.FIRST, 0); }
		public TerminalNode NULLS() { return getToken(PlPgSqlParser.NULLS, 0); }
		public TerminalNode LAST() { return getToken(PlPgSqlParser.LAST, 0); }
		public NullsOrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullsOrdering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterNullsOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitNullsOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitNullsOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullsOrderingContext nullsOrdering() throws RecognitionException {
		NullsOrderingContext _localctx = new NullsOrderingContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nullsOrdering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764); match(NULLS);
			setState(765);
			((NullsOrderingContext)_localctx).ordering = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==LAST) ) {
				((NullsOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TableExpressionContext tableExpression(int i) {
			return getRuleContext(TableExpressionContext.class,i);
		}
		public List<TableExpressionContext> tableExpression() {
			return getRuleContexts(TableExpressionContext.class);
		}
		public TerminalNode FROM() { return getToken(PlPgSqlParser.FROM, 0); }
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767); match(FROM);
			setState(768); tableExpression();
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(769); match(4);
					setState(770); tableExpression();
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode NATURAL() { return getToken(PlPgSqlParser.NATURAL, 0); }
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(776); match(NATURAL);
				}
			}

			setState(779); join();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExpressionContext extends ParserRuleContext {
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
	 
		public TableExpressionContext() { }
		public void copyFrom(TableExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FromTableContext extends TableExpressionContext {
		public Token only;
		public Token tableName;
		public Token alias;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ONLY() { return getToken(PlPgSqlParser.ONLY, 0); }
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public FromTableContext(TableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromSelectContext extends TableExpressionContext {
		public Token alias;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public ColumnAliasContext columnAlias() {
			return getRuleContext(ColumnAliasContext.class,0);
		}
		public FromSelectContext(TableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFromSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFromSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFromSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tableExpression);
		int _la;
		try {
			setState(805);
			switch (_input.LA(1)) {
			case ONLY:
			case ID:
			case QNAME:
				_localctx = new FromTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(781); ((FromTableContext)_localctx).only = match(ONLY);
					}
				}

				setState(784);
				((FromTableContext)_localctx).tableName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FromTableContext)_localctx).tableName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(786);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(785); match(MUL);
					}
					break;
				}
				setState(793);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(789);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(788); match(AS);
						}
					}

					setState(791); ((FromTableContext)_localctx).alias = match(ID);
					setState(792); columnAlias();
					}
					break;
				}
				}
				break;
			case L_BRACKET:
				_localctx = new FromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(795); match(L_BRACKET);
				setState(796); select();
				setState(797); match(R_BRACKET);
				setState(799);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(798); match(AS);
					}
				}

				setState(801); ((FromSelectContext)_localctx).alias = match(ID);
				setState(803);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(802); columnAlias();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
	 
		public JoinContext() { }
		public void copyFrom(JoinContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LeftOuterJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(PlPgSqlParser.OUTER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode LEFT() { return getToken(PlPgSqlParser.LEFT, 0); }
		public LeftOuterJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLeftOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLeftOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLeftOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(PlPgSqlParser.OUTER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode FULL() { return getToken(PlPgSqlParser.FULL, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public FullJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFullJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFullJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFullJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FullOuterJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode FULL() { return getToken(PlPgSqlParser.FULL, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public FullOuterJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFullOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFullOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFullOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode LEFT() { return getToken(PlPgSqlParser.LEFT, 0); }
		public LeftJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLeftJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLeftJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLeftJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightOuterJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public TerminalNode OUTER() { return getToken(PlPgSqlParser.OUTER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(PlPgSqlParser.RIGHT, 0); }
		public RightOuterJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRightOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRightOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRightOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RightJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode RIGHT() { return getToken(PlPgSqlParser.RIGHT, 0); }
		public RightJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRightJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRightJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRightJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode INNER() { return getToken(PlPgSqlParser.INNER, 0); }
		public InnerJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CrossJoinContext extends JoinContext {
		public Token table;
		public TerminalNode JOIN() { return getToken(PlPgSqlParser.JOIN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlPgSqlParser.ON, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode CROSS() { return getToken(PlPgSqlParser.CROSS, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public CrossJoinContext(JoinContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterCrossJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitCrossJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitCrossJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_join);
		int _la;
		try {
			setState(852);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(807); match(INNER);
					}
				}

				setState(810); match(JOIN);
				setState(811);
				((InnerJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((InnerJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(812); match(ON);
				setState(813); condition();
				}
				break;

			case 2:
				_localctx = new LeftOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(814); match(LEFT);
				setState(815); match(OUTER);
				setState(816); match(JOIN);
				setState(817);
				((LeftOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(818); match(ON);
				setState(819); condition();
				}
				break;

			case 3:
				_localctx = new LeftJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(820); match(LEFT);
				setState(821); match(JOIN);
				setState(822);
				((LeftJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(823); match(ON);
				setState(824); condition();
				}
				break;

			case 4:
				_localctx = new RightOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(825); match(RIGHT);
				setState(826); match(OUTER);
				setState(827); match(JOIN);
				setState(828);
				((RightOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(829); match(ON);
				setState(830); condition();
				}
				break;

			case 5:
				_localctx = new RightJoinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(831); match(RIGHT);
				setState(832); match(JOIN);
				setState(833);
				((RightJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(834); match(ON);
				setState(835); condition();
				}
				break;

			case 6:
				_localctx = new FullJoinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(836); match(FULL);
				setState(837); match(OUTER);
				setState(838); match(JOIN);
				setState(839);
				((FullJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(840); match(ON);
				setState(841); condition();
				}
				break;

			case 7:
				_localctx = new FullOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(842); match(FULL);
				setState(843); match(JOIN);
				setState(844);
				((FullOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(845); match(ON);
				setState(846); condition();
				}
				break;

			case 8:
				_localctx = new CrossJoinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(847); match(CROSS);
				setState(848); match(JOIN);
				setState(849);
				((CrossJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((CrossJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(850); match(ON);
				setState(851); condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasContext extends ParserRuleContext {
		public ColumnAliasItemContext columnAliasItem(int i) {
			return getRuleContext(ColumnAliasItemContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public List<ColumnAliasItemContext> columnAliasItem() {
			return getRuleContexts(ColumnAliasItemContext.class);
		}
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public ColumnAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterColumnAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitColumnAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitColumnAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasContext columnAlias() throws RecognitionException {
		ColumnAliasContext _localctx = new ColumnAliasContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854); match(L_BRACKET);
			setState(855); columnAliasItem();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(856); match(4);
				setState(857); columnAliasItem();
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(863); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ColumnAliasItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliasItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterColumnAliasItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitColumnAliasItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitColumnAliasItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasItemContext columnAliasItem() throws RecognitionException {
		ColumnAliasItemContext _localctx = new ColumnAliasItemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_columnAliasItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(PlPgSqlParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867); match(WHERE);
			setState(868); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GROUP_BY() { return getToken(PlPgSqlParser.GROUP_BY, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870); match(GROUP_BY);
			setState(871); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(PlPgSqlParser.HAVING, 0); }
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873); match(HAVING);
			setState(874); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BulkOperationClauseContext extends ParserRuleContext {
		public Token operator;
		public Token selectMode;
		public TerminalNode EXCEPT() { return getToken(PlPgSqlParser.EXCEPT, 0); }
		public TerminalNode UNION() { return getToken(PlPgSqlParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(PlPgSqlParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PlPgSqlParser.DISTINCT, 0); }
		public TerminalNode INTERSECT() { return getToken(PlPgSqlParser.INTERSECT, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public BulkOperationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulkOperationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterBulkOperationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitBulkOperationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitBulkOperationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BulkOperationClauseContext bulkOperationClause() throws RecognitionException {
		BulkOperationClauseContext _localctx = new BulkOperationClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_bulkOperationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			((BulkOperationClauseContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNION - 103)) | (1L << (INTERSECT - 103)) | (1L << (EXCEPT - 103)))) != 0)) ) {
				((BulkOperationClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(877);
			((BulkOperationClauseContext)_localctx).selectMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
				((BulkOperationClauseContext)_localctx).selectMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(878); select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FetchClauseContext extends ParserRuleContext {
		public Token count;
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public TerminalNode NEXT() { return getToken(PlPgSqlParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(PlPgSqlParser.FIRST, 0); }
		public TerminalNode ROW() { return getToken(PlPgSqlParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PlPgSqlParser.ROWS, 0); }
		public TerminalNode ONLY() { return getToken(PlPgSqlParser.ONLY, 0); }
		public TerminalNode FETCH() { return getToken(PlPgSqlParser.FETCH, 0); }
		public FetchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterFetchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitFetchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitFetchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchClauseContext fetchClause() throws RecognitionException {
		FetchClauseContext _localctx = new FetchClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880); match(FETCH);
			setState(882);
			_la = _input.LA(1);
			if (_la==FIRST || _la==NEXT) {
				{
				setState(881);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(885);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(884); ((FetchClauseContext)_localctx).count = match(INTEGER_VALUE);
				}
			}

			setState(888);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(887);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(890); match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public Token lockMode;
		public Token nowait;
		public TerminalNode FOR() { return getToken(PlPgSqlParser.FOR, 0); }
		public TerminalNode NOWAIT() { return getToken(PlPgSqlParser.NOWAIT, 0); }
		public LockedTablesContext lockedTables() {
			return getRuleContext(LockedTablesContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(PlPgSqlParser.UPDATE, 0); }
		public TerminalNode SHARE() { return getToken(PlPgSqlParser.SHARE, 0); }
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892); match(FOR);
			setState(893);
			((ForClauseContext)_localctx).lockMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==SHARE) ) {
				((ForClauseContext)_localctx).lockMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(895);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(894); lockedTables();
				}
				break;
			}
			setState(898);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(897); ((ForClauseContext)_localctx).nowait = match(NOWAIT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockedTablesContext extends ParserRuleContext {
		public List<LockedTableContext> lockedTable() {
			return getRuleContexts(LockedTableContext.class);
		}
		public TerminalNode OF() { return getToken(PlPgSqlParser.OF, 0); }
		public LockedTableContext lockedTable(int i) {
			return getRuleContext(LockedTableContext.class,i);
		}
		public LockedTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockedTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLockedTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLockedTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLockedTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockedTablesContext lockedTables() throws RecognitionException {
		LockedTablesContext _localctx = new LockedTablesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lockedTables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(900); match(OF);
			setState(901); lockedTable();
			setState(906);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(902); match(4);
					setState(903); lockedTable();
					}
					} 
				}
				setState(908);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockedTableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public LockedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockedTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLockedTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLockedTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLockedTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockedTableContext lockedTable() throws RecognitionException {
		LockedTableContext _localctx = new LockedTableContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lockedTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerformStmtContext extends ParserRuleContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public BulkOperationClauseContext bulkOperationClause() {
			return getRuleContext(BulkOperationClauseContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public FetchClauseContext fetchClause() {
			return getRuleContext(FetchClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public OffsetClauseContext offsetClause() {
			return getRuleContext(OffsetClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode PERFORM() { return getToken(PlPgSqlParser.PERFORM, 0); }
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public PerformStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_performStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterPerformStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitPerformStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitPerformStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerformStmtContext performStmt() throws RecognitionException {
		PerformStmtContext _localctx = new PerformStmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_performStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911); match(PERFORM);
			setState(912); selectList();
			setState(947);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(913); fromClause();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (JOIN - 73)) | (1L << (INNER - 73)) | (1L << (LEFT - 73)) | (1L << (RIGHT - 73)) | (1L << (FULL - 73)) | (1L << (CROSS - 73)) | (1L << (NATURAL - 73)))) != 0)) {
					{
					{
					setState(914); joinClause();
					}
					}
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(921);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(920); whereClause();
					}
				}

				setState(924);
				_la = _input.LA(1);
				if (_la==GROUP_BY) {
					{
					setState(923); groupByClause();
					}
				}

				setState(927);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(926); havingClause();
					}
				}

				setState(930);
				_la = _input.LA(1);
				if (((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNION - 103)) | (1L << (INTERSECT - 103)) | (1L << (EXCEPT - 103)))) != 0)) {
					{
					setState(929); bulkOperationClause();
					}
				}

				setState(933);
				_la = _input.LA(1);
				if (_la==ORDER_BY) {
					{
					setState(932); orderByClause();
					}
				}

				setState(936);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(935); limitClause();
					}
				}

				setState(939);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(938); offsetClause();
					}
				}

				setState(942);
				_la = _input.LA(1);
				if (_la==FETCH) {
					{
					setState(941); fetchClause();
					}
				}

				setState(945);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(944); forClause();
					}
				}

				}
			}

			setState(949); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteStmtContext extends ParserRuleContext {
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public ExecuteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecuteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecuteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecuteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteStmtContext executeStmt() throws RecognitionException {
		ExecuteStmtContext _localctx = new ExecuteStmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_executeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951); execute();
			setState(952); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(PlPgSqlParser.EXECUTE, 0); }
		public ExecuteUsingClauseContext executeUsingClause() {
			return getRuleContext(ExecuteUsingClauseContext.class,0);
		}
		public ExecuteCommandContext executeCommand() {
			return getRuleContext(ExecuteCommandContext.class,0);
		}
		public ExecuteIntoClauseContext executeIntoClause() {
			return getRuleContext(ExecuteIntoClauseContext.class,0);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954); match(EXECUTE);
			setState(955); executeCommand();
			setState(957);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(956); executeIntoClause();
				}
			}

			setState(960);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(959); executeUsingClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteCommandContext extends ParserRuleContext {
		public FunctionCallExprContext functionCallExpr() {
			return getRuleContext(FunctionCallExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public ExecuteCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecuteCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecuteCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecuteCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteCommandContext executeCommand() throws RecognitionException {
		ExecuteCommandContext _localctx = new ExecuteCommandContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_executeCommand);
		try {
			setState(964);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(962); match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(963); functionCallExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteIntoClauseContext extends ParserRuleContext {
		public Token hasStrict;
		public ExecuteIntoTargetsContext executeIntoTargets() {
			return getRuleContext(ExecuteIntoTargetsContext.class,0);
		}
		public TerminalNode INTO() { return getToken(PlPgSqlParser.INTO, 0); }
		public TerminalNode STRICT() { return getToken(PlPgSqlParser.STRICT, 0); }
		public ExecuteIntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeIntoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecuteIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecuteIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecuteIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteIntoClauseContext executeIntoClause() throws RecognitionException {
		ExecuteIntoClauseContext _localctx = new ExecuteIntoClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_executeIntoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966); match(INTO);
			setState(968);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(967); ((ExecuteIntoClauseContext)_localctx).hasStrict = match(STRICT);
				}
			}

			setState(970); executeIntoTargets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteIntoTargetsContext extends ParserRuleContext {
		public List<ExecuteIntoTargetContext> executeIntoTarget() {
			return getRuleContexts(ExecuteIntoTargetContext.class);
		}
		public ExecuteIntoTargetContext executeIntoTarget(int i) {
			return getRuleContext(ExecuteIntoTargetContext.class,i);
		}
		public ExecuteIntoTargetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeIntoTargets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecuteIntoTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecuteIntoTargets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecuteIntoTargets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteIntoTargetsContext executeIntoTargets() throws RecognitionException {
		ExecuteIntoTargetsContext _localctx = new ExecuteIntoTargetsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_executeIntoTargets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972); executeIntoTarget();
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(973); match(4);
				setState(974); executeIntoTarget();
				}
				}
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteIntoTargetContext extends ParserRuleContext {
		public Token target;
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ExecuteIntoTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeIntoTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecuteIntoTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecuteIntoTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecuteIntoTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteIntoTargetContext executeIntoTarget() throws RecognitionException {
		ExecuteIntoTargetContext _localctx = new ExecuteIntoTargetContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_executeIntoTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			((ExecuteIntoTargetContext)_localctx).target = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((ExecuteIntoTargetContext)_localctx).target = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteUsingClauseContext extends ParserRuleContext {
		public ExecuteUsingExpressionContext executeUsingExpression(int i) {
			return getRuleContext(ExecuteUsingExpressionContext.class,i);
		}
		public List<ExecuteUsingExpressionContext> executeUsingExpression() {
			return getRuleContexts(ExecuteUsingExpressionContext.class);
		}
		public TerminalNode USING() { return getToken(PlPgSqlParser.USING, 0); }
		public ExecuteUsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeUsingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecuteUsingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecuteUsingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecuteUsingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteUsingClauseContext executeUsingClause() throws RecognitionException {
		ExecuteUsingClauseContext _localctx = new ExecuteUsingClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_executeUsingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982); match(USING);
			setState(983); executeUsingExpression();
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(984); match(4);
				setState(985); executeUsingExpression();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteUsingExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExecuteUsingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeUsingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExecuteUsingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExecuteUsingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExecuteUsingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteUsingExpressionContext executeUsingExpression() throws RecognitionException {
		ExecuteUsingExpressionContext _localctx = new ExecuteUsingExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_executeUsingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993); insert();
			setState(994); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public Token table;
		public InsertColumnListContext insertColumnList() {
			return getRuleContext(InsertColumnListContext.class,0);
		}
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public ReturningClauseContext returningClause() {
			return getRuleContext(ReturningClauseContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode INTO() { return getToken(PlPgSqlParser.INTO, 0); }
		public TerminalNode INSERT() { return getToken(PlPgSqlParser.INSERT, 0); }
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(996); withClause();
				}
			}

			setState(999); match(INSERT);
			setState(1000); match(INTO);
			setState(1001);
			((InsertContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((InsertContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(1003);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(1002); insertColumnList();
				}
			}

			setState(1007);
			switch (_input.LA(1)) {
			case VALUES:
			case DEFAULT:
				{
				setState(1005); insertValuesClause();
				}
				break;
			case WITH:
			case SELECT:
				{
				setState(1006); select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1010);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1009); returningClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertColumnListContext extends ParserRuleContext {
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public InsertColumnContext insertColumn(int i) {
			return getRuleContext(InsertColumnContext.class,i);
		}
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public List<InsertColumnContext> insertColumn() {
			return getRuleContexts(InsertColumnContext.class);
		}
		public InsertColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertColumnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertColumnListContext insertColumnList() throws RecognitionException {
		InsertColumnListContext _localctx = new InsertColumnListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_insertColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012); match(L_BRACKET);
			setState(1013); insertColumn();
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1014); match(4);
				setState(1015); insertColumn();
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertColumnContext extends ParserRuleContext {
		public Token column;
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public InsertColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertColumnContext insertColumn() throws RecognitionException {
		InsertColumnContext _localctx = new InsertColumnContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_insertColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023); ((InsertColumnContext)_localctx).column = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesClauseContext extends ParserRuleContext {
		public InsertValuesContext insertValues() {
			return getRuleContext(InsertValuesContext.class,0);
		}
		public InsertDefaultValuesContext insertDefaultValues() {
			return getRuleContext(InsertDefaultValuesContext.class,0);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertValuesClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertValuesClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertValuesClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_insertValuesClause);
		try {
			setState(1027);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025); insertDefaultValues();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026); insertValues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertDefaultValuesContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode VALUES() { return getToken(PlPgSqlParser.VALUES, 0); }
		public InsertDefaultValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertDefaultValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertDefaultValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertDefaultValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertDefaultValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertDefaultValuesContext insertDefaultValues() throws RecognitionException {
		InsertDefaultValuesContext _localctx = new InsertDefaultValuesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_insertDefaultValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); match(DEFAULT);
			setState(1030); match(VALUES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesContext extends ParserRuleContext {
		public InsertValueTupleContext insertValueTuple(int i) {
			return getRuleContext(InsertValueTupleContext.class,i);
		}
		public List<InsertValueTupleContext> insertValueTuple() {
			return getRuleContexts(InsertValueTupleContext.class);
		}
		public TerminalNode VALUES() { return getToken(PlPgSqlParser.VALUES, 0); }
		public InsertValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuesContext insertValues() throws RecognitionException {
		InsertValuesContext _localctx = new InsertValuesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_insertValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032); match(VALUES);
			setState(1033); insertValueTuple();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1034); match(4);
				setState(1035); insertValueTuple();
				}
				}
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValueTupleContext extends ParserRuleContext {
		public InsertValueContext insertValue(int i) {
			return getRuleContext(InsertValueContext.class,i);
		}
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public List<InsertValueContext> insertValue() {
			return getRuleContexts(InsertValueContext.class);
		}
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public InsertValueTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValueTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertValueTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertValueTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertValueTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValueTupleContext insertValueTuple() throws RecognitionException {
		InsertValueTupleContext _localctx = new InsertValueTupleContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_insertValueTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041); match(L_BRACKET);
			setState(1042); insertValue();
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1043); match(4);
				setState(1044); insertValue();
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValueContext extends ParserRuleContext {
		public Token column;
		public Token hasDefault;
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InsertValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterInsertValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitInsertValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitInsertValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValueContext insertValue() throws RecognitionException {
		InsertValueContext _localctx = new InsertValueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_insertValue);
		int _la;
		try {
			setState(1055);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				((InsertValueContext)_localctx).column = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((InsertValueContext)_localctx).column = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1054); ((InsertValueContext)_localctx).hasDefault = match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStmtContext extends ParserRuleContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_updateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057); update();
			setState(1058); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public Token hasOnly;
		public Token table;
		public Token areDescendantTablesIncluded;
		public Token tableAliasName;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode SET() { return getToken(PlPgSqlParser.SET, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public UpdateMultiSetClauseContext updateMultiSetClause() {
			return getRuleContext(UpdateMultiSetClauseContext.class,0);
		}
		public ReturningClauseContext returningClause() {
			return getRuleContext(ReturningClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ONLY() { return getToken(PlPgSqlParser.ONLY, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(PlPgSqlParser.UPDATE, 0); }
		public UpdateSingleSetClauseContext updateSingleSetClause() {
			return getRuleContext(UpdateSingleSetClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1060); withClause();
				}
			}

			setState(1063); match(UPDATE);
			setState(1065);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1064); ((UpdateContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(1067);
			((UpdateContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(1069);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1068); ((UpdateContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(1073);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1071); match(AS);
				setState(1072); ((UpdateContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(1075); match(SET);
			setState(1078);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
				{
				setState(1076); updateSingleSetClause();
				}
				break;
			case L_BRACKET:
				{
				setState(1077); updateMultiSetClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1081);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1080); fromClause();
				}
			}

			setState(1084);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1083); whereClause();
				}
			}

			setState(1087);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1086); returningClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSingleSetClauseContext extends ParserRuleContext {
		public UpdateSingleSetAssignmentContext updateSingleSetAssignment(int i) {
			return getRuleContext(UpdateSingleSetAssignmentContext.class,i);
		}
		public List<UpdateSingleSetAssignmentContext> updateSingleSetAssignment() {
			return getRuleContexts(UpdateSingleSetAssignmentContext.class);
		}
		public UpdateSingleSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSingleSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateSingleSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateSingleSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateSingleSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSingleSetClauseContext updateSingleSetClause() throws RecognitionException {
		UpdateSingleSetClauseContext _localctx = new UpdateSingleSetClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_updateSingleSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089); updateSingleSetAssignment();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1090); match(4);
				setState(1091); updateSingleSetAssignment();
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSingleSetAssignmentContext extends ParserRuleContext {
		public Token column;
		public UpdateSetValueContext updateSetValue() {
			return getRuleContext(UpdateSetValueContext.class,0);
		}
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public UpdateSingleSetAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSingleSetAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateSingleSetAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateSingleSetAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateSingleSetAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSingleSetAssignmentContext updateSingleSetAssignment() throws RecognitionException {
		UpdateSingleSetAssignmentContext _localctx = new UpdateSingleSetAssignmentContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_updateSingleSetAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			((UpdateSingleSetAssignmentContext)_localctx).column = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateSingleSetAssignmentContext)_localctx).column = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(1098); match(EQ);
			setState(1099); updateSetValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateMultiSetClauseContext extends ParserRuleContext {
		public UpdateMultiSetAssignmentContext updateMultiSetAssignment(int i) {
			return getRuleContext(UpdateMultiSetAssignmentContext.class,i);
		}
		public List<UpdateMultiSetAssignmentContext> updateMultiSetAssignment() {
			return getRuleContexts(UpdateMultiSetAssignmentContext.class);
		}
		public UpdateMultiSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateMultiSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateMultiSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateMultiSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateMultiSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateMultiSetClauseContext updateMultiSetClause() throws RecognitionException {
		UpdateMultiSetClauseContext _localctx = new UpdateMultiSetClauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_updateMultiSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101); updateMultiSetAssignment();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1102); match(4);
				setState(1103); updateMultiSetAssignment();
				}
				}
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateMultiSetAssignmentContext extends ParserRuleContext {
		public UpdateMultiSetColumnsContext updateMultiSetColumns() {
			return getRuleContext(UpdateMultiSetColumnsContext.class,0);
		}
		public TerminalNode L_BRACKET(int i) {
			return getToken(PlPgSqlParser.L_BRACKET, i);
		}
		public List<TerminalNode> R_BRACKET() { return getTokens(PlPgSqlParser.R_BRACKET); }
		public TerminalNode R_BRACKET(int i) {
			return getToken(PlPgSqlParser.R_BRACKET, i);
		}
		public List<TerminalNode> L_BRACKET() { return getTokens(PlPgSqlParser.L_BRACKET); }
		public UpdateMultiSetValuesContext updateMultiSetValues() {
			return getRuleContext(UpdateMultiSetValuesContext.class,0);
		}
		public UpdateMultiSetAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateMultiSetAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateMultiSetAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateMultiSetAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateMultiSetAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateMultiSetAssignmentContext updateMultiSetAssignment() throws RecognitionException {
		UpdateMultiSetAssignmentContext _localctx = new UpdateMultiSetAssignmentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_updateMultiSetAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109); match(L_BRACKET);
			setState(1110); updateMultiSetColumns();
			setState(1111); match(R_BRACKET);
			setState(1112); match(EQ);
			setState(1113); match(L_BRACKET);
			setState(1114); updateMultiSetValues();
			setState(1115); match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateMultiSetColumnsContext extends ParserRuleContext {
		public List<UpdateMultiSetColumnContext> updateMultiSetColumn() {
			return getRuleContexts(UpdateMultiSetColumnContext.class);
		}
		public UpdateMultiSetColumnContext updateMultiSetColumn(int i) {
			return getRuleContext(UpdateMultiSetColumnContext.class,i);
		}
		public UpdateMultiSetColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateMultiSetColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateMultiSetColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateMultiSetColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateMultiSetColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateMultiSetColumnsContext updateMultiSetColumns() throws RecognitionException {
		UpdateMultiSetColumnsContext _localctx = new UpdateMultiSetColumnsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_updateMultiSetColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117); updateMultiSetColumn();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1118); match(4);
				setState(1119); updateMultiSetColumn();
				}
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateMultiSetColumnContext extends ParserRuleContext {
		public Token column;
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public UpdateMultiSetColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateMultiSetColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateMultiSetColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateMultiSetColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateMultiSetColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateMultiSetColumnContext updateMultiSetColumn() throws RecognitionException {
		UpdateMultiSetColumnContext _localctx = new UpdateMultiSetColumnContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_updateMultiSetColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			((UpdateMultiSetColumnContext)_localctx).column = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateMultiSetColumnContext)_localctx).column = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateMultiSetValuesContext extends ParserRuleContext {
		public List<UpdateSetValueContext> updateSetValue() {
			return getRuleContexts(UpdateSetValueContext.class);
		}
		public UpdateSetValueContext updateSetValue(int i) {
			return getRuleContext(UpdateSetValueContext.class,i);
		}
		public UpdateMultiSetValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateMultiSetValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateMultiSetValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateMultiSetValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateMultiSetValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateMultiSetValuesContext updateMultiSetValues() throws RecognitionException {
		UpdateMultiSetValuesContext _localctx = new UpdateMultiSetValuesContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_updateMultiSetValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127); updateSetValue();
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1128); match(4);
				setState(1129); updateSetValue();
				}
				}
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSetValueContext extends ParserRuleContext {
		public Token column;
		public Token hasDefault;
		public TerminalNode DEFAULT() { return getToken(PlPgSqlParser.DEFAULT, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateSetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSetValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUpdateSetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUpdateSetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUpdateSetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSetValueContext updateSetValue() throws RecognitionException {
		UpdateSetValueContext _localctx = new UpdateSetValueContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_updateSetValue);
		int _la;
		try {
			setState(1138);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				((UpdateSetValueContext)_localctx).column = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((UpdateSetValueContext)_localctx).column = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1137); ((UpdateSetValueContext)_localctx).hasDefault = match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStmtContext extends ParserRuleContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDeleteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDeleteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_deleteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140); delete();
			setState(1141); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public Token hasOnly;
		public Token table;
		public Token areDescendantTablesIncluded;
		public Token tableAliasName;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public DeleteUsingClauseContext deleteUsingClause() {
			return getRuleContext(DeleteUsingClauseContext.class,0);
		}
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public ReturningClauseContext returningClause() {
			return getRuleContext(ReturningClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public TerminalNode ONLY() { return getToken(PlPgSqlParser.ONLY, 0); }
		public TerminalNode DELETE() { return getToken(PlPgSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(PlPgSqlParser.FROM, 0); }
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1143); withClause();
				}
			}

			setState(1146); match(DELETE);
			setState(1147); match(FROM);
			setState(1149);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1148); ((DeleteContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(1151);
			((DeleteContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((DeleteContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(1153);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1152); ((DeleteContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(1157);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1155); match(AS);
				setState(1156); ((DeleteContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(1160);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1159); deleteUsingClause();
				}
			}

			setState(1163);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1162); whereClause();
				}
			}

			setState(1166);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1165); returningClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteUsingClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PlPgSqlParser.USING, 0); }
		public DeleteUsingTableContext deleteUsingTable(int i) {
			return getRuleContext(DeleteUsingTableContext.class,i);
		}
		public List<DeleteUsingTableContext> deleteUsingTable() {
			return getRuleContexts(DeleteUsingTableContext.class);
		}
		public DeleteUsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteUsingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDeleteUsingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDeleteUsingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDeleteUsingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteUsingClauseContext deleteUsingClause() throws RecognitionException {
		DeleteUsingClauseContext _localctx = new DeleteUsingClauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_deleteUsingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168); match(USING);
			setState(1169); deleteUsingTable();
			setState(1174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1170); match(4);
				setState(1171); deleteUsingTable();
				}
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteUsingTableContext extends ParserRuleContext {
		public Token tableName;
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public DeleteUsingTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteUsingTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterDeleteUsingTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitDeleteUsingTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitDeleteUsingTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteUsingTableContext deleteUsingTable() throws RecognitionException {
		DeleteUsingTableContext _localctx = new DeleteUsingTableContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_deleteUsingTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			((DeleteUsingTableContext)_localctx).tableName = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((DeleteUsingTableContext)_localctx).tableName = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public ReturnNextContext returnNext() {
			return getRuleContext(ReturnNextContext.class,0);
		}
		public ReturnSimpleContext returnSimple() {
			return getRuleContext(ReturnSimpleContext.class,0);
		}
		public ReturnQueryContext returnQuery() {
			return getRuleContext(ReturnQueryContext.class,0);
		}
		public ReturnQueryExecuteContext returnQueryExecute() {
			return getRuleContext(ReturnQueryExecuteContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1179); returnSimple();
				}
				break;

			case 2:
				{
				setState(1180); returnNext();
				}
				break;

			case 3:
				{
				setState(1181); returnQuery();
				}
				break;

			case 4:
				{
				setState(1182); returnQueryExecute();
				}
				break;
			}
			setState(1185); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnSimpleContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PlPgSqlParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturnSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturnSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturnSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnSimpleContext returnSimple() throws RecognitionException {
		ReturnSimpleContext _localctx = new ReturnSimpleContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_returnSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187); match(RETURN);
			setState(1189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_BRACKET) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << CASE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WITH - 66)) | (1L << (SELECT - 66)) | (1L << (CAST - 66)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (TRUE - 151)) | (1L << (FALSE - 151)) | (1L << (INTEGER_VALUE - 151)) | (1L << (DECIMAL_VALUE - 151)) | (1L << (ANONYMOUS_PARAMETER - 151)) | (1L << (ID - 151)) | (1L << (QNAME - 151)) | (1L << (ARRAY_TYPE - 151)) | (1L << (COPY_TYPE - 151)) | (1L << (ROW_TYPE - 151)) | (1L << (STRING - 151)))) != 0)) {
				{
				setState(1188); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnNextContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(PlPgSqlParser.NEXT, 0); }
		public TerminalNode RETURN() { return getToken(PlPgSqlParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnNextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnNext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturnNext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturnNext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturnNext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnNextContext returnNext() throws RecognitionException {
		ReturnNextContext _localctx = new ReturnNextContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_returnNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191); match(RETURN);
			setState(1192); match(NEXT);
			setState(1193); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnQueryContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode QUERY() { return getToken(PlPgSqlParser.QUERY, 0); }
		public TerminalNode RETURN() { return getToken(PlPgSqlParser.RETURN, 0); }
		public ReturnQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturnQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturnQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturnQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnQueryContext returnQuery() throws RecognitionException {
		ReturnQueryContext _localctx = new ReturnQueryContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_returnQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195); match(RETURN);
			setState(1196); match(QUERY);
			setState(1197); select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnQueryExecuteContext extends ParserRuleContext {
		public TerminalNode QUERY() { return getToken(PlPgSqlParser.QUERY, 0); }
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(PlPgSqlParser.RETURN, 0); }
		public ReturnQueryExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnQueryExecute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterReturnQueryExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitReturnQueryExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitReturnQueryExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnQueryExecuteContext returnQueryExecute() throws RecognitionException {
		ReturnQueryExecuteContext _localctx = new ReturnQueryExecuteContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_returnQueryExecute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199); match(RETURN);
			setState(1200); match(QUERY);
			setState(1201); execute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public List<TerminalNode> THEN() { return getTokens(PlPgSqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(PlPgSqlParser.THEN, i);
		}
		public TerminalNode IF(int i) {
			return getToken(PlPgSqlParser.IF, i);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public List<TerminalNode> ELSIF() { return getTokens(PlPgSqlParser.ELSIF); }
		public List<TerminalNode> IF() { return getTokens(PlPgSqlParser.IF); }
		public TerminalNode ELSE() { return getToken(PlPgSqlParser.ELSE, 0); }
		public List<ElsifConditionContext> elsifCondition() {
			return getRuleContexts(ElsifConditionContext.class);
		}
		public ElsifConditionContext elsifCondition(int i) {
			return getRuleContext(ElsifConditionContext.class,i);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public TerminalNode ELSIF(int i) {
			return getToken(PlPgSqlParser.ELSIF, i);
		}
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203); match(IF);
			setState(1204); ifCondition();
			setState(1205); match(THEN);
			setState(1206); stmts();
			setState(1214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(1207); match(ELSIF);
				setState(1208); elsifCondition();
				setState(1209); match(THEN);
				setState(1210); stmts();
				}
				}
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1219);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1217); match(ELSE);
				setState(1218); stmts();
				}
			}

			setState(1221); match(END);
			setState(1222); match(IF);
			setState(1223); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsifConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ElsifConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterElsifCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitElsifCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitElsifCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsifConditionContext elsifCondition() throws RecognitionException {
		ElsifConditionContext _localctx = new ElsifConditionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_elsifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStmtContext extends ParserRuleContext {
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_caseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229); caseExpr();
			setState(1230); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExprContext extends ParserRuleContext {
		public List<TerminalNode> THEN() { return getTokens(PlPgSqlParser.THEN); }
		public TerminalNode WHEN(int i) {
			return getToken(PlPgSqlParser.WHEN, i);
		}
		public WhenExpressionsContext whenExpressions(int i) {
			return getRuleContext(WhenExpressionsContext.class,i);
		}
		public TerminalNode THEN(int i) {
			return getToken(PlPgSqlParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(PlPgSqlParser.ELSE, 0); }
		public SearchExprContext searchExpr() {
			return getRuleContext(SearchExprContext.class,0);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public TerminalNode CASE(int i) {
			return getToken(PlPgSqlParser.CASE, i);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public List<TerminalNode> CASE() { return getTokens(PlPgSqlParser.CASE); }
		public List<WhenExpressionsContext> whenExpressions() {
			return getRuleContexts(WhenExpressionsContext.class);
		}
		public List<TerminalNode> WHEN() { return getTokens(PlPgSqlParser.WHEN); }
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232); match(CASE);
			setState(1234);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_BRACKET) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << CASE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WITH - 66)) | (1L << (SELECT - 66)) | (1L << (CAST - 66)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (TRUE - 151)) | (1L << (FALSE - 151)) | (1L << (INTEGER_VALUE - 151)) | (1L << (DECIMAL_VALUE - 151)) | (1L << (ANONYMOUS_PARAMETER - 151)) | (1L << (ID - 151)) | (1L << (QNAME - 151)) | (1L << (ARRAY_TYPE - 151)) | (1L << (COPY_TYPE - 151)) | (1L << (ROW_TYPE - 151)) | (1L << (STRING - 151)))) != 0)) {
				{
				setState(1233); searchExpr();
				}
			}

			setState(1241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1236); match(WHEN);
				setState(1237); whenExpressions();
				setState(1238); match(THEN);
				setState(1239); stmts();
				}
				}
				setState(1243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1247);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1245); match(ELSE);
				setState(1246); stmts();
				}
			}

			setState(1249); match(END);
			setState(1250); match(CASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenExpressionsContext extends ParserRuleContext {
		public List<WhenExprContext> whenExpr() {
			return getRuleContexts(WhenExprContext.class);
		}
		public WhenExprContext whenExpr(int i) {
			return getRuleContext(WhenExprContext.class,i);
		}
		public WhenExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWhenExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWhenExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWhenExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExpressionsContext whenExpressions() throws RecognitionException {
		WhenExpressionsContext _localctx = new WhenExpressionsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_whenExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252); whenExpr();
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1253); match(4);
				setState(1254); whenExpr();
				}
				}
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterSearchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitSearchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitSearchExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchExprContext searchExpr() throws RecognitionException {
		SearchExprContext _localctx = new SearchExprContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_searchExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhenExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWhenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWhenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWhenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExprContext whenExpr() throws RecognitionException {
		WhenExprContext _localctx = new WhenExprContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_whenExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStmtContext extends ParserRuleContext {
		public Token firstLabel;
		public Token lastLabel;
		public TerminalNode LOOP(int i) {
			return getToken(PlPgSqlParser.LOOP, i);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlPgSqlParser.LOOP); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1267);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1264); match(1);
				setState(1265); ((LoopStmtContext)_localctx).firstLabel = match(ID);
				setState(1266); match(8);
				}
			}

			setState(1269); match(LOOP);
			setState(1270); stmts();
			setState(1271); match(END);
			setState(1272); match(LOOP);
			setState(1274);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1273); ((LoopStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1276); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStmtContext extends ParserRuleContext {
		public Token targetLabel;
		public ExitWhenClauseContext exitWhenClause() {
			return getRuleContext(ExitWhenClauseContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode EXIT() { return getToken(PlPgSqlParser.EXIT, 0); }
		public ExitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStmtContext exitStmt() throws RecognitionException {
		ExitStmtContext _localctx = new ExitStmtContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278); match(EXIT);
			setState(1280);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1279); ((ExitStmtContext)_localctx).targetLabel = match(ID);
				}
			}

			setState(1283);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1282); exitWhenClause();
				}
			}

			setState(1285); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitWhenClauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(PlPgSqlParser.WHEN, 0); }
		public ExitWhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitWhenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterExitWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitExitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitExitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitWhenClauseContext exitWhenClause() throws RecognitionException {
		ExitWhenClauseContext _localctx = new ExitWhenClauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_exitWhenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287); match(WHEN);
			setState(1288); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStmtContext extends ParserRuleContext {
		public Token targetLabel;
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode CONTINUE() { return getToken(PlPgSqlParser.CONTINUE, 0); }
		public ContinueWhenClauseContext continueWhenClause() {
			return getRuleContext(ContinueWhenClauseContext.class,0);
		}
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290); match(CONTINUE);
			setState(1292);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1291); ((ContinueStmtContext)_localctx).targetLabel = match(ID);
				}
			}

			setState(1295);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1294); continueWhenClause();
				}
			}

			setState(1297); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueWhenClauseContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode WHEN() { return getToken(PlPgSqlParser.WHEN, 0); }
		public ContinueWhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueWhenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterContinueWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitContinueWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitContinueWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueWhenClauseContext continueWhenClause() throws RecognitionException {
		ContinueWhenClauseContext _localctx = new ContinueWhenClauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_continueWhenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); match(WHEN);
			setState(1300); condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmtContext extends ParserRuleContext {
		public Token firstLabel;
		public Token lastLabel;
		public TerminalNode WHILE() { return getToken(PlPgSqlParser.WHILE, 0); }
		public TerminalNode LOOP(int i) {
			return getToken(PlPgSqlParser.LOOP, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlPgSqlParser.LOOP); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1302); match(1);
				setState(1303); ((WhileStmtContext)_localctx).firstLabel = match(ID);
				setState(1304); match(8);
				}
			}

			setState(1307); match(WHILE);
			setState(1308); condition();
			setState(1309); match(LOOP);
			setState(1310); stmts();
			setState(1311); match(END);
			setState(1312); match(LOOP);
			setState(1314);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1313); ((WhileStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1316); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInIntStmtContext extends ParserRuleContext {
		public Token firstLabel;
		public Token reverseKeyword;
		public Token lastLabel;
		public TerminalNode LOOP(int i) {
			return getToken(PlPgSqlParser.LOOP, i);
		}
		public ForInIntFromExpressionContext forInIntFromExpression() {
			return getRuleContext(ForInIntFromExpressionContext.class,0);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public List<TerminalNode> LOOP() { return getTokens(PlPgSqlParser.LOOP); }
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public TerminalNode FOR() { return getToken(PlPgSqlParser.FOR, 0); }
		public ForInIntByExpressionContext forInIntByExpression() {
			return getRuleContext(ForInIntByExpressionContext.class,0);
		}
		public TerminalNode REVERSE() { return getToken(PlPgSqlParser.REVERSE, 0); }
		public TerminalNode BY() { return getToken(PlPgSqlParser.BY, 0); }
		public ForInIntToExpressionContext forInIntToExpression() {
			return getRuleContext(ForInIntToExpressionContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public ForInIntStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInIntStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForInIntStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForInIntStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForInIntStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInIntStmtContext forInIntStmt() throws RecognitionException {
		ForInIntStmtContext _localctx = new ForInIntStmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_forInIntStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1318); match(1);
				setState(1319); ((ForInIntStmtContext)_localctx).firstLabel = match(ID);
				setState(1320); match(8);
				}
			}

			setState(1323); match(FOR);
			setState(1324); varExpr();
			setState(1325); match(IN);
			setState(1327);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(1326); ((ForInIntStmtContext)_localctx).reverseKeyword = match(REVERSE);
				}
			}

			setState(1329); forInIntFromExpression();
			setState(1330); match(9);
			setState(1331); forInIntToExpression();
			setState(1334);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1332); match(BY);
				setState(1333); forInIntByExpression();
				}
			}

			setState(1336); match(LOOP);
			setState(1337); stmts();
			setState(1338); match(END);
			setState(1339); match(LOOP);
			setState(1341);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1340); ((ForInIntStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1343); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInIntByExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInIntByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInIntByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForInIntByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForInIntByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForInIntByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInIntByExpressionContext forInIntByExpression() throws RecognitionException {
		ForInIntByExpressionContext _localctx = new ForInIntByExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_forInIntByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInIntFromExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInIntFromExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInIntFromExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForInIntFromExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForInIntFromExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForInIntFromExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInIntFromExpressionContext forInIntFromExpression() throws RecognitionException {
		ForInIntFromExpressionContext _localctx = new ForInIntFromExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_forInIntFromExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInIntToExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInIntToExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInIntToExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForInIntToExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForInIntToExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForInIntToExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInIntToExpressionContext forInIntToExpression() throws RecognitionException {
		ForInIntToExpressionContext _localctx = new ForInIntToExpressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_forInIntToExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInQueryStmtContext extends ParserRuleContext {
		public Token firstLabel;
		public Token lastLabel;
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public TerminalNode LOOP(int i) {
			return getToken(PlPgSqlParser.LOOP, i);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(PlPgSqlParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public ForInQueryContext forInQuery() {
			return getRuleContext(ForInQueryContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlPgSqlParser.LOOP); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public ForInQueryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInQueryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForInQueryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForInQueryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForInQueryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInQueryStmtContext forInQueryStmt() throws RecognitionException {
		ForInQueryStmtContext _localctx = new ForInQueryStmtContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_forInQueryStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1351); match(1);
				setState(1352); ((ForInQueryStmtContext)_localctx).firstLabel = match(ID);
				setState(1353); match(8);
				}
			}

			setState(1356); match(FOR);
			setState(1357); varExpr();
			setState(1358); match(IN);
			setState(1359); forInQuery();
			setState(1360); match(LOOP);
			setState(1361); stmts();
			setState(1362); match(END);
			setState(1363); match(LOOP);
			setState(1365);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1364); ((ForInQueryStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1367); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInQueryContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(PlPgSqlParser.R_BRACKET, 0); }
		public ForInQueryContext forInQuery() {
			return getRuleContext(ForInQueryContext.class,0);
		}
		public TerminalNode L_BRACKET() { return getToken(PlPgSqlParser.L_BRACKET, 0); }
		public ForInQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForInQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForInQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForInQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInQueryContext forInQuery() throws RecognitionException {
		ForInQueryContext _localctx = new ForInQueryContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_forInQuery);
		try {
			setState(1374);
			switch (_input.LA(1)) {
			case L_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369); match(L_BRACKET);
				setState(1370); forInQuery();
				setState(1371); match(R_BRACKET);
				}
				break;
			case WITH:
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1373); select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInExecuteStmtContext extends ParserRuleContext {
		public Token firstLabel;
		public Token lastLabel;
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public TerminalNode LOOP(int i) {
			return getToken(PlPgSqlParser.LOOP, i);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public TerminalNode FOR() { return getToken(PlPgSqlParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlPgSqlParser.LOOP); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public ForInExecuteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInExecuteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForInExecuteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForInExecuteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForInExecuteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInExecuteStmtContext forInExecuteStmt() throws RecognitionException {
		ForInExecuteStmtContext _localctx = new ForInExecuteStmtContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_forInExecuteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1376); match(1);
				setState(1377); ((ForInExecuteStmtContext)_localctx).firstLabel = match(ID);
				setState(1378); match(8);
				}
			}

			setState(1381); match(FOR);
			setState(1382); varExpr();
			setState(1383); match(IN);
			setState(1384); execute();
			setState(1385); match(LOOP);
			setState(1386); stmts();
			setState(1387); match(END);
			setState(1388); match(LOOP);
			setState(1390);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1389); ((ForInExecuteStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1392); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachStmtContext extends ParserRuleContext {
		public Token firstLabel;
		public Token sliceValue;
		public Token lastLabel;
		public TerminalNode LOOP(int i) {
			return getToken(PlPgSqlParser.LOOP, i);
		}
		public VarExprContext varExpr() {
			return getRuleContext(VarExprContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PlPgSqlParser.ID); }
		public ForEachArrayExpressionContext forEachArrayExpression() {
			return getRuleContext(ForEachArrayExpressionContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlPgSqlParser.LOOP); }
		public TerminalNode SLICE() { return getToken(PlPgSqlParser.SLICE, 0); }
		public TerminalNode FOREACH() { return getToken(PlPgSqlParser.FOREACH, 0); }
		public TerminalNode IN() { return getToken(PlPgSqlParser.IN, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(PlPgSqlParser.INTEGER_VALUE, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(PlPgSqlParser.ARRAY, 0); }
		public TerminalNode END() { return getToken(PlPgSqlParser.END, 0); }
		public TerminalNode ID(int i) {
			return getToken(PlPgSqlParser.ID, i);
		}
		public ForEachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForEachStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForEachStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForEachStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachStmtContext forEachStmt() throws RecognitionException {
		ForEachStmtContext _localctx = new ForEachStmtContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_forEachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1394); match(1);
				setState(1395); ((ForEachStmtContext)_localctx).firstLabel = match(ID);
				setState(1396); match(8);
				}
			}

			setState(1399); match(FOREACH);
			setState(1400); varExpr();
			setState(1403);
			_la = _input.LA(1);
			if (_la==SLICE) {
				{
				setState(1401); match(SLICE);
				setState(1402); ((ForEachStmtContext)_localctx).sliceValue = match(INTEGER_VALUE);
				}
			}

			setState(1405); match(IN);
			setState(1406); match(ARRAY);
			setState(1407); forEachArrayExpression();
			setState(1408); match(LOOP);
			setState(1409); stmts();
			setState(1410); match(END);
			setState(1411); match(LOOP);
			setState(1413);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1412); ((ForEachStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1415); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachArrayExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForEachArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterForEachArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitForEachArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitForEachArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachArrayExpressionContext forEachArrayExpression() throws RecognitionException {
		ForEachArrayExpressionContext _localctx = new ForEachArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_forEachArrayExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetDiagnosticsStmtContext extends ParserRuleContext {
		public TerminalNode DIAGNOSTICS() { return getToken(PlPgSqlParser.DIAGNOSTICS, 0); }
		public TerminalNode GET() { return getToken(PlPgSqlParser.GET, 0); }
		public List<AssignExprContext> assignExpr() {
			return getRuleContexts(AssignExprContext.class);
		}
		public AssignExprContext assignExpr(int i) {
			return getRuleContext(AssignExprContext.class,i);
		}
		public GetDiagnosticsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getDiagnosticsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterGetDiagnosticsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitGetDiagnosticsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitGetDiagnosticsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetDiagnosticsStmtContext getDiagnosticsStmt() throws RecognitionException {
		GetDiagnosticsStmtContext _localctx = new GetDiagnosticsStmtContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_getDiagnosticsStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419); match(GET);
			setState(1420); match(DIAGNOSTICS);
			setState(1421); assignExpr();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1422); match(4);
				setState(1423); assignExpr();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RaiseStmtContext extends ParserRuleContext {
		public RaiseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseStmt; }
	 
		public RaiseStmtContext() { }
		public void copyFrom(RaiseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RaiseStmtWithOptionsOnlyContext extends RaiseStmtContext {
		public Token level;
		public TerminalNode PANIC() { return getToken(PlPgSqlParser.PANIC, 0); }
		public TerminalNode LOG() { return getToken(PlPgSqlParser.LOG, 0); }
		public TerminalNode FATAL() { return getToken(PlPgSqlParser.FATAL, 0); }
		public TerminalNode WARNING() { return getToken(PlPgSqlParser.WARNING, 0); }
		public RaiseUsingClauseContext raiseUsingClause() {
			return getRuleContext(RaiseUsingClauseContext.class,0);
		}
		public TerminalNode NOTICE() { return getToken(PlPgSqlParser.NOTICE, 0); }
		public TerminalNode DEBUG4() { return getToken(PlPgSqlParser.DEBUG4, 0); }
		public TerminalNode DEBUG5() { return getToken(PlPgSqlParser.DEBUG5, 0); }
		public TerminalNode DEBUG3() { return getToken(PlPgSqlParser.DEBUG3, 0); }
		public TerminalNode INFO() { return getToken(PlPgSqlParser.INFO, 0); }
		public TerminalNode DEBUG2() { return getToken(PlPgSqlParser.DEBUG2, 0); }
		public TerminalNode DEBUG1() { return getToken(PlPgSqlParser.DEBUG1, 0); }
		public TerminalNode ERROR() { return getToken(PlPgSqlParser.ERROR, 0); }
		public TerminalNode RAISE() { return getToken(PlPgSqlParser.RAISE, 0); }
		public RaiseStmtWithOptionsOnlyContext(RaiseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRaiseStmtWithOptionsOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRaiseStmtWithOptionsOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRaiseStmtWithOptionsOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RaiseStmtEmptyContext extends RaiseStmtContext {
		public TerminalNode RAISE() { return getToken(PlPgSqlParser.RAISE, 0); }
		public RaiseStmtEmptyContext(RaiseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRaiseStmtEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRaiseStmtEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRaiseStmtEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RaiseStmtWithSqlStateContext extends RaiseStmtContext {
		public Token level;
		public Token sqlState;
		public TerminalNode PANIC() { return getToken(PlPgSqlParser.PANIC, 0); }
		public TerminalNode LOG() { return getToken(PlPgSqlParser.LOG, 0); }
		public TerminalNode FATAL() { return getToken(PlPgSqlParser.FATAL, 0); }
		public TerminalNode WARNING() { return getToken(PlPgSqlParser.WARNING, 0); }
		public RaiseUsingClauseContext raiseUsingClause() {
			return getRuleContext(RaiseUsingClauseContext.class,0);
		}
		public TerminalNode NOTICE() { return getToken(PlPgSqlParser.NOTICE, 0); }
		public TerminalNode DEBUG4() { return getToken(PlPgSqlParser.DEBUG4, 0); }
		public TerminalNode DEBUG5() { return getToken(PlPgSqlParser.DEBUG5, 0); }
		public TerminalNode DEBUG3() { return getToken(PlPgSqlParser.DEBUG3, 0); }
		public TerminalNode INFO() { return getToken(PlPgSqlParser.INFO, 0); }
		public TerminalNode DEBUG2() { return getToken(PlPgSqlParser.DEBUG2, 0); }
		public TerminalNode DEBUG1() { return getToken(PlPgSqlParser.DEBUG1, 0); }
		public TerminalNode ERROR() { return getToken(PlPgSqlParser.ERROR, 0); }
		public TerminalNode SQLSTATE() { return getToken(PlPgSqlParser.SQLSTATE, 0); }
		public TerminalNode RAISE() { return getToken(PlPgSqlParser.RAISE, 0); }
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public RaiseStmtWithSqlStateContext(RaiseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRaiseStmtWithSqlState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRaiseStmtWithSqlState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRaiseStmtWithSqlState(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RaiseStmtWithFormattedMsgContext extends RaiseStmtContext {
		public Token level;
		public Token format;
		public TerminalNode PANIC() { return getToken(PlPgSqlParser.PANIC, 0); }
		public TerminalNode LOG() { return getToken(PlPgSqlParser.LOG, 0); }
		public TerminalNode FATAL() { return getToken(PlPgSqlParser.FATAL, 0); }
		public TerminalNode WARNING() { return getToken(PlPgSqlParser.WARNING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RaiseUsingClauseContext raiseUsingClause() {
			return getRuleContext(RaiseUsingClauseContext.class,0);
		}
		public TerminalNode NOTICE() { return getToken(PlPgSqlParser.NOTICE, 0); }
		public TerminalNode DEBUG4() { return getToken(PlPgSqlParser.DEBUG4, 0); }
		public TerminalNode DEBUG5() { return getToken(PlPgSqlParser.DEBUG5, 0); }
		public TerminalNode DEBUG3() { return getToken(PlPgSqlParser.DEBUG3, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INFO() { return getToken(PlPgSqlParser.INFO, 0); }
		public TerminalNode DEBUG2() { return getToken(PlPgSqlParser.DEBUG2, 0); }
		public TerminalNode DEBUG1() { return getToken(PlPgSqlParser.DEBUG1, 0); }
		public TerminalNode ERROR() { return getToken(PlPgSqlParser.ERROR, 0); }
		public TerminalNode RAISE() { return getToken(PlPgSqlParser.RAISE, 0); }
		public TerminalNode STRING() { return getToken(PlPgSqlParser.STRING, 0); }
		public RaiseStmtWithFormattedMsgContext(RaiseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRaiseStmtWithFormattedMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRaiseStmtWithFormattedMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRaiseStmtWithFormattedMsg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RaiseStmtWithConditionNameContext extends RaiseStmtContext {
		public Token level;
		public Token conditionName;
		public TerminalNode PANIC() { return getToken(PlPgSqlParser.PANIC, 0); }
		public TerminalNode LOG() { return getToken(PlPgSqlParser.LOG, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode FATAL() { return getToken(PlPgSqlParser.FATAL, 0); }
		public TerminalNode WARNING() { return getToken(PlPgSqlParser.WARNING, 0); }
		public RaiseUsingClauseContext raiseUsingClause() {
			return getRuleContext(RaiseUsingClauseContext.class,0);
		}
		public TerminalNode NOTICE() { return getToken(PlPgSqlParser.NOTICE, 0); }
		public TerminalNode DEBUG4() { return getToken(PlPgSqlParser.DEBUG4, 0); }
		public TerminalNode DEBUG5() { return getToken(PlPgSqlParser.DEBUG5, 0); }
		public TerminalNode DEBUG3() { return getToken(PlPgSqlParser.DEBUG3, 0); }
		public TerminalNode INFO() { return getToken(PlPgSqlParser.INFO, 0); }
		public TerminalNode DEBUG2() { return getToken(PlPgSqlParser.DEBUG2, 0); }
		public TerminalNode DEBUG1() { return getToken(PlPgSqlParser.DEBUG1, 0); }
		public TerminalNode ERROR() { return getToken(PlPgSqlParser.ERROR, 0); }
		public TerminalNode RAISE() { return getToken(PlPgSqlParser.RAISE, 0); }
		public RaiseStmtWithConditionNameContext(RaiseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRaiseStmtWithConditionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRaiseStmtWithConditionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRaiseStmtWithConditionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseStmtContext raiseStmt() throws RecognitionException {
		RaiseStmtContext _localctx = new RaiseStmtContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_raiseStmt);
		int _la;
		try {
			setState(1476);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				_localctx = new RaiseStmtEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1431); match(RAISE);
				setState(1432); match(7);
				}
				break;

			case 2:
				_localctx = new RaiseStmtWithFormattedMsgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1433); match(RAISE);
				setState(1435);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) {
					{
					setState(1434);
					((RaiseStmtWithFormattedMsgContext)_localctx).level = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) ) {
						((RaiseStmtWithFormattedMsgContext)_localctx).level = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1437); ((RaiseStmtWithFormattedMsgContext)_localctx).format = match(STRING);
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(1438); match(4);
					setState(1439); expression(0);
					}
					}
					setState(1444);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1446);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1445); raiseUsingClause();
					}
				}

				setState(1448); match(7);
				}
				break;

			case 3:
				_localctx = new RaiseStmtWithConditionNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1449); match(RAISE);
				setState(1451);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) {
					{
					setState(1450);
					((RaiseStmtWithConditionNameContext)_localctx).level = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) ) {
						((RaiseStmtWithConditionNameContext)_localctx).level = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1453); ((RaiseStmtWithConditionNameContext)_localctx).conditionName = match(ID);
				setState(1455);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1454); raiseUsingClause();
					}
				}

				setState(1457); match(7);
				}
				break;

			case 4:
				_localctx = new RaiseStmtWithSqlStateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1458); match(RAISE);
				setState(1460);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) {
					{
					setState(1459);
					((RaiseStmtWithSqlStateContext)_localctx).level = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) ) {
						((RaiseStmtWithSqlStateContext)_localctx).level = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1462); match(SQLSTATE);
				setState(1463); ((RaiseStmtWithSqlStateContext)_localctx).sqlState = match(STRING);
				setState(1465);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1464); raiseUsingClause();
					}
				}

				setState(1467); match(7);
				}
				break;

			case 5:
				_localctx = new RaiseStmtWithOptionsOnlyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1468); match(RAISE);
				setState(1470);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) {
					{
					setState(1469);
					((RaiseStmtWithOptionsOnlyContext)_localctx).level = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEBUG1) | (1L << DEBUG2) | (1L << DEBUG3) | (1L << DEBUG4) | (1L << DEBUG5) | (1L << INFO) | (1L << NOTICE) | (1L << WARNING) | (1L << ERROR) | (1L << LOG) | (1L << FATAL) | (1L << PANIC))) != 0)) ) {
						((RaiseStmtWithOptionsOnlyContext)_localctx).level = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1473);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1472); raiseUsingClause();
					}
				}

				setState(1475); match(7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RaiseUsingClauseContext extends ParserRuleContext {
		public RaiseOptionAssignContext raiseOptionAssign(int i) {
			return getRuleContext(RaiseOptionAssignContext.class,i);
		}
		public TerminalNode USING() { return getToken(PlPgSqlParser.USING, 0); }
		public List<RaiseOptionAssignContext> raiseOptionAssign() {
			return getRuleContexts(RaiseOptionAssignContext.class);
		}
		public RaiseUsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseUsingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRaiseUsingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRaiseUsingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRaiseUsingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseUsingClauseContext raiseUsingClause() throws RecognitionException {
		RaiseUsingClauseContext _localctx = new RaiseUsingClauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_raiseUsingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478); match(USING);
			setState(1479); raiseOptionAssign();
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1480); match(4);
				setState(1481); raiseOptionAssign();
				}
				}
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RaiseOptionAssignContext extends ParserRuleContext {
		public Token option;
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RaiseOptionAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseOptionAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterRaiseOptionAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitRaiseOptionAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitRaiseOptionAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseOptionAssignContext raiseOptionAssign() throws RecognitionException {
		RaiseOptionAssignContext _localctx = new RaiseOptionAssignContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_raiseOptionAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487); ((RaiseOptionAssignContext)_localctx).option = match(ID);
			setState(1488); match(EQ);
			setState(1489); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_stmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1491); stmt();
					}
					} 
				}
				setState(1496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public GetDiagnosticsStmtContext getDiagnosticsStmt() {
			return getRuleContext(GetDiagnosticsStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public ExecuteStmtContext executeStmt() {
			return getRuleContext(ExecuteStmtContext.class,0);
		}
		public RaiseStmtContext raiseStmt() {
			return getRuleContext(RaiseStmtContext.class,0);
		}
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ExitStmtContext exitStmt() {
			return getRuleContext(ExitStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForInExecuteStmtContext forInExecuteStmt() {
			return getRuleContext(ForInExecuteStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public ForEachStmtContext forEachStmt() {
			return getRuleContext(ForEachStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public PerformStmtContext performStmt() {
			return getRuleContext(PerformStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public ForInIntStmtContext forInIntStmt() {
			return getRuleContext(ForInIntStmtContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ForInQueryStmtContext forInQueryStmt() {
			return getRuleContext(ForInQueryStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_stmt);
		try {
			setState(1518);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497); selectStmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498); insertStmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1499); updateStmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1500); deleteStmt();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1501); blockStmt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1502); assignStmt();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1503); performStmt();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1504); executeStmt();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1505); returnStmt();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1506); ifStmt();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1507); caseStmt();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1508); loopStmt();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1509); exitStmt();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1510); continueStmt();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1511); whileStmt();
				}
				break;

			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1512); forInIntStmt();
				}
				break;

			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1513); forInQueryStmt();
				}
				break;

			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1514); forInExecuteStmt();
				}
				break;

			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1515); forEachStmt();
				}
				break;

			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1516); getDiagnosticsStmt();
				}
				break;

			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1517); raiseStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 24 >= _localctx._p;

		case 1: return 23 >= _localctx._p;

		case 2: return 22 >= _localctx._p;

		case 3: return 21 >= _localctx._p;

		case 4: return 20 >= _localctx._p;

		case 5: return 19 >= _localctx._p;

		case 6: return 14 >= _localctx._p;

		case 7: return 13 >= _localctx._p;

		case 8: return 12 >= _localctx._p;

		case 9: return 11 >= _localctx._p;

		case 10: return 10 >= _localctx._p;

		case 11: return 9 >= _localctx._p;

		case 12: return 6 >= _localctx._p;

		case 13: return 5 >= _localctx._p;

		case 14: return 4 >= _localctx._p;

		case 15: return 1 >= _localctx._p;

		case 17: return 18 >= _localctx._p;

		case 16: return 29 >= _localctx._p;

		case 19: return 7 >= _localctx._p;

		case 18: return 17 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u00ac\u05f3\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3\u0119\n\3\f\3\16\3\u011c\13\3\3\3\3\3\5\3\u0120\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0129\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u0136\n\5\3\6\3\6\3\6\5\6\u013b\n\6\3\7\3\7\3\7\5\7\u0140"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0153\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u018d\n\b\r\b\16\b\u018e\3\b\3\b\5"+
		"\b\u0193\n\b\3\b\3\b\3\b\3\b\5\b\u0199\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"\u01a1\n\b\f\b\16\b\u01a4\13\b\3\t\3\t\3\n\6\n\u01a9\n\n\r\n\16\n\u01aa"+
		"\3\13\3\13\3\13\5\13\u01b0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u01bc\n\13\3\13\3\13\3\f\3\f\3\f\7\f\u01c3\n\f\f\f\16"+
		"\f\u01c6\13\f\5\f\u01c8\n\f\3\r\5\r\u01cb\n\r\3\r\3\r\3\r\3\r\5\r\u01d1"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\6\16\u01d8\n\16\r\16\16\16\u01d9\5\16\u01dc"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01e6\n\17\3\20\3\20"+
		"\7\20\u01ea\n\20\f\20\16\20\u01ed\13\20\3\20\3\20\3\20\3\20\5\20\u01f3"+
		"\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u01fd\n\21\f\21\16"+
		"\21\u0200\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u0207\n\22\f\22\16\22\u020a"+
		"\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\7\33\u0225"+
		"\n\33\f\33\16\33\u0228\13\33\3\34\3\34\5\34\u022c\n\34\3\34\3\34\3\34"+
		"\5\34\u0231\n\34\3\34\3\34\5\34\u0235\n\34\3\34\3\34\5\34\u0239\n\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \5 \u024d\n \3!\3!\3!\7!\u0252\n!\f!\16!\u0255\13!\3!\5!\u0258"+
		"\n!\3\"\3\"\3\"\5\"\u025d\n\"\3#\3#\3$\3$\5$\u0263\n$\3$\3$\3%\3%\3%\7"+
		"%\u026a\n%\f%\16%\u026d\13%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\7)"+
		"\u027b\n)\f)\16)\u027e\13)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\5,\u028a\n,\3"+
		",\3,\3,\5,\u028f\n,\3,\3,\7,\u0293\n,\f,\16,\u0296\13,\3,\5,\u0299\n,"+
		"\3,\5,\u029c\n,\3,\5,\u029f\n,\3,\5,\u02a2\n,\3,\5,\u02a5\n,\3,\5,\u02a8"+
		"\n,\3,\5,\u02ab\n,\3,\5,\u02ae\n,\3,\5,\u02b1\n,\5,\u02b3\n,\3-\3-\5-"+
		"\u02b7\n-\3-\3-\5-\u02bb\n-\3.\3.\3.\3.\3.\7.\u02c2\n.\f.\16.\u02c5\13"+
		".\3/\3/\3/\7/\u02ca\n/\f/\16/\u02cd\13/\3\60\3\60\3\61\3\61\5\61\u02d3"+
		"\n\61\3\61\3\61\3\61\7\61\u02d8\n\61\f\61\16\61\u02db\13\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\5\63\u02e3\n\63\3\64\3\64\3\64\3\64\7\64\u02e9\n"+
		"\64\f\64\16\64\u02ec\13\64\3\65\3\65\5\65\u02f0\n\65\3\65\5\65\u02f3\n"+
		"\65\3\65\3\65\3\65\5\65\u02f8\n\65\5\65\u02fa\n\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\38\38\78\u0306\n8\f8\168\u0309\138\39\59\u030c\n9\39"+
		"\39\3:\5:\u0311\n:\3:\3:\5:\u0315\n:\3:\5:\u0318\n:\3:\3:\5:\u031c\n:"+
		"\3:\3:\3:\3:\5:\u0322\n:\3:\3:\5:\u0326\n:\5:\u0328\n:\3;\5;\u032b\n;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0357\n;"+
		"\3<\3<\3<\3<\7<\u035d\n<\f<\16<\u0360\13<\3<\3<\3=\3=\3>\3>\3>\3?\3?\3"+
		"?\3@\3@\3@\3A\3A\3A\3A\3B\3B\5B\u0375\nB\3B\5B\u0378\nB\3B\5B\u037b\n"+
		"B\3B\3B\3C\3C\3C\5C\u0382\nC\3C\5C\u0385\nC\3D\3D\3D\3D\7D\u038b\nD\f"+
		"D\16D\u038e\13D\3E\3E\3F\3F\3F\3F\7F\u0396\nF\fF\16F\u0399\13F\3F\5F\u039c"+
		"\nF\3F\5F\u039f\nF\3F\5F\u03a2\nF\3F\5F\u03a5\nF\3F\5F\u03a8\nF\3F\5F"+
		"\u03ab\nF\3F\5F\u03ae\nF\3F\5F\u03b1\nF\3F\5F\u03b4\nF\5F\u03b6\nF\3F"+
		"\3F\3G\3G\3G\3H\3H\3H\5H\u03c0\nH\3H\5H\u03c3\nH\3I\3I\5I\u03c7\nI\3J"+
		"\3J\5J\u03cb\nJ\3J\3J\3K\3K\3K\7K\u03d2\nK\fK\16K\u03d5\13K\3L\3L\3M\3"+
		"M\3M\3M\7M\u03dd\nM\fM\16M\u03e0\13M\3N\3N\3O\3O\3O\3P\5P\u03e8\nP\3P"+
		"\3P\3P\3P\5P\u03ee\nP\3P\3P\5P\u03f2\nP\3P\5P\u03f5\nP\3Q\3Q\3Q\3Q\7Q"+
		"\u03fb\nQ\fQ\16Q\u03fe\13Q\3Q\3Q\3R\3R\3S\3S\5S\u0406\nS\3T\3T\3T\3U\3"+
		"U\3U\3U\7U\u040f\nU\fU\16U\u0412\13U\3V\3V\3V\3V\7V\u0418\nV\fV\16V\u041b"+
		"\13V\3V\3V\3W\3W\3W\5W\u0422\nW\3X\3X\3X\3Y\5Y\u0428\nY\3Y\3Y\5Y\u042c"+
		"\nY\3Y\3Y\5Y\u0430\nY\3Y\3Y\5Y\u0434\nY\3Y\3Y\3Y\5Y\u0439\nY\3Y\5Y\u043c"+
		"\nY\3Y\5Y\u043f\nY\3Y\5Y\u0442\nY\3Z\3Z\3Z\7Z\u0447\nZ\fZ\16Z\u044a\13"+
		"Z\3[\3[\3[\3[\3\\\3\\\3\\\7\\\u0453\n\\\f\\\16\\\u0456\13\\\3]\3]\3]\3"+
		"]\3]\3]\3]\3]\3^\3^\3^\7^\u0463\n^\f^\16^\u0466\13^\3_\3_\3`\3`\3`\7`"+
		"\u046d\n`\f`\16`\u0470\13`\3a\3a\3a\5a\u0475\na\3b\3b\3b\3c\5c\u047b\n"+
		"c\3c\3c\3c\5c\u0480\nc\3c\3c\5c\u0484\nc\3c\3c\5c\u0488\nc\3c\5c\u048b"+
		"\nc\3c\5c\u048e\nc\3c\5c\u0491\nc\3d\3d\3d\3d\7d\u0497\nd\fd\16d\u049a"+
		"\13d\3e\3e\3f\3f\3f\3f\5f\u04a2\nf\3f\3f\3g\3g\5g\u04a8\ng\3h\3h\3h\3"+
		"h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\7k\u04bf\nk\fk\16"+
		"k\u04c2\13k\3k\3k\5k\u04c6\nk\3k\3k\3k\3k\3l\3l\3m\3m\3n\3n\3n\3o\3o\5"+
		"o\u04d5\no\3o\3o\3o\3o\3o\6o\u04dc\no\ro\16o\u04dd\3o\3o\5o\u04e2\no\3"+
		"o\3o\3o\3p\3p\3p\7p\u04ea\np\fp\16p\u04ed\13p\3q\3q\3r\3r\3s\3s\3s\5s"+
		"\u04f6\ns\3s\3s\3s\3s\3s\5s\u04fd\ns\3s\3s\3t\3t\5t\u0503\nt\3t\5t\u0506"+
		"\nt\3t\3t\3u\3u\3u\3v\3v\5v\u050f\nv\3v\5v\u0512\nv\3v\3v\3w\3w\3w\3x"+
		"\3x\3x\5x\u051c\nx\3x\3x\3x\3x\3x\3x\3x\5x\u0525\nx\3x\3x\3y\3y\3y\5y"+
		"\u052c\ny\3y\3y\3y\3y\5y\u0532\ny\3y\3y\3y\3y\3y\5y\u0539\ny\3y\3y\3y"+
		"\3y\3y\5y\u0540\ny\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3}\5}\u054d\n}\3}\3}"+
		"\3}\3}\3}\3}\3}\3}\3}\5}\u0558\n}\3}\3}\3~\3~\3~\3~\3~\5~\u0561\n~\3\177"+
		"\3\177\3\177\5\177\u0566\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\5\177\u0571\n\177\3\177\3\177\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0578\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u057e\n\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0588\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\7\u0082\u0593\n\u0082\f\u0082\16\u0082\u0596\13\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u059e\n\u0083"+
		"\3\u0083\3\u0083\3\u0083\7\u0083\u05a3\n\u0083\f\u0083\16\u0083\u05a6"+
		"\13\u0083\3\u0083\5\u0083\u05a9\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083"+
		"\u05ae\n\u0083\3\u0083\3\u0083\5\u0083\u05b2\n\u0083\3\u0083\3\u0083\3"+
		"\u0083\5\u0083\u05b7\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u05bc\n\u0083"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u05c1\n\u0083\3\u0083\5\u0083\u05c4\n"+
		"\u0083\3\u0083\5\u0083\u05c7\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\7"+
		"\u0084\u05cd\n\u0084\f\u0084\16\u0084\u05d0\13\u0084\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0086\7\u0086\u05d7\n\u0086\f\u0086\16\u0086\u05da\13"+
		"\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u05f1\n\u0087\3\u0087\2\u0088"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\2\30\3\2\u00a2\u00a4\3\2\u00a0\u00a1\3\2\u00a3"+
		"\u00a7\3\2\u0099\u009a\3\2y|\3\2\u00a3\u00a5\5\2\37\37**\u0082\u0082\3"+
		"\2\u008c\u008e\4\2hh\u008f\u0090\3\2\u0093\u0094\4\2\37\37**\3\2\u00a3"+
		"\u00a4\4\2TT\u00a0\u00a0\3\2_`\3\2lm\3\2,/\4\2pprr\3\2ik\3\2TU\3\2pq\3"+
		"\2cd\3\2\16\31\u0655\2\u010e\3\2\2\2\4\u011f\3\2\2\2\6\u0128\3\2\2\2\b"+
		"\u0135\3\2\2\2\n\u013a\3\2\2\2\f\u013f\3\2\2\2\16\u0152\3\2\2\2\20\u01a5"+
		"\3\2\2\2\22\u01a8\3\2\2\2\24\u01ac\3\2\2\2\26\u01c7\3\2\2\2\30\u01ca\3"+
		"\2\2\2\32\u01db\3\2\2\2\34\u01e5\3\2\2\2\36\u01eb\3\2\2\2 \u01fe\3\2\2"+
		"\2\"\u0203\3\2\2\2$\u020b\3\2\2\2&\u020d\3\2\2\2(\u0214\3\2\2\2*\u0216"+
		"\3\2\2\2,\u0218\3\2\2\2.\u021a\3\2\2\2\60\u021c\3\2\2\2\62\u021f\3\2\2"+
		"\2\64\u0226\3\2\2\2\66\u0229\3\2\2\28\u023c\3\2\2\2:\u0242\3\2\2\2<\u0245"+
		"\3\2\2\2>\u0249\3\2\2\2@\u024e\3\2\2\2B\u0259\3\2\2\2D\u025e\3\2\2\2F"+
		"\u0260\3\2\2\2H\u0266\3\2\2\2J\u026e\3\2\2\2L\u0270\3\2\2\2N\u0273\3\2"+
		"\2\2P\u0277\3\2\2\2R\u027f\3\2\2\2T\u0285\3\2\2\2V\u0289\3\2\2\2X\u02b6"+
		"\3\2\2\2Z\u02bc\3\2\2\2\\\u02c6\3\2\2\2^\u02ce\3\2\2\2`\u02d0\3\2\2\2"+
		"b\u02dc\3\2\2\2d\u02df\3\2\2\2f\u02e4\3\2\2\2h\u02f9\3\2\2\2j\u02fb\3"+
		"\2\2\2l\u02fe\3\2\2\2n\u0301\3\2\2\2p\u030b\3\2\2\2r\u0327\3\2\2\2t\u0356"+
		"\3\2\2\2v\u0358\3\2\2\2x\u0363\3\2\2\2z\u0365\3\2\2\2|\u0368\3\2\2\2~"+
		"\u036b\3\2\2\2\u0080\u036e\3\2\2\2\u0082\u0372\3\2\2\2\u0084\u037e\3\2"+
		"\2\2\u0086\u0386\3\2\2\2\u0088\u038f\3\2\2\2\u008a\u0391\3\2\2\2\u008c"+
		"\u03b9\3\2\2\2\u008e\u03bc\3\2\2\2\u0090\u03c6\3\2\2\2\u0092\u03c8\3\2"+
		"\2\2\u0094\u03ce\3\2\2\2\u0096\u03d6\3\2\2\2\u0098\u03d8\3\2\2\2\u009a"+
		"\u03e1\3\2\2\2\u009c\u03e3\3\2\2\2\u009e\u03e7\3\2\2\2\u00a0\u03f6\3\2"+
		"\2\2\u00a2\u0401\3\2\2\2\u00a4\u0405\3\2\2\2\u00a6\u0407\3\2\2\2\u00a8"+
		"\u040a\3\2\2\2\u00aa\u0413\3\2\2\2\u00ac\u0421\3\2\2\2\u00ae\u0423\3\2"+
		"\2\2\u00b0\u0427\3\2\2\2\u00b2\u0443\3\2\2\2\u00b4\u044b\3\2\2\2\u00b6"+
		"\u044f\3\2\2\2\u00b8\u0457\3\2\2\2\u00ba\u045f\3\2\2\2\u00bc\u0467\3\2"+
		"\2\2\u00be\u0469\3\2\2\2\u00c0\u0474\3\2\2\2\u00c2\u0476\3\2\2\2\u00c4"+
		"\u047a\3\2\2\2\u00c6\u0492\3\2\2\2\u00c8\u049b\3\2\2\2\u00ca\u04a1\3\2"+
		"\2\2\u00cc\u04a5\3\2\2\2\u00ce\u04a9\3\2\2\2\u00d0\u04ad\3\2\2\2\u00d2"+
		"\u04b1\3\2\2\2\u00d4\u04b5\3\2\2\2\u00d6\u04cb\3\2\2\2\u00d8\u04cd\3\2"+
		"\2\2\u00da\u04cf\3\2\2\2\u00dc\u04d2\3\2\2\2\u00de\u04e6\3\2\2\2\u00e0"+
		"\u04ee\3\2\2\2\u00e2\u04f0\3\2\2\2\u00e4\u04f5\3\2\2\2\u00e6\u0500\3\2"+
		"\2\2\u00e8\u0509\3\2\2\2\u00ea\u050c\3\2\2\2\u00ec\u0515\3\2\2\2\u00ee"+
		"\u051b\3\2\2\2\u00f0\u052b\3\2\2\2\u00f2\u0543\3\2\2\2\u00f4\u0545\3\2"+
		"\2\2\u00f6\u0547\3\2\2\2\u00f8\u054c\3\2\2\2\u00fa\u0560\3\2\2\2\u00fc"+
		"\u0565\3\2\2\2\u00fe\u0577\3\2\2\2\u0100\u058b\3\2\2\2\u0102\u058d\3\2"+
		"\2\2\u0104\u05c6\3\2\2\2\u0106\u05c8\3\2\2\2\u0108\u05d1\3\2\2\2\u010a"+
		"\u05d8\3\2\2\2\u010c\u05f0\3\2\2\2\u010e\u010f\t\2\2\2\u010f\3\3\2\2\2"+
		"\u0110\u0111\7\u00a3\2\2\u0111\u0112\7\f\2\2\u0112\u0120\7\r\2\2\u0113"+
		"\u0114\7\u00a3\2\2\u0114\u0115\7\f\2\2\u0115\u011a\5\16\b\2\u0116\u0117"+
		"\7\6\2\2\u0117\u0119\5\16\b\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u011e\7\r\2\2\u011e\u0120\3\2\2\2\u011f\u0110\3\2\2\2\u011f"+
		"\u0113\3\2\2\2\u0120\5\3\2\2\2\u0121\u0122\t\3\2\2\u0122\u0123\7\7\2\2"+
		"\u0123\u0129\t\4\2\2\u0124\u0125\t\4\2\2\u0125\u0126\7\u009f\2\2\u0126"+
		"\u0127\t\3\2\2\u0127\u0129\7\u009f\2\2\u0128\u0121\3\2\2\2\u0128\u0124"+
		"\3\2\2\2\u0129\7\3\2\2\2\u012a\u012b\t\4\2\2\u012b\u0136\7\u00a8\2\2\u012c"+
		"\u012d\7\u00a8\2\2\u012d\u012e\7\7\2\2\u012e\u0136\t\4\2\2\u012f\u0130"+
		"\7s\2\2\u0130\u0131\7\f\2\2\u0131\u0132\7\u00a8\2\2\u0132\u0133\7\u0085"+
		"\2\2\u0133\u0134\t\4\2\2\u0134\u0136\7\r\2\2\u0135\u012a\3\2\2\2\u0135"+
		"\u012c\3\2\2\2\u0135\u012f\3\2\2\2\u0136\t\3\2\2\2\u0137\u013b\5\6\4\2"+
		"\u0138\u013b\7\u00a0\2\2\u0139\u013b\7\u00a1\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\13\3\2\2\2\u013c\u013d\7\"\2"+
		"\2\u013d\u0140\5\16\b\2\u013e\u0140\t\5\2\2\u013f\u013c\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\r\3\2\2\2\u0141\u0142\b\b\1\2\u0142\u0143\7(\2\2"+
		"\u0143\u0153\5\16\b\2\u0144\u0145\7)\2\2\u0145\u0153\5\16\b\2\u0146\u0153"+
		"\5\4\3\2\u0147\u0148\7\f\2\2\u0148\u0149\5\16\b\2\u0149\u014a\7\r\2\2"+
		"\u014a\u0153\3\2\2\2\u014b\u0153\5\2\2\2\u014c\u0153\5\f\7\2\u014d\u0153"+
		"\5\n\6\2\u014e\u0153\7\u00a8\2\2\u014f\u0153\5\b\5\2\u0150\u0153\5V,\2"+
		"\u0151\u0153\5\u00dco\2\u0152\u0141\3\2\2\2\u0152\u0144\3\2\2\2\u0152"+
		"\u0146\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u014b\3\2\2\2\u0152\u014c\3\2"+
		"\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u01a2\3\2\2\2\u0154\u0155\6\b"+
		"\2\3\u0155\u0156\7*\2\2\u0156\u01a1\5\16\b\2\u0157\u0158\6\b\3\3\u0158"+
		"\u0159\7+\2\2\u0159\u01a1\5\16\b\2\u015a\u015b\6\b\4\3\u015b\u015c\7,"+
		"\2\2\u015c\u01a1\5\16\b\2\u015d\u015e\6\b\5\3\u015e\u015f\7-\2\2\u015f"+
		"\u01a1\5\16\b\2\u0160\u0161\6\b\6\3\u0161\u0162\7.\2\2\u0162\u01a1\5\16"+
		"\b\2\u0163\u0164\6\b\7\3\u0164\u0165\7/\2\2\u0165\u01a1\5\16\b\2\u0166"+
		"\u0167\6\b\b\3\u0167\u0168\7%\2\2\u0168\u01a1\5\16\b\2\u0169\u016a\6\b"+
		"\t\3\u016a\u016b\7&\2\2\u016b\u01a1\5\16\b\2\u016c\u016d\6\b\n\3\u016d"+
		"\u016e\7\'\2\2\u016e\u01a1\5\16\b\2\u016f\u0170\6\b\13\3\u0170\u0171\7"+
		"(\2\2\u0171\u01a1\5\16\b\2\u0172\u0173\6\b\f\3\u0173\u0174\7)\2\2\u0174"+
		"\u01a1\5\16\b\2\u0175\u0176\6\b\r\3\u0176\u0177\7\5\2\2\u0177\u01a1\5"+
		"\16\b\2\u0178\u0179\6\b\16\3\u0179\u017a\7y\2\2\u017a\u01a1\5\16\b\2\u017b"+
		"\u017c\6\b\17\3\u017c\u017d\7\35\2\2\u017d\u01a1\5\16\b\2\u017e\u017f"+
		"\6\b\20\3\u017f\u0180\7\36\2\2\u0180\u01a1\5\16\b\2\u0181\u0182\6\b\21"+
		"\3\u0182\u0183\7 \2\2\u0183\u0184\5\16\b\2\u0184\u0185\7\35\2\2\u0185"+
		"\u0186\5\16\b\2\u0186\u01a1\3\2\2\2\u0187\u018c\6\b\22\3\u0188\u0189\7"+
		"\b\2\2\u0189\u018a\5\16\b\2\u018a\u018b\7\4\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u0188\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u01a1\3\2\2\2\u0190\u0192\6\b\23\3\u0191\u0193\7\"\2\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\32"+
		"\2\2\u0195\u01a1\7\u00a8\2\2\u0196\u0198\6\b\24\3\u0197\u0199\7\"\2\2"+
		"\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b"+
		"\7\33\2\2\u019b\u019c\7\34\2\2\u019c\u01a1\7\u00a8\2\2\u019d\u019e\6\b"+
		"\25\3\u019e\u019f\7\u0085\2\2\u019f\u01a1\7\u00a3\2\2\u01a0\u0154\3\2"+
		"\2\2\u01a0\u0157\3\2\2\2\u01a0\u015a\3\2\2\2\u01a0\u015d\3\2\2\2\u01a0"+
		"\u0160\3\2\2\2\u01a0\u0163\3\2\2\2\u01a0\u0166\3\2\2\2\u01a0\u0169\3\2"+
		"\2\2\u01a0\u016c\3\2\2\2\u01a0\u016f\3\2\2\2\u01a0\u0172\3\2\2\2\u01a0"+
		"\u0175\3\2\2\2\u01a0\u0178\3\2\2\2\u01a0\u017b\3\2\2\2\u01a0\u017e\3\2"+
		"\2\2\u01a0\u0181\3\2\2\2\u01a0\u0187\3\2\2\2\u01a0\u0190\3\2\2\2\u01a0"+
		"\u0196\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3\17\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6"+
		"\5\16\b\2\u01a6\21\3\2\2\2\u01a7\u01a9\5\24\13\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\23\3\2\2"+
		"\2\u01ac\u01af\7v\2\2\u01ad\u01ae\7\36\2\2\u01ae\u01b0\7w\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7x\2\2\u01b2"+
		"\u01b3\7\u00a3\2\2\u01b3\u01b4\7\f\2\2\u01b4\u01b5\5\26\f\2\u01b5\u01b6"+
		"\7\r\2\2\u01b6\u01b7\5\32\16\2\u01b7\u01b8\5\34\17\2\u01b8\u01b9\7\177"+
		"\2\2\u01b9\u01bb\7\u0080\2\2\u01ba\u01bc\5&\24\2\u01bb\u01ba\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\t\2\2\u01be\25\3\2\2"+
		"\2\u01bf\u01c4\5\30\r\2\u01c0\u01c1\7\6\2\2\u01c1\u01c3\5\30\r\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2"+
		"\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01bf\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\27\3\2\2\2\u01c9\u01cb\t\6\2\2\u01ca\u01c9\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\u00a3\2\2\u01cd"+
		"\u01d0\t\7\2\2\u01ce\u01cf\t\b\2\2\u01cf\u01d1\5\16\b\2\u01d0\u01ce\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\31\3\2\2\2\u01d2\u01d3\7\u0083\2\2\u01d3"+
		"\u01dc\t\4\2\2\u01d4\u01d7\7\u0083\2\2\u01d5\u01d6\t\4\2\2\u01d6\u01d8"+
		"\7\u00a3\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01d7\3\2\2"+
		"\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d2\3\2\2\2\u01db\u01d4"+
		"\3\2\2\2\u01dc\33\3\2\2\2\u01dd\u01de\7\u009c\2\2\u01de\u01df\5\36\20"+
		"\2\u01df\u01e0\7\u009e\2\2\u01e0\u01e6\3\2\2\2\u01e1\u01e2\7\u009d\2\2"+
		"\u01e2\u01e3\5\36\20\2\u01e3\u01e4\7\u009f\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01dd\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e6\35\3\2\2\2\u01e7\u01e8\7\u0086"+
		"\2\2\u01e8\u01ea\5\64\33\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ee\u01ef\7\u0087\2\2\u01ef\u01f2\5\u010a\u0086\2\u01f0\u01f1\7"+
		"\u0081\2\2\u01f1\u01f3\5 \21\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2"+
		"\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7\u0088\2\2\u01f5\u01f6\7\t\2\2\u01f6"+
		"\37\3\2\2\2\u01f7\u01f8\7\u0089\2\2\u01f8\u01f9\5\"\22\2\u01f9\u01fa\7"+
		"\u008a\2\2\u01fa\u01fb\5\u010a\u0086\2\u01fb\u01fd\3\2\2\2\u01fc\u01f7"+
		"\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\5\u010a\u0086\2\u0202!"+
		"\3\2\2\2\u0203\u0208\5$\23\2\u0204\u0205\7\36\2\2\u0205\u0207\5$\23\2"+
		"\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209#\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\5\16\b\2\u020c"+
		"%\3\2\2\2\u020d\u020e\5*\26\2\u020e\u020f\5(\25\2\u020f\u0210\5,\27\2"+
		"\u0210\u0211\5.\30\2\u0211\u0212\5\60\31\2\u0212\u0213\5\62\32\2\u0213"+
		"\'\3\2\2\2\u0214\u0215\t\t\2\2\u0215)\3\2\2\2\u0216\u0217\7\u008b\2\2"+
		"\u0217+\3\2\2\2\u0218\u0219\t\n\2\2\u0219-\3\2\2\2\u021a\u021b\t\13\2"+
		"\2\u021b/\3\2\2\2\u021c\u021d\7\u0095\2\2\u021d\u021e\7\u00a0\2\2\u021e"+
		"\61\3\2\2\2\u021f\u0220\7`\2\2\u0220\u0221\7\u00a0\2\2\u0221\63\3\2\2"+
		"\2\u0222\u0225\5\66\34\2\u0223\u0225\58\35\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227\65\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b\7\u00a3\2\2\u022a"+
		"\u022c\7\u0096\2\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d"+
		"\3\2\2\2\u022d\u0230\t\4\2\2\u022e\u022f\7\u0097\2\2\u022f\u0231\7\u00a3"+
		"\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0234\3\2\2\2\u0232"+
		"\u0233\7\"\2\2\u0233\u0235\7\u0098\2\2\u0234\u0232\3\2\2\2\u0234\u0235"+
		"\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0237\t\b\2\2\u0237\u0239\5\16\b\2"+
		"\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b"+
		"\7\t\2\2\u023b\67\3\2\2\2\u023c\u023d\7\u00a3\2\2\u023d\u023e\7t\2\2\u023e"+
		"\u023f\7u\2\2\u023f\u0240\7\u00a3\2\2\u0240\u0241\7\t\2\2\u02419\3\2\2"+
		"\2\u0242\u0243\5<\37\2\u0243\u0244\7\t\2\2\u0244;\3\2\2\2\u0245\u0246"+
		"\5\16\b\2\u0246\u0247\t\f\2\2\u0247\u0248\5\16\b\2\u0248=\3\2\2\2\u0249"+
		"\u024c\7G\2\2\u024a\u024d\5@!\2\u024b\u024d\5D#\2\u024c\u024a\3\2\2\2"+
		"\u024c\u024b\3\2\2\2\u024d?\3\2\2\2\u024e\u0253\5B\"\2\u024f\u0250\7\6"+
		"\2\2\u0250\u0252\5B\"\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0256\u0258\5F$\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258A"+
		"\3\2\2\2\u0259\u025c\5\16\b\2\u025a\u025b\7\u0085\2\2\u025b\u025d\7\u00a3"+
		"\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025dC\3\2\2\2\u025e\u025f"+
		"\7%\2\2\u025fE\3\2\2\2\u0260\u0262\7g\2\2\u0261\u0263\7h\2\2\u0262\u0261"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5H%\2\u0265"+
		"G\3\2\2\2\u0266\u026b\5J&\2\u0267\u0268\7\6\2\2\u0268\u026a\5J&\2\u0269"+
		"\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026cI\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\t\r\2\2\u026fK\3\2"+
		"\2\2\u0270\u0271\7D\2\2\u0271\u0272\5P)\2\u0272M\3\2\2\2\u0273\u0274\7"+
		"D\2\2\u0274\u0275\7E\2\2\u0275\u0276\5P)\2\u0276O\3\2\2\2\u0277\u027c"+
		"\5R*\2\u0278\u0279\7\6\2\2\u0279\u027b\5R*\2\u027a\u0278\3\2\2\2\u027b"+
		"\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027dQ\3\2\2\2"+
		"\u027e\u027c\3\2\2\2\u027f\u0280\7\u00a3\2\2\u0280\u0281\7\u0085\2\2\u0281"+
		"\u0282\7\f\2\2\u0282\u0283\5V,\2\u0283\u0284\7\r\2\2\u0284S\3\2\2\2\u0285"+
		"\u0286\5V,\2\u0286\u0287\7\t\2\2\u0287U\3\2\2\2\u0288\u028a\5L\'\2\u0289"+
		"\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\7S"+
		"\2\2\u028c\u02b2\5X-\2\u028d\u028f\5`\61\2\u028e\u028d\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0294\5n8\2\u0291\u0293\5p9\2\u0292"+
		"\u0291\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0299\5z>\2\u0298\u0297"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u029c\5|?\2\u029b"+
		"\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029f\5~"+
		"@\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u02a2\5\u0080A\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4"+
		"\3\2\2\2\u02a3\u02a5\5f\64\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\3\2\2\2\u02a6\u02a8\5b\62\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02ab\5d\63\2\u02aa\u02a9\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac\u02ae\5\u0082B\2\u02ad\u02ac"+
		"\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02b1\5\u0084C"+
		"\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u028e"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3W\3\2\2\2\u02b4\u02b7\7T\2\2\u02b5\u02b7"+
		"\5Z.\2\u02b6\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02ba\3\2\2\2\u02b8\u02bb\5^\60\2\u02b9\u02bb\5\\/\2\u02ba\u02b8\3\2"+
		"\2\2\u02ba\u02b9\3\2\2\2\u02bbY\3\2\2\2\u02bc\u02bd\7U\2\2\u02bd\u02be"+
		"\7}\2\2\u02be\u02c3\5\16\b\2\u02bf\u02c0\7\6\2\2\u02c0\u02c2\5\16\b\2"+
		"\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4"+
		"\3\2\2\2\u02c4[\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02cb\5\16\b\2\u02c7"+
		"\u02c8\7\6\2\2\u02c8\u02ca\5\16\b\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\3"+
		"\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc]\3\2\2\2\u02cd\u02cb"+
		"\3\2\2\2\u02ce\u02cf\7%\2\2\u02cf_\3\2\2\2\u02d0\u02d2\7g\2\2\u02d1\u02d3"+
		"\7h\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d9\7\u00a3\2\2\u02d5\u02d6\7\6\2\2\u02d6\u02d8\7\u00a3\2\2\u02d7\u02d5"+
		"\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"a\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\7]\2\2\u02dd\u02de\t\16\2\2"+
		"\u02dec\3\2\2\2\u02df\u02e0\7^\2\2\u02e0\u02e2\7\u00a0\2\2\u02e1\u02e3"+
		"\t\17\2\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3e\3\2\2\2\u02e4"+
		"\u02e5\7[\2\2\u02e5\u02ea\5h\65\2\u02e6\u02e7\7\6\2\2\u02e7\u02e9\5h\65"+
		"\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02ebg\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02ef\5\16\b\2\u02ee"+
		"\u02f0\t\20\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f2\3"+
		"\2\2\2\u02f1\u02f3\5l\67\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u02fa\3\2\2\2\u02f4\u02f5\5\16\b\2\u02f5\u02f7\5j\66\2\u02f6\u02f8\5"+
		"l\67\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9"+
		"\u02ed\3\2\2\2\u02f9\u02f4\3\2\2\2\u02fai\3\2\2\2\u02fb\u02fc\7n\2\2\u02fc"+
		"\u02fd\t\21\2\2\u02fdk\3\2\2\2\u02fe\u02ff\7o\2\2\u02ff\u0300\t\22\2\2"+
		"\u0300m\3\2\2\2\u0301\u0302\7V\2\2\u0302\u0307\5r:\2\u0303\u0304\7\6\2"+
		"\2\u0304\u0306\5r:\2\u0305\u0303\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308o\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030c\7R\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\u030e\5t;\2\u030eq\3\2\2\2\u030f\u0311\7b\2\2\u0310\u030f\3"+
		"\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\t\r\2\2\u0313"+
		"\u0315\7%\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u031b\3\2"+
		"\2\2\u0316\u0318\7\u0085\2\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\7\u00a3\2\2\u031a\u031c\5v<\2\u031b\u0317\3"+
		"\2\2\2\u031b\u031c\3\2\2\2\u031c\u0328\3\2\2\2\u031d\u031e\7\f\2\2\u031e"+
		"\u031f\5V,\2\u031f\u0321\7\r\2\2\u0320\u0322\7\u0085\2\2\u0321\u0320\3"+
		"\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0325\7\u00a3\2\2"+
		"\u0324\u0326\5v<\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328"+
		"\3\2\2\2\u0327\u0310\3\2\2\2\u0327\u031d\3\2\2\2\u0328s\3\2\2\2\u0329"+
		"\u032b\7L\2\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2"+
		"\2\2\u032c\u032d\7K\2\2\u032d\u032e\t\r\2\2\u032e\u032f\7}\2\2\u032f\u0357"+
		"\5\20\t\2\u0330\u0331\7M\2\2\u0331\u0332\7Q\2\2\u0332\u0333\7K\2\2\u0333"+
		"\u0334\t\r\2\2\u0334\u0335\7}\2\2\u0335\u0357\5\20\t\2\u0336\u0337\7M"+
		"\2\2\u0337\u0338\7K\2\2\u0338\u0339\t\r\2\2\u0339\u033a\7}\2\2\u033a\u0357"+
		"\5\20\t\2\u033b\u033c\7N\2\2\u033c\u033d\7Q\2\2\u033d\u033e\7K\2\2\u033e"+
		"\u033f\t\r\2\2\u033f\u0340\7}\2\2\u0340\u0357\5\20\t\2\u0341\u0342\7N"+
		"\2\2\u0342\u0343\7K\2\2\u0343\u0344\t\r\2\2\u0344\u0345\7}\2\2\u0345\u0357"+
		"\5\20\t\2\u0346\u0347\7O\2\2\u0347\u0348\7Q\2\2\u0348\u0349\7K\2\2\u0349"+
		"\u034a\t\r\2\2\u034a\u034b\7}\2\2\u034b\u0357\5\20\t\2\u034c\u034d\7O"+
		"\2\2\u034d\u034e\7K\2\2\u034e\u034f\t\r\2\2\u034f\u0350\7}\2\2\u0350\u0357"+
		"\5\20\t\2\u0351\u0352\7P\2\2\u0352\u0353\7K\2\2\u0353\u0354\t\r\2\2\u0354"+
		"\u0355\7}\2\2\u0355\u0357\5\20\t\2\u0356\u032a\3\2\2\2\u0356\u0330\3\2"+
		"\2\2\u0356\u0336\3\2\2\2\u0356\u033b\3\2\2\2\u0356\u0341\3\2\2\2\u0356"+
		"\u0346\3\2\2\2\u0356\u034c\3\2\2\2\u0356\u0351\3\2\2\2\u0357u\3\2\2\2"+
		"\u0358\u0359\7\f\2\2\u0359\u035e\5x=\2\u035a\u035b\7\6\2\2\u035b\u035d"+
		"\5x=\2\u035c\u035a\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\7\r"+
		"\2\2\u0362w\3\2\2\2\u0363\u0364\7\u00a3\2\2\u0364y\3\2\2\2\u0365\u0366"+
		"\7W\2\2\u0366\u0367\5\20\t\2\u0367{\3\2\2\2\u0368\u0369\7X\2\2\u0369\u036a"+
		"\5\16\b\2\u036a}\3\2\2\2\u036b\u036c\7~\2\2\u036c\u036d\5\20\t\2\u036d"+
		"\177\3\2\2\2\u036e\u036f\t\23\2\2\u036f\u0370\t\24\2\2\u0370\u0371\5V"+
		",\2\u0371\u0081\3\2\2\2\u0372\u0374\7a\2\2\u0373\u0375\t\25\2\2\u0374"+
		"\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2\2\2\u0376\u0378\7\u00a0"+
		"\2\2\u0377\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\3\2\2\2\u0379"+
		"\u037b\t\17\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\3"+
		"\2\2\2\u037c\u037d\7b\2\2\u037d\u0083\3\2\2\2\u037e\u037f\7u\2\2\u037f"+
		"\u0381\t\26\2\2\u0380\u0382\5\u0086D\2\u0381\u0380\3\2\2\2\u0381\u0382"+
		"\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0385\7f\2\2\u0384\u0383\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0085\3\2\2\2\u0386\u0387\7e\2\2\u0387\u038c\5\u0088"+
		"E\2\u0388\u0389\7\6\2\2\u0389\u038b\5\u0088E\2\u038a\u0388\3\2\2\2\u038b"+
		"\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0087\3\2"+
		"\2\2\u038e\u038c\3\2\2\2\u038f\u0390\7\u00a3\2\2\u0390\u0089\3\2\2\2\u0391"+
		"\u0392\7C\2\2\u0392\u03b5\5X-\2\u0393\u0397\5n8\2\u0394\u0396\5p9\2\u0395"+
		"\u0394\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2"+
		"\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039c\5z>\2\u039b\u039a"+
		"\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d\u039f\5|?\2\u039e"+
		"\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1\3\2\2\2\u03a0\u03a2\5~"+
		"@\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3"+
		"\u03a5\5\u0080A\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7"+
		"\3\2\2\2\u03a6\u03a8\5f\64\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03aa\3\2\2\2\u03a9\u03ab\5b\62\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03ae\5d\63\2\u03ad\u03ac\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03b0\3\2\2\2\u03af\u03b1\5\u0082B\2\u03b0\u03af"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2\u03b4\5\u0084C"+
		"\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b6\3\2\2\2\u03b5\u0393"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7\t\2\2\u03b8"+
		"\u008b\3\2\2\2\u03b9\u03ba\5\u008eH\2\u03ba\u03bb\7\t\2\2\u03bb\u008d"+
		"\3\2\2\2\u03bc\u03bd\7B\2\2\u03bd\u03bf\5\u0090I\2\u03be\u03c0\5\u0092"+
		"J\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3\2\2\2\u03c1"+
		"\u03c3\5\u0098M\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u008f"+
		"\3\2\2\2\u03c4\u03c7\7\u00a8\2\2\u03c5\u03c7\5\4\3\2\u03c6\u03c4\3\2\2"+
		"\2\u03c6\u03c5\3\2\2\2\u03c7\u0091\3\2\2\2\u03c8\u03ca\7g\2\2\u03c9\u03cb"+
		"\7h\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03cd\5\u0094K\2\u03cd\u0093\3\2\2\2\u03ce\u03d3\5\u0096L\2\u03cf\u03d0"+
		"\7\6\2\2\u03d0\u03d2\5\u0096L\2\u03d1\u03cf\3\2\2\2\u03d2\u03d5\3\2\2"+
		"\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u0095\3\2\2\2\u03d5\u03d3"+
		"\3\2\2\2\u03d6\u03d7\t\r\2\2\u03d7\u0097\3\2\2\2\u03d8\u03d9\7n\2\2\u03d9"+
		"\u03de\5\u009aN\2\u03da\u03db\7\6\2\2\u03db\u03dd\5\u009aN\2\u03dc\u03da"+
		"\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u0099\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\5\16\b\2\u03e2\u009b\3"+
		"\2\2\2\u03e3\u03e4\5\u009eP\2\u03e4\u03e5\7\t\2\2\u03e5\u009d\3\2\2\2"+
		"\u03e6\u03e8\5L\'\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03ea\7H\2\2\u03ea\u03eb\7g\2\2\u03eb\u03ed\t\r\2\2\u03ec"+
		"\u03ee\5\u00a0Q\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f1"+
		"\3\2\2\2\u03ef\u03f2\5\u00a4S\2\u03f0\u03f2\5V,\2\u03f1\u03ef\3\2\2\2"+
		"\u03f1\u03f0\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f5\5> \2\u03f4\u03f3"+
		"\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u009f\3\2\2\2\u03f6\u03f7\7\f\2\2\u03f7"+
		"\u03fc\5\u00a2R\2\u03f8\u03f9\7\6\2\2\u03f9\u03fb\5\u00a2R\2\u03fa\u03f8"+
		"\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd"+
		"\u03ff\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0400\7\r\2\2\u0400\u00a1\3\2"+
		"\2\2\u0401\u0402\7\u00a3\2\2\u0402\u00a3\3\2\2\2\u0403\u0406\5\u00a6T"+
		"\2\u0404\u0406\5\u00a8U\2\u0405\u0403\3\2\2\2\u0405\u0404\3\2\2\2\u0406"+
		"\u00a5\3\2\2\2\u0407\u0408\7\u0082\2\2\u0408\u0409\7I\2\2\u0409\u00a7"+
		"\3\2\2\2\u040a\u040b\7I\2\2\u040b\u0410\5\u00aaV\2\u040c\u040d\7\6\2\2"+
		"\u040d\u040f\5\u00aaV\2\u040e\u040c\3\2\2\2\u040f\u0412\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u00a9\3\2\2\2\u0412\u0410\3\2"+
		"\2\2\u0413\u0414\7\f\2\2\u0414\u0419\5\u00acW\2\u0415\u0416\7\6\2\2\u0416"+
		"\u0418\5\u00acW\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417"+
		"\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c"+
		"\u041d\7\r\2\2\u041d\u00ab\3\2\2\2\u041e\u0422\5\16\b\2\u041f\u0422\t"+
		"\r\2\2\u0420\u0422\7\u0082\2\2\u0421\u041e\3\2\2\2\u0421\u041f\3\2\2\2"+
		"\u0421\u0420\3\2\2\2\u0422\u00ad\3\2\2\2\u0423\u0424\5\u00b0Y\2\u0424"+
		"\u0425\7\t\2\2\u0425\u00af\3\2\2\2\u0426\u0428\5L\'\2\u0427\u0426\3\2"+
		"\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042b\7c\2\2\u042a"+
		"\u042c\7b\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2"+
		"\2\2\u042d\u042f\t\r\2\2\u042e\u0430\7%\2\2\u042f\u042e\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0433\3\2\2\2\u0431\u0432\7\u0085\2\2\u0432\u0434"+
		"\7\u00a3\2\2\u0433\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0435\3\2\2"+
		"\2\u0435\u0438\7J\2\2\u0436\u0439\5\u00b2Z\2\u0437\u0439\5\u00b6\\\2\u0438"+
		"\u0436\3\2\2\2\u0438\u0437\3\2\2\2\u0439\u043b\3\2\2\2\u043a\u043c\5n"+
		"8\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043e\3\2\2\2\u043d"+
		"\u043f\5z>\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2"+
		"\2\u0440\u0442\5> \2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u00b1"+
		"\3\2\2\2\u0443\u0448\5\u00b4[\2\u0444\u0445\7\6\2\2\u0445\u0447\5\u00b4"+
		"[\2\u0446\u0444\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u00b3\3\2\2\2\u044a\u0448\3\2\2\2\u044b\u044c\t\r"+
		"\2\2\u044c\u044d\7*\2\2\u044d\u044e\5\u00c0a\2\u044e\u00b5\3\2\2\2\u044f"+
		"\u0454\5\u00b8]\2\u0450\u0451\7\6\2\2\u0451\u0453\5\u00b8]\2\u0452\u0450"+
		"\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u00b7\3\2\2\2\u0456\u0454\3\2\2\2\u0457\u0458\7\f\2\2\u0458\u0459\5\u00ba"+
		"^\2\u0459\u045a\7\r\2\2\u045a\u045b\7*\2\2\u045b\u045c\7\f\2\2\u045c\u045d"+
		"\5\u00be`\2\u045d\u045e\7\r\2\2\u045e\u00b9\3\2\2\2\u045f\u0464\5\u00bc"+
		"_\2\u0460\u0461\7\6\2\2\u0461\u0463\5\u00bc_\2\u0462\u0460\3\2\2\2\u0463"+
		"\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u00bb\3\2"+
		"\2\2\u0466\u0464\3\2\2\2\u0467\u0468\t\r\2\2\u0468\u00bd\3\2\2\2\u0469"+
		"\u046e\5\u00c0a\2\u046a\u046b\7\6\2\2\u046b\u046d\5\u00c0a\2\u046c\u046a"+
		"\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f"+
		"\u00bf\3\2\2\2\u0470\u046e\3\2\2\2\u0471\u0475\5\16\b\2\u0472\u0475\t"+
		"\r\2\2\u0473\u0475\7\u0082\2\2\u0474\u0471\3\2\2\2\u0474\u0472\3\2\2\2"+
		"\u0474\u0473\3\2\2\2\u0475\u00c1\3\2\2\2\u0476\u0477\5\u00c4c\2\u0477"+
		"\u0478\7\t\2\2\u0478\u00c3\3\2\2\2\u0479\u047b\5L\'\2\u047a\u0479\3\2"+
		"\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\7F\2\2\u047d"+
		"\u047f\7V\2\2\u047e\u0480\7b\2\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2"+
		"\2\u0480\u0481\3\2\2\2\u0481\u0483\t\r\2\2\u0482\u0484\7%\2\2\u0483\u0482"+
		"\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0486\7\u0085\2"+
		"\2\u0486\u0488\7\u00a3\2\2\u0487\u0485\3\2\2\2\u0487\u0488\3\2\2\2\u0488"+
		"\u048a\3\2\2\2\u0489\u048b\5\u00c6d\2\u048a\u0489\3\2\2\2\u048a\u048b"+
		"\3\2\2\2\u048b\u048d\3\2\2\2\u048c\u048e\5z>\2\u048d\u048c\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048e\u0490\3\2\2\2\u048f\u0491\5> \2\u0490\u048f\3\2\2"+
		"\2\u0490\u0491\3\2\2\2\u0491\u00c5\3\2\2\2\u0492\u0493\7n\2\2\u0493\u0498"+
		"\5\u00c8e\2\u0494\u0495\7\6\2\2\u0495\u0497\5\u00c8e\2\u0496\u0494\3\2"+
		"\2\2\u0497\u049a\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499"+
		"\u00c7\3\2\2\2\u049a\u0498\3\2\2\2\u049b\u049c\t\r\2\2\u049c\u00c9\3\2"+
		"\2\2\u049d\u04a2\5\u00ccg\2\u049e\u04a2\5\u00ceh\2\u049f\u04a2\5\u00d0"+
		"i\2\u04a0\u04a2\5\u00d2j\2\u04a1\u049d\3\2\2\2\u04a1\u049e\3\2\2\2\u04a1"+
		"\u049f\3\2\2\2\u04a1\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\7\t"+
		"\2\2\u04a4\u00cb\3\2\2\2\u04a5\u04a7\7A\2\2\u04a6\u04a8\5\16\b\2\u04a7"+
		"\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00cd\3\2\2\2\u04a9\u04aa\7A"+
		"\2\2\u04aa\u04ab\7q\2\2\u04ab\u04ac\5\16\b\2\u04ac\u00cf\3\2\2\2\u04ad"+
		"\u04ae\7A\2\2\u04ae\u04af\7@\2\2\u04af\u04b0\5V,\2\u04b0\u00d1\3\2\2\2"+
		"\u04b1\u04b2\7A\2\2\u04b2\u04b3\7@\2\2\u04b3\u04b4\5\u008eH\2\u04b4\u00d3"+
		"\3\2\2\2\u04b5\u04b6\7=\2\2\u04b6\u04b7\5\u00d6l\2\u04b7\u04b8\7\u008a"+
		"\2\2\u04b8\u04c0\5\u010a\u0086\2\u04b9\u04ba\7>\2\2\u04ba\u04bb\5\u00d8"+
		"m\2\u04bb\u04bc\7\u008a\2\2\u04bc\u04bd\5\u010a\u0086\2\u04bd\u04bf\3"+
		"\2\2\2\u04be\u04b9\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04c5\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3\u04c4\7?"+
		"\2\2\u04c4\u04c6\5\u010a\u0086\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2"+
		"\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\7\u0088\2\2\u04c8\u04c9\7=\2\2\u04c9"+
		"\u04ca\7\t\2\2\u04ca\u00d5\3\2\2\2\u04cb\u04cc\5\20\t\2\u04cc\u00d7\3"+
		"\2\2\2\u04cd\u04ce\5\20\t\2\u04ce\u00d9\3\2\2\2\u04cf\u04d0\5\u00dco\2"+
		"\u04d0\u04d1\7\t\2\2\u04d1\u00db\3\2\2\2\u04d2\u04d4\7<\2\2\u04d3\u04d5"+
		"\5\u00e0q\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04db\3\2\2"+
		"\2\u04d6\u04d7\7\u0089\2\2\u04d7\u04d8\5\u00dep\2\u04d8\u04d9\7\u008a"+
		"\2\2\u04d9\u04da\5\u010a\u0086\2\u04da\u04dc\3\2\2\2\u04db\u04d6\3\2\2"+
		"\2\u04dc\u04dd\3\2\2\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04e1"+
		"\3\2\2\2\u04df\u04e0\7?\2\2\u04e0\u04e2\5\u010a\u0086\2\u04e1\u04df\3"+
		"\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\7\u0088\2\2"+
		"\u04e4\u04e5\7<\2\2\u04e5\u00dd\3\2\2\2\u04e6\u04eb\5\u00e2r\2\u04e7\u04e8"+
		"\7\6\2\2\u04e8\u04ea\5\u00e2r\2\u04e9\u04e7\3\2\2\2\u04ea\u04ed\3\2\2"+
		"\2\u04eb\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u00df\3\2\2\2\u04ed\u04eb"+
		"\3\2\2\2\u04ee\u04ef\5\16\b\2\u04ef\u00e1\3\2\2\2\u04f0\u04f1\5\16\b\2"+
		"\u04f1\u00e3\3\2\2\2\u04f2\u04f3\7\3\2\2\u04f3\u04f4\7\u00a3\2\2\u04f4"+
		"\u04f6\7\n\2\2\u04f5\u04f2\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2"+
		"\2\2\u04f7\u04f8\7;\2\2\u04f8\u04f9\5\u010a\u0086\2\u04f9\u04fa\7\u0088"+
		"\2\2\u04fa\u04fc\7;\2\2\u04fb\u04fd\7\u00a3\2\2\u04fc\u04fb\3\2\2\2\u04fc"+
		"\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\7\t\2\2\u04ff\u00e5\3\2"+
		"\2\2\u0500\u0502\7:\2\2\u0501\u0503\7\u00a3\2\2\u0502\u0501\3\2\2\2\u0502"+
		"\u0503\3\2\2\2\u0503\u0505\3\2\2\2\u0504\u0506\5\u00e8u\2\u0505\u0504"+
		"\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7\t\2\2\u0508"+
		"\u00e7\3\2\2\2\u0509\u050a\7\u0089\2\2\u050a\u050b\5\20\t\2\u050b\u00e9"+
		"\3\2\2\2\u050c\u050e\79\2\2\u050d\u050f\7\u00a3\2\2\u050e\u050d\3\2\2"+
		"\2\u050e\u050f\3\2\2\2\u050f\u0511\3\2\2\2\u0510\u0512\5\u00ecw\2\u0511"+
		"\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\7\t"+
		"\2\2\u0514\u00eb\3\2\2\2\u0515\u0516\7\u0089\2\2\u0516\u0517\5\20\t\2"+
		"\u0517\u00ed\3\2\2\2\u0518\u0519\7\3\2\2\u0519\u051a\7\u00a3\2\2\u051a"+
		"\u051c\7\n\2\2\u051b\u0518\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2"+
		"\2\2\u051d\u051e\78\2\2\u051e\u051f\5\20\t\2\u051f\u0520\7;\2\2\u0520"+
		"\u0521\5\u010a\u0086\2\u0521\u0522\7\u0088\2\2\u0522\u0524\7;\2\2\u0523"+
		"\u0525\7\u00a3\2\2\u0524\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0527\7\t\2\2\u0527\u00ef\3\2\2\2\u0528\u0529\7\3\2\2\u0529"+
		"\u052a\7\u00a3\2\2\u052a\u052c\7\n\2\2\u052b\u0528\3\2\2\2\u052b\u052c"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u052e\7u\2\2\u052e\u052f\5\2\2\2\u052f"+
		"\u0531\7y\2\2\u0530\u0532\7\67\2\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2"+
		"\2\2\u0532\u0533\3\2\2\2\u0533\u0534\5\u00f4{\2\u0534\u0535\7\13\2\2\u0535"+
		"\u0538\5\u00f6|\2\u0536\u0537\7Z\2\2\u0537\u0539\5\u00f2z\2\u0538\u0536"+
		"\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\7;\2\2\u053b"+
		"\u053c\5\u010a\u0086\2\u053c\u053d\7\u0088\2\2\u053d\u053f\7;\2\2\u053e"+
		"\u0540\7\u00a3\2\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0542\7\t\2\2\u0542\u00f1\3\2\2\2\u0543\u0544\5\16\b\2"+
		"\u0544\u00f3\3\2\2\2\u0545\u0546\5\16\b\2\u0546\u00f5\3\2\2\2\u0547\u0548"+
		"\5\16\b\2\u0548\u00f7\3\2\2\2\u0549\u054a\7\3\2\2\u054a\u054b\7\u00a3"+
		"\2\2\u054b\u054d\7\n\2\2\u054c\u0549\3\2\2\2\u054c\u054d\3\2\2\2\u054d"+
		"\u054e\3\2\2\2\u054e\u054f\7u\2\2\u054f\u0550\5\2\2\2\u0550\u0551\7y\2"+
		"\2\u0551\u0552\5\u00fa~\2\u0552\u0553\7;\2\2\u0553\u0554\5\u010a\u0086"+
		"\2\u0554\u0555\7\u0088\2\2\u0555\u0557\7;\2\2\u0556\u0558\7\u00a3\2\2"+
		"\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a"+
		"\7\t\2\2\u055a\u00f9\3\2\2\2\u055b\u055c\7\f\2\2\u055c\u055d\5\u00fa~"+
		"\2\u055d\u055e\7\r\2\2\u055e\u0561\3\2\2\2\u055f\u0561\5V,\2\u0560\u055b"+
		"\3\2\2\2\u0560\u055f\3\2\2\2\u0561\u00fb\3\2\2\2\u0562\u0563\7\3\2\2\u0563"+
		"\u0564\7\u00a3\2\2\u0564\u0566\7\n\2\2\u0565\u0562\3\2\2\2\u0565\u0566"+
		"\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\7u\2\2\u0568\u0569\5\2\2\2\u0569"+
		"\u056a\7y\2\2\u056a\u056b\5\u008eH\2\u056b\u056c\7;\2\2\u056c\u056d\5"+
		"\u010a\u0086\2\u056d\u056e\7\u0088\2\2\u056e\u0570\7;\2\2\u056f\u0571"+
		"\7\u00a3\2\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2"+
		"\2\u0572\u0573\7\t\2\2\u0573\u00fd\3\2\2\2\u0574\u0575\7\3\2\2\u0575\u0576"+
		"\7\u00a3\2\2\u0576\u0578\7\n\2\2\u0577\u0574\3\2\2\2\u0577\u0578\3\2\2"+
		"\2\u0578\u0579\3\2\2\2\u0579\u057a\7\66\2\2\u057a\u057d\5\2\2\2\u057b"+
		"\u057c\7\65\2\2\u057c\u057e\7\u00a0\2\2\u057d\u057b\3\2\2\2\u057d\u057e"+
		"\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\7y\2\2\u0580\u0581\7\64\2\2\u0581"+
		"\u0582\5\u0100\u0081\2\u0582\u0583\7;\2\2\u0583\u0584\5\u010a\u0086\2"+
		"\u0584\u0585\7\u0088\2\2\u0585\u0587\7;\2\2\u0586\u0588\7\u00a3\2\2\u0587"+
		"\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\7\t"+
		"\2\2\u058a\u00ff\3\2\2\2\u058b\u058c\5\16\b\2\u058c\u0101\3\2\2\2\u058d"+
		"\u058e\7\63\2\2\u058e\u058f\7\62\2\2\u058f\u0594\5<\37\2\u0590\u0591\7"+
		"\6\2\2\u0591\u0593\5<\37\2\u0592\u0590\3\2\2\2\u0593\u0596\3\2\2\2\u0594"+
		"\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0594\3\2"+
		"\2\2\u0597\u0598\7\t\2\2\u0598\u0103\3\2\2\2\u0599\u059a\7\61\2\2\u059a"+
		"\u05c7\7\t\2\2\u059b\u059d\7\61\2\2\u059c\u059e\t\27\2\2\u059d\u059c\3"+
		"\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a4\7\u00a8\2\2"+
		"\u05a0\u05a1\7\6\2\2\u05a1\u05a3\5\16\b\2\u05a2\u05a0\3\2\2\2\u05a3\u05a6"+
		"\3\2\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6"+
		"\u05a4\3\2\2\2\u05a7\u05a9\5\u0106\u0084\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9"+
		"\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05c7\7\t\2\2\u05ab\u05ad\7\61\2\2"+
		"\u05ac\u05ae\t\27\2\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05af"+
		"\3\2\2\2\u05af\u05b1\7\u00a3\2\2\u05b0\u05b2\5\u0106\u0084\2\u05b1\u05b0"+
		"\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05c7\7\t\2\2\u05b4"+
		"\u05b6\7\61\2\2\u05b5\u05b7\t\27\2\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3"+
		"\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\7\60\2\2\u05b9\u05bb\7\u00a8\2"+
		"\2\u05ba\u05bc\5\u0106\u0084\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc\3\2\2\2"+
		"\u05bc\u05bd\3\2\2\2\u05bd\u05c7\7\t\2\2\u05be\u05c0\7\61\2\2\u05bf\u05c1"+
		"\t\27\2\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\3\2\2\2"+
		"\u05c2\u05c4\5\u0106\u0084\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c5\3\2\2\2\u05c5\u05c7\7\t\2\2\u05c6\u0599\3\2\2\2\u05c6\u059b\3\2"+
		"\2\2\u05c6\u05ab\3\2\2\2\u05c6\u05b4\3\2\2\2\u05c6\u05be\3\2\2\2\u05c7"+
		"\u0105\3\2\2\2\u05c8\u05c9\7n\2\2\u05c9\u05ce\5\u0108\u0085\2\u05ca\u05cb"+
		"\7\6\2\2\u05cb\u05cd\5\u0108\u0085\2\u05cc\u05ca\3\2\2\2\u05cd\u05d0\3"+
		"\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u0107\3\2\2\2\u05d0"+
		"\u05ce\3\2\2\2\u05d1\u05d2\7\u00a3\2\2\u05d2\u05d3\7*\2\2\u05d3\u05d4"+
		"\5\16\b\2\u05d4\u0109\3\2\2\2\u05d5\u05d7\5\u010c\u0087\2\u05d6\u05d5"+
		"\3\2\2\2\u05d7\u05da\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u010b\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05f1\5T+\2\u05dc\u05f1\5\u009c"+
		"O\2\u05dd\u05f1\5\u00aeX\2\u05de\u05f1\5\u00c2b\2\u05df\u05f1\5\36\20"+
		"\2\u05e0\u05f1\5:\36\2\u05e1\u05f1\5\u008aF\2\u05e2\u05f1\5\u008cG\2\u05e3"+
		"\u05f1\5\u00caf\2\u05e4\u05f1\5\u00d4k\2\u05e5\u05f1\5\u00dan\2\u05e6"+
		"\u05f1\5\u00e4s\2\u05e7\u05f1\5\u00e6t\2\u05e8\u05f1\5\u00eav\2\u05e9"+
		"\u05f1\5\u00eex\2\u05ea\u05f1\5\u00f0y\2\u05eb\u05f1\5\u00f8}\2\u05ec"+
		"\u05f1\5\u00fc\177\2\u05ed\u05f1\5\u00fe\u0080\2\u05ee\u05f1\5\u0102\u0082"+
		"\2\u05ef\u05f1\5\u0104\u0083\2\u05f0\u05db\3\2\2\2\u05f0\u05dc\3\2\2\2"+
		"\u05f0\u05dd\3\2\2\2\u05f0\u05de\3\2\2\2\u05f0\u05df\3\2\2\2\u05f0\u05e0"+
		"\3\2\2\2\u05f0\u05e1\3\2\2\2\u05f0\u05e2\3\2\2\2\u05f0\u05e3\3\2\2\2\u05f0"+
		"\u05e4\3\2\2\2\u05f0\u05e5\3\2\2\2\u05f0\u05e6\3\2\2\2\u05f0\u05e7\3\2"+
		"\2\2\u05f0\u05e8\3\2\2\2\u05f0\u05e9\3\2\2\2\u05f0\u05ea\3\2\2\2\u05f0"+
		"\u05eb\3\2\2\2\u05f0\u05ec\3\2\2\2\u05f0\u05ed\3\2\2\2\u05f0\u05ee\3\2"+
		"\2\2\u05f0\u05ef\3\2\2\2\u05f1\u010d\3\2\2\2\u00ad\u011a\u011f\u0128\u0135"+
		"\u013a\u013f\u0152\u018e\u0192\u0198\u01a0\u01a2\u01aa\u01af\u01bb\u01c4"+
		"\u01c7\u01ca\u01d0\u01d9\u01db\u01e5\u01eb\u01f2\u01fe\u0208\u0224\u0226"+
		"\u022b\u0230\u0234\u0238\u024c\u0253\u0257\u025c\u0262\u026b\u027c\u0289"+
		"\u028e\u0294\u0298\u029b\u029e\u02a1\u02a4\u02a7\u02aa\u02ad\u02b0\u02b2"+
		"\u02b6\u02ba\u02c3\u02cb\u02d2\u02d9\u02e2\u02ea\u02ef\u02f2\u02f7\u02f9"+
		"\u0307\u030b\u0310\u0314\u0317\u031b\u0321\u0325\u0327\u032a\u0356\u035e"+
		"\u0374\u0377\u037a\u0381\u0384\u038c\u0397\u039b\u039e\u03a1\u03a4\u03a7"+
		"\u03aa\u03ad\u03b0\u03b3\u03b5\u03bf\u03c2\u03c6\u03ca\u03d3\u03de\u03e7"+
		"\u03ed\u03f1\u03f4\u03fc\u0405\u0410\u0419\u0421\u0427\u042b\u042f\u0433"+
		"\u0438\u043b\u043e\u0441\u0448\u0454\u0464\u046e\u0474\u047a\u047f\u0483"+
		"\u0487\u048a\u048d\u0490\u0498\u04a1\u04a7\u04c0\u04c5\u04d4\u04dd\u04e1"+
		"\u04eb\u04f5\u04fc\u0502\u0505\u050e\u0511\u051b\u0524\u052b\u0531\u0538"+
		"\u053f\u054c\u0557\u0560\u0565\u0570\u0577\u057d\u0587\u0594\u059d\u05a4"+
		"\u05a8\u05ad\u05b1\u05b6\u05bb\u05c0\u05c3\u05c6\u05ce\u05d8\u05f0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}