package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.aurionpro.model.ListItem;

public class ListItemTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Map<Integer, String> mp = new HashMap<>();

		mp.put(101, "Akash Yadav ");
		mp.put(102, "Yash shinde  ");
		mp.put(103, "Nitesh  Kamat ");
		// Set<Entry<Integer, String>> entrySet = mp.entrySet();
		//
		//
		// for(Entry each:entrySet) {
		// System.out.println(each.getKey()+" "+each.getValue());
		//
		//
		// }
		// /for (Map.Entry<Integer, String> entry : mp.entrySet()) {
		// if (mp.containsValue(str)) {
		// for (Map.Entry<Integer, String> entry : mp.entrySet()) {
		// if (entry.getValue().equals(str)) {
		// mp.remove(entry.getKey());
		// break;
		// }
		// }
		// System.out.println("" + str + "': " + mp);
		// } else {
		// System.out.println("'" + str + "' not found in the map.");
		// }
//		if (mp.containsValue(str)) {
//			mp.values().removeIf(value -> value.equals(str));
//			mp.forEach((key, value) -> {
//				System.out.println(key + " " + value);
//			});
//			System.out.println(str + "Name removed from the map.");
//		} else {
//			System.out.println("Name does not exist.");
//		}
		//
		Map<Integer,String> map=new HashMap<>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	       
//	      map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);    
//		
	      
	      System.out.println(map);
		
	}

}
