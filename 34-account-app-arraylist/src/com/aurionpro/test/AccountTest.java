package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		 List<Account> accounts=new ArrayList<>();
		 
		 accounts.add(new Account(1,"Akash Yadav ",120000.0));
		 accounts.add(new Account(3,"Prahlad bhandari  ",10000.0));
		 accounts.add(new Account(2,"Yash Shinde  ",10000.0));
	
		 accounts.add(new Account(5,"Nitesh  kamat ",12000.0));
		 
		 
		 List<Account> accounts2=new ArrayList<>();
		for(Account each:accounts) {
			if(each.getBalance()>10000) {
				accounts2.add(each);
			}
			
		}
		System.out.println(accounts);
		System.out.println("*********************");
		System.out.println(accounts2);
		
	  Collections.sort(accounts);
	  System.out.println(accounts);
	}
}
