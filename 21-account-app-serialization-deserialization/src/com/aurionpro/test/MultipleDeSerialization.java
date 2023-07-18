package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.aurionpro.model.Account;

public class MultipleDeSerialization  {
	public static void main(String[] args) {

//		Account acc = new Account(01, "akash", 1100000);

		try {
			

			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\akash.yadav\\Desktop\\multipleObjects.txt"));  
			  Account []acc=(Account[])in.readObject();  
			  for(Account account :acc) {
			  System.out.println(account);
			  }
			  in.close(); 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
	}