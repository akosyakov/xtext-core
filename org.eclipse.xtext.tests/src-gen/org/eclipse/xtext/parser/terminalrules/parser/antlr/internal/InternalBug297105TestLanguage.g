/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug297105TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
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
import org.eclipse.xtext.parser.terminalrules.services.Bug297105TestLanguageGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private Bug297105TestLanguageGrammarAccess grammarAccess;

    public InternalBug297105TestLanguageParser(TokenStream input, Bug297105TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug297105TestLanguageGrammarAccess getGrammarAccess() {
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
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0());
			}
			lv_expressions_0_0=ruleExpression
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"expressions",
					lv_expressions_0_0,
					"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Expression");
				afterParserOrEnumRuleCall();
			}
		)
	)*
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
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getLeftLiteralParserRuleCall_0_0());
				}
				lv_left_0_0=ruleLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Literal");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='+'
		{
			newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getPlusSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExpressionAccess().getRightLiteralParserRuleCall_2_0());
				}
				lv_right_2_0=ruleLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExpressionRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.Literal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getRealLiteralParserRuleCall_0());
		}
		this_RealLiteral_0=ruleRealLiteral
		{
			$current = $this_RealLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1());
		}
		this_IntLiteral_1=ruleIntLiteral
		{
			$current = $this_IntLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntLiteral
entryRuleIntLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntLiteralRule()); }
	iv_ruleIntLiteral=ruleIntLiteral
	{ $current=$iv_ruleIntLiteral.current; }
	EOF;

// Rule IntLiteral
ruleIntLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getIntLiteralAccess().getValueIntValueParserRuleCall_0());
			}
			lv_value_0_0=ruleIntValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getIntLiteralRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.IntValue");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRealLiteral
entryRuleRealLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealLiteralRule()); }
	iv_ruleRealLiteral=ruleRealLiteral
	{ $current=$iv_ruleRealLiteral.current; }
	EOF;

// Rule RealLiteral
ruleRealLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getRealLiteralAccess().getValueRealValueParserRuleCall_0());
			}
			lv_value_0_0=ruleRealValue
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getRealLiteralRule());
				}
				set(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.parser.terminalrules.Bug297105TestLanguage.RealValue");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleIntValue
entryRuleIntValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIntValueRule()); }
	iv_ruleIntValue=ruleIntValue
	{ $current=$iv_ruleIntValue.current.getText(); }
	EOF;

// Rule IntValue
ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall());
	}
;

// Entry rule entryRuleRealValue
entryRuleRealValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRealValueRule()); }
	iv_ruleRealValue=ruleRealValue
	{ $current=$iv_ruleRealValue.current.getText(); }
	EOF;

// Rule RealValue
ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getRealValueAccess().getRealParserRuleCall());
	}
	this_Real_0=ruleReal
	{
		$current.merge(this_Real_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleReal
entryRuleReal returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getRealRule()); }
	iv_ruleReal=ruleReal
	{ $current=$iv_ruleReal.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Real
ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_INT_0=RULE_INT
			{
				$current.merge(this_INT_0);
			}
			{
				newLeafNode(this_INT_0, grammarAccess.getRealAccess().getINTTerminalRuleCall_0());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1());
		}
		(
			this_EXT_INT_2=RULE_EXT_INT
			{
				$current.merge(this_EXT_INT_2);
			}
			{
				newLeafNode(this_EXT_INT_2, grammarAccess.getRealAccess().getEXT_INTTerminalRuleCall_2_0());
			}
			    |
			this_INT_3=RULE_INT
			{
				$current.merge(this_INT_3);
			}
			{
				newLeafNode(this_INT_3, grammarAccess.getRealAccess().getINTTerminalRuleCall_2_1());
			}
		)
	)
;
finally {
	myHiddenTokenState.restore();
}

RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
