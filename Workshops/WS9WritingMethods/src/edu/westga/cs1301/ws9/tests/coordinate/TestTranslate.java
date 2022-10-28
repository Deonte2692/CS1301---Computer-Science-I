package edu.westga.cs1301.ws9.tests.coordinate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.ws9.model.Coordinate;

public class TestTranslate {

	@Test
	public void shouldNotChange() {
		Coordinate point = new Coordinate(5, 10);
		point.translate(0, 0);
		assertEquals(5, point.getXPos());
		assertEquals(10, point.getYPos());
	}

	@Test
	public void shouldTranslatePositiveX() {
		Coordinate point = new Coordinate(5, 10);
		point.translate(20, 0);
		assertEquals(25, point.getXPos());
		assertEquals(10, point.getYPos());
	}
	
	@Test
	public void shouldTranslateNegativeX() {
		Coordinate point = new Coordinate(5, 10);
		point.translate(-20, 0);
		assertEquals(-15, point.getXPos());
		assertEquals(10, point.getYPos());
	}
	
	@Test
	public void shouldTranslatePositiveY() {
		Coordinate point = new Coordinate(5, 10);
		point.translate(0, 55);
		assertEquals(5, point.getXPos());
		assertEquals(65, point.getYPos());
	}
	
	@Test
	public void shouldTranslateNegativeY() {
		Coordinate point = new Coordinate(5, 10);
		point.translate(0, -55);
		assertEquals(5, point.getXPos());
		assertEquals(-45, point.getYPos());
	}
	
	@Test
	public void shouldTranslateToNewXAndY() {
		Coordinate point = new Coordinate(5, 10);
		point.translate(12, -80);
		assertEquals(17, point.getXPos());
		assertEquals(-70, point.getYPos());
	}
}
