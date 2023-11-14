package org.airport;

import org.airport.interfaces.IMenu;

public class FirstClassFly extends Fly implements IMenu {
    public FirstClassFly(int cost, String startFly, String endFly) {
        super(cost, startFly, endFly);
        int ID = this.ID;
    }

    public int getID() {
        return ID;
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
        return "You will fly in First class, " +
                "id ticket is: " + ID +
                " it will cost(EUR):" + cost +
                ", Your fly will start in:'" + startFly + '\'' +
                ", and end in:'" + endFly + "'\n";
    }
}
