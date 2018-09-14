package com.kodilla.patterns2.decorator.pizza;


import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaOrderWithExtraCheeseOlivesBaconGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseOlivesBaconGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Margherita with tomato sauce and cheese with extra cheese + olives + bacon", description);
    }
}
