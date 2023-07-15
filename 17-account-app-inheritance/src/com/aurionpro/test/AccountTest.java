package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount savingObj=new SavingAccount(1, "Rayan", 30000);
		System.out.println(savingObj);
		printTransactionMessage(savingObj.deposit(2000));
		System.out.println(savingObj);
		printTransactionMessage(savingObj.withdraw(10000));
		System.out.println(savingObj);
		
		System.out.println("----------------------------------");
		
		CurrentAccount currentObj=new CurrentAccount(1, "Rohan", 15000);
		System.out.println(currentObj);
		printTransactionMessage(currentObj.deposit(20000));
		System.out.println(currentObj);
		printTransactionMessage(currentObj.withdraw(60000));
		System.out.println(currentObj);
	}

	private static void printTransactionMessage(boolean isSuccess) {
		if(isSuccess) {
			System.out.println("Transaction success!!");
		}
		else {
			System.out.println("Transaction failed");
		}
	}
	

}
