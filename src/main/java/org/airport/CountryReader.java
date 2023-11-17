package org.airport;

import org.airport.exceptions.WrongTypeException;
import org.airport.interfaces.IReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public final class CountryReader implements IReader {
    private static final Logger LOGGER = LogManager.getLogger(CountryReader.class);
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String typeFlightScanner() {
        String type = "";
        try {
            type = scanner.nextLine();
            if (type.equals("")) {
                throw new WrongTypeException();
            }
        } catch (WrongTypeException e) {
            LOGGER.info(e.wrongValueException());
        }
        return type;
    }

    public String countryReaderScanner() {
        String country = "";
        try (Scanner sc = new Scanner(System.in)) {
            country = sc.nextLine();
            if (sc.hasNextInt()) {
                throw new WrongTypeException();
            }
        } catch (WrongTypeException e) {
            LOGGER.error(e.wrongTypeException());
        }
        return country;
    }
}
