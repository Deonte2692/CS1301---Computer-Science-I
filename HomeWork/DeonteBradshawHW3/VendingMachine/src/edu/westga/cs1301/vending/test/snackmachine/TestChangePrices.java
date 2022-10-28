package edu.westga.cs1301.vending.test.snackmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.vending.model.SnackMachine;

class TestChangePrices {

	@Test
	void shouldNotChangeAnyPrices() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.changePrices(0.80, 0.95, 1.25);
		assertAll(
			() -> assertEquals(0.80, machine.getGumPrice(), 0.001),
			() -> assertEquals(0.95, machine.getCandyPrice(), 0.001),
			() -> assertEquals(1.25, machine.getChipsPrice(), 0.001)
		);
	}
	
	@Test
	void shouldOnlyChangeGumPrice() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.changePrices(2, 0.95, 1.25);
		assertAll(
			() -> assertEquals(2, machine.getGumPrice(), 0.001),
			() -> assertEquals(0.95, machine.getCandyPrice(), 0.001),
			() -> assertEquals(1.25, machine.getChipsPrice(), 0.001)
		);
	}
	
	@Test
	void shouldOnlyChangeCandyPrice() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.changePrices(0.80, 2, 1.25);
		assertAll(
			() -> assertEquals(0.80, machine.getGumPrice(), 0.001),
			() -> assertEquals(2, machine.getCandyPrice(), 0.001),
			() -> assertEquals(1.25, machine.getChipsPrice(), 0.001)
		);
	}
	
	@Test
	void shouldOnlyChangeChipsPrice() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.changePrices(0.80, 0.95, 2);
		assertAll(
			() -> assertEquals(0.80, machine.getGumPrice(), 0.001),
			() -> assertEquals(0.95, machine.getCandyPrice(), 0.001),
			() -> assertEquals(2, machine.getChipsPrice(), 0.001)
		);
	}
	
	@Test
	void shouldChangeAllPrices() {
		SnackMachine machine = new SnackMachine(0.80, 0.95, 1.25);
		machine.changePrices(10, 20, 30);
		assertAll(
			() -> assertEquals(10, machine.getGumPrice(), 0.001),
			() -> assertEquals(20, machine.getCandyPrice(), 0.001),
			() -> assertEquals(30, machine.getChipsPrice(), 0.001)
		);
	}
}
