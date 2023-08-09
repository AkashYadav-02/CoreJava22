package com.aurionpro.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceTest {

	public static void main(String[] args) {
	
		List<Integer>numList= Arrays.asList( 10,20,30,10,20,30,40,40,50,10,40,20);
		
//		/int count =1;
		Map<Integer, Integer>  mp= new HashMap<>();
		for(Integer  number :numList)
			{
//			System.out.println( mp.getOrDefault(number, 0) + 1));
					//			mp.put(number, mp.getOrDefault(number, 0) + 1);
			
			if(!mp.containsKey(number)) {
				 
				mp.put(number, 1);
			}
			else {mp.put(number,mp.get(number)+1);
			}
		}
		
		
		 mp.forEach((key,value)->{
			 System.out.println(key +" "+value);
		 });
	}

}
