/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.SegmentMstEngine;

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
 *   <li>{@link cclms.impl.SegmentMstEngineImpl#getFromstation <em>Fromstation</em>}</li>
 *   <li>{@link cclms.impl.SegmentMstEngineImpl#getTostation <em>Tostation</em>}</li>
 *   <li>{@link cclms.impl.SegmentMstEngineImpl#getSegmentid <em>Segmentid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentMstEngineImpl extends IloDomObjectImpl implements
		SegmentMstEngine {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getFromstation() <em>Fromstation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromstation()
	 * @generated
	 * @ordered
	 */
	protected static final String FROMSTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromstation() <em>Fromstation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromstation()
	 * @generated
	 * @ordered
	 */
	protected String fromstation = FROMSTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTostation() <em>Tostation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTostation()
	 * @generated
	 * @ordered
	 */
	protected static final String TOSTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTostation() <em>Tostation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTostation()
	 * @generated
	 * @ordered
	 */
	protected String tostation = TOSTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSegmentid() <em>Segmentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentid()
	 * @generated
	 * @ordered
	 */
	protected static final int SEGMENTID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSegmentid() <em>Segmentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentid()
	 * @generated
	 * @ordered
	 */
	protected int segmentid = SEGMENTID_EDEFAULT;

	/**
	 * The flag representing whether the Segmentid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SEGMENTID_ESETFLAG = 1 << 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentMstEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.SEGMENT_MST_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromstation() {
		return fromstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromstation(String newFromstation) {
		String oldFromstation = fromstation;
		fromstation = newFromstation;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.SEGMENT_MST_ENGINE__FROMSTATION,
								oldFromstation, fromstation);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST_ENGINE__FROMSTATION,
						oldFromstation, fromstation));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTostation() {
		return tostation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTostation(String newTostation) {
		String oldTostation = tostation;
		tostation = newTostation;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.SEGMENT_MST_ENGINE__TOSTATION,
								oldTostation, tostation);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST_ENGINE__TOSTATION,
						oldTostation, tostation));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSegmentid() {
		return segmentid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentid(int newSegmentid) {
		int oldSegmentid = segmentid;
		segmentid = newSegmentid;
		boolean oldSegmentidESet = (_booleanFlags & SEGMENTID_ESETFLAG) != 0;
		_booleanFlags |= SEGMENTID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID,
								oldSegmentid, segmentid, !oldSegmentidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID,
						oldSegmentid, segmentid, !oldSegmentidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSegmentid() {
		int oldSegmentid = segmentid;
		boolean oldSegmentidESet = (_booleanFlags & SEGMENTID_ESETFLAG) != 0;
		segmentid = SEGMENTID_EDEFAULT;
		_booleanFlags &= ~SEGMENTID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID,
								oldSegmentid, SEGMENTID_EDEFAULT,
								oldSegmentidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID,
						oldSegmentid, SEGMENTID_EDEFAULT, oldSegmentidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSegmentid() {
		return (_booleanFlags & SEGMENTID_ESETFLAG) != 0;
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
		case CclmsPackage.SEGMENT_MST_ENGINE__FROMSTATION:
			return getFromstation();
		case CclmsPackage.SEGMENT_MST_ENGINE__TOSTATION:
			return getTostation();
		case CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID:
			return getSegmentid();
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
		case CclmsPackage.SEGMENT_MST_ENGINE__FROMSTATION:
			setFromstation((String) newValue);
			return;
		case CclmsPackage.SEGMENT_MST_ENGINE__TOSTATION:
			setTostation((String) newValue);
			return;
		case CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID:
			setSegmentid((Integer) newValue);
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
		case CclmsPackage.SEGMENT_MST_ENGINE__FROMSTATION:
			setFromstation(FROMSTATION_EDEFAULT);
			return;
		case CclmsPackage.SEGMENT_MST_ENGINE__TOSTATION:
			setTostation(TOSTATION_EDEFAULT);
			return;
		case CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID:
			unsetSegmentid();
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
		case CclmsPackage.SEGMENT_MST_ENGINE__FROMSTATION:
			return FROMSTATION_EDEFAULT == null ? fromstation != null
					: !FROMSTATION_EDEFAULT.equals(fromstation);
		case CclmsPackage.SEGMENT_MST_ENGINE__TOSTATION:
			return TOSTATION_EDEFAULT == null ? tostation != null
					: !TOSTATION_EDEFAULT.equals(tostation);
		case CclmsPackage.SEGMENT_MST_ENGINE__SEGMENTID:
			return isSetSegmentid();
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
		result.append(" (fromstation: ");
		result.append(fromstation);
		result.append(", tostation: ");
		result.append(tostation);
		result.append(", segmentid: ");
		if ((_booleanFlags & SEGMENTID_ESETFLAG) != 0)
			result.append(segmentid);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SegmentMstEngineImpl
