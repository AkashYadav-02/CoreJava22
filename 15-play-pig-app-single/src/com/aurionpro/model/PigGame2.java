package com.aurionpro.model;

import java.util.Scanner;

public class PigGame2{
	 
	   private int player1Score;
	    private int player2Score;
	    private int currentTurnScore;
	    private int player1TurnCount;
	    private int player2TurnCount;

	    public PigGame2() {
	        player1Score = 0;
	        player2Score = 0;
	        currentTurnScore = 0;
	        player1TurnCount = 0;
	        player2TurnCount = 0;
	    }

	    public void play() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Let's Play PIG!");

	        while (player1Score < 20 && player2Score < 20) {
	            System.out.println("\nPlayer 1");
	            player1TurnCount++;
	            takeTurn(player1Score, scanner);

	            if (player1Score >= 20) {
	                System.out.println("\nPlayer 1 wins in " + player1TurnCount + " turns!");
	                System.out.println("\nGame over!");
	                return;
	            }

	            System.out.println("\nPlayer 2");
	            player2TurnCount++;
	            takeTurn(player2Score, scanner);

	            if (player2Score >= 20) {
	                System.out.println("\nPlayer 2 wins in " + player2TurnCount + " turns!");
	                System.out.println("\nGame over!");
	                return;
	            }
	        }

	        int winner = player1Score >= 20 ? 1 : 2;
	        int turns = player1Score >= 20 ? player1TurnCount : player2TurnCount;

	        System.out.println("\nPlayer " + winner + " wins in " + turns + " turns!");
	        System.out.println("\nGame over!");
	    }

	    private void takeTurn(int playerScore, Scanner scanner) {
	        int turnScore = 0;

	        while (true) {
	            System.out.print("Roll or hold? (r/h): ");
	            String choice = scanner.nextLine();

	            if (choice.equalsIgnoreCase("r")) {
	                int die = rollDie();
	                System.out.println("Die: " + die);

	                if (die == 1) {
	                    System.out.println("Turn over. No score.");
	                    currentTurnScore = 0; // Reset the current turn score
	                    break;
	                } else {
	                    turnScore += die;
	                    currentTurnScore += die; // Update the current turn score
	                }
	            } else if (choice.equalsIgnoreCase("h")) {
	                playerScore += currentTurnScore; // Update the player's total score with the current turn score
	                System.out.println("Score for turn: " + currentTurnScore);
	                System.out.println("Total score: " + playerScore);
	                currentTurnScore = 0; // Reset the current turn score
	                break;
	            } else {
	                System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
	            }
	        }
	    }

	    private int rollDie() {
	        return (int) (Math.random() * 6) + 1;
	    }

	    public static void main(String[] args) {
	        PigGame pigGame = new PigGame();
	        pigGame.play();
	    }
	}

  
