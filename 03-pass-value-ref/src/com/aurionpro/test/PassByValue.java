package com.aurionpro.test;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int number=10;
		 System.out.println("Before calling method number is : "+number);
		  incrementByOne(number);
		 System.out.println("After calling method number is : "+number);

	}
	private static  void incrementByOne(int number){
		number++;
	}
	

}
