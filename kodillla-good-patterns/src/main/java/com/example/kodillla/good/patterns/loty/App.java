package com.example.kodillla.good.patterns.loty;

public class App {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        System.out.println(flightService.from("aaa"));
        System.out.println(flightService.to("ddd"));
        System.out.println(flightService.across("fff","bbb", "aaa"));
    }
}
