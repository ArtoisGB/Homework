package org.airport;

import org.airport.interfaces.ITypeOfFlight;

public class TypeOfFlight implements ITypeOfFlight {
    @Override
    public Fly createTicket(String type, String sPoint, String ePoint, int cost) {
        if (type.equals("Economic class")) {
            EconomicFly economicFly = new EconomicFly(cost, sPoint, ePoint);
            return economicFly;
        }
        if (type.equals("First class")) {
            FirstClassFly firstClassFly = new FirstClassFly(cost, sPoint, ePoint);
            return firstClassFly;
        }
        return null;
    }
}
