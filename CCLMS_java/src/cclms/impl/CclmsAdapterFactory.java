/**
 */
package cclms.impl;

import cclms.*;

import ilog.odm.dom.IloDomCollector;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cclms.impl.CclmsPackage
 * @generated
 */
public class CclmsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CclmsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclmsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CclmsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CclmsSwitch<Adapter> modelSwitch = new CclmsSwitch<Adapter>() {
		@Override
		public Adapter caseStationMst(StationMst object) {
			return createStationMstAdapter();
		}

		@Override
		public Adapter caseTrainFrequencyMst(TrainFrequencyMst object) {
			return createTrainFrequencyMstAdapter();
		}

		@Override
		public Adapter caseTractionMst(TractionMst object) {
			return createTractionMstAdapter();
		}

		@Override
		public Adapter caseTrainMst(TrainMst object) {
			return createTrainMstAdapter();
		}

		@Override
		public Adapter caseParameterValue(ParameterValue object) {
			return createParameterValueAdapter();
		}

		@Override
		public Adapter caseKpiMst(KpiMst object) {
			return createKpiMstAdapter();
		}

		@Override
		public Adapter caseKpiValue(KpiValue object) {
			return createKpiValueAdapter();
		}

		@Override
		public Adapter caseParameterMst(ParameterMst object) {
			return createParameterMstAdapter();
		}

		@Override
		public Adapter caseTrainTypeMst(TrainTypeMst object) {
			return createTrainTypeMstAdapter();
		}

		@Override
		public Adapter caseTrainTypeMappingMst(TrainTypeMappingMst object) {
			return createTrainTypeMappingMstAdapter();
		}

		@Override
		public Adapter caseLinkDetail(LinkDetail object) {
			return createLinkDetailAdapter();
		}

		@Override
		public Adapter caseSegmentMst(SegmentMst object) {
			return createSegmentMstAdapter();
		}

		@Override
		public Adapter caseTrainSegmentMst(TrainSegmentMst object) {
			return createTrainSegmentMstAdapter();
		}

		@Override
		public Adapter caseLinkMst(LinkMst object) {
			return createLinkMstAdapter();
		}

		@Override
		public Adapter caseLobbyMst(LobbyMst object) {
			return createLobbyMstAdapter();
		}

		@Override
		public Adapter caseTrainSegmentEngine(TrainSegmentEngine object) {
			return createTrainSegmentEngineAdapter();
		}

		@Override
		public Adapter caseSegmentMstEngine(SegmentMstEngine object) {
			return createSegmentMstEngineAdapter();
		}

		@Override
		public Adapter caseTimeToMinEngine(TimeToMinEngine object) {
			return createTimeToMinEngineAdapter();
		}

		@Override
		public Adapter caseKpiLinkEngine(KpiLinkEngine object) {
			return createKpiLinkEngineAdapter();
		}

		@Override
		public Adapter caseLinkDetailEngine(LinkDetailEngine object) {
			return createLinkDetailEngineAdapter();
		}

		@Override
		public Adapter caseOutlinkEngine(OutlinkEngine object) {
			return createOutlinkEngineAdapter();
		}

		@Override
		public Adapter caseLobbyMstEngine(LobbyMstEngine object) {
			return createLobbyMstEngineAdapter();
		}

		@Override
		public Adapter caseUserMst(UserMst object) {
			return createUserMstAdapter();
		}

		@Override
		public Adapter caseDayMstEngine(DayMstEngine object) {
			return createDayMstEngineAdapter();
		}

		@Override
		public Adapter caseCclmsCollector(CclmsCollector object) {
			return createCclmsCollectorAdapter();
		}

		@Override
		public Adapter caseilog_odm_dom_IloDomCollector(IloDomCollector object) {
			return createilog_odm_dom_IloDomCollectorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.StationMst <em>Station Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.StationMst
	 * @generated
	 */
	public Adapter createStationMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TrainFrequencyMst <em>Train Frequency Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TrainFrequencyMst
	 * @generated
	 */
	public Adapter createTrainFrequencyMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TractionMst <em>Traction Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TractionMst
	 * @generated
	 */
	public Adapter createTractionMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TrainMst <em>Train Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TrainMst
	 * @generated
	 */
	public Adapter createTrainMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.KpiMst <em>Kpi Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.KpiMst
	 * @generated
	 */
	public Adapter createKpiMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.KpiValue <em>Kpi Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.KpiValue
	 * @generated
	 */
	public Adapter createKpiValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.ParameterMst <em>Parameter Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.ParameterMst
	 * @generated
	 */
	public Adapter createParameterMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TrainTypeMst <em>Train Type Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TrainTypeMst
	 * @generated
	 */
	public Adapter createTrainTypeMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TrainTypeMappingMst <em>Train Type Mapping Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TrainTypeMappingMst
	 * @generated
	 */
	public Adapter createTrainTypeMappingMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.LinkDetail <em>Link Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.LinkDetail
	 * @generated
	 */
	public Adapter createLinkDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.SegmentMst <em>Segment Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.SegmentMst
	 * @generated
	 */
	public Adapter createSegmentMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TrainSegmentMst <em>Train Segment Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TrainSegmentMst
	 * @generated
	 */
	public Adapter createTrainSegmentMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.LinkMst <em>Link Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.LinkMst
	 * @generated
	 */
	public Adapter createLinkMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.LobbyMst <em>Lobby Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.LobbyMst
	 * @generated
	 */
	public Adapter createLobbyMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TrainSegmentEngine <em>Train Segment Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TrainSegmentEngine
	 * @generated
	 */
	public Adapter createTrainSegmentEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.SegmentMstEngine <em>Segment Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.SegmentMstEngine
	 * @generated
	 */
	public Adapter createSegmentMstEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.TimeToMinEngine <em>Time To Min Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.TimeToMinEngine
	 * @generated
	 */
	public Adapter createTimeToMinEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.DayMstEngine <em>Day Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.DayMstEngine
	 * @generated
	 */
	public Adapter createDayMstEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.KpiLinkEngine <em>Kpi Link Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.KpiLinkEngine
	 * @generated
	 */
	public Adapter createKpiLinkEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.LinkDetailEngine <em>Link Detail Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.LinkDetailEngine
	 * @generated
	 */
	public Adapter createLinkDetailEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.OutlinkEngine <em>Outlink Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.OutlinkEngine
	 * @generated
	 */
	public Adapter createOutlinkEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.LobbyMstEngine <em>Lobby Mst Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.LobbyMstEngine
	 * @generated
	 */
	public Adapter createLobbyMstEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.UserMst <em>User Mst</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.UserMst
	 * @generated
	 */
	public Adapter createUserMstAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cclms.CclmsCollector <em>Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cclms.CclmsCollector
	 * @generated
	 */
	public Adapter createCclmsCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ilog.odm.dom.IloDomCollector <em>ilog odm dom Ilo Dom Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ilog.odm.dom.IloDomCollector
	 * @generated
	 */
	public Adapter createilog_odm_dom_IloDomCollectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CclmsAdapterFactory
