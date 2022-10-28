package edu.westga.cs1301.decisionworkshop.model;

/**
 * Handles the FizzBuzz exercise.
 * 
 * @author Alexander Ayers
 * @verson Fall 2022
 *
 */
public class FizzBuzz {

	/**
	 * Zero-parameter constructor.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public FizzBuzz() {
		
	}
	
	/**
	 * Performs the FizzBuzz operation on the specified number. FizzBuzz is an
	 * operation that takes a number, and if the number is divisible by 3, returns
	 * Fizz. If it is divisible by 5, it returns Buzz. If it is divisible by both 3
	 * and 5, then it returns FizzBuzz. Otherwise, it just returns the number.
	 * 
	 * 
	 * Input - Output
	 *  1 - 1 
	 *  2 - 2 
	 *  3 - Fizz 
	 *  4 - 4 
	 *  5 - Buzz 
	 *  6 - Fizz 
	 *  7 - 7 
	 *  8 - 8 
	 *  9 - Fizz 
	 *  10 - Buzz 
	 *  11 - 11 
	 *  12 - Fizz 
	 *  13 - 13 
	 *  14 - 14 
	 *  15 - FizzBuzz
	 *  
	 * @precondition number > 0
	 * @postcondition none
	 *  
	 * @param number the specified number to perform the operation.
	 * @return the output of the fizzbuzz operation. Fizz if number is divisble by
	 *         3, Buzz if number is divisible by 5, FizzBuzz if number is divisible
	 *         by 3 and 5, otherwise, just the number.
	 */
	public String fizzBuzz(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("Number must be greater than 0.");
		}
		
		else if ((number%3 == 0) && !(number%5 == 0)) {
			return "Fizz";
		}
		else if (!(number%3 == 0) && (number%5 == 0)) {
			return "Buzz";
		}
		else if ((number%3 == 0) && (number%5 == 0)) {
			return "FizzBuzz";
		}
		
		else {
			return "" + number;
		}
			}
}
