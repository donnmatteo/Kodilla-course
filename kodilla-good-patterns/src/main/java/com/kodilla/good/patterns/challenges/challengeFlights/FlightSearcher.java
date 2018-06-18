package com.kodilla.good.patterns.challenges.challengeFlights;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlightSearcher {
    public static void searchByDepartures() {
        FlightList flightList = new FlightList();

        List<Flight> flightsFrom = flightList.getFlightList().stream()
                .filter(t -> t.getArrivalCity())
                .collect(toList());
    }
}
