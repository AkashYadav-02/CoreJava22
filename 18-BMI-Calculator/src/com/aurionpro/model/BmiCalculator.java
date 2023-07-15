package com.aurionpro.model;

public class BmiCalculator  {
	private double height;
	private double weight;
	public BmiCalculator(double height, double weight) {
		this.height=height;
		this.weight=weight;
	}

	

  public  double calculate() {
 return ( 100 * 100 * weight ) / ( height * height ); 
  }
	public void print( double BMI ) {
		
	    
	    
	    System.out.println("\nYour BMI value: " + BMI);
	    
	    if(BMI < 18.5)
	      System.out.println("You are underweight!");
	    else if(BMI < 25)
	      System.out.println("You are normal:)");
	    else if(BMI < 30)
	      System.out.println("You are overweight!");
	    else
	      System.out.println("You are obese!");
	    
	  } 
	  

}
