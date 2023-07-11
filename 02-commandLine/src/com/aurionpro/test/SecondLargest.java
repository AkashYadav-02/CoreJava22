package com.aurionpro.test;

public class SecondLargest {

	
	
	  public static  int mx(int n,int m) {
		  		  
		  if(n>m)return n;
		  else return m;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int   second;
		 
	    int largest = second = Integer.MIN_VALUE;
		for(int i=0;i<args.length;i++) {
			if(Integer.parseInt(args[i])>largest) {
			second =largest;
			largest=Integer.parseInt(args[i]);
			}
			else if(Integer.parseInt(args[i])!=largest&& Integer.parseInt(args[i])>second)
			{
				second=Integer.parseInt(args[i]);
			}
		  }
			if(second==Integer.MIN_VALUE) {
				System.out.println("The second largest element not found");
			}else {
				
		
		  
		        System.out.println("The second largest element is "+second);
		
		}
	}}


