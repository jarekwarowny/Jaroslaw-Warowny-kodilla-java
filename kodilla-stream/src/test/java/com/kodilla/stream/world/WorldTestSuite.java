package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        Country country1 = new Country(new BigDecimal("54545"));
        Country country2 = new Country(new BigDecimal("343434"));
        Country country3 = new Country(new BigDecimal("3434342"));
        Country country4 = new Country(new BigDecimal("54665"));
        Country country5 = new Country(new BigDecimal("6325667"));
        Country country6 = new Country(new BigDecimal("544647"));

        Continent continent1 =  new Continent();
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        Continent continent2 = new Continent();
        continent2.addCountry(country3);
        continent2.addCountry(country4);
        Continent continent3 = new Continent();
        continent2.addCountry(country5);
        continent2.addCountry(country6);

        World theWorld = new World();
        theWorld.addContinent(continent1);
        theWorld.addContinent(continent2);
        theWorld.addContinent(continent3);

        BigDecimal sumOfQuantityOfPeople = theWorld.getPeopleQuantity();
        BigDecimal theSumOfQuantityOfPeople = new BigDecimal("10757300");
        Assertions.assertEquals(theSumOfQuantityOfPeople, sumOfQuantityOfPeople);
    }
}
