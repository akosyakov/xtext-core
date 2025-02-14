/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.assignments.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
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
public class Bug287184TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDetailAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cDetailAlternatives_2_0 = (Alternatives)cDetailAssignment_2.eContents().get(0);
		private final RuleCall cDetailDetailParserRuleCall_2_0_0 = (RuleCall)cDetailAlternatives_2_0.eContents().get(0);
		private final RuleCall cDetailAssociatedDetailParserRuleCall_2_0_1 = (RuleCall)cDetailAlternatives_2_0.eContents().get(1);
		
		//Model:
		//   "model" name=FQN detail+=(Detail|AssociatedDetail)+;
		@Override public ParserRule getRule() { return rule; }
		
		//"model" name=FQN detail+=(Detail|AssociatedDetail)+
		public Group getGroup() { return cGroup; }
		
		//"model"
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }
		
		//name=FQN
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0() { return cNameFQNParserRuleCall_1_0; }
		
		//detail+=(Detail|AssociatedDetail)+
		public Assignment getDetailAssignment_2() { return cDetailAssignment_2; }
		
		//(Detail|AssociatedDetail)
		public Alternatives getDetailAlternatives_2_0() { return cDetailAlternatives_2_0; }
		
		//Detail
		public RuleCall getDetailDetailParserRuleCall_2_0_0() { return cDetailDetailParserRuleCall_2_0_0; }
		
		//AssociatedDetail
		public RuleCall getDetailAssociatedDetailParserRuleCall_2_0_1() { return cDetailAssociatedDetailParserRuleCall_2_0_1; }
	}
	public class AbstractDetailElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.AbstractDetail");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDetailParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAssociatedDetailParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractDetail:
		//        Detail | AssociatedDetail;
		@Override public ParserRule getRule() { return rule; }
		
		//Detail | AssociatedDetail
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Detail
		public RuleCall getDetailParserRuleCall_0() { return cDetailParserRuleCall_0; }
		
		//AssociatedDetail
		public RuleCall getAssociatedDetailParserRuleCall_1() { return cAssociatedDetailParserRuleCall_1; }
	}
	public class DetailElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.Detail");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDetailKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVisibilityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cVisibilityAlternatives_1_0 = (Alternatives)cVisibilityAssignment_1.eContents().get(0);
		private final Keyword cVisibilityPrivateKeyword_1_0_0 = (Keyword)cVisibilityAlternatives_1_0.eContents().get(0);
		private final Keyword cVisibilityProtectedKeyword_1_0_1 = (Keyword)cVisibilityAlternatives_1_0.eContents().get(1);
		private final Keyword cVisibilityPublicKeyword_1_0_2 = (Keyword)cVisibilityAlternatives_1_0.eContents().get(2);
		private final Assignment cDetailClassAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cDetailClassModelCrossReference_2_0 = (CrossReference)cDetailClassAssignment_2.eContents().get(0);
		private final RuleCall cDetailClassModelFQNParserRuleCall_2_0_1 = (RuleCall)cDetailClassModelCrossReference_2_0.eContents().get(1);
		
		//Detail:
		//        "detail" visibility=("private"|"protected"|"public")? detailClass=[Model|FQN];
		@Override public ParserRule getRule() { return rule; }
		
		//"detail" visibility=("private"|"protected"|"public")? detailClass=[Model|FQN]
		public Group getGroup() { return cGroup; }
		
		//"detail"
		public Keyword getDetailKeyword_0() { return cDetailKeyword_0; }
		
		//visibility=("private"|"protected"|"public")?
		public Assignment getVisibilityAssignment_1() { return cVisibilityAssignment_1; }
		
		//("private"|"protected"|"public")
		public Alternatives getVisibilityAlternatives_1_0() { return cVisibilityAlternatives_1_0; }
		
		//"private"
		public Keyword getVisibilityPrivateKeyword_1_0_0() { return cVisibilityPrivateKeyword_1_0_0; }
		
		//"protected"
		public Keyword getVisibilityProtectedKeyword_1_0_1() { return cVisibilityProtectedKeyword_1_0_1; }
		
		//"public"
		public Keyword getVisibilityPublicKeyword_1_0_2() { return cVisibilityPublicKeyword_1_0_2; }
		
		//detailClass=[Model|FQN]
		public Assignment getDetailClassAssignment_2() { return cDetailClassAssignment_2; }
		
		//[Model|FQN]
		public CrossReference getDetailClassModelCrossReference_2_0() { return cDetailClassModelCrossReference_2_0; }
		
		//FQN
		public RuleCall getDetailClassModelFQNParserRuleCall_2_0_1() { return cDetailClassModelFQNParserRuleCall_2_0_1; }
	}
	public class AssociatedDetailElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.AssociatedDetail");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssociatedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDetailClassAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDetailClassModelCrossReference_1_0 = (CrossReference)cDetailClassAssignment_1.eContents().get(0);
		private final RuleCall cDetailClassModelFQNParserRuleCall_1_0_1 = (RuleCall)cDetailClassModelCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AssociatedDetail:
		//        "associated" detailClass=[Model|FQN] ";";
		@Override public ParserRule getRule() { return rule; }
		
		//"associated" detailClass=[Model|FQN] ";"
		public Group getGroup() { return cGroup; }
		
		//"associated"
		public Keyword getAssociatedKeyword_0() { return cAssociatedKeyword_0; }
		
		//detailClass=[Model|FQN]
		public Assignment getDetailClassAssignment_1() { return cDetailClassAssignment_1; }
		
		//[Model|FQN]
		public CrossReference getDetailClassModelCrossReference_1_0() { return cDetailClassModelCrossReference_1_0; }
		
		//FQN
		public RuleCall getDetailClassModelFQNParserRuleCall_1_0_1() { return cDetailClassModelFQNParserRuleCall_1_0_1; }
		
		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.Bug287184TestLanguage.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN: ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ("." ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final ModelElements pModel;
	private final AbstractDetailElements pAbstractDetail;
	private final DetailElements pDetail;
	private final AssociatedDetailElements pAssociatedDetail;
	private final FQNElements pFQN;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug287184TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAbstractDetail = new AbstractDetailElements();
		this.pDetail = new DetailElements();
		this.pAssociatedDetail = new AssociatedDetailElements();
		this.pFQN = new FQNElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.assignments.Bug287184TestLanguage".equals(grammar.getName())) {
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
	//   "model" name=FQN detail+=(Detail|AssociatedDetail)+;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//AbstractDetail:
	//        Detail | AssociatedDetail;
	public AbstractDetailElements getAbstractDetailAccess() {
		return pAbstractDetail;
	}
	
	public ParserRule getAbstractDetailRule() {
		return getAbstractDetailAccess().getRule();
	}
	
	//Detail:
	//        "detail" visibility=("private"|"protected"|"public")? detailClass=[Model|FQN];
	public DetailElements getDetailAccess() {
		return pDetail;
	}
	
	public ParserRule getDetailRule() {
		return getDetailAccess().getRule();
	}
	
	//AssociatedDetail:
	//        "associated" detailClass=[Model|FQN] ";";
	public AssociatedDetailElements getAssociatedDetailAccess() {
		return pAssociatedDetail;
	}
	
	public ParserRule getAssociatedDetailRule() {
		return getAssociatedDetailAccess().getRule();
	}
	
	//FQN: ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
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
