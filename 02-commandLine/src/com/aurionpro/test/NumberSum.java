package com.aurionpro.test;

public class NumberSum {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
	
		System.out.println(sum);
		
		
	}

}
