package com.aurionpro.model;

public class Manager  extends Employee{
	private double hra;
	private double ta;
	private double da;
	public Manager( int id, String name , double basic ) {
		super(id, name, basic);
		this.hra = basic*0.25;
		this.ta = basic*0.10;
		this.da = basic*0.18;
	}
	public double getHra() {
		return hra;
	}
	
	public double getTa() {
		return ta;
	}
	
	public double getDa() {
		return da;
	}
	
	
	@Override
	public  double  caluculateMonthlySalary()
	{
		return (this.getBasic()+hra+da+ta);
	}
	@Override
	public  double  caluculateAnnualCtc() {
		return (this.getBasic()+hra+da+ta)*12;
	}
	@Override
	public String toString() {
		return "Manager [hra=" + hra + ", ta=" + ta + ", da=" + da + ", caluculateMonthlySalary()="
				+ caluculateMonthlySalary() + ", caluculateAnnualCtc()=" + caluculateAnnualCtc() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getBasic()=" + getBasic() + "]";
	}
	
     
}
