package com.aurionpro.model;



public abstract class Shape {
	
	private ColourType colour;
	private BorderType border;
	public Shape(ColourType colour, BorderType border) {
		
		this.colour = colour;
		this.border = border;
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
	
	public  abstract double  calculate();
	
	

}
