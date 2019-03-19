/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.LinkDetail;
import cclms.StationMst;
import cclms.TrainFrequencyMst;
import cclms.TrainMst;

import cclms.TrainSegmentMst;
import cclms.TrainTypeMappingMst;
import ilog.odm.dom.impl.IloDomObjectImpl;

import ilog.odm.dom.impl.resource.IloDomObjectContainmentEList;
import ilog.odm.dom.impl.resource.IloDomObjectWithInverseEList;
import java.sql.Date;

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
 *   <li>{@link cclms.impl.TrainMstImpl#getTrainId <em>Train Id</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getTrainNbr <em>Train Nbr</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getTrainName <em>Train Name</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getTrainSubType <em>Train Sub Type</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getTrainRunType <em>Train Run Type</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getRakeId <em>Rake Id</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getDayOfService <em>Day Of Service</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getBaseTraction <em>Base Traction</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getRefTrainEndStn <em>Ref Train End Stn</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getRefTrainStartStn <em>Ref Train Start Stn</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getRefTrainFrequencyCd <em>Ref Train Frequency Cd</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getRefTrainType <em>Ref Train Type</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getRefLinkDetailTrainId <em>Ref Link Detail Train Id</em>}</li>
 *   <li>{@link cclms.impl.TrainMstImpl#getRefTrainSegmentMstTrainId <em>Ref Train Segment Mst Train Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainMstImpl extends IloDomObjectImpl implements TrainMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getTrainId() <em>Train Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainId()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrainId() <em>Train Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainId()
	 * @generated
	 * @ordered
	 */
	protected int trainId = TRAIN_ID_EDEFAULT;

	/**
	 * The flag representing whether the Train Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getTrainNbr() <em>Train Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainNbr() <em>Train Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainNbr()
	 * @generated
	 * @ordered
	 */
	protected String trainNbr = TRAIN_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainName() <em>Train Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainName() <em>Train Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainName()
	 * @generated
	 * @ordered
	 */
	protected String trainName = TRAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainSubType() <em>Train Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainSubType() <em>Train Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSubType()
	 * @generated
	 * @ordered
	 */
	protected String trainSubType = TRAIN_SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainRunType() <em>Train Run Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainRunType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_RUN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainRunType() <em>Train Run Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainRunType()
	 * @generated
	 * @ordered
	 */
	protected String trainRunType = TRAIN_RUN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRakeId() <em>Rake Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRakeId()
	 * @generated
	 * @ordered
	 */
	protected static final int RAKE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRakeId() <em>Rake Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRakeId()
	 * @generated
	 * @ordered
	 */
	protected int rakeId = RAKE_ID_EDEFAULT;

	/**
	 * The flag representing whether the Rake Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int RAKE_ID_ESETFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #getDayOfService() <em>Day Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfService()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_OF_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayOfService() <em>Day Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfService()
	 * @generated
	 * @ordered
	 */
	protected String dayOfService = DAY_OF_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected Date validFrom = VALID_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidTo() <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidTo() <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected Date validTo = VALID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseTraction() <em>Base Traction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTraction()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_TRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseTraction() <em>Base Traction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTraction()
	 * @generated
	 * @ordered
	 */
	protected String baseTraction = BASE_TRACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefTrainEndStn() <em>Ref Train End Stn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainEndStn()
	 * @generated
	 * @ordered
	 */
	protected StationMst refTrainEndStn;

	/**
	 * The cached value of the '{@link #getRefTrainStartStn() <em>Ref Train Start Stn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainStartStn()
	 * @generated
	 * @ordered
	 */
	protected StationMst refTrainStartStn;

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
	 * The cached value of the '{@link #getRefTrainType() <em>Ref Train Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainType()
	 * @generated
	 * @ordered
	 */
	protected TrainTypeMappingMst refTrainType;

	/**
	 * The cached value of the '{@link #getRefLinkDetailTrainId() <em>Ref Link Detail Train Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkDetailTrainId()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkDetail> refLinkDetailTrainId;

	/**
	 * The cached value of the '{@link #getRefTrainSegmentMstTrainId() <em>Ref Train Segment Mst Train Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainSegmentMstTrainId()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentMst> refTrainSegmentMstTrainId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.TRAIN_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrainId() {
		return trainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainId(int newTrainId) {
		int oldTrainId = trainId;
		trainId = newTrainId;
		boolean oldTrainIdESet = (_booleanFlags & TRAIN_ID_ESETFLAG) != 0;
		_booleanFlags |= TRAIN_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__TRAIN_ID, oldTrainId,
								trainId, !oldTrainIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__TRAIN_ID, oldTrainId, trainId,
						!oldTrainIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrainId() {
		int oldTrainId = trainId;
		boolean oldTrainIdESet = (_booleanFlags & TRAIN_ID_ESETFLAG) != 0;
		trainId = TRAIN_ID_EDEFAULT;
		_booleanFlags &= ~TRAIN_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_MST__TRAIN_ID, oldTrainId,
								TRAIN_ID_EDEFAULT, oldTrainIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_MST__TRAIN_ID, oldTrainId,
						TRAIN_ID_EDEFAULT, oldTrainIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrainId() {
		return (_booleanFlags & TRAIN_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainNbr() {
		return trainNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainNbr(String newTrainNbr) {
		String oldTrainNbr = trainNbr;
		trainNbr = newTrainNbr;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__TRAIN_NBR, oldTrainNbr,
								trainNbr);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__TRAIN_NBR, oldTrainNbr,
						trainNbr));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainName() {
		return trainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainName(String newTrainName) {
		String oldTrainName = trainName;
		trainName = newTrainName;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__TRAIN_NAME,
								oldTrainName, trainName);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__TRAIN_NAME, oldTrainName,
						trainName));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainSubType() {
		return trainSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainSubType(String newTrainSubType) {
		String oldTrainSubType = trainSubType;
		trainSubType = newTrainSubType;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__TRAIN_SUB_TYPE,
								oldTrainSubType, trainSubType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__TRAIN_SUB_TYPE,
						oldTrainSubType, trainSubType));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainRunType() {
		return trainRunType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainRunType(String newTrainRunType) {
		String oldTrainRunType = trainRunType;
		trainRunType = newTrainRunType;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__TRAIN_RUN_TYPE,
								oldTrainRunType, trainRunType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__TRAIN_RUN_TYPE,
						oldTrainRunType, trainRunType));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRakeId() {
		return rakeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRakeId(int newRakeId) {
		int oldRakeId = rakeId;
		rakeId = newRakeId;
		boolean oldRakeIdESet = (_booleanFlags & RAKE_ID_ESETFLAG) != 0;
		_booleanFlags |= RAKE_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__RAKE_ID, oldRakeId,
								rakeId, !oldRakeIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__RAKE_ID, oldRakeId, rakeId,
						!oldRakeIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRakeId() {
		int oldRakeId = rakeId;
		boolean oldRakeIdESet = (_booleanFlags & RAKE_ID_ESETFLAG) != 0;
		rakeId = RAKE_ID_EDEFAULT;
		_booleanFlags &= ~RAKE_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRAIN_MST__RAKE_ID, oldRakeId,
								RAKE_ID_EDEFAULT, oldRakeIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_MST__RAKE_ID, oldRakeId,
						RAKE_ID_EDEFAULT, oldRakeIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRakeId() {
		return (_booleanFlags & RAKE_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDayOfService() {
		return dayOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDayOfService(String newDayOfService) {
		String oldDayOfService = dayOfService;
		dayOfService = newDayOfService;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__DAY_OF_SERVICE,
								oldDayOfService, dayOfService);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__DAY_OF_SERVICE,
						oldDayOfService, dayOfService));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(Date newValidFrom) {
		Date oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__VALID_FROM,
								oldValidFrom, validFrom);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__VALID_FROM, oldValidFrom,
						validFrom));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidTo() {
		return validTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTo(Date newValidTo) {
		Date oldValidTo = validTo;
		validTo = newValidTo;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__VALID_TO, oldValidTo,
								validTo);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__VALID_TO, oldValidTo, validTo));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseTraction() {
		return baseTraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseTraction(String newBaseTraction) {
		String oldBaseTraction = baseTraction;
		baseTraction = newBaseTraction;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_MST__BASE_TRACTION,
								oldBaseTraction, baseTraction);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__BASE_TRACTION, oldBaseTraction,
						baseTraction));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefTrainEndStn() {
		return refTrainEndStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTrainEndStn(
			StationMst newRefTrainEndStn, NotificationChain msgs) {
		StationMst oldRefTrainEndStn = refTrainEndStn;
		refTrainEndStn = newRefTrainEndStn;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN,
								oldRefTrainEndStn, newRefTrainEndStn);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN,
						oldRefTrainEndStn, newRefTrainEndStn);
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
	public void setRefTrainEndStn(StationMst newRefTrainEndStn) {
		if (newRefTrainEndStn != refTrainEndStn) {
			NotificationChain msgs = null;
			if (refTrainEndStn != null)
				msgs = ((InternalEObject) refTrainEndStn).eInverseRemove(this,
						CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN,
						StationMst.class, msgs);
			if (newRefTrainEndStn != null)
				msgs = ((InternalEObject) newRefTrainEndStn).eInverseAdd(this,
						CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN,
						StationMst.class, msgs);
			msgs = basicSetRefTrainEndStn(newRefTrainEndStn, msgs);
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
								CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN,
								newRefTrainEndStn, newRefTrainEndStn);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN,
						newRefTrainEndStn, newRefTrainEndStn));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefTrainStartStn() {
		return refTrainStartStn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTrainStartStn(
			StationMst newRefTrainStartStn, NotificationChain msgs) {
		StationMst oldRefTrainStartStn = refTrainStartStn;
		refTrainStartStn = newRefTrainStartStn;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN,
								oldRefTrainStartStn, newRefTrainStartStn);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN,
						oldRefTrainStartStn, newRefTrainStartStn);
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
	public void setRefTrainStartStn(StationMst newRefTrainStartStn) {
		if (newRefTrainStartStn != refTrainStartStn) {
			NotificationChain msgs = null;
			if (refTrainStartStn != null)
				msgs = ((InternalEObject) refTrainStartStn)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN,
								StationMst.class, msgs);
			if (newRefTrainStartStn != null)
				msgs = ((InternalEObject) newRefTrainStartStn)
						.eInverseAdd(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN,
								StationMst.class, msgs);
			msgs = basicSetRefTrainStartStn(newRefTrainStartStn, msgs);
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
								CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN,
								newRefTrainStartStn, newRefTrainStartStn);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN,
						newRefTrainStartStn, newRefTrainStartStn));
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
								CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD,
								oldRefTrainFrequencyCd, newRefTrainFrequencyCd);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD,
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
								CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD,
								TrainFrequencyMst.class, msgs);
			if (newRefTrainFrequencyCd != null)
				msgs = ((InternalEObject) newRefTrainFrequencyCd)
						.eInverseAdd(
								this,
								CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD,
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
								CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD,
								newRefTrainFrequencyCd, newRefTrainFrequencyCd);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD,
						newRefTrainFrequencyCd, newRefTrainFrequencyCd));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMappingMst getRefTrainType() {
		return refTrainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTrainType(
			TrainTypeMappingMst newRefTrainType, NotificationChain msgs) {
		TrainTypeMappingMst oldRefTrainType = refTrainType;
		refTrainType = newRefTrainType;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE,
								oldRefTrainType, newRefTrainType);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE,
						oldRefTrainType, newRefTrainType);
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
	public void setRefTrainType(TrainTypeMappingMst newRefTrainType) {
		if (newRefTrainType != refTrainType) {
			NotificationChain msgs = null;
			if (refTrainType != null)
				msgs = ((InternalEObject) refTrainType)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_MST_TRAIN_TYPE,
								TrainTypeMappingMst.class, msgs);
			if (newRefTrainType != null)
				msgs = ((InternalEObject) newRefTrainType)
						.eInverseAdd(
								this,
								CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_MST_TRAIN_TYPE,
								TrainTypeMappingMst.class, msgs);
			msgs = basicSetRefTrainType(newRefTrainType, msgs);
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
								CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE,
								newRefTrainType, newRefTrainType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE,
						newRefTrainType, newRefTrainType));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getRefLinkDetailTrainId() {
		if (refLinkDetailTrainId == null) {
			refLinkDetailTrainId = new IloDomObjectWithInverseEList<LinkDetail>(
					LinkDetail.class, this,
					CclmsPackage.TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID,
					CclmsPackage.LINK_DETAIL__REF_TRAIN_ID);
		}
		return refLinkDetailTrainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getRefTrainSegmentMstTrainId() {
		if (refTrainSegmentMstTrainId == null) {
			refTrainSegmentMstTrainId = new IloDomObjectWithInverseEList<TrainSegmentMst>(
					TrainSegmentMst.class, this,
					CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID,
					CclmsPackage.TRAIN_SEGMENT_MST__REF_TRAIN_ID);
		}
		return refTrainSegmentMstTrainId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getTrainEndStn() {
		StationMst obj = getRefTrainEndStn();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainEndStn(StationMst obj) {
		setRefTrainEndStn(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getTrainStartStn() {
		StationMst obj = getRefTrainStartStn();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainStartStn(StationMst obj) {
		setRefTrainStartStn(obj);
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
	public TrainTypeMappingMst getTrainType() {
		TrainTypeMappingMst obj = getRefTrainType();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainType(TrainTypeMappingMst obj) {
		setRefTrainType(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkDetail> getLinkDetailTrainId() {
		return getRefLinkDetailTrainId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getTrainSegmentMstTrainId() {
		return getRefTrainSegmentMstTrainId();
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
		case CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN:
			if (refTrainEndStn != null)
				msgs = ((InternalEObject) refTrainEndStn).eInverseRemove(this,
						CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_END_STN,
						StationMst.class, msgs);
			return basicSetRefTrainEndStn((StationMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN:
			if (refTrainStartStn != null)
				msgs = ((InternalEObject) refTrainStartStn)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_TRAIN_MST_TRAIN_START_STN,
								StationMst.class, msgs);
			return basicSetRefTrainStartStn((StationMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD:
			if (refTrainFrequencyCd != null)
				msgs = ((InternalEObject) refTrainFrequencyCd)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD,
								TrainFrequencyMst.class, msgs);
			return basicSetRefTrainFrequencyCd((TrainFrequencyMst) otherEnd,
					msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE:
			if (refTrainType != null)
				msgs = ((InternalEObject) refTrainType)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_MST_TRAIN_TYPE,
								TrainTypeMappingMst.class, msgs);
			return basicSetRefTrainType((TrainTypeMappingMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkDetailTrainId())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainSegmentMstTrainId())
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
		case CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN:
			return basicSetRefTrainEndStn(null, msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN:
			return basicSetRefTrainStartStn(null, msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD:
			return basicSetRefTrainFrequencyCd(null, msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE:
			return basicSetRefTrainType(null, msgs);
		case CclmsPackage.TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID:
			return ((InternalEList<?>) getRefLinkDetailTrainId()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID:
			return ((InternalEList<?>) getRefTrainSegmentMstTrainId())
					.basicRemove(otherEnd, msgs);
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
		case CclmsPackage.TRAIN_MST__TRAIN_ID:
			return getTrainId();
		case CclmsPackage.TRAIN_MST__TRAIN_NBR:
			return getTrainNbr();
		case CclmsPackage.TRAIN_MST__TRAIN_NAME:
			return getTrainName();
		case CclmsPackage.TRAIN_MST__TRAIN_SUB_TYPE:
			return getTrainSubType();
		case CclmsPackage.TRAIN_MST__TRAIN_RUN_TYPE:
			return getTrainRunType();
		case CclmsPackage.TRAIN_MST__RAKE_ID:
			return getRakeId();
		case CclmsPackage.TRAIN_MST__DAY_OF_SERVICE:
			return getDayOfService();
		case CclmsPackage.TRAIN_MST__VALID_FROM:
			return getValidFrom();
		case CclmsPackage.TRAIN_MST__VALID_TO:
			return getValidTo();
		case CclmsPackage.TRAIN_MST__BASE_TRACTION:
			return getBaseTraction();
		case CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN:
			return getRefTrainEndStn();
		case CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN:
			return getRefTrainStartStn();
		case CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD:
			return getRefTrainFrequencyCd();
		case CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE:
			return getRefTrainType();
		case CclmsPackage.TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID:
			return getRefLinkDetailTrainId();
		case CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID:
			return getRefTrainSegmentMstTrainId();
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
		case CclmsPackage.TRAIN_MST__TRAIN_ID:
			setTrainId((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_NBR:
			setTrainNbr((String) newValue);
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_NAME:
			setTrainName((String) newValue);
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_SUB_TYPE:
			setTrainSubType((String) newValue);
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_RUN_TYPE:
			setTrainRunType((String) newValue);
			return;
		case CclmsPackage.TRAIN_MST__RAKE_ID:
			setRakeId((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_MST__DAY_OF_SERVICE:
			setDayOfService((String) newValue);
			return;
		case CclmsPackage.TRAIN_MST__VALID_FROM:
			setValidFrom((Date) newValue);
			return;
		case CclmsPackage.TRAIN_MST__VALID_TO:
			setValidTo((Date) newValue);
			return;
		case CclmsPackage.TRAIN_MST__BASE_TRACTION:
			setBaseTraction((String) newValue);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN:
			setRefTrainEndStn((StationMst) newValue);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN:
			setRefTrainStartStn((StationMst) newValue);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD:
			setRefTrainFrequencyCd((TrainFrequencyMst) newValue);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE:
			setRefTrainType((TrainTypeMappingMst) newValue);
			return;
		case CclmsPackage.TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID:
			getRefLinkDetailTrainId().clear();
			getRefLinkDetailTrainId().addAll(
					(Collection<? extends LinkDetail>) newValue);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID:
			getRefTrainSegmentMstTrainId().clear();
			getRefTrainSegmentMstTrainId().addAll(
					(Collection<? extends TrainSegmentMst>) newValue);
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
		case CclmsPackage.TRAIN_MST__TRAIN_ID:
			unsetTrainId();
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_NBR:
			setTrainNbr(TRAIN_NBR_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_NAME:
			setTrainName(TRAIN_NAME_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_SUB_TYPE:
			setTrainSubType(TRAIN_SUB_TYPE_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__TRAIN_RUN_TYPE:
			setTrainRunType(TRAIN_RUN_TYPE_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__RAKE_ID:
			unsetRakeId();
			return;
		case CclmsPackage.TRAIN_MST__DAY_OF_SERVICE:
			setDayOfService(DAY_OF_SERVICE_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__VALID_FROM:
			setValidFrom(VALID_FROM_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__VALID_TO:
			setValidTo(VALID_TO_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__BASE_TRACTION:
			setBaseTraction(BASE_TRACTION_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN:
			setRefTrainEndStn((StationMst) null);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN:
			setRefTrainStartStn((StationMst) null);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD:
			setRefTrainFrequencyCd((TrainFrequencyMst) null);
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE:
			setRefTrainType((TrainTypeMappingMst) null);
			return;
		case CclmsPackage.TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID:
			getRefLinkDetailTrainId().clear();
			return;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID:
			getRefTrainSegmentMstTrainId().clear();
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
		case CclmsPackage.TRAIN_MST__TRAIN_ID:
			return isSetTrainId();
		case CclmsPackage.TRAIN_MST__TRAIN_NBR:
			return TRAIN_NBR_EDEFAULT == null ? trainNbr != null
					: !TRAIN_NBR_EDEFAULT.equals(trainNbr);
		case CclmsPackage.TRAIN_MST__TRAIN_NAME:
			return TRAIN_NAME_EDEFAULT == null ? trainName != null
					: !TRAIN_NAME_EDEFAULT.equals(trainName);
		case CclmsPackage.TRAIN_MST__TRAIN_SUB_TYPE:
			return TRAIN_SUB_TYPE_EDEFAULT == null ? trainSubType != null
					: !TRAIN_SUB_TYPE_EDEFAULT.equals(trainSubType);
		case CclmsPackage.TRAIN_MST__TRAIN_RUN_TYPE:
			return TRAIN_RUN_TYPE_EDEFAULT == null ? trainRunType != null
					: !TRAIN_RUN_TYPE_EDEFAULT.equals(trainRunType);
		case CclmsPackage.TRAIN_MST__RAKE_ID:
			return isSetRakeId();
		case CclmsPackage.TRAIN_MST__DAY_OF_SERVICE:
			return DAY_OF_SERVICE_EDEFAULT == null ? dayOfService != null
					: !DAY_OF_SERVICE_EDEFAULT.equals(dayOfService);
		case CclmsPackage.TRAIN_MST__VALID_FROM:
			return VALID_FROM_EDEFAULT == null ? validFrom != null
					: !VALID_FROM_EDEFAULT.equals(validFrom);
		case CclmsPackage.TRAIN_MST__VALID_TO:
			return VALID_TO_EDEFAULT == null ? validTo != null
					: !VALID_TO_EDEFAULT.equals(validTo);
		case CclmsPackage.TRAIN_MST__BASE_TRACTION:
			return BASE_TRACTION_EDEFAULT == null ? baseTraction != null
					: !BASE_TRACTION_EDEFAULT.equals(baseTraction);
		case CclmsPackage.TRAIN_MST__REF_TRAIN_END_STN:
			return refTrainEndStn != null;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_START_STN:
			return refTrainStartStn != null;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD:
			return refTrainFrequencyCd != null;
		case CclmsPackage.TRAIN_MST__REF_TRAIN_TYPE:
			return refTrainType != null;
		case CclmsPackage.TRAIN_MST__REF_LINK_DETAIL_TRAIN_ID:
			return refLinkDetailTrainId != null
					&& !refLinkDetailTrainId.isEmpty();
		case CclmsPackage.TRAIN_MST__REF_TRAIN_SEGMENT_MST_TRAIN_ID:
			return refTrainSegmentMstTrainId != null
					&& !refTrainSegmentMstTrainId.isEmpty();
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
		result.append(" (trainId: ");
		if ((_booleanFlags & TRAIN_ID_ESETFLAG) != 0)
			result.append(trainId);
		else
			result.append("<unset>");
		result.append(", trainNbr: ");
		result.append(trainNbr);
		result.append(", trainName: ");
		result.append(trainName);
		result.append(", trainSubType: ");
		result.append(trainSubType);
		result.append(", trainRunType: ");
		result.append(trainRunType);
		result.append(", rakeId: ");
		if ((_booleanFlags & RAKE_ID_ESETFLAG) != 0)
			result.append(rakeId);
		else
			result.append("<unset>");
		result.append(", dayOfService: ");
		result.append(dayOfService);
		result.append(", validFrom: ");
		result.append(validFrom);
		result.append(", validTo: ");
		result.append(validTo);
		result.append(", baseTraction: ");
		result.append(baseTraction);
		result.append(')');
		return result.toString();
	}

} //TrainMstImpl
