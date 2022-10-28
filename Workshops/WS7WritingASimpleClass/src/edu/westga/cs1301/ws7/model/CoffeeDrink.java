package edu.westga.cs1301.ws7.model;

public class CoffeeDrink {
	private int caloriesCount;
	private double coffeePrice;
	private String coffeeSizes;
	private String menuItems;
	
	public CoffeeDrink(String menuItems, String coffeeSizes, double coffeePrice, int caloriesCount) {
		this.menuItems = menuItems;
		this.coffeeSizes = coffeeSizes;
		this.coffeePrice = coffeePrice;
		this.caloriesCount = caloriesCount;
	}
	
	public String getMenuItems() {
		return this.menuItems;
	}
	
	public void setMenuItems(String menuItems) {
		this.menuItems = menuItems;
	}

	public String getCoffeeSizes() {
		return this.coffeeSizes;
	}
	
	public void setCoffeeSizes(String coffeeSizes) {
		this.coffeeSizes = coffeeSizes;
	}

	public int getCaloriesCount() {
		return this.caloriesCount;
	}
	
	public void setCaloriesCount(int caloriesCount) {
		this.caloriesCount = caloriesCount;
	}

	public double getCoffeePrice() {
		return this.coffeePrice;
	}
	
	public void setCoffeePrice(double coffeePrice) {
		this.coffeePrice = coffeePrice;
	}

}
