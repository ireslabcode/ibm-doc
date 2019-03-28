/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.KpiValue;
import cclms.LinkDetail;
import cclms.LinkMst;
import cclms.ParameterValue;
import cclms.StationMst;
import cclms.TractionMst;
import cclms.TrainFrequencyMst;
import cclms.TrainTypeMst;
import cclms.UserMst;

import ilog.odm.dom.impl.IloDomObjectImpl;

import ilog.odm.dom.impl.resource.IloDomObjectContainmentEList;
import ilog.odm.dom.impl.resource.IloDomObjectWithInverseEList;

import java.util.Collection;
import java.util.Date;
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
 *   <li>{@link cclms.impl.LinkMstImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getScenarioId <em>Scenario Id</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getLobbyType <em>Lobby Type</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getLinkStatus <em>Link Status</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefParameterValueLinkId <em>Ref Parameter Value Link Id</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefKpiValueLinkId <em>Ref Kpi Value Link Id</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefLinkDetailLinkId <em>Ref Link Detail Link Id</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefCreatedBy <em>Ref Created By</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefLobbyStnId <em>Ref Lobby Stn Id</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefLastModifiedBy <em>Ref Last Modified By</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefTractionType <em>Ref Traction Type</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefTrainFrequencyCd <em>Ref Train Frequency Cd</em>}</li>
 *   <li>{@link cclms.impl.LinkMstImpl#getRefTrainTypeCd <em>Ref Train Type Cd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkMstImpl extends IloDomObjectImpl implements LinkMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getLinkId() <em>Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final int LINK_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected int linkId = LINK_ID_EDEFAULT;

	/**
	 * The flag representing whether the Link Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int LINK_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getScenarioId() <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioId()
	 * @generated
	 * @ordered
	 */
	protected static final int SCENARIO_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScenarioId() <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioId()
	 * @generated
	 * @ordered
	 */
	protected int scenarioId = SCENARIO_ID_EDEFAULT;

	/**
	 * The flag representing whether the Scenario Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SCENARIO_ID_ESETFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected String linkName = LINK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLobbyType() <em>Lobby Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyType()
	 * @generated
	 * @ordered
	 */
	protected static final String LOBBY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLobbyType() <em>Lobby Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyType()
	 * @generated
	 * @ordered
	 */
	protected String lobbyType = LOBBY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkStatus() <em>Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkStatus() <em>Link Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkStatus()
	 * @generated
	 * @ordered
	 */
	protected String linkStatus = LINK_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefParameterValueLinkId() <em>Ref Parameter Value Link Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefParameterValueLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> refParameterValueLinkId;

	/**
	 * The cached value of the '{@link #getRefKpiValueLinkId() <em>Ref Kpi Value Link Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefKpiValueLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<KpiValue> refKpiValueLinkId;

	/**
	 * The cached value of the '{@link #getRefLinkDetailLinkId() <em>Ref Link Detail Link Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkDetailLinkId()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkDetail> refLinkDetailLinkId;

	/**
	 * The cached value of the '{@link #getRefCreatedBy() <em>Ref Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected UserMst refCreatedBy;

	/**
	 * The cached value of the '{@link #getRefLobbyStnId() <em>Ref Lobby Stn Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLobbyStnId()
	 * @generated
	 * @ordered
	 */
	protected StationMst refLobbyStnId;

	/**
	 * The cached value of the '{@link #getRefLastModifiedBy() <em>Ref Last Modified By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLastModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected UserMst refLastModifiedBy;

	/**
	 * The cached value of the '{@link #getRefTractionType() <em>Ref Traction Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTractionType()
	 * @generated
	 * @ordered
	 */
	protected TractionMst refTractionType;

	/**
	 * The cached value of the '{@link #getRefTrainFrequencyCd() <em>Ref Train Frequency Cd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainFrequencyCd()
	 * @generated
	 * @ordered
	 */
	protected TrainFrequencyMst refTrainFrequencyCd;

	/**
	 * The cached value of the '{@link #getRefTrainTypeCd() <em>Ref Train Type Cd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainTypeCd()
	 * @generated
	 * @ordered
	 */
	protected TrainTypeMst refTrainTypeCd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getLinkMst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(int newLinkId) {
		int oldLinkId = linkId;
		linkId = newLinkId;
		boolean oldLinkIdESet = (_booleanFlags & LINK_ID_ESETFLAG) != 0;
		_booleanFlags |= LINK_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__LINK_ID, oldLinkId,
								linkId, !oldLinkIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__LINK_ID, oldLinkId, linkId,
						!oldLinkIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinkId() {
		int oldLinkId = linkId;
		boolean oldLinkIdESet = (_booleanFlags & LINK_ID_ESETFLAG) != 0;
		linkId = LINK_ID_EDEFAULT;
		_booleanFlags &= ~LINK_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.LINK_MST__LINK_ID, oldLinkId,
								LINK_ID_EDEFAULT, oldLinkIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_MST__LINK_ID, oldLinkId,
						LINK_ID_EDEFAULT, oldLinkIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinkId() {
		return (_booleanFlags & LINK_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScenarioId() {
		return scenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioId(int newScenarioId) {
		int oldScenarioId = scenarioId;
		scenarioId = newScenarioId;
		boolean oldScenarioIdESet = (_booleanFlags & SCENARIO_ID_ESETFLAG) != 0;
		_booleanFlags |= SCENARIO_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__SCENARIO_ID,
								oldScenarioId, scenarioId, !oldScenarioIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__SCENARIO_ID, oldScenarioId,
						scenarioId, !oldScenarioIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScenarioId() {
		int oldScenarioId = scenarioId;
		boolean oldScenarioIdESet = (_booleanFlags & SCENARIO_ID_ESETFLAG) != 0;
		scenarioId = SCENARIO_ID_EDEFAULT;
		_booleanFlags &= ~SCENARIO_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.LINK_MST__SCENARIO_ID,
								oldScenarioId, SCENARIO_ID_EDEFAULT,
								oldScenarioIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_MST__SCENARIO_ID, oldScenarioId,
						SCENARIO_ID_EDEFAULT, oldScenarioIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScenarioId() {
		return (_booleanFlags & SCENARIO_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkName() {
		return linkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkName(String newLinkName) {
		String oldLinkName = linkName;
		linkName = newLinkName;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__LINK_NAME, oldLinkName,
								linkName);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__LINK_NAME, oldLinkName, linkName));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLobbyType() {
		return lobbyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLobbyType(String newLobbyType) {
		String oldLobbyType = lobbyType;
		lobbyType = newLobbyType;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__LOBBY_TYPE,
								oldLobbyType, lobbyType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__LOBBY_TYPE, oldLobbyType,
						lobbyType));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkStatus() {
		return linkStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkStatus(String newLinkStatus) {
		String oldLinkStatus = linkStatus;
		linkStatus = newLinkStatus;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__LINK_STATUS,
								oldLinkStatus, linkStatus);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__LINK_STATUS, oldLinkStatus,
						linkStatus));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterValue> getRefParameterValueLinkId() {
		if (refParameterValueLinkId == null) {
			refParameterValueLinkId = new IloDomObjectWithInverseEList<ParameterValue>(
					ParameterValue.class, this,
					CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID,
					CclmsPackage.PARAMETER_VALUE__REF_LINK_ID);
		}
		return refParameterValueLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiValue> getRefKpiValueLinkId() {
		if (refKpiValueLinkId == null) {
			refKpiValueLinkId = new IloDomObjectWithInverseEList<KpiValue>(
					KpiValue.class, this,
					CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID,
					CclmsPackage.KPI_VALUE__REF_LINK_ID);
		}
		return refKpiValueLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getRefLinkDetailLinkId() {
		if (refLinkDetailLinkId == null) {
			refLinkDetailLinkId = new IloDomObjectWithInverseEList<LinkDetail>(
					LinkDetail.class, this,
					CclmsPackage.LINK_MST__REF_LINK_DETAIL_LINK_ID,
					CclmsPackage.LINK_DETAIL__REF_LINK_ID);
		}
		return refLinkDetailLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst getRefCreatedBy() {
		return refCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefCreatedBy(UserMst newRefCreatedBy,
			NotificationChain msgs) {
		UserMst oldRefCreatedBy = refCreatedBy;
		refCreatedBy = newRefCreatedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.LINK_MST__REF_CREATED_BY,
								oldRefCreatedBy, newRefCreatedBy);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_CREATED_BY, oldRefCreatedBy,
						newRefCreatedBy);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefCreatedBy(UserMst newRefCreatedBy) {
		if (newRefCreatedBy != refCreatedBy) {
			NotificationChain msgs = null;
			if (refCreatedBy != null)
				msgs = ((InternalEObject) refCreatedBy).eInverseRemove(this,
						CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY,
						UserMst.class, msgs);
			if (newRefCreatedBy != null)
				msgs = ((InternalEObject) newRefCreatedBy).eInverseAdd(this,
						CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY,
						UserMst.class, msgs);
			msgs = basicSetRefCreatedBy(newRefCreatedBy, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__REF_CREATED_BY,
								newRefCreatedBy, newRefCreatedBy);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_CREATED_BY, newRefCreatedBy,
						newRefCreatedBy));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefLobbyStnId() {
		return refLobbyStnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLobbyStnId(StationMst newRefLobbyStnId,
			NotificationChain msgs) {
		StationMst oldRefLobbyStnId = refLobbyStnId;
		refLobbyStnId = newRefLobbyStnId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.LINK_MST__REF_LOBBY_STN_ID,
								oldRefLobbyStnId, newRefLobbyStnId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_LOBBY_STN_ID,
						oldRefLobbyStnId, newRefLobbyStnId);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefLobbyStnId(StationMst newRefLobbyStnId) {
		if (newRefLobbyStnId != refLobbyStnId) {
			NotificationChain msgs = null;
			if (refLobbyStnId != null)
				msgs = ((InternalEObject) refLobbyStnId).eInverseRemove(this,
						CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID,
						StationMst.class, msgs);
			if (newRefLobbyStnId != null)
				msgs = ((InternalEObject) newRefLobbyStnId).eInverseAdd(this,
						CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID,
						StationMst.class, msgs);
			msgs = basicSetRefLobbyStnId(newRefLobbyStnId, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__REF_LOBBY_STN_ID,
								newRefLobbyStnId, newRefLobbyStnId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_LOBBY_STN_ID,
						newRefLobbyStnId, newRefLobbyStnId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst getRefLastModifiedBy() {
		return refLastModifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLastModifiedBy(
			UserMst newRefLastModifiedBy, NotificationChain msgs) {
		UserMst oldRefLastModifiedBy = refLastModifiedBy;
		refLastModifiedBy = newRefLastModifiedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY,
								oldRefLastModifiedBy, newRefLastModifiedBy);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY,
						oldRefLastModifiedBy, newRefLastModifiedBy);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefLastModifiedBy(UserMst newRefLastModifiedBy) {
		if (newRefLastModifiedBy != refLastModifiedBy) {
			NotificationChain msgs = null;
			if (refLastModifiedBy != null)
				msgs = ((InternalEObject) refLastModifiedBy).eInverseRemove(
						this,
						CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY,
						UserMst.class, msgs);
			if (newRefLastModifiedBy != null)
				msgs = ((InternalEObject) newRefLastModifiedBy).eInverseAdd(
						this,
						CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY,
						UserMst.class, msgs);
			msgs = basicSetRefLastModifiedBy(newRefLastModifiedBy, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY,
								newRefLastModifiedBy, newRefLastModifiedBy);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY,
						newRefLastModifiedBy, newRefLastModifiedBy));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractionMst getRefTractionType() {
		return refTractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTractionType(
			TractionMst newRefTractionType, NotificationChain msgs) {
		TractionMst oldRefTractionType = refTractionType;
		refTractionType = newRefTractionType;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.LINK_MST__REF_TRACTION_TYPE,
								oldRefTractionType, newRefTractionType);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_TRACTION_TYPE,
						oldRefTractionType, newRefTractionType);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTractionType(TractionMst newRefTractionType) {
		if (newRefTractionType != refTractionType) {
			NotificationChain msgs = null;
			if (refTractionType != null)
				msgs = ((InternalEObject) refTractionType).eInverseRemove(this,
						CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE,
						TractionMst.class, msgs);
			if (newRefTractionType != null)
				msgs = ((InternalEObject) newRefTractionType).eInverseAdd(this,
						CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE,
						TractionMst.class, msgs);
			msgs = basicSetRefTractionType(newRefTractionType, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__REF_TRACTION_TYPE,
								newRefTractionType, newRefTractionType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_TRACTION_TYPE,
						newRefTractionType, newRefTractionType));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainFrequencyMst getRefTrainFrequencyCd() {
		return refTrainFrequencyCd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTrainFrequencyCd(
			TrainFrequencyMst newRefTrainFrequencyCd, NotificationChain msgs) {
		TrainFrequencyMst oldRefTrainFrequencyCd = refTrainFrequencyCd;
		refTrainFrequencyCd = newRefTrainFrequencyCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD,
								oldRefTrainFrequencyCd, newRefTrainFrequencyCd);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD,
						oldRefTrainFrequencyCd, newRefTrainFrequencyCd);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTrainFrequencyCd(TrainFrequencyMst newRefTrainFrequencyCd) {
		if (newRefTrainFrequencyCd != refTrainFrequencyCd) {
			NotificationChain msgs = null;
			if (refTrainFrequencyCd != null)
				msgs = ((InternalEObject) refTrainFrequencyCd)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD,
								TrainFrequencyMst.class, msgs);
			if (newRefTrainFrequencyCd != null)
				msgs = ((InternalEObject) newRefTrainFrequencyCd)
						.eInverseAdd(
								this,
								CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD,
								TrainFrequencyMst.class, msgs);
			msgs = basicSetRefTrainFrequencyCd(newRefTrainFrequencyCd, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD,
								newRefTrainFrequencyCd, newRefTrainFrequencyCd);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD,
						newRefTrainFrequencyCd, newRefTrainFrequencyCd));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst getRefTrainTypeCd() {
		return refTrainTypeCd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTrainTypeCd(
			TrainTypeMst newRefTrainTypeCd, NotificationChain msgs) {
		TrainTypeMst oldRefTrainTypeCd = refTrainTypeCd;
		refTrainTypeCd = newRefTrainTypeCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD,
								oldRefTrainTypeCd, newRefTrainTypeCd);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD,
						oldRefTrainTypeCd, newRefTrainTypeCd);
			}
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefTrainTypeCd(TrainTypeMst newRefTrainTypeCd) {
		if (newRefTrainTypeCd != refTrainTypeCd) {
			NotificationChain msgs = null;
			if (refTrainTypeCd != null)
				msgs = ((InternalEObject) refTrainTypeCd)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD,
								TrainTypeMst.class, msgs);
			if (newRefTrainTypeCd != null)
				msgs = ((InternalEObject) newRefTrainTypeCd)
						.eInverseAdd(
								this,
								CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD,
								TrainTypeMst.class, msgs);
			msgs = basicSetRefTrainTypeCd(newRefTrainTypeCd, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD,
								newRefTrainTypeCd, newRefTrainTypeCd);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD,
						newRefTrainTypeCd, newRefTrainTypeCd));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterValue> getParameterValueLinkId() {
		return getRefParameterValueLinkId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiValue> getKpiValueLinkId() {
		return getRefKpiValueLinkId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getLinkDetailLinkId() {
		return getRefLinkDetailLinkId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst getCreatedBy() {
		UserMst obj = getRefCreatedBy();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(UserMst obj) {
		setRefCreatedBy(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getLobbyStnId() {
		StationMst obj = getRefLobbyStnId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLobbyStnId(StationMst obj) {
		setRefLobbyStnId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMst getLastModifiedBy() {
		UserMst obj = getRefLastModifiedBy();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedBy(UserMst obj) {
		setRefLastModifiedBy(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TractionMst getTractionType() {
		TractionMst obj = getRefTractionType();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTractionType(TractionMst obj) {
		setRefTractionType(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainFrequencyMst getTrainFrequencyCd() {
		TrainFrequencyMst obj = getRefTrainFrequencyCd();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainFrequencyCd(TrainFrequencyMst obj) {
		setRefTrainFrequencyCd(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst getTrainTypeCd() {
		TrainTypeMst obj = getRefTrainTypeCd();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainTypeCd(TrainTypeMst obj) {
		setRefTrainTypeCd(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclmsCollector getCollector() {
		return (CclmsCollector) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefParameterValueLinkId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefKpiValueLinkId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_LINK_DETAIL_LINK_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkDetailLinkId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_CREATED_BY:
			if (refCreatedBy != null)
				msgs = ((InternalEObject) refCreatedBy).eInverseRemove(this,
						CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY,
						UserMst.class, msgs);
			return basicSetRefCreatedBy((UserMst) otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_LOBBY_STN_ID:
			if (refLobbyStnId != null)
				msgs = ((InternalEObject) refLobbyStnId).eInverseRemove(this,
						CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID,
						StationMst.class, msgs);
			return basicSetRefLobbyStnId((StationMst) otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY:
			if (refLastModifiedBy != null)
				msgs = ((InternalEObject) refLastModifiedBy).eInverseRemove(
						this,
						CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY,
						UserMst.class, msgs);
			return basicSetRefLastModifiedBy((UserMst) otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_TRACTION_TYPE:
			if (refTractionType != null)
				msgs = ((InternalEObject) refTractionType).eInverseRemove(this,
						CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE,
						TractionMst.class, msgs);
			return basicSetRefTractionType((TractionMst) otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD:
			if (refTrainFrequencyCd != null)
				msgs = ((InternalEObject) refTrainFrequencyCd)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD,
								TrainFrequencyMst.class, msgs);
			return basicSetRefTrainFrequencyCd((TrainFrequencyMst) otherEnd,
					msgs);
		case CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD:
			if (refTrainTypeCd != null)
				msgs = ((InternalEObject) refTrainTypeCd)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD,
								TrainTypeMst.class, msgs);
			return basicSetRefTrainTypeCd((TrainTypeMst) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID:
			return ((InternalEList<?>) getRefParameterValueLinkId())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID:
			return ((InternalEList<?>) getRefKpiValueLinkId()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_LINK_DETAIL_LINK_ID:
			return ((InternalEList<?>) getRefLinkDetailLinkId()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.LINK_MST__REF_CREATED_BY:
			return basicSetRefCreatedBy(null, msgs);
		case CclmsPackage.LINK_MST__REF_LOBBY_STN_ID:
			return basicSetRefLobbyStnId(null, msgs);
		case CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY:
			return basicSetRefLastModifiedBy(null, msgs);
		case CclmsPackage.LINK_MST__REF_TRACTION_TYPE:
			return basicSetRefTractionType(null, msgs);
		case CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD:
			return basicSetRefTrainFrequencyCd(null, msgs);
		case CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD:
			return basicSetRefTrainTypeCd(null, msgs);
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
		case CclmsPackage.LINK_MST__LINK_ID:
			return getLinkId();
		case CclmsPackage.LINK_MST__SCENARIO_ID:
			return getScenarioId();
		case CclmsPackage.LINK_MST__LINK_NAME:
			return getLinkName();
		case CclmsPackage.LINK_MST__LOBBY_TYPE:
			return getLobbyType();
		case CclmsPackage.LINK_MST__LINK_STATUS:
			return getLinkStatus();
		case CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID:
			return getRefParameterValueLinkId();
		case CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID:
			return getRefKpiValueLinkId();
		case CclmsPackage.LINK_MST__REF_LINK_DETAIL_LINK_ID:
			return getRefLinkDetailLinkId();
		case CclmsPackage.LINK_MST__REF_CREATED_BY:
			return getRefCreatedBy();
		case CclmsPackage.LINK_MST__REF_LOBBY_STN_ID:
			return getRefLobbyStnId();
		case CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY:
			return getRefLastModifiedBy();
		case CclmsPackage.LINK_MST__REF_TRACTION_TYPE:
			return getRefTractionType();
		case CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD:
			return getRefTrainFrequencyCd();
		case CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD:
			return getRefTrainTypeCd();
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
		case CclmsPackage.LINK_MST__LINK_ID:
			setLinkId((Integer) newValue);
			return;
		case CclmsPackage.LINK_MST__SCENARIO_ID:
			setScenarioId((Integer) newValue);
			return;
		case CclmsPackage.LINK_MST__LINK_NAME:
			setLinkName((String) newValue);
			return;
		case CclmsPackage.LINK_MST__LOBBY_TYPE:
			setLobbyType((String) newValue);
			return;
		case CclmsPackage.LINK_MST__LINK_STATUS:
			setLinkStatus((String) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID:
			getRefParameterValueLinkId().clear();
			getRefParameterValueLinkId().addAll(
					(Collection<? extends ParameterValue>) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID:
			getRefKpiValueLinkId().clear();
			getRefKpiValueLinkId().addAll(
					(Collection<? extends KpiValue>) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_LINK_DETAIL_LINK_ID:
			getRefLinkDetailLinkId().clear();
			getRefLinkDetailLinkId().addAll(
					(Collection<? extends LinkDetail>) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_CREATED_BY:
			setRefCreatedBy((UserMst) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_LOBBY_STN_ID:
			setRefLobbyStnId((StationMst) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY:
			setRefLastModifiedBy((UserMst) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_TRACTION_TYPE:
			setRefTractionType((TractionMst) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD:
			setRefTrainFrequencyCd((TrainFrequencyMst) newValue);
			return;
		case CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD:
			setRefTrainTypeCd((TrainTypeMst) newValue);
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
		case CclmsPackage.LINK_MST__LINK_ID:
			unsetLinkId();
			return;
		case CclmsPackage.LINK_MST__SCENARIO_ID:
			unsetScenarioId();
			return;
		case CclmsPackage.LINK_MST__LINK_NAME:
			setLinkName(LINK_NAME_EDEFAULT);
			return;
		case CclmsPackage.LINK_MST__LOBBY_TYPE:
			setLobbyType(LOBBY_TYPE_EDEFAULT);
			return;
		case CclmsPackage.LINK_MST__LINK_STATUS:
			setLinkStatus(LINK_STATUS_EDEFAULT);
			return;
		case CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID:
			getRefParameterValueLinkId().clear();
			return;
		case CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID:
			getRefKpiValueLinkId().clear();
			return;
		case CclmsPackage.LINK_MST__REF_LINK_DETAIL_LINK_ID:
			getRefLinkDetailLinkId().clear();
			return;
		case CclmsPackage.LINK_MST__REF_CREATED_BY:
			setRefCreatedBy((UserMst) null);
			return;
		case CclmsPackage.LINK_MST__REF_LOBBY_STN_ID:
			setRefLobbyStnId((StationMst) null);
			return;
		case CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY:
			setRefLastModifiedBy((UserMst) null);
			return;
		case CclmsPackage.LINK_MST__REF_TRACTION_TYPE:
			setRefTractionType((TractionMst) null);
			return;
		case CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD:
			setRefTrainFrequencyCd((TrainFrequencyMst) null);
			return;
		case CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD:
			setRefTrainTypeCd((TrainTypeMst) null);
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
		case CclmsPackage.LINK_MST__LINK_ID:
			return isSetLinkId();
		case CclmsPackage.LINK_MST__SCENARIO_ID:
			return isSetScenarioId();
		case CclmsPackage.LINK_MST__LINK_NAME:
			return LINK_NAME_EDEFAULT == null ? linkName != null
					: !LINK_NAME_EDEFAULT.equals(linkName);
		case CclmsPackage.LINK_MST__LOBBY_TYPE:
			return LOBBY_TYPE_EDEFAULT == null ? lobbyType != null
					: !LOBBY_TYPE_EDEFAULT.equals(lobbyType);
		case CclmsPackage.LINK_MST__LINK_STATUS:
			return LINK_STATUS_EDEFAULT == null ? linkStatus != null
					: !LINK_STATUS_EDEFAULT.equals(linkStatus);
		case CclmsPackage.LINK_MST__REF_PARAMETER_VALUE_LINK_ID:
			return refParameterValueLinkId != null
					&& !refParameterValueLinkId.isEmpty();
		case CclmsPackage.LINK_MST__REF_KPI_VALUE_LINK_ID:
			return refKpiValueLinkId != null && !refKpiValueLinkId.isEmpty();
		case CclmsPackage.LINK_MST__REF_LINK_DETAIL_LINK_ID:
			return refLinkDetailLinkId != null
					&& !refLinkDetailLinkId.isEmpty();
		case CclmsPackage.LINK_MST__REF_CREATED_BY:
			return refCreatedBy != null;
		case CclmsPackage.LINK_MST__REF_LOBBY_STN_ID:
			return refLobbyStnId != null;
		case CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY:
			return refLastModifiedBy != null;
		case CclmsPackage.LINK_MST__REF_TRACTION_TYPE:
			return refTractionType != null;
		case CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD:
			return refTrainFrequencyCd != null;
		case CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD:
			return refTrainTypeCd != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (linkId: ");
		if ((_booleanFlags & LINK_ID_ESETFLAG) != 0)
			result.append(linkId);
		else
			result.append("<unset>");
		result.append(", scenarioId: ");
		if ((_booleanFlags & SCENARIO_ID_ESETFLAG) != 0)
			result.append(scenarioId);
		else
			result.append("<unset>");
		result.append(", linkName: ");
		result.append(linkName);
		result.append(", lobbyType: ");
		result.append(lobbyType);
		result.append(", linkStatus: ");
		result.append(linkStatus);
		result.append(')');
		return result.toString();
	}

} //LinkMstImpl
