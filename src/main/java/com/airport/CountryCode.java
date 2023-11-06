package com.airport;

public enum CountryCode {
    POLAND("Poland"),
    BELGIUM("Belgium"),
    GERMANY("Germany"),
    ITALY("Italy"),
    SWEDEN("Sweden"),
    ENGLAND("England"),
    ISLAND("Island"),
    AUSTRIA("Austria");


    public final String codeLabel;

    private CountryCode(String codeLabel) {
        this.codeLabel = codeLabel;
    }

}
