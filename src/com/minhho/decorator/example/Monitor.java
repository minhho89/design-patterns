package com.minhho.decorator.example;

public class Monitor extends ComponentDecorator{

    Computer computer;

    public Monitor(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + " and a monitor";
    }
}
