package com.minhho.strategy.strategy1;

public class OperationAdd implements OperationStrategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
