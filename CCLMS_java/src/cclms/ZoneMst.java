/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;
import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface ZoneMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Id</em>' attribute.
	 * @see #isSetZoneId()
	 * @see #unsetZoneId()
	 * @see #setZoneId(int)
	 * @generated
	 */
	int getZoneId();

	/**
	 * Sets the value of the '{@link cclms.ZoneMst#getZoneId <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Id</em>' attribute.
	 * @see #isSetZoneId()
	 * @see #unsetZoneId()
	 * @see #getZoneId()
	 * @generated
	 */
	void setZoneId(int value);

	/**
	 * Unsets the value of the '{@link cclms.ZoneMst#getZoneId <em>Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoneId()
	 * @see #getZoneId()
	 * @see #setZoneId(int)
	 * @generated
	 */
	void unsetZoneId();

	/**
	 * Returns whether the value of the '{@link cclms.ZoneMst#getZoneId <em>Zone Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zone Id</em>' attribute is set.
	 * @see #unsetZoneId()
	 * @see #getZoneId()
	 * @see #setZoneId(int)
	 * @generated
	 */
	boolean isSetZoneId();

	/**
	 * Returns the value of the '<em><b>Zone Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Code</em>' attribute.
	 * @see #setZoneCode(String)
	 * @generated
	 */
	String getZoneCode();

	/**
	 * Sets the value of the '{@link cclms.ZoneMst#getZoneCode <em>Zone Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Code</em>' attribute.
	 * @see #getZoneCode()
	 * @generated
	 */
	void setZoneCode(String value);

	/**
	 * Returns the value of the '<em><b>Zone Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Desc</em>' attribute.
	 * @see #setZoneDesc(String)
	 * @generated
	 */
	String getZoneDesc();

	/**
	 * Sets the value of the '{@link cclms.ZoneMst#getZoneDesc <em>Zone Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Desc</em>' attribute.
	 * @see #getZoneDesc()
	 * @generated
	 */
	void setZoneDesc(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<DivisionMst> getDivisionMstZoneId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<UserMst> getUserMstZoneId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // ZoneMst
