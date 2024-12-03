package com.example.calculator;

import lombok.Data;

import java.util.List;

@Data

public class RegressionRequest {
    private List<Double> xValues;
    private List<Double> yValues;
}
