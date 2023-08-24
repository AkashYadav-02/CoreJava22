package com.aurionpro.model;

public class PrintTable   implements Runnable  {
	int number;
	

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public PrintTable(int number) {
		super();
		this.number = number;
	}


	@Override
	public  synchronized void run() {
		// TODO Auto-,generated method stub
		
		 for(int i=1;i<11;i++) {
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println( this.number +" X "+i+" ="+ number*i);
		 }
	}

}
