/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms.impl;

import cclms.CclmsCollector;
import cclms.DivisionMst;
import cclms.KpiMst;
import cclms.KpiValue;
import cclms.LinkDetail;
import cclms.LinkMst;
import cclms.LobbyMst;
import cclms.ParameterMst;
import cclms.ParameterValue;
import cclms.SegmentMst;
import cclms.StationMst;
import cclms.TractionMst;
import cclms.TrainFrequencyMst;
import cclms.TrainMst;
import cclms.TrainSegmentMst;
import cclms.TrainTypeMappingMst;
import cclms.TrainTypeMst;
import cclms.UserMst;
import cclms.UserRoleMst;
import cclms.ZoneMst;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cclms.impl.CclmsPackage
 * @generated
 */
public interface CclmsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsFactory eINSTANCE = cclms.impl.CclmsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Zone Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zone Mst</em>'.
	 * @generated
	 */
	ZoneMst createZoneMst();

	/**
	 * Returns a new object of class '<em>Station Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Mst</em>'.
	 * @generated
	 */
	StationMst createStationMst();

	/**
	 * Returns a new object of class '<em>Train Frequency Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Frequency Mst</em>'.
	 * @generated
	 */
	TrainFrequencyMst createTrainFrequencyMst();

	/**
	 * Returns a new object of class '<em>Traction Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traction Mst</em>'.
	 * @generated
	 */
	TractionMst createTractionMst();

	/**
	 * Returns a new object of class '<em>Train Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Mst</em>'.
	 * @generated
	 */
	TrainMst createTrainMst();

	/**
	 * Returns a new object of class '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Value</em>'.
	 * @generated
	 */
	ParameterValue createParameterValue();

	/**
	 * Returns a new object of class '<em>Division Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division Mst</em>'.
	 * @generated
	 */
	DivisionMst createDivisionMst();

	/**
	 * Returns a new object of class '<em>User Role Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Role Mst</em>'.
	 * @generated
	 */
	UserRoleMst createUserRoleMst();

	/**
	 * Returns a new object of class '<em>User Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Mst</em>'.
	 * @generated
	 */
	UserMst createUserMst();

	/**
	 * Returns a new object of class '<em>Kpi Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kpi Mst</em>'.
	 * @generated
	 */
	KpiMst createKpiMst();

	/**
	 * Returns a new object of class '<em>Kpi Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kpi Value</em>'.
	 * @generated
	 */
	KpiValue createKpiValue();

	/**
	 * Returns a new object of class '<em>Parameter Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Mst</em>'.
	 * @generated
	 */
	ParameterMst createParameterMst();

	/**
	 * Returns a new object of class '<em>Train Type Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Type Mst</em>'.
	 * @generated
	 */
	TrainTypeMst createTrainTypeMst();

	/**
	 * Returns a new object of class '<em>Train Type Mapping Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Type Mapping Mst</em>'.
	 * @generated
	 */
	TrainTypeMappingMst createTrainTypeMappingMst();

	/**
	 * Returns a new object of class '<em>Link Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Detail</em>'.
	 * @generated
	 */
	LinkDetail createLinkDetail();

	/**
	 * Returns a new object of class '<em>Segment Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment Mst</em>'.
	 * @generated
	 */
	SegmentMst createSegmentMst();

	/**
	 * Returns a new object of class '<em>Train Segment Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Segment Mst</em>'.
	 * @generated
	 */
	TrainSegmentMst createTrainSegmentMst();

	/**
	 * Returns a new object of class '<em>Link Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Mst</em>'.
	 * @generated
	 */
	LinkMst createLinkMst();

	/**
	 * Returns a new object of class '<em>Lobby Mst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lobby Mst</em>'.
	 * @generated
	 */
	LobbyMst createLobbyMst();

	/**
	 * Returns a new object of class '<em>Collector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collector</em>'.
	 * @generated
	 */
	CclmsCollector createCclmsCollector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CclmsPackage getCclmsPackage();

} //CclmsFactory
