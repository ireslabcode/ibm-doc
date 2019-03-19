/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.KpiMst;
import cclms.KpiValue;

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
 *   <li>{@link cclms.impl.KpiMstImpl#getKpiId <em>Kpi Id</em>}</li>
 *   <li>{@link cclms.impl.KpiMstImpl#getKpiDesc <em>Kpi Desc</em>}</li>
 *   <li>{@link cclms.impl.KpiMstImpl#getUom <em>Uom</em>}</li>
 *   <li>{@link cclms.impl.KpiMstImpl#getRefKpiValueKpiId <em>Ref Kpi Value Kpi Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KpiMstImpl extends IloDomObjectImpl implements KpiMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getKpiId() <em>Kpi Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiId()
	 * @generated
	 * @ordered
	 */
	protected static final int KPI_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKpiId() <em>Kpi Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiId()
	 * @generated
	 * @ordered
	 */
	protected int kpiId = KPI_ID_EDEFAULT;

	/**
	 * The flag representing whether the Kpi Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KPI_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getKpiDesc() <em>Kpi Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String KPI_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKpiDesc() <em>Kpi Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiDesc()
	 * @generated
	 * @ordered
	 */
	protected String kpiDesc = KPI_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUom() <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUom()
	 * @generated
	 * @ordered
	 */
	protected String uom = UOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefKpiValueKpiId() <em>Ref Kpi Value Kpi Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefKpiValueKpiId()
	 * @generated
	 * @ordered
	 */
	protected EList<KpiValue> refKpiValueKpiId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KpiMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getKpiMst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKpiId() {
		return kpiId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpiId(int newKpiId) {
		int oldKpiId = kpiId;
		kpiId = newKpiId;
		boolean oldKpiIdESet = (_booleanFlags & KPI_ID_ESETFLAG) != 0;
		_booleanFlags |= KPI_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET, CclmsPackage.KPI_MST__KPI_ID,
								oldKpiId, kpiId, !oldKpiIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_MST__KPI_ID, oldKpiId, kpiId,
						!oldKpiIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKpiId() {
		int oldKpiId = kpiId;
		boolean oldKpiIdESet = (_booleanFlags & KPI_ID_ESETFLAG) != 0;
		kpiId = KPI_ID_EDEFAULT;
		_booleanFlags &= ~KPI_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.KPI_MST__KPI_ID, oldKpiId,
								KPI_ID_EDEFAULT, oldKpiIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.KPI_MST__KPI_ID, oldKpiId,
						KPI_ID_EDEFAULT, oldKpiIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKpiId() {
		return (_booleanFlags & KPI_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKpiDesc() {
		return kpiDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpiDesc(String newKpiDesc) {
		String oldKpiDesc = kpiDesc;
		kpiDesc = newKpiDesc;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.KPI_MST__KPI_DESC, oldKpiDesc,
								kpiDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_MST__KPI_DESC, oldKpiDesc, kpiDesc));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUom() {
		return uom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUom(String newUom) {
		String oldUom = uom;
		uom = newUom;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET, CclmsPackage.KPI_MST__UOM,
								oldUom, uom);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_MST__UOM, oldUom, uom));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiValue> getRefKpiValueKpiId() {
		if (refKpiValueKpiId == null) {
			refKpiValueKpiId = new IloDomObjectWithInverseEList<KpiValue>(
					KpiValue.class, this,
					CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID,
					CclmsPackage.KPI_VALUE__REF_KPI_ID);
		}
		return refKpiValueKpiId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiValue> getKpiValueKpiId() {
		return getRefKpiValueKpiId();
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
		case CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefKpiValueKpiId())
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
		case CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID:
			return ((InternalEList<?>) getRefKpiValueKpiId()).basicRemove(
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
		case CclmsPackage.KPI_MST__KPI_ID:
			return getKpiId();
		case CclmsPackage.KPI_MST__KPI_DESC:
			return getKpiDesc();
		case CclmsPackage.KPI_MST__UOM:
			return getUom();
		case CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID:
			return getRefKpiValueKpiId();
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
		case CclmsPackage.KPI_MST__KPI_ID:
			setKpiId((Integer) newValue);
			return;
		case CclmsPackage.KPI_MST__KPI_DESC:
			setKpiDesc((String) newValue);
			return;
		case CclmsPackage.KPI_MST__UOM:
			setUom((String) newValue);
			return;
		case CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID:
			getRefKpiValueKpiId().clear();
			getRefKpiValueKpiId().addAll(
					(Collection<? extends KpiValue>) newValue);
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
		case CclmsPackage.KPI_MST__KPI_ID:
			unsetKpiId();
			return;
		case CclmsPackage.KPI_MST__KPI_DESC:
			setKpiDesc(KPI_DESC_EDEFAULT);
			return;
		case CclmsPackage.KPI_MST__UOM:
			setUom(UOM_EDEFAULT);
			return;
		case CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID:
			getRefKpiValueKpiId().clear();
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
		case CclmsPackage.KPI_MST__KPI_ID:
			return isSetKpiId();
		case CclmsPackage.KPI_MST__KPI_DESC:
			return KPI_DESC_EDEFAULT == null ? kpiDesc != null
					: !KPI_DESC_EDEFAULT.equals(kpiDesc);
		case CclmsPackage.KPI_MST__UOM:
			return UOM_EDEFAULT == null ? uom != null : !UOM_EDEFAULT
					.equals(uom);
		case CclmsPackage.KPI_MST__REF_KPI_VALUE_KPI_ID:
			return refKpiValueKpiId != null && !refKpiValueKpiId.isEmpty();
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
		result.append(" (kpiId: ");
		if ((_booleanFlags & KPI_ID_ESETFLAG) != 0)
			result.append(kpiId);
		else
			result.append("<unset>");
		result.append(", kpiDesc: ");
		result.append(kpiDesc);
		result.append(", uom: ");
		result.append(uom);
		result.append(')');
		return result.toString();
	}

} //KpiMstImpl
