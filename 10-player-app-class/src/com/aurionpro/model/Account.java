package com.aurionpro.model;

public class Account {
	private  int id;
	 private String name;
	 private double balance;
	 private AccountType  account;
	 
	 public Account(int id, String name, double balance, AccountType account) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.account = account;
	}
 public Account() {
		this(0,null,0.0,null);
	 
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

	public AccountType getAccount() {
		return account;
	}

	public void setAccount(AccountType account) {
		this.account = account;
	}

private boolean validate(double amount) {
	
	return amount>0.0;
}
 public  boolean  deposit( double amount)
 {
	 
	  if( validate(amount)) {
		  this.balance+=amount;
		  return true;
		  
	  }
	  
	  return false;
	 
 }

 public  boolean withdraw(double amount) {
	 
	  if(this.account.equals(AccountType.CURRENT  )&& validate(amount)) {
		 this.balance+=25000;
		 if(balance >=amount)
		 { this.balance-=amount;
		 return true;
		 }
		 else return false;
		  
	 
 }
	  else if(this.account.equals(AccountType.SAVING  )&& amount<=balance) {
		  this.balance-=amount;
		  return true;
	  }
	  
	  return false;
 }
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", account=" + account + "]";
}
 
 
 
}
