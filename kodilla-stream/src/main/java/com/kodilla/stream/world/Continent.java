package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country> theList2 = new ArrayList<>();

    public List<Country> getTheList2() {
        return theList2;
    }

    public boolean addCountry(Country country) {
        return theList2.add(country);
    }
}
