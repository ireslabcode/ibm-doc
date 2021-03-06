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
public interface LinkMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' attribute.
	 * @see #isSetLinkId()
	 * @see #unsetLinkId()
	 * @see #setLinkId(int)
	 * @generated
	 */
	int getLinkId();

	/**
	 * Sets the value of the '{@link cclms.LinkMst#getLinkId <em>Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Id</em>' attribute.
	 * @see #isSetLinkId()
	 * @see #unsetLinkId()
	 * @see #getLinkId()
	 * @generated
	 */
	void setLinkId(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkMst#getLinkId <em>Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinkId()
	 * @see #getLinkId()
	 * @see #setLinkId(int)
	 * @generated
	 */
	void unsetLinkId();

	/**
	 * Returns whether the value of the '{@link cclms.LinkMst#getLinkId <em>Link Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Link Id</em>' attribute is set.
	 * @see #unsetLinkId()
	 * @see #getLinkId()
	 * @see #setLinkId(int)
	 * @generated
	 */
	boolean isSetLinkId();

	/**
	 * Returns the value of the '<em><b>Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Id</em>' attribute.
	 * @see #isSetScenarioId()
	 * @see #unsetScenarioId()
	 * @see #setScenarioId(int)
	 * @generated
	 */
	int getScenarioId();

	/**
	 * Sets the value of the '{@link cclms.LinkMst#getScenarioId <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Id</em>' attribute.
	 * @see #isSetScenarioId()
	 * @see #unsetScenarioId()
	 * @see #getScenarioId()
	 * @generated
	 */
	void setScenarioId(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkMst#getScenarioId <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScenarioId()
	 * @see #getScenarioId()
	 * @see #setScenarioId(int)
	 * @generated
	 */
	void unsetScenarioId();

	/**
	 * Returns whether the value of the '{@link cclms.LinkMst#getScenarioId <em>Scenario Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scenario Id</em>' attribute is set.
	 * @see #unsetScenarioId()
	 * @see #getScenarioId()
	 * @see #setScenarioId(int)
	 * @generated
	 */
	boolean isSetScenarioId();

	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link cclms.LinkMst#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Lobby Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby Type</em>' attribute.
	 * @see #setLobbyType(String)
	 * @generated
	 */
	String getLobbyType();

	/**
	 * Sets the value of the '{@link cclms.LinkMst#getLobbyType <em>Lobby Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby Type</em>' attribute.
	 * @see #getLobbyType()
	 * @generated
	 */
	void setLobbyType(String value);

	/**
	 * Returns the value of the '<em><b>Link Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Status</em>' attribute.
	 * @see #setLinkStatus(String)
	 * @generated
	 */
	String getLinkStatus();

	/**
	 * Sets the value of the '{@link cclms.LinkMst#getLinkStatus <em>Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Status</em>' attribute.
	 * @see #getLinkStatus()
	 * @generated
	 */
	void setLinkStatus(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<ParameterValue> getParameterValueLinkId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<KpiValue> getKpiValueLinkId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkDetail> getLinkDetailLinkId();

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #isSetCreatedBy()
	 * @see #unsetCreatedBy()
	 * @see #setCreatedBy(int)
	 * @generated
	 */
	int getCreatedBy();

	/**
	 * Sets the value of the '{@link cclms.LinkMst#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #isSetCreatedBy()
	 * @see #unsetCreatedBy()
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkMst#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreatedBy()
	 * @see #getCreatedBy()
	 * @see #setCreatedBy(int)
	 * @generated
	 */
	void unsetCreatedBy();

	/**
	 * Returns whether the value of the '{@link cclms.LinkMst#getCreatedBy <em>Created By</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Created By</em>' attribute is set.
	 * @see #unsetCreatedBy()
	 * @see #getCreatedBy()
	 * @see #setCreatedBy(int)
	 * @generated
	 */
	boolean isSetCreatedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getLobbyStnId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setLobbyStnId(StationMst obj);

	/**
	 * Returns the value of the '<em><b>Last Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By</em>' attribute.
	 * @see #isSetLastModifiedBy()
	 * @see #unsetLastModifiedBy()
	 * @see #setLastModifiedBy(int)
	 * @generated
	 */
	int getLastModifiedBy();

	/**
	 * Sets the value of the '{@link cclms.LinkMst#getLastModifiedBy <em>Last Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By</em>' attribute.
	 * @see #isSetLastModifiedBy()
	 * @see #unsetLastModifiedBy()
	 * @see #getLastModifiedBy()
	 * @generated
	 */
	void setLastModifiedBy(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkMst#getLastModifiedBy <em>Last Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastModifiedBy()
	 * @see #getLastModifiedBy()
	 * @see #setLastModifiedBy(int)
	 * @generated
	 */
	void unsetLastModifiedBy();

	/**
	 * Returns whether the value of the '{@link cclms.LinkMst#getLastModifiedBy <em>Last Modified By</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Modified By</em>' attribute is set.
	 * @see #unsetLastModifiedBy()
	 * @see #getLastModifiedBy()
	 * @see #setLastModifiedBy(int)
	 * @generated
	 */
	boolean isSetLastModifiedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TractionMst getTractionType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTractionType(TractionMst obj);

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
	TrainTypeMst getTrainTypeCd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTrainTypeCd(TrainTypeMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // LinkMst
