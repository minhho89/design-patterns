package com.minhho;

import com.minhho.decorator.example.DecoratorExRunner;
import com.minhho.decorator.example1.DecoratorEx1Runner;
import com.minhho.decorator.example3.DecorationEx3Runner;
import com.minhho.obeservers.example1.ObserverEx1Runner;
import com.minhho.obeservers.example2.ObserversEx2Runner;
import com.minhho.strategy.StrategyRunner;
import com.minhho.strategy.strategy1.Strategy1Runner;
import com.minhho.strategy.strategy2.algorithms.Strategy2Runner;
import com.minhho.strategy.strategy3.Strategy3Runner;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        ObserversEx2Runner.run();
    }
}
