/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.serializer.sequencertest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependent Alternative1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.DependentAlternative1#getVal <em>Val</em>}</li>
 *   <li>{@link org.eclipse.xtext.serializer.sequencertest.DependentAlternative1#isFlag <em>Flag</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.serializer.sequencertest.SequencertestPackage#getDependentAlternative1()
 * @model
 * @generated
 */
public interface DependentAlternative1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see org.eclipse.xtext.serializer.sequencertest.SequencertestPackage#getDependentAlternative1_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.sequencertest.DependentAlternative1#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

  /**
   * Returns the value of the '<em><b>Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flag</em>' attribute.
   * @see #setFlag(boolean)
   * @see org.eclipse.xtext.serializer.sequencertest.SequencertestPackage#getDependentAlternative1_Flag()
   * @model
   * @generated
   */
  boolean isFlag();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.serializer.sequencertest.DependentAlternative1#isFlag <em>Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flag</em>' attribute.
   * @see #isFlag()
   * @generated
   */
  void setFlag(boolean value);

} // DependentAlternative1
