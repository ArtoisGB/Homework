package org.airport;

import org.airport.interfaces.IFlights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connections implements IFlights {
    static CountryArray countryArray = new CountryArray();
    private List<String[]> newList = new ArrayList<>();
    private List<String> namesToCheck = new ArrayList<>();
    private String[] startPoint;
    private String[] desirePoint;
    private CountryCode[] code = CountryCode.values();
    private String[] stopCountries;

    public int positionOnList(String value) {
        for (int i = 0; i < code.length; i++) {
            if (namesToCheck.get(i).equals(value)) {
                return i;
            }
        }
        return 0;
    }

    public void getStartPoint(String countryStart, String countryExit) {
        countryArray.addConnectionsToList();
        newList = countryArray.getListConnections();
        namesToCheck = countryArray.getListNames();
        startPoint = newList.get(positionOnList(countryStart));
        System.out.println(countryStart + " has connection to " + Arrays.asList(startPoint));
        desirePoint = newList.get(positionOnList(countryExit));
        System.out.println(countryExit + " has connection to " + Arrays.asList(desirePoint));
    }

    @Override
    public boolean provideFly(String countryStart, String countryExit) {
        boolean statusFly = false;
        if (checkStraightFly(startPoint, countryExit)) {
            System.out.println("We can provide fly to " + countryExit);
            statusFly = true;
        }
        return statusFly;
    }


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
                System.out.println("We found fly from " + country + ". It's a stop country on Your travel");
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
