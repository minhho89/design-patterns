package com.minhho.obeservers.example1;

import java.util.Vector;

public class Database implements Subject{

    private Vector<Observer> observers;
    private String operation;
    private String record;

    public Database() {
        this.observers = new Vector<Observer>();
    }

    public void editRecord(String operation, String record){
        this.operation = operation;
        this.record = record;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(operation, record);
        }
    }
}
