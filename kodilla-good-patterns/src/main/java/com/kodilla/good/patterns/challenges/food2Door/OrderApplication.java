package com.kodilla.good.patterns.challenges.food2Door;

public class OrderApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcess productOrderProcess = new ProductOrderProcess(new CallService(), new VegetablesOrderProcess());
        productOrderProcess.process(orderRequest);
    }
}
