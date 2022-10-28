package edu.westga.cs1301.project2.test.digitalclock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;

public class TestConstructor {


	@Test
	public void testShouldNotAllowHourLessThanZero() {
		// Arrange, Act, and Assert: create the AlarmClock object
		// with a bad hour value
		assertThrows(IllegalArgumentException.class, () -> {
			new DigitalClock(-1, 45);
		});
	}
	
	@Test
	public void testShouldNotAllowHourGreaterThan23() {
		// Arrange, Act, and Assert: create the AlarmClock object
		// with a bad hour value
		assertThrows(IllegalArgumentException.class, () -> {
			new DigitalClock(24, 45);
		});
	}
	
	@Test
	public void testShouldNotAllowMinutesLessThanZero() {
		// Arrange, Act, and Assert: create the AlarmClock object
		// with a bad minutes value
		assertThrows(IllegalArgumentException.class, () -> {
			new DigitalClock(12, -1);
		});
	}
	
	@Test
	public void testShouldNotAllowMinutesGreaterThan59() {
		// Arrange, Act, and Assert: create the AlarmClock object
		// with a bad minutes value
		assertThrows(IllegalArgumentException.class, () -> {
			new DigitalClock(12, 60);
		});
	}
	
	@Test
	public void testShouldCreateAtHourZero() {
		// Arrange & Act: create the AlarmClock object
		DigitalClock clock = new DigitalClock(0, 45);
		
		// Assert: that its initial values are correct
		assertEquals(0, clock.getHour());
		assertEquals(45, clock.getMinutes());
	}
	
	@Test
	public void testShouldCreateAtHour23() {
		// Arrange & Act: create the AlarmClock object
		DigitalClock clock = new DigitalClock(23, 45);
		
		// Assert: that its initial values are correct
		assertEquals(23, clock.getHour());
		assertEquals(45, clock.getMinutes());
	}
	
	@Test
	public void testShouldCreateAtMinutesZero() {
		// Arrange & Act: create the AlarmClock object
		DigitalClock clock = new DigitalClock(12, 0);
		
		// Assert: that its initial values are correct
		assertEquals(12, clock.getHour());
		assertEquals(0, clock.getMinutes());
	}
	
	@Test
	public void testShouldCreateAtMinutes59() {
		// Arrange & Act: create the AlarmClock object
		DigitalClock clock = new DigitalClock(12, 59);
		
		// Assert: that its initial values are correct
		assertEquals(12, clock.getHour());
		assertEquals(59, clock.getMinutes());
	}
	
	@Test
	public void testShouldCreateWithTwoParamConstructor() {
		// Arrange & Act: create the AlarmClock object
		DigitalClock clock = new DigitalClock(8, 45);
		
		// Assert: that its initial values are correct
		assertEquals(8, clock.getHour());
		assertEquals(45, clock.getMinutes());
	}
}
