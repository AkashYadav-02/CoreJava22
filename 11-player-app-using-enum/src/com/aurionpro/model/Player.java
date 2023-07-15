package com.aurionpro.model;

public class Player {

	private String name;
	private int age;
	private Countries country;
	private int runsScored;
	private int fifties;
	private int hundreds;

	public Player(String name, int age, Countries country, int runsScored, int fifties, int hundreds) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
		this.runsScored = runsScored;
		this.fifties = fifties;
		this.hundreds = hundreds;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Countries getCountry() {
		return country;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public int getFifties() {
		return fifties;
	}

	public int getHundreds() {
		return hundreds;
	}

	@Override
	public String toString() {
		return "\nPlayer [name=" + name + ", age=" + age + ", country=" + country + ", runsScored=" + runsScored
				+ ", fifties=" + fifties + ", hundreds=" + hundreds + "]";
	}
	
	

}
