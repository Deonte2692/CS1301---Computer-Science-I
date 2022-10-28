package edu.westga.cs1301.ws9.tests.coordinate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.ws9.model.Coordinate;

public class TestReflect {

	@Test
	public void originShouldNotChange() {
		Coordinate point = new Coordinate();
		point.reflect(123);
		assertEquals(0, point.getXPos(), 0.001);
		assertEquals(0, point.getYPos(), 0.001);
	}

	@Test
	public void shouldReflectAboutTheXAxis() {
		Coordinate point = new Coordinate(5, 10);
		point.reflect(0);
		assertEquals(5, point.getXPos(), 0.001);
		assertEquals(-10, point.getYPos(), 0.001);
	}
	
	@Test
	public void shouldReflectAboutTheYAxis() {
		Coordinate point = new Coordinate(5, 10);
		point.reflect(90);
		assertEquals(-5, point.getXPos(), 0.001);
		assertEquals(10, point.getYPos(), 0.001);
	}
	
	@Test
	public void shouldReflectAboutALine() {
		Coordinate point = new Coordinate(5, 10);
		point.reflect(45);
		assertEquals(10, point.getXPos(), 0.001);
		assertEquals(5, point.getYPos(), 0.001);
	}
}
