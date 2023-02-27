package com.minhho.strategy.models;

import com.minhho.strategy.algorithm.GoAlgorithm;

public abstract class Vehicle {
    private GoAlgorithm goAlgorithm;

    public Vehicle(){}

    public void setGoAlgorithm(GoAlgorithm goAlgorithm) {
        this.goAlgorithm = goAlgorithm;
    }

    public void go() {
        goAlgorithm.go();
    }
}
