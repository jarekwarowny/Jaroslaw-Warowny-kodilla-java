package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name = "Triangle";
    private double giveA;
    private double giveH;

    Triangle(double giveA, double giveH) {
        this.giveA = giveA;
        this.giveH = giveH;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        return giveA * giveH / 2;
    }
}
