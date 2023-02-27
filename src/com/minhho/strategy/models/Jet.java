package com.minhho.strategy.models;

import com.minhho.strategy.algorithm.GoByyFlyingFast;

public class Jet extends Vehicle{
    public Jet() {
        setGoAlgorithm(new GoByyFlyingFast());
    }
}
