package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = Arrays.asList(new Student(1, "Akash Yadav", 99.0, Arrays.asList("Chess", "cricket")),
				new Student(2, "Rohit Sabat", 92.0, Arrays.asList("BGMI", "Cricket")),
				new Student(3, "Yash Shinde", 95.5, Arrays.asList("Photography", "Badminton")),
				new Student(4, "Nitesh kumawat", 90.0, Arrays.asList("hacking ", "Chess"))

		);

		// students.forEach(System.out::println);
		//
		//
		List<String> hobbie = students.stream().map((student) -> student.getHobbies())
				.flatMap((hobbies) -> hobbies.stream()).map((student) -> student.toLowerCase()).distinct()
				.collect(Collectors.toList());

		//
		hobbie.forEach(System.out::println);

	}

}
