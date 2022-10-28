package edu.westga.cs1301.project2.test.digitalclock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;

public class TestIncrementSecondsBy {

	@Test
	public void testShouldIncrementSecondsByZero() {
		// Arrange: create an AlarmClock (defaults to 0 seconds)
		DigitalClock clock = new DigitalClock(10, 2);
		
		// Act: increment the seconds
		clock.incrementSecondsBy(0);
		
		// Assert: that the actual seconds matches our expected seconds
		assertAll(
				() -> assertEquals(10, clock.getHour()),
				() -> assertEquals(2, clock.getMinutes()),
				() -> assertEquals(0, clock.getSeconds())
			);
	}
	
	@Test
	public void testShouldIncrementSecondsByOne() {
		// Arrange: create an AlarmClock (defaults to 0 seconds)
		DigitalClock clock = new DigitalClock(10, 0);
		
		// Act: increment the seconds several times
		clock.incrementSecondsBy(1);
		
		// Assert: that the actual seconds matches our expected seconds
		assertAll(
				() -> assertEquals(10, clock.getHour()),
				() -> assertEquals(0, clock.getMinutes()),
				() -> assertEquals(1, clock.getSeconds())
			);
	}
	
	@Test
	public void testShouldIncrementSecondsWithNoRollover() {
		// Arrange: create an AlarmClock (defaults to 0 seconds)
		DigitalClock clock = new DigitalClock(10, 0);
		
		// Act: increment the seconds several times
		clock.incrementSecondsBy(30);
		
		// Assert: that the actual seconds matches our expected seconds
		assertAll(
				() -> assertEquals(10, clock.getHour()),
				() -> assertEquals(0, clock.getMinutes()),
				() -> assertEquals(30, clock.getSeconds())
			);
	}
	
	@Test
	public void testShouldIncrementSecondsWithOneMinutesRollover() {
		// Arrange: create an AlarmClock (defaults to 0 seconds)
		DigitalClock clock = new DigitalClock(10, 0);
		
		// Act: increment the seconds several times
		clock.incrementSecondsBy(70);
		
		// Assert: that the actual seconds matches our expected seconds
		assertAll(
				() -> assertEquals(10, clock.getHour()),
				() -> assertEquals(1, clock.getMinutes()),
				() -> assertEquals(10, clock.getSeconds())
			);
	}
	
	@Test
	public void testShouldIncrementSecondsWithMultipleMinutesRollovers() {
		// Arrange: create an AlarmClock (defaults to 0 seconds)
		DigitalClock clock = new DigitalClock(10, 0);
		
		// Act: increment the seconds several times
		clock.incrementSecondsBy(370);
		
		// Assert: that the actual seconds matches our expected seconds
		assertAll(
				() -> assertEquals(10, clock.getHour()),
				() -> assertEquals(6, clock.getMinutes()),
				() -> assertEquals(10, clock.getSeconds())
			);
	}
	
	@Test
	public void testShouldIncrementSecondsWithOneHourRollover() {
		// Arrange: create an AlarmClock (defaults to 0 seconds)
		DigitalClock clock = new DigitalClock(10, 0);
		
		// Act: increment the seconds several times
		clock.incrementSecondsBy(3600);
		
		// Assert: that the actual seconds matches our expected seconds
		assertAll(
				() -> assertEquals(11, clock.getHour()),
				() -> assertEquals(0, clock.getMinutes()),
				() -> assertEquals(0, clock.getSeconds())
			);
	}
	
	@Test
	public void testShouldIncrementSecondsWithMultipleHourRollovers() {
		// Arrange: create an AlarmClock (defaults to 0 seconds)
		DigitalClock clock = new DigitalClock(10, 0);
		
		// Act: increment the seconds several times
		clock.incrementSecondsBy(14400 + 1);
		
		// Assert: that the actual seconds matches our expected seconds
		assertAll(
				() -> assertEquals(14, clock.getHour()),
				() -> assertEquals(0, clock.getMinutes()),
				() -> assertEquals(1, clock.getSeconds())
			);
	}

}
