package com.minhho.strategy.models;

import com.minhho.strategy.algorithm.GoByDrivingAlgorithm;

public class FormulaOne extends Vehicle{
    public FormulaOne() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
