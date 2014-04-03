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
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, LIKE=9, 
		SIMILAR=10, TO=11, AND=12, OR=13, ASSIGN_OP=14, BETWEEN=15, IS=16, NOT=17, 
		ISNULL=18, NOTNULL=19, MUL=20, DIV=21, MOD=22, ADD=23, SUB=24, EQ=25, 
		NEQ=26, LT=27, LTE=28, GT=29, GTE=30, DELETE=31, RETURNING=32, INSERT=33, 
		VALUES=34, SET=35, JOIN=36, INNER=37, LEFT=38, RIGHT=39, FULL=40, CROSS=41, 
		OUTER=42, NATURAL=43, SELECT=44, ALL=45, DISTINCT=46, FROM=47, WHERE=48, 
		GROUP_BY=49, GROUP=50, BY=51, ORDER_BY=52, ORDER=53, LIMIT=54, OFFSET=55, 
		ROW=56, ROWS=57, FETCH=58, ONLY=59, UPDATE=60, SHARE=61, OF=62, NOWAIT=63, 
		INTO=64, STRICT=65, UNION=66, INTERSECT=67, EXCEPT=68, ASC=69, DESC=70, 
		USING=71, NULLS=72, FIRST=73, NEXT=74, LAST=75, CAST=76, ALIAS=77, FOR=78, 
		CREATE=79, REPLACE=80, FUNCTION=81, IN=82, OUT=83, INOUT=84, VARIADIC=85, 
		ON=86, HAVING=87, LANGUAGE=88, LANGUAGE_NAME=89, EXCEPTION=90, DEFAULT=91, 
		RETURNS=92, TABLE=93, AS=94, DECLARE=95, BEGIN=96, END=97, WHEN=98, THEN=99, 
		WINDOW=100, IMMUTABLE=101, STABLE=102, VOLATILE=103, CALLED_ON_NULL_INPUT=104, 
		RETURNS_NULL_ON_NULL_INPUT=105, EXTERNAL=106, SECURITY=107, SECURITY_INVOKER=108, 
		SECURITY_DEFINER=109, COST=110, CONSTANT=111, COLLATE=112, NULL=113, TRUE=114, 
		FALSE=115, UNKNOWN=116, F_DOLLAR_QUOTE=117, F_QUOTE=118, DOLLAR_QUOTE=119, 
		QUOTE=120, INTEGER_VALUE=121, DECIMAL_VALUE=122, ID=123, QNAME=124, ARRAY_TYPE=125, 
		COPY_TYPE=126, ROW_TYPE=127, WS=128, SL_COMMENT=129, ML_COMMENT=130, ESC=131;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", "';'", 
		"LIKE", "SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", 
		"ISNULL", "NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", 
		"'<'", "'<='", "'>'", "'>='", "DELETE", "RETURNING", "INSERT", "VALUES", 
		"SET", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "CROSS", "OUTER", "NATURAL", 
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
		RULE_stringLiteralExpr = 6, RULE_expression = 7, RULE_assignOperator = 8, 
		RULE_condition = 9, RULE_unit = 10, RULE_plFunction = 11, RULE_functionArgsList = 12, 
		RULE_functionArg = 13, RULE_functionReturns = 14, RULE_functionBody = 15, 
		RULE_blockStmt = 16, RULE_exceptionHandlingBlock = 17, RULE_exceptionWhenConditions = 18, 
		RULE_exceptionWhenCondition = 19, RULE_functionSettings = 20, RULE_functionBehavior = 21, 
		RULE_window = 22, RULE_functionInputHandling = 23, RULE_functionSecurity = 24, 
		RULE_functionCosts = 25, RULE_functionRows = 26, RULE_varDeclarationList = 27, 
		RULE_varDeclaration = 28, RULE_aliasDeclaration = 29, RULE_assignStmt = 30, 
		RULE_returningClause = 31, RULE_returningExpressions = 32, RULE_returningOutputExpression = 33, 
		RULE_returningAll = 34, RULE_returningIntoClause = 35, RULE_returningIntoTargets = 36, 
		RULE_returningIntoTarget = 37, RULE_selectStmt = 38, RULE_select = 39, 
		RULE_selectList = 40, RULE_distinctClause = 41, RULE_selectSpecific = 42, 
		RULE_selectAll = 43, RULE_intoClause = 44, RULE_limitClause = 45, RULE_offsetClause = 46, 
		RULE_orderByClause = 47, RULE_orderByItem = 48, RULE_orderByUsing = 49, 
		RULE_nullsOrdering = 50, RULE_fromClause = 51, RULE_joinClause = 52, RULE_tableExpression = 53, 
		RULE_join = 54, RULE_columnAlias = 55, RULE_columnAliasItem = 56, RULE_whereClause = 57, 
		RULE_groupByClause = 58, RULE_havingClause = 59, RULE_bulkOperationClause = 60, 
		RULE_fetchClause = 61, RULE_forClause = 62, RULE_lockedTables = 63, RULE_lockedTable = 64, 
		RULE_insertStmt = 65, RULE_insert = 66, RULE_insertColumnList = 67, RULE_insertColumn = 68, 
		RULE_insertValuesClause = 69, RULE_insertDefaultValues = 70, RULE_insertValues = 71, 
		RULE_insertValueTuple = 72, RULE_updateStmt = 73, RULE_update = 74, RULE_updateSingleSetClause = 75, 
		RULE_updateSingleSetAssignment = 76, RULE_updateMultiSetClause = 77, RULE_updateMultiSetAssignment = 78, 
		RULE_updateMultiSetColumns = 79, RULE_updateMultiSetColumn = 80, RULE_updateMultiSetValues = 81, 
		RULE_updateSetValue = 82, RULE_deleteStmt = 83, RULE_delete = 84, RULE_usingClause = 85, 
		RULE_usingTable = 86, RULE_stmts = 87, RULE_stmt = 88;
	public static final String[] ruleNames = {
		"varExpr", "functionCallExpr", "numericConstant", "constantOfOtherTypes", 
		"numericalLiteralExpr", "booleanLiteralExpr", "stringLiteralExpr", "expression", 
		"assignOperator", "condition", "unit", "plFunction", "functionArgsList", 
		"functionArg", "functionReturns", "functionBody", "blockStmt", "exceptionHandlingBlock", 
		"exceptionWhenConditions", "exceptionWhenCondition", "functionSettings", 
		"functionBehavior", "window", "functionInputHandling", "functionSecurity", 
		"functionCosts", "functionRows", "varDeclarationList", "varDeclaration", 
		"aliasDeclaration", "assignStmt", "returningClause", "returningExpressions", 
		"returningOutputExpression", "returningAll", "returningIntoClause", "returningIntoTargets", 
		"returningIntoTarget", "selectStmt", "select", "selectList", "distinctClause", 
		"selectSpecific", "selectAll", "intoClause", "limitClause", "offsetClause", 
		"orderByClause", "orderByItem", "orderByUsing", "nullsOrdering", "fromClause", 
		"joinClause", "tableExpression", "join", "columnAlias", "columnAliasItem", 
		"whereClause", "groupByClause", "havingClause", "bulkOperationClause", 
		"fetchClause", "forClause", "lockedTables", "lockedTable", "insertStmt", 
		"insert", "insertColumnList", "insertColumn", "insertValuesClause", "insertDefaultValues", 
		"insertValues", "insertValueTuple", "updateStmt", "update", "updateSingleSetClause", 
		"updateSingleSetAssignment", "updateMultiSetClause", "updateMultiSetAssignment", 
		"updateMultiSetColumns", "updateMultiSetColumn", "updateMultiSetValues", 
		"updateSetValue", "deleteStmt", "delete", "usingClause", "usingTable", 
		"stmts", "stmt"
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
			setState(178);
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
			setState(180); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(181); match(7);
			setState(190);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << SELECT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (CAST - 76)) | (1L << (TRUE - 76)) | (1L << (FALSE - 76)) | (1L << (DOLLAR_QUOTE - 76)) | (1L << (QUOTE - 76)) | (1L << (INTEGER_VALUE - 76)) | (1L << (DECIMAL_VALUE - 76)) | (1L << (ID - 76)) | (1L << (QNAME - 76)) | (1L << (ARRAY_TYPE - 76)) | (1L << (COPY_TYPE - 76)) | (1L << (ROW_TYPE - 76)))) != 0)) {
				{
				setState(182); expression(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(183); match(4);
					setState(184); expression(0);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(192); match(3);
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
			setState(201);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(195); match(5);
				setState(196);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
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
				setState(197);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(198); match(QUOTE);
				setState(199);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(200); match(QUOTE);
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
			setState(216);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(204); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				}
				break;
			case DOLLAR_QUOTE:
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(206); match(5);
				setState(207);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(209); match(CAST);
				setState(210); match(7);
				setState(211); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(212); match(AS);
				setState(213);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(214); match(3);
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
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NumericalConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218); numericConstant();
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219); match(INTEGER_VALUE);
				}
				break;

			case 3:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220); match(DECIMAL_VALUE);
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
			setState(226);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223); match(NOT);
				setState(224); expression(0);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
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
		public TerminalNode QUOTE(int i) {
			return getToken(PlPgSqlParser.QUOTE, i);
		}
		public TerminalNode ESC(int i) {
			return getToken(PlPgSqlParser.ESC, i);
		}
		public List<TerminalNode> DOLLAR_QUOTE() { return getTokens(PlPgSqlParser.DOLLAR_QUOTE); }
		public List<TerminalNode> QUOTE() { return getTokens(PlPgSqlParser.QUOTE); }
		public TerminalNode DOLLAR_QUOTE(int i) {
			return getToken(PlPgSqlParser.DOLLAR_QUOTE, i);
		}
		public List<TerminalNode> ESC() { return getTokens(PlPgSqlParser.ESC); }
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
			int _alt;
			setState(246);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(QUOTE);
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						setState(231);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(229); match(ESC);
							}
							break;

						case 2:
							{
							setState(230);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(236); match(QUOTE);
				}
				break;
			case DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); match(DOLLAR_QUOTE);
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						setState(240);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(238); match(ESC);
							}
							break;

						case 2:
							{
							setState(239);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(245); match(DOLLAR_QUOTE);
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
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(250); expression(14);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(252); expression(13);
				}
				break;

			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); match(7);
				setState(255); expression(0);
				setState(256); match(3);
				}
				break;

			case 5:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258); varExpr();
				}
				break;

			case 6:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259); booleanLiteralExpr();
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260); numericalLiteralExpr();
				}
				break;

			case 8:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); stringLiteralExpr();
				}
				break;

			case 9:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); constantOfOtherTypes();
				}
				break;

			case 10:
				{
				_localctx = new SubQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263); select();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(267); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(268); expression(23);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(270); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(271); expression(22);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(273); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(274); expression(21);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(276); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(277); expression(20);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(279); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(280); expression(19);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(282); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(283); expression(18);
						}
						break;

					case 7:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(285); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(286); expression(13);
						}
						break;

					case 8:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(288); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(289); expression(12);
						}
						break;

					case 9:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(291); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(292); expression(11);
						}
						break;

					case 10:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(294); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(295); expression(10);
						}
						break;

					case 11:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(297); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(298); expression(9);
						}
						break;

					case 12:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(300); match(2);
						setState(301); expression(7);
						}
						break;

					case 13:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(303); ((InExpressionContext)_localctx).operator = match(IN);
						setState(304); expression(5);
						}
						break;

					case 14:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(306); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(307); expression(4);
						}
						break;

					case 15:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(309); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(310); expression(3);
						}
						break;

					case 16:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(27 >= _localctx._p)) throw new FailedPredicateException(this, "27 >= $_p");
						setState(316); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(312); match(6);
								setState(313); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = expression(0);
								setState(314); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(318); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 17:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(322);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(321); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(324); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(325); stringLiteralExpr();
						}
						break;

					case 18:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(328);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(327); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(330); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR);
						setState(331); match(TO);
						setState(332); stringLiteralExpr();
						}
						break;

					case 19:
						{
						_localctx = new LabelExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(334); match(AS);
						setState(335); ((LabelExpressionContext)_localctx).label = match(ID);
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 16, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 18, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); expression(0);
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
		enterRule(_localctx, 20, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345); plFunction();
				}
				}
				setState(348); 
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
		enterRule(_localctx, 22, RULE_plFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350); match(CREATE);
			setState(353);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(351); match(OR);
				setState(352); match(REPLACE);
				}
			}

			setState(355); match(FUNCTION);
			setState(356); ((PlFunctionContext)_localctx).functionName = match(ID);
			setState(357); match(7);
			setState(358); functionArgsList();
			setState(359); match(3);
			setState(360); functionReturns();
			setState(361); functionBody();
			setState(362); match(LANGUAGE);
			setState(363); match(LANGUAGE_NAME);
			setState(365);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(364); functionSettings();
				}
			}

			setState(367); match(8);
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
		enterRule(_localctx, 24, RULE_functionArgsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (IN - 82)) | (1L << (OUT - 82)) | (1L << (INOUT - 82)) | (1L << (VARIADIC - 82)) | (1L << (ID - 82)))) != 0)) {
				{
				setState(369); functionArg();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(370); match(4);
					setState(371); functionArg();
					}
					}
					setState(376);
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
		enterRule(_localctx, 26, RULE_functionArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (IN - 82)) | (1L << (OUT - 82)) | (1L << (INOUT - 82)) | (1L << (VARIADIC - 82)))) != 0)) {
				{
				setState(379);
				((FunctionArgContext)_localctx).argMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (IN - 82)) | (1L << (OUT - 82)) | (1L << (INOUT - 82)) | (1L << (VARIADIC - 82)))) != 0)) ) {
					((FunctionArgContext)_localctx).argMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(382); ((FunctionArgContext)_localctx).argName = match(ID);
			setState(383);
			((FunctionArgContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)))) != 0)) ) {
				((FunctionArgContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(386);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(384);
				((FunctionArgContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((FunctionArgContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(385); expression(0);
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
		enterRule(_localctx, 28, RULE_functionReturns);
		int _la;
		try {
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388); match(RETURNS);
				setState(389);
				((FunctionReturnsContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
					((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); match(RETURNS);
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(391);
					((FunctionReturnsContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
						((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(392); ((FunctionReturnsContext)_localctx).outName = match(ID);
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0) );
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
		enterRule(_localctx, 30, RULE_functionBody);
		try {
			setState(407);
			switch (_input.LA(1)) {
			case F_DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); match(F_DOLLAR_QUOTE);
				setState(400); blockStmt();
				setState(401); match(DOLLAR_QUOTE);
				}
				break;
			case F_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); match(F_QUOTE);
				setState(404); blockStmt();
				setState(405); match(QUOTE);
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
		enterRule(_localctx, 32, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE) {
				{
				{
				setState(409); match(DECLARE);
				setState(410); varDeclarationList();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416); match(BEGIN);
			setState(417); stmts();
			setState(420);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(418); match(EXCEPTION);
				setState(419); exceptionHandlingBlock();
				}
			}

			setState(422); match(END);
			setState(423); match(8);
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
		enterRule(_localctx, 34, RULE_exceptionHandlingBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(425); match(WHEN);
				setState(426); exceptionWhenConditions();
				setState(427); match(THEN);
				setState(428); stmts();
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(435); stmts();
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
		enterRule(_localctx, 36, RULE_exceptionWhenConditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); exceptionWhenCondition();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(438); match(OR);
				setState(439); exceptionWhenCondition();
				}
				}
				setState(444);
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
		enterRule(_localctx, 38, RULE_exceptionWhenCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); expression(0);
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
		enterRule(_localctx, 40, RULE_functionSettings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); window();
			setState(448); functionBehavior();
			setState(449); functionInputHandling();
			setState(450); functionSecurity();
			setState(451); functionCosts();
			setState(452); functionRows();
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
		enterRule(_localctx, 42, RULE_functionBehavior);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (IMMUTABLE - 101)) | (1L << (STABLE - 101)) | (1L << (VOLATILE - 101)))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); match(WINDOW);
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
		enterRule(_localctx, 46, RULE_functionInputHandling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (STRICT - 65)) | (1L << (CALLED_ON_NULL_INPUT - 65)) | (1L << (RETURNS_NULL_ON_NULL_INPUT - 65)))) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_functionSecurity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
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
		enterRule(_localctx, 50, RULE_functionCosts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); match(COST);
			setState(463); ((FunctionCostsContext)_localctx).value = match(INTEGER_VALUE);
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
		enterRule(_localctx, 52, RULE_functionRows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(ROWS);
			setState(466); ((FunctionRowsContext)_localctx).value = match(INTEGER_VALUE);
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
		enterRule(_localctx, 54, RULE_varDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(470);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(468); varDeclaration();
					}
					break;

				case 2:
					{
					setState(469); aliasDeclaration();
					}
					break;
				}
				}
				setState(474);
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
		enterRule(_localctx, 56, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); ((VarDeclarationContext)_localctx).varName = match(ID);
			setState(477);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(476); match(CONSTANT);
				}
			}

			setState(479);
			((VarDeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (ID - 123)) | (1L << (QNAME - 123)) | (1L << (ARRAY_TYPE - 123)) | (1L << (COPY_TYPE - 123)) | (1L << (ROW_TYPE - 123)))) != 0)) ) {
				((VarDeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(482);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(480); match(COLLATE);
				setState(481); ((VarDeclarationContext)_localctx).collationName = match(ID);
				}
			}

			setState(486);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(484); match(NOT);
				setState(485); match(NULL);
				}
			}

			setState(490);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(488);
				((VarDeclarationContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((VarDeclarationContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(489); expression(0);
				}
			}

			setState(492); match(8);
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
		enterRule(_localctx, 58, RULE_aliasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494); ((AliasDeclarationContext)_localctx).newVarName = match(ID);
			setState(495); match(ALIAS);
			setState(496); match(FOR);
			setState(497); ((AliasDeclarationContext)_localctx).oldVarName = match(ID);
			setState(498); match(8);
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
		enterRule(_localctx, 60, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); ((AssignStmtContext)_localctx).receiver = expression(0);
			setState(501); assignOperator();
			setState(502); ((AssignStmtContext)_localctx).value = expression(0);
			setState(503); match(8);
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
		enterRule(_localctx, 62, RULE_returningClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); match(RETURNING);
			setState(508);
			switch (_input.LA(1)) {
			case 7:
			case NOT:
			case ADD:
			case SUB:
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
				setState(506); returningExpressions();
				}
				break;
			case MUL:
				{
				setState(507); returningAll();
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
		enterRule(_localctx, 64, RULE_returningExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); returningOutputExpression();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(511); match(4);
				setState(512); returningOutputExpression();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(518); returningIntoClause();
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
		enterRule(_localctx, 66, RULE_returningOutputExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); expression(0);
			setState(524);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(522); match(AS);
				setState(523); ((ReturningOutputExpressionContext)_localctx).aliasName = match(ID);
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
		enterRule(_localctx, 68, RULE_returningAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526); match(MUL);
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
		enterRule(_localctx, 70, RULE_returningIntoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); match(INTO);
			setState(530);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(529); ((ReturningIntoClauseContext)_localctx).hasStrict = match(STRICT);
				}
			}

			setState(532); returningIntoTargets();
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
		enterRule(_localctx, 72, RULE_returningIntoTargets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); returningIntoTarget();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(535); match(4);
				setState(536); returningIntoTarget();
				}
				}
				setState(541);
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
		enterRule(_localctx, 74, RULE_returningIntoTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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
		enterRule(_localctx, 76, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); select();
			setState(545); match(8);
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
		enterRule(_localctx, 78, RULE_select);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547); match(SELECT);
			setState(548); selectList();
			setState(586);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(550);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(549); intoClause();
					}
				}

				setState(552); fromClause();
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(553); joinClause();
						}
						} 
					}
					setState(558);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				setState(560);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(559); whereClause();
					}
					break;
				}
				setState(563);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(562); groupByClause();
					}
					break;
				}
				setState(566);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(565); havingClause();
					}
					break;
				}
				setState(569);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(568); bulkOperationClause();
					}
					break;
				}
				setState(572);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(571); orderByClause();
					}
					break;
				}
				setState(575);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(574); limitClause();
					}
					break;
				}
				setState(578);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(577); offsetClause();
					}
					break;
				}
				setState(581);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(580); fetchClause();
					}
					break;
				}
				setState(584);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(583); forClause();
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
		enterRule(_localctx, 80, RULE_selectList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(588); match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(589); distinctClause();
				}
				break;
			case 7:
			case NOT:
			case MUL:
			case ADD:
			case SUB:
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
			setState(594);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(592); selectAll();
				}
				break;
			case 7:
			case NOT:
			case ADD:
			case SUB:
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
				setState(593); selectSpecific();
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
		enterRule(_localctx, 82, RULE_distinctClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); match(DISTINCT);
			setState(597); match(ON);
			setState(598); expression(0);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(599); match(4);
				setState(600); expression(0);
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
		enterRule(_localctx, 84, RULE_selectSpecific);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(606); expression(0);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(607); match(4);
					setState(608); expression(0);
					}
					} 
				}
				setState(613);
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
		enterRule(_localctx, 86, RULE_selectAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); match(MUL);
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
		enterRule(_localctx, 88, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616); match(INTO);
			setState(618);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(617); ((IntoClauseContext)_localctx).strict = match(STRICT);
				}
			}

			setState(620); ((IntoClauseContext)_localctx).target = match(ID);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(621); match(4);
				setState(622); ((IntoClauseContext)_localctx).target = match(ID);
				}
				}
				setState(627);
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
		enterRule(_localctx, 90, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); match(LIMIT);
			setState(629);
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
		enterRule(_localctx, 92, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); match(OFFSET);
			setState(632); ((OffsetClauseContext)_localctx).offset = match(INTEGER_VALUE);
			setState(634);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(633);
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
		enterRule(_localctx, 94, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636); match(ORDER_BY);
			setState(637); orderByItem();
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(638); match(4);
					setState(639); orderByItem();
					}
					} 
				}
				setState(644);
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
		enterRule(_localctx, 96, RULE_orderByItem);
		int _la;
		try {
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new StandardOrderingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(645); expression(0);
				setState(647);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(646);
					((StandardOrderingContext)_localctx).ordering = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
						((StandardOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(650);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(649); nullsOrdering();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new UsingOrderingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(652); expression(0);
				setState(653); orderByUsing();
				setState(655);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(654); nullsOrdering();
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
		enterRule(_localctx, 98, RULE_orderByUsing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659); match(USING);
			setState(660);
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
		enterRule(_localctx, 100, RULE_nullsOrdering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); match(NULLS);
			setState(663);
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
		enterRule(_localctx, 102, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(FROM);
			setState(666); tableExpression();
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(667); match(4);
					setState(668); tableExpression();
					}
					} 
				}
				setState(673);
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
		enterRule(_localctx, 104, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(674); match(NATURAL);
				}
			}

			setState(677); join();
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
		enterRule(_localctx, 106, RULE_tableExpression);
		int _la;
		try {
			setState(703);
			switch (_input.LA(1)) {
			case ONLY:
			case ID:
			case QNAME:
				_localctx = new FromTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(679); ((FromTableContext)_localctx).only = match(ONLY);
					}
				}

				setState(682);
				((FromTableContext)_localctx).tableName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FromTableContext)_localctx).tableName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(684);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(683); match(MUL);
					}
					break;
				}
				setState(691);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(687);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(686); match(AS);
						}
					}

					setState(689); ((FromTableContext)_localctx).alias = match(ID);
					setState(690); columnAlias();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new FromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(693); match(7);
				setState(694); select();
				setState(695); match(3);
				setState(697);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(696); match(AS);
					}
				}

				setState(699); ((FromSelectContext)_localctx).alias = match(ID);
				setState(701);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(700); columnAlias();
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
		enterRule(_localctx, 108, RULE_join);
		int _la;
		try {
			setState(750);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(705); match(INNER);
					}
				}

				setState(708); match(JOIN);
				setState(709);
				((InnerJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((InnerJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(710); match(ON);
				setState(711); condition();
				}
				break;

			case 2:
				_localctx = new LeftOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(712); match(LEFT);
				setState(713); match(OUTER);
				setState(714); match(JOIN);
				setState(715);
				((LeftOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(716); match(ON);
				setState(717); condition();
				}
				break;

			case 3:
				_localctx = new LeftJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(718); match(LEFT);
				setState(719); match(JOIN);
				setState(720);
				((LeftJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(721); match(ON);
				setState(722); condition();
				}
				break;

			case 4:
				_localctx = new RightOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(723); match(RIGHT);
				setState(724); match(OUTER);
				setState(725); match(JOIN);
				setState(726);
				((RightOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(727); match(ON);
				setState(728); condition();
				}
				break;

			case 5:
				_localctx = new RightJoinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(729); match(RIGHT);
				setState(730); match(JOIN);
				setState(731);
				((RightJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(732); match(ON);
				setState(733); condition();
				}
				break;

			case 6:
				_localctx = new FullJoinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(734); match(FULL);
				setState(735); match(OUTER);
				setState(736); match(JOIN);
				setState(737);
				((FullJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(738); match(ON);
				setState(739); condition();
				}
				break;

			case 7:
				_localctx = new FullOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(740); match(FULL);
				setState(741); match(JOIN);
				setState(742);
				((FullOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(743); match(ON);
				setState(744); condition();
				}
				break;

			case 8:
				_localctx = new CrossJoinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(745); match(CROSS);
				setState(746); match(JOIN);
				setState(747);
				((CrossJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((CrossJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(748); match(ON);
				setState(749); condition();
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
		enterRule(_localctx, 110, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); match(7);
			setState(753); columnAliasItem();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(754); match(4);
				setState(755); columnAliasItem();
				}
				}
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(761); match(3);
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
		enterRule(_localctx, 112, RULE_columnAliasItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763); match(ID);
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
		enterRule(_localctx, 114, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); match(WHERE);
			setState(766); condition();
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
		enterRule(_localctx, 116, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768); match(GROUP_BY);
			setState(769); expression(0);
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
		enterRule(_localctx, 118, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); match(HAVING);
			setState(772); condition();
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
		enterRule(_localctx, 120, RULE_bulkOperationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			((BulkOperationClauseContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (UNION - 66)) | (1L << (INTERSECT - 66)) | (1L << (EXCEPT - 66)))) != 0)) ) {
				((BulkOperationClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(775);
			((BulkOperationClauseContext)_localctx).selectMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
				((BulkOperationClauseContext)_localctx).selectMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(776); select();
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
		enterRule(_localctx, 122, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778); match(FETCH);
			setState(780);
			_la = _input.LA(1);
			if (_la==FIRST || _la==NEXT) {
				{
				setState(779);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(783);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(782); ((FetchClauseContext)_localctx).count = match(INTEGER_VALUE);
				}
			}

			setState(786);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(785);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(788); match(ONLY);
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
		enterRule(_localctx, 124, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790); match(FOR);
			setState(791);
			((ForClauseContext)_localctx).lockMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==SHARE) ) {
				((ForClauseContext)_localctx).lockMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(793);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(792); lockedTables();
				}
				break;
			}
			setState(796);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(795); ((ForClauseContext)_localctx).nowait = match(NOWAIT);
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
		enterRule(_localctx, 126, RULE_lockedTables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(798); match(OF);
			setState(799); lockedTable();
			setState(804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(800); match(4);
					setState(801); lockedTable();
					}
					} 
				}
				setState(806);
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
		enterRule(_localctx, 128, RULE_lockedTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); match(ID);
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
		enterRule(_localctx, 130, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809); insert();
			setState(810); match(8);
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
		enterRule(_localctx, 132, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812); match(INSERT);
			setState(813); match(INTO);
			setState(814);
			((InsertContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((InsertContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(816);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(815); insertColumnList();
				}
			}

			setState(820);
			switch (_input.LA(1)) {
			case VALUES:
			case DEFAULT:
				{
				setState(818); insertValuesClause();
				}
				break;
			case SELECT:
				{
				setState(819); select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(823);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(822); returningClause();
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
		enterRule(_localctx, 134, RULE_insertColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); match(7);
			setState(826); insertColumn();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(827); match(4);
				setState(828); insertColumn();
				}
				}
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834); match(3);
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
		enterRule(_localctx, 136, RULE_insertColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836); ((InsertColumnContext)_localctx).column = match(ID);
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
		enterRule(_localctx, 138, RULE_insertValuesClause);
		try {
			setState(840);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(838); insertDefaultValues();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(839); insertValues();
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
		enterRule(_localctx, 140, RULE_insertDefaultValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); match(DEFAULT);
			setState(843); match(VALUES);
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
		enterRule(_localctx, 142, RULE_insertValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845); match(VALUES);
			setState(846); insertValueTuple();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(847); match(4);
				setState(848); insertValueTuple();
				}
				}
				setState(853);
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
		enterRule(_localctx, 144, RULE_insertValueTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854); match(7);
			setState(855); expression(0);
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(856); match(4);
				setState(857); expression(0);
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(863); match(3);
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
		enterRule(_localctx, 146, RULE_updateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865); update();
			setState(866); match(8);
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
		enterRule(_localctx, 148, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868); match(UPDATE);
			setState(870);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(869); ((UpdateContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(872);
			((UpdateContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(874);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(873); ((UpdateContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(878);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(876); match(AS);
				setState(877); ((UpdateContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(880); match(SET);
			setState(883);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
				{
				setState(881); updateSingleSetClause();
				}
				break;
			case 7:
				{
				setState(882); updateMultiSetClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(886);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(885); fromClause();
				}
			}

			setState(889);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(888); whereClause();
				}
			}

			setState(892);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(891); returningClause();
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
		enterRule(_localctx, 150, RULE_updateSingleSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894); updateSingleSetAssignment();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(895); match(4);
				setState(896); updateSingleSetAssignment();
				}
				}
				setState(901);
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
		enterRule(_localctx, 152, RULE_updateSingleSetAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			((UpdateSingleSetAssignmentContext)_localctx).column = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateSingleSetAssignmentContext)_localctx).column = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(903); match(EQ);
			setState(904); updateSetValue();
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
		enterRule(_localctx, 154, RULE_updateMultiSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906); updateMultiSetAssignment();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(907); match(4);
				setState(908); updateMultiSetAssignment();
				}
				}
				setState(913);
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
		enterRule(_localctx, 156, RULE_updateMultiSetAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914); match(7);
			setState(915); updateMultiSetColumns();
			setState(916); match(3);
			setState(917); match(EQ);
			setState(918); match(7);
			setState(919); updateMultiSetValues();
			setState(920); match(3);
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
		enterRule(_localctx, 158, RULE_updateMultiSetColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922); updateMultiSetColumn();
			setState(927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(923); match(4);
				setState(924); updateMultiSetColumn();
				}
				}
				setState(929);
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
		enterRule(_localctx, 160, RULE_updateMultiSetColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
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
		enterRule(_localctx, 162, RULE_updateMultiSetValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932); updateSetValue();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(933); match(4);
				setState(934); updateSetValue();
				}
				}
				setState(939);
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
		enterRule(_localctx, 164, RULE_updateSetValue);
		int _la;
		try {
			setState(943);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
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
				setState(942); ((UpdateSetValueContext)_localctx).hasDefault = match(DEFAULT);
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
		enterRule(_localctx, 166, RULE_deleteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945); delete();
			setState(946); match(8);
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
		public UsingClauseContext usingClause() {
			return getRuleContext(UsingClauseContext.class,0);
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
		enterRule(_localctx, 168, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948); match(DELETE);
			setState(949); match(FROM);
			setState(951);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(950); ((DeleteContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(953);
			((DeleteContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((DeleteContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(955);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(954); ((DeleteContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(959);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(957); match(AS);
				setState(958); ((DeleteContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(962);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(961); usingClause();
				}
			}

			setState(965);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(964); whereClause();
				}
			}

			setState(968);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(967); returningClause();
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

	public static class UsingClauseContext extends ParserRuleContext {
		public UsingTableContext usingTable(int i) {
			return getRuleContext(UsingTableContext.class,i);
		}
		public TerminalNode USING() { return getToken(PlPgSqlParser.USING, 0); }
		public List<UsingTableContext> usingTable() {
			return getRuleContexts(UsingTableContext.class);
		}
		public UsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUsingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUsingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUsingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingClauseContext usingClause() throws RecognitionException {
		UsingClauseContext _localctx = new UsingClauseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_usingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); match(USING);
			setState(971); usingTable();
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(972); match(4);
				setState(973); usingTable();
				}
				}
				setState(978);
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

	public static class UsingTableContext extends ParserRuleContext {
		public Token tableName;
		public TerminalNode QNAME() { return getToken(PlPgSqlParser.QNAME, 0); }
		public TerminalNode ID() { return getToken(PlPgSqlParser.ID, 0); }
		public UsingTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).enterUsingTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSqlListener ) ((PlPgSqlListener)listener).exitUsingTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlPgSqlVisitor ) return ((PlPgSqlVisitor<? extends T>)visitor).visitUsingTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsingTableContext usingTable() throws RecognitionException {
		UsingTableContext _localctx = new UsingTableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_usingTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			((UsingTableContext)_localctx).tableName = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UsingTableContext)_localctx).tableName = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 174, RULE_stmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(981); stmt();
					}
					} 
				}
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
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
		enterRule(_localctx, 176, RULE_stmt);
		try {
			setState(993);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987); selectStmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988); insertStmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(989); updateStmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(990); deleteStmt();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(991); blockStmt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(992); assignStmt();
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
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 22 >= _localctx._p;

		case 1: return 21 >= _localctx._p;

		case 2: return 20 >= _localctx._p;

		case 3: return 19 >= _localctx._p;

		case 4: return 18 >= _localctx._p;

		case 5: return 17 >= _localctx._p;

		case 6: return 12 >= _localctx._p;

		case 7: return 11 >= _localctx._p;

		case 8: return 10 >= _localctx._p;

		case 9: return 9 >= _localctx._p;

		case 10: return 8 >= _localctx._p;

		case 11: return 7 >= _localctx._p;

		case 12: return 4 >= _localctx._p;

		case 13: return 3 >= _localctx._p;

		case 14: return 2 >= _localctx._p;

		case 15: return 27 >= _localctx._p;

		case 17: return 15 >= _localctx._p;

		case 16: return 16 >= _localctx._p;

		case 18: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0085\u03e6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\u00bc"+
		"\n\3\f\3\16\3\u00bf\13\3\5\3\u00c1\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00cc\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00db\n\5\3\6\3\6\3\6\5\6\u00e0\n\6\3\7\3\7\3\7\5\7\u00e5\n\7\3\b"+
		"\3\b\3\b\7\b\u00ea\n\b\f\b\16\b\u00ed\13\b\3\b\3\b\3\b\3\b\7\b\u00f3\n"+
		"\b\f\b\16\b\u00f6\13\b\3\b\5\b\u00f9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u010b\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u013f\n\t\r\t\16\t\u0140\3"+
		"\t\3\t\5\t\u0145\n\t\3\t\3\t\3\t\3\t\5\t\u014b\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0153\n\t\f\t\16\t\u0156\13\t\3\n\3\n\3\13\3\13\3\f\6\f\u015d"+
		"\n\f\r\f\16\f\u015e\3\r\3\r\3\r\5\r\u0164\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0170\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u0177\n\16"+
		"\f\16\16\16\u017a\13\16\5\16\u017c\n\16\3\17\5\17\u017f\n\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0185\n\17\3\20\3\20\3\20\3\20\3\20\6\20\u018c\n\20\r"+
		"\20\16\20\u018d\5\20\u0190\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u019a\n\21\3\22\3\22\7\22\u019e\n\22\f\22\16\22\u01a1\13\22\3\22"+
		"\3\22\3\22\3\22\5\22\u01a7\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u01b1\n\23\f\23\16\23\u01b4\13\23\3\23\3\23\3\24\3\24\3\24\7\24"+
		"\u01bb\n\24\f\24\16\24\u01be\13\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\7\35\u01d9\n\35\f\35\16\35\u01dc\13\35\3\36\3\36"+
		"\5\36\u01e0\n\36\3\36\3\36\3\36\5\36\u01e5\n\36\3\36\3\36\5\36\u01e9\n"+
		"\36\3\36\3\36\5\36\u01ed\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\5!\u01ff\n!\3\"\3\"\3\"\7\"\u0204\n\"\f\"\16"+
		"\"\u0207\13\"\3\"\5\"\u020a\n\"\3#\3#\3#\5#\u020f\n#\3$\3$\3%\3%\5%\u0215"+
		"\n%\3%\3%\3&\3&\3&\7&\u021c\n&\f&\16&\u021f\13&\3\'\3\'\3(\3(\3(\3)\3"+
		")\3)\5)\u0229\n)\3)\3)\7)\u022d\n)\f)\16)\u0230\13)\3)\5)\u0233\n)\3)"+
		"\5)\u0236\n)\3)\5)\u0239\n)\3)\5)\u023c\n)\3)\5)\u023f\n)\3)\5)\u0242"+
		"\n)\3)\5)\u0245\n)\3)\5)\u0248\n)\3)\5)\u024b\n)\5)\u024d\n)\3*\3*\5*"+
		"\u0251\n*\3*\3*\5*\u0255\n*\3+\3+\3+\3+\3+\7+\u025c\n+\f+\16+\u025f\13"+
		"+\3,\3,\3,\7,\u0264\n,\f,\16,\u0267\13,\3-\3-\3.\3.\5.\u026d\n.\3.\3."+
		"\3.\7.\u0272\n.\f.\16.\u0275\13.\3/\3/\3/\3\60\3\60\3\60\5\60\u027d\n"+
		"\60\3\61\3\61\3\61\3\61\7\61\u0283\n\61\f\61\16\61\u0286\13\61\3\62\3"+
		"\62\5\62\u028a\n\62\3\62\5\62\u028d\n\62\3\62\3\62\3\62\5\62\u0292\n\62"+
		"\5\62\u0294\n\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65"+
		"\u02a0\n\65\f\65\16\65\u02a3\13\65\3\66\5\66\u02a6\n\66\3\66\3\66\3\67"+
		"\5\67\u02ab\n\67\3\67\3\67\5\67\u02af\n\67\3\67\5\67\u02b2\n\67\3\67\3"+
		"\67\5\67\u02b6\n\67\3\67\3\67\3\67\3\67\5\67\u02bc\n\67\3\67\3\67\5\67"+
		"\u02c0\n\67\5\67\u02c2\n\67\38\58\u02c5\n8\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\58\u02f1\n8\39\39\39\39\79\u02f7\n9\f9"+
		"\169\u02fa\139\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3?\3"+
		"?\5?\u030f\n?\3?\5?\u0312\n?\3?\5?\u0315\n?\3?\3?\3@\3@\3@\5@\u031c\n"+
		"@\3@\5@\u031f\n@\3A\3A\3A\3A\7A\u0325\nA\fA\16A\u0328\13A\3B\3B\3C\3C"+
		"\3C\3D\3D\3D\3D\5D\u0333\nD\3D\3D\5D\u0337\nD\3D\5D\u033a\nD\3E\3E\3E"+
		"\3E\7E\u0340\nE\fE\16E\u0343\13E\3E\3E\3F\3F\3G\3G\5G\u034b\nG\3H\3H\3"+
		"H\3I\3I\3I\3I\7I\u0354\nI\fI\16I\u0357\13I\3J\3J\3J\3J\7J\u035d\nJ\fJ"+
		"\16J\u0360\13J\3J\3J\3K\3K\3K\3L\3L\5L\u0369\nL\3L\3L\5L\u036d\nL\3L\3"+
		"L\5L\u0371\nL\3L\3L\3L\5L\u0376\nL\3L\5L\u0379\nL\3L\5L\u037c\nL\3L\5"+
		"L\u037f\nL\3M\3M\3M\7M\u0384\nM\fM\16M\u0387\13M\3N\3N\3N\3N\3O\3O\3O"+
		"\7O\u0390\nO\fO\16O\u0393\13O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\7Q\u03a0"+
		"\nQ\fQ\16Q\u03a3\13Q\3R\3R\3S\3S\3S\7S\u03aa\nS\fS\16S\u03ad\13S\3T\3"+
		"T\3T\5T\u03b2\nT\3U\3U\3U\3V\3V\3V\5V\u03ba\nV\3V\3V\5V\u03be\nV\3V\3"+
		"V\5V\u03c2\nV\3V\5V\u03c5\nV\3V\5V\u03c8\nV\3V\5V\u03cb\nV\3W\3W\3W\3"+
		"W\7W\u03d1\nW\fW\16W\u03d4\13W\3X\3X\3Y\7Y\u03d9\nY\fY\16Y\u03dc\13Y\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\5Z\u03e4\nZ\3Z\4\u00eb\u00f4[\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\2\26\3\2}~\3\2{|\3\2}\u0081\3\2tu\4\2\20\20\33\33\3"+
		"\2TW\3\2}\177\5\2\20\20\33\33]]\3\2gi\4\2CCjk\3\2no\4\2//{{\3\2:;\3\2"+
		"GH\3\2\35 \4\2KKMM\3\2DF\3\2/\60\3\2KL\3\2>?\u0424\2\u00b4\3\2\2\2\4\u00b6"+
		"\3\2\2\2\6\u00cb\3\2\2\2\b\u00da\3\2\2\2\n\u00df\3\2\2\2\f\u00e4\3\2\2"+
		"\2\16\u00f8\3\2\2\2\20\u010a\3\2\2\2\22\u0157\3\2\2\2\24\u0159\3\2\2\2"+
		"\26\u015c\3\2\2\2\30\u0160\3\2\2\2\32\u017b\3\2\2\2\34\u017e\3\2\2\2\36"+
		"\u018f\3\2\2\2 \u0199\3\2\2\2\"\u019f\3\2\2\2$\u01b2\3\2\2\2&\u01b7\3"+
		"\2\2\2(\u01bf\3\2\2\2*\u01c1\3\2\2\2,\u01c8\3\2\2\2.\u01ca\3\2\2\2\60"+
		"\u01cc\3\2\2\2\62\u01ce\3\2\2\2\64\u01d0\3\2\2\2\66\u01d3\3\2\2\28\u01da"+
		"\3\2\2\2:\u01dd\3\2\2\2<\u01f0\3\2\2\2>\u01f6\3\2\2\2@\u01fb\3\2\2\2B"+
		"\u0200\3\2\2\2D\u020b\3\2\2\2F\u0210\3\2\2\2H\u0212\3\2\2\2J\u0218\3\2"+
		"\2\2L\u0220\3\2\2\2N\u0222\3\2\2\2P\u0225\3\2\2\2R\u0250\3\2\2\2T\u0256"+
		"\3\2\2\2V\u0260\3\2\2\2X\u0268\3\2\2\2Z\u026a\3\2\2\2\\\u0276\3\2\2\2"+
		"^\u0279\3\2\2\2`\u027e\3\2\2\2b\u0293\3\2\2\2d\u0295\3\2\2\2f\u0298\3"+
		"\2\2\2h\u029b\3\2\2\2j\u02a5\3\2\2\2l\u02c1\3\2\2\2n\u02f0\3\2\2\2p\u02f2"+
		"\3\2\2\2r\u02fd\3\2\2\2t\u02ff\3\2\2\2v\u0302\3\2\2\2x\u0305\3\2\2\2z"+
		"\u0308\3\2\2\2|\u030c\3\2\2\2~\u0318\3\2\2\2\u0080\u0320\3\2\2\2\u0082"+
		"\u0329\3\2\2\2\u0084\u032b\3\2\2\2\u0086\u032e\3\2\2\2\u0088\u033b\3\2"+
		"\2\2\u008a\u0346\3\2\2\2\u008c\u034a\3\2\2\2\u008e\u034c\3\2\2\2\u0090"+
		"\u034f\3\2\2\2\u0092\u0358\3\2\2\2\u0094\u0363\3\2\2\2\u0096\u0366\3\2"+
		"\2\2\u0098\u0380\3\2\2\2\u009a\u0388\3\2\2\2\u009c\u038c\3\2\2\2\u009e"+
		"\u0394\3\2\2\2\u00a0\u039c\3\2\2\2\u00a2\u03a4\3\2\2\2\u00a4\u03a6\3\2"+
		"\2\2\u00a6\u03b1\3\2\2\2\u00a8\u03b3\3\2\2\2\u00aa\u03b6\3\2\2\2\u00ac"+
		"\u03cc\3\2\2\2\u00ae\u03d5\3\2\2\2\u00b0\u03da\3\2\2\2\u00b2\u03e3\3\2"+
		"\2\2\u00b4\u00b5\t\2\2\2\u00b5\3\3\2\2\2\u00b6\u00b7\7}\2\2\u00b7\u00c0"+
		"\7\t\2\2\u00b8\u00bd\5\20\t\2\u00b9\u00ba\7\6\2\2\u00ba\u00bc\5\20\t\2"+
		"\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c3\5\3\2\2\2"+
		"\u00c4\u00c5\t\3\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00cc\t\4\2\2\u00c7\u00c8"+
		"\t\4\2\2\u00c8\u00c9\7z\2\2\u00c9\u00ca\t\3\2\2\u00ca\u00cc\7z\2\2\u00cb"+
		"\u00c4\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\7\3\2\2\2\u00cd\u00ce\t\4\2\2"+
		"\u00ce\u00db\5\16\b\2\u00cf\u00d0\5\16\b\2\u00d0\u00d1\7\7\2\2\u00d1\u00d2"+
		"\t\4\2\2\u00d2\u00db\3\2\2\2\u00d3\u00d4\7N\2\2\u00d4\u00d5\7\t\2\2\u00d5"+
		"\u00d6\5\16\b\2\u00d6\u00d7\7`\2\2\u00d7\u00d8\t\4\2\2\u00d8\u00d9\7\5"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00cd\3\2\2\2\u00da\u00cf\3\2\2\2\u00da"+
		"\u00d3\3\2\2\2\u00db\t\3\2\2\2\u00dc\u00e0\5\6\4\2\u00dd\u00e0\7{\2\2"+
		"\u00de\u00e0\7|\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de"+
		"\3\2\2\2\u00e0\13\3\2\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e5\5\20\t\2\u00e3"+
		"\u00e5\t\5\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\r\3\2\2\2"+
		"\u00e6\u00eb\7z\2\2\u00e7\u00ea\7\u0085\2\2\u00e8\u00ea\13\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f9\7z\2\2\u00ef\u00f4\7y\2\2\u00f0\u00f3\7\u0085\2\2\u00f1\u00f3\13"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f7\u00f9\7y\2\2\u00f8\u00e6\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f9"+
		"\17\3\2\2\2\u00fa\u00fb\b\t\1\2\u00fb\u00fc\7\31\2\2\u00fc\u010b\5\20"+
		"\t\2\u00fd\u00fe\7\32\2\2\u00fe\u010b\5\20\t\2\u00ff\u010b\5\4\3\2\u0100"+
		"\u0101\7\t\2\2\u0101\u0102\5\20\t\2\u0102\u0103\7\5\2\2\u0103\u010b\3"+
		"\2\2\2\u0104\u010b\5\2\2\2\u0105\u010b\5\f\7\2\u0106\u010b\5\n\6\2\u0107"+
		"\u010b\5\16\b\2\u0108\u010b\5\b\5\2\u0109\u010b\5P)\2\u010a\u00fa\3\2"+
		"\2\2\u010a\u00fd\3\2\2\2\u010a\u00ff\3\2\2\2\u010a\u0100\3\2\2\2\u010a"+
		"\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\u0154\3\2\2\2\u010c"+
		"\u010d\6\t\2\3\u010d\u010e\7\33\2\2\u010e\u0153\5\20\t\2\u010f\u0110\6"+
		"\t\3\3\u0110\u0111\7\34\2\2\u0111\u0153\5\20\t\2\u0112\u0113\6\t\4\3\u0113"+
		"\u0114\7\35\2\2\u0114\u0153\5\20\t\2\u0115\u0116\6\t\5\3\u0116\u0117\7"+
		"\36\2\2\u0117\u0153\5\20\t\2\u0118\u0119\6\t\6\3\u0119\u011a\7\37\2\2"+
		"\u011a\u0153\5\20\t\2\u011b\u011c\6\t\7\3\u011c\u011d\7 \2\2\u011d\u0153"+
		"\5\20\t\2\u011e\u011f\6\t\b\3\u011f\u0120\7\26\2\2\u0120\u0153\5\20\t"+
		"\2\u0121\u0122\6\t\t\3\u0122\u0123\7\27\2\2\u0123\u0153\5\20\t\2\u0124"+
		"\u0125\6\t\n\3\u0125\u0126\7\30\2\2\u0126\u0153\5\20\t\2\u0127\u0128\6"+
		"\t\13\3\u0128\u0129\7\31\2\2\u0129\u0153\5\20\t\2\u012a\u012b\6\t\f\3"+
		"\u012b\u012c\7\32\2\2\u012c\u0153\5\20\t\2\u012d\u012e\6\t\r\3\u012e\u012f"+
		"\7\4\2\2\u012f\u0153\5\20\t\2\u0130\u0131\6\t\16\3\u0131\u0132\7T\2\2"+
		"\u0132\u0153\5\20\t\2\u0133\u0134\6\t\17\3\u0134\u0135\7\16\2\2\u0135"+
		"\u0153\5\20\t\2\u0136\u0137\6\t\20\3\u0137\u0138\7\17\2\2\u0138\u0153"+
		"\5\20\t\2\u0139\u013e\6\t\21\3\u013a\u013b\7\b\2\2\u013b\u013c\5\20\t"+
		"\2\u013c\u013d\7\3\2\2\u013d\u013f\3\2\2\2\u013e\u013a\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0153\3\2\2\2\u0142"+
		"\u0144\6\t\22\3\u0143\u0145\7\23\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\13\2\2\u0147\u0153\5\16\b\2\u0148"+
		"\u014a\6\t\23\3\u0149\u014b\7\23\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3"+
		"\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\f\2\2\u014d\u014e\7\r\2\2\u014e"+
		"\u0153\5\16\b\2\u014f\u0150\6\t\24\3\u0150\u0151\7`\2\2\u0151\u0153\7"+
		"}\2\2\u0152\u010c\3\2\2\2\u0152\u010f\3\2\2\2\u0152\u0112\3\2\2\2\u0152"+
		"\u0115\3\2\2\2\u0152\u0118\3\2\2\2\u0152\u011b\3\2\2\2\u0152\u011e\3\2"+
		"\2\2\u0152\u0121\3\2\2\2\u0152\u0124\3\2\2\2\u0152\u0127\3\2\2\2\u0152"+
		"\u012a\3\2\2\2\u0152\u012d\3\2\2\2\u0152\u0130\3\2\2\2\u0152\u0133\3\2"+
		"\2\2\u0152\u0136\3\2\2\2\u0152\u0139\3\2\2\2\u0152\u0142\3\2\2\2\u0152"+
		"\u0148\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\21\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158"+
		"\t\6\2\2\u0158\23\3\2\2\2\u0159\u015a\5\20\t\2\u015a\25\3\2\2\2\u015b"+
		"\u015d\5\30\r\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\27\3\2\2\2\u0160\u0163\7Q\2\2\u0161\u0162"+
		"\7\17\2\2\u0162\u0164\7R\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\7S\2\2\u0166\u0167\7}\2\2\u0167\u0168\7\t\2"+
		"\2\u0168\u0169\5\32\16\2\u0169\u016a\7\5\2\2\u016a\u016b\5\36\20\2\u016b"+
		"\u016c\5 \21\2\u016c\u016d\7Z\2\2\u016d\u016f\7[\2\2\u016e\u0170\5*\26"+
		"\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\7\n\2\2\u0172\31\3\2\2\2\u0173\u0178\5\34\17\2\u0174\u0175\7\6\2\2\u0175"+
		"\u0177\5\34\17\2\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u0173\3\2\2\2\u017b\u017c\3\2\2\2\u017c\33\3\2\2\2\u017d\u017f\t\7\2"+
		"\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181"+
		"\7}\2\2\u0181\u0184\t\b\2\2\u0182\u0183\t\t\2\2\u0183\u0185\5\20\t\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\35\3\2\2\2\u0186\u0187\7^\2\2"+
		"\u0187\u0190\t\4\2\2\u0188\u018b\7^\2\2\u0189\u018a\t\4\2\2\u018a\u018c"+
		"\7}\2\2\u018b\u0189\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0186\3\2\2\2\u018f\u0188\3\2"+
		"\2\2\u0190\37\3\2\2\2\u0191\u0192\7w\2\2\u0192\u0193\5\"\22\2\u0193\u0194"+
		"\7y\2\2\u0194\u019a\3\2\2\2\u0195\u0196\7x\2\2\u0196\u0197\5\"\22\2\u0197"+
		"\u0198\7z\2\2\u0198\u019a\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0195\3\2"+
		"\2\2\u019a!\3\2\2\2\u019b\u019c\7a\2\2\u019c\u019e\58\35\2\u019d\u019b"+
		"\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7b\2\2\u01a3\u01a6\5\u00b0"+
		"Y\2\u01a4\u01a5\7\\\2\2\u01a5\u01a7\5$\23\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7\n"+
		"\2\2\u01aa#\3\2\2\2\u01ab\u01ac\7d\2\2\u01ac\u01ad\5&\24\2\u01ad\u01ae"+
		"\7e\2\2\u01ae\u01af\5\u00b0Y\2\u01af\u01b1\3\2\2\2\u01b0\u01ab\3\2\2\2"+
		"\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\5\u00b0Y\2\u01b6%\3\2\2\2\u01b7"+
		"\u01bc\5(\25\2\u01b8\u01b9\7\17\2\2\u01b9\u01bb\5(\25\2\u01ba\u01b8\3"+
		"\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\'\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5\20\t\2\u01c0)\3\2\2\2\u01c1"+
		"\u01c2\5.\30\2\u01c2\u01c3\5,\27\2\u01c3\u01c4\5\60\31\2\u01c4\u01c5\5"+
		"\62\32\2\u01c5\u01c6\5\64\33\2\u01c6\u01c7\5\66\34\2\u01c7+\3\2\2\2\u01c8"+
		"\u01c9\t\n\2\2\u01c9-\3\2\2\2\u01ca\u01cb\7f\2\2\u01cb/\3\2\2\2\u01cc"+
		"\u01cd\t\13\2\2\u01cd\61\3\2\2\2\u01ce\u01cf\t\f\2\2\u01cf\63\3\2\2\2"+
		"\u01d0\u01d1\7p\2\2\u01d1\u01d2\7{\2\2\u01d2\65\3\2\2\2\u01d3\u01d4\7"+
		";\2\2\u01d4\u01d5\7{\2\2\u01d5\67\3\2\2\2\u01d6\u01d9\5:\36\2\u01d7\u01d9"+
		"\5<\37\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db9\3\2\2\2\u01dc\u01da\3\2\2\2"+
		"\u01dd\u01df\7}\2\2\u01de\u01e0\7q\2\2\u01df\u01de\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\t\4\2\2\u01e2\u01e3\7r\2\2\u01e3"+
		"\u01e5\7}\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\3\2"+
		"\2\2\u01e6\u01e7\7\23\2\2\u01e7\u01e9\7s\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01eb\t\t\2\2\u01eb\u01ed\5\20"+
		"\t\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01ef\7\n\2\2\u01ef;\3\2\2\2\u01f0\u01f1\7}\2\2\u01f1\u01f2\7O\2\2\u01f2"+
		"\u01f3\7P\2\2\u01f3\u01f4\7}\2\2\u01f4\u01f5\7\n\2\2\u01f5=\3\2\2\2\u01f6"+
		"\u01f7\5\20\t\2\u01f7\u01f8\5\22\n\2\u01f8\u01f9\5\20\t\2\u01f9\u01fa"+
		"\7\n\2\2\u01fa?\3\2\2\2\u01fb\u01fe\7\"\2\2\u01fc\u01ff\5B\"\2\u01fd\u01ff"+
		"\5F$\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ffA\3\2\2\2\u0200\u0205"+
		"\5D#\2\u0201\u0202\7\6\2\2\u0202\u0204\5D#\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0208\u020a\5H%\2\u0209\u0208\3\2\2\2\u0209\u020a"+
		"\3\2\2\2\u020aC\3\2\2\2\u020b\u020e\5\20\t\2\u020c\u020d\7`\2\2\u020d"+
		"\u020f\7}\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020fE\3\2\2\2\u0210"+
		"\u0211\7\26\2\2\u0211G\3\2\2\2\u0212\u0214\7B\2\2\u0213\u0215\7C\2\2\u0214"+
		"\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\5J"+
		"&\2\u0217I\3\2\2\2\u0218\u021d\5L\'\2\u0219\u021a\7\6\2\2\u021a\u021c"+
		"\5L\'\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021eK\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0221\t\2\2\2"+
		"\u0221M\3\2\2\2\u0222\u0223\5P)\2\u0223\u0224\7\n\2\2\u0224O\3\2\2\2\u0225"+
		"\u0226\7.\2\2\u0226\u024c\5R*\2\u0227\u0229\5Z.\2\u0228\u0227\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022e\5h\65\2\u022b\u022d"+
		"\5j\66\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0233\5t"+
		";\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234"+
		"\u0236\5v<\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2"+
		"\2\u0237\u0239\5x=\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b"+
		"\3\2\2\2\u023a\u023c\5z>\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023f\5`\61\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u0241\3\2\2\2\u0240\u0242\5\\/\2\u0241\u0240\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0245\5^\60\2\u0244\u0243\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0248\5|?\2\u0247\u0246"+
		"\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u024b\5~@\2\u024a"+
		"\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u0228\3\2"+
		"\2\2\u024c\u024d\3\2\2\2\u024dQ\3\2\2\2\u024e\u0251\7/\2\2\u024f\u0251"+
		"\5T+\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0254\3\2\2\2\u0252\u0255\5X-\2\u0253\u0255\5V,\2\u0254\u0252\3\2\2\2"+
		"\u0254\u0253\3\2\2\2\u0255S\3\2\2\2\u0256\u0257\7\60\2\2\u0257\u0258\7"+
		"X\2\2\u0258\u025d\5\20\t\2\u0259\u025a\7\6\2\2\u025a\u025c\5\20\t\2\u025b"+
		"\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2"+
		"\2\2\u025eU\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0265\5\20\t\2\u0261\u0262"+
		"\7\6\2\2\u0262\u0264\5\20\t\2\u0263\u0261\3\2\2\2\u0264\u0267\3\2\2\2"+
		"\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266W\3\2\2\2\u0267\u0265\3"+
		"\2\2\2\u0268\u0269\7\26\2\2\u0269Y\3\2\2\2\u026a\u026c\7B\2\2\u026b\u026d"+
		"\7C\2\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e"+
		"\u0273\7}\2\2\u026f\u0270\7\6\2\2\u0270\u0272\7}\2\2\u0271\u026f\3\2\2"+
		"\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274["+
		"\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\78\2\2\u0277\u0278\t\r\2\2\u0278"+
		"]\3\2\2\2\u0279\u027a\79\2\2\u027a\u027c\7{\2\2\u027b\u027d\t\16\2\2\u027c"+
		"\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d_\3\2\2\2\u027e\u027f\7\66\2\2"+
		"\u027f\u0284\5b\62\2\u0280\u0281\7\6\2\2\u0281\u0283\5b\62\2\u0282\u0280"+
		"\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"a\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0289\5\20\t\2\u0288\u028a\t\17\2"+
		"\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u028d"+
		"\5f\64\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0294\3\2\2\2\u028e"+
		"\u028f\5\20\t\2\u028f\u0291\5d\63\2\u0290\u0292\5f\64\2\u0291\u0290\3"+
		"\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2\2\2\u0293\u0287\3\2\2\2\u0293"+
		"\u028e\3\2\2\2\u0294c\3\2\2\2\u0295\u0296\7I\2\2\u0296\u0297\t\20\2\2"+
		"\u0297e\3\2\2\2\u0298\u0299\7J\2\2\u0299\u029a\t\21\2\2\u029ag\3\2\2\2"+
		"\u029b\u029c\7\61\2\2\u029c\u02a1\5l\67\2\u029d\u029e\7\6\2\2\u029e\u02a0"+
		"\5l\67\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2i\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a6\7-\2\2\u02a5"+
		"\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\5n"+
		"8\2\u02a8k\3\2\2\2\u02a9\u02ab\7=\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab"+
		"\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\t\2\2\2\u02ad\u02af\7\26\2\2"+
		"\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b5\3\2\2\2\u02b0\u02b2"+
		"\7`\2\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u02b4\7}\2\2\u02b4\u02b6\5p9\2\u02b5\u02b1\3\2\2\2\u02b5\u02b6\3\2\2"+
		"\2\u02b6\u02c2\3\2\2\2\u02b7\u02b8\7\t\2\2\u02b8\u02b9\5P)\2\u02b9\u02bb"+
		"\7\5\2\2\u02ba\u02bc\7`\2\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02bf\7}\2\2\u02be\u02c0\5p9\2\u02bf\u02be\3\2\2"+
		"\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02aa\3\2\2\2\u02c1\u02b7"+
		"\3\2\2\2\u02c2m\3\2\2\2\u02c3\u02c5\7\'\2\2\u02c4\u02c3\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\7&\2\2\u02c7\u02c8\t\2"+
		"\2\2\u02c8\u02c9\7X\2\2\u02c9\u02f1\5\24\13\2\u02ca\u02cb\7(\2\2\u02cb"+
		"\u02cc\7,\2\2\u02cc\u02cd\7&\2\2\u02cd\u02ce\t\2\2\2\u02ce\u02cf\7X\2"+
		"\2\u02cf\u02f1\5\24\13\2\u02d0\u02d1\7(\2\2\u02d1\u02d2\7&\2\2\u02d2\u02d3"+
		"\t\2\2\2\u02d3\u02d4\7X\2\2\u02d4\u02f1\5\24\13\2\u02d5\u02d6\7)\2\2\u02d6"+
		"\u02d7\7,\2\2\u02d7\u02d8\7&\2\2\u02d8\u02d9\t\2\2\2\u02d9\u02da\7X\2"+
		"\2\u02da\u02f1\5\24\13\2\u02db\u02dc\7)\2\2\u02dc\u02dd\7&\2\2\u02dd\u02de"+
		"\t\2\2\2\u02de\u02df\7X\2\2\u02df\u02f1\5\24\13\2\u02e0\u02e1\7*\2\2\u02e1"+
		"\u02e2\7,\2\2\u02e2\u02e3\7&\2\2\u02e3\u02e4\t\2\2\2\u02e4\u02e5\7X\2"+
		"\2\u02e5\u02f1\5\24\13\2\u02e6\u02e7\7*\2\2\u02e7\u02e8\7&\2\2\u02e8\u02e9"+
		"\t\2\2\2\u02e9\u02ea\7X\2\2\u02ea\u02f1\5\24\13\2\u02eb\u02ec\7+\2\2\u02ec"+
		"\u02ed\7&\2\2\u02ed\u02ee\t\2\2\2\u02ee\u02ef\7X\2\2\u02ef\u02f1\5\24"+
		"\13\2\u02f0\u02c4\3\2\2\2\u02f0\u02ca\3\2\2\2\u02f0\u02d0\3\2\2\2\u02f0"+
		"\u02d5\3\2\2\2\u02f0\u02db\3\2\2\2\u02f0\u02e0\3\2\2\2\u02f0\u02e6\3\2"+
		"\2\2\u02f0\u02eb\3\2\2\2\u02f1o\3\2\2\2\u02f2\u02f3\7\t\2\2\u02f3\u02f8"+
		"\5r:\2\u02f4\u02f5\7\6\2\2\u02f5\u02f7\5r:\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2"+
		"\2\2\u02fa\u02f8\3\2\2\2\u02fb\u02fc\7\5\2\2\u02fcq\3\2\2\2\u02fd\u02fe"+
		"\7}\2\2\u02fes\3\2\2\2\u02ff\u0300\7\62\2\2\u0300\u0301\5\24\13\2\u0301"+
		"u\3\2\2\2\u0302\u0303\7\63\2\2\u0303\u0304\5\20\t\2\u0304w\3\2\2\2\u0305"+
		"\u0306\7Y\2\2\u0306\u0307\5\24\13\2\u0307y\3\2\2\2\u0308\u0309\t\22\2"+
		"\2\u0309\u030a\t\23\2\2\u030a\u030b\5P)\2\u030b{\3\2\2\2\u030c\u030e\7"+
		"<\2\2\u030d\u030f\t\24\2\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0311\3\2\2\2\u0310\u0312\7{\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312\u0314\3\2\2\2\u0313\u0315\t\16\2\2\u0314\u0313\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7=\2\2\u0317}\3\2\2\2\u0318"+
		"\u0319\7P\2\2\u0319\u031b\t\25\2\2\u031a\u031c\5\u0080A\2\u031b\u031a"+
		"\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031f\7A\2\2\u031e"+
		"\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\177\3\2\2\2\u0320\u0321\7@\2"+
		"\2\u0321\u0326\5\u0082B\2\u0322\u0323\7\6\2\2\u0323\u0325\5\u0082B\2\u0324"+
		"\u0322\3\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327\u0081\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7}\2\2\u032a"+
		"\u0083\3\2\2\2\u032b\u032c\5\u0086D\2\u032c\u032d\7\n\2\2\u032d\u0085"+
		"\3\2\2\2\u032e\u032f\7#\2\2\u032f\u0330\7B\2\2\u0330\u0332\t\2\2\2\u0331"+
		"\u0333\5\u0088E\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0337\5\u008cG\2\u0335\u0337\5P)\2\u0336\u0334\3\2\2\2"+
		"\u0336\u0335\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a\5@!\2\u0339\u0338"+
		"\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0087\3\2\2\2\u033b\u033c\7\t\2\2\u033c"+
		"\u0341\5\u008aF\2\u033d\u033e\7\6\2\2\u033e\u0340\5\u008aF\2\u033f\u033d"+
		"\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0345\7\5\2\2\u0345\u0089\3\2"+
		"\2\2\u0346\u0347\7}\2\2\u0347\u008b\3\2\2\2\u0348\u034b\5\u008eH\2\u0349"+
		"\u034b\5\u0090I\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u008d"+
		"\3\2\2\2\u034c\u034d\7]\2\2\u034d\u034e\7$\2\2\u034e\u008f\3\2\2\2\u034f"+
		"\u0350\7$\2\2\u0350\u0355\5\u0092J\2\u0351\u0352\7\6\2\2\u0352\u0354\5"+
		"\u0092J\2\u0353\u0351\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2"+
		"\u0355\u0356\3\2\2\2\u0356\u0091\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u0359"+
		"\7\t\2\2\u0359\u035e\5\20\t\2\u035a\u035b\7\6\2\2\u035b\u035d\5\20\t\2"+
		"\u035c\u035a\3\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f"+
		"\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\7\5\2\2\u0362"+
		"\u0093\3\2\2\2\u0363\u0364\5\u0096L\2\u0364\u0365\7\n\2\2\u0365\u0095"+
		"\3\2\2\2\u0366\u0368\7>\2\2\u0367\u0369\7=\2\2\u0368\u0367\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\t\2\2\2\u036b\u036d\7\26"+
		"\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0370\3\2\2\2\u036e"+
		"\u036f\7`\2\2\u036f\u0371\7}\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2"+
		"\2\u0371\u0372\3\2\2\2\u0372\u0375\7%\2\2\u0373\u0376\5\u0098M\2\u0374"+
		"\u0376\5\u009cO\2\u0375\u0373\3\2\2\2\u0375\u0374\3\2\2\2\u0376\u0378"+
		"\3\2\2\2\u0377\u0379\5h\65\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379"+
		"\u037b\3\2\2\2\u037a\u037c\5t;\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2"+
		"\2\u037c\u037e\3\2\2\2\u037d\u037f\5@!\2\u037e\u037d\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u0097\3\2\2\2\u0380\u0385\5\u009aN\2\u0381\u0382\7\6\2"+
		"\2\u0382\u0384\5\u009aN\2\u0383\u0381\3\2\2\2\u0384\u0387\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0099\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0388\u0389\t\2\2\2\u0389\u038a\7\33\2\2\u038a\u038b\5\u00a6T\2\u038b"+
		"\u009b\3\2\2\2\u038c\u0391\5\u009eP\2\u038d\u038e\7\6\2\2\u038e\u0390"+
		"\5\u009eP\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u009d\3\2\2\2\u0393\u0391\3\2\2\2\u0394\u0395"+
		"\7\t\2\2\u0395\u0396\5\u00a0Q\2\u0396\u0397\7\5\2\2\u0397\u0398\7\33\2"+
		"\2\u0398\u0399\7\t\2\2\u0399\u039a\5\u00a4S\2\u039a\u039b\7\5\2\2\u039b"+
		"\u009f\3\2\2\2\u039c\u03a1\5\u00a2R\2\u039d\u039e\7\6\2\2\u039e\u03a0"+
		"\5\u00a2R\2\u039f\u039d\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2"+
		"\2\u03a1\u03a2\3\2\2\2\u03a2\u00a1\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a5"+
		"\t\2\2\2\u03a5\u00a3\3\2\2\2\u03a6\u03ab\5\u00a6T\2\u03a7\u03a8\7\6\2"+
		"\2\u03a8\u03aa\5\u00a6T\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab"+
		"\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u00a5\3\2\2\2\u03ad\u03ab\3\2"+
		"\2\2\u03ae\u03b2\5\20\t\2\u03af\u03b2\t\2\2\2\u03b0\u03b2\7]\2\2\u03b1"+
		"\u03ae\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2\u00a7\3\2"+
		"\2\2\u03b3\u03b4\5\u00aaV\2\u03b4\u03b5\7\n\2\2\u03b5\u00a9\3\2\2\2\u03b6"+
		"\u03b7\7!\2\2\u03b7\u03b9\7\61\2\2\u03b8\u03ba\7=\2\2\u03b9\u03b8\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\t\2\2\2\u03bc"+
		"\u03be\7\26\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c1\3"+
		"\2\2\2\u03bf\u03c0\7`\2\2\u03c0\u03c2\7}\2\2\u03c1\u03bf\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c5\5\u00acW\2\u03c4\u03c3"+
		"\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03c8\5t;\2\u03c7"+
		"\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03cb\5@"+
		"!\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u00ab\3\2\2\2\u03cc"+
		"\u03cd\7I\2\2\u03cd\u03d2\5\u00aeX\2\u03ce\u03cf\7\6\2\2\u03cf\u03d1\5"+
		"\u00aeX\2\u03d0\u03ce\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d0\3\2\2\2"+
		"\u03d2\u03d3\3\2\2\2\u03d3\u00ad\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d5\u03d6"+
		"\t\2\2\2\u03d6\u00af\3\2\2\2\u03d7\u03d9\5\u00b2Z\2\u03d8\u03d7\3\2\2"+
		"\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u00b1"+
		"\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03e4\5N(\2\u03de\u03e4\5\u0084C\2"+
		"\u03df\u03e4\5\u0094K\2\u03e0\u03e4\5\u00a8U\2\u03e1\u03e4\5\"\22\2\u03e2"+
		"\u03e4\5> \2\u03e3\u03dd\3\2\2\2\u03e3\u03de\3\2\2\2\u03e3\u03df\3\2\2"+
		"\2\u03e3\u03e0\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u00b3"+
		"\3\2\2\2s\u00bd\u00c0\u00cb\u00da\u00df\u00e4\u00e9\u00eb\u00f2\u00f4"+
		"\u00f8\u010a\u0140\u0144\u014a\u0152\u0154\u015e\u0163\u016f\u0178\u017b"+
		"\u017e\u0184\u018d\u018f\u0199\u019f\u01a6\u01b2\u01bc\u01d8\u01da\u01df"+
		"\u01e4\u01e8\u01ec\u01fe\u0205\u0209\u020e\u0214\u021d\u0228\u022e\u0232"+
		"\u0235\u0238\u023b\u023e\u0241\u0244\u0247\u024a\u024c\u0250\u0254\u025d"+
		"\u0265\u026c\u0273\u027c\u0284\u0289\u028c\u0291\u0293\u02a1\u02a5\u02aa"+
		"\u02ae\u02b1\u02b5\u02bb\u02bf\u02c1\u02c4\u02f0\u02f8\u030e\u0311\u0314"+
		"\u031b\u031e\u0326\u0332\u0336\u0339\u0341\u034a\u0355\u035e\u0368\u036c"+
		"\u0370\u0375\u0378\u037b\u037e\u0385\u0391\u03a1\u03ab\u03b1\u03b9\u03bd"+
		"\u03c1\u03c4\u03c7\u03ca\u03d2\u03da\u03e3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}