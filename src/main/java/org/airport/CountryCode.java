package org.airport;

public enum CountryCode {
    POLAND("Poland"),
    BELGIUM("Belgium"),
    GERMANY("Germany"),
    ITALY("Italy"),
    SWEDEN("Sweden"),
    ENGLAND("England"),
    ISLAND("Island"),
    AUSTRIA("Austria");

    public final String CODE_LABEL;

    private CountryCode(String codeLabel) {
        this.CODE_LABEL = codeLabel;
    }

}
