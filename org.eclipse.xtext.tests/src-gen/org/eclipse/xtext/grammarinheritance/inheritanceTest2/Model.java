/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.grammarinheritance.inheritanceTest2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.grammarinheritance.inheritanceTest2.Model#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.grammarinheritance.inheritanceTest2.InheritanceTest2Package#getModel()
 * @model
 * @generated
 */
public interface Model extends org.eclipse.xtext.grammarinheritance.inheritanceTest.Model
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' attribute list.
   * @see org.eclipse.xtext.grammarinheritance.inheritanceTest2.InheritanceTest2Package#getModel_Ids()
   * @model unique="false"
   * @generated
   */
  EList<String> getIds();

} // Model
