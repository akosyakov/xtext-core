/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.testLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.testLang.Model#getMultiFeature <em>Multi Feature</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.testlanguages.testLang.TestLangPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Multi Feature</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.testlanguages.testLang.AbstractElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi Feature</em>' containment reference list.
   * @see org.eclipse.xtext.testlanguages.testLang.TestLangPackage#getModel_MultiFeature()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getMultiFeature();

} // Model
