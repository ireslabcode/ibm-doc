package datasource;

import ilog.odm.datasvc.IloDataServiceContext;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.datasvc.IloScenarioUpdater;
import ilog.odm.datasvc.IloTemplateInstance;
import cclms.datasourse.LoadSourseTables;

public class RandomLoadSourceDOM implements IloScenarioUpdater{

	@Override
	public void updateScenario(IloScenario scenario,
			IloTemplateInstance templateInstance,
			IloDataServiceContext dataService) throws Exception {
		// TODO Auto-generated method stub
		String zone = templateInstance.getStringValue("zone");
		String tractiontype = templateInstance.getStringValue("tractiontype");
		String station = templateInstance.getStringValue("station");
		String trainfrequency = templateInstance.getStringValue("trainfrequency");
		
		//updateScenario(scenario, zone, tractiontype,station,trainfrequency);
		
		LoadSourseTables.updateScenario(scenario, zone, tractiontype, station, trainfrequency);
	
	}

	public void updateScenario(IloScenario scenario, String zone,
			String tractiontype, String station, String trainfrequency) {
		// TODO Auto-generated method stub
		
	}
	

}
