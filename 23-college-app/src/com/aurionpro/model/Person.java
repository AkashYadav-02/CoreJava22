package com.aurionpro.model;

import java.time.LocalDate;

public class Person {

	private int id;
	private String adress;
	private LocalDate DateOfBirth;
	public Person(int id, String adress,LocalDate  dateOfBirth) {
		super();
		this.id = id;
		this.adress = adress;
		DateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public String getAdress() {
		return adress;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	
	
}
