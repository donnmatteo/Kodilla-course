package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;

    public Country(final String countryName) {
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantityOnPlanet = new BigDecimal("187743829218");
        return peopleQuantityOnPlanet;
    }
}
