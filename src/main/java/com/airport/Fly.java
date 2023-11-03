package com.airport;

public class Fly {
    private int cost;

    public Fly(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void introduceMenu() {
        System.out.println("We can offer to eat on fly:");
    }
}
