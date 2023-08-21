package com.aurionpro.model;

import java.io.Serializable;

public class Employee  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	 private int employeeId;
	 private String name;
	 private  String role;
	 private int reportingManagerId;
	 private  String DateOfJoining ;
	 private int  salary;
	 private int commission;
	 private int deptId;
	 
	public Employee(int employeeId, String name, String department, int reportingManagerId, String dateOfJoining,
			int salary, int commission, int deptId) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.role = department;
		this.reportingManagerId = reportingManagerId;
		DateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.deptId = deptId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void getRole(String designation) {
		this.role = designation;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getReportingManagerId() {
		return reportingManagerId;
	}
	public void setReportingManagerId(int reportingManagerId) {
		this.reportingManagerId = reportingManagerId;
	}
	public String getDateOfJoining() {
		return DateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee \n [employeeId=" + employeeId + ", name=" + name + ", designation=" + role
				+ ", reportingManagerId=" + reportingManagerId + ", DateOfJoining=" + DateOfJoining + ", salary="
				+ salary + ", commission=" + commission + ", deptId=" + deptId + "]";
	}
	 
	 



}
