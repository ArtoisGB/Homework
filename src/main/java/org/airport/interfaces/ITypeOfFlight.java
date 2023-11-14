package org.airport.interfaces;

import org.airport.Fly;

public interface ITypeOfFlight {
    Fly createTicket(String type, String sPoint, String ePoint, int cost);
}
