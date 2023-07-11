package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.GuessGame;

public class GuessGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		GuessGame game=new GuessGame();
		game.playGame();
		
		System.out.println("Want play again :");
		String str=sc.next().toLowerCase();
		if(str.equals("yes")) {
			game.playGame();
		}
		
	 
	 
	
	}

}
