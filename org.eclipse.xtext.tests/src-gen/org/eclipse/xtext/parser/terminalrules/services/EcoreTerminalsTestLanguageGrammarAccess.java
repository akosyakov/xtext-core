/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.terminalrules.services;

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
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EcoreTerminalsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cIntKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cIntValuesAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cIntValuesEINTTerminalRuleCall_0_1_0 = (RuleCall)cIntValuesAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDoubleKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cDoubleValuesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cDoubleValuesEDOUBLETerminalRuleCall_1_1_0 = (RuleCall)cDoubleValuesAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDateKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDateValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDateValuesEDATETerminalRuleCall_2_1_0 = (RuleCall)cDateValuesAssignment_2_1.eContents().get(0);
		
		//Model:
		//    ('int' intValues+=EINT
		//    | 'double' doubleValues+=EDOUBLE
		//    | 'date' dateValues+=EDATE)*;
		@Override public ParserRule getRule() { return rule; }
		
		//('int' intValues+=EINT
		//| 'double' doubleValues+=EDOUBLE
		//| 'date' dateValues+=EDATE)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'int' intValues+=EINT
		public Group getGroup_0() { return cGroup_0; }
		
		//'int'
		public Keyword getIntKeyword_0_0() { return cIntKeyword_0_0; }
		
		//intValues+=EINT
		public Assignment getIntValuesAssignment_0_1() { return cIntValuesAssignment_0_1; }
		
		//EINT
		public RuleCall getIntValuesEINTTerminalRuleCall_0_1_0() { return cIntValuesEINTTerminalRuleCall_0_1_0; }
		
		//'double' doubleValues+=EDOUBLE
		public Group getGroup_1() { return cGroup_1; }
		
		//'double'
		public Keyword getDoubleKeyword_1_0() { return cDoubleKeyword_1_0; }
		
		//doubleValues+=EDOUBLE
		public Assignment getDoubleValuesAssignment_1_1() { return cDoubleValuesAssignment_1_1; }
		
		//EDOUBLE
		public RuleCall getDoubleValuesEDOUBLETerminalRuleCall_1_1_0() { return cDoubleValuesEDOUBLETerminalRuleCall_1_1_0; }
		
		//'date' dateValues+=EDATE
		public Group getGroup_2() { return cGroup_2; }
		
		//'date'
		public Keyword getDateKeyword_2_0() { return cDateKeyword_2_0; }
		
		//dateValues+=EDATE
		public Assignment getDateValuesAssignment_2_1() { return cDateValuesAssignment_2_1; }
		
		//EDATE
		public RuleCall getDateValuesEDATETerminalRuleCall_2_1_0() { return cDateValuesEDATETerminalRuleCall_2_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tEDOUBLE;
	private final TerminalRule tEDATE;
	private final TerminalRule tEINT;
	private final TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public EcoreTerminalsTestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.tEDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EDOUBLE");
		this.tEDATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EDATE");
		this.tEINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.EINT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage.WS");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.EcoreTerminalsTestLanguage".equals(grammar.getName())) {
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
	

	
	//Model:
	//    ('int' intValues+=EINT
	//    | 'double' doubleValues+=EDOUBLE
	//    | 'date' dateValues+=EDATE)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//terminal EDOUBLE returns ecore::EDouble:
	//    ('.' ('0'..'9')+ | ('0'..'9')+ '.' ('0'..'9')*) (('E'|'e') ('-' | '+'?) ('0'..'9')+)?;
	public TerminalRule getEDOUBLERule() {
		return tEDOUBLE;
	}
	
	//// the default ecore date format is  "yyyy-MM-dd'T'HH:mm:ss'.'SSSZ"
	//terminal EDATE returns ecore::EDate:
	//    ('0'..'9')('0'..'9')('0'..'9')('0'..'9')'-'('0'..'9')('0'..'9')'-'('0'..'9')('0'..'9')
	//    'T'('0'..'9')('0'..'9')':'('0'..'9')('0'..'9')':'('0'..'9')('0'..'9')'.'('0'..'9')('0'..'9')('0'..'9')
	//    ('+'|'-')('0'..'9')('0'..'9')('0'..'9')('0'..'9');
	public TerminalRule getEDATERule() {
		return tEDATE;
	}
	
	//terminal EINT returns ecore::EInt:
	//    '-'? ('0'..'9')+;
	public TerminalRule getEINTRule() {
		return tEINT;
	}
	
	//terminal WS:
	//    (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
}
