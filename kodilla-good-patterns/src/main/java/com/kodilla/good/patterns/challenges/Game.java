package com.kodilla.good.patterns.challenges;

public class Game {
    private String gameName;
    private int quantity;

    public Game(String gameName, int quantity) {
        this.gameName = gameName;
        this.quantity = quantity;
    }

    public String getGameName() {
        return gameName;
    }

    public int getQuantity() {
        return quantity;
    }
}
