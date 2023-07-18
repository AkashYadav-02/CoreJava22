package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BorderType;
import com.aurionpro.model.Circle;
import com.aurionpro.model.ColourType;
import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		
		Rectangle rec=new Rectangle(ColourType.BLUE,BorderType.DASHED,10,12 );
		System.out.println(rec);
		Circle cir=new Circle(ColourType.RED,BorderType.DOT,10.4 );
		System.out.println(cir.calculate());
		System.out.println(cir.getColour());
		
	
			 }}
