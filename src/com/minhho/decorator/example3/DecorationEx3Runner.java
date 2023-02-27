package com.minhho.decorator.example3;

import com.minhho.decorator.example3.concrete.Circle;
import com.minhho.decorator.example3.concrete.Rectangle;
import com.minhho.decorator.example3.concreteDecoration.RedShapeDecorator;

public class DecorationEx3Runner {
    public static void run() {
        Shape cirle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Cicrle with normal border");
        cirle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
