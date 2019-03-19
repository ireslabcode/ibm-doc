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
public interface TrainTypeMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Train Type Cclms Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Type Cclms Id</em>' attribute.
	 * @see #isSetTrainTypeCclmsId()
	 * @see #unsetTrainTypeCclmsId()
	 * @see #setTrainTypeCclmsId(int)
	 * @generated
	 */
	int getTrainTypeCclmsId();

	/**
	 * Sets the value of the '{@link cclms.TrainTypeMst#getTrainTypeCclmsId <em>Train Type Cclms Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Type Cclms Id</em>' attribute.
	 * @see #isSetTrainTypeCclmsId()
	 * @see #unsetTrainTypeCclmsId()
	 * @see #getTrainTypeCclmsId()
	 * @generated
	 */
	void setTrainTypeCclmsId(int value);

	/**
	 * Unsets the value of the '{@link cclms.TrainTypeMst#getTrainTypeCclmsId <em>Train Type Cclms Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrainTypeCclmsId()
	 * @see #getTrainTypeCclmsId()
	 * @see #setTrainTypeCclmsId(int)
	 * @generated
	 */
	void unsetTrainTypeCclmsId();

	/**
	 * Returns whether the value of the '{@link cclms.TrainTypeMst#getTrainTypeCclmsId <em>Train Type Cclms Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Train Type Cclms Id</em>' attribute is set.
	 * @see #unsetTrainTypeCclmsId()
	 * @see #getTrainTypeCclmsId()
	 * @see #setTrainTypeCclmsId(int)
	 * @generated
	 */
	boolean isSetTrainTypeCclmsId();

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
	 * Sets the value of the '{@link cclms.TrainTypeMst#getTrainTypeDesc <em>Train Type Desc</em>}' attribute.
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
	List<TrainTypeMappingMst> getTrainTypeMappingMstTrainTypeCclms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkMst> getLinkMstTrainTypeCd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // TrainTypeMst
