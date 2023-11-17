package org.airport.exceptions;

import org.airport.TextToPrint;

public class EmptyListException extends Throwable {
    public String emptyListException() {
        return TextToPrint.NULL_ERROR.printLabel;
    }
}
