package com.minhho.decorator.example3.concreteDecoration;

import com.minhho.decorator.example3.Shape;
import com.minhho.decorator.example3.decorators.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
