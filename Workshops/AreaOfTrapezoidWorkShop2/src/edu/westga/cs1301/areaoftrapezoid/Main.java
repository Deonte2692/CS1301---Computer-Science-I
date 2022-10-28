package edu.westga.cs1301.areaoftrapezoid;

import java.util.Scanner;

/**
 * Program to calculate the area of a trapezoid
 * 
 * @author DeonteB
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// TODO: write your code after this line
		System.out.println("Enter the longBase (a): ");
		double a = keyboard.nextInt();
		System.out.println("Enter the shortBase (b): ");
		double b = keyboard.nextInt();
		System.out.println("Enter the height (h): ");
		double h = keyboard.nextInt();
		double area = ((a+b)/2)*h;
		System.out.println("The trapezoid's area is " + area);
	}

}
