package com.minhho.strategy.models;

import com.minhho.strategy.algorithm.GoByFlyingAlgorithm;

public class Helicopter extends Vehicle{
    public Helicopter() {
        setGoAlgorithm(new GoByFlyingAlgorithm());
    }
}
