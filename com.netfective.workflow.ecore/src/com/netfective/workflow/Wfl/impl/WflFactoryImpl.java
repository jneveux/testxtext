/**
 */
package com.netfective.workflow.Wfl.impl;

import com.netfective.workflow.Wfl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WflFactoryImpl extends EFactoryImpl implements WflFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WflFactory init() {
		try {
			WflFactory theWflFactory = (WflFactory)EPackage.Registry.INSTANCE.getEFactory(WflPackage.eNS_URI);
			if (theWflFactory != null) {
				return theWflFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WflFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WflFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WflPackage.CARTRIDGE_WFL: return createCartridgeWFL();
			case WflPackage.PROPERTY_WFL: return createPropertyWFL();
			case WflPackage.WORKFLOW: return createWorkflow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartridgeWFL createCartridgeWFL() {
		CartridgeWFLImpl cartridgeWFL = new CartridgeWFLImpl();
		return cartridgeWFL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyWFL createPropertyWFL() {
		PropertyWFLImpl propertyWFL = new PropertyWFLImpl();
		return propertyWFL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WflPackage getWflPackage() {
		return (WflPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WflPackage getPackage() {
		return WflPackage.eINSTANCE;
	}

} //WflFactoryImpl
