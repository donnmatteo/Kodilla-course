package com.kodilla.good.patterns.challenges;

public class GameOrderHandling implements OrderHandling {
    public boolean sendOrder(User user, Game game){
        System.out.println("Your game has been sent");
        return true;
    }
}

