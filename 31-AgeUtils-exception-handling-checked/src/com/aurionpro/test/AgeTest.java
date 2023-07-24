package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.exception.InvalidAgeException;
import com.aurionpro.model.AgeUtils;

public class AgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age :");

		int age = sc.nextInt();

		// String str=AgeUtils.ValidateAge(age);

		try {
			String str = AgeUtils.ValidateAge(age);
			System.out.println(str);

		} catch (InvalidAgeException e) {

			System.out.println(e);
		}

		System.out.println("End of the Code");

	}

}
