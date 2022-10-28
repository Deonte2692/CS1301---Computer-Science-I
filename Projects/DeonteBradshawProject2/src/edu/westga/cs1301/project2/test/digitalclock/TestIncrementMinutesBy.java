package edu.westga.cs1301.project2.test.digitalclock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;

public class TestIncrementMinutesBy {

	@Test
	public void testShouldNotAllowNegativeMinutes() {
		// Arrange: create an AlarmClock with the appropriate hour
		DigitalClock clock = new DigitalClock(0, 30);
		
		assertThrows(IllegalArgumentException.class, () -> {
			clock.incrementMinutesBy(-1);
		});
	}
	
	@Test
	public void testShouldIncrementMinutesByZero() {
		// Arrange: create an AlarmClock with the appropriate minutes
		DigitalClock clock = new DigitalClock(10, 7);
		
		// Act: increment the minutes
		clock.incrementMinutesBy(0);
		
		// Assert: that the actual minutes matches our expected minutes
		assertEquals(7, clock.getMinutes());
	}
	
	@Test
	public void testShouldIncrementMinutesWithoutRollover() {
		// Arrange: create an AlarmClock with the appropriate minutes
		DigitalClock clock = new DigitalClock(10, 44);
		
		// Act: increment the minutes
		clock.incrementMinutesBy(10);
		
		// Assert: that the actual minutes matches our expected minutes
		assertEquals(54, clock.getMinutes());
	}
	
	@Test
	public void testShouldIncrementMinutesAtRolloverBoundary() {
		// Arrange: create an AlarmClock with the appropriate minutes
		DigitalClock clock = new DigitalClock(10, 59);
		
		// Act: increment the minutes
		clock.incrementMinutesBy(1);
		
		// Assert: that the actual minutes matches our expected minutes
		assertAll(
				() -> assertEquals(0, clock.getMinutes()),
				() -> assertEquals(11, clock.getHour())
			);
	}
	
	
	@Test
	public void testShouldIncrementMinutesWithOneRollover() {
		// Arrange: create an AlarmClock with the appropriate minutes
		DigitalClock clock = new DigitalClock(10, 40);
		
		// Act: increment the minutes
		clock.incrementMinutesBy(30);
		
		// Assert: that the actual minutes matches our expected minutes
		assertAll(
				() -> assertEquals(10, clock.getMinutes()),
				() -> assertEquals(11, clock.getHour())
			);
	}
	
	@Test
	public void testShouldIncrementMinutesWithMultipleRollovers() {
		// Arrange: create an AlarmClock with the appropriate minutes
		DigitalClock clock = new DigitalClock(10, 40);
		
		// Act: increment the minutes
		clock.incrementMinutesBy(240);
		
		// Assert: that the actual minutes matches our expected minutes
		assertAll(
				() ->  assertEquals(40, clock.getMinutes()),
				() -> assertEquals(14, clock.getHour())
			);
	}
}
