package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestConstructor {

	@Test
	void testShouldCreateSnackMachine() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		assertAll(
			() -> assertEquals(0.80, machine.getGumPrice(), 0.001),
			() -> assertEquals(0, machine.getGumInOrder()),
			
			() -> assertEquals(0.95, machine.getCandyPrice(), 0.001),
			() -> assertEquals(0, machine.getCandyInOrder()),
			
			() -> assertEquals(1.25, machine.getChipsPrice(), 0.001),
			() -> assertEquals(0, machine.getChipsInOrder()),
			
			() -> assertEquals(0, machine.getTotalSales()),
			() -> assertEquals(0, machine.getPaymentTendered())
		);
	}

}
