package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    private List<Country> countries = new ArrayList<>();

    public void addCountry(Country country){
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
