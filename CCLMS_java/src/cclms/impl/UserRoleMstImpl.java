/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.UserMst;
import cclms.UserRoleMst;

import ilog.odm.dom.impl.IloDomObjectImpl;

import ilog.odm.dom.impl.resource.IloDomObjectContainmentEList;
import ilog.odm.dom.impl.resource.IloDomObjectWithInverseEList;

import java.util.Collection;
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
 *   <li>{@link cclms.impl.UserRoleMstImpl#getUserRoleCd <em>User Role Cd</em>}</li>
 *   <li>{@link cclms.impl.UserRoleMstImpl#getUserRole <em>User Role</em>}</li>
 *   <li>{@link cclms.impl.UserRoleMstImpl#getRefUserMstUserRole <em>Ref User Mst User Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserRoleMstImpl extends IloDomObjectImpl implements UserRoleMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getUserRoleCd() <em>User Role Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoleCd()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ROLE_CD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserRoleCd() <em>User Role Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoleCd()
	 * @generated
	 * @ordered
	 */
	protected int userRoleCd = USER_ROLE_CD_EDEFAULT;

	/**
	 * The flag representing whether the User Role Cd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ROLE_CD_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getUserRole() <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRole()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserRole() <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRole()
	 * @generated
	 * @ordered
	 */
	protected String userRole = USER_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefUserMstUserRole() <em>Ref User Mst User Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefUserMstUserRole()
	 * @generated
	 * @ordered
	 */
	protected EList<UserMst> refUserMstUserRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserRoleMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getUserRoleMst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUserRoleCd() {
		return userRoleCd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRoleCd(int newUserRoleCd) {
		int oldUserRoleCd = userRoleCd;
		userRoleCd = newUserRoleCd;
		boolean oldUserRoleCdESet = (_booleanFlags & USER_ROLE_CD_ESETFLAG) != 0;
		_booleanFlags |= USER_ROLE_CD_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_ROLE_MST__USER_ROLE_CD,
								oldUserRoleCd, userRoleCd, !oldUserRoleCdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_ROLE_MST__USER_ROLE_CD,
						oldUserRoleCd, userRoleCd, !oldUserRoleCdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserRoleCd() {
		int oldUserRoleCd = userRoleCd;
		boolean oldUserRoleCdESet = (_booleanFlags & USER_ROLE_CD_ESETFLAG) != 0;
		userRoleCd = USER_ROLE_CD_EDEFAULT;
		_booleanFlags &= ~USER_ROLE_CD_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.USER_ROLE_MST__USER_ROLE_CD,
								oldUserRoleCd, USER_ROLE_CD_EDEFAULT,
								oldUserRoleCdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.USER_ROLE_MST__USER_ROLE_CD,
						oldUserRoleCd, USER_ROLE_CD_EDEFAULT, oldUserRoleCdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserRoleCd() {
		return (_booleanFlags & USER_ROLE_CD_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserRole() {
		return userRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRole(String newUserRole) {
		String oldUserRole = userRole;
		userRole = newUserRole;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_ROLE_MST__USER_ROLE,
								oldUserRole, userRole);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_ROLE_MST__USER_ROLE, oldUserRole,
						userRole));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserMst> getRefUserMstUserRole() {
		if (refUserMstUserRole == null) {
			refUserMstUserRole = new IloDomObjectWithInverseEList<UserMst>(
					UserMst.class, this,
					CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE,
					CclmsPackage.USER_MST__REF_USER_ROLE);
		}
		return refUserMstUserRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserMst> getUserMstUserRole() {
		return getRefUserMstUserRole();
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
		case CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefUserMstUserRole())
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
		case CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE:
			return ((InternalEList<?>) getRefUserMstUserRole()).basicRemove(
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
		case CclmsPackage.USER_ROLE_MST__USER_ROLE_CD:
			return getUserRoleCd();
		case CclmsPackage.USER_ROLE_MST__USER_ROLE:
			return getUserRole();
		case CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE:
			return getRefUserMstUserRole();
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
		case CclmsPackage.USER_ROLE_MST__USER_ROLE_CD:
			setUserRoleCd((Integer) newValue);
			return;
		case CclmsPackage.USER_ROLE_MST__USER_ROLE:
			setUserRole((String) newValue);
			return;
		case CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE:
			getRefUserMstUserRole().clear();
			getRefUserMstUserRole().addAll(
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
		case CclmsPackage.USER_ROLE_MST__USER_ROLE_CD:
			unsetUserRoleCd();
			return;
		case CclmsPackage.USER_ROLE_MST__USER_ROLE:
			setUserRole(USER_ROLE_EDEFAULT);
			return;
		case CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE:
			getRefUserMstUserRole().clear();
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
		case CclmsPackage.USER_ROLE_MST__USER_ROLE_CD:
			return isSetUserRoleCd();
		case CclmsPackage.USER_ROLE_MST__USER_ROLE:
			return USER_ROLE_EDEFAULT == null ? userRole != null
					: !USER_ROLE_EDEFAULT.equals(userRole);
		case CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE:
			return refUserMstUserRole != null && !refUserMstUserRole.isEmpty();
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
		result.append(" (userRoleCd: ");
		if ((_booleanFlags & USER_ROLE_CD_ESETFLAG) != 0)
			result.append(userRoleCd);
		else
			result.append("<unset>");
		result.append(", userRole: ");
		result.append(userRole);
		result.append(')');
		return result.toString();
	}

} //UserRoleMstImpl
