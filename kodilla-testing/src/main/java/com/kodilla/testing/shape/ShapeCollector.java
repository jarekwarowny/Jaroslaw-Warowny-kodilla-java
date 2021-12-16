package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> theList = new ArrayList<>();

    List<Shape> getTheList() {
        return theList;
    }

    public void addFigure(Shape shape) {
        theList.add(shape);
    }

    public void removeFigure(Shape shape) {
        theList.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < theList.size()) {
            return theList.get(n);
        } else {
            return null;
        }
    }

    public void showFigures() {
       System.out.println(theList.toString());
    }
}

