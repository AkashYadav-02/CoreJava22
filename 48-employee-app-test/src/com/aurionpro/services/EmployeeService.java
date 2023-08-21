package com.aurionpro.services;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;


import com.aurionpro.model.Employee;

public class EmployeeService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Employee> employee = new ArrayList<>();

	public EmployeeService() {
		super();

	}

	public void SaveDetails(Employee empl) {
		this.employee.add(empl);
		// System.out.println(employee);
	}

	void deleteEmployeeById(int id) {

		

		 java.util.Iterator<Employee> iterator = employee.iterator();
	        while (iterator.hasNext()) {
	            Employee employee = iterator.next();
	            if (employee.getEmployeeId() == id) {
	                iterator.remove();
	                System.out.println("Employee with ID " + id + " has been deleted.");
	            }
	        }

	}

	public int TotalEmployee() {

		int count = (int) employee.stream().count();
		return count;

	}

	public void EmployeeIndepartment() {
		Map<Integer, Long> employeeCountByDepartment = employee.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, TreeMap::new, Collectors.counting()));
		employeeCountByDepartment
				.forEach((department, count) -> System.out.printf("%s has %d employee(s)%n", department, count));

	}

	public void  getManager(int id) {

		Optional<Integer> managerIdOptional = employee.stream().filter(empl -> empl.getEmployeeId() == id)
				.map(Employee::getReportingManagerId).findFirst();

		if (managerIdOptional.isPresent()) {
			int managerId = managerIdOptional.get();
			String managerName = employee.stream().filter(empl -> empl.getEmployeeId() == managerId).map(Employee::getName)
					.findFirst().orElse(null);
			 System.out.println("Manager Name :"+ managerName);
		

	}}
	
	public void HighestPaidEmployeeInEachDepartment() {
		   Map<Integer, Employee> highestPaid = employee.stream()
		            .collect(Collectors.groupingBy(Employee::getDeptId,
		                Collectors.collectingAndThen(
		                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
		                    Optional::get
		                )
		            ));

		        System.out.println("Highest paid employees in each department:");
		        highestPaid.forEach((dept, employee) -> {
		            System.out.println("Department: " + dept + ", Employee: " + employee.getName());
		        });
	       
	   }
	public void highestPaidInEachRole() {
	
	  Map<String, Employee> highestPaid = employee.stream()
	            .collect(Collectors.groupingBy(Employee::getRole,
	                Collectors.collectingAndThen(
	                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
	                    Optional::get
	                )
	            ));
	 
	  System.out.println("Highest paid employees in each Role:");
	  highestPaid.forEach((role, employee) -> {
          System.out.println("Role: " + role + ", Employee: " + employee.getName());
      });
	  
	}

	
	
	
	public void  sumOfAllEmployee() {
		
		Optional<String> name = employee.stream()
	            .filter(empl -> empl.getRole().equals("Salesman"))
	            .max(Comparator.comparingDouble(Employee::getCommission))
	            .map(Employee::getName);
		
		 System.out.println(name.get());
	 
	 
}
	
	public void sumOfAllEmployeeSalary() {
		double salary = employee.stream()
	            .mapToDouble(Employee::getSalary)
	            .sum();
		  System.out.println("Sum of all Employee Salaries :"+salary);
		
		
	}
	
	public void employeeJoined( String  start, String end) {
		 DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d-MMM-yy", Locale.ENGLISH);
	        LocalDate startDate = LocalDate.parse("1-MAY-81", dateFormatter);
	        LocalDate endDate = LocalDate.parse("31-DEC-83", dateFormatter);
 

        List<Employee> employeesJoinedBetweenDates = employee.stream()
            .filter(empl -> {
                LocalDate joinDate = LocalDate.parse(empl.getDateOfJoining(), dateFormatter);
                return !joinDate.isBefore(startDate) && !joinDate.isAfter(endDate);
            })
            .collect(Collectors.toList());

        System.out.println("Employees joined between  " + startDate + " and " + endDate + ":");
        employeesJoinedBetweenDates.forEach(System.out::println);

	

	       
	}
	
	
	







	

}
