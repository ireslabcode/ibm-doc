package cclms.app.export;

import ilog.odm.datasvc.IloDataServiceContext;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.datasvc.IloScenarioExporter;
import ilog.odm.datasvc.IloTemplateInstance;

public class DB2Exporter implements IloScenarioExporter{

	@Override
	public void exportScenario(IloScenario scenario,
			IloTemplateInstance templateInstance,
			IloDataServiceContext dataService) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("I am Data Exporter["+"cclms.export.DB2Exporter"+"]");
		
	}

}
