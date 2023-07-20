package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends Vehicle  implements IMoveble{

	public Bus(String brand, LocalDate dateOfManufacturing) {
		super(brand, dateOfManufacturing);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Bus is moving ");
	}

	@Override
	public void showSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Bus  speed is   100kmph");
		
	}

}
