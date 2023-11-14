package org.airport;

import org.airport.interfaces.IReader;

import java.util.Scanner;

public final class CountryReader implements IReader {
    private final Scanner sc = new Scanner(System.in);

    @Override
    public String countryReaderScanner() {
        String country = sc.nextLine();
        return country;
    }
}
