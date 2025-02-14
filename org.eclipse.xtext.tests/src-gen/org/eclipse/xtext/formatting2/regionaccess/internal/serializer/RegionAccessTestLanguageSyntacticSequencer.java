/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.formatting2.regionaccess.internal.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.regionaccess.internal.services.RegionAccessTestLanguageGrammarAccess;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RegionAccessTestLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RegionAccessTestLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Fragment_RecursionKeyword_2_0_a;
	protected AbstractElementAlias match_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__a;
	protected AbstractElementAlias match_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__p;
	protected AbstractElementAlias match_Parenthesized_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_Parenthesized_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RegionAccessTestLanguageGrammarAccess) access;
		match_Fragment_RecursionKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getFragmentAccess().getRecursionKeyword_2_0());
		match_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getMixedAccess().getLeftParenthesisKeyword_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMixedAccess().getUnassignedKeyword_1_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMixedAccess().getDatatypeParserRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getMixedAccess().getIDTerminalRuleCall_1_1_0()))));
		match_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getMixedAccess().getLeftParenthesisKeyword_0()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMixedAccess().getUnassignedKeyword_1_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMixedAccess().getDatatypeParserRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getMixedAccess().getIDTerminalRuleCall_1_1_0()))));
		match_Parenthesized_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getParenthesizedAccess().getLeftParenthesisKeyword_0());
		match_Parenthesized_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getParenthesizedAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDatatypeRule())
			return getDatatypeToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Datatype:
	 * 	"datatype" (Datatype | ID);
	 */
	protected String getDatatypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "datatype";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Fragment_RecursionKeyword_2_0_a.equals(syntax))
				emit_Fragment_RecursionKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__a.equals(syntax))
				emit_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__p.equals(syntax))
				emit_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parenthesized_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_Parenthesized_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parenthesized_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_Parenthesized_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'recursion'*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '6' ('(' ('unassigned' (ID | Datatype))?)+ 'fragment' (ambiguity) 'child' mixed=Mixed
	 *     (rule start) '6' ('(' ('unassigned' (ID | Datatype))?)+ 'fragment' (ambiguity) fragName=ID
	 *     (rule start) ('(' ('unassigned' (ID | Datatype))?)+ 'fragment' (ambiguity) 'child' mixed=Mixed
	 *     (rule start) ('(' ('unassigned' (ID | Datatype))?)+ 'fragment' (ambiguity) fragName=ID
	 
	 * </pre>
	 */
	protected void emit_Fragment_RecursionKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ('unassigned' (ID | Datatype))?)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '6' (ambiguity) {AssignedAction.child=}
	 *     (rule start) (ambiguity) {AssignedAction.child=}
	 
	 * </pre>
	 */
	protected void emit_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('(' ('unassigned' (ID | Datatype))?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '6' (ambiguity) ')' (rule start)
	 *     (rule start) '6' (ambiguity) 'child' eobj=Mixed
	 *     (rule start) '6' (ambiguity) 'fragment' 'recursion'* 'child' mixed=Mixed
	 *     (rule start) '6' (ambiguity) 'fragment' 'recursion'* fragName=ID
	 *     (rule start) '6' (ambiguity) 'ref' ref=[Mixed|ID]
	 *     (rule start) '6' (ambiguity) datatype=Datatype
	 *     (rule start) '6' (ambiguity) lit=Enum
	 *     (rule start) '6' (ambiguity) name=ID
	 *     (rule start) (ambiguity) ')' (rule start)
	 *     (rule start) (ambiguity) 'child' eobj=Mixed
	 *     (rule start) (ambiguity) 'fragment' 'recursion'* 'child' mixed=Mixed
	 *     (rule start) (ambiguity) 'fragment' 'recursion'* fragName=ID
	 *     (rule start) (ambiguity) 'ref' ref=[Mixed|ID]
	 *     (rule start) (ambiguity) datatype=Datatype
	 *     (rule start) (ambiguity) lit=Enum
	 *     (rule start) (ambiguity) name=ID
	 
	 * </pre>
	 */
	protected void emit_Mixed___LeftParenthesisKeyword_0___UnassignedKeyword_1_0___DatatypeParserRuleCall_1_1_1_or_IDTerminalRuleCall_1_1_0____q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '5' (ambiguity) name=ID
	 *     (rule start) '5' (ambiguity) {Add.left=}
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) {Add.left=}
	 
	 * </pre>
	 */
	protected void emit_Parenthesized_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 *     (rule start) (ambiguity) {Add.left=}
	 
	 * </pre>
	 */
	protected void emit_Parenthesized_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
