package ru.mirea.kabo.lab2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 1.0);
        System.out.println("Coordinates ball: "+ ball.toString());
        ball.move(3.0,4.0);
        System.out.println("New coordinates ball: " + ball);
        ball.setXY(9, 17);
        System.out.println("New coordinates ball: " + ball);
    }
}
