package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestAddChipsToOrder {

	@Test
	void shouldAddZeroChips() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addChipsToOrder(0);
		assertEquals(0, machine.getChipsInOrder());
	}
	
	@Test
	void shouldAddChipsOnce() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addChipsToOrder(10);
		assertEquals(10, machine.getChipsInOrder());
	}
	
	@Test
	void shouldAddChipsMultipleTimes() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addChipsToOrder(1);
		machine.addChipsToOrder(2);
		machine.addChipsToOrder(3);
		assertEquals(6, machine.getChipsInOrder());
	}

}
