/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.DivisionMst;
import cclms.LinkDetail;
import cclms.LinkMst;
import cclms.SegmentMst;
import cclms.StationMst;
import cclms.TrainMst;

import cclms.TrainSegmentMst;
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
 *   <li>{@link cclms.impl.StationMstImpl#getStationId <em>Station Id</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getStationCode <em>Station Code</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getStationName <em>Station Name</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getLobbyFlag <em>Lobby Flag</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefDivisionId <em>Ref Division Id</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefTrainMstTrainEndStn <em>Ref Train Mst Train End Stn</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefTrainMstTrainStartStn <em>Ref Train Mst Train Start Stn</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefUserMstLobbyId <em>Ref User Mst Lobby Id</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefLinkDetailFromStn <em>Ref Link Detail From Stn</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefLinkDetailToStn <em>Ref Link Detail To Stn</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefSegmentMstStartStationId <em>Ref Segment Mst Start Station Id</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefSegmentMstStopStationId <em>Ref Segment Mst Stop Station Id</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefTrainSegmentMstLocoChangeStn <em>Ref Train Segment Mst Loco Change Stn</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefTrainSegmentMstAssignedLobby <em>Ref Train Segment Mst Assigned Lobby</em>}</li>
 *   <li>{@link cclms.impl.StationMstImpl#getRefLinkMstLobbyStnId <em>Ref Link Mst Lobby Stn Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StationMstImpl extends IloDomObjectImpl implements StationMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getStationId() <em>Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationId()
	 * @generated
	 * @ordered
	 */
	protected static final int STATION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStationId() <em>Station Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationId()
	 * @generated
	 * @ordered
	 */
	protected int stationId = STATION_ID_EDEFAULT;

	/**
	 * The flag representing whether the Station Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int STATION_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getStationCode() <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String STATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStationCode() <em>Station Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationCode()
	 * @generated
	 * @ordered
	 */
	protected String stationCode = STATION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStationName() <em>Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationName()
	 * @generated
	 * @ordered
	 */
	protected static final String STATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStationName() <em>Station Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStationName()
	 * @generated
	 * @ordered
	 */
	protected String stationName = STATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLobbyFlag() <em>Lobby Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String LOBBY_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLobbyFlag() <em>Lobby Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLobbyFlag()
	 * @generated
	 * @ordered
	 */
	protected String lobbyFlag = LOBBY_FLAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefDivisionId() <em>Ref Division Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDivisionId()
	 * @generated
	 * @ordered
	 */
	protected DivisionMst refDivisionId;

	/**
	 * The cached value of the '{@link #getRefTrainMstTrainEndStn() <em>Ref Train Mst Train End Stn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainMstTrainEndStn()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainMst> refTrainMstTrainEndStn;

	/**
	 * The cached value of the '{@link #getRefTrainMstTrainStartStn() <em>Ref Train Mst Train Start Stn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainMstTrainStartStn()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainMst> refTrainMstTrainStartStn;

	/**
	 * The cached value of the '{@link #getRefUserMstLobbyId() <em>Ref User Mst Lobby Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefUserMstLobbyId()
	 * @generated
	 * @ordered
	 */
	protected EList<UserMst> refUserMstLobbyId;

	/**
	 * The cached value of the '{@link #getRefLinkDetailFromStn() <em>Ref Link Detail From Stn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkDetailFromStn()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkDetail> refLinkDetailFromStn;

	/**
	 * The cached value of the '{@link #getRefLinkDetailToStn() <em>Ref Link Detail To Stn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkDetailToStn()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkDetail> refLinkDetailToStn;

	/**
	 * The cached value of the '{@link #getRefSegmentMstStartStationId() <em>Ref Segment Mst Start Station Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSegmentMstStartStationId()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentMst> refSegmentMstStartStationId;

	/**
	 * The cached value of the '{@link #getRefSegmentMstStopStationId() <em>Ref Segment Mst Stop Station Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSegmentMstStopStationId()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentMst> refSegmentMstStopStationId;

	/**
	 * The cached value of the '{@link #getRefTrainSegmentMstLocoChangeStn() <em>Ref Train Segment Mst Loco Change Stn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainSegmentMstLocoChangeStn()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentMst> refTrainSegmentMstLocoChangeStn;

	/**
	 * The cached value of the '{@link #getRefTrainSegmentMstAssignedLobby() <em>Ref Train Segment Mst Assigned Lobby</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainSegmentMstAssignedLobby()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentMst> refTrainSegmentMstAssignedLobby;

	/**
	 * The cached value of the '{@link #getRefLinkMstLobbyStnId() <em>Ref Link Mst Lobby Stn Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkMstLobbyStnId()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMst> refLinkMstLobbyStnId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getStationMst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStationId() {
		return stationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationId(int newStationId) {
		int oldStationId = stationId;
		stationId = newStationId;
		boolean oldStationIdESet = (_booleanFlags & STATION_ID_ESETFLAG) != 0;
		_booleanFlags |= STATION_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.STATION_MST__STATION_ID,
								oldStationId, stationId, !oldStationIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.STATION_MST__STATION_ID, oldStationId,
						stationId, !oldStationIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStationId() {
		int oldStationId = stationId;
		boolean oldStationIdESet = (_booleanFlags & STATION_ID_ESETFLAG) != 0;
		stationId = STATION_ID_EDEFAULT;
		_booleanFlags &= ~STATION_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.STATION_MST__STATION_ID,
								oldStationId, STATION_ID_EDEFAULT,
								oldStationIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.STATION_MST__STATION_ID, oldStationId,
						STATION_ID_EDEFAULT, oldStationIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStationId() {
		return (_booleanFlags & STATION_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStationCode() {
		return stationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationCode(String newStationCode) {
		String oldStationCode = stationCode;
		stationCode = newStationCode;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.STATION_MST__STATION_CODE,
								oldStationCode, stationCode);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.STATION_MST__STATION_CODE, oldStationCode,
						stationCode));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStationName() {
		return stationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStationName(String newStationName) {
		String oldStationName = stationName;
		stationName = newStationName;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.STATION_MST__STATION_NAME,
								oldStationName, stationName);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.STATION_MST__STATION_NAME, oldStationName,
						stationName));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLobbyFlag() {
		return lobbyFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLobbyFlag(String newLobbyFlag) {
		String oldLobbyFlag = lobbyFlag;
		lobbyFlag = newLobbyFlag;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.STATION_MST__LOBBY_FLAG,
								oldLobbyFlag, lobbyFlag);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.STATION_MST__LOBBY_FLAG, oldLobbyFlag,
						lobbyFlag));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionMst getRefDivisionId() {
		return refDivisionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefDivisionId(
			DivisionMst newRefDivisionId, NotificationChain msgs) {
		DivisionMst oldRefDivisionId = refDivisionId;
		refDivisionId = newRefDivisionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.STATION_MST__REF_DIVISION_ID,
								oldRefDivisionId, newRefDivisionId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.STATION_MST__REF_DIVISION_ID,
						oldRefDivisionId, newRefDivisionId);
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
	public void setRefDivisionId(DivisionMst newRefDivisionId) {
		if (newRefDivisionId != refDivisionId) {
			NotificationChain msgs = null;
			if (refDivisionId != null)
				msgs = ((InternalEObject) refDivisionId).eInverseRemove(this,
						CclmsPackage.DIVISION_MST__REF_STATION_MST_DIVISION_ID,
						DivisionMst.class, msgs);
			if (newRefDivisionId != null)
				msgs = ((InternalEObject) newRefDivisionId).eInverseAdd(this,
						CclmsPackage.DIVISION_MST__REF_STATION_MST_DIVISION_ID,
						DivisionMst.class, msgs);
			msgs = basicSetRefDivisionId(newRefDivisionId, msgs);
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
								CclmsPackage.STATION_MST__REF_DIVISION_ID,
								newRefDivisionId, newRefDivisionId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.STATION_MST__REF_DIVISION_ID,
						newRefDivisionId, newRefDivisionId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainMst> getRefTrainMstTrainEndStn() {
		if (refTrainMstTrainEndStn == null) {
			refTrainMstTrainEndStn = new IloDomObjectWithInverseEList<TrainMst>(
					TrainMst.class, this,
					CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN,
					CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN);
		}
		return refTrainMstTrainEndStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainMst> getRefTrainMstTrainStartStn() {
		if (refTrainMstTrainStartStn == null) {
			refTrainMstTrainStartStn = new IloDomObjectWithInverseEList<TrainMst>(
					TrainMst.class, this,
					CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN,
					CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN);
		}
		return refTrainMstTrainStartStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserMst> getRefUserMstLobbyId() {
		if (refUserMstLobbyId == null) {
			refUserMstLobbyId = new IloDomObjectWithInverseEList<UserMst>(
					UserMst.class, this,
					CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID,
					CclmsPackage.USER_MST__REF_LOBBY_ID);
		}
		return refUserMstLobbyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getRefLinkDetailFromStn() {
		if (refLinkDetailFromStn == null) {
			refLinkDetailFromStn = new IloDomObjectWithInverseEList<LinkDetail>(
					LinkDetail.class, this,
					CclmsPackage.STATION_MST__REF_LINK_DETAIL_FROM_STN,
					CclmsPackage.LINK_DETAIL__REF_FROM_STN);
		}
		return refLinkDetailFromStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getRefLinkDetailToStn() {
		if (refLinkDetailToStn == null) {
			refLinkDetailToStn = new IloDomObjectWithInverseEList<LinkDetail>(
					LinkDetail.class, this,
					CclmsPackage.STATION_MST__REF_LINK_DETAIL_TO_STN,
					CclmsPackage.LINK_DETAIL__REF_TO_STN);
		}
		return refLinkDetailToStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMst> getRefSegmentMstStartStationId() {
		if (refSegmentMstStartStationId == null) {
			refSegmentMstStartStationId = new IloDomObjectWithInverseEList<SegmentMst>(
					SegmentMst.class, this,
					CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID,
					CclmsPackage.SEGMENT_MST__REF_START_STATION_ID);
		}
		return refSegmentMstStartStationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMst> getRefSegmentMstStopStationId() {
		if (refSegmentMstStopStationId == null) {
			refSegmentMstStopStationId = new IloDomObjectWithInverseEList<SegmentMst>(
					SegmentMst.class, this,
					CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID,
					CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID);
		}
		return refSegmentMstStopStationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getRefTrainSegmentMstLocoChangeStn() {
		if (refTrainSegmentMstLocoChangeStn == null) {
			refTrainSegmentMstLocoChangeStn = new IloDomObjectWithInverseEList<TrainSegmentMst>(
					TrainSegmentMst.class,
					this,
					CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN,
					CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN);
		}
		return refTrainSegmentMstLocoChangeStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getRefTrainSegmentMstAssignedLobby() {
		if (refTrainSegmentMstAssignedLobby == null) {
			refTrainSegmentMstAssignedLobby = new IloDomObjectWithInverseEList<TrainSegmentMst>(
					TrainSegmentMst.class,
					this,
					CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY,
					CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY);
		}
		return refTrainSegmentMstAssignedLobby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getRefLinkMstLobbyStnId() {
		if (refLinkMstLobbyStnId == null) {
			refLinkMstLobbyStnId = new IloDomObjectWithInverseEList<LinkMst>(
					LinkMst.class, this,
					CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID,
					CclmsPackage.LINK_MST__REF_LOBBY_STN_ID);
		}
		return refLinkMstLobbyStnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionMst getDivisionId() {
		DivisionMst obj = getRefDivisionId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivisionId(DivisionMst obj) {
		setRefDivisionId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainMst> getTrainMstTrainEndStn() {
		return getRefTrainMstTrainEndStn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainMst> getTrainMstTrainStartStn() {
		return getRefTrainMstTrainStartStn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<UserMst> getUserMstLobbyId() {
		return getRefUserMstLobbyId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getLinkDetailFromStn() {
		return getRefLinkDetailFromStn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getLinkDetailToStn() {
		return getRefLinkDetailToStn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMst> getSegmentMstStartStationId() {
		return getRefSegmentMstStartStationId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMst> getSegmentMstStopStationId() {
		return getRefSegmentMstStopStationId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getTrainSegmentMstLocoChangeStn() {
		return getRefTrainSegmentMstLocoChangeStn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getTrainSegmentMstAssignedLobby() {
		return getRefTrainSegmentMstAssignedLobby();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getLinkMstLobbyStnId() {
		return getRefLinkMstLobbyStnId();
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
		case CclmsPackage.STATION_MST__REF_DIVISION_ID:
			if (refDivisionId != null)
				msgs = ((InternalEObject) refDivisionId).eInverseRemove(this,
						CclmsPackage.DIVISION_MST__REF_STATION_MST_DIVISION_ID,
						DivisionMst.class, msgs);
			return basicSetRefDivisionId((DivisionMst) otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainMstTrainEndStn())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainMstTrainStartStn())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefUserMstLobbyId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_FROM_STN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkDetailFromStn())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_TO_STN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkDetailToStn())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefSegmentMstStartStationId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefSegmentMstStopStationId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainSegmentMstLocoChangeStn())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainSegmentMstAssignedLobby())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkMstLobbyStnId())
					.basicAdd(otherEnd, msgs);
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
		case CclmsPackage.STATION_MST__REF_DIVISION_ID:
			return basicSetRefDivisionId(null, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN:
			return ((InternalEList<?>) getRefTrainMstTrainEndStn())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN:
			return ((InternalEList<?>) getRefTrainMstTrainStartStn())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID:
			return ((InternalEList<?>) getRefUserMstLobbyId()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_FROM_STN:
			return ((InternalEList<?>) getRefLinkDetailFromStn()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_TO_STN:
			return ((InternalEList<?>) getRefLinkDetailToStn()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID:
			return ((InternalEList<?>) getRefSegmentMstStartStationId())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID:
			return ((InternalEList<?>) getRefSegmentMstStopStationId())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN:
			return ((InternalEList<?>) getRefTrainSegmentMstLocoChangeStn())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY:
			return ((InternalEList<?>) getRefTrainSegmentMstAssignedLobby())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID:
			return ((InternalEList<?>) getRefLinkMstLobbyStnId()).basicRemove(
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
		case CclmsPackage.STATION_MST__STATION_ID:
			return getStationId();
		case CclmsPackage.STATION_MST__STATION_CODE:
			return getStationCode();
		case CclmsPackage.STATION_MST__STATION_NAME:
			return getStationName();
		case CclmsPackage.STATION_MST__LOBBY_FLAG:
			return getLobbyFlag();
		case CclmsPackage.STATION_MST__REF_DIVISION_ID:
			return getRefDivisionId();
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN:
			return getRefTrainMstTrainEndStn();
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN:
			return getRefTrainMstTrainStartStn();
		case CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID:
			return getRefUserMstLobbyId();
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_FROM_STN:
			return getRefLinkDetailFromStn();
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_TO_STN:
			return getRefLinkDetailToStn();
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID:
			return getRefSegmentMstStartStationId();
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID:
			return getRefSegmentMstStopStationId();
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN:
			return getRefTrainSegmentMstLocoChangeStn();
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY:
			return getRefTrainSegmentMstAssignedLobby();
		case CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID:
			return getRefLinkMstLobbyStnId();
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
		case CclmsPackage.STATION_MST__STATION_ID:
			setStationId((Integer) newValue);
			return;
		case CclmsPackage.STATION_MST__STATION_CODE:
			setStationCode((String) newValue);
			return;
		case CclmsPackage.STATION_MST__STATION_NAME:
			setStationName((String) newValue);
			return;
		case CclmsPackage.STATION_MST__LOBBY_FLAG:
			setLobbyFlag((String) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_DIVISION_ID:
			setRefDivisionId((DivisionMst) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN:
			getRefTrainMstTrainEndStn().clear();
			getRefTrainMstTrainEndStn().addAll(
					(Collection<? extends TrainMst>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN:
			getRefTrainMstTrainStartStn().clear();
			getRefTrainMstTrainStartStn().addAll(
					(Collection<? extends TrainMst>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID:
			getRefUserMstLobbyId().clear();
			getRefUserMstLobbyId().addAll(
					(Collection<? extends UserMst>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_FROM_STN:
			getRefLinkDetailFromStn().clear();
			getRefLinkDetailFromStn().addAll(
					(Collection<? extends LinkDetail>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_TO_STN:
			getRefLinkDetailToStn().clear();
			getRefLinkDetailToStn().addAll(
					(Collection<? extends LinkDetail>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID:
			getRefSegmentMstStartStationId().clear();
			getRefSegmentMstStartStationId().addAll(
					(Collection<? extends SegmentMst>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID:
			getRefSegmentMstStopStationId().clear();
			getRefSegmentMstStopStationId().addAll(
					(Collection<? extends SegmentMst>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN:
			getRefTrainSegmentMstLocoChangeStn().clear();
			getRefTrainSegmentMstLocoChangeStn().addAll(
					(Collection<? extends TrainSegmentMst>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY:
			getRefTrainSegmentMstAssignedLobby().clear();
			getRefTrainSegmentMstAssignedLobby().addAll(
					(Collection<? extends TrainSegmentMst>) newValue);
			return;
		case CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID:
			getRefLinkMstLobbyStnId().clear();
			getRefLinkMstLobbyStnId().addAll(
					(Collection<? extends LinkMst>) newValue);
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
		case CclmsPackage.STATION_MST__STATION_ID:
			unsetStationId();
			return;
		case CclmsPackage.STATION_MST__STATION_CODE:
			setStationCode(STATION_CODE_EDEFAULT);
			return;
		case CclmsPackage.STATION_MST__STATION_NAME:
			setStationName(STATION_NAME_EDEFAULT);
			return;
		case CclmsPackage.STATION_MST__LOBBY_FLAG:
			setLobbyFlag(LOBBY_FLAG_EDEFAULT);
			return;
		case CclmsPackage.STATION_MST__REF_DIVISION_ID:
			setRefDivisionId((DivisionMst) null);
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN:
			getRefTrainMstTrainEndStn().clear();
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN:
			getRefTrainMstTrainStartStn().clear();
			return;
		case CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID:
			getRefUserMstLobbyId().clear();
			return;
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_FROM_STN:
			getRefLinkDetailFromStn().clear();
			return;
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_TO_STN:
			getRefLinkDetailToStn().clear();
			return;
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID:
			getRefSegmentMstStartStationId().clear();
			return;
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID:
			getRefSegmentMstStopStationId().clear();
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN:
			getRefTrainSegmentMstLocoChangeStn().clear();
			return;
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY:
			getRefTrainSegmentMstAssignedLobby().clear();
			return;
		case CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID:
			getRefLinkMstLobbyStnId().clear();
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
		case CclmsPackage.STATION_MST__STATION_ID:
			return isSetStationId();
		case CclmsPackage.STATION_MST__STATION_CODE:
			return STATION_CODE_EDEFAULT == null ? stationCode != null
					: !STATION_CODE_EDEFAULT.equals(stationCode);
		case CclmsPackage.STATION_MST__STATION_NAME:
			return STATION_NAME_EDEFAULT == null ? stationName != null
					: !STATION_NAME_EDEFAULT.equals(stationName);
		case CclmsPackage.STATION_MST__LOBBY_FLAG:
			return LOBBY_FLAG_EDEFAULT == null ? lobbyFlag != null
					: !LOBBY_FLAG_EDEFAULT.equals(lobbyFlag);
		case CclmsPackage.STATION_MST__REF_DIVISION_ID:
			return refDivisionId != null;
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN:
			return refTrainMstTrainEndStn != null
					&& !refTrainMstTrainEndStn.isEmpty();
		case CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN:
			return refTrainMstTrainStartStn != null
					&& !refTrainMstTrainStartStn.isEmpty();
		case CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID:
			return refUserMstLobbyId != null && !refUserMstLobbyId.isEmpty();
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_FROM_STN:
			return refLinkDetailFromStn != null
					&& !refLinkDetailFromStn.isEmpty();
		case CclmsPackage.STATION_MST__REF_LINK_DETAIL_TO_STN:
			return refLinkDetailToStn != null && !refLinkDetailToStn.isEmpty();
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID:
			return refSegmentMstStartStationId != null
					&& !refSegmentMstStartStationId.isEmpty();
		case CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID:
			return refSegmentMstStopStationId != null
					&& !refSegmentMstStopStationId.isEmpty();
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN:
			return refTrainSegmentMstLocoChangeStn != null
					&& !refTrainSegmentMstLocoChangeStn.isEmpty();
		case CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY:
			return refTrainSegmentMstAssignedLobby != null
					&& !refTrainSegmentMstAssignedLobby.isEmpty();
		case CclmsPackage.STATION_MST__REF_LINK_MST_LOBBY_STN_ID:
			return refLinkMstLobbyStnId != null
					&& !refLinkMstLobbyStnId.isEmpty();
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
		result.append(" (stationId: ");
		if ((_booleanFlags & STATION_ID_ESETFLAG) != 0)
			result.append(stationId);
		else
			result.append("<unset>");
		result.append(", stationCode: ");
		result.append(stationCode);
		result.append(", stationName: ");
		result.append(stationName);
		result.append(", lobbyFlag: ");
		result.append(lobbyFlag);
		result.append(')');
		return result.toString();
	}

} //StationMstImpl
