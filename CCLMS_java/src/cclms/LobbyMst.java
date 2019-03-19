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
public interface LobbyMst extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Lobby Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lobby Id</em>' attribute.
	 * @see #setLobbyId(String)
	 * @generated
	 */
	String getLobbyId();

	/**
	 * Sets the value of the '{@link cclms.LobbyMst#getLobbyId <em>Lobby Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby Id</em>' attribute.
	 * @see #getLobbyId()
	 * @generated
	 */
	void setLobbyId(String value);

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
	 * Sets the value of the '{@link cclms.LobbyMst#getLobbyCode <em>Lobby Code</em>}' attribute.
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
	 * Sets the value of the '{@link cclms.LobbyMst#getLobbyName <em>Lobby Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobby Name</em>' attribute.
	 * @see #getLobbyName()
	 * @generated
	 */
	void setLobbyName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // LobbyMst
