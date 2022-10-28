package edu.westga.cs1301.project2.test.digitalclock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;

public class TestIncrementHoursBy {

	@Test
	public void testShouldNotAllowNegativeHours() {
		// Arrange: create an AlarmClock with the appropriate hour
		DigitalClock clock = new DigitalClock(0, 30);
		
		assertThrows(IllegalArgumentException.class, () -> {
			clock.incrementHoursBy(-1);
		});
	}
	
	@Test
	public void testWhenIncrementingByZero() {
		// Arrange: create an AlarmClock with the appropriate hour
		DigitalClock clock = new DigitalClock(0, 30);
		
		// Act: increment the hour
		clock.incrementHoursBy(0);
		
		// Assert: that the actual hour matches our expected hour
		assertEquals(0, clock.getHour());
	}
	
	@Test
	public void testShouldIncrementHoursWithoutRollover() {
		// Arrange: create an AlarmClock with the appropriate hour
		DigitalClock clock = new DigitalClock(3, 30);
		
		// Act: increment the hour
		clock.incrementHoursBy(3);
		
		// Assert: that the actual hour matches our expected hour
		assertEquals(6, clock.getHour());
	}
	
	@Test
	public void testShouldIncrementHoursAtRolloverBoundary() {
		// Arrange: create an AlarmClock with the appropriate hour
		DigitalClock clock = new DigitalClock(23, 30);
		
		// Act: increment the hour
		clock.incrementHoursBy(1);
		
		// Assert: that the actual hour matches our expected hour
		assertEquals(0, clock.getHour());
	}
	
	@Test
	public void testShouldIncrementHoursWithOneRollover() {
		// Arrange: create an AlarmClock with the appropriate hour
		DigitalClock clock = new DigitalClock(22, 30);
		
		// Act: increment the hour
		clock.incrementHoursBy(10);
		
		// Assert: that the actual hour matches our expected hour
		assertEquals(8, clock.getHour());
	}
	
	@Test
	public void testShouldIncrementHoursWithMultipleRollovers() {
		// Arrange: create an AlarmClock with the appropriate hour
		DigitalClock clock = new DigitalClock(22, 30);
		
		// Act: increment the hour
		clock.incrementHoursBy(72);
		
		// Assert: that the actual hour matches our expected hour
		assertEquals(22, clock.getHour());
	}

}
