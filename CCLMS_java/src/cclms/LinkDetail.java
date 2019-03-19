/*
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cclms;

import ilog.odm.dom.IloDomObject;

import java.sql.Time;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @extends IloDomObject
 * @generated
 */
public interface LinkDetail extends IloDomObject {
	/**
	 * Returns the value of the '<em><b>Crew No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew No</em>' attribute.
	 * @see #isSetCrewNo()
	 * @see #unsetCrewNo()
	 * @see #setCrewNo(int)
	 * @generated
	 */
	int getCrewNo();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getCrewNo <em>Crew No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew No</em>' attribute.
	 * @see #isSetCrewNo()
	 * @see #unsetCrewNo()
	 * @see #getCrewNo()
	 * @generated
	 */
	void setCrewNo(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getCrewNo <em>Crew No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrewNo()
	 * @see #getCrewNo()
	 * @see #setCrewNo(int)
	 * @generated
	 */
	void unsetCrewNo();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getCrewNo <em>Crew No</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crew No</em>' attribute is set.
	 * @see #unsetCrewNo()
	 * @see #getCrewNo()
	 * @see #setCrewNo(int)
	 * @generated
	 */
	boolean isSetCrewNo();

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #isSetDay()
	 * @see #unsetDay()
	 * @see #setDay(int)
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #isSetDay()
	 * @see #unsetDay()
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDay()
	 * @see #getDay()
	 * @see #setDay(int)
	 * @generated
	 */
	void unsetDay();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getDay <em>Day</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Day</em>' attribute is set.
	 * @see #unsetDay()
	 * @see #getDay()
	 * @see #setDay(int)
	 * @generated
	 */
	boolean isSetDay();

	/**
	 * Returns the value of the '<em><b>Sign On Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign On Time</em>' attribute.
	 * @see #setSignOnTime(Time)
	 * @generated
	 */
	Time getSignOnTime();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getSignOnTime <em>Sign On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign On Time</em>' attribute.
	 * @see #getSignOnTime()
	 * @generated
	 */
	void setSignOnTime(Time value);

	/**
	 * Returns the value of the '<em><b>Departure Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departure Time</em>' attribute.
	 * @see #setDepartureTime(Time)
	 * @generated
	 */
	Time getDepartureTime();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getDepartureTime <em>Departure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Time</em>' attribute.
	 * @see #getDepartureTime()
	 * @generated
	 */
	void setDepartureTime(Time value);

	/**
	 * Returns the value of the '<em><b>Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Time</em>' attribute.
	 * @see #setArrivalTime(Time)
	 * @generated
	 */
	Time getArrivalTime();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getArrivalTime <em>Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Time</em>' attribute.
	 * @see #getArrivalTime()
	 * @generated
	 */
	void setArrivalTime(Time value);

	/**
	 * Returns the value of the '<em><b>Sign Off Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Off Time</em>' attribute.
	 * @see #setSignOffTime(Time)
	 * @generated
	 */
	Time getSignOffTime();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getSignOffTime <em>Sign Off Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Off Time</em>' attribute.
	 * @see #getSignOffTime()
	 * @generated
	 */
	void setSignOffTime(Time value);

	/**
	 * Returns the value of the '<em><b>Os Allowance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Allowance</em>' attribute.
	 * @see #isSetOsAllowance()
	 * @see #unsetOsAllowance()
	 * @see #setOsAllowance(int)
	 * @generated
	 */
	int getOsAllowance();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getOsAllowance <em>Os Allowance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Allowance</em>' attribute.
	 * @see #isSetOsAllowance()
	 * @see #unsetOsAllowance()
	 * @see #getOsAllowance()
	 * @generated
	 */
	void setOsAllowance(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getOsAllowance <em>Os Allowance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOsAllowance()
	 * @see #getOsAllowance()
	 * @see #setOsAllowance(int)
	 * @generated
	 */
	void unsetOsAllowance();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getOsAllowance <em>Os Allowance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Os Allowance</em>' attribute is set.
	 * @see #unsetOsAllowance()
	 * @see #getOsAllowance()
	 * @see #setOsAllowance(int)
	 * @generated
	 */
	boolean isSetOsAllowance();

	/**
	 * Returns the value of the '<em><b>Earned Km</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earned Km</em>' attribute.
	 * @see #isSetEarnedKm()
	 * @see #unsetEarnedKm()
	 * @see #setEarnedKm(double)
	 * @generated
	 */
	double getEarnedKm();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getEarnedKm <em>Earned Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earned Km</em>' attribute.
	 * @see #isSetEarnedKm()
	 * @see #unsetEarnedKm()
	 * @see #getEarnedKm()
	 * @generated
	 */
	void setEarnedKm(double value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getEarnedKm <em>Earned Km</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEarnedKm()
	 * @see #getEarnedKm()
	 * @see #setEarnedKm(double)
	 * @generated
	 */
	void unsetEarnedKm();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getEarnedKm <em>Earned Km</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Earned Km</em>' attribute is set.
	 * @see #unsetEarnedKm()
	 * @see #getEarnedKm()
	 * @see #setEarnedKm(double)
	 * @generated
	 */
	boolean isSetEarnedKm();

	/**
	 * Returns the value of the '<em><b>Periodic Rest Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic Rest Flag</em>' attribute.
	 * @see #setPeriodicRestFlag(String)
	 * @generated
	 */
	String getPeriodicRestFlag();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getPeriodicRestFlag <em>Periodic Rest Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic Rest Flag</em>' attribute.
	 * @see #getPeriodicRestFlag()
	 * @generated
	 */
	void setPeriodicRestFlag(String value);

	/**
	 * Returns the value of the '<em><b>Spare Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spare Flag</em>' attribute.
	 * @see #setSpareFlag(String)
	 * @generated
	 */
	String getSpareFlag();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getSpareFlag <em>Spare Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spare Flag</em>' attribute.
	 * @see #getSpareFlag()
	 * @generated
	 */
	void setSpareFlag(String value);

	/**
	 * Returns the value of the '<em><b>Night Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Night Flag</em>' attribute.
	 * @see #setNightFlag(String)
	 * @generated
	 */
	String getNightFlag();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getNightFlag <em>Night Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Night Flag</em>' attribute.
	 * @see #getNightFlag()
	 * @generated
	 */
	void setNightFlag(String value);

	/**
	 * Returns the value of the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Order</em>' attribute.
	 * @see #isSetSortOrder()
	 * @see #unsetSortOrder()
	 * @see #setSortOrder(int)
	 * @generated
	 */
	int getSortOrder();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getSortOrder <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Order</em>' attribute.
	 * @see #isSetSortOrder()
	 * @see #unsetSortOrder()
	 * @see #getSortOrder()
	 * @generated
	 */
	void setSortOrder(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getSortOrder <em>Sort Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortOrder()
	 * @see #getSortOrder()
	 * @see #setSortOrder(int)
	 * @generated
	 */
	void unsetSortOrder();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getSortOrder <em>Sort Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Order</em>' attribute is set.
	 * @see #unsetSortOrder()
	 * @see #getSortOrder()
	 * @see #setSortOrder(int)
	 * @generated
	 */
	boolean isSetSortOrder();

	/**
	 * Returns the value of the '<em><b>Duty Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duty Duration</em>' attribute.
	 * @see #isSetDutyDuration()
	 * @see #unsetDutyDuration()
	 * @see #setDutyDuration(int)
	 * @generated
	 */
	int getDutyDuration();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getDutyDuration <em>Duty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duty Duration</em>' attribute.
	 * @see #isSetDutyDuration()
	 * @see #unsetDutyDuration()
	 * @see #getDutyDuration()
	 * @generated
	 */
	void setDutyDuration(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getDutyDuration <em>Duty Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDutyDuration()
	 * @see #getDutyDuration()
	 * @see #setDutyDuration(int)
	 * @generated
	 */
	void unsetDutyDuration();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getDutyDuration <em>Duty Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duty Duration</em>' attribute is set.
	 * @see #unsetDutyDuration()
	 * @see #getDutyDuration()
	 * @see #setDutyDuration(int)
	 * @generated
	 */
	boolean isSetDutyDuration();

	/**
	 * Returns the value of the '<em><b>Running Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Duration</em>' attribute.
	 * @see #isSetRunningDuration()
	 * @see #unsetRunningDuration()
	 * @see #setRunningDuration(int)
	 * @generated
	 */
	int getRunningDuration();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getRunningDuration <em>Running Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Duration</em>' attribute.
	 * @see #isSetRunningDuration()
	 * @see #unsetRunningDuration()
	 * @see #getRunningDuration()
	 * @generated
	 */
	void setRunningDuration(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getRunningDuration <em>Running Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRunningDuration()
	 * @see #getRunningDuration()
	 * @see #setRunningDuration(int)
	 * @generated
	 */
	void unsetRunningDuration();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getRunningDuration <em>Running Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Running Duration</em>' attribute is set.
	 * @see #unsetRunningDuration()
	 * @see #getRunningDuration()
	 * @see #setRunningDuration(int)
	 * @generated
	 */
	boolean isSetRunningDuration();

	/**
	 * Returns the value of the '<em><b>Hq Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hq Rest</em>' attribute.
	 * @see #isSetHqRest()
	 * @see #unsetHqRest()
	 * @see #setHqRest(int)
	 * @generated
	 */
	int getHqRest();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getHqRest <em>Hq Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hq Rest</em>' attribute.
	 * @see #isSetHqRest()
	 * @see #unsetHqRest()
	 * @see #getHqRest()
	 * @generated
	 */
	void setHqRest(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getHqRest <em>Hq Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHqRest()
	 * @see #getHqRest()
	 * @see #setHqRest(int)
	 * @generated
	 */
	void unsetHqRest();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getHqRest <em>Hq Rest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hq Rest</em>' attribute is set.
	 * @see #unsetHqRest()
	 * @see #getHqRest()
	 * @see #setHqRest(int)
	 * @generated
	 */
	boolean isSetHqRest();

	/**
	 * Returns the value of the '<em><b>Os Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Rest</em>' attribute.
	 * @see #isSetOsRest()
	 * @see #unsetOsRest()
	 * @see #setOsRest(int)
	 * @generated
	 */
	int getOsRest();

	/**
	 * Sets the value of the '{@link cclms.LinkDetail#getOsRest <em>Os Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Rest</em>' attribute.
	 * @see #isSetOsRest()
	 * @see #unsetOsRest()
	 * @see #getOsRest()
	 * @generated
	 */
	void setOsRest(int value);

	/**
	 * Unsets the value of the '{@link cclms.LinkDetail#getOsRest <em>Os Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOsRest()
	 * @see #getOsRest()
	 * @see #setOsRest(int)
	 * @generated
	 */
	void unsetOsRest();

	/**
	 * Returns whether the value of the '{@link cclms.LinkDetail#getOsRest <em>Os Rest</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Os Rest</em>' attribute is set.
	 * @see #unsetOsRest()
	 * @see #getOsRest()
	 * @see #setOsRest(int)
	 * @generated
	 */
	boolean isSetOsRest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getFromStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setFromStn(StationMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkMst getLinkId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setLinkId(LinkMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationMst getToStn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setToStn(StationMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainMst getTrainId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setTrainId(TrainMst obj);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclmsCollector getCollector();

} // LinkDetail
