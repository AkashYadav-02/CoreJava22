package com.aurionpro.model;

public class Account {

	private  int id;
	 private String name;
	 private double balance;
	
	  
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
		
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		return true;
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

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	
	
	


}
