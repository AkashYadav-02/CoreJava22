package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Person;
import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person [] person= {
				new Student(100,"thane west maharashtra",LocalDate.of(2001, 12, 22),"Computer Engineering" ),
  		          new Professor(120,"Nerul west navi mumbai",LocalDate.of(1992, 11, 12),150000 ),
				
		};
		for(Person p:person) {
			System.out.println(p);
		}

	}

}
