package com.patterns.strategies.example;

public class CalculateStrategyCosX implements TrigonometricStrategy{
    @Override
    public double execute(double x) {
        return Math.cos(x);
    }
}
