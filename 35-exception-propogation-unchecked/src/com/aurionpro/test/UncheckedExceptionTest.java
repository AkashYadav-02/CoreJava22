package com.aurionpro.test;

public class UncheckedExceptionTest {
	public static void main(String[] args) {
		System.out.println("Main start");
		function1();
		System.out.println("Main End");
	}

	private static void function1() {
		System.out.println("function1 start");
		function2();
		System.out.println("function1 End");
	}

	private static void function2() {
		System.out.println("function2 start");
		try{function3();}
		catch(RuntimeException e){
			System.out.println("Exception Handeled");
		}
		System.out.println("function2 End");
		
	}

	private static void function3() {
		System.out.println("function3 start");
		function4();
		System.out.println("function3 End");
	}

	private static void function4() {
		System.out.println("function4 start");
		throw new RuntimeException();

		
	}
}