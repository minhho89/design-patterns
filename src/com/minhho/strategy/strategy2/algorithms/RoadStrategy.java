package com.minhho.strategy.strategy2.algorithms;

public class RoadStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String fromLoc, String toLoc) {
        System.out.println("Road Strategy from " + fromLoc + " to " + toLoc);
    }
}
