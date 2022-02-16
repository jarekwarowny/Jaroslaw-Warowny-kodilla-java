package com.example.kodillla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public List<Flight> to(String arrivalAirport) {
        return FlightRepository.theFlight().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> from(String departureAirport) {
        return FlightRepository.theFlight().stream()
                .filter((flight -> flight.getDepartureAirport().equals(departureAirport)))
                .collect(Collectors.toList());
    }

    public List<Flight> across(String arrivalAirport, String acrossAirport, String departureAirport) {
        List<Flight> theList = FlightRepository.theFlight().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .filter(flight -> flight.getArrivalAirport().equals(acrossAirport))
                .collect(Collectors.toList());

        List<Flight> theSecondList = FlightRepository.theFlight().stream()
                .filter(flight -> flight.getDepartureAirport().equals(acrossAirport))
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        List<Flight> theThirdList = new ArrayList<>();
        theThirdList.addAll(theSecondList);
        return theThirdList;
    }
}
