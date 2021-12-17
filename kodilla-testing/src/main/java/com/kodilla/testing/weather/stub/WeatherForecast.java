package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double calculateAverage() {
        Map<String, Double> theFirstMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            theFirstMap.put(temperature.getKey(), temperature.getValue() + 0.0);
        }

        double sumOfAverage = theFirstMap.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        Map.Entry<String, Double> e = theFirstMap.entrySet().stream().min(Comparator.comparing(a -> Math.abs(a.getValue() - sumOfAverage))).orElse(null);
        return sumOfAverage;
    }
    public Double calculateMedian() {
        Map<String, Double> theSecondMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            theSecondMap.put(temperature.getKey(), temperature.getValue() + 0.0);
        }
        Object[] values = theSecondMap.values().toArray();
        Arrays.sort(values);
        double sumOfMedian = 0;
        int totalElements = theSecondMap.size();
        int sumOfMiddleElements;
        if (totalElements % 2 == 0) {
            sumOfMiddleElements = (int) values[totalElements / 2 + totalElements / 2 - 1];
            sumOfMedian = (double) sumOfMiddleElements / 2;
        } else {
            sumOfMedian = (double) values[values.length / 2];
        }
        return sumOfMedian;
    }
}

