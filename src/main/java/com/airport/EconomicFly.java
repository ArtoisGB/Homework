package com.airport;

public class EconomicFly extends Fly {
    private String economicFly = "Economic fly";

    public EconomicFly(int cost, String ECONOMIC_FLY) {
        super(cost);
        this.economicFly = ECONOMIC_FLY;
    }

    public String getEconomicFly() {
        return economicFly;
    }

    public void setEconomicFly(String economicFly) {
        this.economicFly = economicFly;
    }

    @Override
    public void introduceMenu() {
        super.introduceMenu();
        System.out.println("Dinner and tea");
    }
}
