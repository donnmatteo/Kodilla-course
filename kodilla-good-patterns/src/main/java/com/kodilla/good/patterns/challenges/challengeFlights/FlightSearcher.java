package com.kodilla.good.patterns.challenges.challengeFlights;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.stream.Collectors.toList;

public class FlightSearcher {
    public static List<Flight> searchByDepartures(String departCity) {


        return FlightList.getFlightList().stream()
                .filter(t -> t.getDepartureCity().equals(departCity))
                .collect(toList());

    }

    public List<Flight> searchByArrival(String arrivalCity) {
        return FlightList.getFlightList().stream()
                .filter(t -> t.getArrivalCity().equals(arrivalCity))
                .collect(toList());
    }

    public List<Flight> searchByVia(String departCity, String viaCity, String arrivalCity) {
        List<Flight> result = FlightList.getFlightList().stream()
                .filter(t -> t.getDepartureCity().equals(departCity))
                .filter(t -> t.getArrivalCity().equals(viaCity))
                .collect(toList());

        result.addAll(FlightList.getFlightList().stream()
                .filter(t -> t.getDepartureCity().equals(viaCity))
                .filter(t -> t.getArrivalCity().equals(arrivalCity))
                .collect(toList()));

        return result;
    }
}
