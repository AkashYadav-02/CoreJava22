package com.aurionpro.model;

import com.aurionpro.exception.InvalidAgeException;

public class AgeUtils {

	public static String ValidateAge(int age) throws InvalidAgeException {
		if (age >= 18) {
			return "Eligible to Vote";
		} else {
			throw new InvalidAgeException("Not Eligible to Vote");
		}

	}

}
