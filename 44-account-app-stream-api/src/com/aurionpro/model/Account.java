package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private String gender;
	private double balance;
	
	private AccountType account;

	public Account(int id, String name,String gender, double balance, AccountType account) {
        this.gender=gender;
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.account = account;

	}

	public int getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", gender=" + gender + ", balance=" + balance + ", account="
				+ account + "]";
	}


	

}
