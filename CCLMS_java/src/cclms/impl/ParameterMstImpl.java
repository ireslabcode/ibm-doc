/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.ParameterMst;
import cclms.ParameterValue;
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
 *   <li>{@link cclms.impl.ParameterMstImpl#getParameterId <em>Parameter Id</em>}</li>
 *   <li>{@link cclms.impl.ParameterMstImpl#getParameterDesc <em>Parameter Desc</em>}</li>
 *   <li>{@link cclms.impl.ParameterMstImpl#getUom <em>Uom</em>}</li>
 *   <li>{@link cclms.impl.ParameterMstImpl#getGlobalValue <em>Global Value</em>}</li>
 *   <li>{@link cclms.impl.ParameterMstImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link cclms.impl.ParameterMstImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link cclms.impl.ParameterMstImpl#getRefParameterValueParameterId <em>Ref Parameter Value Parameter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterMstImpl extends IloDomObjectImpl implements ParameterMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getParameterId() <em>Parameter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterId()
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMETER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParameterId() <em>Parameter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterId()
	 * @generated
	 * @ordered
	 */
	protected int parameterId = PARAMETER_ID_EDEFAULT;

	/**
	 * The flag representing whether the Parameter Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int PARAMETER_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getParameterDesc() <em>Parameter Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterDesc() <em>Parameter Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterDesc()
	 * @generated
	 * @ordered
	 */
	protected String parameterDesc = PARAMETER_DESC_EDEFAULT;

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
	 * The default value of the '{@link #getGlobalValue() <em>Global Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalValue()
	 * @generated
	 * @ordered
	 */
	protected static final double GLOBAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGlobalValue() <em>Global Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalValue()
	 * @generated
	 * @ordered
	 */
	protected double globalValue = GLOBAL_VALUE_EDEFAULT;

	/**
	 * The flag representing whether the Global Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int GLOBAL_VALUE_ESETFLAG = 1 << 1;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The flag representing whether the Min Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_ESETFLAG = 1 << 2;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The flag representing whether the Max Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_ESETFLAG = 1 << 3;

	/**
	 * The cached value of the '{@link #getRefParameterValueParameterId() <em>Ref Parameter Value Parameter Id</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefParameterValueParameterId()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> refParameterValueParameterId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.PARAMETER_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParameterId() {
		return parameterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterId(int newParameterId) {
		int oldParameterId = parameterId;
		parameterId = newParameterId;
		boolean oldParameterIdESet = (_booleanFlags & PARAMETER_ID_ESETFLAG) != 0;
		_booleanFlags |= PARAMETER_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_MST__PARAMETER_ID,
								oldParameterId, parameterId,
								!oldParameterIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_MST__PARAMETER_ID,
						oldParameterId, parameterId, !oldParameterIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParameterId() {
		int oldParameterId = parameterId;
		boolean oldParameterIdESet = (_booleanFlags & PARAMETER_ID_ESETFLAG) != 0;
		parameterId = PARAMETER_ID_EDEFAULT;
		_booleanFlags &= ~PARAMETER_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.PARAMETER_MST__PARAMETER_ID,
								oldParameterId, PARAMETER_ID_EDEFAULT,
								oldParameterIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.PARAMETER_MST__PARAMETER_ID,
						oldParameterId, PARAMETER_ID_EDEFAULT,
						oldParameterIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameterId() {
		return (_booleanFlags & PARAMETER_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterDesc() {
		return parameterDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterDesc(String newParameterDesc) {
		String oldParameterDesc = parameterDesc;
		parameterDesc = newParameterDesc;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_MST__PARAMETER_DESC,
								oldParameterDesc, parameterDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_MST__PARAMETER_DESC,
						oldParameterDesc, parameterDesc));
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
								Notification.SET,
								CclmsPackage.PARAMETER_MST__UOM, oldUom, uom);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_MST__UOM, oldUom, uom));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGlobalValue() {
		return globalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalValue(double newGlobalValue) {
		double oldGlobalValue = globalValue;
		globalValue = newGlobalValue;
		boolean oldGlobalValueESet = (_booleanFlags & GLOBAL_VALUE_ESETFLAG) != 0;
		_booleanFlags |= GLOBAL_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_MST__GLOBAL_VALUE,
								oldGlobalValue, globalValue,
								!oldGlobalValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_MST__GLOBAL_VALUE,
						oldGlobalValue, globalValue, !oldGlobalValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGlobalValue() {
		double oldGlobalValue = globalValue;
		boolean oldGlobalValueESet = (_booleanFlags & GLOBAL_VALUE_ESETFLAG) != 0;
		globalValue = GLOBAL_VALUE_EDEFAULT;
		_booleanFlags &= ~GLOBAL_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.PARAMETER_MST__GLOBAL_VALUE,
								oldGlobalValue, GLOBAL_VALUE_EDEFAULT,
								oldGlobalValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.PARAMETER_MST__GLOBAL_VALUE,
						oldGlobalValue, GLOBAL_VALUE_EDEFAULT,
						oldGlobalValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGlobalValue() {
		return (_booleanFlags & GLOBAL_VALUE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		boolean oldMinValueESet = (_booleanFlags & MIN_VALUE_ESETFLAG) != 0;
		_booleanFlags |= MIN_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_MST__MIN_VALUE,
								oldMinValue, minValue, !oldMinValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_MST__MIN_VALUE, oldMinValue,
						minValue, !oldMinValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinValue() {
		double oldMinValue = minValue;
		boolean oldMinValueESet = (_booleanFlags & MIN_VALUE_ESETFLAG) != 0;
		minValue = MIN_VALUE_EDEFAULT;
		_booleanFlags &= ~MIN_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.PARAMETER_MST__MIN_VALUE,
								oldMinValue, MIN_VALUE_EDEFAULT,
								oldMinValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.PARAMETER_MST__MIN_VALUE, oldMinValue,
						MIN_VALUE_EDEFAULT, oldMinValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinValue() {
		return (_booleanFlags & MIN_VALUE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		boolean oldMaxValueESet = (_booleanFlags & MAX_VALUE_ESETFLAG) != 0;
		_booleanFlags |= MAX_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.PARAMETER_MST__MAX_VALUE,
								oldMaxValue, maxValue, !oldMaxValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.PARAMETER_MST__MAX_VALUE, oldMaxValue,
						maxValue, !oldMaxValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxValue() {
		double oldMaxValue = maxValue;
		boolean oldMaxValueESet = (_booleanFlags & MAX_VALUE_ESETFLAG) != 0;
		maxValue = MAX_VALUE_EDEFAULT;
		_booleanFlags &= ~MAX_VALUE_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.PARAMETER_MST__MAX_VALUE,
								oldMaxValue, MAX_VALUE_EDEFAULT,
								oldMaxValueESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.PARAMETER_MST__MAX_VALUE, oldMaxValue,
						MAX_VALUE_EDEFAULT, oldMaxValueESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxValue() {
		return (_booleanFlags & MAX_VALUE_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterValue> getRefParameterValueParameterId() {
		if (refParameterValueParameterId == null) {
			refParameterValueParameterId = new IloDomObjectWithInverseEList<ParameterValue>(
					ParameterValue.class,
					this,
					CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID,
					CclmsPackage.PARAMETER_VALUE__REF_PARAMETER_ID);
		}
		return refParameterValueParameterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterValue> getParameterValueParameterId() {
		return getRefParameterValueParameterId();
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
		case CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefParameterValueParameterId())
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
		case CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID:
			return ((InternalEList<?>) getRefParameterValueParameterId())
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
		case CclmsPackage.PARAMETER_MST__PARAMETER_ID:
			return getParameterId();
		case CclmsPackage.PARAMETER_MST__PARAMETER_DESC:
			return getParameterDesc();
		case CclmsPackage.PARAMETER_MST__UOM:
			return getUom();
		case CclmsPackage.PARAMETER_MST__GLOBAL_VALUE:
			return getGlobalValue();
		case CclmsPackage.PARAMETER_MST__MIN_VALUE:
			return getMinValue();
		case CclmsPackage.PARAMETER_MST__MAX_VALUE:
			return getMaxValue();
		case CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID:
			return getRefParameterValueParameterId();
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
		case CclmsPackage.PARAMETER_MST__PARAMETER_ID:
			setParameterId((Integer) newValue);
			return;
		case CclmsPackage.PARAMETER_MST__PARAMETER_DESC:
			setParameterDesc((String) newValue);
			return;
		case CclmsPackage.PARAMETER_MST__UOM:
			setUom((String) newValue);
			return;
		case CclmsPackage.PARAMETER_MST__GLOBAL_VALUE:
			setGlobalValue((Double) newValue);
			return;
		case CclmsPackage.PARAMETER_MST__MIN_VALUE:
			setMinValue((Double) newValue);
			return;
		case CclmsPackage.PARAMETER_MST__MAX_VALUE:
			setMaxValue((Double) newValue);
			return;
		case CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID:
			getRefParameterValueParameterId().clear();
			getRefParameterValueParameterId().addAll(
					(Collection<? extends ParameterValue>) newValue);
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
		case CclmsPackage.PARAMETER_MST__PARAMETER_ID:
			unsetParameterId();
			return;
		case CclmsPackage.PARAMETER_MST__PARAMETER_DESC:
			setParameterDesc(PARAMETER_DESC_EDEFAULT);
			return;
		case CclmsPackage.PARAMETER_MST__UOM:
			setUom(UOM_EDEFAULT);
			return;
		case CclmsPackage.PARAMETER_MST__GLOBAL_VALUE:
			unsetGlobalValue();
			return;
		case CclmsPackage.PARAMETER_MST__MIN_VALUE:
			unsetMinValue();
			return;
		case CclmsPackage.PARAMETER_MST__MAX_VALUE:
			unsetMaxValue();
			return;
		case CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID:
			getRefParameterValueParameterId().clear();
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
		case CclmsPackage.PARAMETER_MST__PARAMETER_ID:
			return isSetParameterId();
		case CclmsPackage.PARAMETER_MST__PARAMETER_DESC:
			return PARAMETER_DESC_EDEFAULT == null ? parameterDesc != null
					: !PARAMETER_DESC_EDEFAULT.equals(parameterDesc);
		case CclmsPackage.PARAMETER_MST__UOM:
			return UOM_EDEFAULT == null ? uom != null : !UOM_EDEFAULT
					.equals(uom);
		case CclmsPackage.PARAMETER_MST__GLOBAL_VALUE:
			return isSetGlobalValue();
		case CclmsPackage.PARAMETER_MST__MIN_VALUE:
			return isSetMinValue();
		case CclmsPackage.PARAMETER_MST__MAX_VALUE:
			return isSetMaxValue();
		case CclmsPackage.PARAMETER_MST__REF_PARAMETER_VALUE_PARAMETER_ID:
			return refParameterValueParameterId != null
					&& !refParameterValueParameterId.isEmpty();
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
		result.append(" (parameterId: ");
		if ((_booleanFlags & PARAMETER_ID_ESETFLAG) != 0)
			result.append(parameterId);
		else
			result.append("<unset>");
		result.append(", parameterDesc: ");
		result.append(parameterDesc);
		result.append(", uom: ");
		result.append(uom);
		result.append(", globalValue: ");
		if ((_booleanFlags & GLOBAL_VALUE_ESETFLAG) != 0)
			result.append(globalValue);
		else
			result.append("<unset>");
		result.append(", minValue: ");
		if ((_booleanFlags & MIN_VALUE_ESETFLAG) != 0)
			result.append(minValue);
		else
			result.append("<unset>");
		result.append(", maxValue: ");
		if ((_booleanFlags & MAX_VALUE_ESETFLAG) != 0)
			result.append(maxValue);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParameterMstImpl
