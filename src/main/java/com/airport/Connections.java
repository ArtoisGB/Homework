package com.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connections {
    static CountryArray countryArray = new CountryArray();
    static List<String[]> newList = new ArrayList<>();
    static List<String> namesToCheck = new ArrayList<>();
    String[] startPoint;
    String[] desirePoint;
    String[] middlePoint;
    CountryCode[] code = CountryCode.values();

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

        if (checkStraightFly(startPoint, countryExit)) {
            System.out.println("We can provide fly to " + countryExit);
        } else if (checkFlyWithOneStop(countryExit)) {
            System.out.println("We can provide a fly but with a stop in one country");
        } else {
            System.out.println("We can't provide fly!!");
        }
    }

    public boolean checkStraightFly(String[] country, String countryExit) {
        boolean status = false;
        if (Arrays.asList(country).contains(countryExit)) {
            status = true;
        }
        return status;
    }

    public boolean checkFlyWithOneStop(String removeTwo) {
        boolean status = false;
        List<String[]> checkStop = newList;
        String[] toCheck = startPoint; //copy array of connection StartPoint
        String country = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < toCheck.length; i++) {
            country = toCheck[i];
            String[] middle = checkStop.get(positionOnList(country));
            if (Arrays.asList(middle).contains(removeTwo)) {
                System.out.println("We found fly from " + country + ". It's a stop country on Your travel");
                sb.append(country + " ");
            }
        }
        if (!sb.isEmpty()) {
            status = true;
        }
        return status;
    }
}
