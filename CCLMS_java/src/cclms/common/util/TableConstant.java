package cclms.common.util;

import java.util.ArrayList;
import java.util.List;

public class TableConstant {
	public static final String SCHEMA ="DB2INST1";
	public static final String ZONE_MST ="ZONE_MST";
	public static final String APP ="app";
	
	
	// input table name information.
	public static final String STATION_MST ="STATION_MST";
	public static final String TRACTION_MST ="TRACTION_MST";
	public static final String TRAIN_TYPE_MST="TRAIN_TYPE_MST";
	public static final String TRAIN_FREQUENCY_MST="TRAIN_FREQUENCY_MST";
	public static final String LOBBY_MST = "LOBBY_MST";
	public static final String TRAIN_SEGMENT_MST = "TRAIN_SEGMENT_MST";
	public static final String SEGMENT_MST = "SEGMENT_MST";
	public static final String PARAMETER_MST = "PARAMETER_MST";
	public static final String TRAIN_MST = "TRAIN_MST";
	public static final String USER_MST = "USER_MST";
	
	// output table information.
	public static final String KPI_MST ="KPI_MST";
	public static final String LINK_DETAIL = "LINK_DETAIL";
	
	// pre processing table
	
	public static final String TRAIN_SEGMENT_ENGINE = "TRAIN_SEGMENT_ENGINE";
	public static final String TIME_TO_MIN_ENGINE ="TIME_TO_MIN_ENGINE";
	public static final String SEGMENT_MST_ENGINE = "SEGMENT_MST_ENGINE";
	public static final String DAY_MST_ENGINE ="DAY_MST_ENGINE";
	
	

	
	
	public static List<String> getInputTableNameList(){
		
		List<String> inputTableNameList = new ArrayList<>();
		inputTableNameList.add("TRACTION_MST"); 
		inputTableNameList.add("SEGMENT_MST");  
		//inputTableNameList.add("TRAIN_SEGMENT_MST");
		inputTableNameList.add("TRAIN_MST");
		inputTableNameList.add("STATION_MST");
		inputTableNameList.add("TRAIN_FREQUENCY_MST");
		inputTableNameList.add("PARAMETER_MST");
		inputTableNameList.add("USER_MST");
		return inputTableNameList;
	}
	
	
public static List<String> getPreProcessingInputTableNameList(){
		
		List<String> inputTableNameList = new ArrayList<>();
		inputTableNameList.add("TRAIN_SEGMENT_ENGINE");
		inputTableNameList.add("TIME_TO_MIN_ENGINE");
		inputTableNameList.add("SEGMENT_MST_ENGINE");
		inputTableNameList.add("DAY_MST_ENGINE");
		
		return inputTableNameList;
	}

}
