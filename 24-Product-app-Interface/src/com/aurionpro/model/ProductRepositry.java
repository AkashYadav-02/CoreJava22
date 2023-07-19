package com.aurionpro.model;

public class ProductRepositry implements IRepositry {
	@Override
	public  void create() {
		System.out.println("Product Creater");
	}
	@Override
	public  void read()
	{
	
		System.out.println("Product Read");
	}
	@Override
	
	public  void delete() {
		System.out.println("Product Deleted");
		
	}
	@Override
	public  void update() {
		System.out.println("Product Updated");
	}
	
	

}
