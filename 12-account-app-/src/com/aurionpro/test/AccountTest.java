package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		
		Account [] acc={
			new Account(01,"akash",1100000),
			new Account(),
			new Account(31),
			new Account(4,"omkar",200000),
			new Account(11,"rohan ",10000),
			
			
			
		};
		//System.out.println("No. of Object is :"+Account.getCount());
		System.out.println("No. of Object is :"+acc[1].getCount());
		

	}	
}
