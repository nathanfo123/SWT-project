/**package com.example.calculator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CalculatorService {
    public double calculateMean(List<Double> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        return values.stream().mapToDouble(Double::doubleValue).sum() / values.size();
    }

    public double calculateStandardDeviation(List<Double> values, boolean isPopulation) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        double mean = calculateMean(values);
        double variance = values.stream()
                .mapToDouble(value -> Math.pow(value - mean, 2))
                .sum() / (isPopulation ? values.size() : values.size() - 1);
        return Math.sqrt(variance);
    }


    public double calculateZScore(double value, double mean, double stdDev) {
        if (stdDev == 0) {
            throw new IllegalArgumentException("Standard deviation cannot be zero");
        }
        return (value - mean) / stdDev;
    }

    public double[] calculateRegression(List<Double> xValues, List<Double> yValues) {
        if (xValues.size() != yValues.size()) {
            throw new IllegalArgumentException("X and Y lists must be of the same length");
        }

        int n = xValues.size();
        double sumX = xValues.stream().mapToDouble(Double::doubleValue).sum();
        double sumY = yValues.stream().mapToDouble(Double::doubleValue).sum();
        double sumXY = 0;
        double sumXSquare = 0;

        for (int i = 0; i < n; i++) {
            sumXY += xValues.get(i) * yValues.get(i);
            sumXSquare += Math.pow(xValues.get(i), 2);
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumXSquare - Math.pow(sumX, 2));
        double intercept = (sumY - slope * sumX) / n;

        return new double[]{slope, intercept};
    }

    public double predictY(double x, double slope, double intercept) {
        return slope * x + intercept;
    }
}
*/
package com.example.calculator;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {

    // Calculate Mean
    public double calculateMean(List<Double> values) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        return values.stream().mapToDouble(Double::doubleValue).sum() / values.size();
    }

    // Calculate Standard Deviation
    public double calculateStandardDeviation(List<Double> values, boolean isPopulation) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        double mean = calculateMean(values); // Uses the calculateMean method
        double variance = values.stream()
                .mapToDouble(value -> Math.pow(value - mean, 2))
                .sum() / (isPopulation ? values.size() : values.size() - 1); // Population vs Sample
        return Math.sqrt(variance);
    }

    // Calculate Z-Score
    public double calculateZScore(double value, double mean, double stdDev) {
        if (stdDev == 0) {
            throw new IllegalArgumentException("Standard deviation cannot be zero");
        }
        return (value - mean) / stdDev;
    }

    // Calculate Regression (Simple Linear Regression)
    public double[] calculateRegression(List<Double> xValues, List<Double> yValues) {
        if (xValues.size() != yValues.size()) {
            throw new IllegalArgumentException("X and Y lists must be of the same length");
        }

        int n = xValues.size();
        double sumX = xValues.stream().mapToDouble(Double::doubleValue).sum();
        double sumY = yValues.stream().mapToDouble(Double::doubleValue).sum();
        double sumXY = 0;
        double sumXSquare = 0;

        for (int i = 0; i < n; i++) {
            sumXY += xValues.get(i) * yValues.get(i);
            sumXSquare += Math.pow(xValues.get(i), 2);
        }

        double slope = (n * sumXY - sumX * sumY) / (n * sumXSquare - Math.pow(sumX, 2));
        double intercept = (sumY - slope * sumX) / n;

        return new double[]{slope, intercept};
    }

    // Predict Y value using Regression formula
    public double predictY(double x, double slope, double intercept) {
        return slope * x + intercept;
    }
}
