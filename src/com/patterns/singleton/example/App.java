package com.patterns.singleton.example;

public class App {
    public static void main(String[] args) {
        Ball ball1 = Ball.getInstance("Yellow");
        ball1.bounce();

        Ball ball2 = Ball.getInstance("Blue");
        ball2.bounce();

        Ball ball3 = Ball.getInstance("Yellow");
        ball3.bounce();
    }


}
