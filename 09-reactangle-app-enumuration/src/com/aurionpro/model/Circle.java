package com.aurionpro.model;

public class Circle {
	private double radius;
	private ColourType colour;
	private BorderType border;

	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public ColourType getColour() {
		return colour;
	}
	public void setColour(ColourType colour) {
		this.colour = colour;
	}
	public BorderType getBorder() {
		return border;
	}
	public void setBorder(BorderType border) {
		this.border = border;
	}
	
	public  double calculateArea() {
		return (Math.PI*radius*radius);
	}
	public  double calculateperimeter() {
		return (2*Math.PI*radius);
	}
	
}
