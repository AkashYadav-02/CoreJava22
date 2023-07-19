package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

public class EmployeeTest  {
	public static void main(String[] args) {
		
		Employee emp[]= {
				new Manager(1001,"Akash Yadav",30000),
				new Developer(2001,"Yash Shinde",10000),
				new Accountant(0001,"Rohit sabat",20000),
		
				
			
		};
		print(emp);
	}
	
	public static void  print(Employee[] emp) {
		for(Employee ep:emp) {
			System.out.println(ep);
		}
	}
}
