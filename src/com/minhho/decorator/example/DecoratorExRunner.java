package com.minhho.decorator.example;

public class DecoratorExRunner {
    public static void run() {
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monitor(computer);
        computer = new CD(computer);
        computer = new CD(computer);

        System.out.println("You're getting a " + computer.description() + ".");
    }
}
