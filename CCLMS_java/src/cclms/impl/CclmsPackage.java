/**
 */
package cclms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cclms.impl.CclmsFactory
 * @generated
 */
public interface CclmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cclms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ibm.com/cclms/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cclms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsPackage eINSTANCE = cclms.impl.CclmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link cclms.impl.StationMstImpl <em>Station Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.StationMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getStationMst()
	 * @generated
	 */
	int STATION_MST = 0;

	/**
	 * The feature id for the '<em><b>Station Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__STATION_ID = 0;

	/**
	 * The feature id for the '<em><b>Station Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__STATION_CODE = 1;

	/**
	 * The feature id for the '<em><b>Station Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__STATION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Lobby Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__LOBBY_FLAG = 3;

	/**
	 * The feature id for the '<em><b>Ref Link Detail From Stn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__REF_LINK_DETAIL_FROM_STN = 4;

	/**
	 * The feature id for the '<em><b>Ref Link Detail To Stn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__REF_LINK_DETAIL_TO_STN = 5;

	/**
	 * The feature id for the '<em><b>Ref Segment Mst Start Station Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__REF_SEGMENT_MST_START_STATION_ID = 6;

	/**
	 * The feature id for the '<em><b>Ref Segment Mst Stop Station Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID = 7;

	/**
	 * The feature id for the '<em><b>Ref Train Segment Mst Loco Change Stn</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN = 8;

	/**
	 * The feature id for the '<em><b>Ref Train Segment Mst Assigned Lobby</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY = 9;

	/**
	 * The feature id for the '<em><b>Ref Link Mst Lobby Stn Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST__REF_LINK_MST_LOBBY_STN_ID = 10;

	/**
	 * The number of structural features of the '<em>Station Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_MST_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link cclms.impl.TrainFrequencyMstImpl <em>Train Frequency Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TrainFrequencyMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getTrainFrequencyMst()
	 * @generated
	 */
	int TRAIN_FREQUENCY_MST = 1;

	/**
	 * The feature id for the '<em><b>Train Frequency Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FREQUENCY_MST__DESC = 1;

	/**
	 * The feature id for the '<em><b>Ref Link Mst Train Frequency Cd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD = 2;

	/**
	 * The number of structural features of the '<em>Train Frequency Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FREQUENCY_MST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cclms.impl.TractionMstImpl <em>Traction Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TractionMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getTractionMst()
	 * @generated
	 */
	int TRACTION_MST = 2;

	/**
	 * The feature id for the '<em><b>Traction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTION_MST__TRACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Traction Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTION_MST__TRACTION_DESC = 1;

	/**
	 * The feature id for the '<em><b>Ref Train Segment Mst Traction Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ref Link Mst Traction Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTION_MST__REF_LINK_MST_TRACTION_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Traction Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACTION_MST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cclms.impl.TrainMstImpl <em>Train Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TrainMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getTrainMst()
	 * @generated
	 */
	int TRAIN_MST = 3;

	/**
	 * The feature id for the '<em><b>Train Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MST__TRAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>Train Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MST__TRAIN_NBR = 1;

	/**
	 * The feature id for the '<em><b>Train Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MST__TRAIN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Ref Link Detail Train Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID = 3;

	/**
	 * The feature id for the '<em><b>Ref Train Segment Mst Train Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID = 4;

	/**
	 * The number of structural features of the '<em>Train Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_MST_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link cclms.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.ParameterValueImpl
	 * @see cclms.impl.CclmsPackageImpl#getParameterValue()
	 * @generated
	 */
	int PARAMETER_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Ref Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__REF_LINK_ID = 1;

	/**
	 * The feature id for the '<em><b>Ref Parameter Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE__REF_PARAMETER_ID = 2;

	/**
	 * The number of structural features of the '<em>Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cclms.impl.KpiMstImpl <em>Kpi Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.KpiMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getKpiMst()
	 * @generated
	 */
	int KPI_MST = 5;

	/**
	 * The feature id for the '<em><b>Kpi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MST__KPI_ID = 0;

	/**
	 * The feature id for the '<em><b>Kpi Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MST__KPI_DESC = 1;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MST__UOM = 2;

	/**
	 * The feature id for the '<em><b>Ref Kpi Value Kpi Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MST__REF_KPI_VALUE_KPI_ID = 3;

	/**
	 * The number of structural features of the '<em>Kpi Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cclms.impl.KpiValueImpl <em>Kpi Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.KpiValueImpl
	 * @see cclms.impl.CclmsPackageImpl#getKpiValue()
	 * @generated
	 */
	int KPI_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_VALUE__CREATED_BY = 1;

	/**
	 * The feature id for the '<em><b>Ref Kpi Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_VALUE__REF_KPI_ID = 2;

	/**
	 * The feature id for the '<em><b>Ref Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_VALUE__REF_LINK_ID = 3;

	/**
	 * The number of structural features of the '<em>Kpi Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cclms.impl.ParameterMstImpl <em>Parameter Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.ParameterMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getParameterMst()
	 * @generated
	 */
	int PARAMETER_MST = 7;

	/**
	 * The feature id for the '<em><b>Parameter Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST__PARAMETER_ID = 0;

	/**
	 * The feature id for the '<em><b>Parameter Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST__PARAMETER_DESC = 1;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST__UOM = 2;

	/**
	 * The feature id for the '<em><b>Global Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST__GLOBAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST__MIN_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST__MAX_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Ref Parameter Value Parameter Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID = 6;

	/**
	 * The number of structural features of the '<em>Parameter Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_MST_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link cclms.impl.TrainTypeMstImpl <em>Train Type Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TrainTypeMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getTrainTypeMst()
	 * @generated
	 */
	int TRAIN_TYPE_MST = 8;

	/**
	 * The feature id for the '<em><b>Train Type Cclms Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID = 0;

	/**
	 * The feature id for the '<em><b>Train Type Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MST__TRAIN_TYPE_DESC = 1;

	/**
	 * The feature id for the '<em><b>Ref Train Type Mapping Mst Train Type Cclms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS = 2;

	/**
	 * The feature id for the '<em><b>Ref Link Mst Train Type Cd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD = 3;

	/**
	 * The number of structural features of the '<em>Train Type Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cclms.impl.TrainTypeMappingMstImpl <em>Train Type Mapping Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TrainTypeMappingMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getTrainTypeMappingMst()
	 * @generated
	 */
	int TRAIN_TYPE_MAPPING_MST = 9;

	/**
	 * The feature id for the '<em><b>Train Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Train Type Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC = 1;

	/**
	 * The feature id for the '<em><b>Ref Train Type Cclms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS = 2;

	/**
	 * The number of structural features of the '<em>Train Type Mapping Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_TYPE_MAPPING_MST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cclms.impl.LinkDetailImpl <em>Link Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.LinkDetailImpl
	 * @see cclms.impl.CclmsPackageImpl#getLinkDetail()
	 * @generated
	 */
	int LINK_DETAIL = 10;

	/**
	 * The feature id for the '<em><b>Crew No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__CREW_NO = 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__DAY = 1;

	/**
	 * The feature id for the '<em><b>Sign On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__SIGN_ON_TIME = 2;

	/**
	 * The feature id for the '<em><b>Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__DEPARTURE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__ARRIVAL_TIME = 4;

	/**
	 * The feature id for the '<em><b>Sign Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__SIGN_OFF_TIME = 5;

	/**
	 * The feature id for the '<em><b>Os Allowance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__OS_ALLOWANCE = 6;

	/**
	 * The feature id for the '<em><b>Earned Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__EARNED_KM = 7;

	/**
	 * The feature id for the '<em><b>Periodic Rest Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__PERIODIC_REST_FLAG = 8;

	/**
	 * The feature id for the '<em><b>Spare Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__SPARE_FLAG = 9;

	/**
	 * The feature id for the '<em><b>Night Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__NIGHT_FLAG = 10;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__SORT_ORDER = 11;

	/**
	 * The feature id for the '<em><b>Duty Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__DUTY_DURATION = 12;

	/**
	 * The feature id for the '<em><b>Running Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__RUNNING_DURATION = 13;

	/**
	 * The feature id for the '<em><b>Hq Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__HQ_REST = 14;

	/**
	 * The feature id for the '<em><b>Os Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__OS_REST = 15;

	/**
	 * The feature id for the '<em><b>Ref From Stn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__REF_FROM_STN = 16;

	/**
	 * The feature id for the '<em><b>Ref Link Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__REF_LINK_ID = 17;

	/**
	 * The feature id for the '<em><b>Ref To Stn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__REF_TO_STN = 18;

	/**
	 * The feature id for the '<em><b>Ref Train Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL__REF_TRAIN_ID = 19;

	/**
	 * The number of structural features of the '<em>Link Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link cclms.impl.SegmentMstImpl <em>Segment Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.SegmentMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getSegmentMst()
	 * @generated
	 */
	int SEGMENT_MST = 11;

	/**
	 * The feature id for the '<em><b>Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST__SEGMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Ref Start Station Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST__REF_START_STATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Ref Stop Station Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST__REF_STOP_STATION_ID = 2;

	/**
	 * The feature id for the '<em><b>Ref Train Segment Mst Segment Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID = 3;

	/**
	 * The number of structural features of the '<em>Segment Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cclms.impl.TrainSegmentMstImpl <em>Train Segment Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TrainSegmentMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getTrainSegmentMst()
	 * @generated
	 */
	int TRAIN_SEGMENT_MST = 12;

	/**
	 * The feature id for the '<em><b>Train Seg Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__TRAIN_SEG_ID = 0;

	/**
	 * The feature id for the '<em><b>Cclms Train Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Sign On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__SIGN_ON_TIME = 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__START_TIME = 3;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__END_TIME = 4;

	/**
	 * The feature id for the '<em><b>Sign Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__SIGN_OFF_TIME = 5;

	/**
	 * The feature id for the '<em><b>Running Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__RUNNING_DURATION = 6;

	/**
	 * The feature id for the '<em><b>Chronic Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME = 7;

	/**
	 * The feature id for the '<em><b>Dept Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__DEPT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Spare Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__SPARE_FLAG = 9;

	/**
	 * The feature id for the '<em><b>Dayofservice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__DAYOFSERVICE = 10;

	/**
	 * The feature id for the '<em><b>Actual Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__ACTUAL_KM = 11;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__CREATED_BY = 12;

	/**
	 * The feature id for the '<em><b>Ref Loco Change Stn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN = 13;

	/**
	 * The feature id for the '<em><b>Ref Segment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__REF_SEGMENT_ID = 14;

	/**
	 * The feature id for the '<em><b>Ref Assigned Lobby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY = 15;

	/**
	 * The feature id for the '<em><b>Ref Traction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__REF_TRACTION_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Ref Train Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST__REF_TRAIN_ID = 17;

	/**
	 * The number of structural features of the '<em>Train Segment Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_MST_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link cclms.impl.LinkMstImpl <em>Link Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.LinkMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getLinkMst()
	 * @generated
	 */
	int LINK_MST = 13;

	/**
	 * The feature id for the '<em><b>Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__LINK_ID = 0;

	/**
	 * The feature id for the '<em><b>Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__SCENARIO_ID = 1;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__LINK_NAME = 2;

	/**
	 * The feature id for the '<em><b>Lobby Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__LOBBY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__CREATED_BY = 4;

	/**
	 * The feature id for the '<em><b>Last Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__LAST_MODIFIED_BY = 5;

	/**
	 * The feature id for the '<em><b>Link Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__LINK_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Ref Parameter Value Link Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__REF_PARAMETER_VALUE_LINK_ID = 7;

	/**
	 * The feature id for the '<em><b>Ref Kpi Value Link Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__REF_KPI_VALUE_LINK_ID = 8;

	/**
	 * The feature id for the '<em><b>Ref Link Detail Link Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__REF_LINK_DETAIL_LINK_ID = 9;

	/**
	 * The feature id for the '<em><b>Ref Lobby Stn Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__REF_LOBBY_STN_ID = 10;

	/**
	 * The feature id for the '<em><b>Ref Traction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__REF_TRACTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Ref Train Frequency Cd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__REF_TRAIN_FREQUENCY_CD = 12;

	/**
	 * The feature id for the '<em><b>Ref Train Type Cd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST__REF_TRAIN_TYPE_CD = 13;

	/**
	 * The number of structural features of the '<em>Link Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_MST_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link cclms.impl.LobbyMstImpl <em>Lobby Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.LobbyMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getLobbyMst()
	 * @generated
	 */
	int LOBBY_MST = 14;

	/**
	 * The feature id for the '<em><b>Lobby Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST__LOBBY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Lobby Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST__LOBBY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Lobby Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST__LOBBY_ID = 2;

	/**
	 * The number of structural features of the '<em>Lobby Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cclms.impl.TrainSegmentEngineImpl <em>Train Segment Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TrainSegmentEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getTrainSegmentEngine()
	 * @generated
	 */
	int TRAIN_SEGMENT_ENGINE = 15;

	/**
	 * The feature id for the '<em><b>Trainid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__TRAINID = 0;

	/**
	 * The feature id for the '<em><b>Legid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__LEGID = 1;

	/**
	 * The feature id for the '<em><b>Startloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__STARTLOC = 2;

	/**
	 * The feature id for the '<em><b>Endloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__ENDLOC = 3;

	/**
	 * The feature id for the '<em><b>Signon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__SIGNON = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__START = 5;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__END = 6;

	/**
	 * The feature id for the '<em><b>Signoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__SIGNOFF = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__DURATION = 8;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__DISTANCE = 9;

	/**
	 * The feature id for the '<em><b>Nightflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__NIGHTFLAG = 10;

	/**
	 * The feature id for the '<em><b>Dayid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__DAYID = 11;

	/**
	 * The feature id for the '<em><b>Spareflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE__SPAREFLAG = 12;

	/**
	 * The number of structural features of the '<em>Train Segment Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_SEGMENT_ENGINE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link cclms.impl.SegmentMstEngineImpl <em>Segment Mst Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.SegmentMstEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getSegmentMstEngine()
	 * @generated
	 */
	int SEGMENT_MST_ENGINE = 16;

	/**
	 * The feature id for the '<em><b>Fromstation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST_ENGINE__FROMSTATION = 0;

	/**
	 * The feature id for the '<em><b>Tostation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST_ENGINE__TOSTATION = 1;

	/**
	 * The feature id for the '<em><b>Segmentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST_ENGINE__SEGMENTID = 2;

	/**
	 * The number of structural features of the '<em>Segment Mst Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_MST_ENGINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cclms.impl.TimeToMinEngineImpl <em>Time To Min Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.TimeToMinEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getTimeToMinEngine()
	 * @generated
	 */
	int TIME_TO_MIN_ENGINE = 17;

	/**
	 * The feature id for the '<em><b>Trainid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__TRAINID = 0;

	/**
	 * The feature id for the '<em><b>Segmentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__SEGMENTID = 1;

	/**
	 * The feature id for the '<em><b>Signontime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__SIGNONTIME = 2;

	/**
	 * The feature id for the '<em><b>Signominute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__SIGNOMINUTE = 3;

	/**
	 * The feature id for the '<em><b>Starttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__STARTTIME = 4;

	/**
	 * The feature id for the '<em><b>Startminute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__STARTMINUTE = 5;

	/**
	 * The feature id for the '<em><b>Endtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__ENDTIME = 6;

	/**
	 * The feature id for the '<em><b>Endminute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__ENDMINUTE = 7;

	/**
	 * The feature id for the '<em><b>Signofftime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__SIGNOFFTIME = 8;

	/**
	 * The feature id for the '<em><b>Signoffminute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__SIGNOFFMINUTE = 9;

	/**
	 * The feature id for the '<em><b>Dayid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__DAYID = 10;

	/**
	 * The feature id for the '<em><b>Spareflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE__SPAREFLAG = 11;

	/**
	 * The number of structural features of the '<em>Time To Min Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TO_MIN_ENGINE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link cclms.impl.DayMstEngineImpl <em>Day Mst Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.DayMstEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getDayMstEngine()
	 * @generated
	 */
	int DAY_MST_ENGINE = 23;

	/**
	 * The meta object id for the '{@link cclms.impl.KpiLinkEngineImpl <em>Kpi Link Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.KpiLinkEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getKpiLinkEngine()
	 * @generated
	 */
	int KPI_LINK_ENGINE = 18;

	/**
	 * The feature id for the '<em><b>Kpi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_LINK_ENGINE__KPI_ID = 0;

	/**
	 * The feature id for the '<em><b>Kpi Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_LINK_ENGINE__KPI_DESC = 1;

	/**
	 * The feature id for the '<em><b>Kpi Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_LINK_ENGINE__KPI_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_LINK_ENGINE__UOM = 3;

	/**
	 * The number of structural features of the '<em>Kpi Link Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_LINK_ENGINE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cclms.impl.LinkDetailEngineImpl <em>Link Detail Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.LinkDetailEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getLinkDetailEngine()
	 * @generated
	 */
	int LINK_DETAIL_ENGINE = 19;

	/**
	 * The feature id for the '<em><b>Dayname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__DAYNAME = 0;

	/**
	 * The feature id for the '<em><b>Seqid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__SEQID = 1;

	/**
	 * The feature id for the '<em><b>Trainno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__TRAINNO = 2;

	/**
	 * The feature id for the '<em><b>Fromstation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__FROMSTATION = 3;

	/**
	 * The feature id for the '<em><b>Tostation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__TOSTATION = 4;

	/**
	 * The feature id for the '<em><b>Signontime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__SIGNONTIME = 5;

	/**
	 * The feature id for the '<em><b>Departuretime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__DEPARTURETIME = 6;

	/**
	 * The feature id for the '<em><b>Arrivaltime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__ARRIVALTIME = 7;

	/**
	 * The feature id for the '<em><b>Signofftime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__SIGNOFFTIME = 8;

	/**
	 * The feature id for the '<em><b>Dutydurtion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__DUTYDURTION = 9;

	/**
	 * The feature id for the '<em><b>Dutyminutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__DUTYMINUTES = 10;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__DISTANCE = 11;

	/**
	 * The feature id for the '<em><b>Nib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__NIB = 12;

	/**
	 * The feature id for the '<em><b>Sortorder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__SORTORDER = 13;

	/**
	 * The feature id for the '<em><b>Dayid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__DAYID = 14;

	/**
	 * The feature id for the '<em><b>Spareflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE__SPAREFLAG = 15;

	/**
	 * The number of structural features of the '<em>Link Detail Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_DETAIL_ENGINE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link cclms.impl.OutlinkEngineImpl <em>Outlink Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.OutlinkEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getOutlinkEngine()
	 * @generated
	 */
	int OUTLINK_ENGINE = 20;

	/**
	 * The feature id for the '<em><b>Dayid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__DAYID = 0;

	/**
	 * The feature id for the '<em><b>Seqid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__SEQID = 1;

	/**
	 * The feature id for the '<em><b>Pairingid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__PAIRINGID = 2;

	/**
	 * The feature id for the '<em><b>Dutyid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__DUTYID = 3;

	/**
	 * The feature id for the '<em><b>Trainid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__TRAINID = 4;

	/**
	 * The feature id for the '<em><b>Legid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__LEGID = 5;

	/**
	 * The feature id for the '<em><b>Startloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__STARTLOC = 6;

	/**
	 * The feature id for the '<em><b>Endloc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__ENDLOC = 7;

	/**
	 * The feature id for the '<em><b>Dutysignon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__DUTYSIGNON = 8;

	/**
	 * The feature id for the '<em><b>Starttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__STARTTIME = 9;

	/**
	 * The feature id for the '<em><b>Endtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__ENDTIME = 10;

	/**
	 * The feature id for the '<em><b>Dutysignoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__DUTYSIGNOFF = 11;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__DURATION = 12;

	/**
	 * The feature id for the '<em><b>Nib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__NIB = 13;

	/**
	 * The feature id for the '<em><b>Spareflag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__SPAREFLAG = 14;

	/**
	 * The feature id for the '<em><b>Sortorder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE__SORTORDER = 15;

	/**
	 * The number of structural features of the '<em>Outlink Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTLINK_ENGINE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link cclms.impl.LobbyMstEngineImpl <em>Lobby Mst Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.LobbyMstEngineImpl
	 * @see cclms.impl.CclmsPackageImpl#getLobbyMstEngine()
	 * @generated
	 */
	int LOBBY_MST_ENGINE = 21;

	/**
	 * The feature id for the '<em><b>Lobby Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST_ENGINE__LOBBY_CODE = 0;

	/**
	 * The feature id for the '<em><b>Lobby Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST_ENGINE__LOBBY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Lobby Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST_ENGINE__LOBBY_ID = 2;

	/**
	 * The number of structural features of the '<em>Lobby Mst Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOBBY_MST_ENGINE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cclms.impl.UserMstImpl <em>User Mst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.UserMstImpl
	 * @see cclms.impl.CclmsPackageImpl#getUserMst()
	 * @generated
	 */
	int USER_MST = 22;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MST__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MST__USER = 1;

	/**
	 * The feature id for the '<em><b>Division Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MST__DIVISION_ID = 2;

	/**
	 * The number of structural features of the '<em>User Mst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MST_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Day Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_MST_ENGINE__DAY_ID = 0;

	/**
	 * The feature id for the '<em><b>Day Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_MST_ENGINE__DAY_DESC = 1;

	/**
	 * The number of structural features of the '<em>Day Mst Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_MST_ENGINE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ilog.odm.dom.IloDomCollector <em>ilog odm dom Ilo Dom Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ilog.odm.dom.IloDomCollector
	 * @see cclms.impl.CclmsPackageImpl#getilog_odm_dom_IloDomCollector()
	 * @generated
	 */
	int ILOG_ODM_DOM_ILO_DOM_COLLECTOR = 25;

	/**
	 * The number of structural features of the '<em>ilog odm dom Ilo Dom Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link cclms.impl.CclmsCollectorImpl <em>Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cclms.impl.CclmsCollectorImpl
	 * @see cclms.impl.CclmsPackageImpl#getCclmsCollector()
	 * @generated
	 */
	int CCLMS_COLLECTOR = 24;

	/**
	 * The feature id for the '<em><b>Station Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__STATION_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Train Frequency Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Traction Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TRACTION_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Train Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TRAIN_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__PARAMETER_VALUE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Kpi Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__KPI_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kpi Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__KPI_VALUE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__PARAMETER_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Train Type Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TRAIN_TYPE_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Train Type Mapping Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Link Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__LINK_DETAIL = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Segment Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__SEGMENT_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Train Segment Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TRAIN_SEGMENT_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Link Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__LINK_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Lobby Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__LOBBY_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Train Segment Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Segment Mst Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__SEGMENT_MST_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Time To Min Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Kpi Link Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__KPI_LINK_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Link Detail Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__LINK_DETAIL_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Outlink Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__OUTLINK_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Lobby Mst Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__LOBBY_MST_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>User Mst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__USER_MST = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Day Mst Engine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR__DAY_MST_ENGINE = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCLMS_COLLECTOR_FEATURE_COUNT = ILOG_ODM_DOM_ILO_DOM_COLLECTOR_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see cclms.impl.CclmsPackageImpl#getList()
	 * @generated
	 */
	int LIST = 26;

	/**
	 * The meta object id for the '<em>java sql Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Time
	 * @see cclms.impl.CclmsPackageImpl#getjava_sql_Time()
	 * @generated
	 */
	int JAVA_SQL_TIME = 27;

	/**
	 * Returns the meta object for class '{@link cclms.StationMst <em>Station Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Mst</em>'.
	 * @see cclms.StationMst
	 * @generated
	 */
	EClass getStationMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.StationMst#getStationId <em>Station Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Id</em>'.
	 * @see cclms.StationMst#getStationId()
	 * @see #getStationMst()
	 * @generated
	 */
	EAttribute getStationMst_StationId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.StationMst#getStationCode <em>Station Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Code</em>'.
	 * @see cclms.StationMst#getStationCode()
	 * @see #getStationMst()
	 * @generated
	 */
	EAttribute getStationMst_StationCode();

	/**
	 * Returns the meta object for the attribute '{@link cclms.StationMst#getStationName <em>Station Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Station Name</em>'.
	 * @see cclms.StationMst#getStationName()
	 * @see #getStationMst()
	 * @generated
	 */
	EAttribute getStationMst_StationName();

	/**
	 * Returns the meta object for the attribute '{@link cclms.StationMst#getLobbyFlag <em>Lobby Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Flag</em>'.
	 * @see cclms.StationMst#getLobbyFlag()
	 * @see #getStationMst()
	 * @generated
	 */
	EAttribute getStationMst_LobbyFlag();

	/**
	 * Returns the meta object for the reference list '{@link cclms.StationMst <em>Ref Link Detail From Stn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Detail From Stn</em>'.
	 * @see cclms.StationMst
	 * @see #getStationMst()
	 * @generated
	 */
	EReference getStationMst_RefLinkDetailFromStn();

	/**
	 * Returns the meta object for the reference list '{@link cclms.StationMst <em>Ref Link Detail To Stn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Detail To Stn</em>'.
	 * @see cclms.StationMst
	 * @see #getStationMst()
	 * @generated
	 */
	EReference getStationMst_RefLinkDetailToStn();

	/**
	 * Returns the meta object for the reference list '{@link cclms.StationMst <em>Ref Segment Mst Start Station Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Segment Mst Start Station Id</em>'.
	 * @see cclms.StationMst
	 * @see #getStationMst()
	 * @generated
	 */
	EReference getStationMst_RefSegmentMstStartStationId();

	/**
	 * Returns the meta object for the reference list '{@link cclms.StationMst <em>Ref Segment Mst Stop Station Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Segment Mst Stop Station Id</em>'.
	 * @see cclms.StationMst
	 * @see #getStationMst()
	 * @generated
	 */
	EReference getStationMst_RefSegmentMstStopStationId();

	/**
	 * Returns the meta object for the reference list '{@link cclms.StationMst <em>Ref Train Segment Mst Loco Change Stn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Train Segment Mst Loco Change Stn</em>'.
	 * @see cclms.StationMst
	 * @see #getStationMst()
	 * @generated
	 */
	EReference getStationMst_RefTrainSegmentMstLocoChangeStn();

	/**
	 * Returns the meta object for the reference list '{@link cclms.StationMst <em>Ref Train Segment Mst Assigned Lobby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Train Segment Mst Assigned Lobby</em>'.
	 * @see cclms.StationMst
	 * @see #getStationMst()
	 * @generated
	 */
	EReference getStationMst_RefTrainSegmentMstAssignedLobby();

	/**
	 * Returns the meta object for the reference list '{@link cclms.StationMst <em>Ref Link Mst Lobby Stn Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Mst Lobby Stn Id</em>'.
	 * @see cclms.StationMst
	 * @see #getStationMst()
	 * @generated
	 */
	EReference getStationMst_RefLinkMstLobbyStnId();

	/**
	 * Returns the meta object for class '{@link cclms.TrainFrequencyMst <em>Train Frequency Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Frequency Mst</em>'.
	 * @see cclms.TrainFrequencyMst
	 * @generated
	 */
	EClass getTrainFrequencyMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainFrequencyMst#getTrainFrequencyCode <em>Train Frequency Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Frequency Code</em>'.
	 * @see cclms.TrainFrequencyMst#getTrainFrequencyCode()
	 * @see #getTrainFrequencyMst()
	 * @generated
	 */
	EAttribute getTrainFrequencyMst_TrainFrequencyCode();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainFrequencyMst#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see cclms.TrainFrequencyMst#getDesc()
	 * @see #getTrainFrequencyMst()
	 * @generated
	 */
	EAttribute getTrainFrequencyMst_Desc();

	/**
	 * Returns the meta object for the reference list '{@link cclms.TrainFrequencyMst <em>Ref Link Mst Train Frequency Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Mst Train Frequency Cd</em>'.
	 * @see cclms.TrainFrequencyMst
	 * @see #getTrainFrequencyMst()
	 * @generated
	 */
	EReference getTrainFrequencyMst_RefLinkMstTrainFrequencyCd();

	/**
	 * Returns the meta object for class '{@link cclms.TractionMst <em>Traction Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traction Mst</em>'.
	 * @see cclms.TractionMst
	 * @generated
	 */
	EClass getTractionMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TractionMst#getTractionType <em>Traction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traction Type</em>'.
	 * @see cclms.TractionMst#getTractionType()
	 * @see #getTractionMst()
	 * @generated
	 */
	EAttribute getTractionMst_TractionType();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TractionMst#getTractionDesc <em>Traction Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traction Desc</em>'.
	 * @see cclms.TractionMst#getTractionDesc()
	 * @see #getTractionMst()
	 * @generated
	 */
	EAttribute getTractionMst_TractionDesc();

	/**
	 * Returns the meta object for the reference list '{@link cclms.TractionMst <em>Ref Train Segment Mst Traction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Train Segment Mst Traction Type</em>'.
	 * @see cclms.TractionMst
	 * @see #getTractionMst()
	 * @generated
	 */
	EReference getTractionMst_RefTrainSegmentMstTractionType();

	/**
	 * Returns the meta object for the reference list '{@link cclms.TractionMst <em>Ref Link Mst Traction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Mst Traction Type</em>'.
	 * @see cclms.TractionMst
	 * @see #getTractionMst()
	 * @generated
	 */
	EReference getTractionMst_RefLinkMstTractionType();

	/**
	 * Returns the meta object for class '{@link cclms.TrainMst <em>Train Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Mst</em>'.
	 * @see cclms.TrainMst
	 * @generated
	 */
	EClass getTrainMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainMst#getTrainId <em>Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Id</em>'.
	 * @see cclms.TrainMst#getTrainId()
	 * @see #getTrainMst()
	 * @generated
	 */
	EAttribute getTrainMst_TrainId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainMst#getTrainNbr <em>Train Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Nbr</em>'.
	 * @see cclms.TrainMst#getTrainNbr()
	 * @see #getTrainMst()
	 * @generated
	 */
	EAttribute getTrainMst_TrainNbr();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainMst#getTrainName <em>Train Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Name</em>'.
	 * @see cclms.TrainMst#getTrainName()
	 * @see #getTrainMst()
	 * @generated
	 */
	EAttribute getTrainMst_TrainName();

	/**
	 * Returns the meta object for the reference list '{@link cclms.TrainMst <em>Ref Link Detail Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Detail Train Id</em>'.
	 * @see cclms.TrainMst
	 * @see #getTrainMst()
	 * @generated
	 */
	EReference getTrainMst_RefLinkDetailTrainId();

	/**
	 * Returns the meta object for the reference list '{@link cclms.TrainMst <em>Ref Train Segment Mst Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Train Segment Mst Train Id</em>'.
	 * @see cclms.TrainMst
	 * @see #getTrainMst()
	 * @generated
	 */
	EReference getTrainMst_RefTrainSegmentMstTrainId();

	/**
	 * Returns the meta object for class '{@link cclms.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Value</em>'.
	 * @see cclms.ParameterValue
	 * @generated
	 */
	EClass getParameterValue();

	/**
	 * Returns the meta object for the attribute '{@link cclms.ParameterValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cclms.ParameterValue#getValue()
	 * @see #getParameterValue()
	 * @generated
	 */
	EAttribute getParameterValue_Value();

	/**
	 * Returns the meta object for the reference '{@link cclms.ParameterValue <em>Ref Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Link Id</em>'.
	 * @see cclms.ParameterValue
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_RefLinkId();

	/**
	 * Returns the meta object for the reference '{@link cclms.ParameterValue <em>Ref Parameter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Parameter Id</em>'.
	 * @see cclms.ParameterValue
	 * @see #getParameterValue()
	 * @generated
	 */
	EReference getParameterValue_RefParameterId();

	/**
	 * Returns the meta object for class '{@link cclms.KpiMst <em>Kpi Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kpi Mst</em>'.
	 * @see cclms.KpiMst
	 * @generated
	 */
	EClass getKpiMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiMst#getKpiId <em>Kpi Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kpi Id</em>'.
	 * @see cclms.KpiMst#getKpiId()
	 * @see #getKpiMst()
	 * @generated
	 */
	EAttribute getKpiMst_KpiId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiMst#getKpiDesc <em>Kpi Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kpi Desc</em>'.
	 * @see cclms.KpiMst#getKpiDesc()
	 * @see #getKpiMst()
	 * @generated
	 */
	EAttribute getKpiMst_KpiDesc();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiMst#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom</em>'.
	 * @see cclms.KpiMst#getUom()
	 * @see #getKpiMst()
	 * @generated
	 */
	EAttribute getKpiMst_Uom();

	/**
	 * Returns the meta object for the reference list '{@link cclms.KpiMst <em>Ref Kpi Value Kpi Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Kpi Value Kpi Id</em>'.
	 * @see cclms.KpiMst
	 * @see #getKpiMst()
	 * @generated
	 */
	EReference getKpiMst_RefKpiValueKpiId();

	/**
	 * Returns the meta object for class '{@link cclms.KpiValue <em>Kpi Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kpi Value</em>'.
	 * @see cclms.KpiValue
	 * @generated
	 */
	EClass getKpiValue();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cclms.KpiValue#getValue()
	 * @see #getKpiValue()
	 * @generated
	 */
	EAttribute getKpiValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiValue#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see cclms.KpiValue#getCreatedBy()
	 * @see #getKpiValue()
	 * @generated
	 */
	EAttribute getKpiValue_CreatedBy();

	/**
	 * Returns the meta object for the reference '{@link cclms.KpiValue <em>Ref Kpi Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Kpi Id</em>'.
	 * @see cclms.KpiValue
	 * @see #getKpiValue()
	 * @generated
	 */
	EReference getKpiValue_RefKpiId();

	/**
	 * Returns the meta object for the reference '{@link cclms.KpiValue <em>Ref Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Link Id</em>'.
	 * @see cclms.KpiValue
	 * @see #getKpiValue()
	 * @generated
	 */
	EReference getKpiValue_RefLinkId();

	/**
	 * Returns the meta object for class '{@link cclms.ParameterMst <em>Parameter Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Mst</em>'.
	 * @see cclms.ParameterMst
	 * @generated
	 */
	EClass getParameterMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.ParameterMst#getParameterId <em>Parameter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Id</em>'.
	 * @see cclms.ParameterMst#getParameterId()
	 * @see #getParameterMst()
	 * @generated
	 */
	EAttribute getParameterMst_ParameterId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.ParameterMst#getParameterDesc <em>Parameter Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Desc</em>'.
	 * @see cclms.ParameterMst#getParameterDesc()
	 * @see #getParameterMst()
	 * @generated
	 */
	EAttribute getParameterMst_ParameterDesc();

	/**
	 * Returns the meta object for the attribute '{@link cclms.ParameterMst#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom</em>'.
	 * @see cclms.ParameterMst#getUom()
	 * @see #getParameterMst()
	 * @generated
	 */
	EAttribute getParameterMst_Uom();

	/**
	 * Returns the meta object for the attribute '{@link cclms.ParameterMst#getGlobalValue <em>Global Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Value</em>'.
	 * @see cclms.ParameterMst#getGlobalValue()
	 * @see #getParameterMst()
	 * @generated
	 */
	EAttribute getParameterMst_GlobalValue();

	/**
	 * Returns the meta object for the attribute '{@link cclms.ParameterMst#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see cclms.ParameterMst#getMinValue()
	 * @see #getParameterMst()
	 * @generated
	 */
	EAttribute getParameterMst_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link cclms.ParameterMst#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see cclms.ParameterMst#getMaxValue()
	 * @see #getParameterMst()
	 * @generated
	 */
	EAttribute getParameterMst_MaxValue();

	/**
	 * Returns the meta object for the reference list '{@link cclms.ParameterMst <em>Ref Parameter Value Parameter Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Parameter Value Parameter Id</em>'.
	 * @see cclms.ParameterMst
	 * @see #getParameterMst()
	 * @generated
	 */
	EReference getParameterMst_RefParameterValueParameterId();

	/**
	 * Returns the meta object for class '{@link cclms.TrainTypeMst <em>Train Type Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Type Mst</em>'.
	 * @see cclms.TrainTypeMst
	 * @generated
	 */
	EClass getTrainTypeMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainTypeMst#getTrainTypeCclmsId <em>Train Type Cclms Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Type Cclms Id</em>'.
	 * @see cclms.TrainTypeMst#getTrainTypeCclmsId()
	 * @see #getTrainTypeMst()
	 * @generated
	 */
	EAttribute getTrainTypeMst_TrainTypeCclmsId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainTypeMst#getTrainTypeDesc <em>Train Type Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Type Desc</em>'.
	 * @see cclms.TrainTypeMst#getTrainTypeDesc()
	 * @see #getTrainTypeMst()
	 * @generated
	 */
	EAttribute getTrainTypeMst_TrainTypeDesc();

	/**
	 * Returns the meta object for the reference list '{@link cclms.TrainTypeMst <em>Ref Train Type Mapping Mst Train Type Cclms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Train Type Mapping Mst Train Type Cclms</em>'.
	 * @see cclms.TrainTypeMst
	 * @see #getTrainTypeMst()
	 * @generated
	 */
	EReference getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms();

	/**
	 * Returns the meta object for the reference list '{@link cclms.TrainTypeMst <em>Ref Link Mst Train Type Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Mst Train Type Cd</em>'.
	 * @see cclms.TrainTypeMst
	 * @see #getTrainTypeMst()
	 * @generated
	 */
	EReference getTrainTypeMst_RefLinkMstTrainTypeCd();

	/**
	 * Returns the meta object for class '{@link cclms.TrainTypeMappingMst <em>Train Type Mapping Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Type Mapping Mst</em>'.
	 * @see cclms.TrainTypeMappingMst
	 * @generated
	 */
	EClass getTrainTypeMappingMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainTypeMappingMst#getTrainType <em>Train Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Type</em>'.
	 * @see cclms.TrainTypeMappingMst#getTrainType()
	 * @see #getTrainTypeMappingMst()
	 * @generated
	 */
	EAttribute getTrainTypeMappingMst_TrainType();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainTypeMappingMst#getTrainTypeDesc <em>Train Type Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Type Desc</em>'.
	 * @see cclms.TrainTypeMappingMst#getTrainTypeDesc()
	 * @see #getTrainTypeMappingMst()
	 * @generated
	 */
	EAttribute getTrainTypeMappingMst_TrainTypeDesc();

	/**
	 * Returns the meta object for the reference '{@link cclms.TrainTypeMappingMst <em>Ref Train Type Cclms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Train Type Cclms</em>'.
	 * @see cclms.TrainTypeMappingMst
	 * @see #getTrainTypeMappingMst()
	 * @generated
	 */
	EReference getTrainTypeMappingMst_RefTrainTypeCclms();

	/**
	 * Returns the meta object for class '{@link cclms.LinkDetail <em>Link Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Detail</em>'.
	 * @see cclms.LinkDetail
	 * @generated
	 */
	EClass getLinkDetail();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getCrewNo <em>Crew No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crew No</em>'.
	 * @see cclms.LinkDetail#getCrewNo()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_CrewNo();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see cclms.LinkDetail#getDay()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_Day();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getSignOnTime <em>Sign On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign On Time</em>'.
	 * @see cclms.LinkDetail#getSignOnTime()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_SignOnTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getDepartureTime <em>Departure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departure Time</em>'.
	 * @see cclms.LinkDetail#getDepartureTime()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_DepartureTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getArrivalTime <em>Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Time</em>'.
	 * @see cclms.LinkDetail#getArrivalTime()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_ArrivalTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getSignOffTime <em>Sign Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Off Time</em>'.
	 * @see cclms.LinkDetail#getSignOffTime()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_SignOffTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getOsAllowance <em>Os Allowance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Allowance</em>'.
	 * @see cclms.LinkDetail#getOsAllowance()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_OsAllowance();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getEarnedKm <em>Earned Km</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earned Km</em>'.
	 * @see cclms.LinkDetail#getEarnedKm()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_EarnedKm();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getPeriodicRestFlag <em>Periodic Rest Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodic Rest Flag</em>'.
	 * @see cclms.LinkDetail#getPeriodicRestFlag()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_PeriodicRestFlag();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getSpareFlag <em>Spare Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spare Flag</em>'.
	 * @see cclms.LinkDetail#getSpareFlag()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_SpareFlag();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getNightFlag <em>Night Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Night Flag</em>'.
	 * @see cclms.LinkDetail#getNightFlag()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_NightFlag();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getSortOrder <em>Sort Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Order</em>'.
	 * @see cclms.LinkDetail#getSortOrder()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_SortOrder();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getDutyDuration <em>Duty Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duty Duration</em>'.
	 * @see cclms.LinkDetail#getDutyDuration()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_DutyDuration();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getRunningDuration <em>Running Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Duration</em>'.
	 * @see cclms.LinkDetail#getRunningDuration()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_RunningDuration();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getHqRest <em>Hq Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hq Rest</em>'.
	 * @see cclms.LinkDetail#getHqRest()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_HqRest();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetail#getOsRest <em>Os Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Rest</em>'.
	 * @see cclms.LinkDetail#getOsRest()
	 * @see #getLinkDetail()
	 * @generated
	 */
	EAttribute getLinkDetail_OsRest();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkDetail <em>Ref From Stn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref From Stn</em>'.
	 * @see cclms.LinkDetail
	 * @see #getLinkDetail()
	 * @generated
	 */
	EReference getLinkDetail_RefFromStn();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkDetail <em>Ref Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Link Id</em>'.
	 * @see cclms.LinkDetail
	 * @see #getLinkDetail()
	 * @generated
	 */
	EReference getLinkDetail_RefLinkId();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkDetail <em>Ref To Stn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref To Stn</em>'.
	 * @see cclms.LinkDetail
	 * @see #getLinkDetail()
	 * @generated
	 */
	EReference getLinkDetail_RefToStn();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkDetail <em>Ref Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Train Id</em>'.
	 * @see cclms.LinkDetail
	 * @see #getLinkDetail()
	 * @generated
	 */
	EReference getLinkDetail_RefTrainId();

	/**
	 * Returns the meta object for class '{@link cclms.SegmentMst <em>Segment Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Mst</em>'.
	 * @see cclms.SegmentMst
	 * @generated
	 */
	EClass getSegmentMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.SegmentMst#getSegmentId <em>Segment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segment Id</em>'.
	 * @see cclms.SegmentMst#getSegmentId()
	 * @see #getSegmentMst()
	 * @generated
	 */
	EAttribute getSegmentMst_SegmentId();

	/**
	 * Returns the meta object for the reference '{@link cclms.SegmentMst <em>Ref Start Station Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Start Station Id</em>'.
	 * @see cclms.SegmentMst
	 * @see #getSegmentMst()
	 * @generated
	 */
	EReference getSegmentMst_RefStartStationId();

	/**
	 * Returns the meta object for the reference '{@link cclms.SegmentMst <em>Ref Stop Station Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Stop Station Id</em>'.
	 * @see cclms.SegmentMst
	 * @see #getSegmentMst()
	 * @generated
	 */
	EReference getSegmentMst_RefStopStationId();

	/**
	 * Returns the meta object for the reference list '{@link cclms.SegmentMst <em>Ref Train Segment Mst Segment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Train Segment Mst Segment Id</em>'.
	 * @see cclms.SegmentMst
	 * @see #getSegmentMst()
	 * @generated
	 */
	EReference getSegmentMst_RefTrainSegmentMstSegmentId();

	/**
	 * Returns the meta object for class '{@link cclms.TrainSegmentMst <em>Train Segment Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Segment Mst</em>'.
	 * @see cclms.TrainSegmentMst
	 * @generated
	 */
	EClass getTrainSegmentMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getTrainSegId <em>Train Seg Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Seg Id</em>'.
	 * @see cclms.TrainSegmentMst#getTrainSegId()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_TrainSegId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getCclmsTrainType <em>Cclms Train Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cclms Train Type</em>'.
	 * @see cclms.TrainSegmentMst#getCclmsTrainType()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_CclmsTrainType();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getSignOnTime <em>Sign On Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign On Time</em>'.
	 * @see cclms.TrainSegmentMst#getSignOnTime()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_SignOnTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see cclms.TrainSegmentMst#getStartTime()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see cclms.TrainSegmentMst#getEndTime()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getSignOffTime <em>Sign Off Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign Off Time</em>'.
	 * @see cclms.TrainSegmentMst#getSignOffTime()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_SignOffTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getRunningDuration <em>Running Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Duration</em>'.
	 * @see cclms.TrainSegmentMst#getRunningDuration()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_RunningDuration();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getChronicDelayTime <em>Chronic Delay Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chronic Delay Time</em>'.
	 * @see cclms.TrainSegmentMst#getChronicDelayTime()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_ChronicDelayTime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getDeptType <em>Dept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dept Type</em>'.
	 * @see cclms.TrainSegmentMst#getDeptType()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_DeptType();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getSpareFlag <em>Spare Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spare Flag</em>'.
	 * @see cclms.TrainSegmentMst#getSpareFlag()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_SpareFlag();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getDayofservice <em>Dayofservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dayofservice</em>'.
	 * @see cclms.TrainSegmentMst#getDayofservice()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_Dayofservice();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getActualKm <em>Actual Km</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Km</em>'.
	 * @see cclms.TrainSegmentMst#getActualKm()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_ActualKm();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentMst#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see cclms.TrainSegmentMst#getCreatedBy()
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EAttribute getTrainSegmentMst_CreatedBy();

	/**
	 * Returns the meta object for the reference '{@link cclms.TrainSegmentMst <em>Ref Loco Change Stn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Loco Change Stn</em>'.
	 * @see cclms.TrainSegmentMst
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EReference getTrainSegmentMst_RefLocoChangeStn();

	/**
	 * Returns the meta object for the reference '{@link cclms.TrainSegmentMst <em>Ref Segment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Segment Id</em>'.
	 * @see cclms.TrainSegmentMst
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EReference getTrainSegmentMst_RefSegmentId();

	/**
	 * Returns the meta object for the reference '{@link cclms.TrainSegmentMst <em>Ref Assigned Lobby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Assigned Lobby</em>'.
	 * @see cclms.TrainSegmentMst
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EReference getTrainSegmentMst_RefAssignedLobby();

	/**
	 * Returns the meta object for the reference '{@link cclms.TrainSegmentMst <em>Ref Traction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Traction Type</em>'.
	 * @see cclms.TrainSegmentMst
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EReference getTrainSegmentMst_RefTractionType();

	/**
	 * Returns the meta object for the reference '{@link cclms.TrainSegmentMst <em>Ref Train Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Train Id</em>'.
	 * @see cclms.TrainSegmentMst
	 * @see #getTrainSegmentMst()
	 * @generated
	 */
	EReference getTrainSegmentMst_RefTrainId();

	/**
	 * Returns the meta object for class '{@link cclms.LinkMst <em>Link Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Mst</em>'.
	 * @see cclms.LinkMst
	 * @generated
	 */
	EClass getLinkMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkMst#getLinkId <em>Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Id</em>'.
	 * @see cclms.LinkMst#getLinkId()
	 * @see #getLinkMst()
	 * @generated
	 */
	EAttribute getLinkMst_LinkId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkMst#getScenarioId <em>Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Id</em>'.
	 * @see cclms.LinkMst#getScenarioId()
	 * @see #getLinkMst()
	 * @generated
	 */
	EAttribute getLinkMst_ScenarioId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkMst#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see cclms.LinkMst#getLinkName()
	 * @see #getLinkMst()
	 * @generated
	 */
	EAttribute getLinkMst_LinkName();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkMst#getLobbyType <em>Lobby Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Type</em>'.
	 * @see cclms.LinkMst#getLobbyType()
	 * @see #getLinkMst()
	 * @generated
	 */
	EAttribute getLinkMst_LobbyType();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkMst#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see cclms.LinkMst#getCreatedBy()
	 * @see #getLinkMst()
	 * @generated
	 */
	EAttribute getLinkMst_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkMst#getLastModifiedBy <em>Last Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By</em>'.
	 * @see cclms.LinkMst#getLastModifiedBy()
	 * @see #getLinkMst()
	 * @generated
	 */
	EAttribute getLinkMst_LastModifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkMst#getLinkStatus <em>Link Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Status</em>'.
	 * @see cclms.LinkMst#getLinkStatus()
	 * @see #getLinkMst()
	 * @generated
	 */
	EAttribute getLinkMst_LinkStatus();

	/**
	 * Returns the meta object for the reference list '{@link cclms.LinkMst <em>Ref Parameter Value Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Parameter Value Link Id</em>'.
	 * @see cclms.LinkMst
	 * @see #getLinkMst()
	 * @generated
	 */
	EReference getLinkMst_RefParameterValueLinkId();

	/**
	 * Returns the meta object for the reference list '{@link cclms.LinkMst <em>Ref Kpi Value Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Kpi Value Link Id</em>'.
	 * @see cclms.LinkMst
	 * @see #getLinkMst()
	 * @generated
	 */
	EReference getLinkMst_RefKpiValueLinkId();

	/**
	 * Returns the meta object for the reference list '{@link cclms.LinkMst <em>Ref Link Detail Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Link Detail Link Id</em>'.
	 * @see cclms.LinkMst
	 * @see #getLinkMst()
	 * @generated
	 */
	EReference getLinkMst_RefLinkDetailLinkId();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkMst <em>Ref Lobby Stn Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Lobby Stn Id</em>'.
	 * @see cclms.LinkMst
	 * @see #getLinkMst()
	 * @generated
	 */
	EReference getLinkMst_RefLobbyStnId();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkMst <em>Ref Traction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Traction Type</em>'.
	 * @see cclms.LinkMst
	 * @see #getLinkMst()
	 * @generated
	 */
	EReference getLinkMst_RefTractionType();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkMst <em>Ref Train Frequency Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Train Frequency Cd</em>'.
	 * @see cclms.LinkMst
	 * @see #getLinkMst()
	 * @generated
	 */
	EReference getLinkMst_RefTrainFrequencyCd();

	/**
	 * Returns the meta object for the reference '{@link cclms.LinkMst <em>Ref Train Type Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Train Type Cd</em>'.
	 * @see cclms.LinkMst
	 * @see #getLinkMst()
	 * @generated
	 */
	EReference getLinkMst_RefTrainTypeCd();

	/**
	 * Returns the meta object for class '{@link cclms.LobbyMst <em>Lobby Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lobby Mst</em>'.
	 * @see cclms.LobbyMst
	 * @generated
	 */
	EClass getLobbyMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LobbyMst#getLobbyCode <em>Lobby Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Code</em>'.
	 * @see cclms.LobbyMst#getLobbyCode()
	 * @see #getLobbyMst()
	 * @generated
	 */
	EAttribute getLobbyMst_LobbyCode();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LobbyMst#getLobbyName <em>Lobby Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Name</em>'.
	 * @see cclms.LobbyMst#getLobbyName()
	 * @see #getLobbyMst()
	 * @generated
	 */
	EAttribute getLobbyMst_LobbyName();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LobbyMst#getLobbyId <em>Lobby Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Id</em>'.
	 * @see cclms.LobbyMst#getLobbyId()
	 * @see #getLobbyMst()
	 * @generated
	 */
	EAttribute getLobbyMst_LobbyId();

	/**
	 * Returns the meta object for class '{@link cclms.TrainSegmentEngine <em>Train Segment Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Segment Engine</em>'.
	 * @see cclms.TrainSegmentEngine
	 * @generated
	 */
	EClass getTrainSegmentEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getTrainid <em>Trainid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trainid</em>'.
	 * @see cclms.TrainSegmentEngine#getTrainid()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Trainid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getLegid <em>Legid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legid</em>'.
	 * @see cclms.TrainSegmentEngine#getLegid()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Legid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getStartloc <em>Startloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startloc</em>'.
	 * @see cclms.TrainSegmentEngine#getStartloc()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Startloc();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getEndloc <em>Endloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endloc</em>'.
	 * @see cclms.TrainSegmentEngine#getEndloc()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Endloc();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getSignon <em>Signon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signon</em>'.
	 * @see cclms.TrainSegmentEngine#getSignon()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Signon();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see cclms.TrainSegmentEngine#getStart()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Start();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see cclms.TrainSegmentEngine#getEnd()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_End();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getSignoff <em>Signoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signoff</em>'.
	 * @see cclms.TrainSegmentEngine#getSignoff()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Signoff();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see cclms.TrainSegmentEngine#getDuration()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Duration();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see cclms.TrainSegmentEngine#getDistance()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Distance();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getNightflag <em>Nightflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nightflag</em>'.
	 * @see cclms.TrainSegmentEngine#getNightflag()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Nightflag();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getDayid <em>Dayid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dayid</em>'.
	 * @see cclms.TrainSegmentEngine#getDayid()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Dayid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TrainSegmentEngine#getSpareflag <em>Spareflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spareflag</em>'.
	 * @see cclms.TrainSegmentEngine#getSpareflag()
	 * @see #getTrainSegmentEngine()
	 * @generated
	 */
	EAttribute getTrainSegmentEngine_Spareflag();

	/**
	 * Returns the meta object for class '{@link cclms.SegmentMstEngine <em>Segment Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Mst Engine</em>'.
	 * @see cclms.SegmentMstEngine
	 * @generated
	 */
	EClass getSegmentMstEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.SegmentMstEngine#getFromstation <em>Fromstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fromstation</em>'.
	 * @see cclms.SegmentMstEngine#getFromstation()
	 * @see #getSegmentMstEngine()
	 * @generated
	 */
	EAttribute getSegmentMstEngine_Fromstation();

	/**
	 * Returns the meta object for the attribute '{@link cclms.SegmentMstEngine#getTostation <em>Tostation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tostation</em>'.
	 * @see cclms.SegmentMstEngine#getTostation()
	 * @see #getSegmentMstEngine()
	 * @generated
	 */
	EAttribute getSegmentMstEngine_Tostation();

	/**
	 * Returns the meta object for the attribute '{@link cclms.SegmentMstEngine#getSegmentid <em>Segmentid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segmentid</em>'.
	 * @see cclms.SegmentMstEngine#getSegmentid()
	 * @see #getSegmentMstEngine()
	 * @generated
	 */
	EAttribute getSegmentMstEngine_Segmentid();

	/**
	 * Returns the meta object for class '{@link cclms.TimeToMinEngine <em>Time To Min Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time To Min Engine</em>'.
	 * @see cclms.TimeToMinEngine
	 * @generated
	 */
	EClass getTimeToMinEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getTrainid <em>Trainid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trainid</em>'.
	 * @see cclms.TimeToMinEngine#getTrainid()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Trainid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getSegmentid <em>Segmentid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segmentid</em>'.
	 * @see cclms.TimeToMinEngine#getSegmentid()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Segmentid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getSignontime <em>Signontime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signontime</em>'.
	 * @see cclms.TimeToMinEngine#getSignontime()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Signontime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getSignominute <em>Signominute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signominute</em>'.
	 * @see cclms.TimeToMinEngine#getSignominute()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Signominute();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getStarttime <em>Starttime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starttime</em>'.
	 * @see cclms.TimeToMinEngine#getStarttime()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Starttime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getStartminute <em>Startminute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startminute</em>'.
	 * @see cclms.TimeToMinEngine#getStartminute()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Startminute();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getEndtime <em>Endtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endtime</em>'.
	 * @see cclms.TimeToMinEngine#getEndtime()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Endtime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getEndminute <em>Endminute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endminute</em>'.
	 * @see cclms.TimeToMinEngine#getEndminute()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Endminute();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getSignofftime <em>Signofftime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signofftime</em>'.
	 * @see cclms.TimeToMinEngine#getSignofftime()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Signofftime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getSignoffminute <em>Signoffminute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signoffminute</em>'.
	 * @see cclms.TimeToMinEngine#getSignoffminute()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Signoffminute();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getDayid <em>Dayid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dayid</em>'.
	 * @see cclms.TimeToMinEngine#getDayid()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Dayid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.TimeToMinEngine#getSpareflag <em>Spareflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spareflag</em>'.
	 * @see cclms.TimeToMinEngine#getSpareflag()
	 * @see #getTimeToMinEngine()
	 * @generated
	 */
	EAttribute getTimeToMinEngine_Spareflag();

	/**
	 * Returns the meta object for class '{@link cclms.DayMstEngine <em>Day Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Mst Engine</em>'.
	 * @see cclms.DayMstEngine
	 * @generated
	 */
	EClass getDayMstEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.DayMstEngine#getDayId <em>Day Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Id</em>'.
	 * @see cclms.DayMstEngine#getDayId()
	 * @see #getDayMstEngine()
	 * @generated
	 */
	EAttribute getDayMstEngine_DayId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.DayMstEngine#getDayDesc <em>Day Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Desc</em>'.
	 * @see cclms.DayMstEngine#getDayDesc()
	 * @see #getDayMstEngine()
	 * @generated
	 */
	EAttribute getDayMstEngine_DayDesc();

	/**
	 * Returns the meta object for class '{@link cclms.KpiLinkEngine <em>Kpi Link Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kpi Link Engine</em>'.
	 * @see cclms.KpiLinkEngine
	 * @generated
	 */
	EClass getKpiLinkEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiLinkEngine#getKpiId <em>Kpi Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kpi Id</em>'.
	 * @see cclms.KpiLinkEngine#getKpiId()
	 * @see #getKpiLinkEngine()
	 * @generated
	 */
	EAttribute getKpiLinkEngine_KpiId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiLinkEngine#getKpiDesc <em>Kpi Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kpi Desc</em>'.
	 * @see cclms.KpiLinkEngine#getKpiDesc()
	 * @see #getKpiLinkEngine()
	 * @generated
	 */
	EAttribute getKpiLinkEngine_KpiDesc();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiLinkEngine#getKpiValue <em>Kpi Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kpi Value</em>'.
	 * @see cclms.KpiLinkEngine#getKpiValue()
	 * @see #getKpiLinkEngine()
	 * @generated
	 */
	EAttribute getKpiLinkEngine_KpiValue();

	/**
	 * Returns the meta object for the attribute '{@link cclms.KpiLinkEngine#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom</em>'.
	 * @see cclms.KpiLinkEngine#getUom()
	 * @see #getKpiLinkEngine()
	 * @generated
	 */
	EAttribute getKpiLinkEngine_Uom();

	/**
	 * Returns the meta object for class '{@link cclms.LinkDetailEngine <em>Link Detail Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Detail Engine</em>'.
	 * @see cclms.LinkDetailEngine
	 * @generated
	 */
	EClass getLinkDetailEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getDayname <em>Dayname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dayname</em>'.
	 * @see cclms.LinkDetailEngine#getDayname()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Dayname();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getSeqid <em>Seqid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seqid</em>'.
	 * @see cclms.LinkDetailEngine#getSeqid()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Seqid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getTrainno <em>Trainno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trainno</em>'.
	 * @see cclms.LinkDetailEngine#getTrainno()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Trainno();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getFromstation <em>Fromstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fromstation</em>'.
	 * @see cclms.LinkDetailEngine#getFromstation()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Fromstation();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getTostation <em>Tostation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tostation</em>'.
	 * @see cclms.LinkDetailEngine#getTostation()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Tostation();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getSignontime <em>Signontime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signontime</em>'.
	 * @see cclms.LinkDetailEngine#getSignontime()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Signontime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getDeparturetime <em>Departuretime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Departuretime</em>'.
	 * @see cclms.LinkDetailEngine#getDeparturetime()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Departuretime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getArrivaltime <em>Arrivaltime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrivaltime</em>'.
	 * @see cclms.LinkDetailEngine#getArrivaltime()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Arrivaltime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getSignofftime <em>Signofftime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signofftime</em>'.
	 * @see cclms.LinkDetailEngine#getSignofftime()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Signofftime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getDutydurtion <em>Dutydurtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dutydurtion</em>'.
	 * @see cclms.LinkDetailEngine#getDutydurtion()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Dutydurtion();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getDutyminutes <em>Dutyminutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dutyminutes</em>'.
	 * @see cclms.LinkDetailEngine#getDutyminutes()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Dutyminutes();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see cclms.LinkDetailEngine#getDistance()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Distance();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getNib <em>Nib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nib</em>'.
	 * @see cclms.LinkDetailEngine#getNib()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Nib();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getSortorder <em>Sortorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortorder</em>'.
	 * @see cclms.LinkDetailEngine#getSortorder()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Sortorder();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getDayid <em>Dayid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dayid</em>'.
	 * @see cclms.LinkDetailEngine#getDayid()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Dayid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LinkDetailEngine#getSpareflag <em>Spareflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spareflag</em>'.
	 * @see cclms.LinkDetailEngine#getSpareflag()
	 * @see #getLinkDetailEngine()
	 * @generated
	 */
	EAttribute getLinkDetailEngine_Spareflag();

	/**
	 * Returns the meta object for class '{@link cclms.OutlinkEngine <em>Outlink Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outlink Engine</em>'.
	 * @see cclms.OutlinkEngine
	 * @generated
	 */
	EClass getOutlinkEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getDayid <em>Dayid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dayid</em>'.
	 * @see cclms.OutlinkEngine#getDayid()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Dayid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getSeqid <em>Seqid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seqid</em>'.
	 * @see cclms.OutlinkEngine#getSeqid()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Seqid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getPairingid <em>Pairingid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pairingid</em>'.
	 * @see cclms.OutlinkEngine#getPairingid()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Pairingid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getDutyid <em>Dutyid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dutyid</em>'.
	 * @see cclms.OutlinkEngine#getDutyid()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Dutyid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getTrainid <em>Trainid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trainid</em>'.
	 * @see cclms.OutlinkEngine#getTrainid()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Trainid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getLegid <em>Legid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Legid</em>'.
	 * @see cclms.OutlinkEngine#getLegid()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Legid();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getStartloc <em>Startloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startloc</em>'.
	 * @see cclms.OutlinkEngine#getStartloc()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Startloc();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getEndloc <em>Endloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endloc</em>'.
	 * @see cclms.OutlinkEngine#getEndloc()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Endloc();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getDutysignon <em>Dutysignon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dutysignon</em>'.
	 * @see cclms.OutlinkEngine#getDutysignon()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Dutysignon();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getStarttime <em>Starttime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starttime</em>'.
	 * @see cclms.OutlinkEngine#getStarttime()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Starttime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getEndtime <em>Endtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endtime</em>'.
	 * @see cclms.OutlinkEngine#getEndtime()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Endtime();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getDutysignoff <em>Dutysignoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dutysignoff</em>'.
	 * @see cclms.OutlinkEngine#getDutysignoff()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Dutysignoff();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see cclms.OutlinkEngine#getDuration()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Duration();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getNib <em>Nib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nib</em>'.
	 * @see cclms.OutlinkEngine#getNib()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Nib();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getSpareflag <em>Spareflag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spareflag</em>'.
	 * @see cclms.OutlinkEngine#getSpareflag()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Spareflag();

	/**
	 * Returns the meta object for the attribute '{@link cclms.OutlinkEngine#getSortorder <em>Sortorder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortorder</em>'.
	 * @see cclms.OutlinkEngine#getSortorder()
	 * @see #getOutlinkEngine()
	 * @generated
	 */
	EAttribute getOutlinkEngine_Sortorder();

	/**
	 * Returns the meta object for class '{@link cclms.LobbyMstEngine <em>Lobby Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lobby Mst Engine</em>'.
	 * @see cclms.LobbyMstEngine
	 * @generated
	 */
	EClass getLobbyMstEngine();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LobbyMstEngine#getLobbyCode <em>Lobby Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Code</em>'.
	 * @see cclms.LobbyMstEngine#getLobbyCode()
	 * @see #getLobbyMstEngine()
	 * @generated
	 */
	EAttribute getLobbyMstEngine_LobbyCode();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LobbyMstEngine#getLobbyName <em>Lobby Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Name</em>'.
	 * @see cclms.LobbyMstEngine#getLobbyName()
	 * @see #getLobbyMstEngine()
	 * @generated
	 */
	EAttribute getLobbyMstEngine_LobbyName();

	/**
	 * Returns the meta object for the attribute '{@link cclms.LobbyMstEngine#getLobbyId <em>Lobby Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lobby Id</em>'.
	 * @see cclms.LobbyMstEngine#getLobbyId()
	 * @see #getLobbyMstEngine()
	 * @generated
	 */
	EAttribute getLobbyMstEngine_LobbyId();

	/**
	 * Returns the meta object for class '{@link cclms.UserMst <em>User Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Mst</em>'.
	 * @see cclms.UserMst
	 * @generated
	 */
	EClass getUserMst();

	/**
	 * Returns the meta object for the attribute '{@link cclms.UserMst#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see cclms.UserMst#getUserId()
	 * @see #getUserMst()
	 * @generated
	 */
	EAttribute getUserMst_UserId();

	/**
	 * Returns the meta object for the attribute '{@link cclms.UserMst#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see cclms.UserMst#getUser()
	 * @see #getUserMst()
	 * @generated
	 */
	EAttribute getUserMst_User();

	/**
	 * Returns the meta object for the attribute '{@link cclms.UserMst#getDivisionId <em>Division Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Division Id</em>'.
	 * @see cclms.UserMst#getDivisionId()
	 * @see #getUserMst()
	 * @generated
	 */
	EAttribute getUserMst_DivisionId();

	/**
	 * Returns the meta object for class '{@link cclms.CclmsCollector <em>Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collector</em>'.
	 * @see cclms.CclmsCollector
	 * @generated
	 */
	EClass getCclmsCollector();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getStationMst <em>Station Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station Mst</em>'.
	 * @see cclms.CclmsCollector#getStationMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_StationMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTrainFrequencyMst <em>Train Frequency Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Frequency Mst</em>'.
	 * @see cclms.CclmsCollector#getTrainFrequencyMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TrainFrequencyMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTractionMst <em>Traction Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traction Mst</em>'.
	 * @see cclms.CclmsCollector#getTractionMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TractionMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTrainMst <em>Train Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Mst</em>'.
	 * @see cclms.CclmsCollector#getTrainMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TrainMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Value</em>'.
	 * @see cclms.CclmsCollector#getParameterValue()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_ParameterValue();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getKpiMst <em>Kpi Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kpi Mst</em>'.
	 * @see cclms.CclmsCollector#getKpiMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_KpiMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getKpiValue <em>Kpi Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kpi Value</em>'.
	 * @see cclms.CclmsCollector#getKpiValue()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_KpiValue();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getParameterMst <em>Parameter Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mst</em>'.
	 * @see cclms.CclmsCollector#getParameterMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_ParameterMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTrainTypeMst <em>Train Type Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Type Mst</em>'.
	 * @see cclms.CclmsCollector#getTrainTypeMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TrainTypeMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTrainTypeMappingMst <em>Train Type Mapping Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Type Mapping Mst</em>'.
	 * @see cclms.CclmsCollector#getTrainTypeMappingMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TrainTypeMappingMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getLinkDetail <em>Link Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Detail</em>'.
	 * @see cclms.CclmsCollector#getLinkDetail()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_LinkDetail();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getSegmentMst <em>Segment Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment Mst</em>'.
	 * @see cclms.CclmsCollector#getSegmentMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_SegmentMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTrainSegmentMst <em>Train Segment Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Segment Mst</em>'.
	 * @see cclms.CclmsCollector#getTrainSegmentMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TrainSegmentMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getLinkMst <em>Link Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Mst</em>'.
	 * @see cclms.CclmsCollector#getLinkMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_LinkMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getLobbyMst <em>Lobby Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lobby Mst</em>'.
	 * @see cclms.CclmsCollector#getLobbyMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_LobbyMst();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTrainSegmentEngine <em>Train Segment Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Segment Engine</em>'.
	 * @see cclms.CclmsCollector#getTrainSegmentEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TrainSegmentEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getSegmentMstEngine <em>Segment Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment Mst Engine</em>'.
	 * @see cclms.CclmsCollector#getSegmentMstEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_SegmentMstEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getTimeToMinEngine <em>Time To Min Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time To Min Engine</em>'.
	 * @see cclms.CclmsCollector#getTimeToMinEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_TimeToMinEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getDayMstEngine <em>Day Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Day Mst Engine</em>'.
	 * @see cclms.CclmsCollector#getDayMstEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_DayMstEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getKpiLinkEngine <em>Kpi Link Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kpi Link Engine</em>'.
	 * @see cclms.CclmsCollector#getKpiLinkEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_KpiLinkEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getLinkDetailEngine <em>Link Detail Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Detail Engine</em>'.
	 * @see cclms.CclmsCollector#getLinkDetailEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_LinkDetailEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getOutlinkEngine <em>Outlink Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outlink Engine</em>'.
	 * @see cclms.CclmsCollector#getOutlinkEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_OutlinkEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getLobbyMstEngine <em>Lobby Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lobby Mst Engine</em>'.
	 * @see cclms.CclmsCollector#getLobbyMstEngine()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_LobbyMstEngine();

	/**
	 * Returns the meta object for the containment reference list '{@link cclms.CclmsCollector#getUserMst <em>User Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Mst</em>'.
	 * @see cclms.CclmsCollector#getUserMst()
	 * @see #getCclmsCollector()
	 * @generated
	 */
	EReference getCclmsCollector_UserMst();

	/**
	 * Returns the meta object for class '{@link ilog.odm.dom.IloDomCollector <em>ilog odm dom Ilo Dom Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ilog odm dom Ilo Dom Collector</em>'.
	 * @see ilog.odm.dom.IloDomCollector
	 * @generated
	 */
	EClass getilog_odm_dom_IloDomCollector();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link java.sql.Time <em>java sql Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>java sql Time</em>'.
	 * @see java.sql.Time
	 * @generated
	 */
	EDataType getjava_sql_Time();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CclmsFactory getCclmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cclms.impl.StationMstImpl <em>Station Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.StationMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getStationMst()
		 * @generated
		 */
		EClass STATION_MST = eINSTANCE.getStationMst();

		/**
		 * The meta object literal for the '<em><b>Station Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_MST__STATION_ID = eINSTANCE
				.getStationMst_StationId();

		/**
		 * The meta object literal for the '<em><b>Station Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_MST__STATION_CODE = eINSTANCE
				.getStationMst_StationCode();

		/**
		 * The meta object literal for the '<em><b>Station Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_MST__STATION_NAME = eINSTANCE
				.getStationMst_StationName();

		/**
		 * The meta object literal for the '<em><b>Lobby Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_MST__LOBBY_FLAG = eINSTANCE
				.getStationMst_LobbyFlag();

		/**
		 * The meta object literal for the '<em><b>Ref Link Detail From Stn</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_MST__REF_LINK_DETAIL_FROM_STN = eINSTANCE
				.getStationMst_RefLinkDetailFromStn();

		/**
		 * The meta object literal for the '<em><b>Ref Link Detail To Stn</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_MST__REF_LINK_DETAIL_TO_STN = eINSTANCE
				.getStationMst_RefLinkDetailToStn();

		/**
		 * The meta object literal for the '<em><b>Ref Segment Mst Start Station Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_MST__REF_SEGMENT_MST_START_STATION_ID = eINSTANCE
				.getStationMst_RefSegmentMstStartStationId();

		/**
		 * The meta object literal for the '<em><b>Ref Segment Mst Stop Station Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID = eINSTANCE
				.getStationMst_RefSegmentMstStopStationId();

		/**
		 * The meta object literal for the '<em><b>Ref Train Segment Mst Loco Change Stn</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN = eINSTANCE
				.getStationMst_RefTrainSegmentMstLocoChangeStn();

		/**
		 * The meta object literal for the '<em><b>Ref Train Segment Mst Assigned Lobby</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY = eINSTANCE
				.getStationMst_RefTrainSegmentMstAssignedLobby();

		/**
		 * The meta object literal for the '<em><b>Ref Link Mst Lobby Stn Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_MST__REF_LINK_MST_LOBBY_STN_ID = eINSTANCE
				.getStationMst_RefLinkMstLobbyStnId();

		/**
		 * The meta object literal for the '{@link cclms.impl.TrainFrequencyMstImpl <em>Train Frequency Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TrainFrequencyMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getTrainFrequencyMst()
		 * @generated
		 */
		EClass TRAIN_FREQUENCY_MST = eINSTANCE.getTrainFrequencyMst();

		/**
		 * The meta object literal for the '<em><b>Train Frequency Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE = eINSTANCE
				.getTrainFrequencyMst_TrainFrequencyCode();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_FREQUENCY_MST__DESC = eINSTANCE
				.getTrainFrequencyMst_Desc();

		/**
		 * The meta object literal for the '<em><b>Ref Link Mst Train Frequency Cd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD = eINSTANCE
				.getTrainFrequencyMst_RefLinkMstTrainFrequencyCd();

		/**
		 * The meta object literal for the '{@link cclms.impl.TractionMstImpl <em>Traction Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TractionMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getTractionMst()
		 * @generated
		 */
		EClass TRACTION_MST = eINSTANCE.getTractionMst();

		/**
		 * The meta object literal for the '<em><b>Traction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACTION_MST__TRACTION_TYPE = eINSTANCE
				.getTractionMst_TractionType();

		/**
		 * The meta object literal for the '<em><b>Traction Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACTION_MST__TRACTION_DESC = eINSTANCE
				.getTractionMst_TractionDesc();

		/**
		 * The meta object literal for the '<em><b>Ref Train Segment Mst Traction Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE = eINSTANCE
				.getTractionMst_RefTrainSegmentMstTractionType();

		/**
		 * The meta object literal for the '<em><b>Ref Link Mst Traction Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACTION_MST__REF_LINK_MST_TRACTION_TYPE = eINSTANCE
				.getTractionMst_RefLinkMstTractionType();

		/**
		 * The meta object literal for the '{@link cclms.impl.TrainMstImpl <em>Train Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TrainMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getTrainMst()
		 * @generated
		 */
		EClass TRAIN_MST = eINSTANCE.getTrainMst();

		/**
		 * The meta object literal for the '<em><b>Train Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_MST__TRAIN_ID = eINSTANCE.getTrainMst_TrainId();

		/**
		 * The meta object literal for the '<em><b>Train Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_MST__TRAIN_NBR = eINSTANCE.getTrainMst_TrainNbr();

		/**
		 * The meta object literal for the '<em><b>Train Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_MST__TRAIN_NAME = eINSTANCE.getTrainMst_TrainName();

		/**
		 * The meta object literal for the '<em><b>Ref Link Detail Train Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID = eINSTANCE
				.getTrainMst_RefLinkDetailTrainId();

		/**
		 * The meta object literal for the '<em><b>Ref Train Segment Mst Train Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID = eINSTANCE
				.getTrainMst_RefTrainSegmentMstTrainId();

		/**
		 * The meta object literal for the '{@link cclms.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.ParameterValueImpl
		 * @see cclms.impl.CclmsPackageImpl#getParameterValue()
		 * @generated
		 */
		EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_VALUE__VALUE = eINSTANCE.getParameterValue_Value();

		/**
		 * The meta object literal for the '<em><b>Ref Link Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__REF_LINK_ID = eINSTANCE
				.getParameterValue_RefLinkId();

		/**
		 * The meta object literal for the '<em><b>Ref Parameter Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_VALUE__REF_PARAMETER_ID = eINSTANCE
				.getParameterValue_RefParameterId();

		/**
		 * The meta object literal for the '{@link cclms.impl.KpiMstImpl <em>Kpi Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.KpiMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getKpiMst()
		 * @generated
		 */
		EClass KPI_MST = eINSTANCE.getKpiMst();

		/**
		 * The meta object literal for the '<em><b>Kpi Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_MST__KPI_ID = eINSTANCE.getKpiMst_KpiId();

		/**
		 * The meta object literal for the '<em><b>Kpi Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_MST__KPI_DESC = eINSTANCE.getKpiMst_KpiDesc();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_MST__UOM = eINSTANCE.getKpiMst_Uom();

		/**
		 * The meta object literal for the '<em><b>Ref Kpi Value Kpi Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI_MST__REF_KPI_VALUE_KPI_ID = eINSTANCE
				.getKpiMst_RefKpiValueKpiId();

		/**
		 * The meta object literal for the '{@link cclms.impl.KpiValueImpl <em>Kpi Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.KpiValueImpl
		 * @see cclms.impl.CclmsPackageImpl#getKpiValue()
		 * @generated
		 */
		EClass KPI_VALUE = eINSTANCE.getKpiValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_VALUE__VALUE = eINSTANCE.getKpiValue_Value();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_VALUE__CREATED_BY = eINSTANCE.getKpiValue_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Ref Kpi Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI_VALUE__REF_KPI_ID = eINSTANCE.getKpiValue_RefKpiId();

		/**
		 * The meta object literal for the '<em><b>Ref Link Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI_VALUE__REF_LINK_ID = eINSTANCE.getKpiValue_RefLinkId();

		/**
		 * The meta object literal for the '{@link cclms.impl.ParameterMstImpl <em>Parameter Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.ParameterMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getParameterMst()
		 * @generated
		 */
		EClass PARAMETER_MST = eINSTANCE.getParameterMst();

		/**
		 * The meta object literal for the '<em><b>Parameter Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MST__PARAMETER_ID = eINSTANCE
				.getParameterMst_ParameterId();

		/**
		 * The meta object literal for the '<em><b>Parameter Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MST__PARAMETER_DESC = eINSTANCE
				.getParameterMst_ParameterDesc();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MST__UOM = eINSTANCE.getParameterMst_Uom();

		/**
		 * The meta object literal for the '<em><b>Global Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MST__GLOBAL_VALUE = eINSTANCE
				.getParameterMst_GlobalValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MST__MIN_VALUE = eINSTANCE
				.getParameterMst_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_MST__MAX_VALUE = eINSTANCE
				.getParameterMst_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Ref Parameter Value Parameter Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID = eINSTANCE
				.getParameterMst_RefParameterValueParameterId();

		/**
		 * The meta object literal for the '{@link cclms.impl.TrainTypeMstImpl <em>Train Type Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TrainTypeMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getTrainTypeMst()
		 * @generated
		 */
		EClass TRAIN_TYPE_MST = eINSTANCE.getTrainTypeMst();

		/**
		 * The meta object literal for the '<em><b>Train Type Cclms Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID = eINSTANCE
				.getTrainTypeMst_TrainTypeCclmsId();

		/**
		 * The meta object literal for the '<em><b>Train Type Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_TYPE_MST__TRAIN_TYPE_DESC = eINSTANCE
				.getTrainTypeMst_TrainTypeDesc();

		/**
		 * The meta object literal for the '<em><b>Ref Train Type Mapping Mst Train Type Cclms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS = eINSTANCE
				.getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms();

		/**
		 * The meta object literal for the '<em><b>Ref Link Mst Train Type Cd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD = eINSTANCE
				.getTrainTypeMst_RefLinkMstTrainTypeCd();

		/**
		 * The meta object literal for the '{@link cclms.impl.TrainTypeMappingMstImpl <em>Train Type Mapping Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TrainTypeMappingMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getTrainTypeMappingMst()
		 * @generated
		 */
		EClass TRAIN_TYPE_MAPPING_MST = eINSTANCE.getTrainTypeMappingMst();

		/**
		 * The meta object literal for the '<em><b>Train Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE = eINSTANCE
				.getTrainTypeMappingMst_TrainType();

		/**
		 * The meta object literal for the '<em><b>Train Type Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC = eINSTANCE
				.getTrainTypeMappingMst_TrainTypeDesc();

		/**
		 * The meta object literal for the '<em><b>Ref Train Type Cclms</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS = eINSTANCE
				.getTrainTypeMappingMst_RefTrainTypeCclms();

		/**
		 * The meta object literal for the '{@link cclms.impl.LinkDetailImpl <em>Link Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.LinkDetailImpl
		 * @see cclms.impl.CclmsPackageImpl#getLinkDetail()
		 * @generated
		 */
		EClass LINK_DETAIL = eINSTANCE.getLinkDetail();

		/**
		 * The meta object literal for the '<em><b>Crew No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__CREW_NO = eINSTANCE.getLinkDetail_CrewNo();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__DAY = eINSTANCE.getLinkDetail_Day();

		/**
		 * The meta object literal for the '<em><b>Sign On Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__SIGN_ON_TIME = eINSTANCE
				.getLinkDetail_SignOnTime();

		/**
		 * The meta object literal for the '<em><b>Departure Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__DEPARTURE_TIME = eINSTANCE
				.getLinkDetail_DepartureTime();

		/**
		 * The meta object literal for the '<em><b>Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__ARRIVAL_TIME = eINSTANCE
				.getLinkDetail_ArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Sign Off Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__SIGN_OFF_TIME = eINSTANCE
				.getLinkDetail_SignOffTime();

		/**
		 * The meta object literal for the '<em><b>Os Allowance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__OS_ALLOWANCE = eINSTANCE
				.getLinkDetail_OsAllowance();

		/**
		 * The meta object literal for the '<em><b>Earned Km</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__EARNED_KM = eINSTANCE.getLinkDetail_EarnedKm();

		/**
		 * The meta object literal for the '<em><b>Periodic Rest Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__PERIODIC_REST_FLAG = eINSTANCE
				.getLinkDetail_PeriodicRestFlag();

		/**
		 * The meta object literal for the '<em><b>Spare Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__SPARE_FLAG = eINSTANCE
				.getLinkDetail_SpareFlag();

		/**
		 * The meta object literal for the '<em><b>Night Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__NIGHT_FLAG = eINSTANCE
				.getLinkDetail_NightFlag();

		/**
		 * The meta object literal for the '<em><b>Sort Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__SORT_ORDER = eINSTANCE
				.getLinkDetail_SortOrder();

		/**
		 * The meta object literal for the '<em><b>Duty Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__DUTY_DURATION = eINSTANCE
				.getLinkDetail_DutyDuration();

		/**
		 * The meta object literal for the '<em><b>Running Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__RUNNING_DURATION = eINSTANCE
				.getLinkDetail_RunningDuration();

		/**
		 * The meta object literal for the '<em><b>Hq Rest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__HQ_REST = eINSTANCE.getLinkDetail_HqRest();

		/**
		 * The meta object literal for the '<em><b>Os Rest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL__OS_REST = eINSTANCE.getLinkDetail_OsRest();

		/**
		 * The meta object literal for the '<em><b>Ref From Stn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_DETAIL__REF_FROM_STN = eINSTANCE
				.getLinkDetail_RefFromStn();

		/**
		 * The meta object literal for the '<em><b>Ref Link Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_DETAIL__REF_LINK_ID = eINSTANCE
				.getLinkDetail_RefLinkId();

		/**
		 * The meta object literal for the '<em><b>Ref To Stn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_DETAIL__REF_TO_STN = eINSTANCE.getLinkDetail_RefToStn();

		/**
		 * The meta object literal for the '<em><b>Ref Train Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_DETAIL__REF_TRAIN_ID = eINSTANCE
				.getLinkDetail_RefTrainId();

		/**
		 * The meta object literal for the '{@link cclms.impl.SegmentMstImpl <em>Segment Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.SegmentMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getSegmentMst()
		 * @generated
		 */
		EClass SEGMENT_MST = eINSTANCE.getSegmentMst();

		/**
		 * The meta object literal for the '<em><b>Segment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_MST__SEGMENT_ID = eINSTANCE
				.getSegmentMst_SegmentId();

		/**
		 * The meta object literal for the '<em><b>Ref Start Station Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_MST__REF_START_STATION_ID = eINSTANCE
				.getSegmentMst_RefStartStationId();

		/**
		 * The meta object literal for the '<em><b>Ref Stop Station Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_MST__REF_STOP_STATION_ID = eINSTANCE
				.getSegmentMst_RefStopStationId();

		/**
		 * The meta object literal for the '<em><b>Ref Train Segment Mst Segment Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID = eINSTANCE
				.getSegmentMst_RefTrainSegmentMstSegmentId();

		/**
		 * The meta object literal for the '{@link cclms.impl.TrainSegmentMstImpl <em>Train Segment Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TrainSegmentMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getTrainSegmentMst()
		 * @generated
		 */
		EClass TRAIN_SEGMENT_MST = eINSTANCE.getTrainSegmentMst();

		/**
		 * The meta object literal for the '<em><b>Train Seg Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__TRAIN_SEG_ID = eINSTANCE
				.getTrainSegmentMst_TrainSegId();

		/**
		 * The meta object literal for the '<em><b>Cclms Train Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE = eINSTANCE
				.getTrainSegmentMst_CclmsTrainType();

		/**
		 * The meta object literal for the '<em><b>Sign On Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__SIGN_ON_TIME = eINSTANCE
				.getTrainSegmentMst_SignOnTime();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__START_TIME = eINSTANCE
				.getTrainSegmentMst_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__END_TIME = eINSTANCE
				.getTrainSegmentMst_EndTime();

		/**
		 * The meta object literal for the '<em><b>Sign Off Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__SIGN_OFF_TIME = eINSTANCE
				.getTrainSegmentMst_SignOffTime();

		/**
		 * The meta object literal for the '<em><b>Running Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__RUNNING_DURATION = eINSTANCE
				.getTrainSegmentMst_RunningDuration();

		/**
		 * The meta object literal for the '<em><b>Chronic Delay Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME = eINSTANCE
				.getTrainSegmentMst_ChronicDelayTime();

		/**
		 * The meta object literal for the '<em><b>Dept Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__DEPT_TYPE = eINSTANCE
				.getTrainSegmentMst_DeptType();

		/**
		 * The meta object literal for the '<em><b>Spare Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__SPARE_FLAG = eINSTANCE
				.getTrainSegmentMst_SpareFlag();

		/**
		 * The meta object literal for the '<em><b>Dayofservice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__DAYOFSERVICE = eINSTANCE
				.getTrainSegmentMst_Dayofservice();

		/**
		 * The meta object literal for the '<em><b>Actual Km</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__ACTUAL_KM = eINSTANCE
				.getTrainSegmentMst_ActualKm();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_MST__CREATED_BY = eINSTANCE
				.getTrainSegmentMst_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Ref Loco Change Stn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN = eINSTANCE
				.getTrainSegmentMst_RefLocoChangeStn();

		/**
		 * The meta object literal for the '<em><b>Ref Segment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SEGMENT_MST__REF_SEGMENT_ID = eINSTANCE
				.getTrainSegmentMst_RefSegmentId();

		/**
		 * The meta object literal for the '<em><b>Ref Assigned Lobby</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY = eINSTANCE
				.getTrainSegmentMst_RefAssignedLobby();

		/**
		 * The meta object literal for the '<em><b>Ref Traction Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SEGMENT_MST__REF_TRACTION_TYPE = eINSTANCE
				.getTrainSegmentMst_RefTractionType();

		/**
		 * The meta object literal for the '<em><b>Ref Train Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_SEGMENT_MST__REF_TRAIN_ID = eINSTANCE
				.getTrainSegmentMst_RefTrainId();

		/**
		 * The meta object literal for the '{@link cclms.impl.LinkMstImpl <em>Link Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.LinkMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getLinkMst()
		 * @generated
		 */
		EClass LINK_MST = eINSTANCE.getLinkMst();

		/**
		 * The meta object literal for the '<em><b>Link Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MST__LINK_ID = eINSTANCE.getLinkMst_LinkId();

		/**
		 * The meta object literal for the '<em><b>Scenario Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MST__SCENARIO_ID = eINSTANCE.getLinkMst_ScenarioId();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MST__LINK_NAME = eINSTANCE.getLinkMst_LinkName();

		/**
		 * The meta object literal for the '<em><b>Lobby Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MST__LOBBY_TYPE = eINSTANCE.getLinkMst_LobbyType();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MST__CREATED_BY = eINSTANCE.getLinkMst_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Last Modified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MST__LAST_MODIFIED_BY = eINSTANCE
				.getLinkMst_LastModifiedBy();

		/**
		 * The meta object literal for the '<em><b>Link Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_MST__LINK_STATUS = eINSTANCE.getLinkMst_LinkStatus();

		/**
		 * The meta object literal for the '<em><b>Ref Parameter Value Link Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MST__REF_PARAMETER_VALUE_LINK_ID = eINSTANCE
				.getLinkMst_RefParameterValueLinkId();

		/**
		 * The meta object literal for the '<em><b>Ref Kpi Value Link Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MST__REF_KPI_VALUE_LINK_ID = eINSTANCE
				.getLinkMst_RefKpiValueLinkId();

		/**
		 * The meta object literal for the '<em><b>Ref Link Detail Link Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MST__REF_LINK_DETAIL_LINK_ID = eINSTANCE
				.getLinkMst_RefLinkDetailLinkId();

		/**
		 * The meta object literal for the '<em><b>Ref Lobby Stn Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MST__REF_LOBBY_STN_ID = eINSTANCE
				.getLinkMst_RefLobbyStnId();

		/**
		 * The meta object literal for the '<em><b>Ref Traction Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MST__REF_TRACTION_TYPE = eINSTANCE
				.getLinkMst_RefTractionType();

		/**
		 * The meta object literal for the '<em><b>Ref Train Frequency Cd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MST__REF_TRAIN_FREQUENCY_CD = eINSTANCE
				.getLinkMst_RefTrainFrequencyCd();

		/**
		 * The meta object literal for the '<em><b>Ref Train Type Cd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_MST__REF_TRAIN_TYPE_CD = eINSTANCE
				.getLinkMst_RefTrainTypeCd();

		/**
		 * The meta object literal for the '{@link cclms.impl.LobbyMstImpl <em>Lobby Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.LobbyMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getLobbyMst()
		 * @generated
		 */
		EClass LOBBY_MST = eINSTANCE.getLobbyMst();

		/**
		 * The meta object literal for the '<em><b>Lobby Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOBBY_MST__LOBBY_CODE = eINSTANCE.getLobbyMst_LobbyCode();

		/**
		 * The meta object literal for the '<em><b>Lobby Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOBBY_MST__LOBBY_NAME = eINSTANCE.getLobbyMst_LobbyName();

		/**
		 * The meta object literal for the '<em><b>Lobby Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOBBY_MST__LOBBY_ID = eINSTANCE.getLobbyMst_LobbyId();

		/**
		 * The meta object literal for the '{@link cclms.impl.TrainSegmentEngineImpl <em>Train Segment Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TrainSegmentEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getTrainSegmentEngine()
		 * @generated
		 */
		EClass TRAIN_SEGMENT_ENGINE = eINSTANCE.getTrainSegmentEngine();

		/**
		 * The meta object literal for the '<em><b>Trainid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__TRAINID = eINSTANCE
				.getTrainSegmentEngine_Trainid();

		/**
		 * The meta object literal for the '<em><b>Legid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__LEGID = eINSTANCE
				.getTrainSegmentEngine_Legid();

		/**
		 * The meta object literal for the '<em><b>Startloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__STARTLOC = eINSTANCE
				.getTrainSegmentEngine_Startloc();

		/**
		 * The meta object literal for the '<em><b>Endloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__ENDLOC = eINSTANCE
				.getTrainSegmentEngine_Endloc();

		/**
		 * The meta object literal for the '<em><b>Signon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__SIGNON = eINSTANCE
				.getTrainSegmentEngine_Signon();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__START = eINSTANCE
				.getTrainSegmentEngine_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__END = eINSTANCE
				.getTrainSegmentEngine_End();

		/**
		 * The meta object literal for the '<em><b>Signoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__SIGNOFF = eINSTANCE
				.getTrainSegmentEngine_Signoff();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__DURATION = eINSTANCE
				.getTrainSegmentEngine_Duration();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__DISTANCE = eINSTANCE
				.getTrainSegmentEngine_Distance();

		/**
		 * The meta object literal for the '<em><b>Nightflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__NIGHTFLAG = eINSTANCE
				.getTrainSegmentEngine_Nightflag();

		/**
		 * The meta object literal for the '<em><b>Dayid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__DAYID = eINSTANCE
				.getTrainSegmentEngine_Dayid();

		/**
		 * The meta object literal for the '<em><b>Spareflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN_SEGMENT_ENGINE__SPAREFLAG = eINSTANCE
				.getTrainSegmentEngine_Spareflag();

		/**
		 * The meta object literal for the '{@link cclms.impl.SegmentMstEngineImpl <em>Segment Mst Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.SegmentMstEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getSegmentMstEngine()
		 * @generated
		 */
		EClass SEGMENT_MST_ENGINE = eINSTANCE.getSegmentMstEngine();

		/**
		 * The meta object literal for the '<em><b>Fromstation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_MST_ENGINE__FROMSTATION = eINSTANCE
				.getSegmentMstEngine_Fromstation();

		/**
		 * The meta object literal for the '<em><b>Tostation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_MST_ENGINE__TOSTATION = eINSTANCE
				.getSegmentMstEngine_Tostation();

		/**
		 * The meta object literal for the '<em><b>Segmentid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT_MST_ENGINE__SEGMENTID = eINSTANCE
				.getSegmentMstEngine_Segmentid();

		/**
		 * The meta object literal for the '{@link cclms.impl.TimeToMinEngineImpl <em>Time To Min Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.TimeToMinEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getTimeToMinEngine()
		 * @generated
		 */
		EClass TIME_TO_MIN_ENGINE = eINSTANCE.getTimeToMinEngine();

		/**
		 * The meta object literal for the '<em><b>Trainid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__TRAINID = eINSTANCE
				.getTimeToMinEngine_Trainid();

		/**
		 * The meta object literal for the '<em><b>Segmentid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__SEGMENTID = eINSTANCE
				.getTimeToMinEngine_Segmentid();

		/**
		 * The meta object literal for the '<em><b>Signontime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__SIGNONTIME = eINSTANCE
				.getTimeToMinEngine_Signontime();

		/**
		 * The meta object literal for the '<em><b>Signominute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__SIGNOMINUTE = eINSTANCE
				.getTimeToMinEngine_Signominute();

		/**
		 * The meta object literal for the '<em><b>Starttime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__STARTTIME = eINSTANCE
				.getTimeToMinEngine_Starttime();

		/**
		 * The meta object literal for the '<em><b>Startminute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__STARTMINUTE = eINSTANCE
				.getTimeToMinEngine_Startminute();

		/**
		 * The meta object literal for the '<em><b>Endtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__ENDTIME = eINSTANCE
				.getTimeToMinEngine_Endtime();

		/**
		 * The meta object literal for the '<em><b>Endminute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__ENDMINUTE = eINSTANCE
				.getTimeToMinEngine_Endminute();

		/**
		 * The meta object literal for the '<em><b>Signofftime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__SIGNOFFTIME = eINSTANCE
				.getTimeToMinEngine_Signofftime();

		/**
		 * The meta object literal for the '<em><b>Signoffminute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__SIGNOFFMINUTE = eINSTANCE
				.getTimeToMinEngine_Signoffminute();

		/**
		 * The meta object literal for the '<em><b>Dayid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__DAYID = eINSTANCE
				.getTimeToMinEngine_Dayid();

		/**
		 * The meta object literal for the '<em><b>Spareflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TO_MIN_ENGINE__SPAREFLAG = eINSTANCE
				.getTimeToMinEngine_Spareflag();

		/**
		 * The meta object literal for the '{@link cclms.impl.DayMstEngineImpl <em>Day Mst Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.DayMstEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getDayMstEngine()
		 * @generated
		 */
		EClass DAY_MST_ENGINE = eINSTANCE.getDayMstEngine();

		/**
		 * The meta object literal for the '<em><b>Day Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_MST_ENGINE__DAY_ID = eINSTANCE.getDayMstEngine_DayId();

		/**
		 * The meta object literal for the '<em><b>Day Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_MST_ENGINE__DAY_DESC = eINSTANCE
				.getDayMstEngine_DayDesc();

		/**
		 * The meta object literal for the '{@link cclms.impl.KpiLinkEngineImpl <em>Kpi Link Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.KpiLinkEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getKpiLinkEngine()
		 * @generated
		 */
		EClass KPI_LINK_ENGINE = eINSTANCE.getKpiLinkEngine();

		/**
		 * The meta object literal for the '<em><b>Kpi Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_LINK_ENGINE__KPI_ID = eINSTANCE.getKpiLinkEngine_KpiId();

		/**
		 * The meta object literal for the '<em><b>Kpi Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_LINK_ENGINE__KPI_DESC = eINSTANCE
				.getKpiLinkEngine_KpiDesc();

		/**
		 * The meta object literal for the '<em><b>Kpi Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_LINK_ENGINE__KPI_VALUE = eINSTANCE
				.getKpiLinkEngine_KpiValue();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_LINK_ENGINE__UOM = eINSTANCE.getKpiLinkEngine_Uom();

		/**
		 * The meta object literal for the '{@link cclms.impl.LinkDetailEngineImpl <em>Link Detail Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.LinkDetailEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getLinkDetailEngine()
		 * @generated
		 */
		EClass LINK_DETAIL_ENGINE = eINSTANCE.getLinkDetailEngine();

		/**
		 * The meta object literal for the '<em><b>Dayname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__DAYNAME = eINSTANCE
				.getLinkDetailEngine_Dayname();

		/**
		 * The meta object literal for the '<em><b>Seqid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__SEQID = eINSTANCE
				.getLinkDetailEngine_Seqid();

		/**
		 * The meta object literal for the '<em><b>Trainno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__TRAINNO = eINSTANCE
				.getLinkDetailEngine_Trainno();

		/**
		 * The meta object literal for the '<em><b>Fromstation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__FROMSTATION = eINSTANCE
				.getLinkDetailEngine_Fromstation();

		/**
		 * The meta object literal for the '<em><b>Tostation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__TOSTATION = eINSTANCE
				.getLinkDetailEngine_Tostation();

		/**
		 * The meta object literal for the '<em><b>Signontime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__SIGNONTIME = eINSTANCE
				.getLinkDetailEngine_Signontime();

		/**
		 * The meta object literal for the '<em><b>Departuretime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__DEPARTURETIME = eINSTANCE
				.getLinkDetailEngine_Departuretime();

		/**
		 * The meta object literal for the '<em><b>Arrivaltime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__ARRIVALTIME = eINSTANCE
				.getLinkDetailEngine_Arrivaltime();

		/**
		 * The meta object literal for the '<em><b>Signofftime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__SIGNOFFTIME = eINSTANCE
				.getLinkDetailEngine_Signofftime();

		/**
		 * The meta object literal for the '<em><b>Dutydurtion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__DUTYDURTION = eINSTANCE
				.getLinkDetailEngine_Dutydurtion();

		/**
		 * The meta object literal for the '<em><b>Dutyminutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__DUTYMINUTES = eINSTANCE
				.getLinkDetailEngine_Dutyminutes();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__DISTANCE = eINSTANCE
				.getLinkDetailEngine_Distance();

		/**
		 * The meta object literal for the '<em><b>Nib</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__NIB = eINSTANCE
				.getLinkDetailEngine_Nib();

		/**
		 * The meta object literal for the '<em><b>Sortorder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__SORTORDER = eINSTANCE
				.getLinkDetailEngine_Sortorder();

		/**
		 * The meta object literal for the '<em><b>Dayid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__DAYID = eINSTANCE
				.getLinkDetailEngine_Dayid();

		/**
		 * The meta object literal for the '<em><b>Spareflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_DETAIL_ENGINE__SPAREFLAG = eINSTANCE
				.getLinkDetailEngine_Spareflag();

		/**
		 * The meta object literal for the '{@link cclms.impl.OutlinkEngineImpl <em>Outlink Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.OutlinkEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getOutlinkEngine()
		 * @generated
		 */
		EClass OUTLINK_ENGINE = eINSTANCE.getOutlinkEngine();

		/**
		 * The meta object literal for the '<em><b>Dayid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__DAYID = eINSTANCE.getOutlinkEngine_Dayid();

		/**
		 * The meta object literal for the '<em><b>Seqid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__SEQID = eINSTANCE.getOutlinkEngine_Seqid();

		/**
		 * The meta object literal for the '<em><b>Pairingid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__PAIRINGID = eINSTANCE
				.getOutlinkEngine_Pairingid();

		/**
		 * The meta object literal for the '<em><b>Dutyid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__DUTYID = eINSTANCE.getOutlinkEngine_Dutyid();

		/**
		 * The meta object literal for the '<em><b>Trainid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__TRAINID = eINSTANCE
				.getOutlinkEngine_Trainid();

		/**
		 * The meta object literal for the '<em><b>Legid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__LEGID = eINSTANCE.getOutlinkEngine_Legid();

		/**
		 * The meta object literal for the '<em><b>Startloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__STARTLOC = eINSTANCE
				.getOutlinkEngine_Startloc();

		/**
		 * The meta object literal for the '<em><b>Endloc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__ENDLOC = eINSTANCE.getOutlinkEngine_Endloc();

		/**
		 * The meta object literal for the '<em><b>Dutysignon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__DUTYSIGNON = eINSTANCE
				.getOutlinkEngine_Dutysignon();

		/**
		 * The meta object literal for the '<em><b>Starttime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__STARTTIME = eINSTANCE
				.getOutlinkEngine_Starttime();

		/**
		 * The meta object literal for the '<em><b>Endtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__ENDTIME = eINSTANCE
				.getOutlinkEngine_Endtime();

		/**
		 * The meta object literal for the '<em><b>Dutysignoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__DUTYSIGNOFF = eINSTANCE
				.getOutlinkEngine_Dutysignoff();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__DURATION = eINSTANCE
				.getOutlinkEngine_Duration();

		/**
		 * The meta object literal for the '<em><b>Nib</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__NIB = eINSTANCE.getOutlinkEngine_Nib();

		/**
		 * The meta object literal for the '<em><b>Spareflag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__SPAREFLAG = eINSTANCE
				.getOutlinkEngine_Spareflag();

		/**
		 * The meta object literal for the '<em><b>Sortorder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTLINK_ENGINE__SORTORDER = eINSTANCE
				.getOutlinkEngine_Sortorder();

		/**
		 * The meta object literal for the '{@link cclms.impl.LobbyMstEngineImpl <em>Lobby Mst Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.LobbyMstEngineImpl
		 * @see cclms.impl.CclmsPackageImpl#getLobbyMstEngine()
		 * @generated
		 */
		EClass LOBBY_MST_ENGINE = eINSTANCE.getLobbyMstEngine();

		/**
		 * The meta object literal for the '<em><b>Lobby Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOBBY_MST_ENGINE__LOBBY_CODE = eINSTANCE
				.getLobbyMstEngine_LobbyCode();

		/**
		 * The meta object literal for the '<em><b>Lobby Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOBBY_MST_ENGINE__LOBBY_NAME = eINSTANCE
				.getLobbyMstEngine_LobbyName();

		/**
		 * The meta object literal for the '<em><b>Lobby Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOBBY_MST_ENGINE__LOBBY_ID = eINSTANCE
				.getLobbyMstEngine_LobbyId();

		/**
		 * The meta object literal for the '{@link cclms.impl.UserMstImpl <em>User Mst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.UserMstImpl
		 * @see cclms.impl.CclmsPackageImpl#getUserMst()
		 * @generated
		 */
		EClass USER_MST = eINSTANCE.getUserMst();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_MST__USER_ID = eINSTANCE.getUserMst_UserId();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_MST__USER = eINSTANCE.getUserMst_User();

		/**
		 * The meta object literal for the '<em><b>Division Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_MST__DIVISION_ID = eINSTANCE.getUserMst_DivisionId();

		/**
		 * The meta object literal for the '{@link cclms.impl.CclmsCollectorImpl <em>Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cclms.impl.CclmsCollectorImpl
		 * @see cclms.impl.CclmsPackageImpl#getCclmsCollector()
		 * @generated
		 */
		EClass CCLMS_COLLECTOR = eINSTANCE.getCclmsCollector();

		/**
		 * The meta object literal for the '<em><b>Station Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__STATION_MST = eINSTANCE
				.getCclmsCollector_StationMst();

		/**
		 * The meta object literal for the '<em><b>Train Frequency Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST = eINSTANCE
				.getCclmsCollector_TrainFrequencyMst();

		/**
		 * The meta object literal for the '<em><b>Traction Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TRACTION_MST = eINSTANCE
				.getCclmsCollector_TractionMst();

		/**
		 * The meta object literal for the '<em><b>Train Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TRAIN_MST = eINSTANCE
				.getCclmsCollector_TrainMst();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__PARAMETER_VALUE = eINSTANCE
				.getCclmsCollector_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Kpi Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__KPI_MST = eINSTANCE
				.getCclmsCollector_KpiMst();

		/**
		 * The meta object literal for the '<em><b>Kpi Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__KPI_VALUE = eINSTANCE
				.getCclmsCollector_KpiValue();

		/**
		 * The meta object literal for the '<em><b>Parameter Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__PARAMETER_MST = eINSTANCE
				.getCclmsCollector_ParameterMst();

		/**
		 * The meta object literal for the '<em><b>Train Type Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TRAIN_TYPE_MST = eINSTANCE
				.getCclmsCollector_TrainTypeMst();

		/**
		 * The meta object literal for the '<em><b>Train Type Mapping Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST = eINSTANCE
				.getCclmsCollector_TrainTypeMappingMst();

		/**
		 * The meta object literal for the '<em><b>Link Detail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__LINK_DETAIL = eINSTANCE
				.getCclmsCollector_LinkDetail();

		/**
		 * The meta object literal for the '<em><b>Segment Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__SEGMENT_MST = eINSTANCE
				.getCclmsCollector_SegmentMst();

		/**
		 * The meta object literal for the '<em><b>Train Segment Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TRAIN_SEGMENT_MST = eINSTANCE
				.getCclmsCollector_TrainSegmentMst();

		/**
		 * The meta object literal for the '<em><b>Link Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__LINK_MST = eINSTANCE
				.getCclmsCollector_LinkMst();

		/**
		 * The meta object literal for the '<em><b>Lobby Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__LOBBY_MST = eINSTANCE
				.getCclmsCollector_LobbyMst();

		/**
		 * The meta object literal for the '<em><b>Train Segment Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE = eINSTANCE
				.getCclmsCollector_TrainSegmentEngine();

		/**
		 * The meta object literal for the '<em><b>Segment Mst Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__SEGMENT_MST_ENGINE = eINSTANCE
				.getCclmsCollector_SegmentMstEngine();

		/**
		 * The meta object literal for the '<em><b>Time To Min Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE = eINSTANCE
				.getCclmsCollector_TimeToMinEngine();

		/**
		 * The meta object literal for the '<em><b>Day Mst Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__DAY_MST_ENGINE = eINSTANCE
				.getCclmsCollector_DayMstEngine();

		/**
		 * The meta object literal for the '<em><b>Kpi Link Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__KPI_LINK_ENGINE = eINSTANCE
				.getCclmsCollector_KpiLinkEngine();

		/**
		 * The meta object literal for the '<em><b>Link Detail Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__LINK_DETAIL_ENGINE = eINSTANCE
				.getCclmsCollector_LinkDetailEngine();

		/**
		 * The meta object literal for the '<em><b>Outlink Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__OUTLINK_ENGINE = eINSTANCE
				.getCclmsCollector_OutlinkEngine();

		/**
		 * The meta object literal for the '<em><b>Lobby Mst Engine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__LOBBY_MST_ENGINE = eINSTANCE
				.getCclmsCollector_LobbyMstEngine();

		/**
		 * The meta object literal for the '<em><b>User Mst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CCLMS_COLLECTOR__USER_MST = eINSTANCE
				.getCclmsCollector_UserMst();

		/**
		 * The meta object literal for the '{@link ilog.odm.dom.IloDomCollector <em>ilog odm dom Ilo Dom Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ilog.odm.dom.IloDomCollector
		 * @see cclms.impl.CclmsPackageImpl#getilog_odm_dom_IloDomCollector()
		 * @generated
		 */
		EClass ILOG_ODM_DOM_ILO_DOM_COLLECTOR = eINSTANCE
				.getilog_odm_dom_IloDomCollector();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see cclms.impl.CclmsPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>java sql Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Time
		 * @see cclms.impl.CclmsPackageImpl#getjava_sql_Time()
		 * @generated
		 */
		EDataType JAVA_SQL_TIME = eINSTANCE.getjava_sql_Time();

	}

} //CclmsPackage
