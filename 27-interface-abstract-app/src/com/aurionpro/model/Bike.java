package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMoveble  {

	public Bike(String brand, LocalDate dateOfManufacturing) {
		super(brand, dateOfManufacturing);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Bike is moving ");
	}

	@Override
	public void showSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Bike  speed is   200kmph");
		
	}

}
