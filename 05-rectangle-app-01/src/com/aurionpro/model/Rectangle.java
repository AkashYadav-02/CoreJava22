package com.aurionpro.model;

public class Rectangle {

	 public double height;
	 public double width;
	 
	 public Rectangle(double height, double width) {
		
		this.height = height;
		this.width = width;
	}
	public double area() {
		 return height*width;
		 
	 }	 public double perimeter() {
		 return 2*(height+width);
		 
	 }
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	 
}
