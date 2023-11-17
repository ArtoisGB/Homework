package org.airport.interfaces;

public interface IFlights {
    boolean provideFly(String start, String exit);

    boolean checkFlyWithOneStop(String start, String exit);

    boolean checkStraightFly(String[] country, String countryExit);
}
