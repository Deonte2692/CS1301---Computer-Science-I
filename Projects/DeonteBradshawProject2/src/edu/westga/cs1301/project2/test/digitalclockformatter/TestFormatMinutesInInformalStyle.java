package edu.westga.cs1301.project2.test.digitalclockformatter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;
import edu.westga.cs1301.project2.views.DigitalClockFormatter;

public class TestFormatMinutesInInformalStyle {

	@Test
	public void testShouldNotAllowNullClock() {
		// Arrange: create the formatter object
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		
		// Act & Assert: call the method with null and assert
		// it throws the exception
		assertThrows(IllegalArgumentException.class, () -> {
			formatter.formatMinutesInInformalStyle(null);
		});
	}
	
	@Test
	public void testShouldFormaOnTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 00);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("On-the-hour", actual);
	}
	
	@Test
	public void testShouldFormatAtOnePastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 01);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("1-past", actual);
	}

	@Test
	public void testShouldFormatAt14PastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 14);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("14-past", actual);
	}
	
	@Test
	public void testShouldFormatAtQuarterPastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 15);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("Quarter-past", actual);
	}
	
	@Test
	public void testShouldFormatAt16PastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 16);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("16-past", actual);
	}
	
	@Test
	public void testShouldFormatAt29PastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 29);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("29-past", actual);
	}
	
	@Test
	public void testShouldFormatAtHalfPastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 30);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("Half-past", actual);
	}
	
	@Test
	public void testShouldFormatAt31PastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 31);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("29-till", actual);
	}
	
	@Test
	public void testShouldFormatAt44PastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 44);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("16-till", actual);
	}
	
	@Test
	public void testShouldFormatAtQuarterTillTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 45);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("Quarter-till", actual);
	}
	
	@Test
	public void testShouldFormatAt46PastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 46);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("14-till", actual);
	}
	
	@Test
	public void testShouldFormatAt59PastTheHour() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(4, 59);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.formatMinutesInInformalStyle(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("1-till", actual);
	}
}
