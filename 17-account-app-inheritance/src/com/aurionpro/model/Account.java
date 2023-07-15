package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private double balance;

	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		balance += amount;
		return true;
	}

	public boolean withdraw(double amount) {
		if (balance - amount < 0) {
			return false;
		}
		balance -= amount;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
