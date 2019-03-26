package cclms.app.query;

public class QueryUtil {
	public static final String STATION_MST ="select * from STATION_MST";
	public static final String TRACTION_MST ="select * from TRACTION_MST";
	public static final String TRAIN_TYPE_MST="select * from TRAIN_TYPE_MST";
	public static final String TRAIN_FREQUENCY_MST="select * from TRAIN_FREQUENCY_MST";
	public static final String LOBBY_MST ="select * from STATION_MST where LOBBY_FLAG = 'N'";
	public static final String SEGMENT_MST ="select * from SEGMENT_MST";
	public static final String TRAIN_SEGMENT_MST ="select * from TRAIN_SEGMENT_MST";
	public static final String TRAIN_MST = "select * from TRAIN_MST";
	public static final String PARAMETER_MST ="select * from PARAMETER_MST";
	public static final String testQuery = "";
	public static final String TRAIN_SEGMENT_ENGINE="SELECT A.TRAIN_ID, A.SEGMENT_ID,B.START_STATION_ID,B.STOP_STATION_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.RUNNING_DURATION,A.ACTUAL_KM,A.NIGHT_DUTY_FLAG,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_MST A,SEGMENT_MST B WHERE A.SEGMENT_ID=B.SEGMENT_ID";
	public static final String TIME_TO_MIN_ENGINE ="SELECT A.TRAIN_ID, A.SEGMENT_ID,A.SIGN_ON_TIME,A.START_TIME,A.END_TIME,A.SIGN_OFF_TIME,A.DAYOFSERVICE,A.SPARE_FLAG FROM TRAIN_SEGMENT_MST A";
	
	
	
	
	
	public static String getQueryByTableName(String tableName){
		//System.out.println(tableName);
        //System.out.println(tableName.equals("TRACTION_MST"));
		if(tableName.equals("TRACTION_MST")){
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
			return TRAIN_SEGMENT_ENGINE;	
		}else if(tableName.equals("TIME_TO_MIN_ENGINE")){
			return TIME_TO_MIN_ENGINE;	
		}
		return "";
	}
	}
