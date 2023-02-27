package com.minhho.strategy.strategy1;

public class Strategy1Runner {
    public static void run() {
        Context context = new Context(new OperationAdd());
        System.out.println("2 + 3 = " + context.execute(2, 3));

         context = new Context(new OperationSubstract());
        System.out.println("2 - 3 = " + context.execute(2, 3));

        context = new Context(new OperationMultiply());
        System.out.println("2 * 3 = " + context.execute(2, 3));
    }
}
