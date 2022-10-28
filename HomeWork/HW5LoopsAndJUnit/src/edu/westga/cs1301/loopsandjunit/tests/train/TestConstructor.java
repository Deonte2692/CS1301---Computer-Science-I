package edu.westga.cs1301.loopsandjunit.tests.train;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs1301.loopsandjunit.model.Train;

public class TestConstructor {

	public void testLowerThanMinimum(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Train(-1);

	});}
	public void testEqualToMinimum(){
		Train train = new Train(0);
		assertEquals(0, train.getNumCars());


	}
	public void testHigherThanMinimum(){
		Train train = new Train(1);
		assertEquals(1, train.getNumCars());


	}
}
