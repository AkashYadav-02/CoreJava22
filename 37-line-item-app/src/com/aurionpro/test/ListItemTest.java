package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.ListItem;

public class ListItemTest {

	public static void main(String[] args) {
		List<ListItem> cart= new ArrayList<>();
		
		cart.add(new ListItem(1,"Coke",23,20.0));

		cart.add(new ListItem(2,"Lays",10,30.0));

		cart.add(new ListItem(3,"Sting",50,40.0));
		  double totalCart=0;
		 for(ListItem each :cart) {
//			 System.out.println(each.getTotalCost());
			  totalCart+=each.calculatePrice();
		 }
		 System.out.println( totalCart);
		 
		

	}

}
