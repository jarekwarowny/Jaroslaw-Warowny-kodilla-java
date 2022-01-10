package com.kodilla.rps;

public class RpsGame {

    public void play() {
       int numberOfRounds = UserDialogs.getNumberOfRounds();
       int round = 0;
        int userScore = 0;
        int computerScore = 0;
       while (round < numberOfRounds) {
           UserSelection userSelection = UserDialogs.getUserSelection();
           UserSelection computerSelection = GameAI.getComputerSelection();
           Winner winner = GameAI.selectWinner(userSelection, computerSelection);
           if (winner == Winner.HUMAN) {
               userScore++;
           } else if (winner == Winner.COMPUTER) {
               computerScore++;
           } else if (winner == Winner.DRAW) {
               userScore++;
               computerScore++;
           } else if (winner == Winner.RESET) {
               round = 0;
               userScore = 0;
               computerScore = 0;
               continue;
           }

           UserDialogs.showStatistics(round + 1, numberOfRounds,
                   computerSelection, userSelection,
                   computerScore, userScore,
                   winner);
           round++;
       }
    }
}
