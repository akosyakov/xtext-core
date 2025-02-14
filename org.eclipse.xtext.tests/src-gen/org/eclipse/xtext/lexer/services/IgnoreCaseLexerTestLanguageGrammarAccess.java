/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.lexer.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class IgnoreCaseLexerTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.IgnoreCaseLexerTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFooKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cValueCaSeKeyword_2_0 = (Keyword)cValueAssignment_2.eContents().get(0);
		
		//Model :
		//    "case" "foo"? value="CaSe";
		@Override public ParserRule getRule() { return rule; }
		
		//"case" "foo"? value="CaSe"
		public Group getGroup() { return cGroup; }
		
		//"case"
		public Keyword getCaseKeyword_0() { return cCaseKeyword_0; }
		
		//"foo"?
		public Keyword getFooKeyword_1() { return cFooKeyword_1; }
		
		//value="CaSe"
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//"CaSe"
		public Keyword getValueCaSeKeyword_2_0() { return cValueCaSeKeyword_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tWS;
	private final TerminalRule tSL_COMMENT;
	
	private final Grammar grammar;

	@Inject
	public IgnoreCaseLexerTestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.IgnoreCaseLexerTestLanguage.WS");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.IgnoreCaseLexerTestLanguage.SL_COMMENT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.lexer.IgnoreCaseLexerTestLanguage".equals(grammar.getName())) {
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
	

	
	//Model :
	//    "case" "foo"? value="CaSe";
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
}
