package edu.westga.cs1301.decisionworkshop.test.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.decisionworkshop.model.FizzBuzz;

class TestFizzBuzz {
	
	public static final FizzBuzz fizz = new FizzBuzz();

	@Test
	void testNegativeNumber() {		
		assertThrows(IllegalArgumentException.class, () -> {
			fizz.fizzBuzz(-1);
		});
	}
	
	@Test
	void testZero() {
		assertThrows(IllegalArgumentException.class, () -> {
			fizz.fizzBuzz(0);
		});
	}
	
	@Test
	void testNumberNotDivisibleByThreeOrFive() {
		String actual = fizz.fizzBuzz(1);
		String expected = "1";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testNumberDivisibleByThree() {
		String actual = fizz.fizzBuzz(3);
		String expected = "Fizz";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testNumberDivisibleByFive() {
		String actual = fizz.fizzBuzz(5);
		String expected = "Buzz";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testNumberNotDivisibleByThreeAndFive() {
		String actual = fizz.fizzBuzz(15);
		String expected = "FizzBuzz";
		
		assertEquals(expected, actual);
	}
	

}
