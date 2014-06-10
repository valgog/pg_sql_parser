# Generated from java-escape by ANTLR 4.2.3
from __future__ import print_function
from antlr4 import *
from io import StringIO
package = globals().get("__package__", None)
ischild = len(package)>0 if package is not None else False
if ischild:
    from .LostAndFoundListener import LostAndFoundListener
    from .LostAndFoundVisitor import LostAndFoundVisitor
else:
    from LostAndFoundListener import LostAndFoundListener
    from LostAndFoundVisitor import LostAndFoundVisitor


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2")
        buf.write(u"\21\u00dd\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6")
        buf.write(u"\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4")
        buf.write(u"\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t")
        buf.write(u"\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27")
        buf.write(u"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4")
        buf.write(u"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b")
        buf.write(u"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n")
        buf.write(u"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16")
        buf.write(u"\3\17\6\17d\n\17\r\17\16\17e\3\17\3\17\7\17j\n\17\f\17")
        buf.write(u"\16\17m\13\17\5\17o\n\17\3\17\3\17\5\17s\n\17\3\17\6")
        buf.write(u"\17v\n\17\r\17\16\17w\5\17z\n\17\3\17\3\17\6\17~\n\17")
        buf.write(u"\r\17\16\17\177\3\17\3\17\5\17\u0084\n\17\3\17\6\17\u0087")
        buf.write(u"\n\17\r\17\16\17\u0088\5\17\u008b\n\17\5\17\u008d\n\17")
        buf.write(u"\3\20\3\20\3\20\3\20\7\20\u0093\n\20\f\20\16\20\u0096")
        buf.write(u"\13\20\3\20\3\20\3\20\3\20\3\20\7\20\u009d\n\20\f\20")
        buf.write(u"\16\20\u00a0\13\20\3\20\3\20\3\20\7\20\u00a5\n\20\f\20")
        buf.write(u"\16\20\u00a8\13\20\3\20\3\20\3\20\7\20\u00ad\n\20\f\20")
        buf.write(u"\16\20\u00b0\13\20\5\20\u00b2\n\20\3\21\3\21\3\21\3\21")
        buf.write(u"\7\21\u00b8\n\21\f\21\16\21\u00bb\13\21\3\21\3\21\3\22")
        buf.write(u"\3\22\3\23\3\23\3\23\7\23\u00c4\n\23\f\23\16\23\u00c7")
        buf.write(u"\13\23\3\24\3\24\3\24\3\25\6\25\u00cd\n\25\r\25\16\25")
        buf.write(u"\u00ce\3\26\3\26\7\26\u00d3\n\26\f\26\16\26\u00d6\13")
        buf.write(u"\26\3\26\3\26\5\26\u00da\n\26\3\27\3\27\2\2\30\3\2\5")
        buf.write(u"\2\7\3\t\4\13\5\r\2\17\2\21\2\23\6\25\7\27\b\31\t\33")
        buf.write(u"\n\35\13\37\f!\r#\2%\16\'\17)\20+\21-\2\3\2\32\4\2VV")
        buf.write(u"vv\4\2KKkk\4\2OOoo\4\2GGgg\4\2YYyy\4\2JJjj\4\2PPpp\4")
        buf.write(u"\2WWww\4\2NNnn\4\2UUuu\4\2HHhh\4\2TTtt\4\2CCcc\4\2--")
        buf.write(u"//\3\2$$\3\2bb\3\2__\5\2C\\aac|\6\2\62;C\\aac|\3\2))")
        buf.write(u"\5\2\62;CHch\3\2\62;\4\2ZZzz\5\2&&<<BB\u00ef\2\7\3\2")
        buf.write(u"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2")
        buf.write(u"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2")
        buf.write(u"\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)")
        buf.write(u"\3\2\2\2\2+\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\79\3\2\2")
        buf.write(u"\2\t<\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2\17H\3\2\2\2\21N")
        buf.write(u"\3\2\2\2\23S\3\2\2\2\25V\3\2\2\2\27Y\3\2\2\2\31\\\3\2")
        buf.write(u"\2\2\33_\3\2\2\2\35\u008c\3\2\2\2\37\u00b1\3\2\2\2!\u00b3")
        buf.write(u"\3\2\2\2#\u00be\3\2\2\2%\u00c0\3\2\2\2\'\u00c8\3\2\2")
        buf.write(u"\2)\u00cc\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2/\60\t")
        buf.write(u"\2\2\2\60\61\t\3\2\2\61\62\t\4\2\2\62\63\t\5\2\2\63\4")
        buf.write(u"\3\2\2\2\64\65\t\6\2\2\65\66\t\3\2\2\66\67\t\2\2\2\67")
        buf.write(u"8\t\7\2\28\6\3\2\2\29:\5\5\3\2:;\5\3\2\2;\b\3\2\2\2<")
        buf.write(u"=\7<\2\2=>\7<\2\2>\n\3\2\2\2?@\7\60\2\2@A\7\60\2\2A\f")
        buf.write(u"\3\2\2\2BC\t\b\2\2CD\t\t\2\2DE\t\n\2\2EF\t\n\2\2FG\t")
        buf.write(u"\13\2\2G\16\3\2\2\2HI\t\f\2\2IJ\t\3\2\2JK\t\r\2\2KL\t")
        buf.write(u"\13\2\2LM\t\2\2\2M\20\3\2\2\2NO\t\n\2\2OP\t\16\2\2PQ")
        buf.write(u"\t\13\2\2QR\t\2\2\2R\22\3\2\2\2ST\5\r\7\2TU\5\17\b\2")
        buf.write(u"U\24\3\2\2\2VW\5\r\7\2WX\5\21\t\2X\26\3\2\2\2YZ\7>\2")
        buf.write(u"\2Z[\7>\2\2[\30\3\2\2\2\\]\7@\2\2]^\7@\2\2^\32\3\2\2")
        buf.write(u"\2_`\7<\2\2`a\7?\2\2a\34\3\2\2\2bd\5-\27\2cb\3\2\2\2")
        buf.write(u"de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fn\3\2\2\2gk\7\60\2\2h")
        buf.write(u"j\5-\27\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3")
        buf.write(u"\2\2\2mk\3\2\2\2ng\3\2\2\2no\3\2\2\2oy\3\2\2\2pr\t\5")
        buf.write(u"\2\2qs\t\17\2\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\5-\27")
        buf.write(u"\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2")
        buf.write(u"yp\3\2\2\2yz\3\2\2\2z\u008d\3\2\2\2{}\7\60\2\2|~\5-\27")
        buf.write(u"\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2")
        buf.write(u"\2\2\u0080\u008a\3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0084")
        buf.write(u"\t\17\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084")
        buf.write(u"\u0086\3\2\2\2\u0085\u0087\5-\27\2\u0086\u0085\3\2\2")
        buf.write(u"\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089")
        buf.write(u"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0081\3\2\2\2\u008a")
        buf.write(u"\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008cc\3\2\2\2\u008c")
        buf.write(u"{\3\2\2\2\u008d\36\3\2\2\2\u008e\u0094\7$\2\2\u008f\u0093")
        buf.write(u"\n\20\2\2\u0090\u0091\7$\2\2\u0091\u0093\7$\2\2\u0092")
        buf.write(u"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2")
        buf.write(u"\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097")
        buf.write(u"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u00b2\7$\2\2\u0098")
        buf.write(u"\u009e\7b\2\2\u0099\u009d\n\21\2\2\u009a\u009b\7b\2\2")
        buf.write(u"\u009b\u009d\7b\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3")
        buf.write(u"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e")
        buf.write(u"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2")
        buf.write(u"\2\u00a1\u00b2\7b\2\2\u00a2\u00a6\7]\2\2\u00a3\u00a5")
        buf.write(u"\n\22\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6")
        buf.write(u"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2")
        buf.write(u"\2\u00a8\u00a6\3\2\2\2\u00a9\u00b2\7_\2\2\u00aa\u00ae")
        buf.write(u"\t\23\2\2\u00ab\u00ad\t\24\2\2\u00ac\u00ab\3\2\2\2\u00ad")
        buf.write(u"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2")
        buf.write(u"\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u008e")
        buf.write(u"\3\2\2\2\u00b1\u0098\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1")
        buf.write(u"\u00aa\3\2\2\2\u00b2 \3\2\2\2\u00b3\u00b9\7)\2\2\u00b4")
        buf.write(u"\u00b8\n\25\2\2\u00b5\u00b6\7)\2\2\u00b6\u00b8\7)\2\2")
        buf.write(u"\u00b7\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb")
        buf.write(u"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba")
        buf.write(u"\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7)\2\2")
        buf.write(u"\u00bd\"\3\2\2\2\u00be\u00bf\t\26\2\2\u00bf$\3\2\2\2")
        buf.write(u"\u00c0\u00c1\t\27\2\2\u00c1\u00c5\7\60\2\2\u00c2\u00c4")
        buf.write(u"\t\27\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5")
        buf.write(u"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6&\3\2\2\2\u00c7")
        buf.write(u"\u00c5\3\2\2\2\u00c8\u00c9\t\30\2\2\u00c9\u00ca\5!\21")
        buf.write(u"\2\u00ca(\3\2\2\2\u00cb\u00cd\5#\22\2\u00cc\u00cb\3\2")
        buf.write(u"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf")
        buf.write(u"\3\2\2\2\u00cf*\3\2\2\2\u00d0\u00d4\7A\2\2\u00d1\u00d3")
        buf.write(u"\5-\27\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4")
        buf.write(u"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2")
        buf.write(u"\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\t\31\2\2\u00d8\u00da")
        buf.write(u"\5\37\20\2\u00d9\u00d0\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da")
        buf.write(u",\3\2\2\2\u00db\u00dc\t\27\2\2\u00dc.\3\2\2\2\33\2ek")
        buf.write(u"nrwy\177\u0083\u0088\u008a\u008c\u0092\u0094\u009c\u009e")
        buf.write(u"\u00a6\u00ae\u00b1\u00b7\u00b9\u00c5\u00ce\u00d4\u00d9")
        buf.write(u"\2")
        return buf.getvalue()
		

class LostAndFound(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    WITH_TIME = 1
    TYPECAST = 2
    DOT_DOT = 3
    NULLS_FIRST = 4
    NULLS_LAST = 5
    LESS_LESS = 6
    GREATER_GREATER = 7
    COLON_EQUALS = 8
    ICONST = 9
    IDENT = 10
    SCONST = 11
    FCONST = 12
    BCONST = 13
    XCONST = 14
    PARAM = 15


    modeNames = [ u"DEFAULT_MODE" ]

    tokenNames = [ u"<INVALID>",
            u"'\\u0000'", u"'\\u0001'", u"'\\u0002'", u"'\\u0003'", u"'\\u0004'", 
            u"'\\u0005'", u"'\\u0006'", u"'\\u0007'", u"'\b'", u"'\t'", 
            u"'\n'", u"'\\u000B'", u"'\f'", u"'\r'", u"'\\u000E'", u"'\\u000F'" ]

    ruleNames = [ u"TIME", u"WITH", u"WITH_TIME", u"TYPECAST", u"DOT_DOT", 
                  u"NULLS", u"FIRST", u"LAST", u"NULLS_FIRST", u"NULLS_LAST", 
                  u"LESS_LESS", u"GREATER_GREATER", u"COLON_EQUALS", u"ICONST", 
                  u"IDENT", u"SCONST", u"HEX_DIGIT", u"FCONST", u"BCONST", 
                  u"XCONST", u"PARAM", u"DIGIT" ]

    grammarFileName = u"LostAndFound.g4"

    def __init__(self, input=None):
        super(LostAndFound, self).__init__(input)
        self.checkVersion("4.2.3")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


