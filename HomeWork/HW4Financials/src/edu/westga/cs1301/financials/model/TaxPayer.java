package edu.westga.cs1301.financials.model;

/**
 * Represents a person (or business) that pays taxes
 * 
 * @author lewisb
 *
 */
public class TaxPayer {
	private String name;
	private int age;
	private boolean isCorporation;
	private double income;
	
	/**
	 * Creates a new taxpayer.
	 * 
	 * @precondition name != null AND !name.isEmpty() AND age >= 0
	 * @postcondition getName()==name AND getAge()==age AND getIsBusiness()=isBusiness
	 * 
	 * @param name the person or business' name
	 * @param age the person's age (ignored if it is a business)
	 * @param income the annual income
	 * @param isCorporation true if the taxpayer is a business, false otherwise
	 */
	public TaxPayer(String name, int age, double income, boolean isCorporation) {
		super();
		this.name = name;
		this.age = age;
		this.isCorporation = isCorporation;
		this.income = income;
	}

	/**
	 * Gets the name
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the age
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Gets the taxpayer's annual income.
	 * @return the taxpayer's annual income.
	 */
	public double getIncome() {
		return this.income;
	}

	/**
	 * Gets whether or not this is a corporation (and not a person)
	 * @return true if a corporation, false otherwise
	 */
	public boolean isCorporation() {
		return this.isCorporation;
	}
	
	
}
