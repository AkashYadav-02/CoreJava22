package com.aurionpro.model;

public class Accountant extends Employee {
	private double hra;

	private double ma;

	public Accountant(int id, String name, double basic) {
		super(id, name, basic);
		this.hra = basic*0.25;

		this.ma = basic*0.15;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		this.ma = ma;
	}

	@Override
	public double caluculateMonthlySalary() {
		return (this.getBasic() + hra + ma);
	}

	@Override
	public double caluculateAnnualCtc() {
		return (this.getBasic() + hra + ma) * 12;
	}

	@Override
	public String toString() {
		return "Accountant [hra=" + hra + ", ma=" + ma + ", caluculateMonthlySalary()=" + caluculateMonthlySalary()
				+ ", caluculateAnnualCtc()=" + caluculateAnnualCtc() + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getBasic()=" + getBasic() + "]";
	}

}
