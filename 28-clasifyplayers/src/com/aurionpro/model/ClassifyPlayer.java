package com.aurionpro.model;

public class ClassifyPlayer {

	public Player[] getAListers(Player[] players) {
		int count = 0;

		for (Player p : players) {
			if (p.getMatches() >= 100 && (p.getRuns() > 5000 || p.getWickets() > 150)) {
				count++;
			}
		}
//		System.out.println(count);
		Player[] aListers = new Player[count];

		for (int i = 0, j = 0; i < players.length; i++) {
			if (players[i].getMatches() > 100 && (players[i].getRuns() > 5000 || players[i].getWickets() > 150)) {
				aListers[j++] = players[i];
			}
		}
		return aListers;
	}

	public Player[] getBListers(Player[] players) {
		int count = 0;

		for (Player p : players) {
			if ((p.getMatches() > 50 && p.getMatches() < 100)
					&& ((p.getRuns() > 3000 && p.getRuns() <= 5000) || (p.getWickets() > 75 && p.getWickets() < 150))) {
				count++;
			}
		}
//		System.out.println(count);
		Player[] bListers = new Player[count];

		for (int i = 0, j = 0; i < players.length; i++) {
			if ((players[i].getMatches() > 50 && players[i].getMatches() < 100)
					&& ((players[i].getRuns() > 3000 && players[i].getRuns() <= 5000)
							|| (players[i].getWickets() > 75 && players[i].getWickets() < 150))) {
				bListers[j++] = players[i];
			}
		}
		return bListers;
	}

	public Player[] getCListers(Player[] players) {
		int count = 0;

		for (Player p : players) {
			if  (p.getMatches() <=50 && (p.getRuns() <=3000 || p.getWickets() <=75)) {
				count++;
			}
		}
//		System.out.println(count);
		Player[] cListers = new Player[count];

		for (int i = 0, j = 0; i < players.length; i++) {
			if ((players[i].getMatches()<=  50 )
					&& ((players[i].getRuns() <=3000 )
							|| (players[i].getWickets()<=  75 ))) {
				cListers[j++] = players[i];
			}
		}
		
		return cListers;
	}

}