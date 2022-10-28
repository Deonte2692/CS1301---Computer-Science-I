package edu.westga.cs1301.project2.model;


/**
 * Models an alarm clock that can set time and alarm.
 * 
 * @author	CS1301
 * @version	Fall 2022
 *
 */
public class DigitalClock {

	public static final int HOUR_MAX = 23;
	public static final int HOUR_MIN = 0;
	public static final int MINUTES_MAX = 59;  
	public static final int MINUTES_MIN = 0;
	public static final int HOURS_IN_A_DAY = 24;
	public static final int MINUTES_IN_A_HOUR = 60;
	public static final int SECONDS_IN_A_HOUR = 3600;
	public static final int SECONDS_IN_A_MINUTE = 60;
	public static final int CANNOT_BE_ZERO = 0;

	
	private int hour;
	private int minutes;
	private int seconds;
	private boolean alarmOn = false;
	private int alarmHours;
	private int alarmMins;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	/**
	 * Creates a new digital clock with the time set at the given  
	 * hours and minutes.
	 * 
	 * @precondition 0 <= hour <= 23 AND 0 <= minutes <= 59
	 * @postcondition getHour()==hour AND getMinutes()==minutes
	 * 
	 * @param hour the hour to set for the time
	 * @param minutes the minutes to set for the time
	 */

	
	public DigitalClock(int hour, int minutes){
		if ((hour < DigitalClock.HOUR_MIN) || (hour > DigitalClock.HOUR_MAX)){
			throw new IllegalArgumentException("Hour must be >= 0 and <= 23");
		}
		else if ((minutes < DigitalClock.MINUTES_MIN) || (minutes > DigitalClock.MINUTES_MAX)){
			throw new IllegalArgumentException("Minutes must be >= 0 and <= 59");
		}
		else {
			setHour(hour);
			setMinutes(minutes);
			setSeconds(0);
		}
	}
	
	/**
	 * Advances the entire clock by the given number of hours. 
	 * If the hours advances past 23 they wrap around.
	 * 
	 * @precondition hours >= 0
	 * @postcondition  the clock has moved forward 
	 * 	by the appropriate number of hours
	 * 
	 * @param hours the number of hours to add
	 */

	public void incrementHoursBy(int hours){
		if (hours < DigitalClock.CANNOT_BE_ZERO){
			throw new IllegalArgumentException("Hours must be >= 0");
		}
		else {
			this.hour = (this.hour + hours)%DigitalClock.HOURS_IN_A_DAY; 
		}
		
	}
	

/**
 * Advances the entire clock by the given number of minutes
 * 
 * @precondition minutes >= 0
 * @postcondition  the clock has moved forward by the appropriate 
 * 	number of minutes
 * 
 * @param minutes the number of minutes to add
 */

	public void incrementMinutesBy(int minutes){
		if (minutes < DigitalClock.CANNOT_BE_ZERO){
			throw new IllegalArgumentException("Minutes must be >= 0");
		}
		else {
			this.hour = (this.minutes + minutes)/DigitalClock.MINUTES_IN_A_HOUR + this.hour;
			this.minutes = (this.minutes + minutes)%DigitalClock.MINUTES_IN_A_HOUR; 
		}
		
	}
	
	/**
	 * Advances the entire clock by the given number of seconds
	 * 
	 * @precondition seconds >= 0
	 * @postcondition  the clock has moved forward by the appropriate 
	 * 	number of seconds
	 * 
	 * @param seconds the number of seconds to add
	 */
	
	public void incrementSecondsBy(int seconds){
		if (seconds < DigitalClock.CANNOT_BE_ZERO){
			throw new IllegalArgumentException("seconds must be >= 0");
		}
		else {
			incrementMinutesBy((this.seconds + seconds)/DigitalClock.SECONDS_IN_A_MINUTE); 
			this.seconds = (this.seconds + seconds)%DigitalClock.SECONDS_IN_A_MINUTE;
		}
		
	}
	
	


/**
 * Calculates the minutes since the given time.
 * 
 * @precondition 0 <= hour <= 23 AND 0 <= minutes <= 59
 * @postcondition the alarm has been set
 * 
 * @param hours an hour
 * @param minutes some number of minutes
 * @return the minutes since the given time; 
 *	will not be greater than 1 day's worth of minutes.
 */

	public int minutesSince(int hours, int minutes){
		if ((hours < DigitalClock.HOUR_MIN) || (hours > DigitalClock.HOUR_MAX)){
			throw new IllegalArgumentException("Hour must be >= 0 and <= 23");
		}
		else if ((minutes < DigitalClock.MINUTES_MIN) || (minutes > DigitalClock.MINUTES_MAX)){
			throw new IllegalArgumentException("Minutes must be >= 0 and <= 59");
		}
		int currentHours = this.getHour();
		int currentMinutes = this.getMinutes();
		
		if (currentHours < hours){ 
			int hourDifference = currentHours - hours + DigitalClock.HOURS_IN_A_DAY;
			int minDifference = currentMinutes - minutes;
			int hourToMins = hourDifference * DigitalClock.MINUTES_IN_A_HOUR;
			int minutesSince = hourToMins + minDifference;
			return minutesSince;
		}
		
		else if ((currentHours == hours)&&(currentMinutes < minutes )){
			int hourDifference = currentHours - hours + DigitalClock.HOURS_IN_A_DAY;
			int minDifference =  currentMinutes - minutes;
			int hourToMins = hourDifference * DigitalClock.MINUTES_IN_A_HOUR;
			int minutesSince = hourToMins + minDifference;
			return minutesSince;
		}
		else {
			int hourDifference = currentHours - hours;
			int minDifference = currentMinutes - minutes;
			int hourToMins = hourDifference * DigitalClock.MINUTES_IN_A_HOUR;
			int minutesSince = hourToMins + minDifference;
			return minutesSince;
		}
		
		
}

	
	/**
	 * Sets (and turns on) an alarm for the given time
	 * 
	 * @precondition 0 <= hour <= 23 AND 0 <= minutes <= 59
	 * @postcondition 
	 * 
	 * @param hour an hour
	 * @param minutes some number of minutes
	 */
	
	public void setAlarmFor(int hour, int minutes){
		if ((hour < DigitalClock.HOUR_MIN) || (hour > DigitalClock.HOUR_MAX)){
			throw new IllegalArgumentException("Hour must be >= 0 and <= 23");
		}
		else if ((minutes < DigitalClock.MINUTES_MIN) || (minutes > DigitalClock.MINUTES_MAX)){
			throw new IllegalArgumentException("Minutes must be >= 0 and <= 59");
		}
		else {
			alarmOn = true;
			alarmHours = hour;
			alarmMins = minutes;
		}
	}
	
	/**
	 *  turns off the alarm (even if it is not currently ringing)
	 * 
	 * @precondition  Alarm must be on
	 * @postcondition
	 * 
	 */
	public void turnOffAlarm(){
		if (alarmOn == false) {
			throw new IllegalArgumentException("Alarm must be on to be turned off.");
		}
		else {
			alarmOn = false;
		}
	}
	
	/**
	 * turns the alarm back on
	 * 
	 * @precondition  
	 * @postcondition
	 * 
	 */
	public void turnOnAlarm(){
		
			alarmOn = true;
		
	}
	
	
	/**
	 * returns true if the alarm is on and it is no more than two hours 
	 * (including rollover at midnight) past the alarm time.
	 * 
	 * @precondition  Alarm must be on and two hours must have not passed since the alarm time.
	 * @postcondition
	 * 
	 * @return if the alarm is ringing or not.
	 */
	public boolean isAlarmRinging(){
		if (alarmOn == false) {
			return false;
		}
		int currentHour = getHour();
		int currentMin = getMinutes();
		int hourDifference = (currentHour - alarmHours)*60;
		int fullDifference = (currentMin - alarmMins + hourDifference)/60;
		 if (fullDifference >= 2){
			return false;
		}
		 
		 else if (currentHour < alarmHours) {
			 return false;
		 }
		 
		 else if ((currentHour == alarmHours)&&(currentMin < alarmMins)) {
			 return false;
		 }
		 else {
			 return true; 
		 }
	}
}