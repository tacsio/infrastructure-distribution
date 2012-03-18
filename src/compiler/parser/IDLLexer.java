package compiler.parser;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/tarcisio/Desktop/IDL/IDL.g 2010-10-19 18:21:59

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class IDLLexer extends Lexer {
    public static final int T_PUBLIC=4;
    public static final int T_PONTOVIRG=16;
    public static final int EXPONENT=26;
    public static final int T_INTEFACE=5;
    public static final int T_BYTE=9;
    public static final int T_STRING=8;
    public static final int T_LPAREN=18;
    public static final int UNICODE_ESC=34;
    public static final int T_LCHAVE=14;
    public static final int OCTAL_ESC=35;
    public static final int CHAR=32;
    public static final int T_FLOAT=11;
    public static final int HEX_DIGIT=33;
    public static final int T_DOUBLE=12;
    public static final int T_RCHAVE=15;
    public static final int PARAM=23;
    public static final int INT=25;
    public static final int FLOAT=27;
    public static final int ID=24;
    public static final int EOF=-1;
    public static final int T_VOID=13;
    public static final int T_RPAREN=19;
    public static final int T_VIRGULA=17;
    public static final int T_BOOLEAN=7;
    public static final int METODO=21;
    public static final int WS=29;
    public static final int ESC_SEQ=30;
    public static final int T_CHAR=10;
    public static final int T_INT=6;
    public static final int INTERFACE=20;
    public static final int COMMENT=28;
    public static final int LIST_PARAM=22;
    public static final int STRING=31;

    // delegates
    // delegators

    public IDLLexer() {;} 
    public IDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/tarcisio/Desktop/IDL/IDL.g"; }

    // $ANTLR start "T_PUBLIC"
    public final void mT_PUBLIC() throws RecognitionException {
        try {
            int _type = T_PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:3:10: ( 'public' )
            // /home/tarcisio/Desktop/IDL/IDL.g:3:12: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_PUBLIC"

    // $ANTLR start "T_INTEFACE"
    public final void mT_INTEFACE() throws RecognitionException {
        try {
            int _type = T_INTEFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:4:12: ( 'interface' )
            // /home/tarcisio/Desktop/IDL/IDL.g:4:14: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_INTEFACE"

    // $ANTLR start "T_INT"
    public final void mT_INT() throws RecognitionException {
        try {
            int _type = T_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:5:7: ( 'int' )
            // /home/tarcisio/Desktop/IDL/IDL.g:5:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_INT"

    // $ANTLR start "T_BOOLEAN"
    public final void mT_BOOLEAN() throws RecognitionException {
        try {
            int _type = T_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:6:11: ( 'boolean' )
            // /home/tarcisio/Desktop/IDL/IDL.g:6:13: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_BOOLEAN"

    // $ANTLR start "T_STRING"
    public final void mT_STRING() throws RecognitionException {
        try {
            int _type = T_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:7:10: ( 'String' )
            // /home/tarcisio/Desktop/IDL/IDL.g:7:12: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_STRING"

    // $ANTLR start "T_BYTE"
    public final void mT_BYTE() throws RecognitionException {
        try {
            int _type = T_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:8:8: ( 'byte' )
            // /home/tarcisio/Desktop/IDL/IDL.g:8:10: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_BYTE"

    // $ANTLR start "T_CHAR"
    public final void mT_CHAR() throws RecognitionException {
        try {
            int _type = T_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:9:8: ( 'char' )
            // /home/tarcisio/Desktop/IDL/IDL.g:9:10: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_CHAR"

    // $ANTLR start "T_FLOAT"
    public final void mT_FLOAT() throws RecognitionException {
        try {
            int _type = T_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:10:9: ( 'float' )
            // /home/tarcisio/Desktop/IDL/IDL.g:10:11: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_FLOAT"

    // $ANTLR start "T_DOUBLE"
    public final void mT_DOUBLE() throws RecognitionException {
        try {
            int _type = T_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:11:10: ( 'double' )
            // /home/tarcisio/Desktop/IDL/IDL.g:11:12: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_DOUBLE"

    // $ANTLR start "T_VOID"
    public final void mT_VOID() throws RecognitionException {
        try {
            int _type = T_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:12:8: ( 'void' )
            // /home/tarcisio/Desktop/IDL/IDL.g:12:10: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_VOID"

    // $ANTLR start "T_LCHAVE"
    public final void mT_LCHAVE() throws RecognitionException {
        try {
            int _type = T_LCHAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:13:10: ( '{' )
            // /home/tarcisio/Desktop/IDL/IDL.g:13:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_LCHAVE"

    // $ANTLR start "T_RCHAVE"
    public final void mT_RCHAVE() throws RecognitionException {
        try {
            int _type = T_RCHAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:14:10: ( '}' )
            // /home/tarcisio/Desktop/IDL/IDL.g:14:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_RCHAVE"

    // $ANTLR start "T_PONTOVIRG"
    public final void mT_PONTOVIRG() throws RecognitionException {
        try {
            int _type = T_PONTOVIRG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:15:13: ( ';' )
            // /home/tarcisio/Desktop/IDL/IDL.g:15:15: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_PONTOVIRG"

    // $ANTLR start "T_VIRGULA"
    public final void mT_VIRGULA() throws RecognitionException {
        try {
            int _type = T_VIRGULA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:16:11: ( ',' )
            // /home/tarcisio/Desktop/IDL/IDL.g:16:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_VIRGULA"

    // $ANTLR start "T_LPAREN"
    public final void mT_LPAREN() throws RecognitionException {
        try {
            int _type = T_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:17:10: ( '(' )
            // /home/tarcisio/Desktop/IDL/IDL.g:17:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_LPAREN"

    // $ANTLR start "T_RPAREN"
    public final void mT_RPAREN() throws RecognitionException {
        try {
            int _type = T_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:18:10: ( ')' )
            // /home/tarcisio/Desktop/IDL/IDL.g:18:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_RPAREN"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:86:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/tarcisio/Desktop/IDL/IDL.g:86:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/tarcisio/Desktop/IDL/IDL.g:86:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tarcisio/Desktop/IDL/IDL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:89:5: ( ( '0' .. '9' )+ )
            // /home/tarcisio/Desktop/IDL/IDL.g:89:7: ( '0' .. '9' )+
            {
            // /home/tarcisio/Desktop/IDL/IDL.g:89:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/tarcisio/Desktop/IDL/IDL.g:89:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:93:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:93:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /home/tarcisio/Desktop/IDL/IDL.g:93:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/IDL/IDL.g:93:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    match('.'); 
                    // /home/tarcisio/Desktop/IDL/IDL.g:93:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/IDL/IDL.g:93:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // /home/tarcisio/Desktop/IDL/IDL.g:93:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/tarcisio/Desktop/IDL/IDL.g:93:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:94:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // /home/tarcisio/Desktop/IDL/IDL.g:94:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/IDL/IDL.g:94:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // /home/tarcisio/Desktop/IDL/IDL.g:94:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/tarcisio/Desktop/IDL/IDL.g:94:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:95:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /home/tarcisio/Desktop/IDL/IDL.g:95:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/IDL/IDL.g:95:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:99:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:99:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/tarcisio/Desktop/IDL/IDL.g:99:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/IDL/IDL.g:99:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // /home/tarcisio/Desktop/IDL/IDL.g:99:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/tarcisio/Desktop/IDL/IDL.g:99:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:100:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/tarcisio/Desktop/IDL/IDL.g:100:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/tarcisio/Desktop/IDL/IDL.g:100:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:103:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/tarcisio/Desktop/IDL/IDL.g:103:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:111:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/tarcisio/Desktop/IDL/IDL.g:111:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // /home/tarcisio/Desktop/IDL/IDL.g:111:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/tarcisio/Desktop/IDL/IDL.g:111:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/tarcisio/Desktop/IDL/IDL.g:111:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tarcisio/Desktop/IDL/IDL.g:114:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /home/tarcisio/Desktop/IDL/IDL.g:114:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // /home/tarcisio/Desktop/IDL/IDL.g:114:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:114:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:114:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:118:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/tarcisio/Desktop/IDL/IDL.g:118:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/tarcisio/Desktop/IDL/IDL.g:118:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /home/tarcisio/Desktop/IDL/IDL.g:118:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/tarcisio/Desktop/IDL/IDL.g:118:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:121:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/tarcisio/Desktop/IDL/IDL.g:121:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:125:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:125:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:126:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:127:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:132:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>='0' && LA19_1<='3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2>='0' && LA19_2<='7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4>='0' && LA19_4<='7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;}
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_1>='4' && LA19_1<='7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3>='0' && LA19_3<='7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:132:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/tarcisio/Desktop/IDL/IDL.g:132:14: ( '0' .. '3' )
                    // /home/tarcisio/Desktop/IDL/IDL.g:132:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/tarcisio/Desktop/IDL/IDL.g:132:25: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/IDL/IDL.g:132:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/tarcisio/Desktop/IDL/IDL.g:132:36: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/IDL/IDL.g:132:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:133:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/tarcisio/Desktop/IDL/IDL.g:133:14: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/IDL/IDL.g:133:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/tarcisio/Desktop/IDL/IDL.g:133:25: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/IDL/IDL.g:133:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/tarcisio/Desktop/IDL/IDL.g:134:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/tarcisio/Desktop/IDL/IDL.g:134:14: ( '0' .. '7' )
                    // /home/tarcisio/Desktop/IDL/IDL.g:134:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/tarcisio/Desktop/IDL/IDL.g:139:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/tarcisio/Desktop/IDL/IDL.g:139:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /home/tarcisio/Desktop/IDL/IDL.g:1:8: ( T_PUBLIC | T_INTEFACE | T_INT | T_BOOLEAN | T_STRING | T_BYTE | T_CHAR | T_FLOAT | T_DOUBLE | T_VOID | T_LCHAVE | T_RCHAVE | T_PONTOVIRG | T_VIRGULA | T_LPAREN | T_RPAREN | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=23;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:10: T_PUBLIC
                {
                mT_PUBLIC(); 

                }
                break;
            case 2 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:19: T_INTEFACE
                {
                mT_INTEFACE(); 

                }
                break;
            case 3 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:30: T_INT
                {
                mT_INT(); 

                }
                break;
            case 4 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:36: T_BOOLEAN
                {
                mT_BOOLEAN(); 

                }
                break;
            case 5 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:46: T_STRING
                {
                mT_STRING(); 

                }
                break;
            case 6 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:55: T_BYTE
                {
                mT_BYTE(); 

                }
                break;
            case 7 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:62: T_CHAR
                {
                mT_CHAR(); 

                }
                break;
            case 8 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:69: T_FLOAT
                {
                mT_FLOAT(); 

                }
                break;
            case 9 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:77: T_DOUBLE
                {
                mT_DOUBLE(); 

                }
                break;
            case 10 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:86: T_VOID
                {
                mT_VOID(); 

                }
                break;
            case 11 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:93: T_LCHAVE
                {
                mT_LCHAVE(); 

                }
                break;
            case 12 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:102: T_RCHAVE
                {
                mT_RCHAVE(); 

                }
                break;
            case 13 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:111: T_PONTOVIRG
                {
                mT_PONTOVIRG(); 

                }
                break;
            case 14 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:123: T_VIRGULA
                {
                mT_VIRGULA(); 

                }
                break;
            case 15 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:133: T_LPAREN
                {
                mT_LPAREN(); 

                }
                break;
            case 16 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:142: T_RPAREN
                {
                mT_RPAREN(); 

                }
                break;
            case 17 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:151: ID
                {
                mID(); 

                }
                break;
            case 18 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:154: INT
                {
                mINT(); 

                }
                break;
            case 19 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:158: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 20 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:164: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 21 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:172: WS
                {
                mWS(); 

                }
                break;
            case 22 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:175: STRING
                {
                mSTRING(); 

                }
                break;
            case 23 :
                // /home/tarcisio/Desktop/IDL/IDL.g:1:182: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "92:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\10\17\7\uffff\1\37\5\uffff\11\17\1\uffff\1\17\1\53\11\17"+
        "\1\uffff\1\17\1\66\1\17\1\70\2\17\1\73\3\17\1\uffff\1\17\1\uffff"+
        "\1\100\1\17\1\uffff\1\102\2\17\1\105\1\uffff\1\106\1\uffff\1\17"+
        "\1\110\2\uffff\1\17\1\uffff\1\112\1\uffff";
    static final String DFA20_eofS =
        "\113\uffff";
    static final String DFA20_minS =
        "\1\11\1\165\1\156\1\157\1\164\1\150\1\154\2\157\7\uffff\1\56\5\uffff"+
        "\1\142\1\164\1\157\1\164\1\162\1\141\1\157\1\165\1\151\1\uffff\1"+
        "\154\1\60\1\154\1\145\1\151\1\162\1\141\1\142\1\144\1\151\1\162"+
        "\1\uffff\1\145\1\60\1\156\1\60\1\164\1\154\1\60\1\143\1\146\1\141"+
        "\1\uffff\1\147\1\uffff\1\60\1\145\1\uffff\1\60\1\141\1\156\1\60"+
        "\1\uffff\1\60\1\uffff\1\143\1\60\2\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\175\1\165\1\156\1\171\1\164\1\150\1\154\2\157\7\uffff\1\145\5"+
        "\uffff\1\142\1\164\1\157\1\164\1\162\1\141\1\157\1\165\1\151\1\uffff"+
        "\1\154\1\172\1\154\1\145\1\151\1\162\1\141\1\142\1\144\1\151\1\162"+
        "\1\uffff\1\145\1\172\1\156\1\172\1\164\1\154\1\172\1\143\1\146\1"+
        "\141\1\uffff\1\147\1\uffff\1\172\1\145\1\uffff\1\172\1\141\1\156"+
        "\1\172\1\uffff\1\172\1\uffff\1\143\1\172\2\uffff\1\145\1\uffff\1"+
        "\172\1\uffff";
    static final String DFA20_acceptS =
        "\11\uffff\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1\23\1\24\1"+
        "\25\1\26\1\27\11\uffff\1\22\13\uffff\1\3\12\uffff\1\6\1\uffff\1"+
        "\7\2\uffff\1\12\4\uffff\1\10\1\uffff\1\1\2\uffff\1\5\1\11\1\uffff"+
        "\1\4\1\uffff\1\2";
    static final String DFA20_specialS =
        "\113\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\1\uffff\1\24\4\uffff\1\25\1"+
            "\15\1\16\2\uffff\1\14\1\uffff\1\21\1\22\12\20\1\uffff\1\13\5"+
            "\uffff\22\17\1\4\7\17\4\uffff\1\17\1\uffff\1\17\1\3\1\5\1\7"+
            "\1\17\1\6\2\17\1\2\6\17\1\1\5\17\1\10\4\17\1\11\1\uffff\1\12",
            "\1\26",
            "\1\27",
            "\1\30\11\uffff\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\uffff\12\20\13\uffff\1\21\37\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\1\51",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\4\17\1\52\25\17",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\1\65",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\67",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\71",
            "\1\72",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\101",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\103",
            "\1\104",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "\1\107",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "\1\111",
            "",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T_PUBLIC | T_INTEFACE | T_INT | T_BOOLEAN | T_STRING | T_BYTE | T_CHAR | T_FLOAT | T_DOUBLE | T_VOID | T_LCHAVE | T_RCHAVE | T_PONTOVIRG | T_VIRGULA | T_LPAREN | T_RPAREN | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}