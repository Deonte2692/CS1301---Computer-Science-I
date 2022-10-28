package edu.westga.cs1301.ws9.tests.coordinate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.ws9.model.Coordinate;

public class TestDistanceFrom {

	@Test
	public void distanceFromSamePointShouldBeZero() {
		Coordinate point = new Coordinate(5, 10);
		assertEquals(0, point.distanceFrom(point), 0.001);
	}

	@Test
	public void distanceShouldBeYDifferenceIfPointsHaveSameXValue() {
		Coordinate point1 = new Coordinate(5, 30);
		Coordinate point2 = new Coordinate(5, 10);
		assertEquals(20, point1.distanceFrom(point2), 0.001);
	}
	
	@Test
	public void distanceShouldBeXDifferenceIfPointsHaveSameYValue() {
		Coordinate point1 = new Coordinate(5, 10);
		Coordinate point2 = new Coordinate(-25, 10);
		assertEquals(30, point1.distanceFrom(point2), 0.001);
	}
	
	@Test
	public void shouldCalculateDistanceForPointsWithDifferentXYValues() {
		Coordinate point1 = new Coordinate(5, 10);
		Coordinate point2 = new Coordinate(-12, -20);
		assertEquals(34.482, point1.distanceFrom(point2), 0.001);
	}
}
