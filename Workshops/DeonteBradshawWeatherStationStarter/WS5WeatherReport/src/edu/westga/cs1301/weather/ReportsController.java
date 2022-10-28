package edu.westga.cs1301.weather;

import java.time.LocalDate;
import java.util.Scanner;

import edu.westga.cs1301.weather.model.DailyReport;
import edu.westga.cs1301.weather.model.WeatherHistory;

/**
 * Main program logic for the application.
 * 
 * @author lewisb
 * @version Fall 2022
 */
public class ReportsController {

	private WeatherHistory theWeatherHistory;
	private Scanner keyboard;
	
	/**
	 * Creates a new reports controller
	 */
	public ReportsController() {
		this.theWeatherHistory = new WeatherHistory();
		this.keyboard = new Scanner(System.in);
		
		LocalDate date1 = LocalDate.of(2022, 6, 15);
		DailyReport Report1 = new DailyReport("Atlanta", date1, 98, 72);
		this.theWeatherHistory.add(Report1);
		
		
		LocalDate date2 = LocalDate.of(2022, 6, 15);
		DailyReport Report2 = new DailyReport("Augusta", date2, 85, 80);
		this.theWeatherHistory.add(Report2);
		
		
		LocalDate date3 = LocalDate.of(2022, 6, 15);
		DailyReport Report3 = new DailyReport("Valdosta", date3, 95, 60);
		this.theWeatherHistory.add(Report3);
	}
	
	
	
	/**
	 * The main program loop
	 */
	public void start() {
		boolean done = false;
		while(!done) {
			
			System.out.println("Enter Command (LIST, ADD, EDIT, DELETE, or QUIT)");
			String command = this.keyboard.next().toUpperCase();
			switch(command) {
			case "LIST":
				this.printDailyReports();
				break;
			case "ADD":
				this.addDailyReport();
				break;
			case "DELETE":
				this.deleteDailyReport();
				break;
			case "EDIT":
				this.editDailyReport();
				break;
			case "QUIT":
				done = true;
				break;
			}
		}
		this.keyboard.close();
		System.out.println("Bye!");
	}

	private void editDailyReport() {
		this.printDailyReports();
		System.out.println("Which daily report would you like to edit?");
		int index = this.keyboard.nextInt();
		DailyReport report = this.theWeatherHistory.get(index);
		System.out.println("Enter new high temperature in Fahrenheit:");
		int highTemp = this.keyboard.nextInt();
		System.out.println("Enter new low temperature in Fahrenheit:");
		int lowTemp = this.keyboard.nextInt();
		report.setHighTempF(highTemp);
		report.setLowTempF(lowTemp);
		this.printDailyReports();

	}

	private void deleteDailyReport() {
		this.printDailyReports();
		System.out.println("Enter the index of the daily report to delete.");
		int index = this.keyboard.nextInt();
		DailyReport report = this.theWeatherHistory.get(index);
		this.theWeatherHistory.delete(report);
		this.printDailyReports();

	}

	private void addDailyReport() {
		System.out.println("ADDING DAILY REPORT");
		System.out.println("Enter City:");
		String city = this.keyboard.next();
		
		System.out.println("Enter Month [1-12]:");
		int month = this.keyboard.nextInt();
		
		System.out.println("Enter Day-of-the-Month [1-31]:");
		int day = this.keyboard.nextInt();
		
		System.out.println("Enter Year:");
		int year = this.keyboard.nextInt();
		
		System.out.println("Enter high temperature in Fahrenheit:");
		int highTemp = this.keyboard.nextInt();
		
		System.out.println("Enter low temperature in Fahrenheit:");
		int lowTemp = this.keyboard.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		DailyReport report = new DailyReport(city, date, highTemp, lowTemp);
		this.theWeatherHistory.add(report);
		this.printDailyReports();

	
	}

	private void printDailyReports() {
		System.out.println("DAILY REPORTS:");
		String allReports = this.theWeatherHistory.index();
		System.out.println(allReports);
	}
}
