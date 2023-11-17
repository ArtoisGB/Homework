package org.airport.exceptions;

import org.airport.TextToPrint;

public class WrongTypeException extends Throwable {

    public String wrongTypeException() {
        return TextToPrint.INT_TYPE_USED.printLabel;
    }

    public String wrongValueException() {
        return TextToPrint.WRONG_VALUE_USED.printLabel;
    }
}

