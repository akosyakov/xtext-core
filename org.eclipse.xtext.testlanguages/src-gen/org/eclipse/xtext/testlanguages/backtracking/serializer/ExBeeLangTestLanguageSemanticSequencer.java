/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.backtracking.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AliasedRequiredCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AndExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AssignmentExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.AtExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BinaryOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CachedExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFeature;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallFunction;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CallNamedFunction;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ChainedExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureParameter;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ClosureTypeRef;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.CreateExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.DefValue;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.FeatureExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Function;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.GuardExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Model;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.OrExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterDeclaration;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ParameterList;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ProvidedCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.RequiredCapability;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPostOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.UnaryPreOpExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Unit;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.ValueLiteral;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.VariableExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithContextExpression;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.WithExpression;
import org.eclipse.xtext.testlanguages.backtracking.services.ExBeeLangTestLanguageGrammarAccess;

@SuppressWarnings("all")
public class ExBeeLangTestLanguageSemanticSequencer extends BeeLangTestLanguageSemanticSequencer {

	@Inject
	private ExBeeLangTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BeeLangTestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BeeLangTestLanguagePackage.ALIASED_REQUIRED_CAPABILITY:
				sequence_AliasedRequiredCapability(context, (AliasedRequiredCapability) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION:
				if (rule == grammarAccess.getTopLevelExpressionRule()
						|| rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getAssignmentExpressionRule()
						|| action == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getCachedExpressionRule()
						|| rule == grammarAccess.getOrExpressionRule()
						|| action == grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAndExpressionRule()
						|| action == grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getRelationalExpressionRule()
						|| action == grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAdditiveExpressionRule()
						|| action == grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getMultiplicativeExpressionRule()
						|| action == grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getSetExpressionRule()
						|| action == grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getUnaryOrInfixExpressionRule()
						|| rule == grammarAccess.getPostopExpressionRule()
						|| action == grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0()
						|| rule == grammarAccess.getInfixExpressionRule()
						|| action == grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0()
						|| action == grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0()
						|| action == grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0()
						|| rule == grammarAccess.getCallExpressionRule()
						|| action == grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0()
						|| rule == grammarAccess.getPrimaryExpressionRule()
						|| rule == grammarAccess.getOneOrManyExpressionsRule()
						|| rule == grammarAccess.getParanthesizedExpressionRule()) {
					sequence_AssignmentExpression(context, (AssignmentExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getInitializationExpressionRule()) {
					sequence_InitializationExpression(context, (AssignmentExpression) semanticObject); 
					return; 
				}
				else break;
			case BeeLangTestLanguagePackage.AT_EXPRESSION:
				sequence_InfixExpression(context, (AtExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.BINARY_OP_EXPRESSION:
				sequence_AdditiveExpression_MultiplicativeExpression_RelationalExpression_SetExpression(context, (BinaryOpExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.CACHED_EXPRESSION:
				sequence_CachedExpression(context, (CachedExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.CALL_FEATURE:
				sequence_InfixExpression(context, (CallFeature) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.CALL_FUNCTION:
				sequence_CallExpression(context, (CallFunction) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.CALL_NAMED_FUNCTION:
				sequence_OperationCall(context, (CallNamedFunction) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.CHAINED_EXPRESSION:
				if (rule == grammarAccess.getBlockExpressionWithoutBracketsRule()) {
					sequence_BlockExpressionWithoutBrackets(context, (ChainedExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOneOrManyExpressionsRule()) {
					sequence_BlockExpression_BlockExpressionWithoutBrackets(context, (ChainedExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTopLevelExpressionRule()
						|| rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getAssignmentExpressionRule()
						|| action == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getCachedExpressionRule()
						|| rule == grammarAccess.getOrExpressionRule()
						|| action == grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAndExpressionRule()
						|| action == grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getRelationalExpressionRule()
						|| action == grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAdditiveExpressionRule()
						|| action == grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getMultiplicativeExpressionRule()
						|| action == grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getSetExpressionRule()
						|| action == grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getUnaryOrInfixExpressionRule()
						|| rule == grammarAccess.getPostopExpressionRule()
						|| action == grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0()
						|| rule == grammarAccess.getInfixExpressionRule()
						|| action == grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0()
						|| action == grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0()
						|| action == grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0()
						|| rule == grammarAccess.getCallExpressionRule()
						|| action == grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0()
						|| rule == grammarAccess.getPrimaryExpressionRule()
						|| rule == grammarAccess.getBlockExpressionRule()
						|| rule == grammarAccess.getParanthesizedExpressionRule()) {
					sequence_BlockExpression(context, (ChainedExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getInitializationBlockExpressionRule()) {
					sequence_InitializationBlockExpression(context, (ChainedExpression) semanticObject); 
					return; 
				}
				else break;
			case BeeLangTestLanguagePackage.CLOSURE_PARAMETER:
				sequence_ClosureParameter(context, (ClosureParameter) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF:
				sequence_ClosureTypeRef(context, (ClosureTypeRef) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.CREATE_EXPRESSION:
				sequence_ConstructorCallExpression(context, (CreateExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.DEF_VALUE:
				if (rule == grammarAccess.getValDeclarationRule()) {
					sequence_ValDeclaration(context, (DefValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTopLevelExpressionRule()) {
					sequence_ValDeclaration_VarDeclaration(context, (DefValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getVarDeclarationRule()) {
					sequence_VarDeclaration(context, (DefValue) semanticObject); 
					return; 
				}
				else break;
			case BeeLangTestLanguagePackage.FEATURE_EXPRESSION:
				if (rule == grammarAccess.getFeatureOfThisRule()) {
					sequence_FeatureOfThis(context, (FeatureExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTopLevelExpressionRule()
						|| rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getAssignmentExpressionRule()
						|| action == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getCachedExpressionRule()
						|| rule == grammarAccess.getOrExpressionRule()
						|| action == grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAndExpressionRule()
						|| action == grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getRelationalExpressionRule()
						|| action == grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAdditiveExpressionRule()
						|| action == grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getMultiplicativeExpressionRule()
						|| action == grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getSetExpressionRule()
						|| action == grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getUnaryOrInfixExpressionRule()
						|| rule == grammarAccess.getPostopExpressionRule()
						|| action == grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0()
						|| rule == grammarAccess.getInfixExpressionRule()
						|| action == grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0()
						|| action == grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0()
						|| action == grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0()
						|| rule == grammarAccess.getCallExpressionRule()
						|| action == grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0()
						|| rule == grammarAccess.getPrimaryExpressionRule()
						|| rule == grammarAccess.getOneOrManyExpressionsRule()
						|| rule == grammarAccess.getParanthesizedExpressionRule()) {
					sequence_InfixExpression(context, (FeatureExpression) semanticObject); 
					return; 
				}
				else break;
			case BeeLangTestLanguagePackage.FUNCTION:
				if (rule == grammarAccess.getTopLevelExpressionRule()
						|| rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getAssignmentExpressionRule()
						|| action == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getCachedExpressionRule()
						|| rule == grammarAccess.getOrExpressionRule()
						|| action == grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAndExpressionRule()
						|| action == grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getRelationalExpressionRule()
						|| action == grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAdditiveExpressionRule()
						|| action == grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getMultiplicativeExpressionRule()
						|| action == grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getSetExpressionRule()
						|| action == grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getUnaryOrInfixExpressionRule()
						|| rule == grammarAccess.getPostopExpressionRule()
						|| action == grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0()
						|| rule == grammarAccess.getInfixExpressionRule()
						|| action == grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0()
						|| action == grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0()
						|| action == grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0()
						|| rule == grammarAccess.getCallExpressionRule()
						|| action == grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0()
						|| rule == grammarAccess.getPrimaryExpressionRule()
						|| rule == grammarAccess.getLiteralRule()
						|| rule == grammarAccess.getLiteralFunctionRule()
						|| rule == grammarAccess.getClosureExpressionRule()
						|| rule == grammarAccess.getOneOrManyExpressionsRule()
						|| rule == grammarAccess.getParanthesizedExpressionRule()) {
					sequence_ClosureExpression(context, (Function) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case BeeLangTestLanguagePackage.GUARD_EXPRESSION:
				sequence_GuardExpression(context, (GuardExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.OR_EXPRESSION:
				sequence_OrExpression(context, (OrExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.PARAMETER:
				sequence_Parameter(context, (org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.Parameter) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.PARAMETER_DECLARATION:
				sequence_ParameterDeclaration(context, (ParameterDeclaration) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.PARAMETER_LIST:
				sequence_ParameterList(context, (ParameterList) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY:
				sequence_ProvidedCapability(context, (ProvidedCapability) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY:
				sequence_RequiredCapability(context, (RequiredCapability) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF:
				sequence_SimpleTypeRef(context, (SimpleTypeRef) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION:
				sequence_UnaryExpression(context, (UnaryOpExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.UNARY_POST_OP_EXPRESSION:
				sequence_PostopExpression(context, (UnaryPostOpExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.UNARY_PRE_OP_EXPRESSION:
				sequence_PreopExpression(context, (UnaryPreOpExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.UNIT:
				sequence_Unit(context, (Unit) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.VALUE_LITERAL:
				sequence_ValueLiteral(context, (ValueLiteral) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.VARIABLE_EXPRESSION:
				if (rule == grammarAccess.getTopLevelExpressionRule()
						|| rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getAssignmentExpressionRule()
						|| action == grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getCachedExpressionRule()
						|| rule == grammarAccess.getOrExpressionRule()
						|| action == grammarAccess.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAndExpressionRule()
						|| action == grammarAccess.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getRelationalExpressionRule()
						|| action == grammarAccess.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getAdditiveExpressionRule()
						|| action == grammarAccess.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getMultiplicativeExpressionRule()
						|| action == grammarAccess.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getSetExpressionRule()
						|| action == grammarAccess.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0()
						|| rule == grammarAccess.getUnaryOrInfixExpressionRule()
						|| rule == grammarAccess.getPostopExpressionRule()
						|| action == grammarAccess.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0()
						|| rule == grammarAccess.getInfixExpressionRule()
						|| action == grammarAccess.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0()
						|| action == grammarAccess.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0()
						|| action == grammarAccess.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0()
						|| rule == grammarAccess.getCallExpressionRule()
						|| action == grammarAccess.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0()
						|| rule == grammarAccess.getPrimaryExpressionRule()
						|| rule == grammarAccess.getOneOrManyExpressionsRule()
						|| rule == grammarAccess.getParanthesizedExpressionRule()) {
					sequence_KeywordVariables_Value(context, (VariableExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKeywordVariablesRule()) {
					sequence_KeywordVariables(context, (VariableExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getValueRule()) {
					sequence_Value(context, (VariableExpression) semanticObject); 
					return; 
				}
				else break;
			case BeeLangTestLanguagePackage.WITH_CONTEXT_EXPRESSION:
				sequence_WithContextExpression(context, (WithContextExpression) semanticObject); 
				return; 
			case BeeLangTestLanguagePackage.WITH_EXPRESSION:
				sequence_WithExpression(context, (WithExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
}
