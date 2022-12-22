package com.patterns.strategies.example;

public class CalculateStrategyTanX implements TrigonometricStrategy {
    @Override
    public double execute(double x) {
        return Math.sin(x) / Math.cos(x);
    }
}
