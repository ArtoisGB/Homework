package org.airport;

import org.airport.exceptions.EmptyListException;
import org.airport.exceptions.TicketCreationException;
import org.airport.exceptions.WrongCalculationException;

public class Main {
    public static void main(String[] args) throws EmptyListException, WrongCalculationException, TicketCreationException {
        Introduction introduction = new Introduction();
        introduction.intro();
    }
}
