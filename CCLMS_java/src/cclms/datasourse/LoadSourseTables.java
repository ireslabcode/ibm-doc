package cclms.datasourse;

import ilog.odm.datasvc.IloDataServiceContext;
import ilog.odm.datasvc.IloRow;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.datasvc.IloScenarioUpdater;
import ilog.odm.datasvc.IloTable;
import ilog.odm.datasvc.IloTemplateInstance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cclms.app.query.QueryUtil;
import cclms.app.scenario.updater.InputTableUpdater;
import cclms.app.scenario.updater.ScenarioUpdater;
import cclms.common.util.TableConstant;
import cclms.connection.ConnectionProvider;

public class LoadSourseTables implements IloScenarioUpdater {
	


@Override
public void updateScenario(IloScenario scenario,
		IloTemplateInstance templateInstance, IloDataServiceContext dataService)
		throws Exception {
	
			String zone = templateInstance.getStringValue("zone");
			String tractiontype = templateInstance.getStringValue("tractiontype");
			String station = templateInstance.getStringValue("station");
			String trainfrequency = templateInstance.getStringValue("trainfrequency");
			updateScenario(scenario, zone, tractiontype,station,trainfrequency);
			
}
	

public static void updateScenario(IloScenario scenario, String zone,
		String tractiontype, String station, String trainfrequency) {
	//ResultSet resultSet = null;
	//ResultSet stationResultSet = null;
	ResultSet tractiontypeResultSet = null;
	ResultSet trainTypeResultSet = null;
	ResultSet trainfrequencyResultSet = null;
	Map<String, ResultSet> resultSetMap = new HashMap<>();
	
	
	
	
	
	// --- scenario updater code----------
	
				/*Map<String, ResultSet> resultSetMapTractionMst = new HashMap<>();
				Map<String, ResultSet> resultSetMapTrainFrequencyMst = new HashMap<>();
				Map<String, ResultSet> resultSetMapTrainTypeMst = new HashMap<>();
				Map<String, ResultSet> resultSetMapStationMst = new HashMap<>();*/
                	
	// -------- *************** ----------
	
	
	
	
	/*try {
		
		//resultSet = getTableData("tableName");
		resultSetMap.put(TableConstant.STATION_MST,getTableBySqlQuery(QueryUtil.STATION_MST));
		resultSetMap.put(TableConstant.TRACTION_MST,getTableBySqlQuery(QueryUtil.TRACTION_MST));
		resultSetMap.put(TableConstant.TRAIN_FREQUENCY_MST,getTableBySqlQuery(QueryUtil.TRAIN_FREQUENCY_MST));
		
		
		
		// --- scenario updater code----------
		resultSetMapTractionMst.put(TableConstant.TRACTION_MST,getTableBySqlQuery(QueryUtil.TRACTION_MST));
		resultSetMapTrainFrequencyMst.put(TableConstant.TRAIN_FREQUENCY_MST,getTableBySqlQuery(QueryUtil.TRAIN_FREQUENCY_MST));
		resultSetMapTrainTypeMst.put(TableConstant.TRAIN_TYPE_MST,getTableBySqlQuery(QueryUtil.TRAIN_TYPE_MST));
		resultSetMapStationMst.put(TableConstant.STATION_MST, getTableBySqlQuery(QueryUtil.LOBBY_MST));
		// -------- *************** ----------
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	//loadZoneMst(resultSet,scenario);
	
	
	// --- scenario updater code----------
	/*ScenarioUpdater.loadScenarioTablesTractionMst(resultSetMapTractionMst, scenario);
	ScenarioUpdater.loadScenarioTablesTrainFrequencyMst(resultSetMapTrainFrequencyMst, scenario);
	ScenarioUpdater.loadScenarioTablesTrainTypeMst(resultSetMapTrainTypeMst, scenario);
	ScenarioUpdater.loadScenarioTablesLobbyMst(resultSetMapStationMst, scenario);
*/	// -------- *************** ----------
	
	//ScenarioUpdater.loadScenarioInputTables(resultSetMap, scenario);
	
	//InputTableUpdater.loadScenarioInputTables(resultSetMap, scenario);
	
	
	
	
	
	// Inutput table updater
	
	
	try {
		List<String> inputTableList = TableConstant.getInputTableNameList();
		InputTableUpdater.prepareResultSetMap(inputTableList,scenario);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	System.out.println("SCENARIO UPDATED SUCCESS....!!!");
}





public static ResultSet getTableData(String tableName) throws ClassNotFoundException, SQLException{
	
	String zoneMstQuery ="select * from "+TableConstant.SCHEMA+"."+TableConstant.ZONE_MST;
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(zoneMstQuery);
		ResultSet resultSet = prepareStatement.executeQuery();
		return resultSet;
	}


public static void loadZoneMst(ResultSet resultSet, IloScenario scenario){
	
    IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.ZONE_MST);
    loadTable.removeAllRows();
    int index = 1;
    try {
		while (resultSet.next()) {
		  IloRow row = loadTable.makeNewRow();
		  row.setIntValue("ZONE_ID", resultSet.getInt(1));
		  row.setStringValue("ZONE_CODE", resultSet.getString(3));
		  row.setStringValue("ZONE_DESC",resultSet.getString(2));
		    //row.setStringValue(index, value)
	       loadTable.addRow(row);
		//	System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
	        index++;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
    
    
	
}


public static ResultSet getTableBySqlQuery(String sqlQuery) throws ClassNotFoundException, SQLException{
	
	//String zoneMstQuery ="select * from "+TableConstant.SCHEMA+"."+TableConstant.ZONE_MST;
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(sqlQuery);
		ResultSet resultSet = prepareStatement.executeQuery();
		return resultSet;
	}
}
