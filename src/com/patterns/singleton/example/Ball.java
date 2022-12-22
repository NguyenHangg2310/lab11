package com.patterns.singleton.example;

public class Ball {
    private static Ball ball;
    private String color;

    private Ball(String color) {
        this.color = color;
    }

    public void bounce() {
        System.out.println("Boing!");
    }


    public static Ball getInstance(String color) {
        if (ball == null) {
            ball = new Ball(color);
        }
        return ball;
    }
}
