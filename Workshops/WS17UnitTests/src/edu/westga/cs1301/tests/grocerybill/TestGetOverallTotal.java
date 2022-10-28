package edu.westga.cs1301.tests.grocerybill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.wsunittests.model.GroceryBill;

public class TestGetOverallTotal {

	@Test
	public void testWhenFoodTotalIsZero() {
		// Arrange & Act
				GroceryBill bill = new GroceryBill("DeonMart", 0, 15);
						// Assert
				assertEquals("DeonMart", bill.getStoreName());
				assertEquals(0, bill.getFoodTotal());
				assertEquals(15, bill.getNonFoodTotal());
	}
	
	@Test
	public void testWhenNonFoodTotalIsZero() {
		// Arrange & Act
				GroceryBill bill = new GroceryBill("DeonMart", 15, 0);
						// Assert
				assertEquals("DeonMart", bill.getStoreName());
				assertEquals(15, bill.getFoodTotal());
				assertEquals(0, bill.getNonFoodTotal());
	}

	@Test
	public void testWhenBothTotalsAreNonZero() {
		// Arrange & Act
		GroceryBill bill = new GroceryBill("DeonMart", 0, 0);
				// Assert
		assertEquals("DeonMart", bill.getStoreName());
		assertEquals(0, bill.getFoodTotal());
		assertEquals(0, bill.getNonFoodTotal());
	}
}
