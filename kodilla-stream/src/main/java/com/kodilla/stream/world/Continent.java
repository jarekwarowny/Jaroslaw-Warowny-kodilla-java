package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public boolean addCountry(Country country) {
        return countries.add(country);
    }
}
