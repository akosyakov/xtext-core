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
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug289515TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug289515TestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDigitOneKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Keyword cValuePercentSignKeyword_0_1_0 = (Keyword)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDigitTwoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cValuePercentSignKeyword_1_1_0 = (Keyword)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDigitThreeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Keyword cValueReverseSolidusPercentSignKeyword_2_1_0 = (Keyword)cValueAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cDigitFourKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Keyword cValueReverseSolidusPercentSignKeyword_3_1_0 = (Keyword)cValueAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cDigitFiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final Keyword cValuePercentSignPercentSignKeyword_4_1_0 = (Keyword)cValueAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cDigitSixKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cValueAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Keyword cValuePercentSignPercentSignKeyword_5_1_0 = (Keyword)cValueAssignment_5_1.eContents().get(0);
		
		//Model:
		//    '1' value="%"
		//  | '2' value='%'
		//  | '3' value="\\%"
		//  | '4' value='\\%'
		//  | '5' value="%%"
		//  | '6' value='%%';
		@Override public ParserRule getRule() { return rule; }
		
		//  '1' value="%"
		//| '2' value='%'
		//| '3' value="\\%"
		//| '4' value='\\%'
		//| '5' value="%%"
		//| '6' value='%%'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'1' value="%"
		public Group getGroup_0() { return cGroup_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_0_0() { return cDigitOneKeyword_0_0; }
		
		//value="%"
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//"%"
		public Keyword getValuePercentSignKeyword_0_1_0() { return cValuePercentSignKeyword_0_1_0; }
		
		//'2' value='%'
		public Group getGroup_1() { return cGroup_1; }
		
		//'2'
		public Keyword getDigitTwoKeyword_1_0() { return cDigitTwoKeyword_1_0; }
		
		//value='%'
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//'%'
		public Keyword getValuePercentSignKeyword_1_1_0() { return cValuePercentSignKeyword_1_1_0; }
		
		//'3' value="\\%"
		public Group getGroup_2() { return cGroup_2; }
		
		//'3'
		public Keyword getDigitThreeKeyword_2_0() { return cDigitThreeKeyword_2_0; }
		
		//value="\\%"
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//"\\%"
		public Keyword getValueReverseSolidusPercentSignKeyword_2_1_0() { return cValueReverseSolidusPercentSignKeyword_2_1_0; }
		
		//'4' value='\\%'
		public Group getGroup_3() { return cGroup_3; }
		
		//'4'
		public Keyword getDigitFourKeyword_3_0() { return cDigitFourKeyword_3_0; }
		
		//value='\\%'
		public Assignment getValueAssignment_3_1() { return cValueAssignment_3_1; }
		
		//'\\%'
		public Keyword getValueReverseSolidusPercentSignKeyword_3_1_0() { return cValueReverseSolidusPercentSignKeyword_3_1_0; }
		
		//'5' value="%%"
		public Group getGroup_4() { return cGroup_4; }
		
		//'5'
		public Keyword getDigitFiveKeyword_4_0() { return cDigitFiveKeyword_4_0; }
		
		//value="%%"
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }
		
		//"%%"
		public Keyword getValuePercentSignPercentSignKeyword_4_1_0() { return cValuePercentSignPercentSignKeyword_4_1_0; }
		
		//'6' value='%%'
		public Group getGroup_5() { return cGroup_5; }
		
		//'6'
		public Keyword getDigitSixKeyword_5_0() { return cDigitSixKeyword_5_0; }
		
		//value='%%'
		public Assignment getValueAssignment_5_1() { return cValueAssignment_5_1; }
		
		//'%%'
		public Keyword getValuePercentSignPercentSignKeyword_5_1_0() { return cValuePercentSignPercentSignKeyword_5_1_0; }
	}
	
	
	private final ModelElements pModel;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug289515TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.antlr.Bug289515TestLanguage".equals(grammar.getName())) {
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
	//    '1' value="%"
	//  | '2' value='%'
	//  | '3' value="\\%"
	//  | '4' value='\\%'
	//  | '5' value="%%"
	//  | '6' value='%%';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
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
