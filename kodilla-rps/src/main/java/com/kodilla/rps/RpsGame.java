package com.kodilla.rps;

public class RpsGame {

    public void play() {
       int numberOfRounds = UserDialogs.getNumberOfRounds();
       int round = 1;
        int userScore = 0;
        int computerScore = 0;
       while (round < numberOfRounds) {
           UserSelection userSelection = UserDialogs.getUserSelection();
           UserSelection computerSelection = GameAI.getComputerSelction();
           Winner winner = GameAI.selectWinner(userSelection, computerSelection);
           if (winner = Winner.HUMAN) {
               userScore+;
           } else if (winner == Winner.COMPUTER) {
               computerScore++;
           } else {
               userScore++;
               computerScore++;
           }
           UserDialogs.showStatistics(round, numberOfRounds, computerSelection, userSelection, computerScore, userScore, winner)
           round++;
       }
    }
}
