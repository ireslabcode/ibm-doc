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
public interface SegmentMstEngine extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Fromstation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fromstation</em>' attribute.
	 * @see #setFromstation(String)
	 * @generated
	 */
	String getFromstation();

	/**
	 * Sets the value of the '{@link cclms.SegmentMstEngine#getFromstation <em>Fromstation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fromstation</em>' attribute.
	 * @see #getFromstation()
	 * @generated
	 */
	void setFromstation(String value);

	/**
	 * Returns the value of the '<em><b>Tostation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tostation</em>' attribute.
	 * @see #setTostation(String)
	 * @generated
	 */
	String getTostation();

	/**
	 * Sets the value of the '{@link cclms.SegmentMstEngine#getTostation <em>Tostation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tostation</em>' attribute.
	 * @see #getTostation()
	 * @generated
	 */
	void setTostation(String value);

	/**
	 * Returns the value of the '<em><b>Segmentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segmentid</em>' attribute.
	 * @see #isSetSegmentid()
	 * @see #unsetSegmentid()
	 * @see #setSegmentid(int)
	 * @generated
	 */
	int getSegmentid();

	/**
	 * Sets the value of the '{@link cclms.SegmentMstEngine#getSegmentid <em>Segmentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segmentid</em>' attribute.
	 * @see #isSetSegmentid()
	 * @see #unsetSegmentid()
	 * @see #getSegmentid()
	 * @generated
	 */
	void setSegmentid(int value);

	/**
	 * Unsets the value of the '{@link cclms.SegmentMstEngine#getSegmentid <em>Segmentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSegmentid()
	 * @see #getSegmentid()
	 * @see #setSegmentid(int)
	 * @generated
	 */
	void unsetSegmentid();

	/**
	 * Returns whether the value of the '{@link cclms.SegmentMstEngine#getSegmentid <em>Segmentid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Segmentid</em>' attribute is set.
	 * @see #unsetSegmentid()
	 * @see #getSegmentid()
	 * @see #setSegmentid(int)
	 * @generated
	 */
	boolean isSetSegmentid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // SegmentMstEngine
