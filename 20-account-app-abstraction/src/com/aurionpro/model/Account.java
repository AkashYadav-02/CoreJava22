package com.aurionpro.model;

public abstract class Account {

	private  int id;
	 private String name;
	 private double balance;
	  private  AccountType account;
	  
	 

	public Account(int id, String name, double balance,AccountType account) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.account=account;
	
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void setCount(int count) {
		Account.count = count;
	}

	public boolean withdraw() {
		
		
	}

	
	
	


}
