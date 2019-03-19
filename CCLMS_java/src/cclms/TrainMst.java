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
	 * Returns the value of the '<em><b>Train Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Sub Type</em>' attribute.
	 * @see #setTrainSubType(String)
	 * @generated
	 */
	String getTrainSubType();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getTrainSubType <em>Train Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Sub Type</em>' attribute.
	 * @see #getTrainSubType()
	 * @generated
	 */
	void setTrainSubType(String value);

	/**
	 * Returns the value of the '<em><b>Train Run Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Run Type</em>' attribute.
	 * @see #setTrainRunType(String)
	 * @generated
	 */
	String getTrainRunType();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getTrainRunType <em>Train Run Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Run Type</em>' attribute.
	 * @see #getTrainRunType()
	 * @generated
	 */
	void setTrainRunType(String value);

	/**
	 * Returns the value of the '<em><b>Rake Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rake Id</em>' attribute.
	 * @see #isSetRakeId()
	 * @see #unsetRakeId()
	 * @see #setRakeId(int)
	 * @generated
	 */
	int getRakeId();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getRakeId <em>Rake Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rake Id</em>' attribute.
	 * @see #isSetRakeId()
	 * @see #unsetRakeId()
	 * @see #getRakeId()
	 * @generated
	 */
	void setRakeId(int value);

	/**
	 * Unsets the value of the '{@link cclms.TrainMst#getRakeId <em>Rake Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRakeId()
	 * @see #getRakeId()
	 * @see #setRakeId(int)
	 * @generated
	 */
	void unsetRakeId();

	/**
	 * Returns whether the value of the '{@link cclms.TrainMst#getRakeId <em>Rake Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rake Id</em>' attribute is set.
	 * @see #unsetRakeId()
	 * @see #getRakeId()
	 * @see #setRakeId(int)
	 * @generated
	 */
	boolean isSetRakeId();

	/**
	 * Returns the value of the '<em><b>Day Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Service</em>' attribute.
	 * @see #setDayOfService(String)
	 * @generated
	 */
	String getDayOfService();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getDayOfService <em>Day Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Service</em>' attribute.
	 * @see #getDayOfService()
	 * @generated
	 */
	void setDayOfService(String value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Date)
	 * @generated
	 */
	Date getValidFrom();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid To</em>' attribute.
	 * @see #setValidTo(Date)
	 * @generated
	 */
	Date getValidTo();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getValidTo <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' attribute.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(Date value);

	/**
	 * Returns the value of the '<em><b>Base Traction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Traction</em>' attribute.
	 * @see #setBaseTraction(String)
	 * @generated
	 */
	String getBaseTraction();

	/**
	 * Sets the value of the '{@link cclms.TrainMst#getBaseTraction <em>Base Traction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Traction</em>' attribute.
	 * @see #getBaseTraction()
	 * @generated
	 */
	void setBaseTraction(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getTrainEndStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTrainEndStn(StationMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getTrainStartStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTrainStartStn(StationMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainFrequencyMst getTrainFrequencyCd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTrainFrequencyCd(TrainFrequencyMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMappingMst getTrainType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTrainType(TrainTypeMappingMst obj);

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
