package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientFundsException;


public class Accounttest {
	public static void main(String[] args) {
  try {   Account acc = new Account("Akash ", 101, 9000);
  System.out.println(" Account Information  :  \n" + acc);
   acc.deposite(100);  
   System.out.println("balance  after  deposited successfully : \n" + acc);
   acc.Withdraw(500); 
   System.out.println("balance after withdraw \n" + acc);
  } catch (InsufficientFundsException e) {  
	  System.out.println(e.getMessage());
  }
  
  }
  
}