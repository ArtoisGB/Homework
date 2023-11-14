package org.airport;

import java.util.Random;

public class Base {
    public Connections connections = new Connections();
    public TypeOfFlight typeOfFlight = new TypeOfFlight();
    public CountryReader countryReader = new CountryReader();
    public Random random = new Random();
}
