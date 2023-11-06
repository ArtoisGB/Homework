package com.airport;

public class TypeOfFlight {
    EconomicFly economicFly;
    ExpensiveFly expensiveFly;

    public void chooseTypeOfFlight(Fly type) {
        if (type.equals(economicFly)) {
            economicFly.introduceMenu();
        }
        if (type.equals(expensiveFly)) {
            expensiveFly.introduceMenu();
        }
    }
}
