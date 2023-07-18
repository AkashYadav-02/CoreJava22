package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.aurionpro.model.Account;

public class MultipleSerialization  {
	public static void main(String[] args) {

//		Account acc = new Account(01, "akash", 1100000);

		try {
			Account [] acc={
					new Account(01,"akash",1100000),

					new Account(5,"yash",2000000),
					
					new Account(4,"nitesh",2000000),
					new Account(11,"rohit ",1000000),
					
					
					
				};


			FileOutputStream file = new FileOutputStream("C:\\Users\\akash.yadav\\Desktop\\multipleObjects.txt");  
			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(acc);
			obj.flush();    
			  //closing the stream    
			obj.close();    
			  System.out.println("Object sucessfully stored");    

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}
	}