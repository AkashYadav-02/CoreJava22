package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.id=10;
		student.name="Sanjay";
		student.email="sanjay@gmail.com";
		System.out.println("StudentId = "+student.id+"\nStudentName =  "+student.name+
				""
				+ "\nStudentEmail =  "+student.email);
		
		

	}

}
