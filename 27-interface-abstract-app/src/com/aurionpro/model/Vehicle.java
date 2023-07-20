package com.aurionpro.model;

import java.time.LocalDate;

public abstract class Vehicle {
	private String brand;
	private LocalDate dateOfManufacturing;
	public Vehicle(String brand, LocalDate dateOfManufacturing) {
		
		this.brand = brand;
		this.dateOfManufacturing = dateOfManufacturing;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public LocalDate getDateOfManufacturing() {
		return dateOfManufacturing;
	}
	public void setDateOfManufacturing(LocalDate dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}
	
	public abstract void showSpeed();
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", dateOfManufacturing=" + dateOfManufacturing + ", getBrand()=" + getBrand()
				+ ", getDateOfManufacturing()=" + getDateOfManufacturing() + "]";
	}
	

}
