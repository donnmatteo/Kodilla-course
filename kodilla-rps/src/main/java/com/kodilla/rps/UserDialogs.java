package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getUsername(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter your name: ");
            String result = scanner.nextLine();
            if(result.length() > 0){
                return result;
            }
            System.out.println("Something went wrong, try to enter your name once again");
        }
    }

    public static RpsTypes getUserSelection(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Select (S)cissors, (P)aper or (R)ock");
            String result = scanner.nextLine().toUpperCase();
            switch(result){
                case "R": return RpsTypes.ROCK;
                case "P": return RpsTypes.PAPER;
                case "S": return RpsTypes.SCISSORS;
            }
        }
    }

    public static int getRoundsCount(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("How many rounds you want to play?");
            String result = scanner.nextLine();
            try{
                int rounds = Integer.parseInt(result);
                return rounds;

            }catch(Exception e){
                System.out.println("Enter correct number");
            }

        }
    }

    public static void showStats(int currentRound, int rounds, int userScore, int computerScore) {
        System.out.println("Current round: " + currentRound + " of " + rounds);
        System.out.println("User score: " + userScore);
        System.out.println("Computer score: " + computerScore);
    }

    public static void showSelection(RpsTypes userSelection, RpsTypes computerSelection) {
        System.out.println("User selected: " + userSelection);
        System.out.println("Computer selected: " + computerSelection);
    }

    public static void showWinner(int userScore, int computerScore, boolean last) {
        if(last) {
            System.out.println("FINAL SCORES: ");
        }
        if(userScore > computerScore) {
            System.out.println("Human wins!");
        } else if(computerScore > userScore) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Draw");
        }
    }
}
