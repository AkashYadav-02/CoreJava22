package com.aurionpro.model;

public class SavingAccount extends Account {

	private static final double MIN_BALANCE = 1000;
	
	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
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
