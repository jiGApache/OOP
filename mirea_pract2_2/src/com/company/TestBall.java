package com.company;

public class TestBall {

    public static void main(String[] args) {
	Ball ball = new Ball(10, 30);
	System.out.println(ball);
	ball.move(30,5);
	System.out.println(ball);
    }
}
