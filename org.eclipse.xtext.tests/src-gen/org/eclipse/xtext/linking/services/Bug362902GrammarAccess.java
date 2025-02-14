/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.linking.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class Bug362902GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug362902.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cGreetingsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cGreetingsGreetingParserRuleCall_0_0 = (RuleCall)cGreetingsAssignment_0.eContents().get(0);
		private final Keyword cFavouriteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFavouriteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFavouriteGreetingCrossReference_2_0 = (CrossReference)cFavouriteAssignment_2.eContents().get(0);
		private final RuleCall cFavouriteGreetingMyIdParserRuleCall_2_0_1 = (RuleCall)cFavouriteGreetingCrossReference_2_0.eContents().get(1);
		
		//Model:
		//    greetings+=Greeting*
		//    'favourite' favourite=[Greeting|MyId];
		@Override public ParserRule getRule() { return rule; }
		
		//greetings+=Greeting*
		//'favourite' favourite=[Greeting|MyId]
		public Group getGroup() { return cGroup; }
		
		//greetings+=Greeting*
		public Assignment getGreetingsAssignment_0() { return cGreetingsAssignment_0; }
		
		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_0_0() { return cGreetingsGreetingParserRuleCall_0_0; }
		
		//'favourite'
		public Keyword getFavouriteKeyword_1() { return cFavouriteKeyword_1; }
		
		//favourite=[Greeting|MyId]
		public Assignment getFavouriteAssignment_2() { return cFavouriteAssignment_2; }
		
		//[Greeting|MyId]
		public CrossReference getFavouriteGreetingCrossReference_2_0() { return cFavouriteGreetingCrossReference_2_0; }
		
		//MyId
		public RuleCall getFavouriteGreetingMyIdParserRuleCall_2_0_1() { return cFavouriteGreetingMyIdParserRuleCall_2_0_1; }
	}
	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug362902.Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHelloKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameMyIdParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Greeting:
		//    'Hello' name=MyId '!';
		@Override public ParserRule getRule() { return rule; }
		
		//'Hello' name=MyId '!'
		public Group getGroup() { return cGroup; }
		
		//'Hello'
		public Keyword getHelloKeyword_0() { return cHelloKeyword_0; }
		
		//name=MyId
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//MyId
		public RuleCall getNameMyIdParserRuleCall_1_0() { return cNameMyIdParserRuleCall_1_0; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_2() { return cExclamationMarkKeyword_2; }
	}
	public class MyIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug362902.MyId");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//MyId returns ecore::EString :
		//    ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final GreetingElements pGreeting;
	private final MyIdElements pMyId;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug362902GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pGreeting = new GreetingElements();
		this.pMyId = new MyIdElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.Bug362902".equals(grammar.getName())) {
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

	
	//Model:
	//    greetings+=Greeting*
	//    'favourite' favourite=[Greeting|MyId];
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Greeting:
	//    'Hello' name=MyId '!';
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}
	
	//MyId returns ecore::EString :
	//    ID;
	public MyIdElements getMyIdAccess() {
		return pMyId;
	}
	
	public ParserRule getMyIdRule() {
		return getMyIdAccess().getRule();
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
