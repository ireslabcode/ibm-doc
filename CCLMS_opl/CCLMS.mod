/*********************************************
 * OPL 12.6.3.0 Model
 * Author: cclms
 * Creation Date: Mar 22, 2019 at 3:12:57 PM
 *********************************************/
include "CCLMS_odm.mod";

//parameters
int minConnectTime;// = 60;//minimum connection time between 2 trains
int maxRunningDuty;// = 480;//maximum running duty time in single duty
int maxDutySign2SignOff;// = 660;//maximum duty time in single duty between sign-on to sign-off
int totaldutyin14Days;// = 5760;//total duty hours in 14 days, default is 96 hrs
int periodicRest22Hrs;// = 5;//minimum no. of periodic rests (of 22Hrs)
int periodicRest30Hrs;// = 4;//minimum no. of periodic rests (of 30Hrs)
int outstationRest1;// = 360;//if running duty between 5 and 8 hrs, default is 6 Hrs
int outstationRest2;// = 480;// if running duty is of >= 8 hrs, default is 8 hrs
int outstationRest3;// = 1;// if running duty is of < 5 hrs, then rest is duty hours + 1 hour
int minHomeStationRest;// = 960;//min. lobby rest, default is 16 Hrs
int maxTimeAwayfromHome;// = 4320;//crew has to come back to base lobby within 72 Hrs
int maxContNightDuties;// = 3;//maximum no. of continuous night duties allowed
int maxRunThroughAllowed;// = 1;//maximum no. of run-throughs via home lobby
 
//output KPIs
  int totalTrainRunningKms;
  int noOfCrew;
  float crewProductivityTrainKmperCrewPerDay;
  float crewUtilizationCrewDutyHrsPerFortnight;
  float trainKmPerCrewPerDayWithoutPilotKms;
  float trainKmPerCrewPerDayWithPilotKms;
  float noOfDutyHoursPerFortnight;
  float spareDutyKms;
  float totalTimeSpentBetweenVariousActivitiesInHrs;
  float totalDutyHours;
  float totalOutstationHours;
  float totalHomeStationRest;
  float percentageOfTimeSpentOnDuty;
  float percentageOfTimeSpentOnOutstationRest;
  float percentageOfTimeSpentOnHomeStationRest;
  float noOfPeriodicRestsIn30Days;
  int totalCycleDays;
  float totalRunningDutyHrs;
  float spareDutyHrs;
  float runningDutyHrsPerFortnight;
  
  float totaldutyduration;//in minutes
  int totalNIB = 0;
  int totalinputrunning = 0;
  int totalrunningdutyminutes = 0;
  int totalinputKms=0;
  int totalInputduration = 0;
  int totalOutputdistance = 0;

execute initialize{
  	for(var p in parameters){
  	  if(p.parameterId == 1)
		  maxRunningDuty = 			p.value*60;
	  if(p.parameterId == 2)
		  maxDutySign2SignOff = 	p.value*60;
	  if(p.parameterId == 3)
		  totaldutyin14Days = 		p.value*60;
	  if(p.parameterId == 4)		  
		  periodicRest22Hrs = 		p.value;
	  if(p.parameterId == 5)		  
		  periodicRest30Hrs = 		p.value;
	  if(p.parameterId == 6)		  
		  outstationRest1 = 		p.value*60;
	  if(p.parameterId == 7)		  
		  outstationRest2 = 		p.value*60;
	  if(p.parameterId == 8)		  
		  outstationRest3 = 		p.value*60;
	  if(p.parameterId == 9)		  
		  minHomeStationRest = 		p.value*60;
	  if(p.parameterId == 10)		  
		  maxTimeAwayfromHome = 	p.value*60;
	  if(p.parameterId == 11)		  
		  maxContNightDuties = 		p.value;
	  if(p.parameterId == 12)		  
		  minConnectTime = 			p.value;
	  if(p.parameterId == 13)		  
		  maxRunThroughAllowed = 	p.value;
	}
	cplex.tilim = 720;  
}

{int} HomeStations = {1};// {l.lobbyid|l in lobbyMaster};//3:UMB,1:DHN
int slackLength = ftoi(ceil((1/5)*card(trainSegments)));//to generalize the link length:14Dec18, RK
int LinkLength = card(trainSegments) + slackLength;
range SeqInd = 1..LinkLength;   //to index the order in which a leg would appear in roster from a homestation

tuple Task2{
  TTrainSegments t;
  int pos; 
}  

{Task2} TaskwithPos={ <t, p> | t in trainSegments, p in SeqInd };

{Task2} successorsforLegs[t1 in TaskwithPos];

tuple Duty{
  int dutyId;
  int dutystartLoc;//duty start location
  int dutyendLoc;//duty end location
  int dutysignon;//duty sign ON time
  int dutystart;//duty START time
  int dutyend;//duty END time
  int dutysignoff;//duty sign OFF time
  int runningduration;//time from duty start to duty end
  int dutyduration;//time from duty sign-on to duty sign-off
  int startPos;//position of starting leg
  int endPos;//position of end leg
  int nightflag;//1,if duty start or end in 22:00 Hrs to 06:00 Hrs interval
//  {int} legs;//leg-train ids
}

{Duty} duties;

{Duty} successorsforDuties[d in duties] = {};

{Task2} setoflegs;// =...;
{Task2} templegList;// = ...;

int isVisited[t in TaskwithPos];

tuple dutylegtuple{
  int dutyid;
  Task2 leg;
}

{dutylegtuple} dutylegs;//=...;

int dutyid=0;// = ...;

{Duty} setofduties;// = ...;
{Duty} tempdutylist;// = ...;

int isDutyVisited[d in duties];

int pairingid=0;//=...;

tuple pairingduty{
  int pairingid;
  Duty duty;
}

{pairingduty} pairingduties;// = ...;  

tuple Pairing{
  int pairingId;
  int P_startLoc;//pairing start location
  int P_endLoc;//pairing end location
  int P_signon;//pairing sign ON time
  int P_start;//pairing START time
  int P_end;//pairing END time
  int P_signoff;//pairing sign OFF time
  int P_runningduration;//time from pairing start to pairing end
  int P_dutyduration;//time from pairing sign-on to pairing sign-off
  int P_startPos;//position of starting leg
  int P_endPos;//position of end leg
  int P_totalOutRest;//total outstation rest in a pairing
}

{Pairing} pairings;// = ...;
{Pairing} successorforPairings[p in pairings]={};

int homerunthroughs[p in pairings];
{int} homeRestTypes = {16,22,30};

tuple pairingwidhomerest{
  Pairing p;
  int prEnd;//at what time rest ends
  int NIB;//if rest includes Night-in-Bed
  int prPos;//at what position, rest ends
  int hrtype;//if home rest is of 16,22 or 30 hrs
}  

{pairingwidhomerest} pairwithrest;// = ...;

execute preprocessing{
	var dutyid = 0;
	var pairingid = 0;
	//generate successor legs
	for(var t1 in TaskwithPos){
		for(var t2 in TaskwithPos){  
			var runningduration = t2.t.end +(t2.pos-1)*1440 - t2.t.start-(t2.pos-1)*1440
								+ t1.t.end +(t1.pos-1)*1440 - t1.t.start-(t1.pos-1)*1440;
			var dutyduration = t2.t.signoff + (t2.pos-1)*1440 - t1.t.signon - (t1.pos-1)*1440;
	  		if((dutyduration<=maxDutySign2SignOff) && (runningduration<=maxRunningDuty) && (t1.t.endLoc==t2.t.startLoc) && (t2.t.start +(t2.pos-1)*1440 > t1.t.end+(t1.pos-1)*1440) && (t2.t.end+(t2.pos-1)*1440-t1.t.start-(t1.pos-1)*1440>0)){
	  			successorsforLegs[t1].add(t2);
   			}	  		
 		}	  
 	}	  
	
	//recursive function to generate all duty-paths
	// starting with 's'
	// isVisited[] keeps track of links visited in current path
	//dutylegs stores actual legs in a duty
	function generatepath(fixStart,s1,maxAllowedRunningDuty,isVisited,legList,runningduty,dutyduration,maxAllowedDuty){
		
		//mark start leg
		isVisited[s1]=1;
		
		if(runningduty<=maxAllowedRunningDuty && dutyduration<=maxAllowedDuty)
		{
			 dutyid = dutyid+1;
			 
			 var nightflag=0;
			 //create duties with each legList
			 for(var l in legList){
		  	  dutylegs.add(dutyid,l);
		  	  
		  	  if(l.t.nightflag>nightflag)
		  	  	nightflag = l.t.nightflag;
     		 }
     		 
     		 //adding duties
     		 duties.add(dutyid,fixStart.t.startLoc,s1.t.endLoc,fixStart.t.signon,fixStart.t.start,s1.t.end,s1.t.signoff,
     		 					s1.t.end+1440*(s1.pos-1)-fixStart.t.start-1440*(fixStart.pos-1),
     		 					s1.t.signoff+1440*(s1.pos-1)-fixStart.t.signon-1440*(fixStart.pos-1),
     		 					fixStart.pos,s1.pos,nightflag);
  		}		  
  		
  		//recur for all the legs adjacent to current leg
  		for(var s in successorsforLegs[s1]) 
  		{
  			if(isVisited[s]!=1)
  			{
// 			  	runningduty = s.t.end + (s.pos-1)*1440 - fixStart.t.start - (fixStart.pos-1)*1440;
  			  	
  			  	runningduty = runningduty + s.t.end + (s.pos-1)*1440 - s.t.start - (s.pos-1)*1440;
  			  	
  			  	dutyduration = s.t.signoff + (s.pos-1)*1440 - fixStart.t.signon - (fixStart.pos-1)*1440;
  			  	
  			  	var s_trainid = s.t.trainid;//successor
  			  	var s1_trainid = s1.t.trainid;//predecessor
  			  	
  			  	
  			  	if(runningduty<=maxAllowedRunningDuty && dutyduration<=maxAllowedDuty){
					
  			  	  	if(s_trainid==s1_trainid){//check if successor leg belongs to same trainid, if yes, then no 'minConnectTime' is required to be maintained
  						legList.add(s);
  						
  						generatepath(fixStart,s,maxAllowedRunningDuty, isVisited,legList,runningduty,dutyduration,maxAllowedDuty);

		  			  	//remove current leg
		  			  	templegList.clear();
		  			  	for(l in legList)
		  			  		 templegList.add(l);
		  			  	legList.clear();
		  			  	for(var l in templegList){
		  			  		if(l!=s)  
		  			  	  		legList.add(l);
		        		} 
		        		
		        		runningduty = runningduty - (s.t.end + (s.pos-1)*1440 - s.t.start - (s.pos-1)*1440);
     				}  	
     				else if((s1.t.endLoc!=Opl.first(HomeStations)) && (s.t.start+1440*(s.pos-1)>=s1.t.end+1440*(s1.pos-1)+minConnectTime)){//else successor leg can only be added only if it starts after 'minConnectTime'
     					legList.add(s);
     					
     					generatepath(fixStart,s,maxAllowedRunningDuty, isVisited,legList,runningduty,dutyduration,maxAllowedDuty);

		  			  	//remove current leg
		  			  	templegList.clear();
		  			  	for(l in legList)
		  			  		 templegList.add(l);
		  			  	legList.clear();
		  			  	for(var l in templegList){
		  			  		if(l!=s)  
		  			  	  		legList.add(l);
		        		} 
		        		
		        		runningduty = runningduty - (s.t.end + (s.pos-1)*1440 - s.t.start - (s.pos-1)*1440);
     				}
     				else
  						runningduty = runningduty - (s.t.end + (s.pos-1)*1440 - s.t.start - (s.pos-1)*1440);  					
  				}
  				else
  					runningduty = runningduty - (s.t.end + (s.pos-1)*1440 - s.t.start - (s.pos-1)*1440);
  				
// 			  	generatepath(fixStart,s,maxAllowedRunningDuty, isVisited,legList,runningduty,dutyduration,maxAllowedDuty);
//
//  			  	//remove current leg
//  			  	templegList.clear();
//  			  	for(l in legList)
//  			  		 templegList.add(l);
//  			  	legList.clear();
//  			  	for(var l in templegList){
//  			  		if(l!=s)  
//  			  	  		legList.add(l);
//        		}  			  	  
   			}  			
  		}  		
 	}
 	
 	//all feasible duties starting with link 's'
	function generateAllPaths(fixStart,s, maxAllowedRunningDuty,setofleg,maxAllowedDuty){
		for(var t in TaskwithPos) isVisited[t]=0;
	 	var legList = setofleg;	
	 	var runningduty=s.t.end + (s.pos-1)*1440 - fixStart.t.start - (fixStart.pos-1)*1440;//99999;
	 	var dutyduration = s.t.signoff + (s.pos-1)*1440 - fixStart.t.signon - (fixStart.pos-1)*1440;
	 	
	 	
	 	//add starting 'leg' to path
	 	legList.add(s);
	 	generatepath(fixStart,s,maxAllowedRunningDuty,isVisited,legList,runningduty,dutyduration,maxAllowedDuty);
		return; 	  
	}
 	
 	//code for duty-paths start here
// 	var dutyid;
 	for(var t1 in TaskwithPos)
 	{
 	  	var maxAllowedDuty = maxDutySign2SignOff;;
 	  	var maxAllowedRunningDuty = maxRunningDuty;//480;
 		var totalVertices = Opl.card(TaskwithPos);
 		setoflegs.clear();
 		var setofleg = setoflegs;
 		dutyid = dutyid+0;
 		generateAllPaths(t1,t1,maxAllowedRunningDuty,setofleg,maxAllowedDuty);
 	
	} 		  
	
	//Find out successor-duties for each duty
	for(var d1 in duties)
	{
	  var outrest;
	  if(d1.runningduration>=0 && d1.runningduration<5*60) //if duty hours>0 and duty hours < 5 hours, then outstation rest=duty hours+1 hour
	  	outrest = d1.runningduration + 60;
	  else if (d1.runningduration<8*60)				//if duty hours< 8 hrs and >=5 hours, then outstation rest = 6hrs(parameter)
	  	outrest=outstationRest1;
	  else											//if duty hours >=8 hours, then outstation rest = 8hrs(parameter)
	  	outrest=outstationRest2;
	  	
	  for(var d2 in duties){
			if((d2.dutysignoff+1440*(d2.endPos-1)-d1.dutysignon-1440*(d1.startPos-1))<=maxTimeAwayfromHome && d1.dutyendLoc==d2.dutystartLoc && (d2.dutysignon+1440*(d2.startPos-1)>=d1.dutysignoff +1440*(d1.endPos-1) + outrest))		
				successorsforDuties[d1].add(d2);
		}		
	}	
	
	function generateAllPairings(fixStart,s1,maxAllowedPairingLength,setofduty,totalpairingduration)
	{
	  	
		//mark starting duty as visited
		isDutyVisited[s1] = 1;
	
		if(s1.dutyendLoc==Opl.first(HomeStations) && totalpairingduration<=maxAllowedPairingLength)
		{
		  
			pairingid = pairingid + 1;
			
			//create pairing with each duty list
			for(var d in setofduty){
				pairingduties.add(pairingid,d);
				
				writeln("Pairing Id: " + pairingid + " & Duty Id: " + d.dutyId);
  			}				
			
			var P_runduration = 0;
			var P_dutyduration = 0;
			var P_outrest = 0;
			var tempdutysignoff = 0;
			
			for(var d in setofduty){
			  if(tempdutysignoff!=0) P_outrest = P_outrest + d.dutysignon+1440*(d.startPos-1) - tempdutysignoff;
			  tempdutysignoff = d.dutysignoff+1440*(d.endPos-1);
			   P_runduration = P_runduration + d.runningduration;
			   P_dutyduration = P_dutyduration + d.dutyduration;}
				
			//populate pairings tuple
			pairings.add(pairingid,fixStart.dutystartLoc,s1.dutyendLoc,fixStart.dutysignon,
								fixStart.dutystart,s1.dutyend,s1.dutysignoff,P_runduration,P_dutyduration,
								fixStart.startPos,s1.endPos,P_outrest);
		}
		
		if(totalpairingduration>maxAllowedPairingLength){
		  	s1=Opl.last(setofduty);
			//update totalpairingduration by substracting contribution of not-added duty.....
    		totalpairingduration = s1.dutysignoff + (s1.endPos-1)*1440 - fixStart.dutysignon - (fixStart.startPos-1)*1440;}
		
		//if reached base lobby then do not look beyond
//		if(s1.dutyendLoc==Opl.first(HomeStations))
//		{
//	  		//remove current leg
//		  	tempdutylist.clear();
//		  	for(dt in setofduty)
//		  		 tempdutylist.add(dt);
//		  	setofduty.clear();
//		  	for(var dt in tempdutylist){
//		  		if(dt!=s1)  
//		  	  		setofduty.add(dt);
//    		}
//    		
//    		s1=Opl.last(setofduty);
//    		
//    		//update totalpairingduration by substracting contribution of removed duty.....
//    		totalpairingduration = s1.dutysignoff + (s1.endPos-1)*1440 - fixStart.dutysignon - (fixStart.startPos-1)*1440;
//    		
//    		
//    		generateAllPairings(fixStart,s1,maxAllowedPairingLength,setofduty,totalpairingduration);
//  		}		  
		
		//recur for all the duties adjacent to current duty
  		for(var d in successorsforDuties[s1]) 
  		{
  		  	if(fixStart.dutyId==256 && d.dutyId==4){
		  		writeln("duty id is: " + 256);
		  	}
			if(isDutyVisited[d]!=1)
  			{
  			   totalpairingduration = d.dutysignoff + (d.endPos-1)*1440 - fixStart.dutysignon - (fixStart.startPos-1)*1440;
  			   
//  			if(s1.dutyendLoc==Opl.first(HomeStations)){
//  			   		if(totalpairingduration<=maxAllowedPairingLength && d.dutysignon+(d.startPos-1)*1440>s1.dutysignoff+(s1.endPos-1)*1440+minHomeStationRest){
//  			     		setofduty.add(d);}
//        		}
//        		else 

        		if(totalpairingduration<=maxAllowedPairingLength && s1.dutyendLoc!=Opl.first(HomeStations)){
  					setofduty.add(d);

	  			  	generateAllPairings(fixStart,d,maxAllowedPairingLength,setofduty,totalpairingduration);	
					
					//remove current duty
	  			  	tempdutylist.clear();
	  			  	for(dt in setofduty)
	  			  		 tempdutylist.add(dt);
	  			  	setofduty.clear();
	  			  	for(var dt in tempdutylist){
	  			  		if(dt!=d)  
	  			  	  		setofduty.add(dt);
	        		}
	        		
	        		var lastduty = Opl.last(setofduty);
	        		//update totalpairingduration by substracting contribution of removed duty.....
	    			totalpairingduration = lastduty.dutysignoff + (lastduty.endPos-1)*1440 - fixStart.dutysignon - (fixStart.startPos-1)*1440;

  				}
  					
//  			generateAllPairings(fixStart,d,maxAllowedPairingLength,setofduty,totalpairingduration);	
//				
//				//remove current duty
//  			  	tempdutylist.clear();
//  			  	for(dt in setofduty)
//  			  		 tempdutylist.add(dt);
//  			  	setofduty.clear();
//  			  	for(var dt in tempdutylist){
//  			  		if(dt!=d)  
//  			  	  		setofduty.add(dt);
//        		}
//        		
//        		var lastduty = Opl.last(setofduty);
//        		//update totalpairingduration by substracting contribution of removed duty.....
//    			totalpairingduration = lastduty.dutysignoff + (lastduty.endPos-1)*1440 - fixStart.dutysignon - (fixStart.startPos-1)*1440;
        		
 			}			
  		}

  		isDutyVisited[s1] = 0;				
  		
	}	
	
	//all feasible pairings thats starts with duty 'd'
	function generatePairing(StartDuty,s,maxAllowedPairingLength,setofduty){
	  	for(var d in duties) isDutyVisited[d] = 0;
	  	
	  	var dutylist = setofduty;
	  	var pairingduration = s.dutysignoff + (s.endPos-1)*1440 - StartDuty.dutysignon - (StartDuty.startPos-1)*1440;
	  	
	  	//add starting 'duty' to pairing path
	  	dutylist.add(s);
	  	generateAllPairings(StartDuty,s,maxAllowedPairingLength,setofduty,pairingduration);
	  	return;
 	}	  
	
	for(var d in duties)
	{
	 	var maxPairingLength=maxTimeAwayfromHome; 
	 	setofduties.clear();
	 	var setofduty = setofduties;
	
		  if(d.dutystartLoc==Opl.first(HomeStations) && d.dutyendLoc==Opl.first(HomeStations))
		  {
		  	  pairingid = pairingid + 1;
		  	  pairingduties.add(pairingid,d);
		  	  
		  	  //below logic added on 17Dec'18 by RK while testing on AGRA division data
		  	  pairings.add(pairingid,d.dutystartLoc,d.dutyendLoc,d.dutysignon,
								d.dutystart,d.dutyend,d.dutysignoff,d.runningduration,d.dutyduration,
								d.startPos,d.endPos,0);
		  }
		  else if(d.dutystartLoc==Opl.first(HomeStations) && d.dutyendLoc!=Opl.first(HomeStations))
		  	generatePairing(d,d,maxPairingLength,setofduty);
	}
	
	//calculate home run-throughs in each pairing
	for(var p in pairings){
		var runthroughcount=0;
		for(var pd in pairingduties){
			if(pd.pairingid==p.pairingId)
			{
				for(var dl in dutylegs){
					if(pd.duty.dutyId==dl.dutyid){
						if(dl.leg.t.endLoc==Opl.first(HomeStations))	
							runthroughcount = runthroughcount + 1;			
					}
				}	
			}
		}
		writeln("runthrough for pairing id "+ p.pairingId + " is "+ runthroughcount);
		homerunthroughs[p] = runthroughcount;
	}
	
	//prepare pairings with home rests
	for(var p in pairings){
	  if(homerunthroughs[p]<=1+maxRunThroughAllowed){
	  	for(var r in homeRestTypes){
	  		var restStart=p.P_signoff + 1440*(p.P_endPos-1);;
	  		var restEnd;
	  		var restEndpos;
	  		var NIB;
	  		var restHours;
	  		var restMinutes;
	  		
	  		if(p.P_signoff<=840 && p.P_signoff>=480)//where restHours are between 16 and 22 hours and also have NIB
	  		{
	  		  	restMinutes = (480 + (1320-p.P_signoff));
	  			restEnd =  p.P_signoff + 1440*(p.P_endPos-1) + restMinutes;
	  			
	  			restHours = Opl.floor(restMinutes/60);
	  			
	  			if (restEnd> 1440*p.P_endPos) restEndpos = p.P_endPos+1;
	  			else restEndpos = p.P_endPos;
	  			
	  			if(restMinutes>=minHomeStationRest){
	  			pairwithrest.add(p,restEnd,1,restEndpos,restHours);}
     		}
     		
     		if(p.P_signoff<=1440 && p.P_signoff>=1320)//where restHours are more than 30 hours and also have NIB
	  		{
	  		  	restMinutes = (1800 + (1440-p.P_signoff));
	  			restEnd =  p.P_signoff + 1440*(p.P_endPos-1) + restMinutes;
	  			
	  			restHours = Opl.floor(restMinutes/60);
	  			
	  			if (restEnd> 1440*p.P_endPos) restEndpos = p.P_endPos+1;
	  			else restEndpos = p.P_endPos;
	  			
	  			if(restMinutes>=minHomeStationRest){
	  			pairwithrest.add(p,restEnd,1,restEndpos,restHours);}
     		}
     		
     		if(p.P_signoff<=480)//where restHours are between 22 and 30 hours and also have NIB
	  		{
	  		  	restMinutes = (480 + (1320-p.P_signoff));
	  			restEnd =  p.P_signoff + 1440*(p.P_endPos-1) + restMinutes;
	  			
	  			restHours = Opl.floor(restMinutes/60);
	  			
	  			if (restEnd> 1440*p.P_endPos) restEndpos = p.P_endPos+1;
	  			else restEndpos = p.P_endPos;
	  			
	  			if(restMinutes>=minHomeStationRest){
	  			pairwithrest.add(p,restEnd,1,restEndpos,restHours);}
     		}	  		  
	  		
	  		if(p.P_signoff>=1440)//where restHours are between 22 and 30 hours and also have NIB
	  		{
	  			restMinutes = 1800 - (p.P_signoff-1440);
	  			restEnd =  p.P_signoff + 1440*(p.P_endPos-1) + restMinutes;
	  			
	  			restHours = Opl.floor(restMinutes/60);
	  			
	  			if (restEnd> 1440*p.P_endPos) restEndpos = p.P_endPos+1;
	  			else restEndpos = p.P_endPos;
	  			
	  			if(restMinutes>=minHomeStationRest){
	  			pairwithrest.add(p,restEnd,1,restEndpos,restHours);}
     		}	  		  
	  		
	  		if(r==16 && r*60>=minHomeStationRest)
	  		{
	  			restEnd =  p.P_signoff + 1440*(p.P_endPos-1) + 960;//add 16 hrs of rest after signoff
//	  			if(restStart<=1320+1440*(p.P_endPos-1) && 360+1440*p.P_endPos<=restEnd)//if rest falls in NIB window
	  			if(p.P_signoff>=840 && p.P_signoff<=1320)//if rest falls in NIB window
	  			 NIB=1;
	  			else NIB=0;
	  			
	  			if (restEnd> 1440*p.P_endPos) restEndpos = p.P_endPos+1;
	  			else restEndpos = p.P_endPos;
	  			
	  			pairwithrest.add(p,restEnd,NIB,restEndpos,16);
     		}	
     		else if(r==22 && r*60>=minHomeStationRest)
     		{
     		  	restEnd =  p.P_signoff + 1440*(p.P_endPos-1) + 1320;//add 22 hrs of rest after signoff
	  			
//	  			if(restStart<=1320+1440*(p.P_endPos-1) && 360+1440*p.P_endPos<=restEnd)//if rest falls in NIB window
	  			if(p.P_signoff>=480 && p.P_signoff<=1320)//if rest falls in NIB window
	  			 NIB=1;
	  			 else NIB=0;
	  			
	  			if (restEnd> 1440*p.P_endPos) restEndpos = p.P_endPos+1;
	  			else restEndpos = p.P_endPos;
	  			
	  			pairwithrest.add(p,restEnd,NIB,restEndpos,22);
       		}     		    		  
       		else if(r==30 && r*60>=minHomeStationRest)
       		{
     		  	restEnd =  p.P_signoff + 1440*(p.P_endPos-1) + 1800;//add 30 hrs of rest after signoff
	  			
//	  			if(restStart<=1320+1440*(p.P_endPos-1) && 360+1440*p.P_endPos<=restEnd)//if rest falls in NIB window
	  			if(p.P_signoff>=1440 || p.P_signoff<=1320)//if rest falls in NIB window
	  			 NIB=1;
	  			 else NIB=0;
	  			
	  			if (restEnd> 1440*p.P_endPos) restEndpos = p.P_endPos+1;
	  			else restEndpos = p.P_endPos;
	  			
	  			pairwithrest.add(p,restEnd,NIB,restEndpos,30);
         	}       		  
 		}
	  }
 	}
 	
}

execute{writeln("Preprocessing completed");}

//optimization model starts here
dvar boolean isPairingSelected[p in pairwithrest];
dvar float+ totalHomeRest;
dvar float+ LinkEndTime;//this has to be minimised
dvar float+ LinkStartTime;
dvar float+ TotalLinkLength;
dvar boolean isPosSelected[s in SeqInd];
dvar float+ cumulativenights[s in SeqInd];
dvar float+ totalPairingSignOn;
dvar float+ totalPairingEnd;
dvar float+ totalPairingSignOff;
dvar float+ totalextraRest;

dexpr int TotalOutRest = sum(pr in pairwithrest) isPairingSelected[pr]*pr.p.P_totalOutRest;
dexpr float OverallLinkLength = TotalLinkLength;
dexpr float TotalHomeRest = totalHomeRest;

minimize OverallLinkLength + TotalOutRest  + totalextraRest + 0*TotalHomeRest;//+ totalHomeRest;//sum(pr in pairwithrest) extraRest[pr];

constraints{
  	//to test something
//  	LinkEndTime<=14400;
  
  	totalPairingSignOn == sum(pr in pairwithrest:pr.p.P_startPos!=1) (pr.p.P_signon+1440*(pr.p.P_startPos-1))*isPairingSelected[pr];
  	totalPairingEnd == - LinkEndTime + sum(pr in pairwithrest) pr.prEnd*isPairingSelected[pr];
  	totalPairingSignOff == totalPairingEnd - sum(pr in pairwithrest) 60*pr.hrtype*isPairingSelected[pr];
  	totalHomeRest == totalPairingSignOn - totalPairingSignOff;
	totalextraRest == totalPairingSignOn - totalPairingEnd;

    TotalLinkLength + LinkStartTime == LinkEndTime;
  
  //if pairing is selected, all positions within it should also be selected
  	forall(pr in pairwithrest,s in SeqInd:pr.p.P_startPos<=s && s<=pr.prPos){
  		Association:isPairingSelected[pr]<=isPosSelected[s];
  	}  
  	
  	//sequencing of positions
  	forall(s in SeqInd:s<LinkLength){
  	  	DaySequence:isPosSelected[s]>=isPosSelected[s+1];
  	}
  
  	//each selected position in sequence should be covered by at least 1 pairing
  	forall(s in SeqInd){
  		DayCover:sum(pr in pairwithrest:pr.p.P_startPos<=s && s<=pr.prPos) isPairingSelected[pr]>=isPosSelected[s];
  	  	
  	}
  	  
  
  	//only 1 rest type should be chosen 
  	forall(p1 in pairings){
  		RestExclusivity:sum(pr in pairwithrest:pr.p.pairingId==p1.pairingId)  isPairingSelected[pr]<=1;
//  		sum(pr in pairwithrest:pr.p.pairingId==p1.pairingId)  isPairingSelected[pr]<=isPairSelected[p1];
    }  	  
  
  
  	//each leg should be selected 
  	forall(t1 in trainSegments){
  		SegmentCover:
  		sum(pr in pairwithrest,pd in pairingduties,dl in dutylegs:dl.leg.t.trainid==t1.trainid  
  		&& dl.leg.t.legid==t1.legid  && pd.duty.dutyId==dl.dutyid && pr.p.pairingId==pd.pairingid)  isPairingSelected[pr] >= 1;
    }
    
  	//LinkEndTime
  	forall(pr in pairwithrest){
  	  LinkEndTime>=pr.prEnd*isPairingSelected[pr];
  	  LinkStartTime<=(pr.p.P_signon+1440*(pr.p.P_startPos-1))*isPairingSelected[pr];}
  
	//No overlap
  	forall(seq in SeqInd){
		forall(pr in pairwithrest:pr.prPos==seq){
			NoOverlap1:
			isPairingSelected[pr]+sum(s in pairwithrest:s.p.P_startPos>=pr.prPos && pr.p.pairingId!=s.p.pairingId  && (s.p.P_signon+1440*(s.p.P_startPos-1))<=pr.prEnd) isPairingSelected[s] <= 1;//&& s.p.P_startPos>=seq && pr.p.pairingId<s.p.pairingId
	  	}  
	  	forall(pr in pairwithrest:pr.p.P_startPos==seq){
		  NoOverlap2:	  	
	  	  isPairingSelected[pr]+sum(s in pairwithrest:pr.p.pairingId!=s.p.pairingId  && s.p.P_startPos<=seq && s.prPos>seq && (pr.p.P_signon+1440*(pr.p.P_startPos-1))<=s.prEnd) isPairingSelected[s]<=1;
//	  	  isPairingSelected[pr]+sum(s in pairwithrest:pr.p.pairingId!=s.p.pairingId  && s.p.P_startPos<=seq && (pr.p.P_signon+1440*(pr.p.P_startPos-1))<=s.prEnd) isPairingSelected[s]<=1;
    	}	  	  
	}

	//NIB.. there should be 1 NIB every 'x' days
    forall(s in SeqInd:s+6<=LinkLength){
    	PeriodicRests:
    	sum(pr in pairwithrest: s<=pr.p.P_startPos && pr.prPos<s+7 && (pr.hrtype>=22)) pr.NIB*isPairingSelected[pr] >= 1;
//    	sum(pr in pairwithrest: s<=pr.p.P_startPos && pr.prPos<s+7 && (pr.hrtype==30 || pr.hrtype==22)) pr.NIB*isPairingSelected[pr] >= 1;
    } 

      
    //total duty hours in 14 days:alternate approach  	  
 	forall(s in SeqInd:s+13<=LinkLength){
 		MaxFortnightDuty: 	
 		sum(pr in pairwithrest: s<=pr.p.P_startPos && pr.prPos<s+14) pr.p.P_dutyduration*isPairingSelected[pr] <=totaldutyin14Days;
	}
	
	//continuous night duties
	forall(s in SeqInd:s+4<=LinkLength){
	  cumulativenights[s]==sum(d in duties,pr in pairwithrest, pd in pairingduties:s<=d.startPos && d.endPos<=s+4 && pd.pairingid==pr.p.pairingId && pd.duty.dutyId==d.dutyId)  d.nightflag*isPairingSelected[pr];
	  cumulativenights[s]<=4;
 	}	  
    
}//end of constraints

execute writeoutput{
 for(var  pr in pairwithrest){
  if(isPairingSelected[pr]==1){
    
    for(var pd in pairingduties){
    	if(pd.pairingid==pr.p.pairingId){
    	  	var legcount = 0;
    	  	
    	  	for(var dl in dutylegs){
    	  		if(dl.dutyid==pd.duty.dutyId){
    	  		  		legcount = legcount + 1;
	           }
            } 
            
            var tempcount = 0;              	  		  		
    	  	
    	  	for(var dl in dutylegs){
    	  		if(dl.dutyid==pd.duty.dutyId){
    	  		  		tempcount = tempcount + 1;
    	  		  		var dutyduration = pd.duty.dutysignoff + 1440*(pd.duty.endPos-1) - pd.duty.dutysignon - 1440*(pd.duty.startPos-1);
//						outlink.add(dl.leg.pos,pr.p.pairingId,pd.duty.dutyId,dl.leg.t.trainid,dl.leg.t.legid,dl.leg.t.startLoc,dl.leg.t.endLoc,pd.duty.dutysignon,dl.leg.t.start,dl.leg.t.end,pd.duty.dutysignoff,dutyduration,0);
						outlink.add(dl.leg.pos,dl.leg.pos,pr.p.pairingId,pd.duty.dutyId,dl.leg.t.trainid,dl.leg.t.legid,dl.leg.t.startLoc,dl.leg.t.endLoc,pd.duty.dutysignon,dl.leg.t.start,dl.leg.t.end,pd.duty.dutysignoff,dutyduration,0,dl.leg.t.spareflag,pr.p.P_startPos);
						
						//if a duty has more than 1 legs than
						if(legcount>1){
							if(tempcount==1){
								outputLink.add(dl.leg.pos,dl.leg.pos,
								trainMaster.get(dl.leg.t.trainid).trainNo,
								segmentMaster.get(dl.leg.t.legid).fromStation,
								segmentMaster.get(dl.leg.t.legid).toStation,
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).signontime,
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).startTime,
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).endTime,
								"C",
								dutyduration,
								trainSegments.get(dl.leg.t.trainid,dl.leg.t.legid).distance,
								0,
								pr.p.P_startPos,
								dl.leg.t.dayid,
								dl.leg.t.spareflag);
																							
							}	
							if(tempcount>1 && tempcount<legcount){
								outputLink.add(dl.leg.pos,dl.leg.pos,
								trainMaster.get(dl.leg.t.trainid).trainNo,
								segmentMaster.get(dl.leg.t.legid).fromStation,
								segmentMaster.get(dl.leg.t.legid).toStation,
								"C",
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).startTime,
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).endTime,
								"C",
								dutyduration,
								trainSegments.get(dl.leg.t.trainid,dl.leg.t.legid).distance,
								0,
								pr.p.P_startPos,
								dl.leg.t.dayid,
								dl.leg.t.spareflag);
														
							}	
							if(tempcount==legcount)
							{
								outputLink.add(dl.leg.pos,dl.leg.pos,
								trainMaster.get(dl.leg.t.trainid).trainNo,
								segmentMaster.get(dl.leg.t.legid).fromStation,
								segmentMaster.get(dl.leg.t.legid).toStation,
								"C",
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).startTime,
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).endTime,
								timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).signoffTime,
								dutyduration,
								trainSegments.get(dl.leg.t.trainid,dl.leg.t.legid).distance,
								0,
								pr.p.P_startPos,
								dl.leg.t.dayid,
								dl.leg.t.spareflag);
								
								totaldutyduration = totaldutyduration+ dutyduration;				
							}				
						}
						else
						{
							outputLink.add(dl.leg.pos,dl.leg.pos,
							trainMaster.get(dl.leg.t.trainid).trainNo,
							segmentMaster.get(dl.leg.t.legid).fromStation,
							segmentMaster.get(dl.leg.t.legid).toStation,
							timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).signontime,
							timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).startTime,
							timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).endTime,
							timetoMinutes.get(dl.leg.t.trainid,dl.leg.t.legid).signoffTime,
							dutyduration,
							trainSegments.get(dl.leg.t.trainid,dl.leg.t.legid).distance,
							0,
							pr.p.P_startPos,
							dl.leg.t.dayid,
							dl.leg.t.spareflag);
							
							totaldutyduration = totaldutyduration+ dutyduration;
         				}						        			
        			}    		 			
     			}    		  
   			}
    	}   			
   		//add rest into link
   		var restEnd = pr.prEnd - (pr.prPos-1)*1440;//- (pr.p.P_endPos-1)*1440;
   		var restDuration = pr.hrtype*60;//restEnd-pr.p.P_signoff;
   		var restRowStart = Opl.maxl((pr.p.P_signoff-1440),0);
// 		outlink.add(pr.prPos,pr.p.pairingId,0,0,0,0,0,0,0,0,0,restDuration,pr.NIB);
   		outlink.add(pr.prPos,pr.prPos,pr.p.pairingId,0,0,0,0,0,0,0,0,0,restDuration,pr.NIB,0,pr.p.P_startPos);
   		outputLink.add(pr.prPos,pr.prPos,"HQ Rest"," "," "," "," "," "," ",restDuration,0,pr.NIB,pr.p.P_startPos,dl.leg.t.dayid,dl.leg.t.spareflag);

 	}   
 }   
  
} 

/*execute calculateKPIs{

	var lastrest = 0;
	
	for(var s in trainSegments){
		totalinputKms = totalinputKms + s.distance;	
		totalInputduration = totalInputduration + (s.signoff-s.signon);
		totalinputrunning = totalinputrunning + (s.end-s.start);
	}
	
	noOfCrew=Opl.ceil(LinkEndTime/1440);
	totalCycleDays = Opl.ceil(LinkEndTime/1440);
	
	for(var o in outlink)
	{
		if(o.trainId>0){
		totalTrainRunningKms += trainSegments.get(o.trainId,o.legId).distance; 	
		totalrunningdutyminutes = totalrunningdutyminutes + (o.endTime - o.startTime);}
		totalNIB = totalNIB + o.nib;
		if(noOfCrew==o.seqId && o.dutyId==0) lastrest=o.duration;
	}
	
	spareDutyKms = (totalTrainRunningKms-totalinputKms);
	trainKmPerCrewPerDayWithoutPilotKms = (totalTrainRunningKms-spareDutyKms)/noOfCrew;
	trainKmPerCrewPerDayWithPilotKms = totalTrainRunningKms/noOfCrew;
	crewProductivityTrainKmperCrewPerDay = (totalTrainRunningKms-spareDutyKms)/noOfCrew;
	
	totalDutyHours = (totaldutyduration/60);
	noOfDutyHoursPerFortnight = 14*(totalDutyHours/totalCycleDays);//this requires totalDutyHours
	crewUtilizationCrewDutyHrsPerFortnight = 100*(noOfDutyHoursPerFortnight/96);//this requires noOfDutyHoursPerFortnight
	
	totalOutstationHours = (TotalOutRest/60);
	totalHomeStationRest = (totalHomeRest+lastrest)/60;//to be corrected
	totalTimeSpentBetweenVariousActivitiesInHrs = totalDutyHours + totalOutstationHours + totalHomeStationRest;
	
	percentageOfTimeSpentOnDuty = 100*(totalDutyHours/totalTimeSpentBetweenVariousActivitiesInHrs);
	percentageOfTimeSpentOnOutstationRest = 100*(totalOutstationHours/totalTimeSpentBetweenVariousActivitiesInHrs);
	percentageOfTimeSpentOnHomeStationRest = 100*(totalHomeStationRest/totalTimeSpentBetweenVariousActivitiesInHrs);
	
	noOfPeriodicRestsIn30Days = 30*(totalNIB/totalCycleDays);
	
	spareDutyHrs = (totaldutyduration - totalInputduration)/60;//later
	
	totalRunningDutyHrs = (totalinputrunning)/60;
	
	runningDutyHrsPerFortnight = 14*(totalRunningDutyHrs/totalCycleDays);
	
	linkKpis.add(totalTrainRunningKms-spareDutyKms,
   noOfCrew,
   crewProductivityTrainKmperCrewPerDay,
   crewUtilizationCrewDutyHrsPerFortnight,
   trainKmPerCrewPerDayWithoutPilotKms,
   trainKmPerCrewPerDayWithPilotKms,
   noOfDutyHoursPerFortnight,
   spareDutyKms,
   totalTimeSpentBetweenVariousActivitiesInHrs,
   totalDutyHours,
   totalOutstationHours,
   totalHomeStationRest,
   percentageOfTimeSpentOnDuty,
   percentageOfTimeSpentOnOutstationRest,
   percentageOfTimeSpentOnHomeStationRest,
   noOfPeriodicRestsIn30Days,
   totalCycleDays,
   totalRunningDutyHrs,
   spareDutyHrs,
   runningDutyHrsPerFortnight);
}

*/