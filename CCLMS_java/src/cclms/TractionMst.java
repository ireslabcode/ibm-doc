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
public interface TractionMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Traction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traction Type</em>' attribute.
	 * @see #isSetTractionType()
	 * @see #unsetTractionType()
	 * @see #setTractionType(int)
	 * @generated
	 */
	int getTractionType();

	/**
	 * Sets the value of the '{@link cclms.TractionMst#getTractionType <em>Traction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traction Type</em>' attribute.
	 * @see #isSetTractionType()
	 * @see #unsetTractionType()
	 * @see #getTractionType()
	 * @generated
	 */
	void setTractionType(int value);

	/**
	 * Unsets the value of the '{@link cclms.TractionMst#getTractionType <em>Traction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTractionType()
	 * @see #getTractionType()
	 * @see #setTractionType(int)
	 * @generated
	 */
	void unsetTractionType();

	/**
	 * Returns whether the value of the '{@link cclms.TractionMst#getTractionType <em>Traction Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Traction Type</em>' attribute is set.
	 * @see #unsetTractionType()
	 * @see #getTractionType()
	 * @see #setTractionType(int)
	 * @generated
	 */
	boolean isSetTractionType();

	/**
	 * Returns the value of the '<em><b>Traction Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traction Desc</em>' attribute.
	 * @see #setTractionDesc(String)
	 * @generated
	 */
	String getTractionDesc();

	/**
	 * Sets the value of the '{@link cclms.TractionMst#getTractionDesc <em>Traction Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traction Desc</em>' attribute.
	 * @see #getTractionDesc()
	 * @generated
	 */
	void setTractionDesc(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainSegmentMst> getTrainSegmentMstTractionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkMst> getLinkMstTractionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // TractionMst
