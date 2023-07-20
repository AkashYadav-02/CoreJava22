package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle  implements IMoveble{

	public Car(String brand, LocalDate dateOfManufacturing) {
		super(brand, dateOfManufacturing);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is  moving ");
	}

	@Override
	public void showSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Car  speed is 250kmph ");
	}

}
