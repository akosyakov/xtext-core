/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.BeeLangTestLanguagePackage;
import org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.SimpleTypeRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.SimpleTypeRefImpl#getRawType <em>Raw Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.backtracking.beeLangTestLanguage.impl.SimpleTypeRefImpl#getActualArgumentsList <em>Actual Arguments List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTypeRefImpl extends TypeRefImpl implements SimpleTypeRef
{
  /**
   * The default value of the '{@link #getRawType() <em>Raw Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRawType()
   * @generated
   * @ordered
   */
  protected static final String RAW_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRawType() <em>Raw Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRawType()
   * @generated
   * @ordered
   */
  protected String rawType = RAW_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getActualArgumentsList() <em>Actual Arguments List</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActualArgumentsList()
   * @generated
   * @ordered
   */
  protected EList<String> actualArgumentsList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleTypeRefImpl()
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
    return BeeLangTestLanguagePackage.Literals.SIMPLE_TYPE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRawType()
  {
    return rawType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRawType(String newRawType)
  {
    String oldRawType = rawType;
    rawType = newRawType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__RAW_TYPE, oldRawType, rawType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getActualArgumentsList()
  {
    if (actualArgumentsList == null)
    {
      actualArgumentsList = new EDataTypeEList<String>(String.class, this, BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST);
    }
    return actualArgumentsList;
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
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__RAW_TYPE:
        return getRawType();
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST:
        return getActualArgumentsList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__RAW_TYPE:
        setRawType((String)newValue);
        return;
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST:
        getActualArgumentsList().clear();
        getActualArgumentsList().addAll((Collection<? extends String>)newValue);
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
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__RAW_TYPE:
        setRawType(RAW_TYPE_EDEFAULT);
        return;
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST:
        getActualArgumentsList().clear();
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
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__RAW_TYPE:
        return RAW_TYPE_EDEFAULT == null ? rawType != null : !RAW_TYPE_EDEFAULT.equals(rawType);
      case BeeLangTestLanguagePackage.SIMPLE_TYPE_REF__ACTUAL_ARGUMENTS_LIST:
        return actualArgumentsList != null && !actualArgumentsList.isEmpty();
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
    result.append(" (rawType: ");
    result.append(rawType);
    result.append(", actualArgumentsList: ");
    result.append(actualArgumentsList);
    result.append(')');
    return result.toString();
  }

} //SimpleTypeRefImpl
