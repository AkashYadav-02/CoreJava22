package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColourType;
import com.aurionpro.model.Rectangle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Circle circle = new Circle();
		System.out.println("Enter radius of circle");
		circle.setRadius(sc.nextDouble());
		System.out.println("Enter Colour  of circle");
		try {
			circle.setColour(ColourType.valueOf(sc.next().toUpperCase()));
		} catch (IllegalArgumentException e) {
			circle.setColour(ColourType.RED);
		}
		System.out.println("Enter BorderType of circle");
		try {
			circle.setBorder(BorderType.valueOf(sc.next().toUpperCase()));
		} catch (IllegalArgumentException e) {
			circle.setBorder(BorderType.SOLID);
		}

		printAreaAndPerimeter(circle);

	}

	private static void printAreaAndPerimeter(Circle cr) {
		System.out.println("Hight of rectangle:" + cr.getRadius());
		System.out.println("Width of rectangle:" + cr.getBorder());
		System.out.println("Colour of rectangle:" + cr.getColour());

		System.out.println("area of circle :" + cr.calculateArea());
		System.out.println("perimeter:" + cr.calculateperimeter());

	}
	

}
