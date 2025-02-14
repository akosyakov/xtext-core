/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.nestedRefs.services;

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
public class NestedRefsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DocElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.nestedRefs.NestedRefsTestLanguage.Doc");
		private final Assignment cDeclarationsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDeclarationsSelfReferingDeclParserRuleCall_0 = (RuleCall)cDeclarationsAssignment.eContents().get(0);
		
		//Doc:
		//    (declarations += SelfReferingDecl)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(declarations += SelfReferingDecl)*
		public Assignment getDeclarationsAssignment() { return cDeclarationsAssignment; }
		
		//SelfReferingDecl
		public RuleCall getDeclarationsSelfReferingDeclParserRuleCall_0() { return cDeclarationsSelfReferingDeclParserRuleCall_0; }
	}
	public class SelfReferingDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.nestedRefs.NestedRefsTestLanguage.SelfReferingDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeclKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSelfRefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cSelfRefSelfReferingDeclCrossReference_3_0 = (CrossReference)cSelfRefAssignment_3.eContents().get(0);
		private final RuleCall cSelfRefSelfReferingDeclQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cSelfRefSelfReferingDeclCrossReference_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SelfReferingDecl:
		//    'decl' name=QualifiedName 'end' selfRef=[SelfReferingDecl|QualifiedName] ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'decl' name=QualifiedName 'end' selfRef=[SelfReferingDecl|QualifiedName] ';'
		public Group getGroup() { return cGroup; }
		
		//'decl'
		public Keyword getDeclKeyword_0() { return cDeclKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'end'
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
		
		//selfRef=[SelfReferingDecl|QualifiedName]
		public Assignment getSelfRefAssignment_3() { return cSelfRefAssignment_3; }
		
		//[SelfReferingDecl|QualifiedName]
		public CrossReference getSelfRefSelfReferingDeclCrossReference_3_0() { return cSelfRefSelfReferingDeclCrossReference_3_0; }
		
		//QualifiedName
		public RuleCall getSelfRefSelfReferingDeclQualifiedNameParserRuleCall_3_0_1() { return cSelfRefSelfReferingDeclQualifiedNameParserRuleCall_3_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.nestedRefs.NestedRefsTestLanguage.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//    ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final DocElements pDoc;
	private final SelfReferingDeclElements pSelfReferingDecl;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NestedRefsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDoc = new DocElements();
		this.pSelfReferingDecl = new SelfReferingDeclElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.nestedRefs.NestedRefsTestLanguage".equals(grammar.getName())) {
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

	
	//Doc:
	//    (declarations += SelfReferingDecl)*;
	public DocElements getDocAccess() {
		return pDoc;
	}
	
	public ParserRule getDocRule() {
		return getDocAccess().getRule();
	}
	
	//SelfReferingDecl:
	//    'decl' name=QualifiedName 'end' selfRef=[SelfReferingDecl|QualifiedName] ';';
	public SelfReferingDeclElements getSelfReferingDeclAccess() {
		return pSelfReferingDecl;
	}
	
	public ParserRule getSelfReferingDeclRule() {
		return getSelfReferingDeclAccess().getRule();
	}
	
	//QualifiedName:
	//    ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
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
