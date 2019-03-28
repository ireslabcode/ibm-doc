/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.DayMstEngine;

import ilog.odm.dom.impl.IloDomObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cclms.impl.DayMstEngineImpl#getDayId <em>Day Id</em>}</li>
 *   <li>{@link cclms.impl.DayMstEngineImpl#getDayDesc <em>Day Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DayMstEngineImpl extends IloDomObjectImpl implements DayMstEngine {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getDayId() <em>Day Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayId()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDayId() <em>Day Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayId()
	 * @generated
	 * @ordered
	 */
	protected int dayId = DAY_ID_EDEFAULT;

	/**
	 * The flag representing whether the Day Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getDayDesc() <em>Day Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayDesc() <em>Day Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayDesc()
	 * @generated
	 * @ordered
	 */
	protected String dayDesc = DAY_DESC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DayMstEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.DAY_MST_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDayId() {
		return dayId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayId(int newDayId) {
		int oldDayId = dayId;
		dayId = newDayId;
		boolean oldDayIdESet = (_booleanFlags & DAY_ID_ESETFLAG) != 0;
		_booleanFlags |= DAY_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.DAY_MST_ENGINE__DAY_ID, oldDayId,
								dayId, !oldDayIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.DAY_MST_ENGINE__DAY_ID, oldDayId, dayId,
						!oldDayIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayId() {
		int oldDayId = dayId;
		boolean oldDayIdESet = (_booleanFlags & DAY_ID_ESETFLAG) != 0;
		dayId = DAY_ID_EDEFAULT;
		_booleanFlags &= ~DAY_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.DAY_MST_ENGINE__DAY_ID, oldDayId,
								DAY_ID_EDEFAULT, oldDayIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.DAY_MST_ENGINE__DAY_ID, oldDayId,
						DAY_ID_EDEFAULT, oldDayIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDayId() {
		return (_booleanFlags & DAY_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDayDesc() {
		return dayDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayDesc(String newDayDesc) {
		String oldDayDesc = dayDesc;
		dayDesc = newDayDesc;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.DAY_MST_ENGINE__DAY_DESC,
								oldDayDesc, dayDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.DAY_MST_ENGINE__DAY_DESC, oldDayDesc,
						dayDesc));
			}
		}
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CclmsPackage.DAY_MST_ENGINE__DAY_ID:
			return getDayId();
		case CclmsPackage.DAY_MST_ENGINE__DAY_DESC:
			return getDayDesc();
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
		case CclmsPackage.DAY_MST_ENGINE__DAY_ID:
			setDayId((Integer) newValue);
			return;
		case CclmsPackage.DAY_MST_ENGINE__DAY_DESC:
			setDayDesc((String) newValue);
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
		case CclmsPackage.DAY_MST_ENGINE__DAY_ID:
			unsetDayId();
			return;
		case CclmsPackage.DAY_MST_ENGINE__DAY_DESC:
			setDayDesc(DAY_DESC_EDEFAULT);
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
		case CclmsPackage.DAY_MST_ENGINE__DAY_ID:
			return isSetDayId();
		case CclmsPackage.DAY_MST_ENGINE__DAY_DESC:
			return DAY_DESC_EDEFAULT == null ? dayDesc != null
					: !DAY_DESC_EDEFAULT.equals(dayDesc);
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
		result.append(" (dayId: ");
		if ((_booleanFlags & DAY_ID_ESETFLAG) != 0)
			result.append(dayId);
		else
			result.append("<unset>");
		result.append(", dayDesc: ");
		result.append(dayDesc);
		result.append(')');
		return result.toString();
	}

} //DayMstEngineImpl
