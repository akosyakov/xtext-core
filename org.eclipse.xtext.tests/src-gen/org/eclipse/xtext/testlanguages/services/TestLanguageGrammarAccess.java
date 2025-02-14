/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EntryRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.TestLanguage.EntryRule");
		private final Assignment cMultiFeatureAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cMultiFeatureAbstractRuleParserRuleCall_0 = (RuleCall)cMultiFeatureAssignment.eContents().get(0);
		
		//EntryRule returns Model :
		//    (multiFeature+=AbstractRule)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(multiFeature+=AbstractRule)*
		public Assignment getMultiFeatureAssignment() { return cMultiFeatureAssignment; }
		
		//AbstractRule
		public RuleCall getMultiFeatureAbstractRuleParserRuleCall_0() { return cMultiFeatureAbstractRuleParserRuleCall_0; }
	}
	public class AbstractRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.TestLanguage.AbstractRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cChoiceRuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cReducibleRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractRule returns AbstractElement :
		//    ChoiceRule | ReducibleRule;
		@Override public ParserRule getRule() { return rule; }
		
		//ChoiceRule | ReducibleRule
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ChoiceRule
		public RuleCall getChoiceRuleParserRuleCall_0() { return cChoiceRuleParserRuleCall_0; }
		
		//ReducibleRule
		public RuleCall getReducibleRuleParserRuleCall_1() { return cReducibleRuleParserRuleCall_1; }
	}
	public class ChoiceRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.TestLanguage.ChoiceRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChoiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cOptionalKeywordAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cOptionalKeywordOptionalKeyword_1_0 = (Keyword)cOptionalKeywordAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//ChoiceRule returns ChoiceElement :
		//    "choice" (optionalKeyword?='optional')? name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"choice" (optionalKeyword?='optional')? name=ID
		public Group getGroup() { return cGroup; }
		
		//"choice"
		public Keyword getChoiceKeyword_0() { return cChoiceKeyword_0; }
		
		//(optionalKeyword?='optional')?
		public Assignment getOptionalKeywordAssignment_1() { return cOptionalKeywordAssignment_1; }
		
		//'optional'
		public Keyword getOptionalKeywordOptionalKeyword_1_0() { return cOptionalKeywordOptionalKeyword_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	public class ReducibleRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.TestLanguage.ReducibleRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReducibleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTerminalRuleParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Action cReducibleCompositeActionFeatureAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cActionFeatureAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cActionFeatureTerminalRuleParserRuleCall_2_1_0 = (RuleCall)cActionFeatureAssignment_2_1.eContents().get(0);
		
		//ReducibleRule returns ReducibleElement :
		//    "reducible" TerminalRule ( {ReducibleComposite.actionFeature+=current} actionFeature+=TerminalRule )?;
		@Override public ParserRule getRule() { return rule; }
		
		//"reducible" TerminalRule ( {ReducibleComposite.actionFeature+=current} actionFeature+=TerminalRule )?
		public Group getGroup() { return cGroup; }
		
		//"reducible"
		public Keyword getReducibleKeyword_0() { return cReducibleKeyword_0; }
		
		//TerminalRule
		public RuleCall getTerminalRuleParserRuleCall_1() { return cTerminalRuleParserRuleCall_1; }
		
		//( {ReducibleComposite.actionFeature+=current} actionFeature+=TerminalRule )?
		public Group getGroup_2() { return cGroup_2; }
		
		//{ReducibleComposite.actionFeature+=current}
		public Action getReducibleCompositeActionFeatureAction_2_0() { return cReducibleCompositeActionFeatureAction_2_0; }
		
		//actionFeature+=TerminalRule
		public Assignment getActionFeatureAssignment_2_1() { return cActionFeatureAssignment_2_1; }
		
		//TerminalRule
		public RuleCall getActionFeatureTerminalRuleParserRuleCall_2_1_0() { return cActionFeatureTerminalRuleParserRuleCall_2_1_0; }
	}
	public class TerminalRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.TestLanguage.TerminalRule");
		private final Assignment cStringFeatureAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStringFeatureSTRINGTerminalRuleCall_0 = (RuleCall)cStringFeatureAssignment.eContents().get(0);
		
		//TerminalRule returns TerminalElement :
		//    stringFeature=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//stringFeature=STRING
		public Assignment getStringFeatureAssignment() { return cStringFeatureAssignment; }
		
		//STRING
		public RuleCall getStringFeatureSTRINGTerminalRuleCall_0() { return cStringFeatureSTRINGTerminalRuleCall_0; }
	}
	
	
	private final EntryRuleElements pEntryRule;
	private final AbstractRuleElements pAbstractRule;
	private final ChoiceRuleElements pChoiceRule;
	private final ReducibleRuleElements pReducibleRule;
	private final TerminalRuleElements pTerminalRule;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEntryRule = new EntryRuleElements();
		this.pAbstractRule = new AbstractRuleElements();
		this.pChoiceRule = new ChoiceRuleElements();
		this.pReducibleRule = new ReducibleRuleElements();
		this.pTerminalRule = new TerminalRuleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.TestLanguage".equals(grammar.getName())) {
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

	
	//EntryRule returns Model :
	//    (multiFeature+=AbstractRule)*;
	public EntryRuleElements getEntryRuleAccess() {
		return pEntryRule;
	}
	
	public ParserRule getEntryRuleRule() {
		return getEntryRuleAccess().getRule();
	}
	
	//AbstractRule returns AbstractElement :
	//    ChoiceRule | ReducibleRule;
	public AbstractRuleElements getAbstractRuleAccess() {
		return pAbstractRule;
	}
	
	public ParserRule getAbstractRuleRule() {
		return getAbstractRuleAccess().getRule();
	}
	
	//ChoiceRule returns ChoiceElement :
	//    "choice" (optionalKeyword?='optional')? name=ID;
	public ChoiceRuleElements getChoiceRuleAccess() {
		return pChoiceRule;
	}
	
	public ParserRule getChoiceRuleRule() {
		return getChoiceRuleAccess().getRule();
	}
	
	//ReducibleRule returns ReducibleElement :
	//    "reducible" TerminalRule ( {ReducibleComposite.actionFeature+=current} actionFeature+=TerminalRule )?;
	public ReducibleRuleElements getReducibleRuleAccess() {
		return pReducibleRule;
	}
	
	public ParserRule getReducibleRuleRule() {
		return getReducibleRuleAccess().getRule();
	}
	
	//TerminalRule returns TerminalElement :
	//    stringFeature=STRING;
	public TerminalRuleElements getTerminalRuleAccess() {
		return pTerminalRule;
	}
	
	public ParserRule getTerminalRuleRule() {
		return getTerminalRuleAccess().getRule();
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
