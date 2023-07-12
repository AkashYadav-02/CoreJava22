package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {
	public static void main(String[] args) {
		Account account=new Account(101, "Jay", 1000, AccountType.CURRENT);
		
		Account account1=new Account(101, "yash", 2000, AccountType.SAVING);
		System.out.println(account);
		
		printDepositMessage(account,account.deposit(1010));
//		printDepositMessage(account,account.deposit(3010));
		printWithdrawMessage(account,account.withdraw(31000));
		
		printDepositMessage(account1,account1.deposit(15010));
//		printDepositMessage(account1,account1.deposit(3010));
		printWithdrawMessage(account1,account1.withdraw(31000));
	}

	private static void printWithdrawMessage(Account account, boolean withdraw) {
		if(withdraw) {
			System.out.println("Withdrawal successful...\n"+ account);
		}
		else {
			System.out.println("Could not withdraw..transaction failed!!");
		}
	}

	private static void printDepositMessage(Account account, boolean deposit) {
		if(deposit) {
			System.out.println("Deposited successfully...\n"+ account);
		}
		else {
			System.out.println("Could not deposit..transaction failed!!");
		}
	}
}