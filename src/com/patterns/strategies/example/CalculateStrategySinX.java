package com.patterns.strategies.example;

public class CalculateStrategySinX implements TrigonometricStrategy{
    @Override
    public double execute(double x) {
        return Math.sin(x);
    }
}
