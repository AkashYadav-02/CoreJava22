package com.aurionpro.test;

import com.aurionpro.model.PrintTable;

public class ThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		
		PrintTable table=new PrintTable(5);
		  Thread t2 = new Thread(table);
	        t2.start();
	        PrintTable table2=new PrintTable(10);
			  Thread t1 = new Thread(table2);
			  t1.sleep(10000);
		        t1.start();
	}
}
