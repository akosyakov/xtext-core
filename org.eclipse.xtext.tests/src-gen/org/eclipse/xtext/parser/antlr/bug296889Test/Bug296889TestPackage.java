/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.antlr.bug296889Test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.parser.antlr.bug296889Test.Bug296889TestFactory
 * @model kind="package"
 * @generated
 */
public interface Bug296889TestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bug296889Test";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.org/xtext/Bug296889TestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bug296889Test";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Bug296889TestPackage eINSTANCE = org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.ModelImpl
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VALUES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.ExpressionImpl
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.PreopImpl <em>Preop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.PreopImpl
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getPreop()
   * @generated
   */
  int PREOP = 2;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREOP__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREOP__EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Preop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREOP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.PostopImpl <em>Postop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.PostopImpl
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getPostop()
   * @generated
   */
  int POSTOP = 3;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTOP__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTOP__FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Postop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTOP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.VariableImpl
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Model#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Model#getExpressions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Expressions();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Model#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Model#getValues()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Values();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Preop <em>Preop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Preop</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Preop
   * @generated
   */
  EClass getPreop();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Preop#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Preop#getFunctionName()
   * @see #getPreop()
   * @generated
   */
  EAttribute getPreop_FunctionName();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Preop#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Preop#getExpr()
   * @see #getPreop()
   * @generated
   */
  EReference getPreop_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Postop <em>Postop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postop</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Postop
   * @generated
   */
  EClass getPostop();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Postop#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Postop#getExpr()
   * @see #getPostop()
   * @generated
   */
  EReference getPostop_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Postop#getFunctionName <em>Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Name</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Postop#getFunctionName()
   * @see #getPostop()
   * @generated
   */
  EAttribute getPostop_FunctionName();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.parser.antlr.bug296889Test.Variable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.parser.antlr.bug296889Test.Variable#getName()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Bug296889TestFactory getBug296889TestFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.ModelImpl
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXPRESSIONS = eINSTANCE.getModel_Expressions();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__VALUES = eINSTANCE.getModel_Values();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.ExpressionImpl
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.PreopImpl <em>Preop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.PreopImpl
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getPreop()
     * @generated
     */
    EClass PREOP = eINSTANCE.getPreop();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREOP__FUNCTION_NAME = eINSTANCE.getPreop_FunctionName();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREOP__EXPR = eINSTANCE.getPreop_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.PostopImpl <em>Postop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.PostopImpl
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getPostop()
     * @generated
     */
    EClass POSTOP = eINSTANCE.getPostop();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTOP__EXPR = eINSTANCE.getPostop_Expr();

    /**
     * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSTOP__FUNCTION_NAME = eINSTANCE.getPostop_FunctionName();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.parser.antlr.bug296889Test.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.VariableImpl
     * @see org.eclipse.xtext.parser.antlr.bug296889Test.impl.Bug296889TestPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

  }

} //Bug296889TestPackage
