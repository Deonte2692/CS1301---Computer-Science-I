package edu.westga.cs1301.financials.test.taxcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs1301.financials.model.TaxCalculator;
import edu.westga.cs1301.financials.model.TaxPayer;

public class TestCalculateIncomeTax {

	private TaxCalculator tc;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.tc = new TaxCalculator();
	}

	@Test
	public void testShouldCalculateAsCorporation() {
		TaxPayer payer = new TaxPayer("ACME, Inc", 1, 9000, true);
		assertEquals(9000 * 0.21, tc.calculateIncomeTax(payer), 0.001);
	}

	@Test
	public void testShouldCalculateAsPerson() {
		TaxPayer payer = new TaxPayer("Sally", 1, 9000, false);
		assertEquals(9000 * 0.10, tc.calculateIncomeTax(payer), 0.001);
	}

}
