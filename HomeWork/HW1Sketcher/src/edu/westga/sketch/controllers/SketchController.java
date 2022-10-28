package edu.westga.sketch.controllers;

import edu.westga.sketch.model.Turtle;

/**
 * Uses turtle objects to draw on the screen.
 * 
 * @author CS 1301
 * @version Spring 2017
 */
public class SketchController {
	private Turtle bigTurtle;

	/**
	 * Creates and initializes a new SketchController object.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public SketchController() {
		this.bigTurtle = new Turtle();
		
	}

	/**
	 * Draws a figure on the screen using the big turtle.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void draw() {
		bigTurtle.setLocation(75,75);
		bigTurtle.lowerTail();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnRight90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnLeft90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnRight90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnRight90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnRight90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnLeft90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnRight90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnRight90();
		bigTurtle.raiseTail();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnRight90();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.stepForward();
		bigTurtle.turnLeft90();

		

		// TODO Add the code to have the big turtle draw the two squares
	}

}