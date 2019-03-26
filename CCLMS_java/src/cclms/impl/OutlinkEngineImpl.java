/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.OutlinkEngine;

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
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getDayid <em>Dayid</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getSeqid <em>Seqid</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getPairingid <em>Pairingid</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getDutyid <em>Dutyid</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getTrainid <em>Trainid</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getLegid <em>Legid</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getStartloc <em>Startloc</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getEndloc <em>Endloc</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getDutysignon <em>Dutysignon</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getStarttime <em>Starttime</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getEndtime <em>Endtime</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getDutysignoff <em>Dutysignoff</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getNib <em>Nib</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getSpareflag <em>Spareflag</em>}</li>
 *   <li>{@link cclms.impl.OutlinkEngineImpl#getSortorder <em>Sortorder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutlinkEngineImpl extends IloDomObjectImpl implements
		OutlinkEngine {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

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
	protected static final int DAYID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getSeqid() <em>Seqid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqid()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeqid() <em>Seqid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqid()
	 * @generated
	 * @ordered
	 */
	protected int seqid = SEQID_EDEFAULT;

	/**
	 * The flag representing whether the Seqid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SEQID_ESETFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #getPairingid() <em>Pairingid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairingid()
	 * @generated
	 * @ordered
	 */
	protected static final int PAIRINGID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPairingid() <em>Pairingid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairingid()
	 * @generated
	 * @ordered
	 */
	protected int pairingid = PAIRINGID_EDEFAULT;

	/**
	 * The flag representing whether the Pairingid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int PAIRINGID_ESETFLAG = 1 << 2;

	/**
	 * The default value of the '{@link #getDutyid() <em>Dutyid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutyid()
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDutyid() <em>Dutyid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutyid()
	 * @generated
	 * @ordered
	 */
	protected int dutyid = DUTYID_EDEFAULT;

	/**
	 * The flag representing whether the Dutyid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYID_ESETFLAG = 1 << 3;

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
	protected static final int TRAINID_ESETFLAG = 1 << 4;

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
	protected static final int LEGID_ESETFLAG = 1 << 5;

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
	protected static final int STARTLOC_ESETFLAG = 1 << 6;

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
	protected static final int ENDLOC_ESETFLAG = 1 << 7;

	/**
	 * The default value of the '{@link #getDutysignon() <em>Dutysignon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutysignon()
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYSIGNON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDutysignon() <em>Dutysignon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutysignon()
	 * @generated
	 * @ordered
	 */
	protected int dutysignon = DUTYSIGNON_EDEFAULT;

	/**
	 * The flag representing whether the Dutysignon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYSIGNON_ESETFLAG = 1 << 8;

	/**
	 * The default value of the '{@link #getStarttime() <em>Starttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected static final int STARTTIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStarttime() <em>Starttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected int starttime = STARTTIME_EDEFAULT;

	/**
	 * The flag representing whether the Starttime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int STARTTIME_ESETFLAG = 1 << 9;

	/**
	 * The default value of the '{@link #getEndtime() <em>Endtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected static final int ENDTIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEndtime() <em>Endtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected int endtime = ENDTIME_EDEFAULT;

	/**
	 * The flag representing whether the Endtime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int ENDTIME_ESETFLAG = 1 << 10;

	/**
	 * The default value of the '{@link #getDutysignoff() <em>Dutysignoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutysignoff()
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYSIGNOFF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDutysignoff() <em>Dutysignoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutysignoff()
	 * @generated
	 * @ordered
	 */
	protected int dutysignoff = DUTYSIGNOFF_EDEFAULT;

	/**
	 * The flag representing whether the Dutysignoff attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYSIGNOFF_ESETFLAG = 1 << 11;

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
	protected static final int DURATION_ESETFLAG = 1 << 12;

	/**
	 * The default value of the '{@link #getNib() <em>Nib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNib()
	 * @generated
	 * @ordered
	 */
	protected static final int NIB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNib() <em>Nib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNib()
	 * @generated
	 * @ordered
	 */
	protected int nib = NIB_EDEFAULT;

	/**
	 * The flag representing whether the Nib attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int NIB_ESETFLAG = 1 << 13;

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
	protected static final int SPAREFLAG_ESETFLAG = 1 << 14;

	/**
	 * The default value of the '{@link #getSortorder() <em>Sortorder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortorder()
	 * @generated
	 * @ordered
	 */
	protected static final int SORTORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortorder() <em>Sortorder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortorder()
	 * @generated
	 * @ordered
	 */
	protected int sortorder = SORTORDER_EDEFAULT;

	/**
	 * The flag representing whether the Sortorder attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SORTORDER_ESETFLAG = 1 << 15;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlinkEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getOutlinkEngine();
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
								CclmsPackage.OUTLINK_ENGINE__DAYID, oldDayid,
								dayid, !oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__DAYID, oldDayid, dayid,
						!oldDayidESet));
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
								CclmsPackage.OUTLINK_ENGINE__DAYID, oldDayid,
								DAYID_EDEFAULT, oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__DAYID, oldDayid,
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
	public int getSeqid() {
		return seqid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqid(int newSeqid) {
		int oldSeqid = seqid;
		seqid = newSeqid;
		boolean oldSeqidESet = (_booleanFlags & SEQID_ESETFLAG) != 0;
		_booleanFlags |= SEQID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__SEQID, oldSeqid,
								seqid, !oldSeqidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__SEQID, oldSeqid, seqid,
						!oldSeqidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeqid() {
		int oldSeqid = seqid;
		boolean oldSeqidESet = (_booleanFlags & SEQID_ESETFLAG) != 0;
		seqid = SEQID_EDEFAULT;
		_booleanFlags &= ~SEQID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__SEQID, oldSeqid,
								SEQID_EDEFAULT, oldSeqidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__SEQID, oldSeqid,
						SEQID_EDEFAULT, oldSeqidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeqid() {
		return (_booleanFlags & SEQID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPairingid() {
		return pairingid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPairingid(int newPairingid) {
		int oldPairingid = pairingid;
		pairingid = newPairingid;
		boolean oldPairingidESet = (_booleanFlags & PAIRINGID_ESETFLAG) != 0;
		_booleanFlags |= PAIRINGID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__PAIRINGID,
								oldPairingid, pairingid, !oldPairingidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__PAIRINGID, oldPairingid,
						pairingid, !oldPairingidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPairingid() {
		int oldPairingid = pairingid;
		boolean oldPairingidESet = (_booleanFlags & PAIRINGID_ESETFLAG) != 0;
		pairingid = PAIRINGID_EDEFAULT;
		_booleanFlags &= ~PAIRINGID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__PAIRINGID,
								oldPairingid, PAIRINGID_EDEFAULT,
								oldPairingidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__PAIRINGID, oldPairingid,
						PAIRINGID_EDEFAULT, oldPairingidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPairingid() {
		return (_booleanFlags & PAIRINGID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDutyid() {
		return dutyid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDutyid(int newDutyid) {
		int oldDutyid = dutyid;
		dutyid = newDutyid;
		boolean oldDutyidESet = (_booleanFlags & DUTYID_ESETFLAG) != 0;
		_booleanFlags |= DUTYID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__DUTYID, oldDutyid,
								dutyid, !oldDutyidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__DUTYID, oldDutyid, dutyid,
						!oldDutyidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDutyid() {
		int oldDutyid = dutyid;
		boolean oldDutyidESet = (_booleanFlags & DUTYID_ESETFLAG) != 0;
		dutyid = DUTYID_EDEFAULT;
		_booleanFlags &= ~DUTYID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__DUTYID, oldDutyid,
								DUTYID_EDEFAULT, oldDutyidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__DUTYID, oldDutyid,
						DUTYID_EDEFAULT, oldDutyidESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDutyid() {
		return (_booleanFlags & DUTYID_ESETFLAG) != 0;
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
								CclmsPackage.OUTLINK_ENGINE__TRAINID,
								oldTrainid, trainid, !oldTrainidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__TRAINID, oldTrainid,
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
								CclmsPackage.OUTLINK_ENGINE__TRAINID,
								oldTrainid, TRAINID_EDEFAULT, oldTrainidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__TRAINID, oldTrainid,
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
								CclmsPackage.OUTLINK_ENGINE__LEGID, oldLegid,
								legid, !oldLegidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__LEGID, oldLegid, legid,
						!oldLegidESet));
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
								CclmsPackage.OUTLINK_ENGINE__LEGID, oldLegid,
								LEGID_EDEFAULT, oldLegidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__LEGID, oldLegid,
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
								CclmsPackage.OUTLINK_ENGINE__STARTLOC,
								oldStartloc, startloc, !oldStartlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__STARTLOC, oldStartloc,
						startloc, !oldStartlocESet));
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
								CclmsPackage.OUTLINK_ENGINE__STARTLOC,
								oldStartloc, STARTLOC_EDEFAULT, oldStartlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__STARTLOC, oldStartloc,
						STARTLOC_EDEFAULT, oldStartlocESet));
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
								CclmsPackage.OUTLINK_ENGINE__ENDLOC, oldEndloc,
								endloc, !oldEndlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__ENDLOC, oldEndloc, endloc,
						!oldEndlocESet));
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
								CclmsPackage.OUTLINK_ENGINE__ENDLOC, oldEndloc,
								ENDLOC_EDEFAULT, oldEndlocESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__ENDLOC, oldEndloc,
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
	public int getDutysignon() {
		return dutysignon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDutysignon(int newDutysignon) {
		int oldDutysignon = dutysignon;
		dutysignon = newDutysignon;
		boolean oldDutysignonESet = (_booleanFlags & DUTYSIGNON_ESETFLAG) != 0;
		_booleanFlags |= DUTYSIGNON_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON,
								oldDutysignon, dutysignon, !oldDutysignonESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON, oldDutysignon,
						dutysignon, !oldDutysignonESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDutysignon() {
		int oldDutysignon = dutysignon;
		boolean oldDutysignonESet = (_booleanFlags & DUTYSIGNON_ESETFLAG) != 0;
		dutysignon = DUTYSIGNON_EDEFAULT;
		_booleanFlags &= ~DUTYSIGNON_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON,
								oldDutysignon, DUTYSIGNON_EDEFAULT,
								oldDutysignonESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON, oldDutysignon,
						DUTYSIGNON_EDEFAULT, oldDutysignonESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDutysignon() {
		return (_booleanFlags & DUTYSIGNON_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStarttime() {
		return starttime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarttime(int newStarttime) {
		int oldStarttime = starttime;
		starttime = newStarttime;
		boolean oldStarttimeESet = (_booleanFlags & STARTTIME_ESETFLAG) != 0;
		_booleanFlags |= STARTTIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__STARTTIME,
								oldStarttime, starttime, !oldStarttimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__STARTTIME, oldStarttime,
						starttime, !oldStarttimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStarttime() {
		int oldStarttime = starttime;
		boolean oldStarttimeESet = (_booleanFlags & STARTTIME_ESETFLAG) != 0;
		starttime = STARTTIME_EDEFAULT;
		_booleanFlags &= ~STARTTIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__STARTTIME,
								oldStarttime, STARTTIME_EDEFAULT,
								oldStarttimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__STARTTIME, oldStarttime,
						STARTTIME_EDEFAULT, oldStarttimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStarttime() {
		return (_booleanFlags & STARTTIME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEndtime() {
		return endtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndtime(int newEndtime) {
		int oldEndtime = endtime;
		endtime = newEndtime;
		boolean oldEndtimeESet = (_booleanFlags & ENDTIME_ESETFLAG) != 0;
		_booleanFlags |= ENDTIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__ENDTIME,
								oldEndtime, endtime, !oldEndtimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__ENDTIME, oldEndtime,
						endtime, !oldEndtimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndtime() {
		int oldEndtime = endtime;
		boolean oldEndtimeESet = (_booleanFlags & ENDTIME_ESETFLAG) != 0;
		endtime = ENDTIME_EDEFAULT;
		_booleanFlags &= ~ENDTIME_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__ENDTIME,
								oldEndtime, ENDTIME_EDEFAULT, oldEndtimeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__ENDTIME, oldEndtime,
						ENDTIME_EDEFAULT, oldEndtimeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndtime() {
		return (_booleanFlags & ENDTIME_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDutysignoff() {
		return dutysignoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDutysignoff(int newDutysignoff) {
		int oldDutysignoff = dutysignoff;
		dutysignoff = newDutysignoff;
		boolean oldDutysignoffESet = (_booleanFlags & DUTYSIGNOFF_ESETFLAG) != 0;
		_booleanFlags |= DUTYSIGNOFF_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF,
								oldDutysignoff, dutysignoff,
								!oldDutysignoffESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF,
						oldDutysignoff, dutysignoff, !oldDutysignoffESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDutysignoff() {
		int oldDutysignoff = dutysignoff;
		boolean oldDutysignoffESet = (_booleanFlags & DUTYSIGNOFF_ESETFLAG) != 0;
		dutysignoff = DUTYSIGNOFF_EDEFAULT;
		_booleanFlags &= ~DUTYSIGNOFF_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF,
								oldDutysignoff, DUTYSIGNOFF_EDEFAULT,
								oldDutysignoffESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF,
						oldDutysignoff, DUTYSIGNOFF_EDEFAULT,
						oldDutysignoffESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDutysignoff() {
		return (_booleanFlags & DUTYSIGNOFF_ESETFLAG) != 0;
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
								CclmsPackage.OUTLINK_ENGINE__DURATION,
								oldDuration, duration, !oldDurationESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__DURATION, oldDuration,
						duration, !oldDurationESet));
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
								CclmsPackage.OUTLINK_ENGINE__DURATION,
								oldDuration, DURATION_EDEFAULT, oldDurationESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__DURATION, oldDuration,
						DURATION_EDEFAULT, oldDurationESet));
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
	public int getNib() {
		return nib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNib(int newNib) {
		int oldNib = nib;
		nib = newNib;
		boolean oldNibESet = (_booleanFlags & NIB_ESETFLAG) != 0;
		_booleanFlags |= NIB_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__NIB, oldNib, nib,
								!oldNibESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__NIB, oldNib, nib,
						!oldNibESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNib() {
		int oldNib = nib;
		boolean oldNibESet = (_booleanFlags & NIB_ESETFLAG) != 0;
		nib = NIB_EDEFAULT;
		_booleanFlags &= ~NIB_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__NIB, oldNib,
								NIB_EDEFAULT, oldNibESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__NIB, oldNib, NIB_EDEFAULT,
						oldNibESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNib() {
		return (_booleanFlags & NIB_ESETFLAG) != 0;
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
								CclmsPackage.OUTLINK_ENGINE__SPAREFLAG,
								oldSpareflag, spareflag, !oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__SPAREFLAG, oldSpareflag,
						spareflag, !oldSpareflagESet));
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
								CclmsPackage.OUTLINK_ENGINE__SPAREFLAG,
								oldSpareflag, SPAREFLAG_EDEFAULT,
								oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__SPAREFLAG, oldSpareflag,
						SPAREFLAG_EDEFAULT, oldSpareflagESet));
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
	public int getSortorder() {
		return sortorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortorder(int newSortorder) {
		int oldSortorder = sortorder;
		sortorder = newSortorder;
		boolean oldSortorderESet = (_booleanFlags & SORTORDER_ESETFLAG) != 0;
		_booleanFlags |= SORTORDER_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.OUTLINK_ENGINE__SORTORDER,
								oldSortorder, sortorder, !oldSortorderESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.OUTLINK_ENGINE__SORTORDER, oldSortorder,
						sortorder, !oldSortorderESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortorder() {
		int oldSortorder = sortorder;
		boolean oldSortorderESet = (_booleanFlags & SORTORDER_ESETFLAG) != 0;
		sortorder = SORTORDER_EDEFAULT;
		_booleanFlags &= ~SORTORDER_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.OUTLINK_ENGINE__SORTORDER,
								oldSortorder, SORTORDER_EDEFAULT,
								oldSortorderESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.OUTLINK_ENGINE__SORTORDER, oldSortorder,
						SORTORDER_EDEFAULT, oldSortorderESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSortorder() {
		return (_booleanFlags & SORTORDER_ESETFLAG) != 0;
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
		case CclmsPackage.OUTLINK_ENGINE__DAYID:
			return getDayid();
		case CclmsPackage.OUTLINK_ENGINE__SEQID:
			return getSeqid();
		case CclmsPackage.OUTLINK_ENGINE__PAIRINGID:
			return getPairingid();
		case CclmsPackage.OUTLINK_ENGINE__DUTYID:
			return getDutyid();
		case CclmsPackage.OUTLINK_ENGINE__TRAINID:
			return getTrainid();
		case CclmsPackage.OUTLINK_ENGINE__LEGID:
			return getLegid();
		case CclmsPackage.OUTLINK_ENGINE__STARTLOC:
			return getStartloc();
		case CclmsPackage.OUTLINK_ENGINE__ENDLOC:
			return getEndloc();
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON:
			return getDutysignon();
		case CclmsPackage.OUTLINK_ENGINE__STARTTIME:
			return getStarttime();
		case CclmsPackage.OUTLINK_ENGINE__ENDTIME:
			return getEndtime();
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF:
			return getDutysignoff();
		case CclmsPackage.OUTLINK_ENGINE__DURATION:
			return getDuration();
		case CclmsPackage.OUTLINK_ENGINE__NIB:
			return getNib();
		case CclmsPackage.OUTLINK_ENGINE__SPAREFLAG:
			return getSpareflag();
		case CclmsPackage.OUTLINK_ENGINE__SORTORDER:
			return getSortorder();
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
		case CclmsPackage.OUTLINK_ENGINE__DAYID:
			setDayid((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__SEQID:
			setSeqid((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__PAIRINGID:
			setPairingid((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__DUTYID:
			setDutyid((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__TRAINID:
			setTrainid((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__LEGID:
			setLegid((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__STARTLOC:
			setStartloc((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__ENDLOC:
			setEndloc((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON:
			setDutysignon((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__STARTTIME:
			setStarttime((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__ENDTIME:
			setEndtime((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF:
			setDutysignoff((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__DURATION:
			setDuration((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__NIB:
			setNib((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__SPAREFLAG:
			setSpareflag((Integer) newValue);
			return;
		case CclmsPackage.OUTLINK_ENGINE__SORTORDER:
			setSortorder((Integer) newValue);
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
		case CclmsPackage.OUTLINK_ENGINE__DAYID:
			unsetDayid();
			return;
		case CclmsPackage.OUTLINK_ENGINE__SEQID:
			unsetSeqid();
			return;
		case CclmsPackage.OUTLINK_ENGINE__PAIRINGID:
			unsetPairingid();
			return;
		case CclmsPackage.OUTLINK_ENGINE__DUTYID:
			unsetDutyid();
			return;
		case CclmsPackage.OUTLINK_ENGINE__TRAINID:
			unsetTrainid();
			return;
		case CclmsPackage.OUTLINK_ENGINE__LEGID:
			unsetLegid();
			return;
		case CclmsPackage.OUTLINK_ENGINE__STARTLOC:
			unsetStartloc();
			return;
		case CclmsPackage.OUTLINK_ENGINE__ENDLOC:
			unsetEndloc();
			return;
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON:
			unsetDutysignon();
			return;
		case CclmsPackage.OUTLINK_ENGINE__STARTTIME:
			unsetStarttime();
			return;
		case CclmsPackage.OUTLINK_ENGINE__ENDTIME:
			unsetEndtime();
			return;
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF:
			unsetDutysignoff();
			return;
		case CclmsPackage.OUTLINK_ENGINE__DURATION:
			unsetDuration();
			return;
		case CclmsPackage.OUTLINK_ENGINE__NIB:
			unsetNib();
			return;
		case CclmsPackage.OUTLINK_ENGINE__SPAREFLAG:
			unsetSpareflag();
			return;
		case CclmsPackage.OUTLINK_ENGINE__SORTORDER:
			unsetSortorder();
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
		case CclmsPackage.OUTLINK_ENGINE__DAYID:
			return isSetDayid();
		case CclmsPackage.OUTLINK_ENGINE__SEQID:
			return isSetSeqid();
		case CclmsPackage.OUTLINK_ENGINE__PAIRINGID:
			return isSetPairingid();
		case CclmsPackage.OUTLINK_ENGINE__DUTYID:
			return isSetDutyid();
		case CclmsPackage.OUTLINK_ENGINE__TRAINID:
			return isSetTrainid();
		case CclmsPackage.OUTLINK_ENGINE__LEGID:
			return isSetLegid();
		case CclmsPackage.OUTLINK_ENGINE__STARTLOC:
			return isSetStartloc();
		case CclmsPackage.OUTLINK_ENGINE__ENDLOC:
			return isSetEndloc();
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNON:
			return isSetDutysignon();
		case CclmsPackage.OUTLINK_ENGINE__STARTTIME:
			return isSetStarttime();
		case CclmsPackage.OUTLINK_ENGINE__ENDTIME:
			return isSetEndtime();
		case CclmsPackage.OUTLINK_ENGINE__DUTYSIGNOFF:
			return isSetDutysignoff();
		case CclmsPackage.OUTLINK_ENGINE__DURATION:
			return isSetDuration();
		case CclmsPackage.OUTLINK_ENGINE__NIB:
			return isSetNib();
		case CclmsPackage.OUTLINK_ENGINE__SPAREFLAG:
			return isSetSpareflag();
		case CclmsPackage.OUTLINK_ENGINE__SORTORDER:
			return isSetSortorder();
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
		result.append(" (dayid: ");
		if ((_booleanFlags & DAYID_ESETFLAG) != 0)
			result.append(dayid);
		else
			result.append("<unset>");
		result.append(", seqid: ");
		if ((_booleanFlags & SEQID_ESETFLAG) != 0)
			result.append(seqid);
		else
			result.append("<unset>");
		result.append(", pairingid: ");
		if ((_booleanFlags & PAIRINGID_ESETFLAG) != 0)
			result.append(pairingid);
		else
			result.append("<unset>");
		result.append(", dutyid: ");
		if ((_booleanFlags & DUTYID_ESETFLAG) != 0)
			result.append(dutyid);
		else
			result.append("<unset>");
		result.append(", trainid: ");
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
		result.append(", dutysignon: ");
		if ((_booleanFlags & DUTYSIGNON_ESETFLAG) != 0)
			result.append(dutysignon);
		else
			result.append("<unset>");
		result.append(", starttime: ");
		if ((_booleanFlags & STARTTIME_ESETFLAG) != 0)
			result.append(starttime);
		else
			result.append("<unset>");
		result.append(", endtime: ");
		if ((_booleanFlags & ENDTIME_ESETFLAG) != 0)
			result.append(endtime);
		else
			result.append("<unset>");
		result.append(", dutysignoff: ");
		if ((_booleanFlags & DUTYSIGNOFF_ESETFLAG) != 0)
			result.append(dutysignoff);
		else
			result.append("<unset>");
		result.append(", duration: ");
		if ((_booleanFlags & DURATION_ESETFLAG) != 0)
			result.append(duration);
		else
			result.append("<unset>");
		result.append(", nib: ");
		if ((_booleanFlags & NIB_ESETFLAG) != 0)
			result.append(nib);
		else
			result.append("<unset>");
		result.append(", spareflag: ");
		if ((_booleanFlags & SPAREFLAG_ESETFLAG) != 0)
			result.append(spareflag);
		else
			result.append("<unset>");
		result.append(", sortorder: ");
		if ((_booleanFlags & SORTORDER_ESETFLAG) != 0)
			result.append(sortorder);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OutlinkEngineImpl
