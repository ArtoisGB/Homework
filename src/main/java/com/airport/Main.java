package com.airport;

public class Main {
    public static void main(String[] args) {
        CountryReader countryReader = new CountryReader();
        System.out.println(TextToPrint.COUNTRY_START_INTRO.toPrint);
        countryReader.countryReaderScanner();
        System.out.println(TextToPrint.COUNTRY_DESTINY_INTRO.toPrint);
        countryReader.countryReaderScanner();
        Introduction introduction = new Introduction();
        introduction.intro();


    }
}
