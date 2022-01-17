package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight (Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("aaa", true);
        airport.put("dsds", true);
        airport.put("ds", false);
        airport.put("dsa", false);

        if (airport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Lotnisko:" + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Brak lotniska");
        }
    }
}

