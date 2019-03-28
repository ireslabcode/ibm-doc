/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.LinkDetailEngine;

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
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getDayname <em>Dayname</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getSeqid <em>Seqid</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getTrainno <em>Trainno</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getFromstation <em>Fromstation</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getTostation <em>Tostation</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getSignontime <em>Signontime</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getDeparturetime <em>Departuretime</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getArrivaltime <em>Arrivaltime</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getSignofftime <em>Signofftime</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getDutydurtion <em>Dutydurtion</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getDutyminutes <em>Dutyminutes</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getNib <em>Nib</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getSortorder <em>Sortorder</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getDayid <em>Dayid</em>}</li>
 *   <li>{@link cclms.impl.LinkDetailEngineImpl#getSpareflag <em>Spareflag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkDetailEngineImpl extends IloDomObjectImpl implements
		LinkDetailEngine {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getDayname() <em>Dayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayname()
	 * @generated
	 * @ordered
	 */
	protected static final String DAYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayname() <em>Dayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayname()
	 * @generated
	 * @ordered
	 */
	protected String dayname = DAYNAME_EDEFAULT;

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
	protected static final int SEQID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getTrainno() <em>Trainno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainno()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAINNO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainno() <em>Trainno</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainno()
	 * @generated
	 * @ordered
	 */
	protected String trainno = TRAINNO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromstation() <em>Fromstation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromstation()
	 * @generated
	 * @ordered
	 */
	protected static final String FROMSTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromstation() <em>Fromstation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromstation()
	 * @generated
	 * @ordered
	 */
	protected String fromstation = FROMSTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTostation() <em>Tostation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTostation()
	 * @generated
	 * @ordered
	 */
	protected static final String TOSTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTostation() <em>Tostation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTostation()
	 * @generated
	 * @ordered
	 */
	protected String tostation = TOSTATION_EDEFAULT;

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
	 * The default value of the '{@link #getDeparturetime() <em>Departuretime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparturetime()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTURETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeparturetime() <em>Departuretime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeparturetime()
	 * @generated
	 * @ordered
	 */
	protected String departuretime = DEPARTURETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivaltime() <em>Arrivaltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivaltime()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVALTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivaltime() <em>Arrivaltime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivaltime()
	 * @generated
	 * @ordered
	 */
	protected String arrivaltime = ARRIVALTIME_EDEFAULT;

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
	 * The default value of the '{@link #getDutydurtion() <em>Dutydurtion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutydurtion()
	 * @generated
	 * @ordered
	 */
	protected static final String DUTYDURTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDutydurtion() <em>Dutydurtion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutydurtion()
	 * @generated
	 * @ordered
	 */
	protected String dutydurtion = DUTYDURTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDutyminutes() <em>Dutyminutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutyminutes()
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYMINUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDutyminutes() <em>Dutyminutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDutyminutes()
	 * @generated
	 * @ordered
	 */
	protected int dutyminutes = DUTYMINUTES_EDEFAULT;

	/**
	 * The flag representing whether the Dutyminutes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int DUTYMINUTES_ESETFLAG = 1 << 1;

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
	protected static final int DISTANCE_ESETFLAG = 1 << 2;

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
	protected static final int NIB_ESETFLAG = 1 << 3;

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
	protected static final int SORTORDER_ESETFLAG = 1 << 4;

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
	protected static final int DAYID_ESETFLAG = 1 << 5;

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
	protected static final int SPAREFLAG_ESETFLAG = 1 << 6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDetailEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.LINK_DETAIL_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDayname() {
		return dayname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayname(String newDayname) {
		String oldDayname = dayname;
		dayname = newDayname;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__DAYNAME,
								oldDayname, dayname);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__DAYNAME, oldDayname,
						dayname));
			}
		}
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
								CclmsPackage.LINK_DETAIL_ENGINE__SEQID,
								oldSeqid, seqid, !oldSeqidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__SEQID, oldSeqid,
						seqid, !oldSeqidESet));
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
								CclmsPackage.LINK_DETAIL_ENGINE__SEQID,
								oldSeqid, SEQID_EDEFAULT, oldSeqidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_DETAIL_ENGINE__SEQID, oldSeqid,
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
	public String getTrainno() {
		return trainno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainno(String newTrainno) {
		String oldTrainno = trainno;
		trainno = newTrainno;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__TRAINNO,
								oldTrainno, trainno);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__TRAINNO, oldTrainno,
						trainno));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromstation() {
		return fromstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromstation(String newFromstation) {
		String oldFromstation = fromstation;
		fromstation = newFromstation;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__FROMSTATION,
								oldFromstation, fromstation);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__FROMSTATION,
						oldFromstation, fromstation));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTostation() {
		return tostation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTostation(String newTostation) {
		String oldTostation = tostation;
		tostation = newTostation;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__TOSTATION,
								oldTostation, tostation);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__TOSTATION,
						oldTostation, tostation));
			}
		}
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
								CclmsPackage.LINK_DETAIL_ENGINE__SIGNONTIME,
								oldSignontime, signontime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__SIGNONTIME,
						oldSignontime, signontime));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeparturetime() {
		return departuretime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeparturetime(String newDeparturetime) {
		String oldDeparturetime = departuretime;
		departuretime = newDeparturetime;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__DEPARTURETIME,
								oldDeparturetime, departuretime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__DEPARTURETIME,
						oldDeparturetime, departuretime));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrivaltime() {
		return arrivaltime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivaltime(String newArrivaltime) {
		String oldArrivaltime = arrivaltime;
		arrivaltime = newArrivaltime;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__ARRIVALTIME,
								oldArrivaltime, arrivaltime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__ARRIVALTIME,
						oldArrivaltime, arrivaltime));
			}
		}
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
								CclmsPackage.LINK_DETAIL_ENGINE__SIGNOFFTIME,
								oldSignofftime, signofftime);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__SIGNOFFTIME,
						oldSignofftime, signofftime));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDutydurtion() {
		return dutydurtion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDutydurtion(String newDutydurtion) {
		String oldDutydurtion = dutydurtion;
		dutydurtion = newDutydurtion;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__DUTYDURTION,
								oldDutydurtion, dutydurtion);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__DUTYDURTION,
						oldDutydurtion, dutydurtion));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDutyminutes() {
		return dutyminutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDutyminutes(int newDutyminutes) {
		int oldDutyminutes = dutyminutes;
		dutyminutes = newDutyminutes;
		boolean oldDutyminutesESet = (_booleanFlags & DUTYMINUTES_ESETFLAG) != 0;
		_booleanFlags |= DUTYMINUTES_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES,
								oldDutyminutes, dutyminutes,
								!oldDutyminutesESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES,
						oldDutyminutes, dutyminutes, !oldDutyminutesESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDutyminutes() {
		int oldDutyminutes = dutyminutes;
		boolean oldDutyminutesESet = (_booleanFlags & DUTYMINUTES_ESETFLAG) != 0;
		dutyminutes = DUTYMINUTES_EDEFAULT;
		_booleanFlags &= ~DUTYMINUTES_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES,
								oldDutyminutes, DUTYMINUTES_EDEFAULT,
								oldDutyminutesESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES,
						oldDutyminutes, DUTYMINUTES_EDEFAULT,
						oldDutyminutesESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDutyminutes() {
		return (_booleanFlags & DUTYMINUTES_ESETFLAG) != 0;
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
								CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE,
								oldDistance, distance, !oldDistanceESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE, oldDistance,
						distance, !oldDistanceESet));
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
								CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE,
								oldDistance, DISTANCE_EDEFAULT, oldDistanceESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE, oldDistance,
						DISTANCE_EDEFAULT, oldDistanceESet));
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
								CclmsPackage.LINK_DETAIL_ENGINE__NIB, oldNib,
								nib, !oldNibESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__NIB, oldNib, nib,
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
								CclmsPackage.LINK_DETAIL_ENGINE__NIB, oldNib,
								NIB_EDEFAULT, oldNibESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_DETAIL_ENGINE__NIB, oldNib,
						NIB_EDEFAULT, oldNibESet));
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
								CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER,
								oldSortorder, sortorder, !oldSortorderESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER,
						oldSortorder, sortorder, !oldSortorderESet));
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
								CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER,
								oldSortorder, SORTORDER_EDEFAULT,
								oldSortorderESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER,
						oldSortorder, SORTORDER_EDEFAULT, oldSortorderESet));
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
								CclmsPackage.LINK_DETAIL_ENGINE__DAYID,
								oldDayid, dayid, !oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__DAYID, oldDayid,
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
								CclmsPackage.LINK_DETAIL_ENGINE__DAYID,
								oldDayid, DAYID_EDEFAULT, oldDayidESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_DETAIL_ENGINE__DAYID, oldDayid,
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
								CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG,
								oldSpareflag, spareflag, !oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG,
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
								CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG,
								oldSpareflag, SPAREFLAG_EDEFAULT,
								oldSpareflagESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG,
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
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYNAME:
			return getDayname();
		case CclmsPackage.LINK_DETAIL_ENGINE__SEQID:
			return getSeqid();
		case CclmsPackage.LINK_DETAIL_ENGINE__TRAINNO:
			return getTrainno();
		case CclmsPackage.LINK_DETAIL_ENGINE__FROMSTATION:
			return getFromstation();
		case CclmsPackage.LINK_DETAIL_ENGINE__TOSTATION:
			return getTostation();
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNONTIME:
			return getSignontime();
		case CclmsPackage.LINK_DETAIL_ENGINE__DEPARTURETIME:
			return getDeparturetime();
		case CclmsPackage.LINK_DETAIL_ENGINE__ARRIVALTIME:
			return getArrivaltime();
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNOFFTIME:
			return getSignofftime();
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYDURTION:
			return getDutydurtion();
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES:
			return getDutyminutes();
		case CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE:
			return getDistance();
		case CclmsPackage.LINK_DETAIL_ENGINE__NIB:
			return getNib();
		case CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER:
			return getSortorder();
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYID:
			return getDayid();
		case CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG:
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
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYNAME:
			setDayname((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SEQID:
			setSeqid((Integer) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__TRAINNO:
			setTrainno((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__FROMSTATION:
			setFromstation((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__TOSTATION:
			setTostation((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNONTIME:
			setSignontime((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DEPARTURETIME:
			setDeparturetime((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__ARRIVALTIME:
			setArrivaltime((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNOFFTIME:
			setSignofftime((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYDURTION:
			setDutydurtion((String) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES:
			setDutyminutes((Integer) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE:
			setDistance((Integer) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__NIB:
			setNib((Integer) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER:
			setSortorder((Integer) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYID:
			setDayid((Integer) newValue);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG:
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
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYNAME:
			setDayname(DAYNAME_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SEQID:
			unsetSeqid();
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__TRAINNO:
			setTrainno(TRAINNO_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__FROMSTATION:
			setFromstation(FROMSTATION_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__TOSTATION:
			setTostation(TOSTATION_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNONTIME:
			setSignontime(SIGNONTIME_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DEPARTURETIME:
			setDeparturetime(DEPARTURETIME_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__ARRIVALTIME:
			setArrivaltime(ARRIVALTIME_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNOFFTIME:
			setSignofftime(SIGNOFFTIME_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYDURTION:
			setDutydurtion(DUTYDURTION_EDEFAULT);
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES:
			unsetDutyminutes();
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE:
			unsetDistance();
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__NIB:
			unsetNib();
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER:
			unsetSortorder();
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYID:
			unsetDayid();
			return;
		case CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG:
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
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYNAME:
			return DAYNAME_EDEFAULT == null ? dayname != null
					: !DAYNAME_EDEFAULT.equals(dayname);
		case CclmsPackage.LINK_DETAIL_ENGINE__SEQID:
			return isSetSeqid();
		case CclmsPackage.LINK_DETAIL_ENGINE__TRAINNO:
			return TRAINNO_EDEFAULT == null ? trainno != null
					: !TRAINNO_EDEFAULT.equals(trainno);
		case CclmsPackage.LINK_DETAIL_ENGINE__FROMSTATION:
			return FROMSTATION_EDEFAULT == null ? fromstation != null
					: !FROMSTATION_EDEFAULT.equals(fromstation);
		case CclmsPackage.LINK_DETAIL_ENGINE__TOSTATION:
			return TOSTATION_EDEFAULT == null ? tostation != null
					: !TOSTATION_EDEFAULT.equals(tostation);
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNONTIME:
			return SIGNONTIME_EDEFAULT == null ? signontime != null
					: !SIGNONTIME_EDEFAULT.equals(signontime);
		case CclmsPackage.LINK_DETAIL_ENGINE__DEPARTURETIME:
			return DEPARTURETIME_EDEFAULT == null ? departuretime != null
					: !DEPARTURETIME_EDEFAULT.equals(departuretime);
		case CclmsPackage.LINK_DETAIL_ENGINE__ARRIVALTIME:
			return ARRIVALTIME_EDEFAULT == null ? arrivaltime != null
					: !ARRIVALTIME_EDEFAULT.equals(arrivaltime);
		case CclmsPackage.LINK_DETAIL_ENGINE__SIGNOFFTIME:
			return SIGNOFFTIME_EDEFAULT == null ? signofftime != null
					: !SIGNOFFTIME_EDEFAULT.equals(signofftime);
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYDURTION:
			return DUTYDURTION_EDEFAULT == null ? dutydurtion != null
					: !DUTYDURTION_EDEFAULT.equals(dutydurtion);
		case CclmsPackage.LINK_DETAIL_ENGINE__DUTYMINUTES:
			return isSetDutyminutes();
		case CclmsPackage.LINK_DETAIL_ENGINE__DISTANCE:
			return isSetDistance();
		case CclmsPackage.LINK_DETAIL_ENGINE__NIB:
			return isSetNib();
		case CclmsPackage.LINK_DETAIL_ENGINE__SORTORDER:
			return isSetSortorder();
		case CclmsPackage.LINK_DETAIL_ENGINE__DAYID:
			return isSetDayid();
		case CclmsPackage.LINK_DETAIL_ENGINE__SPAREFLAG:
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
		result.append(" (dayname: ");
		result.append(dayname);
		result.append(", seqid: ");
		if ((_booleanFlags & SEQID_ESETFLAG) != 0)
			result.append(seqid);
		else
			result.append("<unset>");
		result.append(", trainno: ");
		result.append(trainno);
		result.append(", fromstation: ");
		result.append(fromstation);
		result.append(", tostation: ");
		result.append(tostation);
		result.append(", signontime: ");
		result.append(signontime);
		result.append(", departuretime: ");
		result.append(departuretime);
		result.append(", arrivaltime: ");
		result.append(arrivaltime);
		result.append(", signofftime: ");
		result.append(signofftime);
		result.append(", dutydurtion: ");
		result.append(dutydurtion);
		result.append(", dutyminutes: ");
		if ((_booleanFlags & DUTYMINUTES_ESETFLAG) != 0)
			result.append(dutyminutes);
		else
			result.append("<unset>");
		result.append(", distance: ");
		if ((_booleanFlags & DISTANCE_ESETFLAG) != 0)
			result.append(distance);
		else
			result.append("<unset>");
		result.append(", nib: ");
		if ((_booleanFlags & NIB_ESETFLAG) != 0)
			result.append(nib);
		else
			result.append("<unset>");
		result.append(", sortorder: ");
		if ((_booleanFlags & SORTORDER_ESETFLAG) != 0)
			result.append(sortorder);
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

} //LinkDetailEngineImpl
