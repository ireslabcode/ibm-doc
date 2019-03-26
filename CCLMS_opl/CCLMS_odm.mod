// DO NOT EDIT: This file is automatically generated by ODM Enterprise.
// Any changes made directly to this file will be lost when it is
// automatically regenerated.

// Input

tuple TDayMstEngine {
  int dayId;
  string dayDesc;
};

tuple TLobbyMaster {
  string lobbyCode;
  string lobbyName;
  key int lobbyid;
};

tuple TParameters {
  key int parameterId;
  string description;
  float value;
  string uoM;
};

tuple TSegmentMaster {
  string fromStation;
  string toStation;
  key int segmentid;
};

tuple TStationMaster {
  string stationCode;
  key int stationId;
};

tuple TTimetoMinutes {
  key int trainid;
  key int segmentid;
  string signontime;
  int signoMinute;
  string startTime;
  int startMinute;
  string endTime;
  int endMinute;
  string signoffTime;
  int signoffMinute;
  key int dayid;
  key int spareflag;
};

tuple TTrainMaster {
  string trainNo;
  key int trainId;
  string trainName;
  string trainType;
};

tuple TTrainSegments {
  key int trainid;
  key int legid;
  int startLoc;
  int endLoc;
  int signon;
  int start;
  int end;
  int signoff;
  int duration;
  int distance;
  int nightflag;
  key int dayid;
  key int spareflag;
};
{TDayMstEngine} dayMstEngine = ...;
{TLobbyMaster} lobbyMaster = ...;
{TParameters} parameters = ...;
{TSegmentMaster} segmentMaster = ...;
{TStationMaster} stationMaster = ...;
{TTimetoMinutes} timetoMinutes = ...;
{TTrainMaster} trainMaster = ...;
{TTrainSegments} trainSegments = ...;

// Output

tuple TKpiLinkEngine {
  key int kpiId;
  string kpiDesc;
  float kpiValue;
  string uom;
};

tuple TOutlink {
  key int dayid;
  key int seqId;
  key int pairingId;
  key int dutyId;
  key int trainId;
  key int legId;
  int startLoc;
  int endLoc;
  int dutySignOn;
  int startTime;
  int endTime;
  int dutySignOff;
  int duration;
  int nib;
  int spareflag;
  int sortOrder;
};

tuple TOutputLink {
  string dayname;
  int crewNo;
  key string trainNo;
  key string fromStation;
  key string toStation;
  string signOnTime;
  string departureTime;
  string arrivalTime;
  string signOffTime;
  string dutyTime;
  int dutyDuration;
  int distance;
  int nib;
  int sortOrder;
  key int dayid;
  key int spareflag;
};
{TKpiLinkEngine} kpiLinkEngine;
{TOutlink} outlink;
{TOutputLink} outputLink;
