package org.xtext.example.mydsl2.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl2.services.Petrinet2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinet2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LESS", "RULE_QUESTION", "RULE_EQUALS", "RULE_GREATER", "RULE_SLASH", "RULE_TTRANSITION", "RULE_ID", "RULE_TPLACE", "RULE_TOUTPUTARC", "RULE_TINPUTARC", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xml'", "'version'", "'\"1.0\"'", "'pnml:pnml'", "'xmlns:pnml'", "'\"pnml.xsd\"'", "'net'", "'type'", "'\"ptNet\"'", "'target'", "'source'"
    };
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


        public InternalPetrinet2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPetrinet2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPetrinet2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalPetrinet2.g"; }


     
     	private Petrinet2GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Petrinet2GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePetrinet"
    // InternalPetrinet2.g:60:1: entryRulePetrinet : rulePetrinet EOF ;
    public final void entryRulePetrinet() throws RecognitionException {
        try {
            // InternalPetrinet2.g:61:1: ( rulePetrinet EOF )
            // InternalPetrinet2.g:62:1: rulePetrinet EOF
            {
             before(grammarAccess.getPetrinetRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePetrinet();

            state._fsp--;

             after(grammarAccess.getPetrinetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePetrinet"


    // $ANTLR start "rulePetrinet"
    // InternalPetrinet2.g:69:1: rulePetrinet : ( ( rule__Petrinet__Group__0 ) ) ;
    public final void rulePetrinet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:73:2: ( ( ( rule__Petrinet__Group__0 ) ) )
            // InternalPetrinet2.g:74:1: ( ( rule__Petrinet__Group__0 ) )
            {
            // InternalPetrinet2.g:74:1: ( ( rule__Petrinet__Group__0 ) )
            // InternalPetrinet2.g:75:1: ( rule__Petrinet__Group__0 )
            {
             before(grammarAccess.getPetrinetAccess().getGroup()); 
            // InternalPetrinet2.g:76:1: ( rule__Petrinet__Group__0 )
            // InternalPetrinet2.g:76:2: rule__Petrinet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPetrinetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePetrinet"


    // $ANTLR start "entryRuleElement"
    // InternalPetrinet2.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalPetrinet2.g:89:1: ( ruleElement EOF )
            // InternalPetrinet2.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalPetrinet2.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalPetrinet2.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // InternalPetrinet2.g:102:1: ( ( rule__Element__Alternatives ) )
            // InternalPetrinet2.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalPetrinet2.g:104:1: ( rule__Element__Alternatives )
            // InternalPetrinet2.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleNode"
    // InternalPetrinet2.g:116:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalPetrinet2.g:117:1: ( ruleNode EOF )
            // InternalPetrinet2.g:118:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalPetrinet2.g:125:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:129:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalPetrinet2.g:130:1: ( ( rule__Node__Alternatives ) )
            {
            // InternalPetrinet2.g:130:1: ( ( rule__Node__Alternatives ) )
            // InternalPetrinet2.g:131:1: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalPetrinet2.g:132:1: ( rule__Node__Alternatives )
            // InternalPetrinet2.g:132:2: rule__Node__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleTransition"
    // InternalPetrinet2.g:144:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalPetrinet2.g:145:1: ( ruleTransition EOF )
            // InternalPetrinet2.g:146:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetrinet2.g:153:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:157:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalPetrinet2.g:158:1: ( ( rule__Transition__Group__0 ) )
            {
            // InternalPetrinet2.g:158:1: ( ( rule__Transition__Group__0 ) )
            // InternalPetrinet2.g:159:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalPetrinet2.g:160:1: ( rule__Transition__Group__0 )
            // InternalPetrinet2.g:160:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRulePlace"
    // InternalPetrinet2.g:172:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // InternalPetrinet2.g:173:1: ( rulePlace EOF )
            // InternalPetrinet2.g:174:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetrinet2.g:181:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:185:2: ( ( ( rule__Place__Group__0 ) ) )
            // InternalPetrinet2.g:186:1: ( ( rule__Place__Group__0 ) )
            {
            // InternalPetrinet2.g:186:1: ( ( rule__Place__Group__0 ) )
            // InternalPetrinet2.g:187:1: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // InternalPetrinet2.g:188:1: ( rule__Place__Group__0 )
            // InternalPetrinet2.g:188:2: rule__Place__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleOutputArc"
    // InternalPetrinet2.g:200:1: entryRuleOutputArc : ruleOutputArc EOF ;
    public final void entryRuleOutputArc() throws RecognitionException {
        try {
            // InternalPetrinet2.g:201:1: ( ruleOutputArc EOF )
            // InternalPetrinet2.g:202:1: ruleOutputArc EOF
            {
             before(grammarAccess.getOutputArcRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOutputArc();

            state._fsp--;

             after(grammarAccess.getOutputArcRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputArc"


    // $ANTLR start "ruleOutputArc"
    // InternalPetrinet2.g:209:1: ruleOutputArc : ( ( rule__OutputArc__Group__0 ) ) ;
    public final void ruleOutputArc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:213:2: ( ( ( rule__OutputArc__Group__0 ) ) )
            // InternalPetrinet2.g:214:1: ( ( rule__OutputArc__Group__0 ) )
            {
            // InternalPetrinet2.g:214:1: ( ( rule__OutputArc__Group__0 ) )
            // InternalPetrinet2.g:215:1: ( rule__OutputArc__Group__0 )
            {
             before(grammarAccess.getOutputArcAccess().getGroup()); 
            // InternalPetrinet2.g:216:1: ( rule__OutputArc__Group__0 )
            // InternalPetrinet2.g:216:2: rule__OutputArc__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputArc"


    // $ANTLR start "entryRuleInputArc"
    // InternalPetrinet2.g:228:1: entryRuleInputArc : ruleInputArc EOF ;
    public final void entryRuleInputArc() throws RecognitionException {
        try {
            // InternalPetrinet2.g:229:1: ( ruleInputArc EOF )
            // InternalPetrinet2.g:230:1: ruleInputArc EOF
            {
             before(grammarAccess.getInputArcRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInputArc();

            state._fsp--;

             after(grammarAccess.getInputArcRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputArc"


    // $ANTLR start "ruleInputArc"
    // InternalPetrinet2.g:237:1: ruleInputArc : ( ( rule__InputArc__Group__0 ) ) ;
    public final void ruleInputArc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:241:2: ( ( ( rule__InputArc__Group__0 ) ) )
            // InternalPetrinet2.g:242:1: ( ( rule__InputArc__Group__0 ) )
            {
            // InternalPetrinet2.g:242:1: ( ( rule__InputArc__Group__0 ) )
            // InternalPetrinet2.g:243:1: ( rule__InputArc__Group__0 )
            {
             before(grammarAccess.getInputArcAccess().getGroup()); 
            // InternalPetrinet2.g:244:1: ( rule__InputArc__Group__0 )
            // InternalPetrinet2.g:244:2: rule__InputArc__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputArc"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalPetrinet2.g:256:1: rule__Element__Alternatives : ( ( ruleNode ) | ( ruleOutputArc ) | ( ruleInputArc ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:260:1: ( ( ruleNode ) | ( ruleOutputArc ) | ( ruleInputArc ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_LESS) ) {
                switch ( input.LA(2) ) {
                case RULE_TTRANSITION:
                case RULE_TPLACE:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_TINPUTARC:
                    {
                    alt1=3;
                    }
                    break;
                case RULE_TOUTPUTARC:
                    {
                    alt1=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPetrinet2.g:261:1: ( ruleNode )
                    {
                    // InternalPetrinet2.g:261:1: ( ruleNode )
                    // InternalPetrinet2.g:262:1: ruleNode
                    {
                     before(grammarAccess.getElementAccess().getNodeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetrinet2.g:267:6: ( ruleOutputArc )
                    {
                    // InternalPetrinet2.g:267:6: ( ruleOutputArc )
                    // InternalPetrinet2.g:268:1: ruleOutputArc
                    {
                     before(grammarAccess.getElementAccess().getOutputArcParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOutputArc();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getOutputArcParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPetrinet2.g:273:6: ( ruleInputArc )
                    {
                    // InternalPetrinet2.g:273:6: ( ruleInputArc )
                    // InternalPetrinet2.g:274:1: ruleInputArc
                    {
                     before(grammarAccess.getElementAccess().getInputArcParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleInputArc();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInputArcParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Node__Alternatives"
    // InternalPetrinet2.g:284:1: rule__Node__Alternatives : ( ( ruleTransition ) | ( rulePlace ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:288:1: ( ( ruleTransition ) | ( rulePlace ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LESS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_TPLACE) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_TTRANSITION) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPetrinet2.g:289:1: ( ruleTransition )
                    {
                    // InternalPetrinet2.g:289:1: ( ruleTransition )
                    // InternalPetrinet2.g:290:1: ruleTransition
                    {
                     before(grammarAccess.getNodeAccess().getTransitionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPetrinet2.g:295:6: ( rulePlace )
                    {
                    // InternalPetrinet2.g:295:6: ( rulePlace )
                    // InternalPetrinet2.g:296:1: rulePlace
                    {
                     before(grammarAccess.getNodeAccess().getPlaceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getPlaceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__Petrinet__Group__0"
    // InternalPetrinet2.g:308:1: rule__Petrinet__Group__0 : rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1 ;
    public final void rule__Petrinet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:312:1: ( rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1 )
            // InternalPetrinet2.g:313:2: rule__Petrinet__Group__0__Impl rule__Petrinet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Petrinet__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__0"


    // $ANTLR start "rule__Petrinet__Group__0__Impl"
    // InternalPetrinet2.g:320:1: rule__Petrinet__Group__0__Impl : ( () ) ;
    public final void rule__Petrinet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:324:1: ( ( () ) )
            // InternalPetrinet2.g:325:1: ( () )
            {
            // InternalPetrinet2.g:325:1: ( () )
            // InternalPetrinet2.g:326:1: ()
            {
             before(grammarAccess.getPetrinetAccess().getPetrinetAction_0()); 
            // InternalPetrinet2.g:327:1: ()
            // InternalPetrinet2.g:329:1: 
            {
            }

             after(grammarAccess.getPetrinetAccess().getPetrinetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__0__Impl"


    // $ANTLR start "rule__Petrinet__Group__1"
    // InternalPetrinet2.g:339:1: rule__Petrinet__Group__1 : rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2 ;
    public final void rule__Petrinet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:343:1: ( rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2 )
            // InternalPetrinet2.g:344:2: rule__Petrinet__Group__1__Impl rule__Petrinet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Petrinet__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__1"


    // $ANTLR start "rule__Petrinet__Group__1__Impl"
    // InternalPetrinet2.g:351:1: rule__Petrinet__Group__1__Impl : ( RULE_LESS ) ;
    public final void rule__Petrinet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:355:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:356:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:356:1: ( RULE_LESS )
            // InternalPetrinet2.g:357:1: RULE_LESS
            {
             before(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_1()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__1__Impl"


    // $ANTLR start "rule__Petrinet__Group__2"
    // InternalPetrinet2.g:368:1: rule__Petrinet__Group__2 : rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3 ;
    public final void rule__Petrinet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:372:1: ( rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3 )
            // InternalPetrinet2.g:373:2: rule__Petrinet__Group__2__Impl rule__Petrinet__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Petrinet__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__2"


    // $ANTLR start "rule__Petrinet__Group__2__Impl"
    // InternalPetrinet2.g:380:1: rule__Petrinet__Group__2__Impl : ( RULE_QUESTION ) ;
    public final void rule__Petrinet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:384:1: ( ( RULE_QUESTION ) )
            // InternalPetrinet2.g:385:1: ( RULE_QUESTION )
            {
            // InternalPetrinet2.g:385:1: ( RULE_QUESTION )
            // InternalPetrinet2.g:386:1: RULE_QUESTION
            {
             before(grammarAccess.getPetrinetAccess().getQUESTIONTerminalRuleCall_2()); 
            match(input,RULE_QUESTION,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getQUESTIONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__2__Impl"


    // $ANTLR start "rule__Petrinet__Group__3"
    // InternalPetrinet2.g:397:1: rule__Petrinet__Group__3 : rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4 ;
    public final void rule__Petrinet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:401:1: ( rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4 )
            // InternalPetrinet2.g:402:2: rule__Petrinet__Group__3__Impl rule__Petrinet__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Petrinet__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__3"


    // $ANTLR start "rule__Petrinet__Group__3__Impl"
    // InternalPetrinet2.g:409:1: rule__Petrinet__Group__3__Impl : ( 'xml' ) ;
    public final void rule__Petrinet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:413:1: ( ( 'xml' ) )
            // InternalPetrinet2.g:414:1: ( 'xml' )
            {
            // InternalPetrinet2.g:414:1: ( 'xml' )
            // InternalPetrinet2.g:415:1: 'xml'
            {
             before(grammarAccess.getPetrinetAccess().getXmlKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getXmlKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__3__Impl"


    // $ANTLR start "rule__Petrinet__Group__4"
    // InternalPetrinet2.g:428:1: rule__Petrinet__Group__4 : rule__Petrinet__Group__4__Impl rule__Petrinet__Group__5 ;
    public final void rule__Petrinet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:432:1: ( rule__Petrinet__Group__4__Impl rule__Petrinet__Group__5 )
            // InternalPetrinet2.g:433:2: rule__Petrinet__Group__4__Impl rule__Petrinet__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Petrinet__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__4"


    // $ANTLR start "rule__Petrinet__Group__4__Impl"
    // InternalPetrinet2.g:440:1: rule__Petrinet__Group__4__Impl : ( 'version' ) ;
    public final void rule__Petrinet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:444:1: ( ( 'version' ) )
            // InternalPetrinet2.g:445:1: ( 'version' )
            {
            // InternalPetrinet2.g:445:1: ( 'version' )
            // InternalPetrinet2.g:446:1: 'version'
            {
             before(grammarAccess.getPetrinetAccess().getVersionKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getVersionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__4__Impl"


    // $ANTLR start "rule__Petrinet__Group__5"
    // InternalPetrinet2.g:459:1: rule__Petrinet__Group__5 : rule__Petrinet__Group__5__Impl rule__Petrinet__Group__6 ;
    public final void rule__Petrinet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:463:1: ( rule__Petrinet__Group__5__Impl rule__Petrinet__Group__6 )
            // InternalPetrinet2.g:464:2: rule__Petrinet__Group__5__Impl rule__Petrinet__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Petrinet__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__5"


    // $ANTLR start "rule__Petrinet__Group__5__Impl"
    // InternalPetrinet2.g:471:1: rule__Petrinet__Group__5__Impl : ( RULE_EQUALS ) ;
    public final void rule__Petrinet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:475:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:476:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:476:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:477:1: RULE_EQUALS
            {
             before(grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_5()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__5__Impl"


    // $ANTLR start "rule__Petrinet__Group__6"
    // InternalPetrinet2.g:488:1: rule__Petrinet__Group__6 : rule__Petrinet__Group__6__Impl rule__Petrinet__Group__7 ;
    public final void rule__Petrinet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:492:1: ( rule__Petrinet__Group__6__Impl rule__Petrinet__Group__7 )
            // InternalPetrinet2.g:493:2: rule__Petrinet__Group__6__Impl rule__Petrinet__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Petrinet__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__6"


    // $ANTLR start "rule__Petrinet__Group__6__Impl"
    // InternalPetrinet2.g:500:1: rule__Petrinet__Group__6__Impl : ( '\"1.0\"' ) ;
    public final void rule__Petrinet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:504:1: ( ( '\"1.0\"' ) )
            // InternalPetrinet2.g:505:1: ( '\"1.0\"' )
            {
            // InternalPetrinet2.g:505:1: ( '\"1.0\"' )
            // InternalPetrinet2.g:506:1: '\"1.0\"'
            {
             before(grammarAccess.getPetrinetAccess().getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__6__Impl"


    // $ANTLR start "rule__Petrinet__Group__7"
    // InternalPetrinet2.g:519:1: rule__Petrinet__Group__7 : rule__Petrinet__Group__7__Impl rule__Petrinet__Group__8 ;
    public final void rule__Petrinet__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:523:1: ( rule__Petrinet__Group__7__Impl rule__Petrinet__Group__8 )
            // InternalPetrinet2.g:524:2: rule__Petrinet__Group__7__Impl rule__Petrinet__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Petrinet__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__7"


    // $ANTLR start "rule__Petrinet__Group__7__Impl"
    // InternalPetrinet2.g:531:1: rule__Petrinet__Group__7__Impl : ( RULE_QUESTION ) ;
    public final void rule__Petrinet__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:535:1: ( ( RULE_QUESTION ) )
            // InternalPetrinet2.g:536:1: ( RULE_QUESTION )
            {
            // InternalPetrinet2.g:536:1: ( RULE_QUESTION )
            // InternalPetrinet2.g:537:1: RULE_QUESTION
            {
             before(grammarAccess.getPetrinetAccess().getQUESTIONTerminalRuleCall_7()); 
            match(input,RULE_QUESTION,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getQUESTIONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__7__Impl"


    // $ANTLR start "rule__Petrinet__Group__8"
    // InternalPetrinet2.g:548:1: rule__Petrinet__Group__8 : rule__Petrinet__Group__8__Impl rule__Petrinet__Group__9 ;
    public final void rule__Petrinet__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:552:1: ( rule__Petrinet__Group__8__Impl rule__Petrinet__Group__9 )
            // InternalPetrinet2.g:553:2: rule__Petrinet__Group__8__Impl rule__Petrinet__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Petrinet__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__8"


    // $ANTLR start "rule__Petrinet__Group__8__Impl"
    // InternalPetrinet2.g:560:1: rule__Petrinet__Group__8__Impl : ( RULE_GREATER ) ;
    public final void rule__Petrinet__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:564:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:565:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:565:1: ( RULE_GREATER )
            // InternalPetrinet2.g:566:1: RULE_GREATER
            {
             before(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_8()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__8__Impl"


    // $ANTLR start "rule__Petrinet__Group__9"
    // InternalPetrinet2.g:577:1: rule__Petrinet__Group__9 : rule__Petrinet__Group__9__Impl rule__Petrinet__Group__10 ;
    public final void rule__Petrinet__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:581:1: ( rule__Petrinet__Group__9__Impl rule__Petrinet__Group__10 )
            // InternalPetrinet2.g:582:2: rule__Petrinet__Group__9__Impl rule__Petrinet__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Petrinet__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__9"


    // $ANTLR start "rule__Petrinet__Group__9__Impl"
    // InternalPetrinet2.g:589:1: rule__Petrinet__Group__9__Impl : ( RULE_LESS ) ;
    public final void rule__Petrinet__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:593:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:594:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:594:1: ( RULE_LESS )
            // InternalPetrinet2.g:595:1: RULE_LESS
            {
             before(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_9()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__9__Impl"


    // $ANTLR start "rule__Petrinet__Group__10"
    // InternalPetrinet2.g:606:1: rule__Petrinet__Group__10 : rule__Petrinet__Group__10__Impl rule__Petrinet__Group__11 ;
    public final void rule__Petrinet__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:610:1: ( rule__Petrinet__Group__10__Impl rule__Petrinet__Group__11 )
            // InternalPetrinet2.g:611:2: rule__Petrinet__Group__10__Impl rule__Petrinet__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Petrinet__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__10"


    // $ANTLR start "rule__Petrinet__Group__10__Impl"
    // InternalPetrinet2.g:618:1: rule__Petrinet__Group__10__Impl : ( 'pnml:pnml' ) ;
    public final void rule__Petrinet__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:622:1: ( ( 'pnml:pnml' ) )
            // InternalPetrinet2.g:623:1: ( 'pnml:pnml' )
            {
            // InternalPetrinet2.g:623:1: ( 'pnml:pnml' )
            // InternalPetrinet2.g:624:1: 'pnml:pnml'
            {
             before(grammarAccess.getPetrinetAccess().getPnmlPnmlKeyword_10()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getPnmlPnmlKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__10__Impl"


    // $ANTLR start "rule__Petrinet__Group__11"
    // InternalPetrinet2.g:637:1: rule__Petrinet__Group__11 : rule__Petrinet__Group__11__Impl rule__Petrinet__Group__12 ;
    public final void rule__Petrinet__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:641:1: ( rule__Petrinet__Group__11__Impl rule__Petrinet__Group__12 )
            // InternalPetrinet2.g:642:2: rule__Petrinet__Group__11__Impl rule__Petrinet__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Petrinet__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__11"


    // $ANTLR start "rule__Petrinet__Group__11__Impl"
    // InternalPetrinet2.g:649:1: rule__Petrinet__Group__11__Impl : ( 'xmlns:pnml' ) ;
    public final void rule__Petrinet__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:653:1: ( ( 'xmlns:pnml' ) )
            // InternalPetrinet2.g:654:1: ( 'xmlns:pnml' )
            {
            // InternalPetrinet2.g:654:1: ( 'xmlns:pnml' )
            // InternalPetrinet2.g:655:1: 'xmlns:pnml'
            {
             before(grammarAccess.getPetrinetAccess().getXmlnsPnmlKeyword_11()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getXmlnsPnmlKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__11__Impl"


    // $ANTLR start "rule__Petrinet__Group__12"
    // InternalPetrinet2.g:668:1: rule__Petrinet__Group__12 : rule__Petrinet__Group__12__Impl rule__Petrinet__Group__13 ;
    public final void rule__Petrinet__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:672:1: ( rule__Petrinet__Group__12__Impl rule__Petrinet__Group__13 )
            // InternalPetrinet2.g:673:2: rule__Petrinet__Group__12__Impl rule__Petrinet__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Petrinet__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__12"


    // $ANTLR start "rule__Petrinet__Group__12__Impl"
    // InternalPetrinet2.g:680:1: rule__Petrinet__Group__12__Impl : ( RULE_EQUALS ) ;
    public final void rule__Petrinet__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:684:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:685:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:685:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:686:1: RULE_EQUALS
            {
             before(grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_12()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__12__Impl"


    // $ANTLR start "rule__Petrinet__Group__13"
    // InternalPetrinet2.g:697:1: rule__Petrinet__Group__13 : rule__Petrinet__Group__13__Impl rule__Petrinet__Group__14 ;
    public final void rule__Petrinet__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:701:1: ( rule__Petrinet__Group__13__Impl rule__Petrinet__Group__14 )
            // InternalPetrinet2.g:702:2: rule__Petrinet__Group__13__Impl rule__Petrinet__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Petrinet__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__13"


    // $ANTLR start "rule__Petrinet__Group__13__Impl"
    // InternalPetrinet2.g:709:1: rule__Petrinet__Group__13__Impl : ( '\"pnml.xsd\"' ) ;
    public final void rule__Petrinet__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:713:1: ( ( '\"pnml.xsd\"' ) )
            // InternalPetrinet2.g:714:1: ( '\"pnml.xsd\"' )
            {
            // InternalPetrinet2.g:714:1: ( '\"pnml.xsd\"' )
            // InternalPetrinet2.g:715:1: '\"pnml.xsd\"'
            {
             before(grammarAccess.getPetrinetAccess().getPnmlXsdKeyword_13()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getPnmlXsdKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__13__Impl"


    // $ANTLR start "rule__Petrinet__Group__14"
    // InternalPetrinet2.g:728:1: rule__Petrinet__Group__14 : rule__Petrinet__Group__14__Impl rule__Petrinet__Group__15 ;
    public final void rule__Petrinet__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:732:1: ( rule__Petrinet__Group__14__Impl rule__Petrinet__Group__15 )
            // InternalPetrinet2.g:733:2: rule__Petrinet__Group__14__Impl rule__Petrinet__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Petrinet__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__14"


    // $ANTLR start "rule__Petrinet__Group__14__Impl"
    // InternalPetrinet2.g:740:1: rule__Petrinet__Group__14__Impl : ( RULE_GREATER ) ;
    public final void rule__Petrinet__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:744:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:745:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:745:1: ( RULE_GREATER )
            // InternalPetrinet2.g:746:1: RULE_GREATER
            {
             before(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_14()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__14__Impl"


    // $ANTLR start "rule__Petrinet__Group__15"
    // InternalPetrinet2.g:757:1: rule__Petrinet__Group__15 : rule__Petrinet__Group__15__Impl rule__Petrinet__Group__16 ;
    public final void rule__Petrinet__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:761:1: ( rule__Petrinet__Group__15__Impl rule__Petrinet__Group__16 )
            // InternalPetrinet2.g:762:2: rule__Petrinet__Group__15__Impl rule__Petrinet__Group__16
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Petrinet__Group__15__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__15"


    // $ANTLR start "rule__Petrinet__Group__15__Impl"
    // InternalPetrinet2.g:769:1: rule__Petrinet__Group__15__Impl : ( RULE_LESS ) ;
    public final void rule__Petrinet__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:773:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:774:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:774:1: ( RULE_LESS )
            // InternalPetrinet2.g:775:1: RULE_LESS
            {
             before(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_15()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__15__Impl"


    // $ANTLR start "rule__Petrinet__Group__16"
    // InternalPetrinet2.g:786:1: rule__Petrinet__Group__16 : rule__Petrinet__Group__16__Impl rule__Petrinet__Group__17 ;
    public final void rule__Petrinet__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:790:1: ( rule__Petrinet__Group__16__Impl rule__Petrinet__Group__17 )
            // InternalPetrinet2.g:791:2: rule__Petrinet__Group__16__Impl rule__Petrinet__Group__17
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Petrinet__Group__16__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__16"


    // $ANTLR start "rule__Petrinet__Group__16__Impl"
    // InternalPetrinet2.g:798:1: rule__Petrinet__Group__16__Impl : ( 'net' ) ;
    public final void rule__Petrinet__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:802:1: ( ( 'net' ) )
            // InternalPetrinet2.g:803:1: ( 'net' )
            {
            // InternalPetrinet2.g:803:1: ( 'net' )
            // InternalPetrinet2.g:804:1: 'net'
            {
             before(grammarAccess.getPetrinetAccess().getNetKeyword_16()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getNetKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__16__Impl"


    // $ANTLR start "rule__Petrinet__Group__17"
    // InternalPetrinet2.g:817:1: rule__Petrinet__Group__17 : rule__Petrinet__Group__17__Impl rule__Petrinet__Group__18 ;
    public final void rule__Petrinet__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:821:1: ( rule__Petrinet__Group__17__Impl rule__Petrinet__Group__18 )
            // InternalPetrinet2.g:822:2: rule__Petrinet__Group__17__Impl rule__Petrinet__Group__18
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Petrinet__Group__17__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__17"


    // $ANTLR start "rule__Petrinet__Group__17__Impl"
    // InternalPetrinet2.g:829:1: rule__Petrinet__Group__17__Impl : ( 'type' ) ;
    public final void rule__Petrinet__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:833:1: ( ( 'type' ) )
            // InternalPetrinet2.g:834:1: ( 'type' )
            {
            // InternalPetrinet2.g:834:1: ( 'type' )
            // InternalPetrinet2.g:835:1: 'type'
            {
             before(grammarAccess.getPetrinetAccess().getTypeKeyword_17()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getTypeKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__17__Impl"


    // $ANTLR start "rule__Petrinet__Group__18"
    // InternalPetrinet2.g:848:1: rule__Petrinet__Group__18 : rule__Petrinet__Group__18__Impl rule__Petrinet__Group__19 ;
    public final void rule__Petrinet__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:852:1: ( rule__Petrinet__Group__18__Impl rule__Petrinet__Group__19 )
            // InternalPetrinet2.g:853:2: rule__Petrinet__Group__18__Impl rule__Petrinet__Group__19
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__Petrinet__Group__18__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__18"


    // $ANTLR start "rule__Petrinet__Group__18__Impl"
    // InternalPetrinet2.g:860:1: rule__Petrinet__Group__18__Impl : ( RULE_EQUALS ) ;
    public final void rule__Petrinet__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:864:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:865:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:865:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:866:1: RULE_EQUALS
            {
             before(grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_18()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__18__Impl"


    // $ANTLR start "rule__Petrinet__Group__19"
    // InternalPetrinet2.g:877:1: rule__Petrinet__Group__19 : rule__Petrinet__Group__19__Impl rule__Petrinet__Group__20 ;
    public final void rule__Petrinet__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:881:1: ( rule__Petrinet__Group__19__Impl rule__Petrinet__Group__20 )
            // InternalPetrinet2.g:882:2: rule__Petrinet__Group__19__Impl rule__Petrinet__Group__20
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Petrinet__Group__19__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__19"


    // $ANTLR start "rule__Petrinet__Group__19__Impl"
    // InternalPetrinet2.g:889:1: rule__Petrinet__Group__19__Impl : ( '\"ptNet\"' ) ;
    public final void rule__Petrinet__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:893:1: ( ( '\"ptNet\"' ) )
            // InternalPetrinet2.g:894:1: ( '\"ptNet\"' )
            {
            // InternalPetrinet2.g:894:1: ( '\"ptNet\"' )
            // InternalPetrinet2.g:895:1: '\"ptNet\"'
            {
             before(grammarAccess.getPetrinetAccess().getPtNetKeyword_19()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getPtNetKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__19__Impl"


    // $ANTLR start "rule__Petrinet__Group__20"
    // InternalPetrinet2.g:908:1: rule__Petrinet__Group__20 : rule__Petrinet__Group__20__Impl rule__Petrinet__Group__21 ;
    public final void rule__Petrinet__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:912:1: ( rule__Petrinet__Group__20__Impl rule__Petrinet__Group__21 )
            // InternalPetrinet2.g:913:2: rule__Petrinet__Group__20__Impl rule__Petrinet__Group__21
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Petrinet__Group__20__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__20"


    // $ANTLR start "rule__Petrinet__Group__20__Impl"
    // InternalPetrinet2.g:920:1: rule__Petrinet__Group__20__Impl : ( RULE_GREATER ) ;
    public final void rule__Petrinet__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:924:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:925:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:925:1: ( RULE_GREATER )
            // InternalPetrinet2.g:926:1: RULE_GREATER
            {
             before(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_20()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__20__Impl"


    // $ANTLR start "rule__Petrinet__Group__21"
    // InternalPetrinet2.g:937:1: rule__Petrinet__Group__21 : rule__Petrinet__Group__21__Impl rule__Petrinet__Group__22 ;
    public final void rule__Petrinet__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:941:1: ( rule__Petrinet__Group__21__Impl rule__Petrinet__Group__22 )
            // InternalPetrinet2.g:942:2: rule__Petrinet__Group__21__Impl rule__Petrinet__Group__22
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Petrinet__Group__21__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__21"


    // $ANTLR start "rule__Petrinet__Group__21__Impl"
    // InternalPetrinet2.g:949:1: rule__Petrinet__Group__21__Impl : ( ( rule__Petrinet__ElementsAssignment_21 )* ) ;
    public final void rule__Petrinet__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:953:1: ( ( ( rule__Petrinet__ElementsAssignment_21 )* ) )
            // InternalPetrinet2.g:954:1: ( ( rule__Petrinet__ElementsAssignment_21 )* )
            {
            // InternalPetrinet2.g:954:1: ( ( rule__Petrinet__ElementsAssignment_21 )* )
            // InternalPetrinet2.g:955:1: ( rule__Petrinet__ElementsAssignment_21 )*
            {
             before(grammarAccess.getPetrinetAccess().getElementsAssignment_21()); 
            // InternalPetrinet2.g:956:1: ( rule__Petrinet__ElementsAssignment_21 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_LESS) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_TTRANSITION||(LA3_1>=RULE_TPLACE && LA3_1<=RULE_TINPUTARC)) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalPetrinet2.g:956:2: rule__Petrinet__ElementsAssignment_21
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__Petrinet__ElementsAssignment_21();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPetrinetAccess().getElementsAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__21__Impl"


    // $ANTLR start "rule__Petrinet__Group__22"
    // InternalPetrinet2.g:966:1: rule__Petrinet__Group__22 : rule__Petrinet__Group__22__Impl rule__Petrinet__Group__23 ;
    public final void rule__Petrinet__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:970:1: ( rule__Petrinet__Group__22__Impl rule__Petrinet__Group__23 )
            // InternalPetrinet2.g:971:2: rule__Petrinet__Group__22__Impl rule__Petrinet__Group__23
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Petrinet__Group__22__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__22"


    // $ANTLR start "rule__Petrinet__Group__22__Impl"
    // InternalPetrinet2.g:978:1: rule__Petrinet__Group__22__Impl : ( RULE_LESS ) ;
    public final void rule__Petrinet__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:982:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:983:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:983:1: ( RULE_LESS )
            // InternalPetrinet2.g:984:1: RULE_LESS
            {
             before(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_22()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__22__Impl"


    // $ANTLR start "rule__Petrinet__Group__23"
    // InternalPetrinet2.g:995:1: rule__Petrinet__Group__23 : rule__Petrinet__Group__23__Impl rule__Petrinet__Group__24 ;
    public final void rule__Petrinet__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:999:1: ( rule__Petrinet__Group__23__Impl rule__Petrinet__Group__24 )
            // InternalPetrinet2.g:1000:2: rule__Petrinet__Group__23__Impl rule__Petrinet__Group__24
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__Petrinet__Group__23__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__23"


    // $ANTLR start "rule__Petrinet__Group__23__Impl"
    // InternalPetrinet2.g:1007:1: rule__Petrinet__Group__23__Impl : ( RULE_SLASH ) ;
    public final void rule__Petrinet__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1011:1: ( ( RULE_SLASH ) )
            // InternalPetrinet2.g:1012:1: ( RULE_SLASH )
            {
            // InternalPetrinet2.g:1012:1: ( RULE_SLASH )
            // InternalPetrinet2.g:1013:1: RULE_SLASH
            {
             before(grammarAccess.getPetrinetAccess().getSLASHTerminalRuleCall_23()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getSLASHTerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__23__Impl"


    // $ANTLR start "rule__Petrinet__Group__24"
    // InternalPetrinet2.g:1024:1: rule__Petrinet__Group__24 : rule__Petrinet__Group__24__Impl rule__Petrinet__Group__25 ;
    public final void rule__Petrinet__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1028:1: ( rule__Petrinet__Group__24__Impl rule__Petrinet__Group__25 )
            // InternalPetrinet2.g:1029:2: rule__Petrinet__Group__24__Impl rule__Petrinet__Group__25
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Petrinet__Group__24__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__24"


    // $ANTLR start "rule__Petrinet__Group__24__Impl"
    // InternalPetrinet2.g:1036:1: rule__Petrinet__Group__24__Impl : ( 'net' ) ;
    public final void rule__Petrinet__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1040:1: ( ( 'net' ) )
            // InternalPetrinet2.g:1041:1: ( 'net' )
            {
            // InternalPetrinet2.g:1041:1: ( 'net' )
            // InternalPetrinet2.g:1042:1: 'net'
            {
             before(grammarAccess.getPetrinetAccess().getNetKeyword_24()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getNetKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__24__Impl"


    // $ANTLR start "rule__Petrinet__Group__25"
    // InternalPetrinet2.g:1055:1: rule__Petrinet__Group__25 : rule__Petrinet__Group__25__Impl rule__Petrinet__Group__26 ;
    public final void rule__Petrinet__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1059:1: ( rule__Petrinet__Group__25__Impl rule__Petrinet__Group__26 )
            // InternalPetrinet2.g:1060:2: rule__Petrinet__Group__25__Impl rule__Petrinet__Group__26
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Petrinet__Group__25__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__25"


    // $ANTLR start "rule__Petrinet__Group__25__Impl"
    // InternalPetrinet2.g:1067:1: rule__Petrinet__Group__25__Impl : ( RULE_GREATER ) ;
    public final void rule__Petrinet__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1071:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:1072:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:1072:1: ( RULE_GREATER )
            // InternalPetrinet2.g:1073:1: RULE_GREATER
            {
             before(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_25()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__25__Impl"


    // $ANTLR start "rule__Petrinet__Group__26"
    // InternalPetrinet2.g:1084:1: rule__Petrinet__Group__26 : rule__Petrinet__Group__26__Impl rule__Petrinet__Group__27 ;
    public final void rule__Petrinet__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1088:1: ( rule__Petrinet__Group__26__Impl rule__Petrinet__Group__27 )
            // InternalPetrinet2.g:1089:2: rule__Petrinet__Group__26__Impl rule__Petrinet__Group__27
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Petrinet__Group__26__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__26"


    // $ANTLR start "rule__Petrinet__Group__26__Impl"
    // InternalPetrinet2.g:1096:1: rule__Petrinet__Group__26__Impl : ( RULE_LESS ) ;
    public final void rule__Petrinet__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1100:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:1101:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:1101:1: ( RULE_LESS )
            // InternalPetrinet2.g:1102:1: RULE_LESS
            {
             before(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_26()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__26__Impl"


    // $ANTLR start "rule__Petrinet__Group__27"
    // InternalPetrinet2.g:1113:1: rule__Petrinet__Group__27 : rule__Petrinet__Group__27__Impl rule__Petrinet__Group__28 ;
    public final void rule__Petrinet__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1117:1: ( rule__Petrinet__Group__27__Impl rule__Petrinet__Group__28 )
            // InternalPetrinet2.g:1118:2: rule__Petrinet__Group__27__Impl rule__Petrinet__Group__28
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Petrinet__Group__27__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__27"


    // $ANTLR start "rule__Petrinet__Group__27__Impl"
    // InternalPetrinet2.g:1125:1: rule__Petrinet__Group__27__Impl : ( RULE_SLASH ) ;
    public final void rule__Petrinet__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1129:1: ( ( RULE_SLASH ) )
            // InternalPetrinet2.g:1130:1: ( RULE_SLASH )
            {
            // InternalPetrinet2.g:1130:1: ( RULE_SLASH )
            // InternalPetrinet2.g:1131:1: RULE_SLASH
            {
             before(grammarAccess.getPetrinetAccess().getSLASHTerminalRuleCall_27()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getSLASHTerminalRuleCall_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__27__Impl"


    // $ANTLR start "rule__Petrinet__Group__28"
    // InternalPetrinet2.g:1142:1: rule__Petrinet__Group__28 : rule__Petrinet__Group__28__Impl rule__Petrinet__Group__29 ;
    public final void rule__Petrinet__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1146:1: ( rule__Petrinet__Group__28__Impl rule__Petrinet__Group__29 )
            // InternalPetrinet2.g:1147:2: rule__Petrinet__Group__28__Impl rule__Petrinet__Group__29
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Petrinet__Group__28__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__28"


    // $ANTLR start "rule__Petrinet__Group__28__Impl"
    // InternalPetrinet2.g:1154:1: rule__Petrinet__Group__28__Impl : ( 'pnml:pnml' ) ;
    public final void rule__Petrinet__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1158:1: ( ( 'pnml:pnml' ) )
            // InternalPetrinet2.g:1159:1: ( 'pnml:pnml' )
            {
            // InternalPetrinet2.g:1159:1: ( 'pnml:pnml' )
            // InternalPetrinet2.g:1160:1: 'pnml:pnml'
            {
             before(grammarAccess.getPetrinetAccess().getPnmlPnmlKeyword_28()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getPnmlPnmlKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__28__Impl"


    // $ANTLR start "rule__Petrinet__Group__29"
    // InternalPetrinet2.g:1173:1: rule__Petrinet__Group__29 : rule__Petrinet__Group__29__Impl ;
    public final void rule__Petrinet__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1177:1: ( rule__Petrinet__Group__29__Impl )
            // InternalPetrinet2.g:1178:2: rule__Petrinet__Group__29__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Petrinet__Group__29__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__29"


    // $ANTLR start "rule__Petrinet__Group__29__Impl"
    // InternalPetrinet2.g:1184:1: rule__Petrinet__Group__29__Impl : ( RULE_GREATER ) ;
    public final void rule__Petrinet__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1188:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:1189:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:1189:1: ( RULE_GREATER )
            // InternalPetrinet2.g:1190:1: RULE_GREATER
            {
             before(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_29()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__Group__29__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalPetrinet2.g:1261:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1265:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalPetrinet2.g:1266:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalPetrinet2.g:1273:1: rule__Transition__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1277:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:1278:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:1278:1: ( RULE_LESS )
            // InternalPetrinet2.g:1279:1: RULE_LESS
            {
             before(grammarAccess.getTransitionAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLESSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalPetrinet2.g:1290:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1294:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalPetrinet2.g:1295:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalPetrinet2.g:1302:1: rule__Transition__Group__1__Impl : ( RULE_TTRANSITION ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1306:1: ( ( RULE_TTRANSITION ) )
            // InternalPetrinet2.g:1307:1: ( RULE_TTRANSITION )
            {
            // InternalPetrinet2.g:1307:1: ( RULE_TTRANSITION )
            // InternalPetrinet2.g:1308:1: RULE_TTRANSITION
            {
             before(grammarAccess.getTransitionAccess().getTTRANSITIONTerminalRuleCall_1()); 
            match(input,RULE_TTRANSITION,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTTRANSITIONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalPetrinet2.g:1319:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1323:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalPetrinet2.g:1324:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalPetrinet2.g:1331:1: rule__Transition__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1335:1: ( ( RULE_ID ) )
            // InternalPetrinet2.g:1336:1: ( RULE_ID )
            {
            // InternalPetrinet2.g:1336:1: ( RULE_ID )
            // InternalPetrinet2.g:1337:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalPetrinet2.g:1348:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1352:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalPetrinet2.g:1353:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalPetrinet2.g:1360:1: rule__Transition__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1364:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:1365:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:1365:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:1366:1: RULE_EQUALS
            {
             before(grammarAccess.getTransitionAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalPetrinet2.g:1377:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1381:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalPetrinet2.g:1382:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalPetrinet2.g:1389:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__NameAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1393:1: ( ( ( rule__Transition__NameAssignment_4 ) ) )
            // InternalPetrinet2.g:1394:1: ( ( rule__Transition__NameAssignment_4 ) )
            {
            // InternalPetrinet2.g:1394:1: ( ( rule__Transition__NameAssignment_4 ) )
            // InternalPetrinet2.g:1395:1: ( rule__Transition__NameAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_4()); 
            // InternalPetrinet2.g:1396:1: ( rule__Transition__NameAssignment_4 )
            // InternalPetrinet2.g:1396:2: rule__Transition__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalPetrinet2.g:1406:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1410:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalPetrinet2.g:1411:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalPetrinet2.g:1418:1: rule__Transition__Group__5__Impl : ( RULE_GREATER ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1422:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:1423:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:1423:1: ( RULE_GREATER )
            // InternalPetrinet2.g:1424:1: RULE_GREATER
            {
             before(grammarAccess.getTransitionAccess().getGREATERTerminalRuleCall_5()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getGREATERTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalPetrinet2.g:1435:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1439:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalPetrinet2.g:1440:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalPetrinet2.g:1447:1: rule__Transition__Group__6__Impl : ( RULE_LESS ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1451:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:1452:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:1452:1: ( RULE_LESS )
            // InternalPetrinet2.g:1453:1: RULE_LESS
            {
             before(grammarAccess.getTransitionAccess().getLESSTerminalRuleCall_6()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLESSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalPetrinet2.g:1464:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1468:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalPetrinet2.g:1469:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalPetrinet2.g:1476:1: rule__Transition__Group__7__Impl : ( RULE_SLASH ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1480:1: ( ( RULE_SLASH ) )
            // InternalPetrinet2.g:1481:1: ( RULE_SLASH )
            {
            // InternalPetrinet2.g:1481:1: ( RULE_SLASH )
            // InternalPetrinet2.g:1482:1: RULE_SLASH
            {
             before(grammarAccess.getTransitionAccess().getSLASHTerminalRuleCall_7()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSLASHTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__8"
    // InternalPetrinet2.g:1493:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1497:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // InternalPetrinet2.g:1498:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Transition__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8"


    // $ANTLR start "rule__Transition__Group__8__Impl"
    // InternalPetrinet2.g:1505:1: rule__Transition__Group__8__Impl : ( RULE_TTRANSITION ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1509:1: ( ( RULE_TTRANSITION ) )
            // InternalPetrinet2.g:1510:1: ( RULE_TTRANSITION )
            {
            // InternalPetrinet2.g:1510:1: ( RULE_TTRANSITION )
            // InternalPetrinet2.g:1511:1: RULE_TTRANSITION
            {
             before(grammarAccess.getTransitionAccess().getTTRANSITIONTerminalRuleCall_8()); 
            match(input,RULE_TTRANSITION,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTTRANSITIONTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__9"
    // InternalPetrinet2.g:1522:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1526:1: ( rule__Transition__Group__9__Impl )
            // InternalPetrinet2.g:1527:2: rule__Transition__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Transition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9"


    // $ANTLR start "rule__Transition__Group__9__Impl"
    // InternalPetrinet2.g:1533:1: rule__Transition__Group__9__Impl : ( RULE_GREATER ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1537:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:1538:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:1538:1: ( RULE_GREATER )
            // InternalPetrinet2.g:1539:1: RULE_GREATER
            {
             before(grammarAccess.getTransitionAccess().getGREATERTerminalRuleCall_9()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getGREATERTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // InternalPetrinet2.g:1570:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1574:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // InternalPetrinet2.g:1575:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // InternalPetrinet2.g:1582:1: rule__Place__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1586:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:1587:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:1587:1: ( RULE_LESS )
            // InternalPetrinet2.g:1588:1: RULE_LESS
            {
             before(grammarAccess.getPlaceAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLESSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // InternalPetrinet2.g:1599:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1603:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // InternalPetrinet2.g:1604:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // InternalPetrinet2.g:1611:1: rule__Place__Group__1__Impl : ( RULE_TPLACE ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1615:1: ( ( RULE_TPLACE ) )
            // InternalPetrinet2.g:1616:1: ( RULE_TPLACE )
            {
            // InternalPetrinet2.g:1616:1: ( RULE_TPLACE )
            // InternalPetrinet2.g:1617:1: RULE_TPLACE
            {
             before(grammarAccess.getPlaceAccess().getTPLACETerminalRuleCall_1()); 
            match(input,RULE_TPLACE,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getTPLACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // InternalPetrinet2.g:1628:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1632:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // InternalPetrinet2.g:1633:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // InternalPetrinet2.g:1640:1: rule__Place__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1644:1: ( ( RULE_ID ) )
            // InternalPetrinet2.g:1645:1: ( RULE_ID )
            {
            // InternalPetrinet2.g:1645:1: ( RULE_ID )
            // InternalPetrinet2.g:1646:1: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // InternalPetrinet2.g:1657:1: rule__Place__Group__3 : rule__Place__Group__3__Impl rule__Place__Group__4 ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1661:1: ( rule__Place__Group__3__Impl rule__Place__Group__4 )
            // InternalPetrinet2.g:1662:2: rule__Place__Group__3__Impl rule__Place__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Place__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // InternalPetrinet2.g:1669:1: rule__Place__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1673:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:1674:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:1674:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:1675:1: RULE_EQUALS
            {
             before(grammarAccess.getPlaceAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Place__Group__4"
    // InternalPetrinet2.g:1686:1: rule__Place__Group__4 : rule__Place__Group__4__Impl rule__Place__Group__5 ;
    public final void rule__Place__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1690:1: ( rule__Place__Group__4__Impl rule__Place__Group__5 )
            // InternalPetrinet2.g:1691:2: rule__Place__Group__4__Impl rule__Place__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Place__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4"


    // $ANTLR start "rule__Place__Group__4__Impl"
    // InternalPetrinet2.g:1698:1: rule__Place__Group__4__Impl : ( ( rule__Place__NameAssignment_4 ) ) ;
    public final void rule__Place__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1702:1: ( ( ( rule__Place__NameAssignment_4 ) ) )
            // InternalPetrinet2.g:1703:1: ( ( rule__Place__NameAssignment_4 ) )
            {
            // InternalPetrinet2.g:1703:1: ( ( rule__Place__NameAssignment_4 ) )
            // InternalPetrinet2.g:1704:1: ( rule__Place__NameAssignment_4 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_4()); 
            // InternalPetrinet2.g:1705:1: ( rule__Place__NameAssignment_4 )
            // InternalPetrinet2.g:1705:2: rule__Place__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__5"
    // InternalPetrinet2.g:1715:1: rule__Place__Group__5 : rule__Place__Group__5__Impl rule__Place__Group__6 ;
    public final void rule__Place__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1719:1: ( rule__Place__Group__5__Impl rule__Place__Group__6 )
            // InternalPetrinet2.g:1720:2: rule__Place__Group__5__Impl rule__Place__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Place__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5"


    // $ANTLR start "rule__Place__Group__5__Impl"
    // InternalPetrinet2.g:1727:1: rule__Place__Group__5__Impl : ( RULE_GREATER ) ;
    public final void rule__Place__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1731:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:1732:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:1732:1: ( RULE_GREATER )
            // InternalPetrinet2.g:1733:1: RULE_GREATER
            {
             before(grammarAccess.getPlaceAccess().getGREATERTerminalRuleCall_5()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getGREATERTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5__Impl"


    // $ANTLR start "rule__Place__Group__6"
    // InternalPetrinet2.g:1744:1: rule__Place__Group__6 : rule__Place__Group__6__Impl rule__Place__Group__7 ;
    public final void rule__Place__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1748:1: ( rule__Place__Group__6__Impl rule__Place__Group__7 )
            // InternalPetrinet2.g:1749:2: rule__Place__Group__6__Impl rule__Place__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Place__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__6"


    // $ANTLR start "rule__Place__Group__6__Impl"
    // InternalPetrinet2.g:1756:1: rule__Place__Group__6__Impl : ( RULE_LESS ) ;
    public final void rule__Place__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1760:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:1761:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:1761:1: ( RULE_LESS )
            // InternalPetrinet2.g:1762:1: RULE_LESS
            {
             before(grammarAccess.getPlaceAccess().getLESSTerminalRuleCall_6()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getLESSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__6__Impl"


    // $ANTLR start "rule__Place__Group__7"
    // InternalPetrinet2.g:1773:1: rule__Place__Group__7 : rule__Place__Group__7__Impl rule__Place__Group__8 ;
    public final void rule__Place__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1777:1: ( rule__Place__Group__7__Impl rule__Place__Group__8 )
            // InternalPetrinet2.g:1778:2: rule__Place__Group__7__Impl rule__Place__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Place__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__7"


    // $ANTLR start "rule__Place__Group__7__Impl"
    // InternalPetrinet2.g:1785:1: rule__Place__Group__7__Impl : ( RULE_SLASH ) ;
    public final void rule__Place__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1789:1: ( ( RULE_SLASH ) )
            // InternalPetrinet2.g:1790:1: ( RULE_SLASH )
            {
            // InternalPetrinet2.g:1790:1: ( RULE_SLASH )
            // InternalPetrinet2.g:1791:1: RULE_SLASH
            {
             before(grammarAccess.getPlaceAccess().getSLASHTerminalRuleCall_7()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getSLASHTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__7__Impl"


    // $ANTLR start "rule__Place__Group__8"
    // InternalPetrinet2.g:1802:1: rule__Place__Group__8 : rule__Place__Group__8__Impl rule__Place__Group__9 ;
    public final void rule__Place__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1806:1: ( rule__Place__Group__8__Impl rule__Place__Group__9 )
            // InternalPetrinet2.g:1807:2: rule__Place__Group__8__Impl rule__Place__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Place__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__8"


    // $ANTLR start "rule__Place__Group__8__Impl"
    // InternalPetrinet2.g:1814:1: rule__Place__Group__8__Impl : ( RULE_TPLACE ) ;
    public final void rule__Place__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1818:1: ( ( RULE_TPLACE ) )
            // InternalPetrinet2.g:1819:1: ( RULE_TPLACE )
            {
            // InternalPetrinet2.g:1819:1: ( RULE_TPLACE )
            // InternalPetrinet2.g:1820:1: RULE_TPLACE
            {
             before(grammarAccess.getPlaceAccess().getTPLACETerminalRuleCall_8()); 
            match(input,RULE_TPLACE,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getTPLACETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__8__Impl"


    // $ANTLR start "rule__Place__Group__9"
    // InternalPetrinet2.g:1831:1: rule__Place__Group__9 : rule__Place__Group__9__Impl ;
    public final void rule__Place__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1835:1: ( rule__Place__Group__9__Impl )
            // InternalPetrinet2.g:1836:2: rule__Place__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Place__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__9"


    // $ANTLR start "rule__Place__Group__9__Impl"
    // InternalPetrinet2.g:1842:1: rule__Place__Group__9__Impl : ( RULE_GREATER ) ;
    public final void rule__Place__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1846:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:1847:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:1847:1: ( RULE_GREATER )
            // InternalPetrinet2.g:1848:1: RULE_GREATER
            {
             before(grammarAccess.getPlaceAccess().getGREATERTerminalRuleCall_9()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getGREATERTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__9__Impl"


    // $ANTLR start "rule__OutputArc__Group__0"
    // InternalPetrinet2.g:1879:1: rule__OutputArc__Group__0 : rule__OutputArc__Group__0__Impl rule__OutputArc__Group__1 ;
    public final void rule__OutputArc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1883:1: ( rule__OutputArc__Group__0__Impl rule__OutputArc__Group__1 )
            // InternalPetrinet2.g:1884:2: rule__OutputArc__Group__0__Impl rule__OutputArc__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__OutputArc__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__0"


    // $ANTLR start "rule__OutputArc__Group__0__Impl"
    // InternalPetrinet2.g:1891:1: rule__OutputArc__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__OutputArc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1895:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:1896:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:1896:1: ( RULE_LESS )
            // InternalPetrinet2.g:1897:1: RULE_LESS
            {
             before(grammarAccess.getOutputArcAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getLESSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__0__Impl"


    // $ANTLR start "rule__OutputArc__Group__1"
    // InternalPetrinet2.g:1908:1: rule__OutputArc__Group__1 : rule__OutputArc__Group__1__Impl rule__OutputArc__Group__2 ;
    public final void rule__OutputArc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1912:1: ( rule__OutputArc__Group__1__Impl rule__OutputArc__Group__2 )
            // InternalPetrinet2.g:1913:2: rule__OutputArc__Group__1__Impl rule__OutputArc__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__OutputArc__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__1"


    // $ANTLR start "rule__OutputArc__Group__1__Impl"
    // InternalPetrinet2.g:1920:1: rule__OutputArc__Group__1__Impl : ( RULE_TOUTPUTARC ) ;
    public final void rule__OutputArc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1924:1: ( ( RULE_TOUTPUTARC ) )
            // InternalPetrinet2.g:1925:1: ( RULE_TOUTPUTARC )
            {
            // InternalPetrinet2.g:1925:1: ( RULE_TOUTPUTARC )
            // InternalPetrinet2.g:1926:1: RULE_TOUTPUTARC
            {
             before(grammarAccess.getOutputArcAccess().getTOUTPUTARCTerminalRuleCall_1()); 
            match(input,RULE_TOUTPUTARC,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getTOUTPUTARCTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__1__Impl"


    // $ANTLR start "rule__OutputArc__Group__2"
    // InternalPetrinet2.g:1937:1: rule__OutputArc__Group__2 : rule__OutputArc__Group__2__Impl rule__OutputArc__Group__3 ;
    public final void rule__OutputArc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1941:1: ( rule__OutputArc__Group__2__Impl rule__OutputArc__Group__3 )
            // InternalPetrinet2.g:1942:2: rule__OutputArc__Group__2__Impl rule__OutputArc__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__OutputArc__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__2"


    // $ANTLR start "rule__OutputArc__Group__2__Impl"
    // InternalPetrinet2.g:1949:1: rule__OutputArc__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__OutputArc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1953:1: ( ( RULE_ID ) )
            // InternalPetrinet2.g:1954:1: ( RULE_ID )
            {
            // InternalPetrinet2.g:1954:1: ( RULE_ID )
            // InternalPetrinet2.g:1955:1: RULE_ID
            {
             before(grammarAccess.getOutputArcAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__2__Impl"


    // $ANTLR start "rule__OutputArc__Group__3"
    // InternalPetrinet2.g:1966:1: rule__OutputArc__Group__3 : rule__OutputArc__Group__3__Impl rule__OutputArc__Group__4 ;
    public final void rule__OutputArc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1970:1: ( rule__OutputArc__Group__3__Impl rule__OutputArc__Group__4 )
            // InternalPetrinet2.g:1971:2: rule__OutputArc__Group__3__Impl rule__OutputArc__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__OutputArc__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__3"


    // $ANTLR start "rule__OutputArc__Group__3__Impl"
    // InternalPetrinet2.g:1978:1: rule__OutputArc__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__OutputArc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1982:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:1983:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:1983:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:1984:1: RULE_EQUALS
            {
             before(grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__3__Impl"


    // $ANTLR start "rule__OutputArc__Group__4"
    // InternalPetrinet2.g:1995:1: rule__OutputArc__Group__4 : rule__OutputArc__Group__4__Impl rule__OutputArc__Group__5 ;
    public final void rule__OutputArc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:1999:1: ( rule__OutputArc__Group__4__Impl rule__OutputArc__Group__5 )
            // InternalPetrinet2.g:2000:2: rule__OutputArc__Group__4__Impl rule__OutputArc__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__OutputArc__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__4"


    // $ANTLR start "rule__OutputArc__Group__4__Impl"
    // InternalPetrinet2.g:2007:1: rule__OutputArc__Group__4__Impl : ( ( rule__OutputArc__NameAssignment_4 ) ) ;
    public final void rule__OutputArc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2011:1: ( ( ( rule__OutputArc__NameAssignment_4 ) ) )
            // InternalPetrinet2.g:2012:1: ( ( rule__OutputArc__NameAssignment_4 ) )
            {
            // InternalPetrinet2.g:2012:1: ( ( rule__OutputArc__NameAssignment_4 ) )
            // InternalPetrinet2.g:2013:1: ( rule__OutputArc__NameAssignment_4 )
            {
             before(grammarAccess.getOutputArcAccess().getNameAssignment_4()); 
            // InternalPetrinet2.g:2014:1: ( rule__OutputArc__NameAssignment_4 )
            // InternalPetrinet2.g:2014:2: rule__OutputArc__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOutputArcAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__4__Impl"


    // $ANTLR start "rule__OutputArc__Group__5"
    // InternalPetrinet2.g:2024:1: rule__OutputArc__Group__5 : rule__OutputArc__Group__5__Impl rule__OutputArc__Group__6 ;
    public final void rule__OutputArc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2028:1: ( rule__OutputArc__Group__5__Impl rule__OutputArc__Group__6 )
            // InternalPetrinet2.g:2029:2: rule__OutputArc__Group__5__Impl rule__OutputArc__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__OutputArc__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__5"


    // $ANTLR start "rule__OutputArc__Group__5__Impl"
    // InternalPetrinet2.g:2036:1: rule__OutputArc__Group__5__Impl : ( 'target' ) ;
    public final void rule__OutputArc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2040:1: ( ( 'target' ) )
            // InternalPetrinet2.g:2041:1: ( 'target' )
            {
            // InternalPetrinet2.g:2041:1: ( 'target' )
            // InternalPetrinet2.g:2042:1: 'target'
            {
             before(grammarAccess.getOutputArcAccess().getTargetKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__5__Impl"


    // $ANTLR start "rule__OutputArc__Group__6"
    // InternalPetrinet2.g:2055:1: rule__OutputArc__Group__6 : rule__OutputArc__Group__6__Impl rule__OutputArc__Group__7 ;
    public final void rule__OutputArc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2059:1: ( rule__OutputArc__Group__6__Impl rule__OutputArc__Group__7 )
            // InternalPetrinet2.g:2060:2: rule__OutputArc__Group__6__Impl rule__OutputArc__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__OutputArc__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__6"


    // $ANTLR start "rule__OutputArc__Group__6__Impl"
    // InternalPetrinet2.g:2067:1: rule__OutputArc__Group__6__Impl : ( RULE_EQUALS ) ;
    public final void rule__OutputArc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2071:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:2072:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:2072:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:2073:1: RULE_EQUALS
            {
             before(grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_6()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__6__Impl"


    // $ANTLR start "rule__OutputArc__Group__7"
    // InternalPetrinet2.g:2084:1: rule__OutputArc__Group__7 : rule__OutputArc__Group__7__Impl rule__OutputArc__Group__8 ;
    public final void rule__OutputArc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2088:1: ( rule__OutputArc__Group__7__Impl rule__OutputArc__Group__8 )
            // InternalPetrinet2.g:2089:2: rule__OutputArc__Group__7__Impl rule__OutputArc__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__OutputArc__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__7"


    // $ANTLR start "rule__OutputArc__Group__7__Impl"
    // InternalPetrinet2.g:2096:1: rule__OutputArc__Group__7__Impl : ( ( rule__OutputArc__ToAssignment_7 ) ) ;
    public final void rule__OutputArc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2100:1: ( ( ( rule__OutputArc__ToAssignment_7 ) ) )
            // InternalPetrinet2.g:2101:1: ( ( rule__OutputArc__ToAssignment_7 ) )
            {
            // InternalPetrinet2.g:2101:1: ( ( rule__OutputArc__ToAssignment_7 ) )
            // InternalPetrinet2.g:2102:1: ( rule__OutputArc__ToAssignment_7 )
            {
             before(grammarAccess.getOutputArcAccess().getToAssignment_7()); 
            // InternalPetrinet2.g:2103:1: ( rule__OutputArc__ToAssignment_7 )
            // InternalPetrinet2.g:2103:2: rule__OutputArc__ToAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__ToAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOutputArcAccess().getToAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__7__Impl"


    // $ANTLR start "rule__OutputArc__Group__8"
    // InternalPetrinet2.g:2113:1: rule__OutputArc__Group__8 : rule__OutputArc__Group__8__Impl rule__OutputArc__Group__9 ;
    public final void rule__OutputArc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2117:1: ( rule__OutputArc__Group__8__Impl rule__OutputArc__Group__9 )
            // InternalPetrinet2.g:2118:2: rule__OutputArc__Group__8__Impl rule__OutputArc__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__OutputArc__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__8"


    // $ANTLR start "rule__OutputArc__Group__8__Impl"
    // InternalPetrinet2.g:2125:1: rule__OutputArc__Group__8__Impl : ( 'source' ) ;
    public final void rule__OutputArc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2129:1: ( ( 'source' ) )
            // InternalPetrinet2.g:2130:1: ( 'source' )
            {
            // InternalPetrinet2.g:2130:1: ( 'source' )
            // InternalPetrinet2.g:2131:1: 'source'
            {
             before(grammarAccess.getOutputArcAccess().getSourceKeyword_8()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getSourceKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__8__Impl"


    // $ANTLR start "rule__OutputArc__Group__9"
    // InternalPetrinet2.g:2144:1: rule__OutputArc__Group__9 : rule__OutputArc__Group__9__Impl rule__OutputArc__Group__10 ;
    public final void rule__OutputArc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2148:1: ( rule__OutputArc__Group__9__Impl rule__OutputArc__Group__10 )
            // InternalPetrinet2.g:2149:2: rule__OutputArc__Group__9__Impl rule__OutputArc__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__OutputArc__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__9"


    // $ANTLR start "rule__OutputArc__Group__9__Impl"
    // InternalPetrinet2.g:2156:1: rule__OutputArc__Group__9__Impl : ( RULE_EQUALS ) ;
    public final void rule__OutputArc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2160:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:2161:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:2161:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:2162:1: RULE_EQUALS
            {
             before(grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_9()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__9__Impl"


    // $ANTLR start "rule__OutputArc__Group__10"
    // InternalPetrinet2.g:2173:1: rule__OutputArc__Group__10 : rule__OutputArc__Group__10__Impl rule__OutputArc__Group__11 ;
    public final void rule__OutputArc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2177:1: ( rule__OutputArc__Group__10__Impl rule__OutputArc__Group__11 )
            // InternalPetrinet2.g:2178:2: rule__OutputArc__Group__10__Impl rule__OutputArc__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__OutputArc__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__10"


    // $ANTLR start "rule__OutputArc__Group__10__Impl"
    // InternalPetrinet2.g:2185:1: rule__OutputArc__Group__10__Impl : ( ( rule__OutputArc__FromAssignment_10 ) ) ;
    public final void rule__OutputArc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2189:1: ( ( ( rule__OutputArc__FromAssignment_10 ) ) )
            // InternalPetrinet2.g:2190:1: ( ( rule__OutputArc__FromAssignment_10 ) )
            {
            // InternalPetrinet2.g:2190:1: ( ( rule__OutputArc__FromAssignment_10 ) )
            // InternalPetrinet2.g:2191:1: ( rule__OutputArc__FromAssignment_10 )
            {
             before(grammarAccess.getOutputArcAccess().getFromAssignment_10()); 
            // InternalPetrinet2.g:2192:1: ( rule__OutputArc__FromAssignment_10 )
            // InternalPetrinet2.g:2192:2: rule__OutputArc__FromAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__FromAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getOutputArcAccess().getFromAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__10__Impl"


    // $ANTLR start "rule__OutputArc__Group__11"
    // InternalPetrinet2.g:2202:1: rule__OutputArc__Group__11 : rule__OutputArc__Group__11__Impl rule__OutputArc__Group__12 ;
    public final void rule__OutputArc__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2206:1: ( rule__OutputArc__Group__11__Impl rule__OutputArc__Group__12 )
            // InternalPetrinet2.g:2207:2: rule__OutputArc__Group__11__Impl rule__OutputArc__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__OutputArc__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__11"


    // $ANTLR start "rule__OutputArc__Group__11__Impl"
    // InternalPetrinet2.g:2214:1: rule__OutputArc__Group__11__Impl : ( RULE_GREATER ) ;
    public final void rule__OutputArc__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2218:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:2219:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:2219:1: ( RULE_GREATER )
            // InternalPetrinet2.g:2220:1: RULE_GREATER
            {
             before(grammarAccess.getOutputArcAccess().getGREATERTerminalRuleCall_11()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getGREATERTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__11__Impl"


    // $ANTLR start "rule__OutputArc__Group__12"
    // InternalPetrinet2.g:2231:1: rule__OutputArc__Group__12 : rule__OutputArc__Group__12__Impl rule__OutputArc__Group__13 ;
    public final void rule__OutputArc__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2235:1: ( rule__OutputArc__Group__12__Impl rule__OutputArc__Group__13 )
            // InternalPetrinet2.g:2236:2: rule__OutputArc__Group__12__Impl rule__OutputArc__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__OutputArc__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__12"


    // $ANTLR start "rule__OutputArc__Group__12__Impl"
    // InternalPetrinet2.g:2243:1: rule__OutputArc__Group__12__Impl : ( RULE_LESS ) ;
    public final void rule__OutputArc__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2247:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:2248:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:2248:1: ( RULE_LESS )
            // InternalPetrinet2.g:2249:1: RULE_LESS
            {
             before(grammarAccess.getOutputArcAccess().getLESSTerminalRuleCall_12()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getLESSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__12__Impl"


    // $ANTLR start "rule__OutputArc__Group__13"
    // InternalPetrinet2.g:2260:1: rule__OutputArc__Group__13 : rule__OutputArc__Group__13__Impl rule__OutputArc__Group__14 ;
    public final void rule__OutputArc__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2264:1: ( rule__OutputArc__Group__13__Impl rule__OutputArc__Group__14 )
            // InternalPetrinet2.g:2265:2: rule__OutputArc__Group__13__Impl rule__OutputArc__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__OutputArc__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__13"


    // $ANTLR start "rule__OutputArc__Group__13__Impl"
    // InternalPetrinet2.g:2272:1: rule__OutputArc__Group__13__Impl : ( RULE_SLASH ) ;
    public final void rule__OutputArc__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2276:1: ( ( RULE_SLASH ) )
            // InternalPetrinet2.g:2277:1: ( RULE_SLASH )
            {
            // InternalPetrinet2.g:2277:1: ( RULE_SLASH )
            // InternalPetrinet2.g:2278:1: RULE_SLASH
            {
             before(grammarAccess.getOutputArcAccess().getSLASHTerminalRuleCall_13()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getSLASHTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__13__Impl"


    // $ANTLR start "rule__OutputArc__Group__14"
    // InternalPetrinet2.g:2289:1: rule__OutputArc__Group__14 : rule__OutputArc__Group__14__Impl rule__OutputArc__Group__15 ;
    public final void rule__OutputArc__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2293:1: ( rule__OutputArc__Group__14__Impl rule__OutputArc__Group__15 )
            // InternalPetrinet2.g:2294:2: rule__OutputArc__Group__14__Impl rule__OutputArc__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__OutputArc__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__14"


    // $ANTLR start "rule__OutputArc__Group__14__Impl"
    // InternalPetrinet2.g:2301:1: rule__OutputArc__Group__14__Impl : ( RULE_TOUTPUTARC ) ;
    public final void rule__OutputArc__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2305:1: ( ( RULE_TOUTPUTARC ) )
            // InternalPetrinet2.g:2306:1: ( RULE_TOUTPUTARC )
            {
            // InternalPetrinet2.g:2306:1: ( RULE_TOUTPUTARC )
            // InternalPetrinet2.g:2307:1: RULE_TOUTPUTARC
            {
             before(grammarAccess.getOutputArcAccess().getTOUTPUTARCTerminalRuleCall_14()); 
            match(input,RULE_TOUTPUTARC,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getTOUTPUTARCTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__14__Impl"


    // $ANTLR start "rule__OutputArc__Group__15"
    // InternalPetrinet2.g:2318:1: rule__OutputArc__Group__15 : rule__OutputArc__Group__15__Impl ;
    public final void rule__OutputArc__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2322:1: ( rule__OutputArc__Group__15__Impl )
            // InternalPetrinet2.g:2323:2: rule__OutputArc__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OutputArc__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__15"


    // $ANTLR start "rule__OutputArc__Group__15__Impl"
    // InternalPetrinet2.g:2329:1: rule__OutputArc__Group__15__Impl : ( RULE_GREATER ) ;
    public final void rule__OutputArc__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2333:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:2334:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:2334:1: ( RULE_GREATER )
            // InternalPetrinet2.g:2335:1: RULE_GREATER
            {
             before(grammarAccess.getOutputArcAccess().getGREATERTerminalRuleCall_15()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getGREATERTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__Group__15__Impl"


    // $ANTLR start "rule__InputArc__Group__0"
    // InternalPetrinet2.g:2378:1: rule__InputArc__Group__0 : rule__InputArc__Group__0__Impl rule__InputArc__Group__1 ;
    public final void rule__InputArc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2382:1: ( rule__InputArc__Group__0__Impl rule__InputArc__Group__1 )
            // InternalPetrinet2.g:2383:2: rule__InputArc__Group__0__Impl rule__InputArc__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__InputArc__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__0"


    // $ANTLR start "rule__InputArc__Group__0__Impl"
    // InternalPetrinet2.g:2390:1: rule__InputArc__Group__0__Impl : ( RULE_LESS ) ;
    public final void rule__InputArc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2394:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:2395:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:2395:1: ( RULE_LESS )
            // InternalPetrinet2.g:2396:1: RULE_LESS
            {
             before(grammarAccess.getInputArcAccess().getLESSTerminalRuleCall_0()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getLESSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__0__Impl"


    // $ANTLR start "rule__InputArc__Group__1"
    // InternalPetrinet2.g:2407:1: rule__InputArc__Group__1 : rule__InputArc__Group__1__Impl rule__InputArc__Group__2 ;
    public final void rule__InputArc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2411:1: ( rule__InputArc__Group__1__Impl rule__InputArc__Group__2 )
            // InternalPetrinet2.g:2412:2: rule__InputArc__Group__1__Impl rule__InputArc__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__InputArc__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__1"


    // $ANTLR start "rule__InputArc__Group__1__Impl"
    // InternalPetrinet2.g:2419:1: rule__InputArc__Group__1__Impl : ( RULE_TINPUTARC ) ;
    public final void rule__InputArc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2423:1: ( ( RULE_TINPUTARC ) )
            // InternalPetrinet2.g:2424:1: ( RULE_TINPUTARC )
            {
            // InternalPetrinet2.g:2424:1: ( RULE_TINPUTARC )
            // InternalPetrinet2.g:2425:1: RULE_TINPUTARC
            {
             before(grammarAccess.getInputArcAccess().getTINPUTARCTerminalRuleCall_1()); 
            match(input,RULE_TINPUTARC,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getTINPUTARCTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__1__Impl"


    // $ANTLR start "rule__InputArc__Group__2"
    // InternalPetrinet2.g:2436:1: rule__InputArc__Group__2 : rule__InputArc__Group__2__Impl rule__InputArc__Group__3 ;
    public final void rule__InputArc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2440:1: ( rule__InputArc__Group__2__Impl rule__InputArc__Group__3 )
            // InternalPetrinet2.g:2441:2: rule__InputArc__Group__2__Impl rule__InputArc__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__InputArc__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__2"


    // $ANTLR start "rule__InputArc__Group__2__Impl"
    // InternalPetrinet2.g:2448:1: rule__InputArc__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__InputArc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2452:1: ( ( RULE_ID ) )
            // InternalPetrinet2.g:2453:1: ( RULE_ID )
            {
            // InternalPetrinet2.g:2453:1: ( RULE_ID )
            // InternalPetrinet2.g:2454:1: RULE_ID
            {
             before(grammarAccess.getInputArcAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__2__Impl"


    // $ANTLR start "rule__InputArc__Group__3"
    // InternalPetrinet2.g:2465:1: rule__InputArc__Group__3 : rule__InputArc__Group__3__Impl rule__InputArc__Group__4 ;
    public final void rule__InputArc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2469:1: ( rule__InputArc__Group__3__Impl rule__InputArc__Group__4 )
            // InternalPetrinet2.g:2470:2: rule__InputArc__Group__3__Impl rule__InputArc__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InputArc__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__3"


    // $ANTLR start "rule__InputArc__Group__3__Impl"
    // InternalPetrinet2.g:2477:1: rule__InputArc__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__InputArc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2481:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:2482:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:2482:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:2483:1: RULE_EQUALS
            {
             before(grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__3__Impl"


    // $ANTLR start "rule__InputArc__Group__4"
    // InternalPetrinet2.g:2494:1: rule__InputArc__Group__4 : rule__InputArc__Group__4__Impl rule__InputArc__Group__5 ;
    public final void rule__InputArc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2498:1: ( rule__InputArc__Group__4__Impl rule__InputArc__Group__5 )
            // InternalPetrinet2.g:2499:2: rule__InputArc__Group__4__Impl rule__InputArc__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__InputArc__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__4"


    // $ANTLR start "rule__InputArc__Group__4__Impl"
    // InternalPetrinet2.g:2506:1: rule__InputArc__Group__4__Impl : ( ( rule__InputArc__NameAssignment_4 ) ) ;
    public final void rule__InputArc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2510:1: ( ( ( rule__InputArc__NameAssignment_4 ) ) )
            // InternalPetrinet2.g:2511:1: ( ( rule__InputArc__NameAssignment_4 ) )
            {
            // InternalPetrinet2.g:2511:1: ( ( rule__InputArc__NameAssignment_4 ) )
            // InternalPetrinet2.g:2512:1: ( rule__InputArc__NameAssignment_4 )
            {
             before(grammarAccess.getInputArcAccess().getNameAssignment_4()); 
            // InternalPetrinet2.g:2513:1: ( rule__InputArc__NameAssignment_4 )
            // InternalPetrinet2.g:2513:2: rule__InputArc__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputArcAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__4__Impl"


    // $ANTLR start "rule__InputArc__Group__5"
    // InternalPetrinet2.g:2523:1: rule__InputArc__Group__5 : rule__InputArc__Group__5__Impl rule__InputArc__Group__6 ;
    public final void rule__InputArc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2527:1: ( rule__InputArc__Group__5__Impl rule__InputArc__Group__6 )
            // InternalPetrinet2.g:2528:2: rule__InputArc__Group__5__Impl rule__InputArc__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__InputArc__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__5"


    // $ANTLR start "rule__InputArc__Group__5__Impl"
    // InternalPetrinet2.g:2535:1: rule__InputArc__Group__5__Impl : ( 'target' ) ;
    public final void rule__InputArc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2539:1: ( ( 'target' ) )
            // InternalPetrinet2.g:2540:1: ( 'target' )
            {
            // InternalPetrinet2.g:2540:1: ( 'target' )
            // InternalPetrinet2.g:2541:1: 'target'
            {
             before(grammarAccess.getInputArcAccess().getTargetKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__5__Impl"


    // $ANTLR start "rule__InputArc__Group__6"
    // InternalPetrinet2.g:2554:1: rule__InputArc__Group__6 : rule__InputArc__Group__6__Impl rule__InputArc__Group__7 ;
    public final void rule__InputArc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2558:1: ( rule__InputArc__Group__6__Impl rule__InputArc__Group__7 )
            // InternalPetrinet2.g:2559:2: rule__InputArc__Group__6__Impl rule__InputArc__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InputArc__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__6"


    // $ANTLR start "rule__InputArc__Group__6__Impl"
    // InternalPetrinet2.g:2566:1: rule__InputArc__Group__6__Impl : ( RULE_EQUALS ) ;
    public final void rule__InputArc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2570:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:2571:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:2571:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:2572:1: RULE_EQUALS
            {
             before(grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_6()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__6__Impl"


    // $ANTLR start "rule__InputArc__Group__7"
    // InternalPetrinet2.g:2583:1: rule__InputArc__Group__7 : rule__InputArc__Group__7__Impl rule__InputArc__Group__8 ;
    public final void rule__InputArc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2587:1: ( rule__InputArc__Group__7__Impl rule__InputArc__Group__8 )
            // InternalPetrinet2.g:2588:2: rule__InputArc__Group__7__Impl rule__InputArc__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__InputArc__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__7"


    // $ANTLR start "rule__InputArc__Group__7__Impl"
    // InternalPetrinet2.g:2595:1: rule__InputArc__Group__7__Impl : ( ( rule__InputArc__ToAssignment_7 ) ) ;
    public final void rule__InputArc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2599:1: ( ( ( rule__InputArc__ToAssignment_7 ) ) )
            // InternalPetrinet2.g:2600:1: ( ( rule__InputArc__ToAssignment_7 ) )
            {
            // InternalPetrinet2.g:2600:1: ( ( rule__InputArc__ToAssignment_7 ) )
            // InternalPetrinet2.g:2601:1: ( rule__InputArc__ToAssignment_7 )
            {
             before(grammarAccess.getInputArcAccess().getToAssignment_7()); 
            // InternalPetrinet2.g:2602:1: ( rule__InputArc__ToAssignment_7 )
            // InternalPetrinet2.g:2602:2: rule__InputArc__ToAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__ToAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInputArcAccess().getToAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__7__Impl"


    // $ANTLR start "rule__InputArc__Group__8"
    // InternalPetrinet2.g:2612:1: rule__InputArc__Group__8 : rule__InputArc__Group__8__Impl rule__InputArc__Group__9 ;
    public final void rule__InputArc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2616:1: ( rule__InputArc__Group__8__Impl rule__InputArc__Group__9 )
            // InternalPetrinet2.g:2617:2: rule__InputArc__Group__8__Impl rule__InputArc__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__InputArc__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__8"


    // $ANTLR start "rule__InputArc__Group__8__Impl"
    // InternalPetrinet2.g:2624:1: rule__InputArc__Group__8__Impl : ( 'source' ) ;
    public final void rule__InputArc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2628:1: ( ( 'source' ) )
            // InternalPetrinet2.g:2629:1: ( 'source' )
            {
            // InternalPetrinet2.g:2629:1: ( 'source' )
            // InternalPetrinet2.g:2630:1: 'source'
            {
             before(grammarAccess.getInputArcAccess().getSourceKeyword_8()); 
            match(input,31,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getSourceKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__8__Impl"


    // $ANTLR start "rule__InputArc__Group__9"
    // InternalPetrinet2.g:2643:1: rule__InputArc__Group__9 : rule__InputArc__Group__9__Impl rule__InputArc__Group__10 ;
    public final void rule__InputArc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2647:1: ( rule__InputArc__Group__9__Impl rule__InputArc__Group__10 )
            // InternalPetrinet2.g:2648:2: rule__InputArc__Group__9__Impl rule__InputArc__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__InputArc__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__9"


    // $ANTLR start "rule__InputArc__Group__9__Impl"
    // InternalPetrinet2.g:2655:1: rule__InputArc__Group__9__Impl : ( RULE_EQUALS ) ;
    public final void rule__InputArc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2659:1: ( ( RULE_EQUALS ) )
            // InternalPetrinet2.g:2660:1: ( RULE_EQUALS )
            {
            // InternalPetrinet2.g:2660:1: ( RULE_EQUALS )
            // InternalPetrinet2.g:2661:1: RULE_EQUALS
            {
             before(grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_9()); 
            match(input,RULE_EQUALS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__9__Impl"


    // $ANTLR start "rule__InputArc__Group__10"
    // InternalPetrinet2.g:2672:1: rule__InputArc__Group__10 : rule__InputArc__Group__10__Impl rule__InputArc__Group__11 ;
    public final void rule__InputArc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2676:1: ( rule__InputArc__Group__10__Impl rule__InputArc__Group__11 )
            // InternalPetrinet2.g:2677:2: rule__InputArc__Group__10__Impl rule__InputArc__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__InputArc__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__10"


    // $ANTLR start "rule__InputArc__Group__10__Impl"
    // InternalPetrinet2.g:2684:1: rule__InputArc__Group__10__Impl : ( ( rule__InputArc__FromAssignment_10 ) ) ;
    public final void rule__InputArc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2688:1: ( ( ( rule__InputArc__FromAssignment_10 ) ) )
            // InternalPetrinet2.g:2689:1: ( ( rule__InputArc__FromAssignment_10 ) )
            {
            // InternalPetrinet2.g:2689:1: ( ( rule__InputArc__FromAssignment_10 ) )
            // InternalPetrinet2.g:2690:1: ( rule__InputArc__FromAssignment_10 )
            {
             before(grammarAccess.getInputArcAccess().getFromAssignment_10()); 
            // InternalPetrinet2.g:2691:1: ( rule__InputArc__FromAssignment_10 )
            // InternalPetrinet2.g:2691:2: rule__InputArc__FromAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__FromAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInputArcAccess().getFromAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__10__Impl"


    // $ANTLR start "rule__InputArc__Group__11"
    // InternalPetrinet2.g:2701:1: rule__InputArc__Group__11 : rule__InputArc__Group__11__Impl rule__InputArc__Group__12 ;
    public final void rule__InputArc__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2705:1: ( rule__InputArc__Group__11__Impl rule__InputArc__Group__12 )
            // InternalPetrinet2.g:2706:2: rule__InputArc__Group__11__Impl rule__InputArc__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__InputArc__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__11"


    // $ANTLR start "rule__InputArc__Group__11__Impl"
    // InternalPetrinet2.g:2713:1: rule__InputArc__Group__11__Impl : ( RULE_GREATER ) ;
    public final void rule__InputArc__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2717:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:2718:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:2718:1: ( RULE_GREATER )
            // InternalPetrinet2.g:2719:1: RULE_GREATER
            {
             before(grammarAccess.getInputArcAccess().getGREATERTerminalRuleCall_11()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getGREATERTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__11__Impl"


    // $ANTLR start "rule__InputArc__Group__12"
    // InternalPetrinet2.g:2730:1: rule__InputArc__Group__12 : rule__InputArc__Group__12__Impl rule__InputArc__Group__13 ;
    public final void rule__InputArc__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2734:1: ( rule__InputArc__Group__12__Impl rule__InputArc__Group__13 )
            // InternalPetrinet2.g:2735:2: rule__InputArc__Group__12__Impl rule__InputArc__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__InputArc__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__12"


    // $ANTLR start "rule__InputArc__Group__12__Impl"
    // InternalPetrinet2.g:2742:1: rule__InputArc__Group__12__Impl : ( RULE_LESS ) ;
    public final void rule__InputArc__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2746:1: ( ( RULE_LESS ) )
            // InternalPetrinet2.g:2747:1: ( RULE_LESS )
            {
            // InternalPetrinet2.g:2747:1: ( RULE_LESS )
            // InternalPetrinet2.g:2748:1: RULE_LESS
            {
             before(grammarAccess.getInputArcAccess().getLESSTerminalRuleCall_12()); 
            match(input,RULE_LESS,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getLESSTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__12__Impl"


    // $ANTLR start "rule__InputArc__Group__13"
    // InternalPetrinet2.g:2759:1: rule__InputArc__Group__13 : rule__InputArc__Group__13__Impl rule__InputArc__Group__14 ;
    public final void rule__InputArc__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2763:1: ( rule__InputArc__Group__13__Impl rule__InputArc__Group__14 )
            // InternalPetrinet2.g:2764:2: rule__InputArc__Group__13__Impl rule__InputArc__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__InputArc__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__13"


    // $ANTLR start "rule__InputArc__Group__13__Impl"
    // InternalPetrinet2.g:2771:1: rule__InputArc__Group__13__Impl : ( RULE_SLASH ) ;
    public final void rule__InputArc__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2775:1: ( ( RULE_SLASH ) )
            // InternalPetrinet2.g:2776:1: ( RULE_SLASH )
            {
            // InternalPetrinet2.g:2776:1: ( RULE_SLASH )
            // InternalPetrinet2.g:2777:1: RULE_SLASH
            {
             before(grammarAccess.getInputArcAccess().getSLASHTerminalRuleCall_13()); 
            match(input,RULE_SLASH,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getSLASHTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__13__Impl"


    // $ANTLR start "rule__InputArc__Group__14"
    // InternalPetrinet2.g:2788:1: rule__InputArc__Group__14 : rule__InputArc__Group__14__Impl rule__InputArc__Group__15 ;
    public final void rule__InputArc__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2792:1: ( rule__InputArc__Group__14__Impl rule__InputArc__Group__15 )
            // InternalPetrinet2.g:2793:2: rule__InputArc__Group__14__Impl rule__InputArc__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__InputArc__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__14"


    // $ANTLR start "rule__InputArc__Group__14__Impl"
    // InternalPetrinet2.g:2800:1: rule__InputArc__Group__14__Impl : ( RULE_TINPUTARC ) ;
    public final void rule__InputArc__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2804:1: ( ( RULE_TINPUTARC ) )
            // InternalPetrinet2.g:2805:1: ( RULE_TINPUTARC )
            {
            // InternalPetrinet2.g:2805:1: ( RULE_TINPUTARC )
            // InternalPetrinet2.g:2806:1: RULE_TINPUTARC
            {
             before(grammarAccess.getInputArcAccess().getTINPUTARCTerminalRuleCall_14()); 
            match(input,RULE_TINPUTARC,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getTINPUTARCTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__14__Impl"


    // $ANTLR start "rule__InputArc__Group__15"
    // InternalPetrinet2.g:2817:1: rule__InputArc__Group__15 : rule__InputArc__Group__15__Impl ;
    public final void rule__InputArc__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2821:1: ( rule__InputArc__Group__15__Impl )
            // InternalPetrinet2.g:2822:2: rule__InputArc__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InputArc__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__15"


    // $ANTLR start "rule__InputArc__Group__15__Impl"
    // InternalPetrinet2.g:2828:1: rule__InputArc__Group__15__Impl : ( RULE_GREATER ) ;
    public final void rule__InputArc__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2832:1: ( ( RULE_GREATER ) )
            // InternalPetrinet2.g:2833:1: ( RULE_GREATER )
            {
            // InternalPetrinet2.g:2833:1: ( RULE_GREATER )
            // InternalPetrinet2.g:2834:1: RULE_GREATER
            {
             before(grammarAccess.getInputArcAccess().getGREATERTerminalRuleCall_15()); 
            match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getGREATERTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__Group__15__Impl"


    // $ANTLR start "rule__Petrinet__ElementsAssignment_21"
    // InternalPetrinet2.g:2878:1: rule__Petrinet__ElementsAssignment_21 : ( ruleElement ) ;
    public final void rule__Petrinet__ElementsAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2882:1: ( ( ruleElement ) )
            // InternalPetrinet2.g:2883:1: ( ruleElement )
            {
            // InternalPetrinet2.g:2883:1: ( ruleElement )
            // InternalPetrinet2.g:2884:1: ruleElement
            {
             before(grammarAccess.getPetrinetAccess().getElementsElementParserRuleCall_21_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPetrinetAccess().getElementsElementParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Petrinet__ElementsAssignment_21"


    // $ANTLR start "rule__Transition__NameAssignment_4"
    // InternalPetrinet2.g:2893:1: rule__Transition__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Transition__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2897:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:2898:1: ( RULE_STRING )
            {
            // InternalPetrinet2.g:2898:1: ( RULE_STRING )
            // InternalPetrinet2.g:2899:1: RULE_STRING
            {
             before(grammarAccess.getTransitionAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_4"


    // $ANTLR start "rule__Place__NameAssignment_4"
    // InternalPetrinet2.g:2908:1: rule__Place__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Place__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2912:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:2913:1: ( RULE_STRING )
            {
            // InternalPetrinet2.g:2913:1: ( RULE_STRING )
            // InternalPetrinet2.g:2914:1: RULE_STRING
            {
             before(grammarAccess.getPlaceAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPlaceAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_4"


    // $ANTLR start "rule__OutputArc__NameAssignment_4"
    // InternalPetrinet2.g:2923:1: rule__OutputArc__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__OutputArc__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2927:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:2928:1: ( RULE_STRING )
            {
            // InternalPetrinet2.g:2928:1: ( RULE_STRING )
            // InternalPetrinet2.g:2929:1: RULE_STRING
            {
             before(grammarAccess.getOutputArcAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__NameAssignment_4"


    // $ANTLR start "rule__OutputArc__ToAssignment_7"
    // InternalPetrinet2.g:2938:1: rule__OutputArc__ToAssignment_7 : ( ( RULE_STRING ) ) ;
    public final void rule__OutputArc__ToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2942:1: ( ( ( RULE_STRING ) ) )
            // InternalPetrinet2.g:2943:1: ( ( RULE_STRING ) )
            {
            // InternalPetrinet2.g:2943:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:2944:1: ( RULE_STRING )
            {
             before(grammarAccess.getOutputArcAccess().getToNodeCrossReference_7_0()); 
            // InternalPetrinet2.g:2945:1: ( RULE_STRING )
            // InternalPetrinet2.g:2946:1: RULE_STRING
            {
             before(grammarAccess.getOutputArcAccess().getToNodeSTRINGTerminalRuleCall_7_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getToNodeSTRINGTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getOutputArcAccess().getToNodeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__ToAssignment_7"


    // $ANTLR start "rule__OutputArc__FromAssignment_10"
    // InternalPetrinet2.g:2957:1: rule__OutputArc__FromAssignment_10 : ( ( RULE_STRING ) ) ;
    public final void rule__OutputArc__FromAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2961:1: ( ( ( RULE_STRING ) ) )
            // InternalPetrinet2.g:2962:1: ( ( RULE_STRING ) )
            {
            // InternalPetrinet2.g:2962:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:2963:1: ( RULE_STRING )
            {
             before(grammarAccess.getOutputArcAccess().getFromNodeCrossReference_10_0()); 
            // InternalPetrinet2.g:2964:1: ( RULE_STRING )
            // InternalPetrinet2.g:2965:1: RULE_STRING
            {
             before(grammarAccess.getOutputArcAccess().getFromNodeSTRINGTerminalRuleCall_10_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOutputArcAccess().getFromNodeSTRINGTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getOutputArcAccess().getFromNodeCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputArc__FromAssignment_10"


    // $ANTLR start "rule__InputArc__NameAssignment_4"
    // InternalPetrinet2.g:2976:1: rule__InputArc__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__InputArc__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2980:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:2981:1: ( RULE_STRING )
            {
            // InternalPetrinet2.g:2981:1: ( RULE_STRING )
            // InternalPetrinet2.g:2982:1: RULE_STRING
            {
             before(grammarAccess.getInputArcAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__NameAssignment_4"


    // $ANTLR start "rule__InputArc__ToAssignment_7"
    // InternalPetrinet2.g:2991:1: rule__InputArc__ToAssignment_7 : ( ( RULE_STRING ) ) ;
    public final void rule__InputArc__ToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:2995:1: ( ( ( RULE_STRING ) ) )
            // InternalPetrinet2.g:2996:1: ( ( RULE_STRING ) )
            {
            // InternalPetrinet2.g:2996:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:2997:1: ( RULE_STRING )
            {
             before(grammarAccess.getInputArcAccess().getToNodeCrossReference_7_0()); 
            // InternalPetrinet2.g:2998:1: ( RULE_STRING )
            // InternalPetrinet2.g:2999:1: RULE_STRING
            {
             before(grammarAccess.getInputArcAccess().getToNodeSTRINGTerminalRuleCall_7_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getToNodeSTRINGTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getInputArcAccess().getToNodeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__ToAssignment_7"


    // $ANTLR start "rule__InputArc__FromAssignment_10"
    // InternalPetrinet2.g:3010:1: rule__InputArc__FromAssignment_10 : ( ( RULE_STRING ) ) ;
    public final void rule__InputArc__FromAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalPetrinet2.g:3014:1: ( ( ( RULE_STRING ) ) )
            // InternalPetrinet2.g:3015:1: ( ( RULE_STRING ) )
            {
            // InternalPetrinet2.g:3015:1: ( ( RULE_STRING ) )
            // InternalPetrinet2.g:3016:1: ( RULE_STRING )
            {
             before(grammarAccess.getInputArcAccess().getFromNodeCrossReference_10_0()); 
            // InternalPetrinet2.g:3017:1: ( RULE_STRING )
            // InternalPetrinet2.g:3018:1: RULE_STRING
            {
             before(grammarAccess.getInputArcAccess().getFromNodeSTRINGTerminalRuleCall_10_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getInputArcAccess().getFromNodeSTRINGTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getInputArcAccess().getFromNodeCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputArc__FromAssignment_10"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002000L});
    }


}