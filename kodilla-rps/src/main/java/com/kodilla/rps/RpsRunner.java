package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        String username = UserDialogs.getUsername();
        int roundsCount = UserDialogs.getRoundsCount();
        RpsGame rpsGame = new RpsGame(username, roundsCount);
        rpsGame.play();


    }
}
