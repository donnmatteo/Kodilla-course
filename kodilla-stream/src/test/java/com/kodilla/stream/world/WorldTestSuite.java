package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country country1 = new Country("Poland", new BigDecimal(38000000));
        Country country2 = new Country("Germany", new BigDecimal(6000000));
        Country country3 = new Country("Spain", new BigDecimal(7674848));

        Continent continent1 = new Continent("Europe");

        World earth = new World();

        //When
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        earth.addContinent(continent1);

        //Then
        Assert.assertEquals(51674848, earth.getPeopleQuantity());

    }
}
