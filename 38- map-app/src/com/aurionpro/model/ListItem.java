package com.aurionpro.model;

public class ListItem {
	private int id;
	private String name;
	private int quantity;
	private Double price;
	private double totalCost;
	public ListItem(int id, String name, int quantity, Double price) {
		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.totalCost =  quantity*price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	 public double calculatePrice( ){
		 
		 
		 return  this.totalCost;
	 }

	@Override
	public String toString() {
		return "ListItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", totalCost="
				+ totalCost + "]";
	}
	 
	

}
