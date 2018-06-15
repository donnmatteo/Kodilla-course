package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public User user;
    public Game game;
    public boolean isSold;

    public OrderDto(final User user, final Game game, final boolean isSold) {
        this.user = user;
        this.game = game;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Game getGame() {
        return game;
    }

    public boolean isSold() {
        return isSold;
    }
}
