package edu.westga.cs1301.weather.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a collection of DailyReport objects.
 * 
 * @author lewisb
 * @version Fall 2022
 */
public class WeatherHistory {
	private ArrayList<DailyReport> reports;
	
	/**
	 * Creates an empty WeatherHistory
	 * 
	 * @precondition none
	 * @postcondition size()==0
	 */
	public WeatherHistory() {
		this.reports = new ArrayList<DailyReport>();
	}
	
	/**
	 * The number of DailyReport items in this history.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return The number of DailyReport items in this history.
	 */
	public int size() {
		return this.reports.size();
	}
	
	/**
	 * Gets a string containing information about every
	 * DailyReport object, one per line.
	 * 
	 * @return information on all DailyReport's
	 */
	public String index() {
		String result = "";
		Collections.sort(this.reports);
		for (int i = 0; i < this.size(); i++) {
			DailyReport report = this.reports.get(i);
			result += "[" + i + "] " + report.toString() + System.lineSeparator();
		}
		return result;
	}
	
	/**
	 * Adds a report to this history.
	 * 
	 * @precondition report != null
	 * @postcondition the report has been added
	 * 
	 * @param report the DailyReport to add
	 */
	public void add(DailyReport report) {
		Utils.validate(report != null, "report can not be null");
		this.reports.add(report);
	}
	
	/**
	 * Deletes a report from this history.
	 * 
	 * @precondition report != null
	 * @postcondition the report has been removed
	 * @param report the report to delete
	 */
	public void delete(DailyReport report) {
		Utils.validate(report != null, "report can not be null");
		this.reports.remove(report);
	}
	
	/**
	 * Gets a report from the history
	 * 
	 * @precondition 0 <= index < size()
	 * @postcondition none
	 * 
	 * @param index the index of the report
	 * @return the report at that index
	 */
	public DailyReport get(int index) {
		Utils.validate(0 <= index && index < this.size(), "invalid index");
		return this.reports.get(index);
	}
}
