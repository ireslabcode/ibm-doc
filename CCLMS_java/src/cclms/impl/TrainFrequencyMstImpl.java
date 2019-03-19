/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.LinkMst;
import cclms.TrainFrequencyMst;
import cclms.TrainMst;

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
 *   <li>{@link cclms.impl.TrainFrequencyMstImpl#getTrainFrequencyCode <em>Train Frequency Code</em>}</li>
 *   <li>{@link cclms.impl.TrainFrequencyMstImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link cclms.impl.TrainFrequencyMstImpl#getRefTrainMstTrainFrequencyCd <em>Ref Train Mst Train Frequency Cd</em>}</li>
 *   <li>{@link cclms.impl.TrainFrequencyMstImpl#getRefLinkMstTrainFrequencyCd <em>Ref Link Mst Train Frequency Cd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainFrequencyMstImpl extends IloDomObjectImpl implements
		TrainFrequencyMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getTrainFrequencyCode() <em>Train Frequency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainFrequencyCode()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_FREQUENCY_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrainFrequencyCode() <em>Train Frequency Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainFrequencyCode()
	 * @generated
	 * @ordered
	 */
	protected int trainFrequencyCode = TRAIN_FREQUENCY_CODE_EDEFAULT;

	/**
	 * The flag representing whether the Train Frequency Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_FREQUENCY_CODE_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefTrainMstTrainFrequencyCd() <em>Ref Train Mst Train Frequency Cd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainMstTrainFrequencyCd()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainMst> refTrainMstTrainFrequencyCd;

	/**
	 * The cached value of the '{@link #getRefLinkMstTrainFrequencyCd() <em>Ref Link Mst Train Frequency Cd</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkMstTrainFrequencyCd()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMst> refLinkMstTrainFrequencyCd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainFrequencyMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.TRAIN_FREQUENCY_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrainFrequencyCode() {
		return trainFrequencyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainFrequencyCode(int newTrainFrequencyCode) {
		int oldTrainFrequencyCode = trainFrequencyCode;
		trainFrequencyCode = newTrainFrequencyCode;
		boolean oldTrainFrequencyCodeESet = (_booleanFlags & TRAIN_FREQUENCY_CODE_ESETFLAG) != 0;
		_booleanFlags |= TRAIN_FREQUENCY_CODE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE,
								oldTrainFrequencyCode, trainFrequencyCode,
								!oldTrainFrequencyCodeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE,
						oldTrainFrequencyCode, trainFrequencyCode,
						!oldTrainFrequencyCodeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrainFrequencyCode() {
		int oldTrainFrequencyCode = trainFrequencyCode;
		boolean oldTrainFrequencyCodeESet = (_booleanFlags & TRAIN_FREQUENCY_CODE_ESETFLAG) != 0;
		trainFrequencyCode = TRAIN_FREQUENCY_CODE_EDEFAULT;
		_booleanFlags &= ~TRAIN_FREQUENCY_CODE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.UNSET,
								CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE,
								oldTrainFrequencyCode,
								TRAIN_FREQUENCY_CODE_EDEFAULT,
								oldTrainFrequencyCodeESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE,
						oldTrainFrequencyCode, TRAIN_FREQUENCY_CODE_EDEFAULT,
						oldTrainFrequencyCodeESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrainFrequencyCode() {
		return (_booleanFlags & TRAIN_FREQUENCY_CODE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.TRAIN_FREQUENCY_MST__DESC,
								oldDesc, desc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_FREQUENCY_MST__DESC, oldDesc, desc));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainMst> getRefTrainMstTrainFrequencyCd() {
		if (refTrainMstTrainFrequencyCd == null) {
			refTrainMstTrainFrequencyCd = new IloDomObjectWithInverseEList<TrainMst>(
					TrainMst.class,
					this,
					CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD,
					CclmsPackage.TRAIN_MST__REF_TRAIN_FREQUENCY_CD);
		}
		return refTrainMstTrainFrequencyCd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getRefLinkMstTrainFrequencyCd() {
		if (refLinkMstTrainFrequencyCd == null) {
			refLinkMstTrainFrequencyCd = new IloDomObjectWithInverseEList<LinkMst>(
					LinkMst.class,
					this,
					CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD,
					CclmsPackage.LINK_MST__REF_TRAIN_FREQUENCY_CD);
		}
		return refLinkMstTrainFrequencyCd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainMst> getTrainMstTrainFrequencyCd() {
		return getRefTrainMstTrainFrequencyCd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getLinkMstTrainFrequencyCd() {
		return getRefLinkMstTrainFrequencyCd();
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
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainMstTrainFrequencyCd())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkMstTrainFrequencyCd())
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
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD:
			return ((InternalEList<?>) getRefTrainMstTrainFrequencyCd())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD:
			return ((InternalEList<?>) getRefLinkMstTrainFrequencyCd())
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
		case CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE:
			return getTrainFrequencyCode();
		case CclmsPackage.TRAIN_FREQUENCY_MST__DESC:
			return getDesc();
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD:
			return getRefTrainMstTrainFrequencyCd();
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD:
			return getRefLinkMstTrainFrequencyCd();
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
		case CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE:
			setTrainFrequencyCode((Integer) newValue);
			return;
		case CclmsPackage.TRAIN_FREQUENCY_MST__DESC:
			setDesc((String) newValue);
			return;
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD:
			getRefTrainMstTrainFrequencyCd().clear();
			getRefTrainMstTrainFrequencyCd().addAll(
					(Collection<? extends TrainMst>) newValue);
			return;
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD:
			getRefLinkMstTrainFrequencyCd().clear();
			getRefLinkMstTrainFrequencyCd().addAll(
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
		case CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE:
			unsetTrainFrequencyCode();
			return;
		case CclmsPackage.TRAIN_FREQUENCY_MST__DESC:
			setDesc(DESC_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD:
			getRefTrainMstTrainFrequencyCd().clear();
			return;
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD:
			getRefLinkMstTrainFrequencyCd().clear();
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
		case CclmsPackage.TRAIN_FREQUENCY_MST__TRAIN_FREQUENCY_CODE:
			return isSetTrainFrequencyCode();
		case CclmsPackage.TRAIN_FREQUENCY_MST__DESC:
			return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT
					.equals(desc);
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_TRAIN_MST_TRAIN_FREQUENCY_CD:
			return refTrainMstTrainFrequencyCd != null
					&& !refTrainMstTrainFrequencyCd.isEmpty();
		case CclmsPackage.TRAIN_FREQUENCY_MST__REF_LINK_MST_TRAIN_FREQUENCY_CD:
			return refLinkMstTrainFrequencyCd != null
					&& !refLinkMstTrainFrequencyCd.isEmpty();
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
		result.append(" (trainFrequencyCode: ");
		if ((_booleanFlags & TRAIN_FREQUENCY_CODE_ESETFLAG) != 0)
			result.append(trainFrequencyCode);
		else
			result.append("<unset>");
		result.append(", desc: ");
		result.append(desc);
		result.append(')');
		return result.toString();
	}

} //TrainFrequencyMstImpl
