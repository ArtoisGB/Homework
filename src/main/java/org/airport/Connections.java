package org.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connections {
    static CountryArray countryArray = new CountryArray();
    private List<String[]> newList = new ArrayList<>();
    private List<String> namesToCheck = new ArrayList<>();
    private String[] startPoint;
    private String[] desirePoint;
    String[] middlePoint;
    private CountryCode[] code = CountryCode.values();

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

    public boolean provideFly(String countryStart, String countryExit) {
        boolean statusFly = false;
        getStartPoint(countryStart, countryStart);
        if (checkStraightFly(startPoint, countryExit)) {
            System.out.println("We can provide fly to " + countryExit);
            statusFly = true;
        } else if (checkFlyWithOneStop(countryExit)) {
            System.out.println("We can provide a fly but with a stop in one country");
            statusFly = true;
        } else {
            System.out.println("We can't provide fly!!");
            statusFly = false;
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

    public boolean checkFlyWithOneStop(String countryToRemove) {
        boolean status = false;
        List<String[]> checkStop = newList;
        String[] toCheck = startPoint; //copy array of connection StartPoint
        String country = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < toCheck.length; i++) {
            country = toCheck[i];
            String[] middle = checkStop.get(positionOnList(country));
            if (Arrays.asList(middle).contains(countryToRemove)) {
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
