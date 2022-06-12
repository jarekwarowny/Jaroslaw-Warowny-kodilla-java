package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        String desciption = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Drive a course", desciption);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(37), theCost);
    }

    @Test
    public void testMyTaxiChildSeatGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Drive a course by MyTax Netowrk + child seat", description);
    }

    @Test
    public void testUberWithTwoChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(29), theCost);
    }

    @Test
    public void testUberWithtwoChildSeatsGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Drive a course by MyTaxi Network = child seat", description);
    }
}
