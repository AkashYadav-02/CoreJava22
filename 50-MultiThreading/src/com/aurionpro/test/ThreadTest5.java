package com.aurionpro.test;

public class ThreadTest5 {

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
			 }}
		};

		
		 for(int i=0;i<10;i++) {
			 String name="Thread"+i;
			 Thread temp=new Thread(task,name);
			 temp.start();
		 }
	}

}
