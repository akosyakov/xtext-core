/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.serializer.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.eclipse.xtext.serializer.services.SyntacticSequencerTestLanguageGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractSyntacticSequencerTestLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SyntacticSequencerTestLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ActionOnly_IDTerminalRuleCall_2_q;
	protected AbstractElementAlias match_ActionOnly_IDTerminalRuleCall_5_q;
	protected AbstractElementAlias match_ActionOnly_Kw1Keyword_1_q;
	protected AbstractElementAlias match_ActionOnly_Kw2Keyword_4_q;
	protected AbstractElementAlias match_AlternativeTransition_KW1ParserRuleCall_1_0_or_Kw2Keyword_1_1;
	protected AbstractElementAlias match_LongAlternative___Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a;
	protected AbstractElementAlias match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0__a_Kw8Keyword_2_7_0__p;
	protected AbstractElementAlias match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw8Keyword_2_7_0__a_Kw7Keyword_2_6_0__p;
	protected AbstractElementAlias match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw6Keyword_2_5_0__p;
	protected AbstractElementAlias match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw5Keyword_2_4_0__p;
	protected AbstractElementAlias match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw4Keyword_2_3_0__p;
	protected AbstractElementAlias match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw3Keyword_2_2_0__p;
	protected AbstractElementAlias match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw2Keyword_2_1_0__p;
	protected AbstractElementAlias match_LongAlternative_____Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw1Keyword_2_0_0__p;
	protected AbstractElementAlias match_MandatoryManyTransition_KW1ParserRuleCall_1_p;
	protected AbstractElementAlias match_OptionalManyTransition_KW1ParserRuleCall_1_a;
	protected AbstractElementAlias match_OptionalSingleTransition_KW1ParserRuleCall_1_q;
	protected AbstractElementAlias match_Prim1_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Prim1_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_Prim2_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Prim2_LeftParenthesisKeyword_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SyntacticSequencerTestLanguageGrammarAccess) access;
		match_ActionOnly_IDTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getActionOnlyAccess().getIDTerminalRuleCall_2());
		match_ActionOnly_IDTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getActionOnlyAccess().getIDTerminalRuleCall_5());
		match_ActionOnly_Kw1Keyword_1_q = new TokenAlias(false, true, grammarAccess.getActionOnlyAccess().getKw1Keyword_1());
		match_ActionOnly_Kw2Keyword_4_q = new TokenAlias(false, true, grammarAccess.getActionOnlyAccess().getKw2Keyword_4());
		match_AlternativeTransition_KW1ParserRuleCall_1_0_or_Kw2Keyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAlternativeTransitionAccess().getKW1ParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getAlternativeTransitionAccess().getKw2Keyword_1_1()));
		match_LongAlternative___Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0()));
		match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0__a_Kw8Keyword_2_7_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0()));
		match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw8Keyword_2_7_0__a_Kw7Keyword_2_6_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()));
		match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw6Keyword_2_5_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()));
		match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw5Keyword_2_4_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()));
		match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw4Keyword_2_3_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()));
		match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw3Keyword_2_2_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()));
		match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw2Keyword_2_1_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()));
		match_LongAlternative_____Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw1Keyword_2_0_0__p = new GroupAlias(true, false, new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0()), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0())), new TokenAlias(false, false, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0()));
		match_MandatoryManyTransition_KW1ParserRuleCall_1_p = new TokenAlias(true, false, grammarAccess.getMandatoryManyTransitionAccess().getKW1ParserRuleCall_1());
		match_OptionalManyTransition_KW1ParserRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getOptionalManyTransitionAccess().getKW1ParserRuleCall_1());
		match_OptionalSingleTransition_KW1ParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getOptionalSingleTransitionAccess().getKW1ParserRuleCall_1());
		match_Prim1_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrim1Access().getLeftParenthesisKeyword_1_0());
		match_Prim1_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrim1Access().getLeftParenthesisKeyword_1_0());
		match_Prim2_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrim2Access().getLeftParenthesisKeyword_1_0());
		match_Prim2_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrim2Access().getLeftParenthesisKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBOOLEAN_TERMINAL_IDRule())
			return getBOOLEAN_TERMINAL_IDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBooleanDatatypeIDRule())
			return getBooleanDatatypeIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getC_COMMENT_ENDRule())
			return getC_COMMENT_ENDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getKW1Rule())
			return getKW1Token(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BOOLEAN_TERMINAL_ID:
	 * 	'%1' ID;
	 */
	protected String getBOOLEAN_TERMINAL_IDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%1";
	}
	
	/**
	 * BooleanDatatypeID:
	 * 	ID;
	 */
	protected String getBooleanDatatypeIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal C_COMMENT_END: '*&#47;';
	 */
	protected String getC_COMMENT_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*/";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * KW1:
	 * 	"kw1" | "matched" INT?;
	 */
	protected String getKW1Token(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "kw1";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ActionOnly_IDTerminalRuleCall_2_q.equals(syntax))
				emit_ActionOnly_IDTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ActionOnly_IDTerminalRuleCall_5_q.equals(syntax))
				emit_ActionOnly_IDTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ActionOnly_Kw1Keyword_1_q.equals(syntax))
				emit_ActionOnly_Kw1Keyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ActionOnly_Kw2Keyword_4_q.equals(syntax))
				emit_ActionOnly_Kw2Keyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AlternativeTransition_KW1ParserRuleCall_1_0_or_Kw2Keyword_1_1.equals(syntax))
				emit_AlternativeTransition_KW1ParserRuleCall_1_0_or_Kw2Keyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative___Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a.equals(syntax))
				emit_LongAlternative___Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0__a_Kw8Keyword_2_7_0__p.equals(syntax))
				emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0__a_Kw8Keyword_2_7_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw8Keyword_2_7_0__a_Kw7Keyword_2_6_0__p.equals(syntax))
				emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw8Keyword_2_7_0__a_Kw7Keyword_2_6_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw6Keyword_2_5_0__p.equals(syntax))
				emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw6Keyword_2_5_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw5Keyword_2_4_0__p.equals(syntax))
				emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw5Keyword_2_4_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw4Keyword_2_3_0__p.equals(syntax))
				emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw4Keyword_2_3_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw3Keyword_2_2_0__p.equals(syntax))
				emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw3Keyword_2_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw1Keyword_2_0_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw2Keyword_2_1_0__p.equals(syntax))
				emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw2Keyword_2_1_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongAlternative_____Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw1Keyword_2_0_0__p.equals(syntax))
				emit_LongAlternative_____Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw1Keyword_2_0_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MandatoryManyTransition_KW1ParserRuleCall_1_p.equals(syntax))
				emit_MandatoryManyTransition_KW1ParserRuleCall_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OptionalManyTransition_KW1ParserRuleCall_1_a.equals(syntax))
				emit_OptionalManyTransition_KW1ParserRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OptionalSingleTransition_KW1ParserRuleCall_1_q.equals(syntax))
				emit_OptionalSingleTransition_KW1ParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Prim1_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Prim1_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Prim1_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Prim1_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Prim2_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Prim2_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Prim2_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Prim2_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ID?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#14' 'kw1'? (ambiguity) 'kw2'? ID? (rule start)
	 
	 * </pre>
	 */
	protected void emit_ActionOnly_IDTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ID?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#14' 'kw1'? ID? 'kw2'? (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_ActionOnly_IDTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'kw1'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#14' (ambiguity) ID? 'kw2'? ID? (rule start)
	 
	 * </pre>
	 */
	protected void emit_ActionOnly_Kw1Keyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'kw2'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#14' 'kw1'? ID? (ambiguity) ID? (rule start)
	 
	 * </pre>
	 */
	protected void emit_ActionOnly_Kw2Keyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     KW1 | 'kw2'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#11' (ambiguity) val=ID
	 
	 * </pre>
	 */
	protected void emit_AlternativeTransition_KW1ParserRuleCall_1_0_or_Kw2Keyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         'kw1' | 
	  *         'kw2' | 
	  *         'kw3' | 
	  *         'kw4' | 
	  *         'kw5' | 
	  *         'kw6' | 
	  *         'kw7' | 
	  *         'kw8'
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) '!' (rule end)
	 *     val1+=ID (ambiguity) '!' (rule end)
	 *     val2+=ID (ambiguity) '!' (rule end)
	 *     val3+=ID (ambiguity) '!' (rule end)
	 *     val4+=ID (ambiguity) '!' (rule end)
	 *     val5+=ID (ambiguity) '!' (rule end)
	 *     val6+=ID (ambiguity) '!' (rule end)
	 *     val7+=ID (ambiguity) '!' (rule end)
	 *     val8+=ID (ambiguity) '!' (rule end)
	 
	 * </pre>
	 */
	protected void emit_LongAlternative___Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw1' | 
	  *             'kw2' | 
	  *             'kw3' | 
	  *             'kw4' | 
	  *             'kw5' | 
	  *             'kw6' | 
	  *             'kw7'
	  *         )* 
	  *         'kw8'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val8+=ID
	 *     val1+=ID (ambiguity) val8+=ID
	 *     val2+=ID (ambiguity) val8+=ID
	 *     val3+=ID (ambiguity) val8+=ID
	 *     val4+=ID (ambiguity) val8+=ID
	 *     val5+=ID (ambiguity) val8+=ID
	 *     val6+=ID (ambiguity) val8+=ID
	 *     val7+=ID (ambiguity) val8+=ID
	 *     val8+=ID (ambiguity) val8+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0__a_Kw8Keyword_2_7_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw1' | 
	  *             'kw2' | 
	  *             'kw3' | 
	  *             'kw4' | 
	  *             'kw5' | 
	  *             'kw6' | 
	  *             'kw8'
	  *         )* 
	  *         'kw7'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val7+=ID
	 *     val1+=ID (ambiguity) val7+=ID
	 *     val2+=ID (ambiguity) val7+=ID
	 *     val3+=ID (ambiguity) val7+=ID
	 *     val4+=ID (ambiguity) val7+=ID
	 *     val5+=ID (ambiguity) val7+=ID
	 *     val6+=ID (ambiguity) val7+=ID
	 *     val7+=ID (ambiguity) val7+=ID
	 *     val8+=ID (ambiguity) val7+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw8Keyword_2_7_0__a_Kw7Keyword_2_6_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw1' | 
	  *             'kw2' | 
	  *             'kw3' | 
	  *             'kw4' | 
	  *             'kw5' | 
	  *             'kw7' | 
	  *             'kw8'
	  *         )* 
	  *         'kw6'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val6+=ID
	 *     val1+=ID (ambiguity) val6+=ID
	 *     val2+=ID (ambiguity) val6+=ID
	 *     val3+=ID (ambiguity) val6+=ID
	 *     val4+=ID (ambiguity) val6+=ID
	 *     val5+=ID (ambiguity) val6+=ID
	 *     val6+=ID (ambiguity) val6+=ID
	 *     val7+=ID (ambiguity) val6+=ID
	 *     val8+=ID (ambiguity) val6+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw6Keyword_2_5_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw1' | 
	  *             'kw2' | 
	  *             'kw3' | 
	  *             'kw4' | 
	  *             'kw6' | 
	  *             'kw7' | 
	  *             'kw8'
	  *         )* 
	  *         'kw5'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val5+=ID
	 *     val1+=ID (ambiguity) val5+=ID
	 *     val2+=ID (ambiguity) val5+=ID
	 *     val3+=ID (ambiguity) val5+=ID
	 *     val4+=ID (ambiguity) val5+=ID
	 *     val5+=ID (ambiguity) val5+=ID
	 *     val6+=ID (ambiguity) val5+=ID
	 *     val7+=ID (ambiguity) val5+=ID
	 *     val8+=ID (ambiguity) val5+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw5Keyword_2_4_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw1' | 
	  *             'kw2' | 
	  *             'kw3' | 
	  *             'kw5' | 
	  *             'kw6' | 
	  *             'kw7' | 
	  *             'kw8'
	  *         )* 
	  *         'kw4'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val4+=ID
	 *     val1+=ID (ambiguity) val4+=ID
	 *     val2+=ID (ambiguity) val4+=ID
	 *     val3+=ID (ambiguity) val4+=ID
	 *     val4+=ID (ambiguity) val4+=ID
	 *     val5+=ID (ambiguity) val4+=ID
	 *     val6+=ID (ambiguity) val4+=ID
	 *     val7+=ID (ambiguity) val4+=ID
	 *     val8+=ID (ambiguity) val4+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw4Keyword_2_3_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw1' | 
	  *             'kw2' | 
	  *             'kw4' | 
	  *             'kw5' | 
	  *             'kw6' | 
	  *             'kw7' | 
	  *             'kw8'
	  *         )* 
	  *         'kw3'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val3+=ID
	 *     val1+=ID (ambiguity) val3+=ID
	 *     val2+=ID (ambiguity) val3+=ID
	 *     val3+=ID (ambiguity) val3+=ID
	 *     val4+=ID (ambiguity) val3+=ID
	 *     val5+=ID (ambiguity) val3+=ID
	 *     val6+=ID (ambiguity) val3+=ID
	 *     val7+=ID (ambiguity) val3+=ID
	 *     val8+=ID (ambiguity) val3+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw2Keyword_2_1_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw3Keyword_2_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw1' | 
	  *             'kw3' | 
	  *             'kw4' | 
	  *             'kw5' | 
	  *             'kw6' | 
	  *             'kw7' | 
	  *             'kw8'
	  *         )* 
	  *         'kw2'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val2+=ID
	 *     val1+=ID (ambiguity) val2+=ID
	 *     val2+=ID (ambiguity) val2+=ID
	 *     val3+=ID (ambiguity) val2+=ID
	 *     val4+=ID (ambiguity) val2+=ID
	 *     val5+=ID (ambiguity) val2+=ID
	 *     val6+=ID (ambiguity) val2+=ID
	 *     val7+=ID (ambiguity) val2+=ID
	 *     val8+=ID (ambiguity) val2+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw1Keyword_2_0_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw2Keyword_2_1_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'kw2' | 
	  *             'kw3' | 
	  *             'kw4' | 
	  *             'kw5' | 
	  *             'kw6' | 
	  *             'kw7' | 
	  *             'kw8'
	  *         )* 
	  *         'kw1'
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     foo=ID (ambiguity) val1+=ID
	 *     val1+=ID (ambiguity) val1+=ID
	 *     val2+=ID (ambiguity) val1+=ID
	 *     val3+=ID (ambiguity) val1+=ID
	 *     val4+=ID (ambiguity) val1+=ID
	 *     val5+=ID (ambiguity) val1+=ID
	 *     val6+=ID (ambiguity) val1+=ID
	 *     val7+=ID (ambiguity) val1+=ID
	 *     val8+=ID (ambiguity) val1+=ID
	 
	 * </pre>
	 */
	protected void emit_LongAlternative_____Kw2Keyword_2_1_0_or_Kw3Keyword_2_2_0_or_Kw4Keyword_2_3_0_or_Kw5Keyword_2_4_0_or_Kw6Keyword_2_5_0_or_Kw7Keyword_2_6_0_or_Kw8Keyword_2_7_0__a_Kw1Keyword_2_0_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     KW1+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#10' (ambiguity) val=ID
	 
	 * </pre>
	 */
	protected void emit_MandatoryManyTransition_KW1ParserRuleCall_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     KW1*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#9' (ambiguity) val=ID
	 
	 * </pre>
	 */
	protected void emit_OptionalManyTransition_KW1ParserRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     KW1?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#8' (ambiguity) val=ID
	 
	 * </pre>
	 */
	protected void emit_OptionalSingleTransition_KW1ParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#3' (ambiguity) name=ID
	 *     (rule start) '#3' (ambiguity) {Add1.left=}
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) {Add1.left=}
	 
	 * </pre>
	 */
	protected void emit_Prim1_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Add1.left=}
	 
	 * </pre>
	 */
	protected void emit_Prim1_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '#4' (ambiguity) name=ID
	 *     (rule start) '#4' (ambiguity) {Add2.left=}
	 *     (rule start) '#4' (ambiguity) {Mult2.left=}
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) {Add2.left=}
	 *     (rule start) (ambiguity) {Mult2.left=}
	 
	 * </pre>
	 */
	protected void emit_Prim2_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Add2.left=}
	 *     (rule start) (ambiguity) {Mult2.left=}
	 
	 * </pre>
	 */
	protected void emit_Prim2_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
