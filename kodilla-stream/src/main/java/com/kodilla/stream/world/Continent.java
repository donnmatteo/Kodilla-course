package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final Country country;
    private final String continentName;

    public Continent(final Country country, final String continentName) {
        this.country = country;
        this.continentName = continentName;
    }

    List<Country> countries = new ArrayList<>();

    public void addCountry(Country country){
        countries.add(country);
    }
}
