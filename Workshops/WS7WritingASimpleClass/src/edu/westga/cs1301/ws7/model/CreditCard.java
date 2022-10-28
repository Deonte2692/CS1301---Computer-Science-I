package edu.westga.cs1301.ws7.model;

public class CreditCard { 
	private String firstName;
	private String lastName;
	private String cardCompany;
	private int cardExpiration;
	private int creditId;
	private double creditBalance;
	private int securityNumber;
	private boolean cardChip;
	private int customerSince;
	
	public CreditCard(String firstName, String lastName, String cardCompany, int cardExpiration, int creditId, double creditBalance, int securityNumber, boolean cardChip, int customerSince) {
		 this.firstName = firstName;  
		 this.lastName = lastName;
		 this.cardCompany = cardCompany;
		 this.cardExpiration = cardExpiration;
		 this.creditId = creditId;
		 this.creditBalance = creditBalance;
		 this.securityNumber = securityNumber;
		 this.cardChip = cardChip;
		 this.customerSince = customerSince;
			}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCardCompany() {
		return cardCompany;
	}
	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}
	public int getCardExpiration() {
		return cardExpiration;
	}
	public void setCardExpiration(int cardExpiration) {
		this.cardExpiration = cardExpiration;
	}
	public int getCreditId() {
		return creditId;
	}
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}
	public double getCreditBalance() {
		return creditBalance;
	}
	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}
	public int getSecurityNumber() {
		return securityNumber;
	}
	public void setSecurityNumber(int securityNumber) {
		this.securityNumber = securityNumber;
	}
	public boolean isCardChip() {
		return cardChip;
	}
	public void setCardChip(boolean cardChip) {
		this.cardChip = cardChip;
	}
	public int getCustomerSince() {
		return customerSince;
	}
	public void setCustomerSince(int customerSince) {
		this.customerSince = customerSince;
	}
	
	
	
	

}
