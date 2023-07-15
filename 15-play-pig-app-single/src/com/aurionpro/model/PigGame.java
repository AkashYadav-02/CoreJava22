package com.aurionpro.model;



import java.util.Scanner;

public class PigGame {
    private int totalScore;
    private int currentTurnScore;
    private int turnCount;

    public PigGame() {
        totalScore = 0;
        currentTurnScore = 0;
        turnCount = 1;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's Play PIG!");

        while (totalScore < 20) {
            System.out.println("\nTURN " + turnCount);
            System.out.print("Roll or hold? (r/h): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("r")) {
                int die = rollDie();
                System.out.println("Die: " + die);
                
                

         if (die == 1) {
                     System.out.println("Turn over. No score.");
                    turnCount++;
                } else {
                    currentTurnScore += die;
                }
            } else if (choice.equalsIgnoreCase("h")) {
                totalScore += currentTurnScore;
                System.out.println("Score for turn: " + currentTurnScore);
                System.out.println("Total score: " + totalScore);
                currentTurnScore = 0;
                turnCount++;
            } else {
                System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
            }
        }

        
        System.out.println("You finished in " + (turnCount - 1) + " turns!");
        System.out.println("\nGame over!");
    }

    private int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}