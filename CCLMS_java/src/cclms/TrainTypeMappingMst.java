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
public interface TrainTypeMappingMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Train Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Type</em>' attribute.
	 * @see #setTrainType(String)
	 * @generated
	 */
	String getTrainType();

	/**
	 * Sets the value of the '{@link cclms.TrainTypeMappingMst#getTrainType <em>Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Type</em>' attribute.
	 * @see #getTrainType()
	 * @generated
	 */
	void setTrainType(String value);

	/**
	 * Returns the value of the '<em><b>Train Type Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Type Desc</em>' attribute.
	 * @see #setTrainTypeDesc(String)
	 * @generated
	 */
	String getTrainTypeDesc();

	/**
	 * Sets the value of the '{@link cclms.TrainTypeMappingMst#getTrainTypeDesc <em>Train Type Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Type Desc</em>' attribute.
	 * @see #getTrainTypeDesc()
	 * @generated
	 */
	void setTrainTypeDesc(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainMst> getTrainMstTrainType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserMst getCreatedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setCreatedBy(UserMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserMst getLastModifiedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setLastModifiedBy(UserMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMst getTrainTypeCclms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTrainTypeCclms(TrainTypeMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // TrainTypeMappingMst
