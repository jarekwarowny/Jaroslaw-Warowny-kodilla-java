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
            System.out.println("Enter your move: (S)cissors, (R)ock, (P)aper, (E)xit:");
            String s = scanner.nextLine().toUpperCase();
            if ("S".equals(s))
                return UserSelection.SCISSORS;
            else if ("R".equals(s))
                return UserSelection.ROCK;
            else if ("P".equals(s))
                return UserSelection.PAPER;
            else if ("E".equals(s))
                return UserSelection.EXIT;
            else
                System.out.println("Wrong selection, try again.");
        }
    }
}
