package org.airport.interfaces;

import org.airport.Fly;
import org.airport.exceptions.TicketCreationException;

public interface ITypeOfFlight {
    Fly createTicket(String type, String sPoint, String ePoint, int cost) throws TicketCreationException;
}
