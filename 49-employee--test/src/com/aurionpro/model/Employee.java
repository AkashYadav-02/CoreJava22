package com.aurionpro.model;

import java.io.Serializable;

import java.util.Objects;

public class Employee implements Serializable {
private static final long serialVersionUID = 1L;
int employeeID;
String name;
String role;
int managerID;
String dateOfJoining;
double salary;
double commission;
int departmentID;
public Employee(int employeeID, String name, String role, int managerID, String dateOfJoining, double salary,
		double commission, int departmentID) {
	super();
	this.employeeID = employeeID;
	this.name = name;
	this.role = role;
	this.managerID = managerID;
	this.dateOfJoining = dateOfJoining;
	this.salary = salary;
	this.commission = commission;
	this.departmentID = departmentID;
}
public int getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public int getManagerID() {
	return managerID;
}
public void setManagerID(int managerID) {
	this.managerID = managerID;
}
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getCommission() {
	return commission;
}
public void setCommission(double commission) {
	this.commission = commission;
}
public int getDepartmentID() {
	return departmentID;
}
public void setDepartmentID(int departmentID) {
	this.departmentID = departmentID;
}
@Override
public String toString() {
	return "Employee [employeeID=" + employeeID + ", name=" + name + ", role=" + role + ", managerID=" + managerID
			+ ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + ", commission=" + commission
			+ ", departmentID=" + departmentID + "]\n";
}


}