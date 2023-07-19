package com.aurionpro.model;

import java.time.LocalDate;

public  class Professor  extends Person implements SalariedEmployee  {
   private double salary;
   
	public Professor(int id, String adress, LocalDate dateOfBirth,double salary) {
		super(id, adress, dateOfBirth);
		// TODO Auto-generated constructor stub
		this.salary=salary;
	}
	@Override
	public double calculateSalary() {
		return salary*(0.34+0.6);
		}

	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Professor [salary=" + salary + ", calculateSalary()=" + calculateSalary() + ", getSalary()="
				+ getSalary() + ", getId()=" + getId() + ", getAdress()=" + getAdress() + ", getDateOfBirth()="
				+ getDateOfBirth() + "]";
	}

	

	
	
}
