package com.airport;

public class EconomicFly extends Fly {
    private String economicFly = "Economic fly";

    public EconomicFly(int cost, String ECONOMIC_FLY) {
        super(cost);
        this.economicFly = ECONOMIC_FLY;
    }
}
