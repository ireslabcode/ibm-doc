/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomCollector;
import ilog.odm.dom.IloDomConfiguration;
import ilog.odm.dom.IloDomObject;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface CclmsCollector extends IloDomObject, IloDomCollector {
	/**
	 * The identifier of the generated model.
	 * @generated
	 */
	@SuppressWarnings("static-access")
	static final String MODEL_ID = cclms.impl.CclmsPackageImpl.init().eNS_URI;

	/**
	 * Defines the default configuration of the model. The configuration is used to specify
	 * a default factory and to initialize model managers accessing this collector. To specify
	 * the configuration, add the value <code>NOT</code> after the <code>generated</code> tag below
	 * and assigns the configuration with a specific object.
	 * @generated
	 */
	static final IloDomConfiguration CONFIGURATION = null;

	/**
	 * Returns the value of the '<em><b>Zone Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.ZoneMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Mst</em>' containment reference list.
	 * @generated
	 */
	List<ZoneMst> getZoneMst();

	/**
	 * Returns the value of the '<em><b>Station Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.StationMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station Mst</em>' containment reference list.
	 * @generated
	 */
	List<StationMst> getStationMst();

	/**
	 * Returns the value of the '<em><b>Train Frequency Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.TrainFrequencyMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Frequency Mst</em>' containment reference list.
	 * @generated
	 */
	List<TrainFrequencyMst> getTrainFrequencyMst();

	/**
	 * Returns the value of the '<em><b>Traction Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.TractionMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traction Mst</em>' containment reference list.
	 * @generated
	 */
	List<TractionMst> getTractionMst();

	/**
	 * Returns the value of the '<em><b>Train Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.TrainMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Mst</em>' containment reference list.
	 * @generated
	 */
	List<TrainMst> getTrainMst();

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.ParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @generated
	 */
	List<ParameterValue> getParameterValue();

	/**
	 * Returns the value of the '<em><b>Division Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.DivisionMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Division Mst</em>' containment reference list.
	 * @generated
	 */
	List<DivisionMst> getDivisionMst();

	/**
	 * Returns the value of the '<em><b>User Role Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.UserRoleMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Role Mst</em>' containment reference list.
	 * @generated
	 */
	List<UserRoleMst> getUserRoleMst();

	/**
	 * Returns the value of the '<em><b>User Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.UserMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Mst</em>' containment reference list.
	 * @generated
	 */
	List<UserMst> getUserMst();

	/**
	 * Returns the value of the '<em><b>Kpi Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.KpiMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Mst</em>' containment reference list.
	 * @generated
	 */
	List<KpiMst> getKpiMst();

	/**
	 * Returns the value of the '<em><b>Kpi Value</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.KpiValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpi Value</em>' containment reference list.
	 * @generated
	 */
	List<KpiValue> getKpiValue();

	/**
	 * Returns the value of the '<em><b>Parameter Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.ParameterMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mst</em>' containment reference list.
	 * @generated
	 */
	List<ParameterMst> getParameterMst();

	/**
	 * Returns the value of the '<em><b>Train Type Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.TrainTypeMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Type Mst</em>' containment reference list.
	 * @generated
	 */
	List<TrainTypeMst> getTrainTypeMst();

	/**
	 * Returns the value of the '<em><b>Train Type Mapping Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.TrainTypeMappingMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Type Mapping Mst</em>' containment reference list.
	 * @generated
	 */
	List<TrainTypeMappingMst> getTrainTypeMappingMst();

	/**
	 * Returns the value of the '<em><b>Link Detail</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.LinkDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Detail</em>' containment reference list.
	 * @generated
	 */
	List<LinkDetail> getLinkDetail();

	/**
	 * Returns the value of the '<em><b>Segment Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.SegmentMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Mst</em>' containment reference list.
	 * @generated
	 */
	List<SegmentMst> getSegmentMst();

	/**
	 * Returns the value of the '<em><b>Train Segment Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.TrainSegmentMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Segment Mst</em>' containment reference list.
	 * @generated
	 */
	List<TrainSegmentMst> getTrainSegmentMst();

	/**
	 * Returns the value of the '<em><b>Link Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.LinkMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Mst</em>' containment reference list.
	 * @generated
	 */
	List<LinkMst> getLinkMst();

	/**
	 * Returns the value of the '<em><b>Lobby Mst</b></em>' containment reference list.
	 * The list contents are of type {@link cclms.LobbyMst}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby Mst</em>' containment reference list.
	 * @generated
	 */
	List<LobbyMst> getLobbyMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZoneMst createZoneMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZoneMst createZoneMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZoneMst getFromZoneMst(int zoneId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst createStationMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst createStationMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getFromStationMst(int stationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainFrequencyMst createTrainFrequencyMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainFrequencyMst createTrainFrequencyMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainFrequencyMst getFromTrainFrequencyMst(int trainFrequencyCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TractionMst createTractionMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TractionMst createTractionMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TractionMst getFromTractionMst(int tractionType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainMst createTrainMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainMst createTrainMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainMst getFromTrainMst(int trainId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterValue createParameterValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterValue createParameterValue(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterValue getFromParameterValue(int parameterId, int linkId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DivisionMst createDivisionMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DivisionMst createDivisionMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DivisionMst getFromDivisionMst(int divisionId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserRoleMst createUserRoleMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserRoleMst createUserRoleMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserRoleMst getFromUserRoleMst(int userRoleCd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserMst createUserMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserMst createUserMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserMst getFromUserMst(int userId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpiMst createKpiMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpiMst createKpiMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpiMst getFromKpiMst(int kpiId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpiValue createKpiValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpiValue createKpiValue(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpiValue getFromKpiValue(int kpiId, int linkId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterMst createParameterMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterMst createParameterMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterMst getFromParameterMst(int parameterId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMst createTrainTypeMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMst createTrainTypeMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMst getFromTrainTypeMst(int trainTypeCclmsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMappingMst createTrainTypeMappingMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMappingMst createTrainTypeMappingMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainTypeMappingMst getFromTrainTypeMappingMst(String trainType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkDetail createLinkDetail();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkDetail createLinkDetail(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SegmentMst createSegmentMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SegmentMst createSegmentMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SegmentMst getFromSegmentMst(int segmentId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainSegmentMst createTrainSegmentMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainSegmentMst createTrainSegmentMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainSegmentMst getFromTrainSegmentMst(int trainSegId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkMst createLinkMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkMst createLinkMst(int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkMst getFromLinkMst(int linkId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LobbyMst createLobbyMst();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LobbyMst createLobbyMst(int index);

} // CclmsCollector
