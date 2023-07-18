package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.aurionpro.model.Account;

public class Serialization  {
	public static void main(String[] args) {

//		Account acc = new Account(01, "akash", 1100000);

		try {
			Account acc = new Account(01, "akash", 1100000);

			FileOutputStream file = new FileOutputStream("C:\\Users\\akash.yadav\\Desktop\\store.txt");  
			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(acc);
			obj.flush();    
			     
			obj.close();    
			 System.out.println("Object sucessfully stored");    

		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
	}
	}