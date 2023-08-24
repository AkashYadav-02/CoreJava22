package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task=()->
		{
			 synchronized(args) { for(int i=0;i<3;i++){
				 System.out.println(Thread.currentThread().getName());
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 } }
		};

		
		  ExecutorService service = Executors.newFixedThreadPool(10); 
		  for (int i = 0; i < 10; i++) {   service.execute(task); 
		  } } 

}
