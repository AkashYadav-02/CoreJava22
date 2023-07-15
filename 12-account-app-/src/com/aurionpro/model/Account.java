package com.aurionpro.model;

public class Account {

	private  int id;
	 private String name;
	 private double balance;
	  private static int  count=0;
	  
	 public Account() {
			
			this(0,null,0);
		}
	 
	 public Account(int id) {
		
		this(id,null,0);
	}
	 

	public Account(int id, String name, double balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		count++;
	
	}

	public static int getCount() {
		return count;
	}

	
	
	


}
