package edu.westga.cs1301.project2.test.digitalclock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;

public class TestMinutesSince {

	@Test
	public void shouldTestAtOneBelowMinHour() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(14, 30);
		
		// ACT
		// ASSERT
		assertThrows(IllegalArgumentException.class,
				() -> clock.minutesSince(-1, 45)
			);
	}
	
	@Test
	public void shouldTestAtMinHour() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(2, 0);
				
		// ACT
		int actual = clock.minutesSince(1, 0);
		
		// ASSERT
		assertEquals(60, actual);
	}
	
	@Test
	public void shouldTestAtOneAboveMinHour() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(4, 0);
				
		// ACT
		int actual = clock.minutesSince(2, 0);
		
		// ASSERT
		assertEquals(120, actual);
	}
	
	@Test
	public void shouldTestAtOneBelowMaxHour() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(23, 0);
				
		// ACT
		int actual = clock.minutesSince(22, 0);
		
		// ASSERT
		assertEquals(60, actual);
	}
	
	@Test
	public void shouldTestAtMaxHour() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(23, 10);
				
		// ACT
		int actual = clock.minutesSince(23, 0);
		
		// ASSERT
		assertEquals(10, actual);
	}
	
	@Test
	public void shouldTestAtOneAboveMaxHour() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(1, 30);
		
		// ACT
		// ASSERT
		assertThrows(IllegalArgumentException.class,
				() -> clock.minutesSince(24, 45)
			);
	}
	
	@Test
	public void shouldTestAtOneBelowMinMinutes() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(14, 30);
		
		// ACT
		// ASSERT
		assertThrows(IllegalArgumentException.class,
				() -> clock.minutesSince(14, -1)
			);
	}
	
	@Test
	public void shouldTestAtMinMinutes() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(1, 10);
				
		// ACT
		int actual = clock.minutesSince(1, 0);
		
		// ASSERT
		assertEquals(10, actual);
	}
	
	@Test
	public void shouldTestAtOneAboveMinMinutes() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(1, 10);
				
		// ACT
		int actual = clock.minutesSince(1, 1);
		
		// ASSERT
		assertEquals(9, actual);
	}
	
	@Test
	public void shouldTestAtOneBelowMaxMinutes() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(2, 10);
				
		// ACT
		int actual = clock.minutesSince(1, 58);
		
		// ASSERT
		assertEquals(12, actual);
	}
	
	@Test
	public void shouldTestAtMaxMinutes() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(2, 10);
				
		// ACT
		int actual = clock.minutesSince(1, 59);
		
		// ASSERT
		assertEquals(11, actual);
	}
	
	@Test
	public void shouldTestAtOneAboveMaxMinutes() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(14, 30);
		
		// ACT
		// ASSERT
		assertThrows(IllegalArgumentException.class,
				() -> clock.minutesSince(14, 60)
			);
	}

	@Test
	public void shouldTestWithinSameHourNoDayRollover() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(2, 50);
				
		// ACT
		int actual = clock.minutesSince(2, 30);
		
		// ASSERT
		assertEquals(20, actual);
	}
	
	@Test
	public void shouldTestWithinSameHourWithDayRollover() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(2, 30);
				
		// ACT
		int actual = clock.minutesSince(2, 50);
		
		// ASSERT
		assertEquals(1420, actual);
	}
	
	@Test
	public void shouldTestAcrossMultipleHoursNoDayRollover() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(5, 30);
				
		// ACT
		int actual = clock.minutesSince(2, 50);
		
		// ASSERT
		assertEquals(160, actual);
	}
	
	@Test
	public void shouldTestAcrossMultipleHoursWithDayRollover() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(2, 30);
				
		// ACT
		int actual = clock.minutesSince(5, 50);
		
		// ASSERT
		assertEquals(20 * 60 + 40, actual);
	}
	
	@Test
	public void shouldTestWhenNoElapsedTime() {
		// ARRANGE
		DigitalClock clock = new DigitalClock(2, 30);
				
		// ACT
		int actual = clock.minutesSince(2, 30);
		
		// ASSERT
		assertEquals(0, actual);
	}
}
