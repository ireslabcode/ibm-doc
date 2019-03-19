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
 *   <li>{@link cclms.impl.SegmentMstImpl#getSegmentId <em>Segment Id</em>}</li>
 *   <li>{@link cclms.impl.SegmentMstImpl#getRefCreatedBy <em>Ref Created By</em>}</li>
 *   <li>{@link cclms.impl.SegmentMstImpl#getRefStartStationId <em>Ref Start Station Id</em>}</li>
 *   <li>{@link cclms.impl.SegmentMstImpl#getRefStopStationId <em>Ref Stop Station Id</em>}</li>
 *   <li>{@link cclms.impl.SegmentMstImpl#getRefTrainSegmentMstSegmentId <em>Ref Train Segment Mst Segment Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentMstImpl extends IloDomObjectImpl implements SegmentMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getSegmentId() <em>Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentId()
	 * @generated
	 * @ordered
	 */
	protected static final int SEGMENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSegmentId() <em>Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentId()
	 * @generated
	 * @ordered
	 */
	protected int segmentId = SEGMENT_ID_EDEFAULT;

	/**
	 * The flag representing whether the Segment Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int SEGMENT_ID_ESETFLAG = 1 << 0;

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
	 * The cached value of the '{@link #getRefStartStationId() <em>Ref Start Station Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefStartStationId()
	 * @generated
	 * @ordered
	 */
	protected StationMst refStartStationId;

	/**
	 * The cached value of the '{@link #getRefStopStationId() <em>Ref Stop Station Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefStopStationId()
	 * @generated
	 * @ordered
	 */
	protected StationMst refStopStationId;

	/**
	 * The cached value of the '{@link #getRefTrainSegmentMstSegmentId() <em>Ref Train Segment Mst Segment Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainSegmentMstSegmentId()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentMst> refTrainSegmentMstSegmentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.SEGMENT_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSegmentId() {
		return segmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegmentId(int newSegmentId) {
		int oldSegmentId = segmentId;
		segmentId = newSegmentId;
		boolean oldSegmentIdESet = (_booleanFlags & SEGMENT_ID_ESETFLAG) != 0;
		_booleanFlags |= SEGMENT_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.SEGMENT_MST__SEGMENT_ID,
								oldSegmentId, segmentId, !oldSegmentIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST__SEGMENT_ID, oldSegmentId,
						segmentId, !oldSegmentIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSegmentId() {
		int oldSegmentId = segmentId;
		boolean oldSegmentIdESet = (_booleanFlags & SEGMENT_ID_ESETFLAG) != 0;
		segmentId = SEGMENT_ID_EDEFAULT;
		_booleanFlags &= ~SEGMENT_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.SEGMENT_MST__SEGMENT_ID,
								oldSegmentId, SEGMENT_ID_EDEFAULT,
								oldSegmentIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.SEGMENT_MST__SEGMENT_ID, oldSegmentId,
						SEGMENT_ID_EDEFAULT, oldSegmentIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSegmentId() {
		return (_booleanFlags & SEGMENT_ID_ESETFLAG) != 0;
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
								CclmsPackage.SEGMENT_MST__REF_CREATED_BY,
								oldRefCreatedBy, newRefCreatedBy);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST__REF_CREATED_BY,
						oldRefCreatedBy, newRefCreatedBy);
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
						CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY,
						UserMst.class, msgs);
			if (newRefCreatedBy != null)
				msgs = ((InternalEObject) newRefCreatedBy).eInverseAdd(this,
						CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY,
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
								CclmsPackage.SEGMENT_MST__REF_CREATED_BY,
								newRefCreatedBy, newRefCreatedBy);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST__REF_CREATED_BY,
						newRefCreatedBy, newRefCreatedBy));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefStartStationId() {
		return refStartStationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefStartStationId(
			StationMst newRefStartStationId, NotificationChain msgs) {
		StationMst oldRefStartStationId = refStartStationId;
		refStartStationId = newRefStartStationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.SEGMENT_MST__REF_START_STATION_ID,
								oldRefStartStationId, newRefStartStationId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST__REF_START_STATION_ID,
						oldRefStartStationId, newRefStartStationId);
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
	public void setRefStartStationId(StationMst newRefStartStationId) {
		if (newRefStartStationId != refStartStationId) {
			NotificationChain msgs = null;
			if (refStartStationId != null)
				msgs = ((InternalEObject) refStartStationId)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID,
								StationMst.class, msgs);
			if (newRefStartStationId != null)
				msgs = ((InternalEObject) newRefStartStationId)
						.eInverseAdd(
								this,
								CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID,
								StationMst.class, msgs);
			msgs = basicSetRefStartStationId(newRefStartStationId, msgs);
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
								CclmsPackage.SEGMENT_MST__REF_START_STATION_ID,
								newRefStartStationId, newRefStartStationId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST__REF_START_STATION_ID,
						newRefStartStationId, newRefStartStationId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefStopStationId() {
		return refStopStationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefStopStationId(
			StationMst newRefStopStationId, NotificationChain msgs) {
		StationMst oldRefStopStationId = refStopStationId;
		refStopStationId = newRefStopStationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID,
								oldRefStopStationId, newRefStopStationId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID,
						oldRefStopStationId, newRefStopStationId);
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
	public void setRefStopStationId(StationMst newRefStopStationId) {
		if (newRefStopStationId != refStopStationId) {
			NotificationChain msgs = null;
			if (refStopStationId != null)
				msgs = ((InternalEObject) refStopStationId)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID,
								StationMst.class, msgs);
			if (newRefStopStationId != null)
				msgs = ((InternalEObject) newRefStopStationId)
						.eInverseAdd(
								this,
								CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID,
								StationMst.class, msgs);
			msgs = basicSetRefStopStationId(newRefStopStationId, msgs);
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
								CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID,
								newRefStopStationId, newRefStopStationId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID,
						newRefStopStationId, newRefStopStationId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getRefTrainSegmentMstSegmentId() {
		if (refTrainSegmentMstSegmentId == null) {
			refTrainSegmentMstSegmentId = new IloDomObjectWithInverseEList<TrainSegmentMst>(
					TrainSegmentMst.class, this,
					CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID,
					CclmsPackage.TRAIN_SEGMENT_MST__REF_SEGMENT_ID);
		}
		return refTrainSegmentMstSegmentId;
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
	public StationMst getStartStationId() {
		StationMst obj = getRefStartStationId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartStationId(StationMst obj) {
		setRefStartStationId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getStopStationId() {
		StationMst obj = getRefStopStationId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopStationId(StationMst obj) {
		setRefStopStationId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getTrainSegmentMstSegmentId() {
		return getRefTrainSegmentMstSegmentId();
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
		case CclmsPackage.SEGMENT_MST__REF_CREATED_BY:
			if (refCreatedBy != null)
				msgs = ((InternalEObject) refCreatedBy).eInverseRemove(this,
						CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY,
						UserMst.class, msgs);
			return basicSetRefCreatedBy((UserMst) otherEnd, msgs);
		case CclmsPackage.SEGMENT_MST__REF_START_STATION_ID:
			if (refStartStationId != null)
				msgs = ((InternalEObject) refStartStationId)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_SEGMENT_MST_START_STATION_ID,
								StationMst.class, msgs);
			return basicSetRefStartStationId((StationMst) otherEnd, msgs);
		case CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID:
			if (refStopStationId != null)
				msgs = ((InternalEObject) refStopStationId)
						.eInverseRemove(
								this,
								CclmsPackage.STATION_MST__REF_SEGMENT_MST_STOP_STATION_ID,
								StationMst.class, msgs);
			return basicSetRefStopStationId((StationMst) otherEnd, msgs);
		case CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainSegmentMstSegmentId())
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
		case CclmsPackage.SEGMENT_MST__REF_CREATED_BY:
			return basicSetRefCreatedBy(null, msgs);
		case CclmsPackage.SEGMENT_MST__REF_START_STATION_ID:
			return basicSetRefStartStationId(null, msgs);
		case CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID:
			return basicSetRefStopStationId(null, msgs);
		case CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID:
			return ((InternalEList<?>) getRefTrainSegmentMstSegmentId())
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
		case CclmsPackage.SEGMENT_MST__SEGMENT_ID:
			return getSegmentId();
		case CclmsPackage.SEGMENT_MST__REF_CREATED_BY:
			return getRefCreatedBy();
		case CclmsPackage.SEGMENT_MST__REF_START_STATION_ID:
			return getRefStartStationId();
		case CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID:
			return getRefStopStationId();
		case CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID:
			return getRefTrainSegmentMstSegmentId();
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
		case CclmsPackage.SEGMENT_MST__SEGMENT_ID:
			setSegmentId((Integer) newValue);
			return;
		case CclmsPackage.SEGMENT_MST__REF_CREATED_BY:
			setRefCreatedBy((UserMst) newValue);
			return;
		case CclmsPackage.SEGMENT_MST__REF_START_STATION_ID:
			setRefStartStationId((StationMst) newValue);
			return;
		case CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID:
			setRefStopStationId((StationMst) newValue);
			return;
		case CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID:
			getRefTrainSegmentMstSegmentId().clear();
			getRefTrainSegmentMstSegmentId().addAll(
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
		case CclmsPackage.SEGMENT_MST__SEGMENT_ID:
			unsetSegmentId();
			return;
		case CclmsPackage.SEGMENT_MST__REF_CREATED_BY:
			setRefCreatedBy((UserMst) null);
			return;
		case CclmsPackage.SEGMENT_MST__REF_START_STATION_ID:
			setRefStartStationId((StationMst) null);
			return;
		case CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID:
			setRefStopStationId((StationMst) null);
			return;
		case CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID:
			getRefTrainSegmentMstSegmentId().clear();
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
		case CclmsPackage.SEGMENT_MST__SEGMENT_ID:
			return isSetSegmentId();
		case CclmsPackage.SEGMENT_MST__REF_CREATED_BY:
			return refCreatedBy != null;
		case CclmsPackage.SEGMENT_MST__REF_START_STATION_ID:
			return refStartStationId != null;
		case CclmsPackage.SEGMENT_MST__REF_STOP_STATION_ID:
			return refStopStationId != null;
		case CclmsPackage.SEGMENT_MST__REF_TRAIN_SEGMENT_MST_SEGMENT_ID:
			return refTrainSegmentMstSegmentId != null
					&& !refTrainSegmentMstSegmentId.isEmpty();
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
		result.append(" (segmentId: ");
		if ((_booleanFlags & SEGMENT_ID_ESETFLAG) != 0)
			result.append(segmentId);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SegmentMstImpl
