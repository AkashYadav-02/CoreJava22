package com.aurionpro.test;



import java.lang.reflect.Method;

import com.aurionpro.model.IRepositry;
import com.aurionpro.model.OrderRepositry;

import com.aurionpro.model.ProductRepositry;


public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//			OrderRepositry obj1 =new OrderRepositry();
//			ProductRepositry obj2=new ProductRepositry();
//			dbOperations(obj1);
//			dbOperations(obj2);
//		}
//
//		private static void dbOperations(IRepositry repo) {
//			repo.create();
//			repo.read();
//			repo.update();
//			repo.delete();
//			
//		}
		Method[] methods = OrderRepositry.class.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
	}


