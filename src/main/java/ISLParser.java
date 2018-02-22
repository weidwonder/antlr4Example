// Generated from C:/Users/weid/PycharmProjects/test_antlr/src/main/resources\ISL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ISLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NEG=2, GT=3, GTE=4, LT=5, LTE=6, EQ=7, NE=8, TRUE=9, FALSE=10, 
		NULL=11, AND=12, OR=13, NOT=14, CONTAINS=15, LEFT_PAREN=16, RIGHT_PAREN=17, 
		CR=18, IF=19, ELSE=20, DOUBLE_QUOTATION=21, TRANSFORM=22, VARIABLE=23, 
		NUMBER=24, STRING=25, WS=26;
	public static final int
		RULE_expression = 0, RULE_equalityExpression = 1;
	public static final String[] ruleNames = {
		"expression", "equalityExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'-'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'true'", 
		"'false'", "'null'", "'and'", "'or'", "'not'", "'contains'", "'('", "')'", 
		"'\n'", "'if'", "'else'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NEG", "GT", "GTE", "LT", "LTE", "EQ", "NE", "TRUE", "FALSE", 
		"NULL", "AND", "OR", "NOT", "CONTAINS", "LEFT_PAREN", "RIGHT_PAREN", "CR", 
		"IF", "ELSE", "DOUBLE_QUOTATION", "TRANSFORM", "VARIABLE", "NUMBER", "STRING", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ISL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ISLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(ISLParser.NULL, 0); }
		public NullContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public TerminalNode VARIABLE() { return getToken(ISLParser.VARIABLE, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(ISLParser.NUMBER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(ISLParser.TRANSFORM, 0); }
		public AttributeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpContext extends ExpressionContext {
		public ExpressionContext te;
		public EqualityExpressionContext ee;
		public ExpressionContext fe;
		public TerminalNode IF() { return getToken(ISLParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(ISLParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public IfExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitIfExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitIfExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEGExpContext extends ExpressionContext {
		public TerminalNode NEG() { return getToken(ISLParser.NEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NEGExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterNEGExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitNEGExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitNEGExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(ISLParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformContext extends ExpressionContext {
		public TerminalNode TRANSFORM() { return getToken(ISLParser.TRANSFORM, 0); }
		public TransformContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(ISLParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ISLParser.RIGHT_PAREN, 0); }
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(5);
				match(NUMBER);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(6);
				match(STRING);
				}
				break;
			case NULL:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(7);
				match(NULL);
				}
				break;
			case TRANSFORM:
				{
				_localctx = new TransformContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(8);
				match(TRANSFORM);
				}
				break;
			case VARIABLE:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(9);
				match(VARIABLE);
				}
				break;
			case NEG:
				{
				_localctx = new NEGExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(10);
				match(NEG);
				setState(11);
				expression(3);
				}
				break;
			case LEFT_PAREN:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(LEFT_PAREN);
				setState(13);
				expression(0);
				setState(14);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(27);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new IfExpContext(new ExpressionContext(_parentctx, _parentState));
						((IfExpContext)_localctx).te = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(18);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(19);
						match(IF);
						setState(20);
						((IfExpContext)_localctx).ee = equalityExpression(0);
						setState(21);
						match(ELSE);
						setState(22);
						((IfExpContext)_localctx).fe = expression(2);
						}
						break;
					case 2:
						{
						_localctx = new AttributeContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(24);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(25);
						match(T__0);
						setState(26);
						match(TRANSFORM);
						}
						break;
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalFalseContext extends EqualityExpressionContext {
		public TerminalNode FALSE() { return getToken(ISLParser.FALSE, 0); }
		public LogicalFalseContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterLogicalFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitLogicalFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitLogicalFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalParenContext extends EqualityExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(ISLParser.LEFT_PAREN, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(ISLParser.RIGHT_PAREN, 0); }
		public LogicalParenContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterLogicalParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitLogicalParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitLogicalParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpCmpContext extends EqualityExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(ISLParser.GT, 0); }
		public TerminalNode GTE() { return getToken(ISLParser.GTE, 0); }
		public TerminalNode LT() { return getToken(ISLParser.LT, 0); }
		public TerminalNode LTE() { return getToken(ISLParser.LTE, 0); }
		public TerminalNode EQ() { return getToken(ISLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ISLParser.NE, 0); }
		public TerminalNode CONTAINS() { return getToken(ISLParser.CONTAINS, 0); }
		public LogicalExpCmpContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterLogicalExpCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitLogicalExpCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitLogicalExpCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalEqExpCmpContext extends EqualityExpressionContext {
		public Token op;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ISLParser.AND, 0); }
		public TerminalNode OR() { return getToken(ISLParser.OR, 0); }
		public TerminalNode EQ() { return getToken(ISLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ISLParser.NE, 0); }
		public LogicalEqExpCmpContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterLogicalEqExpCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitLogicalEqExpCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitLogicalEqExpCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalTrueContext extends EqualityExpressionContext {
		public TerminalNode TRUE() { return getToken(ISLParser.TRUE, 0); }
		public LogicalTrueContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterLogicalTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitLogicalTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitLogicalTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalNotEqExpContext extends EqualityExpressionContext {
		public TerminalNode NOT() { return getToken(ISLParser.NOT, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public LogicalNotEqExpContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).enterLogicalNotEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ISLListener ) ((ISLListener)listener).exitLogicalNotEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ISLVisitor ) return ((ISLVisitor<? extends T>)visitor).visitLogicalNotEqExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_equalityExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(33);
				match(TRUE);
				}
				break;
			case 2:
				{
				_localctx = new LogicalFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(FALSE);
				}
				break;
			case 3:
				{
				_localctx = new LogicalExpCmpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				expression(0);
				setState(36);
				((LogicalExpCmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << EQ) | (1L << NE) | (1L << CONTAINS))) != 0)) ) {
					((LogicalExpCmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(37);
				expression(0);
				}
				break;
			case 4:
				{
				_localctx = new LogicalNotEqExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(NOT);
				setState(40);
				equalityExpression(2);
				}
				break;
			case 5:
				{
				_localctx = new LogicalParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(LEFT_PAREN);
				setState(42);
				equalityExpression(0);
				setState(43);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalEqExpCmpContext(new EqualityExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(47);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(48);
					((LogicalEqExpCmpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << AND) | (1L << OR))) != 0)) ) {
						((LogicalEqExpCmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(49);
					equalityExpression(4);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 1:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34:\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\23\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3\3\7\3\65\n\3"+
		"\f\3\16\38\13\3\3\3\2\4\2\4\4\2\4\2\4\4\2\5\n\21\21\4\2\t\n\16\17\2D\2"+
		"\22\3\2\2\2\4/\3\2\2\2\6\7\b\2\1\2\7\23\7\32\2\2\b\23\7\33\2\2\t\23\7"+
		"\r\2\2\n\23\7\30\2\2\13\23\7\31\2\2\f\r\7\4\2\2\r\23\5\2\2\5\16\17\7\22"+
		"\2\2\17\20\5\2\2\2\20\21\7\23\2\2\21\23\3\2\2\2\22\6\3\2\2\2\22\b\3\2"+
		"\2\2\22\t\3\2\2\2\22\n\3\2\2\2\22\13\3\2\2\2\22\f\3\2\2\2\22\16\3\2\2"+
		"\2\23\37\3\2\2\2\24\25\f\3\2\2\25\26\7\25\2\2\26\27\5\4\3\2\27\30\7\26"+
		"\2\2\30\31\5\2\2\4\31\36\3\2\2\2\32\33\f\6\2\2\33\34\7\3\2\2\34\36\7\30"+
		"\2\2\35\24\3\2\2\2\35\32\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2"+
		" \3\3\2\2\2!\37\3\2\2\2\"#\b\3\1\2#\60\7\13\2\2$\60\7\f\2\2%&\5\2\2\2"+
		"&\'\t\2\2\2\'(\5\2\2\2(\60\3\2\2\2)*\7\20\2\2*\60\5\4\3\4+,\7\22\2\2,"+
		"-\5\4\3\2-.\7\23\2\2.\60\3\2\2\2/\"\3\2\2\2/$\3\2\2\2/%\3\2\2\2/)\3\2"+
		"\2\2/+\3\2\2\2\60\66\3\2\2\2\61\62\f\5\2\2\62\63\t\3\2\2\63\65\5\4\3\6"+
		"\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66"+
		"\3\2\2\2\7\22\35\37/\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}