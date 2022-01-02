package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> theList = new ArrayList<>();

    public List<Continent> getTheList() {
        return theList;
    }

    public boolean addContinent(Continent continent) {
        return theList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal thePeopleQuantity = theList.stream()
                .flatMap(continent -> continent.getTheList2().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));
        return thePeopleQuantity;
    }
}
