package com.minhho.decorator.example;

public class CD extends ComponentDecorator {

    Computer computer;

    public CD(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + " and a CD";
    }
}
