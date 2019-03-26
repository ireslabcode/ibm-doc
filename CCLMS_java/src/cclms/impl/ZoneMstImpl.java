/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.DivisionMst;
import cclms.UserMst;
import cclms.ZoneMst;

import ilog.odm.dom.impl.IloDomObjectImpl;

import ilog.odm.dom.impl.resource.IloDomObjectContainmentEList;
import ilog.odm.dom.impl.resource.IloDomObjectWithInverseEList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cclms.impl.ZoneMstImpl#getZoneId <em>Zone Id</em>}</li>
 *   <li>{@link cclms.impl.ZoneMstImpl#getZoneCode <em>Zone Code</em>}</li>
 *   <li>{@link cclms.impl.ZoneMstImpl#getZoneDesc <em>Zone Desc</em>}</li>
 *   <li>{@link cclms.impl.ZoneMstImpl#getRefDivisionMstZoneId <em>Ref Division Mst Zone Id</em>}</li>
 *   <li>{@link cclms.impl.ZoneMstImpl#getRefUserMstZoneId <em>Ref User Mst Zone Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ZoneMstImpl extends IloDomObjectImpl implements ZoneMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getZoneId() <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneId()
	 * @generated
	 * @ordered
	 */
	protected static final int ZONE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZoneId() <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneId()
	 * @generated
	 * @ordered
	 */
	protected int zoneId = ZONE_ID_EDEFAULT;

	/**
	 * The flag representing whether the Zone Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ZONE_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getZoneCode() <em>Zone Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneCode() <em>Zone Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneCode()
	 * @generated
	 * @ordered
	 */
	protected String zoneCode = ZONE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoneDesc() <em>Zone Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoneDesc() <em>Zone Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneDesc()
	 * @generated
	 * @ordered
	 */
	protected String zoneDesc = ZONE_DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefDivisionMstZoneId() <em>Ref Division Mst Zone Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDivisionMstZoneId()
	 * @generated
	 * @ordered
	 */
	protected EList<DivisionMst> refDivisionMstZoneId;

	/**
	 * The cached value of the '{@link #getRefUserMstZoneId() <em>Ref User Mst Zone Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefUserMstZoneId()
	 * @generated
	 * @ordered
	 */
	protected EList<UserMst> refUserMstZoneId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getZoneMst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZoneId() {
		return zoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneId(int newZoneId) {
		int oldZoneId = zoneId;
		zoneId = newZoneId;
		boolean oldZoneIdESet = (_booleanFlags & ZONE_ID_ESETFLAG) != 0;
		_booleanFlags |= ZONE_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.ZONE_MST__ZONE_ID, oldZoneId,
								zoneId, !oldZoneIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.ZONE_MST__ZONE_ID, oldZoneId, zoneId,
						!oldZoneIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetZoneId() {
		int oldZoneId = zoneId;
		boolean oldZoneIdESet = (_booleanFlags & ZONE_ID_ESETFLAG) != 0;
		zoneId = ZONE_ID_EDEFAULT;
		_booleanFlags &= ~ZONE_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.ZONE_MST__ZONE_ID, oldZoneId,
								ZONE_ID_EDEFAULT, oldZoneIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.ZONE_MST__ZONE_ID, oldZoneId,
						ZONE_ID_EDEFAULT, oldZoneIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetZoneId() {
		return (_booleanFlags & ZONE_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZoneCode() {
		return zoneCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneCode(String newZoneCode) {
		String oldZoneCode = zoneCode;
		zoneCode = newZoneCode;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.ZONE_MST__ZONE_CODE, oldZoneCode,
								zoneCode);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.ZONE_MST__ZONE_CODE, oldZoneCode, zoneCode));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZoneDesc() {
		return zoneDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneDesc(String newZoneDesc) {
		String oldZoneDesc = zoneDesc;
		zoneDesc = newZoneDesc;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.ZONE_MST__ZONE_DESC, oldZoneDesc,
								zoneDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.ZONE_MST__ZONE_DESC, oldZoneDesc, zoneDesc));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DivisionMst> getRefDivisionMstZoneId() {
		if (refDivisionMstZoneId == null) {
			refDivisionMstZoneId = new IloDomObjectWithInverseEList<DivisionMst>(
					DivisionMst.class, this,
					CclmsPackage.ZONE_MST__REF_DIVISION_MST_ZONE_ID,
					CclmsPackage.DIVISION_MST__REF_ZONE_ID);
		}
		return refDivisionMstZoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserMst> getRefUserMstZoneId() {
		if (refUserMstZoneId == null) {
			refUserMstZoneId = new IloDomObjectWithInverseEList<UserMst>(
					UserMst.class, this,
					CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID,
					CclmsPackage.USER_MST__REF_ZONE_ID);
		}
		return refUserMstZoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DivisionMst> getDivisionMstZoneId() {
		return getRefDivisionMstZoneId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserMst> getUserMstZoneId() {
		return getRefUserMstZoneId();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CclmsPackage.ZONE_MST__REF_DIVISION_MST_ZONE_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefDivisionMstZoneId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefUserMstZoneId())
					.basicAdd(otherEnd, msgs);
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
		case CclmsPackage.ZONE_MST__REF_DIVISION_MST_ZONE_ID:
			return ((InternalEList<?>) getRefDivisionMstZoneId()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID:
			return ((InternalEList<?>) getRefUserMstZoneId()).basicRemove(
					otherEnd, msgs);
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
		case CclmsPackage.ZONE_MST__ZONE_ID:
			return getZoneId();
		case CclmsPackage.ZONE_MST__ZONE_CODE:
			return getZoneCode();
		case CclmsPackage.ZONE_MST__ZONE_DESC:
			return getZoneDesc();
		case CclmsPackage.ZONE_MST__REF_DIVISION_MST_ZONE_ID:
			return getRefDivisionMstZoneId();
		case CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID:
			return getRefUserMstZoneId();
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
		case CclmsPackage.ZONE_MST__ZONE_ID:
			setZoneId((Integer) newValue);
			return;
		case CclmsPackage.ZONE_MST__ZONE_CODE:
			setZoneCode((String) newValue);
			return;
		case CclmsPackage.ZONE_MST__ZONE_DESC:
			setZoneDesc((String) newValue);
			return;
		case CclmsPackage.ZONE_MST__REF_DIVISION_MST_ZONE_ID:
			getRefDivisionMstZoneId().clear();
			getRefDivisionMstZoneId().addAll(
					(Collection<? extends DivisionMst>) newValue);
			return;
		case CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID:
			getRefUserMstZoneId().clear();
			getRefUserMstZoneId().addAll(
					(Collection<? extends UserMst>) newValue);
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
		case CclmsPackage.ZONE_MST__ZONE_ID:
			unsetZoneId();
			return;
		case CclmsPackage.ZONE_MST__ZONE_CODE:
			setZoneCode(ZONE_CODE_EDEFAULT);
			return;
		case CclmsPackage.ZONE_MST__ZONE_DESC:
			setZoneDesc(ZONE_DESC_EDEFAULT);
			return;
		case CclmsPackage.ZONE_MST__REF_DIVISION_MST_ZONE_ID:
			getRefDivisionMstZoneId().clear();
			return;
		case CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID:
			getRefUserMstZoneId().clear();
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
		case CclmsPackage.ZONE_MST__ZONE_ID:
			return isSetZoneId();
		case CclmsPackage.ZONE_MST__ZONE_CODE:
			return ZONE_CODE_EDEFAULT == null ? zoneCode != null
					: !ZONE_CODE_EDEFAULT.equals(zoneCode);
		case CclmsPackage.ZONE_MST__ZONE_DESC:
			return ZONE_DESC_EDEFAULT == null ? zoneDesc != null
					: !ZONE_DESC_EDEFAULT.equals(zoneDesc);
		case CclmsPackage.ZONE_MST__REF_DIVISION_MST_ZONE_ID:
			return refDivisionMstZoneId != null
					&& !refDivisionMstZoneId.isEmpty();
		case CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID:
			return refUserMstZoneId != null && !refUserMstZoneId.isEmpty();
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
		result.append(" (zoneId: ");
		if ((_booleanFlags & ZONE_ID_ESETFLAG) != 0)
			result.append(zoneId);
		else
			result.append("<unset>");
		result.append(", zoneCode: ");
		result.append(zoneCode);
		result.append(", zoneDesc: ");
		result.append(zoneDesc);
		result.append(')');
		return result.toString();
	}

} //ZoneMstImpl
