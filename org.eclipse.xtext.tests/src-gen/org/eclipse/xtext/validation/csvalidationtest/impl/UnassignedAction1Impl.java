/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.validation.csvalidationtest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.validation.csvalidationtest.CsvalidationtestPackage;
import org.eclipse.xtext.validation.csvalidationtest.UnassignedAction1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unassigned Action1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.validation.csvalidationtest.impl.UnassignedAction1Impl#getVal1 <em>Val1</em>}</li>
 *   <li>{@link org.eclipse.xtext.validation.csvalidationtest.impl.UnassignedAction1Impl#getVal2 <em>Val2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnassignedAction1Impl extends MinimalEObjectImpl.Container implements UnassignedAction1
{
  /**
   * The default value of the '{@link #getVal1() <em>Val1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal1()
   * @generated
   * @ordered
   */
  protected static final String VAL1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal1() <em>Val1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal1()
   * @generated
   * @ordered
   */
  protected String val1 = VAL1_EDEFAULT;

  /**
   * The default value of the '{@link #getVal2() <em>Val2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal2()
   * @generated
   * @ordered
   */
  protected static final String VAL2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal2() <em>Val2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal2()
   * @generated
   * @ordered
   */
  protected String val2 = VAL2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnassignedAction1Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CsvalidationtestPackage.Literals.UNASSIGNED_ACTION1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVal1()
  {
    return val1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal1(String newVal1)
  {
    String oldVal1 = val1;
    val1 = newVal1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL1, oldVal1, val1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVal2()
  {
    return val2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVal2(String newVal2)
  {
    String oldVal2 = val2;
    val2 = newVal2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL2, oldVal2, val2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL1:
        return getVal1();
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL2:
        return getVal2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL1:
        setVal1((String)newValue);
        return;
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL2:
        setVal2((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL1:
        setVal1(VAL1_EDEFAULT);
        return;
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL2:
        setVal2(VAL2_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL1:
        return VAL1_EDEFAULT == null ? val1 != null : !VAL1_EDEFAULT.equals(val1);
      case CsvalidationtestPackage.UNASSIGNED_ACTION1__VAL2:
        return VAL2_EDEFAULT == null ? val2 != null : !VAL2_EDEFAULT.equals(val2);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (val1: ");
    result.append(val1);
    result.append(", val2: ");
    result.append(val2);
    result.append(')');
    return result.toString();
  }

} //UnassignedAction1Impl
