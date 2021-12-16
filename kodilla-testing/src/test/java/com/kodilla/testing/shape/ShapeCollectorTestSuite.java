package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeCollectorTestSuite {

    @DisplayName("Doing first test")
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.addFigure(shape);
        //Then
        assertEquals(1, collector.getTheList().size());
    }

    @DisplayName("Doing second test")
    @Test
    public void testRemoveFigure() {
        //Give
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.removeFigure(shape);
        //Then
        assertEquals(0, collector.getTheList().size());
    }

    @DisplayName("Doing third test")
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.addFigure(shape);
        Shape theShape = collector.getFigure(0);
        //Then
        assertEquals(shape, theShape);
    }

    @DisplayName("Doing fourth test")
    @Test
    public void testShowFigureToString() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape shape = new Circle(1);
        //When
        collector.addFigure(shape);
        ArrayList<Shape> theSecondList = new ArrayList<>();
        theSecondList.add(shape);
        List<Shape> theThirdList = collector.getTheList();
        //Then
        Assertions.assertEquals(theSecondList.toString(), theThirdList.toString());
    }
}


