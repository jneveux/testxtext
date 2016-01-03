/**
 */
package com.netfective.workflow.Wfl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartridge WFL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.netfective.workflow.Wfl.CartridgeWFL#getName <em>Name</em>}</li>
 *   <li>{@link com.netfective.workflow.Wfl.CartridgeWFL#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.netfective.workflow.Wfl.WflPackage#getCartridgeWFL()
 * @model
 * @generated
 */
public interface CartridgeWFL extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.netfective.workflow.Wfl.WflPackage#getCartridgeWFL_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.netfective.workflow.Wfl.CartridgeWFL#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.netfective.workflow.Wfl.PropertyWFL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.netfective.workflow.Wfl.WflPackage#getCartridgeWFL_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyWFL> getProperties();

} // CartridgeWFL
