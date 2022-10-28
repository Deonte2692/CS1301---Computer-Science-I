package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestAddGumToOrder {

	@Test
	void shouldAddZeroChips() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addGumToOrder(0);
		assertEquals(0, machine.getGumInOrder());
	}
	
	@Test
	void shouldAddChipsOnce() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addGumToOrder(10);
		assertEquals(10, machine.getGumInOrder());
	}
	
	@Test
	void shouldAddChipsMultipleTimes() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addGumToOrder(1);
		machine.addGumToOrder(2);
		machine.addGumToOrder(3);
		assertEquals(6, machine.getGumInOrder());
	}

}
