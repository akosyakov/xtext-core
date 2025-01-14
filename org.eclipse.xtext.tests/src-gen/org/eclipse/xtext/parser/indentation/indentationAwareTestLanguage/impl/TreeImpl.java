/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.IndentationAwareTestLanguagePackage;
import org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.OtherTreeNode;
import org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.Tree;
import org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.TreeNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.impl.TreeImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.impl.TreeImpl#getMoreNodes <em>More Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeImpl extends MinimalEObjectImpl.Container implements Tree
{
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<TreeNode> nodes;

  /**
   * The cached value of the '{@link #getMoreNodes() <em>More Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMoreNodes()
   * @generated
   * @ordered
   */
  protected EList<OtherTreeNode> moreNodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TreeImpl()
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
    return IndentationAwareTestLanguagePackage.Literals.TREE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TreeNode> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<TreeNode>(TreeNode.class, this, IndentationAwareTestLanguagePackage.TREE__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OtherTreeNode> getMoreNodes()
  {
    if (moreNodes == null)
    {
      moreNodes = new EObjectContainmentEList<OtherTreeNode>(OtherTreeNode.class, this, IndentationAwareTestLanguagePackage.TREE__MORE_NODES);
    }
    return moreNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IndentationAwareTestLanguagePackage.TREE__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case IndentationAwareTestLanguagePackage.TREE__MORE_NODES:
        return ((InternalEList<?>)getMoreNodes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case IndentationAwareTestLanguagePackage.TREE__NODES:
        return getNodes();
      case IndentationAwareTestLanguagePackage.TREE__MORE_NODES:
        return getMoreNodes();
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
      case IndentationAwareTestLanguagePackage.TREE__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends TreeNode>)newValue);
        return;
      case IndentationAwareTestLanguagePackage.TREE__MORE_NODES:
        getMoreNodes().clear();
        getMoreNodes().addAll((Collection<? extends OtherTreeNode>)newValue);
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
      case IndentationAwareTestLanguagePackage.TREE__NODES:
        getNodes().clear();
        return;
      case IndentationAwareTestLanguagePackage.TREE__MORE_NODES:
        getMoreNodes().clear();
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
      case IndentationAwareTestLanguagePackage.TREE__NODES:
        return nodes != null && !nodes.isEmpty();
      case IndentationAwareTestLanguagePackage.TREE__MORE_NODES:
        return moreNodes != null && !moreNodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TreeImpl
