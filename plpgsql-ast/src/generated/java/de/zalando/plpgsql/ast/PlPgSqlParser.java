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
		NEQ=26, LT=27, LTE=28, GT=29, GTE=30, WITH=31, RECURSIVE=32, DELETE=33, 
		RETURNING=34, INSERT=35, VALUES=36, SET=37, JOIN=38, INNER=39, LEFT=40, 
		RIGHT=41, FULL=42, CROSS=43, OUTER=44, NATURAL=45, SELECT=46, ALL=47, 
		DISTINCT=48, FROM=49, WHERE=50, GROUP_BY=51, GROUP=52, BY=53, ORDER_BY=54, 
		ORDER=55, LIMIT=56, OFFSET=57, ROW=58, ROWS=59, FETCH=60, ONLY=61, UPDATE=62, 
		SHARE=63, OF=64, NOWAIT=65, INTO=66, STRICT=67, UNION=68, INTERSECT=69, 
		EXCEPT=70, ASC=71, DESC=72, USING=73, NULLS=74, FIRST=75, NEXT=76, LAST=77, 
		CAST=78, ALIAS=79, FOR=80, CREATE=81, REPLACE=82, FUNCTION=83, IN=84, 
		OUT=85, INOUT=86, VARIADIC=87, ON=88, HAVING=89, LANGUAGE=90, LANGUAGE_NAME=91, 
		EXCEPTION=92, DEFAULT=93, RETURNS=94, TABLE=95, AS=96, DECLARE=97, BEGIN=98, 
		END=99, WHEN=100, THEN=101, WINDOW=102, IMMUTABLE=103, STABLE=104, VOLATILE=105, 
		CALLED_ON_NULL_INPUT=106, RETURNS_NULL_ON_NULL_INPUT=107, EXTERNAL=108, 
		SECURITY=109, SECURITY_INVOKER=110, SECURITY_DEFINER=111, COST=112, CONSTANT=113, 
		COLLATE=114, NULL=115, TRUE=116, FALSE=117, UNKNOWN=118, F_DOLLAR_QUOTE=119, 
		F_QUOTE=120, DOLLAR_QUOTE=121, QUOTE=122, INTEGER_VALUE=123, DECIMAL_VALUE=124, 
		ID=125, QNAME=126, ARRAY_TYPE=127, COPY_TYPE=128, ROW_TYPE=129, WS=130, 
		SL_COMMENT=131, ML_COMMENT=132, ESC=133;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", "';'", 
		"LIKE", "SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", 
		"ISNULL", "NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", 
		"'<'", "'<='", "'>'", "'>='", "WITH", "RECURSIVE", "DELETE", "RETURNING", 
		"INSERT", "VALUES", "SET", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "CROSS", 
		"OUTER", "NATURAL", "SELECT", "ALL", "DISTINCT", "FROM", "WHERE", "GROUP_BY", 
		"GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", "ROWS", 
		"FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", 
		"UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", 
		"NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", 
		"IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", 
		"EXCEPTION", "DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", 
		"END", "WHEN", "THEN", "WINDOW", "IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", 
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
		RULE_returningIntoTarget = 37, RULE_withClause = 38, RULE_withRecursiveClause = 39, 
		RULE_withQueries = 40, RULE_withQuery = 41, RULE_selectStmt = 42, RULE_select = 43, 
		RULE_selectList = 44, RULE_distinctClause = 45, RULE_selectSpecific = 46, 
		RULE_selectAll = 47, RULE_intoClause = 48, RULE_limitClause = 49, RULE_offsetClause = 50, 
		RULE_orderByClause = 51, RULE_orderByItem = 52, RULE_orderByUsing = 53, 
		RULE_nullsOrdering = 54, RULE_fromClause = 55, RULE_joinClause = 56, RULE_tableExpression = 57, 
		RULE_join = 58, RULE_columnAlias = 59, RULE_columnAliasItem = 60, RULE_whereClause = 61, 
		RULE_groupByClause = 62, RULE_havingClause = 63, RULE_bulkOperationClause = 64, 
		RULE_fetchClause = 65, RULE_forClause = 66, RULE_lockedTables = 67, RULE_lockedTable = 68, 
		RULE_insertStmt = 69, RULE_insert = 70, RULE_insertColumnList = 71, RULE_insertColumn = 72, 
		RULE_insertValuesClause = 73, RULE_insertDefaultValues = 74, RULE_insertValues = 75, 
		RULE_insertValueTuple = 76, RULE_updateStmt = 77, RULE_update = 78, RULE_updateSingleSetClause = 79, 
		RULE_updateSingleSetAssignment = 80, RULE_updateMultiSetClause = 81, RULE_updateMultiSetAssignment = 82, 
		RULE_updateMultiSetColumns = 83, RULE_updateMultiSetColumn = 84, RULE_updateMultiSetValues = 85, 
		RULE_updateSetValue = 86, RULE_deleteStmt = 87, RULE_delete = 88, RULE_usingClause = 89, 
		RULE_usingTable = 90, RULE_stmts = 91, RULE_stmt = 92;
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
		"returningIntoTarget", "withClause", "withRecursiveClause", "withQueries", 
		"withQuery", "selectStmt", "select", "selectList", "distinctClause", "selectSpecific", 
		"selectAll", "intoClause", "limitClause", "offsetClause", "orderByClause", 
		"orderByItem", "orderByUsing", "nullsOrdering", "fromClause", "joinClause", 
		"tableExpression", "join", "columnAlias", "columnAliasItem", "whereClause", 
		"groupByClause", "havingClause", "bulkOperationClause", "fetchClause", 
		"forClause", "lockedTables", "lockedTable", "insertStmt", "insert", "insertColumnList", 
		"insertColumn", "insertValuesClause", "insertDefaultValues", "insertValues", 
		"insertValueTuple", "updateStmt", "update", "updateSingleSetClause", "updateSingleSetAssignment", 
		"updateMultiSetClause", "updateMultiSetAssignment", "updateMultiSetColumns", 
		"updateMultiSetColumn", "updateMultiSetValues", "updateSetValue", "deleteStmt", 
		"delete", "usingClause", "usingTable", "stmts", "stmt"
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
			setState(186);
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
			setState(188); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(189); match(7);
			setState(198);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << WITH) | (1L << SELECT))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (CAST - 78)) | (1L << (TRUE - 78)) | (1L << (FALSE - 78)) | (1L << (DOLLAR_QUOTE - 78)) | (1L << (QUOTE - 78)) | (1L << (INTEGER_VALUE - 78)) | (1L << (DECIMAL_VALUE - 78)) | (1L << (ID - 78)) | (1L << (QNAME - 78)) | (1L << (ARRAY_TYPE - 78)) | (1L << (COPY_TYPE - 78)) | (1L << (ROW_TYPE - 78)))) != 0)) {
				{
				setState(190); expression(0);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(191); match(4);
					setState(192); expression(0);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(200); match(3);
			}
		}
		catch (RecognitionException re) {
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
			setState(209);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(203); match(5);
				setState(204);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
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
				setState(205);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(206); match(QUOTE);
				setState(207);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(208); match(QUOTE);
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
			setState(224);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(212); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				}
				break;
			case DOLLAR_QUOTE:
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(214); match(5);
				setState(215);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); match(CAST);
				setState(218); match(7);
				setState(219); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(220); match(AS);
				setState(221);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(222); match(3);
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
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NumericalConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226); numericConstant();
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227); match(INTEGER_VALUE);
				}
				break;

			case 3:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228); match(DECIMAL_VALUE);
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
			setState(234);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231); match(NOT);
				setState(232); expression(0);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
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
			setState(254);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); match(QUOTE);
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						setState(239);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(237); match(ESC);
							}
							break;

						case 2:
							{
							setState(238);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(244); match(QUOTE);
				}
				break;
			case DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(DOLLAR_QUOTE);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						setState(248);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(246); match(ESC);
							}
							break;

						case 2:
							{
							setState(247);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(253); match(DOLLAR_QUOTE);
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
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(257); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(258); expression(14);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(260); expression(13);
				}
				break;

			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); match(7);
				setState(263); expression(0);
				setState(264); match(3);
				}
				break;

			case 5:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266); varExpr();
				}
				break;

			case 6:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267); booleanLiteralExpr();
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268); numericalLiteralExpr();
				}
				break;

			case 8:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); stringLiteralExpr();
				}
				break;

			case 9:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); constantOfOtherTypes();
				}
				break;

			case 10:
				{
				_localctx = new SubQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); select();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(344);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(22 >= _localctx._p)) throw new FailedPredicateException(this, "22 >= $_p");
						setState(275); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(276); expression(23);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(278); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(279); expression(22);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(281); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(282); expression(21);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(284); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(285); expression(20);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(287); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(288); expression(19);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(290); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(291); expression(18);
						}
						break;

					case 7:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(293); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(294); expression(13);
						}
						break;

					case 8:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(296); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(297); expression(12);
						}
						break;

					case 9:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(299); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(300); expression(11);
						}
						break;

					case 10:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(302); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(303); expression(10);
						}
						break;

					case 11:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(305); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(306); expression(9);
						}
						break;

					case 12:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(308); match(2);
						setState(309); expression(7);
						}
						break;

					case 13:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(311); ((InExpressionContext)_localctx).operator = match(IN);
						setState(312); expression(5);
						}
						break;

					case 14:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(314); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(315); expression(4);
						}
						break;

					case 15:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(317); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(318); expression(3);
						}
						break;

					case 16:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(27 >= _localctx._p)) throw new FailedPredicateException(this, "27 >= $_p");
						setState(324); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(320); match(6);
								setState(321); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = expression(0);
								setState(322); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(326); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 17:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(330);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(329); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(332); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(333); stringLiteralExpr();
						}
						break;

					case 18:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(336);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(335); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(338); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR);
						setState(339); match(TO);
						setState(340); stringLiteralExpr();
						}
						break;

					case 19:
						{
						_localctx = new LabelExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(342); match(AS);
						setState(343); ((LabelExpressionContext)_localctx).label = match(ID);
						}
						break;
					}
					} 
				}
				setState(348);
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
			setState(349);
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
			setState(351); expression(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(354); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(353); plFunction();
				}
				}
				setState(356); 
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
			setState(358); match(CREATE);
			setState(361);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(359); match(OR);
				setState(360); match(REPLACE);
				}
			}

			setState(363); match(FUNCTION);
			setState(364); ((PlFunctionContext)_localctx).functionName = match(ID);
			setState(365); match(7);
			setState(366); functionArgsList();
			setState(367); match(3);
			setState(368); functionReturns();
			setState(369); functionBody();
			setState(370); match(LANGUAGE);
			setState(371); match(LANGUAGE_NAME);
			setState(373);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(372); functionSettings();
				}
			}

			setState(375); match(8);
			}
		}
		catch (RecognitionException re) {
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
			setState(385);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (IN - 84)) | (1L << (OUT - 84)) | (1L << (INOUT - 84)) | (1L << (VARIADIC - 84)) | (1L << (ID - 84)))) != 0)) {
				{
				setState(377); functionArg();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(378); match(4);
					setState(379); functionArg();
					}
					}
					setState(384);
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
			setState(388);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (IN - 84)) | (1L << (OUT - 84)) | (1L << (INOUT - 84)) | (1L << (VARIADIC - 84)))) != 0)) {
				{
				setState(387);
				((FunctionArgContext)_localctx).argMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (IN - 84)) | (1L << (OUT - 84)) | (1L << (INOUT - 84)) | (1L << (VARIADIC - 84)))) != 0)) ) {
					((FunctionArgContext)_localctx).argMode = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(390); ((FunctionArgContext)_localctx).argName = match(ID);
			setState(391);
			((FunctionArgContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)))) != 0)) ) {
				((FunctionArgContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(394);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(392);
				((FunctionArgContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((FunctionArgContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(393); expression(0);
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
			setState(405);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); match(RETURNS);
				setState(397);
				((FunctionReturnsContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
					((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); match(RETURNS);
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(399);
					((FunctionReturnsContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
						((FunctionReturnsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(400); ((FunctionReturnsContext)_localctx).outName = match(ID);
					}
					}
					setState(403); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0) );
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
			setState(415);
			switch (_input.LA(1)) {
			case F_DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(407); match(F_DOLLAR_QUOTE);
				setState(408); blockStmt();
				setState(409); match(DOLLAR_QUOTE);
				}
				break;
			case F_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(411); match(F_QUOTE);
				setState(412); blockStmt();
				setState(413); match(QUOTE);
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
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DECLARE) {
				{
				{
				setState(417); match(DECLARE);
				setState(418); varDeclarationList();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424); match(BEGIN);
			setState(425); stmts();
			setState(428);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(426); match(EXCEPTION);
				setState(427); exceptionHandlingBlock();
				}
			}

			setState(430); match(END);
			setState(431); match(8);
			}
		}
		catch (RecognitionException re) {
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
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(433); match(WHEN);
				setState(434); exceptionWhenConditions();
				setState(435); match(THEN);
				setState(436); stmts();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443); stmts();
			}
		}
		catch (RecognitionException re) {
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
			setState(445); exceptionWhenCondition();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(446); match(OR);
				setState(447); exceptionWhenCondition();
				}
				}
				setState(452);
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
			setState(453); expression(0);
			}
		}
		catch (RecognitionException re) {
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
			setState(455); window();
			setState(456); functionBehavior();
			setState(457); functionInputHandling();
			setState(458); functionSecurity();
			setState(459); functionCosts();
			setState(460); functionRows();
			}
		}
		catch (RecognitionException re) {
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
			setState(462);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (IMMUTABLE - 103)) | (1L << (STABLE - 103)) | (1L << (VOLATILE - 103)))) != 0)) ) {
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
			setState(464); match(WINDOW);
			}
		}
		catch (RecognitionException re) {
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
			setState(466);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (STRICT - 67)) | (1L << (CALLED_ON_NULL_INPUT - 67)) | (1L << (RETURNS_NULL_ON_NULL_INPUT - 67)))) != 0)) ) {
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
			setState(468);
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
			setState(470); match(COST);
			setState(471); ((FunctionCostsContext)_localctx).value = match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
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
			setState(473); match(ROWS);
			setState(474); ((FunctionRowsContext)_localctx).value = match(INTEGER_VALUE);
			}
		}
		catch (RecognitionException re) {
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
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(478);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(476); varDeclaration();
					}
					break;

				case 2:
					{
					setState(477); aliasDeclaration();
					}
					break;
				}
				}
				setState(482);
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
			setState(483); ((VarDeclarationContext)_localctx).varName = match(ID);
			setState(485);
			_la = _input.LA(1);
			if (_la==CONSTANT) {
				{
				setState(484); match(CONSTANT);
				}
			}

			setState(487);
			((VarDeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (ID - 125)) | (1L << (QNAME - 125)) | (1L << (ARRAY_TYPE - 125)) | (1L << (COPY_TYPE - 125)) | (1L << (ROW_TYPE - 125)))) != 0)) ) {
				((VarDeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(490);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(488); match(COLLATE);
				setState(489); ((VarDeclarationContext)_localctx).collationName = match(ID);
				}
			}

			setState(494);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(492); match(NOT);
				setState(493); match(NULL);
				}
			}

			setState(498);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) {
				{
				setState(496);
				((VarDeclarationContext)_localctx).initOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN_OP || _la==EQ || _la==DEFAULT) ) {
					((VarDeclarationContext)_localctx).initOperator = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(497); expression(0);
				}
			}

			setState(500); match(8);
			}
		}
		catch (RecognitionException re) {
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
			setState(502); ((AliasDeclarationContext)_localctx).newVarName = match(ID);
			setState(503); match(ALIAS);
			setState(504); match(FOR);
			setState(505); ((AliasDeclarationContext)_localctx).oldVarName = match(ID);
			setState(506); match(8);
			}
		}
		catch (RecognitionException re) {
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
			setState(508); ((AssignStmtContext)_localctx).receiver = expression(0);
			setState(509); assignOperator();
			setState(510); ((AssignStmtContext)_localctx).value = expression(0);
			setState(511); match(8);
			}
		}
		catch (RecognitionException re) {
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
			setState(513); match(RETURNING);
			setState(516);
			switch (_input.LA(1)) {
			case 7:
			case NOT:
			case ADD:
			case SUB:
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
				setState(514); returningExpressions();
				}
				break;
			case MUL:
				{
				setState(515); returningAll();
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
			setState(518); returningOutputExpression();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(519); match(4);
				setState(520); returningOutputExpression();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(526); returningIntoClause();
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
			setState(529); expression(0);
			setState(532);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(530); match(AS);
				setState(531); ((ReturningOutputExpressionContext)_localctx).aliasName = match(ID);
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
			setState(534); match(MUL);
			}
		}
		catch (RecognitionException re) {
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
			setState(536); match(INTO);
			setState(538);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(537); ((ReturningIntoClauseContext)_localctx).hasStrict = match(STRICT);
				}
			}

			setState(540); returningIntoTargets();
			}
		}
		catch (RecognitionException re) {
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
			setState(542); returningIntoTarget();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(543); match(4);
				setState(544); returningIntoTarget();
				}
				}
				setState(549);
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
			setState(550);
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
		enterRule(_localctx, 76, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); match(WITH);
			setState(553); withQueries();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_withRecursiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(WITH);
			setState(556); match(RECURSIVE);
			setState(557); withQueries();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_withQueries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); withQuery();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(560); match(4);
				setState(561); withQuery();
				}
				}
				setState(566);
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
		enterRule(_localctx, 82, RULE_withQuery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); ((WithQueryContext)_localctx).withTempTable = match(ID);
			setState(568); match(AS);
			setState(569); match(7);
			setState(570); select();
			setState(571); match(3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); select();
			setState(574); match(8);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_select);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(576); withClause();
				}
			}

			setState(579); match(SELECT);
			setState(580); selectList();
			setState(618);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(582);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(581); intoClause();
					}
				}

				setState(584); fromClause();
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(585); joinClause();
						}
						} 
					}
					setState(590);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(592);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(591); whereClause();
					}
					break;
				}
				setState(595);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(594); groupByClause();
					}
					break;
				}
				setState(598);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(597); havingClause();
					}
					break;
				}
				setState(601);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(600); bulkOperationClause();
					}
					break;
				}
				setState(604);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(603); orderByClause();
					}
					break;
				}
				setState(607);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(606); limitClause();
					}
					break;
				}
				setState(610);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(609); offsetClause();
					}
					break;
				}
				setState(613);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(612); fetchClause();
					}
					break;
				}
				setState(616);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(615); forClause();
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
		enterRule(_localctx, 88, RULE_selectList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(620); match(ALL);
				}
				break;
			case DISTINCT:
				{
				setState(621); distinctClause();
				}
				break;
			case 7:
			case NOT:
			case MUL:
			case ADD:
			case SUB:
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
			setState(626);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(624); selectAll();
				}
				break;
			case 7:
			case NOT:
			case ADD:
			case SUB:
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
				setState(625); selectSpecific();
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
		enterRule(_localctx, 90, RULE_distinctClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); match(DISTINCT);
			setState(629); match(ON);
			setState(630); expression(0);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(631); match(4);
				setState(632); expression(0);
				}
				}
				setState(637);
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
		enterRule(_localctx, 92, RULE_selectSpecific);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(638); expression(0);
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(639); match(4);
					setState(640); expression(0);
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
		enterRule(_localctx, 94, RULE_selectAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); match(MUL);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 96, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); match(INTO);
			setState(650);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(649); ((IntoClauseContext)_localctx).strict = match(STRICT);
				}
			}

			setState(652); ((IntoClauseContext)_localctx).target = match(ID);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(653); match(4);
				setState(654); ((IntoClauseContext)_localctx).target = match(ID);
				}
				}
				setState(659);
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
		enterRule(_localctx, 98, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); match(LIMIT);
			setState(661);
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
		enterRule(_localctx, 100, RULE_offsetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); match(OFFSET);
			setState(664); ((OffsetClauseContext)_localctx).offset = match(INTEGER_VALUE);
			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(665);
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
		enterRule(_localctx, 102, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668); match(ORDER_BY);
			setState(669); orderByItem();
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(670); match(4);
					setState(671); orderByItem();
					}
					} 
				}
				setState(676);
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
		enterRule(_localctx, 104, RULE_orderByItem);
		int _la;
		try {
			setState(689);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new StandardOrderingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(677); expression(0);
				setState(679);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(678);
					((StandardOrderingContext)_localctx).ordering = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
						((StandardOrderingContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(682);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(681); nullsOrdering();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new UsingOrderingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(684); expression(0);
				setState(685); orderByUsing();
				setState(687);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(686); nullsOrdering();
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
		enterRule(_localctx, 106, RULE_orderByUsing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691); match(USING);
			setState(692);
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
		enterRule(_localctx, 108, RULE_nullsOrdering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); match(NULLS);
			setState(695);
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
		enterRule(_localctx, 110, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(697); match(FROM);
			setState(698); tableExpression();
			setState(703);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(699); match(4);
					setState(700); tableExpression();
					}
					} 
				}
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 112, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if (_la==NATURAL) {
				{
				setState(706); match(NATURAL);
				}
			}

			setState(709); join();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_tableExpression);
		int _la;
		try {
			setState(735);
			switch (_input.LA(1)) {
			case ONLY:
			case ID:
			case QNAME:
				_localctx = new FromTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(711); ((FromTableContext)_localctx).only = match(ONLY);
					}
				}

				setState(714);
				((FromTableContext)_localctx).tableName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FromTableContext)_localctx).tableName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(716);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(715); match(MUL);
					}
					break;
				}
				setState(723);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(719);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(718); match(AS);
						}
					}

					setState(721); ((FromTableContext)_localctx).alias = match(ID);
					setState(722); columnAlias();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new FromSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(725); match(7);
				setState(726); select();
				setState(727); match(3);
				setState(729);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(728); match(AS);
					}
				}

				setState(731); ((FromSelectContext)_localctx).alias = match(ID);
				setState(733);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(732); columnAlias();
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
		enterRule(_localctx, 116, RULE_join);
		int _la;
		try {
			setState(782);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(737); match(INNER);
					}
				}

				setState(740); match(JOIN);
				setState(741);
				((InnerJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((InnerJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(742); match(ON);
				setState(743); condition();
				}
				break;

			case 2:
				_localctx = new LeftOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(744); match(LEFT);
				setState(745); match(OUTER);
				setState(746); match(JOIN);
				setState(747);
				((LeftOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(748); match(ON);
				setState(749); condition();
				}
				break;

			case 3:
				_localctx = new LeftJoinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(750); match(LEFT);
				setState(751); match(JOIN);
				setState(752);
				((LeftJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((LeftJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(753); match(ON);
				setState(754); condition();
				}
				break;

			case 4:
				_localctx = new RightOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(755); match(RIGHT);
				setState(756); match(OUTER);
				setState(757); match(JOIN);
				setState(758);
				((RightOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(759); match(ON);
				setState(760); condition();
				}
				break;

			case 5:
				_localctx = new RightJoinContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(761); match(RIGHT);
				setState(762); match(JOIN);
				setState(763);
				((RightJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((RightJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(764); match(ON);
				setState(765); condition();
				}
				break;

			case 6:
				_localctx = new FullJoinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(766); match(FULL);
				setState(767); match(OUTER);
				setState(768); match(JOIN);
				setState(769);
				((FullJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(770); match(ON);
				setState(771); condition();
				}
				break;

			case 7:
				_localctx = new FullOuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(772); match(FULL);
				setState(773); match(JOIN);
				setState(774);
				((FullOuterJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((FullOuterJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(775); match(ON);
				setState(776); condition();
				}
				break;

			case 8:
				_localctx = new CrossJoinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(777); match(CROSS);
				setState(778); match(JOIN);
				setState(779);
				((CrossJoinContext)_localctx).table = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QNAME) ) {
					((CrossJoinContext)_localctx).table = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(780); match(ON);
				setState(781); condition();
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
		enterRule(_localctx, 118, RULE_columnAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784); match(7);
			setState(785); columnAliasItem();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(786); match(4);
				setState(787); columnAliasItem();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793); match(3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_columnAliasItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797); match(WHERE);
			setState(798); condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800); match(GROUP_BY);
			setState(801); expression(0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803); match(HAVING);
			setState(804); condition();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_bulkOperationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			((BulkOperationClauseContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (UNION - 68)) | (1L << (INTERSECT - 68)) | (1L << (EXCEPT - 68)))) != 0)) ) {
				((BulkOperationClauseContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(807);
			((BulkOperationClauseContext)_localctx).selectMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
				((BulkOperationClauseContext)_localctx).selectMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(808); select();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_fetchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810); match(FETCH);
			setState(812);
			_la = _input.LA(1);
			if (_la==FIRST || _la==NEXT) {
				{
				setState(811);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(815);
			_la = _input.LA(1);
			if (_la==INTEGER_VALUE) {
				{
				setState(814); ((FetchClauseContext)_localctx).count = match(INTEGER_VALUE);
				}
			}

			setState(818);
			_la = _input.LA(1);
			if (_la==ROW || _la==ROWS) {
				{
				setState(817);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(820); match(ONLY);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 132, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822); match(FOR);
			setState(823);
			((ForClauseContext)_localctx).lockMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==UPDATE || _la==SHARE) ) {
				((ForClauseContext)_localctx).lockMode = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(825);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(824); lockedTables();
				}
				break;
			}
			setState(828);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(827); ((ForClauseContext)_localctx).nowait = match(NOWAIT);
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
		enterRule(_localctx, 134, RULE_lockedTables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(830); match(OF);
			setState(831); lockedTable();
			setState(836);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(832); match(4);
					setState(833); lockedTable();
					}
					} 
				}
				setState(838);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		enterRule(_localctx, 136, RULE_lockedTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 138, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841); insert();
			setState(842); match(8);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 140, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(844); withClause();
				}
			}

			setState(847); match(INSERT);
			setState(848); match(INTO);
			setState(849);
			((InsertContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((InsertContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(851);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(850); insertColumnList();
				}
			}

			setState(855);
			switch (_input.LA(1)) {
			case VALUES:
			case DEFAULT:
				{
				setState(853); insertValuesClause();
				}
				break;
			case WITH:
			case SELECT:
				{
				setState(854); select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(858);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(857); returningClause();
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
		enterRule(_localctx, 142, RULE_insertColumnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860); match(7);
			setState(861); insertColumn();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(862); match(4);
				setState(863); insertColumn();
				}
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(869); match(3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 144, RULE_insertColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871); ((InsertColumnContext)_localctx).column = match(ID);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 146, RULE_insertValuesClause);
		try {
			setState(875);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(873); insertDefaultValues();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(874); insertValues();
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
		enterRule(_localctx, 148, RULE_insertDefaultValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); match(DEFAULT);
			setState(878); match(VALUES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 150, RULE_insertValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880); match(VALUES);
			setState(881); insertValueTuple();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(882); match(4);
				setState(883); insertValueTuple();
				}
				}
				setState(888);
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
		enterRule(_localctx, 152, RULE_insertValueTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889); match(7);
			setState(890); expression(0);
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(891); match(4);
				setState(892); expression(0);
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898); match(3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 154, RULE_updateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900); update();
			setState(901); match(8);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 156, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(903); withClause();
				}
			}

			setState(906); match(UPDATE);
			setState(908);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(907); ((UpdateContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(910);
			((UpdateContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(912);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(911); ((UpdateContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(916);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(914); match(AS);
				setState(915); ((UpdateContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(918); match(SET);
			setState(921);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
				{
				setState(919); updateSingleSetClause();
				}
				break;
			case 7:
				{
				setState(920); updateMultiSetClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(924);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(923); fromClause();
				}
			}

			setState(927);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(926); whereClause();
				}
			}

			setState(930);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(929); returningClause();
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
		enterRule(_localctx, 158, RULE_updateSingleSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932); updateSingleSetAssignment();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(933); match(4);
				setState(934); updateSingleSetAssignment();
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
		enterRule(_localctx, 160, RULE_updateSingleSetAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			((UpdateSingleSetAssignmentContext)_localctx).column = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((UpdateSingleSetAssignmentContext)_localctx).column = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(941); match(EQ);
			setState(942); updateSetValue();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 162, RULE_updateMultiSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944); updateMultiSetAssignment();
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(945); match(4);
				setState(946); updateMultiSetAssignment();
				}
				}
				setState(951);
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
		enterRule(_localctx, 164, RULE_updateMultiSetAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952); match(7);
			setState(953); updateMultiSetColumns();
			setState(954); match(3);
			setState(955); match(EQ);
			setState(956); match(7);
			setState(957); updateMultiSetValues();
			setState(958); match(3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 166, RULE_updateMultiSetColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960); updateMultiSetColumn();
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(961); match(4);
				setState(962); updateMultiSetColumn();
				}
				}
				setState(967);
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
		enterRule(_localctx, 168, RULE_updateMultiSetColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
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
		enterRule(_localctx, 170, RULE_updateMultiSetValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970); updateSetValue();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(971); match(4);
				setState(972); updateSetValue();
				}
				}
				setState(977);
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
		enterRule(_localctx, 172, RULE_updateSetValue);
		int _la;
		try {
			setState(981);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
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
				setState(980); ((UpdateSetValueContext)_localctx).hasDefault = match(DEFAULT);
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
		enterRule(_localctx, 174, RULE_deleteStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983); delete();
			setState(984); match(8);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 176, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(986); withClause();
				}
			}

			setState(989); match(DELETE);
			setState(990); match(FROM);
			setState(992);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(991); ((DeleteContext)_localctx).hasOnly = match(ONLY);
				}
			}

			setState(994);
			((DeleteContext)_localctx).table = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==QNAME) ) {
				((DeleteContext)_localctx).table = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(996);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(995); ((DeleteContext)_localctx).areDescendantTablesIncluded = match(MUL);
				}
			}

			setState(1000);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(998); match(AS);
				setState(999); ((DeleteContext)_localctx).tableAliasName = match(ID);
				}
			}

			setState(1003);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1002); usingClause();
				}
			}

			setState(1006);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1005); whereClause();
				}
			}

			setState(1009);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(1008); returningClause();
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
		enterRule(_localctx, 178, RULE_usingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011); match(USING);
			setState(1012); usingTable();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(1013); match(4);
				setState(1014); usingTable();
				}
				}
				setState(1019);
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
		enterRule(_localctx, 180, RULE_usingTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
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
		enterRule(_localctx, 182, RULE_stmts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1022); stmt();
					}
					} 
				}
				setState(1027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
		enterRule(_localctx, 184, RULE_stmt);
		try {
			setState(1034);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1028); selectStmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029); insertStmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1030); updateStmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1031); deleteStmt();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1032); blockStmt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1033); assignStmt();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0087\u040f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\u00c4\n\3\f\3\16\3\u00c7\13\3\5\3\u00c9\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d4\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00e3\n\5\3\6\3\6\3\6\5\6\u00e8\n\6"+
		"\3\7\3\7\3\7\5\7\u00ed\n\7\3\b\3\b\3\b\7\b\u00f2\n\b\f\b\16\b\u00f5\13"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00fb\n\b\f\b\16\b\u00fe\13\b\3\b\5\b\u0101\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0113"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0147"+
		"\n\t\r\t\16\t\u0148\3\t\3\t\5\t\u014d\n\t\3\t\3\t\3\t\3\t\5\t\u0153\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u015b\n\t\f\t\16\t\u015e\13\t\3\n\3\n\3"+
		"\13\3\13\3\f\6\f\u0165\n\f\r\f\16\f\u0166\3\r\3\r\3\r\5\r\u016c\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0178\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\7\16\u017f\n\16\f\16\16\16\u0182\13\16\5\16\u0184\n\16\3\17\5\17"+
		"\u0187\n\17\3\17\3\17\3\17\3\17\5\17\u018d\n\17\3\20\3\20\3\20\3\20\3"+
		"\20\6\20\u0194\n\20\r\20\16\20\u0195\5\20\u0198\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u01a2\n\21\3\22\3\22\7\22\u01a6\n\22\f\22"+
		"\16\22\u01a9\13\22\3\22\3\22\3\22\3\22\5\22\u01af\n\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u01b9\n\23\f\23\16\23\u01bc\13\23\3\23"+
		"\3\23\3\24\3\24\3\24\7\24\u01c3\n\24\f\24\16\24\u01c6\13\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\7\35\u01e1\n\35\f\35\16"+
		"\35\u01e4\13\35\3\36\3\36\5\36\u01e8\n\36\3\36\3\36\3\36\5\36\u01ed\n"+
		"\36\3\36\3\36\5\36\u01f1\n\36\3\36\3\36\5\36\u01f5\n\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\5!\u0207\n!\3\"\3\""+
		"\3\"\7\"\u020c\n\"\f\"\16\"\u020f\13\"\3\"\5\"\u0212\n\"\3#\3#\3#\5#\u0217"+
		"\n#\3$\3$\3%\3%\5%\u021d\n%\3%\3%\3&\3&\3&\7&\u0224\n&\f&\16&\u0227\13"+
		"&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\7*\u0235\n*\f*\16*\u0238\13*\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3-\5-\u0244\n-\3-\3-\3-\5-\u0249\n-\3-\3-\7"+
		"-\u024d\n-\f-\16-\u0250\13-\3-\5-\u0253\n-\3-\5-\u0256\n-\3-\5-\u0259"+
		"\n-\3-\5-\u025c\n-\3-\5-\u025f\n-\3-\5-\u0262\n-\3-\5-\u0265\n-\3-\5-"+
		"\u0268\n-\3-\5-\u026b\n-\5-\u026d\n-\3.\3.\5.\u0271\n.\3.\3.\5.\u0275"+
		"\n.\3/\3/\3/\3/\3/\7/\u027c\n/\f/\16/\u027f\13/\3\60\3\60\3\60\7\60\u0284"+
		"\n\60\f\60\16\60\u0287\13\60\3\61\3\61\3\62\3\62\5\62\u028d\n\62\3\62"+
		"\3\62\3\62\7\62\u0292\n\62\f\62\16\62\u0295\13\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\5\64\u029d\n\64\3\65\3\65\3\65\3\65\7\65\u02a3\n\65\f\65\16"+
		"\65\u02a6\13\65\3\66\3\66\5\66\u02aa\n\66\3\66\5\66\u02ad\n\66\3\66\3"+
		"\66\3\66\5\66\u02b2\n\66\5\66\u02b4\n\66\3\67\3\67\3\67\38\38\38\39\3"+
		"9\39\39\79\u02c0\n9\f9\169\u02c3\139\3:\5:\u02c6\n:\3:\3:\3;\5;\u02cb"+
		"\n;\3;\3;\5;\u02cf\n;\3;\5;\u02d2\n;\3;\3;\5;\u02d6\n;\3;\3;\3;\3;\5;"+
		"\u02dc\n;\3;\3;\5;\u02e0\n;\5;\u02e2\n;\3<\5<\u02e5\n<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0311\n<\3=\3=\3=\3=\7="+
		"\u0317\n=\f=\16=\u031a\13=\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3"+
		"B\3B\3B\3C\3C\5C\u032f\nC\3C\5C\u0332\nC\3C\5C\u0335\nC\3C\3C\3D\3D\3"+
		"D\5D\u033c\nD\3D\5D\u033f\nD\3E\3E\3E\3E\7E\u0345\nE\fE\16E\u0348\13E"+
		"\3F\3F\3G\3G\3G\3H\5H\u0350\nH\3H\3H\3H\3H\5H\u0356\nH\3H\3H\5H\u035a"+
		"\nH\3H\5H\u035d\nH\3I\3I\3I\3I\7I\u0363\nI\fI\16I\u0366\13I\3I\3I\3J\3"+
		"J\3K\3K\5K\u036e\nK\3L\3L\3L\3M\3M\3M\3M\7M\u0377\nM\fM\16M\u037a\13M"+
		"\3N\3N\3N\3N\7N\u0380\nN\fN\16N\u0383\13N\3N\3N\3O\3O\3O\3P\5P\u038b\n"+
		"P\3P\3P\5P\u038f\nP\3P\3P\5P\u0393\nP\3P\3P\5P\u0397\nP\3P\3P\3P\5P\u039c"+
		"\nP\3P\5P\u039f\nP\3P\5P\u03a2\nP\3P\5P\u03a5\nP\3Q\3Q\3Q\7Q\u03aa\nQ"+
		"\fQ\16Q\u03ad\13Q\3R\3R\3R\3R\3S\3S\3S\7S\u03b6\nS\fS\16S\u03b9\13S\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\7U\u03c6\nU\fU\16U\u03c9\13U\3V\3V\3W"+
		"\3W\3W\7W\u03d0\nW\fW\16W\u03d3\13W\3X\3X\3X\5X\u03d8\nX\3Y\3Y\3Y\3Z\5"+
		"Z\u03de\nZ\3Z\3Z\3Z\5Z\u03e3\nZ\3Z\3Z\5Z\u03e7\nZ\3Z\3Z\5Z\u03eb\nZ\3"+
		"Z\5Z\u03ee\nZ\3Z\5Z\u03f1\nZ\3Z\5Z\u03f4\nZ\3[\3[\3[\3[\7[\u03fa\n[\f"+
		"[\16[\u03fd\13[\3\\\3\\\3]\7]\u0402\n]\f]\16]\u0405\13]\3^\3^\3^\3^\3"+
		"^\3^\5^\u040d\n^\3^\4\u00f3\u00fc_\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\2\26\3\2\177\u0080\3\2}~\3\2\177\u0083\3\2vw"+
		"\4\2\20\20\33\33\3\2VY\3\2\177\u0081\5\2\20\20\33\33__\3\2ik\4\2EElm\3"+
		"\2pq\4\2\61\61}}\3\2<=\3\2IJ\3\2\35 \4\2MMOO\3\2FH\3\2\61\62\3\2MN\3\2"+
		"@A\u044e\2\u00bc\3\2\2\2\4\u00be\3\2\2\2\6\u00d3\3\2\2\2\b\u00e2\3\2\2"+
		"\2\n\u00e7\3\2\2\2\f\u00ec\3\2\2\2\16\u0100\3\2\2\2\20\u0112\3\2\2\2\22"+
		"\u015f\3\2\2\2\24\u0161\3\2\2\2\26\u0164\3\2\2\2\30\u0168\3\2\2\2\32\u0183"+
		"\3\2\2\2\34\u0186\3\2\2\2\36\u0197\3\2\2\2 \u01a1\3\2\2\2\"\u01a7\3\2"+
		"\2\2$\u01ba\3\2\2\2&\u01bf\3\2\2\2(\u01c7\3\2\2\2*\u01c9\3\2\2\2,\u01d0"+
		"\3\2\2\2.\u01d2\3\2\2\2\60\u01d4\3\2\2\2\62\u01d6\3\2\2\2\64\u01d8\3\2"+
		"\2\2\66\u01db\3\2\2\28\u01e2\3\2\2\2:\u01e5\3\2\2\2<\u01f8\3\2\2\2>\u01fe"+
		"\3\2\2\2@\u0203\3\2\2\2B\u0208\3\2\2\2D\u0213\3\2\2\2F\u0218\3\2\2\2H"+
		"\u021a\3\2\2\2J\u0220\3\2\2\2L\u0228\3\2\2\2N\u022a\3\2\2\2P\u022d\3\2"+
		"\2\2R\u0231\3\2\2\2T\u0239\3\2\2\2V\u023f\3\2\2\2X\u0243\3\2\2\2Z\u0270"+
		"\3\2\2\2\\\u0276\3\2\2\2^\u0280\3\2\2\2`\u0288\3\2\2\2b\u028a\3\2\2\2"+
		"d\u0296\3\2\2\2f\u0299\3\2\2\2h\u029e\3\2\2\2j\u02b3\3\2\2\2l\u02b5\3"+
		"\2\2\2n\u02b8\3\2\2\2p\u02bb\3\2\2\2r\u02c5\3\2\2\2t\u02e1\3\2\2\2v\u0310"+
		"\3\2\2\2x\u0312\3\2\2\2z\u031d\3\2\2\2|\u031f\3\2\2\2~\u0322\3\2\2\2\u0080"+
		"\u0325\3\2\2\2\u0082\u0328\3\2\2\2\u0084\u032c\3\2\2\2\u0086\u0338\3\2"+
		"\2\2\u0088\u0340\3\2\2\2\u008a\u0349\3\2\2\2\u008c\u034b\3\2\2\2\u008e"+
		"\u034f\3\2\2\2\u0090\u035e\3\2\2\2\u0092\u0369\3\2\2\2\u0094\u036d\3\2"+
		"\2\2\u0096\u036f\3\2\2\2\u0098\u0372\3\2\2\2\u009a\u037b\3\2\2\2\u009c"+
		"\u0386\3\2\2\2\u009e\u038a\3\2\2\2\u00a0\u03a6\3\2\2\2\u00a2\u03ae\3\2"+
		"\2\2\u00a4\u03b2\3\2\2\2\u00a6\u03ba\3\2\2\2\u00a8\u03c2\3\2\2\2\u00aa"+
		"\u03ca\3\2\2\2\u00ac\u03cc\3\2\2\2\u00ae\u03d7\3\2\2\2\u00b0\u03d9\3\2"+
		"\2\2\u00b2\u03dd\3\2\2\2\u00b4\u03f5\3\2\2\2\u00b6\u03fe\3\2\2\2\u00b8"+
		"\u0403\3\2\2\2\u00ba\u040c\3\2\2\2\u00bc\u00bd\t\2\2\2\u00bd\3\3\2\2\2"+
		"\u00be\u00bf\7\177\2\2\u00bf\u00c8\7\t\2\2\u00c0\u00c5\5\20\t\2\u00c1"+
		"\u00c2\7\6\2\2\u00c2\u00c4\5\20\t\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\7\5\2\2\u00cb\5\3\2\2\2\u00cc\u00cd\t\3\2\2\u00cd\u00ce"+
		"\7\7\2\2\u00ce\u00d4\t\4\2\2\u00cf\u00d0\t\4\2\2\u00d0\u00d1\7|\2\2\u00d1"+
		"\u00d2\t\3\2\2\u00d2\u00d4\7|\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cf\3\2"+
		"\2\2\u00d4\7\3\2\2\2\u00d5\u00d6\t\4\2\2\u00d6\u00e3\5\16\b\2\u00d7\u00d8"+
		"\5\16\b\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\t\4\2\2\u00da\u00e3\3\2\2\2"+
		"\u00db\u00dc\7P\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\5\16\b\2\u00de\u00df"+
		"\7b\2\2\u00df\u00e0\t\4\2\2\u00e0\u00e1\7\5\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00d5\3\2\2\2\u00e2\u00d7\3\2\2\2\u00e2\u00db\3\2\2\2\u00e3\t\3\2\2\2"+
		"\u00e4\u00e8\5\6\4\2\u00e5\u00e8\7}\2\2\u00e6\u00e8\7~\2\2\u00e7\u00e4"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\13\3\2\2\2\u00e9"+
		"\u00ea\7\23\2\2\u00ea\u00ed\5\20\t\2\u00eb\u00ed\t\5\2\2\u00ec\u00e9\3"+
		"\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\r\3\2\2\2\u00ee\u00f3\7|\2\2\u00ef\u00f2"+
		"\7\u0087\2\2\u00f0\u00f2\13\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0101\7|\2\2\u00f7\u00fc\7{\2"+
		"\2\u00f8\u00fb\7\u0087\2\2\u00f9\u00fb\13\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7{\2\2\u0100"+
		"\u00ee\3\2\2\2\u0100\u00f7\3\2\2\2\u0101\17\3\2\2\2\u0102\u0103\b\t\1"+
		"\2\u0103\u0104\7\31\2\2\u0104\u0113\5\20\t\2\u0105\u0106\7\32\2\2\u0106"+
		"\u0113\5\20\t\2\u0107\u0113\5\4\3\2\u0108\u0109\7\t\2\2\u0109\u010a\5"+
		"\20\t\2\u010a\u010b\7\5\2\2\u010b\u0113\3\2\2\2\u010c\u0113\5\2\2\2\u010d"+
		"\u0113\5\f\7\2\u010e\u0113\5\n\6\2\u010f\u0113\5\16\b\2\u0110\u0113\5"+
		"\b\5\2\u0111\u0113\5X-\2\u0112\u0102\3\2\2\2\u0112\u0105\3\2\2\2\u0112"+
		"\u0107\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2"+
		"\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113\u015c\3\2\2\2\u0114\u0115\6\t\2\3\u0115\u0116\7\33"+
		"\2\2\u0116\u015b\5\20\t\2\u0117\u0118\6\t\3\3\u0118\u0119\7\34\2\2\u0119"+
		"\u015b\5\20\t\2\u011a\u011b\6\t\4\3\u011b\u011c\7\35\2\2\u011c\u015b\5"+
		"\20\t\2\u011d\u011e\6\t\5\3\u011e\u011f\7\36\2\2\u011f\u015b\5\20\t\2"+
		"\u0120\u0121\6\t\6\3\u0121\u0122\7\37\2\2\u0122\u015b\5\20\t\2\u0123\u0124"+
		"\6\t\7\3\u0124\u0125\7 \2\2\u0125\u015b\5\20\t\2\u0126\u0127\6\t\b\3\u0127"+
		"\u0128\7\26\2\2\u0128\u015b\5\20\t\2\u0129\u012a\6\t\t\3\u012a\u012b\7"+
		"\27\2\2\u012b\u015b\5\20\t\2\u012c\u012d\6\t\n\3\u012d\u012e\7\30\2\2"+
		"\u012e\u015b\5\20\t\2\u012f\u0130\6\t\13\3\u0130\u0131\7\31\2\2\u0131"+
		"\u015b\5\20\t\2\u0132\u0133\6\t\f\3\u0133\u0134\7\32\2\2\u0134\u015b\5"+
		"\20\t\2\u0135\u0136\6\t\r\3\u0136\u0137\7\4\2\2\u0137\u015b\5\20\t\2\u0138"+
		"\u0139\6\t\16\3\u0139\u013a\7V\2\2\u013a\u015b\5\20\t\2\u013b\u013c\6"+
		"\t\17\3\u013c\u013d\7\16\2\2\u013d\u015b\5\20\t\2\u013e\u013f\6\t\20\3"+
		"\u013f\u0140\7\17\2\2\u0140\u015b\5\20\t\2\u0141\u0146\6\t\21\3\u0142"+
		"\u0143\7\b\2\2\u0143\u0144\5\20\t\2\u0144\u0145\7\3\2\2\u0145\u0147\3"+
		"\2\2\2\u0146\u0142\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u015b\3\2\2\2\u014a\u014c\6\t\22\3\u014b\u014d\7"+
		"\23\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\7\13\2\2\u014f\u015b\5\16\b\2\u0150\u0152\6\t\23\3\u0151\u0153"+
		"\7\23\2\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0155\7\f\2\2\u0155\u0156\7\r\2\2\u0156\u015b\5\16\b\2\u0157\u0158"+
		"\6\t\24\3\u0158\u0159\7b\2\2\u0159\u015b\7\177\2\2\u015a\u0114\3\2\2\2"+
		"\u015a\u0117\3\2\2\2\u015a\u011a\3\2\2\2\u015a\u011d\3\2\2\2\u015a\u0120"+
		"\3\2\2\2\u015a\u0123\3\2\2\2\u015a\u0126\3\2\2\2\u015a\u0129\3\2\2\2\u015a"+
		"\u012c\3\2\2\2\u015a\u012f\3\2\2\2\u015a\u0132\3\2\2\2\u015a\u0135\3\2"+
		"\2\2\u015a\u0138\3\2\2\2\u015a\u013b\3\2\2\2\u015a\u013e\3\2\2\2\u015a"+
		"\u0141\3\2\2\2\u015a\u014a\3\2\2\2\u015a\u0150\3\2\2\2\u015a\u0157\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\21\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\t\6\2\2\u0160\23\3\2\2\2\u0161"+
		"\u0162\5\20\t\2\u0162\25\3\2\2\2\u0163\u0165\5\30\r\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\27\3\2\2\2\u0168\u016b\7S\2\2\u0169\u016a\7\17\2\2\u016a\u016c\7T\2\2"+
		"\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e"+
		"\7U\2\2\u016e\u016f\7\177\2\2\u016f\u0170\7\t\2\2\u0170\u0171\5\32\16"+
		"\2\u0171\u0172\7\5\2\2\u0172\u0173\5\36\20\2\u0173\u0174\5 \21\2\u0174"+
		"\u0175\7\\\2\2\u0175\u0177\7]\2\2\u0176\u0178\5*\26\2\u0177\u0176\3\2"+
		"\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\n\2\2\u017a"+
		"\31\3\2\2\2\u017b\u0180\5\34\17\2\u017c\u017d\7\6\2\2\u017d\u017f\5\34"+
		"\17\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u017b\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\33\3\2\2\2\u0185\u0187\t\7\2\2\u0186\u0185"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\177\2\2"+
		"\u0189\u018c\t\b\2\2\u018a\u018b\t\t\2\2\u018b\u018d\5\20\t\2\u018c\u018a"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\35\3\2\2\2\u018e\u018f\7`\2\2\u018f"+
		"\u0198\t\4\2\2\u0190\u0193\7`\2\2\u0191\u0192\t\4\2\2\u0192\u0194\7\177"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u018e\3\2\2\2\u0197\u0190\3\2"+
		"\2\2\u0198\37\3\2\2\2\u0199\u019a\7y\2\2\u019a\u019b\5\"\22\2\u019b\u019c"+
		"\7{\2\2\u019c\u01a2\3\2\2\2\u019d\u019e\7z\2\2\u019e\u019f\5\"\22\2\u019f"+
		"\u01a0\7|\2\2\u01a0\u01a2\3\2\2\2\u01a1\u0199\3\2\2\2\u01a1\u019d\3\2"+
		"\2\2\u01a2!\3\2\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a6\58\35\2\u01a5\u01a3"+
		"\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7d\2\2\u01ab\u01ae\5\u00b8"+
		"]\2\u01ac\u01ad\7^\2\2\u01ad\u01af\5$\23\2\u01ae\u01ac\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7e\2\2\u01b1\u01b2\7\n\2\2\u01b2"+
		"#\3\2\2\2\u01b3\u01b4\7f\2\2\u01b4\u01b5\5&\24\2\u01b5\u01b6\7g\2\2\u01b6"+
		"\u01b7\5\u00b8]\2\u01b7\u01b9\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01be\5\u00b8]\2\u01be%\3\2\2\2\u01bf\u01c4\5(\25"+
		"\2\u01c0\u01c1\7\17\2\2\u01c1\u01c3\5(\25\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\'\3\2\2\2"+
		"\u01c6\u01c4\3\2\2\2\u01c7\u01c8\5\20\t\2\u01c8)\3\2\2\2\u01c9\u01ca\5"+
		".\30\2\u01ca\u01cb\5,\27\2\u01cb\u01cc\5\60\31\2\u01cc\u01cd\5\62\32\2"+
		"\u01cd\u01ce\5\64\33\2\u01ce\u01cf\5\66\34\2\u01cf+\3\2\2\2\u01d0\u01d1"+
		"\t\n\2\2\u01d1-\3\2\2\2\u01d2\u01d3\7h\2\2\u01d3/\3\2\2\2\u01d4\u01d5"+
		"\t\13\2\2\u01d5\61\3\2\2\2\u01d6\u01d7\t\f\2\2\u01d7\63\3\2\2\2\u01d8"+
		"\u01d9\7r\2\2\u01d9\u01da\7}\2\2\u01da\65\3\2\2\2\u01db\u01dc\7=\2\2\u01dc"+
		"\u01dd\7}\2\2\u01dd\67\3\2\2\2\u01de\u01e1\5:\36\2\u01df\u01e1\5<\37\2"+
		"\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e39\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e7\7\177\2\2\u01e6\u01e8\7s\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3"+
		"\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\t\4\2\2\u01ea\u01eb\7t\2\2\u01eb"+
		"\u01ed\7\177\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f0\3"+
		"\2\2\2\u01ee\u01ef\7\23\2\2\u01ef\u01f1\7u\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f3\t\t\2\2\u01f3\u01f5\5\20"+
		"\t\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\7\n\2\2\u01f7;\3\2\2\2\u01f8\u01f9\7\177\2\2\u01f9\u01fa\7Q\2\2"+
		"\u01fa\u01fb\7R\2\2\u01fb\u01fc\7\177\2\2\u01fc\u01fd\7\n\2\2\u01fd=\3"+
		"\2\2\2\u01fe\u01ff\5\20\t\2\u01ff\u0200\5\22\n\2\u0200\u0201\5\20\t\2"+
		"\u0201\u0202\7\n\2\2\u0202?\3\2\2\2\u0203\u0206\7$\2\2\u0204\u0207\5B"+
		"\"\2\u0205\u0207\5F$\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207A"+
		"\3\2\2\2\u0208\u020d\5D#\2\u0209\u020a\7\6\2\2\u020a\u020c\5D#\2\u020b"+
		"\u0209\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0212\5H%\2\u0211\u0210"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212C\3\2\2\2\u0213\u0216\5\20\t\2\u0214"+
		"\u0215\7b\2\2\u0215\u0217\7\177\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3"+
		"\2\2\2\u0217E\3\2\2\2\u0218\u0219\7\26\2\2\u0219G\3\2\2\2\u021a\u021c"+
		"\7D\2\2\u021b\u021d\7E\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021f\5J&\2\u021fI\3\2\2\2\u0220\u0225\5L\'\2\u0221"+
		"\u0222\7\6\2\2\u0222\u0224\5L\'\2\u0223\u0221\3\2\2\2\u0224\u0227\3\2"+
		"\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226K\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0228\u0229\t\2\2\2\u0229M\3\2\2\2\u022a\u022b\7!\2\2\u022b\u022c"+
		"\5R*\2\u022cO\3\2\2\2\u022d\u022e\7!\2\2\u022e\u022f\7\"\2\2\u022f\u0230"+
		"\5R*\2\u0230Q\3\2\2\2\u0231\u0236\5T+\2\u0232\u0233\7\6\2\2\u0233\u0235"+
		"\5T+\2\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237S\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7\177\2"+
		"\2\u023a\u023b\7b\2\2\u023b\u023c\7\t\2\2\u023c\u023d\5X-\2\u023d\u023e"+
		"\7\5\2\2\u023eU\3\2\2\2\u023f\u0240\5X-\2\u0240\u0241\7\n\2\2\u0241W\3"+
		"\2\2\2\u0242\u0244\5N(\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\7\60\2\2\u0246\u026c\5Z.\2\u0247\u0249\5b\62"+
		"\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024e"+
		"\5p9\2\u024b\u024d\5r:\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0251\u0253\5|?\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255"+
		"\3\2\2\2\u0254\u0256\5~@\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0259\5\u0080A\2\u0258\u0257\3\2\2\2\u0258\u0259"+
		"\3\2\2\2\u0259\u025b\3\2\2\2\u025a\u025c\5\u0082B\2\u025b\u025a\3\2\2"+
		"\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025f\5h\65\2\u025e\u025d"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u0262\5d\63\2\u0261"+
		"\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0265\5f"+
		"\64\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266"+
		"\u0268\5\u0084C\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a"+
		"\3\2\2\2\u0269\u026b\5\u0086D\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2"+
		"\2\u026b\u026d\3\2\2\2\u026c\u0248\3\2\2\2\u026c\u026d\3\2\2\2\u026dY"+
		"\3\2\2\2\u026e\u0271\7\61\2\2\u026f\u0271\5\\/\2\u0270\u026e\3\2\2\2\u0270"+
		"\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0275\5`"+
		"\61\2\u0273\u0275\5^\60\2\u0274\u0272\3\2\2\2\u0274\u0273\3\2\2\2\u0275"+
		"[\3\2\2\2\u0276\u0277\7\62\2\2\u0277\u0278\7Z\2\2\u0278\u027d\5\20\t\2"+
		"\u0279\u027a\7\6\2\2\u027a\u027c\5\20\t\2\u027b\u0279\3\2\2\2\u027c\u027f"+
		"\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e]\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u0280\u0285\5\20\t\2\u0281\u0282\7\6\2\2\u0282\u0284\5"+
		"\20\t\2\u0283\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286_\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u0289\7\26\2\2"+
		"\u0289a\3\2\2\2\u028a\u028c\7D\2\2\u028b\u028d\7E\2\2\u028c\u028b\3\2"+
		"\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0293\7\177\2\2\u028f"+
		"\u0290\7\6\2\2\u0290\u0292\7\177\2\2\u0291\u028f\3\2\2\2\u0292\u0295\3"+
		"\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294c\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0296\u0297\7:\2\2\u0297\u0298\t\r\2\2\u0298e\3\2\2\2\u0299\u029a"+
		"\7;\2\2\u029a\u029c\7}\2\2\u029b\u029d\t\16\2\2\u029c\u029b\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029dg\3\2\2\2\u029e\u029f\78\2\2\u029f\u02a4\5j\66\2\u02a0"+
		"\u02a1\7\6\2\2\u02a1\u02a3\5j\66\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2"+
		"\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5i\3\2\2\2\u02a6\u02a4"+
		"\3\2\2\2\u02a7\u02a9\5\20\t\2\u02a8\u02aa\t\17\2\2\u02a9\u02a8\3\2\2\2"+
		"\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02ad\5n8\2\u02ac\u02ab"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b4\3\2\2\2\u02ae\u02af\5\20\t\2"+
		"\u02af\u02b1\5l\67\2\u02b0\u02b2\5n8\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02a7\3\2\2\2\u02b3\u02ae\3\2\2\2\u02b4"+
		"k\3\2\2\2\u02b5\u02b6\7K\2\2\u02b6\u02b7\t\20\2\2\u02b7m\3\2\2\2\u02b8"+
		"\u02b9\7L\2\2\u02b9\u02ba\t\21\2\2\u02bao\3\2\2\2\u02bb\u02bc\7\63\2\2"+
		"\u02bc\u02c1\5t;\2\u02bd\u02be\7\6\2\2\u02be\u02c0\5t;\2\u02bf\u02bd\3"+
		"\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2"+
		"q\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\u02c6\7/\2\2\u02c5\u02c4\3\2\2\2\u02c5"+
		"\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\5v<\2\u02c8s\3\2\2\2\u02c9"+
		"\u02cb\7?\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u02ce\t\2\2\2\u02cd\u02cf\7\26\2\2\u02ce\u02cd\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d5\3\2\2\2\u02d0\u02d2\7b\2\2\u02d1\u02d0\3\2"+
		"\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\7\177\2\2\u02d4"+
		"\u02d6\5x=\2\u02d5\u02d1\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02e2\3\2\2"+
		"\2\u02d7\u02d8\7\t\2\2\u02d8\u02d9\5X-\2\u02d9\u02db\7\5\2\2\u02da\u02dc"+
		"\7b\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02df\7\177\2\2\u02de\u02e0\5x=\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02ca\3\2\2\2\u02e1\u02d7\3\2\2\2\u02e2"+
		"u\3\2\2\2\u02e3\u02e5\7)\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e7\7(\2\2\u02e7\u02e8\t\2\2\2\u02e8\u02e9\7Z\2"+
		"\2\u02e9\u0311\5\24\13\2\u02ea\u02eb\7*\2\2\u02eb\u02ec\7.\2\2\u02ec\u02ed"+
		"\7(\2\2\u02ed\u02ee\t\2\2\2\u02ee\u02ef\7Z\2\2\u02ef\u0311\5\24\13\2\u02f0"+
		"\u02f1\7*\2\2\u02f1\u02f2\7(\2\2\u02f2\u02f3\t\2\2\2\u02f3\u02f4\7Z\2"+
		"\2\u02f4\u0311\5\24\13\2\u02f5\u02f6\7+\2\2\u02f6\u02f7\7.\2\2\u02f7\u02f8"+
		"\7(\2\2\u02f8\u02f9\t\2\2\2\u02f9\u02fa\7Z\2\2\u02fa\u0311\5\24\13\2\u02fb"+
		"\u02fc\7+\2\2\u02fc\u02fd\7(\2\2\u02fd\u02fe\t\2\2\2\u02fe\u02ff\7Z\2"+
		"\2\u02ff\u0311\5\24\13\2\u0300\u0301\7,\2\2\u0301\u0302\7.\2\2\u0302\u0303"+
		"\7(\2\2\u0303\u0304\t\2\2\2\u0304\u0305\7Z\2\2\u0305\u0311\5\24\13\2\u0306"+
		"\u0307\7,\2\2\u0307\u0308\7(\2\2\u0308\u0309\t\2\2\2\u0309\u030a\7Z\2"+
		"\2\u030a\u0311\5\24\13\2\u030b\u030c\7-\2\2\u030c\u030d\7(\2\2\u030d\u030e"+
		"\t\2\2\2\u030e\u030f\7Z\2\2\u030f\u0311\5\24\13\2\u0310\u02e4\3\2\2\2"+
		"\u0310\u02ea\3\2\2\2\u0310\u02f0\3\2\2\2\u0310\u02f5\3\2\2\2\u0310\u02fb"+
		"\3\2\2\2\u0310\u0300\3\2\2\2\u0310\u0306\3\2\2\2\u0310\u030b\3\2\2\2\u0311"+
		"w\3\2\2\2\u0312\u0313\7\t\2\2\u0313\u0318\5z>\2\u0314\u0315\7\6\2\2\u0315"+
		"\u0317\5z>\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2"+
		"\2\u0318\u0319\3\2\2\2\u0319\u031b\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031c"+
		"\7\5\2\2\u031cy\3\2\2\2\u031d\u031e\7\177\2\2\u031e{\3\2\2\2\u031f\u0320"+
		"\7\64\2\2\u0320\u0321\5\24\13\2\u0321}\3\2\2\2\u0322\u0323\7\65\2\2\u0323"+
		"\u0324\5\20\t\2\u0324\177\3\2\2\2\u0325\u0326\7[\2\2\u0326\u0327\5\24"+
		"\13\2\u0327\u0081\3\2\2\2\u0328\u0329\t\22\2\2\u0329\u032a\t\23\2\2\u032a"+
		"\u032b\5X-\2\u032b\u0083\3\2\2\2\u032c\u032e\7>\2\2\u032d\u032f\t\24\2"+
		"\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u0332"+
		"\7}\2\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333"+
		"\u0335\t\16\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3"+
		"\2\2\2\u0336\u0337\7?\2\2\u0337\u0085\3\2\2\2\u0338\u0339\7R\2\2\u0339"+
		"\u033b\t\25\2\2\u033a\u033c\5\u0088E\2\u033b\u033a\3\2\2\2\u033b\u033c"+
		"\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033f\7C\2\2\u033e\u033d\3\2\2\2\u033e"+
		"\u033f\3\2\2\2\u033f\u0087\3\2\2\2\u0340\u0341\7B\2\2\u0341\u0346\5\u008a"+
		"F\2\u0342\u0343\7\6\2\2\u0343\u0345\5\u008aF\2\u0344\u0342\3\2\2\2\u0345"+
		"\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0089\3\2"+
		"\2\2\u0348\u0346\3\2\2\2\u0349\u034a\7\177\2\2\u034a\u008b\3\2\2\2\u034b"+
		"\u034c\5\u008eH\2\u034c\u034d\7\n\2\2\u034d\u008d\3\2\2\2\u034e\u0350"+
		"\5N(\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0352\7%\2\2\u0352\u0353\7D\2\2\u0353\u0355\t\2\2\2\u0354\u0356\5\u0090"+
		"I\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0359\3\2\2\2\u0357"+
		"\u035a\5\u0094K\2\u0358\u035a\5X-\2\u0359\u0357\3\2\2\2\u0359\u0358\3"+
		"\2\2\2\u035a\u035c\3\2\2\2\u035b\u035d\5@!\2\u035c\u035b\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u008f\3\2\2\2\u035e\u035f\7\t\2\2\u035f\u0364\5\u0092"+
		"J\2\u0360\u0361\7\6\2\2\u0361\u0363\5\u0092J\2\u0362\u0360\3\2\2\2\u0363"+
		"\u0366\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2"+
		"\2\2\u0366\u0364\3\2\2\2\u0367\u0368\7\5\2\2\u0368\u0091\3\2\2\2\u0369"+
		"\u036a\7\177\2\2\u036a\u0093\3\2\2\2\u036b\u036e\5\u0096L\2\u036c\u036e"+
		"\5\u0098M\2\u036d\u036b\3\2\2\2\u036d\u036c\3\2\2\2\u036e\u0095\3\2\2"+
		"\2\u036f\u0370\7_\2\2\u0370\u0371\7&\2\2\u0371\u0097\3\2\2\2\u0372\u0373"+
		"\7&\2\2\u0373\u0378\5\u009aN\2\u0374\u0375\7\6\2\2\u0375\u0377\5\u009a"+
		"N\2\u0376\u0374\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u0099\3\2\2\2\u037a\u0378\3\2\2\2\u037b\u037c\7\t"+
		"\2\2\u037c\u0381\5\20\t\2\u037d\u037e\7\6\2\2\u037e\u0380\5\20\t\2\u037f"+
		"\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0381\u0382\3\2"+
		"\2\2\u0382\u0384\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u0385\7\5\2\2\u0385"+
		"\u009b\3\2\2\2\u0386\u0387\5\u009eP\2\u0387\u0388\7\n\2\2\u0388\u009d"+
		"\3\2\2\2\u0389\u038b\5N(\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u038e\7@\2\2\u038d\u038f\7?\2\2\u038e\u038d\3\2\2"+
		"\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\t\2\2\2\u0391\u0393"+
		"\7\26\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0396\3\2\2\2"+
		"\u0394\u0395\7b\2\2\u0395\u0397\7\177\2\2\u0396\u0394\3\2\2\2\u0396\u0397"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039b\7\'\2\2\u0399\u039c\5\u00a0Q"+
		"\2\u039a\u039c\5\u00a4S\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2\2\2\u039c"+
		"\u039e\3\2\2\2\u039d\u039f\5p9\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2"+
		"\2\u039f\u03a1\3\2\2\2\u03a0\u03a2\5|?\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a5\5@!\2\u03a4\u03a3\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u009f\3\2\2\2\u03a6\u03ab\5\u00a2R\2\u03a7\u03a8"+
		"\7\6\2\2\u03a8\u03aa\5\u00a2R\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad\3\2\2"+
		"\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u00a1\3\2\2\2\u03ad\u03ab"+
		"\3\2\2\2\u03ae\u03af\t\2\2\2\u03af\u03b0\7\33\2\2\u03b0\u03b1\5\u00ae"+
		"X\2\u03b1\u00a3\3\2\2\2\u03b2\u03b7\5\u00a6T\2\u03b3\u03b4\7\6\2\2\u03b4"+
		"\u03b6\5\u00a6T\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5"+
		"\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u00a5\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03bb\7\t\2\2\u03bb\u03bc\5\u00a8U\2\u03bc\u03bd\7\5\2\2\u03bd\u03be"+
		"\7\33\2\2\u03be\u03bf\7\t\2\2\u03bf\u03c0\5\u00acW\2\u03c0\u03c1\7\5\2"+
		"\2\u03c1\u00a7\3\2\2\2\u03c2\u03c7\5\u00aaV\2\u03c3\u03c4\7\6\2\2\u03c4"+
		"\u03c6\5\u00aaV\2\u03c5\u03c3\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u00a9\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca"+
		"\u03cb\t\2\2\2\u03cb\u00ab\3\2\2\2\u03cc\u03d1\5\u00aeX\2\u03cd\u03ce"+
		"\7\6\2\2\u03ce\u03d0\5\u00aeX\2\u03cf\u03cd\3\2\2\2\u03d0\u03d3\3\2\2"+
		"\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u00ad\3\2\2\2\u03d3\u03d1"+
		"\3\2\2\2\u03d4\u03d8\5\20\t\2\u03d5\u03d8\t\2\2\2\u03d6\u03d8\7_\2\2\u03d7"+
		"\u03d4\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d6\3\2\2\2\u03d8\u00af\3\2"+
		"\2\2\u03d9\u03da\5\u00b2Z\2\u03da\u03db\7\n\2\2\u03db\u00b1\3\2\2\2\u03dc"+
		"\u03de\5N(\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2"+
		"\2\u03df\u03e0\7#\2\2\u03e0\u03e2\7\63\2\2\u03e1\u03e3\7?\2\2\u03e2\u03e1"+
		"\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\t\2\2\2\u03e5"+
		"\u03e7\7\26\2\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03ea\3"+
		"\2\2\2\u03e8\u03e9\7b\2\2\u03e9\u03eb\7\177\2\2\u03ea\u03e8\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03ee\5\u00b4[\2\u03ed\u03ec"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f0\3\2\2\2\u03ef\u03f1\5|?\2\u03f0"+
		"\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03f4\5@"+
		"!\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u00b3\3\2\2\2\u03f5"+
		"\u03f6\7K\2\2\u03f6\u03fb\5\u00b6\\\2\u03f7\u03f8\7\6\2\2\u03f8\u03fa"+
		"\5\u00b6\\\2\u03f9\u03f7\3\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2"+
		"\2\u03fb\u03fc\3\2\2\2\u03fc\u00b5\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff"+
		"\t\2\2\2\u03ff\u00b7\3\2\2\2\u0400\u0402\5\u00ba^\2\u0401\u0400\3\2\2"+
		"\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u00b9"+
		"\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u040d\5V,\2\u0407\u040d\5\u008cG\2"+
		"\u0408\u040d\5\u009cO\2\u0409\u040d\5\u00b0Y\2\u040a\u040d\5\"\22\2\u040b"+
		"\u040d\5> \2\u040c\u0406\3\2\2\2\u040c\u0407\3\2\2\2\u040c\u0408\3\2\2"+
		"\2\u040c\u0409\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040b\3\2\2\2\u040d\u00bb"+
		"\3\2\2\2x\u00c5\u00c8\u00d3\u00e2\u00e7\u00ec\u00f1\u00f3\u00fa\u00fc"+
		"\u0100\u0112\u0148\u014c\u0152\u015a\u015c\u0166\u016b\u0177\u0180\u0183"+
		"\u0186\u018c\u0195\u0197\u01a1\u01a7\u01ae\u01ba\u01c4\u01e0\u01e2\u01e7"+
		"\u01ec\u01f0\u01f4\u0206\u020d\u0211\u0216\u021c\u0225\u0236\u0243\u0248"+
		"\u024e\u0252\u0255\u0258\u025b\u025e\u0261\u0264\u0267\u026a\u026c\u0270"+
		"\u0274\u027d\u0285\u028c\u0293\u029c\u02a4\u02a9\u02ac\u02b1\u02b3\u02c1"+
		"\u02c5\u02ca\u02ce\u02d1\u02d5\u02db\u02df\u02e1\u02e4\u0310\u0318\u032e"+
		"\u0331\u0334\u033b\u033e\u0346\u034f\u0355\u0359\u035c\u0364\u036d\u0378"+
		"\u0381\u038a\u038e\u0392\u0396\u039b\u039e\u03a1\u03a4\u03ab\u03b7\u03c7"+
		"\u03d1\u03d7\u03dd\u03e2\u03e6\u03ea\u03ed\u03f0\u03f3\u03fb\u0403\u040c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}