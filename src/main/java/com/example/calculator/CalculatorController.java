package com.example.calculator;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/mean")
    public Map<String, Object> calculateMean(@RequestBody List<Double> values) {
        double mean = calculatorService.calculateMean(values);
        Map<String, Object> response = new HashMap<>();
        response.put("result", mean);
        return response;
    }

    @PostMapping("/standardDeviation")
    public Map<String, Object> calculateStandardDeviation(
            @RequestBody List<Double> values,
            @RequestParam boolean isPopulation) {
        double stdDev = calculatorService.calculateStandardDeviation(values, isPopulation);
        Map<String, Object> response = new HashMap<>();
        response.put("result", stdDev);
        return response;
    }

    @PostMapping("/regression")
    public Map<String, Object> calculateRegression(@RequestBody RegressionRequest request) {
        double[] result = calculatorService.calculateRegression(request.getXValues(), request.getYValues());
        Map<String, Object> response = new HashMap<>();
        response.put("result", result);
        return response;
    }

    @GetMapping("/predict")
    public Map<String, Object> predictY(
            @RequestParam double x,
            @RequestParam double slope,
            @RequestParam double intercept) {
        double y = calculatorService.predictY(x, slope, intercept);
        Map<String, Object> response = new HashMap<>();
        response.put("result", y);
        return response;
    }
}
