package com.kodilla.rps;

import static com.kodilla.rps.RpsTypes.PAPER;
import static com.kodilla.rps.RpsTypes.SCISSORS;
import static com.kodilla.rps.RpsWinner.COMPUTER;
import static com.kodilla.rps.RpsWinner.DRAW;
import static com.kodilla.rps.RpsWinner.USER;

public class RpsGame {
    private String username;
    private int rounds;
    private int currentRound = 1;
    private int userScore = 0;
    private int computerScore = 0;

    public RpsGame(String username, int rounds) {
        this.username = username;
        this.rounds = rounds;
    }

    public void play() {
        while(currentRound <= rounds) {
           UserDialogs.showStats(currentRound, rounds, userScore, computerScore);
           RpsTypes userSelection = UserDialogs.getUserSelection();
           RpsTypes computerSelection = ComputerPlayer.getComputerSelection();
           UserDialogs.showSelection(userSelection, computerSelection);
           RpsWinner winner = getWinner(userSelection, computerSelection);
           int userTempScore = 0;
           int computerTempScore = 0;
           if(winner == COMPUTER) {
               computerScore++;
               computerTempScore++;
           } else if(winner == USER) {
               userScore++;
               userTempScore++;
           } else {
               computerScore++;
               userScore++;
           }
           UserDialogs.showWinner(userTempScore, computerTempScore, false);

           currentRound++;
        }
        UserDialogs.showWinner(userScore, computerScore, true);
    }

    private RpsWinner getWinner(RpsTypes userSelection, RpsTypes computerSelection) {
        if(userSelection == SCISSORS) {
            if(computerSelection == SCISSORS) {
                return DRAW;
            } else if(computerSelection == PAPER) {
                return USER;
            } else {
                return COMPUTER;
            }
        } else if(userSelection == PAPER) {
            if(computerSelection == SCISSORS) {
                return COMPUTER;
            } else if(computerSelection == PAPER) {
                return DRAW;
            } else {
                return USER;
            }
        } else {
            if(computerSelection == SCISSORS) {
                return USER;
            } else if(computerSelection == PAPER){
                return COMPUTER;
            } else {
                return DRAW;
            }
        }
    }
}
