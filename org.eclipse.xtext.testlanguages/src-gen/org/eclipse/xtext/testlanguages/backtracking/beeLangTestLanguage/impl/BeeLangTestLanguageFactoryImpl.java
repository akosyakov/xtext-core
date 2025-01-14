/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeeLangTestLanguageFactoryImpl extends EFactoryImpl implements BeeLangTestLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BeeLangTestLanguageFactory init()
  {
    try
    {
      BeeLangTestLanguageFactory theBeeLangTestLanguageFactory = (BeeLangTestLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(BeeLangTestLanguagePackage.eNS_URI);
      if (theBeeLangTestLanguageFactory != null)
      {
        return theBeeLangTestLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BeeLangTestLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeeLangTestLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BeeLangTestLanguagePackage.MODEL: return createModel();
      case BeeLangTestLanguagePackage.UNIT: return createUnit();
      case BeeLangTestLanguagePackage.PROVIDED_CAPABILITY: return createProvidedCapability();
      case BeeLangTestLanguagePackage.ALIASED_REQUIRED_CAPABILITY: return createAliasedRequiredCapability();
      case BeeLangTestLanguagePackage.REQUIRED_CAPABILITY: return createRequiredCapability();
      case BeeLangTestLanguagePackage.PARAMETER_LIST: return createParameterList();
      case BeeLangTestLanguagePackage.PARAMETER: return createParameter();
      case BeeLangTestLanguagePackage.CLOSURE_PARAMETER: return createClosureParameter();
      case BeeLangTestLanguagePackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case BeeLangTestLanguagePackage.FUNCTION: return createFunction();
      case BeeLangTestLanguagePackage.GUARD_EXPRESSION: return createGuardExpression();
      case BeeLangTestLanguagePackage.EXPRESSION: return createExpression();
      case BeeLangTestLanguagePackage.TYPE_REF: return createTypeRef();
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF: return createSimpleTypeRef();
      case BeeLangTestLanguagePackage.CLOSURE_TYPE_REF: return createClosureTypeRef();
      case BeeLangTestLanguagePackage.WITH_EXPRESSION: return createWithExpression();
      case BeeLangTestLanguagePackage.WITH_CONTEXT_EXPRESSION: return createWithContextExpression();
      case BeeLangTestLanguagePackage.CALL_EXPRESSION: return createCallExpression();
      case BeeLangTestLanguagePackage.VALUE_LITERAL: return createValueLiteral();
      case BeeLangTestLanguagePackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
      case BeeLangTestLanguagePackage.DEF_VALUE: return createDefValue();
      case BeeLangTestLanguagePackage.CACHED_EXPRESSION: return createCachedExpression();
      case BeeLangTestLanguagePackage.OR_EXPRESSION: return createOrExpression();
      case BeeLangTestLanguagePackage.AND_EXPRESSION: return createAndExpression();
      case BeeLangTestLanguagePackage.BINARY_OP_EXPRESSION: return createBinaryOpExpression();
      case BeeLangTestLanguagePackage.UNARY_OP_EXPRESSION: return createUnaryOpExpression();
      case BeeLangTestLanguagePackage.UNARY_PRE_OP_EXPRESSION: return createUnaryPreOpExpression();
      case BeeLangTestLanguagePackage.UNARY_POST_OP_EXPRESSION: return createUnaryPostOpExpression();
      case BeeLangTestLanguagePackage.CALL_FEATURE: return createCallFeature();
      case BeeLangTestLanguagePackage.AT_EXPRESSION: return createAtExpression();
      case BeeLangTestLanguagePackage.FEATURE_EXPRESSION: return createFeatureExpression();
      case BeeLangTestLanguagePackage.CALL_FUNCTION: return createCallFunction();
      case BeeLangTestLanguagePackage.CHAINED_EXPRESSION: return createChainedExpression();
      case BeeLangTestLanguagePackage.VARIABLE_EXPRESSION: return createVariableExpression();
      case BeeLangTestLanguagePackage.CALL_NAMED_FUNCTION: return createCallNamedFunction();
      case BeeLangTestLanguagePackage.CREATE_EXPRESSION: return createCreateExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Unit createUnit()
  {
    UnitImpl unit = new UnitImpl();
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProvidedCapability createProvidedCapability()
  {
    ProvidedCapabilityImpl providedCapability = new ProvidedCapabilityImpl();
    return providedCapability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AliasedRequiredCapability createAliasedRequiredCapability()
  {
    AliasedRequiredCapabilityImpl aliasedRequiredCapability = new AliasedRequiredCapabilityImpl();
    return aliasedRequiredCapability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RequiredCapability createRequiredCapability()
  {
    RequiredCapabilityImpl requiredCapability = new RequiredCapabilityImpl();
    return requiredCapability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClosureParameter createClosureParameter()
  {
    ClosureParameterImpl closureParameter = new ClosureParameterImpl();
    return closureParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GuardExpression createGuardExpression()
  {
    GuardExpressionImpl guardExpression = new GuardExpressionImpl();
    return guardExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleTypeRef createSimpleTypeRef()
  {
    SimpleTypeRefImpl simpleTypeRef = new SimpleTypeRefImpl();
    return simpleTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ClosureTypeRef createClosureTypeRef()
  {
    ClosureTypeRefImpl closureTypeRef = new ClosureTypeRefImpl();
    return closureTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WithExpression createWithExpression()
  {
    WithExpressionImpl withExpression = new WithExpressionImpl();
    return withExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WithContextExpression createWithContextExpression()
  {
    WithContextExpressionImpl withContextExpression = new WithContextExpressionImpl();
    return withContextExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CallExpression createCallExpression()
  {
    CallExpressionImpl callExpression = new CallExpressionImpl();
    return callExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueLiteral createValueLiteral()
  {
    ValueLiteralImpl valueLiteral = new ValueLiteralImpl();
    return valueLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignmentExpression createAssignmentExpression()
  {
    AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
    return assignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefValue createDefValue()
  {
    DefValueImpl defValue = new DefValueImpl();
    return defValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CachedExpression createCachedExpression()
  {
    CachedExpressionImpl cachedExpression = new CachedExpressionImpl();
    return cachedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinaryOpExpression createBinaryOpExpression()
  {
    BinaryOpExpressionImpl binaryOpExpression = new BinaryOpExpressionImpl();
    return binaryOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryOpExpression createUnaryOpExpression()
  {
    UnaryOpExpressionImpl unaryOpExpression = new UnaryOpExpressionImpl();
    return unaryOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryPreOpExpression createUnaryPreOpExpression()
  {
    UnaryPreOpExpressionImpl unaryPreOpExpression = new UnaryPreOpExpressionImpl();
    return unaryPreOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryPostOpExpression createUnaryPostOpExpression()
  {
    UnaryPostOpExpressionImpl unaryPostOpExpression = new UnaryPostOpExpressionImpl();
    return unaryPostOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CallFeature createCallFeature()
  {
    CallFeatureImpl callFeature = new CallFeatureImpl();
    return callFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtExpression createAtExpression()
  {
    AtExpressionImpl atExpression = new AtExpressionImpl();
    return atExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FeatureExpression createFeatureExpression()
  {
    FeatureExpressionImpl featureExpression = new FeatureExpressionImpl();
    return featureExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CallFunction createCallFunction()
  {
    CallFunctionImpl callFunction = new CallFunctionImpl();
    return callFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChainedExpression createChainedExpression()
  {
    ChainedExpressionImpl chainedExpression = new ChainedExpressionImpl();
    return chainedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableExpression createVariableExpression()
  {
    VariableExpressionImpl variableExpression = new VariableExpressionImpl();
    return variableExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CallNamedFunction createCallNamedFunction()
  {
    CallNamedFunctionImpl callNamedFunction = new CallNamedFunctionImpl();
    return callNamedFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateExpression createCreateExpression()
  {
    CreateExpressionImpl createExpression = new CreateExpressionImpl();
    return createExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BeeLangTestLanguagePackage getBeeLangTestLanguagePackage()
  {
    return (BeeLangTestLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BeeLangTestLanguagePackage getPackage()
  {
    return BeeLangTestLanguagePackage.eINSTANCE;
  }

} //BeeLangTestLanguageFactoryImpl
