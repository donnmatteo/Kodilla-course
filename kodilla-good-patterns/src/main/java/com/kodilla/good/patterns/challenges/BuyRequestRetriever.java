package com.kodilla.good.patterns.challenges;

public class BuyRequestRetriever {
    public BuyRequest retrieve() {
        User user = new User("Piotr", "Pan.Piotr@gmail.com");
        Game game = new Game("Cyberpunk", 100);

        return new BuyRequest(user, game);
    }
}
