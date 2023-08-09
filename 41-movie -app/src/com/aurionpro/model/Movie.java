package com.aurionpro.model;

import java.io.Serializable;

public class Movie  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public Movie(int id, String name, int year, String gener) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.gener = gener;
	}
	private int id;
	 private String name;
	 private int year;
	 private String gener;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", year=" + year + ", gener=" + gener + "]";
	}
	 
	 



}
