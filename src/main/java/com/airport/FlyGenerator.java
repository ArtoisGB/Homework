package com.airport;

public class FlyGenerator {
    private CountryCode code;
    private String typeOfFlight;

    public FlyGenerator(CountryCode c, String t) {
        this.code = c;
        this.typeOfFlight = t;
    }

    public String getTypeOfString() {
        return typeOfFlight;
    }

    public CountryCode getCode() {
        return code;
    }

    public void setTypeOfString(String typeOfFlight) {
        this.typeOfFlight = typeOfFlight;
    }

    public void setCode(CountryCode code) {
        this.code = code;
    }


}
