package org.xtext.example.mydsl2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.services.Petrinet2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinet2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LESS", "RULE_QUESTION", "RULE_EQUALS", "RULE_GREATER", "RULE_SLASH", "RULE_TTRANSITION", "RULE_ID", "RULE_STRING", "RULE_TPLACE", "RULE_TOUTPUTARC", "RULE_TINPUTARC", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xml'", "'version'", "'\"1.0\"'", "'pnml:pnml'", "'xmlns:pnml'", "'\"pnml.xsd\"'", "'net'", "'type'", "'\"ptNet\"'", "'target'", "'source'"
    };
    public static final int RULE_TPLACE=12;
    public static final int RULE_STRING=11;
    public static final int RULE_GREATER=7;
    public static final int RULE_TINPUTARC=14;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_TOUTPUTARC=13;
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
     	
        public InternalPetrinet2Parser(TokenStream input, Petrinet2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Petrinet";	
       	}
       	
       	@Override
       	protected Petrinet2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePetrinet"
    // InternalPetrinet2.g:67:1: entryRulePetrinet returns [EObject current=null] : iv_rulePetrinet= rulePetrinet EOF ;
    public final EObject entryRulePetrinet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetrinet = null;


        try {
            // InternalPetrinet2.g:68:2: (iv_rulePetrinet= rulePetrinet EOF )
            // InternalPetrinet2.g:69:2: iv_rulePetrinet= rulePetrinet EOF
            {
             newCompositeNode(grammarAccess.getPetrinetRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePetrinet=rulePetrinet();

            state._fsp--;

             current =iv_rulePetrinet; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePetrinet"


    // $ANTLR start "rulePetrinet"
    // InternalPetrinet2.g:76:1: rulePetrinet returns [EObject current=null] : ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' this_QUESTION_7= RULE_QUESTION this_GREATER_8= RULE_GREATER this_LESS_9= RULE_LESS otherlv_10= 'pnml:pnml' otherlv_11= 'xmlns:pnml' this_EQUALS_12= RULE_EQUALS otherlv_13= '\"pnml.xsd\"' this_GREATER_14= RULE_GREATER this_LESS_15= RULE_LESS otherlv_16= 'net' otherlv_17= 'type' this_EQUALS_18= RULE_EQUALS otherlv_19= '\"ptNet\"' this_GREATER_20= RULE_GREATER ( (lv_elements_21_0= ruleElement ) )* this_LESS_22= RULE_LESS this_SLASH_23= RULE_SLASH otherlv_24= 'net' this_GREATER_25= RULE_GREATER this_LESS_26= RULE_LESS this_SLASH_27= RULE_SLASH otherlv_28= 'pnml:pnml' this_GREATER_29= RULE_GREATER ) ;
    public final EObject rulePetrinet() throws RecognitionException {
        EObject current = null;

        Token this_LESS_1=null;
        Token this_QUESTION_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_EQUALS_5=null;
        Token otherlv_6=null;
        Token this_QUESTION_7=null;
        Token this_GREATER_8=null;
        Token this_LESS_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_EQUALS_12=null;
        Token otherlv_13=null;
        Token this_GREATER_14=null;
        Token this_LESS_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_EQUALS_18=null;
        Token otherlv_19=null;
        Token this_GREATER_20=null;
        Token this_LESS_22=null;
        Token this_SLASH_23=null;
        Token otherlv_24=null;
        Token this_GREATER_25=null;
        Token this_LESS_26=null;
        Token this_SLASH_27=null;
        Token otherlv_28=null;
        Token this_GREATER_29=null;
        EObject lv_elements_21_0 = null;


         enterRule(); 
            
        try {
            // InternalPetrinet2.g:79:28: ( ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' this_QUESTION_7= RULE_QUESTION this_GREATER_8= RULE_GREATER this_LESS_9= RULE_LESS otherlv_10= 'pnml:pnml' otherlv_11= 'xmlns:pnml' this_EQUALS_12= RULE_EQUALS otherlv_13= '\"pnml.xsd\"' this_GREATER_14= RULE_GREATER this_LESS_15= RULE_LESS otherlv_16= 'net' otherlv_17= 'type' this_EQUALS_18= RULE_EQUALS otherlv_19= '\"ptNet\"' this_GREATER_20= RULE_GREATER ( (lv_elements_21_0= ruleElement ) )* this_LESS_22= RULE_LESS this_SLASH_23= RULE_SLASH otherlv_24= 'net' this_GREATER_25= RULE_GREATER this_LESS_26= RULE_LESS this_SLASH_27= RULE_SLASH otherlv_28= 'pnml:pnml' this_GREATER_29= RULE_GREATER ) )
            // InternalPetrinet2.g:80:1: ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' this_QUESTION_7= RULE_QUESTION this_GREATER_8= RULE_GREATER this_LESS_9= RULE_LESS otherlv_10= 'pnml:pnml' otherlv_11= 'xmlns:pnml' this_EQUALS_12= RULE_EQUALS otherlv_13= '\"pnml.xsd\"' this_GREATER_14= RULE_GREATER this_LESS_15= RULE_LESS otherlv_16= 'net' otherlv_17= 'type' this_EQUALS_18= RULE_EQUALS otherlv_19= '\"ptNet\"' this_GREATER_20= RULE_GREATER ( (lv_elements_21_0= ruleElement ) )* this_LESS_22= RULE_LESS this_SLASH_23= RULE_SLASH otherlv_24= 'net' this_GREATER_25= RULE_GREATER this_LESS_26= RULE_LESS this_SLASH_27= RULE_SLASH otherlv_28= 'pnml:pnml' this_GREATER_29= RULE_GREATER )
            {
            // InternalPetrinet2.g:80:1: ( () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' this_QUESTION_7= RULE_QUESTION this_GREATER_8= RULE_GREATER this_LESS_9= RULE_LESS otherlv_10= 'pnml:pnml' otherlv_11= 'xmlns:pnml' this_EQUALS_12= RULE_EQUALS otherlv_13= '\"pnml.xsd\"' this_GREATER_14= RULE_GREATER this_LESS_15= RULE_LESS otherlv_16= 'net' otherlv_17= 'type' this_EQUALS_18= RULE_EQUALS otherlv_19= '\"ptNet\"' this_GREATER_20= RULE_GREATER ( (lv_elements_21_0= ruleElement ) )* this_LESS_22= RULE_LESS this_SLASH_23= RULE_SLASH otherlv_24= 'net' this_GREATER_25= RULE_GREATER this_LESS_26= RULE_LESS this_SLASH_27= RULE_SLASH otherlv_28= 'pnml:pnml' this_GREATER_29= RULE_GREATER )
            // InternalPetrinet2.g:80:2: () this_LESS_1= RULE_LESS this_QUESTION_2= RULE_QUESTION otherlv_3= 'xml' otherlv_4= 'version' this_EQUALS_5= RULE_EQUALS otherlv_6= '\"1.0\"' this_QUESTION_7= RULE_QUESTION this_GREATER_8= RULE_GREATER this_LESS_9= RULE_LESS otherlv_10= 'pnml:pnml' otherlv_11= 'xmlns:pnml' this_EQUALS_12= RULE_EQUALS otherlv_13= '\"pnml.xsd\"' this_GREATER_14= RULE_GREATER this_LESS_15= RULE_LESS otherlv_16= 'net' otherlv_17= 'type' this_EQUALS_18= RULE_EQUALS otherlv_19= '\"ptNet\"' this_GREATER_20= RULE_GREATER ( (lv_elements_21_0= ruleElement ) )* this_LESS_22= RULE_LESS this_SLASH_23= RULE_SLASH otherlv_24= 'net' this_GREATER_25= RULE_GREATER this_LESS_26= RULE_LESS this_SLASH_27= RULE_SLASH otherlv_28= 'pnml:pnml' this_GREATER_29= RULE_GREATER
            {
            // InternalPetrinet2.g:80:2: ()
            // InternalPetrinet2.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPetrinetAccess().getPetrinetAction_0(),
                        current);
                

            }

            this_LESS_1=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_3); 
             
                newLeafNode(this_LESS_1, grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_1()); 
                
            this_QUESTION_2=(Token)match(input,RULE_QUESTION,FollowSets000.FOLLOW_4); 
             
                newLeafNode(this_QUESTION_2, grammarAccess.getPetrinetAccess().getQUESTIONTerminalRuleCall_2()); 
                
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_3, grammarAccess.getPetrinetAccess().getXmlKeyword_3());
                
            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_4, grammarAccess.getPetrinetAccess().getVersionKeyword_4());
                
            this_EQUALS_5=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_7); 
             
                newLeafNode(this_EQUALS_5, grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getPetrinetAccess().getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6());
                
            this_QUESTION_7=(Token)match(input,RULE_QUESTION,FollowSets000.FOLLOW_8); 
             
                newLeafNode(this_QUESTION_7, grammarAccess.getPetrinetAccess().getQUESTIONTerminalRuleCall_7()); 
                
            this_GREATER_8=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_8, grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_8()); 
                
            this_LESS_9=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_10); 
             
                newLeafNode(this_LESS_9, grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_9()); 
                
            otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_11); 

                	newLeafNode(otherlv_10, grammarAccess.getPetrinetAccess().getPnmlPnmlKeyword_10());
                
            otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_11, grammarAccess.getPetrinetAccess().getXmlnsPnmlKeyword_11());
                
            this_EQUALS_12=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_12); 
             
                newLeafNode(this_EQUALS_12, grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_12()); 
                
            otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_13, grammarAccess.getPetrinetAccess().getPnmlXsdKeyword_13());
                
            this_GREATER_14=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_14, grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_14()); 
                
            this_LESS_15=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_13); 
             
                newLeafNode(this_LESS_15, grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_15()); 
                
            otherlv_16=(Token)match(input,27,FollowSets000.FOLLOW_14); 

                	newLeafNode(otherlv_16, grammarAccess.getPetrinetAccess().getNetKeyword_16());
                
            otherlv_17=(Token)match(input,28,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_17, grammarAccess.getPetrinetAccess().getTypeKeyword_17());
                
            this_EQUALS_18=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_15); 
             
                newLeafNode(this_EQUALS_18, grammarAccess.getPetrinetAccess().getEQUALSTerminalRuleCall_18()); 
                
            otherlv_19=(Token)match(input,29,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_19, grammarAccess.getPetrinetAccess().getPtNetKeyword_19());
                
            this_GREATER_20=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_20, grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_20()); 
                
            // InternalPetrinet2.g:166:1: ( (lv_elements_21_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_LESS) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_TTRANSITION||(LA1_1>=RULE_TPLACE && LA1_1<=RULE_TINPUTARC)) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalPetrinet2.g:167:1: (lv_elements_21_0= ruleElement )
            	    {
            	    // InternalPetrinet2.g:167:1: (lv_elements_21_0= ruleElement )
            	    // InternalPetrinet2.g:168:3: lv_elements_21_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPetrinetAccess().getElementsElementParserRuleCall_21_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_elements_21_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPetrinetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_21_0, 
            	            		"org.xtext.example.mydsl2.Petrinet2.Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            this_LESS_22=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_16); 
             
                newLeafNode(this_LESS_22, grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_22()); 
                
            this_SLASH_23=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_13); 
             
                newLeafNode(this_SLASH_23, grammarAccess.getPetrinetAccess().getSLASHTerminalRuleCall_23()); 
                
            otherlv_24=(Token)match(input,27,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_24, grammarAccess.getPetrinetAccess().getNetKeyword_24());
                
            this_GREATER_25=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_25, grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_25()); 
                
            this_LESS_26=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_16); 
             
                newLeafNode(this_LESS_26, grammarAccess.getPetrinetAccess().getLESSTerminalRuleCall_26()); 
                
            this_SLASH_27=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_10); 
             
                newLeafNode(this_SLASH_27, grammarAccess.getPetrinetAccess().getSLASHTerminalRuleCall_27()); 
                
            otherlv_28=(Token)match(input,24,FollowSets000.FOLLOW_8); 

                	newLeafNode(otherlv_28, grammarAccess.getPetrinetAccess().getPnmlPnmlKeyword_28());
                
            this_GREATER_29=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_GREATER_29, grammarAccess.getPetrinetAccess().getGREATERTerminalRuleCall_29()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePetrinet"


    // $ANTLR start "entryRuleElement"
    // InternalPetrinet2.g:224:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalPetrinet2.g:225:2: (iv_ruleElement= ruleElement EOF )
            // InternalPetrinet2.g:226:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalPetrinet2.g:233:1: ruleElement returns [EObject current=null] : (this_Node_0= ruleNode | this_OutputArc_1= ruleOutputArc | this_InputArc_2= ruleInputArc ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Node_0 = null;

        EObject this_OutputArc_1 = null;

        EObject this_InputArc_2 = null;


         enterRule(); 
            
        try {
            // InternalPetrinet2.g:236:28: ( (this_Node_0= ruleNode | this_OutputArc_1= ruleOutputArc | this_InputArc_2= ruleInputArc ) )
            // InternalPetrinet2.g:237:1: (this_Node_0= ruleNode | this_OutputArc_1= ruleOutputArc | this_InputArc_2= ruleInputArc )
            {
            // InternalPetrinet2.g:237:1: (this_Node_0= ruleNode | this_OutputArc_1= ruleOutputArc | this_InputArc_2= ruleInputArc )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LESS) ) {
                switch ( input.LA(2) ) {
                case RULE_TINPUTARC:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_TOUTPUTARC:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_TTRANSITION:
                case RULE_TPLACE:
                    {
                    alt2=1;
                    }
                    break;
                default:
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
                    // InternalPetrinet2.g:238:5: this_Node_0= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNodeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Node_0=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalPetrinet2.g:248:5: this_OutputArc_1= ruleOutputArc
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getOutputArcParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OutputArc_1=ruleOutputArc();

                    state._fsp--;

                     
                            current = this_OutputArc_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalPetrinet2.g:258:5: this_InputArc_2= ruleInputArc
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getInputArcParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InputArc_2=ruleInputArc();

                    state._fsp--;

                     
                            current = this_InputArc_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleNode"
    // InternalPetrinet2.g:274:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalPetrinet2.g:275:2: (iv_ruleNode= ruleNode EOF )
            // InternalPetrinet2.g:276:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalPetrinet2.g:283:1: ruleNode returns [EObject current=null] : (this_Transition_0= ruleTransition | this_Place_1= rulePlace ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Transition_0 = null;

        EObject this_Place_1 = null;


         enterRule(); 
            
        try {
            // InternalPetrinet2.g:286:28: ( (this_Transition_0= ruleTransition | this_Place_1= rulePlace ) )
            // InternalPetrinet2.g:287:1: (this_Transition_0= ruleTransition | this_Place_1= rulePlace )
            {
            // InternalPetrinet2.g:287:1: (this_Transition_0= ruleTransition | this_Place_1= rulePlace )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_LESS) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_TPLACE) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_TTRANSITION) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPetrinet2.g:288:5: this_Transition_0= ruleTransition
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getTransitionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Transition_0=ruleTransition();

                    state._fsp--;

                     
                            current = this_Transition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalPetrinet2.g:298:5: this_Place_1= rulePlace
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAccess().getPlaceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Place_1=rulePlace();

                    state._fsp--;

                     
                            current = this_Place_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleTransition"
    // InternalPetrinet2.g:314:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalPetrinet2.g:315:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalPetrinet2.g:316:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalPetrinet2.g:323:1: ruleTransition returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TTRANSITION_1= RULE_TTRANSITION this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TTRANSITION_8= RULE_TTRANSITION this_GREATER_9= RULE_GREATER ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TTRANSITION_1=null;
        Token this_ID_2=null;
        Token this_EQUALS_3=null;
        Token lv_name_4_0=null;
        Token this_GREATER_5=null;
        Token this_LESS_6=null;
        Token this_SLASH_7=null;
        Token this_TTRANSITION_8=null;
        Token this_GREATER_9=null;

         enterRule(); 
            
        try {
            // InternalPetrinet2.g:326:28: ( (this_LESS_0= RULE_LESS this_TTRANSITION_1= RULE_TTRANSITION this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TTRANSITION_8= RULE_TTRANSITION this_GREATER_9= RULE_GREATER ) )
            // InternalPetrinet2.g:327:1: (this_LESS_0= RULE_LESS this_TTRANSITION_1= RULE_TTRANSITION this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TTRANSITION_8= RULE_TTRANSITION this_GREATER_9= RULE_GREATER )
            {
            // InternalPetrinet2.g:327:1: (this_LESS_0= RULE_LESS this_TTRANSITION_1= RULE_TTRANSITION this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TTRANSITION_8= RULE_TTRANSITION this_GREATER_9= RULE_GREATER )
            // InternalPetrinet2.g:327:2: this_LESS_0= RULE_LESS this_TTRANSITION_1= RULE_TTRANSITION this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TTRANSITION_8= RULE_TTRANSITION this_GREATER_9= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_17); 
             
                newLeafNode(this_LESS_0, grammarAccess.getTransitionAccess().getLESSTerminalRuleCall_0()); 
                
            this_TTRANSITION_1=(Token)match(input,RULE_TTRANSITION,FollowSets000.FOLLOW_18); 
             
                newLeafNode(this_TTRANSITION_1, grammarAccess.getTransitionAccess().getTTRANSITIONTerminalRuleCall_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 
             
                newLeafNode(this_ID_2, grammarAccess.getTransitionAccess().getIDTerminalRuleCall_2()); 
                
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_3, grammarAccess.getTransitionAccess().getEQUALSTerminalRuleCall_3()); 
                
            // InternalPetrinet2.g:343:1: ( (lv_name_4_0= RULE_STRING ) )
            // InternalPetrinet2.g:344:1: (lv_name_4_0= RULE_STRING )
            {
            // InternalPetrinet2.g:344:1: (lv_name_4_0= RULE_STRING )
            // InternalPetrinet2.g:345:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); 

            			newLeafNode(lv_name_4_0, grammarAccess.getTransitionAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            this_GREATER_5=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_5, grammarAccess.getTransitionAccess().getGREATERTerminalRuleCall_5()); 
                
            this_LESS_6=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_16); 
             
                newLeafNode(this_LESS_6, grammarAccess.getTransitionAccess().getLESSTerminalRuleCall_6()); 
                
            this_SLASH_7=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_17); 
             
                newLeafNode(this_SLASH_7, grammarAccess.getTransitionAccess().getSLASHTerminalRuleCall_7()); 
                
            this_TTRANSITION_8=(Token)match(input,RULE_TTRANSITION,FollowSets000.FOLLOW_8); 
             
                newLeafNode(this_TTRANSITION_8, grammarAccess.getTransitionAccess().getTTRANSITIONTerminalRuleCall_8()); 
                
            this_GREATER_9=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_GREATER_9, grammarAccess.getTransitionAccess().getGREATERTerminalRuleCall_9()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRulePlace"
    // InternalPetrinet2.g:389:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // InternalPetrinet2.g:390:2: (iv_rulePlace= rulePlace EOF )
            // InternalPetrinet2.g:391:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // InternalPetrinet2.g:398:1: rulePlace returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TPLACE_1= RULE_TPLACE this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TPLACE_8= RULE_TPLACE this_GREATER_9= RULE_GREATER ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TPLACE_1=null;
        Token this_ID_2=null;
        Token this_EQUALS_3=null;
        Token lv_name_4_0=null;
        Token this_GREATER_5=null;
        Token this_LESS_6=null;
        Token this_SLASH_7=null;
        Token this_TPLACE_8=null;
        Token this_GREATER_9=null;

         enterRule(); 
            
        try {
            // InternalPetrinet2.g:401:28: ( (this_LESS_0= RULE_LESS this_TPLACE_1= RULE_TPLACE this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TPLACE_8= RULE_TPLACE this_GREATER_9= RULE_GREATER ) )
            // InternalPetrinet2.g:402:1: (this_LESS_0= RULE_LESS this_TPLACE_1= RULE_TPLACE this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TPLACE_8= RULE_TPLACE this_GREATER_9= RULE_GREATER )
            {
            // InternalPetrinet2.g:402:1: (this_LESS_0= RULE_LESS this_TPLACE_1= RULE_TPLACE this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TPLACE_8= RULE_TPLACE this_GREATER_9= RULE_GREATER )
            // InternalPetrinet2.g:402:2: this_LESS_0= RULE_LESS this_TPLACE_1= RULE_TPLACE this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) this_GREATER_5= RULE_GREATER this_LESS_6= RULE_LESS this_SLASH_7= RULE_SLASH this_TPLACE_8= RULE_TPLACE this_GREATER_9= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_20); 
             
                newLeafNode(this_LESS_0, grammarAccess.getPlaceAccess().getLESSTerminalRuleCall_0()); 
                
            this_TPLACE_1=(Token)match(input,RULE_TPLACE,FollowSets000.FOLLOW_18); 
             
                newLeafNode(this_TPLACE_1, grammarAccess.getPlaceAccess().getTPLACETerminalRuleCall_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 
             
                newLeafNode(this_ID_2, grammarAccess.getPlaceAccess().getIDTerminalRuleCall_2()); 
                
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_3, grammarAccess.getPlaceAccess().getEQUALSTerminalRuleCall_3()); 
                
            // InternalPetrinet2.g:418:1: ( (lv_name_4_0= RULE_STRING ) )
            // InternalPetrinet2.g:419:1: (lv_name_4_0= RULE_STRING )
            {
            // InternalPetrinet2.g:419:1: (lv_name_4_0= RULE_STRING )
            // InternalPetrinet2.g:420:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); 

            			newLeafNode(lv_name_4_0, grammarAccess.getPlaceAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            this_GREATER_5=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_5, grammarAccess.getPlaceAccess().getGREATERTerminalRuleCall_5()); 
                
            this_LESS_6=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_16); 
             
                newLeafNode(this_LESS_6, grammarAccess.getPlaceAccess().getLESSTerminalRuleCall_6()); 
                
            this_SLASH_7=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_20); 
             
                newLeafNode(this_SLASH_7, grammarAccess.getPlaceAccess().getSLASHTerminalRuleCall_7()); 
                
            this_TPLACE_8=(Token)match(input,RULE_TPLACE,FollowSets000.FOLLOW_8); 
             
                newLeafNode(this_TPLACE_8, grammarAccess.getPlaceAccess().getTPLACETerminalRuleCall_8()); 
                
            this_GREATER_9=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_GREATER_9, grammarAccess.getPlaceAccess().getGREATERTerminalRuleCall_9()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "entryRuleOutputArc"
    // InternalPetrinet2.g:464:1: entryRuleOutputArc returns [EObject current=null] : iv_ruleOutputArc= ruleOutputArc EOF ;
    public final EObject entryRuleOutputArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputArc = null;


        try {
            // InternalPetrinet2.g:465:2: (iv_ruleOutputArc= ruleOutputArc EOF )
            // InternalPetrinet2.g:466:2: iv_ruleOutputArc= ruleOutputArc EOF
            {
             newCompositeNode(grammarAccess.getOutputArcRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOutputArc=ruleOutputArc();

            state._fsp--;

             current =iv_ruleOutputArc; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputArc"


    // $ANTLR start "ruleOutputArc"
    // InternalPetrinet2.g:473:1: ruleOutputArc returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TOUTPUTARC_1= RULE_TOUTPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TOUTPUTARC_14= RULE_TOUTPUTARC this_GREATER_15= RULE_GREATER ) ;
    public final EObject ruleOutputArc() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TOUTPUTARC_1=null;
        Token this_ID_2=null;
        Token this_EQUALS_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_EQUALS_9=null;
        Token otherlv_10=null;
        Token this_GREATER_11=null;
        Token this_LESS_12=null;
        Token this_SLASH_13=null;
        Token this_TOUTPUTARC_14=null;
        Token this_GREATER_15=null;

         enterRule(); 
            
        try {
            // InternalPetrinet2.g:476:28: ( (this_LESS_0= RULE_LESS this_TOUTPUTARC_1= RULE_TOUTPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TOUTPUTARC_14= RULE_TOUTPUTARC this_GREATER_15= RULE_GREATER ) )
            // InternalPetrinet2.g:477:1: (this_LESS_0= RULE_LESS this_TOUTPUTARC_1= RULE_TOUTPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TOUTPUTARC_14= RULE_TOUTPUTARC this_GREATER_15= RULE_GREATER )
            {
            // InternalPetrinet2.g:477:1: (this_LESS_0= RULE_LESS this_TOUTPUTARC_1= RULE_TOUTPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TOUTPUTARC_14= RULE_TOUTPUTARC this_GREATER_15= RULE_GREATER )
            // InternalPetrinet2.g:477:2: this_LESS_0= RULE_LESS this_TOUTPUTARC_1= RULE_TOUTPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TOUTPUTARC_14= RULE_TOUTPUTARC this_GREATER_15= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_21); 
             
                newLeafNode(this_LESS_0, grammarAccess.getOutputArcAccess().getLESSTerminalRuleCall_0()); 
                
            this_TOUTPUTARC_1=(Token)match(input,RULE_TOUTPUTARC,FollowSets000.FOLLOW_18); 
             
                newLeafNode(this_TOUTPUTARC_1, grammarAccess.getOutputArcAccess().getTOUTPUTARCTerminalRuleCall_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 
             
                newLeafNode(this_ID_2, grammarAccess.getOutputArcAccess().getIDTerminalRuleCall_2()); 
                
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_3, grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_3()); 
                
            // InternalPetrinet2.g:493:1: ( (lv_name_4_0= RULE_STRING ) )
            // InternalPetrinet2.g:494:1: (lv_name_4_0= RULE_STRING )
            {
            // InternalPetrinet2.g:494:1: (lv_name_4_0= RULE_STRING )
            // InternalPetrinet2.g:495:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); 

            			newLeafNode(lv_name_4_0, grammarAccess.getOutputArcAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputArcRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_5, grammarAccess.getOutputArcAccess().getTargetKeyword_5());
                
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_6, grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_6()); 
                
            // InternalPetrinet2.g:519:1: ( (otherlv_7= RULE_STRING ) )
            // InternalPetrinet2.g:520:1: (otherlv_7= RULE_STRING )
            {
            // InternalPetrinet2.g:520:1: (otherlv_7= RULE_STRING )
            // InternalPetrinet2.g:521:3: otherlv_7= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputArcRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); 

            		newLeafNode(otherlv_7, grammarAccess.getOutputArcAccess().getToNodeCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_8, grammarAccess.getOutputArcAccess().getSourceKeyword_8());
                
            this_EQUALS_9=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_9, grammarAccess.getOutputArcAccess().getEQUALSTerminalRuleCall_9()); 
                
            // InternalPetrinet2.g:540:1: ( (otherlv_10= RULE_STRING ) )
            // InternalPetrinet2.g:541:1: (otherlv_10= RULE_STRING )
            {
            // InternalPetrinet2.g:541:1: (otherlv_10= RULE_STRING )
            // InternalPetrinet2.g:542:3: otherlv_10= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOutputArcRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); 

            		newLeafNode(otherlv_10, grammarAccess.getOutputArcAccess().getFromNodeCrossReference_10_0()); 
            	

            }


            }

            this_GREATER_11=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_11, grammarAccess.getOutputArcAccess().getGREATERTerminalRuleCall_11()); 
                
            this_LESS_12=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_16); 
             
                newLeafNode(this_LESS_12, grammarAccess.getOutputArcAccess().getLESSTerminalRuleCall_12()); 
                
            this_SLASH_13=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_21); 
             
                newLeafNode(this_SLASH_13, grammarAccess.getOutputArcAccess().getSLASHTerminalRuleCall_13()); 
                
            this_TOUTPUTARC_14=(Token)match(input,RULE_TOUTPUTARC,FollowSets000.FOLLOW_8); 
             
                newLeafNode(this_TOUTPUTARC_14, grammarAccess.getOutputArcAccess().getTOUTPUTARCTerminalRuleCall_14()); 
                
            this_GREATER_15=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_GREATER_15, grammarAccess.getOutputArcAccess().getGREATERTerminalRuleCall_15()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputArc"


    // $ANTLR start "entryRuleInputArc"
    // InternalPetrinet2.g:581:1: entryRuleInputArc returns [EObject current=null] : iv_ruleInputArc= ruleInputArc EOF ;
    public final EObject entryRuleInputArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputArc = null;


        try {
            // InternalPetrinet2.g:582:2: (iv_ruleInputArc= ruleInputArc EOF )
            // InternalPetrinet2.g:583:2: iv_ruleInputArc= ruleInputArc EOF
            {
             newCompositeNode(grammarAccess.getInputArcRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInputArc=ruleInputArc();

            state._fsp--;

             current =iv_ruleInputArc; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputArc"


    // $ANTLR start "ruleInputArc"
    // InternalPetrinet2.g:590:1: ruleInputArc returns [EObject current=null] : (this_LESS_0= RULE_LESS this_TINPUTARC_1= RULE_TINPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TINPUTARC_14= RULE_TINPUTARC this_GREATER_15= RULE_GREATER ) ;
    public final EObject ruleInputArc() throws RecognitionException {
        EObject current = null;

        Token this_LESS_0=null;
        Token this_TINPUTARC_1=null;
        Token this_ID_2=null;
        Token this_EQUALS_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token this_EQUALS_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_EQUALS_9=null;
        Token otherlv_10=null;
        Token this_GREATER_11=null;
        Token this_LESS_12=null;
        Token this_SLASH_13=null;
        Token this_TINPUTARC_14=null;
        Token this_GREATER_15=null;

         enterRule(); 
            
        try {
            // InternalPetrinet2.g:593:28: ( (this_LESS_0= RULE_LESS this_TINPUTARC_1= RULE_TINPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TINPUTARC_14= RULE_TINPUTARC this_GREATER_15= RULE_GREATER ) )
            // InternalPetrinet2.g:594:1: (this_LESS_0= RULE_LESS this_TINPUTARC_1= RULE_TINPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TINPUTARC_14= RULE_TINPUTARC this_GREATER_15= RULE_GREATER )
            {
            // InternalPetrinet2.g:594:1: (this_LESS_0= RULE_LESS this_TINPUTARC_1= RULE_TINPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TINPUTARC_14= RULE_TINPUTARC this_GREATER_15= RULE_GREATER )
            // InternalPetrinet2.g:594:2: this_LESS_0= RULE_LESS this_TINPUTARC_1= RULE_TINPUTARC this_ID_2= RULE_ID this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'target' this_EQUALS_6= RULE_EQUALS ( (otherlv_7= RULE_STRING ) ) otherlv_8= 'source' this_EQUALS_9= RULE_EQUALS ( (otherlv_10= RULE_STRING ) ) this_GREATER_11= RULE_GREATER this_LESS_12= RULE_LESS this_SLASH_13= RULE_SLASH this_TINPUTARC_14= RULE_TINPUTARC this_GREATER_15= RULE_GREATER
            {
            this_LESS_0=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_24); 
             
                newLeafNode(this_LESS_0, grammarAccess.getInputArcAccess().getLESSTerminalRuleCall_0()); 
                
            this_TINPUTARC_1=(Token)match(input,RULE_TINPUTARC,FollowSets000.FOLLOW_18); 
             
                newLeafNode(this_TINPUTARC_1, grammarAccess.getInputArcAccess().getTINPUTARCTerminalRuleCall_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 
             
                newLeafNode(this_ID_2, grammarAccess.getInputArcAccess().getIDTerminalRuleCall_2()); 
                
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_3, grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_3()); 
                
            // InternalPetrinet2.g:610:1: ( (lv_name_4_0= RULE_STRING ) )
            // InternalPetrinet2.g:611:1: (lv_name_4_0= RULE_STRING )
            {
            // InternalPetrinet2.g:611:1: (lv_name_4_0= RULE_STRING )
            // InternalPetrinet2.g:612:3: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_22); 

            			newLeafNode(lv_name_4_0, grammarAccess.getInputArcAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputArcRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_5, grammarAccess.getInputArcAccess().getTargetKeyword_5());
                
            this_EQUALS_6=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_6, grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_6()); 
                
            // InternalPetrinet2.g:636:1: ( (otherlv_7= RULE_STRING ) )
            // InternalPetrinet2.g:637:1: (otherlv_7= RULE_STRING )
            {
            // InternalPetrinet2.g:637:1: (otherlv_7= RULE_STRING )
            // InternalPetrinet2.g:638:3: otherlv_7= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInputArcRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_23); 

            		newLeafNode(otherlv_7, grammarAccess.getInputArcAccess().getToNodeCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_6); 

                	newLeafNode(otherlv_8, grammarAccess.getInputArcAccess().getSourceKeyword_8());
                
            this_EQUALS_9=(Token)match(input,RULE_EQUALS,FollowSets000.FOLLOW_19); 
             
                newLeafNode(this_EQUALS_9, grammarAccess.getInputArcAccess().getEQUALSTerminalRuleCall_9()); 
                
            // InternalPetrinet2.g:657:1: ( (otherlv_10= RULE_STRING ) )
            // InternalPetrinet2.g:658:1: (otherlv_10= RULE_STRING )
            {
            // InternalPetrinet2.g:658:1: (otherlv_10= RULE_STRING )
            // InternalPetrinet2.g:659:3: otherlv_10= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInputArcRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); 

            		newLeafNode(otherlv_10, grammarAccess.getInputArcAccess().getFromNodeCrossReference_10_0()); 
            	

            }


            }

            this_GREATER_11=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_9); 
             
                newLeafNode(this_GREATER_11, grammarAccess.getInputArcAccess().getGREATERTerminalRuleCall_11()); 
                
            this_LESS_12=(Token)match(input,RULE_LESS,FollowSets000.FOLLOW_16); 
             
                newLeafNode(this_LESS_12, grammarAccess.getInputArcAccess().getLESSTerminalRuleCall_12()); 
                
            this_SLASH_13=(Token)match(input,RULE_SLASH,FollowSets000.FOLLOW_24); 
             
                newLeafNode(this_SLASH_13, grammarAccess.getInputArcAccess().getSLASHTerminalRuleCall_13()); 
                
            this_TINPUTARC_14=(Token)match(input,RULE_TINPUTARC,FollowSets000.FOLLOW_8); 
             
                newLeafNode(this_TINPUTARC_14, grammarAccess.getInputArcAccess().getTINPUTARCTerminalRuleCall_14()); 
                
            this_GREATER_15=(Token)match(input,RULE_GREATER,FollowSets000.FOLLOW_2); 
             
                newLeafNode(this_GREATER_15, grammarAccess.getInputArcAccess().getGREATERTerminalRuleCall_15()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputArc"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    }


}