package com.minhho.obeservers.example1;

public class Archiver implements Observer{
    public Archiver() {
    }

    @Override
    public void update(String operation, String record) {
        System.out.println("The archiver says a " + operation + " operation was performed on " + record);
    }
}
