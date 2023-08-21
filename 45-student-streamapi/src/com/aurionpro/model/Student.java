package com.aurionpro.model;

import java.util.List;

public class Student {

	private int id;
	private String fullName;
	private double percentage;
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", percentage=" + percentage + ", hobbies=" + hobbies
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	private List<String> hobbies;
	public Student(int id, String fullName, double percentage, List<String> hobbies) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.percentage = percentage;
		this.hobbies = hobbies;
	}
	
	
}
