package cclms.app.scenario.updater;

import ilog.odm.datasvc.IloRow;
import ilog.odm.datasvc.IloScenario;
import ilog.odm.datasvc.IloTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Map;

import cclms.aap.input.table.properties.Lobby;
import cclms.aap.input.table.properties.SegmentMst;
import cclms.aap.input.table.properties.TractionMst;
import cclms.aap.input.table.properties.TrainFrequencyMst;
import cclms.aap.input.table.properties.TrainTypeMst;
import cclms.common.util.TableConstant;
import cclms.connection.ConnectionProvider;

public class ScenarioUpdater {
	

public static void loadScenarioTablesTractionMst(Map<String, ResultSet> resultSetMap, IloScenario scenario){
	
    
	for(int i = 0 ; i <resultSetMap.size();i++){
		
		Iterator<Map.Entry<String, ResultSet>> itr = resultSetMap.entrySet().iterator(); 
	    
	    while(itr.hasNext()) 
	    { 
	         Map.Entry<String, ResultSet> entry = itr.next(); 
	        if(entry.getKey().equals(TableConstant.TRACTION_MST)){
	        	 
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
	        				//  System.out.println("TRACTION_MST UPDATED.");
	        			 }
	        		 }
	        	} catch (SQLException e) {
					// TODO Handel the error 
					e.printStackTrace();
				}
	        	 
	         }
	         
	    } 
		
	}
	}


public static void loadScenarioTablesTrainFrequencyMst(Map<String, ResultSet> resultSetMap, IloScenario scenario){
	
    
	for(int i = 0 ; i <resultSetMap.size();i++){
		
		Iterator<Map.Entry<String, ResultSet>> itr = resultSetMap.entrySet().iterator(); 
	    
	    while(itr.hasNext()) 
	    { 
	         Map.Entry<String, ResultSet> entry = itr.next(); 
	         if(entry.getKey().equals(TableConstant.TRAIN_FREQUENCY_MST)){
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
	        				 // System.out.println("-->"+resultSet.getInt(1)+" "+resultSet.getString(2));
	        				  //System.out.println("TRAIN_FREQUENCY_MST UPDATED.");
	        			 }
	        		 }
	        	} catch (SQLException e) {
					// TODO Handel the error 
					e.printStackTrace();
				}
	        	 
	         }
	         
	    } 
		
	}
	}



public static void loadScenarioTablesTrainTypeMst(Map<String, ResultSet> resultSetMap, IloScenario scenario){
	
    
	for(int i = 0 ; i <resultSetMap.size();i++){
		
		Iterator<Map.Entry<String, ResultSet>> itr = resultSetMap.entrySet().iterator(); 
	    
	    while(itr.hasNext()) 
	    { 
	         Map.Entry<String, ResultSet> entry = itr.next(); 
	         if(entry.getKey().equals(TableConstant.TRAIN_TYPE_MST)){
	        	 //.TRAIN_FREQUENCY_MST
	        	 
	        	 try {
	        		 ResultSet resultSet = entry.getValue();
	        		 if(resultSet!=null){
	        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.TRAIN_TYPE_MST);
        				 loadTable.removeAllRows();
	        			 while (resultSet.next()) {
	        				 	        				 
	        				  IloRow row = loadTable.makeNewRow();
	        				  row.setIntValue(TrainTypeMst.TRAIN_TYPE_CCLMS_ID, resultSet.getInt(1));
	        				  row.setStringValue(TrainTypeMst.TRAIN_TYPE_DESC, resultSet.getString(2));
	        				  loadTable.addRow(row);
	        				//  System.out.println("-->"+resultSet.getInt(1)+" "+resultSet.getString(2));
	        				 // System.out.println("TRAIN_TYPE_MST UPDATED.");
	        			 }
	        		 }
	        	} catch (SQLException e) {
					// TODO Handel the error 
					e.printStackTrace();
				}
	        	 
	         }
	         
	    } 
		
	}
	}




public static void loadScenarioTablesLobbyMst(Map<String, ResultSet> resultSetMap, IloScenario scenario){
	//System.out.println("updating ...");
	for(int i = 0 ; i <resultSetMap.size();i++){
		
		Iterator<Map.Entry<String, ResultSet>> itr = resultSetMap.entrySet().iterator(); 
	    
	    while(itr.hasNext()) 
	    { 
	         Map.Entry<String, ResultSet> entry = itr.next(); 
	         if(entry.getKey().equals(TableConstant.STATION_MST)){
	        	 try {
	        		 ResultSet resultSet = entry.getValue();
	        		 if(resultSet!=null){
	        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.LOBBY_MST);
        				 loadTable.removeAllRows();
	        			 while (entry.getValue().next()) {
	        				 	        				 
	        				 IloRow row = loadTable.makeNewRow();
	        				  row.setStringValue(Lobby.LOBBY_ID, ""+resultSet.getInt(1));
	        				  row.setStringValue(Lobby.LOBBY_CODE, resultSet.getString(2));
	        				  row.setStringValue(Lobby.LOBBY_NAME,resultSet.getString(3));
	        				 // row.setStringValue("LOBBY_FLAG",resultSet.getString(5));
	        				  loadTable.addRow(row);
	        				 // System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5) );
	        			 }
	        		 }
	        	} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	 
	         }
	         
	    } 
	}
	}



public static ResultSet getTableBySqlQuery(String sqlQuery) throws ClassNotFoundException, SQLException{
	
	//String zoneMstQuery ="select * from "+TableConstant.SCHEMA+"."+TableConstant.ZONE_MST;
		Connection connection = ConnectionProvider.getConnection();
		PreparedStatement prepareStatement = connection.prepareStatement(sqlQuery);
		System.out.println(sqlQuery);
		ResultSet resultSet = prepareStatement.executeQuery();
		return resultSet;
	}


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
	        				 // System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
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
	        	 //.TRAIN_FREQUENCY_MST
	        	 
	        	 try {
	        		 ResultSet resultSet = entry.getValue();
	        		 if(resultSet!=null){
	        			 IloTable loadTable = scenario.getTable(TableConstant.APP+"."+TableConstant.SEGMENT_MST);
        				 loadTable.removeAllRows();
	        			 while (resultSet.next()) {
	        				 	        				 
	        				 /* IloRow row = loadTable.makeNewRow();
	        				  row.setIntValue(SegmentMst.SEGMENT_ID, resultSet.getInt(1));
	        				  row.setIntValue(SegmentMst.START_STATION_ID, resultSet.getInt(2));
	        				  row.setIntValue(SegmentMst.START_STATION_ID, resultSet.getInt(3))
	        				  loadTable.addRow(row);*/
	        				  System.out.println("-->"+resultSet.getInt(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3));
	        			 }
	        		 }
	        	} catch (SQLException e) {
					// TODO Handel the error 
					e.printStackTrace();
				}
	        	 
	         }
	         
	    } 
		
	}
	}


//}
