package edu.westga.cs1301.project2.views;

import edu.westga.cs1301.project2.model.DigitalClock;

/**
 * Class with methods for formatting the time from an AlarmClock object
 * 
 * @author	CS1301
 * @version	Fall 2022
 *
 */
public class DigitalClockFormatter {

	private static final String O_CLOCK_SUFFIX = " o'clock";
	private static final String MINUTES_TILL_SUFFIX = "-till";
	private static final String MINUTES_PAST_SUFFIX = "-past";
	private static final String QUARTER_TILL_PHRASE = "Quarter-till";
	private static final String HALF_PAST_PHRASE = "Half-past";
	private static final String QUARTER_PAST_PHRASE = "Quarter-past";
	private static final String ON_THE_HOUR_PHRASE = "On-the-hour";
	private static final int QUARTER_TILL_MINUTES = 45;
	private static final int HALF_PAST_MINUTES = 30;
	private static final int QUARTER_PAST_MINUTES = 15;
	private static final int ON_THE_HOUR_MINUTES = 0;
	private static final String ZERO_PADDING = "0";
	private static final int NORMALIZED_HOUR_MAX = 12;
	private static final String PM = "PM";
	private static final String AM = "AM";
	private static final String HOURS_BAR_BASELINE = "============";
	private static final String HOURS_BAR_PREFIX = "H:";
	private static final String MINUTES_BAR_1S_BASELINE = ".........";
	private static final String MINUTES_BAR_5S_BASELINE = "############";
	private static final String MINUTES_BAR_PREFIX = "M:";

	/**
	 * Creates a new AlarmClockFormatter.
	 */
	public DigitalClockFormatter() {
		
	}
	
	/**
	 * Returns "AM" or "PM" depending on the clock time.
	 * 
	 * @precondition clock != null
	 * @postcondition none
	 * 
	 * @param clock the clock
	 * @return "AM" if the time is in the morning (between midnight and 11:59), "PM" otherwise
	 */
	public String findAmVsPm(DigitalClock clock) {
		if(clock == null){
			throw new IllegalArgumentException("Clock cannot be null.");
		}
		else if (clock.getHour() < DigitalClockFormatter.NORMALIZED_HOUR_MAX) {
			return DigitalClockFormatter.AM;
		}
		else {
			return DigitalClockFormatter.PM;
		}
	}

	/**
	 * Given an hour between 0 and 23 (from 24-hour format),
	 * convert it to an hour appropriate for 12-hour format
	 * 
	 * @precondition 0 <= hour <= 23
	 * @postcondition none
	 * 
	 * @param hour the hour, in 24-hour format
	 * @return an hour between 1 and 12, as appropriate
	 */
	public int findNormalizedHour(int hour) {
		if((hour < DigitalClock.HOUR_MIN) || (hour > DigitalClock.HOUR_MAX)){
			throw new IllegalArgumentException("Hour must be >= 0 and <= 23");
		}
		else if(hour > DigitalClockFormatter.NORMALIZED_HOUR_MAX){
			return hour-DigitalClockFormatter.NORMALIZED_HOUR_MAX;
		}
		else if(hour == DigitalClock.CANNOT_BE_ZERO){
			return 12;
		}
		else {
			return hour;
		}
	}
	
	/**
	 * Formats the time one of the following ways:
	 * "On-the-hour" (if the minutes is 0)
	 * "Quarter-past" (if the minutes is 15)
	 * "Half-past" (if the minutes is 30)
	 * "Quarter-till" (if the minutes is 45)
	 * "23-past" (if the minutes is less-than-30 but not 15)
	 * "10-till" (60-minutes, if the minutes is greater-than-30, but not 45)
	 * 
	 * For the last two cases, use the actual number 
	 * of minutes to calculate the result.
	 * 
	 * @precondition clock != null
	 * @postcondition none
	 * 
	 * @param clock the clock to format
	 * @return a string as described above
	 */

	public String formatMinutesInInformalStyle(DigitalClock clock){
		if (clock == null){
			throw new IllegalArgumentException("Clock cannot be null.");
		}
		int minutes = clock.getMinutes();
		 if (minutes == DigitalClockFormatter.ON_THE_HOUR_MINUTES){
			return DigitalClockFormatter.ON_THE_HOUR_PHRASE;
		}
		
		else if (minutes == DigitalClockFormatter.QUARTER_PAST_MINUTES){
			return DigitalClockFormatter.QUARTER_PAST_PHRASE;
		}
		
		else if (minutes == DigitalClockFormatter.HALF_PAST_MINUTES){
			return DigitalClockFormatter.HALF_PAST_PHRASE;
		}
		
		else if (minutes == DigitalClockFormatter.QUARTER_TILL_MINUTES){
			return DigitalClockFormatter.QUARTER_TILL_PHRASE;
		}
		
		else if ((minutes < DigitalClockFormatter.HALF_PAST_MINUTES)&&(minutes != DigitalClockFormatter.QUARTER_PAST_MINUTES)){
			int timeLeft = minutes-60 + 60;
			String timeLeftString = timeLeft + "";
			return timeLeftString + DigitalClockFormatter.MINUTES_PAST_SUFFIX;
		}
		
		else if ((minutes > DigitalClockFormatter.HALF_PAST_MINUTES)&&(minutes != DigitalClockFormatter.QUARTER_TILL_MINUTES)){
			int timeLeft = 60 - minutes;
			String timeLeftString = timeLeft + "";
			return timeLeftString + DigitalClockFormatter.MINUTES_TILL_SUFFIX;
		}
		else {
			return null;
		}
	}
	

	/**
	 * Creates and returns a 2-line string that represents a clock's time as elongated bars.
	 * The first line is "H:" followed by one '=' character for every hour. 
	 * The second line is "M:" followed by one '#' (hash mark) for every 5 minutes, followed by one '.' (period) character for every remaining minute.
	 * 
	 * 
	 * @precondition clock != null
	 * @postcondition none
	 * 
	 * @param clock the clock to format
	 * @return a 2 line string as described above
	 */
	
	public String formatBarClock(DigitalClock clock){
		if (clock == null){
			throw new IllegalArgumentException("Clock cannot be null.");
		}
		int minutes = clock.getMinutes();
		int fiveMinCount = 0;
		String minString = "";
		for(int i = minutes; i/5 > 0; i-=5) {
			minString = minString + "#";
			fiveMinCount = fiveMinCount + 1;
		}
		int remainderMins = minutes - (fiveMinCount * 5);
		
		for(int i = remainderMins; i > 0; i--){
			minString = minString + ".";
		}
		
		int hours = clock.getHour();
		int NormHours = findNormalizedHour(hours);
		String hourString = "";
	
		for(int i = NormHours; i > 0; i--){
			hourString = hourString + "=";
		}
		
		String minPreString = DigitalClockFormatter.MINUTES_BAR_PREFIX + minString;
		String hourPreString = DigitalClockFormatter.HOURS_BAR_PREFIX + hourString;
		String time = findAmVsPm(clock);
		
		return hourPreString + "\n" + minPreString + "\n" + time;
	}
	
	
	/**
	 * 
	 * Method that returns the entire time (hours and minutes) formatted in a friendly human-readable form.
	 * 
	 * 
	 * @precondition clock != null
	 * @postcondition none
	 * 
	 * @param clock the clock to format
	 * @return a string that tells time in a human friendly way. 
	 */
	
	public String formatTimeForScreenReader(DigitalClock clock){
		if (clock == null){
			throw new IllegalArgumentException("Clock cannot be null.");
		}
		int minutes = clock.getMinutes();
		int hours = clock.getHour();
		int stringHours = findNormalizedHour(hours);
		
		if (minutes == 0){
			return stringHours + "" + DigitalClockFormatter.O_CLOCK_SUFFIX;
		}
		
		else if (minutes == 15){
			return DigitalClockFormatter.QUARTER_PAST_PHRASE + " " + stringHours;
		}
		else if (minutes == 30){
			return DigitalClockFormatter.HALF_PAST_PHRASE + " " + stringHours;
		}
		
		else if (minutes == 45){
			return DigitalClockFormatter.QUARTER_TILL_PHRASE + " " + (stringHours + 1);
		}
		
		else if ((minutes < DigitalClockFormatter.HALF_PAST_MINUTES)&&(minutes != DigitalClockFormatter.QUARTER_PAST_MINUTES)){
			
			return minutes + DigitalClockFormatter.MINUTES_PAST_SUFFIX + " " + stringHours;
		}
		
		else if ((minutes > DigitalClockFormatter.HALF_PAST_MINUTES)&&(minutes != DigitalClockFormatter.QUARTER_TILL_MINUTES)){
			int timeLeft = 60 - minutes;
			return timeLeft + DigitalClockFormatter.MINUTES_TILL_SUFFIX + " " + (stringHours + 1);
		}
		else{
			return null;
		}
	}

	

	
}
