package edu.westga.cs1301.ws9.tests.coordinate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.ws9.model.Coordinate;

public class TestConstructor {

	@Test
	public void shouldCreateOrigin() {
		Coordinate point = new Coordinate();
		assertEquals(0, point.getXPos(), 0.001);
		assertEquals(0, point.getYPos(), 0.001);
	}
	
	@Test
	public void shouldCreateQuadrantIPoint() {
		Coordinate point = new Coordinate(5, 10);
		assertEquals(5, point.getXPos(), 0.001);
		assertEquals(10, point.getYPos(), 0.001);
	}
	
	@Test
	public void shouldCreateQuadrantIIPoint() {
		Coordinate point = new Coordinate(-5, 10);
		assertEquals(-5, point.getXPos(), 0.001);
		assertEquals(10, point.getYPos(), 0.001);
	}

	@Test
	public void shouldCreateQuadrantIIIPoint() {
		Coordinate point = new Coordinate(-5, -10);
		assertEquals(-5, point.getXPos(), 0.001);
		assertEquals(-10, point.getYPos(), 0.001);
	}
	
	@Test
	public void shouldCreateQuadrantIVPoint() {
		Coordinate point = new Coordinate(5, -10);
		assertEquals(5, point.getXPos(), 0.001);
		assertEquals(-10, point.getYPos(), 0.001);
	}
}
