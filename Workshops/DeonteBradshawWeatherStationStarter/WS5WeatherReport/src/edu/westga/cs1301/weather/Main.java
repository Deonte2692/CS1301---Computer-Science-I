package edu.westga.cs1301.weather;

/**
 * Main class for the application.
 * 
 * @author lewisb
 * @version Fall 2022
 */
public class Main {

	/**
	 * Entry point for the application
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		ReportsController controller = new ReportsController();
		controller.start();
	}

}
