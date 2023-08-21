package com.aurionpro.text;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Employee;
import com.aurionpro.services.EmployeeService;

public class EmployeeTest {


	public static void main(String[] args) {
		 EmployeeService emp=new EmployeeService();
		  
		 
		 emp.SaveDetails(new Employee(7698,"BLAKE","MANAGER",7839,"01-MAY-81",2850,0,30));
		   emp.SaveDetails(new Employee(7698, "BLAKE", "MANAGER", 7839, "01-MAY-81", 2850, 0, 30));
		   emp.SaveDetails( new Employee(7369, "SMITH", "CLERK", 7902, "17-DEC-80", 800, 0, 20));
		   emp.SaveDetails( new Employee(7788, "SCOTT", "ANALYST", 7566, "09-DEC-82", 3000, 0, 20));
		   emp.SaveDetails(new Employee(7934, "MILLER", "CLERK", 7782, "23-JAN-82", 1300, 0, 10));
		   emp.SaveDetails( new Employee(7654, "MARTIN", "SALESMAN", 7698, "28-SEP-81", 1250, 1400, 30));
		   emp.SaveDetails( new Employee(7499, "ALLEN", "SALESMAN", 7698, "20-FEB-81", 1600, 300, 30));
		   emp.SaveDetails( new Employee(7782, "CLARK", "MANAGER", 7839, "09-JUN-81", 2450, 0, 10));
		   emp.SaveDetails( new Employee(7844, "TURNER", "SALESMAN", 7698, "08-SEP-81", 1500, 0, 30));
		   emp.SaveDetails( new Employee(7900, "JAMES", "CLERK", 7698, "03-DEC-81", 950, 0, 30));
		   emp.SaveDetails( new Employee(7521, "WARD", "SALESMAN", 7698, "22-FEB-81", 1250, 500, 30));
		   emp.SaveDetails( new Employee(7902, "FORD", "ANALYST", 7566, "03-DEC-81", 3000, 0, 20));
		   emp.SaveDetails(new Employee(7876, "ADAMS", "CLERK", 7788, "12-JAN-83", 1100, 0, 20));
		   emp.SaveDetails( new Employee(7566, "JONES", "MANAGER", 7839, "02-APR-81", 2975, 0, 20));
		   emp.SaveDetails( new Employee(7698, "BLAKE", "MANAGER", 7839, "1-MAY-81", 2850, 0, 30));
		   emp.SaveDetails( new Employee(7369, "SMITH", "CLERK", 7902, "17-DEC-80", 800, 0, 20));
		   emp.SaveDetails( new Employee(7788, "SCOTT", "ANALYST", 7566, "09-DEC-82", 3000, 0, 20));
		   emp.SaveDetails( new Employee(7654, "MARTIN", "SALESMAN", 7698, "28-SEP-81", 1250, 1400, 30));
		   emp.SaveDetails( new Employee(7499, "ALLEN", "SALESMAN", 7698, "20-FEB-81", 1600, 300, 30));
		   emp.SaveDetails( new Employee(7839, "KING-WEB", "PRESIDENT", 0, "17-NOV-81", 15000, 0, 10));
		   emp.SaveDetails( new Employee(7782, "CLARK", "MANAGER", 7839, "09-JUN-81", 2450, 0, 10));
		   emp.SaveDetails( new Employee(7844, "TURNER", "SALESMAN", 7698, "08-SEP-81", 1500, 0, 30));
		   emp.SaveDetails( new Employee(7900, "JAMES", "CLERK", 7698, "03-DEC-81", 950, 0, 30));

		 
		 

	
		
		
		
		
//	 get manager
		 //System.out.println(emp.getManager(7698));
	
//	Employeach in department
//		 emp.EmployeeIndepartment();

//		 System.out.println(emp.TotalEmployee());
		 
		 

		
		 
	}
}
