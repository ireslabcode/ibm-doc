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
public interface SegmentMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Id</em>' attribute.
	 * @see #isSetSegmentId()
	 * @see #unsetSegmentId()
	 * @see #setSegmentId(int)
	 * @generated
	 */
	int getSegmentId();

	/**
	 * Sets the value of the '{@link cclms.SegmentMst#getSegmentId <em>Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Id</em>' attribute.
	 * @see #isSetSegmentId()
	 * @see #unsetSegmentId()
	 * @see #getSegmentId()
	 * @generated
	 */
	void setSegmentId(int value);

	/**
	 * Unsets the value of the '{@link cclms.SegmentMst#getSegmentId <em>Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSegmentId()
	 * @see #getSegmentId()
	 * @see #setSegmentId(int)
	 * @generated
	 */
	void unsetSegmentId();

	/**
	 * Returns whether the value of the '{@link cclms.SegmentMst#getSegmentId <em>Segment Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Segment Id</em>' attribute is set.
	 * @see #unsetSegmentId()
	 * @see #getSegmentId()
	 * @see #setSegmentId(int)
	 * @generated
	 */
	boolean isSetSegmentId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getStartStationId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setStartStationId(StationMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getStopStationId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setStopStationId(StationMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainSegmentMst> getTrainSegmentMstSegmentId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // SegmentMst
