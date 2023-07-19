package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.IRepositry;
import com.aurionpro.model.OrderRepositry;

import com.aurionpro.model.ProductRepositry;


public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  IRepositry [] od= {
			  new OrderRepositry(),
		      new ProductRepositry(),
	  };
	  
	  
	  
	  
	  
		
		

	}
	
	public static void print( IRepositry []  od ) {
		  for( IRepositry i : od)
		  {
			  i.create();
			  i.delete();
			  i.read();
			  i.update();
		  }
	}

}
