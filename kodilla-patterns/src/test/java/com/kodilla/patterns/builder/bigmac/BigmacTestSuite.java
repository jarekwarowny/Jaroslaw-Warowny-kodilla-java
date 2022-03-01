package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(3)
                .sauce("spicy")
                .ingredient("onion")
                .ingredient("chilli")
                .ingredient("bacon")
                .ingredient("cheese")
                .ingredient("lettuce")
                .build();
        System.out.println(bigmac);
        int howManyIngredients = bigmac.getIngredients().size();
        Assertions.assertEquals(5, howManyIngredients);


    }
}
