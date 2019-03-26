/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.TimeToMinEngine;

import ilog.odm.dom.impl.IloDomObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getTrainid <em>Trainid</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getSegmentid <em>Segmentid</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getSignontime <em>Signontime</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getSignominute <em>Signominute</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getStarttime <em>Starttime</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getStartminute <em>Startminute</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getEndtime <em>Endtime</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getEndminute <em>Endminute</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getSignofftime <em>Signofftime</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getSignoffminute <em>Signoffminute</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getDayid <em>Dayid</em>}</li>
 *   <li>{@link cclms.impl.TimeToMinEngineImpl#getSpareflag <em>Spareflag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeToMinEngineImpl extends IloDomObjectImpl implements
		TimeToMinEngine {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getTrainid() <em>Trainid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainid()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAINID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrainid() <em>Trainid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainid()
	 * @generated
	 * @ordered
	 */
	protected int trainid = TRAINID_EDEFAULT;

	/**
	 * The flag representing whether the Trainid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int TRAINID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getSegmentid() <em>Segmentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentid()
	 * @generated
	 * @ordered
	 */
	protected static final int SEGMENTID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSegmentid() <em>Segmentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentid()
	 * @generated
	 * @ordered
	 */
	protected int segmentid = SEGMENTID_EDEFAULT;

	/**
	 * The flag representing whether the Segmentid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SEGMENTID_ESETFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #getSignontime() <em>Signontime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignontime()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNONTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignontime() <em>Signontime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignontime()
	 * @generated
	 * @ordered
	 */
	protected String signontime = SIGNONTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignominute() <em>Signominute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignominute()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNOMINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignominute() <em>Signominute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignominute()
	 * @generated
	 * @ordered
	 */
	protected int signominute = SIGNOMINUTE_EDEFAULT;

	/**
	 * The flag representing whether the Signominute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNOMINUTE_ESETFLAG = 1 << 2;

	/**
	 * The default value of the '{@link #getStarttime() <em>Starttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStarttime() <em>Starttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected String starttime = STARTTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartminute() <em>Startminute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartminute()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTMINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartminute() <em>Startminute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartminute()
	 * @generated
	 * @ordered
	 */
	protected int startminute = STARTMINUTE_EDEFAULT;

	/**
	 * The flag representing whether the Startminute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int STARTMINUTE_ESETFLAG = 1 << 3;

	/**
	 * The default value of the '{@link #getEndtime() <em>Endtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndtime() <em>Endtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected String endtime = ENDTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndminute() <em>Endminute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndminute()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDMINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndminute() <em>Endminute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndminute()
	 * @generated
	 * @ordered
	 */
	protected int endminute = ENDMINUTE_EDEFAULT;

	/**
	 * The flag representing whether the Endminute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ENDMINUTE_ESETFLAG = 1 << 4;

	/**
	 * The default value of the '{@link #getSignofftime() <em>Signofftime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignofftime()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNOFFTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignofftime() <em>Signofftime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignofftime()
	 * @generated
	 * @ordered
	 */
	protected String signofftime = SIGNOFFTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignoffminute() <em>Signoffminute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignoffminute()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNOFFMINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignoffminute() <em>Signoffminute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignoffminute()
	 * @generated
	 * @ordered
	 */
	protected int signoffminute = SIGNOFFMINUTE_EDEFAULT;

	/**
	 * The flag representing whether the Signoffminute attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNOFFMINUTE_ESETFLAG = 1 << 5;

	/**
	 * The default value of the '{@link #getDayid() <em>Dayid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayid()
	 * @generated
	 * @ordered
	 */
	protected static final int DAYID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDayid() <em>Dayid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayid()
	 * @generated
	 * @ordered
	 */
	protected int dayid = DAYID_EDEFAULT;

	/**
	 * The flag representing whether the Dayid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DAYID_ESETFLAG = 1 << 6;

	/**
	 * The default value of the '{@link #getSpareflag() <em>Spareflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpareflag()
	 * @generated
	 * @ordered
	 */
	protected static final int SPAREFLAG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpareflag() <em>Spareflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpareflag()
	 * @generated
	 * @ordered
	 */
	protected int spareflag = SPAREFLAG_EDEFAULT;

	/**
	 * The flag representing whether the Spareflag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SPAREFLAG_ESETFLAG = 1 << 7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeToMinEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getTimeToMinEngine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrainid() {
		return trainid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainid(int newTrainid) {
		int oldTrainid = trainid;
		trainid = newTrainid;
		boolean oldTrainidESet = (_booleanFlags & TRAINID_ESETFLAG) != 0;
		_booleanFlags |= TRAINID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID,
								oldTrainid, trainid, !oldTrainidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID, oldTrainid,
						trainid, !oldTrainidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrainid() {
		int oldTrainid = trainid;
		boolean oldTrainidESet = (_booleanFlags & TRAINID_ESETFLAG) != 0;
		trainid = TRAINID_EDEFAULT;
		_booleanFlags &= ~TRAINID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID,
								oldTrainid, TRAINID_EDEFAULT, oldTrainidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID, oldTrainid,
						TRAINID_EDEFAULT, oldTrainidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrainid() {
		return (_booleanFlags & TRAINID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSegmentid() {
		return segmentid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentid(int newSegmentid) {
		int oldSegmentid = segmentid;
		segmentid = newSegmentid;
		boolean oldSegmentidESet = (_booleanFlags & SEGMENTID_ESETFLAG) != 0;
		_booleanFlags |= SEGMENTID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID,
								oldSegmentid, segmentid, !oldSegmentidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID,
						oldSegmentid, segmentid, !oldSegmentidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSegmentid() {
		int oldSegmentid = segmentid;
		boolean oldSegmentidESet = (_booleanFlags & SEGMENTID_ESETFLAG) != 0;
		segmentid = SEGMENTID_EDEFAULT;
		_booleanFlags &= ~SEGMENTID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID,
								oldSegmentid, SEGMENTID_EDEFAULT,
								oldSegmentidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID,
						oldSegmentid, SEGMENTID_EDEFAULT, oldSegmentidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSegmentid() {
		return (_booleanFlags & SEGMENTID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignontime() {
		return signontime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignontime(String newSignontime) {
		String oldSignontime = signontime;
		signontime = newSignontime;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SIGNONTIME,
								oldSignontime, signontime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SIGNONTIME,
						oldSignontime, signontime));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignominute() {
		return signominute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignominute(int newSignominute) {
		int oldSignominute = signominute;
		signominute = newSignominute;
		boolean oldSignominuteESet = (_booleanFlags & SIGNOMINUTE_ESETFLAG) != 0;
		_booleanFlags |= SIGNOMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE,
								oldSignominute, signominute,
								!oldSignominuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE,
						oldSignominute, signominute, !oldSignominuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignominute() {
		int oldSignominute = signominute;
		boolean oldSignominuteESet = (_booleanFlags & SIGNOMINUTE_ESETFLAG) != 0;
		signominute = SIGNOMINUTE_EDEFAULT;
		_booleanFlags &= ~SIGNOMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE,
								oldSignominute, SIGNOMINUTE_EDEFAULT,
								oldSignominuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE,
						oldSignominute, SIGNOMINUTE_EDEFAULT,
						oldSignominuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignominute() {
		return (_booleanFlags & SIGNOMINUTE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStarttime() {
		return starttime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarttime(String newStarttime) {
		String oldStarttime = starttime;
		starttime = newStarttime;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__STARTTIME,
								oldStarttime, starttime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__STARTTIME,
						oldStarttime, starttime));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartminute() {
		return startminute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartminute(int newStartminute) {
		int oldStartminute = startminute;
		startminute = newStartminute;
		boolean oldStartminuteESet = (_booleanFlags & STARTMINUTE_ESETFLAG) != 0;
		_booleanFlags |= STARTMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE,
								oldStartminute, startminute,
								!oldStartminuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE,
						oldStartminute, startminute, !oldStartminuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartminute() {
		int oldStartminute = startminute;
		boolean oldStartminuteESet = (_booleanFlags & STARTMINUTE_ESETFLAG) != 0;
		startminute = STARTMINUTE_EDEFAULT;
		_booleanFlags &= ~STARTMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE,
								oldStartminute, STARTMINUTE_EDEFAULT,
								oldStartminuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE,
						oldStartminute, STARTMINUTE_EDEFAULT,
						oldStartminuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartminute() {
		return (_booleanFlags & STARTMINUTE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndtime(String newEndtime) {
		String oldEndtime = endtime;
		endtime = newEndtime;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__ENDTIME,
								oldEndtime, endtime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__ENDTIME, oldEndtime,
						endtime));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndminute() {
		return endminute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndminute(int newEndminute) {
		int oldEndminute = endminute;
		endminute = newEndminute;
		boolean oldEndminuteESet = (_booleanFlags & ENDMINUTE_ESETFLAG) != 0;
		_booleanFlags |= ENDMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE,
								oldEndminute, endminute, !oldEndminuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE,
						oldEndminute, endminute, !oldEndminuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndminute() {
		int oldEndminute = endminute;
		boolean oldEndminuteESet = (_booleanFlags & ENDMINUTE_ESETFLAG) != 0;
		endminute = ENDMINUTE_EDEFAULT;
		_booleanFlags &= ~ENDMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE,
								oldEndminute, ENDMINUTE_EDEFAULT,
								oldEndminuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE,
						oldEndminute, ENDMINUTE_EDEFAULT, oldEndminuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndminute() {
		return (_booleanFlags & ENDMINUTE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignofftime() {
		return signofftime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignofftime(String newSignofftime) {
		String oldSignofftime = signofftime;
		signofftime = newSignofftime;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFTIME,
								oldSignofftime, signofftime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFTIME,
						oldSignofftime, signofftime));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignoffminute() {
		return signoffminute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignoffminute(int newSignoffminute) {
		int oldSignoffminute = signoffminute;
		signoffminute = newSignoffminute;
		boolean oldSignoffminuteESet = (_booleanFlags & SIGNOFFMINUTE_ESETFLAG) != 0;
		_booleanFlags |= SIGNOFFMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE,
								oldSignoffminute, signoffminute,
								!oldSignoffminuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE,
						oldSignoffminute, signoffminute, !oldSignoffminuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignoffminute() {
		int oldSignoffminute = signoffminute;
		boolean oldSignoffminuteESet = (_booleanFlags & SIGNOFFMINUTE_ESETFLAG) != 0;
		signoffminute = SIGNOFFMINUTE_EDEFAULT;
		_booleanFlags &= ~SIGNOFFMINUTE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE,
								oldSignoffminute, SIGNOFFMINUTE_EDEFAULT,
								oldSignoffminuteESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE,
						oldSignoffminute, SIGNOFFMINUTE_EDEFAULT,
						oldSignoffminuteESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignoffminute() {
		return (_booleanFlags & SIGNOFFMINUTE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDayid() {
		return dayid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayid(int newDayid) {
		int oldDayid = dayid;
		dayid = newDayid;
		boolean oldDayidESet = (_booleanFlags & DAYID_ESETFLAG) != 0;
		_booleanFlags |= DAYID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__DAYID,
								oldDayid, dayid, !oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__DAYID, oldDayid,
						dayid, !oldDayidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDayid() {
		int oldDayid = dayid;
		boolean oldDayidESet = (_booleanFlags & DAYID_ESETFLAG) != 0;
		dayid = DAYID_EDEFAULT;
		_booleanFlags &= ~DAYID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__DAYID,
								oldDayid, DAYID_EDEFAULT, oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__DAYID, oldDayid,
						DAYID_EDEFAULT, oldDayidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDayid() {
		return (_booleanFlags & DAYID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpareflag() {
		return spareflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpareflag(int newSpareflag) {
		int oldSpareflag = spareflag;
		spareflag = newSpareflag;
		boolean oldSpareflagESet = (_booleanFlags & SPAREFLAG_ESETFLAG) != 0;
		_booleanFlags |= SPAREFLAG_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG,
								oldSpareflag, spareflag, !oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG,
						oldSpareflag, spareflag, !oldSpareflagESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpareflag() {
		int oldSpareflag = spareflag;
		boolean oldSpareflagESet = (_booleanFlags & SPAREFLAG_ESETFLAG) != 0;
		spareflag = SPAREFLAG_EDEFAULT;
		_booleanFlags &= ~SPAREFLAG_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG,
								oldSpareflag, SPAREFLAG_EDEFAULT,
								oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG,
						oldSpareflag, SPAREFLAG_EDEFAULT, oldSpareflagESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpareflag() {
		return (_booleanFlags & SPAREFLAG_ESETFLAG) != 0;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID:
			return getTrainid();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID:
			return getSegmentid();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNONTIME:
			return getSignontime();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE:
			return getSignominute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTTIME:
			return getStarttime();
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE:
			return getStartminute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDTIME:
			return getEndtime();
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE:
			return getEndminute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFTIME:
			return getSignofftime();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE:
			return getSignoffminute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__DAYID:
			return getDayid();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG:
			return getSpareflag();
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
		case CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID:
			setTrainid((Integer) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID:
			setSegmentid((Integer) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNONTIME:
			setSignontime((String) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE:
			setSignominute((Integer) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTTIME:
			setStarttime((String) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE:
			setStartminute((Integer) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDTIME:
			setEndtime((String) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE:
			setEndminute((Integer) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFTIME:
			setSignofftime((String) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE:
			setSignoffminute((Integer) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__DAYID:
			setDayid((Integer) newValue);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG:
			setSpareflag((Integer) newValue);
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
		case CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID:
			unsetTrainid();
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID:
			unsetSegmentid();
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNONTIME:
			setSignontime(SIGNONTIME_EDEFAULT);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE:
			unsetSignominute();
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTTIME:
			setStarttime(STARTTIME_EDEFAULT);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE:
			unsetStartminute();
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDTIME:
			setEndtime(ENDTIME_EDEFAULT);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE:
			unsetEndminute();
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFTIME:
			setSignofftime(SIGNOFFTIME_EDEFAULT);
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE:
			unsetSignoffminute();
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__DAYID:
			unsetDayid();
			return;
		case CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG:
			unsetSpareflag();
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
		case CclmsPackage.TIME_TO_MIN_ENGINE__TRAINID:
			return isSetTrainid();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SEGMENTID:
			return isSetSegmentid();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNONTIME:
			return SIGNONTIME_EDEFAULT == null ? signontime != null
					: !SIGNONTIME_EDEFAULT.equals(signontime);
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOMINUTE:
			return isSetSignominute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTTIME:
			return STARTTIME_EDEFAULT == null ? starttime != null
					: !STARTTIME_EDEFAULT.equals(starttime);
		case CclmsPackage.TIME_TO_MIN_ENGINE__STARTMINUTE:
			return isSetStartminute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDTIME:
			return ENDTIME_EDEFAULT == null ? endtime != null
					: !ENDTIME_EDEFAULT.equals(endtime);
		case CclmsPackage.TIME_TO_MIN_ENGINE__ENDMINUTE:
			return isSetEndminute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFTIME:
			return SIGNOFFTIME_EDEFAULT == null ? signofftime != null
					: !SIGNOFFTIME_EDEFAULT.equals(signofftime);
		case CclmsPackage.TIME_TO_MIN_ENGINE__SIGNOFFMINUTE:
			return isSetSignoffminute();
		case CclmsPackage.TIME_TO_MIN_ENGINE__DAYID:
			return isSetDayid();
		case CclmsPackage.TIME_TO_MIN_ENGINE__SPAREFLAG:
			return isSetSpareflag();
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
		result.append(" (trainid: ");
		if ((_booleanFlags & TRAINID_ESETFLAG) != 0)
			result.append(trainid);
		else
			result.append("<unset>");
		result.append(", segmentid: ");
		if ((_booleanFlags & SEGMENTID_ESETFLAG) != 0)
			result.append(segmentid);
		else
			result.append("<unset>");
		result.append(", signontime: ");
		result.append(signontime);
		result.append(", signominute: ");
		if ((_booleanFlags & SIGNOMINUTE_ESETFLAG) != 0)
			result.append(signominute);
		else
			result.append("<unset>");
		result.append(", starttime: ");
		result.append(starttime);
		result.append(", startminute: ");
		if ((_booleanFlags & STARTMINUTE_ESETFLAG) != 0)
			result.append(startminute);
		else
			result.append("<unset>");
		result.append(", endtime: ");
		result.append(endtime);
		result.append(", endminute: ");
		if ((_booleanFlags & ENDMINUTE_ESETFLAG) != 0)
			result.append(endminute);
		else
			result.append("<unset>");
		result.append(", signofftime: ");
		result.append(signofftime);
		result.append(", signoffminute: ");
		if ((_booleanFlags & SIGNOFFMINUTE_ESETFLAG) != 0)
			result.append(signoffminute);
		else
			result.append("<unset>");
		result.append(", dayid: ");
		if ((_booleanFlags & DAYID_ESETFLAG) != 0)
			result.append(dayid);
		else
			result.append("<unset>");
		result.append(", spareflag: ");
		if ((_booleanFlags & SPAREFLAG_ESETFLAG) != 0)
			result.append(spareflag);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimeToMinEngineImpl
