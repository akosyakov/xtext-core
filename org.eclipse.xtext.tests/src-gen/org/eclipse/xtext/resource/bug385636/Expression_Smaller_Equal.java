/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.resource.bug385636;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Smaller Equal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.resource.bug385636.Expression_Smaller_Equal#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xtext.resource.bug385636.Expression_Smaller_Equal#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.resource.bug385636.Bug385636Package#getExpression_Smaller_Equal()
 * @model
 * @generated
 */
public interface Expression_Smaller_Equal extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.eclipse.xtext.resource.bug385636.Bug385636Package#getExpression_Smaller_Equal_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.resource.bug385636.Expression_Smaller_Equal#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression_VariableName)
   * @see org.eclipse.xtext.resource.bug385636.Bug385636Package#getExpression_Smaller_Equal_Right()
   * @model containment="true"
   * @generated
   */
  Expression_VariableName getRight();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.resource.bug385636.Expression_Smaller_Equal#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression_VariableName value);

} // Expression_Smaller_Equal
