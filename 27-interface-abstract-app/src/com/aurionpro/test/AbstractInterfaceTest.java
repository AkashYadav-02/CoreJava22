package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Scanner;

import com.aurionpro.model.Bike;

import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMoveble;
import com.aurionpro.model.Vehicle;

public class AbstractInterfaceTest {

	public static void main(String[] args) throws Exception {

		IMoveble[] move = { new Car("Audi Q8", LocalDate.of(2021, 11, 2)),
				new Bus("Tata Marcopolo", LocalDate.of(2012, 12, 12)),
				new Bike("Honda Activa  6G", LocalDate.of(2001, 12, 22)),

		};

		for (IMoveble obj : move) {
			print(obj);
			printDetails(obj);
		}

	}

	public static void print(IMoveble obj) {
		obj.move();

		

	}

	public static void printDetails(IMoveble movable) {
		if (movable instanceof Vehicle) {
		
		Vehicle vehicle = (Vehicle) movable;
		System.out.println("Brand: " + vehicle.getBrand());
		System.out.println("Date of Manufacture: " + vehicle. getDateOfManufacturing());
		vehicle.showSpeed();
		System.out.println();
		}
	}
	
}