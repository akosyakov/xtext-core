/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalRegionAccessTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.formatting2.regionaccess.internal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.formatting2.regionaccess.internal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.formatting2.regionaccess.internal.services.RegionAccessTestLanguageGrammarAccess;

}

@parser::members {

 	private RegionAccessTestLanguageGrammarAccess grammarAccess;

    public InternalRegionAccessTestLanguageParser(TokenStream input, RegionAccessTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected RegionAccessTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRootAccess().getSimpleParserRuleCall_0());
		}
		this_Simple_0=ruleSimple
		{
			$current = $this_Simple_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootAccess().getDelegationParserRuleCall_1());
		}
		this_Delegation_1=ruleDelegation
		{
			$current = $this_Delegation_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootAccess().getUnassignedParserRuleCall_2());
		}
		this_Unassigned_2=ruleUnassigned
		{
			$current = $this_Unassigned_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootAccess().getPrefixedUnassignedParserRuleCall_3());
		}
		this_PrefixedUnassigned_3=rulePrefixedUnassigned
		{
			$current = $this_PrefixedUnassigned_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_4='5'
			{
				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getDigitFiveKeyword_4_0());
			}
			{
				newCompositeNode(grammarAccess.getRootAccess().getExpressionParserRuleCall_4_1());
			}
			this_Expression_5=ruleExpression
			{
				$current = $this_Expression_5.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			otherlv_6='6'
			{
				newLeafNode(otherlv_6, grammarAccess.getRootAccess().getDigitSixKeyword_5_0());
			}
			{
				newCompositeNode(grammarAccess.getRootAccess().getMixedParserRuleCall_5_1());
			}
			this_Mixed_7=ruleMixed
			{
				$current = $this_Mixed_7.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			otherlv_8='7'
			{
				newLeafNode(otherlv_8, grammarAccess.getRootAccess().getDigitSevenKeyword_6_0());
			}
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getRootAccess().getRootActionAction_6_1_0(),
							$current);
					}
				)
				otherlv_10='action'
				{
					newLeafNode(otherlv_10, grammarAccess.getRootAccess().getActionKeyword_6_1_1());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getRootAccess().getMixedMixedParserRuleCall_6_2_0());
					}
					lv_mixed_11_0=ruleMixed
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRootRule());
						}
						set(
							$current,
							"mixed",
							lv_mixed_11_0,
							"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_12='8'
			{
				newLeafNode(otherlv_12, grammarAccess.getRootAccess().getDigitEightKeyword_7_0());
			}
			{
				newCompositeNode(grammarAccess.getRootAccess().getValueListParserRuleCall_7_1());
			}
			this_ValueList_13=ruleValueList
			{
				$current = $this_ValueList_13.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSimple
entryRuleSimple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleRule()); }
	iv_ruleSimple=ruleSimple
	{ $current=$iv_ruleSimple.current; }
	EOF;

// Rule Simple
ruleSimple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='1'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleAccess().getDigitOneKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSimpleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDelegation
entryRuleDelegation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelegationRule()); }
	iv_ruleDelegation=ruleDelegation
	{ $current=$iv_ruleDelegation.current; }
	EOF;

// Rule Delegation
ruleDelegation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='2'
		{
			newLeafNode(otherlv_0, grammarAccess.getDelegationAccess().getDigitTwoKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDelegationAccess().getDelegateDelegateParserRuleCall_1_0());
				}
				lv_delegate_1_0=ruleDelegate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDelegationRule());
					}
					set(
						$current,
						"delegate",
						lv_delegate_1_0,
						"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Delegate");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUnassigned
entryRuleUnassigned returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedRule()); }
	iv_ruleUnassigned=ruleUnassigned
	{ $current=$iv_ruleUnassigned.current; }
	EOF;

// Rule Unassigned
ruleUnassigned returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='3'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnassignedAccess().getDigitThreeKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getUnassignedAccess().getDelegateParserRuleCall_1());
		}
		this_Delegate_1=ruleDelegate
		{
			$current = $this_Delegate_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrefixedUnassigned
entryRulePrefixedUnassigned returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrefixedUnassignedRule()); }
	iv_rulePrefixedUnassigned=rulePrefixedUnassigned
	{ $current=$iv_rulePrefixedUnassigned.current; }
	EOF;

// Rule PrefixedUnassigned
rulePrefixedUnassigned returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='4'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrefixedUnassignedAccess().getDigitFourKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPrefixedUnassignedAccess().getDelegatePrefixedDelegateParserRuleCall_1_0());
				}
				lv_delegate_1_0=rulePrefixedDelegate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrefixedUnassignedRule());
					}
					set(
						$current,
						"delegate",
						lv_delegate_1_0,
						"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.PrefixedDelegate");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePrefixedDelegate
entryRulePrefixedDelegate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrefixedDelegateRule()); }
	iv_rulePrefixedDelegate=rulePrefixedDelegate
	{ $current=$iv_rulePrefixedDelegate.current; }
	EOF;

// Rule PrefixedDelegate
rulePrefixedDelegate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='prefix'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrefixedDelegateAccess().getPrefixKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getPrefixedDelegateAccess().getDelegateParserRuleCall_1());
		}
		this_Delegate_1=ruleDelegate
		{
			$current = $this_Delegate_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDelegate
entryRuleDelegate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelegateRule()); }
	iv_ruleDelegate=ruleDelegate
	{ $current=$iv_ruleDelegate.current; }
	EOF;

// Rule Delegate
ruleDelegate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getDelegateAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDelegateRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExpressionAccess().getAddLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='+'
			{
				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExpressionAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpressionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getNamedAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getPrimaryAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesizedParserRuleCall_1());
		}
		this_Parenthesized_2=ruleParenthesized
		{
			$current = $this_Parenthesized_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParenthesized
entryRuleParenthesized returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesizedRule()); }
	iv_ruleParenthesized=ruleParenthesized
	{ $current=$iv_ruleParenthesized.current; }
	EOF;

// Rule Parenthesized
ruleParenthesized returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesizedAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesizedAccess().getExpressionParserRuleCall_1());
		}
		this_Expression_1=ruleExpression
		{
			$current = $this_Expression_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesizedAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleMixed
entryRuleMixed returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMixedRule()); }
	iv_ruleMixed=ruleMixed
	{ $current=$iv_ruleMixed.current; }
	EOF;

// Rule Mixed
ruleMixed returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getMixedAccess().getLeftParenthesisKeyword_0());
		}
		(
			otherlv_1='unassigned'
			{
				newLeafNode(otherlv_1, grammarAccess.getMixedAccess().getUnassignedKeyword_1_0());
			}
			(
				this_ID_2=RULE_ID
				{
					newLeafNode(this_ID_2, grammarAccess.getMixedAccess().getIDTerminalRuleCall_1_1_0());
				}
				    |
				{
					newCompositeNode(grammarAccess.getMixedAccess().getDatatypeParserRuleCall_1_1_1());
				}
				ruleDatatype
				{
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getMixedAccess().getActionAction_2_0_0(),
							$current);
					}
				)
				(
					otherlv_5='fragment'
					{
						newLeafNode(otherlv_5, grammarAccess.getMixedAccess().getFragmentKeyword_2_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMixedRule());
						}
						newCompositeNode(grammarAccess.getMixedAccess().getFragmentParserRuleCall_2_0_1_1());
					}
					this_Fragment_6=ruleFragment[$current]
					{
						$current = $this_Fragment_6.current;
						afterParserOrEnumRuleCall();
					}
				)?
			)
			    |
			{
				newCompositeNode(grammarAccess.getMixedAccess().getMixedParserRuleCall_2_1());
			}
			this_Mixed_7=ruleMixed
			{
				$current = $this_Mixed_7.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				(
					(
						lv_name_8_0=RULE_ID
						{
							newLeafNode(lv_name_8_0, grammarAccess.getMixedAccess().getNameIDTerminalRuleCall_2_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMixedRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_8_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				    |
				(
					otherlv_9='child'
					{
						newLeafNode(otherlv_9, grammarAccess.getMixedAccess().getChildKeyword_2_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getMixedAccess().getEobjMixedParserRuleCall_2_2_1_1_0());
							}
							lv_eobj_10_0=ruleMixed
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getMixedRule());
								}
								set(
									$current,
									"eobj",
									lv_eobj_10_0,
									"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getMixedAccess().getDatatypeDatatypeParserRuleCall_2_2_2_0());
						}
						lv_datatype_11_0=ruleDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMixedRule());
							}
							set(
								$current,
								"datatype",
								lv_datatype_11_0,
								"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Datatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					otherlv_12='ref'
					{
						newLeafNode(otherlv_12, grammarAccess.getMixedAccess().getRefKeyword_2_2_3_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getMixedRule());
								}
							}
							otherlv_13=RULE_ID
							{
								newLeafNode(otherlv_13, grammarAccess.getMixedAccess().getRefMixedCrossReference_2_2_3_1_0());
							}
						)
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getMixedAccess().getLitEnumEnumRuleCall_2_2_4_0());
						}
						lv_lit_14_0=ruleEnum
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMixedRule());
							}
							set(
								$current,
								"lit",
								lv_lit_14_0,
								"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Enum");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		otherlv_15=')'
		{
			newLeafNode(otherlv_15, grammarAccess.getMixedAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMixedAccess().getAssignedActionChildAction_4_0(),
						$current);
				}
			)
			otherlv_17='action'
			{
				newLeafNode(otherlv_17, grammarAccess.getMixedAccess().getActionKeyword_4_1());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getMixedAccess().getBodyMixedParserRuleCall_4_2_0_0());
						}
						lv_body_18_0=ruleMixed
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMixedRule());
							}
							set(
								$current,
								"body",
								lv_body_18_0,
								"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_19='end'
				{
					newLeafNode(otherlv_19, grammarAccess.getMixedAccess().getEndKeyword_4_2_1());
				}
			)?
		)*
	)
;

// Entry rule entryRuleDatatype
entryRuleDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); }
	iv_ruleDatatype=ruleDatatype
	{ $current=$iv_ruleDatatype.current.getText(); }
	EOF;

// Rule Datatype
ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='datatype'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getDatatypeAccess().getDatatypeParserRuleCall_1_0());
			}
			this_Datatype_1=ruleDatatype
			{
				$current.merge(this_Datatype_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
			    |
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getDatatypeAccess().getIDTerminalRuleCall_1_1());
			}
		)
	)
;


// Rule Fragment
ruleFragment[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_fragName_0_0=RULE_ID
				{
					newLeafNode(lv_fragName_0_0, grammarAccess.getFragmentAccess().getFragNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFragmentRule());
					}
					setWithLastConsumed(
						$current,
						"fragName",
						lv_fragName_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			otherlv_1='child'
			{
				newLeafNode(otherlv_1, grammarAccess.getFragmentAccess().getChildKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFragmentAccess().getMixedMixedParserRuleCall_1_1_0());
					}
					lv_mixed_2_0=ruleMixed
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFragmentRule());
						}
						set(
							$current,
							"mixed",
							lv_mixed_2_0,
							"org.eclipse.xtext.formatting2.regionaccess.internal.RegionAccessTestLanguage.Mixed");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_3='recursion'
			{
				newLeafNode(otherlv_3, grammarAccess.getFragmentAccess().getRecursionKeyword_2_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFragmentRule());
				}
				newCompositeNode(grammarAccess.getFragmentAccess().getFragmentParserRuleCall_2_1());
			}
			this_Fragment_4=ruleFragment[$current]
			{
				$current = $this_Fragment_4.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleValueList
entryRuleValueList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueListRule()); }
	iv_ruleValueList=ruleValueList
	{ $current=$iv_ruleValueList.current; }
	EOF;

// Rule ValueList
ruleValueList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getValueListAccess().getValueListAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getValueListAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueListRule());
					}
					addWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)*
	)
;

// Rule Enum
ruleEnum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='lit1'
			{
				$current = grammarAccess.getEnumAccess().getLit1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnumAccess().getLit1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='lit2'
			{
				$current = grammarAccess.getEnumAccess().getLit2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnumAccess().getLit2EnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
