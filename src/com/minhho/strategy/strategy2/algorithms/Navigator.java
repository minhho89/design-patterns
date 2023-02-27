package com.minhho.strategy.strategy2.algorithms;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void buildRoute(String fromLoc, String toLoc) {
        routeStrategy.buildRoute(fromLoc, toLoc);
    }
}
