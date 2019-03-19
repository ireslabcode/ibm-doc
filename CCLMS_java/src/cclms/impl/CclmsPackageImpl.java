/**
 */
package cclms.impl;

import ilog.odm.dom.IloDomCollector;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import cclms.CclmsCollector;
import cclms.DivisionMst;
import cclms.KpiMst;
import cclms.KpiValue;
import cclms.LinkDetail;
import cclms.LinkMst;
import cclms.LobbyMst;
import cclms.ParameterMst;
import cclms.ParameterValue;
import cclms.SegmentMst;
import cclms.StationMst;
import cclms.TractionMst;
import cclms.TrainFrequencyMst;
import cclms.TrainMst;
import cclms.TrainSegmentMst;
import cclms.TrainTypeMappingMst;
import cclms.TrainTypeMst;
import cclms.UserMst;
import cclms.UserRoleMst;
import cclms.ZoneMst;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CclmsPackageImpl extends EPackageImpl implements CclmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainFrequencyMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tractionMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRoleMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainTypeMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainTypeMappingMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainSegmentMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lobbyMstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cclmsCollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilog_odm_dom_IloDomCollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType java_sql_DateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType java_sql_TimeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cclms.impl.CclmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CclmsPackageImpl() {
		super(eNS_URI, CclmsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CclmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CclmsPackage init() {
		if (isInited)
			return (CclmsPackage) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI);

		// Obtain or create and register package
		CclmsPackageImpl theCclmsPackage = (CclmsPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CclmsPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CclmsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCclmsPackage.createPackageContents();

		// Initialize created meta-data
		theCclmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCclmsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CclmsPackage.eNS_URI, theCclmsPackage);
		return theCclmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneMst() {
		return zoneMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneMst_ZoneId() {
		return (EAttribute) zoneMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneMst_ZoneCode() {
		return (EAttribute) zoneMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneMst_ZoneDesc() {
		return (EAttribute) zoneMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneMst_RefDivisionMstZoneId() {
		return (EReference) zoneMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneMst_RefUserMstZoneId() {
		return (EReference) zoneMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationMst() {
		return stationMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_StationId() {
		return (EAttribute) stationMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_StationCode() {
		return (EAttribute) stationMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_StationName() {
		return (EAttribute) stationMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_LobbyFlag() {
		return (EAttribute) stationMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefDivisionId() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainMstTrainEndStn() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainMstTrainStartStn() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefUserMstLobbyId() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefLinkDetailFromStn() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefLinkDetailToStn() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefSegmentMstStartStationId() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefSegmentMstStopStationId() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainSegmentMstLocoChangeStn() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainSegmentMstAssignedLobby() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefLinkMstLobbyStnId() {
		return (EReference) stationMstEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainFrequencyMst() {
		return trainFrequencyMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainFrequencyMst_TrainFrequencyCode() {
		return (EAttribute) trainFrequencyMstEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainFrequencyMst_Desc() {
		return (EAttribute) trainFrequencyMstEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainFrequencyMst_RefTrainMstTrainFrequencyCd() {
		return (EReference) trainFrequencyMstEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainFrequencyMst_RefLinkMstTrainFrequencyCd() {
		return (EReference) trainFrequencyMstEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTractionMst() {
		return tractionMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTractionMst_TractionType() {
		return (EAttribute) tractionMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTractionMst_TractionDesc() {
		return (EAttribute) tractionMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTractionMst_RefTrainSegmentMstTractionType() {
		return (EReference) tractionMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTractionMst_RefLinkMstTractionType() {
		return (EReference) tractionMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainMst() {
		return trainMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainId() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainNbr() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainName() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainSubType() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainRunType() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_RakeId() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_DayOfService() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_ValidFrom() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_ValidTo() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_BaseTraction() {
		return (EAttribute) trainMstEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainEndStn() {
		return (EReference) trainMstEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainStartStn() {
		return (EReference) trainMstEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainFrequencyCd() {
		return (EReference) trainMstEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainType() {
		return (EReference) trainMstEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefLinkDetailTrainId() {
		return (EReference) trainMstEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainSegmentMstTrainId() {
		return (EReference) trainMstEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValue_Value() {
		return (EAttribute) parameterValueEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_RefCreatedBy() {
		return (EReference) parameterValueEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_RefLinkId() {
		return (EReference) parameterValueEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_RefParameterId() {
		return (EReference) parameterValueEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivisionMst() {
		return divisionMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionMst_DivisionId() {
		return (EAttribute) divisionMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionMst_DivisionCode() {
		return (EAttribute) divisionMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionMst_DivisionDesc() {
		return (EAttribute) divisionMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionMst_RefStationMstDivisionId() {
		return (EReference) divisionMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionMst_RefZoneId() {
		return (EReference) divisionMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionMst_RefUserMstDivisionId() {
		return (EReference) divisionMstEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRoleMst() {
		return userRoleMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRoleMst_UserRoleCd() {
		return (EAttribute) userRoleMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRoleMst_UserRole() {
		return (EAttribute) userRoleMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRoleMst_RefUserMstUserRole() {
		return (EReference) userRoleMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserMst() {
		return userMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_UserId() {
		return (EAttribute) userMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_User() {
		return (EAttribute) userMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_UserPwd() {
		return (EAttribute) userMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_FirstName() {
		return (EAttribute) userMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_LastName() {
		return (EAttribute) userMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_Active() {
		return (EAttribute) userMstEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_Email() {
		return (EAttribute) userMstEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefParameterValueCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefDivisionId() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefLobbyId() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefUserRole() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefZoneId() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefKpiValueCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefParameterMstCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefParameterMstLastModifiedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainTypeMstCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainTypeMappingMstCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainTypeMappingMstLastModifiedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefSegmentMstCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainSegmentMstCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefLinkMstCreatedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefLinkMstLastModifiedBy() {
		return (EReference) userMstEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKpiMst() {
		return kpiMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiMst_KpiId() {
		return (EAttribute) kpiMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiMst_KpiDesc() {
		return (EAttribute) kpiMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiMst_Uom() {
		return (EAttribute) kpiMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiMst_RefKpiValueKpiId() {
		return (EReference) kpiMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKpiValue() {
		return kpiValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiValue_Value() {
		return (EAttribute) kpiValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiValue_RefKpiId() {
		return (EReference) kpiValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiValue_RefLinkId() {
		return (EReference) kpiValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiValue_RefCreatedBy() {
		return (EReference) kpiValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterMst() {
		return parameterMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_ParameterId() {
		return (EAttribute) parameterMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_ParameterDesc() {
		return (EAttribute) parameterMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_Uom() {
		return (EAttribute) parameterMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_GlobalValue() {
		return (EAttribute) parameterMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_MinValue() {
		return (EAttribute) parameterMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_MaxValue() {
		return (EAttribute) parameterMstEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMst_RefParameterValueParameterId() {
		return (EReference) parameterMstEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMst_RefCreatedBy() {
		return (EReference) parameterMstEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMst_RefLastModifiedBy() {
		return (EReference) parameterMstEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainTypeMst() {
		return trainTypeMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMst_TrainTypeCclmsId() {
		return (EAttribute) trainTypeMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMst_TrainTypeDesc() {
		return (EAttribute) trainTypeMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMst_RefCreatedBy() {
		return (EReference) trainTypeMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms() {
		return (EReference) trainTypeMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMst_RefLinkMstTrainTypeCd() {
		return (EReference) trainTypeMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainTypeMappingMst() {
		return trainTypeMappingMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMappingMst_TrainType() {
		return (EAttribute) trainTypeMappingMstEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMappingMst_TrainTypeDesc() {
		return (EAttribute) trainTypeMappingMstEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefTrainMstTrainType() {
		return (EReference) trainTypeMappingMstEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefCreatedBy() {
		return (EReference) trainTypeMappingMstEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefLastModifiedBy() {
		return (EReference) trainTypeMappingMstEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefTrainTypeCclms() {
		return (EReference) trainTypeMappingMstEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkDetail() {
		return linkDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_CrewNo() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_Day() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SignOnTime() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_DepartureTime() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_ArrivalTime() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SignOffTime() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_OsAllowance() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_EarnedKm() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_PeriodicRestFlag() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SpareFlag() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_NightFlag() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SortOrder() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_DutyDuration() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_RunningDuration() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_HqRest() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_OsRest() {
		return (EAttribute) linkDetailEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefFromStn() {
		return (EReference) linkDetailEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefLinkId() {
		return (EReference) linkDetailEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefToStn() {
		return (EReference) linkDetailEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefTrainId() {
		return (EReference) linkDetailEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentMst() {
		return segmentMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentMst_SegmentId() {
		return (EAttribute) segmentMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefCreatedBy() {
		return (EReference) segmentMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefStartStationId() {
		return (EReference) segmentMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefStopStationId() {
		return (EReference) segmentMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefTrainSegmentMstSegmentId() {
		return (EReference) segmentMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainSegmentMst() {
		return trainSegmentMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_TrainSegId() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_CclmsTrainType() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_SignOnTime() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_StartTime() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_EndTime() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_SignOffTime() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_RunningDuration() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_ChronicDelayTime() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_DeptType() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_SpareFlag() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_Dayofservice() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_ActualKm() {
		return (EAttribute) trainSegmentMstEClass.getEStructuralFeatures().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefCreatedBy() {
		return (EReference) trainSegmentMstEClass.getEStructuralFeatures().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefLocoChangeStn() {
		return (EReference) trainSegmentMstEClass.getEStructuralFeatures().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefSegmentId() {
		return (EReference) trainSegmentMstEClass.getEStructuralFeatures().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefAssignedLobby() {
		return (EReference) trainSegmentMstEClass.getEStructuralFeatures().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefTractionType() {
		return (EReference) trainSegmentMstEClass.getEStructuralFeatures().get(
				16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefTrainId() {
		return (EReference) trainSegmentMstEClass.getEStructuralFeatures().get(
				17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkMst() {
		return linkMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LinkId() {
		return (EAttribute) linkMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_ScenarioId() {
		return (EAttribute) linkMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LinkName() {
		return (EAttribute) linkMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LobbyType() {
		return (EAttribute) linkMstEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LinkStatus() {
		return (EAttribute) linkMstEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefParameterValueLinkId() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefKpiValueLinkId() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefLinkDetailLinkId() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefCreatedBy() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefLobbyStnId() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefLastModifiedBy() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefTractionType() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefTrainFrequencyCd() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefTrainTypeCd() {
		return (EReference) linkMstEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLobbyMst() {
		return lobbyMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMst_LobbyCode() {
		return (EAttribute) lobbyMstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMst_LobbyName() {
		return (EAttribute) lobbyMstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMst_LobbyId() {
		return (EAttribute) lobbyMstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCclmsCollector() {
		return cclmsCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_ZoneMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_StationMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainFrequencyMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TractionMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_ParameterValue() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_DivisionMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_UserRoleMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_UserMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_KpiMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_KpiValue() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_ParameterMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainTypeMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainTypeMappingMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LinkDetail() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_SegmentMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainSegmentMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LinkMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LobbyMst() {
		return (EReference) cclmsCollectorEClass.getEStructuralFeatures().get(
				18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getilog_odm_dom_IloDomCollector() {
		return ilog_odm_dom_IloDomCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getjava_sql_Date() {
		return java_sql_DateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getjava_sql_Time() {
		return java_sql_TimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclmsFactory getCclmsFactory() {
		return (CclmsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		zoneMstEClass = createEClass(ZONE_MST);
		createEAttribute(zoneMstEClass, ZONE_MST__ZONE_ID);
		createEAttribute(zoneMstEClass, ZONE_MST__ZONE_CODE);
		createEAttribute(zoneMstEClass, ZONE_MST__ZONE_DESC);
		createEReference(zoneMstEClass, ZONE_MST__REF_DIVISION_MST_ZONE_ID);
		createEReference(zoneMstEClass, ZONE_MST__REF_USER_MST_ZONE_ID);

		stationMstEClass = createEClass(STATION_MST);
		createEAttribute(stationMstEClass, STATION_MST__STATION_ID);
		createEAttribute(stationMstEClass, STATION_MST__STATION_CODE);
		createEAttribute(stationMstEClass, STATION_MST__STATION_NAME);
		createEAttribute(stationMstEClass, STATION_MST__LOBBY_FLAG);
		createEReference(stationMstEClass, STATION_MST__REF_DIVISION_ID);
		createEReference(stationMstEClass,
				STATION_MST__REF_TRAIN_MST_TRAIN_END_STN);
		createEReference(stationMstEClass,
				STATION_MST__REF_TRAIN_MST_TRAIN_START_STN);
		createEReference(stationMstEClass, STATION_MST__REF_USER_MST_LOBBY_ID);
		createEReference(stationMstEClass,
				STATION_MST__REF_LINK_DETAIL_FROM_STN);
		createEReference(stationMstEClass, STATION_MST__REF_LINK_DETAIL_TO_STN);
		createEReference(stationMstEClass,
				STATION_MST__REF_SEGMENT_MST_START_STATION_ID);
		createEReference(stationMstEClass,
				STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID);
		createEReference(stationMstEClass,
				STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN);
		createEReference(stationMstEClass,
				STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY);
		createEReference(stationMstEClass,
				STATION_MST__REF_LINK_MST_LOBBY_STN_ID);

		trainFrequencyMstEClass = createEClass(TRAIN_FREQUENCY_MST);
		createEAttribute(trainFrequencyMstEClass,
				TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE);
		createEAttribute(trainFrequencyMstEClass, TRAIN_FREQUENCY_MST__DESC);
		createEReference(trainFrequencyMstEClass,
				TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD);
		createEReference(trainFrequencyMstEClass,
				TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD);

		tractionMstEClass = createEClass(TRACTION_MST);
		createEAttribute(tractionMstEClass, TRACTION_MST__TRACTION_TYPE);
		createEAttribute(tractionMstEClass, TRACTION_MST__TRACTION_DESC);
		createEReference(tractionMstEClass,
				TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE);
		createEReference(tractionMstEClass,
				TRACTION_MST__REF_LINK_MST_TRACTION_TYPE);

		trainMstEClass = createEClass(TRAIN_MST);
		createEAttribute(trainMstEClass, TRAIN_MST__TRAIN_ID);
		createEAttribute(trainMstEClass, TRAIN_MST__TRAIN_NBR);
		createEAttribute(trainMstEClass, TRAIN_MST__TRAIN_NAME);
		createEAttribute(trainMstEClass, TRAIN_MST__TRAIN_SUB_TYPE);
		createEAttribute(trainMstEClass, TRAIN_MST__TRAIN_RUN_TYPE);
		createEAttribute(trainMstEClass, TRAIN_MST__RAKE_ID);
		createEAttribute(trainMstEClass, TRAIN_MST__DAY_OF_SERVICE);
		createEAttribute(trainMstEClass, TRAIN_MST__VALID_FROM);
		createEAttribute(trainMstEClass, TRAIN_MST__VALID_TO);
		createEAttribute(trainMstEClass, TRAIN_MST__BASE_TRACTION);
		createEReference(trainMstEClass, TRAIN_MST__REF_TRAIN_END_STN);
		createEReference(trainMstEClass, TRAIN_MST__REF_TRAIN_START_STN);
		createEReference(trainMstEClass, TRAIN_MST__REF_TRAIN_FREQUENCY_CD);
		createEReference(trainMstEClass, TRAIN_MST__REF_TRAIN_TYPE);
		createEReference(trainMstEClass, TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID);
		createEReference(trainMstEClass,
				TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEAttribute(parameterValueEClass, PARAMETER_VALUE__VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__REF_CREATED_BY);
		createEReference(parameterValueEClass, PARAMETER_VALUE__REF_LINK_ID);
		createEReference(parameterValueEClass,
				PARAMETER_VALUE__REF_PARAMETER_ID);

		divisionMstEClass = createEClass(DIVISION_MST);
		createEAttribute(divisionMstEClass, DIVISION_MST__DIVISION_ID);
		createEAttribute(divisionMstEClass, DIVISION_MST__DIVISION_CODE);
		createEAttribute(divisionMstEClass, DIVISION_MST__DIVISION_DESC);
		createEReference(divisionMstEClass,
				DIVISION_MST__REF_STATION_MST_DIVISION_ID);
		createEReference(divisionMstEClass, DIVISION_MST__REF_ZONE_ID);
		createEReference(divisionMstEClass,
				DIVISION_MST__REF_USER_MST_DIVISION_ID);

		userRoleMstEClass = createEClass(USER_ROLE_MST);
		createEAttribute(userRoleMstEClass, USER_ROLE_MST__USER_ROLE_CD);
		createEAttribute(userRoleMstEClass, USER_ROLE_MST__USER_ROLE);
		createEReference(userRoleMstEClass,
				USER_ROLE_MST__REF_USER_MST_USER_ROLE);

		userMstEClass = createEClass(USER_MST);
		createEAttribute(userMstEClass, USER_MST__USER_ID);
		createEAttribute(userMstEClass, USER_MST__USER);
		createEAttribute(userMstEClass, USER_MST__USER_PWD);
		createEAttribute(userMstEClass, USER_MST__FIRST_NAME);
		createEAttribute(userMstEClass, USER_MST__LAST_NAME);
		createEAttribute(userMstEClass, USER_MST__ACTIVE);
		createEAttribute(userMstEClass, USER_MST__EMAIL);
		createEReference(userMstEClass,
				USER_MST__REF_PARAMETER_VALUE_CREATED_BY);
		createEReference(userMstEClass, USER_MST__REF_DIVISION_ID);
		createEReference(userMstEClass, USER_MST__REF_LOBBY_ID);
		createEReference(userMstEClass, USER_MST__REF_USER_ROLE);
		createEReference(userMstEClass, USER_MST__REF_ZONE_ID);
		createEReference(userMstEClass, USER_MST__REF_KPI_VALUE_CREATED_BY);
		createEReference(userMstEClass, USER_MST__REF_PARAMETER_MST_CREATED_BY);
		createEReference(userMstEClass,
				USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY);
		createEReference(userMstEClass, USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY);
		createEReference(userMstEClass,
				USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY);
		createEReference(userMstEClass,
				USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY);
		createEReference(userMstEClass, USER_MST__REF_SEGMENT_MST_CREATED_BY);
		createEReference(userMstEClass,
				USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY);
		createEReference(userMstEClass, USER_MST__REF_LINK_MST_CREATED_BY);
		createEReference(userMstEClass, USER_MST__REF_LINK_MST_LAST_MODIFIED_BY);

		kpiMstEClass = createEClass(KPI_MST);
		createEAttribute(kpiMstEClass, KPI_MST__KPI_ID);
		createEAttribute(kpiMstEClass, KPI_MST__KPI_DESC);
		createEAttribute(kpiMstEClass, KPI_MST__UOM);
		createEReference(kpiMstEClass, KPI_MST__REF_KPI_VALUE_KPI_ID);

		kpiValueEClass = createEClass(KPI_VALUE);
		createEAttribute(kpiValueEClass, KPI_VALUE__VALUE);
		createEReference(kpiValueEClass, KPI_VALUE__REF_KPI_ID);
		createEReference(kpiValueEClass, KPI_VALUE__REF_LINK_ID);
		createEReference(kpiValueEClass, KPI_VALUE__REF_CREATED_BY);

		parameterMstEClass = createEClass(PARAMETER_MST);
		createEAttribute(parameterMstEClass, PARAMETER_MST__PARAMETER_ID);
		createEAttribute(parameterMstEClass, PARAMETER_MST__PARAMETER_DESC);
		createEAttribute(parameterMstEClass, PARAMETER_MST__UOM);
		createEAttribute(parameterMstEClass, PARAMETER_MST__GLOBAL_VALUE);
		createEAttribute(parameterMstEClass, PARAMETER_MST__MIN_VALUE);
		createEAttribute(parameterMstEClass, PARAMETER_MST__MAX_VALUE);
		createEReference(parameterMstEClass,
				PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID);
		createEReference(parameterMstEClass, PARAMETER_MST__REF_CREATED_BY);
		createEReference(parameterMstEClass,
				PARAMETER_MST__REF_LAST_MODIFIED_BY);

		trainTypeMstEClass = createEClass(TRAIN_TYPE_MST);
		createEAttribute(trainTypeMstEClass,
				TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID);
		createEAttribute(trainTypeMstEClass, TRAIN_TYPE_MST__TRAIN_TYPE_DESC);
		createEReference(trainTypeMstEClass, TRAIN_TYPE_MST__REF_CREATED_BY);
		createEReference(trainTypeMstEClass,
				TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS);
		createEReference(trainTypeMstEClass,
				TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD);

		trainTypeMappingMstEClass = createEClass(TRAIN_TYPE_MAPPING_MST);
		createEAttribute(trainTypeMappingMstEClass,
				TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE);
		createEAttribute(trainTypeMappingMstEClass,
				TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC);
		createEReference(trainTypeMappingMstEClass,
				TRAIN_TYPE_MAPPING_MST__REF_TRAIN_MST_TRAIN_TYPE);
		createEReference(trainTypeMappingMstEClass,
				TRAIN_TYPE_MAPPING_MST__REF_CREATED_BY);
		createEReference(trainTypeMappingMstEClass,
				TRAIN_TYPE_MAPPING_MST__REF_LAST_MODIFIED_BY);
		createEReference(trainTypeMappingMstEClass,
				TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS);

		linkDetailEClass = createEClass(LINK_DETAIL);
		createEAttribute(linkDetailEClass, LINK_DETAIL__CREW_NO);
		createEAttribute(linkDetailEClass, LINK_DETAIL__DAY);
		createEAttribute(linkDetailEClass, LINK_DETAIL__SIGN_ON_TIME);
		createEAttribute(linkDetailEClass, LINK_DETAIL__DEPARTURE_TIME);
		createEAttribute(linkDetailEClass, LINK_DETAIL__ARRIVAL_TIME);
		createEAttribute(linkDetailEClass, LINK_DETAIL__SIGN_OFF_TIME);
		createEAttribute(linkDetailEClass, LINK_DETAIL__OS_ALLOWANCE);
		createEAttribute(linkDetailEClass, LINK_DETAIL__EARNED_KM);
		createEAttribute(linkDetailEClass, LINK_DETAIL__PERIODIC_REST_FLAG);
		createEAttribute(linkDetailEClass, LINK_DETAIL__SPARE_FLAG);
		createEAttribute(linkDetailEClass, LINK_DETAIL__NIGHT_FLAG);
		createEAttribute(linkDetailEClass, LINK_DETAIL__SORT_ORDER);
		createEAttribute(linkDetailEClass, LINK_DETAIL__DUTY_DURATION);
		createEAttribute(linkDetailEClass, LINK_DETAIL__RUNNING_DURATION);
		createEAttribute(linkDetailEClass, LINK_DETAIL__HQ_REST);
		createEAttribute(linkDetailEClass, LINK_DETAIL__OS_REST);
		createEReference(linkDetailEClass, LINK_DETAIL__REF_FROM_STN);
		createEReference(linkDetailEClass, LINK_DETAIL__REF_LINK_ID);
		createEReference(linkDetailEClass, LINK_DETAIL__REF_TO_STN);
		createEReference(linkDetailEClass, LINK_DETAIL__REF_TRAIN_ID);

		segmentMstEClass = createEClass(SEGMENT_MST);
		createEAttribute(segmentMstEClass, SEGMENT_MST__SEGMENT_ID);
		createEReference(segmentMstEClass, SEGMENT_MST__REF_CREATED_BY);
		createEReference(segmentMstEClass, SEGMENT_MST__REF_START_STATION_ID);
		createEReference(segmentMstEClass, SEGMENT_MST__REF_STOP_STATION_ID);
		createEReference(segmentMstEClass,
				SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID);

		trainSegmentMstEClass = createEClass(TRAIN_SEGMENT_MST);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__TRAIN_SEG_ID);
		createEAttribute(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__SIGN_ON_TIME);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__START_TIME);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__END_TIME);
		createEAttribute(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__SIGN_OFF_TIME);
		createEAttribute(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__RUNNING_DURATION);
		createEAttribute(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__DEPT_TYPE);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__SPARE_FLAG);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__DAYOFSERVICE);
		createEAttribute(trainSegmentMstEClass, TRAIN_SEGMENT_MST__ACTUAL_KM);
		createEReference(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__REF_CREATED_BY);
		createEReference(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN);
		createEReference(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__REF_SEGMENT_ID);
		createEReference(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY);
		createEReference(trainSegmentMstEClass,
				TRAIN_SEGMENT_MST__REF_TRACTION_TYPE);
		createEReference(trainSegmentMstEClass, TRAIN_SEGMENT_MST__REF_TRAIN_ID);

		linkMstEClass = createEClass(LINK_MST);
		createEAttribute(linkMstEClass, LINK_MST__LINK_ID);
		createEAttribute(linkMstEClass, LINK_MST__SCENARIO_ID);
		createEAttribute(linkMstEClass, LINK_MST__LINK_NAME);
		createEAttribute(linkMstEClass, LINK_MST__LOBBY_TYPE);
		createEAttribute(linkMstEClass, LINK_MST__LINK_STATUS);
		createEReference(linkMstEClass, LINK_MST__REF_PARAMETER_VALUE_LINK_ID);
		createEReference(linkMstEClass, LINK_MST__REF_KPI_VALUE_LINK_ID);
		createEReference(linkMstEClass, LINK_MST__REF_LINK_DETAIL_LINK_ID);
		createEReference(linkMstEClass, LINK_MST__REF_CREATED_BY);
		createEReference(linkMstEClass, LINK_MST__REF_LOBBY_STN_ID);
		createEReference(linkMstEClass, LINK_MST__REF_LAST_MODIFIED_BY);
		createEReference(linkMstEClass, LINK_MST__REF_TRACTION_TYPE);
		createEReference(linkMstEClass, LINK_MST__REF_TRAIN_FREQUENCY_CD);
		createEReference(linkMstEClass, LINK_MST__REF_TRAIN_TYPE_CD);

		lobbyMstEClass = createEClass(LOBBY_MST);
		createEAttribute(lobbyMstEClass, LOBBY_MST__LOBBY_CODE);
		createEAttribute(lobbyMstEClass, LOBBY_MST__LOBBY_NAME);
		createEAttribute(lobbyMstEClass, LOBBY_MST__LOBBY_ID);

		cclmsCollectorEClass = createEClass(CCLMS_COLLECTOR);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__ZONE_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__STATION_MST);
		createEReference(cclmsCollectorEClass,
				CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__TRACTION_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__TRAIN_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__PARAMETER_VALUE);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__DIVISION_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__USER_ROLE_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__USER_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__KPI_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__KPI_VALUE);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__PARAMETER_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__TRAIN_TYPE_MST);
		createEReference(cclmsCollectorEClass,
				CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__LINK_DETAIL);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__SEGMENT_MST);
		createEReference(cclmsCollectorEClass,
				CCLMS_COLLECTOR__TRAIN_SEGMENT_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__LINK_MST);
		createEReference(cclmsCollectorEClass, CCLMS_COLLECTOR__LOBBY_MST);

		ilog_odm_dom_IloDomCollectorEClass = createEClass(ILOG_ODM_DOM_ILO_DOM_COLLECTOR);

		// Create data types
		listEDataType = createEDataType(LIST);
		java_sql_DateEDataType = createEDataType(JAVA_SQL_DATE);
		java_sql_TimeEDataType = createEDataType(JAVA_SQL_TIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		cclmsCollectorEClass.getESuperTypes().add(
				this.getilog_odm_dom_IloDomCollector());

		// Initialize classes and features; add operations and parameters
		initEClass(zoneMstEClass, ZoneMst.class, "ZoneMst", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoneMst_ZoneId(), ecorePackage.getEInt(), "zoneId",
				null, 1, 1, ZoneMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getZoneMst_ZoneCode(), ecorePackage.getEString(),
				"zoneCode", null, 1, 1, ZoneMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneMst_ZoneDesc(), ecorePackage.getEString(),
				"zoneDesc", null, 0, 1, ZoneMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getZoneMst_RefDivisionMstZoneId(),
				this.getDivisionMst(), this.getDivisionMst_RefZoneId(),
				"RefDivisionMstZoneId", null, 0, -1, ZoneMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getZoneMst_RefUserMstZoneId(), this.getUserMst(),
				this.getUserMst_RefZoneId(), "RefUserMstZoneId", null, 0, -1,
				ZoneMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(zoneMstEClass, null,
				"getDivisionMstZoneId", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getDivisionMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(zoneMstEClass, null, "getUserMstZoneId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getUserMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(zoneMstEClass, this.getCclmsCollector(), "getCollector",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stationMstEClass, StationMst.class, "StationMst",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStationMst_StationId(), ecorePackage.getEInt(),
				"stationId", null, 1, 1, StationMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStationMst_StationCode(), ecorePackage.getEString(),
				"stationCode", null, 1, 1, StationMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStationMst_StationName(), ecorePackage.getEString(),
				"stationName", null, 0, 1, StationMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStationMst_LobbyFlag(), ecorePackage.getEString(),
				"lobbyFlag", null, 0, 1, StationMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStationMst_RefDivisionId(), this.getDivisionMst(),
				this.getDivisionMst_RefStationMstDivisionId(), "RefDivisionId",
				null, 0, 1, StationMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStationMst_RefTrainMstTrainEndStn(),
				this.getTrainMst(), this.getTrainMst_RefTrainEndStn(),
				"RefTrainMstTrainEndStn", null, 0, -1, StationMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStationMst_RefTrainMstTrainStartStn(),
				this.getTrainMst(), this.getTrainMst_RefTrainStartStn(),
				"RefTrainMstTrainStartStn", null, 0, -1, StationMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStationMst_RefUserMstLobbyId(), this.getUserMst(),
				this.getUserMst_RefLobbyId(), "RefUserMstLobbyId", null, 0, -1,
				StationMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStationMst_RefLinkDetailFromStn(),
				this.getLinkDetail(), this.getLinkDetail_RefFromStn(),
				"RefLinkDetailFromStn", null, 0, -1, StationMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStationMst_RefLinkDetailToStn(),
				this.getLinkDetail(), this.getLinkDetail_RefToStn(),
				"RefLinkDetailToStn", null, 0, -1, StationMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStationMst_RefSegmentMstStartStationId(),
				this.getSegmentMst(), this.getSegmentMst_RefStartStationId(),
				"RefSegmentMstStartStationId", null, 0, -1, StationMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStationMst_RefSegmentMstStopStationId(),
				this.getSegmentMst(), this.getSegmentMst_RefStopStationId(),
				"RefSegmentMstStopStationId", null, 0, -1, StationMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStationMst_RefTrainSegmentMstLocoChangeStn(),
				this.getTrainSegmentMst(),
				this.getTrainSegmentMst_RefLocoChangeStn(),
				"RefTrainSegmentMstLocoChangeStn", null, 0, -1,
				StationMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStationMst_RefTrainSegmentMstAssignedLobby(),
				this.getTrainSegmentMst(),
				this.getTrainSegmentMst_RefAssignedLobby(),
				"RefTrainSegmentMstAssignedLobby", null, 0, -1,
				StationMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getStationMst_RefLinkMstLobbyStnId(), this.getLinkMst(),
				this.getLinkMst_RefLobbyStnId(), "RefLinkMstLobbyStnId", null,
				0, -1, StationMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(stationMstEClass, this.getDivisionMst(), "getDivisionId",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(stationMstEClass, null, "setDivisionId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDivisionMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(stationMstEClass, null, "getTrainMstTrainEndStn", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null, "getTrainMstTrainStartStn",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null, "getUserMstLobbyId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getUserMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null, "getLinkDetailFromStn", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkDetail());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null, "getLinkDetailToStn", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkDetail());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null,
				"getSegmentMstStartStationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null,
				"getSegmentMstStopStationId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null,
				"getTrainSegmentMstLocoChangeStn", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null,
				"getTrainSegmentMstAssignedLobby", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(stationMstEClass, null, "getLinkMstLobbyStnId", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(stationMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trainFrequencyMstEClass, TrainFrequencyMst.class,
				"TrainFrequencyMst", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainFrequencyMst_TrainFrequencyCode(),
				ecorePackage.getEInt(), "trainFrequencyCode", null, 1, 1,
				TrainFrequencyMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainFrequencyMst_Desc(), ecorePackage.getEString(),
				"desc", null, 1, 1, TrainFrequencyMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTrainFrequencyMst_RefTrainMstTrainFrequencyCd(),
				this.getTrainMst(), this.getTrainMst_RefTrainFrequencyCd(),
				"RefTrainMstTrainFrequencyCd", null, 0, -1,
				TrainFrequencyMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainFrequencyMst_RefLinkMstTrainFrequencyCd(),
				this.getLinkMst(), this.getLinkMst_RefTrainFrequencyCd(),
				"RefLinkMstTrainFrequencyCd", null, 0, -1,
				TrainFrequencyMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(trainFrequencyMstEClass, null,
				"getTrainMstTrainFrequencyCd", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(trainFrequencyMstEClass, null,
				"getLinkMstTrainFrequencyCd", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(trainFrequencyMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tractionMstEClass, TractionMst.class, "TractionMst",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTractionMst_TractionType(), ecorePackage.getEInt(),
				"tractionType", null, 1, 1, TractionMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTractionMst_TractionDesc(),
				ecorePackage.getEString(), "tractionDesc", null, 1, 1,
				TractionMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTractionMst_RefTrainSegmentMstTractionType(),
				this.getTrainSegmentMst(),
				this.getTrainSegmentMst_RefTractionType(),
				"RefTrainSegmentMstTractionType", null, 0, -1,
				TractionMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTractionMst_RefLinkMstTractionType(),
				this.getLinkMst(), this.getLinkMst_RefTractionType(),
				"RefLinkMstTractionType", null, 0, -1, TractionMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(tractionMstEClass, null,
				"getTrainSegmentMstTractionType", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(tractionMstEClass, null, "getLinkMstTractionType",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(tractionMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trainMstEClass, TrainMst.class, "TrainMst", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainMst_TrainId(), ecorePackage.getEInt(),
				"trainId", null, 1, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_TrainNbr(), ecorePackage.getEString(),
				"trainNbr", null, 1, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_TrainName(), ecorePackage.getEString(),
				"trainName", null, 1, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_TrainSubType(), ecorePackage.getEString(),
				"trainSubType", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_TrainRunType(), ecorePackage.getEString(),
				"trainRunType", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_RakeId(), ecorePackage.getEInt(), "rakeId",
				null, 0, 1, TrainMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainMst_DayOfService(), ecorePackage.getEString(),
				"dayOfService", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_ValidFrom(), this.getjava_sql_Date(),
				"validFrom", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_ValidTo(), this.getjava_sql_Date(),
				"validTo", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainMst_BaseTraction(), ecorePackage.getEString(),
				"baseTraction", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTrainMst_RefTrainEndStn(), this.getStationMst(),
				this.getStationMst_RefTrainMstTrainEndStn(), "RefTrainEndStn",
				null, 0, 1, TrainMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainMst_RefTrainStartStn(), this.getStationMst(),
				this.getStationMst_RefTrainMstTrainStartStn(),
				"RefTrainStartStn", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainMst_RefTrainFrequencyCd(),
				this.getTrainFrequencyMst(),
				this.getTrainFrequencyMst_RefTrainMstTrainFrequencyCd(),
				"RefTrainFrequencyCd", null, 0, 1, TrainMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainMst_RefTrainType(),
				this.getTrainTypeMappingMst(),
				this.getTrainTypeMappingMst_RefTrainMstTrainType(),
				"RefTrainType", null, 0, 1, TrainMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainMst_RefLinkDetailTrainId(),
				this.getLinkDetail(), this.getLinkDetail_RefTrainId(),
				"RefLinkDetailTrainId", null, 0, -1, TrainMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainMst_RefTrainSegmentMstTrainId(),
				this.getTrainSegmentMst(),
				this.getTrainSegmentMst_RefTrainId(),
				"RefTrainSegmentMstTrainId", null, 0, -1, TrainMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(trainMstEClass, this.getStationMst(), "getTrainEndStn",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainMstEClass, null, "setTrainEndStn", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainMstEClass, this.getStationMst(), "getTrainStartStn",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainMstEClass, null, "setTrainStartStn", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainMstEClass, this.getTrainFrequencyMst(),
				"getTrainFrequencyCd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainMstEClass, null, "setTrainFrequencyCd", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrainFrequencyMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainMstEClass, this.getTrainTypeMappingMst(),
				"getTrainType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainMstEClass, null, "setTrainType", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrainTypeMappingMst(), "obj", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainMstEClass, null, "getLinkDetailTrainId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkDetail());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(trainMstEClass, null, "getTrainSegmentMstTrainId",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(trainMstEClass, this.getCclmsCollector(), "getCollector",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class,
				"ParameterValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterValue_Value(), ecorePackage.getEDouble(),
				"value", null, 0, 1, ParameterValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_RefCreatedBy(), this.getUserMst(),
				this.getUserMst_RefParameterValueCreatedBy(), "RefCreatedBy",
				null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_RefLinkId(), this.getLinkMst(),
				this.getLinkMst_RefParameterValueLinkId(), "RefLinkId", null,
				0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_RefParameterId(),
				this.getParameterMst(),
				this.getParameterMst_RefParameterValueParameterId(),
				"RefParameterId", null, 0, 1, ParameterValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(parameterValueEClass, this.getUserMst(), "getCreatedBy",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterValueEClass, null, "setCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterValueEClass, this.getLinkMst(), "getLinkId", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterValueEClass, null, "setLinkId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLinkMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterValueEClass, this.getParameterMst(),
				"getParameterId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterValueEClass, null, "setParameterId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(parameterValueEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(divisionMstEClass, DivisionMst.class, "DivisionMst",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDivisionMst_DivisionId(), ecorePackage.getEInt(),
				"divisionId", null, 1, 1, DivisionMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivisionMst_DivisionCode(),
				ecorePackage.getEString(), "divisionCode", null, 1, 1,
				DivisionMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivisionMst_DivisionDesc(),
				ecorePackage.getEString(), "divisionDesc", null, 0, 1,
				DivisionMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivisionMst_RefStationMstDivisionId(),
				this.getStationMst(), this.getStationMst_RefDivisionId(),
				"RefStationMstDivisionId", null, 0, -1, DivisionMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDivisionMst_RefZoneId(), this.getZoneMst(),
				this.getZoneMst_RefDivisionMstZoneId(), "RefZoneId", null, 0,
				1, DivisionMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivisionMst_RefUserMstDivisionId(),
				this.getUserMst(), this.getUserMst_RefDivisionId(),
				"RefUserMstDivisionId", null, 0, -1, DivisionMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(divisionMstEClass, null, "getStationMstDivisionId",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getStationMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(divisionMstEClass, this.getZoneMst(), "getZoneId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(divisionMstEClass, null, "setZoneId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getZoneMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(divisionMstEClass, null, "getUserMstDivisionId", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getUserMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(divisionMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userRoleMstEClass, UserRoleMst.class, "UserRoleMst",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserRoleMst_UserRoleCd(), ecorePackage.getEInt(),
				"userRoleCd", null, 1, 1, UserRoleMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserRoleMst_UserRole(), ecorePackage.getEString(),
				"userRole", null, 0, 1, UserRoleMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUserRoleMst_RefUserMstUserRole(), this.getUserMst(),
				this.getUserMst_RefUserRole(), "RefUserMstUserRole", null, 0,
				-1, UserRoleMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(userRoleMstEClass, null, "getUserMstUserRole", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getUserMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(userRoleMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userMstEClass, UserMst.class, "UserMst", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserMst_UserId(), ecorePackage.getEInt(), "userId",
				null, 1, 1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUserMst_User(), ecorePackage.getEString(), "user",
				null, 1, 1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUserMst_UserPwd(), ecorePackage.getEString(),
				"userPwd", null, 0, 1, UserMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMst_FirstName(), ecorePackage.getEString(),
				"firstName", null, 0, 1, UserMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMst_LastName(), ecorePackage.getEString(),
				"lastName", null, 0, 1, UserMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMst_Active(), ecorePackage.getEString(),
				"active", null, 0, 1, UserMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMst_Email(), ecorePackage.getEString(), "email",
				null, 0, 1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefParameterValueCreatedBy(),
				this.getParameterValue(),
				this.getParameterValue_RefCreatedBy(),
				"RefParameterValueCreatedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefDivisionId(), this.getDivisionMst(),
				this.getDivisionMst_RefUserMstDivisionId(), "RefDivisionId",
				null, 0, 1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserMst_RefLobbyId(), this.getStationMst(),
				this.getStationMst_RefUserMstLobbyId(), "RefLobbyId", null, 0,
				1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUserMst_RefUserRole(), this.getUserRoleMst(),
				this.getUserRoleMst_RefUserMstUserRole(), "RefUserRole", null,
				0, 1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserMst_RefZoneId(), this.getZoneMst(),
				this.getZoneMst_RefUserMstZoneId(), "RefZoneId", null, 0, 1,
				UserMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUserMst_RefKpiValueCreatedBy(), this.getKpiValue(),
				this.getKpiValue_RefCreatedBy(), "RefKpiValueCreatedBy", null,
				0, -1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserMst_RefParameterMstCreatedBy(),
				this.getParameterMst(), this.getParameterMst_RefCreatedBy(),
				"RefParameterMstCreatedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefParameterMstLastModifiedBy(),
				this.getParameterMst(),
				this.getParameterMst_RefLastModifiedBy(),
				"RefParameterMstLastModifiedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefTrainTypeMstCreatedBy(),
				this.getTrainTypeMst(), this.getTrainTypeMst_RefCreatedBy(),
				"RefTrainTypeMstCreatedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefTrainTypeMappingMstCreatedBy(),
				this.getTrainTypeMappingMst(),
				this.getTrainTypeMappingMst_RefCreatedBy(),
				"RefTrainTypeMappingMstCreatedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefTrainTypeMappingMstLastModifiedBy(),
				this.getTrainTypeMappingMst(),
				this.getTrainTypeMappingMst_RefLastModifiedBy(),
				"RefTrainTypeMappingMstLastModifiedBy", null, 0, -1,
				UserMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUserMst_RefSegmentMstCreatedBy(),
				this.getSegmentMst(), this.getSegmentMst_RefCreatedBy(),
				"RefSegmentMstCreatedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefTrainSegmentMstCreatedBy(),
				this.getTrainSegmentMst(),
				this.getTrainSegmentMst_RefCreatedBy(),
				"RefTrainSegmentMstCreatedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUserMst_RefLinkMstCreatedBy(), this.getLinkMst(),
				this.getLinkMst_RefCreatedBy(), "RefLinkMstCreatedBy", null, 0,
				-1, UserMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUserMst_RefLinkMstLastModifiedBy(),
				this.getLinkMst(), this.getLinkMst_RefLastModifiedBy(),
				"RefLinkMstLastModifiedBy", null, 0, -1, UserMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(userMstEClass, null, "getParameterValueCreatedBy",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getParameterValue());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(userMstEClass, this.getDivisionMst(), "getDivisionId", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(userMstEClass, null, "setDivisionId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDivisionMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(userMstEClass, this.getStationMst(), "getLobbyId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(userMstEClass, null, "setLobbyId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(userMstEClass, this.getUserRoleMst(), "getUserRole", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(userMstEClass, null, "setUserRole", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getUserRoleMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(userMstEClass, this.getZoneMst(), "getZoneId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(userMstEClass, null, "setZoneId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getZoneMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(userMstEClass, null, "getKpiValueCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getKpiValue());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null, "getParameterMstCreatedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getParameterMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null,
				"getParameterMstLastModifiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getParameterMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null, "getTrainTypeMstCreatedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainTypeMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null,
				"getTrainTypeMappingMstCreatedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainTypeMappingMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null,
				"getTrainTypeMappingMstLastModifiedBy", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainTypeMappingMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null, "getSegmentMstCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null, "getTrainSegmentMstCreatedBy",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null, "getLinkMstCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(userMstEClass, null, "getLinkMstLastModifiedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(userMstEClass, this.getCclmsCollector(), "getCollector",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kpiMstEClass, KpiMst.class, "KpiMst", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKpiMst_KpiId(), ecorePackage.getEInt(), "kpiId",
				null, 1, 1, KpiMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getKpiMst_KpiDesc(), ecorePackage.getEString(),
				"kpiDesc", null, 1, 1, KpiMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getKpiMst_Uom(), ecorePackage.getEString(), "uom", null,
				1, 1, KpiMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKpiMst_RefKpiValueKpiId(), this.getKpiValue(),
				this.getKpiValue_RefKpiId(), "RefKpiValueKpiId", null, 0, -1,
				KpiMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(kpiMstEClass, null, "getKpiValueKpiId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getKpiValue());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(kpiMstEClass, this.getCclmsCollector(), "getCollector",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(kpiValueEClass, KpiValue.class, "KpiValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKpiValue_Value(), ecorePackage.getEDouble(), "value",
				null, 0, 1, KpiValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getKpiValue_RefKpiId(), this.getKpiMst(),
				this.getKpiMst_RefKpiValueKpiId(), "RefKpiId", null, 0, 1,
				KpiValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getKpiValue_RefLinkId(), this.getLinkMst(),
				this.getLinkMst_RefKpiValueLinkId(), "RefLinkId", null, 0, 1,
				KpiValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getKpiValue_RefCreatedBy(), this.getUserMst(),
				this.getUserMst_RefKpiValueCreatedBy(), "RefCreatedBy", null,
				0, 1, KpiValue.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(kpiValueEClass, this.getKpiMst(), "getKpiId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpiValueEClass, null, "setKpiId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getKpiMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kpiValueEClass, this.getLinkMst(), "getLinkId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpiValueEClass, null, "setLinkId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getLinkMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kpiValueEClass, this.getUserMst(), "getCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(kpiValueEClass, null, "setCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(kpiValueEClass, this.getCclmsCollector(), "getCollector",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterMstEClass, ParameterMst.class, "ParameterMst",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterMst_ParameterId(), ecorePackage.getEInt(),
				"parameterId", null, 1, 1, ParameterMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMst_ParameterDesc(),
				ecorePackage.getEString(), "parameterDesc", null, 1, 1,
				ParameterMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMst_Uom(), ecorePackage.getEString(), "uom",
				null, 1, 1, ParameterMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getParameterMst_GlobalValue(),
				ecorePackage.getEDouble(), "globalValue", null, 1, 1,
				ParameterMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMst_MinValue(), ecorePackage.getEDouble(),
				"minValue", null, 0, 1, ParameterMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterMst_MaxValue(), ecorePackage.getEDouble(),
				"maxValue", null, 0, 1, ParameterMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMst_RefParameterValueParameterId(),
				this.getParameterValue(),
				this.getParameterValue_RefParameterId(),
				"RefParameterValueParameterId", null, 0, -1,
				ParameterMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMst_RefCreatedBy(), this.getUserMst(),
				this.getUserMst_RefParameterMstCreatedBy(), "RefCreatedBy",
				null, 0, 1, ParameterMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterMst_RefLastModifiedBy(), this.getUserMst(),
				this.getUserMst_RefParameterMstLastModifiedBy(),
				"RefLastModifiedBy", null, 0, 1, ParameterMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(parameterMstEClass, null,
				"getParameterValueParameterId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getParameterValue());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(parameterMstEClass, this.getUserMst(), "getCreatedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterMstEClass, null, "setCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterMstEClass, this.getUserMst(),
				"getLastModifiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterMstEClass, null, "setLastModifiedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trainTypeMstEClass, TrainTypeMst.class, "TrainTypeMst",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainTypeMst_TrainTypeCclmsId(),
				ecorePackage.getEInt(), "trainTypeCclmsId", null, 1, 1,
				TrainTypeMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainTypeMst_TrainTypeDesc(),
				ecorePackage.getEString(), "trainTypeDesc", null, 1, 1,
				TrainTypeMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainTypeMst_RefCreatedBy(), this.getUserMst(),
				this.getUserMst_RefTrainTypeMstCreatedBy(), "RefCreatedBy",
				null, 0, 1, TrainTypeMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms(),
				this.getTrainTypeMappingMst(),
				this.getTrainTypeMappingMst_RefTrainTypeCclms(),
				"RefTrainTypeMappingMstTrainTypeCclms", null, 0, -1,
				TrainTypeMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTrainTypeMst_RefLinkMstTrainTypeCd(),
				this.getLinkMst(), this.getLinkMst_RefTrainTypeCd(),
				"RefLinkMstTrainTypeCd", null, 0, -1, TrainTypeMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(trainTypeMstEClass, this.getUserMst(), "getCreatedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainTypeMstEClass, null, "setCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainTypeMstEClass, null,
				"getTrainTypeMappingMstTrainTypeCclms", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainTypeMappingMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(trainTypeMstEClass, null, "getLinkMstTrainTypeCd",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(trainTypeMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trainTypeMappingMstEClass, TrainTypeMappingMst.class,
				"TrainTypeMappingMst", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainTypeMappingMst_TrainType(),
				ecorePackage.getEString(), "trainType", null, 1, 1,
				TrainTypeMappingMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainTypeMappingMst_TrainTypeDesc(),
				ecorePackage.getEString(), "trainTypeDesc", null, 1, 1,
				TrainTypeMappingMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainTypeMappingMst_RefTrainMstTrainType(),
				this.getTrainMst(), this.getTrainMst_RefTrainType(),
				"RefTrainMstTrainType", null, 0, -1, TrainTypeMappingMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainTypeMappingMst_RefCreatedBy(),
				this.getUserMst(),
				this.getUserMst_RefTrainTypeMappingMstCreatedBy(),
				"RefCreatedBy", null, 0, 1, TrainTypeMappingMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainTypeMappingMst_RefLastModifiedBy(),
				this.getUserMst(),
				this.getUserMst_RefTrainTypeMappingMstLastModifiedBy(),
				"RefLastModifiedBy", null, 0, 1, TrainTypeMappingMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainTypeMappingMst_RefTrainTypeCclms(),
				this.getTrainTypeMst(),
				this.getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms(),
				"RefTrainTypeCclms", null, 0, 1, TrainTypeMappingMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(trainTypeMappingMstEClass, null,
				"getTrainMstTrainType", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(trainTypeMappingMstEClass, this.getUserMst(),
				"getCreatedBy", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainTypeMappingMstEClass, null, "setCreatedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(trainTypeMappingMstEClass, this.getUserMst(),
				"getLastModifiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainTypeMappingMstEClass, null,
				"setLastModifiedBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(trainTypeMappingMstEClass, this.getTrainTypeMst(),
				"getTrainTypeCclms", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainTypeMappingMstEClass, null,
				"setTrainTypeCclms", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrainTypeMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainTypeMappingMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkDetailEClass, LinkDetail.class, "LinkDetail",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkDetail_CrewNo(), ecorePackage.getEInt(),
				"crewNo", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_Day(), ecorePackage.getEInt(), "day",
				null, 0, 1, LinkDetail.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLinkDetail_SignOnTime(), this.getjava_sql_Time(),
				"signOnTime", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_DepartureTime(), this.getjava_sql_Time(),
				"departureTime", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_ArrivalTime(), this.getjava_sql_Time(),
				"arrivalTime", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_SignOffTime(), this.getjava_sql_Time(),
				"signOffTime", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_OsAllowance(), ecorePackage.getEInt(),
				"osAllowance", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_EarnedKm(), ecorePackage.getEDouble(),
				"earnedKm", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_PeriodicRestFlag(),
				ecorePackage.getEString(), "periodicRestFlag", null, 0, 1,
				LinkDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_SpareFlag(), ecorePackage.getEString(),
				"spareFlag", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_NightFlag(), ecorePackage.getEString(),
				"nightFlag", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_SortOrder(), ecorePackage.getEInt(),
				"sortOrder", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_DutyDuration(), ecorePackage.getEInt(),
				"dutyDuration", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_RunningDuration(), ecorePackage.getEInt(),
				"runningDuration", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_HqRest(), ecorePackage.getEInt(),
				"hqRest", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkDetail_OsRest(), ecorePackage.getEInt(),
				"osRest", null, 0, 1, LinkDetail.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLinkDetail_RefFromStn(), this.getStationMst(),
				this.getStationMst_RefLinkDetailFromStn(), "RefFromStn", null,
				0, 1, LinkDetail.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkDetail_RefLinkId(), this.getLinkMst(),
				this.getLinkMst_RefLinkDetailLinkId(), "RefLinkId", null, 0, 1,
				LinkDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLinkDetail_RefToStn(), this.getStationMst(),
				this.getStationMst_RefLinkDetailToStn(), "RefToStn", null, 0,
				1, LinkDetail.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkDetail_RefTrainId(), this.getTrainMst(),
				this.getTrainMst_RefLinkDetailTrainId(), "RefTrainId", null, 0,
				1, LinkDetail.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(linkDetailEClass, this.getStationMst(), "getFromStn", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkDetailEClass, null, "setFromStn", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(linkDetailEClass, this.getLinkMst(), "getLinkId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkDetailEClass, null, "setLinkId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLinkMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(linkDetailEClass, this.getStationMst(), "getToStn", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkDetailEClass, null, "setToStn", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(linkDetailEClass, this.getTrainMst(), "getTrainId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkDetailEClass, null, "setTrainId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrainMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(linkDetailEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(segmentMstEClass, SegmentMst.class, "SegmentMst",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegmentMst_SegmentId(), ecorePackage.getEInt(),
				"segmentId", null, 1, 1, SegmentMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSegmentMst_RefCreatedBy(), this.getUserMst(),
				this.getUserMst_RefSegmentMstCreatedBy(), "RefCreatedBy", null,
				0, 1, SegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSegmentMst_RefStartStationId(), this.getStationMst(),
				this.getStationMst_RefSegmentMstStartStationId(),
				"RefStartStationId", null, 0, 1, SegmentMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSegmentMst_RefStopStationId(), this.getStationMst(),
				this.getStationMst_RefSegmentMstStopStationId(),
				"RefStopStationId", null, 0, 1, SegmentMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSegmentMst_RefTrainSegmentMstSegmentId(),
				this.getTrainSegmentMst(),
				this.getTrainSegmentMst_RefSegmentId(),
				"RefTrainSegmentMstSegmentId", null, 0, -1, SegmentMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(segmentMstEClass, this.getUserMst(), "getCreatedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(segmentMstEClass, null, "setCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(segmentMstEClass, this.getStationMst(),
				"getStartStationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(segmentMstEClass, null, "setStartStationId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(segmentMstEClass, this.getStationMst(),
				"getStopStationId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(segmentMstEClass, null, "setStopStationId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(segmentMstEClass, null,
				"getTrainSegmentMstSegmentId", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getTrainSegmentMst());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(segmentMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trainSegmentMstEClass, TrainSegmentMst.class,
				"TrainSegmentMst", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainSegmentMst_TrainSegId(), ecorePackage.getEInt(),
				"trainSegId", null, 1, 1, TrainSegmentMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainSegmentMst_CclmsTrainType(),
				ecorePackage.getEInt(), "cclmsTrainType", null, 0, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainSegmentMst_SignOnTime(), ecorePackage.getEInt(),
				"signOnTime", null, 0, 1, TrainSegmentMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainSegmentMst_StartTime(), ecorePackage.getEInt(),
				"startTime", null, 0, 1, TrainSegmentMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainSegmentMst_EndTime(), ecorePackage.getEInt(),
				"endTime", null, 0, 1, TrainSegmentMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrainSegmentMst_SignOffTime(),
				ecorePackage.getEInt(), "signOffTime", null, 0, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainSegmentMst_RunningDuration(),
				ecorePackage.getEInt(), "runningDuration", null, 0, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainSegmentMst_ChronicDelayTime(),
				ecorePackage.getEInt(), "chronicDelayTime", null, 0, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainSegmentMst_DeptType(),
				ecorePackage.getEString(), "deptType", null, 1, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainSegmentMst_SpareFlag(),
				ecorePackage.getEString(), "spareFlag", null, 0, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainSegmentMst_Dayofservice(),
				ecorePackage.getEString(), "dayofservice", null, 0, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTrainSegmentMst_ActualKm(),
				ecorePackage.getEDouble(), "actualKm", null, 0, 1,
				TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainSegmentMst_RefCreatedBy(), this.getUserMst(),
				this.getUserMst_RefTrainSegmentMstCreatedBy(), "RefCreatedBy",
				null, 0, 1, TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainSegmentMst_RefLocoChangeStn(),
				this.getStationMst(),
				this.getStationMst_RefTrainSegmentMstLocoChangeStn(),
				"RefLocoChangeStn", null, 0, 1, TrainSegmentMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainSegmentMst_RefSegmentId(), this.getSegmentMst(),
				this.getSegmentMst_RefTrainSegmentMstSegmentId(),
				"RefSegmentId", null, 0, 1, TrainSegmentMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainSegmentMst_RefAssignedLobby(),
				this.getStationMst(),
				this.getStationMst_RefTrainSegmentMstAssignedLobby(),
				"RefAssignedLobby", null, 0, 1, TrainSegmentMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainSegmentMst_RefTractionType(),
				this.getTractionMst(),
				this.getTractionMst_RefTrainSegmentMstTractionType(),
				"RefTractionType", null, 0, 1, TrainSegmentMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTrainSegmentMst_RefTrainId(), this.getTrainMst(),
				this.getTrainMst_RefTrainSegmentMstTrainId(), "RefTrainId",
				null, 0, 1, TrainSegmentMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(trainSegmentMstEClass, this.getUserMst(), "getCreatedBy",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainSegmentMstEClass, null, "setCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(trainSegmentMstEClass, this.getStationMst(),
				"getLocoChangeStn", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainSegmentMstEClass, null, "setLocoChangeStn", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainSegmentMstEClass, this.getSegmentMst(),
				"getSegmentId", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainSegmentMstEClass, null, "setSegmentId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSegmentMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainSegmentMstEClass, this.getStationMst(),
				"getAssignedLobby", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainSegmentMstEClass, null, "setAssignedLobby", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainSegmentMstEClass, this.getTractionMst(),
				"getTractionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainSegmentMstEClass, null, "setTractionType", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTractionMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainSegmentMstEClass, this.getTrainMst(), "getTrainId",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(trainSegmentMstEClass, null, "setTrainId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrainMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(trainSegmentMstEClass, this.getCclmsCollector(),
				"getCollector", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkMstEClass, LinkMst.class, "LinkMst", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkMst_LinkId(), ecorePackage.getEInt(), "linkId",
				null, 1, 1, LinkMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLinkMst_ScenarioId(), ecorePackage.getEInt(),
				"scenarioId", null, 0, 1, LinkMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkMst_LinkName(), ecorePackage.getEString(),
				"linkName", null, 1, 1, LinkMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkMst_LobbyType(), ecorePackage.getEString(),
				"lobbyType", null, 0, 1, LinkMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkMst_LinkStatus(), ecorePackage.getEString(),
				"linkStatus", null, 0, 1, LinkMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMst_RefParameterValueLinkId(),
				this.getParameterValue(), this.getParameterValue_RefLinkId(),
				"RefParameterValueLinkId", null, 0, -1, LinkMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLinkMst_RefKpiValueLinkId(), this.getKpiValue(),
				this.getKpiValue_RefLinkId(), "RefKpiValueLinkId", null, 0, -1,
				LinkMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMst_RefLinkDetailLinkId(), this.getLinkDetail(),
				this.getLinkDetail_RefLinkId(), "RefLinkDetailLinkId", null, 0,
				-1, LinkMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMst_RefCreatedBy(), this.getUserMst(),
				this.getUserMst_RefLinkMstCreatedBy(), "RefCreatedBy", null, 0,
				1, LinkMst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMst_RefLobbyStnId(), this.getStationMst(),
				this.getStationMst_RefLinkMstLobbyStnId(), "RefLobbyStnId",
				null, 0, 1, LinkMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkMst_RefLastModifiedBy(), this.getUserMst(),
				this.getUserMst_RefLinkMstLastModifiedBy(),
				"RefLastModifiedBy", null, 0, 1, LinkMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLinkMst_RefTractionType(), this.getTractionMst(),
				this.getTractionMst_RefLinkMstTractionType(),
				"RefTractionType", null, 0, 1, LinkMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLinkMst_RefTrainFrequencyCd(),
				this.getTrainFrequencyMst(),
				this.getTrainFrequencyMst_RefLinkMstTrainFrequencyCd(),
				"RefTrainFrequencyCd", null, 0, 1, LinkMst.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLinkMst_RefTrainTypeCd(), this.getTrainTypeMst(),
				this.getTrainTypeMst_RefLinkMstTrainTypeCd(), "RefTrainTypeCd",
				null, 0, 1, LinkMst.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(linkMstEClass, null, "getParameterValueLinkId", 0,
				1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getParameterValue());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(linkMstEClass, null, "getKpiValueLinkId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getKpiValue());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(linkMstEClass, null, "getLinkDetailLinkId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getLinkDetail());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(linkMstEClass, this.getUserMst(), "getCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkMstEClass, null, "setCreatedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(linkMstEClass, this.getStationMst(), "getLobbyStnId", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkMstEClass, null, "setLobbyStnId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStationMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(linkMstEClass, this.getUserMst(), "getLastModifiedBy", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkMstEClass, null, "setLastModifiedBy", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUserMst(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(linkMstEClass, this.getTractionMst(), "getTractionType",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkMstEClass, null, "setTractionType", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTractionMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(linkMstEClass, this.getTrainFrequencyMst(),
				"getTrainFrequencyCd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkMstEClass, null, "setTrainFrequencyCd", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrainFrequencyMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(linkMstEClass, this.getTrainTypeMst(), "getTrainTypeCd",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(linkMstEClass, null, "setTrainTypeCd", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTrainTypeMst(), "obj", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(linkMstEClass, this.getCclmsCollector(), "getCollector",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lobbyMstEClass, LobbyMst.class, "LobbyMst", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLobbyMst_LobbyCode(), ecorePackage.getEString(),
				"lobbyCode", null, 0, 1, LobbyMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLobbyMst_LobbyName(), ecorePackage.getEString(),
				"lobbyName", null, 0, 1, LobbyMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLobbyMst_LobbyId(), ecorePackage.getEString(),
				"lobbyId", null, 0, 1, LobbyMst.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(lobbyMstEClass, this.getCclmsCollector(), "getCollector",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cclmsCollectorEClass, CclmsCollector.class,
				"CclmsCollector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCclmsCollector_ZoneMst(), this.getZoneMst(), null,
				"zoneMst", null, 0, -1, CclmsCollector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_StationMst(), this.getStationMst(),
				null, "stationMst", null, 0, -1, CclmsCollector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCclmsCollector_TrainFrequencyMst(),
				this.getTrainFrequencyMst(), null, "trainFrequencyMst", null,
				0, -1, CclmsCollector.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_TractionMst(), this.getTractionMst(),
				null, "tractionMst", null, 0, -1, CclmsCollector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCclmsCollector_TrainMst(), this.getTrainMst(), null,
				"trainMst", null, 0, -1, CclmsCollector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_ParameterValue(),
				this.getParameterValue(), null, "parameterValue", null, 0, -1,
				CclmsCollector.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_DivisionMst(), this.getDivisionMst(),
				null, "divisionMst", null, 0, -1, CclmsCollector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCclmsCollector_UserRoleMst(), this.getUserRoleMst(),
				null, "userRoleMst", null, 0, -1, CclmsCollector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCclmsCollector_UserMst(), this.getUserMst(), null,
				"userMst", null, 0, -1, CclmsCollector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_KpiMst(), this.getKpiMst(), null,
				"kpiMst", null, 0, -1, CclmsCollector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_KpiValue(), this.getKpiValue(), null,
				"kpiValue", null, 0, -1, CclmsCollector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_ParameterMst(),
				this.getParameterMst(), null, "parameterMst", null, 0, -1,
				CclmsCollector.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_TrainTypeMst(),
				this.getTrainTypeMst(), null, "trainTypeMst", null, 0, -1,
				CclmsCollector.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_TrainTypeMappingMst(),
				this.getTrainTypeMappingMst(), null, "trainTypeMappingMst",
				null, 0, -1, CclmsCollector.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_LinkDetail(), this.getLinkDetail(),
				null, "linkDetail", null, 0, -1, CclmsCollector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCclmsCollector_SegmentMst(), this.getSegmentMst(),
				null, "segmentMst", null, 0, -1, CclmsCollector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCclmsCollector_TrainSegmentMst(),
				this.getTrainSegmentMst(), null, "trainSegmentMst", null, 0,
				-1, CclmsCollector.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_LinkMst(), this.getLinkMst(), null,
				"linkMst", null, 0, -1, CclmsCollector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCclmsCollector_LobbyMst(), this.getLobbyMst(), null,
				"lobbyMst", null, 0, -1, CclmsCollector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getZoneMst(), "createZoneMst",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getZoneMst(),
				"createZoneMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getZoneMst(),
				"getFromZoneMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "zoneId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getStationMst(),
				"createStationMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getStationMst(),
				"createStationMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getStationMst(),
				"getFromStationMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "stationId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getTrainFrequencyMst(),
				"createTrainFrequencyMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainFrequencyMst(),
				"createTrainFrequencyMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainFrequencyMst(),
				"getFromTrainFrequencyMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "trainFrequencyCode", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getTractionMst(),
				"createTractionMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTractionMst(),
				"createTractionMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTractionMst(),
				"getFromTractionMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "tractionType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getTrainMst(),
				"createTrainMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainMst(),
				"createTrainMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainMst(),
				"getFromTrainMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "trainId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getParameterValue(),
				"createParameterValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getParameterValue(),
				"createParameterValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getParameterValue(),
				"getFromParameterValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterId", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "linkId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getDivisionMst(),
				"createDivisionMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getDivisionMst(),
				"createDivisionMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getDivisionMst(),
				"getFromDivisionMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "divisionId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getUserRoleMst(),
				"createUserRoleMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getUserRoleMst(),
				"createUserRoleMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getUserRoleMst(),
				"getFromUserRoleMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "userRoleCd", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getUserMst(), "createUserMst",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getUserMst(),
				"createUserMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getUserMst(),
				"getFromUserMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "userId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getKpiMst(), "createKpiMst",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getKpiMst(),
				"createKpiMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getKpiMst(),
				"getFromKpiMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "kpiId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getKpiValue(),
				"createKpiValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getKpiValue(),
				"createKpiValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getKpiValue(),
				"getFromKpiValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "kpiId", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "linkId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getParameterMst(),
				"createParameterMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getParameterMst(),
				"createParameterMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getParameterMst(),
				"getFromParameterMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "parameterId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getTrainTypeMst(),
				"createTrainTypeMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainTypeMst(),
				"createTrainTypeMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainTypeMst(),
				"getFromTrainTypeMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "trainTypeCclmsId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getTrainTypeMappingMst(),
				"createTrainTypeMappingMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainTypeMappingMst(),
				"createTrainTypeMappingMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainTypeMappingMst(),
				"getFromTrainTypeMappingMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "trainType", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getLinkDetail(),
				"createLinkDetail", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getLinkDetail(),
				"createLinkDetail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getSegmentMst(),
				"createSegmentMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getSegmentMst(),
				"createSegmentMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getSegmentMst(),
				"getFromSegmentMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "segmentId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getTrainSegmentMst(),
				"createTrainSegmentMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainSegmentMst(),
				"createTrainSegmentMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getTrainSegmentMst(),
				"getFromTrainSegmentMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "trainSegId", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getLinkMst(), "createLinkMst",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getLinkMst(),
				"createLinkMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getLinkMst(),
				"getFromLinkMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "linkId", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(cclmsCollectorEClass, this.getLobbyMst(),
				"createLobbyMst", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(cclmsCollectorEClass, this.getLobbyMst(),
				"createLobbyMst", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(ilog_odm_dom_IloDomCollectorEClass, IloDomCollector.class,
				"ilog_odm_dom_IloDomCollector", IS_ABSTRACT, IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(java_sql_DateEDataType, Date.class, "java_sql_Date",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(java_sql_TimeEDataType, Time.class, "java_sql_Time",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "ExtendedMetaData";
		addAnnotation(this, source, new String[] { "odme.collector",
				"CclmsCollector" });
		addAnnotation(zoneMstEClass, source, new String[] { "odme.displayName",
				"ZONE_MST", "odme.table", "ZONE_MST", "odme.primarykey",
				"ZONE_ID", "odme.columns", "ZONE_ID,ZONE_CODE,ZONE_DESC",
				"odme.types", "FIELD_INT,FIELD_STRING,FIELD_STRING" });
		addAnnotation(getZoneMst_ZoneId(), source, new String[] {
				"odme.displayName", "ZONE_ID", "odme.column", "ZONE_ID",
				"odme.keyPart", "true" });
		addAnnotation(getZoneMst_ZoneCode(), source, new String[] {
				"odme.displayName", "ZONE_CODE", "odme.column", "ZONE_CODE" });
		addAnnotation(getZoneMst_ZoneDesc(), source, new String[] {
				"odme.displayName", "ZONE_DESC", "odme.column", "ZONE_DESC" });
		addAnnotation(getZoneMst_RefDivisionMstZoneId(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getZoneMst_RefUserMstZoneId(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(stationMstEClass, source, new String[] {
				"odme.displayName", "STATION_MST", "odme.table", "STATION_MST",
				"odme.primarykey", "STATION_ID", "odme.columns",
				"STATION_ID,STATION_CODE,STATION_NAME,LOBBY_FLAG,DIVISION_ID",
				"odme.types",
				"FIELD_INT,FIELD_STRING,FIELD_STRING,FIELD_STRING,FIELD_INT" });
		addAnnotation(getStationMst_StationId(), source, new String[] {
				"odme.displayName", "STATION_ID", "odme.column", "STATION_ID",
				"odme.keyPart", "true" });
		addAnnotation(getStationMst_StationCode(), source, new String[] {
				"odme.displayName", "STATION_CODE", "odme.column",
				"STATION_CODE" });
		addAnnotation(getStationMst_StationName(), source, new String[] {
				"odme.displayName", "STATION_NAME", "odme.column",
				"STATION_NAME" });
		addAnnotation(getStationMst_LobbyFlag(), source, new String[] {
				"odme.displayName", "LOBBY_FLAG", "odme.column", "LOBBY_FLAG" });
		addAnnotation(getStationMst_RefDivisionId(), source, new String[] {
				"odme.displayName", "DIVISION_ID", "odme.columns",
				"DIVISION_ID" });
		addAnnotation(getStationMst_RefTrainMstTrainEndStn(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getStationMst_RefTrainMstTrainStartStn(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getStationMst_RefUserMstLobbyId(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getStationMst_RefLinkDetailFromStn(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getStationMst_RefLinkDetailToStn(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getStationMst_RefSegmentMstStartStationId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getStationMst_RefSegmentMstStopStationId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getStationMst_RefTrainSegmentMstLocoChangeStn(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getStationMst_RefTrainSegmentMstAssignedLobby(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getStationMst_RefLinkMstLobbyStnId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(trainFrequencyMstEClass, source, new String[] {
				"odme.displayName", "TRAIN_FREQUENCY_MST", "odme.table",
				"TRAIN_FREQUENCY_MST", "odme.primarykey",
				"TRAIN_FREQUENCY_CODE", "odme.columns",
				"TRAIN_FREQUENCY_CODE,DESC", "odme.types",
				"FIELD_INT,FIELD_STRING" });
		addAnnotation(getTrainFrequencyMst_TrainFrequencyCode(), source,
				new String[] { "odme.displayName", "TRAIN_FREQUENCY_CODE",
						"odme.column", "TRAIN_FREQUENCY_CODE", "odme.keyPart",
						"true" });
		addAnnotation(getTrainFrequencyMst_Desc(), source, new String[] {
				"odme.displayName", "DESC", "odme.column", "DESC" });
		addAnnotation(getTrainFrequencyMst_RefTrainMstTrainFrequencyCd(),
				source, new String[] { "odme.displayName", "" });
		addAnnotation(getTrainFrequencyMst_RefLinkMstTrainFrequencyCd(),
				source, new String[] { "odme.displayName", "" });
		addAnnotation(tractionMstEClass, source, new String[] {
				"odme.displayName", "TRACTION_MST", "odme.table",
				"TRACTION_MST", "odme.primarykey", "TRACTION_TYPE",
				"odme.columns", "TRACTION_TYPE,TRACTION_DESC", "odme.types",
				"FIELD_INT,FIELD_STRING" });
		addAnnotation(getTractionMst_TractionType(), source, new String[] {
				"odme.displayName", "TRACTION_TYPE", "odme.column",
				"TRACTION_TYPE", "odme.keyPart", "true" });
		addAnnotation(getTractionMst_TractionDesc(), source, new String[] {
				"odme.displayName", "TRACTION_DESC", "odme.column",
				"TRACTION_DESC" });
		addAnnotation(getTractionMst_RefTrainSegmentMstTractionType(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getTractionMst_RefLinkMstTractionType(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(
				trainMstEClass,
				source,
				new String[] {
						"odme.displayName",
						"TRAIN_MST",
						"odme.table",
						"TRAIN_MST",
						"odme.primarykey",
						"TRAIN_ID",
						"odme.columns",
						"TRAIN_ID,TRAIN_NBR,TRAIN_NAME,TRAIN_START_STN,TRAIN_END_STN,TRAIN_FREQUENCY_CD,TRAIN_SUB_TYPE,TRAIN_RUN_TYPE,RAKE_ID,DAY_OF_SERVICE,VALID_FROM,VALID_TO,BASE_TRACTION,TRAIN_TYPE",
						"odme.types",
						"FIELD_INT,FIELD_STRING,FIELD_STRING,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_STRING,FIELD_STRING,FIELD_INT,FIELD_STRING,FIELD_DATE,FIELD_DATE,FIELD_STRING,FIELD_STRING" });
		addAnnotation(getTrainMst_TrainId(), source, new String[] {
				"odme.displayName", "TRAIN_ID", "odme.column", "TRAIN_ID",
				"odme.keyPart", "true" });
		addAnnotation(getTrainMst_TrainNbr(), source, new String[] {
				"odme.displayName", "TRAIN_NBR", "odme.column", "TRAIN_NBR" });
		addAnnotation(getTrainMst_TrainName(), source, new String[] {
				"odme.displayName", "TRAIN_NAME", "odme.column", "TRAIN_NAME" });
		addAnnotation(getTrainMst_TrainSubType(), source, new String[] {
				"odme.displayName", "TRAIN_SUB_TYPE", "odme.column",
				"TRAIN_SUB_TYPE" });
		addAnnotation(getTrainMst_TrainRunType(), source, new String[] {
				"odme.displayName", "TRAIN_RUN_TYPE", "odme.column",
				"TRAIN_RUN_TYPE" });
		addAnnotation(getTrainMst_RakeId(), source, new String[] {
				"odme.displayName", "RAKE_ID", "odme.column", "RAKE_ID" });
		addAnnotation(getTrainMst_DayOfService(), source, new String[] {
				"odme.displayName", "DAY_OF_SERVICE", "odme.column",
				"DAY_OF_SERVICE" });
		addAnnotation(getTrainMst_ValidFrom(), source, new String[] {
				"odme.displayName", "VALID_FROM", "odme.column", "VALID_FROM" });
		addAnnotation(getTrainMst_ValidTo(), source, new String[] {
				"odme.displayName", "VALID_TO", "odme.column", "VALID_TO" });
		addAnnotation(getTrainMst_BaseTraction(), source, new String[] {
				"odme.displayName", "BASE_TRACTION", "odme.column",
				"BASE_TRACTION" });
		addAnnotation(getTrainMst_RefTrainEndStn(), source, new String[] {
				"odme.displayName", "TRAIN_END_STN", "odme.columns",
				"TRAIN_END_STN" });
		addAnnotation(getTrainMst_RefTrainStartStn(), source, new String[] {
				"odme.displayName", "TRAIN_START_STN", "odme.columns",
				"TRAIN_START_STN" });
		addAnnotation(getTrainMst_RefTrainFrequencyCd(), source, new String[] {
				"odme.displayName", "TRAIN_FREQUENCY_CD", "odme.columns",
				"TRAIN_FREQUENCY_CD" });
		addAnnotation(getTrainMst_RefTrainType(), source,
				new String[] { "odme.displayName", "TRAIN_TYPE",
						"odme.columns", "TRAIN_TYPE" });
		addAnnotation(getTrainMst_RefLinkDetailTrainId(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getTrainMst_RefTrainSegmentMstTrainId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(parameterValueEClass, source, new String[] {
				"odme.displayName", "PARAMETER_VALUE", "odme.table",
				"PARAMETER_VALUE", "odme.primarykey", "PARAMETER_ID,LINK_ID",
				"odme.columns", "PARAMETER_ID,LINK_ID,VALUE,CREATED_BY",
				"odme.types", "FIELD_INT,FIELD_INT,FIELD_DOUBLE,FIELD_INT" });
		addAnnotation(getParameterValue_Value(), source, new String[] {
				"odme.displayName", "VALUE", "odme.column", "VALUE" });
		addAnnotation(getParameterValue_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(getParameterValue_RefLinkId(), source, new String[] {
				"odme.displayName", "LINK_ID", "odme.columns", "LINK_ID",
				"odme.keyPart", "true" });
		addAnnotation(getParameterValue_RefParameterId(), source, new String[] {
				"odme.displayName", "PARAMETER_ID", "odme.columns",
				"PARAMETER_ID", "odme.keyPart", "true" });
		addAnnotation(divisionMstEClass, source, new String[] {
				"odme.displayName", "DIVISION_MST", "odme.table",
				"DIVISION_MST", "odme.primarykey", "DIVISION_ID",
				"odme.columns",
				"DIVISION_ID,DIVISION_CODE,DIVISION_DESC,ZONE_ID",
				"odme.types", "FIELD_INT,FIELD_STRING,FIELD_STRING,FIELD_INT" });
		addAnnotation(getDivisionMst_DivisionId(), source, new String[] {
				"odme.displayName", "DIVISION_ID", "odme.column",
				"DIVISION_ID", "odme.keyPart", "true" });
		addAnnotation(getDivisionMst_DivisionCode(), source, new String[] {
				"odme.displayName", "DIVISION_CODE", "odme.column",
				"DIVISION_CODE" });
		addAnnotation(getDivisionMst_DivisionDesc(), source, new String[] {
				"odme.displayName", "DIVISION_DESC", "odme.column",
				"DIVISION_DESC" });
		addAnnotation(getDivisionMst_RefStationMstDivisionId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getDivisionMst_RefZoneId(), source, new String[] {
				"odme.displayName", "ZONE_ID", "odme.columns", "ZONE_ID" });
		addAnnotation(getDivisionMst_RefUserMstDivisionId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(userRoleMstEClass, source, new String[] {
				"odme.displayName", "USER_ROLE_MST", "odme.table",
				"USER_ROLE_MST", "odme.primarykey", "USER_ROLE_CD",
				"odme.columns", "USER_ROLE_CD,USER_ROLE", "odme.types",
				"FIELD_INT,FIELD_STRING" });
		addAnnotation(getUserRoleMst_UserRoleCd(), source, new String[] {
				"odme.displayName", "USER_ROLE_CD", "odme.column",
				"USER_ROLE_CD", "odme.keyPart", "true" });
		addAnnotation(getUserRoleMst_UserRole(), source, new String[] {
				"odme.displayName", "USER_ROLE", "odme.column", "USER_ROLE" });
		addAnnotation(getUserRoleMst_RefUserMstUserRole(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(
				userMstEClass,
				source,
				new String[] {
						"odme.displayName",
						"USER_MST",
						"odme.table",
						"USER_MST",
						"odme.primarykey",
						"USER_ID",
						"odme.columns",
						"USER_ID,USER,USER_PWD,FIRST_NAME,LAST_NAME,ACTIVE,USER_ROLE,DIVISION_ID,ZONE_ID,EMAIL,LOBBY_ID",
						"odme.types",
						"FIELD_INT,FIELD_STRING,FIELD_STRING,FIELD_STRING,FIELD_STRING,FIELD_STRING,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_STRING,FIELD_INT" });
		addAnnotation(getUserMst_UserId(), source, new String[] {
				"odme.displayName", "USER_ID", "odme.column", "USER_ID",
				"odme.keyPart", "true" });
		addAnnotation(getUserMst_User(), source, new String[] {
				"odme.displayName", "USER", "odme.column", "USER" });
		addAnnotation(getUserMst_UserPwd(), source, new String[] {
				"odme.displayName", "USER_PWD", "odme.column", "USER_PWD" });
		addAnnotation(getUserMst_FirstName(), source, new String[] {
				"odme.displayName", "FIRST_NAME", "odme.column", "FIRST_NAME" });
		addAnnotation(getUserMst_LastName(), source, new String[] {
				"odme.displayName", "LAST_NAME", "odme.column", "LAST_NAME" });
		addAnnotation(getUserMst_Active(), source, new String[] {
				"odme.displayName", "ACTIVE", "odme.column", "ACTIVE" });
		addAnnotation(getUserMst_Email(), source, new String[] {
				"odme.displayName", "EMAIL", "odme.column", "EMAIL" });
		addAnnotation(getUserMst_RefParameterValueCreatedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefDivisionId(), source, new String[] {
				"odme.displayName", "DIVISION_ID", "odme.columns",
				"DIVISION_ID" });
		addAnnotation(getUserMst_RefLobbyId(), source, new String[] {
				"odme.displayName", "LOBBY_ID", "odme.columns", "LOBBY_ID" });
		addAnnotation(getUserMst_RefUserRole(), source, new String[] {
				"odme.displayName", "USER_ROLE", "odme.columns", "USER_ROLE" });
		addAnnotation(getUserMst_RefZoneId(), source, new String[] {
				"odme.displayName", "ZONE_ID", "odme.columns", "ZONE_ID" });
		addAnnotation(getUserMst_RefKpiValueCreatedBy(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getUserMst_RefParameterMstCreatedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefParameterMstLastModifiedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefTrainTypeMstCreatedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefTrainTypeMappingMstCreatedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefTrainTypeMappingMstLastModifiedBy(),
				source, new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefSegmentMstCreatedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefTrainSegmentMstCreatedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getUserMst_RefLinkMstCreatedBy(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getUserMst_RefLinkMstLastModifiedBy(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(kpiMstEClass, source, new String[] { "odme.displayName",
				"KPI_MST", "odme.table", "KPI_MST", "odme.primarykey",
				"KPI_ID", "odme.columns", "KPI_ID,KPI_DESC,UOM", "odme.types",
				"FIELD_INT,FIELD_STRING,FIELD_STRING" });
		addAnnotation(getKpiMst_KpiId(), source, new String[] {
				"odme.displayName", "KPI_ID", "odme.column", "KPI_ID",
				"odme.keyPart", "true" });
		addAnnotation(getKpiMst_KpiDesc(), source, new String[] {
				"odme.displayName", "KPI_DESC", "odme.column", "KPI_DESC" });
		addAnnotation(getKpiMst_Uom(), source, new String[] {
				"odme.displayName", "UOM", "odme.column", "UOM" });
		addAnnotation(getKpiMst_RefKpiValueKpiId(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(kpiValueEClass, source, new String[] {
				"odme.displayName", "KPI_VALUE", "odme.table", "KPI_VALUE",
				"odme.primarykey", "KPI_ID,LINK_ID", "odme.columns",
				"KPI_ID,LINK_ID,VALUE,CREATED_BY", "odme.types",
				"FIELD_INT,FIELD_INT,FIELD_DOUBLE,FIELD_INT" });
		addAnnotation(getKpiValue_Value(), source, new String[] {
				"odme.displayName", "VALUE", "odme.column", "VALUE" });
		addAnnotation(getKpiValue_RefKpiId(), source, new String[] {
				"odme.displayName", "KPI_ID", "odme.columns", "KPI_ID",
				"odme.keyPart", "true" });
		addAnnotation(getKpiValue_RefLinkId(), source, new String[] {
				"odme.displayName", "LINK_ID", "odme.columns", "LINK_ID",
				"odme.keyPart", "true" });
		addAnnotation(getKpiValue_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(
				parameterMstEClass,
				source,
				new String[] {
						"odme.displayName",
						"PARAMETER_MST",
						"odme.table",
						"PARAMETER_MST",
						"odme.primarykey",
						"PARAMETER_ID",
						"odme.columns",
						"PARAMETER_ID,PARAMETER_DESC,UOM,GLOBAL_VALUE,MIN_VALUE,CREATED_BY,MAX_VALUE,LAST_MODIFIED_BY",
						"odme.types",
						"FIELD_INT,FIELD_STRING,FIELD_STRING,FIELD_DOUBLE,FIELD_DOUBLE,FIELD_INT,FIELD_DOUBLE,FIELD_INT" });
		addAnnotation(getParameterMst_ParameterId(), source, new String[] {
				"odme.displayName", "PARAMETER_ID", "odme.column",
				"PARAMETER_ID", "odme.keyPart", "true" });
		addAnnotation(getParameterMst_ParameterDesc(), source, new String[] {
				"odme.displayName", "PARAMETER_DESC", "odme.column",
				"PARAMETER_DESC" });
		addAnnotation(getParameterMst_Uom(), source, new String[] {
				"odme.displayName", "UOM", "odme.column", "UOM" });
		addAnnotation(getParameterMst_GlobalValue(), source, new String[] {
				"odme.displayName", "GLOBAL_VALUE", "odme.column",
				"GLOBAL_VALUE" });
		addAnnotation(getParameterMst_MinValue(), source, new String[] {
				"odme.displayName", "MIN_VALUE", "odme.column", "MIN_VALUE" });
		addAnnotation(getParameterMst_MaxValue(), source, new String[] {
				"odme.displayName", "MAX_VALUE", "odme.column", "MAX_VALUE" });
		addAnnotation(getParameterMst_RefParameterValueParameterId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getParameterMst_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(getParameterMst_RefLastModifiedBy(), source,
				new String[] { "odme.displayName", "LAST_MODIFIED_BY",
						"odme.columns", "LAST_MODIFIED_BY" });
		addAnnotation(trainTypeMstEClass, source, new String[] {
				"odme.displayName", "TRAIN_TYPE_MST", "odme.table",
				"TRAIN_TYPE_MST", "odme.primarykey", "TRAIN_TYPE_CCLMS_ID",
				"odme.columns",
				"TRAIN_TYPE_CCLMS_ID,TRAIN_TYPE_DESC,CREATED_BY", "odme.types",
				"FIELD_INT,FIELD_STRING,FIELD_INT" });
		addAnnotation(getTrainTypeMst_TrainTypeCclmsId(), source, new String[] {
				"odme.displayName", "TRAIN_TYPE_CCLMS_ID", "odme.column",
				"TRAIN_TYPE_CCLMS_ID", "odme.keyPart", "true" });
		addAnnotation(getTrainTypeMst_TrainTypeDesc(), source, new String[] {
				"odme.displayName", "TRAIN_TYPE_DESC", "odme.column",
				"TRAIN_TYPE_DESC" });
		addAnnotation(getTrainTypeMst_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms(),
				source, new String[] { "odme.displayName", "" });
		addAnnotation(getTrainTypeMst_RefLinkMstTrainTypeCd(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(
				trainTypeMappingMstEClass,
				source,
				new String[] {
						"odme.displayName",
						"TRAIN_TYPE_MAPPING_MST",
						"odme.table",
						"TRAIN_TYPE_MAPPING_MST",
						"odme.primarykey",
						"TRAIN_TYPE",
						"odme.columns",
						"TRAIN_TYPE,TRAIN_TYPE_DESC,TRAIN_TYPE_CCLMS,LAST_MODIFIED_BY,CREATED_BY",
						"odme.types",
						"FIELD_STRING,FIELD_STRING,FIELD_INT,FIELD_INT,FIELD_INT" });
		addAnnotation(getTrainTypeMappingMst_TrainType(), source, new String[] {
				"odme.displayName", "TRAIN_TYPE", "odme.column", "TRAIN_TYPE",
				"odme.keyPart", "true" });
		addAnnotation(getTrainTypeMappingMst_TrainTypeDesc(), source,
				new String[] { "odme.displayName", "TRAIN_TYPE_DESC",
						"odme.column", "TRAIN_TYPE_DESC" });
		addAnnotation(getTrainTypeMappingMst_RefTrainMstTrainType(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getTrainTypeMappingMst_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(getTrainTypeMappingMst_RefLastModifiedBy(), source,
				new String[] { "odme.displayName", "LAST_MODIFIED_BY",
						"odme.columns", "LAST_MODIFIED_BY" });
		addAnnotation(getTrainTypeMappingMst_RefTrainTypeCclms(), source,
				new String[] { "odme.displayName", "TRAIN_TYPE_CCLMS",
						"odme.columns", "TRAIN_TYPE_CCLMS" });
		addAnnotation(
				linkDetailEClass,
				source,
				new String[] {
						"odme.displayName",
						"LINK_DETAIL",
						"odme.table",
						"LINK_DETAIL",
						"odme.columns",
						"LINK_ID,CREW_NO,DAY,TRAIN_ID,FROM_STN,TO_STN,SIGN_ON_TIME,DEPARTURE_TIME,ARRIVAL_TIME,SIGN_OFF_TIME,OS_ALLOWANCE,EARNED_KM,PERIODIC_REST_FLAG,SPARE_FLAG,NIGHT_FLAG,SORT_ORDER,DUTY_DURATION,RUNNING_DURATION,HQ_REST,OS_REST",
						"odme.types",
						"FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_TIME,FIELD_TIME,FIELD_TIME,FIELD_TIME,FIELD_INT,FIELD_DOUBLE,FIELD_STRING,FIELD_STRING,FIELD_STRING,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT" });
		addAnnotation(getLinkDetail_CrewNo(), source, new String[] {
				"odme.displayName", "CREW_NO", "odme.column", "CREW_NO" });
		addAnnotation(getLinkDetail_Day(), source, new String[] {
				"odme.displayName", "DAY", "odme.column", "DAY" });
		addAnnotation(getLinkDetail_SignOnTime(), source, new String[] {
				"odme.displayName", "SIGN_ON_TIME", "odme.column",
				"SIGN_ON_TIME" });
		addAnnotation(getLinkDetail_DepartureTime(), source, new String[] {
				"odme.displayName", "DEPARTURE_TIME", "odme.column",
				"DEPARTURE_TIME" });
		addAnnotation(getLinkDetail_ArrivalTime(), source, new String[] {
				"odme.displayName", "ARRIVAL_TIME", "odme.column",
				"ARRIVAL_TIME" });
		addAnnotation(getLinkDetail_SignOffTime(), source, new String[] {
				"odme.displayName", "SIGN_OFF_TIME", "odme.column",
				"SIGN_OFF_TIME" });
		addAnnotation(getLinkDetail_OsAllowance(), source, new String[] {
				"odme.displayName", "OS_ALLOWANCE", "odme.column",
				"OS_ALLOWANCE" });
		addAnnotation(getLinkDetail_EarnedKm(), source, new String[] {
				"odme.displayName", "EARNED_KM", "odme.column", "EARNED_KM" });
		addAnnotation(getLinkDetail_PeriodicRestFlag(), source, new String[] {
				"odme.displayName", "PERIODIC_REST_FLAG", "odme.column",
				"PERIODIC_REST_FLAG" });
		addAnnotation(getLinkDetail_SpareFlag(), source, new String[] {
				"odme.displayName", "SPARE_FLAG", "odme.column", "SPARE_FLAG" });
		addAnnotation(getLinkDetail_NightFlag(), source, new String[] {
				"odme.displayName", "NIGHT_FLAG", "odme.column", "NIGHT_FLAG" });
		addAnnotation(getLinkDetail_SortOrder(), source, new String[] {
				"odme.displayName", "SORT_ORDER", "odme.column", "SORT_ORDER" });
		addAnnotation(getLinkDetail_DutyDuration(), source, new String[] {
				"odme.displayName", "DUTY_DURATION", "odme.column",
				"DUTY_DURATION" });
		addAnnotation(getLinkDetail_RunningDuration(), source, new String[] {
				"odme.displayName", "RUNNING_DURATION", "odme.column",
				"RUNNING_DURATION" });
		addAnnotation(getLinkDetail_HqRest(), source, new String[] {
				"odme.displayName", "HQ_REST", "odme.column", "HQ_REST" });
		addAnnotation(getLinkDetail_OsRest(), source, new String[] {
				"odme.displayName", "OS_REST", "odme.column", "OS_REST" });
		addAnnotation(getLinkDetail_RefFromStn(), source, new String[] {
				"odme.displayName", "FROM_STN", "odme.columns", "FROM_STN" });
		addAnnotation(getLinkDetail_RefLinkId(), source, new String[] {
				"odme.displayName", "LINK_ID", "odme.columns", "LINK_ID" });
		addAnnotation(getLinkDetail_RefToStn(), source, new String[] {
				"odme.displayName", "TO_STN", "odme.columns", "TO_STN" });
		addAnnotation(getLinkDetail_RefTrainId(), source, new String[] {
				"odme.displayName", "TRAIN_ID", "odme.columns", "TRAIN_ID" });
		addAnnotation(segmentMstEClass, source, new String[] {
				"odme.displayName", "SEGMENT_MST", "odme.table", "SEGMENT_MST",
				"odme.primarykey", "SEGMENT_ID", "odme.columns",
				"SEGMENT_ID,START_STATION_ID,STOP_STATION_ID,CREATED_BY",
				"odme.types", "FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT" });
		addAnnotation(getSegmentMst_SegmentId(), source, new String[] {
				"odme.displayName", "SEGMENT_ID", "odme.column", "SEGMENT_ID",
				"odme.keyPart", "true" });
		addAnnotation(getSegmentMst_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(getSegmentMst_RefStartStationId(), source, new String[] {
				"odme.displayName", "START_STATION_ID", "odme.columns",
				"START_STATION_ID" });
		addAnnotation(getSegmentMst_RefStopStationId(), source, new String[] {
				"odme.displayName", "STOP_STATION_ID", "odme.columns",
				"STOP_STATION_ID" });
		addAnnotation(getSegmentMst_RefTrainSegmentMstSegmentId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(
				trainSegmentMstEClass,
				source,
				new String[] {
						"odme.displayName",
						"TRAIN_SEGMENT_MST",
						"odme.table",
						"TRAIN_SEGMENT_MST",
						"odme.primarykey",
						"TRAIN_SEG_ID",
						"odme.columns",
						"TRAIN_SEG_ID,TRAIN_ID,SEGMENT_ID,CCLMS_TRAIN_TYPE,SIGN_ON_TIME,START_TIME,END_TIME,SIGN_OFF_TIME,RUNNING_DURATION,CHRONIC_DELAY_TIME,LOCO_CHANGE_STN,TRACTION_TYPE,ASSIGNED_LOBBY,DEPT_TYPE,SPARE_FLAG,DAYOFSERVICE,ACTUAL_KM,CREATED_BY",
						"odme.types",
						"FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_STRING,FIELD_STRING,FIELD_STRING,FIELD_DOUBLE,FIELD_INT" });
		addAnnotation(getTrainSegmentMst_TrainSegId(), source, new String[] {
				"odme.displayName", "TRAIN_SEG_ID", "odme.column",
				"TRAIN_SEG_ID", "odme.keyPart", "true" });
		addAnnotation(getTrainSegmentMst_CclmsTrainType(), source,
				new String[] { "odme.displayName", "CCLMS_TRAIN_TYPE",
						"odme.column", "CCLMS_TRAIN_TYPE" });
		addAnnotation(getTrainSegmentMst_SignOnTime(), source, new String[] {
				"odme.displayName", "SIGN_ON_TIME", "odme.column",
				"SIGN_ON_TIME" });
		addAnnotation(getTrainSegmentMst_StartTime(), source, new String[] {
				"odme.displayName", "START_TIME", "odme.column", "START_TIME" });
		addAnnotation(getTrainSegmentMst_EndTime(), source, new String[] {
				"odme.displayName", "END_TIME", "odme.column", "END_TIME" });
		addAnnotation(getTrainSegmentMst_SignOffTime(), source, new String[] {
				"odme.displayName", "SIGN_OFF_TIME", "odme.column",
				"SIGN_OFF_TIME" });
		addAnnotation(getTrainSegmentMst_RunningDuration(), source,
				new String[] { "odme.displayName", "RUNNING_DURATION",
						"odme.column", "RUNNING_DURATION" });
		addAnnotation(getTrainSegmentMst_ChronicDelayTime(), source,
				new String[] { "odme.displayName", "CHRONIC_DELAY_TIME",
						"odme.column", "CHRONIC_DELAY_TIME" });
		addAnnotation(getTrainSegmentMst_DeptType(), source, new String[] {
				"odme.displayName", "DEPT_TYPE", "odme.column", "DEPT_TYPE" });
		addAnnotation(getTrainSegmentMst_SpareFlag(), source, new String[] {
				"odme.displayName", "SPARE_FLAG", "odme.column", "SPARE_FLAG" });
		addAnnotation(getTrainSegmentMst_Dayofservice(), source, new String[] {
				"odme.displayName", "DAYOFSERVICE", "odme.column",
				"DAYOFSERVICE" });
		addAnnotation(getTrainSegmentMst_ActualKm(), source, new String[] {
				"odme.displayName", "ACTUAL_KM", "odme.column", "ACTUAL_KM" });
		addAnnotation(getTrainSegmentMst_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(getTrainSegmentMst_RefLocoChangeStn(), source,
				new String[] { "odme.displayName", "LOCO_CHANGE_STN",
						"odme.columns", "LOCO_CHANGE_STN" });
		addAnnotation(getTrainSegmentMst_RefSegmentId(), source,
				new String[] { "odme.displayName", "SEGMENT_ID",
						"odme.columns", "SEGMENT_ID" });
		addAnnotation(getTrainSegmentMst_RefAssignedLobby(), source,
				new String[] { "odme.displayName", "ASSIGNED_LOBBY",
						"odme.columns", "ASSIGNED_LOBBY" });
		addAnnotation(getTrainSegmentMst_RefTractionType(), source,
				new String[] { "odme.displayName", "TRACTION_TYPE",
						"odme.columns", "TRACTION_TYPE" });
		addAnnotation(getTrainSegmentMst_RefTrainId(), source, new String[] {
				"odme.displayName", "TRAIN_ID", "odme.columns", "TRAIN_ID" });
		addAnnotation(
				linkMstEClass,
				source,
				new String[] {
						"odme.displayName",
						"LINK_MST",
						"odme.table",
						"LINK_MST",
						"odme.primarykey",
						"LINK_ID",
						"odme.columns",
						"LINK_ID,SCENARIO_ID,LINK_NAME,LOBBY_STN_ID,LOBBY_TYPE,TRACTION_TYPE,TRAIN_TYPE_CD,TRAIN_FREQUENCY_CD,CREATED_BY,LAST_MODIFIED_BY,LINK_STATUS",
						"odme.types",
						"FIELD_INT,FIELD_INT,FIELD_STRING,FIELD_INT,FIELD_STRING,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_INT,FIELD_STRING" });
		addAnnotation(getLinkMst_LinkId(), source, new String[] {
				"odme.displayName", "LINK_ID", "odme.column", "LINK_ID",
				"odme.keyPart", "true" });
		addAnnotation(getLinkMst_ScenarioId(), source,
				new String[] { "odme.displayName", "SCENARIO_ID",
						"odme.column", "SCENARIO_ID" });
		addAnnotation(getLinkMst_LinkName(), source, new String[] {
				"odme.displayName", "LINK_NAME", "odme.column", "LINK_NAME" });
		addAnnotation(getLinkMst_LobbyType(), source, new String[] {
				"odme.displayName", "LOBBY_TYPE", "odme.column", "LOBBY_TYPE" });
		addAnnotation(getLinkMst_LinkStatus(), source,
				new String[] { "odme.displayName", "LINK_STATUS",
						"odme.column", "LINK_STATUS" });
		addAnnotation(getLinkMst_RefParameterValueLinkId(), source,
				new String[] { "odme.displayName", "" });
		addAnnotation(getLinkMst_RefKpiValueLinkId(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getLinkMst_RefLinkDetailLinkId(), source, new String[] {
				"odme.displayName", "" });
		addAnnotation(getLinkMst_RefCreatedBy(), source,
				new String[] { "odme.displayName", "CREATED_BY",
						"odme.columns", "CREATED_BY" });
		addAnnotation(getLinkMst_RefLobbyStnId(), source, new String[] {
				"odme.displayName", "LOBBY_STN_ID", "odme.columns",
				"LOBBY_STN_ID" });
		addAnnotation(getLinkMst_RefLastModifiedBy(), source, new String[] {
				"odme.displayName", "LAST_MODIFIED_BY", "odme.columns",
				"LAST_MODIFIED_BY" });
		addAnnotation(getLinkMst_RefTractionType(), source, new String[] {
				"odme.displayName", "TRACTION_TYPE", "odme.columns",
				"TRACTION_TYPE" });
		addAnnotation(getLinkMst_RefTrainFrequencyCd(), source, new String[] {
				"odme.displayName", "TRAIN_FREQUENCY_CD", "odme.columns",
				"TRAIN_FREQUENCY_CD" });
		addAnnotation(getLinkMst_RefTrainTypeCd(), source, new String[] {
				"odme.displayName", "TRAIN_TYPE_CD", "odme.columns",
				"TRAIN_TYPE_CD" });
		addAnnotation(lobbyMstEClass, source, new String[] {
				"odme.displayName", "LOBBY_MST", "odme.table", "LOBBY_MST",
				"odme.columns", "LOBBY_CODE,LOBBY_NAME,LOBBY_ID", "odme.types",
				"FIELD_STRING,FIELD_STRING,FIELD_STRING" });
		addAnnotation(getLobbyMst_LobbyCode(), source, new String[] {
				"odme.displayName", "LOBBY_CODE", "odme.column", "LOBBY_CODE" });
		addAnnotation(getLobbyMst_LobbyName(), source, new String[] {
				"odme.displayName", "LOBBY_NAME", "odme.column", "LOBBY_NAME" });
		addAnnotation(getLobbyMst_LobbyId(), source, new String[] {
				"odme.displayName", "LOBBY_ID", "odme.column", "LOBBY_ID" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(0), source,
				new String[] { "odme.factory", "ZoneMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(1), source,
				new String[] { "odme.factory", "ZoneMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(3), source,
				new String[] { "odme.factory", "StationMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(4), source,
				new String[] { "odme.factory", "StationMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(6), source,
				new String[] { "odme.factory", "TrainFrequencyMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(7), source,
				new String[] { "odme.factory", "TrainFrequencyMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(9), source,
				new String[] { "odme.factory", "TractionMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(10), source,
				new String[] { "odme.factory", "TractionMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(12), source,
				new String[] { "odme.factory", "TrainMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(13), source,
				new String[] { "odme.factory", "TrainMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(15), source,
				new String[] { "odme.factory", "ParameterValue" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(16), source,
				new String[] { "odme.factory", "ParameterValue" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(18), source,
				new String[] { "odme.factory", "DivisionMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(19), source,
				new String[] { "odme.factory", "DivisionMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(21), source,
				new String[] { "odme.factory", "UserRoleMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(22), source,
				new String[] { "odme.factory", "UserRoleMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(24), source,
				new String[] { "odme.factory", "UserMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(25), source,
				new String[] { "odme.factory", "UserMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(27), source,
				new String[] { "odme.factory", "KpiMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(28), source,
				new String[] { "odme.factory", "KpiMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(30), source,
				new String[] { "odme.factory", "KpiValue" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(31), source,
				new String[] { "odme.factory", "KpiValue" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(33), source,
				new String[] { "odme.factory", "ParameterMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(34), source,
				new String[] { "odme.factory", "ParameterMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(36), source,
				new String[] { "odme.factory", "TrainTypeMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(37), source,
				new String[] { "odme.factory", "TrainTypeMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(39), source,
				new String[] { "odme.factory", "TrainTypeMappingMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(40), source,
				new String[] { "odme.factory", "TrainTypeMappingMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(42), source,
				new String[] { "odme.factory", "LinkDetail" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(43), source,
				new String[] { "odme.factory", "LinkDetail" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(44), source,
				new String[] { "odme.factory", "SegmentMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(45), source,
				new String[] { "odme.factory", "SegmentMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(47), source,
				new String[] { "odme.factory", "TrainSegmentMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(48), source,
				new String[] { "odme.factory", "TrainSegmentMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(50), source,
				new String[] { "odme.factory", "LinkMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(51), source,
				new String[] { "odme.factory", "LinkMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(53), source,
				new String[] { "odme.factory", "LobbyMst" });
		addAnnotation(cclmsCollectorEClass.getEOperations().get(54), source,
				new String[] { "odme.factory", "LobbyMst" });
		addAnnotation(getCclmsCollector_ZoneMst(), source, new String[] {
				"odme.collector", "ZoneMst" });
		addAnnotation(getCclmsCollector_StationMst(), source, new String[] {
				"odme.collector", "StationMst" });
		addAnnotation(getCclmsCollector_TrainFrequencyMst(), source,
				new String[] { "odme.collector", "TrainFrequencyMst" });
		addAnnotation(getCclmsCollector_TractionMst(), source, new String[] {
				"odme.collector", "TractionMst" });
		addAnnotation(getCclmsCollector_TrainMst(), source, new String[] {
				"odme.collector", "TrainMst" });
		addAnnotation(getCclmsCollector_ParameterValue(), source, new String[] {
				"odme.collector", "ParameterValue" });
		addAnnotation(getCclmsCollector_DivisionMst(), source, new String[] {
				"odme.collector", "DivisionMst" });
		addAnnotation(getCclmsCollector_UserRoleMst(), source, new String[] {
				"odme.collector", "UserRoleMst" });
		addAnnotation(getCclmsCollector_UserMst(), source, new String[] {
				"odme.collector", "UserMst" });
		addAnnotation(getCclmsCollector_KpiMst(), source, new String[] {
				"odme.collector", "KpiMst" });
		addAnnotation(getCclmsCollector_KpiValue(), source, new String[] {
				"odme.collector", "KpiValue" });
		addAnnotation(getCclmsCollector_ParameterMst(), source, new String[] {
				"odme.collector", "ParameterMst" });
		addAnnotation(getCclmsCollector_TrainTypeMst(), source, new String[] {
				"odme.collector", "TrainTypeMst" });
		addAnnotation(getCclmsCollector_TrainTypeMappingMst(), source,
				new String[] { "odme.collector", "TrainTypeMappingMst" });
		addAnnotation(getCclmsCollector_LinkDetail(), source, new String[] {
				"odme.collector", "LinkDetail" });
		addAnnotation(getCclmsCollector_SegmentMst(), source, new String[] {
				"odme.collector", "SegmentMst" });
		addAnnotation(getCclmsCollector_TrainSegmentMst(), source,
				new String[] { "odme.collector", "TrainSegmentMst" });
		addAnnotation(getCclmsCollector_LinkMst(), source, new String[] {
				"odme.collector", "LinkMst" });
		addAnnotation(getCclmsCollector_LobbyMst(), source, new String[] {
				"odme.collector", "LobbyMst" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(zoneMstEClass.getEOperations().get(0), source,
				new String[] { "body", "return getRefDivisionMstZoneId();" });
		addAnnotation(zoneMstEClass.getEOperations().get(1), source,
				new String[] { "body", "return getRefUserMstZoneId();" });
		addAnnotation(
				zoneMstEClass.getEOperations().get(2),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getZoneMst_RefDivisionMstZoneId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getZoneMst_RefUserMstZoneId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(
				stationMstEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"DivisionMst obj= getRefDivisionId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(stationMstEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefDivisionId(obj);" });
		addAnnotation(stationMstEClass.getEOperations().get(2), source,
				new String[] { "body", "return getRefTrainMstTrainEndStn();" });
		addAnnotation(
				stationMstEClass.getEOperations().get(3),
				source,
				new String[] { "body", "return getRefTrainMstTrainStartStn();" });
		addAnnotation(stationMstEClass.getEOperations().get(4), source,
				new String[] { "body", "return getRefUserMstLobbyId();" });
		addAnnotation(stationMstEClass.getEOperations().get(5), source,
				new String[] { "body", "return getRefLinkDetailFromStn();" });
		addAnnotation(stationMstEClass.getEOperations().get(6), source,
				new String[] { "body", "return getRefLinkDetailToStn();" });
		addAnnotation(stationMstEClass.getEOperations().get(7), source,
				new String[] { "body",
						"return getRefSegmentMstStartStationId();" });
		addAnnotation(stationMstEClass.getEOperations().get(8), source,
				new String[] { "body",
						"return getRefSegmentMstStopStationId();" });
		addAnnotation(stationMstEClass.getEOperations().get(9), source,
				new String[] { "body",
						"return getRefTrainSegmentMstLocoChangeStn();" });
		addAnnotation(stationMstEClass.getEOperations().get(10), source,
				new String[] { "body",
						"return getRefTrainSegmentMstAssignedLobby();" });
		addAnnotation(stationMstEClass.getEOperations().get(11), source,
				new String[] { "body", "return getRefLinkMstLobbyStnId();" });
		addAnnotation(
				stationMstEClass.getEOperations().get(12),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getStationMst_RefDivisionId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefTrainMstTrainEndStn(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefTrainMstTrainStartStn(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefUserMstLobbyId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefLinkDetailFromStn(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefLinkDetailToStn(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefSegmentMstStartStationId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefSegmentMstStopStationId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefTrainSegmentMstLocoChangeStn(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefTrainSegmentMstAssignedLobby(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getStationMst_RefLinkMstLobbyStnId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(trainFrequencyMstEClass.getEOperations().get(0), source,
				new String[] { "body",
						"return getRefTrainMstTrainFrequencyCd();" });
		addAnnotation(trainFrequencyMstEClass.getEOperations().get(1), source,
				new String[] { "body",
						"return getRefLinkMstTrainFrequencyCd();" });
		addAnnotation(
				trainFrequencyMstEClass.getEOperations().get(2),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getTrainFrequencyMst_RefTrainMstTrainFrequencyCd(),
				source, new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainFrequencyMst_RefLinkMstTrainFrequencyCd(),
				source, new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(tractionMstEClass.getEOperations().get(0), source,
				new String[] { "body",
						"return getRefTrainSegmentMstTractionType();" });
		addAnnotation(tractionMstEClass.getEOperations().get(1), source,
				new String[] { "body", "return getRefLinkMstTractionType();" });
		addAnnotation(
				tractionMstEClass.getEOperations().get(2),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getTractionMst_RefTrainSegmentMstTractionType(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTractionMst_RefLinkMstTractionType(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(
				trainMstEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"StationMst obj= getRefTrainEndStn();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainMstEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefTrainEndStn(obj);" });
		addAnnotation(
				trainMstEClass.getEOperations().get(2),
				source,
				new String[] { "body",
						"StationMst obj= getRefTrainStartStn();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainMstEClass.getEOperations().get(3), source,
				new String[] { "body", "setRefTrainStartStn(obj);" });
		addAnnotation(
				trainMstEClass.getEOperations().get(4),
				source,
				new String[] {
						"body",
						"TrainFrequencyMst obj= getRefTrainFrequencyCd();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainMstEClass.getEOperations().get(5), source,
				new String[] { "body", "setRefTrainFrequencyCd(obj);" });
		addAnnotation(
				trainMstEClass.getEOperations().get(6),
				source,
				new String[] {
						"body",
						"TrainTypeMappingMst obj= getRefTrainType();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainMstEClass.getEOperations().get(7), source,
				new String[] { "body", "setRefTrainType(obj);" });
		addAnnotation(trainMstEClass.getEOperations().get(8), source,
				new String[] { "body", "return getRefLinkDetailTrainId();" });
		addAnnotation(
				trainMstEClass.getEOperations().get(9),
				source,
				new String[] { "body", "return getRefTrainSegmentMstTrainId();" });
		addAnnotation(
				trainMstEClass.getEOperations().get(10),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getTrainMst_RefTrainEndStn(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainMst_RefTrainStartStn(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainMst_RefTrainFrequencyCd(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainMst_RefTrainType(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainMst_RefLinkDetailTrainId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainMst_RefTrainSegmentMstTrainId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(
				parameterValueEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(parameterValueEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(
				parameterValueEClass.getEOperations().get(2),
				source,
				new String[] { "body",
						"LinkMst obj= getRefLinkId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(parameterValueEClass.getEOperations().get(3), source,
				new String[] { "body", "setRefLinkId(obj);" });
		addAnnotation(
				parameterValueEClass.getEOperations().get(4),
				source,
				new String[] { "body",
						"ParameterMst obj= getRefParameterId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(parameterValueEClass.getEOperations().get(5), source,
				new String[] { "body", "setRefParameterId(obj);" });
		addAnnotation(
				parameterValueEClass.getEOperations().get(6),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getParameterValue_RefCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getParameterValue_RefLinkId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getParameterValue_RefParameterId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(divisionMstEClass.getEOperations().get(0), source,
				new String[] { "body", "return getRefStationMstDivisionId();" });
		addAnnotation(
				divisionMstEClass.getEOperations().get(1),
				source,
				new String[] { "body",
						"ZoneMst obj= getRefZoneId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(divisionMstEClass.getEOperations().get(2), source,
				new String[] { "body", "setRefZoneId(obj);" });
		addAnnotation(divisionMstEClass.getEOperations().get(3), source,
				new String[] { "body", "return getRefUserMstDivisionId();" });
		addAnnotation(
				divisionMstEClass.getEOperations().get(4),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getDivisionMst_RefStationMstDivisionId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getDivisionMst_RefZoneId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getDivisionMst_RefUserMstDivisionId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(userRoleMstEClass.getEOperations().get(0), source,
				new String[] { "body", "return getRefUserMstUserRole();" });
		addAnnotation(
				userRoleMstEClass.getEOperations().get(1),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getUserRoleMst_RefUserMstUserRole(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(userMstEClass.getEOperations().get(0), source,
				new String[] { "body",
						"return getRefParameterValueCreatedBy();" });
		addAnnotation(
				userMstEClass.getEOperations().get(1),
				source,
				new String[] { "body",
						"DivisionMst obj= getRefDivisionId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(userMstEClass.getEOperations().get(2), source,
				new String[] { "body", "setRefDivisionId(obj);" });
		addAnnotation(
				userMstEClass.getEOperations().get(3),
				source,
				new String[] { "body",
						"StationMst obj= getRefLobbyId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(userMstEClass.getEOperations().get(4), source,
				new String[] { "body", "setRefLobbyId(obj);" });
		addAnnotation(
				userMstEClass.getEOperations().get(5),
				source,
				new String[] { "body",
						"UserRoleMst obj= getRefUserRole();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(userMstEClass.getEOperations().get(6), source,
				new String[] { "body", "setRefUserRole(obj);" });
		addAnnotation(
				userMstEClass.getEOperations().get(7),
				source,
				new String[] { "body",
						"ZoneMst obj= getRefZoneId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(userMstEClass.getEOperations().get(8), source,
				new String[] { "body", "setRefZoneId(obj);" });
		addAnnotation(userMstEClass.getEOperations().get(9), source,
				new String[] { "body", "return getRefKpiValueCreatedBy();" });
		addAnnotation(
				userMstEClass.getEOperations().get(10),
				source,
				new String[] { "body", "return getRefParameterMstCreatedBy();" });
		addAnnotation(userMstEClass.getEOperations().get(11), source,
				new String[] { "body",
						"return getRefParameterMstLastModifiedBy();" });
		addAnnotation(
				userMstEClass.getEOperations().get(12),
				source,
				new String[] { "body", "return getRefTrainTypeMstCreatedBy();" });
		addAnnotation(userMstEClass.getEOperations().get(13), source,
				new String[] { "body",
						"return getRefTrainTypeMappingMstCreatedBy();" });
		addAnnotation(userMstEClass.getEOperations().get(14), source,
				new String[] { "body",
						"return getRefTrainTypeMappingMstLastModifiedBy();" });
		addAnnotation(userMstEClass.getEOperations().get(15), source,
				new String[] { "body", "return getRefSegmentMstCreatedBy();" });
		addAnnotation(userMstEClass.getEOperations().get(16), source,
				new String[] { "body",
						"return getRefTrainSegmentMstCreatedBy();" });
		addAnnotation(userMstEClass.getEOperations().get(17), source,
				new String[] { "body", "return getRefLinkMstCreatedBy();" });
		addAnnotation(
				userMstEClass.getEOperations().get(18),
				source,
				new String[] { "body", "return getRefLinkMstLastModifiedBy();" });
		addAnnotation(
				userMstEClass.getEOperations().get(19),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getUserMst_RefParameterValueCreatedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefDivisionId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefLobbyId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefUserRole(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefZoneId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefKpiValueCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefParameterMstCreatedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefParameterMstLastModifiedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefTrainTypeMstCreatedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefTrainTypeMappingMstCreatedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefTrainTypeMappingMstLastModifiedBy(),
				source, new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefSegmentMstCreatedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefTrainSegmentMstCreatedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefLinkMstCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getUserMst_RefLinkMstLastModifiedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(kpiMstEClass.getEOperations().get(0), source,
				new String[] { "body", "return getRefKpiValueKpiId();" });
		addAnnotation(
				kpiMstEClass.getEOperations().get(1),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getKpiMst_RefKpiValueKpiId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(
				kpiValueEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"KpiMst obj= getRefKpiId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(kpiValueEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefKpiId(obj);" });
		addAnnotation(
				kpiValueEClass.getEOperations().get(2),
				source,
				new String[] { "body",
						"LinkMst obj= getRefLinkId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(kpiValueEClass.getEOperations().get(3), source,
				new String[] { "body", "setRefLinkId(obj);" });
		addAnnotation(
				kpiValueEClass.getEOperations().get(4),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(kpiValueEClass.getEOperations().get(5), source,
				new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(
				kpiValueEClass.getEOperations().get(6),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getKpiValue_RefKpiId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getKpiValue_RefLinkId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getKpiValue_RefCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(parameterMstEClass.getEOperations().get(0), source,
				new String[] { "body",
						"return getRefParameterValueParameterId();" });
		addAnnotation(
				parameterMstEClass.getEOperations().get(1),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(parameterMstEClass.getEOperations().get(2), source,
				new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(
				parameterMstEClass.getEOperations().get(3),
				source,
				new String[] { "body",
						"UserMst obj= getRefLastModifiedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(parameterMstEClass.getEOperations().get(4), source,
				new String[] { "body", "setRefLastModifiedBy(obj);" });
		addAnnotation(
				parameterMstEClass.getEOperations().get(5),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getParameterMst_RefParameterValueParameterId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getParameterMst_RefCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getParameterMst_RefLastModifiedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(
				trainTypeMstEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainTypeMstEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(trainTypeMstEClass.getEOperations().get(2), source,
				new String[] { "body",
						"return getRefTrainTypeMappingMstTrainTypeCclms();" });
		addAnnotation(trainTypeMstEClass.getEOperations().get(3), source,
				new String[] { "body", "return getRefLinkMstTrainTypeCd();" });
		addAnnotation(
				trainTypeMstEClass.getEOperations().get(4),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getTrainTypeMst_RefCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms(),
				source, new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainTypeMst_RefLinkMstTrainTypeCd(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(trainTypeMappingMstEClass.getEOperations().get(0),
				source, new String[] { "body",
						"return getRefTrainMstTrainType();" });
		addAnnotation(
				trainTypeMappingMstEClass.getEOperations().get(1),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainTypeMappingMstEClass.getEOperations().get(2),
				source, new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(
				trainTypeMappingMstEClass.getEOperations().get(3),
				source,
				new String[] { "body",
						"UserMst obj= getRefLastModifiedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainTypeMappingMstEClass.getEOperations().get(4),
				source, new String[] { "body", "setRefLastModifiedBy(obj);" });
		addAnnotation(
				trainTypeMappingMstEClass.getEOperations().get(5),
				source,
				new String[] { "body",
						"TrainTypeMst obj= getRefTrainTypeCclms();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainTypeMappingMstEClass.getEOperations().get(6),
				source, new String[] { "body", "setRefTrainTypeCclms(obj);" });
		addAnnotation(trainTypeMappingMstEClass.getEOperations().get(7),
				source, new String[] { "body",
						"return (CclmsCollector) eContainer();" });
		addAnnotation(getTrainTypeMappingMst_RefTrainMstTrainType(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainTypeMappingMst_RefCreatedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainTypeMappingMst_RefLastModifiedBy(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainTypeMappingMst_RefTrainTypeCclms(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(
				linkDetailEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"StationMst obj= getRefFromStn();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkDetailEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefFromStn(obj);" });
		addAnnotation(
				linkDetailEClass.getEOperations().get(2),
				source,
				new String[] { "body",
						"LinkMst obj= getRefLinkId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkDetailEClass.getEOperations().get(3), source,
				new String[] { "body", "setRefLinkId(obj);" });
		addAnnotation(
				linkDetailEClass.getEOperations().get(4),
				source,
				new String[] { "body",
						"StationMst obj= getRefToStn();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkDetailEClass.getEOperations().get(5), source,
				new String[] { "body", "setRefToStn(obj);" });
		addAnnotation(
				linkDetailEClass.getEOperations().get(6),
				source,
				new String[] { "body",
						"TrainMst obj= getRefTrainId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkDetailEClass.getEOperations().get(7), source,
				new String[] { "body", "setRefTrainId(obj);" });
		addAnnotation(
				linkDetailEClass.getEOperations().get(8),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getLinkDetail_RefFromStn(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkDetail_RefLinkId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkDetail_RefToStn(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkDetail_RefTrainId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(
				segmentMstEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(segmentMstEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(
				segmentMstEClass.getEOperations().get(2),
				source,
				new String[] { "body",
						"StationMst obj= getRefStartStationId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(segmentMstEClass.getEOperations().get(3), source,
				new String[] { "body", "setRefStartStationId(obj);" });
		addAnnotation(
				segmentMstEClass.getEOperations().get(4),
				source,
				new String[] { "body",
						"StationMst obj= getRefStopStationId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(segmentMstEClass.getEOperations().get(5), source,
				new String[] { "body", "setRefStopStationId(obj);" });
		addAnnotation(segmentMstEClass.getEOperations().get(6), source,
				new String[] { "body",
						"return getRefTrainSegmentMstSegmentId();" });
		addAnnotation(
				segmentMstEClass.getEOperations().get(7),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getSegmentMst_RefCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getSegmentMst_RefStartStationId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getSegmentMst_RefStopStationId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getSegmentMst_RefTrainSegmentMstSegmentId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(
				trainSegmentMstEClass.getEOperations().get(0),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainSegmentMstEClass.getEOperations().get(1), source,
				new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(
				trainSegmentMstEClass.getEOperations().get(2),
				source,
				new String[] { "body",
						"StationMst obj= getRefLocoChangeStn();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainSegmentMstEClass.getEOperations().get(3), source,
				new String[] { "body", "setRefLocoChangeStn(obj);" });
		addAnnotation(
				trainSegmentMstEClass.getEOperations().get(4),
				source,
				new String[] { "body",
						"SegmentMst obj= getRefSegmentId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainSegmentMstEClass.getEOperations().get(5), source,
				new String[] { "body", "setRefSegmentId(obj);" });
		addAnnotation(
				trainSegmentMstEClass.getEOperations().get(6),
				source,
				new String[] { "body",
						"StationMst obj= getRefAssignedLobby();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainSegmentMstEClass.getEOperations().get(7), source,
				new String[] { "body", "setRefAssignedLobby(obj);" });
		addAnnotation(
				trainSegmentMstEClass.getEOperations().get(8),
				source,
				new String[] { "body",
						"TractionMst obj= getRefTractionType();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainSegmentMstEClass.getEOperations().get(9), source,
				new String[] { "body", "setRefTractionType(obj);" });
		addAnnotation(
				trainSegmentMstEClass.getEOperations().get(10),
				source,
				new String[] { "body",
						"TrainMst obj= getRefTrainId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(trainSegmentMstEClass.getEOperations().get(11), source,
				new String[] { "body", "setRefTrainId(obj);" });
		addAnnotation(
				trainSegmentMstEClass.getEOperations().get(12),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getTrainSegmentMst_RefCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainSegmentMst_RefLocoChangeStn(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainSegmentMst_RefSegmentId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainSegmentMst_RefAssignedLobby(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainSegmentMst_RefTractionType(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getTrainSegmentMst_RefTrainId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(linkMstEClass.getEOperations().get(0), source,
				new String[] { "body", "return getRefParameterValueLinkId();" });
		addAnnotation(linkMstEClass.getEOperations().get(1), source,
				new String[] { "body", "return getRefKpiValueLinkId();" });
		addAnnotation(linkMstEClass.getEOperations().get(2), source,
				new String[] { "body", "return getRefLinkDetailLinkId();" });
		addAnnotation(
				linkMstEClass.getEOperations().get(3),
				source,
				new String[] { "body",
						"UserMst obj= getRefCreatedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkMstEClass.getEOperations().get(4), source,
				new String[] { "body", "setRefCreatedBy(obj);" });
		addAnnotation(
				linkMstEClass.getEOperations().get(5),
				source,
				new String[] { "body",
						"StationMst obj= getRefLobbyStnId();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkMstEClass.getEOperations().get(6), source,
				new String[] { "body", "setRefLobbyStnId(obj);" });
		addAnnotation(
				linkMstEClass.getEOperations().get(7),
				source,
				new String[] { "body",
						"UserMst obj= getRefLastModifiedBy();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkMstEClass.getEOperations().get(8), source,
				new String[] { "body", "setRefLastModifiedBy(obj);" });
		addAnnotation(
				linkMstEClass.getEOperations().get(9),
				source,
				new String[] { "body",
						"TractionMst obj= getRefTractionType();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkMstEClass.getEOperations().get(10), source,
				new String[] { "body", "setRefTractionType(obj);" });
		addAnnotation(
				linkMstEClass.getEOperations().get(11),
				source,
				new String[] {
						"body",
						"TrainFrequencyMst obj= getRefTrainFrequencyCd();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkMstEClass.getEOperations().get(12), source,
				new String[] { "body", "setRefTrainFrequencyCd(obj);" });
		addAnnotation(
				linkMstEClass.getEOperations().get(13),
				source,
				new String[] { "body",
						"TrainTypeMst obj= getRefTrainTypeCd();return isNullOrProxy(obj)?null:obj;" });
		addAnnotation(linkMstEClass.getEOperations().get(14), source,
				new String[] { "body", "setRefTrainTypeCd(obj);" });
		addAnnotation(
				linkMstEClass.getEOperations().get(15),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(getLinkMst_RefParameterValueLinkId(), source,
				new String[] { "suppressedSetVisibility", "true",
						"suppressedGetVisibility", "true",
						"suppressedUnsetVisibility", "true",
						"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefKpiValueLinkId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefLinkDetailLinkId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefCreatedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefLobbyStnId(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefLastModifiedBy(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefTractionType(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefTrainFrequencyCd(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(getLinkMst_RefTrainTypeCd(), source, new String[] {
				"suppressedSetVisibility", "true", "suppressedGetVisibility",
				"true", "suppressedUnsetVisibility", "true",
				"suppressedIsSetVisibility", "true" });
		addAnnotation(
				lobbyMstEClass.getEOperations().get(0),
				source,
				new String[] { "body", "return (CclmsCollector) eContainer();" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(0),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ZoneMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(ZoneMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(1),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ZoneMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(ZoneMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(2),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ZoneMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(ZoneMst.class,new Object[]{zoneId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(3),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (StationMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(StationMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(4),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (StationMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(StationMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(5),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (StationMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(StationMst.class,new Object[]{stationId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(6),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainFrequencyMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(TrainFrequencyMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(7),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainFrequencyMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(TrainFrequencyMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(8),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainFrequencyMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(TrainFrequencyMst.class,new Object[]{trainFrequencyCode});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(9),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TractionMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(TractionMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(10),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TractionMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(TractionMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(11),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TractionMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(TractionMst.class,new Object[]{tractionType});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(12),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(TrainMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(13),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(TrainMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(14),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(TrainMst.class,new Object[]{trainId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(15),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ParameterValue)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(ParameterValue.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(16),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ParameterValue)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(ParameterValue.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(17),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ParameterValue)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(ParameterValue.class,new Object[]{parameterId,linkId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(18),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (DivisionMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(DivisionMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(19),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (DivisionMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(DivisionMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(20),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (DivisionMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(DivisionMst.class,new Object[]{divisionId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(21),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (UserRoleMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(UserRoleMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(22),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (UserRoleMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(UserRoleMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(23),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (UserRoleMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(UserRoleMst.class,new Object[]{userRoleCd});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(24),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (UserMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(UserMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(25),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (UserMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(UserMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(26),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (UserMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(UserMst.class,new Object[]{userId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(27),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (KpiMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(KpiMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(28),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (KpiMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(KpiMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(29),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (KpiMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(KpiMst.class,new Object[]{kpiId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(30),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (KpiValue)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(KpiValue.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(31),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (KpiValue)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(KpiValue.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(32),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (KpiValue)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(KpiValue.class,new Object[]{kpiId,linkId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(33),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ParameterMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(ParameterMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(34),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ParameterMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(ParameterMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(35),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (ParameterMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(ParameterMst.class,new Object[]{parameterId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(36),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainTypeMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(TrainTypeMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(37),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainTypeMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(TrainTypeMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(38),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainTypeMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(TrainTypeMst.class,new Object[]{trainTypeCclmsId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(39),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainTypeMappingMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(TrainTypeMappingMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(40),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainTypeMappingMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(TrainTypeMappingMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(41),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainTypeMappingMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(TrainTypeMappingMst.class,new Object[]{trainType});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(42),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (LinkDetail)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(LinkDetail.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(43),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (LinkDetail)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(LinkDetail.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(44),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (SegmentMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(SegmentMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(45),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (SegmentMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(SegmentMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(46),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (SegmentMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(SegmentMst.class,new Object[]{segmentId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(47),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainSegmentMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(TrainSegmentMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(48),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainSegmentMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(TrainSegmentMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(49),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (TrainSegmentMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(TrainSegmentMst.class,new Object[]{trainSegId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(50),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (LinkMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(LinkMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(51),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (LinkMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(LinkMst.class,index);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(52),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (LinkMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).getObjectByKey(LinkMst.class,new Object[]{linkId});\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(53),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (LobbyMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObject(LobbyMst.class);\n}\nreturn null;" });
		addAnnotation(
				cclmsCollectorEClass.getEOperations().get(54),
				source,
				new String[] {
						"body",
						"if (eResource()!=null && eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {\nreturn (LobbyMst)((ilog.odm.dom.impl.resource.IloDomResourceImpl)eResource()).createEObjectAt(LobbyMst.class,index);\n}\nreturn null;" });
	}

} //CclmsPackageImpl