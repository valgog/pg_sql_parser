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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, LIKE=8, SIMILAR_OP=9, 
		SIMILAR=10, TO=11, AND=12, OR=13, ASSIGN_OP=14, BETWEEN=15, IS=16, NOT=17, 
		ISNULL=18, NOTNULL=19, MUL=20, DIV=21, MOD=22, ADD=23, SUB=24, EQ=25, 
		NEQ=26, LT=27, LTE=28, GT=29, GTE=30, SELECT=31, ALL=32, DISTINCT=33, 
		FROM=34, WHERE=35, GROUP_BY=36, GROUP=37, BY=38, ORDER_BY=39, ORDER=40, 
		LIMIT=41, OFFSET=42, ROW=43, ROWS=44, FETCH=45, ONLY=46, UPDATE=47, SHARE=48, 
		OF=49, NOWAIT=50, INTO=51, STRICT=52, UNION=53, INTERSECT=54, EXCEPT=55, 
		ASC=56, DESC=57, USING=58, NULLS=59, FIRST=60, NEXT=61, LAST=62, CAST=63, 
		ALIAS=64, FOR=65, CREATE=66, REPLACE=67, FUNCTION=68, IN=69, OUT=70, INOUT=71, 
		VARIADIC=72, ON=73, HAVING=74, LANGUAGE=75, LANGUAGE_NAME=76, DEFAULT=77, 
		RETURNS=78, TABLE=79, AS=80, DECLARE=81, BEGIN=82, END=83, WINDOW=84, 
		IMMUTABLE=85, STABLE=86, VOLATILE=87, CALLED_ON_NULL_INPUT=88, RETURNS_NULL_ON_NULL_INPUT=89, 
		EXTERNAL=90, SECURITY=91, SECURITY_INVOKER=92, SECURITY_DEFINER=93, COST=94, 
		CONSTANT=95, COLLATE=96, NULL=97, TRUE=98, FALSE=99, UNKNOWN=100, DOLLAR_QUOTE=101, 
		QUOTE=102, STRING=103, INTEGER_VALUE=104, DECIMAL_VALUE=105, ID=106, QNAME=107, 
		ARRAY_TYPE=108, COPY_TYPE=109, ROW_TYPE=110, SL_COMMENT=111, ML_COMMENT=112, 
		WS=113;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'^'", "')'", "','", "'::'", "'['", "'('", "LIKE", 
		"SIMILAR_OP", "SIMILAR", "TO", "AND", "OR", "':='", "BETWEEN", "IS", "NOT", 
		"ISNULL", "NOTNULL", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "NEQ", 
		"'<'", "'<='", "'>'", "'>='", "SELECT", "ALL", "DISTINCT", "FROM", "WHERE", 
		"GROUP_BY", "GROUP", "BY", "ORDER_BY", "ORDER", "LIMIT", "OFFSET", "ROW", 
		"ROWS", "FETCH", "ONLY", "UPDATE", "SHARE", "OF", "NOWAIT", "INTO", "STRICT", 
		"UNION", "INTERSECT", "EXCEPT", "ASC", "DESC", "USING", "NULLS", "FIRST", 
		"NEXT", "LAST", "CAST", "ALIAS", "FOR", "CREATE", "REPLACE", "FUNCTION", 
		"IN", "OUT", "INOUT", "VARIADIC", "ON", "HAVING", "LANGUAGE", "LANGUAGE_NAME", 
		"DEFAULT", "RETURNS", "TABLE", "AS", "DECLARE", "BEGIN", "END", "WINDOW", 
		"IMMUTABLE", "STABLE", "VOLATILE", "CALLED_ON_NULL_INPUT", "RETURNS_NULL_ON_NULL_INPUT", 
		"EXTERNAL", "SECURITY", "SECURITY_INVOKER", "SECURITY_DEFINER", "COST", 
		"CONSTANT", "COLLATE", "NULL", "TRUE", "FALSE", "UNKNOWN", "DOLLAR_QUOTE", 
		"'''", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "ID", "QNAME", "ARRAY_TYPE", 
		"COPY_TYPE", "ROW_TYPE", "SL_COMMENT", "ML_COMMENT", "WS"
	};
	public static final int
		RULE_functionCallExpr = 0, RULE_numericConstant = 1, RULE_constantOfOtherTypes = 2, 
		RULE_numericalExpr = 3, RULE_booleanExpr = 4, RULE_expression = 5, RULE_assignOperator = 6;
	public static final String[] ruleNames = {
		"functionCallExpr", "numericConstant", "constantOfOtherTypes", "numericalExpr", 
		"booleanExpr", "expression", "assignOperator"
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
		enterRule(_localctx, 0, RULE_functionCallExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); ((FunctionCallExprContext)_localctx).functionCallName = match(ID);
			setState(15); match(7);
			setState(24);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << NOT) | (1L << ADD) | (1L << SUB) | (1L << CAST))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (TRUE - 98)) | (1L << (FALSE - 98)) | (1L << (STRING - 98)) | (1L << (INTEGER_VALUE - 98)) | (1L << (DECIMAL_VALUE - 98)) | (1L << (ID - 98)) | (1L << (QNAME - 98)) | (1L << (ARRAY_TYPE - 98)) | (1L << (COPY_TYPE - 98)) | (1L << (ROW_TYPE - 98)))) != 0)) {
				{
				setState(16); expression(0);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(17); match(4);
					setState(18); expression(0);
					}
					}
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(26); match(3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 2, RULE_numericConstant);
		int _la;
		try {
			setState(35);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(29); match(5);
				setState(30);
				((NumericConstantContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (ID - 106)) | (1L << (QNAME - 106)) | (1L << (ARRAY_TYPE - 106)) | (1L << (COPY_TYPE - 106)) | (1L << (ROW_TYPE - 106)))) != 0)) ) {
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
				setState(31);
				((NumericConstantContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (ID - 106)) | (1L << (QNAME - 106)) | (1L << (ARRAY_TYPE - 106)) | (1L << (COPY_TYPE - 106)) | (1L << (ROW_TYPE - 106)))) != 0)) ) {
					((NumericConstantContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(32); match(QUOTE);
				setState(33);
				((NumericConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((NumericConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(34); match(QUOTE);
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
		public TerminalNode AS() { return getToken(CommonParserRulesParser.AS, 0); }
		public TerminalNode ARRAY_TYPE() { return getToken(CommonParserRulesParser.ARRAY_TYPE, 0); }
		public TerminalNode COPY_TYPE() { return getToken(CommonParserRulesParser.COPY_TYPE, 0); }
		public TerminalNode QNAME() { return getToken(CommonParserRulesParser.QNAME, 0); }
		public TerminalNode ROW_TYPE() { return getToken(CommonParserRulesParser.ROW_TYPE, 0); }
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public TerminalNode STRING() { return getToken(CommonParserRulesParser.STRING, 0); }
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
		enterRule(_localctx, 4, RULE_constantOfOtherTypes);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case ID:
			case QNAME:
			case ARRAY_TYPE:
			case COPY_TYPE:
			case ROW_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (ID - 106)) | (1L << (QNAME - 106)) | (1L << (ARRAY_TYPE - 106)) | (1L << (COPY_TYPE - 106)) | (1L << (ROW_TYPE - 106)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(38); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(40); match(5);
				setState(41);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (ID - 106)) | (1L << (QNAME - 106)) | (1L << (ARRAY_TYPE - 106)) | (1L << (COPY_TYPE - 106)) | (1L << (ROW_TYPE - 106)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case CAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(42); match(CAST);
				setState(43); match(7);
				setState(44); ((ConstantOfOtherTypesContext)_localctx).value = match(STRING);
				setState(45); match(AS);
				setState(46);
				((ConstantOfOtherTypesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (ID - 106)) | (1L << (QNAME - 106)) | (1L << (ARRAY_TYPE - 106)) | (1L << (COPY_TYPE - 106)) | (1L << (ROW_TYPE - 106)))) != 0)) ) {
					((ConstantOfOtherTypesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(47); match(3);
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

	public static class NumericalExprContext extends ParserRuleContext {
		public int _p;
		public NumericalExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NumericalExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_numericalExpr; }
	 
		public NumericalExprContext() { }
		public void copyFrom(NumericalExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class NumericalLiteralExpressionContext extends NumericalExprContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(CommonParserRulesParser.DECIMAL_VALUE, 0); }
		public NumericalLiteralExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class DivExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode DIV() { return getToken(CommonParserRulesParser.DIV, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public DivExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class ExponentiationExpressionContext extends NumericalExprContext {
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public ExponentiationExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class SubExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(CommonParserRulesParser.SUB, 0); }
		public SubExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class UnaryExpressionContext extends NumericalExprContext {
		public Token unaryOperator;
		public NumericalExprContext numericalExpr() {
			return getRuleContext(NumericalExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(CommonParserRulesParser.SUB, 0); }
		public UnaryExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class ConstantExpressionContext extends NumericalExprContext {
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public ConstantExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode MUL() { return getToken(CommonParserRulesParser.MUL, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public MulExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class NumericalExpressionGroupContext extends NumericalExprContext {
		public NumericalExprContext numericalExpr() {
			return getRuleContext(NumericalExprContext.class,0);
		}
		public NumericalExpressionGroupContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericalExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericalExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericalExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CommonParserRulesParser.ADD, 0); }
		public AddExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class NumericalFunctionExpressionContext extends NumericalExprContext {
		public FunctionCallExprContext functionCallExpr() {
			return getRuleContext(FunctionCallExprContext.class,0);
		}
		public NumericalFunctionExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericalFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericalFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericalFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpressionContext extends NumericalExprContext {
		public Token operator;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public TerminalNode MOD() { return getToken(CommonParserRulesParser.MOD, 0); }
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
		}
		public ModExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
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
	public static class NumericVariableExpressionContext extends NumericalExprContext {
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public NumericVariableExpressionContext(NumericalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalExprContext numericalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumericalExprContext _localctx = new NumericalExprContext(_ctx, _parentState, _p);
		NumericalExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_numericalExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51); ((UnaryExpressionContext)_localctx).unaryOperator = match(ADD);
				setState(52); numericalExpr(12);
				}
				break;

			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53); ((UnaryExpressionContext)_localctx).unaryOperator = match(SUB);
				setState(54); numericalExpr(11);
				}
				break;

			case 3:
				{
				_localctx = new NumericalFunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55); functionCallExpr();
				}
				break;

			case 4:
				{
				_localctx = new NumericalExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56); match(7);
				setState(57); numericalExpr(0);
				setState(58); match(3);
				}
				break;

			case 5:
				{
				_localctx = new ConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60); numericConstant();
				}
				break;

			case 6:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61); match(INTEGER_VALUE);
				}
				break;

			case 7:
				{
				_localctx = new NumericalLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62); match(DECIMAL_VALUE);
				}
				break;

			case 8:
				{
				_localctx = new NumericVariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(84);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MulExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(66);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(67); ((MulExpressionContext)_localctx).operator = match(MUL);
						setState(68); numericalExpr(11);
						}
						break;

					case 2:
						{
						_localctx = new DivExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(69);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(70); ((DivExpressionContext)_localctx).operator = match(DIV);
						setState(71); numericalExpr(10);
						}
						break;

					case 3:
						{
						_localctx = new ModExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(72);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(73); ((ModExpressionContext)_localctx).operator = match(MOD);
						setState(74); numericalExpr(9);
						}
						break;

					case 4:
						{
						_localctx = new AddExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(75);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(76); ((AddExpressionContext)_localctx).operator = match(ADD);
						setState(77); numericalExpr(8);
						}
						break;

					case 5:
						{
						_localctx = new SubExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(78);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(79); ((SubExpressionContext)_localctx).operator = match(SUB);
						setState(80); numericalExpr(7);
						}
						break;

					case 6:
						{
						_localctx = new ExponentiationExpressionContext(new NumericalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numericalExpr);
						setState(81);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(82); match(2);
						setState(83); numericalExpr(5);
						}
						break;
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class BooleanExprContext extends ParserRuleContext {
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
	 
		public BooleanExprContext() { }
		public void copyFrom(BooleanExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanConstantContext extends BooleanExprContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(CommonParserRulesParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CommonParserRulesParser.FALSE, 0); }
		public BooleanConstantContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExpressionContext extends BooleanExprContext {
		public TerminalNode NOT() { return getToken(CommonParserRulesParser.NOT, 0); }
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public NegateExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
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
	public static class BooleanArbitraryConstantExpressionContext extends BooleanExprContext {
		public ConstantOfOtherTypesContext constantOfOtherTypes() {
			return getRuleContext(ConstantOfOtherTypesContext.class,0);
		}
		public BooleanArbitraryConstantExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanArbitraryConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanArbitraryConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanArbitraryConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooeleanExpressionGroupContext extends BooleanExprContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public BooeleanExpressionGroupContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooeleanExpressionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooeleanExpressionGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooeleanExpressionGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVariableExpressionContext extends BooleanExprContext {
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
		public BooleanVariableExpressionContext(BooleanExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_booleanExpr);
		int _la;
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BooeleanExpressionGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89); match(7);
				setState(90); booleanExpr();
				setState(91); match(3);
				}
				break;

			case 2:
				_localctx = new NegateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(NOT);
				setState(94); booleanExpr();
				}
				break;

			case 3:
				_localctx = new BooleanConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				((BooleanConstantContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanConstantContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 4:
				_localctx = new BooleanArbitraryConstantExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96); constantOfOtherTypes();
				}
				break;

			case 5:
				_localctx = new BooleanVariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97); match(ID);
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
	public static class StringLiteralExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(CommonParserRulesParser.STRING, 0); }
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
		public TerminalNode ID() { return getToken(CommonParserRulesParser.ID, 0); }
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
	public static class NumericalExpressionContext extends ExpressionContext {
		public NumericalExprContext numericalExpr() {
			return getRuleContext(NumericalExprContext.class,0);
		}
		public NumericalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitNumericalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitNumericalExpression(this);
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
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public NumericalExprContext arrayIndexExpr;
		public List<NumericalExprContext> numericalExpr() {
			return getRuleContexts(NumericalExprContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NumericalExprContext numericalExpr(int i) {
			return getRuleContext(NumericalExprContext.class,i);
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
	public static class BooleanExpressionContext extends ExpressionContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonParserRulesListener ) ((CommonParserRulesListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonParserRulesVisitor ) return ((CommonParserRulesVisitor<? extends T>)visitor).visitBooleanExpression(this);
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
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(CommonParserRulesParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SIMILAR_OP() { return getToken(CommonParserRulesParser.SIMILAR_OP, 0); }
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

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101); functionCallExpr();
				}
				break;

			case 2:
				{
				_localctx = new ExpressionGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); match(7);
				setState(103); expression(0);
				setState(104); match(3);
				}
				break;

			case 3:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106); booleanExpr();
				}
				break;

			case 4:
				{
				_localctx = new NumericalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107); numericalExpr(0);
				}
				break;

			case 5:
				{
				_localctx = new ArbitraryConstantExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108); constantOfOtherTypes();
				}
				break;

			case 6:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109); match(ID);
				}
				break;

			case 7:
				{
				_localctx = new StringLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110); match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(114); ((ComparisonExpressionContext)_localctx).operator = match(EQ);
						setState(115); expression(14);
						}
						break;

					case 2:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(117); ((ComparisonExpressionContext)_localctx).operator = match(NEQ);
						setState(118); expression(13);
						}
						break;

					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(120); ((ComparisonExpressionContext)_localctx).operator = match(LT);
						setState(121); expression(12);
						}
						break;

					case 4:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(123); ((ComparisonExpressionContext)_localctx).operator = match(LTE);
						setState(124); expression(11);
						}
						break;

					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(126); ((ComparisonExpressionContext)_localctx).operator = match(GT);
						setState(127); expression(10);
						}
						break;

					case 6:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(129); ((ComparisonExpressionContext)_localctx).operator = match(GTE);
						setState(130); expression(9);
						}
						break;

					case 7:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(132); ((LogicalConjunctionExpressionContext)_localctx).operator = match(AND);
						setState(133); expression(6);
						}
						break;

					case 8:
						{
						_localctx = new LogicalConjunctionExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(135); ((LogicalConjunctionExpressionContext)_localctx).operator = match(OR);
						setState(136); expression(5);
						}
						break;

					case 9:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(142); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(138); match(6);
								setState(139); ((ArrayAccessExpressionContext)_localctx).arrayIndexExpr = numericalExpr(0);
								setState(140); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(144); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 10:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(148);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(147); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(150); ((ComparisonExpressionContext)_localctx).operator = match(LIKE);
						setState(151); expression(0);
						}
						break;

					case 11:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(154);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(153); ((ComparisonExpressionContext)_localctx).not = match(NOT);
							}
						}

						setState(156); ((ComparisonExpressionContext)_localctx).operator = match(SIMILAR_OP);
						setState(157); expression(0);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 12, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		case 3: return numericalExpr_sempred((NumericalExprContext)_localctx, predIndex);

		case 5: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return 6 >= _localctx._p;

		case 6: return 13 >= _localctx._p;

		case 7: return 12 >= _localctx._p;

		case 8: return 11 >= _localctx._p;

		case 9: return 10 >= _localctx._p;

		case 10: return 9 >= _localctx._p;

		case 11: return 8 >= _localctx._p;

		case 12: return 5 >= _localctx._p;

		case 13: return 4 >= _localctx._p;

		case 14: return 14 >= _localctx._p;

		case 15: return 7 >= _localctx._p;
		}
		return true;
	}
	private boolean numericalExpr_sempred(NumericalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3s\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\5\2\33\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5W"+
		"\n\5\f\5\16\5Z\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u0091\n\7\r\7\16\7\u0092\3\7\3\7\5\7\u0097"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u009d\n\7\3\7\3\7\7\7\u00a1\n\7\f\7\16\7\u00a4"+
		"\13\7\3\b\3\b\3\b\2\t\2\4\6\b\n\f\16\2\6\3\2jk\3\2lp\3\2de\4\2\20\20\33"+
		"\33\u00ca\2\20\3\2\2\2\4%\3\2\2\2\6\62\3\2\2\2\bB\3\2\2\2\nd\3\2\2\2\f"+
		"q\3\2\2\2\16\u00a5\3\2\2\2\20\21\7l\2\2\21\32\7\t\2\2\22\27\5\f\7\2\23"+
		"\24\7\6\2\2\24\26\5\f\7\2\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\32\22\3\2\2\2\32\33\3\2\2\2\33"+
		"\34\3\2\2\2\34\35\7\5\2\2\35\3\3\2\2\2\36\37\t\2\2\2\37 \7\7\2\2 &\t\3"+
		"\2\2!\"\t\3\2\2\"#\7h\2\2#$\t\2\2\2$&\7h\2\2%\36\3\2\2\2%!\3\2\2\2&\5"+
		"\3\2\2\2\'(\t\3\2\2(\63\7i\2\2)*\7i\2\2*+\7\7\2\2+\63\t\3\2\2,-\7A\2\2"+
		"-.\7\t\2\2./\7i\2\2/\60\7R\2\2\60\61\t\3\2\2\61\63\7\5\2\2\62\'\3\2\2"+
		"\2\62)\3\2\2\2\62,\3\2\2\2\63\7\3\2\2\2\64\65\b\5\1\2\65\66\7\31\2\2\66"+
		"C\5\b\5\2\678\7\32\2\28C\5\b\5\29C\5\2\2\2:;\7\t\2\2;<\5\b\5\2<=\7\5\2"+
		"\2=C\3\2\2\2>C\5\4\3\2?C\7j\2\2@C\7k\2\2AC\7l\2\2B\64\3\2\2\2B\67\3\2"+
		"\2\2B9\3\2\2\2B:\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2CX\3\2"+
		"\2\2DE\6\5\2\3EF\7\26\2\2FW\5\b\5\2GH\6\5\3\3HI\7\27\2\2IW\5\b\5\2JK\6"+
		"\5\4\3KL\7\30\2\2LW\5\b\5\2MN\6\5\5\3NO\7\31\2\2OW\5\b\5\2PQ\6\5\6\3Q"+
		"R\7\32\2\2RW\5\b\5\2ST\6\5\7\3TU\7\4\2\2UW\5\b\5\2VD\3\2\2\2VG\3\2\2\2"+
		"VJ\3\2\2\2VM\3\2\2\2VP\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y\t\3\2\2\2ZX\3\2\2\2[\\\7\t\2\2\\]\5\n\6\2]^\7\5\2\2^e\3\2\2\2_`\7\23"+
		"\2\2`e\5\n\6\2ae\t\4\2\2be\5\6\4\2ce\7l\2\2d[\3\2\2\2d_\3\2\2\2da\3\2"+
		"\2\2db\3\2\2\2dc\3\2\2\2e\13\3\2\2\2fg\b\7\1\2gr\5\2\2\2hi\7\t\2\2ij\5"+
		"\f\7\2jk\7\5\2\2kr\3\2\2\2lr\5\n\6\2mr\5\b\5\2nr\5\6\4\2or\7l\2\2pr\7"+
		"i\2\2qf\3\2\2\2qh\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3"+
		"\2\2\2r\u00a2\3\2\2\2st\6\7\b\3tu\7\33\2\2u\u00a1\5\f\7\2vw\6\7\t\3wx"+
		"\7\34\2\2x\u00a1\5\f\7\2yz\6\7\n\3z{\7\35\2\2{\u00a1\5\f\7\2|}\6\7\13"+
		"\3}~\7\36\2\2~\u00a1\5\f\7\2\177\u0080\6\7\f\3\u0080\u0081\7\37\2\2\u0081"+
		"\u00a1\5\f\7\2\u0082\u0083\6\7\r\3\u0083\u0084\7 \2\2\u0084\u00a1\5\f"+
		"\7\2\u0085\u0086\6\7\16\3\u0086\u0087\7\16\2\2\u0087\u00a1\5\f\7\2\u0088"+
		"\u0089\6\7\17\3\u0089\u008a\7\17\2\2\u008a\u00a1\5\f\7\2\u008b\u0090\6"+
		"\7\20\3\u008c\u008d\7\b\2\2\u008d\u008e\5\b\5\2\u008e\u008f\7\3\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u00a1\3\2\2\2\u0094\u0096\6\7\21\3\u0095"+
		"\u0097\7\23\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0099\7\n\2\2\u0099\u00a1\5\f\7\2\u009a\u009c\6\7\22\3\u009b"+
		"\u009d\7\23\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a1\5\f\7\2\u00a0s\3\2\2\2\u00a0v"+
		"\3\2\2\2\u00a0y\3\2\2\2\u00a0|\3\2\2\2\u00a0\177\3\2\2\2\u00a0\u0082\3"+
		"\2\2\2\u00a0\u0085\3\2\2\2\u00a0\u0088\3\2\2\2\u00a0\u008b\3\2\2\2\u00a0"+
		"\u0094\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\r\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6"+
		"\t\5\2\2\u00a6\17\3\2\2\2\20\27\32%\62BVXdq\u0092\u0096\u009c\u00a0\u00a2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}