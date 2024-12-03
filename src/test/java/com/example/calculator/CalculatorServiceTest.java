package com.example.calculator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    void calculateMean_ValidList_ReturnsCorrectMean() {
        List<Double> values = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(2.5, service.calculateMean(values));
    }

    @Test
    void calculateStandardDeviation_ValidList_ReturnsCorrectSD() {
        List<Double> values = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(1.118, service.calculateStandardDeviation(values, false), 0.001);
    }

    @Test
    void calculateZScore_ValidInput_ReturnsCorrectZScore() {
        double value = 5.0;
        double mean = 3.0;
        double stdDev = 2.0;
        assertEquals(1.0, service.calculateZScore(value, mean, stdDev));
    }

    @Test
    void calculateRegression_ValidInputs_ReturnsCorrectSlopeAndIntercept() {
        List<Double> xValues = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> yValues = Arrays.asList(2.0, 4.0, 6.0);
        double[] result = service.calculateRegression(xValues, yValues);
        assertEquals(2.0, result[0]); // Slope
        assertEquals(0.0, result[1]); // Intercept
    }
}
