/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.linking.lazy.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class Bug311337TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.Bug311337TestLanguage.Model");
		private final Assignment cDefAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDefDefinitionParserRuleCall_0 = (RuleCall)cDefAssignment.eContents().get(0);
		
		//Model:
		//  (def+=Definition)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(def+=Definition)+
		public Assignment getDefAssignment() { return cDefAssignment; }
		
		//Definition
		public RuleCall getDefDefinitionParserRuleCall_0() { return cDefDefinitionParserRuleCall_0; }
	}
	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.Bug311337TestLanguage.Definition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cChildAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cChildChildParserRuleCall_3_0 = (RuleCall)cChildAssignment_3.eContents().get(0);
		private final Assignment cRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRefReferenceParserRuleCall_4_0 = (RuleCall)cRefAssignment_4.eContents().get(0);
		
		//Definition:
		//  '(def)' name=ID ':' (child+=Child) (ref+=Reference)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'(def)' name=ID ':' (child+=Child) (ref+=Reference)?
		public Group getGroup() { return cGroup; }
		
		//'(def)'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//(child+=Child)
		public Assignment getChildAssignment_3() { return cChildAssignment_3; }
		
		//Child
		public RuleCall getChildChildParserRuleCall_3_0() { return cChildChildParserRuleCall_3_0; }
		
		//(ref+=Reference)?
		public Assignment getRefAssignment_4() { return cRefAssignment_4; }
		
		//Reference
		public RuleCall getRefReferenceParserRuleCall_4_0() { return cRefReferenceParserRuleCall_4_0; }
	}
	public class ChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.Bug311337TestLanguage.Child");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChildKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLinkAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cLinkDefinitionCrossReference_3_0 = (CrossReference)cLinkAssignment_3.eContents().get(0);
		private final RuleCall cLinkDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cLinkDefinitionCrossReference_3_0.eContents().get(1);
		
		//Child:
		//  '(child)' name=ID ':' link=[Definition]?;
		@Override public ParserRule getRule() { return rule; }
		
		//'(child)' name=ID ':' link=[Definition]?
		public Group getGroup() { return cGroup; }
		
		//'(child)'
		public Keyword getChildKeyword_0() { return cChildKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//link=[Definition]?
		public Assignment getLinkAssignment_3() { return cLinkAssignment_3; }
		
		//[Definition]
		public CrossReference getLinkDefinitionCrossReference_3_0() { return cLinkDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getLinkDefinitionIDTerminalRuleCall_3_0_1() { return cLinkDefinitionIDTerminalRuleCall_3_0_1; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.lazy.Bug311337TestLanguage.Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefChildAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefChildChildCrossReference_1_0 = (CrossReference)cRefChildAssignment_1.eContents().get(0);
		private final RuleCall cRefChildChildIDTerminalRuleCall_1_0_1 = (RuleCall)cRefChildChildCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Action cNestedRefLeftAction_2_1 = (Action)cGroup_2.eContents().get(1);
		private final Assignment cRefChildAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final CrossReference cRefChildChildCrossReference_2_2_0 = (CrossReference)cRefChildAssignment_2_2.eContents().get(0);
		private final RuleCall cRefChildChildIDTerminalRuleCall_2_2_0_1 = (RuleCall)cRefChildChildCrossReference_2_2_0.eContents().get(1);
		
		//Reference:
		//  '(ref)' refChild=[Child] (':' {NestedRef.left=current} refChild=[Child])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'(ref)' refChild=[Child] (':' {NestedRef.left=current} refChild=[Child])*
		public Group getGroup() { return cGroup; }
		
		//'(ref)'
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }
		
		//refChild=[Child]
		public Assignment getRefChildAssignment_1() { return cRefChildAssignment_1; }
		
		//[Child]
		public CrossReference getRefChildChildCrossReference_1_0() { return cRefChildChildCrossReference_1_0; }
		
		//ID
		public RuleCall getRefChildChildIDTerminalRuleCall_1_0_1() { return cRefChildChildIDTerminalRuleCall_1_0_1; }
		
		//(':' {NestedRef.left=current} refChild=[Child])*
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//{NestedRef.left=current}
		public Action getNestedRefLeftAction_2_1() { return cNestedRefLeftAction_2_1; }
		
		//refChild=[Child]
		public Assignment getRefChildAssignment_2_2() { return cRefChildAssignment_2_2; }
		
		//[Child]
		public CrossReference getRefChildChildCrossReference_2_2_0() { return cRefChildChildCrossReference_2_2_0; }
		
		//ID
		public RuleCall getRefChildChildIDTerminalRuleCall_2_2_0_1() { return cRefChildChildIDTerminalRuleCall_2_2_0_1; }
	}
	
	
	private final ModelElements pModel;
	private final DefinitionElements pDefinition;
	private final ChildElements pChild;
	private final ReferenceElements pReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug311337TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDefinition = new DefinitionElements();
		this.pChild = new ChildElements();
		this.pReference = new ReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.lazy.Bug311337TestLanguage".equals(grammar.getName())) {
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
	//  (def+=Definition)+;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Definition:
	//  '(def)' name=ID ':' (child+=Child) (ref+=Reference)?;
	public DefinitionElements getDefinitionAccess() {
		return pDefinition;
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}
	
	//Child:
	//  '(child)' name=ID ':' link=[Definition]?;
	public ChildElements getChildAccess() {
		return pChild;
	}
	
	public ParserRule getChildRule() {
		return getChildAccess().getRule();
	}
	
	//Reference:
	//  '(ref)' refChild=[Child] (':' {NestedRef.left=current} refChild=[Child])*;
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
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
