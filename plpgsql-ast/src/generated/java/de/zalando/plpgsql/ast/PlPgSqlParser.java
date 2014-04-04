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
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, LIKE=11, SIMILAR=12, TO=13, AND=14, OR=15, ASSIGN_OP=16, BETWEEN=17, 
		IS=18, NOT=19, ISNULL=20, NOTNULL=21, MUL=22, DIV=23, MOD=24, ADD=25, 
		SUB=26, EQ=27, NEQ=28, LT=29, LTE=30, GT=31, GTE=32, WHILE=33, CONTINUE=34, 
		EXIT=35, LOOP=36, CASE=37, IF=38, ELSIF=39, ELSE=40, QUERY=41, RETURN=42, 
		EXECUTE=43, PERFORM=44, WITH=45, RECURSIVE=46, DELETE=47, RETURNING=48, 
		INSERT=49, VALUES=50, SET=51, JOIN=52, INNER=53, LEFT=54, RIGHT=55, FULL=56, 
		CROSS=57, OUTER=58, NATURAL=59, SELECT=60, ALL=61, DISTINCT=62, FROM=63, 
		WHERE=64, GROUP_BY=65, GROUP=66, BY=67, ORDER_BY=68, ORDER=69, LIMIT=70, 
		OFFSET=71, ROW=72, ROWS=73, FETCH=74, ONLY=75, UPDATE=76, SHARE=77, OF=78, 
		NOWAIT=79, INTO=80, STRICT=81, UNION=82, INTERSECT=83, EXCEPT=84, ASC=85, 
		DESC=86, USING=87, NULLS=88, FIRST=89, NEXT=90, LAST=91, CAST=92, ALIAS=93, 
		FOR=94, CREATE=95, REPLACE=96, FUNCTION=97, IN=98, OUT=99, INOUT=100, 
		VARIADIC=101, ON=102, HAVING=103, LANGUAGE=104, LANGUAGE_NAME=105, EXCEPTION=106, 
		DEFAULT=107, RETURNS=108, TABLE=109, AS=110, DECLARE=111, BEGIN=112, END=113, 
		WHEN=114, THEN=115, WINDOW=116, IMMUTABLE=117, STABLE=118, VOLATILE=119, 
		CALLED_ON_NULL_INPUT=120, RETURNS_NULL_ON_NULL_INPUT=121, EXTERNAL=122, 
		SECURITY=123, SECURITY_INVOKER=124, SECURITY_DEFINER=125, COST=126, CONSTANT=127, 
		COLLATE=128, NULL=129, TRUE=130, FALSE=131, UNKNOWN=132, F_DOLLAR_QUOTE=133, 
		F_QUOTE=134, DOLLAR_QUOTE=135, QUOTE=136, INTEGER_VALUE=137, DECIMAL_VALUE=138, 
		ID=139, QNAME=140, ARRAY_TYPE=141, COPY_TYPE=142, ROW_TYPE=143, WS=144, 
		SL_COMMENT=145, ML_COMMENT=146, ESC=147;
	public static final String[] tokenNames = {
		"<INVALID>", "'<<'", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", 
		"';'", "'>>'", "LIKE", "SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", 
		"IS", "NOT", "ISNULL", "NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", 
		"NEQ", "'<'", "'<='", "'>'", "'>='", "WHILE", "CONTINUE", "EXIT", "LOOP", 
		"CASE", "IF", "ELSIF", "ELSE", "QUERY", "RETURN", "EXECUTE", "PERFORM", 
		"WITH", "RECURSIVE", "DELETE", "RETURNING", "INSERT", "VALUES", "SET", 
		"JOIN", "INNER", "LEFT", "RIGHT", "FULL", "CROSS", "OUTER", "NATURAL", 
		"SELECT", "ALL", "DISTINCT", "FROM", "WHERE", "GROUP_BY", "GROUP", "BY", 
		"ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", "ROWS", "FETCH", "ONLY", 
		"UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", "UNION", "INTERSECT", 
		"EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", "NEXT", "LAST", "CAST", 
		"ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", "IN", "OUT", "INOUT", 
		"VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", "EXCEPTION", 
		"DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", "END", "WHEN", 
		"THEN", "WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", 
		"RETURNS_NULL_ON_NULL_INPUT", "EXTERNAL", "SECURITY", "SECURITY_INVOKER", 
		"SECURITY_DEFINER", "COST", "CONSTANT", "COLLATE", "NULL", "TRUE", "FALSE", 
		"UNKNOWN", "F_DOLLAR_QUOTE", "F_QUOTE", "DOLLAR_QUOTE", "'''", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "ID", "QNAME", "ARRAY_TYPE", "COPY_TYPE", "ROW_TYPE", 
		"WS", "SL_COMMENT", "ML_COMMENT", "ESC"
	};
	public static final int
		RULE_varExpr = 0, RULE_functionCallExpr = 1, RULE_numericConstant = 2, 
		RULE_constantOfOtherTypes = 3, RULE_numericalLiteralExpr = 4, RULE_booleanLiteralExpr = 5, 
		RULE_stringLiteralExpr = 6, RULE_stringValue = 7, RULE_expression = 8, 
		RULE_assignOperator = 9, RULE_condition = 10, RULE_unit = 11, RULE_plFunction = 12, 
		RULE_functionArgsList = 13, RULE_functionArg = 14, RULE_functionReturns = 15, 
		RULE_functionBody = 16, RULE_blockStmt = 17, RULE_exceptionHandlingBlock = 18, 
		RULE_exceptionWhenConditions = 19, RULE_exceptionWhenCondition = 20, RULE_functionSettings = 21, 
		RULE_functionBehavior = 22, RULE_window = 23, RULE_functionInputHandling = 24, 
		RULE_functionSecurity = 25, RULE_functionCosts = 26, RULE_functionRows = 27, 
		RULE_varDeclarationList = 28, RULE_varDeclaration = 29, RULE_aliasDeclaration = 30, 
		RULE_assignStmt = 31, RULE_returningClause = 32, RULE_returningExpressions = 33, 
		RULE_returningOutputExpression = 34, RULE_returningAll = 35, RULE_returningIntoClause = 36, 
		RULE_returningIntoTargets = 37, RULE_returningIntoTarget = 38, RULE_withClause = 39, 
		RULE_withRecursiveClause = 40, RULE_withQueries = 41, RULE_withQuery = 42, 
		RULE_selectStmt = 43, RULE_select = 44, RULE_selectList = 45, RULE_distinctClause = 46, 
		RULE_selectSpecific = 47, RULE_selectAll = 48, RULE_intoClause = 49, RULE_limitClause = 50, 
		RULE_offsetClause = 51, RULE_orderByClause = 52, RULE_orderByItem = 53, 
		RULE_orderByUsing = 54, RULE_nullsOrdering = 55, RULE_fromClause = 56, 
		RULE_joinClause = 57, RULE_tableExpression = 58, RULE_join = 59, RULE_columnAlias = 60, 
		RULE_columnAliasItem = 61, RULE_whereClause = 62, RULE_groupByClause = 63, 
		RULE_havingClause = 64, RULE_bulkOperationClause = 65, RULE_fetchClause = 66, 
		RULE_forClause = 67, RULE_lockedTables = 68, RULE_lockedTable = 69, RULE_performStmt = 70, 
		RULE_executeStmt = 71, RULE_execute = 72, RULE_executeCommand = 73, RULE_executeIntoClause = 74, 
		RULE_executeIntoTargets = 75, RULE_executeIntoTarget = 76, RULE_executeUsingClause = 77, 
		RULE_executeUsingExpression = 78, RULE_insertStmt = 79, RULE_insert = 80, 
		RULE_insertColumnList = 81, RULE_insertColumn = 82, RULE_insertValuesClause = 83, 
		RULE_insertDefaultValues = 84, RULE_insertValues = 85, RULE_insertValueTuple = 86, 
		RULE_updateStmt = 87, RULE_update = 88, RULE_updateSingleSetClause = 89, 
		RULE_updateSingleSetAssignment = 90, RULE_updateMultiSetClause = 91, RULE_updateMultiSetAssignment = 92, 
		RULE_updateMultiSetColumns = 93, RULE_updateMultiSetColumn = 94, RULE_updateMultiSetValues = 95, 
		RULE_updateSetValue = 96, RULE_deleteStmt = 97, RULE_delete = 98, RULE_deleteUsingClause = 99, 
		RULE_deleteUsingTable = 100, RULE_returnStmt = 101, RULE_returnSimple = 102, 
		RULE_returnNext = 103, RULE_returnQuery = 104, RULE_returnQueryExecute = 105, 
		RULE_ifStmt = 106, RULE_ifCondition = 107, RULE_elsifCondition = 108, 
		RULE_caseStmt = 109, RULE_caseExpr = 110, RULE_whenExpressions = 111, 
		RULE_searchExpr = 112, RULE_whenExpr = 113, RULE_loopStmt = 114, RULE_exitStmt = 115, 
		RULE_exitWhenClause = 116, RULE_continueStmt = 117, RULE_continueWhenClause = 118, 
		RULE_whileStmt = 119, RULE_stmts = 120, RULE_stmt = 121;
	public static final String[] ruleNames = {
		"varExpr", "functionCallExpr", "numericConstant", "constantOfOtherTypes", 
		"numericalLiteralExpr", "booleanLiteralExpr", "stringLiteralExpr", "stringValue", 
		"expression", "assignOperator", "condition", "unit", "plFunction", "functionArgsList", 
		"functionArg", "functionReturns", "functionBody", "blockStmt", "exceptionHandlingBlock", 
		"exceptionWhenConditions", "exceptionWhenCondition", "functionSettings", 
		"functionBehavior", "window", "functionInputHandling", "functionSecurity", 
		"functionCosts", "functionRows", "varDeclarationList", "varDeclaration", 
		"aliasDeclaration", "assignStmt", "returningClause", "returningExpressions", 
		"returningOutputExpression", "returningAll", "returningIntoClause", "returningIntoTargets", 
		"returningIntoTarget", "withClause", "withRecursiveClause", "withQueries", 
		"withQuery", "selectStmt", "select", "selectList", "distinctClause", "selectSpecific", 
		"selectAll", "intoClause", "limitClause", "offsetClause", "orderByClause", 
		"orderByItem", "orderByUsing", "nullsOrdering", "fromClause", "joinClause", 
		"tableExpression", "join", "columnAlias", "columnAliasItem", "whereClause", 
		"groupByClause", "havingClause", "bulkOperationClause", "fetchClause", 
		"forClause", "lockedTables", "lockedTable", "performStmt", "executeStmt", 
		"execute", "executeCommand", "executeIntoClause", "executeIntoTargets", 
		"executeIntoTarget", "executeUsingClause", "executeUsingExpression", "insertStmt", 
		"insert", "insertColumnList", "insertColumn", "insertValuesClause", "insertDefaultValues", 
		"insertValues", "insertValueTuple", "updateStmt", "update", "updateSingleSetClause", 
		"updateSingleSetAssignment", "updateMultiSetClause", "updateMultiSetAssignment", 
		"updateMultiSetColumns", "updateMultiSetColumn", "updateMultiSetValues", 
		"updateSetValue", "deleteStmt", "delete", "deleteUsingClause", "deleteUsingTable", 
		"returnStmt", "returnSimple", "returnNext", "returnQuery", "returnQueryExecute", 
		"ifStmt", "ifCondition", "elsifCondition", "caseStmt", "caseExpr", "whenExpressions", 
		"searchExpr", "whenExpr", "loopStmt", "exitStmt", "exitWhenClause", "continueStmt", 
		"continueWhenClause", "whileStmt", "stmts", "stmt"
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
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
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
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(246); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(247); match(8);
			setState(256);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << CASE) | (1L << WITH) | (1L << SELECT))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (CAST - 92)) | (1L << (TRUE - 92)) | (1L << (FALSE - 92)) | (1L << (DOLLAR_QUOTE - 92)) | (1L << (QUOTE - 92)) | (1L << (INTEGER_VALUE - 92)) | (1L << (DECIMAL_VALUE - 92)) | (1L << (ID - 92)) | (1L << (QNAME - 92)) | (1L << (ARRAY_TYPE - 92)) | (1L << (COPY_TYPE - 92)) | (1L << (ROW_TYPE - 92)))) != 0)) {
				{
				setState(248); expression(0);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(249); match(5);
					setState(250); expression(0);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(258); match(4);
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
			setState(267);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(261); match(6);
				setState(262);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
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
				setState(263);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(264); match(QUOTE);
				setState(265);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(266); match(QUOTE);
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
		public StringLiteralExprContext value;
		public TerminalNode AS() { return getToken(PlPgSqlParser.AS, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(PlPgSqlParser.ARRAY_TYPE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(PlPgSqlParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ROW_TYPE() { return getToken(PlPgSqlParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public StringLiteralExprContext stringLiteralExpr() {
			return getRuleContext(StringLiteralExprContext.class,0);
		}
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
			setState(282);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(270); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				}
				break;
			case DOLLAR_QUOTE:
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(272); match(6);
				setState(273);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); match(CAST);
				setState(276); match(8);
				setState(277); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(278); match(AS);
				setState(279);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(280); match(4);
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
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NumericalConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284); numericConstant();
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285); match(INTEGER_VALUE);
				}
				break;

			case 3:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286); match(DECIMAL_VALUE);
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
			setState(292);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(289); match(NOT);
				setState(290); expression(0);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
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

	public static class StringLiteralExprContext extends ParserRuleContext {
		public StringValueContext value;
		public TerminalNode QUOTE(int i) {
			return getToken(PlPgSqlParser.QUOTE, i);
		}
		public List<TerminalNode> DOLLAR_QUOTE() { return getTokens(PlPgSqlParser.DOLLAR_QUOTE); }
		public List<TerminalNode> QUOTE() { return getTokens(PlPgSqlParser.QUOTE); }
		public TerminalNode DOLLAR_QUOTE(int i) {
			return getToken(PlPgSqlParser.DOLLAR_QUOTE, i);
		}
		public StringValueContext stringValue() {
			return getRuleContext(StringValueContext.class,0);
		}
		public StringLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStringLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStringLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStringLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralExprContext stringLiteralExpr() throws RecognitionException {
		StringLiteralExprContext _localctx = new StringLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteralExpr);
		try {
			setState(302);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); match(QUOTE);
				setState(295); ((StringLiteralExprContext)_localctx).value = stringValue();
				setState(296); match(QUOTE);
				}
				break;
			case DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); match(DOLLAR_QUOTE);
				setState(299); ((StringLiteralExprContext)_localctx).value = stringValue();
				setState(300); match(DOLLAR_QUOTE);
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

	public static class StringValueContext extends ParserRuleContext {
		public TerminalNode ESC(int i) {
			return getToken(PlPgSqlParser.ESC, i);
		}
		public List<TerminalNode> ESC() { return getTokens(PlPgSqlParser.ESC); }
		public StringValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValueContext stringValue() throws RecognitionException {
		StringValueContext _localctx = new StringValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stringValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(306);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(304); match(ESC);
						}
						break;

					case 2:
						{
						setState(305);
						matchWildcard();
						}
						break;
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public StringLiteralExprContext stringLiteralExpr() {
			return getRuleContext(StringLiteralExprContext.class,0);
		}
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		public StringLiteralExprContext stringLiteralExpr() {
			return getRuleContext(StringLiteralExprContext.class,0);
		}
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
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(312); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(313); expression(15);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(315); expression(14);
				}
				break;

			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317); match(8);
				setState(318); expression(0);
				setState(319); match(4);
				}
				break;

			case 5:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321); varExpr();
				}
				break;

			case 6:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322); booleanLiteralExpr();
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323); numericalLiteralExpr();
				}
				break;

			case 8:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324); stringLiteralExpr();
				}
				break;

			case 9:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325); constantOfOtherTypes();
				}
				break;

			case 10:
				{
				_localctx = new SubQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326); select();
				}
				break;

			case 11:
				{
				_localctx = new CaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327); caseExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(23 >= _localctx._p)) throw new FailedPredicateException(this, "23 >= $_p");
						setState(331); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(332); expression(24);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(334); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(335); expression(23);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(337); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(338); expression(22);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(340); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(341); expression(21);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(343); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(344); expression(20);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(346); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(347); expression(19);
						}
						break;

					case 7:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(349); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(350); expression(14);
						}
						break;

					case 8:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(352); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(353); expression(13);
						}
						break;

					case 9:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(355); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(356); expression(12);
						}
						break;

					case 10:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(358); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(359); expression(11);
						}
						break;

					case 11:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(361); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(362); expression(10);
						}
						break;

					case 12:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(364); match(3);
						setState(365); expression(8);
						}
						break;

					case 13:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(367); ((InExpressionContext)_localctx).operator = match(IN);
						setState(368); expression(6);
						}
						break;

					case 14:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(370); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(371); expression(5);
						}
						break;

					case 15:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(373); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(374); expression(4);
						}
						break;

					case 16:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(28 >= _localctx._p)) throw new FailedPredicateException(this, "28 >= $_p");
						setState(380); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(376); match(7);
								setState(377); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = expression(0);
								setState(378); match(2);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(382); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 17:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(384);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(386);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(385); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(388); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(389); stringLiteralExpr();
						}
						break;

					case 18:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(390);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(392);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(391); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(394); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR);
						setState(395); match(TO);
						setState(396); stringLiteralExpr();
						}
						break;

					case 19:
						{
						_localctx = new LabelExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(397);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(398); match(AS);
						setState(399); ((LabelExpressionContext)_localctx).label = match(ID);
						}
						break;
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(PlPgSqlParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(PlPgSqlParser.EQ, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN_OP || _la==EQ) ) {
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
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); expression(0);
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
		enterRule(_localctx, 22, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409); plFunction();
				}
				}
				setState(412); 
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
		public TerminalNode OR() { return getToken(PlPgSqlParser.OR, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(PlPgSqlParser.FUNCTION, 0); }
		public TerminalNode REPLACE() { return getToken(PlPgSqlParser.REPLACE, 0); }
		public TerminalNode LANGUAGE_NAME() { return getToken(PlPgSqlParser.LANGUAGE_NAME, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_plFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); match(CREATE);
			setState(417);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(415); match(OR);
				setState(416); match(REPLACE);
				}
			}

			setState(419); match(FUNCTION);
			setState(420); ((PlFunctionContext)_localctx).functionName = match(ID);
			setState(421); match(8);
			setState(422); functionArgsList();
			setState(423); match(4);
			setState(424); functionReturns();
			setState(425); functionBody();
			setState(426); match(LANGUAGE);
			setState(427); match(LANGUAGE_NAME);
			setState(429);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(428); functionSettings();
				}
			}

			setState(431); match(9);
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
		enterRule(_localctx, 26, RULE_functionArgsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (IN - 98)) | (1L << (OUT - 98)) | (1L << (INOUT - 98)) | (1L << (VARIADIC - 98)) | (1L << (ID - 98)))) != 0)) {
				{
				setState(433); functionArg();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(434); match(5);
					setState(435); functionArg();
					}
					}
					setState(440);
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
		enterRule(_localctx, 28, RULE_functionArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (IN - 98)) | (1L << (OUT - 98)) | (1L << (INOUT - 98)) | (1L << (VARIADIC - 98)))) != 0)) {
				{
				setState(443);
				((FunctionArgContext)_localctx).argMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (IN - 98)) | (1L << (OUT - 98)) | (1L << (INOUT - 98)) | (1L << (VARIADIC - 98)))) != 0)) ) {
					((FunctionArgContext)_localctx).argMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(446); ((FunctionArgContext)_localctx).argName = match(ID);
			setState(447);
			((FunctionArgContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)))) != 0)) ) {
				((FunctionArgContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(450);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(448);
				((FunctionArgContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((FunctionArgContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(449); expression(0);
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
		enterRule(_localctx, 30, RULE_functionReturns);
		int _la;
		try {
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452); match(RETURNS);
				setState(453);
				((FunctionReturnsContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
					((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454); match(RETURNS);
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(455);
					((FunctionReturnsContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
						((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(456); ((FunctionReturnsContext)_localctx).outName = match(ID);
					}
					}
					setState(459); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0) );
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
		enterRule(_localctx, 32, RULE_functionBody);
		try {
			setState(471);
			switch (_input.LA(1)) {
			case F_DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(463); match(F_DOLLAR_QUOTE);
				setState(464); blockStmt();
				setState(465); match(DOLLAR_QUOTE);
				}
				break;
			case F_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(467); match(F_QUOTE);
				setState(468); blockStmt();
				setState(469); match(QUOTE);
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
		enterRule(_localctx, 34, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE) {
				{
				{
				setState(473); match(DECLARE);
				setState(474); varDeclarationList();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480); match(BEGIN);
			setState(481); stmts();
			setState(484);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(482); match(EXCEPTION);
				setState(483); exceptionHandlingBlock();
				}
			}

			setState(486); match(END);
			setState(487); match(9);
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
		enterRule(_localctx, 36, RULE_exceptionHandlingBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(489); match(WHEN);
				setState(490); exceptionWhenConditions();
				setState(491); match(THEN);
				setState(492); stmts();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499); stmts();
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
		enterRule(_localctx, 38, RULE_exceptionWhenConditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); exceptionWhenCondition();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(502); match(OR);
				setState(503); exceptionWhenCondition();
				}
				}
				setState(508);
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
		enterRule(_localctx, 40, RULE_exceptionWhenCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); expression(0);
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
		enterRule(_localctx, 42, RULE_functionSettings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); window();
			setState(512); functionBehavior();
			setState(513); functionInputHandling();
			setState(514); functionSecurity();
			setState(515); functionCosts();
			setState(516); functionRows();
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
		enterRule(_localctx, 44, RULE_functionBehavior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (IMMUTABLE - 117)) | (1L << (STABLE - 117)) | (1L << (VOLATILE - 117)))) != 0)) ) {
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
		enterRule(_localctx, 46, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); match(WINDOW);
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
		enterRule(_localctx, 48, RULE_functionInputHandling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (STRICT - 81)) | (1L << (CALLED_ON_NULL_INPUT - 81)) | (1L << (RETURNS_NULL_ON_NULL_INPUT - 81)))) != 0)) ) {
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
		enterRule(_localctx, 50, RULE_functionSecurity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
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
		enterRule(_localctx, 52, RULE_functionCosts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); match(COST);
			setState(527); ((FunctionCostsContext)_localctx).value = match(INTEGER_VALUE);
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
		enterRule(_localctx, 54, RULE_functionRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(ROWS);
			setState(530); ((FunctionRowsContext)_localctx).value = match(INTEGER_VALUE);
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
		enterRule(_localctx, 56, RULE_varDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(534);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(532); varDeclaration();
					}
					break;

				case 2:
					{
					setState(533); aliasDeclaration();
					}
					break;
				}
				}
				setState(538);
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
		enterRule(_localctx, 58, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); ((VarDeclarationContext)_localctx).varName = match(ID);
			setState(541);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(540); match(CONSTANT);
				}
			}

			setState(543);
			((VarDeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (ID - 139)) | (1L << (QNAME - 139)) | (1L << (ARRAY_TYPE - 139)) | (1L << (COPY_TYPE - 139)) | (1L << (ROW_TYPE - 139)))) != 0)) ) {
				((VarDeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(546);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(544); match(COLLATE);
				setState(545); ((VarDeclarationContext)_localctx).collationName = match(ID);
				}
			}

			setState(550);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(548); match(NOT);
				setState(549); match(NULL);
				}
			}

			setState(554);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(552);
				((VarDeclarationContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((VarDeclarationContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(553); expression(0);
				}
			}

			setState(556); match(9);
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
		enterRule(_localctx, 60, RULE_aliasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); ((AliasDeclarationContext)_localctx).newVarName = match(ID);
			setState(559); match(ALIAS);
			setState(560); match(FOR);
			setState(561); ((AliasDeclarationContext)_localctx).oldVarName = match(ID);
			setState(562); match(9);
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
		public ExpressionContext receiver;
		public ExpressionContext value;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
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
		enterRule(_localctx, 62, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); ((AssignStmtContext)_localctx).receiver = expression(0);
			setState(565); assignOperator();
			setState(566); ((AssignStmtContext)_localctx).value = expression(0);
			setState(567); match(9);
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
		enterRule(_localctx, 64, RULE_returningClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); match(RETURNING);
			setState(572);
			switch (_input.LA(1)) {
			case 8:
			case NOT:
			case ADD:
			case SUB:
			case CASE:
			case WITH:
			case SELECT:
			case CAST:
			case TRUE:
			case FALSE:
			case DOLLAR_QUOTE:
			case QUOTE:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				{
				setState(570); returningExpressions();
				}
				break;
			case MUL:
				{
				setState(571); returningAll();
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
		enterRule(_localctx, 66, RULE_returningExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); returningOutputExpression();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(575); match(5);
				setState(576); returningOutputExpression();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(582); returningIntoClause();
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
		enterRule(_localctx, 68, RULE_returningOutputExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); expression(0);
			setState(588);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(586); match(AS);
				setState(587); ((ReturningOutputExpressionContext)_localctx).aliasName = match(ID);
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
		enterRule(_localctx, 70, RULE_returningAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); match(MUL);
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
		enterRule(_localctx, 72, RULE_returningIntoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); match(INTO);
			setState(594);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(593); ((ReturningIntoClauseContext)_localctx).hasStrict = match(STRICT);
				}
			}

			setState(596); returningIntoTargets();
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
		enterRule(_localctx, 74, RULE_returningIntoTargets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598); returningIntoTarget();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(599); match(5);
				setState(600); returningIntoTarget();
				}
				}
				setState(605);
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
		enterRule(_localctx, 76, RULE_returningIntoTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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
		enterRule(_localctx, 78, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); match(WITH);
			setState(609); withQueries();
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
		enterRule(_localctx, 80, RULE_withRecursiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611); match(WITH);
			setState(612); match(RECURSIVE);
			setState(613); withQueries();
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
		enterRule(_localctx, 82, RULE_withQueries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615); withQuery();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(616); match(5);
				setState(617); withQuery();
				}
				}
				setState(622);
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
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
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
		enterRule(_localctx, 84, RULE_withQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); ((WithQueryContext)_localctx).withTempTable = match(ID);
			setState(624); match(AS);
			setState(625); match(8);
			setState(626); select();
			setState(627); match(4);
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
		enterRule(_localctx, 86, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); select();
			setState(630); match(9);
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
		enterRule(_localctx, 88, RULE_select);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(632); withClause();
				}
			}

			setState(635); match(SELECT);
			setState(636); selectList();
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(638);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(637); intoClause();
					}
				}

				setState(640); fromClause();
				setState(644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(641); joinClause();
						}
						} 
					}
					setState(646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(648);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(647); whereClause();
					}
					break;
				}
				setState(651);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(650); groupByClause();
					}
					break;
				}
				setState(654);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(653); havingClause();
					}
					break;
				}
				setState(657);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(656); bulkOperationClause();
					}
					break;
				}
				setState(660);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(659); orderByClause();
					}
					break;
				}
				setState(663);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(662); limitClause();
					}
					break;
				}
				setState(666);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(665); offsetClause();
					}
					break;
				}
				setState(669);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(668); fetchClause();
					}
					break;
				}
				setState(672);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(671); forClause();
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
		enterRule(_localctx, 90, RULE_selectList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(676); match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(677); distinctClause();
				}
				break;
			case 8:
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
			case DOLLAR_QUOTE:
			case QUOTE:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(682);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(680); selectAll();
				}
				break;
			case 8:
			case NOT:
			case ADD:
			case SUB:
			case CASE:
			case WITH:
			case SELECT:
			case CAST:
			case TRUE:
			case FALSE:
			case DOLLAR_QUOTE:
			case QUOTE:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				{
				setState(681); selectSpecific();
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
		enterRule(_localctx, 92, RULE_distinctClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684); match(DISTINCT);
			setState(685); match(ON);
			setState(686); expression(0);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(687); match(5);
				setState(688); expression(0);
				}
				}
				setState(693);
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
		enterRule(_localctx, 94, RULE_selectSpecific);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694); expression(0);
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(695); match(5);
					setState(696); expression(0);
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 96, RULE_selectAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); match(MUL);
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
		enterRule(_localctx, 98, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); match(INTO);
			setState(706);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(705); ((IntoClauseContext)_localctx).strict = match(STRICT);
				}
			}

			setState(708); ((IntoClauseContext)_localctx).target = match(ID);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(709); match(5);
				setState(710); ((IntoClauseContext)_localctx).target = match(ID);
				}
				}
				setState(715);
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
		enterRule(_localctx, 100, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716); match(LIMIT);
			setState(717);
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
		enterRule(_localctx, 102, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719); match(OFFSET);
			setState(720); ((OffsetClauseContext)_localctx).offset = match(INTEGER_VALUE);
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(721);
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
		enterRule(_localctx, 104, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724); match(ORDER_BY);
			setState(725); orderByItem();
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(726); match(5);
					setState(727); orderByItem();
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 106, RULE_orderByItem);
		int _la;
		try {
			setState(745);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new StandardOrderingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(733); expression(0);
				setState(735);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(734);
					((StandardOrderingContext)_localctx).ordering = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
						((StandardOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(738);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(737); nullsOrdering();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new UsingOrderingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(740); expression(0);
				setState(741); orderByUsing();
				setState(743);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(742); nullsOrdering();
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
		enterRule(_localctx, 108, RULE_orderByUsing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); match(USING);
			setState(748);
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
		enterRule(_localctx, 110, RULE_nullsOrdering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750); match(NULLS);
			setState(751);
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
		enterRule(_localctx, 112, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(753); match(FROM);
			setState(754); tableExpression();
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(755); match(5);
					setState(756); tableExpression();
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 114, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(762); match(NATURAL);
				}
			}

			setState(765); join();
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
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
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
		enterRule(_localctx, 116, RULE_tableExpression);
		int _la;
		try {
			setState(791);
			switch (_input.LA(1)) {
			case ONLY:
			case ID:
			case QNAME:
				_localctx = new FromTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(767); ((FromTableContext)_localctx).only = match(ONLY);
					}
				}

				setState(770);
				((FromTableContext)_localctx).tableName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FromTableContext)_localctx).tableName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(772);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(771); match(MUL);
					}
					break;
				}
				setState(779);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(775);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(774); match(AS);
						}
					}

					setState(777); ((FromTableContext)_localctx).alias = match(ID);
					setState(778); columnAlias();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new FromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(781); match(8);
				setState(782); select();
				setState(783); match(4);
				setState(785);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(784); match(AS);
					}
				}

				setState(787); ((FromSelectContext)_localctx).alias = match(ID);
				setState(789);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(788); columnAlias();
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
		enterRule(_localctx, 118, RULE_join);
		int _la;
		try {
			setState(838);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(793); match(INNER);
					}
				}

				setState(796); match(JOIN);
				setState(797);
				((InnerJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((InnerJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(798); match(ON);
				setState(799); condition();
				}
				break;

			case 2:
				_localctx = new LeftOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(800); match(LEFT);
				setState(801); match(OUTER);
				setState(802); match(JOIN);
				setState(803);
				((LeftOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(804); match(ON);
				setState(805); condition();
				}
				break;

			case 3:
				_localctx = new LeftJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(806); match(LEFT);
				setState(807); match(JOIN);
				setState(808);
				((LeftJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(809); match(ON);
				setState(810); condition();
				}
				break;

			case 4:
				_localctx = new RightOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(811); match(RIGHT);
				setState(812); match(OUTER);
				setState(813); match(JOIN);
				setState(814);
				((RightOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(815); match(ON);
				setState(816); condition();
				}
				break;

			case 5:
				_localctx = new RightJoinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(817); match(RIGHT);
				setState(818); match(JOIN);
				setState(819);
				((RightJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(820); match(ON);
				setState(821); condition();
				}
				break;

			case 6:
				_localctx = new FullJoinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(822); match(FULL);
				setState(823); match(OUTER);
				setState(824); match(JOIN);
				setState(825);
				((FullJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(826); match(ON);
				setState(827); condition();
				}
				break;

			case 7:
				_localctx = new FullOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(828); match(FULL);
				setState(829); match(JOIN);
				setState(830);
				((FullOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(831); match(ON);
				setState(832); condition();
				}
				break;

			case 8:
				_localctx = new CrossJoinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(833); match(CROSS);
				setState(834); match(JOIN);
				setState(835);
				((CrossJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((CrossJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(836); match(ON);
				setState(837); condition();
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
		public List<ColumnAliasItemContext> columnAliasItem() {
			return getRuleContexts(ColumnAliasItemContext.class);
		}
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
		enterRule(_localctx, 120, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840); match(8);
			setState(841); columnAliasItem();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(842); match(5);
				setState(843); columnAliasItem();
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849); match(4);
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
		enterRule(_localctx, 122, RULE_columnAliasItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851); match(ID);
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
		enterRule(_localctx, 124, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853); match(WHERE);
			setState(854); condition();
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
		enterRule(_localctx, 126, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); match(GROUP_BY);
			setState(857); expression(0);
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
		enterRule(_localctx, 128, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859); match(HAVING);
			setState(860); condition();
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
		enterRule(_localctx, 130, RULE_bulkOperationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			((BulkOperationClauseContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (UNION - 82)) | (1L << (INTERSECT - 82)) | (1L << (EXCEPT - 82)))) != 0)) ) {
				((BulkOperationClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(863);
			((BulkOperationClauseContext)_localctx).selectMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
				((BulkOperationClauseContext)_localctx).selectMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(864); select();
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
		enterRule(_localctx, 132, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866); match(FETCH);
			setState(868);
			_la = _input.LA(1);
			if (_la==FIRST || _la==NEXT) {
				{
				setState(867);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(871);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(870); ((FetchClauseContext)_localctx).count = match(INTEGER_VALUE);
				}
			}

			setState(874);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(873);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(876); match(ONLY);
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
		enterRule(_localctx, 134, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878); match(FOR);
			setState(879);
			((ForClauseContext)_localctx).lockMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==SHARE) ) {
				((ForClauseContext)_localctx).lockMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(881);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(880); lockedTables();
				}
				break;
			}
			setState(884);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(883); ((ForClauseContext)_localctx).nowait = match(NOWAIT);
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
		enterRule(_localctx, 136, RULE_lockedTables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886); match(OF);
			setState(887); lockedTable();
			setState(892);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(888); match(5);
					setState(889); lockedTable();
					}
					} 
				}
				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		enterRule(_localctx, 138, RULE_lockedTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895); match(ID);
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
		enterRule(_localctx, 140, RULE_performStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897); match(PERFORM);
			setState(898); selectList();
			setState(933);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(899); fromClause();
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JOIN) | (1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << FULL) | (1L << CROSS) | (1L << NATURAL))) != 0)) {
					{
					{
					setState(900); joinClause();
					}
					}
					setState(905);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(907);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(906); whereClause();
					}
				}

				setState(910);
				_la = _input.LA(1);
				if (_la==GROUP_BY) {
					{
					setState(909); groupByClause();
					}
				}

				setState(913);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(912); havingClause();
					}
				}

				setState(916);
				_la = _input.LA(1);
				if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (UNION - 82)) | (1L << (INTERSECT - 82)) | (1L << (EXCEPT - 82)))) != 0)) {
					{
					setState(915); bulkOperationClause();
					}
				}

				setState(919);
				_la = _input.LA(1);
				if (_la==ORDER_BY) {
					{
					setState(918); orderByClause();
					}
				}

				setState(922);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(921); limitClause();
					}
				}

				setState(925);
				_la = _input.LA(1);
				if (_la==OFFSET) {
					{
					setState(924); offsetClause();
					}
				}

				setState(928);
				_la = _input.LA(1);
				if (_la==FETCH) {
					{
					setState(927); fetchClause();
					}
				}

				setState(931);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(930); forClause();
					}
				}

				}
			}

			setState(935); match(9);
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
		enterRule(_localctx, 142, RULE_executeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937); execute();
			setState(938); match(9);
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
		enterRule(_localctx, 144, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940); match(EXECUTE);
			setState(941); executeCommand();
			setState(943);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(942); executeIntoClause();
				}
			}

			setState(946);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(945); executeUsingClause();
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
		public StringLiteralExprContext stringLiteralExpr() {
			return getRuleContext(StringLiteralExprContext.class,0);
		}
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
		enterRule(_localctx, 146, RULE_executeCommand);
		try {
			setState(950);
			switch (_input.LA(1)) {
			case DOLLAR_QUOTE:
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(948); stringLiteralExpr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(949); functionCallExpr();
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
		enterRule(_localctx, 148, RULE_executeIntoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952); match(INTO);
			setState(954);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(953); ((ExecuteIntoClauseContext)_localctx).hasStrict = match(STRICT);
				}
			}

			setState(956); executeIntoTargets();
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
		enterRule(_localctx, 150, RULE_executeIntoTargets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958); executeIntoTarget();
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(959); match(5);
				setState(960); executeIntoTarget();
				}
				}
				setState(965);
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
		enterRule(_localctx, 152, RULE_executeIntoTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
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
		enterRule(_localctx, 154, RULE_executeUsingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968); match(USING);
			setState(969); executeUsingExpression();
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(970); match(5);
				setState(971); executeUsingExpression();
				}
				}
				setState(976);
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
		enterRule(_localctx, 156, RULE_executeUsingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977); expression(0);
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
		enterRule(_localctx, 158, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979); insert();
			setState(980); match(9);
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
		enterRule(_localctx, 160, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(982); withClause();
				}
			}

			setState(985); match(INSERT);
			setState(986); match(INTO);
			setState(987);
			((InsertContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((InsertContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(989);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(988); insertColumnList();
				}
			}

			setState(993);
			switch (_input.LA(1)) {
			case VALUES:
			case DEFAULT:
				{
				setState(991); insertValuesClause();
				}
				break;
			case WITH:
			case SELECT:
				{
				setState(992); select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(996);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(995); returningClause();
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
		public InsertColumnContext insertColumn(int i) {
			return getRuleContext(InsertColumnContext.class,i);
		}
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
		enterRule(_localctx, 162, RULE_insertColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998); match(8);
			setState(999); insertColumn();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1000); match(5);
				setState(1001); insertColumn();
				}
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1007); match(4);
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
		enterRule(_localctx, 164, RULE_insertColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009); ((InsertColumnContext)_localctx).column = match(ID);
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
		enterRule(_localctx, 166, RULE_insertValuesClause);
		try {
			setState(1013);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011); insertDefaultValues();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012); insertValues();
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
		enterRule(_localctx, 168, RULE_insertDefaultValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015); match(DEFAULT);
			setState(1016); match(VALUES);
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
		enterRule(_localctx, 170, RULE_insertValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018); match(VALUES);
			setState(1019); insertValueTuple();
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1020); match(5);
				setState(1021); insertValueTuple();
				}
				}
				setState(1026);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
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
		enterRule(_localctx, 172, RULE_insertValueTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027); match(8);
			setState(1028); expression(0);
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1029); match(5);
				setState(1030); expression(0);
				}
				}
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1036); match(4);
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
		enterRule(_localctx, 174, RULE_updateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038); update();
			setState(1039); match(9);
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
		enterRule(_localctx, 176, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1041); withClause();
				}
			}

			setState(1044); match(UPDATE);
			setState(1046);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1045); ((UpdateContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(1048);
			((UpdateContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(1050);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1049); ((UpdateContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(1054);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1052); match(AS);
				setState(1053); ((UpdateContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(1056); match(SET);
			setState(1059);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
				{
				setState(1057); updateSingleSetClause();
				}
				break;
			case 8:
				{
				setState(1058); updateMultiSetClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1062);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1061); fromClause();
				}
			}

			setState(1065);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1064); whereClause();
				}
			}

			setState(1068);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1067); returningClause();
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
		enterRule(_localctx, 178, RULE_updateSingleSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070); updateSingleSetAssignment();
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1071); match(5);
				setState(1072); updateSingleSetAssignment();
				}
				}
				setState(1077);
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
		enterRule(_localctx, 180, RULE_updateSingleSetAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			((UpdateSingleSetAssignmentContext)_localctx).column = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateSingleSetAssignmentContext)_localctx).column = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(1079); match(EQ);
			setState(1080); updateSetValue();
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
		enterRule(_localctx, 182, RULE_updateMultiSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082); updateMultiSetAssignment();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1083); match(5);
				setState(1084); updateMultiSetAssignment();
				}
				}
				setState(1089);
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
		enterRule(_localctx, 184, RULE_updateMultiSetAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090); match(8);
			setState(1091); updateMultiSetColumns();
			setState(1092); match(4);
			setState(1093); match(EQ);
			setState(1094); match(8);
			setState(1095); updateMultiSetValues();
			setState(1096); match(4);
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
		enterRule(_localctx, 186, RULE_updateMultiSetColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098); updateMultiSetColumn();
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1099); match(5);
				setState(1100); updateMultiSetColumn();
				}
				}
				setState(1105);
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
		enterRule(_localctx, 188, RULE_updateMultiSetColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
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
		enterRule(_localctx, 190, RULE_updateMultiSetValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); updateSetValue();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1109); match(5);
				setState(1110); updateSetValue();
				}
				}
				setState(1115);
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
		enterRule(_localctx, 192, RULE_updateSetValue);
		int _la;
		try {
			setState(1119);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1116); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
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
				setState(1118); ((UpdateSetValueContext)_localctx).hasDefault = match(DEFAULT);
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
		enterRule(_localctx, 194, RULE_deleteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121); delete();
			setState(1122); match(9);
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
		enterRule(_localctx, 196, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1124); withClause();
				}
			}

			setState(1127); match(DELETE);
			setState(1128); match(FROM);
			setState(1130);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(1129); ((DeleteContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(1132);
			((DeleteContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((DeleteContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(1134);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1133); ((DeleteContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(1138);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1136); match(AS);
				setState(1137); ((DeleteContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(1141);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1140); deleteUsingClause();
				}
			}

			setState(1144);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1143); whereClause();
				}
			}

			setState(1147);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1146); returningClause();
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
		enterRule(_localctx, 198, RULE_deleteUsingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149); match(USING);
			setState(1150); deleteUsingTable();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1151); match(5);
				setState(1152); deleteUsingTable();
				}
				}
				setState(1157);
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
		enterRule(_localctx, 200, RULE_deleteUsingTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
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
		enterRule(_localctx, 202, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1160); returnSimple();
				}
				break;

			case 2:
				{
				setState(1161); returnNext();
				}
				break;

			case 3:
				{
				setState(1162); returnQuery();
				}
				break;

			case 4:
				{
				setState(1163); returnQueryExecute();
				}
				break;
			}
			setState(1166); match(9);
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
		enterRule(_localctx, 204, RULE_returnSimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168); match(RETURN);
			setState(1170);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << CASE) | (1L << WITH) | (1L << SELECT))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (CAST - 92)) | (1L << (TRUE - 92)) | (1L << (FALSE - 92)) | (1L << (DOLLAR_QUOTE - 92)) | (1L << (QUOTE - 92)) | (1L << (INTEGER_VALUE - 92)) | (1L << (DECIMAL_VALUE - 92)) | (1L << (ID - 92)) | (1L << (QNAME - 92)) | (1L << (ARRAY_TYPE - 92)) | (1L << (COPY_TYPE - 92)) | (1L << (ROW_TYPE - 92)))) != 0)) {
				{
				setState(1169); expression(0);
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
		enterRule(_localctx, 206, RULE_returnNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172); match(RETURN);
			setState(1173); match(NEXT);
			setState(1174); expression(0);
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
		enterRule(_localctx, 208, RULE_returnQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176); match(RETURN);
			setState(1177); match(QUERY);
			setState(1178); select();
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
		enterRule(_localctx, 210, RULE_returnQueryExecute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180); match(RETURN);
			setState(1181); match(QUERY);
			setState(1182); execute();
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
		enterRule(_localctx, 212, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184); match(IF);
			setState(1185); ifCondition();
			setState(1186); match(THEN);
			setState(1187); stmts();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(1188); match(ELSIF);
				setState(1189); elsifCondition();
				setState(1190); match(THEN);
				setState(1191); stmts();
				}
				}
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1200);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1198); match(ELSE);
				setState(1199); stmts();
				}
			}

			setState(1202); match(END);
			setState(1203); match(IF);
			setState(1204); match(9);
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
		enterRule(_localctx, 214, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206); condition();
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
		enterRule(_localctx, 216, RULE_elsifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208); condition();
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
		enterRule(_localctx, 218, RULE_caseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210); caseExpr();
			setState(1211); match(9);
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
		enterRule(_localctx, 220, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213); match(CASE);
			setState(1215);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << CASE) | (1L << WITH) | (1L << SELECT))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (CAST - 92)) | (1L << (TRUE - 92)) | (1L << (FALSE - 92)) | (1L << (DOLLAR_QUOTE - 92)) | (1L << (QUOTE - 92)) | (1L << (INTEGER_VALUE - 92)) | (1L << (DECIMAL_VALUE - 92)) | (1L << (ID - 92)) | (1L << (QNAME - 92)) | (1L << (ARRAY_TYPE - 92)) | (1L << (COPY_TYPE - 92)) | (1L << (ROW_TYPE - 92)))) != 0)) {
				{
				setState(1214); searchExpr();
				}
			}

			setState(1222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1217); match(WHEN);
				setState(1218); whenExpressions();
				setState(1219); match(THEN);
				setState(1220); stmts();
				}
				}
				setState(1224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1228);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1226); match(ELSE);
				setState(1227); stmts();
				}
			}

			setState(1230); match(END);
			setState(1231); match(CASE);
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
		enterRule(_localctx, 222, RULE_whenExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233); whenExpr();
			setState(1238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(1234); match(5);
				setState(1235); whenExpr();
				}
				}
				setState(1240);
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
		enterRule(_localctx, 224, RULE_searchExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241); expression(0);
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
		enterRule(_localctx, 226, RULE_whenExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243); expression(0);
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
		enterRule(_localctx, 228, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1245); match(1);
				setState(1246); ((LoopStmtContext)_localctx).firstLabel = match(ID);
				setState(1247); match(10);
				}
			}

			setState(1250); match(LOOP);
			setState(1251); stmts();
			setState(1252); match(END);
			setState(1253); match(LOOP);
			setState(1255);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1254); ((LoopStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1257); match(9);
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
		enterRule(_localctx, 230, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259); match(EXIT);
			setState(1261);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1260); ((ExitStmtContext)_localctx).targetLabel = match(ID);
				}
			}

			setState(1264);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1263); exitWhenClause();
				}
			}

			setState(1266); match(9);
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
		enterRule(_localctx, 232, RULE_exitWhenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268); match(WHEN);
			setState(1269); condition();
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
		enterRule(_localctx, 234, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271); match(CONTINUE);
			setState(1273);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1272); ((ContinueStmtContext)_localctx).targetLabel = match(ID);
				}
			}

			setState(1276);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1275); continueWhenClause();
				}
			}

			setState(1278); match(9);
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
		enterRule(_localctx, 236, RULE_continueWhenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280); match(WHEN);
			setState(1281); condition();
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
		enterRule(_localctx, 238, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(1283); match(1);
				setState(1284); ((WhileStmtContext)_localctx).firstLabel = match(ID);
				setState(1285); match(10);
				}
			}

			setState(1288); match(WHILE);
			setState(1289); condition();
			setState(1290); match(LOOP);
			setState(1291); stmts();
			setState(1292); match(END);
			setState(1293); match(LOOP);
			setState(1295);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(1294); ((WhileStmtContext)_localctx).lastLabel = match(ID);
				}
			}

			setState(1297); match(9);
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
		enterRule(_localctx, 240, RULE_stmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1299); stmt();
					}
					} 
				}
				setState(1304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
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
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
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
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
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
		enterRule(_localctx, 242, RULE_stmt);
		try {
			setState(1320);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305); selectStmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306); insertStmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1307); updateStmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308); deleteStmt();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1309); blockStmt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1310); assignStmt();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1311); performStmt();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1312); executeStmt();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1313); returnStmt();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1314); ifStmt();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1315); caseStmt();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1316); loopStmt();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1317); exitStmt();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1318); continueStmt();
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1319); whileStmt();
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
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 23 >= _localctx._p;

		case 1: return 22 >= _localctx._p;

		case 2: return 21 >= _localctx._p;

		case 3: return 20 >= _localctx._p;

		case 4: return 19 >= _localctx._p;

		case 5: return 18 >= _localctx._p;

		case 6: return 13 >= _localctx._p;

		case 7: return 12 >= _localctx._p;

		case 8: return 11 >= _localctx._p;

		case 9: return 10 >= _localctx._p;

		case 10: return 9 >= _localctx._p;

		case 11: return 8 >= _localctx._p;

		case 12: return 5 >= _localctx._p;

		case 13: return 4 >= _localctx._p;

		case 14: return 3 >= _localctx._p;

		case 15: return 28 >= _localctx._p;

		case 17: return 16 >= _localctx._p;

		case 16: return 17 >= _localctx._p;

		case 18: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0095\u052d\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\u00fe\n\3"+
		"\f\3\16\3\u0101\13\3\5\3\u0103\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u010e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u011d\n\5\3\6\3\6\3\6\5\6\u0122\n\6\3\7\3\7\3\7\5\7\u0127\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0131\n\b\3\t\3\t\7\t\u0135\n\t\f\t\16\t"+
		"\u0138\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u014b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\6\n\u017f\n\n\r\n\16\n\u0180\3\n\3\n\5\n\u0185\n\n\3\n"+
		"\3\n\3\n\3\n\5\n\u018b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0193\n\n\f\n\16"+
		"\n\u0196\13\n\3\13\3\13\3\f\3\f\3\r\6\r\u019d\n\r\r\r\16\r\u019e\3\16"+
		"\3\16\3\16\5\16\u01a4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u01b0\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u01b7\n\17\f\17\16"+
		"\17\u01ba\13\17\5\17\u01bc\n\17\3\20\5\20\u01bf\n\20\3\20\3\20\3\20\3"+
		"\20\5\20\u01c5\n\20\3\21\3\21\3\21\3\21\3\21\6\21\u01cc\n\21\r\21\16\21"+
		"\u01cd\5\21\u01d0\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01da"+
		"\n\22\3\23\3\23\7\23\u01de\n\23\f\23\16\23\u01e1\13\23\3\23\3\23\3\23"+
		"\3\23\5\23\u01e7\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u01f1"+
		"\n\24\f\24\16\24\u01f4\13\24\3\24\3\24\3\25\3\25\3\25\7\25\u01fb\n\25"+
		"\f\25\16\25\u01fe\13\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\7\36\u0219\n\36\f\36\16\36\u021c\13\36\3\37\3\37\5\37\u0220\n"+
		"\37\3\37\3\37\3\37\5\37\u0225\n\37\3\37\3\37\5\37\u0229\n\37\3\37\3\37"+
		"\5\37\u022d\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\5\"\u023f\n\"\3#\3#\3#\7#\u0244\n#\f#\16#\u0247\13#\3#\5#\u024a\n#"+
		"\3$\3$\3$\5$\u024f\n$\3%\3%\3&\3&\5&\u0255\n&\3&\3&\3\'\3\'\3\'\7\'\u025c"+
		"\n\'\f\'\16\'\u025f\13\'\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\7+\u026d"+
		"\n+\f+\16+\u0270\13+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\5.\u027c\n.\3.\3.\3"+
		".\5.\u0281\n.\3.\3.\7.\u0285\n.\f.\16.\u0288\13.\3.\5.\u028b\n.\3.\5."+
		"\u028e\n.\3.\5.\u0291\n.\3.\5.\u0294\n.\3.\5.\u0297\n.\3.\5.\u029a\n."+
		"\3.\5.\u029d\n.\3.\5.\u02a0\n.\3.\5.\u02a3\n.\5.\u02a5\n.\3/\3/\5/\u02a9"+
		"\n/\3/\3/\5/\u02ad\n/\3\60\3\60\3\60\3\60\3\60\7\60\u02b4\n\60\f\60\16"+
		"\60\u02b7\13\60\3\61\3\61\3\61\7\61\u02bc\n\61\f\61\16\61\u02bf\13\61"+
		"\3\62\3\62\3\63\3\63\5\63\u02c5\n\63\3\63\3\63\3\63\7\63\u02ca\n\63\f"+
		"\63\16\63\u02cd\13\63\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u02d5\n\65\3"+
		"\66\3\66\3\66\3\66\7\66\u02db\n\66\f\66\16\66\u02de\13\66\3\67\3\67\5"+
		"\67\u02e2\n\67\3\67\5\67\u02e5\n\67\3\67\3\67\3\67\5\67\u02ea\n\67\5\67"+
		"\u02ec\n\67\38\38\38\39\39\39\3:\3:\3:\3:\7:\u02f8\n:\f:\16:\u02fb\13"+
		":\3;\5;\u02fe\n;\3;\3;\3<\5<\u0303\n<\3<\3<\5<\u0307\n<\3<\5<\u030a\n"+
		"<\3<\3<\5<\u030e\n<\3<\3<\3<\3<\5<\u0314\n<\3<\3<\5<\u0318\n<\5<\u031a"+
		"\n<\3=\5=\u031d\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\5=\u0349\n=\3>\3>\3>\3>\7>\u034f\n>\f>\16>\u0352\13>\3>\3>\3?\3"+
		"?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3C\3D\3D\5D\u0367\nD\3D\5D\u036a"+
		"\nD\3D\5D\u036d\nD\3D\3D\3E\3E\3E\5E\u0374\nE\3E\5E\u0377\nE\3F\3F\3F"+
		"\3F\7F\u037d\nF\fF\16F\u0380\13F\3G\3G\3H\3H\3H\3H\7H\u0388\nH\fH\16H"+
		"\u038b\13H\3H\5H\u038e\nH\3H\5H\u0391\nH\3H\5H\u0394\nH\3H\5H\u0397\n"+
		"H\3H\5H\u039a\nH\3H\5H\u039d\nH\3H\5H\u03a0\nH\3H\5H\u03a3\nH\3H\5H\u03a6"+
		"\nH\5H\u03a8\nH\3H\3H\3I\3I\3I\3J\3J\3J\5J\u03b2\nJ\3J\5J\u03b5\nJ\3K"+
		"\3K\5K\u03b9\nK\3L\3L\5L\u03bd\nL\3L\3L\3M\3M\3M\7M\u03c4\nM\fM\16M\u03c7"+
		"\13M\3N\3N\3O\3O\3O\3O\7O\u03cf\nO\fO\16O\u03d2\13O\3P\3P\3Q\3Q\3Q\3R"+
		"\5R\u03da\nR\3R\3R\3R\3R\5R\u03e0\nR\3R\3R\5R\u03e4\nR\3R\5R\u03e7\nR"+
		"\3S\3S\3S\3S\7S\u03ed\nS\fS\16S\u03f0\13S\3S\3S\3T\3T\3U\3U\5U\u03f8\n"+
		"U\3V\3V\3V\3W\3W\3W\3W\7W\u0401\nW\fW\16W\u0404\13W\3X\3X\3X\3X\7X\u040a"+
		"\nX\fX\16X\u040d\13X\3X\3X\3Y\3Y\3Y\3Z\5Z\u0415\nZ\3Z\3Z\5Z\u0419\nZ\3"+
		"Z\3Z\5Z\u041d\nZ\3Z\3Z\5Z\u0421\nZ\3Z\3Z\3Z\5Z\u0426\nZ\3Z\5Z\u0429\n"+
		"Z\3Z\5Z\u042c\nZ\3Z\5Z\u042f\nZ\3[\3[\3[\7[\u0434\n[\f[\16[\u0437\13["+
		"\3\\\3\\\3\\\3\\\3]\3]\3]\7]\u0440\n]\f]\16]\u0443\13]\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3_\3_\3_\7_\u0450\n_\f_\16_\u0453\13_\3`\3`\3a\3a\3a\7a\u045a"+
		"\na\fa\16a\u045d\13a\3b\3b\3b\5b\u0462\nb\3c\3c\3c\3d\5d\u0468\nd\3d\3"+
		"d\3d\5d\u046d\nd\3d\3d\5d\u0471\nd\3d\3d\5d\u0475\nd\3d\5d\u0478\nd\3"+
		"d\5d\u047b\nd\3d\5d\u047e\nd\3e\3e\3e\3e\7e\u0484\ne\fe\16e\u0487\13e"+
		"\3f\3f\3g\3g\3g\3g\5g\u048f\ng\3g\3g\3h\3h\5h\u0495\nh\3i\3i\3i\3i\3j"+
		"\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\7l\u04ac\nl\fl\16l\u04af"+
		"\13l\3l\3l\5l\u04b3\nl\3l\3l\3l\3l\3m\3m\3n\3n\3o\3o\3o\3p\3p\5p\u04c2"+
		"\np\3p\3p\3p\3p\3p\6p\u04c9\np\rp\16p\u04ca\3p\3p\5p\u04cf\np\3p\3p\3"+
		"p\3q\3q\3q\7q\u04d7\nq\fq\16q\u04da\13q\3r\3r\3s\3s\3t\3t\3t\5t\u04e3"+
		"\nt\3t\3t\3t\3t\3t\5t\u04ea\nt\3t\3t\3u\3u\5u\u04f0\nu\3u\5u\u04f3\nu"+
		"\3u\3u\3v\3v\3v\3w\3w\5w\u04fc\nw\3w\5w\u04ff\nw\3w\3w\3x\3x\3x\3y\3y"+
		"\3y\5y\u0509\ny\3y\3y\3y\3y\3y\3y\3y\5y\u0512\ny\3y\3y\3z\7z\u0517\nz"+
		"\fz\16z\u051a\13z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u052b"+
		"\n{\3{\3\u0136|\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\2\26\3\2\u008d\u008e\3\2\u008b\u008c"+
		"\3\2\u008d\u0091\3\2\u0084\u0085\4\2\22\22\35\35\3\2dg\3\2\u008d\u008f"+
		"\5\2\22\22\35\35mm\3\2wy\4\2SSz{\3\2~\177\4\2??\u008b\u008b\3\2JK\3\2"+
		"WX\3\2\37\"\4\2[[]]\3\2TV\3\2?@\3\2[\\\3\2NO\u057a\2\u00f6\3\2\2\2\4\u00f8"+
		"\3\2\2\2\6\u010d\3\2\2\2\b\u011c\3\2\2\2\n\u0121\3\2\2\2\f\u0126\3\2\2"+
		"\2\16\u0130\3\2\2\2\20\u0136\3\2\2\2\22\u014a\3\2\2\2\24\u0197\3\2\2\2"+
		"\26\u0199\3\2\2\2\30\u019c\3\2\2\2\32\u01a0\3\2\2\2\34\u01bb\3\2\2\2\36"+
		"\u01be\3\2\2\2 \u01cf\3\2\2\2\"\u01d9\3\2\2\2$\u01df\3\2\2\2&\u01f2\3"+
		"\2\2\2(\u01f7\3\2\2\2*\u01ff\3\2\2\2,\u0201\3\2\2\2.\u0208\3\2\2\2\60"+
		"\u020a\3\2\2\2\62\u020c\3\2\2\2\64\u020e\3\2\2\2\66\u0210\3\2\2\28\u0213"+
		"\3\2\2\2:\u021a\3\2\2\2<\u021d\3\2\2\2>\u0230\3\2\2\2@\u0236\3\2\2\2B"+
		"\u023b\3\2\2\2D\u0240\3\2\2\2F\u024b\3\2\2\2H\u0250\3\2\2\2J\u0252\3\2"+
		"\2\2L\u0258\3\2\2\2N\u0260\3\2\2\2P\u0262\3\2\2\2R\u0265\3\2\2\2T\u0269"+
		"\3\2\2\2V\u0271\3\2\2\2X\u0277\3\2\2\2Z\u027b\3\2\2\2\\\u02a8\3\2\2\2"+
		"^\u02ae\3\2\2\2`\u02b8\3\2\2\2b\u02c0\3\2\2\2d\u02c2\3\2\2\2f\u02ce\3"+
		"\2\2\2h\u02d1\3\2\2\2j\u02d6\3\2\2\2l\u02eb\3\2\2\2n\u02ed\3\2\2\2p\u02f0"+
		"\3\2\2\2r\u02f3\3\2\2\2t\u02fd\3\2\2\2v\u0319\3\2\2\2x\u0348\3\2\2\2z"+
		"\u034a\3\2\2\2|\u0355\3\2\2\2~\u0357\3\2\2\2\u0080\u035a\3\2\2\2\u0082"+
		"\u035d\3\2\2\2\u0084\u0360\3\2\2\2\u0086\u0364\3\2\2\2\u0088\u0370\3\2"+
		"\2\2\u008a\u0378\3\2\2\2\u008c\u0381\3\2\2\2\u008e\u0383\3\2\2\2\u0090"+
		"\u03ab\3\2\2\2\u0092\u03ae\3\2\2\2\u0094\u03b8\3\2\2\2\u0096\u03ba\3\2"+
		"\2\2\u0098\u03c0\3\2\2\2\u009a\u03c8\3\2\2\2\u009c\u03ca\3\2\2\2\u009e"+
		"\u03d3\3\2\2\2\u00a0\u03d5\3\2\2\2\u00a2\u03d9\3\2\2\2\u00a4\u03e8\3\2"+
		"\2\2\u00a6\u03f3\3\2\2\2\u00a8\u03f7\3\2\2\2\u00aa\u03f9\3\2\2\2\u00ac"+
		"\u03fc\3\2\2\2\u00ae\u0405\3\2\2\2\u00b0\u0410\3\2\2\2\u00b2\u0414\3\2"+
		"\2\2\u00b4\u0430\3\2\2\2\u00b6\u0438\3\2\2\2\u00b8\u043c\3\2\2\2\u00ba"+
		"\u0444\3\2\2\2\u00bc\u044c\3\2\2\2\u00be\u0454\3\2\2\2\u00c0\u0456\3\2"+
		"\2\2\u00c2\u0461\3\2\2\2\u00c4\u0463\3\2\2\2\u00c6\u0467\3\2\2\2\u00c8"+
		"\u047f\3\2\2\2\u00ca\u0488\3\2\2\2\u00cc\u048e\3\2\2\2\u00ce\u0492\3\2"+
		"\2\2\u00d0\u0496\3\2\2\2\u00d2\u049a\3\2\2\2\u00d4\u049e\3\2\2\2\u00d6"+
		"\u04a2\3\2\2\2\u00d8\u04b8\3\2\2\2\u00da\u04ba\3\2\2\2\u00dc\u04bc\3\2"+
		"\2\2\u00de\u04bf\3\2\2\2\u00e0\u04d3\3\2\2\2\u00e2\u04db\3\2\2\2\u00e4"+
		"\u04dd\3\2\2\2\u00e6\u04e2\3\2\2\2\u00e8\u04ed\3\2\2\2\u00ea\u04f6\3\2"+
		"\2\2\u00ec\u04f9\3\2\2\2\u00ee\u0502\3\2\2\2\u00f0\u0508\3\2\2\2\u00f2"+
		"\u0518\3\2\2\2\u00f4\u052a\3\2\2\2\u00f6\u00f7\t\2\2\2\u00f7\3\3\2\2\2"+
		"\u00f8\u00f9\7\u008d\2\2\u00f9\u0102\7\n\2\2\u00fa\u00ff\5\22\n\2\u00fb"+
		"\u00fc\7\7\2\2\u00fc\u00fe\5\22\n\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\7\6\2\2\u0105\5\3\2\2\2\u0106\u0107\t\3\2\2\u0107\u0108"+
		"\7\b\2\2\u0108\u010e\t\4\2\2\u0109\u010a\t\4\2\2\u010a\u010b\7\u008a\2"+
		"\2\u010b\u010c\t\3\2\2\u010c\u010e\7\u008a\2\2\u010d\u0106\3\2\2\2\u010d"+
		"\u0109\3\2\2\2\u010e\7\3\2\2\2\u010f\u0110\t\4\2\2\u0110\u011d\5\16\b"+
		"\2\u0111\u0112\5\16\b\2\u0112\u0113\7\b\2\2\u0113\u0114\t\4\2\2\u0114"+
		"\u011d\3\2\2\2\u0115\u0116\7^\2\2\u0116\u0117\7\n\2\2\u0117\u0118\5\16"+
		"\b\2\u0118\u0119\7p\2\2\u0119\u011a\t\4\2\2\u011a\u011b\7\6\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u010f\3\2\2\2\u011c\u0111\3\2\2\2\u011c\u0115\3\2"+
		"\2\2\u011d\t\3\2\2\2\u011e\u0122\5\6\4\2\u011f\u0122\7\u008b\2\2\u0120"+
		"\u0122\7\u008c\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\13\3\2\2\2\u0123\u0124\7\25\2\2\u0124\u0127\5\22\n\2\u0125"+
		"\u0127\t\5\2\2\u0126\u0123\3\2\2\2\u0126\u0125\3\2\2\2\u0127\r\3\2\2\2"+
		"\u0128\u0129\7\u008a\2\2\u0129\u012a\5\20\t\2\u012a\u012b\7\u008a\2\2"+
		"\u012b\u0131\3\2\2\2\u012c\u012d\7\u0089\2\2\u012d\u012e\5\20\t\2\u012e"+
		"\u012f\7\u0089\2\2\u012f\u0131\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u012c"+
		"\3\2\2\2\u0131\17\3\2\2\2\u0132\u0135\7\u0095\2\2\u0133\u0135\13\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\21\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013a\b\n\1\2\u013a\u013b\7\33\2\2\u013b\u014b\5\22\n\2\u013c\u013d\7"+
		"\34\2\2\u013d\u014b\5\22\n\2\u013e\u014b\5\4\3\2\u013f\u0140\7\n\2\2\u0140"+
		"\u0141\5\22\n\2\u0141\u0142\7\6\2\2\u0142\u014b\3\2\2\2\u0143\u014b\5"+
		"\2\2\2\u0144\u014b\5\f\7\2\u0145\u014b\5\n\6\2\u0146\u014b\5\16\b\2\u0147"+
		"\u014b\5\b\5\2\u0148\u014b\5Z.\2\u0149\u014b\5\u00dep\2\u014a\u0139\3"+
		"\2\2\2\u014a\u013c\3\2\2\2\u014a\u013e\3\2\2\2\u014a\u013f\3\2\2\2\u014a"+
		"\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a\u0146\3\2"+
		"\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u0194\3\2\2\2\u014c\u014d\6\n\2\3\u014d\u014e\7\35\2\2\u014e\u0193\5"+
		"\22\n\2\u014f\u0150\6\n\3\3\u0150\u0151\7\36\2\2\u0151\u0193\5\22\n\2"+
		"\u0152\u0153\6\n\4\3\u0153\u0154\7\37\2\2\u0154\u0193\5\22\n\2\u0155\u0156"+
		"\6\n\5\3\u0156\u0157\7 \2\2\u0157\u0193\5\22\n\2\u0158\u0159\6\n\6\3\u0159"+
		"\u015a\7!\2\2\u015a\u0193\5\22\n\2\u015b\u015c\6\n\7\3\u015c\u015d\7\""+
		"\2\2\u015d\u0193\5\22\n\2\u015e\u015f\6\n\b\3\u015f\u0160\7\30\2\2\u0160"+
		"\u0193\5\22\n\2\u0161\u0162\6\n\t\3\u0162\u0163\7\31\2\2\u0163\u0193\5"+
		"\22\n\2\u0164\u0165\6\n\n\3\u0165\u0166\7\32\2\2\u0166\u0193\5\22\n\2"+
		"\u0167\u0168\6\n\13\3\u0168\u0169\7\33\2\2\u0169\u0193\5\22\n\2\u016a"+
		"\u016b\6\n\f\3\u016b\u016c\7\34\2\2\u016c\u0193\5\22\n\2\u016d\u016e\6"+
		"\n\r\3\u016e\u016f\7\5\2\2\u016f\u0193\5\22\n\2\u0170\u0171\6\n\16\3\u0171"+
		"\u0172\7d\2\2\u0172\u0193\5\22\n\2\u0173\u0174\6\n\17\3\u0174\u0175\7"+
		"\20\2\2\u0175\u0193\5\22\n\2\u0176\u0177\6\n\20\3\u0177\u0178\7\21\2\2"+
		"\u0178\u0193\5\22\n\2\u0179\u017e\6\n\21\3\u017a\u017b\7\t\2\2\u017b\u017c"+
		"\5\22\n\2\u017c\u017d\7\4\2\2\u017d\u017f\3\2\2\2\u017e\u017a\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0193"+
		"\3\2\2\2\u0182\u0184\6\n\22\3\u0183\u0185\7\25\2\2\u0184\u0183\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7\r\2\2\u0187\u0193"+
		"\5\16\b\2\u0188\u018a\6\n\23\3\u0189\u018b\7\25\2\2\u018a\u0189\3\2\2"+
		"\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\16\2\2\u018d"+
		"\u018e\7\17\2\2\u018e\u0193\5\16\b\2\u018f\u0190\6\n\24\3\u0190\u0191"+
		"\7p\2\2\u0191\u0193\7\u008d\2\2\u0192\u014c\3\2\2\2\u0192\u014f\3\2\2"+
		"\2\u0192\u0152\3\2\2\2\u0192\u0155\3\2\2\2\u0192\u0158\3\2\2\2\u0192\u015b"+
		"\3\2\2\2\u0192\u015e\3\2\2\2\u0192\u0161\3\2\2\2\u0192\u0164\3\2\2\2\u0192"+
		"\u0167\3\2\2\2\u0192\u016a\3\2\2\2\u0192\u016d\3\2\2\2\u0192\u0170\3\2"+
		"\2\2\u0192\u0173\3\2\2\2\u0192\u0176\3\2\2\2\u0192\u0179\3\2\2\2\u0192"+
		"\u0182\3\2\2\2\u0192\u0188\3\2\2\2\u0192\u018f\3\2\2\2\u0193\u0196\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\23\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0197\u0198\t\6\2\2\u0198\25\3\2\2\2\u0199\u019a\5\22\n\2\u019a"+
		"\27\3\2\2\2\u019b\u019d\5\32\16\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\31\3\2\2\2\u01a0\u01a3"+
		"\7a\2\2\u01a1\u01a2\7\21\2\2\u01a2\u01a4\7b\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7\u008d"+
		"\2\2\u01a7\u01a8\7\n\2\2\u01a8\u01a9\5\34\17\2\u01a9\u01aa\7\6\2\2\u01aa"+
		"\u01ab\5 \21\2\u01ab\u01ac\5\"\22\2\u01ac\u01ad\7j\2\2\u01ad\u01af\7k"+
		"\2\2\u01ae\u01b0\5,\27\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\7\13\2\2\u01b2\33\3\2\2\2\u01b3\u01b8\5\36"+
		"\20\2\u01b4\u01b5\7\7\2\2\u01b5\u01b7\5\36\20\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\35\3\2\2\2\u01bd\u01bf\t\7\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2"+
		"\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\u008d\2\2\u01c1\u01c4\t\b\2\2\u01c2"+
		"\u01c3\t\t\2\2\u01c3\u01c5\5\22\n\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3"+
		"\2\2\2\u01c5\37\3\2\2\2\u01c6\u01c7\7n\2\2\u01c7\u01d0\t\4\2\2\u01c8\u01cb"+
		"\7n\2\2\u01c9\u01ca\t\4\2\2\u01ca\u01cc\7\u008d\2\2\u01cb\u01c9\3\2\2"+
		"\2\u01cc\u01cd\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01c6\3\2\2\2\u01cf\u01c8\3\2\2\2\u01d0!\3\2\2\2\u01d1"+
		"\u01d2\7\u0087\2\2\u01d2\u01d3\5$\23\2\u01d3\u01d4\7\u0089\2\2\u01d4\u01da"+
		"\3\2\2\2\u01d5\u01d6\7\u0088\2\2\u01d6\u01d7\5$\23\2\u01d7\u01d8\7\u008a"+
		"\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d1\3\2\2\2\u01d9\u01d5\3\2\2\2\u01da"+
		"#\3\2\2\2\u01db\u01dc\7q\2\2\u01dc\u01de\5:\36\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7r\2\2\u01e3\u01e6\5\u00f2z\2\u01e4"+
		"\u01e5\7l\2\2\u01e5\u01e7\5&\24\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7s\2\2\u01e9\u01ea\7\13\2\2\u01ea"+
		"%\3\2\2\2\u01eb\u01ec\7t\2\2\u01ec\u01ed\5(\25\2\u01ed\u01ee\7u\2\2\u01ee"+
		"\u01ef\5\u00f2z\2\u01ef\u01f1\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u01f4"+
		"\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f5\u01f6\5\u00f2z\2\u01f6\'\3\2\2\2\u01f7\u01fc\5*\26"+
		"\2\u01f8\u01f9\7\21\2\2\u01f9\u01fb\5*\26\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd)\3\2\2\2"+
		"\u01fe\u01fc\3\2\2\2\u01ff\u0200\5\22\n\2\u0200+\3\2\2\2\u0201\u0202\5"+
		"\60\31\2\u0202\u0203\5.\30\2\u0203\u0204\5\62\32\2\u0204\u0205\5\64\33"+
		"\2\u0205\u0206\5\66\34\2\u0206\u0207\58\35\2\u0207-\3\2\2\2\u0208\u0209"+
		"\t\n\2\2\u0209/\3\2\2\2\u020a\u020b\7v\2\2\u020b\61\3\2\2\2\u020c\u020d"+
		"\t\13\2\2\u020d\63\3\2\2\2\u020e\u020f\t\f\2\2\u020f\65\3\2\2\2\u0210"+
		"\u0211\7\u0080\2\2\u0211\u0212\7\u008b\2\2\u0212\67\3\2\2\2\u0213\u0214"+
		"\7K\2\2\u0214\u0215\7\u008b\2\2\u02159\3\2\2\2\u0216\u0219\5<\37\2\u0217"+
		"\u0219\5> \2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2"+
		"\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b;\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021d\u021f\7\u008d\2\2\u021e\u0220\7\u0081\2\2\u021f\u021e\3"+
		"\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0224\t\4\2\2\u0222"+
		"\u0223\7\u0082\2\2\u0223\u0225\7\u008d\2\2\u0224\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0227\7\25\2\2\u0227\u0229\7\u0083"+
		"\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022c\3\2\2\2\u022a"+
		"\u022b\t\t\2\2\u022b\u022d\5\22\n\2\u022c\u022a\3\2\2\2\u022c\u022d\3"+
		"\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\7\13\2\2\u022f=\3\2\2\2\u0230\u0231"+
		"\7\u008d\2\2\u0231\u0232\7_\2\2\u0232\u0233\7`\2\2\u0233\u0234\7\u008d"+
		"\2\2\u0234\u0235\7\13\2\2\u0235?\3\2\2\2\u0236\u0237\5\22\n\2\u0237\u0238"+
		"\5\24\13\2\u0238\u0239\5\22\n\2\u0239\u023a\7\13\2\2\u023aA\3\2\2\2\u023b"+
		"\u023e\7\62\2\2\u023c\u023f\5D#\2\u023d\u023f\5H%\2\u023e\u023c\3\2\2"+
		"\2\u023e\u023d\3\2\2\2\u023fC\3\2\2\2\u0240\u0245\5F$\2\u0241\u0242\7"+
		"\7\2\2\u0242\u0244\5F$\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0248\u024a\5J&\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024aE"+
		"\3\2\2\2\u024b\u024e\5\22\n\2\u024c\u024d\7p\2\2\u024d\u024f\7\u008d\2"+
		"\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fG\3\2\2\2\u0250\u0251"+
		"\7\30\2\2\u0251I\3\2\2\2\u0252\u0254\7R\2\2\u0253\u0255\7S\2\2\u0254\u0253"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\5L\'\2\u0257"+
		"K\3\2\2\2\u0258\u025d\5N(\2\u0259\u025a\7\7\2\2\u025a\u025c\5N(\2\u025b"+
		"\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025eM\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\t\2\2\2\u0261O\3\2"+
		"\2\2\u0262\u0263\7/\2\2\u0263\u0264\5T+\2\u0264Q\3\2\2\2\u0265\u0266\7"+
		"/\2\2\u0266\u0267\7\60\2\2\u0267\u0268\5T+\2\u0268S\3\2\2\2\u0269\u026e"+
		"\5V,\2\u026a\u026b\7\7\2\2\u026b\u026d\5V,\2\u026c\u026a\3\2\2\2\u026d"+
		"\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026fU\3\2\2\2"+
		"\u0270\u026e\3\2\2\2\u0271\u0272\7\u008d\2\2\u0272\u0273\7p\2\2\u0273"+
		"\u0274\7\n\2\2\u0274\u0275\5Z.\2\u0275\u0276\7\6\2\2\u0276W\3\2\2\2\u0277"+
		"\u0278\5Z.\2\u0278\u0279\7\13\2\2\u0279Y\3\2\2\2\u027a\u027c\5P)\2\u027b"+
		"\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\7>"+
		"\2\2\u027e\u02a4\5\\/\2\u027f\u0281\5d\63\2\u0280\u027f\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0286\5r:\2\u0283\u0285\5t;\2"+
		"\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028b\5~@\2\u028a"+
		"\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028d\3\2\2\2\u028c\u028e\5\u0080"+
		"A\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f"+
		"\u0291\5\u0082B\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293"+
		"\3\2\2\2\u0292\u0294\5\u0084C\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2"+
		"\2\u0294\u0296\3\2\2\2\u0295\u0297\5j\66\2\u0296\u0295\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u029a\5f\64\2\u0299\u0298\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u029d\5h\65\2\u029c\u029b\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u02a0\5\u0086D\2\u029f"+
		"\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u02a3\5\u0088"+
		"E\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4"+
		"\u0280\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5[\3\2\2\2\u02a6\u02a9\7?\2\2\u02a7"+
		"\u02a9\5^\60\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02ad\5b\62\2\u02ab\u02ad\5`\61\2\u02ac"+
		"\u02aa\3\2\2\2\u02ac\u02ab\3\2\2\2\u02ad]\3\2\2\2\u02ae\u02af\7@\2\2\u02af"+
		"\u02b0\7h\2\2\u02b0\u02b5\5\22\n\2\u02b1\u02b2\7\7\2\2\u02b2\u02b4\5\22"+
		"\n\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6_\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02bd\5\22\n\2"+
		"\u02b9\u02ba\7\7\2\2\u02ba\u02bc\5\22\n\2\u02bb\u02b9\3\2\2\2\u02bc\u02bf"+
		"\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02bea\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02c0\u02c1\7\30\2\2\u02c1c\3\2\2\2\u02c2\u02c4\7R\2\2"+
		"\u02c3\u02c5\7S\2\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02cb\7\u008d\2\2\u02c7\u02c8\7\7\2\2\u02c8\u02ca\7\u008d"+
		"\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cce\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce\u02cf\7H\2\2\u02cf"+
		"\u02d0\t\r\2\2\u02d0g\3\2\2\2\u02d1\u02d2\7I\2\2\u02d2\u02d4\7\u008b\2"+
		"\2\u02d3\u02d5\t\16\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"i\3\2\2\2\u02d6\u02d7\7F\2\2\u02d7\u02dc\5l\67\2\u02d8\u02d9\7\7\2\2\u02d9"+
		"\u02db\5l\67\2\u02da\u02d8\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2"+
		"\2\2\u02dc\u02dd\3\2\2\2\u02ddk\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e1"+
		"\5\22\n\2\u02e0\u02e2\t\17\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2"+
		"\u02e2\u02e4\3\2\2\2\u02e3\u02e5\5p9\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5"+
		"\3\2\2\2\u02e5\u02ec\3\2\2\2\u02e6\u02e7\5\22\n\2\u02e7\u02e9\5n8\2\u02e8"+
		"\u02ea\5p9\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ec\3\2\2"+
		"\2\u02eb\u02df\3\2\2\2\u02eb\u02e6\3\2\2\2\u02ecm\3\2\2\2\u02ed\u02ee"+
		"\7Y\2\2\u02ee\u02ef\t\20\2\2\u02efo\3\2\2\2\u02f0\u02f1\7Z\2\2\u02f1\u02f2"+
		"\t\21\2\2\u02f2q\3\2\2\2\u02f3\u02f4\7A\2\2\u02f4\u02f9\5v<\2\u02f5\u02f6"+
		"\7\7\2\2\u02f6\u02f8\5v<\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fas\3\2\2\2\u02fb\u02f9\3\2\2\2"+
		"\u02fc\u02fe\7=\2\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u0300\5x=\2\u0300u\3\2\2\2\u0301\u0303\7M\2\2\u0302\u0301"+
		"\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0306\t\2\2\2\u0305"+
		"\u0307\7\30\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030d\3"+
		"\2\2\2\u0308\u030a\7p\2\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030b\3\2\2\2\u030b\u030c\7\u008d\2\2\u030c\u030e\5z>\2\u030d\u0309\3"+
		"\2\2\2\u030d\u030e\3\2\2\2\u030e\u031a\3\2\2\2\u030f\u0310\7\n\2\2\u0310"+
		"\u0311\5Z.\2\u0311\u0313\7\6\2\2\u0312\u0314\7p\2\2\u0313\u0312\3\2\2"+
		"\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\7\u008d\2\2\u0316"+
		"\u0318\5z>\2\u0317\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2"+
		"\2\u0319\u0302\3\2\2\2\u0319\u030f\3\2\2\2\u031aw\3\2\2\2\u031b\u031d"+
		"\7\67\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2"+
		"\u031e\u031f\7\66\2\2\u031f\u0320\t\2\2\2\u0320\u0321\7h\2\2\u0321\u0349"+
		"\5\26\f\2\u0322\u0323\78\2\2\u0323\u0324\7<\2\2\u0324\u0325\7\66\2\2\u0325"+
		"\u0326\t\2\2\2\u0326\u0327\7h\2\2\u0327\u0349\5\26\f\2\u0328\u0329\78"+
		"\2\2\u0329\u032a\7\66\2\2\u032a\u032b\t\2\2\2\u032b\u032c\7h\2\2\u032c"+
		"\u0349\5\26\f\2\u032d\u032e\79\2\2\u032e\u032f\7<\2\2\u032f\u0330\7\66"+
		"\2\2\u0330\u0331\t\2\2\2\u0331\u0332\7h\2\2\u0332\u0349\5\26\f\2\u0333"+
		"\u0334\79\2\2\u0334\u0335\7\66\2\2\u0335\u0336\t\2\2\2\u0336\u0337\7h"+
		"\2\2\u0337\u0349\5\26\f\2\u0338\u0339\7:\2\2\u0339\u033a\7<\2\2\u033a"+
		"\u033b\7\66\2\2\u033b\u033c\t\2\2\2\u033c\u033d\7h\2\2\u033d\u0349\5\26"+
		"\f\2\u033e\u033f\7:\2\2\u033f\u0340\7\66\2\2\u0340\u0341\t\2\2\2\u0341"+
		"\u0342\7h\2\2\u0342\u0349\5\26\f\2\u0343\u0344\7;\2\2\u0344\u0345\7\66"+
		"\2\2\u0345\u0346\t\2\2\2\u0346\u0347\7h\2\2\u0347\u0349\5\26\f\2\u0348"+
		"\u031c\3\2\2\2\u0348\u0322\3\2\2\2\u0348\u0328\3\2\2\2\u0348\u032d\3\2"+
		"\2\2\u0348\u0333\3\2\2\2\u0348\u0338\3\2\2\2\u0348\u033e\3\2\2\2\u0348"+
		"\u0343\3\2\2\2\u0349y\3\2\2\2\u034a\u034b\7\n\2\2\u034b\u0350\5|?\2\u034c"+
		"\u034d\7\7\2\2\u034d\u034f\5|?\2\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2"+
		"\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0350"+
		"\3\2\2\2\u0353\u0354\7\6\2\2\u0354{\3\2\2\2\u0355\u0356\7\u008d\2\2\u0356"+
		"}\3\2\2\2\u0357\u0358\7B\2\2\u0358\u0359\5\26\f\2\u0359\177\3\2\2\2\u035a"+
		"\u035b\7C\2\2\u035b\u035c\5\22\n\2\u035c\u0081\3\2\2\2\u035d\u035e\7i"+
		"\2\2\u035e\u035f\5\26\f\2\u035f\u0083\3\2\2\2\u0360\u0361\t\22\2\2\u0361"+
		"\u0362\t\23\2\2\u0362\u0363\5Z.\2\u0363\u0085\3\2\2\2\u0364\u0366\7L\2"+
		"\2\u0365\u0367\t\24\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u0369\3\2\2\2\u0368\u036a\7\u008b\2\2\u0369\u0368\3\2\2\2\u0369\u036a"+
		"\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u036d\t\16\2\2\u036c\u036b\3\2\2\2"+
		"\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\7M\2\2\u036f\u0087"+
		"\3\2\2\2\u0370\u0371\7`\2\2\u0371\u0373\t\25\2\2\u0372\u0374\5\u008aF"+
		"\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u0377"+
		"\7Q\2\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0089\3\2\2\2\u0378"+
		"\u0379\7P\2\2\u0379\u037e\5\u008cG\2\u037a\u037b\7\7\2\2\u037b\u037d\5"+
		"\u008cG\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2"+
		"\u037e\u037f\3\2\2\2\u037f\u008b\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0382"+
		"\7\u008d\2\2\u0382\u008d\3\2\2\2\u0383\u0384\7.\2\2\u0384\u03a7\5\\/\2"+
		"\u0385\u0389\5r:\2\u0386\u0388\5t;\2\u0387\u0386\3\2\2\2\u0388\u038b\3"+
		"\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038d\3\2\2\2\u038b"+
		"\u0389\3\2\2\2\u038c\u038e\5~@\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2"+
		"\2\u038e\u0390\3\2\2\2\u038f\u0391\5\u0080A\2\u0390\u038f\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0393\3\2\2\2\u0392\u0394\5\u0082B\2\u0393\u0392"+
		"\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u0397\5\u0084C"+
		"\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u039a"+
		"\5j\66\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2\2\2\u039b"+
		"\u039d\5f\64\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\3\2"+
		"\2\2\u039e\u03a0\5h\65\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u03a3\5\u0086D\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3"+
		"\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a6\5\u0088E\2\u03a5\u03a4\3\2\2"+
		"\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8\3\2\2\2\u03a7\u0385\3\2\2\2\u03a7\u03a8"+
		"\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\7\13\2\2\u03aa\u008f\3\2\2\2"+
		"\u03ab\u03ac\5\u0092J\2\u03ac\u03ad\7\13\2\2\u03ad\u0091\3\2\2\2\u03ae"+
		"\u03af\7-\2\2\u03af\u03b1\5\u0094K\2\u03b0\u03b2\5\u0096L\2\u03b1\u03b0"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b5\5\u009cO"+
		"\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u0093\3\2\2\2\u03b6\u03b9"+
		"\5\16\b\2\u03b7\u03b9\5\4\3\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2"+
		"\u03b9\u0095\3\2\2\2\u03ba\u03bc\7R\2\2\u03bb\u03bd\7S\2\2\u03bc\u03bb"+
		"\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\5\u0098M"+
		"\2\u03bf\u0097\3\2\2\2\u03c0\u03c5\5\u009aN\2\u03c1\u03c2\7\7\2\2\u03c2"+
		"\u03c4\5\u009aN\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u0099\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8"+
		"\u03c9\t\2\2\2\u03c9\u009b\3\2\2\2\u03ca\u03cb\7Y\2\2\u03cb\u03d0\5\u009e"+
		"P\2\u03cc\u03cd\7\7\2\2\u03cd\u03cf\5\u009eP\2\u03ce\u03cc\3\2\2\2\u03cf"+
		"\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u009d\3\2"+
		"\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\5\22\n\2\u03d4\u009f\3\2\2\2\u03d5"+
		"\u03d6\5\u00a2R\2\u03d6\u03d7\7\13\2\2\u03d7\u00a1\3\2\2\2\u03d8\u03da"+
		"\5P)\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\7\63\2\2\u03dc\u03dd\7R\2\2\u03dd\u03df\t\2\2\2\u03de\u03e0\5\u00a4"+
		"S\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e3\3\2\2\2\u03e1"+
		"\u03e4\5\u00a8U\2\u03e2\u03e4\5Z.\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3"+
		"\2\2\2\u03e4\u03e6\3\2\2\2\u03e5\u03e7\5B\"\2\u03e6\u03e5\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u00a3\3\2\2\2\u03e8\u03e9\7\n\2\2\u03e9\u03ee\5\u00a6"+
		"T\2\u03ea\u03eb\7\7\2\2\u03eb\u03ed\5\u00a6T\2\u03ec\u03ea\3\2\2\2\u03ed"+
		"\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2"+
		"\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\7\6\2\2\u03f2\u00a5\3\2\2\2\u03f3"+
		"\u03f4\7\u008d\2\2\u03f4\u00a7\3\2\2\2\u03f5\u03f8\5\u00aaV\2\u03f6\u03f8"+
		"\5\u00acW\2\u03f7\u03f5\3\2\2\2\u03f7\u03f6\3\2\2\2\u03f8\u00a9\3\2\2"+
		"\2\u03f9\u03fa\7m\2\2\u03fa\u03fb\7\64\2\2\u03fb\u00ab\3\2\2\2\u03fc\u03fd"+
		"\7\64\2\2\u03fd\u0402\5\u00aeX\2\u03fe\u03ff\7\7\2\2\u03ff\u0401\5\u00ae"+
		"X\2\u0400\u03fe\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0400\3\2\2\2\u0402"+
		"\u0403\3\2\2\2\u0403\u00ad\3\2\2\2\u0404\u0402\3\2\2\2\u0405\u0406\7\n"+
		"\2\2\u0406\u040b\5\22\n\2\u0407\u0408\7\7\2\2\u0408\u040a\5\22\n\2\u0409"+
		"\u0407\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2"+
		"\2\2\u040c\u040e\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f\7\6\2\2\u040f"+
		"\u00af\3\2\2\2\u0410\u0411\5\u00b2Z\2\u0411\u0412\7\13\2\2\u0412\u00b1"+
		"\3\2\2\2\u0413\u0415\5P)\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u0418\7N\2\2\u0417\u0419\7M\2\2\u0418\u0417\3\2\2"+
		"\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041c\t\2\2\2\u041b\u041d"+
		"\7\30\2\2\u041c\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u0420\3\2\2\2"+
		"\u041e\u041f\7p\2\2\u041f\u0421\7\u008d\2\2\u0420\u041e\3\2\2\2\u0420"+
		"\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0425\7\65\2\2\u0423\u0426\5"+
		"\u00b4[\2\u0424\u0426\5\u00b8]\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2"+
		"\2\u0426\u0428\3\2\2\2\u0427\u0429\5r:\2\u0428\u0427\3\2\2\2\u0428\u0429"+
		"\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u042c\5~@\2\u042b\u042a\3\2\2\2\u042b"+
		"\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042f\5B\"\2\u042e\u042d\3\2"+
		"\2\2\u042e\u042f\3\2\2\2\u042f\u00b3\3\2\2\2\u0430\u0435\5\u00b6\\\2\u0431"+
		"\u0432\7\7\2\2\u0432\u0434\5\u00b6\\\2\u0433\u0431\3\2\2\2\u0434\u0437"+
		"\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u00b5\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0438\u0439\t\2\2\2\u0439\u043a\7\35\2\2\u043a\u043b\5"+
		"\u00c2b\2\u043b\u00b7\3\2\2\2\u043c\u0441\5\u00ba^\2\u043d\u043e\7\7\2"+
		"\2\u043e\u0440\5\u00ba^\2\u043f\u043d\3\2\2\2\u0440\u0443\3\2\2\2\u0441"+
		"\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u00b9\3\2\2\2\u0443\u0441\3\2"+
		"\2\2\u0444\u0445\7\n\2\2\u0445\u0446\5\u00bc_\2\u0446\u0447\7\6\2\2\u0447"+
		"\u0448\7\35\2\2\u0448\u0449\7\n\2\2\u0449\u044a\5\u00c0a\2\u044a\u044b"+
		"\7\6\2\2\u044b\u00bb\3\2\2\2\u044c\u0451\5\u00be`\2\u044d\u044e\7\7\2"+
		"\2\u044e\u0450\5\u00be`\2\u044f\u044d\3\2\2\2\u0450\u0453\3\2\2\2\u0451"+
		"\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u00bd\3\2\2\2\u0453\u0451\3\2"+
		"\2\2\u0454\u0455\t\2\2\2\u0455\u00bf\3\2\2\2\u0456\u045b\5\u00c2b\2\u0457"+
		"\u0458\7\7\2\2\u0458\u045a\5\u00c2b\2\u0459\u0457\3\2\2\2\u045a\u045d"+
		"\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u00c1\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045e\u0462\5\22\n\2\u045f\u0462\t\2\2\2\u0460\u0462\7"+
		"m\2\2\u0461\u045e\3\2\2\2\u0461\u045f\3\2\2\2\u0461\u0460\3\2\2\2\u0462"+
		"\u00c3\3\2\2\2\u0463\u0464\5\u00c6d\2\u0464\u0465\7\13\2\2\u0465\u00c5"+
		"\3\2\2\2\u0466\u0468\5P)\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u046a\7\61\2\2\u046a\u046c\7A\2\2\u046b\u046d\7M"+
		"\2\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0470\t\2\2\2\u046f\u0471\7\30\2\2\u0470\u046f\3\2\2\2\u0470\u0471\3"+
		"\2\2\2\u0471\u0474\3\2\2\2\u0472\u0473\7p\2\2\u0473\u0475\7\u008d\2\2"+
		"\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0478"+
		"\5\u00c8e\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047a\3\2\2"+
		"\2\u0479\u047b\5~@\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d"+
		"\3\2\2\2\u047c\u047e\5B\"\2\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u00c7\3\2\2\2\u047f\u0480\7Y\2\2\u0480\u0485\5\u00caf\2\u0481\u0482\7"+
		"\7\2\2\u0482\u0484\5\u00caf\2\u0483\u0481\3\2\2\2\u0484\u0487\3\2\2\2"+
		"\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u00c9\3\2\2\2\u0487\u0485"+
		"\3\2\2\2\u0488\u0489\t\2\2\2\u0489\u00cb\3\2\2\2\u048a\u048f\5\u00ceh"+
		"\2\u048b\u048f\5\u00d0i\2\u048c\u048f\5\u00d2j\2\u048d\u048f\5\u00d4k"+
		"\2\u048e\u048a\3\2\2\2\u048e\u048b\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048d"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0491\7\13\2\2\u0491\u00cd\3\2\2\2"+
		"\u0492\u0494\7,\2\2\u0493\u0495\5\22\n\2\u0494\u0493\3\2\2\2\u0494\u0495"+
		"\3\2\2\2\u0495\u00cf\3\2\2\2\u0496\u0497\7,\2\2\u0497\u0498\7\\\2\2\u0498"+
		"\u0499\5\22\n\2\u0499\u00d1\3\2\2\2\u049a\u049b\7,\2\2\u049b\u049c\7+"+
		"\2\2\u049c\u049d\5Z.\2\u049d\u00d3\3\2\2\2\u049e\u049f\7,\2\2\u049f\u04a0"+
		"\7+\2\2\u04a0\u04a1\5\u0092J\2\u04a1\u00d5\3\2\2\2\u04a2\u04a3\7(\2\2"+
		"\u04a3\u04a4\5\u00d8m\2\u04a4\u04a5\7u\2\2\u04a5\u04ad\5\u00f2z\2\u04a6"+
		"\u04a7\7)\2\2\u04a7\u04a8\5\u00dan\2\u04a8\u04a9\7u\2\2\u04a9\u04aa\5"+
		"\u00f2z\2\u04aa\u04ac\3\2\2\2\u04ab\u04a6\3\2\2\2\u04ac\u04af\3\2\2\2"+
		"\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b2\3\2\2\2\u04af\u04ad"+
		"\3\2\2\2\u04b0\u04b1\7*\2\2\u04b1\u04b3\5\u00f2z\2\u04b2\u04b0\3\2\2\2"+
		"\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\7s\2\2\u04b5\u04b6"+
		"\7(\2\2\u04b6\u04b7\7\13\2\2\u04b7\u00d7\3\2\2\2\u04b8\u04b9\5\26\f\2"+
		"\u04b9\u00d9\3\2\2\2\u04ba\u04bb\5\26\f\2\u04bb\u00db\3\2\2\2\u04bc\u04bd"+
		"\5\u00dep\2\u04bd\u04be\7\13\2\2\u04be\u00dd\3\2\2\2\u04bf\u04c1\7\'\2"+
		"\2\u04c0\u04c2\5\u00e2r\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2"+
		"\u04c8\3\2\2\2\u04c3\u04c4\7t\2\2\u04c4\u04c5\5\u00e0q\2\u04c5\u04c6\7"+
		"u\2\2\u04c6\u04c7\5\u00f2z\2\u04c7\u04c9\3\2\2\2\u04c8\u04c3\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04c8\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04ce\3\2"+
		"\2\2\u04cc\u04cd\7*\2\2\u04cd\u04cf\5\u00f2z\2\u04ce\u04cc\3\2\2\2\u04ce"+
		"\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\7s\2\2\u04d1\u04d2\7\'"+
		"\2\2\u04d2\u00df\3\2\2\2\u04d3\u04d8\5\u00e4s\2\u04d4\u04d5\7\7\2\2\u04d5"+
		"\u04d7\5\u00e4s\2\u04d6\u04d4\3\2\2\2\u04d7\u04da\3\2\2\2\u04d8\u04d6"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u00e1\3\2\2\2\u04da\u04d8\3\2\2\2\u04db"+
		"\u04dc\5\22\n\2\u04dc\u00e3\3\2\2\2\u04dd\u04de\5\22\n\2\u04de\u00e5\3"+
		"\2\2\2\u04df\u04e0\7\3\2\2\u04e0\u04e1\7\u008d\2\2\u04e1\u04e3\7\f\2\2"+
		"\u04e2\u04df\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5"+
		"\7&\2\2\u04e5\u04e6\5\u00f2z\2\u04e6\u04e7\7s\2\2\u04e7\u04e9\7&\2\2\u04e8"+
		"\u04ea\7\u008d\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb"+
		"\3\2\2\2\u04eb\u04ec\7\13\2\2\u04ec\u00e7\3\2\2\2\u04ed\u04ef\7%\2\2\u04ee"+
		"\u04f0\7\u008d\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f2"+
		"\3\2\2\2\u04f1\u04f3\5\u00eav\2\u04f2\u04f1\3\2\2\2\u04f2\u04f3\3\2\2"+
		"\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\7\13\2\2\u04f5\u00e9\3\2\2\2\u04f6"+
		"\u04f7\7t\2\2\u04f7\u04f8\5\26\f\2\u04f8\u00eb\3\2\2\2\u04f9\u04fb\7$"+
		"\2\2\u04fa\u04fc\7\u008d\2\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc"+
		"\u04fe\3\2\2\2\u04fd\u04ff\5\u00eex\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\7\13\2\2\u0501\u00ed\3\2\2\2"+
		"\u0502\u0503\7t\2\2\u0503\u0504\5\26\f\2\u0504\u00ef\3\2\2\2\u0505\u0506"+
		"\7\3\2\2\u0506\u0507\7\u008d\2\2\u0507\u0509\7\f\2\2\u0508\u0505\3\2\2"+
		"\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\7#\2\2\u050b\u050c"+
		"\5\26\f\2\u050c\u050d\7&\2\2\u050d\u050e\5\u00f2z\2\u050e\u050f\7s\2\2"+
		"\u050f\u0511\7&\2\2\u0510\u0512\7\u008d\2\2\u0511\u0510\3\2\2\2\u0511"+
		"\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\7\13\2\2\u0514\u00f1\3"+
		"\2\2\2\u0515\u0517\5\u00f4{\2\u0516\u0515\3\2\2\2\u0517\u051a\3\2\2\2"+
		"\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u00f3\3\2\2\2\u051a\u0518"+
		"\3\2\2\2\u051b\u052b\5X-\2\u051c\u052b\5\u00a0Q\2\u051d\u052b\5\u00b0"+
		"Y\2\u051e\u052b\5\u00c4c\2\u051f\u052b\5$\23\2\u0520\u052b\5@!\2\u0521"+
		"\u052b\5\u008eH\2\u0522\u052b\5\u0090I\2\u0523\u052b\5\u00ccg\2\u0524"+
		"\u052b\5\u00d6l\2\u0525\u052b\5\u00dco\2\u0526\u052b\5\u00e6t\2\u0527"+
		"\u052b\5\u00e8u\2\u0528\u052b\5\u00ecw\2\u0529\u052b\5\u00f0y\2\u052a"+
		"\u051b\3\2\2\2\u052a\u051c\3\2\2\2\u052a\u051d\3\2\2\2\u052a\u051e\3\2"+
		"\2\2\u052a\u051f\3\2\2\2\u052a\u0520\3\2\2\2\u052a\u0521\3\2\2\2\u052a"+
		"\u0522\3\2\2\2\u052a\u0523\3\2\2\2\u052a\u0524\3\2\2\2\u052a\u0525\3\2"+
		"\2\2\u052a\u0526\3\2\2\2\u052a\u0527\3\2\2\2\u052a\u0528\3\2\2\2\u052a"+
		"\u0529\3\2\2\2\u052b\u00f5\3\2\2\2\u0097\u00ff\u0102\u010d\u011c\u0121"+
		"\u0126\u0130\u0134\u0136\u014a\u0180\u0184\u018a\u0192\u0194\u019e\u01a3"+
		"\u01af\u01b8\u01bb\u01be\u01c4\u01cd\u01cf\u01d9\u01df\u01e6\u01f2\u01fc"+
		"\u0218\u021a\u021f\u0224\u0228\u022c\u023e\u0245\u0249\u024e\u0254\u025d"+
		"\u026e\u027b\u0280\u0286\u028a\u028d\u0290\u0293\u0296\u0299\u029c\u029f"+
		"\u02a2\u02a4\u02a8\u02ac\u02b5\u02bd\u02c4\u02cb\u02d4\u02dc\u02e1\u02e4"+
		"\u02e9\u02eb\u02f9\u02fd\u0302\u0306\u0309\u030d\u0313\u0317\u0319\u031c"+
		"\u0348\u0350\u0366\u0369\u036c\u0373\u0376\u037e\u0389\u038d\u0390\u0393"+
		"\u0396\u0399\u039c\u039f\u03a2\u03a5\u03a7\u03b1\u03b4\u03b8\u03bc\u03c5"+
		"\u03d0\u03d9\u03df\u03e3\u03e6\u03ee\u03f7\u0402\u040b\u0414\u0418\u041c"+
		"\u0420\u0425\u0428\u042b\u042e\u0435\u0441\u0451\u045b\u0461\u0467\u046c"+
		"\u0470\u0474\u0477\u047a\u047d\u0485\u048e\u0494\u04ad\u04b2\u04c1\u04ca"+
		"\u04ce\u04d8\u04e2\u04e9\u04ef\u04f2\u04fb\u04fe\u0508\u0511\u0518\u052a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}