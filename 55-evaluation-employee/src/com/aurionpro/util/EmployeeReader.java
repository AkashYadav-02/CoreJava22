package com.aurionpro.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.aurionpro.model.Employee;

public class EmployeeReader {

	public List<Employee> readEmployeeFromFile(String pathname) {
		Set<Employee> employeeSet = new HashSet<>();
		try {
			File file = new File(pathname);
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				Employee temp = new Employee();
				String[] split = sc.nextLine().replace("\'", "").split(",");
				temp.setId(Integer.parseInt(split[0]));
				temp.setName(split[1]);
				temp.setRole(split[2]);
				temp.setManagerId(Integer.parseInt(checkIfNull(split[3])));
				temp.setDateOfJoining(getCorrectedDate(split[4]));
				temp.setSalary(Integer.parseInt(split[5]));
				temp.setCommission(Double.parseDouble(checkIfNull(split[6])));
				temp.setDepartmentId(Integer.parseInt(split[7]));
				employeeSet.add(temp);
			}
			return new ArrayList<Employee>(employeeSet);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	private String checkIfNull(String string) {
		return string.toLowerCase().equals("null") ? "0" : string;
	}

	private LocalDate getCorrectedDate(String dateString) {
		String[] split = dateString.split("-");
		String day = convertDateToTwoDigit(split[0]);
		String month = convertMonthToDigit(split[1]);
		String year = convertYearToFourDigit(split[2]);
		String date = year + "-" + month + "-" + day;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateTime = LocalDate.parse(date, formatter);
		return dateTime;
	}

	private String convertMonthToDigit(String string) {
		Map<String, String> monthMap = new HashMap<>();
		monthMap.put("jan", "01");
		monthMap.put("feb", "02");
		monthMap.put("mar", "03");
		monthMap.put("apr", "04");
		monthMap.put("may", "05");
		monthMap.put("jun", "06");
		monthMap.put("jul", "07");
		monthMap.put("aug", "08");
		monthMap.put("sep", "09");
		monthMap.put("oct", "10");
		monthMap.put("nov", "11");
		monthMap.put("dec", "12");

		if (monthMap.containsKey(string.toLowerCase())) {
			return monthMap.get(string.toLowerCase());
		}

		return null;
	}

	private String convertYearToFourDigit(String string) {
		return "19" + string;
	}

	private String convertDateToTwoDigit(String string) {
		int len = string.length();
		while (len != 2) {
			string = "0" + string;
			len = string.length();
		}
		return string;
	}
}
