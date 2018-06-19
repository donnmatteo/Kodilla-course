package com.kodilla.good.patterns.challenges.challengeFlights;

import java.util.ArrayList;
import java.util.List;

public final class FlightList {

    public static List<Flight> getFlightList() {
        List<Flight> flightsList = new ArrayList<>();
        Flight flight1 = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("Warsaw", "Belgium");
        Flight flight3 = new Flight("London", "Belgium");
        Flight flight4 = new Flight("London", "Warsaw");
        Flight flight5 = new Flight("Belgium", "Warsaw");
        Flight flight6 = new Flight("Belgium", "London");

        flightsList.add(flight1);
        flightsList.add(flight2);
        flightsList.add(flight3);
        flightsList.add(flight4);
        flightsList.add(flight5);
        flightsList.add(flight6);

        return flightsList;
    }
}
