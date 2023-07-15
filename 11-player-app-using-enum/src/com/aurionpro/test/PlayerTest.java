package com.aurionpro.test;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Player;

public class PlayerTest {
	public static void main(String[] args) {

		Player[] players = { new Player("Sachin", 35, Countries.INDIA, 20000, 75, 20),
				new Player("Dravid", 33, Countries.INDIA, 15000, 35, 10), 
				new Player("Rohit", 26, Countries.INDIA, 10000, 85, 7),
				new Player("ABD", 26, Countries.SA, 6000, 35, 5), 
				new Player("Amla", 30,Countries.SA, 10000, 55, 3),
				new Player("Gibbs", 32, Countries.SA, 4000, 10, 6), 
				new Player("Ponting", 30, Countries.AUS, 28000, 22, 15),
				new Player("Hayden", 30, Countries.AUS, 25000, 65, 10),
				new Player("Smith", 30, Countries.AUS, 18000, 50, 20), };

		Player playerHighestRuns = findPlayerWithHighestRuns(players);
		System.out.println("Player with Max Runs " + playerHighestRuns);

		Countries[] countries=Countries.class.getEnumConstants();
		
		for(Countries c:countries) {
			System.out.println(c);
		}
		
		System.out.println("****************************************************");

		for (int i = 0; i < countries.length; i++) {
			Player player = findPlayersWithHighestRuns(players, countries[i]);
			System.out.println("\nHighest Runs scorer in "+ countries[i]+" is "+player);
		}
		
		

	}

	private static Player findPlayersWithHighestRuns(Player[] players, Countries country) {
		
		Player maxPlayer = null;

		for (int i = 0; i < players.length; i++) {
			if(players[i].getCountry().equals(country) && maxPlayer==null) {
				maxPlayer=players[i];
			}
			if(maxPlayer!=null) {
				if (players[i].getRunsScored() > maxPlayer.getRunsScored() && players[i].getCountry().equals(country)) {
					maxPlayer = players[i];
				}
			}
			

		}
		return maxPlayer;
	}

	private static Player findPlayerWithHighestRuns(Player[] players) {
		Player maxPlayer = players[0];

		for (int i = 0; i < players.length; i++) {
			if (players[i].getRunsScored() > maxPlayer.getRunsScored()) {
				maxPlayer = players[i];
			}
		}
		return maxPlayer;
	}

}
