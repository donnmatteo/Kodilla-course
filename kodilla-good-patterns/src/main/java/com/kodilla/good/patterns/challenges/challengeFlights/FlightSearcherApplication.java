package com.kodilla.good.patterns.challenges.challengeFlights;

public class FlightSearcherApplication {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.searchByDepartures("Warsaw").forEach(System.out::println);
        flightSearcher.searchByArrival("London").forEach(System.out::println);
        flightSearcher.searchByVia("Warsaw", "London", "Belgium").forEach(System.out::println);

    }
}
