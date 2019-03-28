/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.TrainMst;
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
 *   <li>{@link cclms.impl.TrainTypeMappingMstImpl#getTrainType <em>Train Type</em>}</li>
 *   <li>{@link cclms.impl.TrainTypeMappingMstImpl#getTrainTypeDesc <em>Train Type Desc</em>}</li>
 *   <li>{@link cclms.impl.TrainTypeMappingMstImpl#getRefTrainTypeCclms <em>Ref Train Type Cclms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrainTypeMappingMstImpl extends IloDomObjectImpl implements
		TrainTypeMappingMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getTrainType() <em>Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainType() <em>Train Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainType()
	 * @generated
	 * @ordered
	 */
	protected String trainType = TRAIN_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getRefTrainTypeCclms() <em>Ref Train Type Cclms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainTypeCclms()
	 * @generated
	 * @ordered
	 */
	protected TrainTypeMst refTrainTypeCclms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainTypeMappingMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.Literals.TRAIN_TYPE_MAPPING_MST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainType() {
		return trainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainType(String newTrainType) {
		String oldTrainType = trainType;
		trainType = newTrainType;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE,
								oldTrainType, trainType);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE,
						oldTrainType, trainType));
			}
		}
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
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC,
								oldTrainTypeDesc, trainTypeDesc);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC,
						oldTrainTypeDesc, trainTypeDesc));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst getRefTrainTypeCclms() {
		return refTrainTypeCclms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefTrainTypeCclms(
			TrainTypeMst newRefTrainTypeCclms, NotificationChain msgs) {
		TrainTypeMst oldRefTrainTypeCclms = refTrainTypeCclms;
		refTrainTypeCclms = newRefTrainTypeCclms;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS,
								oldRefTrainTypeCclms, newRefTrainTypeCclms);
			} else {
				notification = new ENotificationImpl(
						this,
						Notification.SET,
						CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS,
						oldRefTrainTypeCclms, newRefTrainTypeCclms);
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
	public void setRefTrainTypeCclms(TrainTypeMst newRefTrainTypeCclms) {
		if (newRefTrainTypeCclms != refTrainTypeCclms) {
			NotificationChain msgs = null;
			if (refTrainTypeCclms != null)
				msgs = ((InternalEObject) refTrainTypeCclms)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS,
								TrainTypeMst.class, msgs);
			if (newRefTrainTypeCclms != null)
				msgs = ((InternalEObject) newRefTrainTypeCclms)
						.eInverseAdd(
								this,
								CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS,
								TrainTypeMst.class, msgs);
			msgs = basicSetRefTrainTypeCclms(newRefTrainTypeCclms, msgs);
			if (msgs != null) {
				msgs.dispatch();
				if (getDomResource() != null)
					getDomResource().getNotificationFactory().release(msgs);
			}
		} else if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory()
						.createNotification(
								this,
								Notification.SET,
								CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS,
								newRefTrainTypeCclms, newRefTrainTypeCclms);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(
						this,
						Notification.SET,
						CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS,
						newRefTrainTypeCclms, newRefTrainTypeCclms));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainTypeMst getTrainTypeCclms() {
		TrainTypeMst obj = getRefTrainTypeCclms();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainTypeCclms(TrainTypeMst obj) {
		setRefTrainTypeCclms(obj);
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
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS:
			if (refTrainTypeCclms != null)
				msgs = ((InternalEObject) refTrainTypeCclms)
						.eInverseRemove(
								this,
								CclmsPackage.TRAIN_TYPE_MST__REF_TRAIN_TYPE_MAPPING_MST_TRAIN_TYPE_CCLMS,
								TrainTypeMst.class, msgs);
			return basicSetRefTrainTypeCclms((TrainTypeMst) otherEnd, msgs);
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
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS:
			return basicSetRefTrainTypeCclms(null, msgs);
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
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE:
			return getTrainType();
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC:
			return getTrainTypeDesc();
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS:
			return getRefTrainTypeCclms();
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
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE:
			setTrainType((String) newValue);
			return;
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC:
			setTrainTypeDesc((String) newValue);
			return;
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS:
			setRefTrainTypeCclms((TrainTypeMst) newValue);
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
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE:
			setTrainType(TRAIN_TYPE_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC:
			setTrainTypeDesc(TRAIN_TYPE_DESC_EDEFAULT);
			return;
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS:
			setRefTrainTypeCclms((TrainTypeMst) null);
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
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE:
			return TRAIN_TYPE_EDEFAULT == null ? trainType != null
					: !TRAIN_TYPE_EDEFAULT.equals(trainType);
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__TRAIN_TYPE_DESC:
			return TRAIN_TYPE_DESC_EDEFAULT == null ? trainTypeDesc != null
					: !TRAIN_TYPE_DESC_EDEFAULT.equals(trainTypeDesc);
		case CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_TRAIN_TYPE_CCLMS:
			return refTrainTypeCclms != null;
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
		result.append(" (trainType: ");
		result.append(trainType);
		result.append(", trainTypeDesc: ");
		result.append(trainTypeDesc);
		result.append(')');
		return result.toString();
	}

} //TrainTypeMappingMstImpl
