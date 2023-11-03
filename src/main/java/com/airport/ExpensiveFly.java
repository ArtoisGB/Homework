package com.airport;

public class ExpensiveFly extends Fly {
    private String expFly = "ExpensiveFly";

    public ExpensiveFly(int cost, String expFly) {
        super(cost);
        this.expFly = expFly;
    }

    public String getExpFly() {
        return expFly;
    }

    public void setExpFly(String expFly) {
        this.expFly = expFly;
    }

    @Override
    public void doSmth() {
        super.doSmth();
        System.out.println("Big size dinner, to choose tea or coffee and snacks");
    }
}
