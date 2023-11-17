package org.airport;

import org.airport.interfaces.IMenu;

public class EconomicFly extends Fly implements IMenu {
    public EconomicFly(int cost, String startFly, String endFly) {
        super(cost, startFly, endFly);
        int ID = this.ID;
    }

    public int getID() {
        return ID;
    }

    @Override
    protected void introduceMenu() {
        System.out.println("During a fly we provide a dinner and tea");
    }

    @Override
    public void buyAlcohol() {
        System.out.println("In economic class we dont have any alkohol in our menu");
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
        return "EconomicFly{" + ",IDTicket=" + ID +
                "cost=" + cost +
                ", startFly='" + startFly + '\'' +
                ", endFly='" + endFly + '\'' +
                "}\n";
    }
}
