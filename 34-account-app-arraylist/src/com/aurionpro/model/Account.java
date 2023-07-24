package com.aurionpro.model;

public class Account implements Comparable<Account> {
	private int id;
	private String name;
	private double balance;

	public Account(int id, String name, double balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
		return "\nAccount [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	@Override
	public String toString() {
		return "\nAccount [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		return this.name.compareTo(o.name);
		
		//return (int)(balance-o.balance);
		//Double.compare(this.balance,o.balance);
	}

}
