package edu.westga.cs1301.loopworkshop.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import edu.westga.cs1301.loopworkshop.model.InterestCalculator;

/**
 * Controller for the Interest Calculator Console Application.
 * 
 * @author Alexander Ayers
 * @version Fall 2022
 *
 */
public class InterestController {

	/**
	 * Runs the application by getting input from user with the console then prints
	 * the output to the console.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void run() {
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			InterestCalculator calculator = new InterestCalculator();
			
			boolean keepGoing = false;
			
			do  {
				try {
				System.out.println("Enter your desired principal:");
				double principal = Double.parseDouble(reader.readLine());

				System.out.println("Enter your desired interest rate (enter as a decimal value, 5% = 0.05):");
				double interestRate = Double.parseDouble(reader.readLine());

				System.out.println("Enter your desired amount of years:");
				int years = Integer.parseInt(reader.readLine());
				
				
				double compoundedValue = calculator.calculateInterest(principal, interestRate, years);

				DecimalFormat formatter = new DecimalFormat("0.00");
				System.out.println("Compounded Value: $" + formatter.format(compoundedValue));
				
				System.out.println("Would you like to continue? Type 'yes' to continue. ");
				
				keepGoing = reader.readLine().equalsIgnoreCase("yes");
				} catch (Exception e) {
					keepGoing = true;
					System.err.println(e.getMessage());
				}
			} while (keepGoing);
			


	}
}
