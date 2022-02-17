package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    void testCalculations() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = applicationContext.getBean(Calculator.class);

        double firstResult = calculator.add(1,1);
        double secondResult = calculator.sub(1,1);
        double thirdResult = calculator.mul(4,2);
        double fourthResult = calculator.div(9,3);

        Assertions.assertEquals(2,firstResult);
        Assertions.assertEquals(0,secondResult);
        Assertions.assertEquals(8,thirdResult);
        Assertions.assertEquals(3,fourthResult);
    }
}
