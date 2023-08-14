package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Consumer<String> consumer = (name) -> {
			System.out.println(name);
		};
		consumer.accept("Akash Yadav");

		Function<String, Integer> function = (name) -> {
			return name.length();
		};

		System.out.println("Length of string is :" + function.apply("AkashYadav"));

		Function<String, String> function2 = (name) -> {
			return name.toLowerCase();
		};

		System.out.println("LowerCase of string is :" + function2.apply("Akash Yadav"));

		Predicate<String> predobj = (name) -> {
			return name.equals(name.toLowerCase());
		};
		System.out.println(predobj.test("akash"));

		BiPredicate<String, String> biPredObj = (name1, name2) -> {
			return name1.equals(name2);
		};

		System.out.println(biPredObj.test("akash", "akash"));

		List<String> list1 = Arrays.asList("cash","akash ", "Yash", "non", "tna", "nami");
		list1.stream().forEach(System.out::printf);
	 list1.stream().filter((list)->list.length()==3||list.length()==4).
	forEach(System.out::println);



		
		
	}

}
