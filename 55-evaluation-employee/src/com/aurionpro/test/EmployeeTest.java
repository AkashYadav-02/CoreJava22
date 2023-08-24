package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.util.EmployeeUtil;

public class EmployeeTest {

	static int count = 0;

	public static void main(String[] args) {
		
		EmployeeUtil employeeUtil = new EmployeeUtil();
	//	System.out.println(employeeUtil.getEmployeeList());
//employeeUtil.addEmployee(new Employee(8010, "Rahul", "Manager", 3000, 7499, 0, 30));
		System.out.println("----------------");
//		System.out.println(employeeUtil.getEmployeeList());
	//
	//	 employeeUtil.EmployeeIndepartment();
	//	 employeeUtil.highestPaidInEachRole();
		// employeeUtil.HighestCommissionTaker();
		// employeeUtil.HighestPaidEmployeeInEachDepartment();
		// employeeUtil.deleteEmployeeById(8010);
	//	 System.out.println(employeeUtil.getEmployeeList());
		// System.out.println(employeeUtil.TotalEmployee());
		 employeeUtil.employeeJoined("1981-11-17","1983-01-12");
	}
	

}
