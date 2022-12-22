package com.patterns.strategies.example;

public class Strategy {
    private TrigonometricStrategy trigonometricStrategy;

    public void setStrategy(TrigonometricStrategy trigonometricStrategy) {
        this.trigonometricStrategy = trigonometricStrategy;
    }

    public double executeStrategy(double x) {
        return trigonometricStrategy.execute(x);
    }
}
