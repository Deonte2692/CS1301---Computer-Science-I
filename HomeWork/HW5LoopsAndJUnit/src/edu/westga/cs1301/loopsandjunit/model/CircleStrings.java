package edu.westga.cs1301.loopsandjunit.model;

/**
 * Contains methods for converting letters and numbers to their circled
 * counterparts.
 * 
 * @author lewisb
 *
 */
public class CircleStrings { 

	/**
	 * Converts the letters and numerals in the given string
	 * to their circled counterparts. All other characters
	 * are unchanged.
	 * 
	 * @precondition text != null
	 * @postcondition none
	 * 
	 * @param text the text to convert
	 * @return a modified version of text, with all letters and numerals
	 * circled.
	 */
	public static String convertString(String text) {
		String newText = "";
		if (text == null) {
			throw new IllegalArgumentException("Text cannot be Null.");
		}
		for (int i = 0; i < text.length(); i++ ) {
			boolean isDigit = Character.isDigit(text.charAt(i));
			boolean isUpper = Character.isUpperCase(text.charAt(i));
			boolean isLower = Character.isLowerCase(text.charAt(i));
			if (isDigit) {
				char newChar = convertNumeral(text.charAt(i));
				newText = newText + newChar; 
			}
			else if (isUpper){
				char newChar = convertUppercaseLetter(text.charAt(i));
				newText = newText + newChar; 
			}
			else if (isLower){
				char newChar = convertLowercaseLetter(text.charAt(i));
				newText = newText + newChar; 
			}
			else {
				char newChar = text.charAt(i);
				newText = newText + newChar;
			}
		}
		return newText;
	}
	
	/**
	 * Converts an uppercase letter to its circled counterpart.
	 * 
	 * @precondition 'A' <= letter <= 'Z'
	 * @postcondition none
	 * 
	 * @param letter the uppercase letter to convert
	 * @return the circled version of the uppercase letter
	 */
	public static char convertUppercaseLetter(char letter) {
		if (letter < 'A' || letter > 'Z') {
			throw new IllegalArgumentException("letter must be uppercase");
		}
		return (char)(letter + 9333);
	}
	
	/**
	 * Converts a lowercase letter to its circled counterpart.
	 * 
	 * @precondition 'a' <= letter <= 'a'
	 * @postcondition none
	 * 
	 * @param letter the lowercase letter to convert
	 * @return the circled version of the lowercase letter
	 */
	public static char convertLowercaseLetter(char letter) {
		if (letter < 'a' || letter > 'z') {
			throw new IllegalArgumentException("letter must be lowercase");
		}
		return (char)(letter + 9327);
	}
	
	/**
	 * Converts a numeral character to its circled counterpart.
	 * 
	 * @precondition '0' <= letter <= '9'
	 * @postcondition none
	 * 
	 * @param numeral the numeral to convert
	 * @return the circled version of the numeral
	 */
	public static char convertNumeral(char numeral) {
		if (numeral < '0' || numeral > '9') {
			throw new IllegalArgumentException("numeral must be between '0' and '9' inclusive");
		}
		
		return (char)(numeral + 9263);
	}
}
