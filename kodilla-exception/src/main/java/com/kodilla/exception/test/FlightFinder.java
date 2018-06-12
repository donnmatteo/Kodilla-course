package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Chopin", true);
        airports.put("Heathrow", true);
        airports.put("Modlin", false);

        if(!airports.containsKey(flight.getArrivalAirport()) || !airports.containsKey(flight.getDepartureAirport())){
            throw new RouteNotFoundException("Sorry, something went wrong");
        }

        if(airports.containsKey(flight.getArrivalAirport()) && airports.containsKey(flight.getDepartureAirport())){
            boolean check = airports.get(flight.getArrivalAirport());
            if(check == true){
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() +
                    " is possible.");
            } else {
                System.out.println("Sorry, direct flight from this location is not possible");
            }
        }
    }

    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Chopin", "Las Vegas");

        try{
            flightFinder.findFlight(flight1);

        } catch(RouteNotFoundException e){
            System.out.println("Try different airport.");
        }

    }
}
