/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;

import java.sql.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface TrainMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Train Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Id</em>' attribute.
	 * @see #isSetTrainId()
	 * @see #unsetTrainId()
	 * @see #setTrainId(int)
	 * @generated
	 */
	int getTrainId();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getTrainId <em>Train Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Id</em>' attribute.
	 * @see #isSetTrainId()
	 * @see #unsetTrainId()
	 * @see #getTrainId()
	 * @generated
	 */
	void setTrainId(int value);

	/**
	 * Unsets the value of the '{@link cclms.TrainMst#getTrainId <em>Train Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrainId()
	 * @see #getTrainId()
	 * @see #setTrainId(int)
	 * @generated
	 */
	void unsetTrainId();

	/**
	 * Returns whether the value of the '{@link cclms.TrainMst#getTrainId <em>Train Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Train Id</em>' attribute is set.
	 * @see #unsetTrainId()
	 * @see #getTrainId()
	 * @see #setTrainId(int)
	 * @generated
	 */
	boolean isSetTrainId();

	/**
	 * Returns the value of the '<em><b>Train Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Nbr</em>' attribute.
	 * @see #setTrainNbr(String)
	 * @generated
	 */
	String getTrainNbr();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getTrainNbr <em>Train Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Nbr</em>' attribute.
	 * @see #getTrainNbr()
	 * @generated
	 */
	void setTrainNbr(String value);

	/**
	 * Returns the value of the '<em><b>Train Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Name</em>' attribute.
	 * @see #setTrainName(String)
	 * @generated
	 */
	String getTrainName();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getTrainName <em>Train Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Name</em>' attribute.
	 * @see #getTrainName()
	 * @generated
	 */
	void setTrainName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkDetail> getLinkDetailTrainId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainSegmentMst> getTrainSegmentMstTrainId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // TrainMst
