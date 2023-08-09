package com.aurionpro.model;

public class Country {
String countryName;
int id;
public Country(String countryName, int id) {
	super();
	this.countryName = countryName;
	this.id = id;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "CountryInfo [countryName=" + countryName + ", id=" + id + "]";
}

}