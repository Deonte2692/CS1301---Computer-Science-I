package edu.westga.cs1301.loopsandjunit.tests.circlestrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.loopsandjunit.model.CircleStrings;

public class TestConvertLowercaseLetter {
	@Test
	public void testOneLowerThanMinimum(){
		assertThrows(IllegalArgumentException.class, () -> {
			 CircleStrings.convertLowercaseLetter('`');

	});}
	@Test
	public void testEqualToMinimum(){
		assertEquals((char)('a' + 9327), CircleStrings.convertLowercaseLetter('a'));
	}
	@Test
	public void testOneHigherThanMinimum(){
		assertEquals((char)('b' + 9327), CircleStrings.convertLowercaseLetter('b'));
	}
	@Test
	public void testOneLowerThanMaximum(){
		assertEquals((char)('y' + 9327), CircleStrings.convertLowercaseLetter('y'));
	}
	@Test
	public void testEqualToMaximum(){
		assertEquals((char)('z' + 9327), CircleStrings.convertLowercaseLetter('z'));
	}
	@Test
	public void testOneHigherThanMaximum(){
		assertThrows(IllegalArgumentException.class, () -> {
			 CircleStrings.convertLowercaseLetter('{');

	});}
	}