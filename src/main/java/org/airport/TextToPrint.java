package org.airport;

public enum TextToPrint {

    COUNTRY_START_INTRO("Please choose from country do You want a fly"),
    COUNTRY_DESTINY_INTRO("Please choose where do You want a travel"),
    GREETINGS("Hello, tell us from what country to which country do You want fly"),
    CHOOSE("Hello, tell us what type of flight do You need. We can provide \n economic class or first class");

    public final String printLabel;

    private TextToPrint(String printLabel) {
        this.printLabel = printLabel;
    }

}
