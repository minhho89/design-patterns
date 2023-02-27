package com.minhho.decorator.example;

public class Disk extends ComponentDecorator{

    Computer computer;

    public Disk(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + " and a disk";
    }
}
