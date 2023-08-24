package com.aurionpro.services;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.aurionpro.model.Employee;

public class EmployeeManagement {
	List<Employee> empDetails  = new ArrayList<>();
	static final String filepath = "C:\\Users\\akash.yadav\\Desktop\\emp.txt";
	Set<Employee> empSet = new HashSet<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
	
	public EmployeeManagement() {

		

		loadEmpData();
	}
	

	public void loadData() {
		loadEmpData();

	}
	
	public void loadDtatFromFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line = br.readLine();
			Double commission;
			int managerID;
			while (line != null) {
				String[] arr = line.split(",");
				if (arr.length == 8) {
//					for (String string : arr) {
//						System.out.println(string);
//					}
					int empID = Integer.parseInt(arr[0].trim().replaceAll("\"", ""));
					String name = arr[1].trim().replace("\"", "");
					String role = arr[2].trim().replace("\"", "");
					if (arr[3].equalsIgnoreCase("null")) {
						managerID = 0;
					} else {
						managerID = Integer.parseInt(arr[3].trim().replaceAll("\"", ""));
					}
					String date = arr[4].trim().replace("\"", "");
					if (arr[6].equalsIgnoreCase("null")) {
						commission = (double) 0;
					} else {
						commission = Double.parseDouble(arr[6].trim().replace("\"", ""));
					}
					double salary = Double.parseDouble(arr[5].trim().replace("\"", ""));
					int departmentID = Integer.parseInt(arr[7].trim().replace("\"", ""));
					empSet.add(new Employee(empID, name, role, managerID, date, salary, commission, departmentID));
//					System.out.println(empSet);
//					System.out.println("done");
				}
				line = br.readLine();
				if(line==null) {
					empDetails.addAll(empSet);
					serializeData();
				}
			
		} 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void serializeData() {
		try {
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(empDetails);
			out.close();
			file.close();

			loadEmpData();

		}

		catch (IOException ex) {
			ex.printStackTrace();
//			System.out.println("IOException is caught");
		}
	}

	private void loadEmpData() {
		// TODO Auto-generated method stub
		try {
			Set<Employee> empSet = new HashSet<>();

			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);

			empDetails = (ArrayList<Employee>) in.readObject();
			    System.out.println(empDetails);

			    Set<Employee> empSet1 = new HashSet<>(empDetails);
			System.out.println(empDetails);

			in.close();
			file.close();
		}

		catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
	


}