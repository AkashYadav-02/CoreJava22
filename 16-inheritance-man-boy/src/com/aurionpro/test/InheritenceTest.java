package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritenceTest {
 public static void main(String[] args) {
//  Boy boy = new Boy();
//  boy.eat();
//  boy.read();
//  
//  Kid kid = new Kid();
//  kid.read();
//  kid.play();
//  
//  Infant infant = new Infant();
//  infant.sleep();
//  infant.play();
//  infant.read();
  Case1();
  System.out.println("------------");
  Case2();
  System.out.println("-----------");
  Case3();
  System.out.println("-----------");
  Case4();
  System.out.println("-----------");
  Case5();
  System.out.println("-----------");
  Case6();
  System.out.println("-----------");
 }


private static void Case5(){ Object obj;
//expects object of any child

obj=10;//Boxing System.out.println(obj.getClass());

obj="Hello";

System.out.println(obj.getClass().getSimpleName());

obj=10<15;

System.out.println(obj.getClass());



}

public  static void Case1() {
   Man man;
   man = new Man();
   man.read();
   man.play();
   
  }
  public static void Case2() {
   Boy boy;
   boy = new Boy();
   boy.read();
   boy.play();
   boy.eat();
  }
  public static void Case3(){
   Man man;
   man = new Infant();
   man.read();
   man.play();
   
   
  }
  public  static void Case4() {
	  playAtPark(new Man());
	  playAtPark (new Boy()); playAtPark (new Infant ()); playAtPark (new Kid());
  }
  public  static void Case6() {
	  typecasting(new Man());
	  typecasting (new Boy()); 
	  typecasting (new Infant ()); 
	  typecasting (new Kid());
  }

private static void typecasting(Object obj) {
	
	if(obj instanceof Infant) {
		Infant infent=(Infant)obj;
		infent.sleep();
	}
	// TODO Auto-generated method stub
	
}


private static void playAtPark(Man man) {
	// TODO Auto-generated method stub
	man.play();
}
	 


  }
  
  