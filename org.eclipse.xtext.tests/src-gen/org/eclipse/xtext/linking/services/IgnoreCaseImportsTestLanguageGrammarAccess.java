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
public class IgnoreCaseImportsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.IgnoreCaseImportsTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsElementParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		
		//@Override
		//Model:
		//    imports += Import*
		//    elements += Element+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//imports += Import*
		//elements += Element+
		public Group getGroup() { return cGroup; }
		
		//imports += Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }
		
		//elements += Element+
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_1_0() { return cElementsElementParserRuleCall_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.IgnoreCaseImportsTestLanguage.Import");
		private final Assignment cImportURIAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_0 = (RuleCall)cImportURIAssignment.eContents().get(0);
		
		//Import:
		//    importURI = STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//importURI = STRING
		public Assignment getImportURIAssignment() { return cImportURIAssignment; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_0() { return cImportURISTRINGTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final ImportElements pImport;
	
	private final Grammar grammar;
	
	private final AbstractIgnoreCaseLinkingTestLanguageGrammarAccess gaAbstractIgnoreCaseLinkingTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public IgnoreCaseImportsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			AbstractIgnoreCaseLinkingTestLanguageGrammarAccess gaAbstractIgnoreCaseLinkingTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaAbstractIgnoreCaseLinkingTestLanguage = gaAbstractIgnoreCaseLinkingTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pImport = new ImportElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.IgnoreCaseImportsTestLanguage".equals(grammar.getName())) {
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
	
	
	public AbstractIgnoreCaseLinkingTestLanguageGrammarAccess getAbstractIgnoreCaseLinkingTestLanguageGrammarAccess() {
		return gaAbstractIgnoreCaseLinkingTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//@Override
	//Model:
	//    imports += Import*
	//    elements += Element+
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Import:
	//    importURI = STRING
	//;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//Element:
	//    name=ID reference=[Element]? '{'
	//        elements += Element*
	//    '}'
	//;
	public AbstractIgnoreCaseLinkingTestLanguageGrammarAccess.ElementElements getElementAccess() {
		return gaAbstractIgnoreCaseLinkingTestLanguage.getElementAccess();
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
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
