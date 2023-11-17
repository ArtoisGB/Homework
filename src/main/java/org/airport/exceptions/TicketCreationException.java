package org.airport.exceptions;

import org.airport.TextToPrint;

public class TicketCreationException extends Throwable {
    public String ticketCreationExc() {
        return TextToPrint.TICKET_CREATION_NULL.printLabel;
    }
}
