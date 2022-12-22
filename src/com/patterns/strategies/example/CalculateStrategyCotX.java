package com.patterns.strategies.example;

public class CalculateStrategyCotX implements TrigonometricStrategy {
    @Override
    public double execute(double x) {
        return Math.cos(x) / Math.sin(x);
    }
}
