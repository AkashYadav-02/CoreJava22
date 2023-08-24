package com.aurionpro.test;

import com.aurionpro.model.PrintNumber;

public class ThreadTest  {

	public static void main(String[] args) {

//		
//		 System.out.println("Inside Main");  
		PrintNumber t1 =new PrintNumber();
    t1.setName("printer 1"); 
    
    t1.setPriority(2);
    System.out.println(t1.getPriority());
    t1.start();
//		  
//		  PrintNumber t2 =new PrintNumber();  t2.setName("printer 2");
		  
		   System.out.println(Thread.MAX_PRIORITY+"\n"+Thread.MIN_PRIORITY+"\n"
		   +Thread.NORM_PRIORITY+"\n"+Thread.currentThread().getPriority());
//		  for(int i=20;i<30;i++) {
//			  try {
//				Thread.sleep(1000);
//				System.out.println("Main Thread"+i);
//				
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			  
//		  }
//		  t2.start();  System.out.println("End of main ");
//		 
		  
		  
	}}
	
	