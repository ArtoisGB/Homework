package com.airport;

public enum TextToPrint {

    COUNTRY_START_INTRO("Please choose from country do You want a fly"),
    COUNTRY_DESTINY_INTRO("Please choose where do You want a travel"),
    GREETINGS("Hello, tell us from what country do You fly and to which country"),
    CHOOSE("Hello, tell us what type of flight do You need. We can provide \n economic class or first class");

    public final String toPrint;

    private TextToPrint(String toPrint) {
        this.toPrint = toPrint;
    }

}
