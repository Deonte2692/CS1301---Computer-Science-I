package edu.westga.cs1301.wsunittests.model;

public class GroceryBill {

	private int foodTotal;
	private int nonFoodTotal;
	private String storeName;
	
	private static final double TAX_RATE = 0.07;
	
	/**
	 * Creates a GroceryBill with the given totals for food and non-food items.
	 * 
	 * @precondition foodTotal >= 0 && nonFoodTotal >=0 && storeName != null && storeName.isEmpty()==false
	 * @postcondition foodTotal==getFoodTotal() && nonFoodTotal==getNonFoodTotal() && getStoreName().equals(storeName)
	 * 
	 * @param storeName the name of the grocery store
	 * @param foodTotal the total amount for food items
	 * @param nonFoodTotal the total amount for non-food items
	 */
	public GroceryBill(String storeName, int foodTotal, int nonFoodTotal) {
		super();
		
		this.checkNotNull(storeName, "storeName should not be null");
		this.checkNotEmpty(storeName, "storeName should not be the empty string");
		this.checkGreaterThanOrEqualToZero(foodTotal, "foodTotal must be >= 0");
		this.checkGreaterThanOrEqualToZero(nonFoodTotal, "nonFoodTotal must be >= 0");
		
		this.storeName = storeName;
		this.foodTotal = foodTotal;
		this.nonFoodTotal = nonFoodTotal;
	}
	
	private void checkNotNull(Object obj, String message) {
		if (obj == null) {
			throw new IllegalArgumentException(message);
		}
	}
	
	private void checkNotEmpty(String obj, String message) {
		if (obj.isEmpty()) {
			throw new IllegalArgumentException(message);
		}
	}

	private void checkGreaterThanOrEqualToZero(int cost, String message) {
		if (cost < 0) {
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * Gets the food total
	 * 
	 * @return the total for food items
	 */
	public int getFoodTotal() {
		return this.foodTotal;
	}
	/**
	 * Gets the non-food total 
	 * 
	 * @return the total for non-food items
	 */
	public int getNonFoodTotal() {
		return this.nonFoodTotal;
	}
	
	/**
	 * Gets the store name
	 * 
	 * @return the store name
	 */
	public String getStoreName() {
		return this.storeName;
	}
	
	/**
	 * Gets the overall total. Food items are
	 * not taxed, but non-food items are taxed at 7%.
	 * 
	 * @return the overall total
	 */
	public double getOverallTotal() {
		return this.foodTotal + (1 + GroceryBill.TAX_RATE) * this.nonFoodTotal;
	}
	
	/**
	 * This grocery gives cashback points at a rate of one per $10 spent,
	 * up to $500. No points are given for the amount of purchase above $500.
	 * 
	 * @return the cashback points, as described above
	 */
	public int getCashbackPoints() {
		int total = (int) this.getOverallTotal();
		if (total >= 500) {
			return 50;
		} else {
			return total / 10;
		}
	}
}
