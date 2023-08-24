package com.aurionpro.model;

public class PrintNumber extends Thread {
	@Override public void run() {
		  for (int i =0;i<=10;i++) {   try {
		    Thread.sleep(2000);   } catch (InterruptedException e) {
		    e.printStackTrace();   }
		   System.out.println(this.getName()+":"+i);  }
		 } 
	
	  
	
	
	

}
