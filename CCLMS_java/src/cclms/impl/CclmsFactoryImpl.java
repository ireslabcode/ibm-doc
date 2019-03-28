/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.*;
import ilog.odm.dom.IloDomCollector;
import ilog.odm.dom.IloDomFactory;
import ilog.odm.dom.IloDomObject;
import ilog.odm.dom.impl.IloDomFactoryImpl;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CclmsFactoryImpl extends IloDomFactoryImpl implements
		CclmsFactory, IloDomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CclmsFactory init() {
		try {
			CclmsFactory theCclmsFactory = (CclmsFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.ibm.com/cclms/1.0.0");
			if (theCclmsFactory != null) {
				return theCclmsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CclmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclmsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CclmsPackage.STATION_MST:
			return (EObject) createStationMst();
		case CclmsPackage.TRAIN_FREQUENCY_MST:
			return (EObject) createTrainFrequencyMst();
		case CclmsPackage.TRACTION_MST:
			return (EObject) createTractionMst();
		case CclmsPackage.TRAIN_MST:
			return (EObject) createTrainMst();
		case CclmsPackage.PARAMETER_VALUE:
			return (EObject) createParameterValue();
		case CclmsPackage.KPI_MST:
			return (EObject) createKpiMst();
		case CclmsPackage.KPI_VALUE:
			return (EObject) createKpiValue();
		case CclmsPackage.PARAMETER_MST:
			return (EObject) createParameterMst();
		case CclmsPackage.TRAIN_TYPE_MST:
			return (EObject) createTrainTypeMst();
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST:
			return (EObject) createTrainTypeMappingMst();
		case CclmsPackage.LINK_DETAIL:
			return (EObject) createLinkDetail();
		case CclmsPackage.SEGMENT_MST:
			return (EObject) createSegmentMst();
		case CclmsPackage.TRAIN_SEGMENT_MST:
			return (EObject) createTrainSegmentMst();
		case CclmsPackage.LINK_MST:
			return (EObject) createLinkMst();
		case CclmsPackage.LOBBY_MST:
			return (EObject) createLobbyMst();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE:
			return (EObject) createTrainSegmentEngine();
		case CclmsPackage.SEGMENT_MST_ENGINE:
			return (EObject) createSegmentMstEngine();
		case CclmsPackage.TIME_TO_MIN_ENGINE:
			return (EObject) createTimeToMinEngine();
		case CclmsPackage.KPI_LINK_ENGINE:
			return (EObject) createKpiLinkEngine();
		case CclmsPackage.LINK_DETAIL_ENGINE:
			return (EObject) createLinkDetailEngine();
		case CclmsPackage.OUTLINK_ENGINE:
			return (EObject) createOutlinkEngine();
		case CclmsPackage.LOBBY_MST_ENGINE:
			return (EObject) createLobbyMstEngine();
		case CclmsPackage.USER_MST:
			return (EObject) createUserMst();
		case CclmsPackage.DAY_MST_ENGINE:
			return (EObject) createDayMstEngine();
		case CclmsPackage.CCLMS_COLLECTOR:
			return (EObject) createCclmsCollector();
		case CclmsPackage.ILOG_ODM_DOM_ILO_DOM_COLLECTOR:
			return (EObject) createilog_odm_dom_IloDomCollector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CclmsPackage.LIST:
			return createListFromString(eDataType, initialValue);
		case CclmsPackage.JAVA_SQL_TIME:
			return createjava_sql_TimeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CclmsPackage.LIST:
			return convertListToString(eDataType, instanceValue);
		case CclmsPackage.JAVA_SQL_TIME:
			return convertjava_sql_TimeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '"
					+ eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst createStationMst() {

		StationMstImpl stationMst = new StationMstImpl();
		return stationMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainFrequencyMst createTrainFrequencyMst() {

		TrainFrequencyMstImpl trainFrequencyMst = new TrainFrequencyMstImpl();
		return trainFrequencyMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractionMst createTractionMst() {

		TractionMstImpl tractionMst = new TractionMstImpl();
		return tractionMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainMst createTrainMst() {

		TrainMstImpl trainMst = new TrainMstImpl();
		return trainMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {

		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiMst createKpiMst() {

		KpiMstImpl kpiMst = new KpiMstImpl();
		return kpiMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiValue createKpiValue() {

		KpiValueImpl kpiValue = new KpiValueImpl();
		return kpiValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMst createParameterMst() {

		ParameterMstImpl parameterMst = new ParameterMstImpl();
		return parameterMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst createTrainTypeMst() {

		TrainTypeMstImpl trainTypeMst = new TrainTypeMstImpl();
		return trainTypeMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMappingMst createTrainTypeMappingMst() {

		TrainTypeMappingMstImpl trainTypeMappingMst = new TrainTypeMappingMstImpl();
		return trainTypeMappingMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDetail createLinkDetail() {

		LinkDetailImpl linkDetail = new LinkDetailImpl();
		return linkDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMst createSegmentMst() {

		SegmentMstImpl segmentMst = new SegmentMstImpl();
		return segmentMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentMst createTrainSegmentMst() {

		TrainSegmentMstImpl trainSegmentMst = new TrainSegmentMstImpl();
		return trainSegmentMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMst createLinkMst() {

		LinkMstImpl linkMst = new LinkMstImpl();
		return linkMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobbyMst createLobbyMst() {

		LobbyMstImpl lobbyMst = new LobbyMstImpl();
		return lobbyMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentEngine createTrainSegmentEngine() {

		TrainSegmentEngineImpl trainSegmentEngine = new TrainSegmentEngineImpl();
		return trainSegmentEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMstEngine createSegmentMstEngine() {

		SegmentMstEngineImpl segmentMstEngine = new SegmentMstEngineImpl();
		return segmentMstEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeToMinEngine createTimeToMinEngine() {

		TimeToMinEngineImpl timeToMinEngine = new TimeToMinEngineImpl();
		return timeToMinEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayMstEngine createDayMstEngine() {

		DayMstEngineImpl dayMstEngine = new DayMstEngineImpl();
		return dayMstEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiLinkEngine createKpiLinkEngine() {

		KpiLinkEngineImpl kpiLinkEngine = new KpiLinkEngineImpl();
		return kpiLinkEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDetailEngine createLinkDetailEngine() {

		LinkDetailEngineImpl linkDetailEngine = new LinkDetailEngineImpl();
		return linkDetailEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlinkEngine createOutlinkEngine() {

		OutlinkEngineImpl outlinkEngine = new OutlinkEngineImpl();
		return outlinkEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobbyMstEngine createLobbyMstEngine() {

		LobbyMstEngineImpl lobbyMstEngine = new LobbyMstEngineImpl();
		return lobbyMstEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst createUserMst() {

		UserMstImpl userMst = new UserMstImpl();
		return userMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclmsCollector createCclmsCollector() {

		CclmsCollectorImpl cclmsCollector = new CclmsCollectorImpl();
		return cclmsCollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IloDomCollector createilog_odm_dom_IloDomCollector() {

		throw new ilog.odm.dom.IloDomInstantiationException(
				"ilog_odm_dom_IloDomCollectorImpl");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createjava_sql_TimeFromString(EDataType eDataType,
			String initialValue) {
		return (Time) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertjava_sql_TimeToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclmsPackage getCclmsPackage() {
		return (CclmsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CclmsPackage getPackage() {
		return CclmsPackage.eINSTANCE;
	}

	/**
	 * Bridge the ODME DOM factory to the EMF factory
	 * @generated
	 */
	public final IloDomObject createObject(Class<? extends IloDomObject> entity) {
		EClassifier c = CclmsPackage.eINSTANCE.getEClassifier(entity
				.getSimpleName());
		if (c != null && c instanceof EClass)
			return (IloDomObject) create((EClass) c);
		return null;
	}

} //CclmsFactoryImpl
