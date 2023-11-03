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
        desirePoint = newList.get(positionOnList(countryExit));

        if (checkStraightFly(desirePoint, countryExit)) {
            System.out.println("We can provide fly");
        } else if (checkFlyWithOneStop() == true) {

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

    public boolean checkFlyWithOneStop() {
        boolean status = false;
        if()
        return status;
    }
}
