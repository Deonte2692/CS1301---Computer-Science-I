package edu.westga.cs1301.decisionworkshop.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import edu.westga.cs1301.decisionworkshop.model.FizzBuzz;

/**
 * Controller for the FizzBuzz Application
 * 
 * @author Alexander Ayers
 * @version Fall 2022
 *
 */
public class FizzBuzzController {

	/**
	 * Runs the application by getting input from user with the console then prints
	 * the output to the console.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			FizzBuzz fizz = new FizzBuzz();
			
			boolean keepGoing = false;
			
			do  {
				try {
				System.out.println("Enter your desired number:");
				int number = Integer.parseInt(reader.readLine());				
				
				String output = fizz.fizzBuzz(number);

				System.out.println("Result: " + output);
				
				System.out.println("Would you like to continue? Type 'yes' to continue. ");
				
				keepGoing = reader.readLine().equalsIgnoreCase("yes");
				} catch (Exception e) {
					keepGoing = true;
					System.err.println(e.getMessage());
				}
			} while (keepGoing);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
