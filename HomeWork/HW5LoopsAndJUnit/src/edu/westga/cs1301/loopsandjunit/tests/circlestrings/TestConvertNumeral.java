package edu.westga.cs1301.loopsandjunit.tests.circlestrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.loopsandjunit.model.CircleStrings;
import edu.westga.cs1301.loopsandjunit.model.Train;

public class TestConvertNumeral {

	@Test
	public void testOneLowerThanMinimum(){
		assertThrows(IllegalArgumentException.class, () -> {
			 CircleStrings.convertNumeral((char)(-1));

	});}
	
	@Test
	public void testEqualToMinimum(){
		assertEquals((char)('0' + 9263), CircleStrings.convertNumeral('0'));
	}
	
	@Test
	public void testOneHigherThanMinimum(){
		assertEquals((char)('1' + 9263), CircleStrings.convertNumeral('1'));
	}
	
	@Test
	public void testOneLowerThanMaximum(){
		assertEquals((char)('8' + 9263), CircleStrings.convertNumeral('8'));
	}
	@Test
	public void testEqualToMaximum(){
		assertEquals((char)('9' + 9263), CircleStrings.convertNumeral('9'));
	}
	@Test
	public void testOneHigherThanMaximum(){
		assertThrows(IllegalArgumentException.class, () -> {
			 CircleStrings.convertNumeral((char)(10));

	});}
	}

