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
public interface StationMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Station Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Id</em>' attribute.
	 * @see #isSetStationId()
	 * @see #unsetStationId()
	 * @see #setStationId(int)
	 * @generated
	 */
	int getStationId();

	/**
	 * Sets the value of the '{@link cclms.StationMst#getStationId <em>Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Id</em>' attribute.
	 * @see #isSetStationId()
	 * @see #unsetStationId()
	 * @see #getStationId()
	 * @generated
	 */
	void setStationId(int value);

	/**
	 * Unsets the value of the '{@link cclms.StationMst#getStationId <em>Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStationId()
	 * @see #getStationId()
	 * @see #setStationId(int)
	 * @generated
	 */
	void unsetStationId();

	/**
	 * Returns whether the value of the '{@link cclms.StationMst#getStationId <em>Station Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Station Id</em>' attribute is set.
	 * @see #unsetStationId()
	 * @see #getStationId()
	 * @see #setStationId(int)
	 * @generated
	 */
	boolean isSetStationId();

	/**
	 * Returns the value of the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Code</em>' attribute.
	 * @see #setStationCode(String)
	 * @generated
	 */
	String getStationCode();

	/**
	 * Sets the value of the '{@link cclms.StationMst#getStationCode <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Code</em>' attribute.
	 * @see #getStationCode()
	 * @generated
	 */
	void setStationCode(String value);

	/**
	 * Returns the value of the '<em><b>Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Name</em>' attribute.
	 * @see #setStationName(String)
	 * @generated
	 */
	String getStationName();

	/**
	 * Sets the value of the '{@link cclms.StationMst#getStationName <em>Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station Name</em>' attribute.
	 * @see #getStationName()
	 * @generated
	 */
	void setStationName(String value);

	/**
	 * Returns the value of the '<em><b>Lobby Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby Flag</em>' attribute.
	 * @see #setLobbyFlag(String)
	 * @generated
	 */
	String getLobbyFlag();

	/**
	 * Sets the value of the '{@link cclms.StationMst#getLobbyFlag <em>Lobby Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby Flag</em>' attribute.
	 * @see #getLobbyFlag()
	 * @generated
	 */
	void setLobbyFlag(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DivisionMst getDivisionId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setDivisionId(DivisionMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainMst> getTrainMstTrainEndStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainMst> getTrainMstTrainStartStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<UserMst> getUserMstLobbyId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkDetail> getLinkDetailFromStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkDetail> getLinkDetailToStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<SegmentMst> getSegmentMstStartStationId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<SegmentMst> getSegmentMstStopStationId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainSegmentMst> getTrainSegmentMstLocoChangeStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<TrainSegmentMst> getTrainSegmentMstAssignedLobby();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	List<LinkMst> getLinkMstLobbyStnId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // StationMst
