/**
 */
package com.netfective.workflow.Wfl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.netfective.workflow.Wfl.WflPackage
 * @generated
 */
public interface WflFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WflFactory eINSTANCE = com.netfective.workflow.Wfl.impl.WflFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cartridge WFL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartridge WFL</em>'.
	 * @generated
	 */
	CartridgeWFL createCartridgeWFL();

	/**
	 * Returns a new object of class '<em>Property WFL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property WFL</em>'.
	 * @generated
	 */
	PropertyWFL createPropertyWFL();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WflPackage getWflPackage();

} //WflFactory
