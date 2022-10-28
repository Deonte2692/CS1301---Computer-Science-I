package edu.westga.cs1301.financials.test.taxcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs1301.financials.model.TaxCalculator;
import edu.westga.cs1301.financials.model.TaxPayer;

public class TestCalculatePersonalIncomeTax {

	private TaxCalculator tc;
	
	private static final double fullBracket1Tax = 0.1  *    9950;
	private static final double fullBracket2Tax = 0.12 *  (40525 -   9950) + fullBracket1Tax;
	private static final double fullBracket3Tax = 0.22 *  (86375 -  40525) + fullBracket2Tax;
	private static final double fullBracket4Tax = 0.24 * (164925 -  86375) + fullBracket3Tax;
	private static final double fullBracket5Tax = 0.32 * (209425 - 164925) + fullBracket4Tax;
	private static final double fullBracket6Tax = 0.35 * (523600 - 209425) + fullBracket5Tax;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.tc = new TaxCalculator();
	}

	@Test
	public void testShouldBeZeroIfIncomeIsNegative() {
		TaxPayer payer = new TaxPayer("Joe", 50, -1, false);
		assertEquals(0, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testShouldBeZeroIfIncomeIsZero() {
		TaxPayer payer = new TaxPayer("Joe", 50, 0, false);
		assertEquals(0, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtOneBelowBracket1Max() {
		int income = 9949;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(income * 0.1, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket1Max() {
		int income = 9950;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(income * 0.1, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket2Min() {
		int income = 9951;
		double marginalIncome = income - 9950;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket1Tax + marginalIncome * 0.12, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtOneBelowBracket2Max() {
		int income = 40525 - 1;
		double marginalIncome = income - 9950;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket1Tax + marginalIncome * 0.12, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket2Max() {
		int income = 40525;
		double marginalIncome = income - 9950;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket1Tax + marginalIncome * 0.12, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket3Min() {
		int income = 40525 + 1;
		double marginalIncome = income - 40525;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket2Tax + marginalIncome * 0.22, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtOneBelowBracket3Max() {
		int income = 86375 - 1;
		double marginalIncome = income - 40525;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket2Tax + marginalIncome * 0.22, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket3Max() {
		int income = 86375;
		double marginalIncome = income - 40525;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket2Tax + marginalIncome * 0.22, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket4Min() {
		int income = 86375 + 1;
		double marginalIncome = income - 86375;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket3Tax + marginalIncome * 0.24, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtOneBelowBracket4Max() {
		int income = 164925 - 1;
		double marginalIncome = income - 86375;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket3Tax + marginalIncome * 0.24, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket4Max() {
		int income = 164925;
		double marginalIncome = income - 86375;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket3Tax + marginalIncome * 0.24, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket5Min() {
		int income = 164925 + 1;
		double marginalIncome = income - 164925;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket4Tax + marginalIncome * 0.32, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtOneBelowBracket5Max() {
		int income = 209425 - 1;
		double marginalIncome = income - 164925;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket4Tax + marginalIncome * 0.32, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket5Max() {
		int income = 209425;
		double marginalIncome = income - 164925;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket4Tax + marginalIncome * 0.32, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket6Min() {
		int income = 209425 + 1;
		double marginalIncome = income - 209425;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket5Tax + marginalIncome * 0.35, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket6Max() {
		int income = 523600;
		double marginalIncome = income - 209425;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket5Tax + marginalIncome * 0.35, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtBracket7Min() {
		int income = 523600 + 1;
		double marginalIncome = income - 523600;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket6Tax + marginalIncome * 0.37, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
	
	@Test
	public void testAtOneAboveBracket7Min() {
		int income = 523600 + 2;
		double marginalIncome = income - 523600;
		TaxPayer payer = new TaxPayer("Joe", 50, income, false);
		assertEquals(fullBracket6Tax + marginalIncome * 0.37, tc.calculatePersonalIncomeTax(payer), 0.001);
	}
}
