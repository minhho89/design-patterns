package com.minhho.decorator.example3.concrete;

import com.minhho.decorator.example3.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
