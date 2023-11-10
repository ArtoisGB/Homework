package org.airport;

public class TypeOfFlight {
    public Fly createTicket(String type, String sPoint, String ePoint, int cost) {
        if (type.equals("Economic class")) {
            EconomicFly economicFly = new EconomicFly(cost, sPoint, ePoint);
            return economicFly;
        }
        if (type.equals("First class")) {
            FirstClassFly firstClassFly = new FirstClassFly();
            firstClassFly.setCost(200);
            firstClassFly.setStartFly(sPoint);
            firstClassFly.setEndFly(ePoint);
            return firstClassFly;
        }
        return null;
    }
}
