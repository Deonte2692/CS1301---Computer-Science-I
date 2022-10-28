package edu.westga.cs1301.financials.test.taxcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs1301.financials.model.TaxCalculator;
import edu.westga.cs1301.financials.model.TaxPayer;

class TestCalculateCorporateIncomeTax {

	private TaxCalculator tc;
	
	@BeforeEach
	void setUp() throws Exception {
		this.tc = new TaxCalculator();
	}

	@Test
	void testShouldBeZeroIfIncomeIsNegative() {
		TaxPayer payer = new TaxPayer("ACME, Inc", 1, -1, true);
		assertEquals(0, tc.calculateCorporateIncomeTax(payer), 0.001);
	}

	@Test
	void testShouldBeZeroIfIncomeIsZero() {
		TaxPayer payer = new TaxPayer("ACME, Inc", 1, 0, true);
		assertEquals(0, tc.calculateCorporateIncomeTax(payer), 0.001);
	}
	
	@Test
	void testShouldCalculateWhenIncomeIsAboveZero() {
		TaxPayer payer = new TaxPayer("ACME, Inc", 1, 10000, true);
		assertEquals(10000 * 0.21, tc.calculateCorporateIncomeTax(payer), 0.001);
	}
}
