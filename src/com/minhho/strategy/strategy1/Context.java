package com.minhho.strategy.strategy1;

public class Context {
    private OperationStrategy operationStrategy;

    public Context(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public int execute(int num1, int num2) {
        return operationStrategy.doOperation(num1, num2);
    }
}
