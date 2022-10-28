package edu.westga.sketch.controllers;

import edu.westga.sketch.model.Turtle;

/**
 * Uses turtle objects to draw on the screen.
 * 
 * @author CS 1301
 * @version Fall 2022
 */
public class SketchController {
	private Turtle bigTurtle;
	private Turtle littleTurtle;


	/**
	 * Creates and initializes a new SketchController object.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 */
	public SketchController() {
		this.bigTurtle = new Turtle();
		this.littleTurtle = new Turtle();
		this.littleTurtle.decreaseTurtleSizeBy10();
		this.littleTurtle.decreaseTurtleSizeBy10();
		this.bigTurtle.increaseTurtleSizeBy10();
		
	}

	/**
	 * Draws a figure on the screen using the big turtle.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void draw() {
		
		turtleStartsPosition();

		turtleDrawsSquare();
		
		turtleRestartsPosition();
	
		turtleDrawsSquare();
		
		turtleBabyStartsPosition();

		turtleBabyDrawsSquare();
		
		turtleBabyRestartsPosition();
	
		turtleBabyDrawsSquare();
		
			}
	
	public void turtleStartsPosition(){
		this.bigTurtle.stepForward();
		this.bigTurtle.turnRight90();
		this.bigTurtle.stepForward();
		this.bigTurtle.turnLeft90();
	}
	
	public void turtleDrawsSquare() {
		this.bigTurtle.lowerTail();
		
		turtleForwardSix();
		this.bigTurtle.turnRight90();
		
		turtleForwardSix();
		this.bigTurtle.turnRight90();

		turtleForwardSix();
		this.bigTurtle.turnRight90();
		
		turtleForwardSix();
		this.bigTurtle.turnRight90();
		
		this.bigTurtle.raiseTail();
	}
	
	public void turtleRestartsPosition() {
		this.bigTurtle.raiseTail();
		
		turtleForwardSix();
		this.bigTurtle.turnRight90();
		
		turtleForwardSix();
		this.bigTurtle.turnLeft90();

	}
	
	public void turtleForwardSix() {
		this.bigTurtle.stepForward();
		this.bigTurtle.stepForward();
		this.bigTurtle.stepForward();
		this.bigTurtle.stepForward();
		this.bigTurtle.stepForward();
		this.bigTurtle.stepForward();
	}
	
	public void turtleBabyStartsPosition(){
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.turnRight90();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.turnLeft90();
	}
	
	public void turtleBabyDrawsSquare() {
		this.littleTurtle.lowerTail();
		
		turtleBabyForwardTen();
		this.littleTurtle.turnRight90();
		
		turtleBabyForwardTen();
		this.littleTurtle.turnRight90();

		turtleBabyForwardTen();
		this.littleTurtle.turnRight90();
		
		turtleBabyForwardTen();
		this.littleTurtle.turnRight90();
		
		this.littleTurtle.raiseTail();
	}
	
	public void turtleBabyRestartsPosition() {
		this.littleTurtle.raiseTail();
		
		turtleBabyForwardTen();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.turnRight90();
		
		turtleBabyForwardTen();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.turnLeft90();

	}
	
	public void turtleBabyForwardTen() {
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
		this.littleTurtle.stepForward();
	}


}


