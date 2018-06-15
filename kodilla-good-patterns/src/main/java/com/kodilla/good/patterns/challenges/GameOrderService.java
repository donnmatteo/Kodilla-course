package com.kodilla.good.patterns.challenges;

public class GameOrderService implements OrderService {

    public boolean createOrder(User user, Game game){
        System.out.println("Implentation is working");
        return true;
    }

    public boolean sell(final User user, final Game game) {
        System.out.println("Seeling game to" + user.getName() + "/n" + user.getMail() + "/n name of the game: "
            + game.getGameName() + " quantity: " + game.getQuantity());
        return true;
    }
}
