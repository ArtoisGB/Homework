package org.airport;

import org.airport.interfaces.IMenu;

public abstract class Fly implements IMenu {
    protected int cost;
    protected String startFly;
    protected String endFly;
    protected final int ID;
    protected static int idCounter = 0;

    public Fly(int cost, String startFly, String endFly) {
        this.cost = cost;
        this.startFly = startFly;
        this.endFly = endFly;
        this.ID = idCounter++;
    }

    public int getID() {
        return ID;
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

    protected abstract void introduceMenu();

    @Override
    public String toString() {
        return "Fly{" +
                "cost=" + cost + ",idTicket=" + idCounter +
                ", startFly='" + startFly + '\'' +
                ", endFly='" + endFly + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
