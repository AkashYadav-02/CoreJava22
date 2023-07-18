package com.aurionpro.model;

public class Circle extends Shape {
	 private double radius;

	    
	public Circle(ColourType colour, BorderType border,double radius) {
		super(colour, border);
		
		this.radius=radius ;
		
	}

	
	
	
	
	@Override
	public  double  calculate() {
		
		
		return (this.radius*this.radius*Math.PI);
		
	}





	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", calculate()=" + calculate() + ", getColour()=" + getColour()
				+ ", getBorder()=" + getBorder() + "]";
	}
	
	
}




	

