package com.airport;

public class FirstClassFly extends Fly implements Menu {

    protected FirstClassFly(int cost, String startFly, String endFly) {
        super(cost, startFly, endFly);
    }

    protected FirstClassFly() {
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost * 2;
    }

    @Override
    protected void introduceMenu() {
        System.out.println("During a fly we provide big size dinner also to choose tea or coffee and snacks");
    }

    @Override
    public void buyAlcohol() {
        System.out.println("In first class we provide only one drink");
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
        return "FirstClassFly{" +
                "cost=" + cost +
                ", startFly='" + startFly + '\'' +
                ", endFly='" + endFly + '\'' +
                '}';
    }
}
