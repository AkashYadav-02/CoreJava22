package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmpolyeeTest {
public static void main(String[] args) {
	
	List<Employee> employee=Arrays.asList(
			new Employee(101,"Akash Yadav",32000.0,"Dev"),
			new Employee(202,"Aman Yadav",30000.0,"HR"),
			
			new Employee(301,"Rohit sabat ",32000.0,"ItSupport"),
			
			new Employee(302,"Nitesh  kamat",32000.0,"ItSupport"),
			
			new Employee(201,"yash Yadav",32000.0,"HR"),
			new Employee(103,"aman Yadav",31000.0,"Dev")
			
			
			
			);
	
//	employee.forEach(System.out::println);
//	 Map<String, List<Employee>> empl=employee.stream()
//    .collect(Collectors.groupingBy(Employee::getDepartment));
//	 
//	 empl.forEach((department, empList) -> {
//         System.out.println("Department: " + department);
//         empList.forEach(System.out::println);
//         System.out.println();
//     });
//	
//
//	
//	 List<Employee>str=  employee.parallelStream()
//		   .sorted(Comparator.comparingDouble(Employee::getSalary)
//    		 .reversed())
//		   .collect(Collectors.toList());
//	 
//	 System.out.println(str);
//	
//	  str.forEach(action);)->{
//		  
//	  });
    double minSalary = employee.stream()
            .mapToDouble(Employee::getSalary)
            .min()
            .orElse(0.0);

    double maxSalary = employee.stream()
            .mapToDouble(Employee::getSalary)
            .max()
            .orElse(0.0);

    double   count = employee.stream()
            .filter(employees -> employees.getSalary() > 30000)
            .count();

    double totalSalary = employee.stream()
            .mapToDouble(Employee::getSalary)
            .sum();

    System.out.println("Minimum Salary: " + minSalary);
    System.out.println("Maximum Salary: " + maxSalary);
    System.out.println("Number of Employees with Salary > 30k: " + count);
    System.out.println("Total Salary of all Employees: " + totalSalary);
}
}
