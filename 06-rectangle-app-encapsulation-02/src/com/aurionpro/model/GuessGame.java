package com.aurionpro.model;

import java.util.Scanner;

public class GuessGame {
	
	private int chance=6;
	
	private  boolean check(int num) {
		if(num>0&&num<=100) {
			return true;
		}
		
		return false;
	}
private  int  numberGenerate() {
	return 	(int) (Math.random()*(99)+1);
}



public   void playGame( ) {
	
	int random=numberGenerate();
	 Scanner sc=new Scanner(System.in);
	//  int chance=6; 
	  System.out.println("Please Enter the number :");
	  
	 
	 while(chance>1) {
		 
		
		 int number=sc.nextInt();
		if(!check(number)){
			System.out.println("Please enter number  between 1 - 100");
		}
		 
		else  if(check(number)&& number==random) {
			 System.out.println("congrats you won");
			 break;
			 
		 }
		 else {
			 chance--;
			 System.out.println("Wronge number  again enter number");
		
		 }
		 
	 }
	 
	
	 
	 
//	 sc.close();
//	 playAgain();
	 
	
}

//private  void playAgain()
//{
//	Scanner sc=new Scanner(System.in);
//	String str=sc.next().toLowerCase();
//	if(str.equals("yes")) {
//		
//		playGame();
//	}
//	sc.close();
//	 
//}
}