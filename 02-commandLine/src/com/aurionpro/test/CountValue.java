package com.aurionpro.test;

import java.util.Scanner;

public class CountValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	     int [] arr = new int [] {10, 20,20,10,10,50,30, 33,38, 30};  
         
         int [] fr = new int [arr.length];  
         int visited = -1;  
         for(int i = 0; i < arr.length; i++){  
             int count = 1;  
             for(int j = i+1; j < arr.length; j++){  
                 if(arr[i] == arr[j]){  
                     count++;  
                     
                     fr[j] = visited;  
                 }  
             }  
             if(fr[i] != visited)  
                 fr[i] = count;  
         }  
 
          
        
         for(int i = 0; i < fr.length; i++){  
             if(fr[i] != visited)  
                 System.out.println( + arr[i] + "  occurs    " + fr[i]);  
         }  
   
     }}


 


         
    
    
	


