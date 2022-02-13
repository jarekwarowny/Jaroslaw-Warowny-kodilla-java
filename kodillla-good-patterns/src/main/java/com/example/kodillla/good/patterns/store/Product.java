package com.example.kodillla.good.patterns.store;

public class Product {

    private String nameOfProduct;
    private int productId;
    private double price;

    public Product(String nameOfProduct, int productId, double price) {
        this.nameOfProduct = nameOfProduct;
        this.productId = productId;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
