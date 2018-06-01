package com.kodilla.stream.world;

import org.junit.Test;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World testWorld = new World();

        //When
        testWorld.addContinent(new Continent(new Country("Poland"), "Europe"));
        testWorld.addContinent(new Continent(new Country("Spain"), "Europe"));
        testWorld.addContinent(new Continent(new Country("RSA"), "Africa"));
        testWorld.addContinent(new Continent(new Country("Angola"), "Africa"));
        testWorld.addContinent(new Continent(new Country("China"), "Asia"));
        testWorld.addContinent(new Continent(new Country("Japan"), "Asia"));

        //Then

    }
}
