package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> continents = new ArrayList<>();

    public List<Continent> getContinents() {
        return continents;
    }

    public boolean addContinent(Continent continent) {
        return continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal thePeopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));
        return thePeopleQuantity;
    }
}
