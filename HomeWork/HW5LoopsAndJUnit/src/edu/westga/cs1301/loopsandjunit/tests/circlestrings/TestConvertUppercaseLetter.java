package edu.westga.cs1301.loopsandjunit.tests.circlestrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.loopsandjunit.model.CircleStrings;

public class TestConvertUppercaseLetter {
	
	@Test
	public void testOneLowerThanMinimum(){
		assertThrows(IllegalArgumentException.class, () -> {
			 CircleStrings.convertUppercaseLetter((char)('@'));

		});
	}
	
	@Test
	public void testEqualToMinimum(){
		assertEquals((char)('A' + 9333), CircleStrings.convertUppercaseLetter('A'));
	}
	
	@Test
	public void testOneHigherThanMinimum(){
		assertEquals((char)('B' + 9333), CircleStrings.convertUppercaseLetter('B'));
	}
	@Test
	public void testOneLowerThanMaximum(){
		assertEquals((char)('Y' + 9333), CircleStrings.convertUppercaseLetter('Y'));
	}
	@Test
	public void testEqualToMaximum(){
		assertEquals((char)('Z' + 9333), CircleStrings.convertUppercaseLetter('Z'));
	}
	@Test
	public void testOneHigherThanMaximum(){
		assertThrows(IllegalArgumentException.class, () -> {
			 CircleStrings.convertUppercaseLetter((char)('['));

	});}
	}