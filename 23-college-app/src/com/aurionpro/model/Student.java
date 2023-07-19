package com.aurionpro.model;

import java.time.LocalDate;

public class Student extends Person {

	private String branch;

	public Student(int id, String adress, LocalDate dateOfBirth, String branch) {
		super(id, adress, dateOfBirth);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "Student [branch=" + branch + ", getBranch()=" + getBranch() + ", getId()=" + getId() + ", getAdress()="
				+ getAdress() + ", getDateOfBirth()=" + getDateOfBirth() + "]";
	}
	
	
	
	
}
