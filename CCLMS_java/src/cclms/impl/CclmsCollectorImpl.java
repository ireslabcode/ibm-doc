/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.DayMstEngine;
import cclms.DivisionMst;
import cclms.KpiLinkEngine;
import cclms.KpiMst;
import cclms.KpiValue;
import cclms.LinkDetail;
import cclms.LinkDetailEngine;
import cclms.LinkMst;
import cclms.LobbyMst;
import cclms.LobbyMstEngine;
import cclms.OutlinkEngine;
import cclms.ParameterMst;
import cclms.ParameterValue;
import cclms.SegmentMst;
import cclms.SegmentMstEngine;
import cclms.StationMst;
import cclms.TimeToMinEngine;
import cclms.TractionMst;
import cclms.TrainFrequencyMst;
import cclms.TrainMst;
import cclms.TrainSegmentEngine;
import cclms.TrainSegmentMst;
import cclms.TrainTypeMappingMst;
import cclms.TrainTypeMst;
import cclms.UserMst;
import cclms.UserRoleMst;
import cclms.ZoneMst;

import ilog.odm.dom.impl.IloDomObjectImpl;

import ilog.odm.dom.impl.resource.IloDomObjectContainmentEList;
import ilog.odm.dom.impl.resource.IloDomObjectWithInverseEList;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getZoneMst <em>Zone Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getStationMst <em>Station Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTrainFrequencyMst <em>Train Frequency Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTractionMst <em>Traction Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTrainMst <em>Train Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getParameterValue <em>Parameter Value</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getDivisionMst <em>Division Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getUserRoleMst <em>User Role Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getUserMst <em>User Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getKpiMst <em>Kpi Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getKpiValue <em>Kpi Value</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getParameterMst <em>Parameter Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTrainTypeMst <em>Train Type Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTrainTypeMappingMst <em>Train Type Mapping Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getLinkDetail <em>Link Detail</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getSegmentMst <em>Segment Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTrainSegmentMst <em>Train Segment Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getLinkMst <em>Link Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getLobbyMst <em>Lobby Mst</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTrainSegmentEngine <em>Train Segment Engine</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getSegmentMstEngine <em>Segment Mst Engine</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getTimeToMinEngine <em>Time To Min Engine</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getDayMstEngine <em>Day Mst Engine</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getKpiLinkEngine <em>Kpi Link Engine</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getLinkDetailEngine <em>Link Detail Engine</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getOutlinkEngine <em>Outlink Engine</em>}</li>
 *   <li>{@link cclms.impl.CclmsCollectorImpl#getLobbyMstEngine <em>Lobby Mst Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CclmsCollectorImpl extends IloDomObjectImpl implements
		CclmsCollector {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The cached value of the '{@link #getZoneMst() <em>Zone Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoneMst()
	 * @generated
	 * @ordered
	 */
	protected EList<ZoneMst> zoneMst;

	/**
	 * The cached value of the '{@link #getStationMst() <em>Station Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationMst()
	 * @generated
	 * @ordered
	 */
	protected EList<StationMst> stationMst;

	/**
	 * The cached value of the '{@link #getTrainFrequencyMst() <em>Train Frequency Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainFrequencyMst()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainFrequencyMst> trainFrequencyMst;

	/**
	 * The cached value of the '{@link #getTractionMst() <em>Traction Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTractionMst()
	 * @generated
	 * @ordered
	 */
	protected EList<TractionMst> tractionMst;

	/**
	 * The cached value of the '{@link #getTrainMst() <em>Train Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainMst()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainMst> trainMst;

	/**
	 * The cached value of the '{@link #getParameterValue() <em>Parameter Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> parameterValue;

	/**
	 * The cached value of the '{@link #getDivisionMst() <em>Division Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivisionMst()
	 * @generated
	 * @ordered
	 */
	protected EList<DivisionMst> divisionMst;

	/**
	 * The cached value of the '{@link #getUserRoleMst() <em>User Role Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoleMst()
	 * @generated
	 * @ordered
	 */
	protected EList<UserRoleMst> userRoleMst;

	/**
	 * The cached value of the '{@link #getUserMst() <em>User Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserMst()
	 * @generated
	 * @ordered
	 */
	protected EList<UserMst> userMst;

	/**
	 * The cached value of the '{@link #getKpiMst() <em>Kpi Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiMst()
	 * @generated
	 * @ordered
	 */
	protected EList<KpiMst> kpiMst;

	/**
	 * The cached value of the '{@link #getKpiValue() <em>Kpi Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiValue()
	 * @generated
	 * @ordered
	 */
	protected EList<KpiValue> kpiValue;

	/**
	 * The cached value of the '{@link #getParameterMst() <em>Parameter Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterMst()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterMst> parameterMst;

	/**
	 * The cached value of the '{@link #getTrainTypeMst() <em>Train Type Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainTypeMst()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainTypeMst> trainTypeMst;

	/**
	 * The cached value of the '{@link #getTrainTypeMappingMst() <em>Train Type Mapping Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainTypeMappingMst()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainTypeMappingMst> trainTypeMappingMst;

	/**
	 * The cached value of the '{@link #getLinkDetail() <em>Link Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDetail()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkDetail> linkDetail;

	/**
	 * The cached value of the '{@link #getSegmentMst() <em>Segment Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentMst()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentMst> segmentMst;

	/**
	 * The cached value of the '{@link #getTrainSegmentMst() <em>Train Segment Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSegmentMst()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentMst> trainSegmentMst;

	/**
	 * The cached value of the '{@link #getLinkMst() <em>Link Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkMst()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMst> linkMst;

	/**
	 * The cached value of the '{@link #getLobbyMst() <em>Lobby Mst</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyMst()
	 * @generated
	 * @ordered
	 */
	protected EList<LobbyMst> lobbyMst;

	/**
	 * The cached value of the '{@link #getTrainSegmentEngine() <em>Train Segment Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSegmentEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentEngine> trainSegmentEngine;

	/**
	 * The cached value of the '{@link #getSegmentMstEngine() <em>Segment Mst Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentMstEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentMstEngine> segmentMstEngine;

	/**
	 * The cached value of the '{@link #getTimeToMinEngine() <em>Time To Min Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToMinEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeToMinEngine> timeToMinEngine;

	/**
	 * The cached value of the '{@link #getDayMstEngine() <em>Day Mst Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayMstEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<DayMstEngine> dayMstEngine;

	/**
	 * The cached value of the '{@link #getKpiLinkEngine() <em>Kpi Link Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiLinkEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<KpiLinkEngine> kpiLinkEngine;

	/**
	 * The cached value of the '{@link #getLinkDetailEngine() <em>Link Detail Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDetailEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkDetailEngine> linkDetailEngine;

	/**
	 * The cached value of the '{@link #getOutlinkEngine() <em>Outlink Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlinkEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<OutlinkEngine> outlinkEngine;

	/**
	 * The cached value of the '{@link #getLobbyMstEngine() <em>Lobby Mst Engine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyMstEngine()
	 * @generated
	 * @ordered
	 */
	protected EList<LobbyMstEngine> lobbyMstEngine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CclmsCollectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getCclmsCollector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ZoneMst> getZoneMst() {
		if (zoneMst == null) {
			zoneMst = new IloDomObjectContainmentEList<ZoneMst>(ZoneMst.class,
					this, CclmsPackage.CCLMS_COLLECTOR__ZONE_MST);
		}
		return zoneMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<StationMst> getStationMst() {
		if (stationMst == null) {
			stationMst = new IloDomObjectContainmentEList<StationMst>(
					StationMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__STATION_MST);
		}
		return stationMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainFrequencyMst> getTrainFrequencyMst() {
		if (trainFrequencyMst == null) {
			trainFrequencyMst = new IloDomObjectContainmentEList<TrainFrequencyMst>(
					TrainFrequencyMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST);
		}
		return trainFrequencyMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TractionMst> getTractionMst() {
		if (tractionMst == null) {
			tractionMst = new IloDomObjectContainmentEList<TractionMst>(
					TractionMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TRACTION_MST);
		}
		return tractionMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainMst> getTrainMst() {
		if (trainMst == null) {
			trainMst = new IloDomObjectContainmentEList<TrainMst>(
					TrainMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TRAIN_MST);
		}
		return trainMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterValue> getParameterValue() {
		if (parameterValue == null) {
			parameterValue = new IloDomObjectContainmentEList<ParameterValue>(
					ParameterValue.class, this,
					CclmsPackage.CCLMS_COLLECTOR__PARAMETER_VALUE);
		}
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DivisionMst> getDivisionMst() {
		if (divisionMst == null) {
			divisionMst = new IloDomObjectContainmentEList<DivisionMst>(
					DivisionMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__DIVISION_MST);
		}
		return divisionMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserRoleMst> getUserRoleMst() {
		if (userRoleMst == null) {
			userRoleMst = new IloDomObjectContainmentEList<UserRoleMst>(
					UserRoleMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__USER_ROLE_MST);
		}
		return userRoleMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserMst> getUserMst() {
		if (userMst == null) {
			userMst = new IloDomObjectContainmentEList<UserMst>(UserMst.class,
					this, CclmsPackage.CCLMS_COLLECTOR__USER_MST);
		}
		return userMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiMst> getKpiMst() {
		if (kpiMst == null) {
			kpiMst = new IloDomObjectContainmentEList<KpiMst>(KpiMst.class,
					this, CclmsPackage.CCLMS_COLLECTOR__KPI_MST);
		}
		return kpiMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiValue> getKpiValue() {
		if (kpiValue == null) {
			kpiValue = new IloDomObjectContainmentEList<KpiValue>(
					KpiValue.class, this,
					CclmsPackage.CCLMS_COLLECTOR__KPI_VALUE);
		}
		return kpiValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterMst> getParameterMst() {
		if (parameterMst == null) {
			parameterMst = new IloDomObjectContainmentEList<ParameterMst>(
					ParameterMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__PARAMETER_MST);
		}
		return parameterMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMst> getTrainTypeMst() {
		if (trainTypeMst == null) {
			trainTypeMst = new IloDomObjectContainmentEList<TrainTypeMst>(
					TrainTypeMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MST);
		}
		return trainTypeMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMappingMst> getTrainTypeMappingMst() {
		if (trainTypeMappingMst == null) {
			trainTypeMappingMst = new IloDomObjectContainmentEList<TrainTypeMappingMst>(
					TrainTypeMappingMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST);
		}
		return trainTypeMappingMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getLinkDetail() {
		if (linkDetail == null) {
			linkDetail = new IloDomObjectContainmentEList<LinkDetail>(
					LinkDetail.class, this,
					CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL);
		}
		return linkDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMst> getSegmentMst() {
		if (segmentMst == null) {
			segmentMst = new IloDomObjectContainmentEList<SegmentMst>(
					SegmentMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST);
		}
		return segmentMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getTrainSegmentMst() {
		if (trainSegmentMst == null) {
			trainSegmentMst = new IloDomObjectContainmentEList<TrainSegmentMst>(
					TrainSegmentMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_MST);
		}
		return trainSegmentMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getLinkMst() {
		if (linkMst == null) {
			linkMst = new IloDomObjectContainmentEList<LinkMst>(LinkMst.class,
					this, CclmsPackage.CCLMS_COLLECTOR__LINK_MST);
		}
		return linkMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LobbyMst> getLobbyMst() {
		if (lobbyMst == null) {
			lobbyMst = new IloDomObjectContainmentEList<LobbyMst>(
					LobbyMst.class, this,
					CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST);
		}
		return lobbyMst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentEngine> getTrainSegmentEngine() {
		if (trainSegmentEngine == null) {
			trainSegmentEngine = new IloDomObjectContainmentEList<TrainSegmentEngine>(
					TrainSegmentEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE);
		}
		return trainSegmentEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMstEngine> getSegmentMstEngine() {
		if (segmentMstEngine == null) {
			segmentMstEngine = new IloDomObjectContainmentEList<SegmentMstEngine>(
					SegmentMstEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST_ENGINE);
		}
		return segmentMstEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TimeToMinEngine> getTimeToMinEngine() {
		if (timeToMinEngine == null) {
			timeToMinEngine = new IloDomObjectContainmentEList<TimeToMinEngine>(
					TimeToMinEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE);
		}
		return timeToMinEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<DayMstEngine> getDayMstEngine() {
		if (dayMstEngine == null) {
			dayMstEngine = new IloDomObjectContainmentEList<DayMstEngine>(
					DayMstEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__DAY_MST_ENGINE);
		}
		return dayMstEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiLinkEngine> getKpiLinkEngine() {
		if (kpiLinkEngine == null) {
			kpiLinkEngine = new IloDomObjectContainmentEList<KpiLinkEngine>(
					KpiLinkEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__KPI_LINK_ENGINE);
		}
		return kpiLinkEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetailEngine> getLinkDetailEngine() {
		if (linkDetailEngine == null) {
			linkDetailEngine = new IloDomObjectContainmentEList<LinkDetailEngine>(
					LinkDetailEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL_ENGINE);
		}
		return linkDetailEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<OutlinkEngine> getOutlinkEngine() {
		if (outlinkEngine == null) {
			outlinkEngine = new IloDomObjectContainmentEList<OutlinkEngine>(
					OutlinkEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__OUTLINK_ENGINE);
		}
		return outlinkEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LobbyMstEngine> getLobbyMstEngine() {
		if (lobbyMstEngine == null) {
			lobbyMstEngine = new IloDomObjectContainmentEList<LobbyMstEngine>(
					LobbyMstEngine.class, this,
					CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST_ENGINE);
		}
		return lobbyMstEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneMst createZoneMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ZoneMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(ZoneMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneMst createZoneMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ZoneMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(ZoneMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneMst getFromZoneMst(int zoneId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ZoneMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(ZoneMst.class, new Object[] { zoneId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst createStationMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (StationMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(StationMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst createStationMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (StationMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(StationMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getFromStationMst(int stationId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (StationMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(StationMst.class,
							new Object[] { stationId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainFrequencyMst createTrainFrequencyMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainFrequencyMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TrainFrequencyMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainFrequencyMst createTrainFrequencyMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainFrequencyMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TrainFrequencyMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainFrequencyMst getFromTrainFrequencyMst(int trainFrequencyCode) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainFrequencyMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TrainFrequencyMst.class,
							new Object[] { trainFrequencyCode });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractionMst createTractionMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TractionMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TractionMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractionMst createTractionMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TractionMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TractionMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractionMst getFromTractionMst(int tractionType) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TractionMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TractionMst.class,
							new Object[] { tractionType });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainMst createTrainMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TrainMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainMst createTrainMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TrainMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainMst getFromTrainMst(int trainId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TrainMst.class, new Object[] { trainId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ParameterValue) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(ParameterValue.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ParameterValue) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(ParameterValue.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue getFromParameterValue(int parameterId, int linkId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ParameterValue) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(ParameterValue.class, new Object[] {
							parameterId, linkId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionMst createDivisionMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (DivisionMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(DivisionMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionMst createDivisionMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (DivisionMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(DivisionMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionMst getFromDivisionMst(int divisionId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (DivisionMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(DivisionMst.class,
							new Object[] { divisionId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRoleMst createUserRoleMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (UserRoleMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(UserRoleMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRoleMst createUserRoleMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (UserRoleMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(UserRoleMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRoleMst getFromUserRoleMst(int userRoleCd) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (UserRoleMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(UserRoleMst.class,
							new Object[] { userRoleCd });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst createUserMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (UserMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(UserMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst createUserMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (UserMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(UserMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst getFromUserMst(int userId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (UserMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(UserMst.class, new Object[] { userId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiMst createKpiMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(KpiMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiMst createKpiMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(KpiMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiMst getFromKpiMst(int kpiId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(KpiMst.class, new Object[] { kpiId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiValue createKpiValue() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiValue) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(KpiValue.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiValue createKpiValue(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiValue) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(KpiValue.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiValue getFromKpiValue(int kpiId, int linkId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiValue) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(KpiValue.class, new Object[] { kpiId,
							linkId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMst createParameterMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ParameterMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(ParameterMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMst createParameterMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ParameterMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(ParameterMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterMst getFromParameterMst(int parameterId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (ParameterMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(ParameterMst.class,
							new Object[] { parameterId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst createTrainTypeMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainTypeMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TrainTypeMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst createTrainTypeMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainTypeMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TrainTypeMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst getFromTrainTypeMst(int trainTypeCclmsId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainTypeMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TrainTypeMst.class,
							new Object[] { trainTypeCclmsId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMappingMst createTrainTypeMappingMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainTypeMappingMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TrainTypeMappingMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMappingMst createTrainTypeMappingMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainTypeMappingMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TrainTypeMappingMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMappingMst getFromTrainTypeMappingMst(String trainType) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainTypeMappingMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TrainTypeMappingMst.class,
							new Object[] { trainType });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDetail createLinkDetail() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkDetail) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(LinkDetail.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDetail createLinkDetail(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkDetail) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(LinkDetail.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMst createSegmentMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (SegmentMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(SegmentMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMst createSegmentMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (SegmentMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(SegmentMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMst getFromSegmentMst(int segmentId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (SegmentMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(SegmentMst.class,
							new Object[] { segmentId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentMst createTrainSegmentMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainSegmentMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TrainSegmentMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentMst createTrainSegmentMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainSegmentMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TrainSegmentMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentMst getFromTrainSegmentMst(int trainSegId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainSegmentMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TrainSegmentMst.class,
							new Object[] { trainSegId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMst createLinkMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(LinkMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMst createLinkMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(LinkMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMst getFromLinkMst(int linkId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(LinkMst.class, new Object[] { linkId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobbyMst createLobbyMst() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LobbyMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(LobbyMst.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobbyMst createLobbyMst(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LobbyMst) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(LobbyMst.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentEngine createTrainSegmentEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainSegmentEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TrainSegmentEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentEngine createTrainSegmentEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainSegmentEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TrainSegmentEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainSegmentEngine getFromTrainSegmentEngine(int trainid, int legid,
			int dayid, int spareflag) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TrainSegmentEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TrainSegmentEngine.class, new Object[] {
							trainid, legid, dayid, spareflag });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMstEngine createSegmentMstEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (SegmentMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(SegmentMstEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMstEngine createSegmentMstEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (SegmentMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(SegmentMstEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMstEngine getFromSegmentMstEngine(int segmentid) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (SegmentMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(SegmentMstEngine.class,
							new Object[] { segmentid });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeToMinEngine createTimeToMinEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TimeToMinEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(TimeToMinEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeToMinEngine createTimeToMinEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TimeToMinEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(TimeToMinEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeToMinEngine getFromTimeToMinEngine(int trainid, int segmentid,
			int dayid, int spareflag) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (TimeToMinEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(TimeToMinEngine.class, new Object[] {
							trainid, segmentid, dayid, spareflag });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayMstEngine createDayMstEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (DayMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(DayMstEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayMstEngine createDayMstEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (DayMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(DayMstEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiLinkEngine createKpiLinkEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiLinkEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(KpiLinkEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiLinkEngine createKpiLinkEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiLinkEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(KpiLinkEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpiLinkEngine getFromKpiLinkEngine(int kpiId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (KpiLinkEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(KpiLinkEngine.class, new Object[] { kpiId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDetailEngine createLinkDetailEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkDetailEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(LinkDetailEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDetailEngine createLinkDetailEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkDetailEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(LinkDetailEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkDetailEngine getFromLinkDetailEngine(String trainno,
			String fromstation, String tostation, int dayid, int spareflag) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LinkDetailEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(LinkDetailEngine.class, new Object[] {
							trainno, fromstation, tostation, dayid, spareflag });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlinkEngine createOutlinkEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (OutlinkEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(OutlinkEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlinkEngine createOutlinkEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (OutlinkEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(OutlinkEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutlinkEngine getFromOutlinkEngine(int dayid, int seqid,
			int pairingid, int dutyid, int trainid, int legid) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (OutlinkEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(OutlinkEngine.class, new Object[] { dayid,
							seqid, pairingid, dutyid, trainid, legid });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobbyMstEngine createLobbyMstEngine() {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LobbyMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObject(LobbyMstEngine.class);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobbyMstEngine createLobbyMstEngine(int index) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LobbyMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.createEObjectAt(LobbyMstEngine.class, index);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobbyMstEngine getFromLobbyMstEngine(int lobbyId) {
		if (eResource() != null
				&& eResource() instanceof ilog.odm.dom.impl.resource.IloDomResourceImpl) {
			return (LobbyMstEngine) ((ilog.odm.dom.impl.resource.IloDomResourceImpl) eResource())
					.getObjectByKey(LobbyMstEngine.class,
							new Object[] { lobbyId });
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CclmsPackage.CCLMS_COLLECTOR__ZONE_MST:
			return ((InternalEList<?>) getZoneMst())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__STATION_MST:
			return ((InternalEList<?>) getStationMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST:
			return ((InternalEList<?>) getTrainFrequencyMst()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TRACTION_MST:
			return ((InternalEList<?>) getTractionMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_MST:
			return ((InternalEList<?>) getTrainMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_VALUE:
			return ((InternalEList<?>) getParameterValue()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__DIVISION_MST:
			return ((InternalEList<?>) getDivisionMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__USER_ROLE_MST:
			return ((InternalEList<?>) getUserRoleMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__USER_MST:
			return ((InternalEList<?>) getUserMst())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__KPI_MST:
			return ((InternalEList<?>) getKpiMst()).basicRemove(otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__KPI_VALUE:
			return ((InternalEList<?>) getKpiValue()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_MST:
			return ((InternalEList<?>) getParameterMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MST:
			return ((InternalEList<?>) getTrainTypeMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST:
			return ((InternalEList<?>) getTrainTypeMappingMst()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL:
			return ((InternalEList<?>) getLinkDetail()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST:
			return ((InternalEList<?>) getSegmentMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_MST:
			return ((InternalEList<?>) getTrainSegmentMst()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__LINK_MST:
			return ((InternalEList<?>) getLinkMst())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST:
			return ((InternalEList<?>) getLobbyMst()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE:
			return ((InternalEList<?>) getTrainSegmentEngine()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST_ENGINE:
			return ((InternalEList<?>) getSegmentMstEngine()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE:
			return ((InternalEList<?>) getTimeToMinEngine()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__DAY_MST_ENGINE:
			return ((InternalEList<?>) getDayMstEngine()).basicRemove(otherEnd,
					msgs);
		case CclmsPackage.CCLMS_COLLECTOR__KPI_LINK_ENGINE:
			return ((InternalEList<?>) getKpiLinkEngine()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL_ENGINE:
			return ((InternalEList<?>) getLinkDetailEngine()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__OUTLINK_ENGINE:
			return ((InternalEList<?>) getOutlinkEngine()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST_ENGINE:
			return ((InternalEList<?>) getLobbyMstEngine()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CclmsPackage.CCLMS_COLLECTOR__ZONE_MST:
			return getZoneMst();
		case CclmsPackage.CCLMS_COLLECTOR__STATION_MST:
			return getStationMst();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST:
			return getTrainFrequencyMst();
		case CclmsPackage.CCLMS_COLLECTOR__TRACTION_MST:
			return getTractionMst();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_MST:
			return getTrainMst();
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_VALUE:
			return getParameterValue();
		case CclmsPackage.CCLMS_COLLECTOR__DIVISION_MST:
			return getDivisionMst();
		case CclmsPackage.CCLMS_COLLECTOR__USER_ROLE_MST:
			return getUserRoleMst();
		case CclmsPackage.CCLMS_COLLECTOR__USER_MST:
			return getUserMst();
		case CclmsPackage.CCLMS_COLLECTOR__KPI_MST:
			return getKpiMst();
		case CclmsPackage.CCLMS_COLLECTOR__KPI_VALUE:
			return getKpiValue();
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_MST:
			return getParameterMst();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MST:
			return getTrainTypeMst();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST:
			return getTrainTypeMappingMst();
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL:
			return getLinkDetail();
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST:
			return getSegmentMst();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_MST:
			return getTrainSegmentMst();
		case CclmsPackage.CCLMS_COLLECTOR__LINK_MST:
			return getLinkMst();
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST:
			return getLobbyMst();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE:
			return getTrainSegmentEngine();
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST_ENGINE:
			return getSegmentMstEngine();
		case CclmsPackage.CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE:
			return getTimeToMinEngine();
		case CclmsPackage.CCLMS_COLLECTOR__DAY_MST_ENGINE:
			return getDayMstEngine();
		case CclmsPackage.CCLMS_COLLECTOR__KPI_LINK_ENGINE:
			return getKpiLinkEngine();
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL_ENGINE:
			return getLinkDetailEngine();
		case CclmsPackage.CCLMS_COLLECTOR__OUTLINK_ENGINE:
			return getOutlinkEngine();
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST_ENGINE:
			return getLobbyMstEngine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CclmsPackage.CCLMS_COLLECTOR__ZONE_MST:
			getZoneMst().clear();
			getZoneMst().addAll((Collection<? extends ZoneMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__STATION_MST:
			getStationMst().clear();
			getStationMst().addAll((Collection<? extends StationMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST:
			getTrainFrequencyMst().clear();
			getTrainFrequencyMst().addAll(
					(Collection<? extends TrainFrequencyMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRACTION_MST:
			getTractionMst().clear();
			getTractionMst().addAll(
					(Collection<? extends TractionMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_MST:
			getTrainMst().clear();
			getTrainMst().addAll((Collection<? extends TrainMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_VALUE:
			getParameterValue().clear();
			getParameterValue().addAll(
					(Collection<? extends ParameterValue>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__DIVISION_MST:
			getDivisionMst().clear();
			getDivisionMst().addAll(
					(Collection<? extends DivisionMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__USER_ROLE_MST:
			getUserRoleMst().clear();
			getUserRoleMst().addAll(
					(Collection<? extends UserRoleMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__USER_MST:
			getUserMst().clear();
			getUserMst().addAll((Collection<? extends UserMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__KPI_MST:
			getKpiMst().clear();
			getKpiMst().addAll((Collection<? extends KpiMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__KPI_VALUE:
			getKpiValue().clear();
			getKpiValue().addAll((Collection<? extends KpiValue>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_MST:
			getParameterMst().clear();
			getParameterMst().addAll(
					(Collection<? extends ParameterMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MST:
			getTrainTypeMst().clear();
			getTrainTypeMst().addAll(
					(Collection<? extends TrainTypeMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST:
			getTrainTypeMappingMst().clear();
			getTrainTypeMappingMst().addAll(
					(Collection<? extends TrainTypeMappingMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL:
			getLinkDetail().clear();
			getLinkDetail().addAll((Collection<? extends LinkDetail>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST:
			getSegmentMst().clear();
			getSegmentMst().addAll((Collection<? extends SegmentMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_MST:
			getTrainSegmentMst().clear();
			getTrainSegmentMst().addAll(
					(Collection<? extends TrainSegmentMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LINK_MST:
			getLinkMst().clear();
			getLinkMst().addAll((Collection<? extends LinkMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST:
			getLobbyMst().clear();
			getLobbyMst().addAll((Collection<? extends LobbyMst>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE:
			getTrainSegmentEngine().clear();
			getTrainSegmentEngine().addAll(
					(Collection<? extends TrainSegmentEngine>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST_ENGINE:
			getSegmentMstEngine().clear();
			getSegmentMstEngine().addAll(
					(Collection<? extends SegmentMstEngine>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE:
			getTimeToMinEngine().clear();
			getTimeToMinEngine().addAll(
					(Collection<? extends TimeToMinEngine>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__DAY_MST_ENGINE:
			getDayMstEngine().clear();
			getDayMstEngine().addAll(
					(Collection<? extends DayMstEngine>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__KPI_LINK_ENGINE:
			getKpiLinkEngine().clear();
			getKpiLinkEngine().addAll(
					(Collection<? extends KpiLinkEngine>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL_ENGINE:
			getLinkDetailEngine().clear();
			getLinkDetailEngine().addAll(
					(Collection<? extends LinkDetailEngine>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__OUTLINK_ENGINE:
			getOutlinkEngine().clear();
			getOutlinkEngine().addAll(
					(Collection<? extends OutlinkEngine>) newValue);
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST_ENGINE:
			getLobbyMstEngine().clear();
			getLobbyMstEngine().addAll(
					(Collection<? extends LobbyMstEngine>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CclmsPackage.CCLMS_COLLECTOR__ZONE_MST:
			getZoneMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__STATION_MST:
			getStationMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST:
			getTrainFrequencyMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRACTION_MST:
			getTractionMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_MST:
			getTrainMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_VALUE:
			getParameterValue().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__DIVISION_MST:
			getDivisionMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__USER_ROLE_MST:
			getUserRoleMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__USER_MST:
			getUserMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__KPI_MST:
			getKpiMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__KPI_VALUE:
			getKpiValue().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_MST:
			getParameterMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MST:
			getTrainTypeMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST:
			getTrainTypeMappingMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL:
			getLinkDetail().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST:
			getSegmentMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_MST:
			getTrainSegmentMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LINK_MST:
			getLinkMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST:
			getLobbyMst().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE:
			getTrainSegmentEngine().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST_ENGINE:
			getSegmentMstEngine().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE:
			getTimeToMinEngine().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__DAY_MST_ENGINE:
			getDayMstEngine().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__KPI_LINK_ENGINE:
			getKpiLinkEngine().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL_ENGINE:
			getLinkDetailEngine().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__OUTLINK_ENGINE:
			getOutlinkEngine().clear();
			return;
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST_ENGINE:
			getLobbyMstEngine().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CclmsPackage.CCLMS_COLLECTOR__ZONE_MST:
			return zoneMst != null && !zoneMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__STATION_MST:
			return stationMst != null && !stationMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_FREQUENCY_MST:
			return trainFrequencyMst != null && !trainFrequencyMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TRACTION_MST:
			return tractionMst != null && !tractionMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_MST:
			return trainMst != null && !trainMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_VALUE:
			return parameterValue != null && !parameterValue.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__DIVISION_MST:
			return divisionMst != null && !divisionMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__USER_ROLE_MST:
			return userRoleMst != null && !userRoleMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__USER_MST:
			return userMst != null && !userMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__KPI_MST:
			return kpiMst != null && !kpiMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__KPI_VALUE:
			return kpiValue != null && !kpiValue.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__PARAMETER_MST:
			return parameterMst != null && !parameterMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MST:
			return trainTypeMst != null && !trainTypeMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_TYPE_MAPPING_MST:
			return trainTypeMappingMst != null
					&& !trainTypeMappingMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL:
			return linkDetail != null && !linkDetail.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST:
			return segmentMst != null && !segmentMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_MST:
			return trainSegmentMst != null && !trainSegmentMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__LINK_MST:
			return linkMst != null && !linkMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST:
			return lobbyMst != null && !lobbyMst.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TRAIN_SEGMENT_ENGINE:
			return trainSegmentEngine != null && !trainSegmentEngine.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__SEGMENT_MST_ENGINE:
			return segmentMstEngine != null && !segmentMstEngine.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__TIME_TO_MIN_ENGINE:
			return timeToMinEngine != null && !timeToMinEngine.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__DAY_MST_ENGINE:
			return dayMstEngine != null && !dayMstEngine.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__KPI_LINK_ENGINE:
			return kpiLinkEngine != null && !kpiLinkEngine.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__LINK_DETAIL_ENGINE:
			return linkDetailEngine != null && !linkDetailEngine.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__OUTLINK_ENGINE:
			return outlinkEngine != null && !outlinkEngine.isEmpty();
		case CclmsPackage.CCLMS_COLLECTOR__LOBBY_MST_ENGINE:
			return lobbyMstEngine != null && !lobbyMstEngine.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CclmsCollectorImpl
