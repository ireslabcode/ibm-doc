package cclms.app.query;

import cclms.common.util.QueryIdentifierRequest;

public class QueryUtil {
	public static final String STATION_MST ="select * from STATION_MST";
	public static final String TRACTION_MST ="select * from TRACTION_MST";
	public static final String TRAIN_TYPE_MST="select * from TRAIN_TYPE_MST";
	public static final String TRAIN_FREQUENCY_MST="select * from TRAIN_FREQUENCY_MST";
	public static final String LOBBY_MST ="select * from STATION_MST where LOBBY_FLAG = 'Y' and DIVISION_ID=3";
	public static final String SEGMENT_MST ="select * from SEGMENT_MST";
	public static final String TRAIN_SEGMENT_MST ="select * from TRAIN_SEGMENT_MST";
	public static final String TRAIN_MST = "select * from TRAIN_MST";
	public static final String PARAMETER_MST ="select * from PARAMETER_MST";
	public static final String USER_MST ="select * from USER_MST";
	public static final String testQuery = "";
	//public static final String TRAIN_SEGMENT_ENGINE="SELECT A.TRAIN_ID, A.SEGMENT_ID,B.START_STATION_ID,B.STOP_STATION_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.RUNNING_DURATION,A.ACTUAL_KM,A.NIGHT_DUTY_FLAG,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_MST A,SEGMENT_MST B WHERE A.SEGMENT_ID=B.SEGMENT_ID";
	public static final String TRAIN_SEGMENT_ENGINE="SELECT A.TRAIN_ID, A.SEGMENT_ID,A.START_STATION_ID,A.STOP_STATION_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.RUNNING_DURATION,A.ACTUAL_KM,A.NIGHT_DUTY_FLAG,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_VIEW A WHERE A.CCLMS_TRAIN_TYPE=(SELECT TRAIN_TYPE_CCLMS_ID FROM TRAIN_TYPE_MST WHERE TRAIN_TYPE_MST.TRAIN_TYPE_DESC='%s') AND A.TRACTION_TYPE=(select traction_type from TRACTION_MST where traction_desc='%s') AND A.ASSIGNED_LOBBY=(SELECT STATION_ID FROM STATION_MST WHERE STATION_CODE = '%s' AND LOBBY_FLAG = 'Y') AND A.TRAIN_FREQUENCY_CD = (SELECT TRAIN_FREQUENCY_CODE FROM TRAIN_FREQUENCY_MST WHERE DESC = '%s') AND A.DEPT_TYPE = 'D'";
	
	//public static final String TIME_TO_MIN_ENGINE ="SELECT A.TRAIN_ID, A.SEGMENT_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_MST A";
	
	
	public static final String TIME_TO_MIN_ENGINE ="SELECT A.TRAIN_ID, A.SEGMENT_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_VIEW A WHERE A.CCLMS_TRAIN_TYPE=(SELECT TRAIN_TYPE_CCLMS_ID FROM TRAIN_TYPE_MST WHERE TRAIN_TYPE_MST.TRAIN_TYPE_DESC='PASSENGER') AND A.TRACTION_TYPE=(select traction_type from TRACTION_MST where traction_desc='ELECTRIC') AND A.ASSIGNED_LOBBY=(SELECT STATION_ID FROM STATION_MST WHERE STATION_CODE = 'AGC' AND LOBBY_FLAG = 'Y') AND A.TRAIN_FREQUENCY_CD = (SELECT TRAIN_FREQUENCY_CODE FROM TRAIN_FREQUENCY_MST WHERE DESC = 'DAILY') AND A.DEPT_TYPE = 'D'";
	
	//SELECT A.TRAIN_ID, A.SEGMENT_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_VIEW A WHERE A.CCLMS_TRAIN_TYPE=(SELECT TRAIN_TYPE_CCLMS_ID FROM TRAIN_TYPE_MST WHERE TRAIN_TYPE_MST.TRAIN_TYPE_DESC='PASSENGER') AND A.TRACTION_TYPE=(select traction_type from TRACTION_MST where traction_desc='ELECTRIC') AND A.ASSIGNED_LOBBY=(SELECT STATION_ID FROM STATION_MST WHERE STATION_CODE = 'AGC' AND LOBBY_FLAG = 'Y') AND A.TRAIN_FREQUENCY_CD = (SELECT TRAIN_FREQUENCY_CODE FROM TRAIN_FREQUENCY_MST WHERE DESC = 'DAILY')
	
	
	
	
	public static final String SEGMENT_MST_ENGINE = "select b.STATION_CODE,c.STATION_CODE,a.SEGMENT_ID from SEGMENT_MST a, STATION_MST b,STATION_MST c where a.START_STATION_ID=b.STATION_ID and a.STOP_STATION_ID=c.STATION_ID";
	public static final String DAY_MST_ENGINE ="select * from DAY_MST_ENGINE";
	
	//, QueryIdentifierRequest identifierRequest
	
	
	
/*	inputTableNameList.add("TRACTION_MST"); 
	inputTableNameList.add("SEGMENT_MST");  
	//inputTableNameList.add("TRAIN_SEGMENT_MST");
	inputTableNameList.add("TRAIN_MST");
	inputTableNameList.add("STATION_MST");
	inputTableNameList.add("TRAIN_FREQUENCY_MST");
	inputTableNameList.add("PARAMETER_MST");*/

	
	public static String getQueryByTableName(String tableName){
		//System.out.println(tableName);
        //System.out.println(tableName.equals("TRACTION_MST"));
		if(tableName.equals("TRACTION_MST")){     //i/p
			return TRACTION_MST;
		}else if(tableName.equals("TRAIN_SEGMENT_MST")){
			return TRAIN_SEGMENT_MST;	
		}else if(tableName.equals("TRAIN_MST")){
			return TRAIN_MST;	
		}else if(tableName.equals("SEGMENT_MST")){
			return SEGMENT_MST;	
		}else if(tableName.equals("STATION_MST")){
			return STATION_MST;	
		}else if(tableName.equals("TRAIN_FREQUENCY_MST")){
			return TRAIN_FREQUENCY_MST;	
		}else if(tableName.equals("PARAMETER_MST")){
			return PARAMETER_MST;	
		}else if(tableName.equals("TRAIN_SEGMENT_ENGINE")){
			
			// TO DO 
			
			
			return TRAIN_SEGMENT_ENGINE;	
		}else if(tableName.equals("TIME_TO_MIN_ENGINE")){
			return TIME_TO_MIN_ENGINE;	
		}else if(tableName.equals("SEGMENT_MST_ENGINE")){
			return SEGMENT_MST_ENGINE;	
		}else if(tableName.equals("USER_MST")){
			return USER_MST;	
		}
		return "";
	}
	
	
	
	
	
	
	public static String getQueryByTableNameForPreProcessing(String tableName, QueryIdentifierRequest identifierRequest){
		//System.out.println(tableName);
        //System.out.println(tableName.equals("TRACTION_MST"));
		
		if(tableName.equals("TRAIN_SEGMENT_ENGINE")){
			
			
			String qq =String.format(TRAIN_SEGMENT_ENGINE, identifierRequest.getSelectedTrainType(),identifierRequest.getSelectedTractionType(),identifierRequest.getSelectedLobby(),identifierRequest.getSelectedTrainFrequency());
			System.out.println(qq);
			return qq;
		}else if(tableName.equals("TIME_TO_MIN_ENGINE")){
			return TIME_TO_MIN_ENGINE;	
		}else if(tableName.equals("SEGMENT_MST_ENGINE")){
			return SEGMENT_MST_ENGINE;	
		}else if(tableName.equals("DAY_MST_ENGINE")){
			return DAY_MST_ENGINE;	
		}
		//DAY_MST_ENGINE
		return "";
	}

	
	
	
	
	
	
	
	
	
	public static void main(String args[]){
		//1,1,221,1
		// PASSENGER, ELECTRIC, AGC, DAILY
		
		String query ="SELECT A.TRAIN_ID, A.SEGMENT_ID,A.START_STATION_ID,A.STOP_STATION_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.RUNNING_DURATION,A.ACTUAL_KM,A.NIGHT_DUTY_FLAG,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_VIEW A WHERE A.CCLMS_TRAIN_TYPE=(SELECT TRAIN_TYPE_CCLMS_ID FROM TRAIN_TYPE_MST WHERE TRAIN_TYPE_MST.TRAIN_TYPE_DESC='%s') AND A.TRACTION_TYPE=(select traction_type from TRACTION_MST where traction_desc='%s') AND A.ASSIGNED_LOBBY=(SELECT STATION_ID FROM STATION_MST WHERE STATION_CODE = '%s' AND LOBBY_FLAG = 'Y') AND A.TRAIN_FREQUENCY_CD = (SELECT TRAIN_FREQUENCY_CODE FROM TRAIN_FREQUENCY_MST WHERE DESC = '%s')";
		//String.format(query,1,1,221,1);
		System.out.println(String.format(query,"PASSENGER","ELECTRIC","AGC","DAILY"));
	}
	}
