package edu.westga.cs1301.loopsandjunit.tests.train;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.loopsandjunit.model.Train;

public class TestGetUnicodeString { 
	@Test
	public void testZeroCars() {
		Train train = new Train(0);
		assertEquals("🚂🚌", train.getUnicodeString());
	}
	@Test
	public void testOneCar() {
		Train train = new Train(1);
		assertEquals("🚂🚃🚌", train.getUnicodeString());
	}
	@Test
	public void testSeveralCars() {
		Train train = new Train(5);
		assertEquals("🚂🚃🚃🚃🚃🚃🚌", train.getUnicodeString());
	}

}
