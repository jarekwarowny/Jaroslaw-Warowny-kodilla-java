package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Rozpoczynamy sprawdzanie czy klasa wykonuje sie poprawnie");
    }

    @AfterEach
    public void after() {
        System.out.println("Sprawdzanie zakonczone sukcesem");
    }

    @DisplayName("Sparwdzanie czy klasa zachowuje sie poprawnie gdy lista jest pusta")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator theEmptyList = new OddNumbersExterminator();
        List<Integer> theSecondEmptyList = theEmptyList.exterminate(new ArrayList<Integer>(emptyList));
        //When
        List<Integer> theThirdEmptyList = new ArrayList<>();
        //Then
        Assertions.assertEquals(theThirdEmptyList, theSecondEmptyList);
}
    @DisplayName("Sprawdzanie czy klasa zachowuje sie poprawnie gdy lista nie jest pusta")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> theList = new ArrayList<>();
        theList.add(1);
        theList.add(2);
        theList.add(3);
        theList.add(4);
        theList.add(5);
        theList.add(6);
        OddNumbersExterminator theNormalList = new OddNumbersExterminator();
        List<Integer> theListTest = theNormalList.exterminate(new ArrayList<Integer>(theList));
        //When
        List<Integer> withOutTheNormalList = new ArrayList<>();
        withOutTheNormalList.add(2);
        withOutTheNormalList.add(4);
        withOutTheNormalList.add(6);
        //Then
        Assertions.assertEquals(withOutTheNormalList, theListTest);
    }
}
