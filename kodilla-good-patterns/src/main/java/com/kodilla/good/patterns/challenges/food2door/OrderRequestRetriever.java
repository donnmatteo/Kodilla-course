package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop");
        Product product = new Product("Cucumber", 100);

        return new OrderRequest(supplier, product);
    }
}
