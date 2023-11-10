package com.airport;

import com.airport.interfaces.Reader;

import java.util.Scanner;

public class CountryReader implements Reader {
    protected Scanner sc = new Scanner(System.in);

    @Override
    public String countryReaderScanner() {
        String country = sc.nextLine();
        return country;
    }
}
