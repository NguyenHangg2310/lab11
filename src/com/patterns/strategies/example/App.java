package com.patterns.strategies.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        String option = sc.next();

        switch (option) {
            case "sinX" -> strategy.setStrategy(new CalculateStrategySinX());
            case "cosX" -> strategy.setStrategy(new CalculateStrategyCosX());
            case "tanX" -> strategy.setStrategy(new CalculateStrategyTanX());
            case "cotX" -> strategy.setStrategy(new CalculateStrategyCotX());
        }

        double result = strategy.executeStrategy(x);
        System.out.println(result);
    }
}
