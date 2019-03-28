/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.TrainSegmentEngine;

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
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getTrainid <em>Trainid</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getLegid <em>Legid</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getStartloc <em>Startloc</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getEndloc <em>Endloc</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getSignon <em>Signon</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getStart <em>Start</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getEnd <em>End</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getSignoff <em>Signoff</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getNightflag <em>Nightflag</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getDayid <em>Dayid</em>}</li>
 *   <li>{@link cclms.impl.TrainSegmentEngineImpl#getSpareflag <em>Spareflag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainSegmentEngineImpl extends IloDomObjectImpl implements
		TrainSegmentEngine {
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
	 * The default value of the '{@link #getLegid() <em>Legid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegid()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLegid() <em>Legid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegid()
	 * @generated
	 * @ordered
	 */
	protected int legid = LEGID_EDEFAULT;

	/**
	 * The flag representing whether the Legid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int LEGID_ESETFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #getStartloc() <em>Startloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartloc()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTLOC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartloc() <em>Startloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartloc()
	 * @generated
	 * @ordered
	 */
	protected int startloc = STARTLOC_EDEFAULT;

	/**
	 * The flag representing whether the Startloc attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int STARTLOC_ESETFLAG = 1 << 2;

	/**
	 * The default value of the '{@link #getEndloc() <em>Endloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndloc()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDLOC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndloc() <em>Endloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndloc()
	 * @generated
	 * @ordered
	 */
	protected int endloc = ENDLOC_EDEFAULT;

	/**
	 * The flag representing whether the Endloc attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ENDLOC_ESETFLAG = 1 << 3;

	/**
	 * The default value of the '{@link #getSignon() <em>Signon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignon()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignon() <em>Signon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignon()
	 * @generated
	 * @ordered
	 */
	protected int signon = SIGNON_EDEFAULT;

	/**
	 * The flag representing whether the Signon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNON_ESETFLAG = 1 << 4;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The flag representing whether the Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int START_ESETFLAG = 1 << 5;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * The flag representing whether the End attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int END_ESETFLAG = 1 << 6;

	/**
	 * The default value of the '{@link #getSignoff() <em>Signoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignoff()
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNOFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSignoff() <em>Signoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignoff()
	 * @generated
	 * @ordered
	 */
	protected int signoff = SIGNOFF_EDEFAULT;

	/**
	 * The flag representing whether the Signoff attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SIGNOFF_ESETFLAG = 1 << 7;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The flag representing whether the Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_ESETFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

	/**
	 * The flag representing whether the Distance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_ESETFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #getNightflag() <em>Nightflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNightflag()
	 * @generated
	 * @ordered
	 */
	protected static final int NIGHTFLAG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNightflag() <em>Nightflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNightflag()
	 * @generated
	 * @ordered
	 */
	protected int nightflag = NIGHTFLAG_EDEFAULT;

	/**
	 * The flag representing whether the Nightflag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int NIGHTFLAG_ESETFLAG = 1 << 10;

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
	protected static final int DAYID_ESETFLAG = 1 << 11;

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
	protected static final int SPAREFLAG_ESETFLAG = 1 << 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainSegmentEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.TRAIN_SEGMENT_ENGINE;
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
								CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID,
								oldTrainid, trainid, !oldTrainidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID, oldTrainid,
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
								CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID,
								oldTrainid, TRAINID_EDEFAULT, oldTrainidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID, oldTrainid,
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
	public int getLegid() {
		return legid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegid(int newLegid) {
		int oldLegid = legid;
		legid = newLegid;
		boolean oldLegidESet = (_booleanFlags & LEGID_ESETFLAG) != 0;
		_booleanFlags |= LEGID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID,
								oldLegid, legid, !oldLegidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID, oldLegid,
						legid, !oldLegidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegid() {
		int oldLegid = legid;
		boolean oldLegidESet = (_booleanFlags & LEGID_ESETFLAG) != 0;
		legid = LEGID_EDEFAULT;
		_booleanFlags &= ~LEGID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID,
								oldLegid, LEGID_EDEFAULT, oldLegidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID, oldLegid,
						LEGID_EDEFAULT, oldLegidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegid() {
		return (_booleanFlags & LEGID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartloc() {
		return startloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartloc(int newStartloc) {
		int oldStartloc = startloc;
		startloc = newStartloc;
		boolean oldStartlocESet = (_booleanFlags & STARTLOC_ESETFLAG) != 0;
		_booleanFlags |= STARTLOC_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC,
								oldStartloc, startloc, !oldStartlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC,
						oldStartloc, startloc, !oldStartlocESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStartloc() {
		int oldStartloc = startloc;
		boolean oldStartlocESet = (_booleanFlags & STARTLOC_ESETFLAG) != 0;
		startloc = STARTLOC_EDEFAULT;
		_booleanFlags &= ~STARTLOC_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(this, Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC,
								oldStartloc, STARTLOC_EDEFAULT, oldStartlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC,
						oldStartloc, STARTLOC_EDEFAULT, oldStartlocESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStartloc() {
		return (_booleanFlags & STARTLOC_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndloc() {
		return endloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndloc(int newEndloc) {
		int oldEndloc = endloc;
		endloc = newEndloc;
		boolean oldEndlocESet = (_booleanFlags & ENDLOC_ESETFLAG) != 0;
		_booleanFlags |= ENDLOC_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC,
								oldEndloc, endloc, !oldEndlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC, oldEndloc,
						endloc, !oldEndlocESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndloc() {
		int oldEndloc = endloc;
		boolean oldEndlocESet = (_booleanFlags & ENDLOC_ESETFLAG) != 0;
		endloc = ENDLOC_EDEFAULT;
		_booleanFlags &= ~ENDLOC_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC,
								oldEndloc, ENDLOC_EDEFAULT, oldEndlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC, oldEndloc,
						ENDLOC_EDEFAULT, oldEndlocESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndloc() {
		return (_booleanFlags & ENDLOC_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignon() {
		return signon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignon(int newSignon) {
		int oldSignon = signon;
		signon = newSignon;
		boolean oldSignonESet = (_booleanFlags & SIGNON_ESETFLAG) != 0;
		_booleanFlags |= SIGNON_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON,
								oldSignon, signon, !oldSignonESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON, oldSignon,
						signon, !oldSignonESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignon() {
		int oldSignon = signon;
		boolean oldSignonESet = (_booleanFlags & SIGNON_ESETFLAG) != 0;
		signon = SIGNON_EDEFAULT;
		_booleanFlags &= ~SIGNON_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON,
								oldSignon, SIGNON_EDEFAULT, oldSignonESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON, oldSignon,
						SIGNON_EDEFAULT, oldSignonESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignon() {
		return (_booleanFlags & SIGNON_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		boolean oldStartESet = (_booleanFlags & START_ESETFLAG) != 0;
		_booleanFlags |= START_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__START,
								oldStart, start, !oldStartESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__START, oldStart,
						start, !oldStartESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStart() {
		int oldStart = start;
		boolean oldStartESet = (_booleanFlags & START_ESETFLAG) != 0;
		start = START_EDEFAULT;
		_booleanFlags &= ~START_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__START,
								oldStart, START_EDEFAULT, oldStartESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__START, oldStart,
						START_EDEFAULT, oldStartESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStart() {
		return (_booleanFlags & START_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(int newEnd) {
		int oldEnd = end;
		end = newEnd;
		boolean oldEndESet = (_booleanFlags & END_ESETFLAG) != 0;
		_booleanFlags |= END_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__END, oldEnd,
								end, !oldEndESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__END, oldEnd, end,
						!oldEndESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnd() {
		int oldEnd = end;
		boolean oldEndESet = (_booleanFlags & END_ESETFLAG) != 0;
		end = END_EDEFAULT;
		_booleanFlags &= ~END_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__END, oldEnd,
								END_EDEFAULT, oldEndESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__END, oldEnd,
						END_EDEFAULT, oldEndESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnd() {
		return (_booleanFlags & END_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignoff() {
		return signoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignoff(int newSignoff) {
		int oldSignoff = signoff;
		signoff = newSignoff;
		boolean oldSignoffESet = (_booleanFlags & SIGNOFF_ESETFLAG) != 0;
		_booleanFlags |= SIGNOFF_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF,
								oldSignoff, signoff, !oldSignoffESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF, oldSignoff,
						signoff, !oldSignoffESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSignoff() {
		int oldSignoff = signoff;
		boolean oldSignoffESet = (_booleanFlags & SIGNOFF_ESETFLAG) != 0;
		signoff = SIGNOFF_EDEFAULT;
		_booleanFlags &= ~SIGNOFF_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF,
								oldSignoff, SIGNOFF_EDEFAULT, oldSignoffESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF, oldSignoff,
						SIGNOFF_EDEFAULT, oldSignoffESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSignoff() {
		return (_booleanFlags & SIGNOFF_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		boolean oldDurationESet = (_booleanFlags & DURATION_ESETFLAG) != 0;
		_booleanFlags |= DURATION_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION,
								oldDuration, duration, !oldDurationESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION,
						oldDuration, duration, !oldDurationESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDuration() {
		int oldDuration = duration;
		boolean oldDurationESet = (_booleanFlags & DURATION_ESETFLAG) != 0;
		duration = DURATION_EDEFAULT;
		_booleanFlags &= ~DURATION_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(this, Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION,
								oldDuration, DURATION_EDEFAULT, oldDurationESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION,
						oldDuration, DURATION_EDEFAULT, oldDurationESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDuration() {
		return (_booleanFlags & DURATION_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		boolean oldDistanceESet = (_booleanFlags & DISTANCE_ESETFLAG) != 0;
		_booleanFlags |= DISTANCE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE,
								oldDistance, distance, !oldDistanceESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE,
						oldDistance, distance, !oldDistanceESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistance() {
		int oldDistance = distance;
		boolean oldDistanceESet = (_booleanFlags & DISTANCE_ESETFLAG) != 0;
		distance = DISTANCE_EDEFAULT;
		_booleanFlags &= ~DISTANCE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(this, Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE,
								oldDistance, DISTANCE_EDEFAULT, oldDistanceESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE,
						oldDistance, DISTANCE_EDEFAULT, oldDistanceESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistance() {
		return (_booleanFlags & DISTANCE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNightflag() {
		return nightflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNightflag(int newNightflag) {
		int oldNightflag = nightflag;
		nightflag = newNightflag;
		boolean oldNightflagESet = (_booleanFlags & NIGHTFLAG_ESETFLAG) != 0;
		_booleanFlags |= NIGHTFLAG_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG,
								oldNightflag, nightflag, !oldNightflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG,
						oldNightflag, nightflag, !oldNightflagESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNightflag() {
		int oldNightflag = nightflag;
		boolean oldNightflagESet = (_booleanFlags & NIGHTFLAG_ESETFLAG) != 0;
		nightflag = NIGHTFLAG_EDEFAULT;
		_booleanFlags &= ~NIGHTFLAG_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG,
								oldNightflag, NIGHTFLAG_EDEFAULT,
								oldNightflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG,
						oldNightflag, NIGHTFLAG_EDEFAULT, oldNightflagESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNightflag() {
		return (_booleanFlags & NIGHTFLAG_ESETFLAG) != 0;
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
								CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID,
								oldDayid, dayid, !oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID, oldDayid,
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
								CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID,
								oldDayid, DAYID_EDEFAULT, oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID, oldDayid,
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
								CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG,
								oldSpareflag, spareflag, !oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG,
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
								CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG,
								oldSpareflag, SPAREFLAG_EDEFAULT,
								oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG,
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
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID:
			return getTrainid();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID:
			return getLegid();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC:
			return getStartloc();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC:
			return getEndloc();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON:
			return getSignon();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__START:
			return getStart();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__END:
			return getEnd();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF:
			return getSignoff();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION:
			return getDuration();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE:
			return getDistance();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG:
			return getNightflag();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID:
			return getDayid();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG:
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
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID:
			setTrainid((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID:
			setLegid((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC:
			setStartloc((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC:
			setEndloc((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON:
			setSignon((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__START:
			setStart((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__END:
			setEnd((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF:
			setSignoff((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION:
			setDuration((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE:
			setDistance((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG:
			setNightflag((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID:
			setDayid((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG:
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
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID:
			unsetTrainid();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID:
			unsetLegid();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC:
			unsetStartloc();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC:
			unsetEndloc();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON:
			unsetSignon();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__START:
			unsetStart();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__END:
			unsetEnd();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF:
			unsetSignoff();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION:
			unsetDuration();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE:
			unsetDistance();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG:
			unsetNightflag();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID:
			unsetDayid();
			return;
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG:
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
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__TRAINID:
			return isSetTrainid();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__LEGID:
			return isSetLegid();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__STARTLOC:
			return isSetStartloc();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__ENDLOC:
			return isSetEndloc();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNON:
			return isSetSignon();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__START:
			return isSetStart();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__END:
			return isSetEnd();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SIGNOFF:
			return isSetSignoff();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DURATION:
			return isSetDuration();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DISTANCE:
			return isSetDistance();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__NIGHTFLAG:
			return isSetNightflag();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__DAYID:
			return isSetDayid();
		case CclmsPackage.TRAIN_SEGMENT_ENGINE__SPAREFLAG:
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
		result.append(", legid: ");
		if ((_booleanFlags & LEGID_ESETFLAG) != 0)
			result.append(legid);
		else
			result.append("<unset>");
		result.append(", startloc: ");
		if ((_booleanFlags & STARTLOC_ESETFLAG) != 0)
			result.append(startloc);
		else
			result.append("<unset>");
		result.append(", endloc: ");
		if ((_booleanFlags & ENDLOC_ESETFLAG) != 0)
			result.append(endloc);
		else
			result.append("<unset>");
		result.append(", signon: ");
		if ((_booleanFlags & SIGNON_ESETFLAG) != 0)
			result.append(signon);
		else
			result.append("<unset>");
		result.append(", start: ");
		if ((_booleanFlags & START_ESETFLAG) != 0)
			result.append(start);
		else
			result.append("<unset>");
		result.append(", end: ");
		if ((_booleanFlags & END_ESETFLAG) != 0)
			result.append(end);
		else
			result.append("<unset>");
		result.append(", signoff: ");
		if ((_booleanFlags & SIGNOFF_ESETFLAG) != 0)
			result.append(signoff);
		else
			result.append("<unset>");
		result.append(", duration: ");
		if ((_booleanFlags & DURATION_ESETFLAG) != 0)
			result.append(duration);
		else
			result.append("<unset>");
		result.append(", distance: ");
		if ((_booleanFlags & DISTANCE_ESETFLAG) != 0)
			result.append(distance);
		else
			result.append("<unset>");
		result.append(", nightflag: ");
		if ((_booleanFlags & NIGHTFLAG_ESETFLAG) != 0)
			result.append(nightflag);
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

} //TrainSegmentEngineImpl
