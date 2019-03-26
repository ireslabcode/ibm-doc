/**
 */
package cclms.impl;

import java.io.IOException;
import java.net.URL;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import ilog.odm.dom.IloDomCollector;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
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
	protected String packageFilename = "cclms.ecore";

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
	private EClass trainSegmentEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentMstEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeToMinEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayMstEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiLinkEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkDetailEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlinkEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lobbyMstEngineEClass = null;

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

		// Load packages
		theCclmsPackage.loadPackage();

		// Fix loaded packages
		theCclmsPackage.fixPackageContents();

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
		if (zoneMstEClass == null) {
			zoneMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return zoneMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneMst_ZoneId() {
		return (EAttribute) getZoneMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneMst_ZoneCode() {
		return (EAttribute) getZoneMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneMst_ZoneDesc() {
		return (EAttribute) getZoneMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneMst_RefDivisionMstZoneId() {
		return (EReference) getZoneMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneMst_RefUserMstZoneId() {
		return (EReference) getZoneMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationMst() {
		if (stationMstEClass == null) {
			stationMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return stationMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_StationId() {
		return (EAttribute) getStationMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_StationCode() {
		return (EAttribute) getStationMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_StationName() {
		return (EAttribute) getStationMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationMst_LobbyFlag() {
		return (EAttribute) getStationMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefDivisionId() {
		return (EReference) getStationMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainMstTrainEndStn() {
		return (EReference) getStationMst().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainMstTrainStartStn() {
		return (EReference) getStationMst().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefUserMstLobbyId() {
		return (EReference) getStationMst().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefLinkDetailFromStn() {
		return (EReference) getStationMst().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefLinkDetailToStn() {
		return (EReference) getStationMst().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefSegmentMstStartStationId() {
		return (EReference) getStationMst().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefSegmentMstStopStationId() {
		return (EReference) getStationMst().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainSegmentMstLocoChangeStn() {
		return (EReference) getStationMst().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefTrainSegmentMstAssignedLobby() {
		return (EReference) getStationMst().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStationMst_RefLinkMstLobbyStnId() {
		return (EReference) getStationMst().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainFrequencyMst() {
		if (trainFrequencyMstEClass == null) {
			trainFrequencyMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return trainFrequencyMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainFrequencyMst_TrainFrequencyCode() {
		return (EAttribute) getTrainFrequencyMst().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainFrequencyMst_Desc() {
		return (EAttribute) getTrainFrequencyMst().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainFrequencyMst_RefTrainMstTrainFrequencyCd() {
		return (EReference) getTrainFrequencyMst().getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainFrequencyMst_RefLinkMstTrainFrequencyCd() {
		return (EReference) getTrainFrequencyMst().getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTractionMst() {
		if (tractionMstEClass == null) {
			tractionMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return tractionMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTractionMst_TractionType() {
		return (EAttribute) getTractionMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTractionMst_TractionDesc() {
		return (EAttribute) getTractionMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTractionMst_RefTrainSegmentMstTractionType() {
		return (EReference) getTractionMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTractionMst_RefLinkMstTractionType() {
		return (EReference) getTractionMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainMst() {
		if (trainMstEClass == null) {
			trainMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return trainMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainId() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainNbr() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainName() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainSubType() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_TrainRunType() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_RakeId() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_DayOfService() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_ValidFrom() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_ValidTo() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainMst_BaseTraction() {
		return (EAttribute) getTrainMst().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainEndStn() {
		return (EReference) getTrainMst().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainStartStn() {
		return (EReference) getTrainMst().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainFrequencyCd() {
		return (EReference) getTrainMst().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainType() {
		return (EReference) getTrainMst().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefLinkDetailTrainId() {
		return (EReference) getTrainMst().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainMst_RefTrainSegmentMstTrainId() {
		return (EReference) getTrainMst().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		if (parameterValueEClass == null) {
			parameterValueEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterValue_Value() {
		return (EAttribute) getParameterValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_RefCreatedBy() {
		return (EReference) getParameterValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_RefLinkId() {
		return (EReference) getParameterValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_RefParameterId() {
		return (EReference) getParameterValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivisionMst() {
		if (divisionMstEClass == null) {
			divisionMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return divisionMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionMst_DivisionId() {
		return (EAttribute) getDivisionMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionMst_DivisionCode() {
		return (EAttribute) getDivisionMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivisionMst_DivisionDesc() {
		return (EAttribute) getDivisionMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionMst_RefStationMstDivisionId() {
		return (EReference) getDivisionMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionMst_RefZoneId() {
		return (EReference) getDivisionMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivisionMst_RefUserMstDivisionId() {
		return (EReference) getDivisionMst().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRoleMst() {
		if (userRoleMstEClass == null) {
			userRoleMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return userRoleMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRoleMst_UserRoleCd() {
		return (EAttribute) getUserRoleMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserRoleMst_UserRole() {
		return (EAttribute) getUserRoleMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRoleMst_RefUserMstUserRole() {
		return (EReference) getUserRoleMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserMst() {
		if (userMstEClass == null) {
			userMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return userMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_UserId() {
		return (EAttribute) getUserMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_User() {
		return (EAttribute) getUserMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_UserPwd() {
		return (EAttribute) getUserMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_FirstName() {
		return (EAttribute) getUserMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_LastName() {
		return (EAttribute) getUserMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_Active() {
		return (EAttribute) getUserMst().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMst_Email() {
		return (EAttribute) getUserMst().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefParameterValueCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefDivisionId() {
		return (EReference) getUserMst().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefLobbyId() {
		return (EReference) getUserMst().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefUserRole() {
		return (EReference) getUserMst().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefZoneId() {
		return (EReference) getUserMst().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefKpiValueCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefParameterMstCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefParameterMstLastModifiedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainTypeMstCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainTypeMappingMstCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainTypeMappingMstLastModifiedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefSegmentMstCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefTrainSegmentMstCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefLinkMstCreatedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserMst_RefLinkMstLastModifiedBy() {
		return (EReference) getUserMst().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKpiMst() {
		if (kpiMstEClass == null) {
			kpiMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return kpiMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiMst_KpiId() {
		return (EAttribute) getKpiMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiMst_KpiDesc() {
		return (EAttribute) getKpiMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiMst_Uom() {
		return (EAttribute) getKpiMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiMst_RefKpiValueKpiId() {
		return (EReference) getKpiMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKpiValue() {
		if (kpiValueEClass == null) {
			kpiValueEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(10);
		}
		return kpiValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiValue_Value() {
		return (EAttribute) getKpiValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiValue_RefKpiId() {
		return (EReference) getKpiValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiValue_RefLinkId() {
		return (EReference) getKpiValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKpiValue_RefCreatedBy() {
		return (EReference) getKpiValue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterMst() {
		if (parameterMstEClass == null) {
			parameterMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(11);
		}
		return parameterMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_ParameterId() {
		return (EAttribute) getParameterMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_ParameterDesc() {
		return (EAttribute) getParameterMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_Uom() {
		return (EAttribute) getParameterMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_GlobalValue() {
		return (EAttribute) getParameterMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_MinValue() {
		return (EAttribute) getParameterMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterMst_MaxValue() {
		return (EAttribute) getParameterMst().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMst_RefParameterValueParameterId() {
		return (EReference) getParameterMst().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMst_RefCreatedBy() {
		return (EReference) getParameterMst().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterMst_RefLastModifiedBy() {
		return (EReference) getParameterMst().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainTypeMst() {
		if (trainTypeMstEClass == null) {
			trainTypeMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(12);
		}
		return trainTypeMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMst_TrainTypeCclmsId() {
		return (EAttribute) getTrainTypeMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMst_TrainTypeDesc() {
		return (EAttribute) getTrainTypeMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMst_RefCreatedBy() {
		return (EReference) getTrainTypeMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMst_RefTrainTypeMappingMstTrainTypeCclms() {
		return (EReference) getTrainTypeMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMst_RefLinkMstTrainTypeCd() {
		return (EReference) getTrainTypeMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainTypeMappingMst() {
		if (trainTypeMappingMstEClass == null) {
			trainTypeMappingMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(13);
		}
		return trainTypeMappingMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMappingMst_TrainType() {
		return (EAttribute) getTrainTypeMappingMst().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainTypeMappingMst_TrainTypeDesc() {
		return (EAttribute) getTrainTypeMappingMst().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefTrainMstTrainType() {
		return (EReference) getTrainTypeMappingMst().getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefCreatedBy() {
		return (EReference) getTrainTypeMappingMst().getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefLastModifiedBy() {
		return (EReference) getTrainTypeMappingMst().getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainTypeMappingMst_RefTrainTypeCclms() {
		return (EReference) getTrainTypeMappingMst().getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkDetail() {
		if (linkDetailEClass == null) {
			linkDetailEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(14);
		}
		return linkDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_CrewNo() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_Day() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SignOnTime() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_DepartureTime() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_ArrivalTime() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SignOffTime() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_OsAllowance() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_EarnedKm() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_PeriodicRestFlag() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SpareFlag() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_NightFlag() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_SortOrder() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_DutyDuration() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_RunningDuration() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_HqRest() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetail_OsRest() {
		return (EAttribute) getLinkDetail().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefFromStn() {
		return (EReference) getLinkDetail().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefLinkId() {
		return (EReference) getLinkDetail().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefToStn() {
		return (EReference) getLinkDetail().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkDetail_RefTrainId() {
		return (EReference) getLinkDetail().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentMst() {
		if (segmentMstEClass == null) {
			segmentMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(15);
		}
		return segmentMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentMst_SegmentId() {
		return (EAttribute) getSegmentMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefCreatedBy() {
		return (EReference) getSegmentMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefStartStationId() {
		return (EReference) getSegmentMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefStopStationId() {
		return (EReference) getSegmentMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentMst_RefTrainSegmentMstSegmentId() {
		return (EReference) getSegmentMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainSegmentMst() {
		if (trainSegmentMstEClass == null) {
			trainSegmentMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(16);
		}
		return trainSegmentMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_TrainSegId() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_CclmsTrainType() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_SignOnTime() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_StartTime() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_EndTime() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_SignOffTime() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_RunningDuration() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_ChronicDelayTime() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_DeptType() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_SpareFlag() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_Dayofservice() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentMst_ActualKm() {
		return (EAttribute) getTrainSegmentMst().getEStructuralFeatures().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefCreatedBy() {
		return (EReference) getTrainSegmentMst().getEStructuralFeatures().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefLocoChangeStn() {
		return (EReference) getTrainSegmentMst().getEStructuralFeatures().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefSegmentId() {
		return (EReference) getTrainSegmentMst().getEStructuralFeatures().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefAssignedLobby() {
		return (EReference) getTrainSegmentMst().getEStructuralFeatures().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefTractionType() {
		return (EReference) getTrainSegmentMst().getEStructuralFeatures().get(
				16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainSegmentMst_RefTrainId() {
		return (EReference) getTrainSegmentMst().getEStructuralFeatures().get(
				17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkMst() {
		if (linkMstEClass == null) {
			linkMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(17);
		}
		return linkMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LinkId() {
		return (EAttribute) getLinkMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_ScenarioId() {
		return (EAttribute) getLinkMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LinkName() {
		return (EAttribute) getLinkMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LobbyType() {
		return (EAttribute) getLinkMst().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkMst_LinkStatus() {
		return (EAttribute) getLinkMst().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefParameterValueLinkId() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefKpiValueLinkId() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefLinkDetailLinkId() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefCreatedBy() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefLobbyStnId() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefLastModifiedBy() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefTractionType() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefTrainFrequencyCd() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkMst_RefTrainTypeCd() {
		return (EReference) getLinkMst().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLobbyMst() {
		if (lobbyMstEClass == null) {
			lobbyMstEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(18);
		}
		return lobbyMstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMst_LobbyCode() {
		return (EAttribute) getLobbyMst().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMst_LobbyName() {
		return (EAttribute) getLobbyMst().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMst_LobbyId() {
		return (EAttribute) getLobbyMst().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainSegmentEngine() {
		if (trainSegmentEngineEClass == null) {
			trainSegmentEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(19);
		}
		return trainSegmentEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Trainid() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Legid() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Startloc() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Endloc() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Signon() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Start() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_End() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Signoff() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Duration() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Distance() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Nightflag() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Dayid() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainSegmentEngine_Spareflag() {
		return (EAttribute) getTrainSegmentEngine().getEStructuralFeatures()
				.get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentMstEngine() {
		if (segmentMstEngineEClass == null) {
			segmentMstEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(20);
		}
		return segmentMstEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentMstEngine_Fromstation() {
		return (EAttribute) getSegmentMstEngine().getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentMstEngine_Tostation() {
		return (EAttribute) getSegmentMstEngine().getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentMstEngine_Segmentid() {
		return (EAttribute) getSegmentMstEngine().getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeToMinEngine() {
		if (timeToMinEngineEClass == null) {
			timeToMinEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(21);
		}
		return timeToMinEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Trainid() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Segmentid() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Signontime() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Signominute() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Starttime() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Startminute() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Endtime() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Endminute() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Signofftime() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Signoffminute() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Dayid() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeToMinEngine_Spareflag() {
		return (EAttribute) getTimeToMinEngine().getEStructuralFeatures().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayMstEngine() {
		if (dayMstEngineEClass == null) {
			dayMstEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(22);
		}
		return dayMstEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayMstEngine_DayId() {
		return (EAttribute) getDayMstEngine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayMstEngine_DayDesc() {
		return (EAttribute) getDayMstEngine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKpiLinkEngine() {
		if (kpiLinkEngineEClass == null) {
			kpiLinkEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(23);
		}
		return kpiLinkEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiLinkEngine_KpiId() {
		return (EAttribute) getKpiLinkEngine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiLinkEngine_KpiDesc() {
		return (EAttribute) getKpiLinkEngine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiLinkEngine_KpiValue() {
		return (EAttribute) getKpiLinkEngine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKpiLinkEngine_Uom() {
		return (EAttribute) getKpiLinkEngine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkDetailEngine() {
		if (linkDetailEngineEClass == null) {
			linkDetailEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(24);
		}
		return linkDetailEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Dayname() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Seqid() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Trainno() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Fromstation() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Tostation() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Signontime() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Departuretime() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Arrivaltime() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Signofftime() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Dutydurtion() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Dutyminutes() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Distance() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Nib() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Sortorder() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Dayid() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkDetailEngine_Spareflag() {
		return (EAttribute) getLinkDetailEngine().getEStructuralFeatures().get(
				15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlinkEngine() {
		if (outlinkEngineEClass == null) {
			outlinkEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(25);
		}
		return outlinkEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Dayid() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Seqid() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Pairingid() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Dutyid() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Trainid() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Legid() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Startloc() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Endloc() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Dutysignon() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Starttime() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Endtime() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Dutysignoff() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Duration() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Nib() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Spareflag() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlinkEngine_Sortorder() {
		return (EAttribute) getOutlinkEngine().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLobbyMstEngine() {
		if (lobbyMstEngineEClass == null) {
			lobbyMstEngineEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(26);
		}
		return lobbyMstEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMstEngine_LobbyCode() {
		return (EAttribute) getLobbyMstEngine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMstEngine_LobbyName() {
		return (EAttribute) getLobbyMstEngine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLobbyMstEngine_LobbyId() {
		return (EAttribute) getLobbyMstEngine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCclmsCollector() {
		if (cclmsCollectorEClass == null) {
			cclmsCollectorEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(30);
		}
		return cclmsCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_ZoneMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_StationMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainFrequencyMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TractionMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_ParameterValue() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_DivisionMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_UserRoleMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_UserMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_KpiMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_KpiValue() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_ParameterMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainTypeMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainTypeMappingMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LinkDetail() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_SegmentMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainSegmentMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LinkMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LobbyMst() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TrainSegmentEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_SegmentMstEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_TimeToMinEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_DayMstEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_KpiLinkEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LinkDetailEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_OutlinkEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCclmsCollector_LobbyMstEngine() {
		return (EReference) getCclmsCollector().getEStructuralFeatures()
				.get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getilog_odm_dom_IloDomCollector() {
		if (ilog_odm_dom_IloDomCollectorEClass == null) {
			ilog_odm_dom_IloDomCollectorEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(31);
		}
		return ilog_odm_dom_IloDomCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		if (listEDataType == null) {
			listEDataType = (EDataType) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(27);
		}
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getjava_sql_Date() {
		if (java_sql_DateEDataType == null) {
			java_sql_DateEDataType = (EDataType) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(28);
		}
		return java_sql_DateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getjava_sql_Time() {
		if (java_sql_TimeEDataType == null) {
			java_sql_TimeEDataType = (EDataType) EPackage.Registry.INSTANCE
					.getEPackage(CclmsPackage.eNS_URI).getEClassifiers()
					.get(29);
		}
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
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: "
					+ packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents()
				.get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("cclms." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CclmsPackageImpl
