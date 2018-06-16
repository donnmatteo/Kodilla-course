package com.kodilla.good.patterns.challenges.food2door;

public class VegetablesOrderProcess implements OrderProcess {
    public boolean sendProduct(Supplier supplier, Product product){
            System.out.println("Company: " + supplier + " ordered: " + product);
            return true;
        }
}
