package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new GameOrderService(),
                new GameOrderHandling());
        productOrderService.process(buyRequest);

    }
}
