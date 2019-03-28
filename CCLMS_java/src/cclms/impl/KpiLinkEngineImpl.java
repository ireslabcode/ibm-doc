/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.KpiLinkEngine;

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
 *   <li>{@link cclms.impl.KpiLinkEngineImpl#getKpiId <em>Kpi Id</em>}</li>
 *   <li>{@link cclms.impl.KpiLinkEngineImpl#getKpiDesc <em>Kpi Desc</em>}</li>
 *   <li>{@link cclms.impl.KpiLinkEngineImpl#getKpiValue <em>Kpi Value</em>}</li>
 *   <li>{@link cclms.impl.KpiLinkEngineImpl#getUom <em>Uom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KpiLinkEngineImpl extends IloDomObjectImpl implements
		KpiLinkEngine {
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
	 * The default value of the '{@link #getKpiValue() <em>Kpi Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiValue()
	 * @generated
	 * @ordered
	 */
	protected static final double KPI_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKpiValue() <em>Kpi Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiValue()
	 * @generated
	 * @ordered
	 */
	protected double kpiValue = KPI_VALUE_EDEFAULT;

	/**
	 * The flag representing whether the Kpi Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int KPI_VALUE_ESETFLAG = 1 << 1;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KpiLinkEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.KPI_LINK_ENGINE;
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
								Notification.SET,
								CclmsPackage.KPI_LINK_ENGINE__KPI_ID, oldKpiId,
								kpiId, !oldKpiIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_LINK_ENGINE__KPI_ID, oldKpiId, kpiId,
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
								CclmsPackage.KPI_LINK_ENGINE__KPI_ID, oldKpiId,
								KPI_ID_EDEFAULT, oldKpiIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.KPI_LINK_ENGINE__KPI_ID, oldKpiId,
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
								CclmsPackage.KPI_LINK_ENGINE__KPI_DESC,
								oldKpiDesc, kpiDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_LINK_ENGINE__KPI_DESC, oldKpiDesc,
						kpiDesc));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKpiValue() {
		return kpiValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpiValue(double newKpiValue) {
		double oldKpiValue = kpiValue;
		kpiValue = newKpiValue;
		boolean oldKpiValueESet = (_booleanFlags & KPI_VALUE_ESETFLAG) != 0;
		_booleanFlags |= KPI_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE,
								oldKpiValue, kpiValue, !oldKpiValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE, oldKpiValue,
						kpiValue, !oldKpiValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKpiValue() {
		double oldKpiValue = kpiValue;
		boolean oldKpiValueESet = (_booleanFlags & KPI_VALUE_ESETFLAG) != 0;
		kpiValue = KPI_VALUE_EDEFAULT;
		_booleanFlags &= ~KPI_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE,
								oldKpiValue, KPI_VALUE_EDEFAULT,
								oldKpiValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE, oldKpiValue,
						KPI_VALUE_EDEFAULT, oldKpiValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKpiValue() {
		return (_booleanFlags & KPI_VALUE_ESETFLAG) != 0;
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
								Notification.SET,
								CclmsPackage.KPI_LINK_ENGINE__UOM, oldUom, uom);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.KPI_LINK_ENGINE__UOM, oldUom, uom));
			}
		}
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
		case CclmsPackage.KPI_LINK_ENGINE__KPI_ID:
			return getKpiId();
		case CclmsPackage.KPI_LINK_ENGINE__KPI_DESC:
			return getKpiDesc();
		case CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE:
			return getKpiValue();
		case CclmsPackage.KPI_LINK_ENGINE__UOM:
			return getUom();
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
		case CclmsPackage.KPI_LINK_ENGINE__KPI_ID:
			setKpiId((Integer) newValue);
			return;
		case CclmsPackage.KPI_LINK_ENGINE__KPI_DESC:
			setKpiDesc((String) newValue);
			return;
		case CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE:
			setKpiValue((Double) newValue);
			return;
		case CclmsPackage.KPI_LINK_ENGINE__UOM:
			setUom((String) newValue);
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
		case CclmsPackage.KPI_LINK_ENGINE__KPI_ID:
			unsetKpiId();
			return;
		case CclmsPackage.KPI_LINK_ENGINE__KPI_DESC:
			setKpiDesc(KPI_DESC_EDEFAULT);
			return;
		case CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE:
			unsetKpiValue();
			return;
		case CclmsPackage.KPI_LINK_ENGINE__UOM:
			setUom(UOM_EDEFAULT);
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
		case CclmsPackage.KPI_LINK_ENGINE__KPI_ID:
			return isSetKpiId();
		case CclmsPackage.KPI_LINK_ENGINE__KPI_DESC:
			return KPI_DESC_EDEFAULT == null ? kpiDesc != null
					: !KPI_DESC_EDEFAULT.equals(kpiDesc);
		case CclmsPackage.KPI_LINK_ENGINE__KPI_VALUE:
			return isSetKpiValue();
		case CclmsPackage.KPI_LINK_ENGINE__UOM:
			return UOM_EDEFAULT == null ? uom != null : !UOM_EDEFAULT
					.equals(uom);
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
		result.append(", kpiValue: ");
		if ((_booleanFlags & KPI_VALUE_ESETFLAG) != 0)
			result.append(kpiValue);
		else
			result.append("<unset>");
		result.append(", uom: ");
		result.append(uom);
		result.append(')');
		return result.toString();
	}

} //KpiLinkEngineImpl
