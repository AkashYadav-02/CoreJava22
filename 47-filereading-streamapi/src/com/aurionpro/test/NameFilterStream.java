package com.aurionpro.test;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NameFilterStream {
    public static void main(String[] args) {
        String[] names = {"Jay", "Nimesh", "Mark", "Mahesh", "Ramesh","Akash"};

        System.out.println("First 3 students sorted in ascending order:");
        Arrays.stream(names)
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("First 3 students sorted in ascending order  names contain 'a':");
        Arrays.stream(names)
                .filter(name -> name.toLowerCase().contains("a"))
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\nStudents sorted in descending order:");
        Arrays.stream(names)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("\nFirst 3 characters of names of students:");
        Arrays.stream(names)
        .sorted()
                .map(name -> name.toUpperCase().substring(0, Math.min(3, name.length())))
                .forEach(System.out::println);

     
        System.out.println("\nNames of students with less than or equal to 4 characters:");
        Arrays.stream(names)
                .filter(name -> name.length() <= 4)
                .forEach(System.out::println);
    }
}