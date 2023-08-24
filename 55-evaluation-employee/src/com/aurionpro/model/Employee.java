package com.aurionpro.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String role;
	private double salary;
	private int managerId;

	private LocalDate dateOfJoining;
	private double commission;
	private int departmentId;

	public Employee(int id, String name, String role, double salary, int manager_id, double commission,
			int departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.managerId = manager_id;
		this.commission = commission;
		this.departmentId = departmentId;
	}

	public Employee() {
	}

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int manager_id) {
		this.managerId = manager_id;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + managerId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (managerId != other.managerId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", managerId="
				+ managerId + ", dateOfJoining=" + dateOfJoining + ", commission=" + commission + ", departmentId="
				+ departmentId + "]";
	}

	

}
