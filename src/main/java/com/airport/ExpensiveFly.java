package com.airport;

public class ExpensiveFly extends Fly {
    private String expFly = "ExpensiveFly";

    public ExpensiveFly(int cost, String expFly) {
        super(cost);
        this.expFly = expFly;
    }
}
