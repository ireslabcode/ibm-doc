/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.SegmentMst;
import cclms.StationMst;
import cclms.TractionMst;
import cclms.TrainMst;
import cclms.TrainSegmentMst;
import cclms.UserMst;

import ilog.odm.dom.impl.IloDomObjectImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getTrainSegId <em>Train Seg Id</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getCclmsTrainType <em>Cclms Train Type</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getSignOnTime <em>Sign On Time</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getSignOffTime <em>Sign Off Time</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getRunningDuration <em>Running Duration</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getChronicDelayTime <em>Chronic Delay Time</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getDeptType <em>Dept Type</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getSpareFlag <em>Spare Flag</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getDayofservice <em>Dayofservice</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getActualKm <em>Actual Km</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getRefLocoChangeStn <em>Ref Loco Change Stn</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getRefSegmentId <em>Ref Segment Id</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getRefAssignedLobby <em>Ref Assigned Lobby</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getRefTractionType <em>Ref Traction Type</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentMstImpl#getRefTrainId <em>Ref Train Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainSegmentMstImpl extends IloDomObjectImpl implements
		TrainSegmentMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getTrainSegId() <em>Train Seg Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSegId()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_SEG_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrainSegId() <em>Train Seg Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSegId()
	 * @generated
	 * @ordered
	 */
	protected int trainSegId = TRAIN_SEG_ID_EDEFAULT;

	/**
	 * The flag representing whether the Train Seg Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_SEG_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getCclmsTrainType() <em>Cclms Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCclmsTrainType()
	 * @generated
	 * @ordered
	 */
	protected static final int CCLMS_TRAIN_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCclmsTrainType() <em>Cclms Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCclmsTrainType()
	 * @generated
	 * @ordered
	 */
	protected int cclmsTrainType = CCLMS_TRAIN_TYPE_EDEFAULT;

	/**
	 * The flag representing whether the Cclms Train Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CCLMS_TRAIN_TYPE_ESETFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #getSignOnTime() <em>Sign On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignOnTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGN_ON_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignOnTime() <em>Sign On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignOnTime()
	 * @generated
	 * @ordered
	 */
	protected int signOnTime = SIGN_ON_TIME_EDEFAULT;

	/**
	 * The flag representing whether the Sign On Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SIGN_ON_TIME_ESETFLAG = 1 << 2;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final int START_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected int startTime = START_TIME_EDEFAULT;

	/**
	 * The flag representing whether the Start Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int START_TIME_ESETFLAG = 1 << 3;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final int END_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected int endTime = END_TIME_EDEFAULT;

	/**
	 * The flag representing whether the End Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int END_TIME_ESETFLAG = 1 << 4;

	/**
	 * The default value of the '{@link #getSignOffTime() <em>Sign Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignOffTime()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGN_OFF_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignOffTime() <em>Sign Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignOffTime()
	 * @generated
	 * @ordered
	 */
	protected int signOffTime = SIGN_OFF_TIME_EDEFAULT;

	/**
	 * The flag representing whether the Sign Off Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SIGN_OFF_TIME_ESETFLAG = 1 << 5;

	/**
	 * The default value of the '{@link #getRunningDuration() <em>Running Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNNING_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRunningDuration() <em>Running Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningDuration()
	 * @generated
	 * @ordered
	 */
	protected int runningDuration = RUNNING_DURATION_EDEFAULT;

	/**
	 * The flag representing whether the Running Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int RUNNING_DURATION_ESETFLAG = 1 << 6;

	/**
	 * The default value of the '{@link #getChronicDelayTime() <em>Chronic Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChronicDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final int CHRONIC_DELAY_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChronicDelayTime() <em>Chronic Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChronicDelayTime()
	 * @generated
	 * @ordered
	 */
	protected int chronicDelayTime = CHRONIC_DELAY_TIME_EDEFAULT;

	/**
	 * The flag representing whether the Chronic Delay Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CHRONIC_DELAY_TIME_ESETFLAG = 1 << 7;

	/**
	 * The default value of the '{@link #getDeptType() <em>Dept Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeptType() <em>Dept Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptType()
	 * @generated
	 * @ordered
	 */
	protected String deptType = DEPT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpareFlag() <em>Spare Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpareFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String SPARE_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpareFlag() <em>Spare Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpareFlag()
	 * @generated
	 * @ordered
	 */
	protected String spareFlag = SPARE_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayofservice() <em>Dayofservice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayofservice()
	 * @generated
	 * @ordered
	 */
	protected static final String DAYOFSERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayofservice() <em>Dayofservice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayofservice()
	 * @generated
	 * @ordered
	 */
	protected String dayofservice = DAYOFSERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualKm() <em>Actual Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualKm()
	 * @generated
	 * @ordered
	 */
	protected static final double ACTUAL_KM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getActualKm() <em>Actual Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualKm()
	 * @generated
	 * @ordered
	 */
	protected double actualKm = ACTUAL_KM_EDEFAULT;

	/**
	 * The flag representing whether the Actual Km attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ACTUAL_KM_ESETFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATED_BY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected int createdBy = CREATED_BY_EDEFAULT;

	/**
	 * The flag representing whether the Created By attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int CREATED_BY_ESETFLAG = 1 << 9;

	/**
	 * The cached value of the '{@link #getRefLocoChangeStn() <em>Ref Loco Change Stn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLocoChangeStn()
	 * @generated
	 * @ordered
	 */
	protected StationMst refLocoChangeStn;

	/**
	 * The cached value of the '{@link #getRefSegmentId() <em>Ref Segment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSegmentId()
	 * @generated
	 * @ordered
	 */
	protected SegmentMst refSegmentId;

	/**
	 * The cached value of the '{@link #getRefAssignedLobby() <em>Ref Assigned Lobby</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAssignedLobby()
	 * @generated
	 * @ordered
	 */
	protected StationMst refAssignedLobby;

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
	 * The cached value of the '{@link #getRefTrainId() <em>Ref Train Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainId()
	 * @generated
	 * @ordered
	 */
	protected TrainMst refTrainId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainSegmentMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.TRAIN_SEGMENT_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrainSegId() {
		return trainSegId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainSegId(int newTrainSegId) {
		int oldTrainSegId = trainSegId;
		trainSegId = newTrainSegId;
		boolean oldTrainSegIdESet = (_booleanFlags & TRAIN_SEG_ID_ESETFLAG) != 0;
		_booleanFlags |= TRAIN_SEG_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID,
								oldTrainSegId, trainSegId, !oldTrainSegIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID,
						oldTrainSegId, trainSegId, !oldTrainSegIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrainSegId() {
		int oldTrainSegId = trainSegId;
		boolean oldTrainSegIdESet = (_booleanFlags & TRAIN_SEG_ID_ESETFLAG) != 0;
		trainSegId = TRAIN_SEG_ID_EDEFAULT;
		_booleanFlags &= ~TRAIN_SEG_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID,
								oldTrainSegId, TRAIN_SEG_ID_EDEFAULT,
								oldTrainSegIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID,
						oldTrainSegId, TRAIN_SEG_ID_EDEFAULT, oldTrainSegIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrainSegId() {
		return (_booleanFlags & TRAIN_SEG_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCclmsTrainType() {
		return cclmsTrainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCclmsTrainType(int newCclmsTrainType) {
		int oldCclmsTrainType = cclmsTrainType;
		cclmsTrainType = newCclmsTrainType;
		boolean oldCclmsTrainTypeESet = (_booleanFlags & CCLMS_TRAIN_TYPE_ESETFLAG) != 0;
		_booleanFlags |= CCLMS_TRAIN_TYPE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE,
								oldCclmsTrainType, cclmsTrainType,
								!oldCclmsTrainTypeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE,
						oldCclmsTrainType, cclmsTrainType,
						!oldCclmsTrainTypeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCclmsTrainType() {
		int oldCclmsTrainType = cclmsTrainType;
		boolean oldCclmsTrainTypeESet = (_booleanFlags & CCLMS_TRAIN_TYPE_ESETFLAG) != 0;
		cclmsTrainType = CCLMS_TRAIN_TYPE_EDEFAULT;
		_booleanFlags &= ~CCLMS_TRAIN_TYPE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE,
								oldCclmsTrainType, CCLMS_TRAIN_TYPE_EDEFAULT,
								oldCclmsTrainTypeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE,
						oldCclmsTrainType, CCLMS_TRAIN_TYPE_EDEFAULT,
						oldCclmsTrainTypeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCclmsTrainType() {
		return (_booleanFlags & CCLMS_TRAIN_TYPE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignOnTime() {
		return signOnTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignOnTime(int newSignOnTime) {
		int oldSignOnTime = signOnTime;
		signOnTime = newSignOnTime;
		boolean oldSignOnTimeESet = (_booleanFlags & SIGN_ON_TIME_ESETFLAG) != 0;
		_booleanFlags |= SIGN_ON_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME,
								oldSignOnTime, signOnTime, !oldSignOnTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME,
						oldSignOnTime, signOnTime, !oldSignOnTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignOnTime() {
		int oldSignOnTime = signOnTime;
		boolean oldSignOnTimeESet = (_booleanFlags & SIGN_ON_TIME_ESETFLAG) != 0;
		signOnTime = SIGN_ON_TIME_EDEFAULT;
		_booleanFlags &= ~SIGN_ON_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME,
								oldSignOnTime, SIGN_ON_TIME_EDEFAULT,
								oldSignOnTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME,
						oldSignOnTime, SIGN_ON_TIME_EDEFAULT, oldSignOnTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignOnTime() {
		return (_booleanFlags & SIGN_ON_TIME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(int newStartTime) {
		int oldStartTime = startTime;
		startTime = newStartTime;
		boolean oldStartTimeESet = (_booleanFlags & START_TIME_ESETFLAG) != 0;
		_booleanFlags |= START_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__START_TIME,
								oldStartTime, startTime, !oldStartTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__START_TIME,
						oldStartTime, startTime, !oldStartTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartTime() {
		int oldStartTime = startTime;
		boolean oldStartTimeESet = (_booleanFlags & START_TIME_ESETFLAG) != 0;
		startTime = START_TIME_EDEFAULT;
		_booleanFlags &= ~START_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__START_TIME,
								oldStartTime, START_TIME_EDEFAULT,
								oldStartTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__START_TIME,
						oldStartTime, START_TIME_EDEFAULT, oldStartTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartTime() {
		return (_booleanFlags & START_TIME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(int newEndTime) {
		int oldEndTime = endTime;
		endTime = newEndTime;
		boolean oldEndTimeESet = (_booleanFlags & END_TIME_ESETFLAG) != 0;
		_booleanFlags |= END_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__END_TIME,
								oldEndTime, endTime, !oldEndTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__END_TIME, oldEndTime,
						endTime, !oldEndTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndTime() {
		int oldEndTime = endTime;
		boolean oldEndTimeESet = (_booleanFlags & END_TIME_ESETFLAG) != 0;
		endTime = END_TIME_EDEFAULT;
		_booleanFlags &= ~END_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__END_TIME,
								oldEndTime, END_TIME_EDEFAULT, oldEndTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__END_TIME, oldEndTime,
						END_TIME_EDEFAULT, oldEndTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndTime() {
		return (_booleanFlags & END_TIME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignOffTime() {
		return signOffTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignOffTime(int newSignOffTime) {
		int oldSignOffTime = signOffTime;
		signOffTime = newSignOffTime;
		boolean oldSignOffTimeESet = (_booleanFlags & SIGN_OFF_TIME_ESETFLAG) != 0;
		_booleanFlags |= SIGN_OFF_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME,
								oldSignOffTime, signOffTime,
								!oldSignOffTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME,
						oldSignOffTime, signOffTime, !oldSignOffTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignOffTime() {
		int oldSignOffTime = signOffTime;
		boolean oldSignOffTimeESet = (_booleanFlags & SIGN_OFF_TIME_ESETFLAG) != 0;
		signOffTime = SIGN_OFF_TIME_EDEFAULT;
		_booleanFlags &= ~SIGN_OFF_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME,
								oldSignOffTime, SIGN_OFF_TIME_EDEFAULT,
								oldSignOffTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME,
						oldSignOffTime, SIGN_OFF_TIME_EDEFAULT,
						oldSignOffTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignOffTime() {
		return (_booleanFlags & SIGN_OFF_TIME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRunningDuration() {
		return runningDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunningDuration(int newRunningDuration) {
		int oldRunningDuration = runningDuration;
		runningDuration = newRunningDuration;
		boolean oldRunningDurationESet = (_booleanFlags & RUNNING_DURATION_ESETFLAG) != 0;
		_booleanFlags |= RUNNING_DURATION_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION,
								oldRunningDuration, runningDuration,
								!oldRunningDurationESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION,
						oldRunningDuration, runningDuration,
						!oldRunningDurationESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRunningDuration() {
		int oldRunningDuration = runningDuration;
		boolean oldRunningDurationESet = (_booleanFlags & RUNNING_DURATION_ESETFLAG) != 0;
		runningDuration = RUNNING_DURATION_EDEFAULT;
		_booleanFlags &= ~RUNNING_DURATION_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION,
								oldRunningDuration, RUNNING_DURATION_EDEFAULT,
								oldRunningDurationESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION,
						oldRunningDuration, RUNNING_DURATION_EDEFAULT,
						oldRunningDurationESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRunningDuration() {
		return (_booleanFlags & RUNNING_DURATION_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChronicDelayTime() {
		return chronicDelayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChronicDelayTime(int newChronicDelayTime) {
		int oldChronicDelayTime = chronicDelayTime;
		chronicDelayTime = newChronicDelayTime;
		boolean oldChronicDelayTimeESet = (_booleanFlags & CHRONIC_DELAY_TIME_ESETFLAG) != 0;
		_booleanFlags |= CHRONIC_DELAY_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME,
								oldChronicDelayTime, chronicDelayTime,
								!oldChronicDelayTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME,
						oldChronicDelayTime, chronicDelayTime,
						!oldChronicDelayTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChronicDelayTime() {
		int oldChronicDelayTime = chronicDelayTime;
		boolean oldChronicDelayTimeESet = (_booleanFlags & CHRONIC_DELAY_TIME_ESETFLAG) != 0;
		chronicDelayTime = CHRONIC_DELAY_TIME_EDEFAULT;
		_booleanFlags &= ~CHRONIC_DELAY_TIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME,
								oldChronicDelayTime,
								CHRONIC_DELAY_TIME_EDEFAULT,
								oldChronicDelayTimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME,
						oldChronicDelayTime, CHRONIC_DELAY_TIME_EDEFAULT,
						oldChronicDelayTimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChronicDelayTime() {
		return (_booleanFlags & CHRONIC_DELAY_TIME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeptType() {
		return deptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeptType(String newDeptType) {
		String oldDeptType = deptType;
		deptType = newDeptType;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__DEPT_TYPE,
								oldDeptType, deptType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__DEPT_TYPE, oldDeptType,
						deptType));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpareFlag() {
		return spareFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpareFlag(String newSpareFlag) {
		String oldSpareFlag = spareFlag;
		spareFlag = newSpareFlag;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__SPARE_FLAG,
								oldSpareFlag, spareFlag);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__SPARE_FLAG,
						oldSpareFlag, spareFlag));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDayofservice() {
		return dayofservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayofservice(String newDayofservice) {
		String oldDayofservice = dayofservice;
		dayofservice = newDayofservice;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__DAYOFSERVICE,
								oldDayofservice, dayofservice);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__DAYOFSERVICE,
						oldDayofservice, dayofservice));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getActualKm() {
		return actualKm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualKm(double newActualKm) {
		double oldActualKm = actualKm;
		actualKm = newActualKm;
		boolean oldActualKmESet = (_booleanFlags & ACTUAL_KM_ESETFLAG) != 0;
		_booleanFlags |= ACTUAL_KM_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM,
								oldActualKm, actualKm, !oldActualKmESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM, oldActualKm,
						actualKm, !oldActualKmESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActualKm() {
		double oldActualKm = actualKm;
		boolean oldActualKmESet = (_booleanFlags & ACTUAL_KM_ESETFLAG) != 0;
		actualKm = ACTUAL_KM_EDEFAULT;
		_booleanFlags &= ~ACTUAL_KM_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM,
								oldActualKm, ACTUAL_KM_EDEFAULT,
								oldActualKmESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM, oldActualKm,
						ACTUAL_KM_EDEFAULT, oldActualKmESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActualKm() {
		return (_booleanFlags & ACTUAL_KM_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefLocoChangeStn() {
		return refLocoChangeStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLocoChangeStn(
			StationMst newRefLocoChangeStn, NotificationChain msgs) {
		StationMst oldRefLocoChangeStn = refLocoChangeStn;
		refLocoChangeStn = newRefLocoChangeStn;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN,
								oldRefLocoChangeStn, newRefLocoChangeStn);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN,
						oldRefLocoChangeStn, newRefLocoChangeStn);
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
	public void setRefLocoChangeStn(StationMst newRefLocoChangeStn) {
		if (newRefLocoChangeStn != refLocoChangeStn) {
			NotificationChain msgs = null;
			if (refLocoChangeStn != null)
				msgs = ((InternalEObject) refLocoChangeStn)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN,
								StationMst.class, msgs);
			if (newRefLocoChangeStn != null)
				msgs = ((InternalEObject) newRefLocoChangeStn)
						.eInverseAdd(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN,
								StationMst.class, msgs);
			msgs = basicSetRefLocoChangeStn(newRefLocoChangeStn, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN,
								newRefLocoChangeStn, newRefLocoChangeStn);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN,
						newRefLocoChangeStn, newRefLocoChangeStn));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMst getRefSegmentId() {
		return refSegmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefSegmentId(SegmentMst newRefSegmentId,
			NotificationChain msgs) {
		SegmentMst oldRefSegmentId = refSegmentId;
		refSegmentId = newRefSegmentId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID,
								oldRefSegmentId, newRefSegmentId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID,
						oldRefSegmentId, newRefSegmentId);
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
	public void setRefSegmentId(SegmentMst newRefSegmentId) {
		if (newRefSegmentId != refSegmentId) {
			NotificationChain msgs = null;
			if (refSegmentId != null)
				msgs = ((InternalEObject) refSegmentId)
						.eInverseRemove(
								this,
								CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID,
								SegmentMst.class, msgs);
			if (newRefSegmentId != null)
				msgs = ((InternalEObject) newRefSegmentId)
						.eInverseAdd(
								this,
								CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID,
								SegmentMst.class, msgs);
			msgs = basicSetRefSegmentId(newRefSegmentId, msgs);
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
								CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID,
								newRefSegmentId, newRefSegmentId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID,
						newRefSegmentId, newRefSegmentId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefAssignedLobby() {
		return refAssignedLobby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefAssignedLobby(
			StationMst newRefAssignedLobby, NotificationChain msgs) {
		StationMst oldRefAssignedLobby = refAssignedLobby;
		refAssignedLobby = newRefAssignedLobby;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY,
								oldRefAssignedLobby, newRefAssignedLobby);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY,
						oldRefAssignedLobby, newRefAssignedLobby);
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
	public void setRefAssignedLobby(StationMst newRefAssignedLobby) {
		if (newRefAssignedLobby != refAssignedLobby) {
			NotificationChain msgs = null;
			if (refAssignedLobby != null)
				msgs = ((InternalEObject) refAssignedLobby)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY,
								StationMst.class, msgs);
			if (newRefAssignedLobby != null)
				msgs = ((InternalEObject) newRefAssignedLobby)
						.eInverseAdd(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY,
								StationMst.class, msgs);
			msgs = basicSetRefAssignedLobby(newRefAssignedLobby, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY,
								newRefAssignedLobby, newRefAssignedLobby);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY,
						newRefAssignedLobby, newRefAssignedLobby));
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
				notification = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE,
								oldRefTractionType, newRefTractionType);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE,
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
				msgs = ((InternalEObject) refTractionType)
						.eInverseRemove(
								this,
								CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE,
								TractionMst.class, msgs);
			if (newRefTractionType != null)
				msgs = ((InternalEObject) newRefTractionType)
						.eInverseAdd(
								this,
								CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE,
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
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE,
								newRefTractionType, newRefTractionType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE,
						newRefTractionType, newRefTractionType));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainMst getRefTrainId() {
		return refTrainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTrainId(TrainMst newRefTrainId,
			NotificationChain msgs) {
		TrainMst oldRefTrainId = refTrainId;
		refTrainId = newRefTrainId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID,
								oldRefTrainId, newRefTrainId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID,
						oldRefTrainId, newRefTrainId);
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
	public void setRefTrainId(TrainMst newRefTrainId) {
		if (newRefTrainId != refTrainId) {
			NotificationChain msgs = null;
			if (refTrainId != null)
				msgs = ((InternalEObject) refTrainId).eInverseRemove(this,
						CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID,
						TrainMst.class, msgs);
			if (newRefTrainId != null)
				msgs = ((InternalEObject) newRefTrainId).eInverseAdd(this,
						CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID,
						TrainMst.class, msgs);
			msgs = basicSetRefTrainId(newRefTrainId, msgs);
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
								CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID,
								newRefTrainId, newRefTrainId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID,
						newRefTrainId, newRefTrainId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(int newCreatedBy) {
		int oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		boolean oldCreatedByESet = (_booleanFlags & CREATED_BY_ESETFLAG) != 0;
		_booleanFlags |= CREATED_BY_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY,
								oldCreatedBy, createdBy, !oldCreatedByESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY,
						oldCreatedBy, createdBy, !oldCreatedByESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCreatedBy() {
		int oldCreatedBy = createdBy;
		boolean oldCreatedByESet = (_booleanFlags & CREATED_BY_ESETFLAG) != 0;
		createdBy = CREATED_BY_EDEFAULT;
		_booleanFlags &= ~CREATED_BY_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY,
								oldCreatedBy, CREATED_BY_EDEFAULT,
								oldCreatedByESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY,
						oldCreatedBy, CREATED_BY_EDEFAULT, oldCreatedByESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCreatedBy() {
		return (_booleanFlags & CREATED_BY_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getLocoChangeStn() {
		StationMst obj = getRefLocoChangeStn();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocoChangeStn(StationMst obj) {
		setRefLocoChangeStn(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentMst getSegmentId() {
		SegmentMst obj = getRefSegmentId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentId(SegmentMst obj) {
		setRefSegmentId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getAssignedLobby() {
		StationMst obj = getRefAssignedLobby();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedLobby(StationMst obj) {
		setRefAssignedLobby(obj);
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
	public TrainMst getTrainId() {
		TrainMst obj = getRefTrainId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainId(TrainMst obj) {
		setRefTrainId(obj);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN:
			if (refLocoChangeStn != null)
				msgs = ((InternalEObject) refLocoChangeStn)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_LOCO_CHANGE_STN,
								StationMst.class, msgs);
			return basicSetRefLocoChangeStn((StationMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID:
			if (refSegmentId != null)
				msgs = ((InternalEObject) refSegmentId)
						.eInverseRemove(
								this,
								CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID,
								SegmentMst.class, msgs);
			return basicSetRefSegmentId((SegmentMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY:
			if (refAssignedLobby != null)
				msgs = ((InternalEObject) refAssignedLobby)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_SEGMENT_MST_ASSIGNED_LOBBY,
								StationMst.class, msgs);
			return basicSetRefAssignedLobby((StationMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE:
			if (refTractionType != null)
				msgs = ((InternalEObject) refTractionType)
						.eInverseRemove(
								this,
								CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE,
								TractionMst.class, msgs);
			return basicSetRefTractionType((TractionMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID:
			if (refTrainId != null)
				msgs = ((InternalEObject) refTrainId).eInverseRemove(this,
						CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID,
						TrainMst.class, msgs);
			return basicSetRefTrainId((TrainMst) otherEnd, msgs);
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
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN:
			return basicSetRefLocoChangeStn(null, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID:
			return basicSetRefSegmentId(null, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY:
			return basicSetRefAssignedLobby(null, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE:
			return basicSetRefTractionType(null, msgs);
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID:
			return basicSetRefTrainId(null, msgs);
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
		case CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID:
			return getTrainSegId();
		case CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE:
			return getCclmsTrainType();
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME:
			return getSignOnTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__START_TIME:
			return getStartTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__END_TIME:
			return getEndTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME:
			return getSignOffTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION:
			return getRunningDuration();
		case CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME:
			return getChronicDelayTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__DEPT_TYPE:
			return getDeptType();
		case CclmsPackage.TRAIN_SEGMENT_MST__SPARE_FLAG:
			return getSpareFlag();
		case CclmsPackage.TRAIN_SEGMENT_MST__DAYOFSERVICE:
			return getDayofservice();
		case CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM:
			return getActualKm();
		case CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY:
			return getCreatedBy();
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN:
			return getRefLocoChangeStn();
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID:
			return getRefSegmentId();
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY:
			return getRefAssignedLobby();
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE:
			return getRefTractionType();
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID:
			return getRefTrainId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID:
			setTrainSegId((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE:
			setCclmsTrainType((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME:
			setSignOnTime((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__START_TIME:
			setStartTime((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__END_TIME:
			setEndTime((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME:
			setSignOffTime((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION:
			setRunningDuration((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME:
			setChronicDelayTime((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__DEPT_TYPE:
			setDeptType((String) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__SPARE_FLAG:
			setSpareFlag((String) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__DAYOFSERVICE:
			setDayofservice((String) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM:
			setActualKm((Double) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY:
			setCreatedBy((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN:
			setRefLocoChangeStn((StationMst) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID:
			setRefSegmentId((SegmentMst) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY:
			setRefAssignedLobby((StationMst) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE:
			setRefTractionType((TractionMst) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID:
			setRefTrainId((TrainMst) newValue);
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
		case CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID:
			unsetTrainSegId();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE:
			unsetCclmsTrainType();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME:
			unsetSignOnTime();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__START_TIME:
			unsetStartTime();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__END_TIME:
			unsetEndTime();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME:
			unsetSignOffTime();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION:
			unsetRunningDuration();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME:
			unsetChronicDelayTime();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__DEPT_TYPE:
			setDeptType(DEPT_TYPE_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__SPARE_FLAG:
			setSpareFlag(SPARE_FLAG_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__DAYOFSERVICE:
			setDayofservice(DAYOFSERVICE_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM:
			unsetActualKm();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY:
			unsetCreatedBy();
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN:
			setRefLocoChangeStn((StationMst) null);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID:
			setRefSegmentId((SegmentMst) null);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY:
			setRefAssignedLobby((StationMst) null);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE:
			setRefTractionType((TractionMst) null);
			return;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID:
			setRefTrainId((TrainMst) null);
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
		case CclmsPackage.TRAIN_SEGMENT_MST__TRAIN_SEG_ID:
			return isSetTrainSegId();
		case CclmsPackage.TRAIN_SEGMENT_MST__CCLMS_TRAIN_TYPE:
			return isSetCclmsTrainType();
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_ON_TIME:
			return isSetSignOnTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__START_TIME:
			return isSetStartTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__END_TIME:
			return isSetEndTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__SIGN_OFF_TIME:
			return isSetSignOffTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__RUNNING_DURATION:
			return isSetRunningDuration();
		case CclmsPackage.TRAIN_SEGMENT_MST__CHRONIC_DELAY_TIME:
			return isSetChronicDelayTime();
		case CclmsPackage.TRAIN_SEGMENT_MST__DEPT_TYPE:
			return DEPT_TYPE_EDEFAULT == null ? deptType != null
					: !DEPT_TYPE_EDEFAULT.equals(deptType);
		case CclmsPackage.TRAIN_SEGMENT_MST__SPARE_FLAG:
			return SPARE_FLAG_EDEFAULT == null ? spareFlag != null
					: !SPARE_FLAG_EDEFAULT.equals(spareFlag);
		case CclmsPackage.TRAIN_SEGMENT_MST__DAYOFSERVICE:
			return DAYOFSERVICE_EDEFAULT == null ? dayofservice != null
					: !DAYOFSERVICE_EDEFAULT.equals(dayofservice);
		case CclmsPackage.TRAIN_SEGMENT_MST__ACTUAL_KM:
			return isSetActualKm();
		case CclmsPackage.TRAIN_SEGMENT_MST__CREATED_BY:
			return isSetCreatedBy();
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_LOCO_CHANGE_STN:
			return refLocoChangeStn != null;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID:
			return refSegmentId != null;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_ASSIGNED_LOBBY:
			return refAssignedLobby != null;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE:
			return refTractionType != null;
		case CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID:
			return refTrainId != null;
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
		result.append(" (trainSegId: ");
		if ((_booleanFlags & TRAIN_SEG_ID_ESETFLAG) != 0)
			result.append(trainSegId);
		else
			result.append("<unset>");
		result.append(", cclmsTrainType: ");
		if ((_booleanFlags & CCLMS_TRAIN_TYPE_ESETFLAG) != 0)
			result.append(cclmsTrainType);
		else
			result.append("<unset>");
		result.append(", signOnTime: ");
		if ((_booleanFlags & SIGN_ON_TIME_ESETFLAG) != 0)
			result.append(signOnTime);
		else
			result.append("<unset>");
		result.append(", startTime: ");
		if ((_booleanFlags & START_TIME_ESETFLAG) != 0)
			result.append(startTime);
		else
			result.append("<unset>");
		result.append(", endTime: ");
		if ((_booleanFlags & END_TIME_ESETFLAG) != 0)
			result.append(endTime);
		else
			result.append("<unset>");
		result.append(", signOffTime: ");
		if ((_booleanFlags & SIGN_OFF_TIME_ESETFLAG) != 0)
			result.append(signOffTime);
		else
			result.append("<unset>");
		result.append(", runningDuration: ");
		if ((_booleanFlags & RUNNING_DURATION_ESETFLAG) != 0)
			result.append(runningDuration);
		else
			result.append("<unset>");
		result.append(", chronicDelayTime: ");
		if ((_booleanFlags & CHRONIC_DELAY_TIME_ESETFLAG) != 0)
			result.append(chronicDelayTime);
		else
			result.append("<unset>");
		result.append(", deptType: ");
		result.append(deptType);
		result.append(", spareFlag: ");
		result.append(spareFlag);
		result.append(", dayofservice: ");
		result.append(dayofservice);
		result.append(", actualKm: ");
		if ((_booleanFlags & ACTUAL_KM_ESETFLAG) != 0)
			result.append(actualKm);
		else
			result.append("<unset>");
		result.append(", createdBy: ");
		if ((_booleanFlags & CREATED_BY_ESETFLAG) != 0)
			result.append(createdBy);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TrainSegmentMstImpl
