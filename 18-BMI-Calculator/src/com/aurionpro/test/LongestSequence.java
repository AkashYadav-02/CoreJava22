package com.aurionpro.test;

import java.util.Scanner;

public class LongestSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		char[] chars = str.toCharArray();
		char currChar = chars[0];
		int currCount = 1;
		char longChar = chars[0];
		int longCount = 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == currChar) {
				currCount++;
			} else {
				currChar = chars[i];
				currCount = 1;
			}
			if (currCount > longCount) {
				longChar = currChar;
				longCount = currCount;
			}
		}
		System.out.println("Longest sequence in  " + str + " is:");
		for (int i = 0; i < longCount; i++) {
			System.out.print(longChar);
		}

	}
}
