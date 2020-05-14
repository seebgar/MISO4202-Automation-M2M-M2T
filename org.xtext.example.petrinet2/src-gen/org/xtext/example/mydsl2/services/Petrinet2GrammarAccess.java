/*
 * generated by Xtext
 */
package org.xtext.example.mydsl2.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class Petrinet2GrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PetrinetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.Petrinet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPetrinetAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cLESSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cQUESTIONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cXmlKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cVersionKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cEQUALSTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final RuleCall cQUESTIONTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cGREATERTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cLESSTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Keyword cPnmlPnmlKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cXmlnsPnmlKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final RuleCall cEQUALSTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final Keyword cPnmlXsdKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final RuleCall cGREATERTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final RuleCall cLESSTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		private final Keyword cNetKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Keyword cTypeKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final RuleCall cEQUALSTerminalRuleCall_18 = (RuleCall)cGroup.eContents().get(18);
		private final Keyword cPtNetKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final RuleCall cGREATERTerminalRuleCall_20 = (RuleCall)cGroup.eContents().get(20);
		private final Assignment cElementsAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final RuleCall cElementsElementParserRuleCall_21_0 = (RuleCall)cElementsAssignment_21.eContents().get(0);
		private final RuleCall cLESSTerminalRuleCall_22 = (RuleCall)cGroup.eContents().get(22);
		private final RuleCall cSLASHTerminalRuleCall_23 = (RuleCall)cGroup.eContents().get(23);
		private final Keyword cNetKeyword_24 = (Keyword)cGroup.eContents().get(24);
		private final RuleCall cGREATERTerminalRuleCall_25 = (RuleCall)cGroup.eContents().get(25);
		private final RuleCall cLESSTerminalRuleCall_26 = (RuleCall)cGroup.eContents().get(26);
		private final RuleCall cSLASHTerminalRuleCall_27 = (RuleCall)cGroup.eContents().get(27);
		private final Keyword cPnmlPnmlKeyword_28 = (Keyword)cGroup.eContents().get(28);
		private final RuleCall cGREATERTerminalRuleCall_29 = (RuleCall)cGroup.eContents().get(29);
		
		//Petrinet:
		//	{Petrinet} LESS QUESTION 'xml' 'version' EQUALS '"1.0"' QUESTION GREATER
		//	LESS 'pnml:pnml' 'xmlns:pnml' EQUALS '"pnml.xsd"' GREATER
		//	LESS 'net' 'type' EQUALS '"ptNet"' GREATER
		//	elements+=Element*
		//	LESS SLASH 'net' GREATER
		//	LESS SLASH 'pnml:pnml' GREATER;
		@Override public ParserRule getRule() { return rule; }

		//{Petrinet} LESS QUESTION 'xml' 'version' EQUALS '"1.0"' QUESTION GREATER LESS 'pnml:pnml' 'xmlns:pnml' EQUALS
		//'"pnml.xsd"' GREATER LESS 'net' 'type' EQUALS '"ptNet"' GREATER elements+=Element* LESS SLASH 'net' GREATER LESS SLASH
		//'pnml:pnml' GREATER
		public Group getGroup() { return cGroup; }

		//{Petrinet}
		public Action getPetrinetAction_0() { return cPetrinetAction_0; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_1() { return cLESSTerminalRuleCall_1; }

		//QUESTION
		public RuleCall getQUESTIONTerminalRuleCall_2() { return cQUESTIONTerminalRuleCall_2; }

		//'xml'
		public Keyword getXmlKeyword_3() { return cXmlKeyword_3; }

		//'version'
		public Keyword getVersionKeyword_4() { return cVersionKeyword_4; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_5() { return cEQUALSTerminalRuleCall_5; }

		//'"1.0"'
		public Keyword getQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6() { return cQuotationMarkDigitOneFullStopDigitZeroQuotationMarkKeyword_6; }

		//QUESTION
		public RuleCall getQUESTIONTerminalRuleCall_7() { return cQUESTIONTerminalRuleCall_7; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_8() { return cGREATERTerminalRuleCall_8; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_9() { return cLESSTerminalRuleCall_9; }

		//'pnml:pnml'
		public Keyword getPnmlPnmlKeyword_10() { return cPnmlPnmlKeyword_10; }

		//'xmlns:pnml'
		public Keyword getXmlnsPnmlKeyword_11() { return cXmlnsPnmlKeyword_11; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_12() { return cEQUALSTerminalRuleCall_12; }

		//'"pnml.xsd"'
		public Keyword getPnmlXsdKeyword_13() { return cPnmlXsdKeyword_13; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_14() { return cGREATERTerminalRuleCall_14; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_15() { return cLESSTerminalRuleCall_15; }

		//'net'
		public Keyword getNetKeyword_16() { return cNetKeyword_16; }

		//'type'
		public Keyword getTypeKeyword_17() { return cTypeKeyword_17; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_18() { return cEQUALSTerminalRuleCall_18; }

		//'"ptNet"'
		public Keyword getPtNetKeyword_19() { return cPtNetKeyword_19; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_20() { return cGREATERTerminalRuleCall_20; }

		//elements+=Element*
		public Assignment getElementsAssignment_21() { return cElementsAssignment_21; }

		//Element
		public RuleCall getElementsElementParserRuleCall_21_0() { return cElementsElementParserRuleCall_21_0; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_22() { return cLESSTerminalRuleCall_22; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_23() { return cSLASHTerminalRuleCall_23; }

		//'net'
		public Keyword getNetKeyword_24() { return cNetKeyword_24; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_25() { return cGREATERTerminalRuleCall_25; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_26() { return cLESSTerminalRuleCall_26; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_27() { return cSLASHTerminalRuleCall_27; }

		//'pnml:pnml'
		public Keyword getPnmlPnmlKeyword_28() { return cPnmlPnmlKeyword_28; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_29() { return cGREATERTerminalRuleCall_29; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNodeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOutputArcParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cInputArcParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Element:
		//	Node | OutputArc | InputArc;
		@Override public ParserRule getRule() { return rule; }

		//Node | OutputArc | InputArc
		public Alternatives getAlternatives() { return cAlternatives; }

		//Node
		public RuleCall getNodeParserRuleCall_0() { return cNodeParserRuleCall_0; }

		//OutputArc
		public RuleCall getOutputArcParserRuleCall_1() { return cOutputArcParserRuleCall_1; }

		//InputArc
		public RuleCall getInputArcParserRuleCall_2() { return cInputArcParserRuleCall_2; }
	}

	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.Node");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTransitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPlaceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Node:
		//	Transition | Place;
		@Override public ParserRule getRule() { return rule; }

		//Transition | Place
		public Alternatives getAlternatives() { return cAlternatives; }

		//Transition
		public RuleCall getTransitionParserRuleCall_0() { return cTransitionParserRuleCall_0; }

		//Place
		public RuleCall getPlaceParserRuleCall_1() { return cPlaceParserRuleCall_1; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTTRANSITIONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cEQUALSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cGREATERTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cLESSTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cSLASHTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cTTRANSITIONTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cGREATERTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//Transition:
		//	LESS TTRANSITION ID EQUALS name=STRING GREATER
		//	LESS SLASH TTRANSITION GREATER;
		@Override public ParserRule getRule() { return rule; }

		//LESS TTRANSITION ID EQUALS name=STRING GREATER LESS SLASH TTRANSITION GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TTRANSITION
		public RuleCall getTTRANSITIONTerminalRuleCall_1() { return cTTRANSITIONTerminalRuleCall_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_3() { return cEQUALSTerminalRuleCall_3; }

		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_5() { return cGREATERTerminalRuleCall_5; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_6() { return cLESSTerminalRuleCall_6; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_7() { return cSLASHTerminalRuleCall_7; }

		//TTRANSITION
		public RuleCall getTTRANSITIONTerminalRuleCall_8() { return cTTRANSITIONTerminalRuleCall_8; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_9() { return cGREATERTerminalRuleCall_9; }
	}

	public class PlaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.Place");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTPLACETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cEQUALSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cGREATERTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cLESSTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cSLASHTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cTPLACETerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cGREATERTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		
		//Place:
		//	LESS TPLACE ID EQUALS name=STRING GREATER
		//	LESS SLASH TPLACE GREATER;
		@Override public ParserRule getRule() { return rule; }

		//LESS TPLACE ID EQUALS name=STRING GREATER LESS SLASH TPLACE GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TPLACE
		public RuleCall getTPLACETerminalRuleCall_1() { return cTPLACETerminalRuleCall_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_3() { return cEQUALSTerminalRuleCall_3; }

		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_5() { return cGREATERTerminalRuleCall_5; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_6() { return cLESSTerminalRuleCall_6; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_7() { return cSLASHTerminalRuleCall_7; }

		//TPLACE
		public RuleCall getTPLACETerminalRuleCall_8() { return cTPLACETerminalRuleCall_8; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_9() { return cGREATERTerminalRuleCall_9; }
	}

	public class OutputArcElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.OutputArc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTOUTPUTARCTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cEQUALSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cTargetKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cEQUALSTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Assignment cToAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cToNodeCrossReference_7_0 = (CrossReference)cToAssignment_7.eContents().get(0);
		private final RuleCall cToNodeSTRINGTerminalRuleCall_7_0_1 = (RuleCall)cToNodeCrossReference_7_0.eContents().get(1);
		private final Keyword cSourceKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final RuleCall cEQUALSTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cFromAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cFromNodeCrossReference_10_0 = (CrossReference)cFromAssignment_10.eContents().get(0);
		private final RuleCall cFromNodeSTRINGTerminalRuleCall_10_0_1 = (RuleCall)cFromNodeCrossReference_10_0.eContents().get(1);
		private final RuleCall cGREATERTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cLESSTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cSLASHTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cTOUTPUTARCTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final RuleCall cGREATERTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		
		//OutputArc Arc:
		//	LESS TOUTPUTARC ID EQUALS name=STRING 'target' EQUALS To=[Node|STRING] 'source' EQUALS From=[Node|STRING] GREATER
		//	LESS SLASH TOUTPUTARC GREATER
		@Override public ParserRule getRule() { return rule; }

		//LESS TOUTPUTARC ID EQUALS name=STRING 'target' EQUALS To=[Node|STRING] 'source' EQUALS From=[Node|STRING] GREATER LESS
		//SLASH TOUTPUTARC GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TOUTPUTARC
		public RuleCall getTOUTPUTARCTerminalRuleCall_1() { return cTOUTPUTARCTerminalRuleCall_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_3() { return cEQUALSTerminalRuleCall_3; }

		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }

		//'target'
		public Keyword getTargetKeyword_5() { return cTargetKeyword_5; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_6() { return cEQUALSTerminalRuleCall_6; }

		//To=[Node|STRING]
		public Assignment getToAssignment_7() { return cToAssignment_7; }

		//[Node|STRING]
		public CrossReference getToNodeCrossReference_7_0() { return cToNodeCrossReference_7_0; }

		//STRING
		public RuleCall getToNodeSTRINGTerminalRuleCall_7_0_1() { return cToNodeSTRINGTerminalRuleCall_7_0_1; }

		//'source'
		public Keyword getSourceKeyword_8() { return cSourceKeyword_8; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_9() { return cEQUALSTerminalRuleCall_9; }

		//From=[Node|STRING]
		public Assignment getFromAssignment_10() { return cFromAssignment_10; }

		//[Node|STRING]
		public CrossReference getFromNodeCrossReference_10_0() { return cFromNodeCrossReference_10_0; }

		//STRING
		public RuleCall getFromNodeSTRINGTerminalRuleCall_10_0_1() { return cFromNodeSTRINGTerminalRuleCall_10_0_1; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_11() { return cGREATERTerminalRuleCall_11; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_12() { return cLESSTerminalRuleCall_12; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_13() { return cSLASHTerminalRuleCall_13; }

		//TOUTPUTARC
		public RuleCall getTOUTPUTARCTerminalRuleCall_14() { return cTOUTPUTARCTerminalRuleCall_14; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_15() { return cGREATERTerminalRuleCall_15; }
	}

	public class InputArcElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.InputArc");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLESSTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cTINPUTARCTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cEQUALSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cTargetKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final RuleCall cEQUALSTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final Assignment cToAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cToNodeCrossReference_7_0 = (CrossReference)cToAssignment_7.eContents().get(0);
		private final RuleCall cToNodeSTRINGTerminalRuleCall_7_0_1 = (RuleCall)cToNodeCrossReference_7_0.eContents().get(1);
		private final Keyword cSourceKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final RuleCall cEQUALSTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cFromAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cFromNodeCrossReference_10_0 = (CrossReference)cFromAssignment_10.eContents().get(0);
		private final RuleCall cFromNodeSTRINGTerminalRuleCall_10_0_1 = (RuleCall)cFromNodeCrossReference_10_0.eContents().get(1);
		private final RuleCall cGREATERTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cLESSTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cSLASHTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cTINPUTARCTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final RuleCall cGREATERTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		
		//InputArc Arc:
		//	LESS TINPUTARC ID EQUALS name=STRING 'target' EQUALS To=[Node|STRING] 'source' EQUALS From=[Node|STRING] GREATER
		//	LESS SLASH TINPUTARC GREATER
		@Override public ParserRule getRule() { return rule; }

		//LESS TINPUTARC ID EQUALS name=STRING 'target' EQUALS To=[Node|STRING] 'source' EQUALS From=[Node|STRING] GREATER LESS
		//SLASH TINPUTARC GREATER
		public Group getGroup() { return cGroup; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_0() { return cLESSTerminalRuleCall_0; }

		//TINPUTARC
		public RuleCall getTINPUTARCTerminalRuleCall_1() { return cTINPUTARCTerminalRuleCall_1; }

		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_3() { return cEQUALSTerminalRuleCall_3; }

		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }

		//'target'
		public Keyword getTargetKeyword_5() { return cTargetKeyword_5; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_6() { return cEQUALSTerminalRuleCall_6; }

		//To=[Node|STRING]
		public Assignment getToAssignment_7() { return cToAssignment_7; }

		//[Node|STRING]
		public CrossReference getToNodeCrossReference_7_0() { return cToNodeCrossReference_7_0; }

		//STRING
		public RuleCall getToNodeSTRINGTerminalRuleCall_7_0_1() { return cToNodeSTRINGTerminalRuleCall_7_0_1; }

		//'source'
		public Keyword getSourceKeyword_8() { return cSourceKeyword_8; }

		//EQUALS
		public RuleCall getEQUALSTerminalRuleCall_9() { return cEQUALSTerminalRuleCall_9; }

		//From=[Node|STRING]
		public Assignment getFromAssignment_10() { return cFromAssignment_10; }

		//[Node|STRING]
		public CrossReference getFromNodeCrossReference_10_0() { return cFromNodeCrossReference_10_0; }

		//STRING
		public RuleCall getFromNodeSTRINGTerminalRuleCall_10_0_1() { return cFromNodeSTRINGTerminalRuleCall_10_0_1; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_11() { return cGREATERTerminalRuleCall_11; }

		//LESS
		public RuleCall getLESSTerminalRuleCall_12() { return cLESSTerminalRuleCall_12; }

		//SLASH
		public RuleCall getSLASHTerminalRuleCall_13() { return cSLASHTerminalRuleCall_13; }

		//TINPUTARC
		public RuleCall getTINPUTARCTerminalRuleCall_14() { return cTINPUTARCTerminalRuleCall_14; }

		//GREATER
		public RuleCall getGREATERTerminalRuleCall_15() { return cGREATERTerminalRuleCall_15; }
	}
	
	
	private final PetrinetElements pPetrinet;
	private final ElementElements pElement;
	private final NodeElements pNode;
	private final TransitionElements pTransition;
	private final PlaceElements pPlace;
	private final OutputArcElements pOutputArc;
	private final InputArcElements pInputArc;
	private final TerminalRule tNUMBER;
	private final TerminalRule tINT;
	private final TerminalRule tGREATER;
	private final TerminalRule tLESS;
	private final TerminalRule tSLASH;
	private final TerminalRule tTPLACE;
	private final TerminalRule tTTRANSITION;
	private final TerminalRule tTOUTPUTARC;
	private final TerminalRule tTINPUTARC;
	private final TerminalRule tID;
	private final TerminalRule tEQUALS;
	private final TerminalRule tQUESTION;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Petrinet2GrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPetrinet = new PetrinetElements();
		this.pElement = new ElementElements();
		this.pNode = new NodeElements();
		this.pTransition = new TransitionElements();
		this.pPlace = new PlaceElements();
		this.pOutputArc = new OutputArcElements();
		this.pInputArc = new InputArcElements();
		this.tNUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.NUMBER");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.INT");
		this.tGREATER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.GREATER");
		this.tLESS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.LESS");
		this.tSLASH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.SLASH");
		this.tTPLACE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.TPLACE");
		this.tTTRANSITION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.TTRANSITION");
		this.tTOUTPUTARC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.TOUTPUTARC");
		this.tTINPUTARC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.TINPUTARC");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.ID");
		this.tEQUALS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.EQUALS");
		this.tQUESTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl2.Petrinet2.QUESTION");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl2.Petrinet2".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Petrinet:
	//	{Petrinet} LESS QUESTION 'xml' 'version' EQUALS '"1.0"' QUESTION GREATER
	//	LESS 'pnml:pnml' 'xmlns:pnml' EQUALS '"pnml.xsd"' GREATER
	//	LESS 'net' 'type' EQUALS '"ptNet"' GREATER
	//	elements+=Element*
	//	LESS SLASH 'net' GREATER
	//	LESS SLASH 'pnml:pnml' GREATER;
	public PetrinetElements getPetrinetAccess() {
		return pPetrinet;
	}
	
	public ParserRule getPetrinetRule() {
		return getPetrinetAccess().getRule();
	}

	//Element:
	//	Node | OutputArc | InputArc;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//Node:
	//	Transition | Place;
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}

	//Transition:
	//	LESS TTRANSITION ID EQUALS name=STRING GREATER
	//	LESS SLASH TTRANSITION GREATER;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//Place:
	//	LESS TPLACE ID EQUALS name=STRING GREATER
	//	LESS SLASH TPLACE GREATER;
	public PlaceElements getPlaceAccess() {
		return pPlace;
	}
	
	public ParserRule getPlaceRule() {
		return getPlaceAccess().getRule();
	}

	//OutputArc Arc:
	//	LESS TOUTPUTARC ID EQUALS name=STRING 'target' EQUALS To=[Node|STRING] 'source' EQUALS From=[Node|STRING] GREATER
	//	LESS SLASH TOUTPUTARC GREATER
	public OutputArcElements getOutputArcAccess() {
		return pOutputArc;
	}
	
	public ParserRule getOutputArcRule() {
		return getOutputArcAccess().getRule();
	}

	//InputArc Arc:
	//	LESS TINPUTARC ID EQUALS name=STRING 'target' EQUALS To=[Node|STRING] 'source' EQUALS From=[Node|STRING] GREATER
	//	LESS SLASH TINPUTARC GREATER
	public InputArcElements getInputArcAccess() {
		return pInputArc;
	}
	
	public ParserRule getInputArcRule() {
		return getInputArcAccess().getRule();
	}

	//terminal NUMBER returns ecore::EDouble:
	//	'0'..'9'* ('.' '0'..'9'+)?;
	public TerminalRule getNUMBERRule() {
		return tNUMBER;
	} 

	//terminal INT returns ecore::EInt:
	//	'this one has been deactivated';
	public TerminalRule getINTRule() {
		return tINT;
	} 

	//terminal GREATER:
	//	">";
	public TerminalRule getGREATERRule() {
		return tGREATER;
	} 

	//terminal LESS:
	//	"<";
	public TerminalRule getLESSRule() {
		return tLESS;
	} 

	//terminal SLASH:
	//	"/";
	public TerminalRule getSLASHRule() {
		return tSLASH;
	} 

	//terminal TPLACE:
	//	"place";
	public TerminalRule getTPLACERule() {
		return tTPLACE;
	} 

	//terminal TTRANSITION:
	//	"transition";
	public TerminalRule getTTRANSITIONRule() {
		return tTTRANSITION;
	} 

	//terminal TOUTPUTARC:
	//	"outputarc";
	public TerminalRule getTOUTPUTARCRule() {
		return tTOUTPUTARC;
	} 

	//terminal TINPUTARC:
	//	"inputarc";
	public TerminalRule getTINPUTARCRule() {
		return tTINPUTARC;
	} 

	//terminal ID:
	//	"id";
	public TerminalRule getIDRule() {
		return tID;
	} 

	//terminal EQUALS:
	//	"=";
	public TerminalRule getEQUALSRule() {
		return tEQUALS;
	} 

	//terminal QUESTION:
	//	"?";
	public TerminalRule getQUESTIONRule() {
		return tQUESTION;
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
