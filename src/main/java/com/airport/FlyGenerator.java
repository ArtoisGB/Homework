package com.airport;

public class FlyGenerator {
    private CountryCode code;
    private Fly typeOfFlight;

    public FlyGenerator(CountryCode c, Fly t) {
        this.code = c;
        this.typeOfFlight = t;
    }

    public Fly getTypeOfString() {
        return typeOfFlight;
    }

    public CountryCode getCode() {
        return code;
    }

    public void setTypeOfString(Fly typeOfFlight) {
        this.typeOfFlight = typeOfFlight;
    }

    public void setCode(CountryCode code) {
        this.code = code;
    }
}
