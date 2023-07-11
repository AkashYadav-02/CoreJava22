package com.aurionpro.model;

public class Rectangle {
	private  double height;
	 private  double width;
	 private String colour;
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
	 private String validateColour(String  value) {
		 
		
		 if(value.toLowerCase().equals("blue"))
			 {return "Blue"  ;
			 }
		else if(value.toLowerCase().equals("green")) {
			return "Green";
		}
		
		else 
			{
			return "Red";
			}
		 
	 }
	 
	 public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = validateColour(colour);
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
