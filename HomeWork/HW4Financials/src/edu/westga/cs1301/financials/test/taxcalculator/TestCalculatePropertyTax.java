package edu.westga.cs1301.financials.test.taxcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs1301.financials.model.TaxCalculator;
import edu.westga.cs1301.financials.model.TaxPayer;

public class TestCalculatePropertyTax {

	private TaxCalculator tc;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.tc = new TaxCalculator();
	}

	@Test
	public void testShouldCalculateAsCorporation() {
		TaxPayer payer = new TaxPayer("ACME, Inc", 1, 9000, true);
		double fmv = 100000.0;
		double adjusted = fmv * 0.4;
		double expected = adjusted / 1000.0 * 6.021;
		double actual = tc.calculatePropertyTax(payer, 100000);
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAsCorporationWithZeroFMV() {
		TaxPayer payer = new TaxPayer("ACME, Inc", 1, 9000, true);
		double actual = tc.calculatePropertyTax(payer, 0);
		assertEquals(0, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAsCorporationWithNegativeFMV() {
		TaxPayer payer = new TaxPayer("ACME, Inc", 1, 9000, true);
		double actual = tc.calculatePropertyTax(payer, -1);
		assertEquals(0, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAsNonElderlyPerson() {
		TaxPayer payer = new TaxPayer("Joe", 50, 9000, false);
		double fmv = 100000.0;
		double adjusted = fmv * 0.4 - 6000.0;
		double expected = adjusted / 1000.0 * 6.021;
		double actual = tc.calculatePropertyTax(payer, 100000);
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAsNonElderlyPersonWithZeroFMV() {
		TaxPayer payer = new TaxPayer("Joe", 1, 9000, false);
		double actual = tc.calculatePropertyTax(payer, 0);
		assertEquals(0, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAsNonElderlyPersonWithNegativeFMV() {
		TaxPayer payer = new TaxPayer("Joe", 1, 9000, false);
		double actual = tc.calculatePropertyTax(payer, -1);
		assertEquals(0, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateOneBelowElderlyPersonMin() {
		TaxPayer payer = new TaxPayer("Joe", 61, 9000, false);
		double fmv = 100000.0;
		double adjusted = fmv * 0.4 - 6000.0;
		double expected = adjusted / 1000.0 * 6.021;
		double actual = tc.calculatePropertyTax(payer, 100000);
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAtElderlyPersonMin() {
		TaxPayer payer = new TaxPayer("Joe", 62, 9000, false);
		double fmv = 100000.0;
		double adjusted = fmv * 0.4 - 6000.0 - 10000.0;
		double expected = adjusted / 1000.0 * 6.021;
		double actual = tc.calculatePropertyTax(payer, 100000);
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAtOneAboveElderlyPersonMin() {
		TaxPayer payer = new TaxPayer("Joe", 63, 9000, false);
		double fmv = 100000.0;
		double adjusted = fmv * 0.4 - 6000.0 - 10000.0;
		double expected = adjusted / 1000.0 * 6.021;
		double actual = tc.calculatePropertyTax(payer, 100000);
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAsElderlyPersonWithZeroFMV() {
		TaxPayer payer = new TaxPayer("Joe", 63, 9000, false);
		double actual = tc.calculatePropertyTax(payer, 0);
		assertEquals(0, actual, 0.001);
	}
	
	@Test
	public void testShouldCalculateAsElderlyPersonWithNegativeFMV() {
		TaxPayer payer = new TaxPayer("Joe", 63, 9000, false);
		double actual = tc.calculatePropertyTax(payer, -1);
		assertEquals(0, actual, 0.001);
	}

}
