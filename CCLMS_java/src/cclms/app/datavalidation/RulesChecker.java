package cclms.app.datavalidation;

import ilog.odm.datasvc.IloDataServiceContext;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.datasvc.IloScenarioDataChecker;

public class RulesChecker implements IloScenarioDataChecker{

	@Override
	public void check(IloScenario arg0, IloDataServiceContext arg1)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("I am Data Checker["+"cclms.datavalidation.RulesChecker"+"]");
		
	}

}
