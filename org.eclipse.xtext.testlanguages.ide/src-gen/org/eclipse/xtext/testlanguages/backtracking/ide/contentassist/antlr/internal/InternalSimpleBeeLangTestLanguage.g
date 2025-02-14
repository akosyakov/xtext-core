/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSimpleBeeLangTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
	memoize=true;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.backtracking.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.backtracking.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.testlanguages.backtracking.services.SimpleBeeLangTestLanguageGrammarAccess;

}
@parser::members {
	private SimpleBeeLangTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(SimpleBeeLangTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDelegateModel
entryRuleDelegateModel
:
{ before(grammarAccess.getDelegateModelRule()); }
	 ruleDelegateModel
{ after(grammarAccess.getDelegateModelRule()); } 
	 EOF 
;

// Rule DelegateModel
ruleDelegateModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDelegateModelAccess().getModelParserRuleCall()); }
		ruleModel
		{ after(grammarAccess.getDelegateModelAccess().getModelParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getAlternatives()); }
		(rule__Model__Alternatives)
		{ after(grammarAccess.getModelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnit
entryRuleUnit
:
{ before(grammarAccess.getUnitRule()); }
	 ruleUnit
{ after(grammarAccess.getUnitRule()); } 
	 EOF 
;

// Rule Unit
ruleUnit 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnitAccess().getGroup()); }
		(rule__Unit__Group__0)
		{ after(grammarAccess.getUnitAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProvidedCapability
entryRuleProvidedCapability
:
{ before(grammarAccess.getProvidedCapabilityRule()); }
	 ruleProvidedCapability
{ after(grammarAccess.getProvidedCapabilityRule()); } 
	 EOF 
;

// Rule ProvidedCapability
ruleProvidedCapability 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProvidedCapabilityAccess().getGroup()); }
		(rule__ProvidedCapability__Group__0)
		{ after(grammarAccess.getProvidedCapabilityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAliasedRequiredCapability
entryRuleAliasedRequiredCapability
:
{ before(grammarAccess.getAliasedRequiredCapabilityRule()); }
	 ruleAliasedRequiredCapability
{ after(grammarAccess.getAliasedRequiredCapabilityRule()); } 
	 EOF 
;

// Rule AliasedRequiredCapability
ruleAliasedRequiredCapability 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup()); }
		(rule__AliasedRequiredCapability__Group__0)
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequiredCapability
entryRuleRequiredCapability
:
{ before(grammarAccess.getRequiredCapabilityRule()); }
	 ruleRequiredCapability
{ after(grammarAccess.getRequiredCapabilityRule()); } 
	 EOF 
;

// Rule RequiredCapability
ruleRequiredCapability 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getGroup()); }
		(rule__RequiredCapability__Group__0)
		{ after(grammarAccess.getRequiredCapabilityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePath
entryRulePath
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getPathRule()); }
	 rulePath
{ after(grammarAccess.getPathRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Path
rulePath 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPathAccess().getAlternatives()); }
		(rule__Path__Alternatives)
		{ after(grammarAccess.getPathAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleParameterList
entryRuleParameterList
:
{ before(grammarAccess.getParameterListRule()); }
	 ruleParameterList
{ after(grammarAccess.getParameterListRule()); } 
	 EOF 
;

// Rule ParameterList
ruleParameterList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterListAccess().getGroup()); }
		(rule__ParameterList__Group__0)
		{ after(grammarAccess.getParameterListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFirstParameter
entryRuleFirstParameter
:
{ before(grammarAccess.getFirstParameterRule()); }
	 ruleFirstParameter
{ after(grammarAccess.getFirstParameterRule()); } 
	 EOF 
;

// Rule FirstParameter
ruleFirstParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFirstParameterAccess().getAlternatives()); }
		(rule__FirstParameter__Alternatives)
		{ after(grammarAccess.getFirstParameterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameter
entryRuleParameter
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterAccess().getExprAssignment()); }
		(rule__Parameter__ExprAssignment)
		{ after(grammarAccess.getParameterAccess().getExprAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClosureParameter
entryRuleClosureParameter
:
{ before(grammarAccess.getClosureParameterRule()); }
	 ruleClosureParameter
{ after(grammarAccess.getClosureParameterRule()); } 
	 EOF 
;

// Rule ClosureParameter
ruleClosureParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClosureParameterAccess().getExprAssignment()); }
		(rule__ClosureParameter__ExprAssignment)
		{ after(grammarAccess.getClosureParameterAccess().getExprAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameterDeclaration
entryRuleParameterDeclaration
:
{ before(grammarAccess.getParameterDeclarationRule()); }
	 ruleParameterDeclaration
{ after(grammarAccess.getParameterDeclarationRule()); } 
	 EOF 
;

// Rule ParameterDeclaration
ruleParameterDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterDeclarationAccess().getGroup()); }
		(rule__ParameterDeclaration__Group__0)
		{ after(grammarAccess.getParameterDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction
entryRuleFunction
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup()); }
		(rule__Function__Group__0)
		{ after(grammarAccess.getFunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGuardExpression
entryRuleGuardExpression
:
{ before(grammarAccess.getGuardExpressionRule()); }
	 ruleGuardExpression
{ after(grammarAccess.getGuardExpressionRule()); } 
	 EOF 
;

// Rule GuardExpression
ruleGuardExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGuardExpressionAccess().getAlternatives()); }
		(rule__GuardExpression__Alternatives)
		{ after(grammarAccess.getGuardExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignmentOperator
entryRuleAssignmentOperator
:
{ before(grammarAccess.getAssignmentOperatorRule()); }
	 ruleAssignmentOperator
{ after(grammarAccess.getAssignmentOperatorRule()); } 
	 EOF 
;

// Rule AssignmentOperator
ruleAssignmentOperator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); }
		(rule__AssignmentOperator__Alternatives)
		{ after(grammarAccess.getAssignmentOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelationalOperator
entryRuleRelationalOperator
:
{ before(grammarAccess.getRelationalOperatorRule()); }
	 ruleRelationalOperator
{ after(grammarAccess.getRelationalOperatorRule()); } 
	 EOF 
;

// Rule RelationalOperator
ruleRelationalOperator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); }
		(rule__RelationalOperator__Alternatives)
		{ after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTopLevelExpression
entryRuleTopLevelExpression
:
{ before(grammarAccess.getTopLevelExpressionRule()); }
	 ruleTopLevelExpression
{ after(grammarAccess.getTopLevelExpressionRule()); } 
	 EOF 
;

// Rule TopLevelExpression
ruleTopLevelExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTopLevelExpressionAccess().getAlternatives()); }
		(rule__TopLevelExpression__Alternatives)
		{ after(grammarAccess.getTopLevelExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); }
		ruleAssignmentExpression
		{ after(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignmentExpression
entryRuleAssignmentExpression
:
{ before(grammarAccess.getAssignmentExpressionRule()); }
	 ruleAssignmentExpression
{ after(grammarAccess.getAssignmentExpressionRule()); } 
	 EOF 
;

// Rule AssignmentExpression
ruleAssignmentExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignmentExpressionAccess().getGroup()); }
		(rule__AssignmentExpression__Group__0)
		{ after(grammarAccess.getAssignmentExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVarDeclaration
entryRuleVarDeclaration
:
{ before(grammarAccess.getVarDeclarationRule()); }
	 ruleVarDeclaration
{ after(grammarAccess.getVarDeclarationRule()); } 
	 EOF 
;

// Rule VarDeclaration
ruleVarDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarDeclarationAccess().getGroup()); }
		(rule__VarDeclaration__Group__0)
		{ after(grammarAccess.getVarDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValDeclaration
entryRuleValDeclaration
:
{ before(grammarAccess.getValDeclarationRule()); }
	 ruleValDeclaration
{ after(grammarAccess.getValDeclarationRule()); } 
	 EOF 
;

// Rule ValDeclaration
ruleValDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValDeclarationAccess().getGroup()); }
		(rule__ValDeclaration__Group__0)
		{ after(grammarAccess.getValDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeRef
entryRuleTypeRef
:
{ before(grammarAccess.getTypeRefRule()); }
	 ruleTypeRef
{ after(grammarAccess.getTypeRefRule()); } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeRefAccess().getAlternatives()); }
		(rule__TypeRef__Alternatives)
		{ after(grammarAccess.getTypeRefAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimpleTypeRef
entryRuleSimpleTypeRef
:
{ before(grammarAccess.getSimpleTypeRefRule()); }
	 ruleSimpleTypeRef
{ after(grammarAccess.getSimpleTypeRefRule()); } 
	 EOF 
;

// Rule SimpleTypeRef
ruleSimpleTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleTypeRefAccess().getGroup()); }
		(rule__SimpleTypeRef__Group__0)
		{ after(grammarAccess.getSimpleTypeRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClosureTypeRef
entryRuleClosureTypeRef
:
{ before(grammarAccess.getClosureTypeRefRule()); }
	 ruleClosureTypeRef
{ after(grammarAccess.getClosureTypeRefRule()); } 
	 EOF 
;

// Rule ClosureTypeRef
ruleClosureTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getGroup()); }
		(rule__ClosureTypeRef__Group__0)
		{ after(grammarAccess.getClosureTypeRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCachedExpression
entryRuleCachedExpression
:
{ before(grammarAccess.getCachedExpressionRule()); }
	 ruleCachedExpression
{ after(grammarAccess.getCachedExpressionRule()); } 
	 EOF 
;

// Rule CachedExpression
ruleCachedExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCachedExpressionAccess().getAlternatives()); }
		(rule__CachedExpression__Alternatives)
		{ after(grammarAccess.getCachedExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpression
entryRuleOrExpression
:
{ before(grammarAccess.getOrExpressionRule()); }
	 ruleOrExpression
{ after(grammarAccess.getOrExpressionRule()); } 
	 EOF 
;

// Rule OrExpression
ruleOrExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExpressionAccess().getGroup()); }
		(rule__OrExpression__Group__0)
		{ after(grammarAccess.getOrExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpression
entryRuleAndExpression
:
{ before(grammarAccess.getAndExpressionRule()); }
	 ruleAndExpression
{ after(grammarAccess.getAndExpressionRule()); } 
	 EOF 
;

// Rule AndExpression
ruleAndExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExpressionAccess().getGroup()); }
		(rule__AndExpression__Group__0)
		{ after(grammarAccess.getAndExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelationalExpression
entryRuleRelationalExpression
:
{ before(grammarAccess.getRelationalExpressionRule()); }
	 ruleRelationalExpression
{ after(grammarAccess.getRelationalExpressionRule()); } 
	 EOF 
;

// Rule RelationalExpression
ruleRelationalExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationalExpressionAccess().getGroup()); }
		(rule__RelationalExpression__Group__0)
		{ after(grammarAccess.getRelationalExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAdditiveExpression
entryRuleAdditiveExpression
:
{ before(grammarAccess.getAdditiveExpressionRule()); }
	 ruleAdditiveExpression
{ after(grammarAccess.getAdditiveExpressionRule()); } 
	 EOF 
;

// Rule AdditiveExpression
ruleAdditiveExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getGroup()); }
		(rule__AdditiveExpression__Group__0)
		{ after(grammarAccess.getAdditiveExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplicativeExpression
entryRuleMultiplicativeExpression
:
{ before(grammarAccess.getMultiplicativeExpressionRule()); }
	 ruleMultiplicativeExpression
{ after(grammarAccess.getMultiplicativeExpressionRule()); } 
	 EOF 
;

// Rule MultiplicativeExpression
ruleMultiplicativeExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); }
		(rule__MultiplicativeExpression__Group__0)
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSetExpression
entryRuleSetExpression
:
{ before(grammarAccess.getSetExpressionRule()); }
	 ruleSetExpression
{ after(grammarAccess.getSetExpressionRule()); } 
	 EOF 
;

// Rule SetExpression
ruleSetExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSetExpressionAccess().getGroup()); }
		(rule__SetExpression__Group__0)
		{ after(grammarAccess.getSetExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnaryOrInfixExpression
entryRuleUnaryOrInfixExpression
:
{ before(grammarAccess.getUnaryOrInfixExpressionRule()); }
	 ruleUnaryOrInfixExpression
{ after(grammarAccess.getUnaryOrInfixExpressionRule()); } 
	 EOF 
;

// Rule UnaryOrInfixExpression
ruleUnaryOrInfixExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnaryOrInfixExpressionAccess().getAlternatives()); }
		(rule__UnaryOrInfixExpression__Alternatives)
		{ after(grammarAccess.getUnaryOrInfixExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnaryExpression
entryRuleUnaryExpression
:
{ before(grammarAccess.getUnaryExpressionRule()); }
	 ruleUnaryExpression
{ after(grammarAccess.getUnaryExpressionRule()); } 
	 EOF 
;

// Rule UnaryExpression
ruleUnaryExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getGroup()); }
		(rule__UnaryExpression__Group__0)
		{ after(grammarAccess.getUnaryExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePreopExpression
entryRulePreopExpression
:
{ before(grammarAccess.getPreopExpressionRule()); }
	 rulePreopExpression
{ after(grammarAccess.getPreopExpressionRule()); } 
	 EOF 
;

// Rule PreopExpression
rulePreopExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPreopExpressionAccess().getGroup()); }
		(rule__PreopExpression__Group__0)
		{ after(grammarAccess.getPreopExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePostopExpression
entryRulePostopExpression
:
{ before(grammarAccess.getPostopExpressionRule()); }
	 rulePostopExpression
{ after(grammarAccess.getPostopExpressionRule()); } 
	 EOF 
;

// Rule PostopExpression
rulePostopExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPostopExpressionAccess().getGroup()); }
		(rule__PostopExpression__Group__0)
		{ after(grammarAccess.getPostopExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInfixExpression
entryRuleInfixExpression
:
{ before(grammarAccess.getInfixExpressionRule()); }
	 ruleInfixExpression
{ after(grammarAccess.getInfixExpressionRule()); } 
	 EOF 
;

// Rule InfixExpression
ruleInfixExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInfixExpressionAccess().getGroup()); }
		(rule__InfixExpression__Group__0)
		{ after(grammarAccess.getInfixExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCallExpression
entryRuleCallExpression
:
{ before(grammarAccess.getCallExpressionRule()); }
	 ruleCallExpression
{ after(grammarAccess.getCallExpressionRule()); } 
	 EOF 
;

// Rule CallExpression
ruleCallExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCallExpressionAccess().getGroup()); }
		(rule__CallExpression__Group__0)
		{ after(grammarAccess.getCallExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression
:
{ before(grammarAccess.getPrimaryExpressionRule()); }
	 rulePrimaryExpression
{ after(grammarAccess.getPrimaryExpressionRule()); } 
	 EOF 
;

// Rule PrimaryExpression
rulePrimaryExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); }
		(rule__PrimaryExpression__Alternatives)
		{ after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWithExpression
entryRuleWithExpression
:
{ before(grammarAccess.getWithExpressionRule()); }
	 ruleWithExpression
{ after(grammarAccess.getWithExpressionRule()); } 
	 EOF 
;

// Rule WithExpression
ruleWithExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWithExpressionAccess().getGroup()); }
		(rule__WithExpression__Group__0)
		{ after(grammarAccess.getWithExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWithContextExpression
entryRuleWithContextExpression
:
{ before(grammarAccess.getWithContextExpressionRule()); }
	 ruleWithContextExpression
{ after(grammarAccess.getWithContextExpressionRule()); } 
	 EOF 
;

// Rule WithContextExpression
ruleWithContextExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWithContextExpressionAccess().getGroup()); }
		(rule__WithContextExpression__Group__0)
		{ after(grammarAccess.getWithContextExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBlockExpression
entryRuleBlockExpression
:
{ before(grammarAccess.getBlockExpressionRule()); }
	 ruleBlockExpression
{ after(grammarAccess.getBlockExpressionRule()); } 
	 EOF 
;

// Rule BlockExpression
ruleBlockExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBlockExpressionAccess().getGroup()); }
		(rule__BlockExpression__Group__0)
		{ after(grammarAccess.getBlockExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getGroup()); }
		(rule__Value__Group__0)
		{ after(grammarAccess.getValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKeywordVariables
entryRuleKeywordVariables
:
{ before(grammarAccess.getKeywordVariablesRule()); }
	 ruleKeywordVariables
{ after(grammarAccess.getKeywordVariablesRule()); } 
	 EOF 
;

// Rule KeywordVariables
ruleKeywordVariables 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getGroup()); }
		(rule__KeywordVariables__Group__0)
		{ after(grammarAccess.getKeywordVariablesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeatureCall
entryRuleFeatureCall
:
{ before(grammarAccess.getFeatureCallRule()); }
	 ruleFeatureCall
{ after(grammarAccess.getFeatureCallRule()); } 
	 EOF 
;

// Rule FeatureCall
ruleFeatureCall 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureCallAccess().getOperationCallParserRuleCall()); }
		ruleOperationCall
		{ after(grammarAccess.getFeatureCallAccess().getOperationCallParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperationCall
entryRuleOperationCall
:
{ before(grammarAccess.getOperationCallRule()); }
	 ruleOperationCall
{ after(grammarAccess.getOperationCallRule()); } 
	 EOF 
;

// Rule OperationCall
ruleOperationCall 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperationCallAccess().getGroup()); }
		(rule__OperationCall__Group__0)
		{ after(grammarAccess.getOperationCallAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstructorCallExpression
entryRuleConstructorCallExpression
:
{ before(grammarAccess.getConstructorCallExpressionRule()); }
	 ruleConstructorCallExpression
{ after(grammarAccess.getConstructorCallExpressionRule()); } 
	 EOF 
;

// Rule ConstructorCallExpression
ruleConstructorCallExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstructorCallExpressionAccess().getGroup()); }
		(rule__ConstructorCallExpression__Group__0)
		{ after(grammarAccess.getConstructorCallExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInitializationBlockExpression
entryRuleInitializationBlockExpression
:
{ before(grammarAccess.getInitializationBlockExpressionRule()); }
	 ruleInitializationBlockExpression
{ after(grammarAccess.getInitializationBlockExpressionRule()); } 
	 EOF 
;

// Rule InitializationBlockExpression
ruleInitializationBlockExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitializationBlockExpressionAccess().getGroup()); }
		(rule__InitializationBlockExpression__Group__0)
		{ after(grammarAccess.getInitializationBlockExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInitializationExpression
entryRuleInitializationExpression
:
{ before(grammarAccess.getInitializationExpressionRule()); }
	 ruleInitializationExpression
{ after(grammarAccess.getInitializationExpressionRule()); } 
	 EOF 
;

// Rule InitializationExpression
ruleInitializationExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitializationExpressionAccess().getGroup()); }
		(rule__InitializationExpression__Group__0)
		{ after(grammarAccess.getInitializationExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFeatureOfThis
entryRuleFeatureOfThis
:
{ before(grammarAccess.getFeatureOfThisRule()); }
	 ruleFeatureOfThis
{ after(grammarAccess.getFeatureOfThisRule()); } 
	 EOF 
;

// Rule FeatureOfThis
ruleFeatureOfThis 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureOfThisAccess().getGroup()); }
		(rule__FeatureOfThis__Group__0)
		{ after(grammarAccess.getFeatureOfThisAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteral
entryRuleLiteral
:
{ before(grammarAccess.getLiteralRule()); }
	 ruleLiteral
{ after(grammarAccess.getLiteralRule()); } 
	 EOF 
;

// Rule Literal
ruleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralAccess().getAlternatives()); }
		(rule__Literal__Alternatives)
		{ after(grammarAccess.getLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteralFunction
entryRuleLiteralFunction
:
{ before(grammarAccess.getLiteralFunctionRule()); }
	 ruleLiteralFunction
{ after(grammarAccess.getLiteralFunctionRule()); } 
	 EOF 
;

// Rule LiteralFunction
ruleLiteralFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralFunctionAccess().getGroup()); }
		(rule__LiteralFunction__Group__0)
		{ after(grammarAccess.getLiteralFunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClosureExpression
entryRuleClosureExpression
:
{ before(grammarAccess.getClosureExpressionRule()); }
	 ruleClosureExpression
{ after(grammarAccess.getClosureExpressionRule()); } 
	 EOF 
;

// Rule ClosureExpression
ruleClosureExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getGroup()); }
		(rule__ClosureExpression__Group__0)
		{ after(grammarAccess.getClosureExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOneOrManyExpressions
entryRuleOneOrManyExpressions
:
{ before(grammarAccess.getOneOrManyExpressionsRule()); }
	 ruleOneOrManyExpressions
{ after(grammarAccess.getOneOrManyExpressionsRule()); } 
	 EOF 
;

// Rule OneOrManyExpressions
ruleOneOrManyExpressions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOneOrManyExpressionsAccess().getAlternatives()); }
		(rule__OneOrManyExpressions__Alternatives)
		{ after(grammarAccess.getOneOrManyExpressionsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBlockExpressionWithoutBrackets
entryRuleBlockExpressionWithoutBrackets
:
{ before(grammarAccess.getBlockExpressionWithoutBracketsRule()); }
	 ruleBlockExpressionWithoutBrackets
{ after(grammarAccess.getBlockExpressionWithoutBracketsRule()); } 
	 EOF 
;

// Rule BlockExpressionWithoutBrackets
ruleBlockExpressionWithoutBrackets 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBlockExpressionWithoutBracketsAccess().getGroup()); }
		(rule__BlockExpressionWithoutBrackets__Group__0)
		{ after(grammarAccess.getBlockExpressionWithoutBracketsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValueLiteral
entryRuleValueLiteral
:
{ before(grammarAccess.getValueLiteralRule()); }
	 ruleValueLiteral
{ after(grammarAccess.getValueLiteralRule()); } 
	 EOF 
;

// Rule ValueLiteral
ruleValueLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueLiteralAccess().getValueAssignment()); }
		(rule__ValueLiteral__ValueAssignment)
		{ after(grammarAccess.getValueLiteralAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParanthesizedExpression
entryRuleParanthesizedExpression
:
{ before(grammarAccess.getParanthesizedExpressionRule()); }
	 ruleParanthesizedExpression
{ after(grammarAccess.getParanthesizedExpressionRule()); } 
	 EOF 
;

// Rule ParanthesizedExpression
ruleParanthesizedExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParanthesizedExpressionAccess().getGroup()); }
		(rule__ParanthesizedExpression__Group__0)
		{ after(grammarAccess.getParanthesizedExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQID
entryRuleQID
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getQIDRule()); }
	 ruleQID
{ after(grammarAccess.getQIDRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule QID
ruleQID 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQIDAccess().getGroup()); }
		(rule__QID__Group__0)
		{ after(grammarAccess.getQIDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

rule__Model__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getUnitsAssignment_0()); }
		(rule__Model__UnitsAssignment_0)*
		{ after(grammarAccess.getModelAccess().getUnitsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getModelAccess().getFunctionsAssignment_1()); }
		(rule__Model__FunctionsAssignment_1)*
		{ after(grammarAccess.getModelAccess().getFunctionsAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedCapabilityAccess().getNameSpaceAssignment_1_0()); }
		(rule__ProvidedCapability__NameSpaceAssignment_1_0)
		{ after(grammarAccess.getProvidedCapabilityAccess().getNameSpaceAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getProvidedCapabilityAccess().getUnitKeyword_1_1()); }
		'unit'
		{ after(grammarAccess.getProvidedCapabilityAccess().getUnitKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getNameSpaceAssignment_0_0()); }
		(rule__AliasedRequiredCapability__NameSpaceAssignment_0_0)
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getNameSpaceAssignment_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getUnitKeyword_0_1()); }
		'unit'
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getUnitKeyword_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getNameSpaceAssignment_1_0()); }
		(rule__RequiredCapability__NameSpaceAssignment_1_0)
		{ after(grammarAccess.getRequiredCapabilityAccess().getNameSpaceAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getUnitKeyword_1_1()); }
		'unit'
		{ after(grammarAccess.getRequiredCapabilityAccess().getUnitKeyword_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPathAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getPathAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPathAccess().getGroup_1()); }
		(rule__Path__Group_1__0)
		{ after(grammarAccess.getPathAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FirstParameter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFirstParameterAccess().getClosureParameterParserRuleCall_0()); }
		ruleClosureParameter
		{ after(grammarAccess.getFirstParameterAccess().getClosureParameterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFirstParameterAccess().getParameterParserRuleCall_1()); }
		ruleParameter
		{ after(grammarAccess.getFirstParameterAccess().getParameterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Alternatives_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup_6_1_0()); }
		(rule__Function__Group_6_1_0__0)
		{ after(grammarAccess.getFunctionAccess().getGroup_6_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctionAccess().getGroup_6_1_1()); }
		(rule__Function__Group_6_1_1__0)
		{ after(grammarAccess.getFunctionAccess().getGroup_6_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Alternatives_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup_8_0()); }
		(rule__Function__Group_8_0__0)
		{ after(grammarAccess.getFunctionAccess().getGroup_8_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctionAccess().getFuncExprAssignment_8_1()); }
		(rule__Function__FuncExprAssignment_8_1)
		{ after(grammarAccess.getFunctionAccess().getFuncExprAssignment_8_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuardExpressionAccess().getGroup_0()); }
		(rule__GuardExpression__Group_0__0)
		{ after(grammarAccess.getGuardExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getGuardExpressionAccess().getGuardExprAssignment_1()); }
		(rule__GuardExpression__GuardExprAssignment_1)
		{ after(grammarAccess.getGuardExpressionAccess().getGuardExprAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentOperator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); }
		'='
		{ after(grammarAccess.getAssignmentOperatorAccess().getEqualsSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getAssignmentOperatorAccess().getPlusSignEqualsSignKeyword_1()); }
		'+='
		{ after(grammarAccess.getAssignmentOperatorAccess().getPlusSignEqualsSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusEqualsSignKeyword_2()); }
		'-='
		{ after(grammarAccess.getAssignmentOperatorAccess().getHyphenMinusEqualsSignKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getAssignmentOperatorAccess().getAsteriskEqualsSignKeyword_3()); }
		'*='
		{ after(grammarAccess.getAssignmentOperatorAccess().getAsteriskEqualsSignKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getAssignmentOperatorAccess().getSolidusEqualsSignKeyword_4()); }
		'/='
		{ after(grammarAccess.getAssignmentOperatorAccess().getSolidusEqualsSignKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getAssignmentOperatorAccess().getPercentSignEqualsSignKeyword_5()); }
		'%='
		{ after(grammarAccess.getAssignmentOperatorAccess().getPercentSignEqualsSignKeyword_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalOperator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getTildeEqualsSignKeyword_0()); }
		'~='
		{ after(grammarAccess.getRelationalOperatorAccess().getTildeEqualsSignKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_1()); }
		'=='
		{ after(grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); }
		'==='
		{ after(grammarAccess.getRelationalOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_3()); }
		'!='
		{ after(grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_4()); }
		'!=='
		{ after(grammarAccess.getRelationalOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_4()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); }
		'>='
		{ after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_5()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_6()); }
		'<='
		{ after(grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_6()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_7()); }
		'>'
		{ after(grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_7()); }
	)
	|
	(
		{ before(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_8()); }
		'<'
		{ after(grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TopLevelExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTopLevelExpressionAccess().getVarDeclarationParserRuleCall_0()); }
		ruleVarDeclaration
		{ after(grammarAccess.getTopLevelExpressionAccess().getVarDeclarationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTopLevelExpressionAccess().getValDeclarationParserRuleCall_1()); }
		ruleValDeclaration
		{ after(grammarAccess.getTopLevelExpressionAccess().getValDeclarationParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTopLevelExpressionAccess().getAssignmentExpressionParserRuleCall_2()); }
		ruleAssignmentExpression
		{ after(grammarAccess.getTopLevelExpressionAccess().getAssignmentExpressionParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Alternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclarationAccess().getVarKeyword_2_0_0()); }
		'var'
		{ after(grammarAccess.getVarDeclarationAccess().getVarKeyword_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getVarDeclarationAccess().getTypeAssignment_2_0_1()); }
		(rule__VarDeclaration__TypeAssignment_2_0_1)
		{ after(grammarAccess.getVarDeclarationAccess().getTypeAssignment_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getClosureTypeRefParserRuleCall_0()); }
		ruleClosureTypeRef
		{ after(grammarAccess.getTypeRefAccess().getClosureTypeRefParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeRefAccess().getSimpleTypeRefParserRuleCall_1()); }
		ruleSimpleTypeRef
		{ after(grammarAccess.getTypeRefAccess().getSimpleTypeRefParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getGroup_1_0()); }
		(rule__ClosureTypeRef__Group_1_0__0)
		{ after(grammarAccess.getClosureTypeRefAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getGroup_1_1()); }
		(rule__ClosureTypeRef__Group_1_1__0)
		{ after(grammarAccess.getClosureTypeRefAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CachedExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCachedExpressionAccess().getGroup_0()); }
		(rule__CachedExpression__Group_0__0)
		{ after(grammarAccess.getCachedExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getCachedExpressionAccess().getOrExpressionParserRuleCall_1()); }
		ruleOrExpression
		{ after(grammarAccess.getCachedExpressionAccess().getOrExpressionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__FunctionNameAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getFunctionNamePlusSignKeyword_1_1_0_0()); }
		'+'
		{ after(grammarAccess.getAdditiveExpressionAccess().getFunctionNamePlusSignKeyword_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getFunctionNameHyphenMinusKeyword_1_1_0_1()); }
		'-'
		{ after(grammarAccess.getAdditiveExpressionAccess().getFunctionNameHyphenMinusKeyword_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__FunctionNameAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameAsteriskKeyword_1_1_0_0()); }
		'*'
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameAsteriskKeyword_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameSolidusKeyword_1_1_0_1()); }
		'/'
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameSolidusKeyword_1_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNamePercentSignKeyword_1_1_0_2()); }
		'%'
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNamePercentSignKeyword_1_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryOrInfixExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryOrInfixExpressionAccess().getPostopExpressionParserRuleCall_0()); }
		rulePostopExpression
		{ after(grammarAccess.getUnaryOrInfixExpressionAccess().getPostopExpressionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnaryOrInfixExpressionAccess().getUnaryExpressionParserRuleCall_1()); }
		ruleUnaryExpression
		{ after(grammarAccess.getUnaryOrInfixExpressionAccess().getUnaryExpressionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getUnaryOrInfixExpressionAccess().getPreopExpressionParserRuleCall_2()); }
		rulePreopExpression
		{ after(grammarAccess.getUnaryOrInfixExpressionAccess().getPreopExpressionParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__FunctionNameAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getFunctionNameExclamationMarkKeyword_1_0_0()); }
		'!'
		{ after(grammarAccess.getUnaryExpressionAccess().getFunctionNameExclamationMarkKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getFunctionNameHyphenMinusKeyword_1_0_1()); }
		'-'
		{ after(grammarAccess.getUnaryExpressionAccess().getFunctionNameHyphenMinusKeyword_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__FunctionNameAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPreopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_0_0()); }
		'++'
		{ after(grammarAccess.getPreopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPreopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_0_1()); }
		'--'
		{ after(grammarAccess.getPreopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__FunctionNameAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPostopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0()); }
		'--'
		{ after(grammarAccess.getPostopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPostopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_1_0_1()); }
		'++'
		{ after(grammarAccess.getPostopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfixExpressionAccess().getGroup_1_0()); }
		(rule__InfixExpression__Group_1_0__0)
		{ after(grammarAccess.getInfixExpressionAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getInfixExpressionAccess().getGroup_1_1()); }
		(rule__InfixExpression__Group_1_1__0)
		{ after(grammarAccess.getInfixExpressionAccess().getGroup_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getInfixExpressionAccess().getGroup_1_2()); }
		(rule__InfixExpression__Group_1_2__0)
		{ after(grammarAccess.getInfixExpressionAccess().getGroup_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_0()); }
		ruleFeatureCall
		{ after(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getConstructorCallExpressionParserRuleCall_1()); }
		ruleConstructorCallExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getConstructorCallExpressionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getValueParserRuleCall_2()); }
		ruleValue
		{ after(grammarAccess.getPrimaryExpressionAccess().getValueParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); }
		ruleLiteral
		{ after(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getKeywordVariablesParserRuleCall_4()); }
		ruleKeywordVariables
		{ after(grammarAccess.getPrimaryExpressionAccess().getKeywordVariablesParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getParanthesizedExpressionParserRuleCall_5()); }
		ruleParanthesizedExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getParanthesizedExpressionParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_6()); }
		ruleBlockExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getWithExpressionParserRuleCall_7()); }
		ruleWithExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getWithExpressionParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getWithContextExpressionParserRuleCall_8()); }
		ruleWithContextExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getWithContextExpressionParserRuleCall_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithExpressionAccess().getGroup_2_0()); }
		(rule__WithExpression__Group_2_0__0)
		{ after(grammarAccess.getWithExpressionAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getWithExpressionAccess().getGroup_2_1()); }
		(rule__WithExpression__Group_2_1__0)
		{ after(grammarAccess.getWithExpressionAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KeywordVariables__NameAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNameInputKeyword_1_0_0()); }
		'input'
		{ after(grammarAccess.getKeywordVariablesAccess().getNameInputKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNameOutputKeyword_1_0_1()); }
		'output'
		{ after(grammarAccess.getKeywordVariablesAccess().getNameOutputKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNameSourceKeyword_1_0_2()); }
		'source'
		{ after(grammarAccess.getKeywordVariablesAccess().getNameSourceKeyword_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNamePropertiesKeyword_1_0_3()); }
		'properties'
		{ after(grammarAccess.getKeywordVariablesAccess().getNamePropertiesKeyword_1_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNameBuilderKeyword_1_0_4()); }
		'builder'
		{ after(grammarAccess.getKeywordVariablesAccess().getNameBuilderKeyword_1_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNameUnitKeyword_1_0_5()); }
		'unit'
		{ after(grammarAccess.getKeywordVariablesAccess().getNameUnitKeyword_1_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNameThisKeyword_1_0_6()); }
		'this'
		{ after(grammarAccess.getKeywordVariablesAccess().getNameThisKeyword_1_0_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralAccess().getValueLiteralParserRuleCall_0()); }
		ruleValueLiteral
		{ after(grammarAccess.getLiteralAccess().getValueLiteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getLiteralFunctionParserRuleCall_1()); }
		ruleLiteralFunction
		{ after(grammarAccess.getLiteralAccess().getLiteralFunctionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getGroup_2_0()); }
		(rule__ClosureExpression__Group_2_0__0)
		{ after(grammarAccess.getClosureExpressionAccess().getGroup_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getClosureExpressionAccess().getGroup_2_1()); }
		(rule__ClosureExpression__Group_2_1__0)
		{ after(grammarAccess.getClosureExpressionAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OneOrManyExpressions__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOneOrManyExpressionsAccess().getBlockExpressionWithoutBracketsParserRuleCall_0()); }
		ruleBlockExpressionWithoutBrackets
		{ after(grammarAccess.getOneOrManyExpressionsAccess().getBlockExpressionWithoutBracketsParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOneOrManyExpressionsAccess().getExpressionParserRuleCall_1()); }
		ruleExpression
		{ after(grammarAccess.getOneOrManyExpressionsAccess().getExpressionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQIDAccess().getINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getQIDAccess().getINTTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getQIDAccess().getHEXTerminalRuleCall_1_1()); }
		RULE_HEX
		{ after(grammarAccess.getQIDAccess().getHEXTerminalRuleCall_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_2()); }
		RULE_ID
		{ after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Alternatives_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQIDAccess().getINTTerminalRuleCall_2_2_0()); }
		RULE_INT
		{ after(grammarAccess.getQIDAccess().getINTTerminalRuleCall_2_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getQIDAccess().getHEXTerminalRuleCall_2_2_1()); }
		RULE_HEX
		{ after(grammarAccess.getQIDAccess().getHEXTerminalRuleCall_2_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_2_2_2()); }
		RULE_ID
		{ after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_2_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__0__Impl
	rule__Unit__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getUnitAction_0()); }
	()
	{ after(grammarAccess.getUnitAccess().getUnitAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__1__Impl
	rule__Unit__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getDocumentationAssignment_1()); }
	(rule__Unit__DocumentationAssignment_1)?
	{ after(grammarAccess.getUnitAccess().getDocumentationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__2__Impl
	rule__Unit__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getUnitKeyword_2()); }
	'unit'
	{ after(grammarAccess.getUnitAccess().getUnitKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__3__Impl
	rule__Unit__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getNameAssignment_3()); }
	(rule__Unit__NameAssignment_3)?
	{ after(grammarAccess.getUnitAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__4__Impl
	rule__Unit__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getGroup_4()); }
	(rule__Unit__Group_4__0)?
	{ after(grammarAccess.getUnitAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__5__Impl
	rule__Unit__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getGroup_5()); }
	(rule__Unit__Group_5__0)?
	{ after(grammarAccess.getUnitAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__6__Impl
	rule__Unit__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getUnitAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__7__Impl
	rule__Unit__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getUnorderedGroup_7()); }
	(rule__Unit__UnorderedGroup_7)
	{ after(grammarAccess.getUnitAccess().getUnorderedGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getUnitAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_4__0__Impl
	rule__Unit__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getVersionKeyword_4_0()); }
	'version'
	{ after(grammarAccess.getUnitAccess().getVersionKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getVersionAssignment_4_1()); }
	(rule__Unit__VersionAssignment_4_1)
	{ after(grammarAccess.getUnitAccess().getVersionAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_5__0__Impl
	rule__Unit__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getImplementsKeyword_5_0()); }
	'implements'
	{ after(grammarAccess.getUnitAccess().getImplementsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_5__1__Impl
	rule__Unit__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getImplementsAssignment_5_1()); }
	(rule__Unit__ImplementsAssignment_5_1)
	{ after(grammarAccess.getUnitAccess().getImplementsAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getGroup_5_2()); }
	(rule__Unit__Group_5_2__0)*
	{ after(grammarAccess.getUnitAccess().getGroup_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_5_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_5_2__0__Impl
	rule__Unit__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getCommaKeyword_5_2_0()); }
	','
	{ after(grammarAccess.getUnitAccess().getCommaKeyword_5_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_5_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_5_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getImplementsAssignment_5_2_1()); }
	(rule__Unit__ImplementsAssignment_5_2_1)
	{ after(grammarAccess.getUnitAccess().getImplementsAssignment_5_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_7_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_0__0__Impl
	rule__Unit__Group_7_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getSourceKeyword_7_0_0()); }
	'source'
	{ after(grammarAccess.getUnitAccess().getSourceKeyword_7_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_0__1__Impl
	rule__Unit__Group_7_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getColonKeyword_7_0_1()); }
	':'
	{ after(grammarAccess.getUnitAccess().getColonKeyword_7_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_0__2__Impl
	rule__Unit__Group_7_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getSourceLocationAssignment_7_0_2()); }
	(rule__Unit__SourceLocationAssignment_7_0_2)
	{ after(grammarAccess.getUnitAccess().getSourceLocationAssignment_7_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getSemicolonKeyword_7_0_3()); }
	';'
	{ after(grammarAccess.getUnitAccess().getSemicolonKeyword_7_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_7_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_1__0__Impl
	rule__Unit__Group_7_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getOutputKeyword_7_1_0()); }
	'output'
	{ after(grammarAccess.getUnitAccess().getOutputKeyword_7_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_1__1__Impl
	rule__Unit__Group_7_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getColonKeyword_7_1_1()); }
	':'
	{ after(grammarAccess.getUnitAccess().getColonKeyword_7_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_1__2__Impl
	rule__Unit__Group_7_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getOutputLocationAssignment_7_1_2()); }
	(rule__Unit__OutputLocationAssignment_7_1_2)
	{ after(grammarAccess.getUnitAccess().getOutputLocationAssignment_7_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getSemicolonKeyword_7_1_3()); }
	';'
	{ after(grammarAccess.getUnitAccess().getSemicolonKeyword_7_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_7_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_2__0__Impl
	rule__Unit__Group_7_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getProvidesKeyword_7_2_0()); }
	'provides'
	{ after(grammarAccess.getUnitAccess().getProvidesKeyword_7_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_2__1__Impl
	rule__Unit__Group_7_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getColonKeyword_7_2_1()); }
	':'
	{ after(grammarAccess.getUnitAccess().getColonKeyword_7_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_2__2__Impl
	rule__Unit__Group_7_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getProvidedCapabilitiesAssignment_7_2_2()); }
	(rule__Unit__ProvidedCapabilitiesAssignment_7_2_2)
	{ after(grammarAccess.getUnitAccess().getProvidedCapabilitiesAssignment_7_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getSemicolonKeyword_7_2_3()); }
	';'
	{ after(grammarAccess.getUnitAccess().getSemicolonKeyword_7_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_7_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_3__0__Impl
	rule__Unit__Group_7_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getRequiresKeyword_7_3_0()); }
	'requires'
	{ after(grammarAccess.getUnitAccess().getRequiresKeyword_7_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_3__1__Impl
	rule__Unit__Group_7_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getColonKeyword_7_3_1()); }
	':'
	{ after(grammarAccess.getUnitAccess().getColonKeyword_7_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_3__2__Impl
	rule__Unit__Group_7_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getRequiredCapabilitiesAssignment_7_3_2()); }
	(rule__Unit__RequiredCapabilitiesAssignment_7_3_2)
	{ after(grammarAccess.getUnitAccess().getRequiredCapabilitiesAssignment_7_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getSemicolonKeyword_7_3_3()); }
	';'
	{ after(grammarAccess.getUnitAccess().getSemicolonKeyword_7_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__Group_7_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_4__0__Impl
	rule__Unit__Group_7_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getRequiresKeyword_7_4_0()); }
	'requires'
	{ after(grammarAccess.getUnitAccess().getRequiresKeyword_7_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_4__1__Impl
	rule__Unit__Group_7_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getEnvKeyword_7_4_1()); }
	'env'
	{ after(grammarAccess.getUnitAccess().getEnvKeyword_7_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_4__2__Impl
	rule__Unit__Group_7_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getColonKeyword_7_4_2()); }
	':'
	{ after(grammarAccess.getUnitAccess().getColonKeyword_7_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_4__3__Impl
	rule__Unit__Group_7_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getMetaRequiredCapabilitiesAssignment_7_4_3()); }
	(rule__Unit__MetaRequiredCapabilitiesAssignment_7_4_3)
	{ after(grammarAccess.getUnitAccess().getMetaRequiredCapabilitiesAssignment_7_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__Group_7_4__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__Group_7_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnitAccess().getSemicolonKeyword_7_4_4()); }
	';'
	{ after(grammarAccess.getUnitAccess().getSemicolonKeyword_7_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedCapability__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group__0__Impl
	rule__ProvidedCapability__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getProvidedCapabilityAction_0()); }
	()
	{ after(grammarAccess.getProvidedCapabilityAccess().getProvidedCapabilityAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group__1__Impl
	rule__ProvidedCapability__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getAlternatives_1()); }
	(rule__ProvidedCapability__Alternatives_1)
	{ after(grammarAccess.getProvidedCapabilityAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getGroup_2()); }
	(rule__ProvidedCapability__Group_2__0)?
	{ after(grammarAccess.getProvidedCapabilityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedCapability__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2__0__Impl
	rule__ProvidedCapability__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getLeftCurlyBracketKeyword_2_0()); }
	'{'
	{ after(grammarAccess.getProvidedCapabilityAccess().getLeftCurlyBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2__1__Impl
	rule__ProvidedCapability__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1()); }
	(rule__ProvidedCapability__UnorderedGroup_2_1)
	{ after(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getRightCurlyBracketKeyword_2_2()); }
	'}'
	{ after(grammarAccess.getProvidedCapabilityAccess().getRightCurlyBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedCapability__Group_2_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_0__0__Impl
	rule__ProvidedCapability__Group_2_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getWhenKeyword_2_1_0_0()); }
	'when'
	{ after(grammarAccess.getProvidedCapabilityAccess().getWhenKeyword_2_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_0__1__Impl
	rule__ProvidedCapability__Group_2_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_0_1()); }
	':'
	{ after(grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_0__2__Impl
	rule__ProvidedCapability__Group_2_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getCondExprAssignment_2_1_0_2()); }
	(rule__ProvidedCapability__CondExprAssignment_2_1_0_2)
	{ after(grammarAccess.getProvidedCapabilityAccess().getCondExprAssignment_2_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_0_3()); }
	';'
	{ after(grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedCapability__Group_2_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_1__0__Impl
	rule__ProvidedCapability__Group_2_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getNameKeyword_2_1_1_0()); }
	'name'
	{ after(grammarAccess.getProvidedCapabilityAccess().getNameKeyword_2_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_1__1__Impl
	rule__ProvidedCapability__Group_2_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_1_1()); }
	':'
	{ after(grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_1__2__Impl
	rule__ProvidedCapability__Group_2_1_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getNameAssignment_2_1_1_2()); }
	(rule__ProvidedCapability__NameAssignment_2_1_1_2)
	{ after(grammarAccess.getProvidedCapabilityAccess().getNameAssignment_2_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_1_3()); }
	';'
	{ after(grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedCapability__Group_2_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_2__0__Impl
	rule__ProvidedCapability__Group_2_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getVersionKeyword_2_1_2_0()); }
	'version'
	{ after(grammarAccess.getProvidedCapabilityAccess().getVersionKeyword_2_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_2__1__Impl
	rule__ProvidedCapability__Group_2_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_2_1()); }
	':'
	{ after(grammarAccess.getProvidedCapabilityAccess().getColonKeyword_2_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_2__2__Impl
	rule__ProvidedCapability__Group_2_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getVersionAssignment_2_1_2_2()); }
	(rule__ProvidedCapability__VersionAssignment_2_1_2_2)
	{ after(grammarAccess.getProvidedCapabilityAccess().getVersionAssignment_2_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__Group_2_1_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__Group_2_1_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_2_3()); }
	';'
	{ after(grammarAccess.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group__0__Impl
	rule__AliasedRequiredCapability__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getAlternatives_0()); }
	(rule__AliasedRequiredCapability__Alternatives_0)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group__1__Impl
	rule__AliasedRequiredCapability__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getNameAssignment_1()); }
	(rule__AliasedRequiredCapability__NameAssignment_1)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group__2__Impl
	rule__AliasedRequiredCapability__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_2()); }
	(rule__AliasedRequiredCapability__Group_2__0)?
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3()); }
	(rule__AliasedRequiredCapability__Group_3__0)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_2__0__Impl
	rule__AliasedRequiredCapability__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getAsKeyword_2_0()); }
	'as'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getAsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getAliasAssignment_2_1()); }
	(rule__AliasedRequiredCapability__AliasAssignment_2_1)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getAliasAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3__0__Impl
	rule__AliasedRequiredCapability__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0()); }
	'{'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3__1__Impl
	rule__AliasedRequiredCapability__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1()); }
	(rule__AliasedRequiredCapability__UnorderedGroup_3_1)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2()); }
	'}'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group_3_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_0__0__Impl
	rule__AliasedRequiredCapability__Group_3_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getWhenKeyword_3_1_0_0()); }
	'when'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getWhenKeyword_3_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_0__1__Impl
	rule__AliasedRequiredCapability__Group_3_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_0_1()); }
	':'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_0__2__Impl
	rule__AliasedRequiredCapability__Group_3_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getCondExprAssignment_3_1_0_2()); }
	(rule__AliasedRequiredCapability__CondExprAssignment_3_1_0_2)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getCondExprAssignment_3_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3()); }
	';'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group_3_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_1__0__Impl
	rule__AliasedRequiredCapability__Group_3_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGreedyAssignment_3_1_1_0()); }
	(rule__AliasedRequiredCapability__GreedyAssignment_3_1_1_0)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGreedyAssignment_3_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1()); }
	';'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group_3_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_2__0__Impl
	rule__AliasedRequiredCapability__Group_3_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0()); }
	'requires-min'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_2__1__Impl
	rule__AliasedRequiredCapability__Group_3_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_2_1()); }
	':'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_2__2__Impl
	rule__AliasedRequiredCapability__Group_3_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getMinAssignment_3_1_2_2()); }
	(rule__AliasedRequiredCapability__MinAssignment_3_1_2_2)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getMinAssignment_3_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3()); }
	';'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group_3_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_3__0__Impl
	rule__AliasedRequiredCapability__Group_3_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0()); }
	'requires-max'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_3__1__Impl
	rule__AliasedRequiredCapability__Group_3_1_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_3_1()); }
	':'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_3__2__Impl
	rule__AliasedRequiredCapability__Group_3_1_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getMaxAssignment_3_1_3_2()); }
	(rule__AliasedRequiredCapability__MaxAssignment_3_1_3_2)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getMaxAssignment_3_1_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3()); }
	';'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__Group_3_1_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_4__0__Impl
	rule__AliasedRequiredCapability__Group_3_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getVersionKeyword_3_1_4_0()); }
	'version'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getVersionKeyword_3_1_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_4__1__Impl
	rule__AliasedRequiredCapability__Group_3_1_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_4_1()); }
	':'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_4__2__Impl
	rule__AliasedRequiredCapability__Group_3_1_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getVersionRangeAssignment_3_1_4_2()); }
	(rule__AliasedRequiredCapability__VersionRangeAssignment_3_1_4_2)
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getVersionRangeAssignment_3_1_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__Group_3_1_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__Group_3_1_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3()); }
	';'
	{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group__0__Impl
	rule__RequiredCapability__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getRequiredCapabilityAction_0()); }
	()
	{ after(grammarAccess.getRequiredCapabilityAccess().getRequiredCapabilityAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group__1__Impl
	rule__RequiredCapability__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getAlternatives_1()); }
	(rule__RequiredCapability__Alternatives_1)
	{ after(grammarAccess.getRequiredCapabilityAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group__2__Impl
	rule__RequiredCapability__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getNameAssignment_2()); }
	(rule__RequiredCapability__NameAssignment_2)
	{ after(grammarAccess.getRequiredCapabilityAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getGroup_3()); }
	(rule__RequiredCapability__Group_3__0)
	{ after(grammarAccess.getRequiredCapabilityAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3__0__Impl
	rule__RequiredCapability__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0()); }
	'{'
	{ after(grammarAccess.getRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3__1__Impl
	rule__RequiredCapability__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1()); }
	(rule__RequiredCapability__UnorderedGroup_3_1)
	{ after(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2()); }
	'}'
	{ after(grammarAccess.getRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__Group_3_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_0__0__Impl
	rule__RequiredCapability__Group_3_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getWhenKeyword_3_1_0_0()); }
	'when'
	{ after(grammarAccess.getRequiredCapabilityAccess().getWhenKeyword_3_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_0__1__Impl
	rule__RequiredCapability__Group_3_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_0_1()); }
	':'
	{ after(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_0__2__Impl
	rule__RequiredCapability__Group_3_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getCondExprAssignment_3_1_0_2()); }
	(rule__RequiredCapability__CondExprAssignment_3_1_0_2)
	{ after(grammarAccess.getRequiredCapabilityAccess().getCondExprAssignment_3_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3()); }
	';'
	{ after(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__Group_3_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_1__0__Impl
	rule__RequiredCapability__Group_3_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getGreedyAssignment_3_1_1_0()); }
	(rule__RequiredCapability__GreedyAssignment_3_1_1_0)
	{ after(grammarAccess.getRequiredCapabilityAccess().getGreedyAssignment_3_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1()); }
	';'
	{ after(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__Group_3_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_2__0__Impl
	rule__RequiredCapability__Group_3_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0()); }
	'requires-min'
	{ after(grammarAccess.getRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_2__1__Impl
	rule__RequiredCapability__Group_3_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_2_1()); }
	':'
	{ after(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_2__2__Impl
	rule__RequiredCapability__Group_3_1_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getMinAssignment_3_1_2_2()); }
	(rule__RequiredCapability__MinAssignment_3_1_2_2)
	{ after(grammarAccess.getRequiredCapabilityAccess().getMinAssignment_3_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3()); }
	';'
	{ after(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__Group_3_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_3__0__Impl
	rule__RequiredCapability__Group_3_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0()); }
	'requires-max'
	{ after(grammarAccess.getRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_3__1__Impl
	rule__RequiredCapability__Group_3_1_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_3_1()); }
	':'
	{ after(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_3__2__Impl
	rule__RequiredCapability__Group_3_1_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getMaxAssignment_3_1_3_2()); }
	(rule__RequiredCapability__MaxAssignment_3_1_3_2)
	{ after(grammarAccess.getRequiredCapabilityAccess().getMaxAssignment_3_1_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3()); }
	';'
	{ after(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__Group_3_1_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_4__0__Impl
	rule__RequiredCapability__Group_3_1_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getVersionKeyword_3_1_4_0()); }
	'version'
	{ after(grammarAccess.getRequiredCapabilityAccess().getVersionKeyword_3_1_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_4__1__Impl
	rule__RequiredCapability__Group_3_1_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_4_1()); }
	':'
	{ after(grammarAccess.getRequiredCapabilityAccess().getColonKeyword_3_1_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_4__2__Impl
	rule__RequiredCapability__Group_3_1_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getVersionRangeAssignment_3_1_4_2()); }
	(rule__RequiredCapability__VersionRangeAssignment_3_1_4_2)
	{ after(grammarAccess.getRequiredCapabilityAccess().getVersionRangeAssignment_3_1_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__Group_3_1_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__Group_3_1_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3()); }
	';'
	{ after(grammarAccess.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Path__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_1__0__Impl
	rule__Path__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); }
	('/')?
	{ after(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_1__1__Impl
	rule__Path__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getQIDParserRuleCall_1_1()); }
	ruleQID
	{ after(grammarAccess.getPathAccess().getQIDParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_1__2__Impl
	rule__Path__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getGroup_1_2()); }
	(rule__Path__Group_1_2__0)*
	{ after(grammarAccess.getPathAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getSolidusKeyword_1_3()); }
	('/')?
	{ after(grammarAccess.getPathAccess().getSolidusKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Path__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_1_2__0__Impl
	rule__Path__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getSolidusKeyword_1_2_0()); }
	'/'
	{ after(grammarAccess.getPathAccess().getSolidusKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Path__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Path__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPathAccess().getQIDParserRuleCall_1_2_1()); }
	ruleQID
	{ after(grammarAccess.getPathAccess().getQIDParserRuleCall_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterList__Group__0__Impl
	rule__ParameterList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterListAccess().getParametersAssignment_0()); }
	(rule__ParameterList__ParametersAssignment_0)
	{ after(grammarAccess.getParameterListAccess().getParametersAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterList__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterListAccess().getGroup_1()); }
	(rule__ParameterList__Group_1__0)*
	{ after(grammarAccess.getParameterListAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterList__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterList__Group_1__0__Impl
	rule__ParameterList__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); }
	','
	{ after(grammarAccess.getParameterListAccess().getCommaKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterList__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); }
	(rule__ParameterList__ParametersAssignment_1_1)
	{ after(grammarAccess.getParameterListAccess().getParametersAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParameterDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterDeclaration__Group__0__Impl
	rule__ParameterDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_0()); }
	(rule__ParameterDeclaration__TypeAssignment_0)?
	{ after(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParameterDeclaration__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); }
	(rule__ParameterDeclaration__NameAssignment_1)
	{ after(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__0__Impl
	rule__Function__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getDocumentationAssignment_0()); }
	(rule__Function__DocumentationAssignment_0)?
	{ after(grammarAccess.getFunctionAccess().getDocumentationAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__1__Impl
	rule__Function__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getVisibilityAssignment_1()); }
	(rule__Function__VisibilityAssignment_1)?
	{ after(grammarAccess.getFunctionAccess().getVisibilityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__2__Impl
	rule__Function__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFinalAssignment_2()); }
	(rule__Function__FinalAssignment_2)?
	{ after(grammarAccess.getFunctionAccess().getFinalAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__3__Impl
	rule__Function__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFunctionKeyword_3()); }
	'function'
	{ after(grammarAccess.getFunctionAccess().getFunctionKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__4__Impl
	rule__Function__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getReturnTypeAssignment_4()); }
	(rule__Function__ReturnTypeAssignment_4)?
	{ after(grammarAccess.getFunctionAccess().getReturnTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__5__Impl
	rule__Function__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getNameAssignment_5()); }
	(rule__Function__NameAssignment_5)
	{ after(grammarAccess.getFunctionAccess().getNameAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__6__Impl
	rule__Function__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_6()); }
	(rule__Function__Group_6__0)?
	{ after(grammarAccess.getFunctionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__7__Impl
	rule__Function__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_7()); }
	(rule__Function__Group_7__0)?
	{ after(grammarAccess.getFunctionAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getAlternatives_8()); }
	(rule__Function__Alternatives_8)
	{ after(grammarAccess.getFunctionAccess().getAlternatives_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6__0__Impl
	rule__Function__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_6_0()); }
	'('
	{ after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6__1__Impl
	rule__Function__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getAlternatives_6_1()); }
	(rule__Function__Alternatives_6_1)?
	{ after(grammarAccess.getFunctionAccess().getAlternatives_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6_2()); }
	')'
	{ after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_6_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0__0__Impl
	rule__Function__Group_6_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_0_0()); }
	(rule__Function__ParametersAssignment_6_1_0_0)
	{ after(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0__1__Impl
	rule__Function__Group_6_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_6_1_0_1()); }
	(rule__Function__Group_6_1_0_1__0)*
	{ after(grammarAccess.getFunctionAccess().getGroup_6_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_6_1_0_2()); }
	(rule__Function__Group_6_1_0_2__0)?
	{ after(grammarAccess.getFunctionAccess().getGroup_6_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_6_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0_1__0__Impl
	rule__Function__Group_6_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getCommaKeyword_6_1_0_1_0()); }
	','
	{ after(grammarAccess.getFunctionAccess().getCommaKeyword_6_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_0_1_1()); }
	(rule__Function__ParametersAssignment_6_1_0_1_1)
	{ after(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_6_1_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0_2__0__Impl
	rule__Function__Group_6_1_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getCommaKeyword_6_1_0_2_0()); }
	','
	{ after(grammarAccess.getFunctionAccess().getCommaKeyword_6_1_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0_2__1__Impl
	rule__Function__Group_6_1_0_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getVarArgsAssignment_6_1_0_2_1()); }
	(rule__Function__VarArgsAssignment_6_1_0_2_1)
	{ after(grammarAccess.getFunctionAccess().getVarArgsAssignment_6_1_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_0_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_0_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_0_2_2()); }
	(rule__Function__ParametersAssignment_6_1_0_2_2)
	{ after(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_0_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_6_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_1__0__Impl
	rule__Function__Group_6_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getVarArgsAssignment_6_1_1_0()); }
	(rule__Function__VarArgsAssignment_6_1_1_0)
	{ after(grammarAccess.getFunctionAccess().getVarArgsAssignment_6_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_6_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_6_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_1_1()); }
	(rule__Function__ParametersAssignment_6_1_1_1)
	{ after(grammarAccess.getFunctionAccess().getParametersAssignment_6_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_7__0__Impl
	rule__Function__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getWhenKeyword_7_0()); }
	'when'
	{ after(grammarAccess.getFunctionAccess().getWhenKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGuardAssignment_7_1()); }
	(rule__Function__GuardAssignment_7_1)
	{ after(grammarAccess.getFunctionAccess().getGuardAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_8_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_8_0__0__Impl
	rule__Function__Group_8_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_8_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getColonKeyword_8_0_0()); }
	':'
	{ after(grammarAccess.getFunctionAccess().getColonKeyword_8_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_8_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_8_0__1__Impl
	rule__Function__Group_8_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_8_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFuncExprAssignment_8_0_1()); }
	(rule__Function__FuncExprAssignment_8_0_1)
	{ after(grammarAccess.getFunctionAccess().getFuncExprAssignment_8_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_8_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_8_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_8_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getSemicolonKeyword_8_0_2()); }
	';'
	{ after(grammarAccess.getFunctionAccess().getSemicolonKeyword_8_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GuardExpression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuardExpression__Group_0__0__Impl
	rule__GuardExpression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardExpressionAccess().getColonKeyword_0_0()); }
	':'
	{ after(grammarAccess.getGuardExpressionAccess().getColonKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuardExpression__Group_0__1__Impl
	rule__GuardExpression__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardExpressionAccess().getGuardExprAssignment_0_1()); }
	(rule__GuardExpression__GuardExprAssignment_0_1)
	{ after(grammarAccess.getGuardExpressionAccess().getGuardExprAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GuardExpression__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGuardExpressionAccess().getSemicolonKeyword_0_2()); }
	';'
	{ after(grammarAccess.getGuardExpressionAccess().getSemicolonKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssignmentExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentExpression__Group__0__Impl
	rule__AssignmentExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentExpressionAccess().getCachedExpressionParserRuleCall_0()); }
	ruleCachedExpression
	{ after(grammarAccess.getAssignmentExpressionAccess().getCachedExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentExpressionAccess().getGroup_1()); }
	(rule__AssignmentExpression__Group_1__0)?
	{ after(grammarAccess.getAssignmentExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssignmentExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentExpression__Group_1__0__Impl
	rule__AssignmentExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0()); }
	()
	{ after(grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentExpression__Group_1__1__Impl
	rule__AssignmentExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentExpressionAccess().getFunctionNameAssignment_1_1()); }
	(rule__AssignmentExpression__FunctionNameAssignment_1_1)
	{ after(grammarAccess.getAssignmentExpressionAccess().getFunctionNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignmentExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentExpressionAccess().getRightExprAssignment_1_2()); }
	(rule__AssignmentExpression__RightExprAssignment_1_2)
	{ after(grammarAccess.getAssignmentExpressionAccess().getRightExprAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group__0__Impl
	rule__VarDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getDefValueAction_0()); }
	()
	{ after(grammarAccess.getVarDeclarationAccess().getDefValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group__1__Impl
	rule__VarDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getFinalAssignment_1()); }
	(rule__VarDeclaration__FinalAssignment_1)?
	{ after(grammarAccess.getVarDeclarationAccess().getFinalAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group__2__Impl
	rule__VarDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getGroup_2()); }
	(rule__VarDeclaration__Group_2__0)
	{ after(grammarAccess.getVarDeclarationAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getGroup_3()); }
	(rule__VarDeclaration__Group_3__0)?
	{ after(grammarAccess.getVarDeclarationAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDeclaration__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group_2__0__Impl
	rule__VarDeclaration__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getAlternatives_2_0()); }
	(rule__VarDeclaration__Alternatives_2_0)
	{ after(grammarAccess.getVarDeclarationAccess().getAlternatives_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getNameAssignment_2_1()); }
	(rule__VarDeclaration__NameAssignment_2_1)
	{ after(grammarAccess.getVarDeclarationAccess().getNameAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VarDeclaration__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group_3__0__Impl
	rule__VarDeclaration__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getEqualsSignKeyword_3_0()); }
	'='
	{ after(grammarAccess.getVarDeclarationAccess().getEqualsSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VarDeclaration__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarDeclarationAccess().getValueExprAssignment_3_1()); }
	(rule__VarDeclaration__ValueExprAssignment_3_1)
	{ after(grammarAccess.getVarDeclarationAccess().getValueExprAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ValDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ValDeclaration__Group__0__Impl
	rule__ValDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValDeclarationAccess().getDefValueAction_0()); }
	()
	{ after(grammarAccess.getValDeclarationAccess().getDefValueAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ValDeclaration__Group__1__Impl
	rule__ValDeclaration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValDeclarationAccess().getFinalAssignment_1()); }
	(rule__ValDeclaration__FinalAssignment_1)?
	{ after(grammarAccess.getValDeclarationAccess().getFinalAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ValDeclaration__Group__2__Impl
	rule__ValDeclaration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValDeclarationAccess().getImmutableAssignment_2()); }
	(rule__ValDeclaration__ImmutableAssignment_2)
	{ after(grammarAccess.getValDeclarationAccess().getImmutableAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ValDeclaration__Group__3__Impl
	rule__ValDeclaration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValDeclarationAccess().getTypeAssignment_3()); }
	(rule__ValDeclaration__TypeAssignment_3)?
	{ after(grammarAccess.getValDeclarationAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ValDeclaration__Group__4__Impl
	rule__ValDeclaration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValDeclarationAccess().getNameAssignment_4()); }
	(rule__ValDeclaration__NameAssignment_4)
	{ after(grammarAccess.getValDeclarationAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ValDeclaration__Group__5__Impl
	rule__ValDeclaration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValDeclarationAccess().getEqualsSignKeyword_5()); }
	'='
	{ after(grammarAccess.getValDeclarationAccess().getEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ValDeclaration__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValDeclarationAccess().getValueExprAssignment_6()); }
	(rule__ValDeclaration__ValueExprAssignment_6)
	{ after(grammarAccess.getValDeclarationAccess().getValueExprAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group__0__Impl
	rule__SimpleTypeRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getRawTypeAssignment_0()); }
	(rule__SimpleTypeRef__RawTypeAssignment_0)
	{ after(grammarAccess.getSimpleTypeRefAccess().getRawTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getGroup_1()); }
	(rule__SimpleTypeRef__Group_1__0)?
	{ after(grammarAccess.getSimpleTypeRefAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeRef__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group_1__0__Impl
	rule__SimpleTypeRef__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getLessThanSignKeyword_1_0()); }
	'<'
	{ after(grammarAccess.getSimpleTypeRefAccess().getLessThanSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group_1__1__Impl
	rule__SimpleTypeRef__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListAssignment_1_1()); }
	(rule__SimpleTypeRef__ActualArgumentsListAssignment_1_1)
	{ after(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group_1__2__Impl
	rule__SimpleTypeRef__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getGroup_1_2()); }
	(rule__SimpleTypeRef__Group_1_2__0)*
	{ after(grammarAccess.getSimpleTypeRefAccess().getGroup_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getGreaterThanSignKeyword_1_3()); }
	'>'
	{ after(grammarAccess.getSimpleTypeRefAccess().getGreaterThanSignKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SimpleTypeRef__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group_1_2__0__Impl
	rule__SimpleTypeRef__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getCommaKeyword_1_2_0()); }
	','
	{ after(grammarAccess.getSimpleTypeRefAccess().getCommaKeyword_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SimpleTypeRef__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListAssignment_1_2_1()); }
	(rule__SimpleTypeRef__ActualArgumentsListAssignment_1_2_1)
	{ after(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListAssignment_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureTypeRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group__0__Impl
	rule__ClosureTypeRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getClosureTypeRefAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group__1__Impl
	rule__ClosureTypeRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getAlternatives_1()); }
	(rule__ClosureTypeRef__Alternatives_1)?
	{ after(grammarAccess.getClosureTypeRefAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group__2__Impl
	rule__ClosureTypeRef__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getClosureTypeRefAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group__3__Impl
	rule__ClosureTypeRef__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getEqualsSignGreaterThanSignKeyword_3()); }
	'=>'
	{ after(grammarAccess.getClosureTypeRefAccess().getEqualsSignGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getReturnTypeAssignment_4()); }
	(rule__ClosureTypeRef__ReturnTypeAssignment_4)
	{ after(grammarAccess.getClosureTypeRefAccess().getReturnTypeAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureTypeRef__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0__0__Impl
	rule__ClosureTypeRef__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_0()); }
	(rule__ClosureTypeRef__ParameterTypesAssignment_1_0_0)
	{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0__1__Impl
	rule__ClosureTypeRef__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getGroup_1_0_1()); }
	(rule__ClosureTypeRef__Group_1_0_1__0)*
	{ after(grammarAccess.getClosureTypeRefAccess().getGroup_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getGroup_1_0_2()); }
	(rule__ClosureTypeRef__Group_1_0_2__0)?
	{ after(grammarAccess.getClosureTypeRefAccess().getGroup_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureTypeRef__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0_1__0__Impl
	rule__ClosureTypeRef__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getCommaKeyword_1_0_1_0()); }
	','
	{ after(grammarAccess.getClosureTypeRefAccess().getCommaKeyword_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_1_1()); }
	(rule__ClosureTypeRef__ParameterTypesAssignment_1_0_1_1)
	{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureTypeRef__Group_1_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0_2__0__Impl
	rule__ClosureTypeRef__Group_1_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getCommaKeyword_1_0_2_0()); }
	','
	{ after(grammarAccess.getClosureTypeRefAccess().getCommaKeyword_1_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0_2__1__Impl
	rule__ClosureTypeRef__Group_1_0_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getVarArgsAssignment_1_0_2_1()); }
	(rule__ClosureTypeRef__VarArgsAssignment_1_0_2_1)
	{ after(grammarAccess.getClosureTypeRefAccess().getVarArgsAssignment_1_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_0_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_0_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_2_2()); }
	(rule__ClosureTypeRef__ParameterTypesAssignment_1_0_2_2)
	{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureTypeRef__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_1__0__Impl
	rule__ClosureTypeRef__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getVarArgsAssignment_1_1_0()); }
	(rule__ClosureTypeRef__VarArgsAssignment_1_1_0)
	{ after(grammarAccess.getClosureTypeRefAccess().getVarArgsAssignment_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureTypeRef__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_1_1()); }
	(rule__ClosureTypeRef__ParameterTypesAssignment_1_1_1)
	{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CachedExpression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CachedExpression__Group_0__0__Impl
	rule__CachedExpression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CachedExpression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCachedExpressionAccess().getCachedExpressionAction_0_0()); }
	()
	{ after(grammarAccess.getCachedExpressionAccess().getCachedExpressionAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CachedExpression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CachedExpression__Group_0__1__Impl
	rule__CachedExpression__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CachedExpression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCachedExpressionAccess().getCachedKeyword_0_1()); }
	'cached'
	{ after(grammarAccess.getCachedExpressionAccess().getCachedKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CachedExpression__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CachedExpression__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CachedExpression__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCachedExpressionAccess().getExprAssignment_0_2()); }
	(rule__CachedExpression__ExprAssignment_0_2)
	{ after(grammarAccess.getCachedExpressionAccess().getExprAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__0__Impl
	rule__OrExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
	ruleAndExpression
	{ after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getGroup_1()); }
	(rule__OrExpression__Group_1__0)*
	{ after(grammarAccess.getOrExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__0__Impl
	rule__OrExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0()); }
	()
	{ after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__1__Impl
	rule__OrExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); }
	'||'
	{ after(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getRightExprAssignment_1_2()); }
	(rule__OrExpression__RightExprAssignment_1_2)
	{ after(grammarAccess.getOrExpressionAccess().getRightExprAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__0__Impl
	rule__AndExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); }
	ruleRelationalExpression
	{ after(grammarAccess.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getGroup_1()); }
	(rule__AndExpression__Group_1__0)*
	{ after(grammarAccess.getAndExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__0__Impl
	rule__AndExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0()); }
	()
	{ after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__1__Impl
	rule__AndExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); }
	'&&'
	{ after(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getRightExprAssignment_1_2()); }
	(rule__AndExpression__RightExprAssignment_1_2)
	{ after(grammarAccess.getAndExpressionAccess().getRightExprAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group__0__Impl
	rule__RelationalExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); }
	ruleAdditiveExpression
	{ after(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); }
	(rule__RelationalExpression__Group_1__0)*
	{ after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RelationalExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1__0__Impl
	rule__RelationalExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
	()
	{ after(grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1__1__Impl
	rule__RelationalExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getFunctionNameAssignment_1_1()); }
	(rule__RelationalExpression__FunctionNameAssignment_1_1)
	{ after(grammarAccess.getRelationalExpressionAccess().getFunctionNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RelationalExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationalExpressionAccess().getRightExprAssignment_1_2()); }
	(rule__RelationalExpression__RightExprAssignment_1_2)
	{ after(grammarAccess.getRelationalExpressionAccess().getRightExprAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AdditiveExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group__0__Impl
	rule__AdditiveExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); }
	ruleMultiplicativeExpression
	{ after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); }
	(rule__AdditiveExpression__Group_1__0)*
	{ after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AdditiveExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1__0__Impl
	rule__AdditiveExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
	()
	{ after(grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1__1__Impl
	rule__AdditiveExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getFunctionNameAssignment_1_1()); }
	(rule__AdditiveExpression__FunctionNameAssignment_1_1)
	{ after(grammarAccess.getAdditiveExpressionAccess().getFunctionNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdditiveExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditiveExpressionAccess().getRightExprAssignment_1_2()); }
	(rule__AdditiveExpression__RightExprAssignment_1_2)
	{ after(grammarAccess.getAdditiveExpressionAccess().getRightExprAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group__0__Impl
	rule__MultiplicativeExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getSetExpressionParserRuleCall_0()); }
	ruleSetExpression
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getSetExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); }
	(rule__MultiplicativeExpression__Group_1__0)*
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplicativeExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__0__Impl
	rule__MultiplicativeExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
	()
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__1__Impl
	rule__MultiplicativeExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameAssignment_1_1()); }
	(rule__MultiplicativeExpression__FunctionNameAssignment_1_1)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplicativeExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicativeExpressionAccess().getRightExprAssignment_1_2()); }
	(rule__MultiplicativeExpression__RightExprAssignment_1_2)
	{ after(grammarAccess.getMultiplicativeExpressionAccess().getRightExprAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SetExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetExpression__Group__0__Impl
	rule__SetExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetExpressionAccess().getUnaryOrInfixExpressionParserRuleCall_0()); }
	ruleUnaryOrInfixExpression
	{ after(grammarAccess.getSetExpressionAccess().getUnaryOrInfixExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetExpressionAccess().getGroup_1()); }
	(rule__SetExpression__Group_1__0)*
	{ after(grammarAccess.getSetExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SetExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetExpression__Group_1__0__Impl
	rule__SetExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
	()
	{ after(grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetExpression__Group_1__1__Impl
	rule__SetExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetExpressionAccess().getFunctionNameAssignment_1_1()); }
	(rule__SetExpression__FunctionNameAssignment_1_1)
	{ after(grammarAccess.getSetExpressionAccess().getFunctionNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SetExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSetExpressionAccess().getRightExprAssignment_1_2()); }
	(rule__SetExpression__RightExprAssignment_1_2)
	{ after(grammarAccess.getSetExpressionAccess().getRightExprAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UnaryExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryExpression__Group__0__Impl
	rule__UnaryExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryExpressionAccess().getUnaryOpExpressionAction_0()); }
	()
	{ after(grammarAccess.getUnaryExpressionAccess().getUnaryOpExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryExpression__Group__1__Impl
	rule__UnaryExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryExpressionAccess().getFunctionNameAssignment_1()); }
	(rule__UnaryExpression__FunctionNameAssignment_1)
	{ after(grammarAccess.getUnaryExpressionAccess().getFunctionNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UnaryExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUnaryExpressionAccess().getExprAssignment_2()); }
	(rule__UnaryExpression__ExprAssignment_2)
	{ after(grammarAccess.getUnaryExpressionAccess().getExprAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PreopExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreopExpression__Group__0__Impl
	rule__PreopExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreopExpressionAccess().getUnaryPreOpExpressionAction_0()); }
	()
	{ after(grammarAccess.getPreopExpressionAccess().getUnaryPreOpExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreopExpression__Group__1__Impl
	rule__PreopExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreopExpressionAccess().getFunctionNameAssignment_1()); }
	(rule__PreopExpression__FunctionNameAssignment_1)
	{ after(grammarAccess.getPreopExpressionAccess().getFunctionNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreopExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreopExpressionAccess().getExprAssignment_2()); }
	(rule__PreopExpression__ExprAssignment_2)
	{ after(grammarAccess.getPreopExpressionAccess().getExprAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PostopExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PostopExpression__Group__0__Impl
	rule__PostopExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPostopExpressionAccess().getInfixExpressionParserRuleCall_0()); }
	ruleInfixExpression
	{ after(grammarAccess.getPostopExpressionAccess().getInfixExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PostopExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPostopExpressionAccess().getGroup_1()); }
	(rule__PostopExpression__Group_1__0)?
	{ after(grammarAccess.getPostopExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PostopExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PostopExpression__Group_1__0__Impl
	rule__PostopExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0()); }
	()
	{ after(grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PostopExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPostopExpressionAccess().getFunctionNameAssignment_1_1()); }
	(rule__PostopExpression__FunctionNameAssignment_1_1)
	{ after(grammarAccess.getPostopExpressionAccess().getFunctionNameAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfixExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group__0__Impl
	rule__InfixExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getCallExpressionParserRuleCall_0()); }
	ruleCallExpression
	{ after(grammarAccess.getInfixExpressionAccess().getCallExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getAlternatives_1()); }
	(rule__InfixExpression__Alternatives_1)*
	{ after(grammarAccess.getInfixExpressionAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfixExpression__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_0__0__Impl
	rule__InfixExpression__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0()); }
	()
	{ after(grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_0__1__Impl
	rule__InfixExpression__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getFullStopKeyword_1_0_1()); }
	'.'
	{ after(grammarAccess.getInfixExpressionAccess().getFullStopKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_0__2__Impl
	rule__InfixExpression__Group_1_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getNameAssignment_1_0_2()); }
	(rule__InfixExpression__NameAssignment_1_0_2)
	{ after(grammarAccess.getInfixExpressionAccess().getNameAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_0__3__Impl
	rule__InfixExpression__Group_1_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getLeftParenthesisKeyword_1_0_3()); }
	'('
	{ after(grammarAccess.getInfixExpressionAccess().getLeftParenthesisKeyword_1_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_0__4__Impl
	rule__InfixExpression__Group_1_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getParameterListAssignment_1_0_4()); }
	(rule__InfixExpression__ParameterListAssignment_1_0_4)?
	{ after(grammarAccess.getInfixExpressionAccess().getParameterListAssignment_1_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_0__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getRightParenthesisKeyword_1_0_5()); }
	')'
	{ after(grammarAccess.getInfixExpressionAccess().getRightParenthesisKeyword_1_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfixExpression__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_1__0__Impl
	rule__InfixExpression__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0()); }
	()
	{ after(grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_1__1__Impl
	rule__InfixExpression__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getLeftSquareBracketKeyword_1_1_1()); }
	'['
	{ after(grammarAccess.getInfixExpressionAccess().getLeftSquareBracketKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_1__2__Impl
	rule__InfixExpression__Group_1_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getIndexExprAssignment_1_1_2()); }
	(rule__InfixExpression__IndexExprAssignment_1_1_2)
	{ after(grammarAccess.getInfixExpressionAccess().getIndexExprAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getRightSquareBracketKeyword_1_1_3()); }
	']'
	{ after(grammarAccess.getInfixExpressionAccess().getRightSquareBracketKeyword_1_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InfixExpression__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_2__0__Impl
	rule__InfixExpression__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0()); }
	()
	{ after(grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_2__1__Impl
	rule__InfixExpression__Group_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getFullStopKeyword_1_2_1()); }
	'.'
	{ after(grammarAccess.getInfixExpressionAccess().getFullStopKeyword_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InfixExpression__Group_1_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__Group_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInfixExpressionAccess().getFeatureNameAssignment_1_2_2()); }
	(rule__InfixExpression__FeatureNameAssignment_1_2_2)
	{ after(grammarAccess.getInfixExpressionAccess().getFeatureNameAssignment_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CallExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallExpression__Group__0__Impl
	rule__CallExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallExpressionAccess().getPrimaryExpressionParserRuleCall_0()); }
	rulePrimaryExpression
	{ after(grammarAccess.getCallExpressionAccess().getPrimaryExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallExpressionAccess().getGroup_1()); }
	(rule__CallExpression__Group_1__0)*
	{ after(grammarAccess.getCallExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CallExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallExpression__Group_1__0__Impl
	rule__CallExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0()); }
	()
	{ after(grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallExpression__Group_1__1__Impl
	rule__CallExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallExpressionAccess().getLeftParenthesisKeyword_1_1()); }
	'('
	{ after(grammarAccess.getCallExpressionAccess().getLeftParenthesisKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallExpression__Group_1__2__Impl
	rule__CallExpression__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallExpressionAccess().getParameterListAssignment_1_2()); }
	(rule__CallExpression__ParameterListAssignment_1_2)?
	{ after(grammarAccess.getCallExpressionAccess().getParameterListAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CallExpression__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCallExpressionAccess().getRightParenthesisKeyword_1_3()); }
	')'
	{ after(grammarAccess.getCallExpressionAccess().getRightParenthesisKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WithExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group__0__Impl
	rule__WithExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getWithKeyword_0()); }
	'with'
	{ after(grammarAccess.getWithExpressionAccess().getWithKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group__1__Impl
	rule__WithExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getGroup_1()); }
	(rule__WithExpression__Group_1__0)?
	{ after(grammarAccess.getWithExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getAlternatives_2()); }
	(rule__WithExpression__Alternatives_2)
	{ after(grammarAccess.getWithExpressionAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WithExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_1__0__Impl
	rule__WithExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getReferencedAdviceAssignment_1_0()); }
	(rule__WithExpression__ReferencedAdviceAssignment_1_0)
	{ after(grammarAccess.getWithExpressionAccess().getReferencedAdviceAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getGroup_1_1()); }
	(rule__WithExpression__Group_1_1__0)*
	{ after(grammarAccess.getWithExpressionAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WithExpression__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_1_1__0__Impl
	rule__WithExpression__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getCommaKeyword_1_1_0()); }
	','
	{ after(grammarAccess.getWithExpressionAccess().getCommaKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getReferencedAdviceAssignment_1_1_1()); }
	(rule__WithExpression__ReferencedAdviceAssignment_1_1_1)
	{ after(grammarAccess.getWithExpressionAccess().getReferencedAdviceAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WithExpression__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_2_0__0__Impl
	rule__WithExpression__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getColonKeyword_2_0_0()); }
	':'
	{ after(grammarAccess.getWithExpressionAccess().getColonKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getFuncExprAssignment_2_0_1()); }
	(rule__WithExpression__FuncExprAssignment_2_0_1)
	{ after(grammarAccess.getWithExpressionAccess().getFuncExprAssignment_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WithExpression__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_2_1__0__Impl
	rule__WithExpression__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getLeftCurlyBracketKeyword_2_1_0()); }
	'{'
	{ after(grammarAccess.getWithExpressionAccess().getLeftCurlyBracketKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_2_1__1__Impl
	rule__WithExpression__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getFuncExprAssignment_2_1_1()); }
	(rule__WithExpression__FuncExprAssignment_2_1_1)
	{ after(grammarAccess.getWithExpressionAccess().getFuncExprAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithExpression__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithExpressionAccess().getRightCurlyBracketKeyword_2_1_2()); }
	'}'
	{ after(grammarAccess.getWithExpressionAccess().getRightCurlyBracketKeyword_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WithContextExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithContextExpression__Group__0__Impl
	rule__WithContextExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithContextExpressionAccess().getWithKeyword_0()); }
	'with'
	{ after(grammarAccess.getWithContextExpressionAccess().getWithKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithContextExpression__Group__1__Impl
	rule__WithContextExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithContextExpressionAccess().getContextKeyword_1()); }
	'context'
	{ after(grammarAccess.getWithContextExpressionAccess().getContextKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithContextExpression__Group__2__Impl
	rule__WithContextExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithContextExpressionAccess().getExprAssignment_2()); }
	(rule__WithContextExpression__ExprAssignment_2)
	{ after(grammarAccess.getWithContextExpressionAccess().getExprAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithContextExpression__Group__3__Impl
	rule__WithContextExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithContextExpressionAccess().getGroup_3()); }
	(rule__WithContextExpression__Group_3__0)?
	{ after(grammarAccess.getWithContextExpressionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithContextExpression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithContextExpressionAccess().getContextBlockAssignment_4()); }
	(rule__WithContextExpression__ContextBlockAssignment_4)
	{ after(grammarAccess.getWithContextExpressionAccess().getContextBlockAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WithContextExpression__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithContextExpression__Group_3__0__Impl
	rule__WithContextExpression__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithContextExpressionAccess().getAsKeyword_3_0()); }
	'as'
	{ after(grammarAccess.getWithContextExpressionAccess().getAsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WithContextExpression__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWithContextExpressionAccess().getAliasAssignment_3_1()); }
	(rule__WithContextExpression__AliasAssignment_3_1)
	{ after(grammarAccess.getWithContextExpressionAccess().getAliasAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BlockExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__0__Impl
	rule__BlockExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getChainedExpressionAction_0()); }
	()
	{ after(grammarAccess.getBlockExpressionAccess().getChainedExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__1__Impl
	rule__BlockExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__2__Impl
	rule__BlockExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getGroup_2()); }
	(rule__BlockExpression__Group_2__0)*
	{ after(grammarAccess.getBlockExpressionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BlockExpression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group_2__0__Impl
	rule__BlockExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getExpressionsAssignment_2_0()); }
	(rule__BlockExpression__ExpressionsAssignment_2_0)
	{ after(grammarAccess.getBlockExpressionAccess().getExpressionsAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); }
	';'
	{ after(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Value__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Value__Group__0__Impl
	rule__Value__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValueAccess().getVariableExpressionAction_0()); }
	()
	{ after(grammarAccess.getValueAccess().getVariableExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Value__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValueAccess().getNameAssignment_1()); }
	(rule__Value__NameAssignment_1)
	{ after(grammarAccess.getValueAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KeywordVariables__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KeywordVariables__Group__0__Impl
	rule__KeywordVariables__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KeywordVariables__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKeywordVariablesAccess().getVariableExpressionAction_0()); }
	()
	{ after(grammarAccess.getKeywordVariablesAccess().getVariableExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KeywordVariables__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KeywordVariables__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KeywordVariables__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKeywordVariablesAccess().getNameAssignment_1()); }
	(rule__KeywordVariables__NameAssignment_1)
	{ after(grammarAccess.getKeywordVariablesAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OperationCall__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationCall__Group__0__Impl
	rule__OperationCall__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationCallAccess().getCallNamedFunctionAction_0()); }
	()
	{ after(grammarAccess.getOperationCallAccess().getCallNamedFunctionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationCall__Group__1__Impl
	rule__OperationCall__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationCallAccess().getNameAssignment_1()); }
	(rule__OperationCall__NameAssignment_1)
	{ after(grammarAccess.getOperationCallAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationCall__Group__2__Impl
	rule__OperationCall__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationCall__Group__3__Impl
	rule__OperationCall__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationCallAccess().getParameterListAssignment_3()); }
	(rule__OperationCall__ParameterListAssignment_3)?
	{ after(grammarAccess.getOperationCallAccess().getParameterListAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OperationCall__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConstructorCallExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group__0__Impl
	rule__ConstructorCallExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getCreateExpressionAction_0()); }
	()
	{ after(grammarAccess.getConstructorCallExpressionAccess().getCreateExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group__1__Impl
	rule__ConstructorCallExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getNewKeyword_1()); }
	'new'
	{ after(grammarAccess.getConstructorCallExpressionAccess().getNewKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group__2__Impl
	rule__ConstructorCallExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getTypeExprAssignment_2()); }
	(rule__ConstructorCallExpression__TypeExprAssignment_2)
	{ after(grammarAccess.getConstructorCallExpressionAccess().getTypeExprAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group__3__Impl
	rule__ConstructorCallExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getGroup_3()); }
	(rule__ConstructorCallExpression__Group_3__0)?
	{ after(grammarAccess.getConstructorCallExpressionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group__4__Impl
	rule__ConstructorCallExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getGroup_4()); }
	(rule__ConstructorCallExpression__Group_4__0)?
	{ after(grammarAccess.getConstructorCallExpressionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getContextBlockAssignment_5()); }
	(rule__ConstructorCallExpression__ContextBlockAssignment_5)?
	{ after(grammarAccess.getConstructorCallExpressionAccess().getContextBlockAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConstructorCallExpression__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group_3__0__Impl
	rule__ConstructorCallExpression__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getLeftParenthesisKeyword_3_0()); }
	'('
	{ after(grammarAccess.getConstructorCallExpressionAccess().getLeftParenthesisKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group_3__1__Impl
	rule__ConstructorCallExpression__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getParameterListAssignment_3_1()); }
	(rule__ConstructorCallExpression__ParameterListAssignment_3_1)?
	{ after(grammarAccess.getConstructorCallExpressionAccess().getParameterListAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getRightParenthesisKeyword_3_2()); }
	')'
	{ after(grammarAccess.getConstructorCallExpressionAccess().getRightParenthesisKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConstructorCallExpression__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group_4__0__Impl
	rule__ConstructorCallExpression__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getAsKeyword_4_0()); }
	'as'
	{ after(grammarAccess.getConstructorCallExpressionAccess().getAsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConstructorCallExpression__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstructorCallExpressionAccess().getAliasAssignment_4_1()); }
	(rule__ConstructorCallExpression__AliasAssignment_4_1)
	{ after(grammarAccess.getConstructorCallExpressionAccess().getAliasAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InitializationBlockExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationBlockExpression__Group__0__Impl
	rule__InitializationBlockExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationBlockExpressionAccess().getChainedExpressionAction_0()); }
	()
	{ after(grammarAccess.getInitializationBlockExpressionAccess().getChainedExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationBlockExpression__Group__1__Impl
	rule__InitializationBlockExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getInitializationBlockExpressionAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationBlockExpression__Group__2__Impl
	rule__InitializationBlockExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationBlockExpressionAccess().getExpressionsAssignment_2()); }
	(rule__InitializationBlockExpression__ExpressionsAssignment_2)
	{ after(grammarAccess.getInitializationBlockExpressionAccess().getExpressionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationBlockExpression__Group__3__Impl
	rule__InitializationBlockExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationBlockExpressionAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getInitializationBlockExpressionAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationBlockExpression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationBlockExpressionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getInitializationBlockExpressionAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InitializationExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationExpression__Group__0__Impl
	rule__InitializationExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationExpressionAccess().getAssignmentExpressionAction_0()); }
	()
	{ after(grammarAccess.getInitializationExpressionAccess().getAssignmentExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationExpression__Group__1__Impl
	rule__InitializationExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationExpressionAccess().getLeftExprAssignment_1()); }
	(rule__InitializationExpression__LeftExprAssignment_1)
	{ after(grammarAccess.getInitializationExpressionAccess().getLeftExprAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationExpression__Group__2__Impl
	rule__InitializationExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationExpressionAccess().getFunctionNameAssignment_2()); }
	(rule__InitializationExpression__FunctionNameAssignment_2)
	{ after(grammarAccess.getInitializationExpressionAccess().getFunctionNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InitializationExpression__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitializationExpressionAccess().getRightExprAssignment_3()); }
	(rule__InitializationExpression__RightExprAssignment_3)
	{ after(grammarAccess.getInitializationExpressionAccess().getRightExprAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FeatureOfThis__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureOfThis__Group__0__Impl
	rule__FeatureOfThis__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureOfThis__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureOfThisAccess().getFeatureExpressionAction_0()); }
	()
	{ after(grammarAccess.getFeatureOfThisAccess().getFeatureExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureOfThis__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FeatureOfThis__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureOfThis__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureOfThisAccess().getFeatureNameAssignment_1()); }
	(rule__FeatureOfThis__FeatureNameAssignment_1)
	{ after(grammarAccess.getFeatureOfThisAccess().getFeatureNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LiteralFunction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LiteralFunction__Group__0__Impl
	rule__LiteralFunction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralFunction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLiteralFunctionAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getLiteralFunctionAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralFunction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LiteralFunction__Group__1__Impl
	rule__LiteralFunction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralFunction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLiteralFunctionAccess().getClosureExpressionParserRuleCall_1()); }
	ruleClosureExpression
	{ after(grammarAccess.getLiteralFunctionAccess().getClosureExpressionParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralFunction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LiteralFunction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralFunction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLiteralFunctionAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getLiteralFunctionAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group__0__Impl
	rule__ClosureExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getFunctionAction_0()); }
	()
	{ after(grammarAccess.getClosureExpressionAccess().getFunctionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group__1__Impl
	rule__ClosureExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getGroup_1()); }
	(rule__ClosureExpression__Group_1__0)?
	{ after(grammarAccess.getClosureExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group__2__Impl
	rule__ClosureExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getAlternatives_2()); }
	(rule__ClosureExpression__Alternatives_2)?
	{ after(grammarAccess.getClosureExpressionAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group__3__Impl
	rule__ClosureExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getVerticalLineKeyword_3()); }
	'|'
	{ after(grammarAccess.getClosureExpressionAccess().getVerticalLineKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getFuncExprAssignment_4()); }
	(rule__ClosureExpression__FuncExprAssignment_4)
	{ after(grammarAccess.getClosureExpressionAccess().getFuncExprAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_1__0__Impl
	rule__ClosureExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getLessThanSignKeyword_1_0()); }
	'<'
	{ after(grammarAccess.getClosureExpressionAccess().getLessThanSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_1__1__Impl
	rule__ClosureExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getReturnTypeAssignment_1_1()); }
	(rule__ClosureExpression__ReturnTypeAssignment_1_1)
	{ after(grammarAccess.getClosureExpressionAccess().getReturnTypeAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getGreaterThanSignKeyword_1_2()); }
	'>'
	{ after(grammarAccess.getClosureExpressionAccess().getGreaterThanSignKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureExpression__Group_2_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0__0__Impl
	rule__ClosureExpression__Group_2_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getVerticalLineKeyword_2_0_0()); }
	('|')?
	{ after(grammarAccess.getClosureExpressionAccess().getVerticalLineKeyword_2_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getGroup_2_0_1()); }
	(rule__ClosureExpression__Group_2_0_1__0)
	{ after(grammarAccess.getClosureExpressionAccess().getGroup_2_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureExpression__Group_2_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1__0__Impl
	rule__ClosureExpression__Group_2_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_0_1_0()); }
	(rule__ClosureExpression__ParametersAssignment_2_0_1_0)
	{ after(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1__1__Impl
	rule__ClosureExpression__Group_2_0_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getGroup_2_0_1_1()); }
	(rule__ClosureExpression__Group_2_0_1_1__0)*
	{ after(grammarAccess.getClosureExpressionAccess().getGroup_2_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getGroup_2_0_1_2()); }
	(rule__ClosureExpression__Group_2_0_1_2__0)?
	{ after(grammarAccess.getClosureExpressionAccess().getGroup_2_0_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureExpression__Group_2_0_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1_1__0__Impl
	rule__ClosureExpression__Group_2_0_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getCommaKeyword_2_0_1_1_0()); }
	','
	{ after(grammarAccess.getClosureExpressionAccess().getCommaKeyword_2_0_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_0_1_1_1()); }
	(rule__ClosureExpression__ParametersAssignment_2_0_1_1_1)
	{ after(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_0_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureExpression__Group_2_0_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1_2__0__Impl
	rule__ClosureExpression__Group_2_0_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getCommaKeyword_2_0_1_2_0()); }
	','
	{ after(grammarAccess.getClosureExpressionAccess().getCommaKeyword_2_0_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1_2__1__Impl
	rule__ClosureExpression__Group_2_0_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getVarArgsAssignment_2_0_1_2_1()); }
	(rule__ClosureExpression__VarArgsAssignment_2_0_1_2_1)
	{ after(grammarAccess.getClosureExpressionAccess().getVarArgsAssignment_2_0_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_0_1_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_0_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_0_1_2_2()); }
	(rule__ClosureExpression__ParametersAssignment_2_0_1_2_2)
	{ after(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_0_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ClosureExpression__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_1__0__Impl
	rule__ClosureExpression__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getVarArgsAssignment_2_1_0()); }
	(rule__ClosureExpression__VarArgsAssignment_2_1_0)
	{ after(grammarAccess.getClosureExpressionAccess().getVarArgsAssignment_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ClosureExpression__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_1_1()); }
	(rule__ClosureExpression__ParametersAssignment_2_1_1)
	{ after(grammarAccess.getClosureExpressionAccess().getParametersAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BlockExpressionWithoutBrackets__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpressionWithoutBrackets__Group__0__Impl
	rule__BlockExpressionWithoutBrackets__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpressionWithoutBrackets__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionWithoutBracketsAccess().getChainedExpressionAction_0()); }
	()
	{ after(grammarAccess.getBlockExpressionWithoutBracketsAccess().getChainedExpressionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpressionWithoutBrackets__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpressionWithoutBrackets__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpressionWithoutBrackets__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getBlockExpressionWithoutBracketsAccess().getGroup_1()); }
		(rule__BlockExpressionWithoutBrackets__Group_1__0)
		{ after(grammarAccess.getBlockExpressionWithoutBracketsAccess().getGroup_1()); }
	)
	(
		{ before(grammarAccess.getBlockExpressionWithoutBracketsAccess().getGroup_1()); }
		(rule__BlockExpressionWithoutBrackets__Group_1__0)*
		{ after(grammarAccess.getBlockExpressionWithoutBracketsAccess().getGroup_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BlockExpressionWithoutBrackets__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpressionWithoutBrackets__Group_1__0__Impl
	rule__BlockExpressionWithoutBrackets__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpressionWithoutBrackets__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionWithoutBracketsAccess().getExpressionsAssignment_1_0()); }
	(rule__BlockExpressionWithoutBrackets__ExpressionsAssignment_1_0)
	{ after(grammarAccess.getBlockExpressionWithoutBracketsAccess().getExpressionsAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpressionWithoutBrackets__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlockExpressionWithoutBrackets__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpressionWithoutBrackets__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockExpressionWithoutBracketsAccess().getSemicolonKeyword_1_1()); }
	';'
	{ after(grammarAccess.getBlockExpressionWithoutBracketsAccess().getSemicolonKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParanthesizedExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParanthesizedExpression__Group__0__Impl
	rule__ParanthesizedExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParanthesizedExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParanthesizedExpressionAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParanthesizedExpressionAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParanthesizedExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParanthesizedExpression__Group__1__Impl
	rule__ParanthesizedExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParanthesizedExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParanthesizedExpressionAccess().getExpressionParserRuleCall_1()); }
	ruleExpression
	{ after(grammarAccess.getParanthesizedExpressionAccess().getExpressionParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParanthesizedExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParanthesizedExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParanthesizedExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParanthesizedExpressionAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParanthesizedExpressionAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QID__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QID__Group__0__Impl
	rule__QID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QID__Group__1__Impl
	rule__QID__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQIDAccess().getAlternatives_1()); }
	(rule__QID__Alternatives_1)*
	{ after(grammarAccess.getQIDAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QID__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQIDAccess().getGroup_2()); }
	(rule__QID__Group_2__0)*
	{ after(grammarAccess.getQIDAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QID__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QID__Group_2__0__Impl
	rule__QID__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQIDAccess().getFullStopKeyword_2_0()); }
	'.'
	{ after(grammarAccess.getQIDAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QID__Group_2__1__Impl
	rule__QID__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQIDAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getQIDAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QID__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QID__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQIDAccess().getAlternatives_2_2()); }
	(rule__QID__Alternatives_2_2)*
	{ after(grammarAccess.getQIDAccess().getAlternatives_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Unit__UnorderedGroup_7
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getUnitAccess().getUnorderedGroup_7());
	}
:
	rule__Unit__UnorderedGroup_7__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getUnitAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}

rule__Unit__UnorderedGroup_7__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getUnitAccess().getGroup_7_0()); }
					(rule__Unit__Group_7_0__0)
					{ after(grammarAccess.getUnitAccess().getGroup_7_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getUnitAccess().getGroup_7_1()); }
					(rule__Unit__Group_7_1__0)
					{ after(grammarAccess.getUnitAccess().getGroup_7_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 2);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getUnitAccess().getGroup_7_2()); }
						(rule__Unit__Group_7_2__0)
						{ after(grammarAccess.getUnitAccess().getGroup_7_2()); }
					)
					(
						{ before(grammarAccess.getUnitAccess().getGroup_7_2()); }
						((rule__Unit__Group_7_2__0)=>rule__Unit__Group_7_2__0)*
						{ after(grammarAccess.getUnitAccess().getGroup_7_2()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 3);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getUnitAccess().getGroup_7_3()); }
						(rule__Unit__Group_7_3__0)
						{ after(grammarAccess.getUnitAccess().getGroup_7_3()); }
					)
					(
						{ before(grammarAccess.getUnitAccess().getGroup_7_3()); }
						((rule__Unit__Group_7_3__0)=>rule__Unit__Group_7_3__0)*
						{ after(grammarAccess.getUnitAccess().getGroup_7_3()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 4);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getUnitAccess().getGroup_7_4()); }
						(rule__Unit__Group_7_4__0)
						{ after(grammarAccess.getUnitAccess().getGroup_7_4()); }
					)
					(
						{ before(grammarAccess.getUnitAccess().getGroup_7_4()); }
						((rule__Unit__Group_7_4__0)=>rule__Unit__Group_7_4__0)*
						{ after(grammarAccess.getUnitAccess().getGroup_7_4()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 5)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getUnitAccess().getUnorderedGroup_7(), 5);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getUnitAccess().getFunctionsAssignment_7_5()); }
						(rule__Unit__FunctionsAssignment_7_5)
						{ after(grammarAccess.getUnitAccess().getFunctionsAssignment_7_5()); }
					)
					(
						{ before(grammarAccess.getUnitAccess().getFunctionsAssignment_7_5()); }
						((rule__Unit__FunctionsAssignment_7_5)=>rule__Unit__FunctionsAssignment_7_5)*
						{ after(grammarAccess.getUnitAccess().getFunctionsAssignment_7_5()); }
					)
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnitAccess().getUnorderedGroup_7());
	restoreStackSize(stackSize);
}

rule__Unit__UnorderedGroup_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__UnorderedGroup_7__Impl
	rule__Unit__UnorderedGroup_7__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__UnorderedGroup_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__UnorderedGroup_7__Impl
	rule__Unit__UnorderedGroup_7__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__UnorderedGroup_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__UnorderedGroup_7__Impl
	rule__Unit__UnorderedGroup_7__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__UnorderedGroup_7__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__UnorderedGroup_7__Impl
	rule__Unit__UnorderedGroup_7__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__UnorderedGroup_7__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__UnorderedGroup_7__Impl
	rule__Unit__UnorderedGroup_7__5?
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__UnorderedGroup_7__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Unit__UnorderedGroup_7__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedCapability__UnorderedGroup_2_1
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
	}
:
	rule__ProvidedCapability__UnorderedGroup_2_1__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__UnorderedGroup_2_1__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getProvidedCapabilityAccess().getGroup_2_1_0()); }
					(rule__ProvidedCapability__Group_2_1_0__0)
					{ after(grammarAccess.getProvidedCapabilityAccess().getGroup_2_1_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getProvidedCapabilityAccess().getGroup_2_1_1()); }
					(rule__ProvidedCapability__Group_2_1_1__0)
					{ after(grammarAccess.getProvidedCapabilityAccess().getGroup_2_1_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getProvidedCapabilityAccess().getGroup_2_1_2()); }
					(rule__ProvidedCapability__Group_2_1_2__0)
					{ after(grammarAccess.getProvidedCapabilityAccess().getGroup_2_1_2()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__UnorderedGroup_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__UnorderedGroup_2_1__Impl
	rule__ProvidedCapability__UnorderedGroup_2_1__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__UnorderedGroup_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__UnorderedGroup_2_1__Impl
	rule__ProvidedCapability__UnorderedGroup_2_1__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__UnorderedGroup_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedCapability__UnorderedGroup_2_1__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__AliasedRequiredCapability__UnorderedGroup_3_1
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
	}
:
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__UnorderedGroup_3_1__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_0()); }
					(rule__AliasedRequiredCapability__Group_3_1_0__0)
					{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_1()); }
					(rule__AliasedRequiredCapability__Group_3_1_1__0)
					{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_2()); }
					(rule__AliasedRequiredCapability__Group_3_1_2__0)
					{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_3()); }
					(rule__AliasedRequiredCapability__Group_3_1_3__0)
					{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_3()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_4()); }
					(rule__AliasedRequiredCapability__Group_3_1_4__0)
					{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGroup_3_1_4()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__UnorderedGroup_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__Impl
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__UnorderedGroup_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__Impl
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__UnorderedGroup_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__Impl
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__UnorderedGroup_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__Impl
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__UnorderedGroup_3_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AliasedRequiredCapability__UnorderedGroup_3_1__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredCapability__UnorderedGroup_3_1
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
	}
:
	rule__RequiredCapability__UnorderedGroup_3_1__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
	restoreStackSize(stackSize);
}

rule__RequiredCapability__UnorderedGroup_3_1__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_0()); }
					(rule__RequiredCapability__Group_3_1_0__0)
					{ after(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_1()); }
					(rule__RequiredCapability__Group_3_1_1__0)
					{ after(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_2()); }
					(rule__RequiredCapability__Group_3_1_2__0)
					{ after(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_3()); }
					(rule__RequiredCapability__Group_3_1_3__0)
					{ after(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_3()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_4()); }
					(rule__RequiredCapability__Group_3_1_4__0)
					{ after(grammarAccess.getRequiredCapabilityAccess().getGroup_3_1_4()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
	restoreStackSize(stackSize);
}

rule__RequiredCapability__UnorderedGroup_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__UnorderedGroup_3_1__Impl
	rule__RequiredCapability__UnorderedGroup_3_1__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__UnorderedGroup_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__UnorderedGroup_3_1__Impl
	rule__RequiredCapability__UnorderedGroup_3_1__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__UnorderedGroup_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__UnorderedGroup_3_1__Impl
	rule__RequiredCapability__UnorderedGroup_3_1__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__UnorderedGroup_3_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__UnorderedGroup_3_1__Impl
	rule__RequiredCapability__UnorderedGroup_3_1__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__UnorderedGroup_3_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredCapability__UnorderedGroup_3_1__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__UnitsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getUnitsUnitParserRuleCall_0_0()); }
		ruleUnit
		{ after(grammarAccess.getModelAccess().getUnitsUnitParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__FunctionsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_1_0()); }
		ruleFunction
		{ after(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__DocumentationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_1_0()); }
		RULE_DOCUMENTATION
		{ after(grammarAccess.getUnitAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getUnitAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__VersionAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getVersionIDTerminalRuleCall_4_1_0()); }
		RULE_ID
		{ after(grammarAccess.getUnitAccess().getVersionIDTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__ImplementsAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_1_0()); }
		ruleSimpleTypeRef
		{ after(grammarAccess.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__ImplementsAssignment_5_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_2_1_0()); }
		ruleSimpleTypeRef
		{ after(grammarAccess.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__SourceLocationAssignment_7_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getSourceLocationPathParserRuleCall_7_0_2_0()); }
		rulePath
		{ after(grammarAccess.getUnitAccess().getSourceLocationPathParserRuleCall_7_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__OutputLocationAssignment_7_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getOutputLocationPathParserRuleCall_7_1_2_0()); }
		rulePath
		{ after(grammarAccess.getUnitAccess().getOutputLocationPathParserRuleCall_7_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__ProvidedCapabilitiesAssignment_7_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0()); }
		ruleProvidedCapability
		{ after(grammarAccess.getUnitAccess().getProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__RequiredCapabilitiesAssignment_7_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getRequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0()); }
		ruleAliasedRequiredCapability
		{ after(grammarAccess.getUnitAccess().getRequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__MetaRequiredCapabilitiesAssignment_7_4_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getMetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0()); }
		ruleRequiredCapability
		{ after(grammarAccess.getUnitAccess().getMetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Unit__FunctionsAssignment_7_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnitAccess().getFunctionsFunctionParserRuleCall_7_5_0()); }
		ruleFunction
		{ after(grammarAccess.getUnitAccess().getFunctionsFunctionParserRuleCall_7_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__NameSpaceAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0()); }
		RULE_ID
		{ after(grammarAccess.getProvidedCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__CondExprAssignment_2_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedCapabilityAccess().getCondExprExpressionParserRuleCall_2_1_0_2_0()); }
		ruleExpression
		{ after(grammarAccess.getProvidedCapabilityAccess().getCondExprExpressionParserRuleCall_2_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__NameAssignment_2_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedCapabilityAccess().getNameIDTerminalRuleCall_2_1_1_2_0()); }
		RULE_ID
		{ after(grammarAccess.getProvidedCapabilityAccess().getNameIDTerminalRuleCall_2_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedCapability__VersionAssignment_2_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedCapabilityAccess().getVersionIDTerminalRuleCall_2_1_2_2_0()); }
		RULE_ID
		{ after(grammarAccess.getProvidedCapabilityAccess().getVersionIDTerminalRuleCall_2_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__NameSpaceAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_0_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__AliasAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getAliasIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getAliasIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__CondExprAssignment_3_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0()); }
		ruleExpression
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__GreedyAssignment_3_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
		(
			{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
			'greedy'
			{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
		)
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__MinAssignment_3_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0()); }
		RULE_INT
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__MaxAssignment_3_1_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0()); }
		RULE_INT
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AliasedRequiredCapability__VersionRangeAssignment_3_1_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAliasedRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0()); }
		RULE_ID
		{ after(grammarAccess.getAliasedRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__NameSpaceAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0()); }
		RULE_ID
		{ after(grammarAccess.getRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getRequiredCapabilityAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__CondExprAssignment_3_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0()); }
		ruleExpression
		{ after(grammarAccess.getRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__GreedyAssignment_3_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
		(
			{ before(grammarAccess.getRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
			'greedy'
			{ after(grammarAccess.getRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
		)
		{ after(grammarAccess.getRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__MinAssignment_3_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0()); }
		RULE_INT
		{ after(grammarAccess.getRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__MaxAssignment_3_1_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0()); }
		RULE_INT
		{ after(grammarAccess.getRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredCapability__VersionRangeAssignment_3_1_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0()); }
		RULE_ID
		{ after(grammarAccess.getRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__ParametersAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterListAccess().getParametersFirstParameterParserRuleCall_0_0()); }
		ruleFirstParameter
		{ after(grammarAccess.getParameterListAccess().getParametersFirstParameterParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterList__ParametersAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterListAccess().getParametersFirstParameterParserRuleCall_1_1_0()); }
		ruleFirstParameter
		{ after(grammarAccess.getParameterListAccess().getParametersFirstParameterParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__ExprAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getExprExpressionParserRuleCall_0()); }
		ruleExpression
		{ after(grammarAccess.getParameterAccess().getExprExpressionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureParameter__ExprAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureParameterAccess().getExprClosureExpressionParserRuleCall_0()); }
		ruleClosureExpression
		{ after(grammarAccess.getClosureParameterAccess().getExprClosureExpressionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDeclaration__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterDeclarationAccess().getTypeTypeRefParserRuleCall_0_0()); }
		ruleTypeRef
		{ after(grammarAccess.getParameterDeclarationAccess().getTypeTypeRefParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParameterDeclaration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__DocumentationAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); }
		RULE_DOCUMENTATION
		{ after(grammarAccess.getFunctionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__VisibilityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getVisibilityIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFunctionAccess().getVisibilityIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__FinalAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getFinalFinalKeyword_2_0()); }
		(
			{ before(grammarAccess.getFunctionAccess().getFinalFinalKeyword_2_0()); }
			'final'
			{ after(grammarAccess.getFunctionAccess().getFinalFinalKeyword_2_0()); }
		)
		{ after(grammarAccess.getFunctionAccess().getFinalFinalKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ReturnTypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getReturnTypeTypeRefParserRuleCall_4_0()); }
		ruleTypeRef
		{ after(grammarAccess.getFunctionAccess().getReturnTypeTypeRefParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__NameAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_5_0()); }
		RULE_ID
		{ after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ParametersAssignment_6_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_0_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ParametersAssignment_6_1_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__VarArgsAssignment_6_1_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0()); }
		(
			{ before(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0()); }
			'...'
			{ after(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0()); }
		)
		{ after(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ParametersAssignment_6_1_0_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__VarArgsAssignment_6_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0()); }
		(
			{ before(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0()); }
			'...'
			{ after(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0()); }
		)
		{ after(grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ParametersAssignment_6_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_1_1_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__GuardAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getGuardGuardExpressionParserRuleCall_7_1_0()); }
		ruleGuardExpression
		{ after(grammarAccess.getFunctionAccess().getGuardGuardExpressionParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__FuncExprAssignment_8_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getFuncExprExpressionParserRuleCall_8_0_1_0()); }
		ruleExpression
		{ after(grammarAccess.getFunctionAccess().getFuncExprExpressionParserRuleCall_8_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__FuncExprAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getFuncExprBlockExpressionParserRuleCall_8_1_0()); }
		ruleBlockExpression
		{ after(grammarAccess.getFunctionAccess().getFuncExprBlockExpressionParserRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__GuardExprAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuardExpressionAccess().getGuardExprExpressionParserRuleCall_0_1_0()); }
		ruleExpression
		{ after(grammarAccess.getGuardExpressionAccess().getGuardExprExpressionParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GuardExpression__GuardExprAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGuardExpressionAccess().getGuardExprBlockExpressionParserRuleCall_1_0()); }
		ruleBlockExpression
		{ after(grammarAccess.getGuardExpressionAccess().getGuardExprBlockExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__FunctionNameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentExpressionAccess().getFunctionNameAssignmentOperatorParserRuleCall_1_1_0()); }
		ruleAssignmentOperator
		{ after(grammarAccess.getAssignmentExpressionAccess().getFunctionNameAssignmentOperatorParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignmentExpression__RightExprAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentExpressionAccess().getRightExprAssignmentExpressionParserRuleCall_1_2_0()); }
		ruleAssignmentExpression
		{ after(grammarAccess.getAssignmentExpressionAccess().getRightExprAssignmentExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__FinalAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclarationAccess().getFinalFinalKeyword_1_0()); }
		(
			{ before(grammarAccess.getVarDeclarationAccess().getFinalFinalKeyword_1_0()); }
			'final'
			{ after(grammarAccess.getVarDeclarationAccess().getFinalFinalKeyword_1_0()); }
		)
		{ after(grammarAccess.getVarDeclarationAccess().getFinalFinalKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__TypeAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclarationAccess().getTypeTypeRefParserRuleCall_2_0_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getVarDeclarationAccess().getTypeTypeRefParserRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__NameAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VarDeclaration__ValueExprAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarDeclarationAccess().getValueExprExpressionParserRuleCall_3_1_0()); }
		ruleExpression
		{ after(grammarAccess.getVarDeclarationAccess().getValueExprExpressionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__FinalAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValDeclarationAccess().getFinalFinalKeyword_1_0()); }
		(
			{ before(grammarAccess.getValDeclarationAccess().getFinalFinalKeyword_1_0()); }
			'final'
			{ after(grammarAccess.getValDeclarationAccess().getFinalFinalKeyword_1_0()); }
		)
		{ after(grammarAccess.getValDeclarationAccess().getFinalFinalKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__ImmutableAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValDeclarationAccess().getImmutableValKeyword_2_0()); }
		(
			{ before(grammarAccess.getValDeclarationAccess().getImmutableValKeyword_2_0()); }
			'val'
			{ after(grammarAccess.getValDeclarationAccess().getImmutableValKeyword_2_0()); }
		)
		{ after(grammarAccess.getValDeclarationAccess().getImmutableValKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValDeclarationAccess().getTypeTypeRefParserRuleCall_3_0()); }
		ruleTypeRef
		{ after(grammarAccess.getValDeclarationAccess().getTypeTypeRefParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValDeclarationAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getValDeclarationAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValDeclaration__ValueExprAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValDeclarationAccess().getValueExprExpressionParserRuleCall_6_0()); }
		ruleExpression
		{ after(grammarAccess.getValDeclarationAccess().getValueExprExpressionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__RawTypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleTypeRefAccess().getRawTypeIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getSimpleTypeRefAccess().getRawTypeIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__ActualArgumentsListAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SimpleTypeRef__ActualArgumentsListAssignment_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__ParameterTypesAssignment_1_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_0_0()); }
		RULE_ID
		{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__ParameterTypesAssignment_1_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__VarArgsAssignment_1_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0()); }
		(
			{ before(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0()); }
			'...'
			{ after(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0()); }
		)
		{ after(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__ParameterTypesAssignment_1_0_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_2_2_0()); }
		RULE_ID
		{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__VarArgsAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_1_0_0()); }
		(
			{ before(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_1_0_0()); }
			'...'
			{ after(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_1_0_0()); }
		)
		{ after(grammarAccess.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__ParameterTypesAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureTypeRef__ReturnTypeAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureTypeRefAccess().getReturnTypeIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getClosureTypeRefAccess().getReturnTypeIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CachedExpression__ExprAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCachedExpressionAccess().getExprOrExpressionParserRuleCall_0_2_0()); }
		ruleOrExpression
		{ after(grammarAccess.getCachedExpressionAccess().getExprOrExpressionParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__RightExprAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); }
		ruleAndExpression
		{ after(grammarAccess.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__RightExprAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0()); }
		ruleRelationalExpression
		{ after(grammarAccess.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__FunctionNameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalExpressionAccess().getFunctionNameRelationalOperatorParserRuleCall_1_1_0()); }
		ruleRelationalOperator
		{ after(grammarAccess.getRelationalExpressionAccess().getFunctionNameRelationalOperatorParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RelationalExpression__RightExprAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationalExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); }
		ruleAdditiveExpression
		{ after(grammarAccess.getRelationalExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__FunctionNameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getFunctionNameAlternatives_1_1_0()); }
		(rule__AdditiveExpression__FunctionNameAlternatives_1_1_0)
		{ after(grammarAccess.getAdditiveExpressionAccess().getFunctionNameAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdditiveExpression__RightExprAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); }
		ruleMultiplicativeExpression
		{ after(grammarAccess.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__FunctionNameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameAlternatives_1_1_0()); }
		(rule__MultiplicativeExpression__FunctionNameAlternatives_1_1_0)
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getFunctionNameAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplicativeExpression__RightExprAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicativeExpressionAccess().getRightExprSetExpressionParserRuleCall_1_2_0()); }
		ruleSetExpression
		{ after(grammarAccess.getMultiplicativeExpressionAccess().getRightExprSetExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__FunctionNameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSetExpressionAccess().getFunctionNameFullStopFullStopKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getSetExpressionAccess().getFunctionNameFullStopFullStopKeyword_1_1_0()); }
			'..'
			{ after(grammarAccess.getSetExpressionAccess().getFunctionNameFullStopFullStopKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getSetExpressionAccess().getFunctionNameFullStopFullStopKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SetExpression__RightExprAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSetExpressionAccess().getRightExprUnaryOrInfixExpressionParserRuleCall_1_2_0()); }
		ruleUnaryOrInfixExpression
		{ after(grammarAccess.getSetExpressionAccess().getRightExprUnaryOrInfixExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__FunctionNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getFunctionNameAlternatives_1_0()); }
		(rule__UnaryExpression__FunctionNameAlternatives_1_0)
		{ after(grammarAccess.getUnaryExpressionAccess().getFunctionNameAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnaryExpression__ExprAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnaryExpressionAccess().getExprInfixExpressionParserRuleCall_2_0()); }
		ruleInfixExpression
		{ after(grammarAccess.getUnaryExpressionAccess().getExprInfixExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__FunctionNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPreopExpressionAccess().getFunctionNameAlternatives_1_0()); }
		(rule__PreopExpression__FunctionNameAlternatives_1_0)
		{ after(grammarAccess.getPreopExpressionAccess().getFunctionNameAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreopExpression__ExprAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPreopExpressionAccess().getExprInfixExpressionParserRuleCall_2_0()); }
		ruleInfixExpression
		{ after(grammarAccess.getPreopExpressionAccess().getExprInfixExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PostopExpression__FunctionNameAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPostopExpressionAccess().getFunctionNameAlternatives_1_1_0()); }
		(rule__PostopExpression__FunctionNameAlternatives_1_1_0)
		{ after(grammarAccess.getPostopExpressionAccess().getFunctionNameAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__NameAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfixExpressionAccess().getNameIDTerminalRuleCall_1_0_2_0()); }
		RULE_ID
		{ after(grammarAccess.getInfixExpressionAccess().getNameIDTerminalRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__ParameterListAssignment_1_0_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfixExpressionAccess().getParameterListParameterListParserRuleCall_1_0_4_0()); }
		ruleParameterList
		{ after(grammarAccess.getInfixExpressionAccess().getParameterListParameterListParserRuleCall_1_0_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__IndexExprAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfixExpressionAccess().getIndexExprExpressionParserRuleCall_1_1_2_0()); }
		ruleExpression
		{ after(grammarAccess.getInfixExpressionAccess().getIndexExprExpressionParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InfixExpression__FeatureNameAssignment_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInfixExpressionAccess().getFeatureNameIDTerminalRuleCall_1_2_2_0()); }
		RULE_ID
		{ after(grammarAccess.getInfixExpressionAccess().getFeatureNameIDTerminalRuleCall_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CallExpression__ParameterListAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCallExpressionAccess().getParameterListParameterListParserRuleCall_1_2_0()); }
		ruleParameterList
		{ after(grammarAccess.getCallExpressionAccess().getParameterListParameterListParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__ReferencedAdviceAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_0_0()); }
		RULE_ID
		{ after(grammarAccess.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__ReferencedAdviceAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_1_1_0()); }
		RULE_ID
		{ after(grammarAccess.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__FuncExprAssignment_2_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithExpressionAccess().getFuncExprExpressionParserRuleCall_2_0_1_0()); }
		ruleExpression
		{ after(grammarAccess.getWithExpressionAccess().getFuncExprExpressionParserRuleCall_2_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithExpression__FuncExprAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithExpressionAccess().getFuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0()); }
		ruleBlockExpressionWithoutBrackets
		{ after(grammarAccess.getWithExpressionAccess().getFuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__ExprAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithContextExpressionAccess().getExprExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getWithContextExpressionAccess().getExprExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__AliasAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithContextExpressionAccess().getAliasIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getWithContextExpressionAccess().getAliasIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WithContextExpression__ContextBlockAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWithContextExpressionAccess().getContextBlockBlockExpressionParserRuleCall_4_0()); }
		ruleBlockExpression
		{ after(grammarAccess.getWithContextExpressionAccess().getContextBlockBlockExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpression__ExpressionsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockExpressionAccess().getExpressionsTopLevelExpressionParserRuleCall_2_0_0()); }
		ruleTopLevelExpression
		{ after(grammarAccess.getBlockExpressionAccess().getExpressionsTopLevelExpressionParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getValueAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KeywordVariables__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKeywordVariablesAccess().getNameAlternatives_1_0()); }
		(rule__KeywordVariables__NameAlternatives_1_0)
		{ after(grammarAccess.getKeywordVariablesAccess().getNameAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationCallAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getOperationCallAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OperationCall__ParameterListAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperationCallAccess().getParameterListParameterListParserRuleCall_3_0()); }
		ruleParameterList
		{ after(grammarAccess.getOperationCallAccess().getParameterListParameterListParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__TypeExprAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstructorCallExpressionAccess().getTypeExprIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getConstructorCallExpressionAccess().getTypeExprIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__ParameterListAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstructorCallExpressionAccess().getParameterListParameterListParserRuleCall_3_1_0()); }
		ruleParameterList
		{ after(grammarAccess.getConstructorCallExpressionAccess().getParameterListParameterListParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__AliasAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstructorCallExpressionAccess().getAliasIDTerminalRuleCall_4_1_0()); }
		RULE_ID
		{ after(grammarAccess.getConstructorCallExpressionAccess().getAliasIDTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConstructorCallExpression__ContextBlockAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstructorCallExpressionAccess().getContextBlockInitializationBlockExpressionParserRuleCall_5_0()); }
		ruleInitializationBlockExpression
		{ after(grammarAccess.getConstructorCallExpressionAccess().getContextBlockInitializationBlockExpressionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationBlockExpression__ExpressionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializationBlockExpressionAccess().getExpressionsInitializationExpressionParserRuleCall_2_0()); }
		ruleInitializationExpression
		{ after(grammarAccess.getInitializationBlockExpressionAccess().getExpressionsInitializationExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__LeftExprAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializationExpressionAccess().getLeftExprFeatureOfThisParserRuleCall_1_0()); }
		ruleFeatureOfThis
		{ after(grammarAccess.getInitializationExpressionAccess().getLeftExprFeatureOfThisParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__FunctionNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializationExpressionAccess().getFunctionNameColonKeyword_2_0()); }
		(
			{ before(grammarAccess.getInitializationExpressionAccess().getFunctionNameColonKeyword_2_0()); }
			':'
			{ after(grammarAccess.getInitializationExpressionAccess().getFunctionNameColonKeyword_2_0()); }
		)
		{ after(grammarAccess.getInitializationExpressionAccess().getFunctionNameColonKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InitializationExpression__RightExprAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitializationExpressionAccess().getRightExprExpressionParserRuleCall_3_0()); }
		ruleExpression
		{ after(grammarAccess.getInitializationExpressionAccess().getRightExprExpressionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FeatureOfThis__FeatureNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureOfThisAccess().getFeatureNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFeatureOfThisAccess().getFeatureNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__ReturnTypeAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getReturnTypeTypeRefParserRuleCall_1_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getClosureExpressionAccess().getReturnTypeTypeRefParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__ParametersAssignment_2_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_0_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__ParametersAssignment_2_0_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__VarArgsAssignment_2_0_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0()); }
		(
			{ before(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0()); }
			'...'
			{ after(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0()); }
		)
		{ after(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__ParametersAssignment_2_0_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__VarArgsAssignment_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_1_0_0()); }
		(
			{ before(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_1_0_0()); }
			'...'
			{ after(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_1_0_0()); }
		)
		{ after(grammarAccess.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__ParametersAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_1_1_0()); }
		ruleParameterDeclaration
		{ after(grammarAccess.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClosureExpression__FuncExprAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClosureExpressionAccess().getFuncExprOneOrManyExpressionsParserRuleCall_4_0()); }
		ruleOneOrManyExpressions
		{ after(grammarAccess.getClosureExpressionAccess().getFuncExprOneOrManyExpressionsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlockExpressionWithoutBrackets__ExpressionsAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockExpressionWithoutBracketsAccess().getExpressionsTopLevelExpressionParserRuleCall_1_0_0()); }
		ruleTopLevelExpression
		{ after(grammarAccess.getBlockExpressionWithoutBracketsAccess().getExpressionsTopLevelExpressionParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValueLiteral__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueLiteralAccess().getValueSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getValueLiteralAccess().getValueSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
