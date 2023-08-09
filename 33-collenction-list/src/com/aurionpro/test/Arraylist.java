package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// add items to the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		System.out.println(list.containsAll(list2));

		list.addAll(list2);

		System.out.println(list.containsAll(list2));

		System.out.println(list);
		
		 list.remove(0);
		 System.out.println(list.size());
		 System.out.println(list);

		 list.remove(new Integer(10));
		 System.out.println(list.size());
		 System.out.println(list);
	
		
		 list.forEach(System.out::println);
		 
		 System.out.println( list.equals(list2));
		 
		 

	}

}
