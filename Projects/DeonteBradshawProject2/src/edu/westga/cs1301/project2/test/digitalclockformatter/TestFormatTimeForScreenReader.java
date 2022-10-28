package edu.westga.cs1301.project2.test.digitalclockformatter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;
import edu.westga.cs1301.project2.views.DigitalClockFormatter;

class TestFormatTimeForScreenReader {

	@Test
	void testShouldFormatTopOfTheHour() {
		// Arrange
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(16, 00);
		
		// Act
		String actual = formatter.formatTimeForScreenReader(clock);
		
		// Assert
		assertEquals("4 o'clock", actual);
	}
	
	@Test
	void testShouldFormatQuarterPastTheHour() {
		// Arrange
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(16, 15);
		
		// Act
		String actual = formatter.formatTimeForScreenReader(clock);
		
		// Assert
		assertEquals("Quarter-past 4", actual);
	}
	
	@Test
	void testShouldFormatHaftPastTheHour() {
		// Arrange
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(16, 30);
		
		// Act
		String actual = formatter.formatTimeForScreenReader(clock);
		
		// Assert
		assertEquals("Half-past 4", actual);
	}
	
	@Test
	void testShouldFormatQuarterTillTheHour() {
		// Arrange
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(16, 45);
		
		// Act
		String actual = formatter.formatTimeForScreenReader(clock);
		
		// Assert
		assertEquals("Quarter-till 5", actual);
	}
	
	@Test
	void testShouldFormatSomeMinutesPastTheHour() {
		// Arrange
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(16, 17);
		
		// Act
		String actual = formatter.formatTimeForScreenReader(clock);
		
		// Assert
		assertEquals("17-past 4", actual);
	}
	
	@Test
	void testShouldFormatSomeMinutesTillTheHour() {
		// Arrange
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(16, 37);
		
		// Act
		String actual = formatter.formatTimeForScreenReader(clock);
		
		// Assert
		assertEquals("23-till 5", actual);
	}

}
