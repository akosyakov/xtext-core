/**
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.parser.antlr.gh1462Test.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.parser.antlr.gh1462Test.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Gh1462TestFactoryImpl extends EFactoryImpl implements Gh1462TestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Gh1462TestFactory init()
  {
    try
    {
      Gh1462TestFactory theGh1462TestFactory = (Gh1462TestFactory)EPackage.Registry.INSTANCE.getEFactory(Gh1462TestPackage.eNS_URI);
      if (theGh1462TestFactory != null)
      {
        return theGh1462TestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Gh1462TestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gh1462TestFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Gh1462TestPackage.ROOT: return createRoot();
      case Gh1462TestPackage.RULE1: return createRule1();
      case Gh1462TestPackage.RULE2: return createRule2();
      case Gh1462TestPackage.RULE3: return createRule3();
      case Gh1462TestPackage.RULE4: return createRule4();
      case Gh1462TestPackage.RULE5: return createRule5();
      case Gh1462TestPackage.RULE6: return createRule6();
      case Gh1462TestPackage.RULE7: return createRule7();
      case Gh1462TestPackage.RULE8: return createRule8();
      case Gh1462TestPackage.RULE9: return createRule9();
      case Gh1462TestPackage.RULE10: return createRule10();
      case Gh1462TestPackage.RULE11: return createRule11();
      case Gh1462TestPackage.RULE12: return createRule12();
      case Gh1462TestPackage.WRAPPER: return createWrapper();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule1 createRule1()
  {
    Rule1Impl rule1 = new Rule1Impl();
    return rule1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule2 createRule2()
  {
    Rule2Impl rule2 = new Rule2Impl();
    return rule2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule3 createRule3()
  {
    Rule3Impl rule3 = new Rule3Impl();
    return rule3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule4 createRule4()
  {
    Rule4Impl rule4 = new Rule4Impl();
    return rule4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule5 createRule5()
  {
    Rule5Impl rule5 = new Rule5Impl();
    return rule5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule6 createRule6()
  {
    Rule6Impl rule6 = new Rule6Impl();
    return rule6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule7 createRule7()
  {
    Rule7Impl rule7 = new Rule7Impl();
    return rule7;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule8 createRule8()
  {
    Rule8Impl rule8 = new Rule8Impl();
    return rule8;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule9 createRule9()
  {
    Rule9Impl rule9 = new Rule9Impl();
    return rule9;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule10 createRule10()
  {
    Rule10Impl rule10 = new Rule10Impl();
    return rule10;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule11 createRule11()
  {
    Rule11Impl rule11 = new Rule11Impl();
    return rule11;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule12 createRule12()
  {
    Rule12Impl rule12 = new Rule12Impl();
    return rule12;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Wrapper createWrapper()
  {
    WrapperImpl wrapper = new WrapperImpl();
    return wrapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Gh1462TestPackage getGh1462TestPackage()
  {
    return (Gh1462TestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Gh1462TestPackage getPackage()
  {
    return Gh1462TestPackage.eINSTANCE;
  }

} //Gh1462TestFactoryImpl
