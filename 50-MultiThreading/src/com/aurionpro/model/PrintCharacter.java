package com.aurionpro.model;

public class PrintCharacter implements Runnable {

	@Override
	public void run() {
		 for(char ch ='A';ch<'K';ch++) {
			 
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(ch);
			 System.out.println(Thread.currentThread().getName());
		 }
		
	}

}
