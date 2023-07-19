package com.aurionpro.model;

import java.io.Serializable;

public  abstract class Employee implements Serializable {

	private  int id;
	 private String name;
	 private double basic ;
	public Employee(int id, String name, double basic) {
		
		this.id = id;
		this.name = name;
		this.basic = basic;
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
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	 
	
	public abstract double  caluculateMonthlySalary();

	public abstract double  caluculateAnnualCtc();
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + "]";
	}
	 
	  
	 
	


}
