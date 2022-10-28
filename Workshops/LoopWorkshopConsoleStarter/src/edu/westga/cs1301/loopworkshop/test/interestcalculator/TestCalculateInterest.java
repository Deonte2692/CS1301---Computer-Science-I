package edu.westga.cs1301.loopworkshop.test.interestcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.loopworkshop.model.InterestCalculator;

class TestCalculateInterest {
	public static final double DELTA = 0.001;
	public static final InterestCalculator calculator = new InterestCalculator();

	@Test
	void testNegativePrincipal() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculateInterest(-1.0, 0.05, 1);
		});
	}
	
	@Test
	void testNegativeInterestRate() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculateInterest(1.0, -0.05, 1);
		});
	}
	
	@Test
	void testNegativeYears() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculateInterest(1.0, 0.05, -1);
		});
	}
	@Test
	void testZeroPrincipal() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculateInterest(0, 0.05, 1);
		});
	}
	
	@Test
	void testZeroInterestRate() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculateInterest(1.0, 0, 1);
		});
	}
	
	@Test
	void testZeroYears() {
		assertThrows(IllegalArgumentException.class, () -> {
			calculator.calculateInterest(1.0, 0.05, 0);
		});
	}
	
	@Test
	void testSmallPrincipalSmallInterestSmallYears() {
		double actual = calculator.calculateInterest(5.0, 0.045, 1);
		double expected = 5.23;
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testLargePrincipalSmallInterestSmallYears() {
		double actual = calculator.calculateInterest(100.0, 0.045, 1);
		double expected = 104.50;
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testSmallPrincipalLargeInterestSmallYears() {
		double actual = calculator.calculateInterest(5.0, 0.2, 1);
		double expected = 6.00;
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testSmallPrincipalSmallInterestLargeYears() {
		double actual = calculator.calculateInterest(5.0, 0.045, 10);
		double expected = 7.76;
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testLargePrincipalLargeInterestSmallYears() {
		double actual = calculator.calculateInterest(100.0, 0.2, 1);
		double expected = 120.00;
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testLargePrincipalSmallInterestLargeYears() {
		double actual = calculator.calculateInterest(100.0, 0.045, 10);
		double expected = 155.30;
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testSmallPrincipalLargeInterestLargeYears() {
		double actual = calculator.calculateInterest(5.0, 0.2, 10);
		double expected = 30.96;
		assertEquals(expected, actual, DELTA);
	}
	
	@Test
	void testLargePrincipalLargeInterestLargeYears() {
		double actual = calculator.calculateInterest(100.0, 0.2, 10);
		double expected = 619.17;
		assertEquals(expected, actual, DELTA);
	}
	
	

}
