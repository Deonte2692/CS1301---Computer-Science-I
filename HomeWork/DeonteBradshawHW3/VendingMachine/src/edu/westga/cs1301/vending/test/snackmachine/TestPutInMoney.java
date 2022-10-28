package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestPutInMoney {

	@Test
	void shouldPutInNothing() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.putInMoney(0);
		assertEquals(0, machine.getPaymentTendered(), 0.001);
	}
	
	@Test
	void shouldAddMoneyOnce() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.putInMoney(10);
		assertEquals(10, machine.getPaymentTendered(), 0.001);
	}
	
	@Test
	void shouldAddMoneySeveralTimes() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.putInMoney(1);
		machine.putInMoney(2);
		machine.putInMoney(3);
		assertEquals(6, machine.getPaymentTendered(), 0.001);
	}

}
