/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.LinkMst;
import cclms.ParameterMst;
import cclms.ParameterValue;
import cclms.UserMst;

import ilog.odm.dom.impl.IloDomObjectImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cclms.impl.ParameterValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link cclms.impl.ParameterValueImpl#getRefLinkId <em>Ref Link Id</em>}</li>
 *   <li>{@link cclms.impl.ParameterValueImpl#getRefParameterId <em>Ref Parameter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterValueImpl extends IloDomObjectImpl implements
		ParameterValue {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The flag representing whether the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_ESETFLAG = 1 << 0;

	/**
	 * The cached value of the '{@link #getRefLinkId() <em>Ref Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkId()
	 * @generated
	 * @ordered
	 */
	protected LinkMst refLinkId;

	/**
	 * The cached value of the '{@link #getRefParameterId() <em>Ref Parameter Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefParameterId()
	 * @generated
	 * @ordered
	 */
	protected ParameterMst refParameterId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		boolean oldValueESet = (_booleanFlags & VALUE_ESETFLAG) != 0;
		_booleanFlags |= VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_VALUE__VALUE, oldValue,
								value, !oldValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_VALUE__VALUE, oldValue, value,
						!oldValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		double oldValue = value;
		boolean oldValueESet = (_booleanFlags & VALUE_ESETFLAG) != 0;
		value = VALUE_EDEFAULT;
		_booleanFlags &= ~VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.PARAMETER_VALUE__VALUE, oldValue,
								VALUE_EDEFAULT, oldValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.PARAMETER_VALUE__VALUE, oldValue,
						VALUE_EDEFAULT, oldValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return (_booleanFlags & VALUE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMst getRefLinkId() {
		return refLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLinkId(LinkMst newRefLinkId,
			NotificationChain msgs) {
		LinkMst oldRefLinkId = refLinkId;
		refLinkId = newRefLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.PARAMETER_VALUE__REF_LINK_ID,
								oldRefLinkId, newRefLinkId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_VALUE__REF_LINK_ID,
						oldRefLinkId, newRefLinkId);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefLinkId(LinkMst newRefLinkId) {
		if (newRefLinkId != refLinkId) {
			NotificationChain msgs = null;
			if (refLinkId != null)
				msgs = ((InternalEObject) refLinkId).eInverseRemove(this,
						CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID,
						LinkMst.class, msgs);
			if (newRefLinkId != null)
				msgs = ((InternalEObject) newRefLinkId).eInverseAdd(this,
						CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID,
						LinkMst.class, msgs);
			msgs = basicSetRefLinkId(newRefLinkId, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_VALUE__REF_LINK_ID,
								newRefLinkId, newRefLinkId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_VALUE__REF_LINK_ID,
						newRefLinkId, newRefLinkId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMst getRefParameterId() {
		return refParameterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefParameterId(
			ParameterMst newRefParameterId, NotificationChain msgs) {
		ParameterMst oldRefParameterId = refParameterId;
		refParameterId = newRefParameterId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID,
								oldRefParameterId, newRefParameterId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID,
						oldRefParameterId, newRefParameterId);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefParameterId(ParameterMst newRefParameterId) {
		if (newRefParameterId != refParameterId) {
			NotificationChain msgs = null;
			if (refParameterId != null)
				msgs = ((InternalEObject) refParameterId)
						.eInverseRemove(
								this,
								CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID,
								ParameterMst.class, msgs);
			if (newRefParameterId != null)
				msgs = ((InternalEObject) newRefParameterId)
						.eInverseAdd(
								this,
								CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID,
								ParameterMst.class, msgs);
			msgs = basicSetRefParameterId(newRefParameterId, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID,
								newRefParameterId, newRefParameterId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID,
						newRefParameterId, newRefParameterId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMst getLinkId() {
		LinkMst obj = getRefLinkId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(LinkMst obj) {
		setRefLinkId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMst getParameterId() {
		ParameterMst obj = getRefParameterId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterId(ParameterMst obj) {
		setRefParameterId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclmsCollector getCollector() {
		return (CclmsCollector) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CclmsPackage.PARAMETER_VALUE__REF_LINK_ID:
			if (refLinkId != null)
				msgs = ((InternalEObject) refLinkId).eInverseRemove(this,
						CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID,
						LinkMst.class, msgs);
			return basicSetRefLinkId((LinkMst) otherEnd, msgs);
		case CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID:
			if (refParameterId != null)
				msgs = ((InternalEObject) refParameterId)
						.eInverseRemove(
								this,
								CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID,
								ParameterMst.class, msgs);
			return basicSetRefParameterId((ParameterMst) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case CclmsPackage.PARAMETER_VALUE__REF_LINK_ID:
			return basicSetRefLinkId(null, msgs);
		case CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID:
			return basicSetRefParameterId(null, msgs);
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
		case CclmsPackage.PARAMETER_VALUE__VALUE:
			return getValue();
		case CclmsPackage.PARAMETER_VALUE__REF_LINK_ID:
			return getRefLinkId();
		case CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID:
			return getRefParameterId();
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
		case CclmsPackage.PARAMETER_VALUE__VALUE:
			setValue((Double) newValue);
			return;
		case CclmsPackage.PARAMETER_VALUE__REF_LINK_ID:
			setRefLinkId((LinkMst) newValue);
			return;
		case CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID:
			setRefParameterId((ParameterMst) newValue);
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
		case CclmsPackage.PARAMETER_VALUE__VALUE:
			unsetValue();
			return;
		case CclmsPackage.PARAMETER_VALUE__REF_LINK_ID:
			setRefLinkId((LinkMst) null);
			return;
		case CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID:
			setRefParameterId((ParameterMst) null);
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
		case CclmsPackage.PARAMETER_VALUE__VALUE:
			return isSetValue();
		case CclmsPackage.PARAMETER_VALUE__REF_LINK_ID:
			return refLinkId != null;
		case CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID:
			return refParameterId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		if ((_booleanFlags & VALUE_ESETFLAG) != 0)
			result.append(value);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterValueImpl
