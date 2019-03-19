/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.LinkMst;
import cclms.TrainTypeMappingMst;
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
 *   <li>{@link cclms.impl.TrainTypeMstImpl#getTrainTypeCclmsId <em>Train Type Cclms Id</em>}</li>
 *   <li>{@link cclms.impl.TrainTypeMstImpl#getTrainTypeDesc <em>Train Type Desc</em>}</li>
 *   <li>{@link cclms.impl.TrainTypeMstImpl#getRefCreatedBy <em>Ref Created By</em>}</li>
 *   <li>{@link cclms.impl.TrainTypeMstImpl#getRefTrainTypeMappingMstTrainTypeCclms <em>Ref Train Type Mapping Mst Train Type Cclms</em>}</li>
 *   <li>{@link cclms.impl.TrainTypeMstImpl#getRefLinkMstTrainTypeCd <em>Ref Link Mst Train Type Cd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainTypeMstImpl extends IloDomObjectImpl implements TrainTypeMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getTrainTypeCclmsId() <em>Train Type Cclms Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainTypeCclmsId()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_TYPE_CCLMS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrainTypeCclmsId() <em>Train Type Cclms Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainTypeCclmsId()
	 * @generated
	 * @ordered
	 */
	protected int trainTypeCclmsId = TRAIN_TYPE_CCLMS_ID_EDEFAULT;

	/**
	 * The flag representing whether the Train Type Cclms Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_TYPE_CCLMS_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getTrainTypeDesc() <em>Train Type Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainTypeDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_TYPE_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainTypeDesc() <em>Train Type Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainTypeDesc()
	 * @generated
	 * @ordered
	 */
	protected String trainTypeDesc = TRAIN_TYPE_DESC_EDEFAULT;

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
	 * The cached value of the '{@link #getRefTrainTypeMappingMstTrainTypeCclms() <em>Ref Train Type Mapping Mst Train Type Cclms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainTypeMappingMstTrainTypeCclms()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainTypeMappingMst> refTrainTypeMappingMstTrainTypeCclms;

	/**
	 * The cached value of the '{@link #getRefLinkMstTrainTypeCd() <em>Ref Link Mst Train Type Cd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkMstTrainTypeCd()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMst> refLinkMstTrainTypeCd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainTypeMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.TRAIN_TYPE_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrainTypeCclmsId() {
		return trainTypeCclmsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainTypeCclmsId(int newTrainTypeCclmsId) {
		int oldTrainTypeCclmsId = trainTypeCclmsId;
		trainTypeCclmsId = newTrainTypeCclmsId;
		boolean oldTrainTypeCclmsIdESet = (_booleanFlags & TRAIN_TYPE_CCLMS_ID_ESETFLAG) != 0;
		_booleanFlags |= TRAIN_TYPE_CCLMS_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID,
								oldTrainTypeCclmsId, trainTypeCclmsId,
								!oldTrainTypeCclmsIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID,
						oldTrainTypeCclmsId, trainTypeCclmsId,
						!oldTrainTypeCclmsIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrainTypeCclmsId() {
		int oldTrainTypeCclmsId = trainTypeCclmsId;
		boolean oldTrainTypeCclmsIdESet = (_booleanFlags & TRAIN_TYPE_CCLMS_ID_ESETFLAG) != 0;
		trainTypeCclmsId = TRAIN_TYPE_CCLMS_ID_EDEFAULT;
		_booleanFlags &= ~TRAIN_TYPE_CCLMS_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.UNSET,
								CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID,
								oldTrainTypeCclmsId,
								TRAIN_TYPE_CCLMS_ID_EDEFAULT,
								oldTrainTypeCclmsIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID,
						oldTrainTypeCclmsId, TRAIN_TYPE_CCLMS_ID_EDEFAULT,
						oldTrainTypeCclmsIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrainTypeCclmsId() {
		return (_booleanFlags & TRAIN_TYPE_CCLMS_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainTypeDesc() {
		return trainTypeDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainTypeDesc(String newTrainTypeDesc) {
		String oldTrainTypeDesc = trainTypeDesc;
		trainTypeDesc = newTrainTypeDesc;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_DESC,
								oldTrainTypeDesc, trainTypeDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_DESC,
						oldTrainTypeDesc, trainTypeDesc));
			}
		}
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
								CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY,
								oldRefCreatedBy, newRefCreatedBy);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY,
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
						CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY,
						UserMst.class, msgs);
			if (newRefCreatedBy != null)
				msgs = ((InternalEObject) newRefCreatedBy).eInverseAdd(this,
						CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY,
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
								CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY,
								newRefCreatedBy, newRefCreatedBy);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY,
						newRefCreatedBy, newRefCreatedBy));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMappingMst> getRefTrainTypeMappingMstTrainTypeCclms() {
		if (refTrainTypeMappingMstTrainTypeCclms == null) {
			refTrainTypeMappingMstTrainTypeCclms = new IloDomObjectWithInverseEList<TrainTypeMappingMst>(
					TrainTypeMappingMst.class,
					this,
					CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS,
					CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS);
		}
		return refTrainTypeMappingMstTrainTypeCclms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getRefLinkMstTrainTypeCd() {
		if (refLinkMstTrainTypeCd == null) {
			refLinkMstTrainTypeCd = new IloDomObjectWithInverseEList<LinkMst>(
					LinkMst.class, this,
					CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD,
					CclmsPackage.LINK_MST__REF_TRAIN_TYPE_CD);
		}
		return refLinkMstTrainTypeCd;
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
	public List<TrainTypeMappingMst> getTrainTypeMappingMstTrainTypeCclms() {
		return getRefTrainTypeMappingMstTrainTypeCclms();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getLinkMstTrainTypeCd() {
		return getRefLinkMstTrainTypeCd();
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
		case CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY:
			if (refCreatedBy != null)
				msgs = ((InternalEObject) refCreatedBy).eInverseRemove(this,
						CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY,
						UserMst.class, msgs);
			return basicSetRefCreatedBy((UserMst) otherEnd, msgs);
		case CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainTypeMappingMstTrainTypeCclms())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkMstTrainTypeCd())
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
		case CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY:
			return basicSetRefCreatedBy(null, msgs);
		case CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS:
			return ((InternalEList<?>) getRefTrainTypeMappingMstTrainTypeCclms())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD:
			return ((InternalEList<?>) getRefLinkMstTrainTypeCd()).basicRemove(
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
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID:
			return getTrainTypeCclmsId();
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_DESC:
			return getTrainTypeDesc();
		case CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY:
			return getRefCreatedBy();
		case CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS:
			return getRefTrainTypeMappingMstTrainTypeCclms();
		case CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD:
			return getRefLinkMstTrainTypeCd();
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
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID:
			setTrainTypeCclmsId((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_DESC:
			setTrainTypeDesc((String) newValue);
			return;
		case CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY:
			setRefCreatedBy((UserMst) newValue);
			return;
		case CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS:
			getRefTrainTypeMappingMstTrainTypeCclms().clear();
			getRefTrainTypeMappingMstTrainTypeCclms().addAll(
					(Collection<? extends TrainTypeMappingMst>) newValue);
			return;
		case CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD:
			getRefLinkMstTrainTypeCd().clear();
			getRefLinkMstTrainTypeCd().addAll(
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
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID:
			unsetTrainTypeCclmsId();
			return;
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_DESC:
			setTrainTypeDesc(TRAIN_TYPE_DESC_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY:
			setRefCreatedBy((UserMst) null);
			return;
		case CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS:
			getRefTrainTypeMappingMstTrainTypeCclms().clear();
			return;
		case CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD:
			getRefLinkMstTrainTypeCd().clear();
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
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_CCLMS_ID:
			return isSetTrainTypeCclmsId();
		case CclmsPackage.TRAIN_TYPE_MST__TRAIN_TYPE_DESC:
			return TRAIN_TYPE_DESC_EDEFAULT == null ? trainTypeDesc != null
					: !TRAIN_TYPE_DESC_EDEFAULT.equals(trainTypeDesc);
		case CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY:
			return refCreatedBy != null;
		case CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS:
			return refTrainTypeMappingMstTrainTypeCclms != null
					&& !refTrainTypeMappingMstTrainTypeCclms.isEmpty();
		case CclmsPackage.TRAIN_TYPE_MST__REF_LINK_MST_TRAIN_TYPE_CD:
			return refLinkMstTrainTypeCd != null
					&& !refLinkMstTrainTypeCd.isEmpty();
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
		result.append(" (trainTypeCclmsId: ");
		if ((_booleanFlags & TRAIN_TYPE_CCLMS_ID_ESETFLAG) != 0)
			result.append(trainTypeCclmsId);
		else
			result.append("<unset>");
		result.append(", trainTypeDesc: ");
		result.append(trainTypeDesc);
		result.append(')');
		return result.toString();
	}

} //TrainTypeMstImpl