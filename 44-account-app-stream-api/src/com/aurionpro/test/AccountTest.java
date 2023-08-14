package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {
		
		
   List<Account> accounts=new ArrayList<>();	
   accounts.add(new Account(1, "Akash  Yadav", "M",200000, AccountType.CURRENT));
   accounts.add(new Account(2, " Om Singh", "M",201000, AccountType.SAVING));
   accounts.add(new Account(3, " Sanvi singh", "F",100000, AccountType.SAVING));
   accounts.add(new Account(4, "Akansha kadam", "F",150000, AccountType.CURRENT));
   accounts.add(new Account(5, "Yash   Shinde", "M",300000, AccountType.CURRENT));
   accounts.add(new Account(6, "shreya tiwari", "F",20000, AccountType.CURRENT));
   accounts.add(new Account(7, "nitesh", "M",1000, AccountType.CURRENT));
   accounts.add(new Account(8, "rohit", "M",30000, AccountType.SAVING));
 
	
//   accounts.forEach(System.out::println);
   
//   filter genders ==male 
//   accounts.stream().filter((list)->list.getGender()=="M").
//	forEach(System.out::println);
   
   
// filter genders ==Female 
//   accounts.stream().filter((list)->list.getGender()=="F").
//	forEach(System.out::println);
    
   
   //filter based on account type ==current
//   accounts.stream().filter((list)->list.getAccount()==AccountType.CURRENT).
//   forEach(System.out::println);
//   
////   filter based on account type ==SAVING
// accounts.stream().filter((list)->list.getAccount()==AccountType.SAVING).
// forEach(System.out::println);
   
   
// filter based on balance >100000
   
    accounts.stream().filter((account)->account.getBalance()<100000).
    forEach(System.out::println);   
    
    
   
   
   
   
	}
}
