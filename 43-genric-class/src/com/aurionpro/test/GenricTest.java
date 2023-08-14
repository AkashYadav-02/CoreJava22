package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Genric;
import com.aurionpro.model.Reactangle;

public class GenricTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Genric<Reactangle> obj=new Genric<Reactangle>(new Reactangle(23.6,55.6));
//		System.out.println(obj);
//		printvalue("Yadav","akash");
		
		List<Integer>list1=Arrays.asList(1,2,3,44,55,66,78);
		List<Double>list2=Arrays.asList(10.0,2.3,39.4,44.5,55.7,66.5,78.6);
		printList(list2);

	}
	
	public static void printList( List<?> list){
		for(Object each : list) {
			System.out.println(each);
		}
	}
	
	public static< t,s> void printvalue(t value1,s value2) {
		
		System.out.println(value1);
		System.out.println(value2);
	}

}
