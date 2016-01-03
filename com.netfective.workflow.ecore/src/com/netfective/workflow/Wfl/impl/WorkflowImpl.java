/**
 */
package com.netfective.workflow.Wfl.impl;

import com.netfective.workflow.Wfl.CartridgeWFL;
import com.netfective.workflow.Wfl.WflPackage;
import com.netfective.workflow.Wfl.Workflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.netfective.workflow.Wfl.impl.WorkflowImpl#getCartridges <em>Cartridges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
	/**
	 * The cached value of the '{@link #getCartridges() <em>Cartridges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartridges()
	 * @generated
	 * @ordered
	 */
	protected EList<CartridgeWFL> cartridges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WflPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CartridgeWFL> getCartridges() {
		if (cartridges == null) {
			cartridges = new EObjectContainmentEList<CartridgeWFL>(CartridgeWFL.class, this, WflPackage.WORKFLOW__CARTRIDGES);
		}
		return cartridges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WflPackage.WORKFLOW__CARTRIDGES:
				return ((InternalEList<?>)getCartridges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WflPackage.WORKFLOW__CARTRIDGES:
				return getCartridges();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WflPackage.WORKFLOW__CARTRIDGES:
				getCartridges().clear();
				getCartridges().addAll((Collection<? extends CartridgeWFL>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case WflPackage.WORKFLOW__CARTRIDGES:
				getCartridges().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WflPackage.WORKFLOW__CARTRIDGES:
				return cartridges != null && !cartridges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowImpl
