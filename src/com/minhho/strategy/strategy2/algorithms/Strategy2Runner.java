package com.minhho.strategy.strategy2.algorithms;

public class Strategy2Runner {

    public static void run() {
        Navigator nav = new Navigator(new RoadStrategy());
        nav.buildRoute("Saigon", "Hanoi");

        nav = new Navigator(new WalkingStrategy());
        nav.buildRoute("Saigon", "Hanoi");

        nav = new Navigator(new PublicTransportStrategy());
        nav.buildRoute("Saigon", "Hanoi");
    }
}
