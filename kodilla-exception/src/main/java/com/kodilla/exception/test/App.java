package com.kodilla.exception.test;

public class App {

    public static void main(String[] args) {

        Flight flight = new Flight("sss", "aaa");
        FindFlight theFindFlight = new FindFlight();

        try {
            theFindFlight.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
