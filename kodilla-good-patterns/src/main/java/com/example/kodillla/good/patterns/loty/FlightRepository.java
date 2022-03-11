package com.example.kodillla.good.patterns.loty;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public  static List<Flight> theFlight() {
        List<Flight> list = new ArrayList<>();
        list.add(new Flight("aaa","bbb"));
        list.add(new Flight("ccc","ddd"));
        list.add(new Flight("eee","fff"));
        list.add(new Flight("ggg","hhh"));
        return list;
    }
}
