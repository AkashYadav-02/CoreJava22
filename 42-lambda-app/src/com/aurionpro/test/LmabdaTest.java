package com.aurionpro.test;

import com.aurionpro.model.IAddable;
import com.aurionpro.model.IGreetable;
import com.aurionpro.model.ModelGreet;

public class LmabdaTest {

	public static void main(String[] args) {

		IGreetable obj = new ModelGreet();

		obj.greet();

		IGreetable obj2 = () -> System.out.println("hello back ");

		obj2.greet();
		// IAddable obj4 = (num1, num2) -> System.out.println("addition of two no. is "
		// + (num1 + num2));
		IAddable obj3 = LmabdaTest::add;
		// obj4.add(33, 44);

		obj3.add(40, 13);
		

	}

	public static void add(int num1, int num2) {
		System.out.println(("addition of  two no. is " + (num1 + num2)));
	}
}