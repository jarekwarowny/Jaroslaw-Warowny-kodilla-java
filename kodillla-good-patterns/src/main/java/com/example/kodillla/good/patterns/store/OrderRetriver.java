package com.example.kodillla.good.patterns.store;

public class OrderRetriver {

    public OrderRequest retriver() {
        User user = new User("Jarek", "jw", "jarek@gmail.com");
        Product product = new Product("The Witcher", 1, 190);
        return new OrderRequest(user, product);
    }
}
