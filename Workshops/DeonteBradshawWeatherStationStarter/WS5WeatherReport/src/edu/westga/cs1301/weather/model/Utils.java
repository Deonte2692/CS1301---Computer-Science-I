package edu.westga.cs1301.weather.model;

/**
 * Useful utility methods.
 * 
 * @author lewisb
 * @version Fall 2022
 */
public class Utils {
	/**
	 * Used for parameter validation. If cond is false, throws
	 * an IllegalArgumentException with the given msg.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param cond a condition to check
	 * @param msg the message to pass to IllegalArgumentException
	 * @throws IllegalArgumentException if cond is false
	 */
	public static void validate(boolean cond, String msg) {
		if (!cond) {
			throw new IllegalArgumentException(msg);
		}
	}
}
