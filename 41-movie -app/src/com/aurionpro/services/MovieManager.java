package com.aurionpro.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aurionpro.model.Movie;

public class MovieManager  implements Serializable {

	List<Movie> movie;

	static final String path = "C:\\Users\\akash.yadav\\Desktop\\movies.txt";

	public MovieManager() {

		this.movie = new ArrayList<>();
		loadMovie();

	}

	public void addMovie(Movie movie) {

		this.movie.add(movie);
		this.saveMovie();
	}

	public void clearMovie() {
		 this.movie.clear(); 
		 this.saveMovie();
	}
	
	public  void displayMovie(){
		
		for( Movie each: this.movie) {
			System.out.println(each);
		}
	 
		
		
	}
	
	public int getMovieId(String name) {
		for(  int i=0;i<this.movie.size();i++) {
			if(name.equals(this.movie.get(i).getName())) {
				return this.movie.get(i).getId();
				
			}
		}
		
		return -1;
	}
  public List<Movie> getMovie(){
	  return this.movie;
  }
	
	public void loadMovie() {
		try {

			ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
			this.movie = (List<Movie>) in.readObject();

		} catch (Exception e) {

			System.out.println(e);
		}

	}
	
	public void saveMovie() {

		try {
			

			FileOutputStream file = new FileOutputStream(path);  
			ObjectOutputStream obj = new ObjectOutputStream(file);

			obj.writeObject(this.movie);
			obj.flush();    
			     
			obj.close();    
			 System.out.println("Object sucessfully stored");    

		} catch (Exception e) {
			
			System.out.println(e);
		}
		
	}

}
