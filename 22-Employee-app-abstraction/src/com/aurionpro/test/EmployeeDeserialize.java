package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


import com.aurionpro.model.Employee;

public class EmployeeDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			

			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\akash.yadav\\Desktop\\EmployeeDetails.txt"));  
			  Employee []acc=(Employee[])in.readObject();  
			  for(Employee account :acc) {
			  System.out.println(account);
			  }
			  in.close(); 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
