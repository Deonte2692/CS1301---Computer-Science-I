package edu.westga.cs1301.decisionworkshop;

import edu.westga.cs1301.decisionworkshop.view.FizzBuzzController;

/**
 * Class for launching the application.
 * 
 * @author Alexander Ayers
 * @version Fall 2022
 *
 */
public class Main {
	
	/**
	 * Main execution point for the system.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param args command-line arguments for running the system
	 */
	public static void main(String[] args) {
		FizzBuzzController controller = new FizzBuzzController();
		controller.run();
	}
}
