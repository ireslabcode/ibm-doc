/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.DivisionMst;
import cclms.KpiValue;
import cclms.LinkMst;
import cclms.ParameterMst;
import cclms.ParameterValue;
import cclms.SegmentMst;
import cclms.StationMst;
import cclms.TrainSegmentMst;
import cclms.TrainTypeMappingMst;
import cclms.TrainTypeMst;
import cclms.UserMst;
import cclms.UserRoleMst;
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
 *   <li>{@link cclms.impl.UserMstImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getUser <em>User</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getDivisionId <em>Division Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserMstImpl extends IloDomObjectImpl implements UserMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected int userId = USER_ID_EDEFAULT;

	/**
	 * The flag representing whether the User Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDivisionId() <em>Division Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivisionId()
	 * @generated
	 * @ordered
	 */
	protected static final int DIVISION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDivisionId() <em>Division Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivisionId()
	 * @generated
	 * @ordered
	 */
	protected int divisionId = DIVISION_ID_EDEFAULT;

	/**
	 * The flag representing whether the Division Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DIVISION_ID_ESETFLAG = 1 << 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.USER_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(int newUserId) {
		int oldUserId = userId;
		userId = newUserId;
		boolean oldUserIdESet = (_booleanFlags & USER_ID_ESETFLAG) != 0;
		_booleanFlags |= USER_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_MST__USER_ID, oldUserId,
								userId, !oldUserIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__USER_ID, oldUserId, userId,
						!oldUserIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserId() {
		int oldUserId = userId;
		boolean oldUserIdESet = (_booleanFlags & USER_ID_ESETFLAG) != 0;
		userId = USER_ID_EDEFAULT;
		_booleanFlags &= ~USER_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.USER_MST__USER_ID, oldUserId,
								USER_ID_EDEFAULT, oldUserIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.USER_MST__USER_ID, oldUserId,
						USER_ID_EDEFAULT, oldUserIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserId() {
		return (_booleanFlags & USER_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET, CclmsPackage.USER_MST__USER,
								oldUser, user);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__USER, oldUser, user));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDivisionId() {
		return divisionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivisionId(int newDivisionId) {
		int oldDivisionId = divisionId;
		divisionId = newDivisionId;
		boolean oldDivisionIdESet = (_booleanFlags & DIVISION_ID_ESETFLAG) != 0;
		_booleanFlags |= DIVISION_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_MST__DIVISION_ID,
								oldDivisionId, divisionId, !oldDivisionIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__DIVISION_ID, oldDivisionId,
						divisionId, !oldDivisionIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDivisionId() {
		int oldDivisionId = divisionId;
		boolean oldDivisionIdESet = (_booleanFlags & DIVISION_ID_ESETFLAG) != 0;
		divisionId = DIVISION_ID_EDEFAULT;
		_booleanFlags &= ~DIVISION_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.USER_MST__DIVISION_ID,
								oldDivisionId, DIVISION_ID_EDEFAULT,
								oldDivisionIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.USER_MST__DIVISION_ID, oldDivisionId,
						DIVISION_ID_EDEFAULT, oldDivisionIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDivisionId() {
		return (_booleanFlags & DIVISION_ID_ESETFLAG) != 0;
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
		case CclmsPackage.USER_MST__USER_ID:
			return getUserId();
		case CclmsPackage.USER_MST__USER:
			return getUser();
		case CclmsPackage.USER_MST__DIVISION_ID:
			return getDivisionId();
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
		case CclmsPackage.USER_MST__USER_ID:
			setUserId((Integer) newValue);
			return;
		case CclmsPackage.USER_MST__USER:
			setUser((String) newValue);
			return;
		case CclmsPackage.USER_MST__DIVISION_ID:
			setDivisionId((Integer) newValue);
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
		case CclmsPackage.USER_MST__USER_ID:
			unsetUserId();
			return;
		case CclmsPackage.USER_MST__USER:
			setUser(USER_EDEFAULT);
			return;
		case CclmsPackage.USER_MST__DIVISION_ID:
			unsetDivisionId();
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
		case CclmsPackage.USER_MST__USER_ID:
			return isSetUserId();
		case CclmsPackage.USER_MST__USER:
			return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT
					.equals(user);
		case CclmsPackage.USER_MST__DIVISION_ID:
			return isSetDivisionId();
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
		result.append(" (userId: ");
		if ((_booleanFlags & USER_ID_ESETFLAG) != 0)
			result.append(userId);
		else
			result.append("<unset>");
		result.append(", user: ");
		result.append(user);
		result.append(", divisionId: ");
		if ((_booleanFlags & DIVISION_ID_ESETFLAG) != 0)
			result.append(divisionId);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserMstImpl
