package com.aurionpro.model;

public class Developer extends Employee {

	private double pa;
	private double ota;

	public Developer(int id, String name, double basic) {
		super(id, name, basic);

		this.pa = basic*0.30;
		this.ota = basic*0.20;
	}

	public double getPa() {
		return pa;
	}

	public void setPa(double pa) {
		this.pa = pa;
	}

	public double getOta() {
		return ota;
	}

	public void setOta(double ota) {
		this.ota = ota;
	}

	@Override
	public double caluculateMonthlySalary() {
		return (this.getBasic() + ota + pa);
	}

	@Override

	public double caluculateAnnualCtc() {
		return (super.getBasic() + ota + pa) * 12;
	}

	@Override
	public String toString() {
		return "Developer [pa=" + pa + ", ota=" + ota + ", caluculateMonthlySalary()=" + caluculateMonthlySalary()
				+ ", caluculateAnnualCtc()=" + caluculateAnnualCtc() + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getBasic()=" + getBasic() + "]";
	}

}
