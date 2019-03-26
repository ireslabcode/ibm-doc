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
public interface DayMstEngine extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Day Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Id</em>' attribute.
	 * @see #isSetDayId()
	 * @see #unsetDayId()
	 * @see #setDayId(int)
	 * @generated
	 */
	int getDayId();

	/**
	 * Sets the value of the '{@link cclms.DayMstEngine#getDayId <em>Day Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Id</em>' attribute.
	 * @see #isSetDayId()
	 * @see #unsetDayId()
	 * @see #getDayId()
	 * @generated
	 */
	void setDayId(int value);

	/**
	 * Unsets the value of the '{@link cclms.DayMstEngine#getDayId <em>Day Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDayId()
	 * @see #getDayId()
	 * @see #setDayId(int)
	 * @generated
	 */
	void unsetDayId();

	/**
	 * Returns whether the value of the '{@link cclms.DayMstEngine#getDayId <em>Day Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day Id</em>' attribute is set.
	 * @see #unsetDayId()
	 * @see #getDayId()
	 * @see #setDayId(int)
	 * @generated
	 */
	boolean isSetDayId();

	/**
	 * Returns the value of the '<em><b>Day Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Desc</em>' attribute.
	 * @see #setDayDesc(String)
	 * @generated
	 */
	String getDayDesc();

	/**
	 * Sets the value of the '{@link cclms.DayMstEngine#getDayDesc <em>Day Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Desc</em>' attribute.
	 * @see #getDayDesc()
	 * @generated
	 */
	void setDayDesc(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // DayMstEngine
