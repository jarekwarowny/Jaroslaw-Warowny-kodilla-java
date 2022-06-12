package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost =  pizzaOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrdergetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assertions.assertEquals("Pizza", description);
    }

    @Test
    public void testBaconPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(18), calculatedCost);
    }

    @Test
    public void testBaconPizzaGetDescripton() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        Assertions.assertEquals("Pizza with bacon", desc);
    }

    @Test
    public void testExtraCheesePizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(21), calculatedCost);
    }

    @Test
    public void testExtraCheesePizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        Assertions.assertEquals("Pizza with extra cheese", desc);
    }
}
