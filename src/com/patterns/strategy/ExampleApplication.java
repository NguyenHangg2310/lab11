package com.patterns.strategy;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String action = sc.next();

        switch (action) {
            case "addition" -> context.setStrategy(new ConcreteStrategyAdd());
            case "subtract" -> context.setStrategy(new ConcreteStrategySubtract());
            case "multiplication" -> context.setStrategy(new ConcreteStrategyMultiply());

        }

        int result = context.executeStrategy(a,b);
        System.out.println(result);
    }
}
