package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        int a = 12;
        int b = 6;
        Calculator calculator = new Calculator();
        int sum = calculator.add(a, b);
        int sub = calculator.subtract(a, b);
        if (sum == 18 && sub == 6) {
            System.out.println("Jest ok");
        } else {
            System.out.println("Error");
        }
    }
}
