package edu.westga.cs1301.financials.model;

/**
 * Collection of utility classes for 
 * @author lewisb
 *
 */









public class TaxCalculator {
	
	public static final double CORPORATE_TAX_RATE = 0.21;
	public static final int BRACKET_ONE_MAXIMUM_INCOME = 9950;
	public static final int BRACKET_TWO_MAXIMUM_INCOME = 40525;
	public static final int BRACKET_THREE_MAXIMUM_INCOME = 86375;
	public static final int BRACKET_FOUR_MAXIMUM_INCOME = 164925;
	public static final int BRACKET_FIVE_MAXIMUM_INCOME = 209425;
	public static final int BRACKET_SIX_MAXIMUM_INCOME = 523600;
	public static final double BRACKET_ONE_TAX_RATE = 0.10;
	public static final double BRACKET_TWO_TAX_RATE = 0.12;
	public static final double BRACKET_THREE_TAX_RATE = 0.22;
	public static final double BRACKET_FOUR_TAX_RATE = 0.24;
	public static final double BRACKET_FIVE_TAX_RATE = 0.32;
	public static final double BRACKET_SIX_TAX_RATE = 0.35;
	public static final double BRACKET_SEVEN_TAX_RATE = 0.37;
	public static final double BRACKET_ONE_TAX = TaxCalculator.BRACKET_ONE_MAXIMUM_INCOME*TaxCalculator.BRACKET_ONE_TAX_RATE;
	public static final double BRACKET_TWO_TAX = (TaxCalculator.BRACKET_TWO_MAXIMUM_INCOME-TaxCalculator.BRACKET_ONE_MAXIMUM_INCOME)*TaxCalculator.BRACKET_TWO_TAX_RATE;
	public static final double BRACKET_THREE_TAX = (TaxCalculator.BRACKET_THREE_MAXIMUM_INCOME-TaxCalculator.BRACKET_TWO_MAXIMUM_INCOME)*TaxCalculator.BRACKET_THREE_TAX_RATE;
	public static final double BRACKET_FOUR_TAX = (TaxCalculator.BRACKET_FOUR_MAXIMUM_INCOME-TaxCalculator.BRACKET_THREE_MAXIMUM_INCOME)*TaxCalculator.BRACKET_FOUR_TAX_RATE;
	public static final double BRACKET_FIVE_TAX = (TaxCalculator.BRACKET_FIVE_MAXIMUM_INCOME-TaxCalculator.BRACKET_FOUR_MAXIMUM_INCOME)*TaxCalculator.BRACKET_FIVE_TAX_RATE;
	public static final double BRACKET_SIX_TAX = (TaxCalculator.BRACKET_SIX_MAXIMUM_INCOME-TaxCalculator.BRACKET_FIVE_MAXIMUM_INCOME)*TaxCalculator.BRACKET_SIX_TAX_RATE;
	public static final double MILLAGE_RATE = 6.021;
	public static final double FAIR_MARKET_RATE = 0.40;
	public static final double ELDERLY_EXEMPTION = 10000;
	public static final double ELDERLY_AGE = 62;
	public static final double HOMESTEAD_EXEMPTION = 6000;
	public static final double MILLAGE_FEE = 1000;


	
	/**
	 * Creates a TaxCalculator using 2021-2022 tax rates;
	 */
	public TaxCalculator() {

	}
	
	/**
	 * Calculates a tax payer's tax assuming they are a corporation.
	 * 
	 * @precondition payer != null AND payer.isCorporation()==true
	 * @postcondition none
	 * 
	 * @param payer the tax payer
	 * @return the tax assuming the payer is a corporation; should be zero if no (or negative) income
	 */
	public double calculateCorporateIncomeTax(TaxPayer payer) {
		double income = payer.getIncome();
		double tax = income*TaxCalculator.CORPORATE_TAX_RATE;
		if (tax < 0) {
			tax = 0;
		}
		return tax;
	}
	
	/**
	 * Calculate's the payer's tax assuming they are a person.
	 * 
	 * @precondition payer != null AND payer.isCorporation()==false
	 * @postcondition none
	 * 
	 * @param payer the tax payer
	 * @return the tax assuming the payer is a person; 0 if no (or negative) income
	 */
	public double calculatePersonalIncomeTax(TaxPayer payer) {
		double income = payer.getIncome();
		double tax;
		if (income < 0) {
			tax = 0;
		}
		else if (income <= TaxCalculator.BRACKET_ONE_MAXIMUM_INCOME) {
			tax = income*TaxCalculator.BRACKET_ONE_TAX_RATE;
		}
		
		else if (income <= TaxCalculator.BRACKET_TWO_MAXIMUM_INCOME) {
			double mariginalIncome = income - TaxCalculator.BRACKET_ONE_MAXIMUM_INCOME;
			tax = TaxCalculator.BRACKET_ONE_TAX + mariginalIncome*TaxCalculator.BRACKET_TWO_TAX_RATE;
		}
		
		else if (income <= TaxCalculator.BRACKET_THREE_MAXIMUM_INCOME) {
			double mariginalIncome = income - TaxCalculator.BRACKET_TWO_MAXIMUM_INCOME;
			tax = TaxCalculator.BRACKET_ONE_TAX + TaxCalculator.BRACKET_TWO_TAX + mariginalIncome*TaxCalculator.BRACKET_THREE_TAX_RATE;
		}
		
		else if (income <= TaxCalculator.BRACKET_FOUR_MAXIMUM_INCOME) {
			double mariginalIncome = income - TaxCalculator.BRACKET_THREE_MAXIMUM_INCOME;
			tax = TaxCalculator.BRACKET_ONE_TAX + TaxCalculator.BRACKET_TWO_TAX + TaxCalculator.BRACKET_THREE_TAX + mariginalIncome*TaxCalculator.BRACKET_FOUR_TAX_RATE;
		}
		
		else if (income <= TaxCalculator.BRACKET_FIVE_MAXIMUM_INCOME) {
			double mariginalIncome = income - TaxCalculator.BRACKET_FOUR_MAXIMUM_INCOME;
			tax = TaxCalculator.BRACKET_ONE_TAX + TaxCalculator.BRACKET_TWO_TAX + TaxCalculator.BRACKET_THREE_TAX + TaxCalculator.BRACKET_FOUR_TAX + mariginalIncome*TaxCalculator.BRACKET_FIVE_TAX_RATE;
		}
		
		else if (income <= TaxCalculator.BRACKET_SIX_MAXIMUM_INCOME) {
			double mariginalIncome = income - TaxCalculator.BRACKET_FIVE_MAXIMUM_INCOME;
			tax = TaxCalculator.BRACKET_ONE_TAX + TaxCalculator.BRACKET_TWO_TAX + TaxCalculator.BRACKET_THREE_TAX + TaxCalculator.BRACKET_FOUR_TAX + TaxCalculator.BRACKET_FIVE_TAX + mariginalIncome*TaxCalculator.BRACKET_SIX_TAX_RATE;
		}
		
		else {
			double mariginalIncome = income - TaxCalculator.BRACKET_SIX_MAXIMUM_INCOME;
			tax = TaxCalculator.BRACKET_ONE_TAX + TaxCalculator.BRACKET_TWO_TAX + TaxCalculator.BRACKET_THREE_TAX + TaxCalculator.BRACKET_FOUR_TAX + TaxCalculator.BRACKET_FIVE_TAX + TaxCalculator.BRACKET_SIX_TAX + mariginalIncome*TaxCalculator.BRACKET_SEVEN_TAX_RATE;
		}
		
		return tax;
		
		
	}
	
	/**
	 * Calculates the tax payer's actual tax by determining
	 * whether or not they are a corporation
	 * 
	 * @precondition payer != null
	 * @postcondition none
	 * 
	 * @param payer the tax payer
	 * @return the actual tax
	 */
	public double calculateIncomeTax(TaxPayer payer) {
		if (payer.isCorporation() == true ) {
			return calculateCorporateIncomeTax(payer);
		}
		else {
			return calculatePersonalIncomeTax(payer);
		}
		
	}
	
	/**
	 * Calculates the payer's property tax
	 * 
	 * @precondition payer != null
	 * @postcondition none
	 * 
	 * @param payer the tax payer
	 * @param fmv the fair market value of the property
	 * @return the property tax; it can not be less than zero.
	 */
	public double calculatePropertyTax(TaxPayer payer, double fmv) {
		double assessedValue = TaxCalculator.FAIR_MARKET_RATE*fmv;
		if (payer.isCorporation() == false) {
			assessedValue = assessedValue - TaxCalculator.HOMESTEAD_EXEMPTION;
			if (payer.getAge() >= TaxCalculator.ELDERLY_AGE) {
				assessedValue = assessedValue - TaxCalculator.ELDERLY_EXEMPTION;
			}	
		}
		double tax = TaxCalculator.MILLAGE_RATE*assessedValue/TaxCalculator.MILLAGE_FEE;
		if (tax < 0) {
			tax = 0;
		}
		return tax;
	}
}
