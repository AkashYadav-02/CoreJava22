package com.aurionpro.model;

public class Utility {
	
	public int  findFactorial(int num) {
		int factorial=1;
		for(int i=num;i>0;i--) {
			factorial*=i;
		}
		 return factorial;
		 
	}
	public boolean isPrime(int num) {
	
	        if (num <= 1)    return false;
	 
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0)
	                return false;
	        }
	 	        return true;
	    
		
	}

}
