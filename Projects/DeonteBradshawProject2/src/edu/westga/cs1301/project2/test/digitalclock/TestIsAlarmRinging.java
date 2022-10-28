package edu.westga.cs1301.project2.test.digitalclock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.project2.model.DigitalClock;

public class TestIsAlarmRinging {

	@Test
	public void testShouldNotBeRingingIfAlarmIsOff() {
		// Arrange
		DigitalClock clock = new DigitalClock(7, 00);
		clock.setAlarmFor(8, 00);
		clock.turnOffAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertFalse(actual);
	}
	
	@Test
	public void testShouldNotBeRingingOneMinutePriorToAlarmTime() {
		// Arrange
		DigitalClock clock = new DigitalClock(7, 59);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertFalse(actual);
	}
	
	@Test
	public void testShouldBeRingingOneAtExactlyAlarmTime() {
		// Arrange
		DigitalClock clock = new DigitalClock(8, 00);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertTrue(actual);
	}
	
	@Test
	public void testShouldBeRingingOneMinutePastAlarmTime() {
		// Arrange
		DigitalClock clock = new DigitalClock(8, 01);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertTrue(actual);
	}
	
	@Test
	public void testShouldBeRingingOneMinutePriorToTimeout() {
		// Arrange
		DigitalClock clock = new DigitalClock(9, 59);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertTrue(actual);
	}
	
	@Test
	public void testShouldNotBeRingingRightAtTimeout() {
		// Arrange
		DigitalClock clock = new DigitalClock(10, 00);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertFalse(actual);
	}
	
	@Test
	public void testShouldNotBeRingingOneMinutePastTimeout() {
		// Arrange
		DigitalClock clock = new DigitalClock(10, 01);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertFalse(actual);
	}

	@Test
	public void testShouldNotBeRingingOneHourPriorToAlarmTime() {
		// Arrange
		DigitalClock clock = new DigitalClock(7, 00);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertFalse(actual);
	}
	
	@Test
	public void testShouldBeRingingOneHourPastAlarmTime() {
		// Arrange
		DigitalClock clock = new DigitalClock(9, 00);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertTrue(actual);
	}
	
	@Test
	public void testShouldNotBeRingingOneHourPastTimeout() {
		// Arrange
		DigitalClock clock = new DigitalClock(11, 00);
		clock.setAlarmFor(8, 00);
		clock.turnOnAlarm();
		
		// Act
		boolean actual = clock.isAlarmRinging();
		
		// Assert
		assertFalse(actual);
	}
}
