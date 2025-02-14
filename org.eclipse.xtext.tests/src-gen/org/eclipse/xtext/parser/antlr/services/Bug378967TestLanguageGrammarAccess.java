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
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
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
public class Bug378967TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Root");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDigitOneKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cElementAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cElementRule1ParserRuleCall_0_1_0 = (RuleCall)cElementAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDigitTwoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cElementAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cElementRule2ParserRuleCall_1_1_0 = (RuleCall)cElementAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDigitThreeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cElementAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cElementRule3ParserRuleCall_2_1_0 = (RuleCall)cElementAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cDigitFourKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cElementAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cElementRule4ParserRuleCall_3_1_0 = (RuleCall)cElementAssignment_3_1.eContents().get(0);
		
		//Root:
		//    ('1' element=Rule1 | '2' element=Rule2 | '3' element=Rule3| '4' element=Rule4);
		@Override public ParserRule getRule() { return rule; }
		
		//('1' element=Rule1 | '2' element=Rule2 | '3' element=Rule3| '4' element=Rule4)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'1' element=Rule1
		public Group getGroup_0() { return cGroup_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_0_0() { return cDigitOneKeyword_0_0; }
		
		//element=Rule1
		public Assignment getElementAssignment_0_1() { return cElementAssignment_0_1; }
		
		//Rule1
		public RuleCall getElementRule1ParserRuleCall_0_1_0() { return cElementRule1ParserRuleCall_0_1_0; }
		
		//'2' element=Rule2
		public Group getGroup_1() { return cGroup_1; }
		
		//'2'
		public Keyword getDigitTwoKeyword_1_0() { return cDigitTwoKeyword_1_0; }
		
		//element=Rule2
		public Assignment getElementAssignment_1_1() { return cElementAssignment_1_1; }
		
		//Rule2
		public RuleCall getElementRule2ParserRuleCall_1_1_0() { return cElementRule2ParserRuleCall_1_1_0; }
		
		//'3' element=Rule3
		public Group getGroup_2() { return cGroup_2; }
		
		//'3'
		public Keyword getDigitThreeKeyword_2_0() { return cDigitThreeKeyword_2_0; }
		
		//element=Rule3
		public Assignment getElementAssignment_2_1() { return cElementAssignment_2_1; }
		
		//Rule3
		public RuleCall getElementRule3ParserRuleCall_2_1_0() { return cElementRule3ParserRuleCall_2_1_0; }
		
		//'4' element=Rule4
		public Group getGroup_3() { return cGroup_3; }
		
		//'4'
		public Keyword getDigitFourKeyword_3_0() { return cDigitFourKeyword_3_0; }
		
		//element=Rule4
		public Assignment getElementAssignment_3_1() { return cElementAssignment_3_1; }
		
		//Rule4
		public RuleCall getElementRule4ParserRuleCall_3_1_0() { return cElementRule4ParserRuleCall_3_1_0; }
	}
	public class Rule1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeFirstEnumEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cUnitAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUnitSecondEnumEnumRuleCall_2_0 = (RuleCall)cUnitAssignment_2.eContents().get(0);
		
		//Rule1:
		//    type=FirstEnum value=INT unit=SecondEnum
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//type=FirstEnum value=INT unit=SecondEnum
		public Group getGroup() { return cGroup; }
		
		//type=FirstEnum
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//FirstEnum
		public RuleCall getTypeFirstEnumEnumRuleCall_0_0() { return cTypeFirstEnumEnumRuleCall_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//unit=SecondEnum
		public Assignment getUnitAssignment_2() { return cUnitAssignment_2; }
		
		//SecondEnum
		public RuleCall getUnitSecondEnumEnumRuleCall_2_0() { return cUnitSecondEnumEnumRuleCall_2_0; }
	}
	public class Rule2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAfterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Keyword cSKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Rule2:
		//    'after' value =INT 's'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'after' value =INT 's'
		public Group getGroup() { return cGroup; }
		
		//'after'
		public Keyword getAfterKeyword_0() { return cAfterKeyword_0; }
		
		//value =INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//'s'
		public Keyword getSKeyword_2() { return cSKeyword_2; }
	}
	public class Rule3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAfterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final RuleCall cSParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Rule3:
		//     After value=INT S
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//After value=INT S
		public Group getGroup() { return cGroup; }
		
		//After
		public RuleCall getAfterParserRuleCall_0() { return cAfterParserRuleCall_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//S
		public RuleCall getSParserRuleCall_2() { return cSParserRuleCall_2; }
	}
	public class Rule4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.Rule4");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAfterAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAfterAfterObjParserRuleCall_0_0 = (RuleCall)cAfterAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cSAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSSObjParserRuleCall_2_0 = (RuleCall)cSAssignment_2.eContents().get(0);
		
		//Rule4:
		//    after= AfterObj value=INT s=SObj
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//after= AfterObj value=INT s=SObj
		public Group getGroup() { return cGroup; }
		
		//after= AfterObj
		public Assignment getAfterAssignment_0() { return cAfterAssignment_0; }
		
		//AfterObj
		public RuleCall getAfterAfterObjParserRuleCall_0_0() { return cAfterAfterObjParserRuleCall_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//s=SObj
		public Assignment getSAssignment_2() { return cSAssignment_2; }
		
		//SObj
		public RuleCall getSSObjParserRuleCall_2_0() { return cSSObjParserRuleCall_2_0; }
	}
	public class AfterObjElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.AfterObj");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueAfterKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//AfterObj:
		//    value='after'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value='after'
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//'after'
		public Keyword getValueAfterKeyword_0() { return cValueAfterKeyword_0; }
	}
	public class SObjElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.SObj");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueSKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//SObj:
		//    value='s'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value='s'
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//'s'
		public Keyword getValueSKeyword_0() { return cValueSKeyword_0; }
	}
	public class AfterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.After");
		private final Keyword cAfterKeyword = (Keyword)rule.eContents().get(1);
		
		//After:
		//    'after'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'after'
		public Keyword getAfterKeyword() { return cAfterKeyword; }
	}
	public class SElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.S");
		private final Keyword cSKeyword = (Keyword)rule.eContents().get(1);
		
		//S:
		//    's'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'s'
		public Keyword getSKeyword() { return cSKeyword; }
	}
	
	public class FirstEnumElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.FirstEnum");
		private final EnumLiteralDeclaration cValueEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cValueAfterKeyword_0 = (Keyword)cValueEnumLiteralDeclaration.eContents().get(0);
		
		//enum FirstEnum:
		//    value='after';
		public EnumRule getRule() { return rule; }
		
		//value='after'
		public EnumLiteralDeclaration getValueEnumLiteralDeclaration() { return cValueEnumLiteralDeclaration; }
		
		//'after'
		public Keyword getValueAfterKeyword_0() { return cValueAfterKeyword_0; }
	}
	public class SecondEnumElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug378967TestLanguage.SecondEnum");
		private final EnumLiteralDeclaration cValueEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cValueSKeyword_0 = (Keyword)cValueEnumLiteralDeclaration.eContents().get(0);
		
		//enum SecondEnum:
		//    value='s';
		public EnumRule getRule() { return rule; }
		
		//value='s'
		public EnumLiteralDeclaration getValueEnumLiteralDeclaration() { return cValueEnumLiteralDeclaration; }
		
		//'s'
		public Keyword getValueSKeyword_0() { return cValueSKeyword_0; }
	}
	
	private final RootElements pRoot;
	private final Rule1Elements pRule1;
	private final Rule2Elements pRule2;
	private final Rule3Elements pRule3;
	private final Rule4Elements pRule4;
	private final FirstEnumElements eFirstEnum;
	private final SecondEnumElements eSecondEnum;
	private final AfterObjElements pAfterObj;
	private final SObjElements pSObj;
	private final AfterElements pAfter;
	private final SElements pS;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug378967TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRoot = new RootElements();
		this.pRule1 = new Rule1Elements();
		this.pRule2 = new Rule2Elements();
		this.pRule3 = new Rule3Elements();
		this.pRule4 = new Rule4Elements();
		this.eFirstEnum = new FirstEnumElements();
		this.eSecondEnum = new SecondEnumElements();
		this.pAfterObj = new AfterObjElements();
		this.pSObj = new SObjElements();
		this.pAfter = new AfterElements();
		this.pS = new SElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.antlr.Bug378967TestLanguage".equals(grammar.getName())) {
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

	
	//Root:
	//    ('1' element=Rule1 | '2' element=Rule2 | '3' element=Rule3| '4' element=Rule4);
	public RootElements getRootAccess() {
		return pRoot;
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}
	
	//Rule1:
	//    type=FirstEnum value=INT unit=SecondEnum
	//;
	public Rule1Elements getRule1Access() {
		return pRule1;
	}
	
	public ParserRule getRule1Rule() {
		return getRule1Access().getRule();
	}
	
	//Rule2:
	//    'after' value =INT 's'
	//;
	public Rule2Elements getRule2Access() {
		return pRule2;
	}
	
	public ParserRule getRule2Rule() {
		return getRule2Access().getRule();
	}
	
	//Rule3:
	//     After value=INT S
	//;
	public Rule3Elements getRule3Access() {
		return pRule3;
	}
	
	public ParserRule getRule3Rule() {
		return getRule3Access().getRule();
	}
	
	//Rule4:
	//    after= AfterObj value=INT s=SObj
	//;
	public Rule4Elements getRule4Access() {
		return pRule4;
	}
	
	public ParserRule getRule4Rule() {
		return getRule4Access().getRule();
	}
	
	//enum FirstEnum:
	//    value='after';
	public FirstEnumElements getFirstEnumAccess() {
		return eFirstEnum;
	}
	
	public EnumRule getFirstEnumRule() {
		return getFirstEnumAccess().getRule();
	}
	
	//enum SecondEnum:
	//    value='s';
	public SecondEnumElements getSecondEnumAccess() {
		return eSecondEnum;
	}
	
	public EnumRule getSecondEnumRule() {
		return getSecondEnumAccess().getRule();
	}
	
	//AfterObj:
	//    value='after'
	//;
	public AfterObjElements getAfterObjAccess() {
		return pAfterObj;
	}
	
	public ParserRule getAfterObjRule() {
		return getAfterObjAccess().getRule();
	}
	
	//SObj:
	//    value='s'
	//;
	public SObjElements getSObjAccess() {
		return pSObj;
	}
	
	public ParserRule getSObjRule() {
		return getSObjAccess().getRule();
	}
	
	//After:
	//    'after'
	//;
	public AfterElements getAfterAccess() {
		return pAfter;
	}
	
	public ParserRule getAfterRule() {
		return getAfterAccess().getRule();
	}
	
	//S:
	//    's'
	//;
	public SElements getSAccess() {
		return pS;
	}
	
	public ParserRule getSRule() {
		return getSAccess().getRule();
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
