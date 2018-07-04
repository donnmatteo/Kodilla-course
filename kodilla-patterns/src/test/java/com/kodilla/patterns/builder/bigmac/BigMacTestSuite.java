package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void TestNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("With")
                .burgers(2)
                .sauce("Standard")
                .ingredient("Bacon")
                .ingredient("Jalapeno")
                .ingredient("Onion")
                .build();

        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();

        //Then
        Assert.assertEquals(3, howManyIngredients);

    }
}
