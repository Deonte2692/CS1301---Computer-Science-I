package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestCompleteOrder {

	@Test
	void shouldMakeASaleWithoutChange() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addGumToOrder(5);
		machine.addCandyToOrder(10);
		machine.addChipsToOrder(2);
		double expectedTotal = 5*0.8 + 10*0.95 + 2*1.25;
		machine.putInMoney(expectedTotal);
		double change = machine.completeOrder();
		
		assertAll(
			() -> assertEquals(0, change, 0.001),
			() -> assertEquals(expectedTotal, machine.getTotalSales()),
			() -> assertEquals(0, machine.getGumInOrder()),
			() -> assertEquals(0, machine.getCandyInOrder()),
			() -> assertEquals(0, machine.getChipsInOrder()),
			() -> assertEquals(0, machine.getPaymentTendered(), 0.001)
				);
	}
	
	@Test
	void shouldMakeASaleWitChange() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.addGumToOrder(5);
		machine.addCandyToOrder(10);
		machine.addChipsToOrder(2);
		double expectedTotal = 5*0.8 + 10*0.95 + 2*1.25;
		machine.putInMoney(expectedTotal + 20);
		double change = machine.completeOrder();
		
		assertAll(
			() -> assertEquals(20, change, 0.001),
			() -> assertEquals(expectedTotal, machine.getTotalSales()),
			() -> assertEquals(0, machine.getGumInOrder()),
			() -> assertEquals(0, machine.getCandyInOrder()),
			() -> assertEquals(0, machine.getChipsInOrder()),
			() -> assertEquals(0, machine.getPaymentTendered(), 0.001)
				);
	}

}
