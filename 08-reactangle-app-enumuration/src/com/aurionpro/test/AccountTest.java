package com.aurionpro.test;


import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {

		Account[] account = new Account[10];
		account[0] = new Account(1, "Yash", 1000.0, AccountType.SAVING);
		account[1] = new Account(2, "Raj", 2000.0, AccountType.CURRENT);
		account[2] = new Account(3, "akash", 5000.0, AccountType.SAVING);
		account[3] = new Account(4, "nitish", 1500.0, AccountType.SAVING);
		account[4] = new Account(5, "Surja", 3000.0, AccountType.CURRENT);
		account[5] = new Account(6, "Sarah", 800.0, AccountType.SAVING);
		account[6] = new Account(7, "David", 2500.0, AccountType.CURRENT);
		account[7] = new Account(8, "Emily", 1200.0, AccountType.SAVING);
		account[8] = new Account(9, "Mark", 1800.0, AccountType.CURRENT);
		account[9] = new Account(10, "Linda", 700.0, AccountType.SAVING);
		
		
		double savingTotal=TotalBalance(account,AccountType.SAVING);
		double savingMax=highest(account,AccountType.SAVING);
		double savingLow=lowest(account,AccountType.SAVING);
		double currentTotal=TotalBalance(account,AccountType.CURRENT);
		double currentMax=lowest(account,AccountType.CURRENT);
		double currentLow=lowest(account,AccountType.CURRENT);
		
		
		
		System.out.println("Total  Balance in Saving Account is : "+savingTotal);
		System.out.println("Heighest Balance in Saving Account is : "+savingMax);
		System.out.println("Lowest Balance in Saving Account is : "+savingLow);
		System.out.println("Lowest Balance  Holder details is :" );
		 print(account,AccountType.SAVING,savingLow);
		 System.out.println("\n------------------------------------------------------------\n");

			System.out.println("Total  Balance in Current Account is : "+currentTotal);
			System.out.println("Heighest Balance in Current Account is : "+currentMax);
			System.out.println("Lowest Balance in Current Account is : "+currentLow);
			System.out.println("Lowest Balance  Holder details is :" );
			 print(account,AccountType.CURRENT,currentLow);
		 
		

		


	}
	
	
	private static  double highest(Account [] account,AccountType ac) {
		
		 double maximum=Double.MIN_VALUE;
		
		for( int i=0;i<10;i++) {
			if(account[i].getAccount().equals(ac)) {
				maximum=Math.max(maximum ,account[i].getBalance());
			}
		}
		
		return maximum;
		
		
		
	}
private static double lowest(Account [] account,AccountType ac) {
	 double minimum=Double.MAX_VALUE;
		
		for( int i=0;i<10;i++) {
			if(account[i].getAccount().equals(ac)) {
				minimum=Math.min(minimum ,account[i].getBalance());
			}
		}
		
		return minimum;
	}

	private static double TotalBalance(Account [] account,AccountType ac) {
		
		double total=0;
		for( int i=0;i<10;i++) {
			if(account[i].getAccount().equals(ac)) {
				total+=account[i].getBalance();
			}
		}
		return total;
		
	}
private static void  print(Account []account,AccountType ac,double balance) {
		
		
		for( int i=0;i<10;i++) {
			if(account[i].getAccount().equals(ac)&& account[i].getBalance()==balance) {
				printAll(account[i]);
				
			}
		}
		
		
	}
	
	

   
	

	// private static void getUserInput(Account acc) {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Enter customer id");
	// acc.setId(sc.nextInt());
	// System.out.println("Enter customer full Name ");
	// acc.setName(sc.nextLine());
	//
	// System.out.println("Enter customer account balance");
	// acc.setBalance(sc.nextDouble());
	// System.out.println("Enter customer account type ");
	// try {
	// acc.setAccount(AccountType.valueOf(sc.next().toUpperCase()));
	// } catch (IllegalArgumentException e) {
	// acc.setAccount(AccountType.SAVING);
	// }

	// }

	private static void printAll(Account acc) {
		System.out.println(" Customer id is :" + acc.getId());
		System.out.println(" Customer Name is :" + acc.getName());
		System.out.println(" Customer balance  is :" + acc.getBalance());
		System.out.println(" Customer Account Type  is :" + acc.getAccount());

	}
}
