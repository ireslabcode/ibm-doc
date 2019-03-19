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
public interface DivisionMst extends IloDomObject {
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
	 * Sets the value of the '{@link cclms.DivisionMst#getDivisionId <em>Division Id</em>}' attribute.
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
	 * Unsets the value of the '{@link cclms.DivisionMst#getDivisionId <em>Division Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDivisionId()
	 * @see #getDivisionId()
	 * @see #setDivisionId(int)
	 * @generated
	 */
	void unsetDivisionId();

	/**
	 * Returns whether the value of the '{@link cclms.DivisionMst#getDivisionId <em>Division Id</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Division Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division Code</em>' attribute.
	 * @see #setDivisionCode(String)
	 * @generated
	 */
	String getDivisionCode();

	/**
	 * Sets the value of the '{@link cclms.DivisionMst#getDivisionCode <em>Division Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division Code</em>' attribute.
	 * @see #getDivisionCode()
	 * @generated
	 */
	void setDivisionCode(String value);

	/**
	 * Returns the value of the '<em><b>Division Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division Desc</em>' attribute.
	 * @see #setDivisionDesc(String)
	 * @generated
	 */
	String getDivisionDesc();

	/**
	 * Sets the value of the '{@link cclms.DivisionMst#getDivisionDesc <em>Division Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Division Desc</em>' attribute.
	 * @see #getDivisionDesc()
	 * @generated
	 */
	void setDivisionDesc(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<StationMst> getStationMstDivisionId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZoneMst getZoneId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setZoneId(ZoneMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<UserMst> getUserMstDivisionId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // DivisionMst
