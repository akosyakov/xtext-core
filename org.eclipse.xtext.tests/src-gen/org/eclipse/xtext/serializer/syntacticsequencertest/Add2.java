/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.syntacticsequencertest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.syntacticsequencertest.Add2#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.syntacticsequencertest.Add2#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.serializer.syntacticsequencertest.SyntacticsequencertestPackage#getAdd2()
 * @model
 * @generated
 */
public interface Add2 extends Exp2
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp2)
   * @see org.eclipse.xtext.serializer.syntacticsequencertest.SyntacticsequencertestPackage#getAdd2_Left()
   * @model containment="true"
   * @generated
   */
  Exp2 getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.syntacticsequencertest.Add2#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp2 value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp2)
   * @see org.eclipse.xtext.serializer.syntacticsequencertest.SyntacticsequencertestPackage#getAdd2_Right()
   * @model containment="true"
   * @generated
   */
  Exp2 getRight();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.syntacticsequencertest.Add2#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp2 value);

} // Add2
