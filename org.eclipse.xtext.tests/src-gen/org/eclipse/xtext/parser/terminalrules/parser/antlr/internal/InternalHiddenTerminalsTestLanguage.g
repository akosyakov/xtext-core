/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalHiddenTerminalsTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.terminalrules.services.HiddenTerminalsTestLanguageGrammarAccess;

}

@parser::members {

 	private HiddenTerminalsTestLanguageGrammarAccess grammarAccess;

    public InternalHiddenTerminalsTestLanguageParser(TokenStream input, HiddenTerminalsTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected HiddenTerminalsTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getModelAccess().getWithoutHiddensParserRuleCall_0());
		}
		this_WithoutHiddens_0=ruleWithoutHiddens
		{
			$current = $this_WithoutHiddens_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getWithHiddensParserRuleCall_1());
		}
		this_WithHiddens_1=ruleWithHiddens
		{
			$current = $this_WithHiddens_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getOverridingHiddensParserRuleCall_2());
		}
		this_OverridingHiddens_2=ruleOverridingHiddens
		{
			$current = $this_OverridingHiddens_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getInheritingHiddensParserRuleCall_3());
		}
		this_InheritingHiddens_3=ruleInheritingHiddens
		{
			$current = $this_InheritingHiddens_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getDatatypeHiddensParserRuleCall_4());
		}
		this_DatatypeHiddens_4=ruleDatatypeHiddens
		{
			$current = $this_DatatypeHiddens_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleWithoutHiddens
entryRuleWithoutHiddens returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWithoutHiddensRule()); }
	iv_ruleWithoutHiddens=ruleWithoutHiddens
	{ $current=$iv_ruleWithoutHiddens.current; }
	EOF;

// Rule WithoutHiddens
ruleWithoutHiddens returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='without'
		{
			newLeafNode(otherlv_0, grammarAccess.getWithoutHiddensAccess().getWithoutKeyword_0());
		}
		(
			(
				lv_spaces_1_0=RULE_WS
				{
					newLeafNode(lv_spaces_1_0, grammarAccess.getWithoutHiddensAccess().getSpacesWSTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWithoutHiddensRule());
					}
					addWithLastConsumed(
						$current,
						"spaces",
						lv_spaces_1_0,
						"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
				}
			)
		)
		otherlv_2='hiddens'
		{
			newLeafNode(otherlv_2, grammarAccess.getWithoutHiddensAccess().getHiddensKeyword_2());
		}
		(
			(
				lv_spaces_3_0=RULE_WS
				{
					newLeafNode(lv_spaces_3_0, grammarAccess.getWithoutHiddensAccess().getSpacesWSTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWithoutHiddensRule());
					}
					addWithLastConsumed(
						$current,
						"spaces",
						lv_spaces_3_0,
						"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
				}
			)
		)?
		(
			(
				lv_valid_4_0=';'
				{
					newLeafNode(lv_valid_4_0, grammarAccess.getWithoutHiddensAccess().getValidSemicolonKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWithoutHiddensRule());
					}
					setWithLastConsumed($current, "valid", lv_valid_4_0 != null, ";");
				}
			)
		)
	)
;

// Entry rule entryRuleWithHiddens
entryRuleWithHiddens returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}:
	{ newCompositeNode(grammarAccess.getWithHiddensRule()); }
	iv_ruleWithHiddens=ruleWithHiddens
	{ $current=$iv_ruleWithHiddens.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule WithHiddens
ruleWithHiddens returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getWithHiddensAccess().getWithKeyword_0());
		}
		otherlv_1='hiddens'
		{
			newLeafNode(otherlv_1, grammarAccess.getWithHiddensAccess().getHiddensKeyword_1());
		}
		(
			(
				lv_valid_2_0=';'
				{
					newLeafNode(lv_valid_2_0, grammarAccess.getWithHiddensAccess().getValidSemicolonKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWithHiddensRule());
					}
					setWithLastConsumed($current, "valid", lv_valid_2_0 != null, ";");
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleOverridingHiddens
entryRuleOverridingHiddens returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}:
	{ newCompositeNode(grammarAccess.getOverridingHiddensRule()); }
	iv_ruleOverridingHiddens=ruleOverridingHiddens
	{ $current=$iv_ruleOverridingHiddens.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule OverridingHiddens
ruleOverridingHiddens returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='overriding'
		{
			newLeafNode(otherlv_0, grammarAccess.getOverridingHiddensAccess().getOverridingKeyword_0());
		}
		otherlv_1='hiddens'
		{
			newLeafNode(otherlv_1, grammarAccess.getOverridingHiddensAccess().getHiddensKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getOverridingHiddensAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOverridingHiddensAccess().getCalledOverridingHiddensCallParserRuleCall_3_0());
				}
				lv_called_3_0=ruleOverridingHiddensCall
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOverridingHiddensRule());
					}
					set(
						$current,
						"called",
						lv_called_3_0,
						"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.OverridingHiddensCall");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getOverridingHiddensAccess().getRightParenthesisKeyword_4());
		}
		(
			(
				lv_valid_5_0=';'
				{
					newLeafNode(lv_valid_5_0, grammarAccess.getOverridingHiddensAccess().getValidSemicolonKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOverridingHiddensRule());
					}
					setWithLastConsumed($current, "valid", lv_valid_5_0 != null, ";");
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleOverridingHiddensCall
entryRuleOverridingHiddensCall returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getOverridingHiddensCallRule()); }
	iv_ruleOverridingHiddensCall=ruleOverridingHiddensCall
	{ $current=$iv_ruleOverridingHiddensCall.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule OverridingHiddensCall
ruleOverridingHiddensCall returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='call'
		{
			newLeafNode(otherlv_0, grammarAccess.getOverridingHiddensCallAccess().getCallKeyword_0());
		}
		(
			(
				lv_spaces_1_0=RULE_WS
				{
					newLeafNode(lv_spaces_1_0, grammarAccess.getOverridingHiddensCallAccess().getSpacesWSTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOverridingHiddensCallRule());
					}
					addWithLastConsumed(
						$current,
						"spaces",
						lv_spaces_1_0,
						"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
				}
			)
		)?
		(
			(
				lv_valid_2_0=';'
				{
					newLeafNode(lv_valid_2_0, grammarAccess.getOverridingHiddensCallAccess().getValidSemicolonKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOverridingHiddensCallRule());
					}
					setWithLastConsumed($current, "valid", lv_valid_2_0 != null, ";");
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInheritingHiddens
entryRuleInheritingHiddens returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}:
	{ newCompositeNode(grammarAccess.getInheritingHiddensRule()); }
	iv_ruleInheritingHiddens=ruleInheritingHiddens
	{ $current=$iv_ruleInheritingHiddens.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule InheritingHiddens
ruleInheritingHiddens returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='inheriting'
		{
			newLeafNode(otherlv_0, grammarAccess.getInheritingHiddensAccess().getInheritingKeyword_0());
		}
		otherlv_1='hiddens'
		{
			newLeafNode(otherlv_1, grammarAccess.getInheritingHiddensAccess().getHiddensKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getInheritingHiddensAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getInheritingHiddensAccess().getCalledInheritingHiddensCallParserRuleCall_3_0_0());
					}
					lv_called_3_0=ruleInheritingHiddensCall
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInheritingHiddensRule());
						}
						set(
							$current,
							"called",
							lv_called_3_0,
							"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.InheritingHiddensCall");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getInheritingHiddensAccess().getHidingCalledHidingHiddensParserRuleCall_3_1_0());
					}
					lv_hidingCalled_4_0=ruleHidingHiddens
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInheritingHiddensRule());
						}
						set(
							$current,
							"hidingCalled",
							lv_hidingCalled_4_0,
							"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.HidingHiddens");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getInheritingHiddensAccess().getRightParenthesisKeyword_4());
		}
		(
			(
				lv_valid_6_0=';'
				{
					newLeafNode(lv_valid_6_0, grammarAccess.getInheritingHiddensAccess().getValidSemicolonKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritingHiddensRule());
					}
					setWithLastConsumed($current, "valid", lv_valid_6_0 != null, ";");
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDatatypeHiddens
entryRuleDatatypeHiddens returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeHiddensRule()); }
	iv_ruleDatatypeHiddens=ruleDatatypeHiddens
	{ $current=$iv_ruleDatatypeHiddens.current; }
	EOF;

// Rule DatatypeHiddens
ruleDatatypeHiddens returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDatatypeHiddensAccess().getDatatypeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDatatypeHiddensAccess().getValidDatatypeRuleParserRuleCall_1_0());
				}
				lv_valid_1_0=ruleDatatypeRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatatypeHiddensRule());
					}
					set(
						$current,
						"valid",
						lv_valid_1_0 != null,
						"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.DatatypeRule");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDatatypeRule
entryRuleDatatypeRule returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getDatatypeRuleRule()); }
	iv_ruleDatatypeRule=ruleDatatypeRule
	{ $current=$iv_ruleDatatypeRule.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule DatatypeRule
ruleDatatypeRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		kw='rule'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeRuleAccess().getRuleKeyword_0());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeRuleAccess().getSemicolonKeyword_1());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleHidingHiddens
entryRuleHidingHiddens returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getHidingHiddensRule()); }
	iv_ruleHidingHiddens=ruleHidingHiddens
	{ $current=$iv_ruleHidingHiddens.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule HidingHiddens
ruleHidingHiddens returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='hiding'
		{
			newLeafNode(otherlv_0, grammarAccess.getHidingHiddensAccess().getHidingKeyword_0());
		}
		(
			(
				lv_space_1_0=RULE_WS
				{
					newLeafNode(lv_space_1_0, grammarAccess.getHidingHiddensAccess().getSpaceWSTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHidingHiddensRule());
					}
					setWithLastConsumed(
						$current,
						"space",
						lv_space_1_0,
						"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.WS");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getHidingHiddensAccess().getCalledInheritingHiddensCallParserRuleCall_2_0());
				}
				lv_called_2_0=ruleInheritingHiddensCall
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getHidingHiddensRule());
					}
					set(
						$current,
						"called",
						lv_called_2_0,
						"org.eclipse.xtext.parser.terminalrules.HiddenTerminalsTestLanguage.InheritingHiddensCall");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInheritingHiddensCall
entryRuleInheritingHiddensCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInheritingHiddensCallRule()); }
	iv_ruleInheritingHiddensCall=ruleInheritingHiddensCall
	{ $current=$iv_ruleInheritingHiddensCall.current; }
	EOF;

// Rule InheritingHiddensCall
ruleInheritingHiddensCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='call'
		{
			newLeafNode(otherlv_0, grammarAccess.getInheritingHiddensCallAccess().getCallKeyword_0());
		}
		(
			(
				lv_valid_1_0=';'
				{
					newLeafNode(lv_valid_1_0, grammarAccess.getInheritingHiddensCallAccess().getValidSemicolonKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInheritingHiddensCallRule());
					}
					setWithLastConsumed($current, "valid", lv_valid_1_0 != null, ";");
				}
			)
		)
	)
;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
