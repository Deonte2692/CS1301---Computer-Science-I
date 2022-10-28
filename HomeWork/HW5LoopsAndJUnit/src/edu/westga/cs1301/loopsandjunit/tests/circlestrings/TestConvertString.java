package edu.westga.cs1301.loopsandjunit.tests.circlestrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.loopsandjunit.model.CircleStrings;

public class TestConvertString {
	@Test
	public void testTextNull(){
		assertThrows(IllegalArgumentException.class, () -> {
			CircleStrings.convertString(null);
		});}
	@Test
	public void testEmptyString(){
		assertEquals((""), CircleStrings.convertString(""));
	}
	@Test
	public void testTextSingleCharacter(){
		assertEquals(((((char)('a' + 9327)+("")))), CircleStrings.convertString("a"));
	}
	@Test
	public void testTextUppercaseLetters(){
		assertEquals((((char)('A' + 9333 + 'B'+ 9333 + 'C' + 9333)+ (""))), CircleStrings.convertString("ABC"));
	}
	@Test
	public void testTextLowercaseLetters(){
		assertEquals(((char)('a' + 9327 + 'b' + 9327 + 'c' + 9327) + ("")), CircleStrings.convertString("abc"));
	}	
	@Test
	public void testTextPuncuationAndWhiteSpace(){
		assertEquals(((char)('a' + 9327 + ' ' + '.' ) + ("")), CircleStrings.convertString("a ."));
	}
	@Test
	public void testTextSeveralNumerals(){
		assertEquals(((char)('3' + 9263 + '3' + 9263 + '3' + 9263) + ("")), CircleStrings.convertString("333"));
	}
	@Test
	public void testTextEverything(){
		assertEquals(((char)('a' + 9327 + ' ' + '.' + '4' + 'B'+ 9333) + ("")), CircleStrings.convertString("a .4B"));
	}

}
