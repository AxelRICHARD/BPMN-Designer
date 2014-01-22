/**
 * <copyright>
 * 
 * Copyright (c) 2011-2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 * 
 * </copyright>
 */
package org.obeonetwork.dsl.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.obeonetwork.dsl.bpmn2.Bpmn2Package;
import org.obeonetwork.dsl.bpmn2.Expression;
import org.obeonetwork.dsl.bpmn2.ResourceParameter;
import org.obeonetwork.dsl.bpmn2.ResourceParameterBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl#getParameterRef <em>Parameter Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceParameterBindingImpl extends CDOObjectImpl implements
		ResourceParameterBinding {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceParameterBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return (Expression) eDynamicGet(
				Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION,
				Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__EXPRESSION,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression,
			NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newExpression,
				Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Expression newExpression) {
		eDynamicSet(Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION,
				Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__EXPRESSION,
				newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameter getParameterRef() {
		return (ResourceParameter) eDynamicGet(
				Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF,
				Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__PARAMETER_REF,
				true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameter basicGetParameterRef() {
		return (ResourceParameter) eDynamicGet(
				Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF,
				Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__PARAMETER_REF,
				false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterRef(ResourceParameter newParameterRef) {
		eDynamicSet(
				Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF,
				Bpmn2Package.Literals.RESOURCE_PARAMETER_BINDING__PARAMETER_REF,
				newParameterRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
			return basicSetExpression(null, msgs);
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
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
			return getExpression();
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
			if (resolve)
				return getParameterRef();
			return basicGetParameterRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
			setExpression((Expression) newValue);
			return;
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
			setParameterRef((ResourceParameter) newValue);
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
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
			setExpression((Expression) null);
			return;
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
			setParameterRef((ResourceParameter) null);
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
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__EXPRESSION:
			return getExpression() != null;
		case Bpmn2Package.RESOURCE_PARAMETER_BINDING__PARAMETER_REF:
			return basicGetParameterRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceParameterBindingImpl
