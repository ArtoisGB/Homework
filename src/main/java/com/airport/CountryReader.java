package com.airport;

import java.util.Scanner;

public class CountryReader {
    protected Scanner sc = new Scanner(System.in);

    protected String countryReaderScanner() {
        String country = sc.nextLine();
        return country;
    }
}
