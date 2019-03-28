package cclms.app.scenario.updater;

import ilog.odm.datasvc.IloRow;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.datasvc.IloTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cclms.aap.input.table.properties.ParameterMst;
import cclms.aap.input.table.properties.SegmentMst;
import cclms.aap.input.table.properties.TractionMst;
import cclms.aap.input.table.properties.TrainFrequencyMst;
import cclms.aap.input.table.properties.TrainMst;
import cclms.app.query.QueryUtil;
import cclms.common.util.TableConstant;

public class InputTableUpdater {
	
	
	
	public static void loadScenarioInputTables(Map<String, ResultSet> resultSetMap, IloScenario scenario){
		
	    
		//for(int i = 0 ; i <resultSetMap.size();i++){
			
			Iterator<Map.Entry<String, ResultSet>> itr = resultSetMap.entrySet().iterator(); 
		    
		    while(itr.hasNext()) 
		    { 
		         Map.Entry<String, ResultSet> entry = itr.next(); 
		         if(entry.getKey().equals(TableConstant.STATION_MST)){
		        	 try {
		        		 ResultSet resultSet = entry.getValue();
		        		 if(resultSet!=null){
		        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.STATION_MST);
	        				 loadTable.removeAllRows();
		        			 while (entry.getValue().next()) {
		        				 	        				 
		        				 IloRow row = loadTable.makeNewRow();
		        				  row.setIntValue("STATION_ID", resultSet.getInt(1));
		        				  row.setStringValue("STATION_CODE", resultSet.getString(2));
		        				  row.setStringValue("STATION_NAME",resultSet.getString(3));
		        				  row.setStringValue("LOBBY_FLAG",resultSet.getString(5));
		        			      loadTable.addRow(row);
		        				 // System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5) );
		        			 }
		        		 }
		        	} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        	 
		         }else if(entry.getKey().equals(TableConstant.TRACTION_MST)){
		        	 
		        	 try {
		        		 ResultSet resultSet = entry.getValue();
		        		 if(resultSet!=null){
		        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.TRACTION_MST);
	        				 loadTable.removeAllRows();
		        			 while (resultSet.next()) {
		        				 	        				 
		        				  IloRow row = loadTable.makeNewRow();
		        				  row.setIntValue(TractionMst.TRACTION_TYPE, resultSet.getInt(1));
		        				  row.setStringValue(TractionMst.TRACTION_DESC, resultSet.getString(2));
		        				  loadTable.addRow(row);
		        				//  System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
		        			 }
		        		 }
		        	} catch (SQLException e) {
						// TODO Handel the error 
						e.printStackTrace();
					}
		        	 
		         }else if(entry.getKey().equals(TableConstant.TRAIN_FREQUENCY_MST)){
		        	 //.TRAIN_FREQUENCY_MST
		        	 
		        	 try {
		        		 ResultSet resultSet = entry.getValue();
		        		 if(resultSet!=null){
		        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.TRAIN_FREQUENCY_MST);
	        				 loadTable.removeAllRows();
		        			 while (resultSet.next()) {
		        				 	        				 
		        				  IloRow row = loadTable.makeNewRow();
		        				  row.setIntValue(TrainFrequencyMst.TRAIN_FREQUENCY_CODE, resultSet.getInt(1));
		        				  row.setStringValue(TrainFrequencyMst.DESC, resultSet.getString(2));
		        				  loadTable.addRow(row);
		        				//  System.out.println("-->"+resultSet.getInt(1)+" "+resultSet.getString(2));
		        			 }
		        		 }
		        	} catch (SQLException e) {
						// TODO Handel the error 
						e.printStackTrace();
					}
		        	 
		         }else if(entry.getKey().equals(TableConstant.SEGMENT_MST)){
		        	 //TRAIN_SEGMENT_MST
		        	 
		        	 try {
		        		 ResultSet resultSet = entry.getValue();
		        		 if(resultSet!=null){
		        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.SEGMENT_MST);
	        				 loadTable.removeAllRows();
		        			 while (resultSet.next()) {
		        				 	        				 
		        				 IloRow row = loadTable.makeNewRow();
		        				  row.setIntValue(SegmentMst.SEGMENT_ID, resultSet.getInt(1));
		        				  row.setIntValue(SegmentMst.START_STATION_ID, resultSet.getInt(2));
		        				  row.setIntValue(SegmentMst.STOP_STATION_ID, resultSet.getInt(3));
		        				  loadTable.addRow(row);
		        				//  System.out.println("-->"+resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3));
		        			 }
		        		 }
		        	} catch (SQLException e) {
						// TODO Handel the error 
						e.printStackTrace();
					}
		        	 
		         }else if(entry.getKey().equals(TableConstant.TRAIN_MST)){
		        	 //TRAIN_MST
		        	 
		        	 try {
		        		 ResultSet resultSet = entry.getValue();
		        		 if(resultSet!=null){
		        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.TRAIN_MST);
	        				 loadTable.removeAllRows();
		        			 while (resultSet.next()) {
		        				 	        				 
		        				 IloRow row = loadTable.makeNewRow();
		        				  row.setIntValue(TrainMst.TRAIN_ID, resultSet.getInt(1));
		        				  row.setStringValue(TrainMst.TRAIN_NBR, resultSet.getString(2));
		        				  row.setStringValue(TrainMst.TRAIN_NAME, resultSet.getString(3));
		        				  loadTable.addRow(row);
		        				 
		        				 //System.out.println("-->>"+resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
		        			 }
		        		 }
		        	} catch (SQLException e) {
						// TODO Handel the error 
						e.printStackTrace();
					}
		        	 
		         }else if(entry.getKey().equals(TableConstant.PARAMETER_MST)){
		        	 //TRAIN_MST
		        	 
		        	 try {
		        		 ResultSet resultSet = entry.getValue();
		        		 if(resultSet!=null){
		        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.PARAMETER_MST);
	        				 loadTable.removeAllRows();
		        			 while (resultSet.next()) {
		        				 	        				 
		        				 IloRow row = loadTable.makeNewRow();
		        				  row.setIntValue(ParameterMst.PARAMETER_ID, resultSet.getInt(1));
		        				  row.setStringValue(ParameterMst.PARAMETER_DESC, resultSet.getString(2));
		        				  row.setStringValue(ParameterMst.UOM, resultSet.getString(3));
		        				  row.setDoubleValue(ParameterMst.GLOBAL_VALUE, resultSet.getDouble(4));
		        				  row.setDoubleValue(ParameterMst.MIN_VALUE, resultSet.getDouble(5));
		        				  row.setDoubleValue(ParameterMst.MAX_VALUE, resultSet.getDouble(6));
		        				  loadTable.addRow(row);
		        				 
		        				// System.out.println("p-->>"+resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
		        			 }
		        		 }
		        	} catch (SQLException e) {
						// TODO Handel the error 
						e.printStackTrace();
					}
		        	 
		         }else if(entry.getKey().equals(TableConstant.USER_MST)){
		        	 //TRAIN_MST
		        	 
		        	 try {
		        		 ResultSet resultSet = entry.getValue();
		        		 if(resultSet!=null){
		        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.USER_MST);
	        				 loadTable.removeAllRows();
		        			 while (resultSet.next()) {
		        				 	        				 
		        				/* IloRow row = loadTable.makeNewRow();
		        				  row.setIntValue(ParameterMst.PARAMETER_ID, resultSet.getInt(1));
		        				  row.setStringValue(ParameterMst.PARAMETER_DESC, resultSet.getString(2));
		        				  row.setStringValue(ParameterMst.UOM, resultSet.getString(3));
		        				  row.setDoubleValue(ParameterMst.GLOBAL_VALUE, resultSet.getDouble(4));
		        				  row.setDoubleValue(ParameterMst.MIN_VALUE, resultSet.getDouble(5));
		        				  row.setDoubleValue(ParameterMst.MAX_VALUE, resultSet.getDouble(6));
		        				  loadTable.addRow(row);
		        				 */
		        				 //System.out.println("p-->>"+resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
		        			 }
		        		 }
		        	} catch (SQLException e) {
						// TODO Handel the error 
						e.printStackTrace();
					}
		        	 
		         }
		         
		 
		         
		         
		         //--
		         
		    } 
			
		}
		

	
	
	
	
	
	
	
	
	public static  void prepareResultSetMap(List<String> inputTableList, IloScenario scenario) throws ClassNotFoundException, SQLException{
		
		List<String> tableList = new ArrayList<>();
		tableList.add("TRACTION_MST");
		
		Map<String, ResultSet> resultSetMap = new HashMap<>();
		
		for (String tabeName : inputTableList) {
			
			System.out.println(tabeName);
			resultSetMap.put(tabeName,ScenarioUpdater.getTableBySqlQuery(QueryUtil.getQueryByTableName(tabeName)));
			
		}
		
		loadScenarioInputTables(resultSetMap, scenario);
		
	}
	
	
	public static void main(String args[]){
//System.out.println("-->"+QueryUtil.getQueryByTableName("TRACTION_MST"));
	}

}
