package com.minhho.strategy.strategy2.algorithms;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String fromLoc, String toLoc) {
        System.out.println("Walking Strategy from " + fromLoc + " to " + toLoc);
    }
}
