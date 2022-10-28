package edu.westga.cs1301.vending.model;

/**
 * Simulates a snack machine with a few items
 * that can be purchased
 * 
 * @author lewisb
 *
 */
public class SnackMachine {
	
	public SnackMachine(double gum, double candy, double chips){
		this.gumPrice = gum;
		this.candyPrice = candy;
		this.chipsPrice = chips;
		resetOrder();
		resetMachine();
	};
	
	private double gumPrice;
	private double candyPrice;
	private double chipsPrice;
	
	private int gumInOrder;
	private int candyInOrder;
	private int chipsInOrder;
	
	private double totalSales;
	private double paymentTendered;
	
	
	public void changePrices(double newGum, double newCandy, double newChips){
		this.gumPrice = newGum;
		this.candyPrice = newCandy;
		this.chipsPrice = newChips;
	};
	
	private void resetOrder(){
		this.gumInOrder = 0;
		this.candyInOrder = 0;
		this.chipsInOrder = 0;
		this.paymentTendered = 0.00;
	};
	
	private void resetMachine(){
	this.totalSales = 0.00;
	};
	
	public void putInMoney(double moneyAdded) {
		this.paymentTendered = moneyAdded;
	};
	
	public void addGumToOrder(int gum) {
		this.gumInOrder = this.gumInOrder+gum;
	};
	
	public void addCandyToOrder(int candy) {
		this.candyInOrder = this.candyInOrder+candy;
	};
	
	public double getOrderTotal() {
		double total;
		double gumTotal;
		double candyTotal;
		double chipsTotal;
		gumTotal = this.gumInOrder*this.gumPrice;
		candyTotal = this.candyInOrder*this.candyPrice;
		chipsTotal = this.chipsInOrder*this.chipsPrice;
		total = (gumTotal+candyTotal+chipsTotal);
		return total;
	};
	
	public double completeOrder() {
		double change;
		change = this.paymentTendered - getOrderTotal(); 
		 this.totalSales = this.totalSales + getOrderTotal();
		 resetOrder();
		 return change;
	};
	
	public void addChipsToOrder(int chips) {
		this.chipsInOrder = this.chipsInOrder+chips;
	};
	
	public double getGumPrice() {
		return this.gumPrice;
	}

	public double getCandyPrice() {
		return this.candyPrice;
	}

	public double getChipsPrice() {
		return this.chipsPrice;
	}

	public int getGumInOrder() {
		return this.gumInOrder;
	}

	public int getCandyInOrder() {
		return this.candyInOrder;
	}

	public int getChipsInOrder() {
		return this.chipsInOrder;
	}

	public double getTotalSales() {
		return this.totalSales;
	}

	public double getPaymentTendered() {
		return this.paymentTendered;
	}
	
	
}
