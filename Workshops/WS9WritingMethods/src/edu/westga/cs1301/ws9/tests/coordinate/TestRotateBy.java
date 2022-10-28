package edu.westga.cs1301.ws9.tests.coordinate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.ws9.model.Coordinate;

public class TestRotateBy {

	@Test
	public void rotationShouldNotChangeTheOrigin() {
		Coordinate point = new Coordinate();
		point.rotateBy(123);
		assertEquals(0, point.getXPos(), 0.001);
		assertEquals(0, point.getYPos(), 0.001);
	}
	
	
	@Test
	public void rotationBy360DegreesShouldNotChangePosition() {
		Coordinate point = new Coordinate(10, 20);
		point.rotateBy(360);
		assertEquals(10, point.getXPos(), 0.001);
		assertEquals(20, point.getYPos(), 0.001);
	}
	
	@Test
	public void shouldRotateThePoint() {
		Coordinate point = new Coordinate(10, 20);
		point.rotateBy(123);
		assertEquals(-22.219, point.getXPos(), 0.001);
		assertEquals(-2.506, point.getYPos(), 0.001);
	}
}
