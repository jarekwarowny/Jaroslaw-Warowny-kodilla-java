package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal quantityofPeople;

    public Country(final BigDecimal quantityofPeople) {
        this.quantityofPeople = quantityofPeople;
    }

    public BigDecimal getPeopleQuantity() {
        return quantityofPeople;
    }

}
