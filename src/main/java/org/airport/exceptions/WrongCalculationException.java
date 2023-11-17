package org.airport.exceptions;

import org.airport.TextToPrint;

public class WrongCalculationException extends Throwable {

    public String wrongCalcuExc() {
        return TextToPrint.WRONG_CALCULATION.printLabel;
    }
}
