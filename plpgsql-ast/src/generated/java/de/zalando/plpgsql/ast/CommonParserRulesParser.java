// Generated from de/zalando/plpgsql/ast/CommonParserRules.g4 by ANTLR 4.1
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
public class CommonParserRulesParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, LIKE=8, SIMILAR=9, 
		TO=10, AND=11, OR=12, ASSIGN_OP=13, BETWEEN=14, IS=15, NOT=16, ISNULL=17, 
		NOTNULL=18, MUL=19, DIV=20, MOD=21, ADD=22, SUB=23, EQ=24, NEQ=25, LT=26, 
		LTE=27, GT=28, GTE=29, JOIN=30, INNER=31, LEFT=32, RIGHT=33, FULL=34, 
		CROSS=35, OUTER=36, NATURAL=37, SELECT=38, ALL=39, DISTINCT=40, FROM=41, 
		WHERE=42, GROUP_BY=43, GROUP=44, BY=45, ORDER_BY=46, ORDER=47, LIMIT=48, 
		OFFSET=49, ROW=50, ROWS=51, FETCH=52, ONLY=53, UPDATE=54, SHARE=55, OF=56, 
		NOWAIT=57, INTO=58, STRICT=59, UNION=60, INTERSECT=61, EXCEPT=62, ASC=63, 
		DESC=64, USING=65, NULLS=66, FIRST=67, NEXT=68, LAST=69, CAST=70, ALIAS=71, 
		FOR=72, CREATE=73, REPLACE=74, FUNCTION=75, IN=76, OUT=77, INOUT=78, VARIADIC=79, 
		ON=80, HAVING=81, LANGUAGE=82, LANGUAGE_NAME=83, EXCEPTION=84, DEFAULT=85, 
		RETURNS=86, TABLE=87, AS=88, DECLARE=89, BEGIN=90, END=91, WHEN=92, THEN=93, 
		WINDOW=94, IMMUTABLE=95, STABLE=96, VOLATILE=97, CALLED_ON_NULL_INPUT=98, 
		RETURNS_NULL_ON_NULL_INPUT=99, EXTERNAL=100, SECURITY=101, SECURITY_INVOKER=102, 
		SECURITY_DEFINER=103, COST=104, CONSTANT=105, COLLATE=106, NULL=107, TRUE=108, 
		FALSE=109, UNKNOWN=110, F_DOLLAR_QUOTE=111, F_QUOTE=112, DOLLAR_QUOTE=113, 
		QUOTE=114, INTEGER_VALUE=115, DECIMAL_VALUE=116, ID=117, QNAME=118, ARRAY_TYPE=119, 
		COPY_TYPE=120, ROW_TYPE=121, WS=122, SL_COMMENT=123, ML_COMMENT=124, ESC=125;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", "LIKE", 
		"SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", "ISNULL", 
		"NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", "'<'", "'<='", 
		"'>'", "'>='", "JOIN", "INNER", "LEFT", "RIGHT", "FULL", "CROSS", "OUTER", 
		"NATURAL", "SELECT", "ALL", "DISTINCT", "FROM", "WHERE", "GROUP_BY", "GROUP", 
		"BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", "ROWS", "FETCH", 
		"ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", "UNION", 
		"INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", "NEXT", 
		"LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", "IN", 
		"OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", 
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
		RULE_stringLiteralExpr = 6, RULE_expression = 7, RULE_assignOperator = 8;
	public static final String[] ruleNames = {
		"varExpr", "functionCallExpr", "numericConstant", "constantOfOtherTypes", 
		"numericalLiteralExpr", "booleanLiteralExpr", "stringLiteralExpr", "expression", 
		"assignOperator"
	};

	@Override
	public String getGrammarFileName() { return "CommonParserRules.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommonParserRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VarExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public VarExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExprContext varExpr() throws RecognitionException {
		VarExprContext _localctx = new VarExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_varExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public FunctionCallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
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
			setState(20); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(21); match(7);
			setState(30);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (CAST - 70)) | (1L << (TRUE - 70)) | (1L << (FALSE - 70)) | (1L << (DOLLAR_QUOTE - 70)) | (1L << (QUOTE - 70)) | (1L << (INTEGER_VALUE - 70)) | (1L << (DECIMAL_VALUE - 70)) | (1L << (ID - 70)) | (1L << (QNAME - 70)) | (1L << (ARRAY_TYPE - 70)) | (1L << (COPY_TYPE - 70)) | (1L << (ROW_TYPE - 70)))) != 0)) {
				{
				setState(22); expression(0);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(23); match(4);
					setState(24); expression(0);
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(32); match(3);
			}
		}
		catch (RecognitionException re) {
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
			return getToken(CommonParserRulesParser.QUOTE, i);
		}
		public TerminalNode ARRAY_TYPE() { return getToken(CommonParserRulesParser.ARRAY_TYPE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(CommonParserRulesParser.INTEGER_VALUE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(CommonParserRulesParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(CommonParserRulesParser.QNAME, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(CommonParserRulesParser.QUOTE); }
		public TerminalNode ROW_TYPE() { return getToken(CommonParserRulesParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(CommonParserRulesParser.DECIMAL_VALUE, 0); }
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numericConstant);
		int _la;
		try {
			setState(41);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(35); match(5);
				setState(36);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ID - 117)) | (1L << (QNAME - 117)) | (1L << (ARRAY_TYPE - 117)) | (1L << (COPY_TYPE - 117)) | (1L << (ROW_TYPE - 117)))) != 0)) ) {
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
				setState(37);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ID - 117)) | (1L << (QNAME - 117)) | (1L << (ARRAY_TYPE - 117)) | (1L << (COPY_TYPE - 117)) | (1L << (ROW_TYPE - 117)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(38); match(QUOTE);
				setState(39);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(40); match(QUOTE);
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
		public TerminalNode AS() { return getToken(CommonParserRulesParser.AS, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(CommonParserRulesParser.ARRAY_TYPE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(CommonParserRulesParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(CommonParserRulesParser.QNAME, 0); }
		public TerminalNode ROW_TYPE() { return getToken(CommonParserRulesParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public StringLiteralExprContext stringLiteralExpr() {
			return getRuleContext(StringLiteralExprContext.class,0);
		}
		public TerminalNode CAST() { return getToken(CommonParserRulesParser.CAST, 0); }
		public ConstantOfOtherTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantOfOtherTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterConstantOfOtherTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitConstantOfOtherTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitConstantOfOtherTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantOfOtherTypesContext constantOfOtherTypes() throws RecognitionException {
		ConstantOfOtherTypesContext _localctx = new ConstantOfOtherTypesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constantOfOtherTypes);
		int _la;
		try {
			setState(56);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ID - 117)) | (1L << (QNAME - 117)) | (1L << (ARRAY_TYPE - 117)) | (1L << (COPY_TYPE - 117)) | (1L << (ROW_TYPE - 117)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(44); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				}
				break;
			case DOLLAR_QUOTE:
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(46); match(5);
				setState(47);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ID - 117)) | (1L << (QNAME - 117)) | (1L << (ARRAY_TYPE - 117)) | (1L << (COPY_TYPE - 117)) | (1L << (ROW_TYPE - 117)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(49); match(CAST);
				setState(50); match(7);
				setState(51); ((ConstantOfOtherTypesContext)_localctx).value = stringLiteralExpr();
				setState(52); match(AS);
				setState(53);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ID - 117)) | (1L << (QNAME - 117)) | (1L << (ARRAY_TYPE - 117)) | (1L << (COPY_TYPE - 117)) | (1L << (ROW_TYPE - 117)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(54); match(3);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericalConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericalConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericalConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(CommonParserRulesParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumericalLiteralExprContext {
		public TerminalNode INTEGER_VALUE() { return getToken(CommonParserRulesParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumericalLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalLiteralExprContext numericalLiteralExpr() throws RecognitionException {
		NumericalLiteralExprContext _localctx = new NumericalLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numericalLiteralExpr);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NumericalConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58); numericConstant();
				}
				break;

			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(INTEGER_VALUE);
				}
				break;

			case 3:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60); match(DECIMAL_VALUE);
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
		public TerminalNode NOT() { return getToken(CommonParserRulesParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateExpressionContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNegateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNegateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNegateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends BooleanLiteralExprContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(CommonParserRulesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CommonParserRulesParser.FALSE, 0); }
		public BooleanLiteralContext(BooleanLiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralExprContext booleanLiteralExpr() throws RecognitionException {
		BooleanLiteralExprContext _localctx = new BooleanLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanLiteralExpr);
		int _la;
		try {
			setState(66);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(NOT);
				setState(64); expression(0);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
			return getToken(CommonParserRulesParser.QUOTE, i);
		}
		public TerminalNode ESC(int i) {
			return getToken(CommonParserRulesParser.ESC, i);
		}
		public List<TerminalNode> DOLLAR_QUOTE() { return getTokens(CommonParserRulesParser.DOLLAR_QUOTE); }
		public List<TerminalNode> QUOTE() { return getTokens(CommonParserRulesParser.QUOTE); }
		public TerminalNode DOLLAR_QUOTE(int i) {
			return getToken(CommonParserRulesParser.DOLLAR_QUOTE, i);
		}
		public List<TerminalNode> ESC() { return getTokens(CommonParserRulesParser.ESC); }
		public StringLiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteralExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterStringLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitStringLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitStringLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralExprContext stringLiteralExpr() throws RecognitionException {
		StringLiteralExprContext _localctx = new StringLiteralExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLiteralExpr);
		try {
			int _alt;
			setState(86);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(QUOTE);
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						setState(71);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(69); match(ESC);
							}
							break;

						case 2:
							{
							setState(70);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(76); match(QUOTE);
				}
				break;
			case DOLLAR_QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(DOLLAR_QUOTE);
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						setState(80);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(78); match(ESC);
							}
							break;

						case 2:
							{
							setState(79);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(85); match(DOLLAR_QUOTE);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericalLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericalLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericalLiteralExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterStringLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitStringLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitStringLiteralExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitVariableExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanLiteralExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitExpressionGroup(this);
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
		public TerminalNode SUB() { return getToken(CommonParserRulesParser.SUB, 0); }
		public SubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token unaryOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CommonParserRulesParser.SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CommonParserRulesParser.MUL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitMulExpression(this);
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
		public TerminalNode ADD() { return getToken(CommonParserRulesParser.ADD, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CommonParserRulesParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelExpressionContext extends ExpressionContext {
		public Token label;
		public TerminalNode AS() { return getToken(CommonParserRulesParser.AS, 0); }
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LabelExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterLabelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitLabelExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitLabelExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitExponentiationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitExponentiationExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
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
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitArbitraryConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token operator;
		public Token not;
		public TerminalNode SIMILAR() { return getToken(CommonParserRulesParser.SIMILAR, 0); }
		public TerminalNode NOT() { return getToken(CommonParserRulesParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TO() { return getToken(CommonParserRulesParser.TO, 0); }
		public StringLiteralExprContext stringLiteralExpr() {
			return getRuleContext(StringLiteralExprContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalConjunctionExpressionContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(CommonParserRulesParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LogicalConjunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterLogicalConjunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitLogicalConjunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitLogicalConjunctionExpression(this);
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
		public TerminalNode MOD() { return getToken(CommonParserRulesParser.MOD, 0); }
		public ModExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterModExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitModExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitModExpression(this);
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
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(90); expression(12);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(92); expression(11);
				}
				break;

			case 3:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94); match(7);
				setState(95); expression(0);
				setState(96); match(3);
				}
				break;

			case 5:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98); varExpr();
				}
				break;

			case 6:
				{
				_localctx = new BooleanLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99); booleanLiteralExpr();
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); numericalLiteralExpr();
				}
				break;

			case 8:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); stringLiteralExpr();
				}
				break;

			case 9:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); constantOfOtherTypes();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(106); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(107); expression(21);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(109); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(110); expression(20);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(112); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(113); expression(19);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(115); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(116); expression(18);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(118); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(119); expression(17);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(120);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(121); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(122); expression(16);
						}
						break;

					case 7:
						{
						_localctx = new MulExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(124); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(125); expression(11);
						}
						break;

					case 8:
						{
						_localctx = new DivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(127); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(128); expression(10);
						}
						break;

					case 9:
						{
						_localctx = new ModExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(130); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(131); expression(9);
						}
						break;

					case 10:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(133); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(134); expression(8);
						}
						break;

					case 11:
						{
						_localctx = new SubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(136); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(137); expression(7);
						}
						break;

					case 12:
						{
						_localctx = new ExponentiationExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(139); match(2);
						setState(140); expression(5);
						}
						break;

					case 13:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(142); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(143); expression(3);
						}
						break;

					case 14:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(145); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(146); expression(2);
						}
						break;

					case 15:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(25 >= _localctx._p)) throw new FailedPredicateException(this, "25 >= $_p");
						setState(152); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(148); match(6);
								setState(149); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = expression(0);
								setState(150); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(154); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 16:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(158);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(157); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(160); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(161); stringLiteralExpr();
						}
						break;

					case 17:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(164);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(163); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(166); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR);
						setState(167); match(TO);
						setState(168); stringLiteralExpr();
						}
						break;

					case 18:
						{
						_localctx = new LabelExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(170); match(AS);
						setState(171); ((LabelExpressionContext)_localctx).label = match(ID);
						}
						break;
					}
					} 
				}
				setState(176);
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
		public TerminalNode ASSIGN_OP() { return getToken(CommonParserRulesParser.ASSIGN_OP, 0); }
		public TerminalNode EQ() { return getToken(CommonParserRulesParser.EQ, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitAssignOperator(this);
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
			setState(177);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 20 >= _localctx._p;

		case 1: return 19 >= _localctx._p;

		case 2: return 18 >= _localctx._p;

		case 3: return 17 >= _localctx._p;

		case 4: return 16 >= _localctx._p;

		case 5: return 15 >= _localctx._p;

		case 6: return 10 >= _localctx._p;

		case 7: return 9 >= _localctx._p;

		case 8: return 8 >= _localctx._p;

		case 9: return 7 >= _localctx._p;

		case 10: return 6 >= _localctx._p;

		case 11: return 5 >= _localctx._p;

		case 12: return 2 >= _localctx._p;

		case 13: return 1 >= _localctx._p;

		case 14: return 25 >= _localctx._p;

		case 15: return 14 >= _localctx._p;

		case 17: return 3 >= _localctx._p;

		case 16: return 13 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\177\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\5\3!\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\5\7E\n\7"+
		"\3\b\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\b\3\b\3\b\3\b\7\bS\n\b\f\b\16\b"+
		"V\13\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6"+
		"\t\u009b\n\t\r\t\16\t\u009c\3\t\3\t\5\t\u00a1\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00a7\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3"+
		"\n\3\n\3\n\4KT\13\2\4\6\b\n\f\16\20\22\2\6\3\2uv\3\2w{\3\2no\4\2\17\17"+
		"\32\32\u00d6\2\24\3\2\2\2\4\26\3\2\2\2\6+\3\2\2\2\b:\3\2\2\2\n?\3\2\2"+
		"\2\fD\3\2\2\2\16X\3\2\2\2\20i\3\2\2\2\22\u00b3\3\2\2\2\24\25\7w\2\2\25"+
		"\3\3\2\2\2\26\27\7w\2\2\27 \7\t\2\2\30\35\5\20\t\2\31\32\7\6\2\2\32\34"+
		"\5\20\t\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36!"+
		"\3\2\2\2\37\35\3\2\2\2 \30\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\5\2\2#\5"+
		"\3\2\2\2$%\t\2\2\2%&\7\7\2\2&,\t\3\2\2\'(\t\3\2\2()\7t\2\2)*\t\2\2\2*"+
		",\7t\2\2+$\3\2\2\2+\'\3\2\2\2,\7\3\2\2\2-.\t\3\2\2.;\5\16\b\2/\60\5\16"+
		"\b\2\60\61\7\7\2\2\61\62\t\3\2\2\62;\3\2\2\2\63\64\7H\2\2\64\65\7\t\2"+
		"\2\65\66\5\16\b\2\66\67\7Z\2\2\678\t\3\2\289\7\5\2\29;\3\2\2\2:-\3\2\2"+
		"\2:/\3\2\2\2:\63\3\2\2\2;\t\3\2\2\2<@\5\6\4\2=@\7u\2\2>@\7v\2\2?<\3\2"+
		"\2\2?=\3\2\2\2?>\3\2\2\2@\13\3\2\2\2AB\7\22\2\2BE\5\20\t\2CE\t\4\2\2D"+
		"A\3\2\2\2DC\3\2\2\2E\r\3\2\2\2FK\7t\2\2GJ\7\177\2\2HJ\13\2\2\2IG\3\2\2"+
		"\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NY\7t\2"+
		"\2OT\7s\2\2PS\7\177\2\2QS\13\2\2\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2"+
		"\2\2TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WY\7s\2\2XF\3\2\2\2XO\3\2\2\2Y\17\3"+
		"\2\2\2Z[\b\t\1\2[\\\7\30\2\2\\j\5\20\t\2]^\7\31\2\2^j\5\20\t\2_j\5\4\3"+
		"\2`a\7\t\2\2ab\5\20\t\2bc\7\5\2\2cj\3\2\2\2dj\5\2\2\2ej\5\f\7\2fj\5\n"+
		"\6\2gj\5\16\b\2hj\5\b\5\2iZ\3\2\2\2i]\3\2\2\2i_\3\2\2\2i`\3\2\2\2id\3"+
		"\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\u00b0\3\2\2\2kl\6\t\2"+
		"\3lm\7\32\2\2m\u00af\5\20\t\2no\6\t\3\3op\7\33\2\2p\u00af\5\20\t\2qr\6"+
		"\t\4\3rs\7\34\2\2s\u00af\5\20\t\2tu\6\t\5\3uv\7\35\2\2v\u00af\5\20\t\2"+
		"wx\6\t\6\3xy\7\36\2\2y\u00af\5\20\t\2z{\6\t\7\3{|\7\37\2\2|\u00af\5\20"+
		"\t\2}~\6\t\b\3~\177\7\25\2\2\177\u00af\5\20\t\2\u0080\u0081\6\t\t\3\u0081"+
		"\u0082\7\26\2\2\u0082\u00af\5\20\t\2\u0083\u0084\6\t\n\3\u0084\u0085\7"+
		"\27\2\2\u0085\u00af\5\20\t\2\u0086\u0087\6\t\13\3\u0087\u0088\7\30\2\2"+
		"\u0088\u00af\5\20\t\2\u0089\u008a\6\t\f\3\u008a\u008b\7\31\2\2\u008b\u00af"+
		"\5\20\t\2\u008c\u008d\6\t\r\3\u008d\u008e\7\4\2\2\u008e\u00af\5\20\t\2"+
		"\u008f\u0090\6\t\16\3\u0090\u0091\7\r\2\2\u0091\u00af\5\20\t\2\u0092\u0093"+
		"\6\t\17\3\u0093\u0094\7\16\2\2\u0094\u00af\5\20\t\2\u0095\u009a\6\t\20"+
		"\3\u0096\u0097\7\b\2\2\u0097\u0098\5\20\t\2\u0098\u0099\7\3\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00af\3\2\2\2\u009e\u00a0\6\t\21\3\u009f"+
		"\u00a1\7\22\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00af\5\16\b\2\u00a4\u00a6\6\t\22\3\u00a5"+
		"\u00a7\7\22\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00af\5\16\b\2\u00ab"+
		"\u00ac\6\t\23\3\u00ac\u00ad\7Z\2\2\u00ad\u00af\7w\2\2\u00aek\3\2\2\2\u00ae"+
		"n\3\2\2\2\u00aeq\3\2\2\2\u00aet\3\2\2\2\u00aew\3\2\2\2\u00aez\3\2\2\2"+
		"\u00ae}\3\2\2\2\u00ae\u0080\3\2\2\2\u00ae\u0083\3\2\2\2\u00ae\u0086\3"+
		"\2\2\2\u00ae\u0089\3\2\2\2\u00ae\u008c\3\2\2\2\u00ae\u008f\3\2\2\2\u00ae"+
		"\u0092\3\2\2\2\u00ae\u0095\3\2\2\2\u00ae\u009e\3\2\2\2\u00ae\u00a4\3\2"+
		"\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\t\5\2"+
		"\2\u00b4\23\3\2\2\2\23\35 +:?DIKRTXi\u009c\u00a0\u00a6\u00ae\u00b0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}