package com.kodilla.good.patterns.challenges;

public class BuyRequest {
    private User user;
    private Game game;

    public BuyRequest(final User user, final Game game) {
        this.user = user;
        this.game = game;
    }

    public User getUser() {
        return user;
    }

    public Game getGame() {
        return game;
    }
}
