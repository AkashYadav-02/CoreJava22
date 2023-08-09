package com.aurionpro.controller;

import java.io.Serializable;
import java.util.Scanner;

import com.aurionpro.model.Movie;
import com.aurionpro.services.MovieManager;

public class MovieController implements Serializable {
	
		MovieManager manager;

		public MovieController() {
			
			this.manager = new MovieManager();
		}
		
		 public   void start()
		 {
			 
			System.out.println("Enter:\n"
					+ "1 for display movies\n"
					+ "2 for clearAllMovie \n"
					+ "3 for  getMovieId\n"
					+ "4 for getMovie\n"
					+ "5 for addMovie");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		 switch(n) {
		 case 1:   this.manager.displayMovie();
		          break;
		 
		 case 2: this.manager.clearMovie();
		        break;
		   
		 case 3: this.manager.getMovieId(sc.next());
		         break;
		 case 5: this.manager.addMovie(getvalue());
		        break;
		
		
		 
		 
		
		  default: System.out.println("Wrong value Enter");
		 }
			
			
			 
			 
			 
		 }
		 private Movie getvalue()
		 {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("Enter movie id");	 
			 int id=sc .nextInt();
			 System.out.println("Enter movie name");	 
			 String name=sc.next();
			 System.out.println("Enter movie Year");	 
			 int year=sc .nextInt();
			 System.out.println("Enter movie gener");	 
			 String gener=sc .next();
			 
			 return  new Movie(id,name,year,gener);
			 
		 }
		
		 public  void   setMovie( Movie movie) {
			 
			  this.manager.addMovie(movie);
		 }
		
		
		
		
		
		
	
}
