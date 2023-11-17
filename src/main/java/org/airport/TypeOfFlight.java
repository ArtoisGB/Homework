package org.airport;

import org.airport.exceptions.TicketCreationException;
import org.airport.interfaces.ITypeOfFlight;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TypeOfFlight implements ITypeOfFlight {
    protected static final Logger LOGGER = LogManager.getLogger(TypeOfFlight.class);

    @Override
    public Fly createTicket(String type, String sPoint, String ePoint, int cost) throws TicketCreationException {
        if (type.equals("Economic class")) {
            EconomicFly economicFly = new EconomicFly(cost, sPoint, ePoint);
            return economicFly;
        }
        if (type.equals("First class")) {
            FirstClassFly firstClassFly = new FirstClassFly(cost, sPoint, ePoint);
            return firstClassFly;
        }
        if (type.equals(null)) {
            throw new TicketCreationException();
        }
        return null;
    }
}
