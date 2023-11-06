package com.airport;

import java.util.Scanner;

public class CountryReader {
    Scanner sc = new Scanner(System.in);

    public String countryReaderScanner() {
        String country = sc.nextLine();
        return country;
    }
}
