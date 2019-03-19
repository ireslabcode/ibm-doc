/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.LinkMst;
import cclms.TractionMst;

import cclms.TrainSegmentMst;
import ilog.odm.dom.impl.IloDomObjectImpl;

import ilog.odm.dom.impl.resource.IloDomObjectContainmentEList;
import ilog.odm.dom.impl.resource.IloDomObjectWithInverseEList;
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
 *   <li>{@link cclms.impl.TractionMstImpl#getTractionType <em>Traction Type</em>}</li>
 *   <li>{@link cclms.impl.TractionMstImpl#getTractionDesc <em>Traction Desc</em>}</li>
 *   <li>{@link cclms.impl.TractionMstImpl#getRefTrainSegmentMstTractionType <em>Ref Train Segment Mst Traction Type</em>}</li>
 *   <li>{@link cclms.impl.TractionMstImpl#getRefLinkMstTractionType <em>Ref Link Mst Traction Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TractionMstImpl extends IloDomObjectImpl implements TractionMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getTractionType() <em>Traction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTractionType()
	 * @generated
	 * @ordered
	 */
	protected static final int TRACTION_TYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTractionType() <em>Traction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTractionType()
	 * @generated
	 * @ordered
	 */
	protected int tractionType = TRACTION_TYPE_EDEFAULT;

	/**
	 * The flag representing whether the Traction Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int TRACTION_TYPE_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getTractionDesc() <em>Traction Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTractionDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACTION_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTractionDesc() <em>Traction Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTractionDesc()
	 * @generated
	 * @ordered
	 */
	protected String tractionDesc = TRACTION_DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefTrainSegmentMstTractionType() <em>Ref Train Segment Mst Traction Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainSegmentMstTractionType()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentMst> refTrainSegmentMstTractionType;

	/**
	 * The cached value of the '{@link #getRefLinkMstTractionType() <em>Ref Link Mst Traction Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkMstTractionType()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMst> refLinkMstTractionType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TractionMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getTractionMst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTractionType() {
		return tractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTractionType(int newTractionType) {
		int oldTractionType = tractionType;
		tractionType = newTractionType;
		boolean oldTractionTypeESet = (_booleanFlags & TRACTION_TYPE_ESETFLAG) != 0;
		_booleanFlags |= TRACTION_TYPE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRACTION_MST__TRACTION_TYPE,
								oldTractionType, tractionType,
								!oldTractionTypeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRACTION_MST__TRACTION_TYPE,
						oldTractionType, tractionType, !oldTractionTypeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTractionType() {
		int oldTractionType = tractionType;
		boolean oldTractionTypeESet = (_booleanFlags & TRACTION_TYPE_ESETFLAG) != 0;
		tractionType = TRACTION_TYPE_EDEFAULT;
		_booleanFlags &= ~TRACTION_TYPE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.TRACTION_MST__TRACTION_TYPE,
								oldTractionType, TRACTION_TYPE_EDEFAULT,
								oldTractionTypeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRACTION_MST__TRACTION_TYPE,
						oldTractionType, TRACTION_TYPE_EDEFAULT,
						oldTractionTypeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTractionType() {
		return (_booleanFlags & TRACTION_TYPE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTractionDesc() {
		return tractionDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTractionDesc(String newTractionDesc) {
		String oldTractionDesc = tractionDesc;
		tractionDesc = newTractionDesc;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRACTION_MST__TRACTION_DESC,
								oldTractionDesc, tractionDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRACTION_MST__TRACTION_DESC,
						oldTractionDesc, tractionDesc));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getRefTrainSegmentMstTractionType() {
		if (refTrainSegmentMstTractionType == null) {
			refTrainSegmentMstTractionType = new IloDomObjectWithInverseEList<TrainSegmentMst>(
					TrainSegmentMst.class,
					this,
					CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE,
					CclmsPackage.TRAIN_SEGMENT_MST__REF_TRACTION_TYPE);
		}
		return refTrainSegmentMstTractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getRefLinkMstTractionType() {
		if (refLinkMstTractionType == null) {
			refLinkMstTractionType = new IloDomObjectWithInverseEList<LinkMst>(
					LinkMst.class, this,
					CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE,
					CclmsPackage.LINK_MST__REF_TRACTION_TYPE);
		}
		return refLinkMstTractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getTrainSegmentMstTractionType() {
		return getRefTrainSegmentMstTractionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getLinkMstTractionType() {
		return getRefLinkMstTractionType();
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
		case CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainSegmentMstTractionType())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkMstTractionType())
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
		case CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE:
			return ((InternalEList<?>) getRefTrainSegmentMstTractionType())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE:
			return ((InternalEList<?>) getRefLinkMstTractionType())
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
		case CclmsPackage.TRACTION_MST__TRACTION_TYPE:
			return getTractionType();
		case CclmsPackage.TRACTION_MST__TRACTION_DESC:
			return getTractionDesc();
		case CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE:
			return getRefTrainSegmentMstTractionType();
		case CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE:
			return getRefLinkMstTractionType();
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
		case CclmsPackage.TRACTION_MST__TRACTION_TYPE:
			setTractionType((Integer) newValue);
			return;
		case CclmsPackage.TRACTION_MST__TRACTION_DESC:
			setTractionDesc((String) newValue);
			return;
		case CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE:
			getRefTrainSegmentMstTractionType().clear();
			getRefTrainSegmentMstTractionType().addAll(
					(Collection<? extends TrainSegmentMst>) newValue);
			return;
		case CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE:
			getRefLinkMstTractionType().clear();
			getRefLinkMstTractionType().addAll(
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
		case CclmsPackage.TRACTION_MST__TRACTION_TYPE:
			unsetTractionType();
			return;
		case CclmsPackage.TRACTION_MST__TRACTION_DESC:
			setTractionDesc(TRACTION_DESC_EDEFAULT);
			return;
		case CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE:
			getRefTrainSegmentMstTractionType().clear();
			return;
		case CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE:
			getRefLinkMstTractionType().clear();
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
		case CclmsPackage.TRACTION_MST__TRACTION_TYPE:
			return isSetTractionType();
		case CclmsPackage.TRACTION_MST__TRACTION_DESC:
			return TRACTION_DESC_EDEFAULT == null ? tractionDesc != null
					: !TRACTION_DESC_EDEFAULT.equals(tractionDesc);
		case CclmsPackage.TRACTION_MST__REF_TRAIN_SEGMENT_MST_TRACTION_TYPE:
			return refTrainSegmentMstTractionType != null
					&& !refTrainSegmentMstTractionType.isEmpty();
		case CclmsPackage.TRACTION_MST__REF_LINK_MST_TRACTION_TYPE:
			return refLinkMstTractionType != null
					&& !refLinkMstTractionType.isEmpty();
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
		result.append(" (tractionType: ");
		if ((_booleanFlags & TRACTION_TYPE_ESETFLAG) != 0)
			result.append(tractionType);
		else
			result.append("<unset>");
		result.append(", tractionDesc: ");
		result.append(tractionDesc);
		result.append(')');
		return result.toString();
	}

} //TractionMstImpl
