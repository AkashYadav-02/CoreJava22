package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Set<Account> accounts = new HashSet<>();
		accounts.add(new Account(1, "akash", 1100000.0));

		accounts.add(new Account(4, "omkar", 200000.0));
		accounts.add(new Account(11, "rohan ", 10000.0));
		accounts.add(new Account(1, "rohan ", 10000.0));

		for (Account each : accounts) {
			System.out.println(each);
		}

	}
}
