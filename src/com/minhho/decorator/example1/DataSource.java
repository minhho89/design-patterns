package com.minhho.decorator.example1;

public interface DataSource {
    void writeData(String data);
    String readData();
}
