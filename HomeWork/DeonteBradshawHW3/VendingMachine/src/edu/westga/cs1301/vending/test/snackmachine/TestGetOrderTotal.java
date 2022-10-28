package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestGetOrderTotal {

	@Test
	void emptyOrderShouldHaveZeroTotal() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		assertEquals(0, machine.getOrderTotal(), 0.001);
	}

	@Test
	void shouldCalculateOrderWithOnlyGum() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addGumToOrder(10);
		assertEquals(8, machine.getOrderTotal(), 0.001);
	}
	
	@Test
	void shouldCalculateOrderWithOnlyCandy() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addCandyToOrder(10);
		assertEquals(9.50, machine.getOrderTotal(), 0.001);
	}
	
	@Test
	void shouldCalculateOrderWithOnlyChips() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addChipsToOrder(4);
		assertEquals(5, machine.getOrderTotal(), 0.001);
	}
	
	@Test
	void shouldCalculateOrderWithSomeOfEverything() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addChipsToOrder(4);
		machine.addCandyToOrder(10);
		machine.addGumToOrder(10);
		assertEquals(22.50, machine.getOrderTotal(), 0.001);
	}
}
