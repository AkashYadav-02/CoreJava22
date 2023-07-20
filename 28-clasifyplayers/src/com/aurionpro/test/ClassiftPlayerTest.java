
package com.aurionpro.test;

import com.aurionpro.model.Player;

import com.aurionpro.model.ClassifyPlayer;

public class ClassiftPlayerTest {
	public static void main(String[] args) {
		Player[] players = { new Player(1, "Sachin", 200, 50000, 5), new Player(2, "Akash", 85, 4300, 23),
				new Player(3, "Rohit", 8, 3500, 8), new Player(4, "Yash", 15, 8000, 0),
				new Player(5, "Nitesh", 20, 100, 10) };

		ClassifyPlayer obj = new ClassifyPlayer();
		Player[] aListers = obj.getAListers(players);
		Player[] bListers = obj.getBListers(players);
		Player[] cListers = obj.getCListers(players);
		System.out.println("ALister players :");
		print(aListers);
		System.out.println("\n-----------------------------------");

		System.out.println("BLister players :");
		print(bListers);
		System.out.println("\n-----------------------------------");

		System.out.println("CLister players :");

		print(cListers);
		System.out.println("\n-----------------------------------");
	}

	public static void print(Player[] player) {
		for (Player p : player) {
			System.out.println(p);
		}
	}
}