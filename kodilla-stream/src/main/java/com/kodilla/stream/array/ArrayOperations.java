package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n]);

         double sum = IntStream.range(0, numbers.length)
                     .map(n -> numbers[n])
                     .average()
                     .getAsDouble();
         return sum;
    }
}
