package com.minhho.strategy.models;

import com.minhho.strategy.algorithm.GoByDrivingAlgorithm;

public class StreetRacer extends Vehicle{
    public StreetRacer() {
        setGoAlgorithm(new GoByDrivingAlgorithm());
    }
}
