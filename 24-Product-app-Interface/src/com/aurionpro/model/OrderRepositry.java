package com.aurionpro.model;

public class OrderRepositry implements IRepositry {
	@Override
	public  void create() {
		System.out.println("Order Creater");
	}
	@Override
	public  void read()
	{
	
		System.out.println("Order Read");
	}
	@Override
	
	public  void delete() {
		System.out.println("Order Deleted");
		
	}
	@Override
	public  void update() {
		System.out.println("Order Updated");
	}
	
	

}
