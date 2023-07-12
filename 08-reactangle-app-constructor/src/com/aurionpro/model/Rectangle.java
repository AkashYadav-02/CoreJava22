package com.aurionpro.model;

public class Rectangle {
	private  double height;
	 private  double width;
	 private  ColourType colour;
	 private double validate(double value) {
		 if(value  <1)
			 {return  1;
			 }
		else if(value >100) {
			return 100;
		}
		
		else 
			{
			return value;
			}
		 
	 }
	  public Rectangle()
		 {
			
			 this(0,0,ColourType.RED);
		 }
		 
		 
		  public  Rectangle(double height,double width){
			 this(height,width,ColourType.RED);
			 
		 }
		  public Rectangle(double height,double width,ColourType colour){
				 this.height=height;
				 this.width=width;
				 this.colour=colour;
				 
			 }
		 
	 
	 public ColourType getColour() {
		return colour;
	}

	public void setColour(ColourType colour) {
		this.colour = colour;
	}

	

	 public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		
		this.height=validate(height);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		
		 this.width=validate(width);
	}
	
	 
	 
	 
	 public double area() {
		 return height*width;
		 
	 }	 public double perimeter() {
		 return 2*(height+width);
		 
	 }
}
