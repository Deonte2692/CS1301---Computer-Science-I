package edu.westga.cs1301.tests.grocerybill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.wsunittests.model.GroceryBill;

public class TestConstructor {

	@Test
	public void testWhenStoreNameIsNull() {
		// Arrange, Act, & Assert
		assertThrows(IllegalArgumentException.class, () -> {
			new GroceryBill(null, 30, 15);
			});
	}
	
	
	@Test
	public void testWhenStoreNameIsEmpty() {
		// Arrange, Act, & Assert
			assertThrows(IllegalArgumentException.class, () -> {
				new GroceryBill("", 30, 15);
					});
	}
	
	
	@Test
	public void testWhenFoodTotalIsOneLessThanBoundary() {
		// Arrange, Act, & Assert
					assertThrows(IllegalArgumentException.class, () -> {
						new GroceryBill("DeonMart", -1, 15);
							});

	}
	
	
	@Test
	public void testWhenFoodTotalIsAtBoundary() {
		// Arrange & Act
		GroceryBill bill = new GroceryBill("DeonMart", 0, 15);
				// Assert
		assertEquals("DeonMart", bill.getStoreName());
		assertEquals(0, bill.getFoodTotal());
		assertEquals(15, bill.getNonFoodTotal());
	}
	
	
	@Test
	public void testWhenFoodTotalIsOneAboveBoundary() {
		// Arrange & Act
		GroceryBill bill = new GroceryBill("DeonMart", 1, 15);
				// Assert
		assertEquals("DeonMart", bill.getStoreName());
		assertEquals(1, bill.getFoodTotal());
		assertEquals(15, bill.getNonFoodTotal());
	}
	
	
	@Test
	public void testWhenNonFoodTotalIsOneLessThanBoundary() {
		// Arrange, Act, & Assert
		assertThrows(IllegalArgumentException.class, () -> {
			new GroceryBill("DeonMart", 15, -1);
				});
	}

	
	@Test
	public void testWhenNonFoodTotalIsAtBoundary() {
		// Arrange & Act
		GroceryBill bill = new GroceryBill("DeonMart", 15, 0);
				// Assert
		assertEquals("DeonMart", bill.getStoreName());
		assertEquals(15, bill.getFoodTotal());
		assertEquals(0, bill.getNonFoodTotal());
	}
	

	@Test
	public void testWhenNonFoodTotalIsOneAboveBoundary() {
		// Arrange & Act
		GroceryBill bill = new GroceryBill("DeonMart", 15, 1);
				// Assert
		assertEquals("DeonMart", bill.getStoreName());
		assertEquals(15, bill.getFoodTotal());
		assertEquals(1, bill.getNonFoodTotal());
	}
}
