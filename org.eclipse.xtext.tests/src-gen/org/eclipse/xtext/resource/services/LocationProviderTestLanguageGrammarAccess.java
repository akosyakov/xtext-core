/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.resource.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LocationProviderTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cElementsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cElementsElementParserRuleCall_0_0 = (RuleCall)cElementsAssignment_0.eContents().get(0);
		private final Assignment cComponentsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cComponentsComponentParserRuleCall_1_0 = (RuleCall)cComponentsAssignment_1.eContents().get(0);
		
		//Model :
		//    (elements+=Element)*
		//    (components+=Component)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements+=Element)*
		//(components+=Component)*
		public Group getGroup() { return cGroup; }
		
		//(elements+=Element)*
		public Assignment getElementsAssignment_0() { return cElementsAssignment_0; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_0_0() { return cElementsElementParserRuleCall_0_0; }
		
		//(components+=Component)*
		public Assignment getComponentsAssignment_1() { return cComponentsAssignment_1; }
		
		//Component
		public RuleCall getComponentsComponentParserRuleCall_1_0() { return cComponentsComponentParserRuleCall_1_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Element");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cSinglerefKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSinglerefAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSinglerefElementCrossReference_2_1_0 = (CrossReference)cSinglerefAssignment_2_1.eContents().get(0);
		private final RuleCall cSinglerefElementIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSinglerefElementCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cMultirefKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMultirefsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cMultirefsElementCrossReference_3_1_0 = (CrossReference)cMultirefsAssignment_3_1.eContents().get(0);
		private final RuleCall cMultirefsElementIDTerminalRuleCall_3_1_0_1 = (RuleCall)cMultirefsElementCrossReference_3_1_0.eContents().get(1);
		
		//Element :
		//    "element" name=ID ("singleref" singleref=[Element])? ("multiref" multirefs+=[Element])*;
		@Override public ParserRule getRule() { return rule; }
		
		//"element" name=ID ("singleref" singleref=[Element])? ("multiref" multirefs+=[Element])*
		public Group getGroup() { return cGroup; }
		
		//"element"
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//("singleref" singleref=[Element])?
		public Group getGroup_2() { return cGroup_2; }
		
		//"singleref"
		public Keyword getSinglerefKeyword_2_0() { return cSinglerefKeyword_2_0; }
		
		//singleref=[Element]
		public Assignment getSinglerefAssignment_2_1() { return cSinglerefAssignment_2_1; }
		
		//[Element]
		public CrossReference getSinglerefElementCrossReference_2_1_0() { return cSinglerefElementCrossReference_2_1_0; }
		
		//ID
		public RuleCall getSinglerefElementIDTerminalRuleCall_2_1_0_1() { return cSinglerefElementIDTerminalRuleCall_2_1_0_1; }
		
		//("multiref" multirefs+=[Element])*
		public Group getGroup_3() { return cGroup_3; }
		
		//"multiref"
		public Keyword getMultirefKeyword_3_0() { return cMultirefKeyword_3_0; }
		
		//multirefs+=[Element]
		public Assignment getMultirefsAssignment_3_1() { return cMultirefsAssignment_3_1; }
		
		//[Element]
		public CrossReference getMultirefsElementCrossReference_3_1_0() { return cMultirefsElementCrossReference_3_1_0; }
		
		//ID
		public RuleCall getMultirefsElementIDTerminalRuleCall_3_1_0_1() { return cMultirefsElementIDTerminalRuleCall_3_1_0_1; }
	}
	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cBusParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cProcessorParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cModesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Assignment cModeAssignment_1_1_0 = (Assignment)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cModeModeParserRuleCall_1_1_0_0 = (RuleCall)cModeAssignment_1_1_0.eContents().get(0);
		private final Assignment cTransitionAssignment_1_1_1 = (Assignment)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_1_1_1_0 = (RuleCall)cTransitionAssignment_1_1_1.eContents().get(0);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Component :
		//    (Bus | Processor)
		//    ('modes' (mode+=Mode |
		//        transition+=Transition)+
		//    )?
		//    'end' ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(Bus | Processor)
		//('modes' (mode+=Mode |
		//    transition+=Transition)+
		//)?
		//'end' ';'
		public Group getGroup() { return cGroup; }
		
		//(Bus | Processor)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Bus
		public RuleCall getBusParserRuleCall_0_0() { return cBusParserRuleCall_0_0; }
		
		//Processor
		public RuleCall getProcessorParserRuleCall_0_1() { return cProcessorParserRuleCall_0_1; }
		
		//('modes' (mode+=Mode |
		//    transition+=Transition)+
		//)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'modes'
		public Keyword getModesKeyword_1_0() { return cModesKeyword_1_0; }
		
		//(mode+=Mode |
		//       transition+=Transition)+
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//mode+=Mode
		public Assignment getModeAssignment_1_1_0() { return cModeAssignment_1_1_0; }
		
		//Mode
		public RuleCall getModeModeParserRuleCall_1_1_0_0() { return cModeModeParserRuleCall_1_1_0_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_1_1_1() { return cTransitionAssignment_1_1_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_1_1_1_0() { return cTransitionTransitionParserRuleCall_1_1_1_0; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class BusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Bus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cPortAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPortPortParserRuleCall_2_0 = (RuleCall)cPortAssignment_2.eContents().get(0);
		
		//Bus:
		//    'bus' name = ID
		//    (port+=Port)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'bus' name = ID
		//(port+=Port)*
		public Group getGroup() { return cGroup; }
		
		//'bus'
		public Keyword getBusKeyword_0() { return cBusKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(port+=Port)*
		public Assignment getPortAssignment_2() { return cPortAssignment_2; }
		
		//Port
		public RuleCall getPortPortParserRuleCall_2_0() { return cPortPortParserRuleCall_2_0; }
	}
	public class ProcessorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Processor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcessorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDataAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDataDataParserRuleCall_2_0 = (RuleCall)cDataAssignment_2.eContents().get(0);
		
		//Processor:
		//    'processor' name = ID
		//    (data+=Data)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'processor' name = ID
		//(data+=Data)*
		public Group getGroup() { return cGroup; }
		
		//'processor'
		public Keyword getProcessorKeyword_0() { return cProcessorKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(data+=Data)*
		public Assignment getDataAssignment_2() { return cDataAssignment_2; }
		
		//Data
		public RuleCall getDataDataParserRuleCall_2_0() { return cDataDataParserRuleCall_2_0; }
	}
	public class ModeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Mode");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Mode :
		//    'mode' name = ID ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'mode' name = ID ';'
		public Group getGroup() { return cGroup; }
		
		//'mode'
		public Keyword getModeKeyword_0() { return cModeKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSourceAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cSourceModeCrossReference_2_0 = (CrossReference)cSourceAssignment_2.eContents().get(0);
		private final RuleCall cSourceModeIDTerminalRuleCall_2_0_1 = (RuleCall)cSourceModeCrossReference_2_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDestinationAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cDestinationModeCrossReference_4_0 = (CrossReference)cDestinationAssignment_4.eContents().get(0);
		private final RuleCall cDestinationModeIDTerminalRuleCall_4_0_1 = (RuleCall)cDestinationModeCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Transition:
		//    name=ID ':' source=[Mode] '->' destination=[Mode] ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' source=[Mode] '->' destination=[Mode] ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//source=[Mode]
		public Assignment getSourceAssignment_2() { return cSourceAssignment_2; }
		
		//[Mode]
		public CrossReference getSourceModeCrossReference_2_0() { return cSourceModeCrossReference_2_0; }
		
		//ID
		public RuleCall getSourceModeIDTerminalRuleCall_2_0_1() { return cSourceModeIDTerminalRuleCall_2_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3() { return cHyphenMinusGreaterThanSignKeyword_3; }
		
		//destination=[Mode]
		public Assignment getDestinationAssignment_4() { return cDestinationAssignment_4; }
		
		//[Mode]
		public CrossReference getDestinationModeCrossReference_4_0() { return cDestinationModeCrossReference_4_0; }
		
		//ID
		public RuleCall getDestinationModeIDTerminalRuleCall_4_0_1() { return cDestinationModeIDTerminalRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class PortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Port");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Port:
		//    'port' name = ID ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'port' name = ID ';'
		public Group getGroup() { return cGroup; }
		
		//'port'
		public Keyword getPortKeyword_0() { return cPortKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class DataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.LocationProviderTestLanguage.Data");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDataKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Data:
		//    'data' name = ID ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'data' name = ID ';'
		public Group getGroup() { return cGroup; }
		
		//'data'
		public Keyword getDataKeyword_0() { return cDataKeyword_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final ComponentElements pComponent;
	private final BusElements pBus;
	private final ProcessorElements pProcessor;
	private final ModeElements pMode;
	private final TransitionElements pTransition;
	private final PortElements pPort;
	private final DataElements pData;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LocationProviderTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pComponent = new ComponentElements();
		this.pBus = new BusElements();
		this.pProcessor = new ProcessorElements();
		this.pMode = new ModeElements();
		this.pTransition = new TransitionElements();
		this.pPort = new PortElements();
		this.pData = new DataElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.resource.LocationProviderTestLanguage".equals(grammar.getName())) {
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

	
	//Model :
	//    (elements+=Element)*
	//    (components+=Component)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element :
	//    "element" name=ID ("singleref" singleref=[Element])? ("multiref" multirefs+=[Element])*;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//Component :
	//    (Bus | Processor)
	//    ('modes' (mode+=Mode |
	//        transition+=Transition)+
	//    )?
	//    'end' ';'
	//;
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}
	
	//Bus:
	//    'bus' name = ID
	//    (port+=Port)*
	//;
	public BusElements getBusAccess() {
		return pBus;
	}
	
	public ParserRule getBusRule() {
		return getBusAccess().getRule();
	}
	
	//Processor:
	//    'processor' name = ID
	//    (data+=Data)*
	//;
	public ProcessorElements getProcessorAccess() {
		return pProcessor;
	}
	
	public ParserRule getProcessorRule() {
		return getProcessorAccess().getRule();
	}
	
	//Mode :
	//    'mode' name = ID ';'
	//;
	public ModeElements getModeAccess() {
		return pMode;
	}
	
	public ParserRule getModeRule() {
		return getModeAccess().getRule();
	}
	
	//Transition:
	//    name=ID ':' source=[Mode] '->' destination=[Mode] ';'
	//;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Port:
	//    'port' name = ID ';'
	//;
	public PortElements getPortAccess() {
		return pPort;
	}
	
	public ParserRule getPortRule() {
		return getPortAccess().getRule();
	}
	
	//Data:
	//    'data' name = ID ';'
	//;
	public DataElements getDataAccess() {
		return pData;
	}
	
	public ParserRule getDataRule() {
		return getDataAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
