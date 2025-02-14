/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalComplexReconstrTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.reconstr.services.ComplexReconstrTestLanguageGrammarAccess;

}

@parser::members {

 	private ComplexReconstrTestLanguageGrammarAccess grammarAccess;

    public InternalComplexReconstrTestLanguageParser(TokenStream input, ComplexReconstrTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected ComplexReconstrTestLanguageGrammarAccess getGrammarAccess() {
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
			newCompositeNode(grammarAccess.getRootAccess().getOpParserRuleCall_0());
		}
		this_Op_0=ruleOp
		{
			$current = $this_Op_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getRootAccess().getTrickyGParserRuleCall_1());
		}
		this_TrickyG_1=ruleTrickyG
		{
			$current = $this_TrickyG_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleOp
entryRuleOp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOpRule()); }
	iv_ruleOp=ruleOp
	{ $current=$iv_ruleOp.current; }
	EOF;

// Rule Op
ruleOp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOpAccess().getTermParserRuleCall_0());
		}
		this_Term_0=ruleTerm
		{
			$current = $this_Term_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndAdd(
							grammarAccess.getOpAccess().getAddAddOperandsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='+'
				{
					newLeafNode(otherlv_2, grammarAccess.getOpAccess().getPlusSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getOpAccess().getAddOperandsTermParserRuleCall_1_0_2_0());
						}
						lv_addOperands_3_0=ruleTerm
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOpRule());
							}
							add(
								$current,
								"addOperands",
								lv_addOperands_3_0,
								"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Term");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndAdd(
							grammarAccess.getOpAccess().getMinusMinusOperandsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='-'
				{
					newLeafNode(otherlv_5, grammarAccess.getOpAccess().getHyphenMinusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getOpAccess().getMinusOperandsTermParserRuleCall_1_1_2_0());
						}
						lv_minusOperands_6_0=ruleTerm
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOpRule());
							}
							add(
								$current,
								"minusOperands",
								lv_minusOperands_6_0,
								"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.Term");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleTerm
entryRuleTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermRule()); }
	iv_ruleTerm=ruleTerm
	{ $current=$iv_ruleTerm.current; }
	EOF;

// Rule Term
ruleTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTermAccess().getAtomParserRuleCall_0());
		}
		this_Atom_0=ruleAtom
		{
			$current = $this_Atom_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTermAccess().getParensParserRuleCall_1());
		}
		this_Parens_1=ruleParens
		{
			$current = $this_Parens_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtom
entryRuleAtom returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomRule()); }
	iv_ruleAtom=ruleAtom
	{ $current=$iv_ruleAtom.current; }
	EOF;

// Rule Atom
ruleAtom returns [EObject current=null]
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
				newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAtomRule());
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

// Entry rule entryRuleParens
entryRuleParens returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParensRule()); }
	iv_ruleParens=ruleParens
	{ $current=$iv_ruleParens.current; }
	EOF;

// Rule Parens
ruleParens returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParensAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParensAccess().getOpParserRuleCall_1());
		}
		this_Op_1=ruleOp
		{
			$current = $this_Op_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParensAccess().getRightParenthesisKeyword_2());
		}
		(
			(
				lv_em_3_0='!'
				{
					newLeafNode(lv_em_3_0, grammarAccess.getParensAccess().getEmExclamationMarkKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParensRule());
					}
					setWithLastConsumed($current, "em", lv_em_3_0, "!");
				}
			)
		)?
	)
;

// Entry rule entryRuleTrickyG
entryRuleTrickyG returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrickyGRule()); }
	iv_ruleTrickyG=ruleTrickyG
	{ $current=$iv_ruleTrickyG.current; }
	EOF;

// Rule TrickyG
ruleTrickyG returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TG'
		{
			newLeafNode(otherlv_0, grammarAccess.getTrickyGAccess().getTGKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrickyGAccess().getTreeTrickyG1ParserRuleCall_1_0());
				}
				lv_tree_1_0=ruleTrickyG1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrickyGRule());
					}
					set(
						$current,
						"tree",
						lv_tree_1_0,
						"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG1");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTrickyG1
entryRuleTrickyG1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrickyG1Rule()); }
	iv_ruleTrickyG1=ruleTrickyG1
	{ $current=$iv_ruleTrickyG1.current; }
	EOF;

// Rule TrickyG1
ruleTrickyG1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getTrickyG1Access().getLeftSquareBracketKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTrickyG1Access().getValsTrickyG2ParserRuleCall_1_0_0());
					}
					lv_vals_1_0=ruleTrickyG2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTrickyG1Rule());
						}
						add(
							$current,
							"vals",
							lv_vals_1_0,
							"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG2");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getTrickyG1Access().getCommaKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTrickyG1Access().getValsTrickyG2ParserRuleCall_1_1_1_0());
						}
						lv_vals_3_0=ruleTrickyG2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTrickyG1Rule());
							}
							add(
								$current,
								"vals",
								lv_vals_3_0,
								"org.eclipse.xtext.parsetree.reconstr.ComplexReconstrTestLanguage.TrickyG2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getTrickyG1Access().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleTrickyG2
entryRuleTrickyG2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrickyG2Rule()); }
	iv_ruleTrickyG2=ruleTrickyG2
	{ $current=$iv_ruleTrickyG2.current; }
	EOF;

// Rule TrickyG2
ruleTrickyG2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTrickyG2Access().getTrickyG1ParserRuleCall_0());
		}
		this_TrickyG1_0=ruleTrickyG1
		{
			$current = $this_TrickyG1_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				lv_val_1_0=RULE_INT
				{
					newLeafNode(lv_val_1_0, grammarAccess.getTrickyG2Access().getValINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTrickyG2Rule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
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
