package com.kodilla.good.patterns.challenges.challengeFlights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<Flight> flightList;

    public List<Flight> addFlights() {

        Flight flight1 = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("Warsaw", "Belgium");
        Flight flight3 = new Flight("London", "Belgium");
        Flight flight4 = new Flight("London", "Warsaw");
        Flight flight5 = new Flight("Belgium", "Warsaw");
        Flight flight6 = new Flight("Belgium", "London");

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);

        return flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
