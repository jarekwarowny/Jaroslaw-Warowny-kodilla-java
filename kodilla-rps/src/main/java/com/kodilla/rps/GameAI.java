package com.kodilla.rps;

import java.util.Random;

public class GameAI {

    public static UserSelection getComputerSelection() {
        Random random = new Random();
        int n = random.nextInt(100);
        if (n < 33)
            return  UserSelection.ROCK;
        else if (n < 66)
            return UserSelection.SCISSORS;
        else
            return UserSelection.PAPER;
    }

    public static Winner selectWinner(UserSelection userSelection, UserSelection computerSelection) {
        if (userSelection == UserSelection.ROCK) {
            if (computerSelection == UserSelection.SCISSORS)
                return Winner.HUMAN;
            else if (computerSelection == UserSelection.PAPER)
                return Winner.COMPUTER;
            else
                return Winner.DRAW;
        } else if (userSelection == UserSelection.SCISSORS) {
            if (computerSelection == UserSelection.ROCK)
                return Winner.COMPUTER;
            else if (computerSelection == UserSelection.PAPER)
                return Winner.HUMAN;
            else
                return Winner.DRAW;
        } else if (userSelection == UserSelection.PAPER) {
            if (computerSelection == UserSelection.SCISSORS)
                return Winner.COMPUTER;
            else if (computerSelection == UserSelection.ROCK)
                return Winner.HUMAN;
            else
                return Winner.DRAW;
        } else if (userSelection == UserSelection.EXIT) {
            System.out.println("You exit the game");
        } else if (userSelection == UserSelection.AGAIN) {
            System.out.println("The game will start in few seconds.");
        }
        return null;
    }
}

