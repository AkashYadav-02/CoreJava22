package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class PolymorphismTest{
	
	public static void main(String[] args) throws Exception{
		
		Man man =new Man();
		Boy boy =new Boy();
		print(man);
		print1(boy);
		
			
		}
		
	public static void print(IMannerable obj) {
		obj.departGreet();
		obj.welcomeGreet();
	

}
	public static void print1(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	

}
}