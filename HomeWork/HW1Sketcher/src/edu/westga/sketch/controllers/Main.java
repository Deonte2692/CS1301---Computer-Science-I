package edu.westga.sketch.controllers;

import edu.westga.sketch.view.Gui;

/**
 * Driver for the turtle application.
 * 
 * @author CS 1301
 * @version Spring 2017
 * 
 */
public class Main {

	public static final int WINDOW_SIZE = 750;

	/**
	 * Entry point for the program: creates the GUI object and calls its start
	 * method, which in turn calls its init and run methods.
	 *
	 * @precondition none
	 * @postcondition the GUI has been initialized
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		Gui theGui = new Gui();
		theGui.start(args);
	}

}
