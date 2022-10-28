package edu.westga.cs1301.project2.test.digitalclockformatter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;
import edu.westga.cs1301.project2.views.DigitalClockFormatter;

public class TestFindAmVsPm {

	@Test
	public void testShouldNotAllowNullClock() {
		// Arrange: create the formatter object
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		
		// Act & Assert: call the method with null and assert
		// it throws the exception
		assertThrows(IllegalArgumentException.class, () -> {
			formatter.findAmVsPm(null);
		});
	}
	
	@Test
	public void testShouldBeAmAtMidnight() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(00, 00);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.findAmVsPm(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("AM", actual);
	}
	
	@Test
	public void testShouldBeAmAt0100() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(01, 00);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.findAmVsPm(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("AM", actual);
	}
	
	@Test
	public void testShouldBeAmAt1100() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(11, 00);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.findAmVsPm(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("AM", actual);
	}
	
	@Test
	public void testShouldBePmAtNoon() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(12, 00);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.findAmVsPm(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("PM", actual);
	}

	@Test
	public void testShouldBePmAt1300() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(13, 00);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.findAmVsPm(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("PM", actual);
	}
	
	@Test
	public void testShouldBePmAt2300() {
		// Arrange: create formatter and alarm clock objects
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		DigitalClock clock = new DigitalClock(23, 00);
		
		// Act call the method using the given clock as parameter
		String actual = formatter.findAmVsPm(clock);
		
		// Assert: that the time has been properly formatted
		assertEquals("PM", actual);
	}
}
