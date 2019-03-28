/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.DivisionMst;
import cclms.KpiValue;
import cclms.LinkMst;
import cclms.ParameterMst;
import cclms.ParameterValue;
import cclms.SegmentMst;
import cclms.StationMst;
import cclms.TrainSegmentMst;
import cclms.TrainTypeMappingMst;
import cclms.TrainTypeMst;
import cclms.UserMst;
import cclms.UserRoleMst;
import cclms.ZoneMst;

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
 *   <li>{@link cclms.impl.UserMstImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getUser <em>User</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getUserPwd <em>User Pwd</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getActive <em>Active</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefParameterValueCreatedBy <em>Ref Parameter Value Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefDivisionId <em>Ref Division Id</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefLobbyId <em>Ref Lobby Id</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefUserRole <em>Ref User Role</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefZoneId <em>Ref Zone Id</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefKpiValueCreatedBy <em>Ref Kpi Value Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefParameterMstCreatedBy <em>Ref Parameter Mst Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefParameterMstLastModifiedBy <em>Ref Parameter Mst Last Modified By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefTrainTypeMstCreatedBy <em>Ref Train Type Mst Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefTrainTypeMappingMstCreatedBy <em>Ref Train Type Mapping Mst Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefTrainTypeMappingMstLastModifiedBy <em>Ref Train Type Mapping Mst Last Modified By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefSegmentMstCreatedBy <em>Ref Segment Mst Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefTrainSegmentMstCreatedBy <em>Ref Train Segment Mst Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefLinkMstCreatedBy <em>Ref Link Mst Created By</em>}</li>
 *   <li>{@link cclms.impl.UserMstImpl#getRefLinkMstLastModifiedBy <em>Ref Link Mst Last Modified By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserMstImpl extends IloDomObjectImpl implements UserMst {
	/**
	 * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected int _booleanFlags = 0;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected int userId = USER_ID_EDEFAULT;

	/**
	 * The flag representing whether the User Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_ESETFLAG = 1 << 0;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserPwd() <em>User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPwd() <em>User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPwd()
	 * @generated
	 * @ordered
	 */
	protected String userPwd = USER_PWD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected String active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefParameterValueCreatedBy() <em>Ref Parameter Value Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefParameterValueCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterValue> refParameterValueCreatedBy;

	/**
	 * The cached value of the '{@link #getRefDivisionId() <em>Ref Division Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDivisionId()
	 * @generated
	 * @ordered
	 */
	protected DivisionMst refDivisionId;

	/**
	 * The cached value of the '{@link #getRefLobbyId() <em>Ref Lobby Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLobbyId()
	 * @generated
	 * @ordered
	 */
	protected StationMst refLobbyId;

	/**
	 * The cached value of the '{@link #getRefUserRole() <em>Ref User Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefUserRole()
	 * @generated
	 * @ordered
	 */
	protected UserRoleMst refUserRole;

	/**
	 * The cached value of the '{@link #getRefZoneId() <em>Ref Zone Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefZoneId()
	 * @generated
	 * @ordered
	 */
	protected ZoneMst refZoneId;

	/**
	 * The cached value of the '{@link #getRefKpiValueCreatedBy() <em>Ref Kpi Value Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefKpiValueCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<KpiValue> refKpiValueCreatedBy;

	/**
	 * The cached value of the '{@link #getRefParameterMstCreatedBy() <em>Ref Parameter Mst Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefParameterMstCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterMst> refParameterMstCreatedBy;

	/**
	 * The cached value of the '{@link #getRefParameterMstLastModifiedBy() <em>Ref Parameter Mst Last Modified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefParameterMstLastModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterMst> refParameterMstLastModifiedBy;

	/**
	 * The cached value of the '{@link #getRefTrainTypeMstCreatedBy() <em>Ref Train Type Mst Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainTypeMstCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainTypeMst> refTrainTypeMstCreatedBy;

	/**
	 * The cached value of the '{@link #getRefTrainTypeMappingMstCreatedBy() <em>Ref Train Type Mapping Mst Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainTypeMappingMstCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainTypeMappingMst> refTrainTypeMappingMstCreatedBy;

	/**
	 * The cached value of the '{@link #getRefTrainTypeMappingMstLastModifiedBy() <em>Ref Train Type Mapping Mst Last Modified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainTypeMappingMstLastModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainTypeMappingMst> refTrainTypeMappingMstLastModifiedBy;

	/**
	 * The cached value of the '{@link #getRefSegmentMstCreatedBy() <em>Ref Segment Mst Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefSegmentMstCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentMst> refSegmentMstCreatedBy;

	/**
	 * The cached value of the '{@link #getRefTrainSegmentMstCreatedBy() <em>Ref Train Segment Mst Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTrainSegmentMstCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainSegmentMst> refTrainSegmentMstCreatedBy;

	/**
	 * The cached value of the '{@link #getRefLinkMstCreatedBy() <em>Ref Link Mst Created By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkMstCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMst> refLinkMstCreatedBy;

	/**
	 * The cached value of the '{@link #getRefLinkMstLastModifiedBy() <em>Ref Link Mst Last Modified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefLinkMstLastModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkMst> refLinkMstLastModifiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserMstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclmsPackage.eINSTANCE.getUserMst();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(int newUserId) {
		int oldUserId = userId;
		userId = newUserId;
		boolean oldUserIdESet = (_booleanFlags & USER_ID_ESETFLAG) != 0;
		_booleanFlags |= USER_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_MST__USER_ID, oldUserId,
								userId, !oldUserIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__USER_ID, oldUserId, userId,
						!oldUserIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserId() {
		int oldUserId = userId;
		boolean oldUserIdESet = (_booleanFlags & USER_ID_ESETFLAG) != 0;
		userId = USER_ID_EDEFAULT;
		_booleanFlags &= ~USER_ID_ESETFLAG;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.UNSET,
								CclmsPackage.USER_MST__USER_ID, oldUserId,
								USER_ID_EDEFAULT, oldUserIdESet);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.UNSET,
						CclmsPackage.USER_MST__USER_ID, oldUserId,
						USER_ID_EDEFAULT, oldUserIdESet));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserId() {
		return (_booleanFlags & USER_ID_ESETFLAG) != 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET, CclmsPackage.USER_MST__USER,
								oldUser, user);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__USER, oldUser, user));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserPwd() {
		return userPwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserPwd(String newUserPwd) {
		String oldUserPwd = userPwd;
		userPwd = newUserPwd;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_MST__USER_PWD, oldUserPwd,
								userPwd);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__USER_PWD, oldUserPwd, userPwd));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_MST__FIRST_NAME,
								oldFirstName, firstName);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__FIRST_NAME, oldFirstName,
						firstName));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_MST__LAST_NAME, oldLastName,
								lastName);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__LAST_NAME, oldLastName, lastName));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(String newActive) {
		String oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET,
								CclmsPackage.USER_MST__ACTIVE, oldActive,
								active);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__ACTIVE, oldActive, active));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired()) {
			if (getDomResource() != null) {
				ilog.odm.dom.impl.resource.IloDomNotificationImpl notif = getDomResource()
						.getNotificationFactory().createNotification(this,
								Notification.SET, CclmsPackage.USER_MST__EMAIL,
								oldEmail, email);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__EMAIL, oldEmail, email));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterValue> getRefParameterValueCreatedBy() {
		if (refParameterValueCreatedBy == null) {
			refParameterValueCreatedBy = new IloDomObjectWithInverseEList<ParameterValue>(
					ParameterValue.class, this,
					CclmsPackage.USER_MST__REF_PARAMETER_VALUE_CREATED_BY,
					CclmsPackage.PARAMETER_VALUE__REF_CREATED_BY);
		}
		return refParameterValueCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionMst getRefDivisionId() {
		return refDivisionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefDivisionId(
			DivisionMst newRefDivisionId, NotificationChain msgs) {
		DivisionMst oldRefDivisionId = refDivisionId;
		refDivisionId = newRefDivisionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.USER_MST__REF_DIVISION_ID,
								oldRefDivisionId, newRefDivisionId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_DIVISION_ID,
						oldRefDivisionId, newRefDivisionId);
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
	public void setRefDivisionId(DivisionMst newRefDivisionId) {
		if (newRefDivisionId != refDivisionId) {
			NotificationChain msgs = null;
			if (refDivisionId != null)
				msgs = ((InternalEObject) refDivisionId).eInverseRemove(this,
						CclmsPackage.DIVISION_MST__REF_USER_MST_DIVISION_ID,
						DivisionMst.class, msgs);
			if (newRefDivisionId != null)
				msgs = ((InternalEObject) newRefDivisionId).eInverseAdd(this,
						CclmsPackage.DIVISION_MST__REF_USER_MST_DIVISION_ID,
						DivisionMst.class, msgs);
			msgs = basicSetRefDivisionId(newRefDivisionId, msgs);
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
								CclmsPackage.USER_MST__REF_DIVISION_ID,
								newRefDivisionId, newRefDivisionId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_DIVISION_ID,
						newRefDivisionId, newRefDivisionId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getRefLobbyId() {
		return refLobbyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefLobbyId(StationMst newRefLobbyId,
			NotificationChain msgs) {
		StationMst oldRefLobbyId = refLobbyId;
		refLobbyId = newRefLobbyId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.USER_MST__REF_LOBBY_ID,
								oldRefLobbyId, newRefLobbyId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_LOBBY_ID, oldRefLobbyId,
						newRefLobbyId);
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
	public void setRefLobbyId(StationMst newRefLobbyId) {
		if (newRefLobbyId != refLobbyId) {
			NotificationChain msgs = null;
			if (refLobbyId != null)
				msgs = ((InternalEObject) refLobbyId).eInverseRemove(this,
						CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID,
						StationMst.class, msgs);
			if (newRefLobbyId != null)
				msgs = ((InternalEObject) newRefLobbyId).eInverseAdd(this,
						CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID,
						StationMst.class, msgs);
			msgs = basicSetRefLobbyId(newRefLobbyId, msgs);
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
								CclmsPackage.USER_MST__REF_LOBBY_ID,
								newRefLobbyId, newRefLobbyId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_LOBBY_ID, newRefLobbyId,
						newRefLobbyId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRoleMst getRefUserRole() {
		return refUserRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefUserRole(UserRoleMst newRefUserRole,
			NotificationChain msgs) {
		UserRoleMst oldRefUserRole = refUserRole;
		refUserRole = newRefUserRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.USER_MST__REF_USER_ROLE,
								oldRefUserRole, newRefUserRole);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_USER_ROLE, oldRefUserRole,
						newRefUserRole);
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
	public void setRefUserRole(UserRoleMst newRefUserRole) {
		if (newRefUserRole != refUserRole) {
			NotificationChain msgs = null;
			if (refUserRole != null)
				msgs = ((InternalEObject) refUserRole).eInverseRemove(this,
						CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE,
						UserRoleMst.class, msgs);
			if (newRefUserRole != null)
				msgs = ((InternalEObject) newRefUserRole).eInverseAdd(this,
						CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE,
						UserRoleMst.class, msgs);
			msgs = basicSetRefUserRole(newRefUserRole, msgs);
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
								CclmsPackage.USER_MST__REF_USER_ROLE,
								newRefUserRole, newRefUserRole);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_USER_ROLE, newRefUserRole,
						newRefUserRole));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneMst getRefZoneId() {
		return refZoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefZoneId(ZoneMst newRefZoneId,
			NotificationChain msgs) {
		ZoneMst oldRefZoneId = refZoneId;
		refZoneId = newRefZoneId;
		if (eNotificationRequired()) {
			ENotificationImpl notification;
			if (getDomResource() != null) {
				notification = getDomResource().getNotificationFactory()
						.createNotification(this, Notification.SET,
								CclmsPackage.USER_MST__REF_ZONE_ID,
								oldRefZoneId, newRefZoneId);
			} else {
				notification = new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_ZONE_ID, oldRefZoneId,
						newRefZoneId);
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
	public void setRefZoneId(ZoneMst newRefZoneId) {
		if (newRefZoneId != refZoneId) {
			NotificationChain msgs = null;
			if (refZoneId != null)
				msgs = ((InternalEObject) refZoneId).eInverseRemove(this,
						CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID,
						ZoneMst.class, msgs);
			if (newRefZoneId != null)
				msgs = ((InternalEObject) newRefZoneId).eInverseAdd(this,
						CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID,
						ZoneMst.class, msgs);
			msgs = basicSetRefZoneId(newRefZoneId, msgs);
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
								CclmsPackage.USER_MST__REF_ZONE_ID,
								newRefZoneId, newRefZoneId);
				eNotify(notif);
				getDomResource().getNotificationFactory().release(notif);
			} else {
				eNotify(new ENotificationImpl(this, Notification.SET,
						CclmsPackage.USER_MST__REF_ZONE_ID, newRefZoneId,
						newRefZoneId));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiValue> getRefKpiValueCreatedBy() {
		if (refKpiValueCreatedBy == null) {
			refKpiValueCreatedBy = new IloDomObjectWithInverseEList<KpiValue>(
					KpiValue.class, this,
					CclmsPackage.USER_MST__REF_KPI_VALUE_CREATED_BY,
					CclmsPackage.KPI_VALUE__REF_CREATED_BY);
		}
		return refKpiValueCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterMst> getRefParameterMstCreatedBy() {
		if (refParameterMstCreatedBy == null) {
			refParameterMstCreatedBy = new IloDomObjectWithInverseEList<ParameterMst>(
					ParameterMst.class, this,
					CclmsPackage.USER_MST__REF_PARAMETER_MST_CREATED_BY,
					CclmsPackage.PARAMETER_MST__REF_CREATED_BY);
		}
		return refParameterMstCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterMst> getRefParameterMstLastModifiedBy() {
		if (refParameterMstLastModifiedBy == null) {
			refParameterMstLastModifiedBy = new IloDomObjectWithInverseEList<ParameterMst>(
					ParameterMst.class, this,
					CclmsPackage.USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY,
					CclmsPackage.PARAMETER_MST__REF_LAST_MODIFIED_BY);
		}
		return refParameterMstLastModifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMst> getRefTrainTypeMstCreatedBy() {
		if (refTrainTypeMstCreatedBy == null) {
			refTrainTypeMstCreatedBy = new IloDomObjectWithInverseEList<TrainTypeMst>(
					TrainTypeMst.class, this,
					CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY,
					CclmsPackage.TRAIN_TYPE_MST__REF_CREATED_BY);
		}
		return refTrainTypeMstCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMappingMst> getRefTrainTypeMappingMstCreatedBy() {
		if (refTrainTypeMappingMstCreatedBy == null) {
			refTrainTypeMappingMstCreatedBy = new IloDomObjectWithInverseEList<TrainTypeMappingMst>(
					TrainTypeMappingMst.class,
					this,
					CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY,
					CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_CREATED_BY);
		}
		return refTrainTypeMappingMstCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMappingMst> getRefTrainTypeMappingMstLastModifiedBy() {
		if (refTrainTypeMappingMstLastModifiedBy == null) {
			refTrainTypeMappingMstLastModifiedBy = new IloDomObjectWithInverseEList<TrainTypeMappingMst>(
					TrainTypeMappingMst.class,
					this,
					CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY,
					CclmsPackage.TRAIN_TYPE_MAPPING_MST__REF_LAST_MODIFIED_BY);
		}
		return refTrainTypeMappingMstLastModifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMst> getRefSegmentMstCreatedBy() {
		if (refSegmentMstCreatedBy == null) {
			refSegmentMstCreatedBy = new IloDomObjectWithInverseEList<SegmentMst>(
					SegmentMst.class, this,
					CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY,
					CclmsPackage.SEGMENT_MST__REF_CREATED_BY);
		}
		return refSegmentMstCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getRefTrainSegmentMstCreatedBy() {
		if (refTrainSegmentMstCreatedBy == null) {
			refTrainSegmentMstCreatedBy = new IloDomObjectWithInverseEList<TrainSegmentMst>(
					TrainSegmentMst.class, this,
					CclmsPackage.USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY,
					CclmsPackage.TRAIN_SEGMENT_MST__REF_CREATED_BY);
		}
		return refTrainSegmentMstCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getRefLinkMstCreatedBy() {
		if (refLinkMstCreatedBy == null) {
			refLinkMstCreatedBy = new IloDomObjectWithInverseEList<LinkMst>(
					LinkMst.class, this,
					CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY,
					CclmsPackage.LINK_MST__REF_CREATED_BY);
		}
		return refLinkMstCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getRefLinkMstLastModifiedBy() {
		if (refLinkMstLastModifiedBy == null) {
			refLinkMstLastModifiedBy = new IloDomObjectWithInverseEList<LinkMst>(
					LinkMst.class, this,
					CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY,
					CclmsPackage.LINK_MST__REF_LAST_MODIFIED_BY);
		}
		return refLinkMstLastModifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterValue> getParameterValueCreatedBy() {
		return getRefParameterValueCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionMst getDivisionId() {
		DivisionMst obj = getRefDivisionId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDivisionId(DivisionMst obj) {
		setRefDivisionId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationMst getLobbyId() {
		StationMst obj = getRefLobbyId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLobbyId(StationMst obj) {
		setRefLobbyId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRoleMst getUserRole() {
		UserRoleMst obj = getRefUserRole();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRole(UserRoleMst obj) {
		setRefUserRole(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneMst getZoneId() {
		ZoneMst obj = getRefZoneId();
		return isNullOrProxy(obj) ? null : obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoneId(ZoneMst obj) {
		setRefZoneId(obj);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<KpiValue> getKpiValueCreatedBy() {
		return getRefKpiValueCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterMst> getParameterMstCreatedBy() {
		return getRefParameterMstCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ParameterMst> getParameterMstLastModifiedBy() {
		return getRefParameterMstLastModifiedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMst> getTrainTypeMstCreatedBy() {
		return getRefTrainTypeMstCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMappingMst> getTrainTypeMappingMstCreatedBy() {
		return getRefTrainTypeMappingMstCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainTypeMappingMst> getTrainTypeMappingMstLastModifiedBy() {
		return getRefTrainTypeMappingMstLastModifiedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<SegmentMst> getSegmentMstCreatedBy() {
		return getRefSegmentMstCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TrainSegmentMst> getTrainSegmentMstCreatedBy() {
		return getRefTrainSegmentMstCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getLinkMstCreatedBy() {
		return getRefLinkMstCreatedBy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkMst> getLinkMstLastModifiedBy() {
		return getRefLinkMstLastModifiedBy();
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
		case CclmsPackage.USER_MST__REF_PARAMETER_VALUE_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefParameterValueCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_DIVISION_ID:
			if (refDivisionId != null)
				msgs = ((InternalEObject) refDivisionId).eInverseRemove(this,
						CclmsPackage.DIVISION_MST__REF_USER_MST_DIVISION_ID,
						DivisionMst.class, msgs);
			return basicSetRefDivisionId((DivisionMst) otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_LOBBY_ID:
			if (refLobbyId != null)
				msgs = ((InternalEObject) refLobbyId).eInverseRemove(this,
						CclmsPackage.STATION_MST__REF_USER_MST_LOBBY_ID,
						StationMst.class, msgs);
			return basicSetRefLobbyId((StationMst) otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_USER_ROLE:
			if (refUserRole != null)
				msgs = ((InternalEObject) refUserRole).eInverseRemove(this,
						CclmsPackage.USER_ROLE_MST__REF_USER_MST_USER_ROLE,
						UserRoleMst.class, msgs);
			return basicSetRefUserRole((UserRoleMst) otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_ZONE_ID:
			if (refZoneId != null)
				msgs = ((InternalEObject) refZoneId).eInverseRemove(this,
						CclmsPackage.ZONE_MST__REF_USER_MST_ZONE_ID,
						ZoneMst.class, msgs);
			return basicSetRefZoneId((ZoneMst) otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_KPI_VALUE_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefKpiValueCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefParameterMstCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefParameterMstLastModifiedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainTypeMstCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainTypeMappingMstCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainTypeMappingMstLastModifiedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefSegmentMstCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefTrainSegmentMstCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkMstCreatedBy())
					.basicAdd(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRefLinkMstLastModifiedBy())
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
		case CclmsPackage.USER_MST__REF_PARAMETER_VALUE_CREATED_BY:
			return ((InternalEList<?>) getRefParameterValueCreatedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_DIVISION_ID:
			return basicSetRefDivisionId(null, msgs);
		case CclmsPackage.USER_MST__REF_LOBBY_ID:
			return basicSetRefLobbyId(null, msgs);
		case CclmsPackage.USER_MST__REF_USER_ROLE:
			return basicSetRefUserRole(null, msgs);
		case CclmsPackage.USER_MST__REF_ZONE_ID:
			return basicSetRefZoneId(null, msgs);
		case CclmsPackage.USER_MST__REF_KPI_VALUE_CREATED_BY:
			return ((InternalEList<?>) getRefKpiValueCreatedBy()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_CREATED_BY:
			return ((InternalEList<?>) getRefParameterMstCreatedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY:
			return ((InternalEList<?>) getRefParameterMstLastModifiedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY:
			return ((InternalEList<?>) getRefTrainTypeMstCreatedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY:
			return ((InternalEList<?>) getRefTrainTypeMappingMstCreatedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY:
			return ((InternalEList<?>) getRefTrainTypeMappingMstLastModifiedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY:
			return ((InternalEList<?>) getRefSegmentMstCreatedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY:
			return ((InternalEList<?>) getRefTrainSegmentMstCreatedBy())
					.basicRemove(otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY:
			return ((InternalEList<?>) getRefLinkMstCreatedBy()).basicRemove(
					otherEnd, msgs);
		case CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY:
			return ((InternalEList<?>) getRefLinkMstLastModifiedBy())
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
		case CclmsPackage.USER_MST__USER_ID:
			return getUserId();
		case CclmsPackage.USER_MST__USER:
			return getUser();
		case CclmsPackage.USER_MST__USER_PWD:
			return getUserPwd();
		case CclmsPackage.USER_MST__FIRST_NAME:
			return getFirstName();
		case CclmsPackage.USER_MST__LAST_NAME:
			return getLastName();
		case CclmsPackage.USER_MST__ACTIVE:
			return getActive();
		case CclmsPackage.USER_MST__EMAIL:
			return getEmail();
		case CclmsPackage.USER_MST__REF_PARAMETER_VALUE_CREATED_BY:
			return getRefParameterValueCreatedBy();
		case CclmsPackage.USER_MST__REF_DIVISION_ID:
			return getRefDivisionId();
		case CclmsPackage.USER_MST__REF_LOBBY_ID:
			return getRefLobbyId();
		case CclmsPackage.USER_MST__REF_USER_ROLE:
			return getRefUserRole();
		case CclmsPackage.USER_MST__REF_ZONE_ID:
			return getRefZoneId();
		case CclmsPackage.USER_MST__REF_KPI_VALUE_CREATED_BY:
			return getRefKpiValueCreatedBy();
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_CREATED_BY:
			return getRefParameterMstCreatedBy();
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY:
			return getRefParameterMstLastModifiedBy();
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY:
			return getRefTrainTypeMstCreatedBy();
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY:
			return getRefTrainTypeMappingMstCreatedBy();
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY:
			return getRefTrainTypeMappingMstLastModifiedBy();
		case CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY:
			return getRefSegmentMstCreatedBy();
		case CclmsPackage.USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY:
			return getRefTrainSegmentMstCreatedBy();
		case CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY:
			return getRefLinkMstCreatedBy();
		case CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY:
			return getRefLinkMstLastModifiedBy();
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
		case CclmsPackage.USER_MST__USER_ID:
			setUserId((Integer) newValue);
			return;
		case CclmsPackage.USER_MST__USER:
			setUser((String) newValue);
			return;
		case CclmsPackage.USER_MST__USER_PWD:
			setUserPwd((String) newValue);
			return;
		case CclmsPackage.USER_MST__FIRST_NAME:
			setFirstName((String) newValue);
			return;
		case CclmsPackage.USER_MST__LAST_NAME:
			setLastName((String) newValue);
			return;
		case CclmsPackage.USER_MST__ACTIVE:
			setActive((String) newValue);
			return;
		case CclmsPackage.USER_MST__EMAIL:
			setEmail((String) newValue);
			return;
		case CclmsPackage.USER_MST__REF_PARAMETER_VALUE_CREATED_BY:
			getRefParameterValueCreatedBy().clear();
			getRefParameterValueCreatedBy().addAll(
					(Collection<? extends ParameterValue>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_DIVISION_ID:
			setRefDivisionId((DivisionMst) newValue);
			return;
		case CclmsPackage.USER_MST__REF_LOBBY_ID:
			setRefLobbyId((StationMst) newValue);
			return;
		case CclmsPackage.USER_MST__REF_USER_ROLE:
			setRefUserRole((UserRoleMst) newValue);
			return;
		case CclmsPackage.USER_MST__REF_ZONE_ID:
			setRefZoneId((ZoneMst) newValue);
			return;
		case CclmsPackage.USER_MST__REF_KPI_VALUE_CREATED_BY:
			getRefKpiValueCreatedBy().clear();
			getRefKpiValueCreatedBy().addAll(
					(Collection<? extends KpiValue>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_CREATED_BY:
			getRefParameterMstCreatedBy().clear();
			getRefParameterMstCreatedBy().addAll(
					(Collection<? extends ParameterMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY:
			getRefParameterMstLastModifiedBy().clear();
			getRefParameterMstLastModifiedBy().addAll(
					(Collection<? extends ParameterMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY:
			getRefTrainTypeMstCreatedBy().clear();
			getRefTrainTypeMstCreatedBy().addAll(
					(Collection<? extends TrainTypeMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY:
			getRefTrainTypeMappingMstCreatedBy().clear();
			getRefTrainTypeMappingMstCreatedBy().addAll(
					(Collection<? extends TrainTypeMappingMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY:
			getRefTrainTypeMappingMstLastModifiedBy().clear();
			getRefTrainTypeMappingMstLastModifiedBy().addAll(
					(Collection<? extends TrainTypeMappingMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY:
			getRefSegmentMstCreatedBy().clear();
			getRefSegmentMstCreatedBy().addAll(
					(Collection<? extends SegmentMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY:
			getRefTrainSegmentMstCreatedBy().clear();
			getRefTrainSegmentMstCreatedBy().addAll(
					(Collection<? extends TrainSegmentMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY:
			getRefLinkMstCreatedBy().clear();
			getRefLinkMstCreatedBy().addAll(
					(Collection<? extends LinkMst>) newValue);
			return;
		case CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY:
			getRefLinkMstLastModifiedBy().clear();
			getRefLinkMstLastModifiedBy().addAll(
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
		case CclmsPackage.USER_MST__USER_ID:
			unsetUserId();
			return;
		case CclmsPackage.USER_MST__USER:
			setUser(USER_EDEFAULT);
			return;
		case CclmsPackage.USER_MST__USER_PWD:
			setUserPwd(USER_PWD_EDEFAULT);
			return;
		case CclmsPackage.USER_MST__FIRST_NAME:
			setFirstName(FIRST_NAME_EDEFAULT);
			return;
		case CclmsPackage.USER_MST__LAST_NAME:
			setLastName(LAST_NAME_EDEFAULT);
			return;
		case CclmsPackage.USER_MST__ACTIVE:
			setActive(ACTIVE_EDEFAULT);
			return;
		case CclmsPackage.USER_MST__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case CclmsPackage.USER_MST__REF_PARAMETER_VALUE_CREATED_BY:
			getRefParameterValueCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_DIVISION_ID:
			setRefDivisionId((DivisionMst) null);
			return;
		case CclmsPackage.USER_MST__REF_LOBBY_ID:
			setRefLobbyId((StationMst) null);
			return;
		case CclmsPackage.USER_MST__REF_USER_ROLE:
			setRefUserRole((UserRoleMst) null);
			return;
		case CclmsPackage.USER_MST__REF_ZONE_ID:
			setRefZoneId((ZoneMst) null);
			return;
		case CclmsPackage.USER_MST__REF_KPI_VALUE_CREATED_BY:
			getRefKpiValueCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_CREATED_BY:
			getRefParameterMstCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY:
			getRefParameterMstLastModifiedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY:
			getRefTrainTypeMstCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY:
			getRefTrainTypeMappingMstCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY:
			getRefTrainTypeMappingMstLastModifiedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY:
			getRefSegmentMstCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY:
			getRefTrainSegmentMstCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY:
			getRefLinkMstCreatedBy().clear();
			return;
		case CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY:
			getRefLinkMstLastModifiedBy().clear();
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
		case CclmsPackage.USER_MST__USER_ID:
			return isSetUserId();
		case CclmsPackage.USER_MST__USER:
			return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT
					.equals(user);
		case CclmsPackage.USER_MST__USER_PWD:
			return USER_PWD_EDEFAULT == null ? userPwd != null
					: !USER_PWD_EDEFAULT.equals(userPwd);
		case CclmsPackage.USER_MST__FIRST_NAME:
			return FIRST_NAME_EDEFAULT == null ? firstName != null
					: !FIRST_NAME_EDEFAULT.equals(firstName);
		case CclmsPackage.USER_MST__LAST_NAME:
			return LAST_NAME_EDEFAULT == null ? lastName != null
					: !LAST_NAME_EDEFAULT.equals(lastName);
		case CclmsPackage.USER_MST__ACTIVE:
			return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT
					.equals(active);
		case CclmsPackage.USER_MST__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT
					.equals(email);
		case CclmsPackage.USER_MST__REF_PARAMETER_VALUE_CREATED_BY:
			return refParameterValueCreatedBy != null
					&& !refParameterValueCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_DIVISION_ID:
			return refDivisionId != null;
		case CclmsPackage.USER_MST__REF_LOBBY_ID:
			return refLobbyId != null;
		case CclmsPackage.USER_MST__REF_USER_ROLE:
			return refUserRole != null;
		case CclmsPackage.USER_MST__REF_ZONE_ID:
			return refZoneId != null;
		case CclmsPackage.USER_MST__REF_KPI_VALUE_CREATED_BY:
			return refKpiValueCreatedBy != null
					&& !refKpiValueCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_CREATED_BY:
			return refParameterMstCreatedBy != null
					&& !refParameterMstCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_PARAMETER_MST_LAST_MODIFIED_BY:
			return refParameterMstLastModifiedBy != null
					&& !refParameterMstLastModifiedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MST_CREATED_BY:
			return refTrainTypeMstCreatedBy != null
					&& !refTrainTypeMstCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_CREATED_BY:
			return refTrainTypeMappingMstCreatedBy != null
					&& !refTrainTypeMappingMstCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_TRAIN_TYPE_MAPPING_MST_LAST_MODIFIED_BY:
			return refTrainTypeMappingMstLastModifiedBy != null
					&& !refTrainTypeMappingMstLastModifiedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_SEGMENT_MST_CREATED_BY:
			return refSegmentMstCreatedBy != null
					&& !refSegmentMstCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_TRAIN_SEGMENT_MST_CREATED_BY:
			return refTrainSegmentMstCreatedBy != null
					&& !refTrainSegmentMstCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_LINK_MST_CREATED_BY:
			return refLinkMstCreatedBy != null
					&& !refLinkMstCreatedBy.isEmpty();
		case CclmsPackage.USER_MST__REF_LINK_MST_LAST_MODIFIED_BY:
			return refLinkMstLastModifiedBy != null
					&& !refLinkMstLastModifiedBy.isEmpty();
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
		result.append(" (userId: ");
		if ((_booleanFlags & USER_ID_ESETFLAG) != 0)
			result.append(userId);
		else
			result.append("<unset>");
		result.append(", user: ");
		result.append(user);
		result.append(", userPwd: ");
		result.append(userPwd);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", active: ");
		result.append(active);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //UserMstImpl
