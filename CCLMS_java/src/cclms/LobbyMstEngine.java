/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface LobbyMstEngine extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Lobby Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby Code</em>' attribute.
	 * @see #setLobbyCode(String)
	 * @generated
	 */
	String getLobbyCode();

	/**
	 * Sets the value of the '{@link cclms.LobbyMstEngine#getLobbyCode <em>Lobby Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby Code</em>' attribute.
	 * @see #getLobbyCode()
	 * @generated
	 */
	void setLobbyCode(String value);

	/**
	 * Returns the value of the '<em><b>Lobby Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby Name</em>' attribute.
	 * @see #setLobbyName(String)
	 * @generated
	 */
	String getLobbyName();

	/**
	 * Sets the value of the '{@link cclms.LobbyMstEngine#getLobbyName <em>Lobby Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby Name</em>' attribute.
	 * @see #getLobbyName()
	 * @generated
	 */
	void setLobbyName(String value);

	/**
	 * Returns the value of the '<em><b>Lobby Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby Id</em>' attribute.
	 * @see #isSetLobbyId()
	 * @see #unsetLobbyId()
	 * @see #setLobbyId(int)
	 * @generated
	 */
	int getLobbyId();

	/**
	 * Sets the value of the '{@link cclms.LobbyMstEngine#getLobbyId <em>Lobby Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby Id</em>' attribute.
	 * @see #isSetLobbyId()
	 * @see #unsetLobbyId()
	 * @see #getLobbyId()
	 * @generated
	 */
	void setLobbyId(int value);

	/**
	 * Unsets the value of the '{@link cclms.LobbyMstEngine#getLobbyId <em>Lobby Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLobbyId()
	 * @see #getLobbyId()
	 * @see #setLobbyId(int)
	 * @generated
	 */
	void unsetLobbyId();

	/**
	 * Returns whether the value of the '{@link cclms.LobbyMstEngine#getLobbyId <em>Lobby Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lobby Id</em>' attribute is set.
	 * @see #unsetLobbyId()
	 * @see #getLobbyId()
	 * @see #setLobbyId(int)
	 * @generated
	 */
	boolean isSetLobbyId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // LobbyMstEngine
