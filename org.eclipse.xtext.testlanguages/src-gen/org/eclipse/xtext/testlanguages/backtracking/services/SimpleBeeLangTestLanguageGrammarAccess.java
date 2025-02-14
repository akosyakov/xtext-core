/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.backtracking.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpleBeeLangTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DelegateModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.backtracking.SimpleBeeLangTestLanguage.DelegateModel");
		private final RuleCall cModelParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DelegateModel returns Model:
		//    Model
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Model
		public RuleCall getModelParserRuleCall() { return cModelParserRuleCall; }
	}
	
	
	private final DelegateModelElements pDelegateModel;
	
	private final Grammar grammar;
	
	private final BeeLangTestLanguageGrammarAccess gaBeeLangTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleBeeLangTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			BeeLangTestLanguageGrammarAccess gaBeeLangTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaBeeLangTestLanguage = gaBeeLangTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pDelegateModel = new DelegateModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.backtracking.SimpleBeeLangTestLanguage".equals(grammar.getName())) {
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
	
	
	public BeeLangTestLanguageGrammarAccess getBeeLangTestLanguageGrammarAccess() {
		return gaBeeLangTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DelegateModel returns Model:
	//    Model
	//;
	public DelegateModelElements getDelegateModelAccess() {
		return pDelegateModel;
	}
	
	public ParserRule getDelegateModelRule() {
		return getDelegateModelAccess().getRule();
	}
	
	//// Initially copied from BeeLang.xtext rev 1029
	//Model:
	//      (units += Unit)*
	//    | (functions += Function)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.ModelElements getModelAccess() {
		return gaBeeLangTestLanguage.getModelAccess();
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Unit : {Unit}
	//    (documentation = DOCUMENTATION)?
	//    'unit' (name=ID)? ('version' version = ID)?
	//        ('implements' implements += SimpleTypeRef (',' implements+=SimpleTypeRef)*)?
	//    '{'
	//        ( ('source' ':' sourceLocation = Path ';')?
	//        & ('output' ':' outputLocation = Path ';')?
	//        & ('provides' ':' (providedCapabilities += ProvidedCapability) ';')*
	//        & ('requires' ':' (requiredCapabilities += AliasedRequiredCapability) ';')*
	//        & ('requires' 'env' ':' (metaRequiredCapabilities += RequiredCapability) ';')*
	//        & (functions += Function )*
	//        )
	//    '}';
	public BeeLangTestLanguageGrammarAccess.UnitElements getUnitAccess() {
		return gaBeeLangTestLanguage.getUnitAccess();
	}
	
	public ParserRule getUnitRule() {
		return getUnitAccess().getRule();
	}
	
	//ProvidedCapability: {ProvidedCapability}
	//    ((nameSpace=ID) | "unit")
	//    ('{'
	//         (
	//           ('when' ':' condExpr = Expression ';')?
	//        & ("name" ':' name = ID ';')
	//        & ("version" ':' version = ID ';')?
	//        )
	//    '}')?
	//;
	public BeeLangTestLanguageGrammarAccess.ProvidedCapabilityElements getProvidedCapabilityAccess() {
		return gaBeeLangTestLanguage.getProvidedCapabilityAccess();
	}
	
	public ParserRule getProvidedCapabilityRule() {
		return getProvidedCapabilityAccess().getRule();
	}
	
	//AliasedRequiredCapability:
	//    ((nameSpace=ID) | "unit") name=ID ("as" alias = ID)?
	//    ('{'
	//        ( ('when' ':' condExpr=Expression ';')?
	//        & (greedy ?= "greedy" ';')?
	//        & ("requires-min" ':' min = INT ';' )?
	//        & ("requires-max" ':' max  = INT ';')?
	//        & ("version" ':' versionRange = ID ';')?
	//          )
	//    '}')
	//    ;
	public BeeLangTestLanguageGrammarAccess.AliasedRequiredCapabilityElements getAliasedRequiredCapabilityAccess() {
		return gaBeeLangTestLanguage.getAliasedRequiredCapabilityAccess();
	}
	
	public ParserRule getAliasedRequiredCapabilityRule() {
		return getAliasedRequiredCapabilityAccess().getRule();
	}
	
	//RequiredCapability returns RequiredCapability : {RequiredCapability}
	//    ((nameSpace=ID) | "unit") name=ID
	//    ('{'
	//        ( ('when' ':' condExpr=Expression ';')?
	//        & (greedy ?= "greedy" ';')?
	//        & ("requires-min" ':' min = INT ';' )?
	//        & ("requires-max" ':' max  = INT ';')?
	//        & ("version" ':' versionRange = ID ';')?
	//          )
	//    '}')
	//    ;
	public BeeLangTestLanguageGrammarAccess.RequiredCapabilityElements getRequiredCapabilityAccess() {
		return gaBeeLangTestLanguage.getRequiredCapabilityAccess();
	}
	
	public ParserRule getRequiredCapabilityRule() {
		return getRequiredCapabilityAccess().getRule();
	}
	
	//Path hidden()
	//    : STRING
	//    | ('/')? QID ('/' QID)* ('/')?
	//    ;
	public BeeLangTestLanguageGrammarAccess.PathElements getPathAccess() {
		return gaBeeLangTestLanguage.getPathAccess();
	}
	
	public ParserRule getPathRule() {
		return getPathAccess().getRule();
	}
	
	//ParameterList :
	//    parameters += FirstParameter ("," parameters += FirstParameter)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.ParameterListElements getParameterListAccess() {
		return gaBeeLangTestLanguage.getParameterListAccess();
	}
	
	public ParserRule getParameterListRule() {
		return getParameterListAccess().getRule();
	}
	
	//FirstParameter returns Parameter
	//    : ClosureParameter
	//    | Parameter
	//    ;
	public BeeLangTestLanguageGrammarAccess.FirstParameterElements getFirstParameterAccess() {
		return gaBeeLangTestLanguage.getFirstParameterAccess();
	}
	
	public ParserRule getFirstParameterRule() {
		return getFirstParameterAccess().getRule();
	}
	
	//Parameter :
	//    expr = Expression
	//    ;
	public BeeLangTestLanguageGrammarAccess.ParameterElements getParameterAccess() {
		return gaBeeLangTestLanguage.getParameterAccess();
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//ClosureParameter :
	//    (expr = ClosureExpression)
	//    ;
	public BeeLangTestLanguageGrammarAccess.ClosureParameterElements getClosureParameterAccess() {
		return gaBeeLangTestLanguage.getClosureParameterAccess();
	}
	
	public ParserRule getClosureParameterRule() {
		return getClosureParameterAccess().getRule();
	}
	
	//ParameterDeclaration :
	//    ((type=TypeRef)? name = ID)
	//    ;
	public BeeLangTestLanguageGrammarAccess.ParameterDeclarationElements getParameterDeclarationAccess() {
		return gaBeeLangTestLanguage.getParameterDeclarationAccess();
	}
	
	public ParserRule getParameterDeclarationRule() {
		return getParameterDeclarationAccess().getRule();
	}
	
	//Function :
	//    (documentation = DOCUMENTATION)?
	//       (visibility = ID)?
	//       (final ?= "final")?
	//       "function"
	//       (returnType = TypeRef)?
	//       name=ID
	//       ('(' (
	//           (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)* (',' varArgs?="..." parameters += ParameterDeclaration)?)
	//           | (varArgs ?= "..." parameters += ParameterDeclaration)
	//           )? ')' )?
	//       ("when" guard = GuardExpression)?
	//       ((':' funcExpr=Expression ';') | (funcExpr=BlockExpression))
	//    ;
	public BeeLangTestLanguageGrammarAccess.FunctionElements getFunctionAccess() {
		return gaBeeLangTestLanguage.getFunctionAccess();
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}
	
	//GuardExpression:
	//    (':' guardExpr = Expression ';') | (guardExpr = BlockExpression)
	//    ;
	public BeeLangTestLanguageGrammarAccess.GuardExpressionElements getGuardExpressionAccess() {
		return gaBeeLangTestLanguage.getGuardExpressionAccess();
	}
	
	public ParserRule getGuardExpressionRule() {
		return getGuardExpressionAccess().getRule();
	}
	
	//AssignmentOperator
	//    : '=' | '+=' | '-=' | '*='    | '/=' | "%="
	//    ;
	public BeeLangTestLanguageGrammarAccess.AssignmentOperatorElements getAssignmentOperatorAccess() {
		return gaBeeLangTestLanguage.getAssignmentOperatorAccess();
	}
	
	public ParserRule getAssignmentOperatorRule() {
		return getAssignmentOperatorAccess().getRule();
	}
	
	//RelationalOperator
	//    : "~=" | "==" | "===" | "!=" | "!=="
	//    | ">=" | "<=" | ">" | "<"
	//    ;
	public BeeLangTestLanguageGrammarAccess.RelationalOperatorElements getRelationalOperatorAccess() {
		return gaBeeLangTestLanguage.getRelationalOperatorAccess();
	}
	
	public ParserRule getRelationalOperatorRule() {
		return getRelationalOperatorAccess().getRule();
	}
	
	//TopLevelExpression returns Expression
	//    : VarDeclaration
	//    | ValDeclaration
	//    | AssignmentExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.TopLevelExpressionElements getTopLevelExpressionAccess() {
		return gaBeeLangTestLanguage.getTopLevelExpressionAccess();
	}
	
	public ParserRule getTopLevelExpressionRule() {
		return getTopLevelExpressionAccess().getRule();
	}
	
	//Expression returns Expression
	//    : AssignmentExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.ExpressionElements getExpressionAccess() {
		return gaBeeLangTestLanguage.getExpressionAccess();
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//AssignmentExpression returns Expression :
	//      CachedExpression ({AssignmentExpression.leftExpr=current}
	//         functionName=AssignmentOperator rightExpr=AssignmentExpression)?
	//    ;
	public BeeLangTestLanguageGrammarAccess.AssignmentExpressionElements getAssignmentExpressionAccess() {
		return gaBeeLangTestLanguage.getAssignmentExpressionAccess();
	}
	
	public ParserRule getAssignmentExpressionRule() {
		return getAssignmentExpressionAccess().getRule();
	}
	
	//VarDeclaration returns Expression : {DefValue}
	//    (final ?= "final")?
	//    (( "var" |  type=TypeRef ) name=ID)
	//    ('=' valueExpr = Expression)?
	//    ;
	public BeeLangTestLanguageGrammarAccess.VarDeclarationElements getVarDeclarationAccess() {
		return gaBeeLangTestLanguage.getVarDeclarationAccess();
	}
	
	public ParserRule getVarDeclarationRule() {
		return getVarDeclarationAccess().getRule();
	}
	
	//ValDeclaration returns Expression : {DefValue}
	//    (final ?= "final")?
	//    immutable ?= "val" (type=TypeRef)? name=ID
	//    '=' valueExpr = Expression
	//    ;
	public BeeLangTestLanguageGrammarAccess.ValDeclarationElements getValDeclarationAccess() {
		return gaBeeLangTestLanguage.getValDeclarationAccess();
	}
	
	public ParserRule getValDeclarationRule() {
		return getValDeclarationAccess().getRule();
	}
	
	//TypeRef
	//    : ClosureTypeRef
	//    | SimpleTypeRef
	//    ;
	public BeeLangTestLanguageGrammarAccess.TypeRefElements getTypeRefAccess() {
		return gaBeeLangTestLanguage.getTypeRefAccess();
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}
	
	//SimpleTypeRef :
	//    rawType=ID
	//        ('<' actualArgumentsList+=ID (',' actualArgumentsList+=ID)* '>' )?
	//    ;
	public BeeLangTestLanguageGrammarAccess.SimpleTypeRefElements getSimpleTypeRefAccess() {
		return gaBeeLangTestLanguage.getSimpleTypeRefAccess();
	}
	
	public ParserRule getSimpleTypeRefRule() {
		return getSimpleTypeRefAccess().getRule();
	}
	
	//ClosureTypeRef :
	//    ('('(
	//        (parameterTypes += ID (',' parameterTypes += ID)*
	//            (',' varArgs ?= "..." parameterTypes += ID )?)
	//        |     (    varArgs ?= "..." parameterTypes += ID)
	//        )?
	//    ')' '=>' returnType = ID )
	//    ;
	public BeeLangTestLanguageGrammarAccess.ClosureTypeRefElements getClosureTypeRefAccess() {
		return gaBeeLangTestLanguage.getClosureTypeRefAccess();
	}
	
	public ParserRule getClosureTypeRefRule() {
		return getClosureTypeRefAccess().getRule();
	}
	
	//CachedExpression returns Expression  :
	//    ({CachedExpression} "cached" expr = OrExpression)
	//    | OrExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.CachedExpressionElements getCachedExpressionAccess() {
		return gaBeeLangTestLanguage.getCachedExpressionAccess();
	}
	
	public ParserRule getCachedExpressionRule() {
		return getCachedExpressionAccess().getRule();
	}
	
	//OrExpression returns Expression :
	//    AndExpression ({OrExpression.leftExpr=current} "||" rightExpr=AndExpression)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.OrExpressionElements getOrExpressionAccess() {
		return gaBeeLangTestLanguage.getOrExpressionAccess();
	}
	
	public ParserRule getOrExpressionRule() {
		return getOrExpressionAccess().getRule();
	}
	
	//AndExpression returns Expression :
	//    RelationalExpression ({AndExpression.leftExpr=current} "&&" rightExpr=RelationalExpression)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.AndExpressionElements getAndExpressionAccess() {
		return gaBeeLangTestLanguage.getAndExpressionAccess();
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}
	
	//RelationalExpression returns Expression :
	//    AdditiveExpression ({BinaryOpExpression.leftExpr=current}
	//        functionName=RelationalOperator rightExpr=AdditiveExpression)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.RelationalExpressionElements getRelationalExpressionAccess() {
		return gaBeeLangTestLanguage.getRelationalExpressionAccess();
	}
	
	public ParserRule getRelationalExpressionRule() {
		return getRelationalExpressionAccess().getRule();
	}
	
	//AdditiveExpression returns Expression :
	//    MultiplicativeExpression ({BinaryOpExpression.leftExpr=current} functionName=("+" | "-") rightExpr=MultiplicativeExpression)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.AdditiveExpressionElements getAdditiveExpressionAccess() {
		return gaBeeLangTestLanguage.getAdditiveExpressionAccess();
	}
	
	public ParserRule getAdditiveExpressionRule() {
		return getAdditiveExpressionAccess().getRule();
	}
	
	//MultiplicativeExpression returns Expression :
	//    SetExpression ({BinaryOpExpression.leftExpr=current} functionName=("*" | "/" | "%") rightExpr=SetExpression)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.MultiplicativeExpressionElements getMultiplicativeExpressionAccess() {
		return gaBeeLangTestLanguage.getMultiplicativeExpressionAccess();
	}
	
	public ParserRule getMultiplicativeExpressionRule() {
		return getMultiplicativeExpressionAccess().getRule();
	}
	
	//SetExpression returns Expression:
	//    UnaryOrInfixExpression ({BinaryOpExpression.leftExpr=current} functionName=".." rightExpr=UnaryOrInfixExpression)*
	//    ;
	public BeeLangTestLanguageGrammarAccess.SetExpressionElements getSetExpressionAccess() {
		return gaBeeLangTestLanguage.getSetExpressionAccess();
	}
	
	public ParserRule getSetExpressionRule() {
		return getSetExpressionAccess().getRule();
	}
	
	//UnaryOrInfixExpression returns Expression
	//    : PostopExpression
	//    | UnaryExpression
	//    | PreopExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.UnaryOrInfixExpressionElements getUnaryOrInfixExpressionAccess() {
		return gaBeeLangTestLanguage.getUnaryOrInfixExpressionAccess();
	}
	
	public ParserRule getUnaryOrInfixExpressionRule() {
		return getUnaryOrInfixExpressionAccess().getRule();
	}
	
	//UnaryExpression returns Expression : {UnaryOpExpression}
	//    functionName=("!" | "-") expr=InfixExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.UnaryExpressionElements getUnaryExpressionAccess() {
		return gaBeeLangTestLanguage.getUnaryExpressionAccess();
	}
	
	public ParserRule getUnaryExpressionRule() {
		return getUnaryExpressionAccess().getRule();
	}
	
	//PreopExpression returns Expression : {UnaryPreOpExpression}
	//    functionName=("++" | "--") expr=InfixExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.PreopExpressionElements getPreopExpressionAccess() {
		return gaBeeLangTestLanguage.getPreopExpressionAccess();
	}
	
	public ParserRule getPreopExpressionRule() {
		return getPreopExpressionAccess().getRule();
	}
	
	//PostopExpression returns Expression :
	//    InfixExpression ({UnaryPostOpExpression.expr=current} functionName = ("--" | "++"))?
	//    ;
	public BeeLangTestLanguageGrammarAccess.PostopExpressionElements getPostopExpressionAccess() {
		return gaBeeLangTestLanguage.getPostopExpressionAccess();
	}
	
	public ParserRule getPostopExpressionRule() {
		return getPostopExpressionAccess().getRule();
	}
	
	//InfixExpression returns Expression :
	//    CallExpression (
	//          ({CallFeature.funcExpr=current} "." name=ID  "(" (parameterList = ParameterList)? ")")
	//      |    ({AtExpression.objExpr=current} '[' indexExpr=Expression ']' )
	//      | ({FeatureExpression.objExpr=current} "." featureName=ID)
	//    )*;
	public BeeLangTestLanguageGrammarAccess.InfixExpressionElements getInfixExpressionAccess() {
		return gaBeeLangTestLanguage.getInfixExpressionAccess();
	}
	
	public ParserRule getInfixExpressionRule() {
		return getInfixExpressionAccess().getRule();
	}
	
	//CallExpression returns Expression :
	//    PrimaryExpression ({CallFunction.funcExpr=current}"(" (parameterList = ParameterList)? ")")*
	//    ;
	public BeeLangTestLanguageGrammarAccess.CallExpressionElements getCallExpressionAccess() {
		return gaBeeLangTestLanguage.getCallExpressionAccess();
	}
	
	public ParserRule getCallExpressionRule() {
		return getCallExpressionAccess().getRule();
	}
	
	//PrimaryExpression returns Expression
	//    : FeatureCall
	//    | ConstructorCallExpression
	//    | Value
	//    | Literal
	//    | KeywordVariables
	//    | ParanthesizedExpression
	//    | BlockExpression
	//    | WithExpression
	//    | WithContextExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.PrimaryExpressionElements getPrimaryExpressionAccess() {
		return gaBeeLangTestLanguage.getPrimaryExpressionAccess();
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}
	
	//WithExpression returns WithExpression :
	//        'with'
	//        ( referencedAdvice += ID (',' referencedAdvice += ID)* )?
	//        ( (':' funcExpr = Expression ) | ('{' funcExpr = BlockExpressionWithoutBrackets '}' ) )
	//        ;
	public BeeLangTestLanguageGrammarAccess.WithExpressionElements getWithExpressionAccess() {
		return gaBeeLangTestLanguage.getWithExpressionAccess();
	}
	
	public ParserRule getWithExpressionRule() {
		return getWithExpressionAccess().getRule();
	}
	
	//WithContextExpression returns WithContextExpression :
	//    "with" "context" expr = Expression ("as" alias = ID )? contextBlock = BlockExpression
	//    ;
	public BeeLangTestLanguageGrammarAccess.WithContextExpressionElements getWithContextExpressionAccess() {
		return gaBeeLangTestLanguage.getWithContextExpressionAccess();
	}
	
	public ParserRule getWithContextExpressionRule() {
		return getWithContextExpressionAccess().getRule();
	}
	
	//BlockExpression returns Expression: {ChainedExpression}
	//    '{' (expressions += TopLevelExpression ';')* '}'
	//    ;
	public BeeLangTestLanguageGrammarAccess.BlockExpressionElements getBlockExpressionAccess() {
		return gaBeeLangTestLanguage.getBlockExpressionAccess();
	}
	
	public ParserRule getBlockExpressionRule() {
		return getBlockExpressionAccess().getRule();
	}
	
	//Value returns  Expression : {VariableExpression}
	//    name = ID
	//    ;
	public BeeLangTestLanguageGrammarAccess.ValueElements getValueAccess() {
		return gaBeeLangTestLanguage.getValueAccess();
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//KeywordVariables returns  Expression : {VariableExpression}
	//    name = ("input" | "output" | "source" | "properties" | "builder" | "unit" | "this"    )
	//    ;
	public BeeLangTestLanguageGrammarAccess.KeywordVariablesElements getKeywordVariablesAccess() {
		return gaBeeLangTestLanguage.getKeywordVariablesAccess();
	}
	
	public ParserRule getKeywordVariablesRule() {
		return getKeywordVariablesAccess().getRule();
	}
	
	//FeatureCall returns Expression :
	//    OperationCall
	//// Removed (see BeeLang rev 1333)
	////    | ({CallFeature} "." name=ID  "(" (parameterList = ParameterList)? ")")
	////    | ({FeatureExpression} "." featureName=ID)
	//    ;
	public BeeLangTestLanguageGrammarAccess.FeatureCallElements getFeatureCallAccess() {
		return gaBeeLangTestLanguage.getFeatureCallAccess();
	}
	
	public ParserRule getFeatureCallRule() {
		return getFeatureCallAccess().getRule();
	}
	
	//OperationCall returns CallExpression : {CallNamedFunction}
	//    name=ID
	//    '(' (parameterList = ParameterList)? ')'
	//    ;
	public BeeLangTestLanguageGrammarAccess.OperationCallElements getOperationCallAccess() {
		return gaBeeLangTestLanguage.getOperationCallAccess();
	}
	
	public ParserRule getOperationCallRule() {
		return getOperationCallAccess().getRule();
	}
	
	//ConstructorCallExpression returns Expression : {CreateExpression}
	//    "new" typeExpr=ID
	//    ('(' (parameterList=ParameterList)? ')')?
	//    ("as" alias=ID)?
	//    (contextBlock = InitializationBlockExpression)?
	//    ;
	public BeeLangTestLanguageGrammarAccess.ConstructorCallExpressionElements getConstructorCallExpressionAccess() {
		return gaBeeLangTestLanguage.getConstructorCallExpressionAccess();
	}
	
	public ParserRule getConstructorCallExpressionRule() {
		return getConstructorCallExpressionAccess().getRule();
	}
	
	//InitializationBlockExpression returns Expression : {ChainedExpression}
	//    '{'  expressions += InitializationExpression ';' '}'
	//    ;
	public BeeLangTestLanguageGrammarAccess.InitializationBlockExpressionElements getInitializationBlockExpressionAccess() {
		return gaBeeLangTestLanguage.getInitializationBlockExpressionAccess();
	}
	
	public ParserRule getInitializationBlockExpressionRule() {
		return getInitializationBlockExpressionAccess().getRule();
	}
	
	//InitializationExpression returns Expression : {AssignmentExpression}
	//    leftExpr = FeatureOfThis functionName=":" rightExpr = Expression
	//    ;
	public BeeLangTestLanguageGrammarAccess.InitializationExpressionElements getInitializationExpressionAccess() {
		return gaBeeLangTestLanguage.getInitializationExpressionAccess();
	}
	
	public ParserRule getInitializationExpressionRule() {
		return getInitializationExpressionAccess().getRule();
	}
	
	//FeatureOfThis returns Expression : {FeatureExpression}
	//    featureName = ID
	//    ;
	public BeeLangTestLanguageGrammarAccess.FeatureOfThisElements getFeatureOfThisAccess() {
		return gaBeeLangTestLanguage.getFeatureOfThisAccess();
	}
	
	public ParserRule getFeatureOfThisRule() {
		return getFeatureOfThisAccess().getRule();
	}
	
	//Literal returns Expression
	//    : ValueLiteral
	//    | LiteralFunction
	//    ;
	public BeeLangTestLanguageGrammarAccess.LiteralElements getLiteralAccess() {
		return gaBeeLangTestLanguage.getLiteralAccess();
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	//LiteralFunction returns Expression :
	//    '{' ClosureExpression '}'
	//    ;
	public BeeLangTestLanguageGrammarAccess.LiteralFunctionElements getLiteralFunctionAccess() {
		return gaBeeLangTestLanguage.getLiteralFunctionAccess();
	}
	
	public ParserRule getLiteralFunctionRule() {
		return getLiteralFunctionAccess().getRule();
	}
	
	//ClosureExpression returns Expression: {Function}
	//    ('<' returnType=TypeRef '>')?
	//    ( '|'?
	//    (parameters += ParameterDeclaration (',' parameters += ParameterDeclaration)*
	//        (',' varArgs?="..." parameters += ParameterDeclaration)?)
	//    |     (    varArgs?="..." parameters += ParameterDeclaration)
	//    )?
	//    '|' funcExpr=OneOrManyExpressions
	//    ;
	public BeeLangTestLanguageGrammarAccess.ClosureExpressionElements getClosureExpressionAccess() {
		return gaBeeLangTestLanguage.getClosureExpressionAccess();
	}
	
	public ParserRule getClosureExpressionRule() {
		return getClosureExpressionAccess().getRule();
	}
	
	//OneOrManyExpressions returns Expression
	//    : BlockExpressionWithoutBrackets
	//    | Expression
	//    ;
	public BeeLangTestLanguageGrammarAccess.OneOrManyExpressionsElements getOneOrManyExpressionsAccess() {
		return gaBeeLangTestLanguage.getOneOrManyExpressionsAccess();
	}
	
	public ParserRule getOneOrManyExpressionsRule() {
		return getOneOrManyExpressionsAccess().getRule();
	}
	
	//BlockExpressionWithoutBrackets returns Expression : {ChainedExpression}
	//    (expressions += TopLevelExpression ';')+
	//    ;
	public BeeLangTestLanguageGrammarAccess.BlockExpressionWithoutBracketsElements getBlockExpressionWithoutBracketsAccess() {
		return gaBeeLangTestLanguage.getBlockExpressionWithoutBracketsAccess();
	}
	
	public ParserRule getBlockExpressionWithoutBracketsRule() {
		return getBlockExpressionWithoutBracketsAccess().getRule();
	}
	
	//ValueLiteral:
	//    value = STRING
	//    ;
	public BeeLangTestLanguageGrammarAccess.ValueLiteralElements getValueLiteralAccess() {
		return gaBeeLangTestLanguage.getValueLiteralAccess();
	}
	
	public ParserRule getValueLiteralRule() {
		return getValueLiteralAccess().getRule();
	}
	
	//ParanthesizedExpression returns Expression :
	//    '(' Expression ')'
	//    ;
	public BeeLangTestLanguageGrammarAccess.ParanthesizedExpressionElements getParanthesizedExpressionAccess() {
		return gaBeeLangTestLanguage.getParanthesizedExpressionAccess();
	}
	
	public ParserRule getParanthesizedExpressionRule() {
		return getParanthesizedExpressionAccess().getRule();
	}
	
	//// Qualified name
	//QID hidden(): ID (INT|HEX|ID)* ('.' ID (INT|HEX|ID)*)* ;
	public BeeLangTestLanguageGrammarAccess.QIDElements getQIDAccess() {
		return gaBeeLangTestLanguage.getQIDAccess();
	}
	
	public ParserRule getQIDRule() {
		return getQIDAccess().getRule();
	}
	
	//terminal DOCUMENTATION : '/**' -> '*/' ;
	public TerminalRule getDOCUMENTATIONRule() {
		return gaBeeLangTestLanguage.getDOCUMENTATIONRule();
	}
	
	//terminal HEX : '0' ('x'|'X')(('0'..'9')|('a'..'f')|('A'..'F'))+ ;
	public TerminalRule getHEXRule() {
		return gaBeeLangTestLanguage.getHEXRule();
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
