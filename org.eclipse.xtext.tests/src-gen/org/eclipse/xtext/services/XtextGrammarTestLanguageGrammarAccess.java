/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class XtextGrammarTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GrammarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Grammar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGrammarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameGrammarIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cWithKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cUsedGrammarsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cUsedGrammarsGrammarCrossReference_2_1_0 = (CrossReference)cUsedGrammarsAssignment_2_1.eContents().get(0);
		private final RuleCall cUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1 = (RuleCall)cUsedGrammarsGrammarCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cUsedGrammarsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cUsedGrammarsGrammarCrossReference_2_2_1_0 = (CrossReference)cUsedGrammarsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1 = (RuleCall)cUsedGrammarsGrammarCrossReference_2_2_1_0.eContents().get(1);
		private final RuleCall cHiddenClauseParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cMetamodelDeclarationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0 = (RuleCall)cMetamodelDeclarationsAssignment_4.eContents().get(0);
		private final Assignment cRulesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRulesAbstractRuleParserRuleCall_5_0 = (RuleCall)cRulesAssignment_5.eContents().get(0);
		
		//Grammar:
		//    'grammar' name=GrammarID ('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
		//    HiddenClause?
		//    metamodelDeclarations+=AbstractMetamodelDeclaration*
		//    (rules+=AbstractRule)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'grammar' name=GrammarID ('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
		//HiddenClause?
		//metamodelDeclarations+=AbstractMetamodelDeclaration*
		//(rules+=AbstractRule)+
		public Group getGroup() { return cGroup; }
		
		//'grammar'
		public Keyword getGrammarKeyword_0() { return cGrammarKeyword_0; }
		
		//name=GrammarID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//GrammarID
		public RuleCall getNameGrammarIDParserRuleCall_1_0() { return cNameGrammarIDParserRuleCall_1_0; }
		
		//('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'with'
		public Keyword getWithKeyword_2_0() { return cWithKeyword_2_0; }
		
		//usedGrammars+=[Grammar|GrammarID]
		public Assignment getUsedGrammarsAssignment_2_1() { return cUsedGrammarsAssignment_2_1; }
		
		//[Grammar|GrammarID]
		public CrossReference getUsedGrammarsGrammarCrossReference_2_1_0() { return cUsedGrammarsGrammarCrossReference_2_1_0; }
		
		//GrammarID
		public RuleCall getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1() { return cUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1; }
		
		//(',' usedGrammars+=[Grammar|GrammarID])*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//usedGrammars+=[Grammar|GrammarID]
		public Assignment getUsedGrammarsAssignment_2_2_1() { return cUsedGrammarsAssignment_2_2_1; }
		
		//[Grammar|GrammarID]
		public CrossReference getUsedGrammarsGrammarCrossReference_2_2_1_0() { return cUsedGrammarsGrammarCrossReference_2_2_1_0; }
		
		//GrammarID
		public RuleCall getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1() { return cUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1; }
		
		//HiddenClause?
		public RuleCall getHiddenClauseParserRuleCall_3() { return cHiddenClauseParserRuleCall_3; }
		
		//metamodelDeclarations+=AbstractMetamodelDeclaration*
		public Assignment getMetamodelDeclarationsAssignment_4() { return cMetamodelDeclarationsAssignment_4; }
		
		//AbstractMetamodelDeclaration
		public RuleCall getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0() { return cMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0; }
		
		//(rules+=AbstractRule)+
		public Assignment getRulesAssignment_5() { return cRulesAssignment_5; }
		
		//AbstractRule
		public RuleCall getRulesAbstractRuleParserRuleCall_5_0() { return cRulesAbstractRuleParserRuleCall_5_0; }
	}
	public class HiddenClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.HiddenClause");
		private final Group cGroup = (Group)rule.eContents().get(0);
		private final Assignment cDefinesHiddenTokensAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cDefinesHiddenTokensHiddenKeyword_0_0 = (Keyword)cDefinesHiddenTokensAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cHiddenTokensAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final CrossReference cHiddenTokensAbstractRuleCrossReference_2_0_0 = (CrossReference)cHiddenTokensAssignment_2_0.eContents().get(0);
		private final RuleCall cHiddenTokensAbstractRuleIDTerminalRuleCall_2_0_0_1 = (RuleCall)cHiddenTokensAbstractRuleCrossReference_2_0_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cHiddenTokensAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cHiddenTokensAbstractRuleCrossReference_2_1_1_0 = (CrossReference)cHiddenTokensAssignment_2_1_1.eContents().get(0);
		private final RuleCall cHiddenTokensAbstractRuleIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cHiddenTokensAbstractRuleCrossReference_2_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//fragment HiddenClause *:
		//    (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')
		public Group getGroup() { return cGroup; }
		
		//definesHiddenTokens?='hidden'
		public Assignment getDefinesHiddenTokensAssignment_0() { return cDefinesHiddenTokensAssignment_0; }
		
		//'hidden'
		public Keyword getDefinesHiddenTokensHiddenKeyword_0_0() { return cDefinesHiddenTokensHiddenKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//hiddenTokens+=[AbstractRule]
		public Assignment getHiddenTokensAssignment_2_0() { return cHiddenTokensAssignment_2_0; }
		
		//[AbstractRule]
		public CrossReference getHiddenTokensAbstractRuleCrossReference_2_0_0() { return cHiddenTokensAbstractRuleCrossReference_2_0_0; }
		
		//ID
		public RuleCall getHiddenTokensAbstractRuleIDTerminalRuleCall_2_0_0_1() { return cHiddenTokensAbstractRuleIDTerminalRuleCall_2_0_0_1; }
		
		//(',' hiddenTokens+=[AbstractRule])*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//hiddenTokens+=[AbstractRule]
		public Assignment getHiddenTokensAssignment_2_1_1() { return cHiddenTokensAssignment_2_1_1; }
		
		//[AbstractRule]
		public CrossReference getHiddenTokensAbstractRuleCrossReference_2_1_1_0() { return cHiddenTokensAbstractRuleCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getHiddenTokensAbstractRuleIDTerminalRuleCall_2_1_1_0_1() { return cHiddenTokensAbstractRuleIDTerminalRuleCall_2_1_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class GrammarIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.GrammarID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//GrammarID returns ecore::EString:
		//  ID ('.' ID)*;
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
	public class AbstractRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AbstractRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParserRuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTerminalRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumRuleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractRule : ParserRule | TerminalRule | EnumRule;
		@Override public ParserRule getRule() { return rule; }
		
		//ParserRule | TerminalRule | EnumRule
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ParserRule
		public RuleCall getParserRuleParserRuleCall_0() { return cParserRuleParserRuleCall_0; }
		
		//TerminalRule
		public RuleCall getTerminalRuleParserRuleCall_1() { return cTerminalRuleParserRuleCall_1; }
		
		//EnumRule
		public RuleCall getEnumRuleParserRuleCall_2() { return cEnumRuleParserRuleCall_2; }
	}
	public class AbstractMetamodelDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AbstractMetamodelDeclaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGeneratedMetamodelParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cReferencedMetamodelParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractMetamodelDeclaration :
		//    GeneratedMetamodel | ReferencedMetamodel;
		@Override public ParserRule getRule() { return rule; }
		
		//GeneratedMetamodel | ReferencedMetamodel
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GeneratedMetamodel
		public RuleCall getGeneratedMetamodelParserRuleCall_0() { return cGeneratedMetamodelParserRuleCall_0; }
		
		//ReferencedMetamodel
		public RuleCall getReferencedMetamodelParserRuleCall_1() { return cReferencedMetamodelParserRuleCall_1; }
	}
	public class GeneratedMetamodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.GeneratedMetamodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGenerateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cEPackageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEPackageEPackageCrossReference_2_0 = (CrossReference)cEPackageAssignment_2.eContents().get(0);
		private final RuleCall cEPackageEPackageSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cEPackageEPackageCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAliasAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_3_1_0 = (RuleCall)cAliasAssignment_3_1.eContents().get(0);
		
		//// constraint: typeSelect(GeneratedMetamodel).size() == typeSelect(GeneratedMetamodel).alias.size()
		//// generated metamodels have to have different aliases
		//GeneratedMetamodel :
		//    'generate' name=ID ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'generate' name=ID ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?
		public Group getGroup() { return cGroup; }
		
		//'generate'
		public Keyword getGenerateKeyword_0() { return cGenerateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//ePackage=[ecore::EPackage|STRING]
		public Assignment getEPackageAssignment_2() { return cEPackageAssignment_2; }
		
		//[ecore::EPackage|STRING]
		public CrossReference getEPackageEPackageCrossReference_2_0() { return cEPackageEPackageCrossReference_2_0; }
		
		//STRING
		public RuleCall getEPackageEPackageSTRINGTerminalRuleCall_2_0_1() { return cEPackageEPackageSTRINGTerminalRuleCall_2_0_1; }
		
		//('as' alias=ID)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'as'
		public Keyword getAsKeyword_3_0() { return cAsKeyword_3_0; }
		
		//alias=ID
		public Assignment getAliasAssignment_3_1() { return cAliasAssignment_3_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_3_1_0() { return cAliasIDTerminalRuleCall_3_1_0; }
	}
	public class ReferencedMetamodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.ReferencedMetamodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEPackageEPackageCrossReference_1_0 = (CrossReference)cEPackageAssignment_1.eContents().get(0);
		private final RuleCall cEPackageEPackageSTRINGTerminalRuleCall_1_0_1 = (RuleCall)cEPackageEPackageCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAliasAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_2_1_0 = (RuleCall)cAliasAssignment_2_1.eContents().get(0);
		
		//// referenced metamodels may share aliases with other referenced metamodels
		//// and with generated metamodels
		//ReferencedMetamodel :
		//    'import' ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//ePackage=[ecore::EPackage|STRING]
		public Assignment getEPackageAssignment_1() { return cEPackageAssignment_1; }
		
		//[ecore::EPackage|STRING]
		public CrossReference getEPackageEPackageCrossReference_1_0() { return cEPackageEPackageCrossReference_1_0; }
		
		//STRING
		public RuleCall getEPackageEPackageSTRINGTerminalRuleCall_1_0_1() { return cEPackageEPackageSTRINGTerminalRuleCall_1_0_1; }
		
		//('as' alias=ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'as'
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }
		
		//alias=ID
		public Assignment getAliasAssignment_2_1() { return cAliasAssignment_2_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_2_1_0() { return cAliasIDTerminalRuleCall_2_1_0; }
	}
	public class ParserRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.ParserRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Assignment cFragmentAssignment_0_0_0 = (Assignment)cGroup_0_0.eContents().get(0);
		private final Keyword cFragmentFragmentKeyword_0_0_0_0 = (Keyword)cFragmentAssignment_0_0_0.eContents().get(0);
		private final RuleCall cRuleNameAndParamsParserRuleCall_0_0_1 = (RuleCall)cGroup_0_0.eContents().get(1);
		private final Alternatives cAlternatives_0_0_2 = (Alternatives)cGroup_0_0.eContents().get(2);
		private final Assignment cWildcardAssignment_0_0_2_0 = (Assignment)cAlternatives_0_0_2.eContents().get(0);
		private final Keyword cWildcardAsteriskKeyword_0_0_2_0_0 = (Keyword)cWildcardAssignment_0_0_2_0.eContents().get(0);
		private final RuleCall cReturnsClauseParserRuleCall_0_0_2_1 = (RuleCall)cAlternatives_0_0_2.eContents().get(1);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final RuleCall cRuleNameAndParamsParserRuleCall_0_1_0 = (RuleCall)cGroup_0_1.eContents().get(0);
		private final RuleCall cReturnsClauseParserRuleCall_0_1_1 = (RuleCall)cGroup_0_1.eContents().get(1);
		private final RuleCall cHiddenClauseParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlternativesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlternativesAlternativesParserRuleCall_3_0 = (RuleCall)cAlternativesAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ParserRule :
		//    (
		//      ^fragment?='fragment' RuleNameAndParams (wildcard?='*' | ReturnsClause?)
		//    | RuleNameAndParams ReturnsClause?
		//    )
		//    HiddenClause? ':'
		//        alternatives=Alternatives
		//    ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(
		//  ^fragment?='fragment' RuleNameAndParams (wildcard?='*' | ReturnsClause?)
		//| RuleNameAndParams ReturnsClause?
		//)
		//HiddenClause? ':'
		//    alternatives=Alternatives
		//';'
		public Group getGroup() { return cGroup; }
		
		//(
		//  ^fragment?='fragment' RuleNameAndParams (wildcard?='*' | ReturnsClause?)
		//| RuleNameAndParams ReturnsClause?
		//)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//^fragment?='fragment' RuleNameAndParams (wildcard?='*' | ReturnsClause?)
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//^fragment?='fragment'
		public Assignment getFragmentAssignment_0_0_0() { return cFragmentAssignment_0_0_0; }
		
		//'fragment'
		public Keyword getFragmentFragmentKeyword_0_0_0_0() { return cFragmentFragmentKeyword_0_0_0_0; }
		
		//RuleNameAndParams
		public RuleCall getRuleNameAndParamsParserRuleCall_0_0_1() { return cRuleNameAndParamsParserRuleCall_0_0_1; }
		
		//(wildcard?='*' | ReturnsClause?)
		public Alternatives getAlternatives_0_0_2() { return cAlternatives_0_0_2; }
		
		//wildcard?='*'
		public Assignment getWildcardAssignment_0_0_2_0() { return cWildcardAssignment_0_0_2_0; }
		
		//'*'
		public Keyword getWildcardAsteriskKeyword_0_0_2_0_0() { return cWildcardAsteriskKeyword_0_0_2_0_0; }
		
		//ReturnsClause?
		public RuleCall getReturnsClauseParserRuleCall_0_0_2_1() { return cReturnsClauseParserRuleCall_0_0_2_1; }
		
		//RuleNameAndParams ReturnsClause?
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//RuleNameAndParams
		public RuleCall getRuleNameAndParamsParserRuleCall_0_1_0() { return cRuleNameAndParamsParserRuleCall_0_1_0; }
		
		//ReturnsClause?
		public RuleCall getReturnsClauseParserRuleCall_0_1_1() { return cReturnsClauseParserRuleCall_0_1_1; }
		
		//HiddenClause?
		public RuleCall getHiddenClauseParserRuleCall_1() { return cHiddenClauseParserRuleCall_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//alternatives=Alternatives
		public Assignment getAlternativesAssignment_3() { return cAlternativesAssignment_3; }
		
		//Alternatives
		public RuleCall getAlternativesAlternativesParserRuleCall_3_0() { return cAlternativesAlternativesParserRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class RuleNameAndParamsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.RuleNameAndParams");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Assignment cParametersAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_1_1_0_0 = (RuleCall)cParametersAssignment_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cParametersAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_1_1_1_1_0 = (RuleCall)cParametersAssignment_1_1_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//fragment RuleNameAndParams returns ParserRule:
		//    name=ID ('[' (parameters+=Parameter (',' parameters+=Parameter)*)? ']')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('[' (parameters+=Parameter (',' parameters+=Parameter)*)? ']')?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('[' (parameters+=Parameter (',' parameters+=Parameter)*)? ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//(parameters+=Parameter (',' parameters+=Parameter)*)?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_1_1_0() { return cParametersAssignment_1_1_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_1_1_0_0() { return cParametersParameterParserRuleCall_1_1_0_0; }
		
		//(',' parameters+=Parameter)*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//','
		public Keyword getCommaKeyword_1_1_1_0() { return cCommaKeyword_1_1_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_1_1_1_1() { return cParametersAssignment_1_1_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_1_1_1_1_0() { return cParametersParameterParserRuleCall_1_1_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
	}
	public class ReturnsClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.ReturnsClause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReturnsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//fragment ReturnsClause returns AbstractRule:
		//    'returns' type=TypeRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'returns' type=TypeRef
		public Group getGroup() { return cGroup; }
		
		//'returns'
		public Keyword getReturnsKeyword_0() { return cReturnsKeyword_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_0() { return cTypeTypeRefParserRuleCall_1_0; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Parameter");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Parameter:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class TypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.TypeRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cMetamodelAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0 = (CrossReference)cMetamodelAssignment_0_0.eContents().get(0);
		private final RuleCall cMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1 = (RuleCall)cMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cClassifierAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cClassifierEClassifierCrossReference_1_0 = (CrossReference)cClassifierAssignment_1.eContents().get(0);
		private final RuleCall cClassifierEClassifierIDTerminalRuleCall_1_0_1 = (RuleCall)cClassifierEClassifierCrossReference_1_0.eContents().get(1);
		
		//TypeRef :
		//    (metamodel=[AbstractMetamodelDeclaration] '::')? classifier=[ecore::EClassifier]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(metamodel=[AbstractMetamodelDeclaration] '::')? classifier=[ecore::EClassifier]
		public Group getGroup() { return cGroup; }
		
		//(metamodel=[AbstractMetamodelDeclaration] '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//metamodel=[AbstractMetamodelDeclaration]
		public Assignment getMetamodelAssignment_0_0() { return cMetamodelAssignment_0_0; }
		
		//[AbstractMetamodelDeclaration]
		public CrossReference getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0() { return cMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0; }
		
		//ID
		public RuleCall getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1() { return cMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//classifier=[ecore::EClassifier]
		public Assignment getClassifierAssignment_1() { return cClassifierAssignment_1; }
		
		//[ecore::EClassifier]
		public CrossReference getClassifierEClassifierCrossReference_1_0() { return cClassifierEClassifierCrossReference_1_0; }
		
		//ID
		public RuleCall getClassifierEClassifierIDTerminalRuleCall_1_0_1() { return cClassifierEClassifierIDTerminalRuleCall_1_0_1; }
	}
	public class AlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Alternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cConditionalBranchParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsConditionalBranchParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//Alternatives returns AbstractElement:
		//      ConditionalBranch ({Alternatives.elements+=current} ('|' elements+=ConditionalBranch)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ConditionalBranch ({Alternatives.elements+=current} ('|' elements+=ConditionalBranch)+)?
		public Group getGroup() { return cGroup; }
		
		//ConditionalBranch
		public RuleCall getConditionalBranchParserRuleCall_0() { return cConditionalBranchParserRuleCall_0; }
		
		//({Alternatives.elements+=current} ('|' elements+=ConditionalBranch)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.elements+=current}
		public Action getAlternativesElementsAction_1_0() { return cAlternativesElementsAction_1_0; }
		
		//('|' elements+=ConditionalBranch)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//elements+=ConditionalBranch
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//ConditionalBranch
		public RuleCall getElementsConditionalBranchParserRuleCall_1_1_1_0() { return cElementsConditionalBranchParserRuleCall_1_1_1_0; }
	}
	public class ConditionalBranchElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.ConditionalBranch");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cUnorderedGroupParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cConditionalBranchAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cFilteredAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cFilteredInverseLiteralValueParserRuleCall_1_2_0 = (RuleCall)cFilteredAssignment_1_2.eContents().get(0);
		private final Assignment cParameterAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final CrossReference cParameterParameterCrossReference_1_3_0 = (CrossReference)cParameterAssignment_1_3.eContents().get(0);
		private final RuleCall cParameterParameterIDTerminalRuleCall_1_3_0_1 = (RuleCall)cParameterParameterCrossReference_1_3_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		private final Assignment cGuardedElementAssignment_1_5 = (Assignment)cGroup_1.eContents().get(5);
		private final RuleCall cGuardedElementUnorderedGroupParserRuleCall_1_5_0 = (RuleCall)cGuardedElementAssignment_1_5.eContents().get(0);
		
		//ConditionalBranch returns AbstractElement:
		//      UnorderedGroup
		//    | {ConditionalBranch} '[' filtered=InverseLiteralValue parameter=[Parameter|ID] ']' guardedElement=UnorderedGroup
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  UnorderedGroup
		//| {ConditionalBranch} '[' filtered=InverseLiteralValue parameter=[Parameter|ID] ']' guardedElement=UnorderedGroup
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//UnorderedGroup
		public RuleCall getUnorderedGroupParserRuleCall_0() { return cUnorderedGroupParserRuleCall_0; }
		
		//{ConditionalBranch} '[' filtered=InverseLiteralValue parameter=[Parameter|ID] ']' guardedElement=UnorderedGroup
		public Group getGroup_1() { return cGroup_1; }
		
		//{ConditionalBranch}
		public Action getConditionalBranchAction_1_0() { return cConditionalBranchAction_1_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_1() { return cLeftSquareBracketKeyword_1_1; }
		
		//filtered=InverseLiteralValue
		public Assignment getFilteredAssignment_1_2() { return cFilteredAssignment_1_2; }
		
		//InverseLiteralValue
		public RuleCall getFilteredInverseLiteralValueParserRuleCall_1_2_0() { return cFilteredInverseLiteralValueParserRuleCall_1_2_0; }
		
		//parameter=[Parameter|ID]
		public Assignment getParameterAssignment_1_3() { return cParameterAssignment_1_3; }
		
		//[Parameter|ID]
		public CrossReference getParameterParameterCrossReference_1_3_0() { return cParameterParameterCrossReference_1_3_0; }
		
		//ID
		public RuleCall getParameterParameterIDTerminalRuleCall_1_3_0_1() { return cParameterParameterIDTerminalRuleCall_1_3_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_4() { return cRightSquareBracketKeyword_1_4; }
		
		//guardedElement=UnorderedGroup
		public Assignment getGuardedElementAssignment_1_5() { return cGuardedElementAssignment_1_5; }
		
		//UnorderedGroup
		public RuleCall getGuardedElementUnorderedGroupParserRuleCall_1_5_0() { return cGuardedElementUnorderedGroupParserRuleCall_1_5_0; }
	}
	public class UnorderedGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.UnorderedGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cGroupParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cUnorderedGroupElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cAmpersandKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsGroupParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//UnorderedGroup returns AbstractElement:
		//    Group ({UnorderedGroup.elements+=current} ('&' elements+=Group)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Group ({UnorderedGroup.elements+=current} ('&' elements+=Group)+)?
		public Group getGroup() { return cGroup; }
		
		//Group
		public RuleCall getGroupParserRuleCall_0() { return cGroupParserRuleCall_0; }
		
		//({UnorderedGroup.elements+=current} ('&' elements+=Group)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{UnorderedGroup.elements+=current}
		public Action getUnorderedGroupElementsAction_1_0() { return cUnorderedGroupElementsAction_1_0; }
		
		//('&' elements+=Group)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'&'
		public Keyword getAmpersandKeyword_1_1_0() { return cAmpersandKeyword_1_1_0; }
		
		//elements+=Group
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//Group
		public RuleCall getElementsGroupParserRuleCall_1_1_1_0() { return cElementsGroupParserRuleCall_1_1_1_0; }
	}
	public class GroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAbstractTokenParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cGroupElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cElementsAbstractTokenParserRuleCall_1_1_0 = (RuleCall)cElementsAssignment_1_1.eContents().get(0);
		
		//Group returns AbstractElement:
		//    AbstractToken ({Group.elements+=current} (elements+=AbstractToken)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AbstractToken ({Group.elements+=current} (elements+=AbstractToken)+)?
		public Group getGroup() { return cGroup; }
		
		//AbstractToken
		public RuleCall getAbstractTokenParserRuleCall_0() { return cAbstractTokenParserRuleCall_0; }
		
		//({Group.elements+=current} (elements+=AbstractToken)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Group.elements+=current}
		public Action getGroupElementsAction_1_0() { return cGroupElementsAction_1_0; }
		
		//(elements+=AbstractToken)+
		public Assignment getElementsAssignment_1_1() { return cElementsAssignment_1_1; }
		
		//AbstractToken
		public RuleCall getElementsAbstractTokenParserRuleCall_1_1_0() { return cElementsAbstractTokenParserRuleCall_1_1_0; }
	}
	public class AbstractTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AbstractToken");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAbstractTokenWithCardinalityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cActionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractToken returns AbstractElement:
		//    AbstractTokenWithCardinality |
		//    Action
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AbstractTokenWithCardinality |
		//Action
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AbstractTokenWithCardinality
		public RuleCall getAbstractTokenWithCardinalityParserRuleCall_0() { return cAbstractTokenWithCardinalityParserRuleCall_0; }
		
		//Action
		public RuleCall getActionParserRuleCall_1() { return cActionParserRuleCall_1; }
	}
	public class AbstractTokenWithCardinalityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AbstractTokenWithCardinality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cAssignmentParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cAbstractTerminalParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cCardinalitiesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */
		//AbstractTokenWithCardinality returns AbstractElement:
		//    (Assignment | AbstractTerminal) Cardinalities?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(Assignment | AbstractTerminal) Cardinalities?
		public Group getGroup() { return cGroup; }
		
		//(Assignment | AbstractTerminal)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Assignment
		public RuleCall getAssignmentParserRuleCall_0_0() { return cAssignmentParserRuleCall_0_0; }
		
		//AbstractTerminal
		public RuleCall getAbstractTerminalParserRuleCall_0_1() { return cAbstractTerminalParserRuleCall_0_1; }
		
		//Cardinalities?
		public RuleCall getCardinalitiesParserRuleCall_1() { return cCardinalitiesParserRuleCall_1; }
	}
	public class CardinalitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Cardinalities");
		private final Assignment cCardinalityAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cCardinalityAlternatives_0 = (Alternatives)cCardinalityAssignment.eContents().get(0);
		private final Keyword cCardinalityQuestionMarkKeyword_0_0 = (Keyword)cCardinalityAlternatives_0.eContents().get(0);
		private final Keyword cCardinalityAsteriskKeyword_0_1 = (Keyword)cCardinalityAlternatives_0.eContents().get(1);
		private final Keyword cCardinalityPlusSignKeyword_0_2 = (Keyword)cCardinalityAlternatives_0.eContents().get(2);
		
		//fragment Cardinalities returns AbstractElement:
		//    cardinality=('?'|'*'|'+')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//cardinality=('?'|'*'|'+')
		public Assignment getCardinalityAssignment() { return cCardinalityAssignment; }
		
		//('?'|'*'|'+')
		public Alternatives getCardinalityAlternatives_0() { return cCardinalityAlternatives_0; }
		
		//'?'
		public Keyword getCardinalityQuestionMarkKeyword_0_0() { return cCardinalityQuestionMarkKeyword_0_0; }
		
		//'*'
		public Keyword getCardinalityAsteriskKeyword_0_1() { return cCardinalityAsteriskKeyword_0_1; }
		
		//'+'
		public Keyword getCardinalityPlusSignKeyword_0_2() { return cCardinalityPlusSignKeyword_0_2; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cFeatureAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cFeatureIDTerminalRuleCall_2_1_0 = (RuleCall)cFeatureAssignment_2_1.eContents().get(0);
		private final Assignment cOperatorAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final Alternatives cOperatorAlternatives_2_2_0 = (Alternatives)cOperatorAssignment_2_2.eContents().get(0);
		private final Keyword cOperatorEqualsSignKeyword_2_2_0_0 = (Keyword)cOperatorAlternatives_2_2_0.eContents().get(0);
		private final Keyword cOperatorPlusSignEqualsSignKeyword_2_2_0_1 = (Keyword)cOperatorAlternatives_2_2_0.eContents().get(1);
		private final Keyword cCurrentKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Action returns Action:
		//    '{' type=TypeRef ('.' feature=ID operator=('='|'+=') 'current')? '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'{' type=TypeRef ('.' feature=ID operator=('='|'+=') 'current')? '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_0() { return cTypeTypeRefParserRuleCall_1_0; }
		
		//('.' feature=ID operator=('='|'+=') 'current')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'.'
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//feature=ID
		public Assignment getFeatureAssignment_2_1() { return cFeatureAssignment_2_1; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_2_1_0() { return cFeatureIDTerminalRuleCall_2_1_0; }
		
		//operator=('='|'+=')
		public Assignment getOperatorAssignment_2_2() { return cOperatorAssignment_2_2; }
		
		//('='|'+=')
		public Alternatives getOperatorAlternatives_2_2_0() { return cOperatorAlternatives_2_2_0; }
		
		//'='
		public Keyword getOperatorEqualsSignKeyword_2_2_0_0() { return cOperatorEqualsSignKeyword_2_2_0_0; }
		
		//'+='
		public Keyword getOperatorPlusSignEqualsSignKeyword_2_2_0_1() { return cOperatorPlusSignEqualsSignKeyword_2_2_0_1; }
		
		//'current'
		public Keyword getCurrentKeyword_2_3() { return cCurrentKeyword_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class AbstractTerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AbstractTerminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenthesizedElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPredicatedKeywordParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cPredicatedRuleCallParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cPredicatedGroupParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//AbstractTerminal returns AbstractElement:
		//   Keyword |
		//   RuleCall |
		//   ParenthesizedElement |
		//   // Keyword and RuleCall are used inside of Assignable terminal
		//   // As we do not want to be able to write name==>ID
		//   // the rules for Keyword and RuleCall have been copied
		//   PredicatedKeyword |
		//   PredicatedRuleCall |
		//   // We have to make this one explicit since the ParenthesizedElement does not
		//   // create an object but we have to set the predicated flag
		//   PredicatedGroup
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword |
		//RuleCall |
		//ParenthesizedElement |
		//// Keyword and RuleCall are used inside of Assignable terminal
		//// As we do not want to be able to write name==>ID
		//// the rules for Keyword and RuleCall have been copied
		//PredicatedKeyword |
		//PredicatedRuleCall |
		//// We have to make this one explicit since the ParenthesizedElement does not
		//// create an object but we have to set the predicated flag
		//PredicatedGroup
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//RuleCall
		public RuleCall getRuleCallParserRuleCall_1() { return cRuleCallParserRuleCall_1; }
		
		//ParenthesizedElement
		public RuleCall getParenthesizedElementParserRuleCall_2() { return cParenthesizedElementParserRuleCall_2; }
		
		//// Keyword and RuleCall are used inside of Assignable terminal
		//// As we do not want to be able to write name==>ID
		//// the rules for Keyword and RuleCall have been copied
		//PredicatedKeyword
		public RuleCall getPredicatedKeywordParserRuleCall_3() { return cPredicatedKeywordParserRuleCall_3; }
		
		//PredicatedRuleCall
		public RuleCall getPredicatedRuleCallParserRuleCall_4() { return cPredicatedRuleCallParserRuleCall_4; }
		
		//// We have to make this one explicit since the ParenthesizedElement does not
		//// create an object but we have to set the predicated flag
		//PredicatedGroup
		public RuleCall getPredicatedGroupParserRuleCall_5() { return cPredicatedGroupParserRuleCall_5; }
	}
	public class KeywordElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Keyword");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Keyword :
		//   value=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class RuleCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.RuleCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRuleCallAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRuleAbstractRuleCrossReference_1_0 = (CrossReference)cRuleAssignment_1.eContents().get(0);
		private final RuleCall cRuleAbstractRuleRuleIDParserRuleCall_1_0_1 = (RuleCall)cRuleAbstractRuleCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cArgumentsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cArgumentsNamedArgumentParserRuleCall_2_1_0 = (RuleCall)cArgumentsAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cArgumentsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cArgumentsNamedArgumentParserRuleCall_2_2_1_0 = (RuleCall)cArgumentsAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//RuleCall :
		//   {RuleCall}
		//   rule=[AbstractRule|RuleID] ('[' arguments+=NamedArgument (',' arguments+=NamedArgument)* ']')?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{RuleCall}
		//rule=[AbstractRule|RuleID] ('[' arguments+=NamedArgument (',' arguments+=NamedArgument)* ']')?
		public Group getGroup() { return cGroup; }
		
		//{RuleCall}
		public Action getRuleCallAction_0() { return cRuleCallAction_0; }
		
		//rule=[AbstractRule|RuleID]
		public Assignment getRuleAssignment_1() { return cRuleAssignment_1; }
		
		//[AbstractRule|RuleID]
		public CrossReference getRuleAbstractRuleCrossReference_1_0() { return cRuleAbstractRuleCrossReference_1_0; }
		
		//RuleID
		public RuleCall getRuleAbstractRuleRuleIDParserRuleCall_1_0_1() { return cRuleAbstractRuleRuleIDParserRuleCall_1_0_1; }
		
		//('[' arguments+=NamedArgument (',' arguments+=NamedArgument)* ']')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//arguments+=NamedArgument
		public Assignment getArgumentsAssignment_2_1() { return cArgumentsAssignment_2_1; }
		
		//NamedArgument
		public RuleCall getArgumentsNamedArgumentParserRuleCall_2_1_0() { return cArgumentsNamedArgumentParserRuleCall_2_1_0; }
		
		//(',' arguments+=NamedArgument)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//arguments+=NamedArgument
		public Assignment getArgumentsAssignment_2_2_1() { return cArgumentsAssignment_2_2_1; }
		
		//NamedArgument
		public RuleCall getArgumentsNamedArgumentParserRuleCall_2_2_1_0() { return cArgumentsNamedArgumentParserRuleCall_2_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_3() { return cRightSquareBracketKeyword_2_3; }
	}
	public class LiteralValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.LiteralValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPlusSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//LiteralValue returns ecore::EBoolean:
		//    '!'|'+'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'!'|'+'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_0() { return cExclamationMarkKeyword_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1() { return cPlusSignKeyword_1; }
	}
	public class InverseLiteralValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.InverseLiteralValue");
		private final RuleCall cLiteralValueParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//InverseLiteralValue returns ecore::EBoolean:
		//    LiteralValue
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//LiteralValue
		public RuleCall getLiteralValueParserRuleCall() { return cLiteralValueParserRuleCall; }
	}
	public class NamedArgumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.NamedArgument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNamedArgumentAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cLiteralValueAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cLiteralValueLiteralValueParserRuleCall_1_0_0_0 = (RuleCall)cLiteralValueAssignment_1_0_0.eContents().get(0);
		private final Assignment cParameterAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cParameterParameterCrossReference_1_0_1_0 = (CrossReference)cParameterAssignment_1_0_1.eContents().get(0);
		private final RuleCall cParameterParameterIDTerminalRuleCall_1_0_1_0_1 = (RuleCall)cParameterParameterCrossReference_1_0_1_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cParameterAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final CrossReference cParameterParameterCrossReference_1_1_0_0 = (CrossReference)cParameterAssignment_1_1_0.eContents().get(0);
		private final RuleCall cParameterParameterIDTerminalRuleCall_1_1_0_0_1 = (RuleCall)cParameterParameterCrossReference_1_1_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cValueAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final CrossReference cValueParameterCrossReference_1_1_2_0 = (CrossReference)cValueAssignment_1_1_2.eContents().get(0);
		private final RuleCall cValueParameterIDTerminalRuleCall_1_1_2_0_1 = (RuleCall)cValueParameterCrossReference_1_1_2_0.eContents().get(1);
		
		//NamedArgument:
		//    {NamedArgument}
		//    ( literalValue=LiteralValue? parameter=[Parameter|ID]
		//    | parameter=[Parameter|ID] '=' value=[Parameter|ID]
		//    )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{NamedArgument}
		//( literalValue=LiteralValue? parameter=[Parameter|ID]
		//| parameter=[Parameter|ID] '=' value=[Parameter|ID]
		//)
		public Group getGroup() { return cGroup; }
		
		//{NamedArgument}
		public Action getNamedArgumentAction_0() { return cNamedArgumentAction_0; }
		
		//( literalValue=LiteralValue? parameter=[Parameter|ID]
		//| parameter=[Parameter|ID] '=' value=[Parameter|ID]
		//)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//literalValue=LiteralValue? parameter=[Parameter|ID]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//literalValue=LiteralValue?
		public Assignment getLiteralValueAssignment_1_0_0() { return cLiteralValueAssignment_1_0_0; }
		
		//LiteralValue
		public RuleCall getLiteralValueLiteralValueParserRuleCall_1_0_0_0() { return cLiteralValueLiteralValueParserRuleCall_1_0_0_0; }
		
		//parameter=[Parameter|ID]
		public Assignment getParameterAssignment_1_0_1() { return cParameterAssignment_1_0_1; }
		
		//[Parameter|ID]
		public CrossReference getParameterParameterCrossReference_1_0_1_0() { return cParameterParameterCrossReference_1_0_1_0; }
		
		//ID
		public RuleCall getParameterParameterIDTerminalRuleCall_1_0_1_0_1() { return cParameterParameterIDTerminalRuleCall_1_0_1_0_1; }
		
		//parameter=[Parameter|ID] '=' value=[Parameter|ID]
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//parameter=[Parameter|ID]
		public Assignment getParameterAssignment_1_1_0() { return cParameterAssignment_1_1_0; }
		
		//[Parameter|ID]
		public CrossReference getParameterParameterCrossReference_1_1_0_0() { return cParameterParameterCrossReference_1_1_0_0; }
		
		//ID
		public RuleCall getParameterParameterIDTerminalRuleCall_1_1_0_0_1() { return cParameterParameterIDTerminalRuleCall_1_1_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_1_1() { return cEqualsSignKeyword_1_1_1; }
		
		//value=[Parameter|ID]
		public Assignment getValueAssignment_1_1_2() { return cValueAssignment_1_1_2; }
		
		//[Parameter|ID]
		public CrossReference getValueParameterCrossReference_1_1_2_0() { return cValueParameterCrossReference_1_1_2_0; }
		
		//ID
		public RuleCall getValueParameterIDTerminalRuleCall_1_1_2_0_1() { return cValueParameterIDTerminalRuleCall_1_1_2_0_1; }
	}
	public class TerminalRuleCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.TerminalRuleCall");
		private final Assignment cRuleAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRuleAbstractRuleCrossReference_0 = (CrossReference)cRuleAssignment.eContents().get(0);
		private final RuleCall cRuleAbstractRuleRuleIDParserRuleCall_0_1 = (RuleCall)cRuleAbstractRuleCrossReference_0.eContents().get(1);
		
		//TerminalRuleCall returns RuleCall:
		//   rule=[AbstractRule|RuleID]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//rule=[AbstractRule|RuleID]
		public Assignment getRuleAssignment() { return cRuleAssignment; }
		
		//[AbstractRule|RuleID]
		public CrossReference getRuleAbstractRuleCrossReference_0() { return cRuleAbstractRuleCrossReference_0; }
		
		//RuleID
		public RuleCall getRuleAbstractRuleRuleIDParserRuleCall_0_1() { return cRuleAbstractRuleRuleIDParserRuleCall_0_1; }
	}
	public class RuleIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.RuleID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//RuleID returns ecore::EString:
		//  ID ('::' ID)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('::' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'::'
		public Keyword getColonColonKeyword_1_0() { return cColonColonKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class PredicatedKeywordElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.PredicatedKeyword");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPredicateParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//PredicatedKeyword returns Keyword:
		//    Predicate value=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Predicate value=STRING
		public Group getGroup() { return cGroup; }
		
		//Predicate
		public RuleCall getPredicateParserRuleCall_0() { return cPredicateParserRuleCall_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	public class PredicatedRuleCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.PredicatedRuleCall");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPredicateParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cRuleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRuleAbstractRuleCrossReference_1_0 = (CrossReference)cRuleAssignment_1.eContents().get(0);
		private final RuleCall cRuleAbstractRuleIDTerminalRuleCall_1_0_1 = (RuleCall)cRuleAbstractRuleCrossReference_1_0.eContents().get(1);
		
		//PredicatedRuleCall returns RuleCall:
		//    Predicate rule=[AbstractRule]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Predicate rule=[AbstractRule]
		public Group getGroup() { return cGroup; }
		
		//Predicate
		public RuleCall getPredicateParserRuleCall_0() { return cPredicateParserRuleCall_0; }
		
		//rule=[AbstractRule]
		public Assignment getRuleAssignment_1() { return cRuleAssignment_1; }
		
		//[AbstractRule]
		public CrossReference getRuleAbstractRuleCrossReference_1_0() { return cRuleAbstractRuleCrossReference_1_0; }
		
		//ID
		public RuleCall getRuleAbstractRuleIDTerminalRuleCall_1_0_1() { return cRuleAbstractRuleIDTerminalRuleCall_1_0_1; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPredicateParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cFeatureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFeatureIDTerminalRuleCall_1_0 = (RuleCall)cFeatureAssignment_1.eContents().get(0);
		private final Assignment cOperatorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cOperatorAlternatives_2_0 = (Alternatives)cOperatorAssignment_2.eContents().get(0);
		private final Keyword cOperatorPlusSignEqualsSignKeyword_2_0_0 = (Keyword)cOperatorAlternatives_2_0.eContents().get(0);
		private final Keyword cOperatorEqualsSignKeyword_2_0_1 = (Keyword)cOperatorAlternatives_2_0.eContents().get(1);
		private final Keyword cOperatorQuestionMarkEqualsSignKeyword_2_0_2 = (Keyword)cOperatorAlternatives_2_0.eContents().get(2);
		private final Assignment cTerminalAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTerminalAssignableTerminalParserRuleCall_3_0 = (RuleCall)cTerminalAssignment_3.eContents().get(0);
		
		//Assignment returns Assignment:
		//   Predicate? feature=ID operator=('+='|'='|'?=') ^terminal=AssignableTerminal
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Predicate? feature=ID operator=('+='|'='|'?=') ^terminal=AssignableTerminal
		public Group getGroup() { return cGroup; }
		
		//Predicate?
		public RuleCall getPredicateParserRuleCall_0() { return cPredicateParserRuleCall_0; }
		
		//feature=ID
		public Assignment getFeatureAssignment_1() { return cFeatureAssignment_1; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_1_0() { return cFeatureIDTerminalRuleCall_1_0; }
		
		//operator=('+='|'='|'?=')
		public Assignment getOperatorAssignment_2() { return cOperatorAssignment_2; }
		
		//('+='|'='|'?=')
		public Alternatives getOperatorAlternatives_2_0() { return cOperatorAlternatives_2_0; }
		
		//'+='
		public Keyword getOperatorPlusSignEqualsSignKeyword_2_0_0() { return cOperatorPlusSignEqualsSignKeyword_2_0_0; }
		
		//'='
		public Keyword getOperatorEqualsSignKeyword_2_0_1() { return cOperatorEqualsSignKeyword_2_0_1; }
		
		//'?='
		public Keyword getOperatorQuestionMarkEqualsSignKeyword_2_0_2() { return cOperatorQuestionMarkEqualsSignKeyword_2_0_2; }
		
		//^terminal=AssignableTerminal
		public Assignment getTerminalAssignment_3() { return cTerminalAssignment_3; }
		
		//AssignableTerminal
		public RuleCall getTerminalAssignableTerminalParserRuleCall_3_0() { return cTerminalAssignableTerminalParserRuleCall_3_0; }
	}
	public class PredicateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Predicate");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cPredicatedAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cPredicatedEqualsSignGreaterThanSignKeyword_0_0 = (Keyword)cPredicatedAssignment_0.eContents().get(0);
		private final Assignment cFirstSetPredicatedAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_1_0 = (Keyword)cFirstSetPredicatedAssignment_1.eContents().get(0);
		
		//fragment Predicate returns AbstractElement:
		//    (predicated?='=>' | firstSetPredicated?='->')
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(predicated?='=>' | firstSetPredicated?='->')
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//predicated?='=>'
		public Assignment getPredicatedAssignment_0() { return cPredicatedAssignment_0; }
		
		//'=>'
		public Keyword getPredicatedEqualsSignGreaterThanSignKeyword_0_0() { return cPredicatedEqualsSignGreaterThanSignKeyword_0_0; }
		
		//firstSetPredicated?='->'
		public Assignment getFirstSetPredicatedAssignment_1() { return cFirstSetPredicatedAssignment_1; }
		
		//'->'
		public Keyword getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_1_0() { return cFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_1_0; }
	}
	public class AssignableTerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AssignableTerminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenthesizedAssignableElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCrossReferenceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AssignableTerminal returns AbstractElement:
		//   Keyword | RuleCall | ParenthesizedAssignableElement | CrossReference
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword | RuleCall | ParenthesizedAssignableElement | CrossReference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//RuleCall
		public RuleCall getRuleCallParserRuleCall_1() { return cRuleCallParserRuleCall_1; }
		
		//ParenthesizedAssignableElement
		public RuleCall getParenthesizedAssignableElementParserRuleCall_2() { return cParenthesizedAssignableElementParserRuleCall_2; }
		
		//CrossReference
		public RuleCall getCrossReferenceParserRuleCall_3() { return cCrossReferenceParserRuleCall_3; }
	}
	public class ParenthesizedAssignableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.ParenthesizedAssignableElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAssignableAlternativesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedAssignableElement returns AbstractElement:
		//   '(' AssignableAlternatives ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' AssignableAlternatives ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//AssignableAlternatives
		public RuleCall getAssignableAlternativesParserRuleCall_1() { return cAssignableAlternativesParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class AssignableAlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AssignableAlternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAssignableTerminalParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsAssignableTerminalParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//AssignableAlternatives returns AbstractElement:
		//    AssignableTerminal ({Alternatives.elements+=current} ('|' elements+=AssignableTerminal)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AssignableTerminal ({Alternatives.elements+=current} ('|' elements+=AssignableTerminal)+)?
		public Group getGroup() { return cGroup; }
		
		//AssignableTerminal
		public RuleCall getAssignableTerminalParserRuleCall_0() { return cAssignableTerminalParserRuleCall_0; }
		
		//({Alternatives.elements+=current} ('|' elements+=AssignableTerminal)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.elements+=current}
		public Action getAlternativesElementsAction_1_0() { return cAlternativesElementsAction_1_0; }
		
		//('|' elements+=AssignableTerminal)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//elements+=AssignableTerminal
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//AssignableTerminal
		public RuleCall getElementsAssignableTerminalParserRuleCall_1_1_1_0() { return cElementsAssignableTerminalParserRuleCall_1_1_1_0; }
	}
	public class CrossReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.CrossReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVerticalLineKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTerminalAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTerminalCrossReferenceableTerminalParserRuleCall_2_1_0 = (RuleCall)cTerminalAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CrossReference :
		//    '[' type=TypeRef ('|' ^terminal=CrossReferenceableTerminal )? ']'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'[' type=TypeRef ('|' ^terminal=CrossReferenceableTerminal )? ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_0() { return cTypeTypeRefParserRuleCall_1_0; }
		
		//('|' ^terminal=CrossReferenceableTerminal )?
		public Group getGroup_2() { return cGroup_2; }
		
		//'|'
		public Keyword getVerticalLineKeyword_2_0() { return cVerticalLineKeyword_2_0; }
		
		//^terminal=CrossReferenceableTerminal
		public Assignment getTerminalAssignment_2_1() { return cTerminalAssignment_2_1; }
		
		//CrossReferenceableTerminal
		public RuleCall getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0() { return cTerminalCrossReferenceableTerminalParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class CrossReferenceableTerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.CrossReferenceableTerminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//CrossReferenceableTerminal returns AbstractElement:
		//   Keyword | RuleCall
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword | RuleCall
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//RuleCall
		public RuleCall getRuleCallParserRuleCall_1() { return cRuleCallParserRuleCall_1; }
	}
	public class ParenthesizedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.ParenthesizedElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAlternativesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedElement returns AbstractElement:
		//   '(' Alternatives ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Alternatives ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Alternatives
		public RuleCall getAlternativesParserRuleCall_1() { return cAlternativesParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class PredicatedGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.PredicatedGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPredicateParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsAlternativesParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//PredicatedGroup returns Group:
		//    Predicate '(' elements+=Alternatives ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Predicate '(' elements+=Alternatives ')'
		public Group getGroup() { return cGroup; }
		
		//Predicate
		public RuleCall getPredicateParserRuleCall_0() { return cPredicateParserRuleCall_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//elements+=Alternatives
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//Alternatives
		public RuleCall getElementsAlternativesParserRuleCall_2_0() { return cElementsAlternativesParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class TerminalRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.TerminalRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTerminalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cFragmentAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final Keyword cFragmentFragmentKeyword_1_0_0_0 = (Keyword)cFragmentAssignment_1_0_0.eContents().get(0);
		private final Assignment cNameAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0_1_0 = (RuleCall)cNameAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cNameAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_1_0_0 = (RuleCall)cNameAssignment_1_1_0.eContents().get(0);
		private final RuleCall cReturnsClauseParserRuleCall_1_1_1 = (RuleCall)cGroup_1_1.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlternativesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlternativesTerminalAlternativesParserRuleCall_3_0 = (RuleCall)cAlternativesAssignment_3.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TerminalRule :
		//    'terminal' (^fragment?='fragment' name=ID | name=ID ReturnsClause?) ':'
		//        alternatives=TerminalAlternatives
		//    ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'terminal' (^fragment?='fragment' name=ID | name=ID ReturnsClause?) ':'
		//    alternatives=TerminalAlternatives
		//';'
		public Group getGroup() { return cGroup; }
		
		//'terminal'
		public Keyword getTerminalKeyword_0() { return cTerminalKeyword_0; }
		
		//(^fragment?='fragment' name=ID | name=ID ReturnsClause?)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//^fragment?='fragment' name=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//^fragment?='fragment'
		public Assignment getFragmentAssignment_1_0_0() { return cFragmentAssignment_1_0_0; }
		
		//'fragment'
		public Keyword getFragmentFragmentKeyword_1_0_0_0() { return cFragmentFragmentKeyword_1_0_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_0_1() { return cNameAssignment_1_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_1_0() { return cNameIDTerminalRuleCall_1_0_1_0; }
		
		//name=ID ReturnsClause?
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//name=ID
		public Assignment getNameAssignment_1_1_0() { return cNameAssignment_1_1_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_1_0_0() { return cNameIDTerminalRuleCall_1_1_0_0; }
		
		//ReturnsClause?
		public RuleCall getReturnsClauseParserRuleCall_1_1_1() { return cReturnsClauseParserRuleCall_1_1_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//alternatives=TerminalAlternatives
		public Assignment getAlternativesAssignment_3() { return cAlternativesAssignment_3; }
		
		//TerminalAlternatives
		public RuleCall getAlternativesTerminalAlternativesParserRuleCall_3_0() { return cAlternativesTerminalAlternativesParserRuleCall_3_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class TerminalAlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.TerminalAlternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalGroupParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsTerminalGroupParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//TerminalAlternatives returns AbstractElement:
		//    TerminalGroup ({Alternatives.elements+=current} ('|' elements+=TerminalGroup)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalGroup ({Alternatives.elements+=current} ('|' elements+=TerminalGroup)+)?
		public Group getGroup() { return cGroup; }
		
		//TerminalGroup
		public RuleCall getTerminalGroupParserRuleCall_0() { return cTerminalGroupParserRuleCall_0; }
		
		//({Alternatives.elements+=current} ('|' elements+=TerminalGroup)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.elements+=current}
		public Action getAlternativesElementsAction_1_0() { return cAlternativesElementsAction_1_0; }
		
		//('|' elements+=TerminalGroup)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//elements+=TerminalGroup
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//TerminalGroup
		public RuleCall getElementsTerminalGroupParserRuleCall_1_1_1_0() { return cElementsTerminalGroupParserRuleCall_1_1_1_0; }
	}
	public class TerminalGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.TerminalGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalTokenParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cGroupElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cElementsTerminalTokenParserRuleCall_1_1_0 = (RuleCall)cElementsAssignment_1_1.eContents().get(0);
		
		//TerminalGroup returns AbstractElement:
		//    TerminalToken ({Group.elements+=current} (elements+=TerminalToken)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalToken ({Group.elements+=current} (elements+=TerminalToken)+)?
		public Group getGroup() { return cGroup; }
		
		//TerminalToken
		public RuleCall getTerminalTokenParserRuleCall_0() { return cTerminalTokenParserRuleCall_0; }
		
		//({Group.elements+=current} (elements+=TerminalToken)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Group.elements+=current}
		public Action getGroupElementsAction_1_0() { return cGroupElementsAction_1_0; }
		
		//(elements+=TerminalToken)+
		public Assignment getElementsAssignment_1_1() { return cElementsAssignment_1_1; }
		
		//TerminalToken
		public RuleCall getElementsTerminalTokenParserRuleCall_1_1_0() { return cElementsTerminalTokenParserRuleCall_1_1_0; }
	}
	public class TerminalTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.TerminalToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalTokenElementParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cCardinalitiesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */
		//TerminalToken returns AbstractElement:
		//    TerminalTokenElement Cardinalities?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalTokenElement Cardinalities?
		public Group getGroup() { return cGroup; }
		
		//TerminalTokenElement
		public RuleCall getTerminalTokenElementParserRuleCall_0() { return cTerminalTokenElementParserRuleCall_0; }
		
		//Cardinalities?
		public RuleCall getCardinalitiesParserRuleCall_1() { return cCardinalitiesParserRuleCall_1; }
	}
	public class TerminalTokenElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.TerminalTokenElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCharacterRangeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTerminalRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenthesizedTerminalElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAbstractNegatedTokenParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cWildcardParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cEOFParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//TerminalTokenElement returns AbstractElement:
		//   CharacterRange | TerminalRuleCall | ParenthesizedTerminalElement | AbstractNegatedToken | Wildcard | ^EOF
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//CharacterRange | TerminalRuleCall | ParenthesizedTerminalElement | AbstractNegatedToken | Wildcard | ^EOF
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CharacterRange
		public RuleCall getCharacterRangeParserRuleCall_0() { return cCharacterRangeParserRuleCall_0; }
		
		//TerminalRuleCall
		public RuleCall getTerminalRuleCallParserRuleCall_1() { return cTerminalRuleCallParserRuleCall_1; }
		
		//ParenthesizedTerminalElement
		public RuleCall getParenthesizedTerminalElementParserRuleCall_2() { return cParenthesizedTerminalElementParserRuleCall_2; }
		
		//AbstractNegatedToken
		public RuleCall getAbstractNegatedTokenParserRuleCall_3() { return cAbstractNegatedTokenParserRuleCall_3; }
		
		//Wildcard
		public RuleCall getWildcardParserRuleCall_4() { return cWildcardParserRuleCall_4; }
		
		//^EOF
		public RuleCall getEOFParserRuleCall_5() { return cEOFParserRuleCall_5; }
	}
	public class ParenthesizedTerminalElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.ParenthesizedTerminalElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTerminalAlternativesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedTerminalElement returns AbstractElement:
		//   '(' TerminalAlternatives ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' TerminalAlternatives ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//TerminalAlternatives
		public RuleCall getTerminalAlternativesParserRuleCall_1() { return cTerminalAlternativesParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class AbstractNegatedTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.AbstractNegatedToken");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNegatedTokenParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUntilTokenParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractNegatedToken:
		//   NegatedToken | UntilToken
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//NegatedToken | UntilToken
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NegatedToken
		public RuleCall getNegatedTokenParserRuleCall_0() { return cNegatedTokenParserRuleCall_0; }
		
		//UntilToken
		public RuleCall getUntilTokenParserRuleCall_1() { return cUntilTokenParserRuleCall_1; }
	}
	public class NegatedTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.NegatedToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTerminalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTerminalTerminalTokenElementParserRuleCall_1_0 = (RuleCall)cTerminalAssignment_1.eContents().get(0);
		
		//NegatedToken:
		//    '!' ^terminal=TerminalTokenElement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'!' ^terminal=TerminalTokenElement
		public Group getGroup() { return cGroup; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_0() { return cExclamationMarkKeyword_0; }
		
		//^terminal=TerminalTokenElement
		public Assignment getTerminalAssignment_1() { return cTerminalAssignment_1; }
		
		//TerminalTokenElement
		public RuleCall getTerminalTerminalTokenElementParserRuleCall_1_0() { return cTerminalTerminalTokenElementParserRuleCall_1_0; }
	}
	public class UntilTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.UntilToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTerminalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTerminalTerminalTokenElementParserRuleCall_1_0 = (RuleCall)cTerminalAssignment_1.eContents().get(0);
		
		//UntilToken:
		//    '->' ^terminal=TerminalTokenElement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'->' ^terminal=TerminalTokenElement
		public Group getGroup() { return cGroup; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }
		
		//^terminal=TerminalTokenElement
		public Assignment getTerminalAssignment_1() { return cTerminalAssignment_1; }
		
		//TerminalTokenElement
		public RuleCall getTerminalTerminalTokenElementParserRuleCall_1_0() { return cTerminalTerminalTokenElementParserRuleCall_1_0; }
	}
	public class WildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.Wildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWildcardAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Wildcard:
		//    {Wildcard} '.'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Wildcard} '.'
		public Group getGroup() { return cGroup; }
		
		//{Wildcard}
		public Action getWildcardAction_0() { return cWildcardAction_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}
	public class EOFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.EOF");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEOFAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEOFKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//^EOF:
		//    {^EOF} 'EOF'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{^EOF} 'EOF'
		public Group getGroup() { return cGroup; }
		
		//{^EOF}
		public Action getEOFAction_0() { return cEOFAction_0; }
		
		//'EOF'
		public Keyword getEOFKeyword_1() { return cEOFKeyword_1; }
	}
	public class CharacterRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.CharacterRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cCharacterRangeLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightKeywordParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//CharacterRange returns AbstractElement:
		//    Keyword ( {CharacterRange.left=current} '..' right=Keyword)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword ( {CharacterRange.left=current} '..' right=Keyword)?
		public Group getGroup() { return cGroup; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//( {CharacterRange.left=current} '..' right=Keyword)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{CharacterRange.left=current}
		public Action getCharacterRangeLeftAction_1_0() { return cCharacterRangeLeftAction_1_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_1_1() { return cFullStopFullStopKeyword_1_1; }
		
		//right=Keyword
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Keyword
		public RuleCall getRightKeywordParserRuleCall_1_2_0() { return cRightKeywordParserRuleCall_1_2_0; }
	}
	public class EnumRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.EnumRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cReturnsClauseParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAlternativesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAlternativesEnumLiteralsParserRuleCall_4_0 = (RuleCall)cAlternativesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//EnumRule:
		//    'enum' name=ID ReturnsClause? ':'
		//        alternatives=EnumLiterals
		//    ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'enum' name=ID ReturnsClause? ':'
		//    alternatives=EnumLiterals
		//';'
		public Group getGroup() { return cGroup; }
		
		//'enum'
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//ReturnsClause?
		public RuleCall getReturnsClauseParserRuleCall_2() { return cReturnsClauseParserRuleCall_2; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//alternatives=EnumLiterals
		public Assignment getAlternativesAssignment_4() { return cAlternativesAssignment_4; }
		
		//EnumLiterals
		public RuleCall getAlternativesEnumLiteralsParserRuleCall_4_0() { return cAlternativesEnumLiteralsParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class EnumLiteralsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.EnumLiterals");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEnumLiteralDeclarationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesElementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0 = (RuleCall)cElementsAssignment_1_1_1.eContents().get(0);
		
		//EnumLiterals returns AbstractElement:
		//    EnumLiteralDeclaration ({Alternatives.elements+=current} ('|' elements+=EnumLiteralDeclaration)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//EnumLiteralDeclaration ({Alternatives.elements+=current} ('|' elements+=EnumLiteralDeclaration)+)?
		public Group getGroup() { return cGroup; }
		
		//EnumLiteralDeclaration
		public RuleCall getEnumLiteralDeclarationParserRuleCall_0() { return cEnumLiteralDeclarationParserRuleCall_0; }
		
		//({Alternatives.elements+=current} ('|' elements+=EnumLiteralDeclaration)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.elements+=current}
		public Action getAlternativesElementsAction_1_0() { return cAlternativesElementsAction_1_0; }
		
		//('|' elements+=EnumLiteralDeclaration)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//elements+=EnumLiteralDeclaration
		public Assignment getElementsAssignment_1_1_1() { return cElementsAssignment_1_1_1; }
		
		//EnumLiteralDeclaration
		public RuleCall getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0() { return cElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0; }
	}
	public class EnumLiteralDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.XtextGrammarTestLanguage.EnumLiteralDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEnumLiteralAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEnumLiteralEEnumLiteralCrossReference_0_0 = (CrossReference)cEnumLiteralAssignment_0.eContents().get(0);
		private final RuleCall cEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1 = (RuleCall)cEnumLiteralEEnumLiteralCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cLiteralAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLiteralKeywordParserRuleCall_1_1_0 = (RuleCall)cLiteralAssignment_1_1.eContents().get(0);
		
		//EnumLiteralDeclaration:
		//    enumLiteral=[ecore::EEnumLiteral] ('=' literal=Keyword)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//enumLiteral=[ecore::EEnumLiteral] ('=' literal=Keyword)?
		public Group getGroup() { return cGroup; }
		
		//enumLiteral=[ecore::EEnumLiteral]
		public Assignment getEnumLiteralAssignment_0() { return cEnumLiteralAssignment_0; }
		
		//[ecore::EEnumLiteral]
		public CrossReference getEnumLiteralEEnumLiteralCrossReference_0_0() { return cEnumLiteralEEnumLiteralCrossReference_0_0; }
		
		//ID
		public RuleCall getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1() { return cEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1; }
		
		//('=' literal=Keyword)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }
		
		//literal=Keyword
		public Assignment getLiteralAssignment_1_1() { return cLiteralAssignment_1_1; }
		
		//Keyword
		public RuleCall getLiteralKeywordParserRuleCall_1_1_0() { return cLiteralKeywordParserRuleCall_1_1_0; }
	}
	
	
	private final GrammarElements pGrammar;
	private final HiddenClauseElements pHiddenClause;
	private final GrammarIDElements pGrammarID;
	private final AbstractRuleElements pAbstractRule;
	private final AbstractMetamodelDeclarationElements pAbstractMetamodelDeclaration;
	private final GeneratedMetamodelElements pGeneratedMetamodel;
	private final ReferencedMetamodelElements pReferencedMetamodel;
	private final ParserRuleElements pParserRule;
	private final RuleNameAndParamsElements pRuleNameAndParams;
	private final ReturnsClauseElements pReturnsClause;
	private final ParameterElements pParameter;
	private final TypeRefElements pTypeRef;
	private final AlternativesElements pAlternatives;
	private final ConditionalBranchElements pConditionalBranch;
	private final UnorderedGroupElements pUnorderedGroup;
	private final GroupElements pGroup;
	private final AbstractTokenElements pAbstractToken;
	private final AbstractTokenWithCardinalityElements pAbstractTokenWithCardinality;
	private final CardinalitiesElements pCardinalities;
	private final ActionElements pAction;
	private final AbstractTerminalElements pAbstractTerminal;
	private final KeywordElements pKeyword;
	private final RuleCallElements pRuleCall;
	private final LiteralValueElements pLiteralValue;
	private final InverseLiteralValueElements pInverseLiteralValue;
	private final NamedArgumentElements pNamedArgument;
	private final TerminalRuleCallElements pTerminalRuleCall;
	private final RuleIDElements pRuleID;
	private final PredicatedKeywordElements pPredicatedKeyword;
	private final PredicatedRuleCallElements pPredicatedRuleCall;
	private final AssignmentElements pAssignment;
	private final PredicateElements pPredicate;
	private final AssignableTerminalElements pAssignableTerminal;
	private final ParenthesizedAssignableElementElements pParenthesizedAssignableElement;
	private final AssignableAlternativesElements pAssignableAlternatives;
	private final CrossReferenceElements pCrossReference;
	private final CrossReferenceableTerminalElements pCrossReferenceableTerminal;
	private final ParenthesizedElementElements pParenthesizedElement;
	private final PredicatedGroupElements pPredicatedGroup;
	private final TerminalRuleElements pTerminalRule;
	private final TerminalAlternativesElements pTerminalAlternatives;
	private final TerminalGroupElements pTerminalGroup;
	private final TerminalTokenElements pTerminalToken;
	private final TerminalTokenElementElements pTerminalTokenElement;
	private final ParenthesizedTerminalElementElements pParenthesizedTerminalElement;
	private final AbstractNegatedTokenElements pAbstractNegatedToken;
	private final NegatedTokenElements pNegatedToken;
	private final UntilTokenElements pUntilToken;
	private final WildcardElements pWildcard;
	private final EOFElements pEOF;
	private final CharacterRangeElements pCharacterRange;
	private final EnumRuleElements pEnumRule;
	private final EnumLiteralsElements pEnumLiterals;
	private final EnumLiteralDeclarationElements pEnumLiteralDeclaration;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public XtextGrammarTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGrammar = new GrammarElements();
		this.pHiddenClause = new HiddenClauseElements();
		this.pGrammarID = new GrammarIDElements();
		this.pAbstractRule = new AbstractRuleElements();
		this.pAbstractMetamodelDeclaration = new AbstractMetamodelDeclarationElements();
		this.pGeneratedMetamodel = new GeneratedMetamodelElements();
		this.pReferencedMetamodel = new ReferencedMetamodelElements();
		this.pParserRule = new ParserRuleElements();
		this.pRuleNameAndParams = new RuleNameAndParamsElements();
		this.pReturnsClause = new ReturnsClauseElements();
		this.pParameter = new ParameterElements();
		this.pTypeRef = new TypeRefElements();
		this.pAlternatives = new AlternativesElements();
		this.pConditionalBranch = new ConditionalBranchElements();
		this.pUnorderedGroup = new UnorderedGroupElements();
		this.pGroup = new GroupElements();
		this.pAbstractToken = new AbstractTokenElements();
		this.pAbstractTokenWithCardinality = new AbstractTokenWithCardinalityElements();
		this.pCardinalities = new CardinalitiesElements();
		this.pAction = new ActionElements();
		this.pAbstractTerminal = new AbstractTerminalElements();
		this.pKeyword = new KeywordElements();
		this.pRuleCall = new RuleCallElements();
		this.pLiteralValue = new LiteralValueElements();
		this.pInverseLiteralValue = new InverseLiteralValueElements();
		this.pNamedArgument = new NamedArgumentElements();
		this.pTerminalRuleCall = new TerminalRuleCallElements();
		this.pRuleID = new RuleIDElements();
		this.pPredicatedKeyword = new PredicatedKeywordElements();
		this.pPredicatedRuleCall = new PredicatedRuleCallElements();
		this.pAssignment = new AssignmentElements();
		this.pPredicate = new PredicateElements();
		this.pAssignableTerminal = new AssignableTerminalElements();
		this.pParenthesizedAssignableElement = new ParenthesizedAssignableElementElements();
		this.pAssignableAlternatives = new AssignableAlternativesElements();
		this.pCrossReference = new CrossReferenceElements();
		this.pCrossReferenceableTerminal = new CrossReferenceableTerminalElements();
		this.pParenthesizedElement = new ParenthesizedElementElements();
		this.pPredicatedGroup = new PredicatedGroupElements();
		this.pTerminalRule = new TerminalRuleElements();
		this.pTerminalAlternatives = new TerminalAlternativesElements();
		this.pTerminalGroup = new TerminalGroupElements();
		this.pTerminalToken = new TerminalTokenElements();
		this.pTerminalTokenElement = new TerminalTokenElementElements();
		this.pParenthesizedTerminalElement = new ParenthesizedTerminalElementElements();
		this.pAbstractNegatedToken = new AbstractNegatedTokenElements();
		this.pNegatedToken = new NegatedTokenElements();
		this.pUntilToken = new UntilTokenElements();
		this.pWildcard = new WildcardElements();
		this.pEOF = new EOFElements();
		this.pCharacterRange = new CharacterRangeElements();
		this.pEnumRule = new EnumRuleElements();
		this.pEnumLiterals = new EnumLiteralsElements();
		this.pEnumLiteralDeclaration = new EnumLiteralDeclarationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.XtextGrammarTestLanguage".equals(grammar.getName())) {
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

	
	//Grammar:
	//    'grammar' name=GrammarID ('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
	//    HiddenClause?
	//    metamodelDeclarations+=AbstractMetamodelDeclaration*
	//    (rules+=AbstractRule)+
	//;
	public GrammarElements getGrammarAccess() {
		return pGrammar;
	}
	
	public ParserRule getGrammarRule() {
		return getGrammarAccess().getRule();
	}
	
	//fragment HiddenClause *:
	//    (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')
	//;
	public HiddenClauseElements getHiddenClauseAccess() {
		return pHiddenClause;
	}
	
	public ParserRule getHiddenClauseRule() {
		return getHiddenClauseAccess().getRule();
	}
	
	//GrammarID returns ecore::EString:
	//  ID ('.' ID)*;
	public GrammarIDElements getGrammarIDAccess() {
		return pGrammarID;
	}
	
	public ParserRule getGrammarIDRule() {
		return getGrammarIDAccess().getRule();
	}
	
	//AbstractRule : ParserRule | TerminalRule | EnumRule;
	public AbstractRuleElements getAbstractRuleAccess() {
		return pAbstractRule;
	}
	
	public ParserRule getAbstractRuleRule() {
		return getAbstractRuleAccess().getRule();
	}
	
	//AbstractMetamodelDeclaration :
	//    GeneratedMetamodel | ReferencedMetamodel;
	public AbstractMetamodelDeclarationElements getAbstractMetamodelDeclarationAccess() {
		return pAbstractMetamodelDeclaration;
	}
	
	public ParserRule getAbstractMetamodelDeclarationRule() {
		return getAbstractMetamodelDeclarationAccess().getRule();
	}
	
	//// constraint: typeSelect(GeneratedMetamodel).size() == typeSelect(GeneratedMetamodel).alias.size()
	//// generated metamodels have to have different aliases
	//GeneratedMetamodel :
	//    'generate' name=ID ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
	public GeneratedMetamodelElements getGeneratedMetamodelAccess() {
		return pGeneratedMetamodel;
	}
	
	public ParserRule getGeneratedMetamodelRule() {
		return getGeneratedMetamodelAccess().getRule();
	}
	
	//// referenced metamodels may share aliases with other referenced metamodels
	//// and with generated metamodels
	//ReferencedMetamodel :
	//    'import' ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
	public ReferencedMetamodelElements getReferencedMetamodelAccess() {
		return pReferencedMetamodel;
	}
	
	public ParserRule getReferencedMetamodelRule() {
		return getReferencedMetamodelAccess().getRule();
	}
	
	//ParserRule :
	//    (
	//      ^fragment?='fragment' RuleNameAndParams (wildcard?='*' | ReturnsClause?)
	//    | RuleNameAndParams ReturnsClause?
	//    )
	//    HiddenClause? ':'
	//        alternatives=Alternatives
	//    ';'
	//;
	public ParserRuleElements getParserRuleAccess() {
		return pParserRule;
	}
	
	public ParserRule getParserRuleRule() {
		return getParserRuleAccess().getRule();
	}
	
	//fragment RuleNameAndParams returns ParserRule:
	//    name=ID ('[' (parameters+=Parameter (',' parameters+=Parameter)*)? ']')?
	//;
	public RuleNameAndParamsElements getRuleNameAndParamsAccess() {
		return pRuleNameAndParams;
	}
	
	public ParserRule getRuleNameAndParamsRule() {
		return getRuleNameAndParamsAccess().getRule();
	}
	
	//fragment ReturnsClause returns AbstractRule:
	//    'returns' type=TypeRef
	//;
	public ReturnsClauseElements getReturnsClauseAccess() {
		return pReturnsClause;
	}
	
	public ParserRule getReturnsClauseRule() {
		return getReturnsClauseAccess().getRule();
	}
	
	//Parameter:
	//    name=ID
	//;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//TypeRef :
	//    (metamodel=[AbstractMetamodelDeclaration] '::')? classifier=[ecore::EClassifier]
	//;
	public TypeRefElements getTypeRefAccess() {
		return pTypeRef;
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}
	
	//Alternatives returns AbstractElement:
	//      ConditionalBranch ({Alternatives.elements+=current} ('|' elements+=ConditionalBranch)+)?
	//;
	public AlternativesElements getAlternativesAccess() {
		return pAlternatives;
	}
	
	public ParserRule getAlternativesRule() {
		return getAlternativesAccess().getRule();
	}
	
	//ConditionalBranch returns AbstractElement:
	//      UnorderedGroup
	//    | {ConditionalBranch} '[' filtered=InverseLiteralValue parameter=[Parameter|ID] ']' guardedElement=UnorderedGroup
	//;
	public ConditionalBranchElements getConditionalBranchAccess() {
		return pConditionalBranch;
	}
	
	public ParserRule getConditionalBranchRule() {
		return getConditionalBranchAccess().getRule();
	}
	
	//UnorderedGroup returns AbstractElement:
	//    Group ({UnorderedGroup.elements+=current} ('&' elements+=Group)+)?
	//;
	public UnorderedGroupElements getUnorderedGroupAccess() {
		return pUnorderedGroup;
	}
	
	public ParserRule getUnorderedGroupRule() {
		return getUnorderedGroupAccess().getRule();
	}
	
	//Group returns AbstractElement:
	//    AbstractToken ({Group.elements+=current} (elements+=AbstractToken)+)?
	//;
	public GroupElements getGroupAccess() {
		return pGroup;
	}
	
	public ParserRule getGroupRule() {
		return getGroupAccess().getRule();
	}
	
	//AbstractToken returns AbstractElement:
	//    AbstractTokenWithCardinality |
	//    Action
	//;
	public AbstractTokenElements getAbstractTokenAccess() {
		return pAbstractToken;
	}
	
	public ParserRule getAbstractTokenRule() {
		return getAbstractTokenAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */
	//AbstractTokenWithCardinality returns AbstractElement:
	//    (Assignment | AbstractTerminal) Cardinalities?
	//;
	public AbstractTokenWithCardinalityElements getAbstractTokenWithCardinalityAccess() {
		return pAbstractTokenWithCardinality;
	}
	
	public ParserRule getAbstractTokenWithCardinalityRule() {
		return getAbstractTokenWithCardinalityAccess().getRule();
	}
	
	//fragment Cardinalities returns AbstractElement:
	//    cardinality=('?'|'*'|'+')
	//;
	public CardinalitiesElements getCardinalitiesAccess() {
		return pCardinalities;
	}
	
	public ParserRule getCardinalitiesRule() {
		return getCardinalitiesAccess().getRule();
	}
	
	//Action returns Action:
	//    '{' type=TypeRef ('.' feature=ID operator=('='|'+=') 'current')? '}'
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//AbstractTerminal returns AbstractElement:
	//   Keyword |
	//   RuleCall |
	//   ParenthesizedElement |
	//   // Keyword and RuleCall are used inside of Assignable terminal
	//   // As we do not want to be able to write name==>ID
	//   // the rules for Keyword and RuleCall have been copied
	//   PredicatedKeyword |
	//   PredicatedRuleCall |
	//   // We have to make this one explicit since the ParenthesizedElement does not
	//   // create an object but we have to set the predicated flag
	//   PredicatedGroup
	//;
	public AbstractTerminalElements getAbstractTerminalAccess() {
		return pAbstractTerminal;
	}
	
	public ParserRule getAbstractTerminalRule() {
		return getAbstractTerminalAccess().getRule();
	}
	
	//Keyword :
	//   value=STRING
	//;
	public KeywordElements getKeywordAccess() {
		return pKeyword;
	}
	
	public ParserRule getKeywordRule() {
		return getKeywordAccess().getRule();
	}
	
	//RuleCall :
	//   {RuleCall}
	//   rule=[AbstractRule|RuleID] ('[' arguments+=NamedArgument (',' arguments+=NamedArgument)* ']')?
	//;
	public RuleCallElements getRuleCallAccess() {
		return pRuleCall;
	}
	
	public ParserRule getRuleCallRule() {
		return getRuleCallAccess().getRule();
	}
	
	//LiteralValue returns ecore::EBoolean:
	//    '!'|'+'
	//;
	public LiteralValueElements getLiteralValueAccess() {
		return pLiteralValue;
	}
	
	public ParserRule getLiteralValueRule() {
		return getLiteralValueAccess().getRule();
	}
	
	//InverseLiteralValue returns ecore::EBoolean:
	//    LiteralValue
	//;
	public InverseLiteralValueElements getInverseLiteralValueAccess() {
		return pInverseLiteralValue;
	}
	
	public ParserRule getInverseLiteralValueRule() {
		return getInverseLiteralValueAccess().getRule();
	}
	
	//NamedArgument:
	//    {NamedArgument}
	//    ( literalValue=LiteralValue? parameter=[Parameter|ID]
	//    | parameter=[Parameter|ID] '=' value=[Parameter|ID]
	//    )
	//;
	public NamedArgumentElements getNamedArgumentAccess() {
		return pNamedArgument;
	}
	
	public ParserRule getNamedArgumentRule() {
		return getNamedArgumentAccess().getRule();
	}
	
	//TerminalRuleCall returns RuleCall:
	//   rule=[AbstractRule|RuleID]
	//;
	public TerminalRuleCallElements getTerminalRuleCallAccess() {
		return pTerminalRuleCall;
	}
	
	public ParserRule getTerminalRuleCallRule() {
		return getTerminalRuleCallAccess().getRule();
	}
	
	//RuleID returns ecore::EString:
	//  ID ('::' ID)*
	//;
	public RuleIDElements getRuleIDAccess() {
		return pRuleID;
	}
	
	public ParserRule getRuleIDRule() {
		return getRuleIDAccess().getRule();
	}
	
	//PredicatedKeyword returns Keyword:
	//    Predicate value=STRING
	//;
	public PredicatedKeywordElements getPredicatedKeywordAccess() {
		return pPredicatedKeyword;
	}
	
	public ParserRule getPredicatedKeywordRule() {
		return getPredicatedKeywordAccess().getRule();
	}
	
	//PredicatedRuleCall returns RuleCall:
	//    Predicate rule=[AbstractRule]
	//;
	public PredicatedRuleCallElements getPredicatedRuleCallAccess() {
		return pPredicatedRuleCall;
	}
	
	public ParserRule getPredicatedRuleCallRule() {
		return getPredicatedRuleCallAccess().getRule();
	}
	
	//Assignment returns Assignment:
	//   Predicate? feature=ID operator=('+='|'='|'?=') ^terminal=AssignableTerminal
	//;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//fragment Predicate returns AbstractElement:
	//    (predicated?='=>' | firstSetPredicated?='->')
	//;
	public PredicateElements getPredicateAccess() {
		return pPredicate;
	}
	
	public ParserRule getPredicateRule() {
		return getPredicateAccess().getRule();
	}
	
	//AssignableTerminal returns AbstractElement:
	//   Keyword | RuleCall | ParenthesizedAssignableElement | CrossReference
	//;
	public AssignableTerminalElements getAssignableTerminalAccess() {
		return pAssignableTerminal;
	}
	
	public ParserRule getAssignableTerminalRule() {
		return getAssignableTerminalAccess().getRule();
	}
	
	//ParenthesizedAssignableElement returns AbstractElement:
	//   '(' AssignableAlternatives ')'
	//;
	public ParenthesizedAssignableElementElements getParenthesizedAssignableElementAccess() {
		return pParenthesizedAssignableElement;
	}
	
	public ParserRule getParenthesizedAssignableElementRule() {
		return getParenthesizedAssignableElementAccess().getRule();
	}
	
	//AssignableAlternatives returns AbstractElement:
	//    AssignableTerminal ({Alternatives.elements+=current} ('|' elements+=AssignableTerminal)+)?
	//;
	public AssignableAlternativesElements getAssignableAlternativesAccess() {
		return pAssignableAlternatives;
	}
	
	public ParserRule getAssignableAlternativesRule() {
		return getAssignableAlternativesAccess().getRule();
	}
	
	//CrossReference :
	//    '[' type=TypeRef ('|' ^terminal=CrossReferenceableTerminal )? ']'
	//;
	public CrossReferenceElements getCrossReferenceAccess() {
		return pCrossReference;
	}
	
	public ParserRule getCrossReferenceRule() {
		return getCrossReferenceAccess().getRule();
	}
	
	//CrossReferenceableTerminal returns AbstractElement:
	//   Keyword | RuleCall
	//;
	public CrossReferenceableTerminalElements getCrossReferenceableTerminalAccess() {
		return pCrossReferenceableTerminal;
	}
	
	public ParserRule getCrossReferenceableTerminalRule() {
		return getCrossReferenceableTerminalAccess().getRule();
	}
	
	//ParenthesizedElement returns AbstractElement:
	//   '(' Alternatives ')'
	//;
	public ParenthesizedElementElements getParenthesizedElementAccess() {
		return pParenthesizedElement;
	}
	
	public ParserRule getParenthesizedElementRule() {
		return getParenthesizedElementAccess().getRule();
	}
	
	//PredicatedGroup returns Group:
	//    Predicate '(' elements+=Alternatives ')'
	//;
	public PredicatedGroupElements getPredicatedGroupAccess() {
		return pPredicatedGroup;
	}
	
	public ParserRule getPredicatedGroupRule() {
		return getPredicatedGroupAccess().getRule();
	}
	
	//TerminalRule :
	//    'terminal' (^fragment?='fragment' name=ID | name=ID ReturnsClause?) ':'
	//        alternatives=TerminalAlternatives
	//    ';'
	//;
	public TerminalRuleElements getTerminalRuleAccess() {
		return pTerminalRule;
	}
	
	public ParserRule getTerminalRuleRule() {
		return getTerminalRuleAccess().getRule();
	}
	
	//TerminalAlternatives returns AbstractElement:
	//    TerminalGroup ({Alternatives.elements+=current} ('|' elements+=TerminalGroup)+)?
	//;
	public TerminalAlternativesElements getTerminalAlternativesAccess() {
		return pTerminalAlternatives;
	}
	
	public ParserRule getTerminalAlternativesRule() {
		return getTerminalAlternativesAccess().getRule();
	}
	
	//TerminalGroup returns AbstractElement:
	//    TerminalToken ({Group.elements+=current} (elements+=TerminalToken)+)?
	//;
	public TerminalGroupElements getTerminalGroupAccess() {
		return pTerminalGroup;
	}
	
	public ParserRule getTerminalGroupRule() {
		return getTerminalGroupAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride]: Handled in CardinalityAwareEcoreFactory */
	//TerminalToken returns AbstractElement:
	//    TerminalTokenElement Cardinalities?
	//;
	public TerminalTokenElements getTerminalTokenAccess() {
		return pTerminalToken;
	}
	
	public ParserRule getTerminalTokenRule() {
		return getTerminalTokenAccess().getRule();
	}
	
	//TerminalTokenElement returns AbstractElement:
	//   CharacterRange | TerminalRuleCall | ParenthesizedTerminalElement | AbstractNegatedToken | Wildcard | ^EOF
	//;
	public TerminalTokenElementElements getTerminalTokenElementAccess() {
		return pTerminalTokenElement;
	}
	
	public ParserRule getTerminalTokenElementRule() {
		return getTerminalTokenElementAccess().getRule();
	}
	
	//ParenthesizedTerminalElement returns AbstractElement:
	//   '(' TerminalAlternatives ')'
	//;
	public ParenthesizedTerminalElementElements getParenthesizedTerminalElementAccess() {
		return pParenthesizedTerminalElement;
	}
	
	public ParserRule getParenthesizedTerminalElementRule() {
		return getParenthesizedTerminalElementAccess().getRule();
	}
	
	//AbstractNegatedToken:
	//   NegatedToken | UntilToken
	//;
	public AbstractNegatedTokenElements getAbstractNegatedTokenAccess() {
		return pAbstractNegatedToken;
	}
	
	public ParserRule getAbstractNegatedTokenRule() {
		return getAbstractNegatedTokenAccess().getRule();
	}
	
	//NegatedToken:
	//    '!' ^terminal=TerminalTokenElement
	//;
	public NegatedTokenElements getNegatedTokenAccess() {
		return pNegatedToken;
	}
	
	public ParserRule getNegatedTokenRule() {
		return getNegatedTokenAccess().getRule();
	}
	
	//UntilToken:
	//    '->' ^terminal=TerminalTokenElement
	//;
	public UntilTokenElements getUntilTokenAccess() {
		return pUntilToken;
	}
	
	public ParserRule getUntilTokenRule() {
		return getUntilTokenAccess().getRule();
	}
	
	//Wildcard:
	//    {Wildcard} '.'
	//;
	public WildcardElements getWildcardAccess() {
		return pWildcard;
	}
	
	public ParserRule getWildcardRule() {
		return getWildcardAccess().getRule();
	}
	
	//^EOF:
	//    {^EOF} 'EOF'
	//;
	public EOFElements getEOFAccess() {
		return pEOF;
	}
	
	public ParserRule getEOFRule() {
		return getEOFAccess().getRule();
	}
	
	//CharacterRange returns AbstractElement:
	//    Keyword ( {CharacterRange.left=current} '..' right=Keyword)?
	//;
	public CharacterRangeElements getCharacterRangeAccess() {
		return pCharacterRange;
	}
	
	public ParserRule getCharacterRangeRule() {
		return getCharacterRangeAccess().getRule();
	}
	
	//EnumRule:
	//    'enum' name=ID ReturnsClause? ':'
	//        alternatives=EnumLiterals
	//    ';'
	//;
	public EnumRuleElements getEnumRuleAccess() {
		return pEnumRule;
	}
	
	public ParserRule getEnumRuleRule() {
		return getEnumRuleAccess().getRule();
	}
	
	//EnumLiterals returns AbstractElement:
	//    EnumLiteralDeclaration ({Alternatives.elements+=current} ('|' elements+=EnumLiteralDeclaration)+)?
	//;
	public EnumLiteralsElements getEnumLiteralsAccess() {
		return pEnumLiterals;
	}
	
	public ParserRule getEnumLiteralsRule() {
		return getEnumLiteralsAccess().getRule();
	}
	
	//EnumLiteralDeclaration:
	//    enumLiteral=[ecore::EEnumLiteral] ('=' literal=Keyword)?
	//;
	public EnumLiteralDeclarationElements getEnumLiteralDeclarationAccess() {
		return pEnumLiteralDeclaration;
	}
	
	public ParserRule getEnumLiteralDeclarationRule() {
		return getEnumLiteralDeclarationAccess().getRule();
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
