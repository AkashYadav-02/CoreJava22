package com.aurionpro.model;

public class Player {
	
	
	private String name ;
	private String country ;
	private int age;
	
    @Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", age=" + age + ", runScored=" + runScored
				+ ", fifties=" + fifties + ", hundreds=" + hundreds + "]";
	}
	private int runScored;
    private int fifties;
    private int  hundreds;
    public Player(String name, int age, String country, int runScored, int fifties, int hundreds) {
		
		this.name = name;
		this.age = age;
		this.country = country;
		this.runScored = runScored;
		this.fifties = fifties;
		this.hundreds = hundreds;
	}

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country.toUpperCase();
	}
	public int getRunScored() {
		return runScored;
	}
	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}
	public int getFifties() {
		return fifties;
	}
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	public int getHundreds() {
		return hundreds;
	}
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}
	
    
    
    
    
	
}
