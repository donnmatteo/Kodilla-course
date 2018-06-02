package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String countryName;
    private final BigDecimal peopleCount;

    public Country(final String countryName, final BigDecimal peopleCount) {
        this.countryName = countryName;
        this.peopleCount = peopleCount;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleCount;
    }
}
