/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.antlr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class Bug289524ExTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug289524ExTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRefsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRefsModelElementParserRuleCall_2_0 = (RuleCall)cRefsAssignment_2.eContents().get(0);
		
		//Model: {Model} "Model" (refs+=ModelElement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} "Model" (refs+=ModelElement)*
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//"Model"
		public Keyword getModelKeyword_1() { return cModelKeyword_1; }
		
		//(refs+=ModelElement)*
		public Assignment getRefsAssignment_2() { return cRefsAssignment_2; }
		
		//ModelElement
		public RuleCall getRefsModelElementParserRuleCall_2_0() { return cRefsModelElementParserRuleCall_2_0; }
	}
	public class ModelElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug289524ExTestLanguage.ModelElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelElementAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cContainmentsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cContainmentsContainedParserRuleCall_1_0_0 = (RuleCall)cContainmentsAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cReferenceKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cRefsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final CrossReference cRefsContainedCrossReference_1_1_1_0 = (CrossReference)cRefsAssignment_1_1_1.eContents().get(0);
		private final RuleCall cRefsContainedIDTerminalRuleCall_1_1_1_0_1 = (RuleCall)cRefsContainedCrossReference_1_1_1_0.eContents().get(1);
		private final Group cGroup_1_1_2 = (Group)cGroup_1_1.eContents().get(2);
		private final Keyword cDollarSignKeyword_1_1_2_0 = (Keyword)cGroup_1_1_2.eContents().get(0);
		private final Assignment cRefsAssignment_1_1_2_1 = (Assignment)cGroup_1_1_2.eContents().get(1);
		private final CrossReference cRefsContainedCrossReference_1_1_2_1_0 = (CrossReference)cRefsAssignment_1_1_2_1.eContents().get(0);
		private final RuleCall cRefsContainedIDTerminalRuleCall_1_1_2_1_0_1 = (RuleCall)cRefsContainedCrossReference_1_1_2_1_0.eContents().get(1);
		
		//ModelElement: {ModelElement} ( containments+=Contained | "reference" refs+=[Contained]  ("$" refs+=[Contained])* )+;
		@Override public ParserRule getRule() { return rule; }
		
		//{ModelElement} ( containments+=Contained | "reference" refs+=[Contained]  ("$" refs+=[Contained])* )+
		public Group getGroup() { return cGroup; }
		
		//{ModelElement}
		public Action getModelElementAction_0() { return cModelElementAction_0; }
		
		//( containments+=Contained | "reference" refs+=[Contained]  ("$" refs+=[Contained])* )+
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//containments+=Contained
		public Assignment getContainmentsAssignment_1_0() { return cContainmentsAssignment_1_0; }
		
		//Contained
		public RuleCall getContainmentsContainedParserRuleCall_1_0_0() { return cContainmentsContainedParserRuleCall_1_0_0; }
		
		//"reference" refs+=[Contained]  ("$" refs+=[Contained])*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"reference"
		public Keyword getReferenceKeyword_1_1_0() { return cReferenceKeyword_1_1_0; }
		
		//refs+=[Contained]
		public Assignment getRefsAssignment_1_1_1() { return cRefsAssignment_1_1_1; }
		
		//[Contained]
		public CrossReference getRefsContainedCrossReference_1_1_1_0() { return cRefsContainedCrossReference_1_1_1_0; }
		
		//ID
		public RuleCall getRefsContainedIDTerminalRuleCall_1_1_1_0_1() { return cRefsContainedIDTerminalRuleCall_1_1_1_0_1; }
		
		//("$" refs+=[Contained])*
		public Group getGroup_1_1_2() { return cGroup_1_1_2; }
		
		//"$"
		public Keyword getDollarSignKeyword_1_1_2_0() { return cDollarSignKeyword_1_1_2_0; }
		
		//refs+=[Contained]
		public Assignment getRefsAssignment_1_1_2_1() { return cRefsAssignment_1_1_2_1; }
		
		//[Contained]
		public CrossReference getRefsContainedCrossReference_1_1_2_1_0() { return cRefsContainedCrossReference_1_1_2_1_0; }
		
		//ID
		public RuleCall getRefsContainedIDTerminalRuleCall_1_1_2_1_0_1() { return cRefsContainedIDTerminalRuleCall_1_1_2_1_0_1; }
	}
	public class ContainedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug289524ExTestLanguage.Contained");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContainmentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Contained: "containment" name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"containment" name=ID
		public Group getGroup() { return cGroup; }
		
		//"containment"
		public Keyword getContainmentKeyword_0() { return cContainmentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final ModelElementElements pModelElement;
	private final ContainedElements pContained;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug289524ExTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pModelElement = new ModelElementElements();
		this.pContained = new ContainedElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.antlr.Bug289524ExTestLanguage".equals(grammar.getName())) {
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

	
	//Model: {Model} "Model" (refs+=ModelElement)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ModelElement: {ModelElement} ( containments+=Contained | "reference" refs+=[Contained]  ("$" refs+=[Contained])* )+;
	public ModelElementElements getModelElementAccess() {
		return pModelElement;
	}
	
	public ParserRule getModelElementRule() {
		return getModelElementAccess().getRule();
	}
	
	//Contained: "containment" name=ID;
	public ContainedElements getContainedAccess() {
		return pContained;
	}
	
	public ParserRule getContainedRule() {
		return getContainedAccess().getRule();
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
