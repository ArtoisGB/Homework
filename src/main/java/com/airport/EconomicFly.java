package com.airport;

public class EconomicFly extends Fly implements Menu {
    protected EconomicFly(int cost, String startFly, String endFly) {
        super(cost, startFly, endFly);
    }

    @Override
    protected void introduceMenu() {
        System.out.println("During a fly we provide a dinner and tea");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void buyAlcohol() {
        System.out.println("In economic class we dont have any alkohol in our menu");
    }

}
