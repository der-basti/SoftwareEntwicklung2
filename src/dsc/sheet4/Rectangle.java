package dsc.sheet4;

import java.awt.Point;

public class Rectangle {
	
	private Point lowerLeft, upperLeft, upperRight, lowerRight, center;
	private double height, width;
	
	public Rectangle (Point lowerLeft, Point upperRight) {
		this.lowerLeft  = lowerLeft;
		this.upperRight = upperRight;
		getHeight();
		getWidth();
	}
	
	public Rectangle(Point lowerRight, double height, double width) {
		this.lowerRight = lowerRight;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(double height, double width, Point center) {
		this.height = height;
		this.width = width;
		this.center = center;
	}

	public double getSize() {
		return calculateSize();
	}
	
	private double calculateSize() {
		return this.height * this.width;
	}
	
	private void getHeight() {
		this.height = Math.abs(lowerLeft.getY() - upperRight.getY());
	}
	
	private void getWidth() {
		this.width = Math.abs(lowerLeft.getX() - upperRight.getY());
	}
}
