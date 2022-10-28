package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestAddCandyToOrder {

	@Test
	void shouldAddZeroCandies() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addCandyToOrder(0);
		assertEquals(0, machine.getCandyInOrder());
	}
	
	@Test
	void shouldAddCandyOnce() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addCandyToOrder(10);
		assertEquals(10, machine.getCandyInOrder());
	}
	
	@Test
	void shouldAddCandyMultipleTimes() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addCandyToOrder(1);
		machine.addCandyToOrder(2);
		machine.addCandyToOrder(3);
		assertEquals(6, machine.getCandyInOrder());
	}

}
