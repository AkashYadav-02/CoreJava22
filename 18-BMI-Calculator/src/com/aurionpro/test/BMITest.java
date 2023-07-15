package com.aurionpro.test;

import com.aurionpro.model.BmiCalculator;

public class BMITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BmiCalculator bmi=new BmiCalculator(168,60);
		double value=bmi.calculate();
		bmi.print((int)value);
		
		
		

	}

}
