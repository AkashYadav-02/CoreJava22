package com.aurionpro.model;

public class Saving  extends Account{
	private double MIN_BALANCE=1000;
  
	public Saving(int id, String name, double balance,AccountType account) {
		super(id, name, balance,account);
		
		
		
	}
	@Override
	public boolean withdraw(double amount) {
		if(super.getBalance()-amount<MIN_BALANCE) {
			return false;
		}
		super.setBalance(super.getBalance()-amount);
		return true;
	}
}
