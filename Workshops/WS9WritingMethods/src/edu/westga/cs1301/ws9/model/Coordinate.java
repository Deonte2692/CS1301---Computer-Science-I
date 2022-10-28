package edu.westga.cs1301.ws9.model;

public class Coordinate {
	private double xPos;
	private double yPos;
	
public	Coordinate(){
		this.xPos = 0.0;
		this.yPos = 0.0;
		
	}
	
public	Coordinate(double x, double y){
		this.xPos = x;
		this.yPos = y;
	}
	
public void translate(double x, double y) {
	this.xPos = this.xPos + x;
	this.yPos = this.yPos + y;
}


public double distanceFrom(Coordinate anotherCoordinate) {
	double x1 = this.xPos;
	double y1 = this.yPos;
	double x2 = anotherCoordinate.getXPos();
	double y2 = anotherCoordinate.getYPos();
	double d = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
	double distance =  Math.sqrt(d);
	return distance;
}


public void rotateBy(double degrees) {
	double radian = Math.toRadians(degrees);
	double x = this.xPos;
	double y = this.yPos;
	double x1 = (x*(Math.cos(radian))) -  (y*(Math.sin(radian)));
	double y1 = (x*(Math.sin(radian))) +  (y*(Math.cos(radian)));
	this.xPos = x1;
	this.yPos = y1;
}


public void reflect(int degrees) {
	double radian = Math.toRadians(degrees);
	double x = this.xPos;
	double y = this.yPos;
	double x1 = (x*(Math.cos(2*radian))) +  (y*(Math.sin(2*radian)));
	double y1 = (x*(Math.sin(2*radian))) -  (y*(Math.cos(2*radian)));
	this.xPos = x1;
	this.yPos = y1;

}

	/**
	 * Gets the x-coordinate
	 * 
	 * @return the x-coordinate
	 */
	public double getXPos() {
		return this.xPos;
	}


	/**
	 * Gets the y-coordinate
	 * 
	 * @return the y-coordinate
	 */
	public double getYPos() {
		return this.yPos;
	}



	public String toString() {
		return String.format("(%d,%d)", xPos, yPos);
	}
}
