
package com.aurionpro.test;

import com.aurionpro.model.Player;

import javax.management.RuntimeErrorException;

import com.aurionpro.model.ClassifyPlayer;

public class ClassiftPlayerTest {
	public static void main(String[] args) {
		
		
		int div=0;
		try {
			int num1=Integer.parseInt(args[0]);
			System.out.println(" First Number is :" +num1);
			int num2=Integer.parseInt(args[1]);
			System.out.println(" Second Number is :" +num2);
			div=num1/num2;
//			int num1=Integer.parseInt(args[0]);
			System.out.println(" First Number divided by second number  is :" +div);
			
		}
//		catch (RuntimeErrorException e) {
//			e.printStackTrace();
//			
//		}
		
		
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//			
//		}
//		catch(NumberFormatException e) {
//			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		finally {
			System.out.println(" In finally block ");
			
		}
		System.out.println(" Program ended");
	}
}