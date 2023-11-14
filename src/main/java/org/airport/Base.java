package org.airport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Base {
    public Connections connections = new Connections();
    public TypeOfFlight typeOfFlight = new TypeOfFlight();
    public CountryReader countryReader = new CountryReader();
    protected static final Logger LOGGER = LogManager.getLogger(Base.class);
    public Random random = new Random();
}
