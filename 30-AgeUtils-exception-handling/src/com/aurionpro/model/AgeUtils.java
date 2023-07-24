package com.aurionpro.model;

import com.aurionpro.exception.InvalidAgeException;

public class AgeUtils {

	public static String ValidateAge(int age) {
		if (age >= 18) {
			return "Eligible to Vote";
		} else {
			throw new InsufficentBalanceException("Not Eligible to Vote");
		}

	}

}
