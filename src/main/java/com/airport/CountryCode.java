package com.airport;

public enum CountryCode {
    PL("Poland"),
    ENG("England"),
    GER("Germany"),
    BE("Belgium");

    public final String codeLabel;

    private CountryCode(String codeLabel) {
        this.codeLabel = codeLabel;
    }
}
