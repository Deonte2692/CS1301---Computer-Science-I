package edu.westga.cs1301.weather.model;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Represents one day's weather report for a city
 * 
 * @author lewisb
 * @version Fall 2022
 */
public class DailyReport implements Comparable<DailyReport> {
	private String city;
	private LocalDate date;
	private int highTempF;
	private int lowTempF;
	
	/**
	 * Creates a report for the given city and day.
	 * 
	 * @precondition city != null AND !city.isEmpty() AND date != null AND
	 * 	highTempF >= -460 AND lowTempF >= -460 AND lowTempF <= hiTempF
	 * 
	 * @postcondition
	 * 		city==getCity() AND
	 * 		date==getDate() AND
	 * 		highTempF==getHighTempF() AND
	 * 		lowTempF==getLowTempF()
	 * 
	 * @param city the city where the temperatures were recorded
	 * @param date the date the temperatures were recorded
	 * @param highTempF the high temperature, in F, for the day
	 * @param lowTempF the low temperature, in F, for the day
	 */
	public DailyReport(String city, LocalDate date, int highTempF, int lowTempF) {
		Utils.validate(city != null, "city can not be null");
		Utils.validate(!city.isEmpty(), "city can not be empty");
		Utils.validate(date != null, "date can not be null");
		Utils.validate(highTempF >= -460, "invalid high temp");
		Utils.validate(lowTempF >= -460, "invalid low temp");
		Utils.validate(lowTempF <= highTempF, "lowTempF must be <= highTempF");
		
		this.city = city;
		this.date = date;
		this.highTempF = highTempF;
		this.lowTempF = lowTempF;
	}
	
	

	/**
	 * Gets the highTempF
	 * @precondition none
	 * @postcondition none
	 * @return the highTempF
	 */
	public int getHighTempF() {
		return this.highTempF;
	}



	/**
	 * Sets the highTempF
	 * @precondition highTempF >= 460 AND highTempF >= getLowTempF()
	 * @postcondition highTempF==gethighTempF()
	 * @param highTempF the highTempF to set
	 */
	public void setHighTempF(int highTempF) {
		Utils.validate(highTempF >= -460, "invalid high temp");
		Utils.validate(this.lowTempF <= highTempF, "lowTempF must be <= highTempF");
		this.highTempF = highTempF;
	}



	/**
	 * Gets the lowTempF
	 * @precondition none
	 * @postcondition none
	 * @return the lowTempF
	 */
	public int getLowTempF() {
		return this.lowTempF;
	}



	/**
	 * Sets the lowTempF
	 * @precondition lowTempF >= -460 AND lowTempF <= getHighTempF()
	 * @postcondition lowTempF==getlowTempF()
	 * @param lowTempF the lowTempF to set
	 */
	public void setLowTempF(int lowTempF) {
		Utils.validate(lowTempF >= -460, "invalid low temp");
		Utils.validate(lowTempF <= this.highTempF, "lowTempF must be <= highTempF");
		this.lowTempF = lowTempF;
	}



	/**
	 * Gets the city
	 * @precondition none
	 * @postcondition none
	 * @return the city
	 */
	public String getCity() {
		return this.city;
	}



	/**
	 * Gets the date
	 * @precondition none
	 * @postcondition none
	 * @return the date
	 */
	public LocalDate getDate() {
		return this.date;
	}


	@Override
	public int compareTo(DailyReport other) {
		// TODO Auto-generated method stub
		return this.date.compareTo(other.date);
	}
	
	@Override
	public String toString() {
		String result = this.getDate().toString();
		result += " @" + this.getCity();
		result += ": high=" + this.highTempF + "F";
		result += ": low=" + this.lowTempF + "F";
		return result;
	}
}
