package com.airport;

public enum TextToPrint {

    COUNTRY_START_INTRO("Please choose from country do You want a fly"),
    COUNTRY_DESTINY_INTRO("Please choose where do You want a travel");

    public final String toPrint;

    private TextToPrint(String toPrint) {
        this.toPrint = toPrint;
    }
}
