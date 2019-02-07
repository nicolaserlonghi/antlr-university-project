// Generated from C:/Users/Samuele/Google Drive/pl-lab/lab05/ex/staticimp/src/main/resources\StaticImp.g4 by ANTLR 4.7
package org.univr.staticimp.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StaticImpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TNAT=1, TBOOL=2, NAT=3, BOOL=4, PLUS=5, MINUS=6, MUL=7, DIV=8, MOD=9, 
		POW=10, AND=11, OR=12, EQQ=13, NEQ=14, LEQ=15, GEQ=16, LT=17, GT=18, NOT=19, 
		IF=20, THEN=21, ELSE=22, WHILE=23, SKIPP=24, ASSIGN=25, OUT=26, LPAR=27, 
		RPAR=28, LBRACE=29, RBRACE=30, SEMICOLON=31, ID=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TNAT", "TBOOL", "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
		"POW", "AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", 
		"THEN", "ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "LPAR", "RPAR", "LBRACE", 
		"RBRACE", "SEMICOLON", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'nat'", "'bool'", null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", 
		"'^'", "'&'", "'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", 
		"'if'", "'then'", "'else'", "'while'", "'skip'", "'='", "'out'", "'('", 
		"')'", "'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TNAT", "TBOOL", "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
		"POW", "AND", "OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", 
		"THEN", "ELSE", "WHILE", "SKIPP", "ASSIGN", "OUT", "LPAR", "RPAR", "LBRACE", 
		"RBRACE", "SEMICOLON", "ID", "WS"
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


	public StaticImpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StaticImp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00bb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4R\n\4\f"+
		"\4\16\4U\13\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\6!\u00b1\n!\r!\16!\u00b2\3\"\6\"\u00b6\n\"\r\"\16\"\u00b7"+
		"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#\3\2\6\3\2\63;\3\2\62;\3\2c|\5\2\13\f\17\17\"\""+
		"\2\u00bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2"+
		"\5I\3\2\2\2\7V\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21"+
		"i\3\2\2\2\23k\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2"+
		"\35x\3\2\2\2\37{\3\2\2\2!~\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0085"+
		"\3\2\2\2)\u0087\3\2\2\2+\u008a\3\2\2\2-\u008f\3\2\2\2/\u0094\3\2\2\2\61"+
		"\u009a\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a5\3\2\2\29\u00a7"+
		"\3\2\2\2;\u00a9\3\2\2\2=\u00ab\3\2\2\2?\u00ad\3\2\2\2A\u00b0\3\2\2\2C"+
		"\u00b5\3\2\2\2EF\7p\2\2FG\7c\2\2GH\7v\2\2H\4\3\2\2\2IJ\7d\2\2JK\7q\2\2"+
		"KL\7q\2\2LM\7n\2\2M\6\3\2\2\2NW\7\62\2\2OS\t\2\2\2PR\t\3\2\2QP\3\2\2\2"+
		"RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VN\3\2\2\2VO\3\2\2\2"+
		"W\b\3\2\2\2XY\7v\2\2YZ\7t\2\2Z[\7w\2\2[b\7g\2\2\\]\7h\2\2]^\7c\2\2^_\7"+
		"n\2\2_`\7u\2\2`b\7g\2\2aX\3\2\2\2a\\\3\2\2\2b\n\3\2\2\2cd\7-\2\2d\f\3"+
		"\2\2\2ef\7/\2\2f\16\3\2\2\2gh\7,\2\2h\20\3\2\2\2ij\7\61\2\2j\22\3\2\2"+
		"\2kl\7o\2\2lm\7q\2\2mn\7f\2\2n\24\3\2\2\2op\7`\2\2p\26\3\2\2\2qr\7(\2"+
		"\2r\30\3\2\2\2st\7~\2\2t\32\3\2\2\2uv\7?\2\2vw\7?\2\2w\34\3\2\2\2xy\7"+
		"#\2\2yz\7?\2\2z\36\3\2\2\2{|\7>\2\2|}\7?\2\2} \3\2\2\2~\177\7@\2\2\177"+
		"\u0080\7?\2\2\u0080\"\3\2\2\2\u0081\u0082\7>\2\2\u0082$\3\2\2\2\u0083"+
		"\u0084\7@\2\2\u0084&\3\2\2\2\u0085\u0086\7#\2\2\u0086(\3\2\2\2\u0087\u0088"+
		"\7k\2\2\u0088\u0089\7h\2\2\u0089*\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2\u008e,\3\2\2\2\u008f\u0090"+
		"\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093"+
		".\3\2\2\2\u0094\u0095\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7g\2\2\u0099\60\3\2\2\2\u009a\u009b\7u\2\2\u009b"+
		"\u009c\7m\2\2\u009c\u009d\7k\2\2\u009d\u009e\7r\2\2\u009e\62\3\2\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7w\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7*\2\2\u00a68\3\2\2\2\u00a7"+
		"\u00a8\7+\2\2\u00a8:\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa<\3\2\2\2\u00ab\u00ac"+
		"\7\177\2\2\u00ac>\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae@\3\2\2\2\u00af\u00b1"+
		"\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3B\3\2\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\b\"\2\2\u00baD\3\2\2\2\b\2SVa\u00b2\u00b7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}