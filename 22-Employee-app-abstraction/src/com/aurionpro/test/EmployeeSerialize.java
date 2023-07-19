package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

public class EmployeeSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee emp[] = { new Manager(1001, "Akash Yadav", 30000),
					new Developer(2001, "Yash Shinde", 10000),
					new Accountant(0001, "Rohit sabat", 20000),

			};

			FileOutputStream file = new FileOutputStream("C:\\Users\\akash.yadav\\Desktop\\EmployeeDetails.txt");
			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(emp);
			obj.flush();
			// closing the stream
			obj.close();
			System.out.println("Object sucessfully stored");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		///DeSerilaization
		
		try {
			

			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\akash.yadav\\Desktop\\EmployeeDetails.txt"));  
			  Employee []emp=(Employee[])in.readObject();  
			  print(emp);
			  in.close(); 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	public static void  print(Employee[] emp) {
		for(Employee ep:emp) {
			System.out.println(ep);
		}
	}
}
