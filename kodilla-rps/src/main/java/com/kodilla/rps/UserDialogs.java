package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please, enter number of rounds:");
            String s = scanner.nextLine();
            try {
                int n = Integer.parseInt(s);
                if (n >= 1 && n <= 10)
                    return n;
                else
                    System.out.println("Wrong, please try again.");
            } catch (Exception e) {
                System.out.println("Wrong, please try again.");
            }
        }
    }

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move: (S)cissors, (R)ock, (P)aper, (Q)uit, (X)Restart:");
            String s = scanner.nextLine().toUpperCase();
            if ("S".equals(s))
                return UserSelection.SCISSORS;
            else if ("R".equals(s))
                return UserSelection.ROCK;
            else if ("P".equals(s))
                return UserSelection.PAPER;
            else if ("X".equals(s)) {
                System.out.println("Restart");
                return UserSelection.RESTART;
            }
            else if ("Q".equals(s)) {
                System.out.println("You exit the game");
                System.exit(0);
                return UserSelection.EXIT;
            }
            System.out.println("Wrong selection, try again.");
            }
        }

    public static void showStatistics(int round, int numberOfRounds,
                                      UserSelection computerSelection, UserSelection userSelection,
                                      int computerScore, int userScore,
                                      Winner winner) {
        System.out.println("Round " + round + " of " + numberOfRounds);
        System.out.println("User selected: " + userSelection);
        System.out.println("Computer selected: " + computerSelection);
        System.out.println("Winner: " + winner);
        System.out.println("User score: " + userScore);
        System.out.println("Computer score: " + computerScore);

    }
}
