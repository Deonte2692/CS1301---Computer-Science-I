package edu.westga.cs1301.loopworkshop.model;

/**
 * Calculator for compound interest.
 * 
 * @author Alexander Ayers
 * @version Fall 2022
 *
 */
public class InterestCalculator {
	
	/**
	 * Zero-parameter constructor.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public InterestCalculator() {
		
	}
	
	/**
	 * Calculates a compound interest with a specified principal and interest rate.
	 * The interest is compounded over a number of specified years.
	 * 
	 * @precondition principal > 0 && interestRate > 0 && years > 0
	 * @postcondition none
	 * 
	 * @param principal    the principal amount for the initial investment.
	 * @param interestRate the interest rate that is added to the principal.
	 * @param years        the number of years that the interest is compounded and
	 *                     calcuated for
	 * @return the new amount after the principal has been compounded with the
	 *         specified interest rate and specified number of years
	 */
	public double calculateInterest(double principal, double interestRate, int years) {
		if (principal <= 0.0) {
			throw new IllegalArgumentException("Principal must be greater than zero");
		}
		if (interestRate <= 0.0) {
			throw new IllegalArgumentException("Interest rate must be greater than zero");
		}
		if (years <= 0) {
			throw new IllegalArgumentException("Yearsmust be greater than zero");
		}
		double Amount;
		double newInterest = (1+interestRate);
		for (int i = years; i > 1;  i--){
			newInterest = newInterest * (1+interestRate);
		}
		Amount = principal*newInterest;
		return Amount;
	}

}
