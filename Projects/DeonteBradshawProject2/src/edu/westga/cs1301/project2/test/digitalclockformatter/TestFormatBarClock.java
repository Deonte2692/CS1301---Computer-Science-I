package edu.westga.cs1301.project2.test.digitalclockformatter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;
import edu.westga.cs1301.project2.views.DigitalClockFormatter;

class TestFormatBarClock {

	@Test
	void testShouldFormatTheTime() {
		// Arrange
		DigitalClock clock = new DigitalClock(17, 38);
		DigitalClockFormatter formatter = new DigitalClockFormatter();
		
		// Act
		String actual = formatter.formatBarClock(clock);
		
		// Assert
		String expected = "H:=====\nM:#######...\nPM";
		assertEquals(expected, actual);
	}

}
