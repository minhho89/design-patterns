package com.minhho.obeservers.example1;

public class Client implements Observer{
    public Client() {
    }

    @Override
    public void update(String operation, String record) {
        System.out.println("The client says a " + operation + " operation was performed on " + record);
    }
}
