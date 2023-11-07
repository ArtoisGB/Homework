package com.airport;

public abstract class Fly implements Menu {
    protected int cost;
    protected String startFly;
    protected String endFly;

    public Fly(int cost, String startFly, String endFly) {
        this.cost = cost;
        this.startFly = startFly;
        this.endFly = endFly;
    }

    public Fly() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getStartFly() {
        return startFly;
    }

    public void setStartFly(String startFly) {
        this.startFly = startFly;
    }

    public String getEndFly() {
        return endFly;
    }

    public void setEndFly(String endFly) {
        this.endFly = endFly;
    }

    public abstract void introduceMenu();


}
