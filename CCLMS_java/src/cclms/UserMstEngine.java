/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface UserMstEngine extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #isSetUserId()
	 * @see #unsetUserId()
	 * @see #setUserId(int)
	 * @generated
	 */
	int getUserId();

	/**
	 * Sets the value of the '{@link cclms.UserMstEngine#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #isSetUserId()
	 * @see #unsetUserId()
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(int value);

	/**
	 * Unsets the value of the '{@link cclms.UserMstEngine#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserId()
	 * @see #getUserId()
	 * @see #setUserId(int)
	 * @generated
	 */
	void unsetUserId();

	/**
	 * Returns whether the value of the '{@link cclms.UserMstEngine#getUserId <em>User Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Id</em>' attribute is set.
	 * @see #unsetUserId()
	 * @see #getUserId()
	 * @see #setUserId(int)
	 * @generated
	 */
	boolean isSetUserId();

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link cclms.UserMstEngine#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Division Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division Id</em>' attribute.
	 * @see #isSetDivisionId()
	 * @see #unsetDivisionId()
	 * @see #setDivisionId(int)
	 * @generated
	 */
	int getDivisionId();

	/**
	 * Sets the value of the '{@link cclms.UserMstEngine#getDivisionId <em>Division Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division Id</em>' attribute.
	 * @see #isSetDivisionId()
	 * @see #unsetDivisionId()
	 * @see #getDivisionId()
	 * @generated
	 */
	void setDivisionId(int value);

	/**
	 * Unsets the value of the '{@link cclms.UserMstEngine#getDivisionId <em>Division Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDivisionId()
	 * @see #getDivisionId()
	 * @see #setDivisionId(int)
	 * @generated
	 */
	void unsetDivisionId();

	/**
	 * Returns whether the value of the '{@link cclms.UserMstEngine#getDivisionId <em>Division Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Division Id</em>' attribute is set.
	 * @see #unsetDivisionId()
	 * @see #getDivisionId()
	 * @see #setDivisionId(int)
	 * @generated
	 */
	boolean isSetDivisionId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // UserMstEngine
