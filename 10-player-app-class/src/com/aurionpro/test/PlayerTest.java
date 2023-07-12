package com.aurionpro.test;

import com.aurionpro.model.Country;
import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player [] players = { new Player("Sachin", 35, "India", 20000, 75, 20),
				new Player("Dravid", 33, "India", 15000, 35, 10), 
				new Player("Rohit", 26, "India", 10000, 85, 7),
				new Player("ABD", 26, "SA", 6000, 35, 5), 
				new Player("Amla", 30, "SA", 10000, 55, 3),
				new Player("Gibbs", 32, "SA", 4000, 10, 6), 
				new Player("Ponting", 30, "Aus", 28000, 22, 15),
				new Player("Hayden", 30, "Aus", 25000, 65, 10),
				new Player("Smith", 30, "Aus", 18000, 50, 20), };
		
		
		
		for(int i=0;i<players.length;i++)System.out.println(players[i]);
	}
//		Player playerHighestRuns = findPlayerWithHighestRuns(players);
//		System.out.println("Player with Max Runs " + playerHighestRuns);
//
//		String[] countries = findUniqueCountries(players);
//		
//		System.out.println("****************************************************");
//
//		for (int i = 0; i < countries.length; i++) {
//			Player player = findPlayersWithHighestRuns(players, countries[i]);
//			System.out.println("\nHighest Runs scorer in "+ countries[i]+" is "+player);
//		}
//
//	}
//
//	private static Player findPlayersWithHighestRuns(Player[] players, String country) {
//		
//		Player maxPlayer = null;
//
//		for (int i = 0; i < players.length; i++) {
//			if(players[i].getCountry().equals(country) && maxPlayer==null) {
//				maxPlayer=players[i];
//			}
//			if(maxPlayer!=null) {
//				if (players[i].getRunScored() > maxPlayer.getRunScored() && players[i].getCountry().equals(country)) {
//					maxPlayer = players[i];
//				}
//			}
//			
//
//		}
//		return maxPlayer;
//	}
//
//	private static String[] findUniqueCountries(Player[] players) {
//		String[] tempCountries = new String[players.length];
//		int count = 0;
//		for (int i = 0; i < players.length; i++) {
//			if (!countryExistsIn(tempCountries, players[i].getCountry(), count)) {
//				tempCountries[count++] = players[i].getCountry();
//			}
//		}
//		return removeNullFromCountriesArray(tempCountries, count);
//	}
//
//	private static String[] removeNullFromCountriesArray(String[] tempCountries, int count) {
//		String[] countries = new String[count];
//		for (int i = 0; i < countries.length; i++) {
//			countries[i] = tempCountries[i];
//		}
//		return countries;
//	}
//
//	private static boolean countryExistsIn(String[] tempCountries, String country, int count) {
//		for (int i = 0; i < count; i++) {
//			if (country.equalsIgnoreCase(tempCountries[i])) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	private static Player findPlayerWithHighestRuns(Player[] players) {
//		Player maxPlayer = players[0];
//
//		for (int i = 0; i < players.length; i++) {
//			if (players[i].getRunScored() > maxPlayer.getRunScored()) {
//				maxPlayer = players[i];
//			}
//
//		}
//		return maxPlayer;
//	}

}
