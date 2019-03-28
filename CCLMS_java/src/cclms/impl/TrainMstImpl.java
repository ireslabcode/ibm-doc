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
		result.append(')');
		return result.toString();
	}

} //TrainMstImpl
