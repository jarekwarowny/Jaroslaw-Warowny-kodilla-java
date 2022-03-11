package com.example.kodillla.good.patterns.loty;

class App {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        System.out.println(flightService.across("fff","bbb", "aaa"));
        System.out.println(flightService.to("bbb"));
    }
}
