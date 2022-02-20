package com.example.kodillla.good.patterns.store;

public class ProductService {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRetriver().retriver();
        OrderProcessor orderProcessor = new OrderProcessor(new Mail(), new GameService(), new GameRepository());
        orderProcessor.process(orderRequest);
    }
}
