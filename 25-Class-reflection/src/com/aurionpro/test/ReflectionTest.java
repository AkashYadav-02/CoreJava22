package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionTest{
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter class name : ");
		String test = sc.nextLine();
		
		Class<?> className = Class.forName(test);
		
		// get fields
		
		Field[] declaredFields = className.getDeclaredFields();
		for(Field f : declaredFields) {
			System.out.println(f);
			
		//get constructors
		Constructor<?>[] constructors = className.getConstructors();
		for(Constructor c : constructors) {
			System.out.println(c);
		}
			
		Method[] methods = className.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		
			
		}
		
	

}
}