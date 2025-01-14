/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.NestedRefsPackage;
import org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.SelfReferingDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Refering Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.SelfReferingDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.nestedRefs.nestedRefs.impl.SelfReferingDeclImpl#getSelfRef <em>Self Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelfReferingDeclImpl extends MinimalEObjectImpl.Container implements SelfReferingDecl
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelfRef() <em>Self Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelfRef()
   * @generated
   * @ordered
   */
  protected SelfReferingDecl selfRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfReferingDeclImpl()
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
    return NestedRefsPackage.Literals.SELF_REFERING_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NestedRefsPackage.SELF_REFERING_DECL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelfReferingDecl getSelfRef()
  {
    if (selfRef != null && selfRef.eIsProxy())
    {
      InternalEObject oldSelfRef = (InternalEObject)selfRef;
      selfRef = (SelfReferingDecl)eResolveProxy(oldSelfRef);
      if (selfRef != oldSelfRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NestedRefsPackage.SELF_REFERING_DECL__SELF_REF, oldSelfRef, selfRef));
      }
    }
    return selfRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfReferingDecl basicGetSelfRef()
  {
    return selfRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelfRef(SelfReferingDecl newSelfRef)
  {
    SelfReferingDecl oldSelfRef = selfRef;
    selfRef = newSelfRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NestedRefsPackage.SELF_REFERING_DECL__SELF_REF, oldSelfRef, selfRef));
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
      case NestedRefsPackage.SELF_REFERING_DECL__NAME:
        return getName();
      case NestedRefsPackage.SELF_REFERING_DECL__SELF_REF:
        if (resolve) return getSelfRef();
        return basicGetSelfRef();
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
      case NestedRefsPackage.SELF_REFERING_DECL__NAME:
        setName((String)newValue);
        return;
      case NestedRefsPackage.SELF_REFERING_DECL__SELF_REF:
        setSelfRef((SelfReferingDecl)newValue);
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
      case NestedRefsPackage.SELF_REFERING_DECL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NestedRefsPackage.SELF_REFERING_DECL__SELF_REF:
        setSelfRef((SelfReferingDecl)null);
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
      case NestedRefsPackage.SELF_REFERING_DECL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NestedRefsPackage.SELF_REFERING_DECL__SELF_REF:
        return selfRef != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SelfReferingDeclImpl
