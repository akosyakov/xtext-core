/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.reconstr.services;

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
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug302128TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.Bug302128TestLanguage.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model :
		//    (elements+=Element)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements+=Element)*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_0() { return cElementsElementParserRuleCall_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.Bug302128TestLanguage.Element");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameVariableParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueValueTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Element: name=Variable (value=Value)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=Variable (value=Value)?
		public Group getGroup() { return cGroup; }
		
		//name=Variable
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Variable
		public RuleCall getNameVariableParserRuleCall_0_0() { return cNameVariableParserRuleCall_0_0; }
		
		//(value=Value)?
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//Value
		public RuleCall getValueValueTerminalRuleCall_1_0() { return cValueValueTerminalRuleCall_1_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.Bug302128TestLanguage.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Keyword cFullStopKeyword_1_0_0 = (Keyword)cAlternatives_1_0.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1 = (Keyword)cAlternatives_1_0.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Variable: ID (('.'|'-') ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID (('.'|'-') ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//(('.'|'-') ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//('.'|'-')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0_0() { return cFullStopKeyword_1_0_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1() { return cHyphenMinusKeyword_1_0_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final VariableElements pVariable;
	private final TerminalRule tValue;
	private final TerminalRule tSL_COMMENT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug302128TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pVariable = new VariableElements();
		this.tValue = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.Bug302128TestLanguage.Value");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.Bug302128TestLanguage.SL_COMMENT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.reconstr.Bug302128TestLanguage".equals(grammar.getName())) {
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
	//    (elements+=Element)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element: name=Variable (value=Value)?;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//Variable: ID (('.'|'-') ID)*;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	///* SuppressWarnings[InvalidTerminalruleName] */
	//terminal Value: ('='|'+='|'-=') -> '\n';
	public TerminalRule getValueRule() {
		return tValue;
	}
	
	//@Override
	//terminal SL_COMMENT: '#' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
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
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
