package com.minhho.decorator.example3.concrete;

import com.minhho.decorator.example3.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
