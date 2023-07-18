package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.aurionpro.model.Account;
public class DeSerialization  {
	public static void main(String[] args) {

//		Account acc = new Account(01, "akash", 1100000);

		try {
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\akash.yadav\\Desktop\\store.txt"));  
			  Account  s=(Account)in.readObject();  
			  System.out.println(s);
			  in.close();
			  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	}