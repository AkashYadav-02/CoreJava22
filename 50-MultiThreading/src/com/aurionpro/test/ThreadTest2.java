package com.aurionpro.test;

import com.aurionpro.model.PrintCharacter;

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintCharacter obj1=new PrintCharacter();
		
		Thread t1= new Thread(obj1);
		 t1.setName("printer 1"); 
		t1.start();

		
		Thread t2= new Thread(obj1);
		 t2.setName("printer 2"); 
		t2.start();

		
	}

}
