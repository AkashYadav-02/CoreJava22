package com.aurionpro.model;

public class Rectangle extends Shape {

	 private double height;
	 private double width;
	    
	public Rectangle(ColourType colour, BorderType border,double height,double width) {
		super(colour, border);
		this.height=height;
		this.width=width;
		
	}
 
	
	
	@Override
	public  double  calculate() {
		
		
		return this.height*this.width;
		
	}



	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", calculate()=" + calculate() + ", getColour()="
				+ getColour() + ", getBorder()=" + getBorder() + "]";
	}




	
	
	
}
