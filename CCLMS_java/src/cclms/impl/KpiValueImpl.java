/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.KpiMst;
import cclms.KpiValue;
import cclms.LinkMst;
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
 *   <li>{@link cclms.impl.KpiValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link cclms.impl.KpiValueImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link cclms.impl.KpiValueImpl#getRefKpiId <em>Ref Kpi Id</em>}</li>
 *   <li>{@link cclms.impl.KpiValueImpl#getRefLinkId <em>Ref Link Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KpiValueImpl extends IloDomObjectImpl implements KpiValue {
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
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATED_BY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected int createdBy = CREATED_BY_EDEFAULT;

	/**
	 * The flag representing whether the Created By attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CREATED_BY_ESETFLAG = 1 << 1;

	/**
	 * The cached value of the '{@link #getRefKpiId() <em>Ref Kpi Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefKpiId()
	 * @generated
	 * @ordered
	 */
	protected KpiMst refKpiId;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KpiValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.KPI_VALUE;
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
								CclmsPackage.KPI_VALUE__VALUE, oldValue, value,
								!oldValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_VALUE__VALUE, oldValue, value,
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
								CclmsPackage.KPI_VALUE__VALUE, oldValue,
								VALUE_EDEFAULT, oldValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.KPI_VALUE__VALUE, oldValue,
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
	public KpiMst getRefKpiId() {
		return refKpiId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefKpiId(KpiMst newRefKpiId,
			NotificationChain msgs) {
		KpiMst oldRefKpiId = refKpiId;
		refKpiId = newRefKpiId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.KPI_VALUE__REF_KPI_ID,
								oldRefKpiId, newRefKpiId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_VALUE__REF_KPI_ID, oldRefKpiId,
						newRefKpiId);
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
	public void setRefKpiId(KpiMst newRefKpiId) {
		if (newRefKpiId != refKpiId) {
			NotificationChain msgs = null;
			if (refKpiId != null)
				msgs = ((InternalEObject) refKpiId).eInverseRemove(this,
						CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID,
						KpiMst.class, msgs);
			if (newRefKpiId != null)
				msgs = ((InternalEObject) newRefKpiId).eInverseAdd(this,
						CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID,
						KpiMst.class, msgs);
			msgs = basicSetRefKpiId(newRefKpiId, msgs);
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
								CclmsPackage.KPI_VALUE__REF_KPI_ID,
								newRefKpiId, newRefKpiId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_VALUE__REF_KPI_ID, newRefKpiId,
						newRefKpiId));
			}
		}
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
								CclmsPackage.KPI_VALUE__REF_LINK_ID,
								oldRefLinkId, newRefLinkId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_VALUE__REF_LINK_ID, oldRefLinkId,
						newRefLinkId);
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
						CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID,
						LinkMst.class, msgs);
			if (newRefLinkId != null)
				msgs = ((InternalEObject) newRefLinkId).eInverseAdd(this,
						CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID,
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
								CclmsPackage.KPI_VALUE__REF_LINK_ID,
								newRefLinkId, newRefLinkId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_VALUE__REF_LINK_ID, newRefLinkId,
						newRefLinkId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiMst getKpiId() {
		KpiMst obj = getRefKpiId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpiId(KpiMst obj) {
		setRefKpiId(obj);
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
	public int getCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(int newCreatedBy) {
		int oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		boolean oldCreatedByESet = (_booleanFlags & CREATED_BY_ESETFLAG) != 0;
		_booleanFlags |= CREATED_BY_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.KPI_VALUE__CREATED_BY,
								oldCreatedBy, createdBy, !oldCreatedByESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_VALUE__CREATED_BY, oldCreatedBy,
						createdBy, !oldCreatedByESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreatedBy() {
		int oldCreatedBy = createdBy;
		boolean oldCreatedByESet = (_booleanFlags & CREATED_BY_ESETFLAG) != 0;
		createdBy = CREATED_BY_EDEFAULT;
		_booleanFlags &= ~CREATED_BY_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.KPI_VALUE__CREATED_BY,
								oldCreatedBy, CREATED_BY_EDEFAULT,
								oldCreatedByESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.KPI_VALUE__CREATED_BY, oldCreatedBy,
						CREATED_BY_EDEFAULT, oldCreatedByESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreatedBy() {
		return (_booleanFlags & CREATED_BY_ESETFLAG) != 0;
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
		case CclmsPackage.KPI_VALUE__REF_KPI_ID:
			if (refKpiId != null)
				msgs = ((InternalEObject) refKpiId).eInverseRemove(this,
						CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID,
						KpiMst.class, msgs);
			return basicSetRefKpiId((KpiMst) otherEnd, msgs);
		case CclmsPackage.KPI_VALUE__REF_LINK_ID:
			if (refLinkId != null)
				msgs = ((InternalEObject) refLinkId).eInverseRemove(this,
						CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID,
						LinkMst.class, msgs);
			return basicSetRefLinkId((LinkMst) otherEnd, msgs);
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
		case CclmsPackage.KPI_VALUE__REF_KPI_ID:
			return basicSetRefKpiId(null, msgs);
		case CclmsPackage.KPI_VALUE__REF_LINK_ID:
			return basicSetRefLinkId(null, msgs);
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
		case CclmsPackage.KPI_VALUE__VALUE:
			return getValue();
		case CclmsPackage.KPI_VALUE__CREATED_BY:
			return getCreatedBy();
		case CclmsPackage.KPI_VALUE__REF_KPI_ID:
			return getRefKpiId();
		case CclmsPackage.KPI_VALUE__REF_LINK_ID:
			return getRefLinkId();
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
		case CclmsPackage.KPI_VALUE__VALUE:
			setValue((Double) newValue);
			return;
		case CclmsPackage.KPI_VALUE__CREATED_BY:
			setCreatedBy((Integer) newValue);
			return;
		case CclmsPackage.KPI_VALUE__REF_KPI_ID:
			setRefKpiId((KpiMst) newValue);
			return;
		case CclmsPackage.KPI_VALUE__REF_LINK_ID:
			setRefLinkId((LinkMst) newValue);
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
		case CclmsPackage.KPI_VALUE__VALUE:
			unsetValue();
			return;
		case CclmsPackage.KPI_VALUE__CREATED_BY:
			unsetCreatedBy();
			return;
		case CclmsPackage.KPI_VALUE__REF_KPI_ID:
			setRefKpiId((KpiMst) null);
			return;
		case CclmsPackage.KPI_VALUE__REF_LINK_ID:
			setRefLinkId((LinkMst) null);
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
		case CclmsPackage.KPI_VALUE__VALUE:
			return isSetValue();
		case CclmsPackage.KPI_VALUE__CREATED_BY:
			return isSetCreatedBy();
		case CclmsPackage.KPI_VALUE__REF_KPI_ID:
			return refKpiId != null;
		case CclmsPackage.KPI_VALUE__REF_LINK_ID:
			return refLinkId != null;
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
		result.append(", createdBy: ");
		if ((_booleanFlags & CREATED_BY_ESETFLAG) != 0)
			result.append(createdBy);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KpiValueImpl
