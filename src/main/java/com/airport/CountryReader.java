package com.airport;

import com.airport.interfaces.IReader;

import java.util.Scanner;

public class CountryReader implements IReader {
    protected Scanner sc = new Scanner(System.in);

    @Override
    public String countryReaderScanner() {
        String country = sc.nextLine();
        return country;
    }
}
