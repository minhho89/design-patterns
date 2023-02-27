package com.minhho.strategy;

import com.minhho.strategy.models.FormulaOne;
import com.minhho.strategy.models.Helicopter;
import com.minhho.strategy.models.Jet;
import com.minhho.strategy.models.StreetRacer;

public class StrategyRunner {

    public static void run() {
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter();
        Jet jet = new Jet();

        streetRacer.go();
        formulaOne.go();
        helicopter.go();
        jet.go();
    }

}
