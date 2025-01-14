/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parsetree.formatter.formattertestlanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parsetree.formatter.formattertestlanguage.Assign#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.xtext.parsetree.formatter.formattertestlanguage.Assign#getOp <em>Op</em>}</li>
 *   <li>{@link org.eclipse.xtext.parsetree.formatter.formattertestlanguage.Assign#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.parsetree.formatter.formattertestlanguage.FormattertestlanguagePackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends Line
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see org.eclipse.xtext.parsetree.formatter.formattertestlanguage.FormattertestlanguagePackage#getAssign_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parsetree.formatter.formattertestlanguage.Assign#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.eclipse.xtext.parsetree.formatter.formattertestlanguage.FormattertestlanguagePackage#getAssign_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parsetree.formatter.formattertestlanguage.Assign#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute list.
   * @see org.eclipse.xtext.parsetree.formatter.formattertestlanguage.FormattertestlanguagePackage#getAssign_Val()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getVal();

} // Assign
