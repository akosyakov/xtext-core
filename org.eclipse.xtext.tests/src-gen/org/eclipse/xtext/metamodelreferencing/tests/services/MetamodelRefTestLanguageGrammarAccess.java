/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.metamodelreferencing.tests.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MetamodelRefTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FooElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.MetamodelRefTestLanguage.Foo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cNameRefsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameRefsNameRefParserRuleCall_1_0 = (RuleCall)cNameRefsAssignment_1.eContents().get(0);
		
		//Foo :
		//    name=ID (nameRefs+=NameRef)*;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID (nameRefs+=NameRef)*
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//(nameRefs+=NameRef)*
		public Assignment getNameRefsAssignment_1() { return cNameRefsAssignment_1; }
		
		//NameRef
		public RuleCall getNameRefsNameRefParserRuleCall_1_0() { return cNameRefsNameRefParserRuleCall_1_0; }
	}
	public class NameRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.MetamodelRefTestLanguage.NameRef");
		private final Assignment cRuleAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRuleParserRuleCrossReference_0 = (CrossReference)cRuleAssignment.eContents().get(0);
		private final RuleCall cRuleParserRuleIDTerminalRuleCall_0_1 = (RuleCall)cRuleParserRuleCrossReference_0.eContents().get(1);
		
		//NameRef returns xtext::RuleCall :
		//    rule=[xtext::ParserRule];
		@Override public ParserRule getRule() { return rule; }
		
		//rule=[xtext::ParserRule]
		public Assignment getRuleAssignment() { return cRuleAssignment; }
		
		//[xtext::ParserRule]
		public CrossReference getRuleParserRuleCrossReference_0() { return cRuleParserRuleCrossReference_0; }
		
		//ID
		public RuleCall getRuleParserRuleIDTerminalRuleCall_0_1() { return cRuleParserRuleIDTerminalRuleCall_0_1; }
	}
	public class MyRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.MetamodelRefTestLanguage.MyRule");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//MyRule returns xtext::ParserRule :
		//    name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final FooElements pFoo;
	private final NameRefElements pNameRef;
	private final MyRuleElements pMyRule;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MetamodelRefTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFoo = new FooElements();
		this.pNameRef = new NameRefElements();
		this.pMyRule = new MyRuleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.metamodelreferencing.tests.MetamodelRefTestLanguage".equals(grammar.getName())) {
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

	
	//Foo :
	//    name=ID (nameRefs+=NameRef)*;
	public FooElements getFooAccess() {
		return pFoo;
	}
	
	public ParserRule getFooRule() {
		return getFooAccess().getRule();
	}
	
	//NameRef returns xtext::RuleCall :
	//    rule=[xtext::ParserRule];
	public NameRefElements getNameRefAccess() {
		return pNameRef;
	}
	
	public ParserRule getNameRefRule() {
		return getNameRefAccess().getRule();
	}
	
	//MyRule returns xtext::ParserRule :
	//    name=ID;
	public MyRuleElements getMyRuleAccess() {
		return pMyRule;
	}
	
	public ParserRule getMyRuleRule() {
		return getMyRuleAccess().getRule();
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
