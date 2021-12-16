package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name = "Square";
    private double a;

    Square(double squareField) {
        this.a = squareField;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return Math.pow(a, 2);
    }
}
