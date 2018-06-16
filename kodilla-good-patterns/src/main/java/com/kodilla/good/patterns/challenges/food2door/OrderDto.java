package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    Supplier supplier;
    Product product;
    public boolean isOrdered;

    public OrderDto(Supplier supplier, Product product, boolean isOrdered) {
        this.supplier = supplier;
        this.product = product;
        this.isOrdered = isOrdered;
    }
}
