package com.minhho.strategy.strategy2.algorithms;

public class PublicTransportStrategy implements RouteStrategy{
    @Override
    public void buildRoute(String fromLoc, String toLoc) {
        System.out.println("Public Transport Strategy from " + fromLoc + " to " + toLoc);
    }
}
