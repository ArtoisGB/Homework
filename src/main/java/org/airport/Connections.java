package org.airport;

import org.airport.interfaces.IFlights;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Connections implements IFlights {
    protected static final Logger LOGGER = LogManager.getLogger(Connections.class);
    private static CountryArray countryArray = new CountryArray();
    private static List<String[]> newList;
    private static List<String> namesToCheck;
    private String[] startPoint;
    private String[] desirePoint;
    private CountryCode[] code = CountryCode.values();
    private String[] stopCountries;

    public int positionOnList(String value) {
        int position = 0;
        for (int i = 0; i < code.length; i++) {
            if (namesToCheck.get(i).equals(value)) {
                position = i;
            }
        }
        return position;
    }

    static {
        countryArray.addConnectionsToList();
        newList = countryArray.getListConnections();
        namesToCheck = countryArray.getListNames();
    }

    public void getStartPoint(String countryStart, String countryExit) {

        startPoint = newList.get(positionOnList(countryStart));
        LOGGER.info(countryStart + " has connection to " + Arrays.asList(startPoint));
        desirePoint = newList.get(positionOnList(countryExit));
        LOGGER.info(countryExit + " has connection to " + Arrays.asList(startPoint));
    }

    @Override
    public boolean provideFly(String countryStart, String countryExit) {
        boolean statusFly = false;
        if (checkStraightFly(startPoint, countryExit)) {
            LOGGER.info("We can provide fly to " + countryExit);
            statusFly = true;
        }
        return statusFly;
    }

    @Override
    public boolean checkStraightFly(String[] country, String countryExit) {
        boolean status = false;
        if (Arrays.asList(country).contains(countryExit)) {
            status = true;
        }
        return status;
    }

    @Override
    public boolean checkFlyWithOneStop(String countryStart, String countryExit) {
        boolean status = false;
        List<String[]> checkStop = newList;
        String[] toCheck = startPoint; //copy array of connection StartPoint
        String country = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < toCheck.length; i++) {
            country = toCheck[i];
            if (country.equals(countryExit) || country.equals(countryStart)) {
                continue;
            }
            String[] middle = checkStop.get(positionOnList(country));
            if (Arrays.asList(middle).contains(countryExit)) {
                LOGGER.info("We found fly from " + country + ". It's a stop country on Your travel");
                sb.append(country + " ");
            }
        }

        if (!sb.isEmpty()) {
            String countries = String.valueOf(sb);
            stopCountries = countries.split(" ");
            status = true;
        }
        return status;
    }

    public String[] getStopArray() {
        return stopCountries;
    }
}
