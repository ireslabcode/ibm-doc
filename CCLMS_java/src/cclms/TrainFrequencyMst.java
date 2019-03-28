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
public interface TrainFrequencyMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Train Frequency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Frequency Code</em>' attribute.
	 * @see #isSetTrainFrequencyCode()
	 * @see #unsetTrainFrequencyCode()
	 * @see #setTrainFrequencyCode(int)
	 * @generated
	 */
	int getTrainFrequencyCode();

	/**
	 * Sets the value of the '{@link cclms.TrainFrequencyMst#getTrainFrequencyCode <em>Train Frequency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Frequency Code</em>' attribute.
	 * @see #isSetTrainFrequencyCode()
	 * @see #unsetTrainFrequencyCode()
	 * @see #getTrainFrequencyCode()
	 * @generated
	 */
	void setTrainFrequencyCode(int value);

	/**
	 * Unsets the value of the '{@link cclms.TrainFrequencyMst#getTrainFrequencyCode <em>Train Frequency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrainFrequencyCode()
	 * @see #getTrainFrequencyCode()
	 * @see #setTrainFrequencyCode(int)
	 * @generated
	 */
	void unsetTrainFrequencyCode();

	/**
	 * Returns whether the value of the '{@link cclms.TrainFrequencyMst#getTrainFrequencyCode <em>Train Frequency Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Train Frequency Code</em>' attribute is set.
	 * @see #unsetTrainFrequencyCode()
	 * @see #getTrainFrequencyCode()
	 * @see #setTrainFrequencyCode(int)
	 * @generated
	 */
	boolean isSetTrainFrequencyCode();

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link cclms.TrainFrequencyMst#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkMst> getLinkMstTrainFrequencyCd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // TrainFrequencyMst
