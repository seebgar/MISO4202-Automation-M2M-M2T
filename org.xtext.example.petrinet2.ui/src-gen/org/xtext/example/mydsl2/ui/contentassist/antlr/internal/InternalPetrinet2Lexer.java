package org.xtext.example.mydsl2.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinet2Lexer extends Lexer {
    public static final int RULE_TPLACE=11;
    public static final int RULE_STRING=14;
    public static final int RULE_GREATER=7;
    public static final int RULE_TINPUTARC=13;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_TOUTPUTARC=12;
    public static final int RULE_EQUALS=6;
    public static final int RULE_LESS=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=10;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_SLASH=8;
    public static final int RULE_NUMBER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_QUESTION=5;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_TTRANSITION=9;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalPetrinet2Lexer() {;} 
    public InternalPetrinet2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPetrinet2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPetrinet2.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:11:7: ( 'xml' )
            // InternalPetrinet2.g:11:9: 'xml'
            {
            match("xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:12:7: ( 'version' )
            // InternalPetrinet2.g:12:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:13:7: ( '\"1.0\"' )
            // InternalPetrinet2.g:13:9: '\"1.0\"'
            {
            match("\"1.0\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:14:7: ( 'pnml:pnml' )
            // InternalPetrinet2.g:14:9: 'pnml:pnml'
            {
            match("pnml:pnml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:15:7: ( 'xmlns:pnml' )
            // InternalPetrinet2.g:15:9: 'xmlns:pnml'
            {
            match("xmlns:pnml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:16:7: ( '\"pnml.xsd\"' )
            // InternalPetrinet2.g:16:9: '\"pnml.xsd\"'
            {
            match("\"pnml.xsd\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:17:7: ( 'net' )
            // InternalPetrinet2.g:17:9: 'net'
            {
            match("net"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:18:7: ( 'type' )
            // InternalPetrinet2.g:18:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:19:7: ( '\"ptNet\"' )
            // InternalPetrinet2.g:19:9: '\"ptNet\"'
            {
            match("\"ptNet\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:20:7: ( 'target' )
            // InternalPetrinet2.g:20:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:21:7: ( 'source' )
            // InternalPetrinet2.g:21:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3030:13: ( ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )? )
            // InternalPetrinet2.g:3030:15: ( '0' .. '9' )* ( '.' ( '0' .. '9' )+ )?
            {
            // InternalPetrinet2.g:3030:15: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPetrinet2.g:3030:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPetrinet2.g:3030:27: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPetrinet2.g:3030:28: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalPetrinet2.g:3030:32: ( '0' .. '9' )+
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
                    	    // InternalPetrinet2.g:3030:33: '0' .. '9'
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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3032:10: ( 'this one has been deactivated' )
            // InternalPetrinet2.g:3032:12: 'this one has been deactivated'
            {
            match("this one has been deactivated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_GREATER"
    public final void mRULE_GREATER() throws RecognitionException {
        try {
            int _type = RULE_GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3034:14: ( '>' )
            // InternalPetrinet2.g:3034:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER"

    // $ANTLR start "RULE_LESS"
    public final void mRULE_LESS() throws RecognitionException {
        try {
            int _type = RULE_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3036:11: ( '<' )
            // InternalPetrinet2.g:3036:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3038:12: ( '/' )
            // InternalPetrinet2.g:3038:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_TPLACE"
    public final void mRULE_TPLACE() throws RecognitionException {
        try {
            int _type = RULE_TPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3040:13: ( 'place' )
            // InternalPetrinet2.g:3040:15: 'place'
            {
            match("place"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TPLACE"

    // $ANTLR start "RULE_TTRANSITION"
    public final void mRULE_TTRANSITION() throws RecognitionException {
        try {
            int _type = RULE_TTRANSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3042:18: ( 'transition' )
            // InternalPetrinet2.g:3042:20: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TTRANSITION"

    // $ANTLR start "RULE_TOUTPUTARC"
    public final void mRULE_TOUTPUTARC() throws RecognitionException {
        try {
            int _type = RULE_TOUTPUTARC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3044:17: ( 'outputarc' )
            // InternalPetrinet2.g:3044:19: 'outputarc'
            {
            match("outputarc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOUTPUTARC"

    // $ANTLR start "RULE_TINPUTARC"
    public final void mRULE_TINPUTARC() throws RecognitionException {
        try {
            int _type = RULE_TINPUTARC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3046:16: ( 'inputarc' )
            // InternalPetrinet2.g:3046:18: 'inputarc'
            {
            match("inputarc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TINPUTARC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3048:9: ( 'id' )
            // InternalPetrinet2.g:3048:11: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3050:13: ( '=' )
            // InternalPetrinet2.g:3050:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_QUESTION"
    public final void mRULE_QUESTION() throws RecognitionException {
        try {
            int _type = RULE_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3052:15: ( '?' )
            // InternalPetrinet2.g:3052:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3054:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPetrinet2.g:3054:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPetrinet2.g:3054:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPetrinet2.g:3054:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPetrinet2.g:3054:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalPetrinet2.g:3054:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPetrinet2.g:3054:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPetrinet2.g:3054:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPetrinet2.g:3054:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPetrinet2.g:3054:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPetrinet2.g:3054:61: ~ ( ( '\\\\' | '\\'' ) )
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

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3056:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPetrinet2.g:3056:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPetrinet2.g:3056:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPetrinet2.g:3056:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3058:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPetrinet2.g:3058:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPetrinet2.g:3058:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPetrinet2.g:3058:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // InternalPetrinet2.g:3058:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPetrinet2.g:3058:41: ( '\\r' )? '\\n'
                    {
                    // InternalPetrinet2.g:3058:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalPetrinet2.g:3058:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3060:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPetrinet2.g:3060:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPetrinet2.g:3060:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPetrinet2.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPetrinet2.g:3062:16: ( . )
            // InternalPetrinet2.g:3062:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPetrinet2.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_NUMBER | RULE_INT | RULE_GREATER | RULE_LESS | RULE_SLASH | RULE_TPLACE | RULE_TTRANSITION | RULE_TOUTPUTARC | RULE_TINPUTARC | RULE_ID | RULE_EQUALS | RULE_QUESTION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalPetrinet2.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalPetrinet2.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalPetrinet2.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalPetrinet2.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalPetrinet2.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalPetrinet2.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalPetrinet2.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalPetrinet2.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalPetrinet2.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalPetrinet2.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalPetrinet2.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalPetrinet2.g:1:76: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 13 :
                // InternalPetrinet2.g:1:88: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalPetrinet2.g:1:97: RULE_GREATER
                {
                mRULE_GREATER(); 

                }
                break;
            case 15 :
                // InternalPetrinet2.g:1:110: RULE_LESS
                {
                mRULE_LESS(); 

                }
                break;
            case 16 :
                // InternalPetrinet2.g:1:120: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 17 :
                // InternalPetrinet2.g:1:131: RULE_TPLACE
                {
                mRULE_TPLACE(); 

                }
                break;
            case 18 :
                // InternalPetrinet2.g:1:143: RULE_TTRANSITION
                {
                mRULE_TTRANSITION(); 

                }
                break;
            case 19 :
                // InternalPetrinet2.g:1:160: RULE_TOUTPUTARC
                {
                mRULE_TOUTPUTARC(); 

                }
                break;
            case 20 :
                // InternalPetrinet2.g:1:176: RULE_TINPUTARC
                {
                mRULE_TINPUTARC(); 

                }
                break;
            case 21 :
                // InternalPetrinet2.g:1:191: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalPetrinet2.g:1:199: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 23 :
                // InternalPetrinet2.g:1:211: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 24 :
                // InternalPetrinet2.g:1:225: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalPetrinet2.g:1:237: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalPetrinet2.g:1:253: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalPetrinet2.g:1:269: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalPetrinet2.g:1:277: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\12\7\24\1\uffff\1\24\3\uffff\1\46\2\24\2\uffff\1\24\32\uffff\1\62\25\uffff";
    static final String DFA12_eofS =
        "\103\uffff";
    static final String DFA12_minS =
        "\1\0\1\155\1\145\1\0\1\154\1\145\1\141\1\157\1\uffff\1\60\3\uffff\1\52\1\165\1\144\2\uffff\1\0\2\uffff\1\154\1\uffff\2\0\24\uffff\1\156\3\0\2\uffff\3\0\1\uffff\2\0\1\uffff\3\0\1\uffff\1\0\1\uffff\1\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\155\1\145\1\uffff\1\156\1\145\1\171\1\157\1\uffff\1\71\3\uffff\1\57\1\165\1\156\2\uffff\1\uffff\2\uffff\1\154\1\uffff\2\uffff\24\uffff\1\156\3\uffff\2\uffff\3\uffff\1\uffff\2\uffff\1\uffff\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\14\1\uffff\1\14\1\16\1\17\3\uffff\1\26\1\27\1\uffff\1\33\1\34\1\uffff\1\2\2\uffff\1\30\1\4\1\21\1\7\1\10\1\12\1\15\1\22\1\13\1\16\1\17\1\31\1\32\1\20\1\23\1\24\1\25\1\26\1\27\1\33\4\uffff\1\5\1\1\3\uffff\1\3\2\uffff\1\3\3\uffff\1\11\1\uffff\1\11\1\uffff\2\6";
    static final String DFA12_specialS =
        "\1\7\2\uffff\1\11\16\uffff\1\4\4\uffff\1\5\1\21\25\uffff\1\6\1\12\1\0\2\uffff\1\10\1\13\1\1\1\uffff\1\14\1\2\1\uffff\1\15\1\3\1\16\1\uffff\1\17\1\uffff\1\20\2\uffff}>";
    static final String[] DFA12_transitionS = DFA12_transitionS_.DFA12_transitionS;
    private static final class DFA12_transitionS_ {
        static final String[] DFA12_transitionS = {
                "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\3\4\24\1\22\6\24\1\11\1\15\12\10\2\24\1\14\1\20\1\13\1\21\51\24\1\17\4\24\1\5\1\16\1\4\2\24\1\7\1\6\1\24\1\2\1\24\1\1\uff87\24",
                "\1\25",
                "\1\26",
                "\61\31\1\27\76\31\1\30\uff8f\31",
                "\1\33\1\uffff\1\32",
                "\1\34",
                "\1\36\6\uffff\1\37\11\uffff\1\40\6\uffff\1\35",
                "\1\41",
                "",
                "\12\12",
                "",
                "",
                "",
                "\1\44\4\uffff\1\45",
                "\1\47",
                "\1\51\11\uffff\1\50",
                "",
                "",
                "\0\31",
                "",
                "",
                "\1\55",
                "",
                "\56\31\1\56\uffd1\31",
                "\156\31\1\57\5\31\1\60\uff8b\31",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "\1\61",
                "\60\31\1\63\uffcf\31",
                "\155\31\1\64\uff92\31",
                "\116\31\1\65\uffb1\31",
                "",
                "",
                "\42\31\1\66\uffdd\31",
                "\154\31\1\67\uff93\31",
                "\145\31\1\70\uff9a\31",
                "",
                "\56\31\1\72\uffd1\31",
                "\164\31\1\73\uff8b\31",
                "",
                "\170\31\1\74\uff87\31",
                "\42\31\1\75\uffdd\31",
                "\163\31\1\76\uff8c\31",
                "",
                "\144\31\1\100\uff9b\31",
                "",
                "\42\31\1\101\uffdd\31",
                "",
                ""
        };
    }

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_NUMBER | RULE_INT | RULE_GREATER | RULE_LESS | RULE_SLASH | RULE_TPLACE | RULE_TTRANSITION | RULE_TOUTPUTARC | RULE_TINPUTARC | RULE_ID | RULE_EQUALS | RULE_QUESTION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='N') ) {s = 53;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='M')||(LA12_48>='O' && LA12_48<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( (LA12_53=='e') ) {s = 56;}

                        else if ( ((LA12_53>='\u0000' && LA12_53<='d')||(LA12_53>='f' && LA12_53<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_56 = input.LA(1);

                        s = -1;
                        if ( (LA12_56=='t') ) {s = 59;}

                        else if ( ((LA12_56>='\u0000' && LA12_56<='s')||(LA12_56>='u' && LA12_56<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_59 = input.LA(1);

                        s = -1;
                        if ( (LA12_59=='\"') ) {s = 61;}

                        else if ( ((LA12_59>='\u0000' && LA12_59<='!')||(LA12_59>='#' && LA12_59<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 25;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='.') ) {s = 46;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='-')||(LA12_23>='/' && LA12_23<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='0') ) {s = 51;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='/')||(LA12_46>='1' && LA12_46<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='x') ) {s = 1;}

                        else if ( (LA12_0=='v') ) {s = 2;}

                        else if ( (LA12_0=='\"') ) {s = 3;}

                        else if ( (LA12_0=='p') ) {s = 4;}

                        else if ( (LA12_0=='n') ) {s = 5;}

                        else if ( (LA12_0=='t') ) {s = 6;}

                        else if ( (LA12_0=='s') ) {s = 7;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 8;}

                        else if ( (LA12_0=='.') ) {s = 9;}

                        else if ( (LA12_0=='>') ) {s = 11;}

                        else if ( (LA12_0=='<') ) {s = 12;}

                        else if ( (LA12_0=='/') ) {s = 13;}

                        else if ( (LA12_0=='o') ) {s = 14;}

                        else if ( (LA12_0=='i') ) {s = 15;}

                        else if ( (LA12_0=='=') ) {s = 16;}

                        else if ( (LA12_0=='?') ) {s = 17;}

                        else if ( (LA12_0=='\'') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='@' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='m')||(LA12_0>='q' && LA12_0<='r')||LA12_0=='u'||LA12_0=='w'||(LA12_0>='y' && LA12_0<='\uFFFF')) ) {s = 20;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( (LA12_51=='\"') ) {s = 54;}

                        else if ( ((LA12_51>='\u0000' && LA12_51<='!')||(LA12_51>='#' && LA12_51<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_3 = input.LA(1);

                        s = -1;
                        if ( (LA12_3=='1') ) {s = 23;}

                        else if ( (LA12_3=='p') ) {s = 24;}

                        else if ( ((LA12_3>='\u0000' && LA12_3<='0')||(LA12_3>='2' && LA12_3<='o')||(LA12_3>='q' && LA12_3<='\uFFFF')) ) {s = 25;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='m') ) {s = 52;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='l')||(LA12_47>='n' && LA12_47<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_52 = input.LA(1);

                        s = -1;
                        if ( (LA12_52=='l') ) {s = 55;}

                        else if ( ((LA12_52>='\u0000' && LA12_52<='k')||(LA12_52>='m' && LA12_52<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_55 = input.LA(1);

                        s = -1;
                        if ( (LA12_55=='.') ) {s = 58;}

                        else if ( ((LA12_55>='\u0000' && LA12_55<='-')||(LA12_55>='/' && LA12_55<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_58 = input.LA(1);

                        s = -1;
                        if ( (LA12_58=='x') ) {s = 60;}

                        else if ( ((LA12_58>='\u0000' && LA12_58<='w')||(LA12_58>='y' && LA12_58<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_60 = input.LA(1);

                        s = -1;
                        if ( (LA12_60=='s') ) {s = 62;}

                        else if ( ((LA12_60>='\u0000' && LA12_60<='r')||(LA12_60>='t' && LA12_60<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_62 = input.LA(1);

                        s = -1;
                        if ( (LA12_62=='d') ) {s = 64;}

                        else if ( ((LA12_62>='\u0000' && LA12_62<='c')||(LA12_62>='e' && LA12_62<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='\"') ) {s = 65;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='!')||(LA12_64>='#' && LA12_64<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='n') ) {s = 47;}

                        else if ( (LA12_24=='t') ) {s = 48;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='m')||(LA12_24>='o' && LA12_24<='s')||(LA12_24>='u' && LA12_24<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}