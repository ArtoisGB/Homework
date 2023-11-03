package com.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connections {
    CountryArray countryArray = new CountryArray();
    List<String[]> newList = new ArrayList<>();
    List<String> namesToCheck = new ArrayList<>();
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
        countryArray.addArraysToList();
        newList = countryArray.getListConnections();
        namesToCheck = countryArray.getListNames();
        startPoint = newList.get(positionOnList(countryStart));
        System.out.println("StartPoint has connection to " + Arrays.asList(startPoint));
        desirePoint = newList.get(positionOnList(countryExit));
        System.out.println("DesirePoint has connection to " + Arrays.asList(desirePoint));


        if (checkStraightFly(startPoint, countryExit)) {
            System.out.println("We can provide fly to " + countryExit);
        } else if (checkFlyWithOneStop(countryStart, countryExit)) {
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

    public boolean checkFlyWithOneStop(String removeOne, String removeTwo) {
        boolean status = false;
        List<String[]> checkStop = newList;
        String[] toCheck = startPoint;
        String country = "";
        checkStop.remove(positionOnList(removeOne));
        for (int i = 0; i < toCheck.length - 1; i++) {
            country = toCheck[i];
            for (int j = 0; j < checkStop.size() - 1; j++) {
                String[] middle = checkStop.get(j);
                if (Arrays.asList(middle).contains(removeTwo)) {
                    return true;
                }
            }
        }
        System.out.println("We found fly with stop in" + country);
        return status;
    }
}
