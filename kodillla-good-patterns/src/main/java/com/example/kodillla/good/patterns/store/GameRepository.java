package com.example.kodillla.good.patterns.store;

public class GameRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product) {
        System.out.println("You chose product");
    }
}
