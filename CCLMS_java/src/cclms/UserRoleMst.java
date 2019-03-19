/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface UserRoleMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>User Role Cd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Role Cd</em>' attribute.
	 * @see #isSetUserRoleCd()
	 * @see #unsetUserRoleCd()
	 * @see #setUserRoleCd(int)
	 * @generated
	 */
	int getUserRoleCd();

	/**
	 * Sets the value of the '{@link cclms.UserRoleMst#getUserRoleCd <em>User Role Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Role Cd</em>' attribute.
	 * @see #isSetUserRoleCd()
	 * @see #unsetUserRoleCd()
	 * @see #getUserRoleCd()
	 * @generated
	 */
	void setUserRoleCd(int value);

	/**
	 * Unsets the value of the '{@link cclms.UserRoleMst#getUserRoleCd <em>User Role Cd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserRoleCd()
	 * @see #getUserRoleCd()
	 * @see #setUserRoleCd(int)
	 * @generated
	 */
	void unsetUserRoleCd();

	/**
	 * Returns whether the value of the '{@link cclms.UserRoleMst#getUserRoleCd <em>User Role Cd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Role Cd</em>' attribute is set.
	 * @see #unsetUserRoleCd()
	 * @see #getUserRoleCd()
	 * @see #setUserRoleCd(int)
	 * @generated
	 */
	boolean isSetUserRoleCd();

	/**
	 * Returns the value of the '<em><b>User Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Role</em>' attribute.
	 * @see #setUserRole(String)
	 * @generated
	 */
	String getUserRole();

	/**
	 * Sets the value of the '{@link cclms.UserRoleMst#getUserRole <em>User Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Role</em>' attribute.
	 * @see #getUserRole()
	 * @generated
	 */
	void setUserRole(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<UserMst> getUserMstUserRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // UserRoleMst
