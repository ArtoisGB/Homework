package com.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class CountryArray {
    CountryCode[] code = CountryCode.values();
    List<String[]> arrayConnectionCountry = new ArrayList<>();
    List<String> names = new ArrayList<>();
    Random random = new Random();

    public void fillListWithCountryNames() {
        for (int i = 0; i < code.length - 1; i++) {
            names.add(code[i].codeLabel);
        }
    }

    public void arrayToList(String[] name) {
        fillArrayConnection(name);
        arrayConnectionCountry.add(name);
    }

    public void addConnectionsToList() {
        fillListWithCountryNames();
        String[] poland = new String[createRandomSize()];
        arrayToList(poland);
        String[] belgium = new String[createRandomSize()];
        arrayToList(belgium);
        String[] germany = new String[createRandomSize()];
        arrayToList(germany);
        String[] italy = new String[createRandomSize()];
        arrayToList(italy);
        String[] sweden = new String[createRandomSize()];
        arrayToList(sweden);
        String[] england = new String[createRandomSize()];
        arrayToList(england);
        String[] island = new String[createRandomSize()];
        arrayToList(island);
        String[] austria = new String[createRandomSize()];
        arrayToList(austria);
        print();
    }

    public int createRandomSize() {
        int sizeArray = random.nextInt(names.size());
        if (sizeArray <= 1) {
            return sizeArray + 3;
        }
        return sizeArray;
    }

    public void fillArrayConnection(String[] temp) {
        List<String> tempNames = new ArrayList<>();
        tempNames.addAll(names);
        for (int i = 0; i < temp.length; i++) {
            int randomCountry = random.nextInt(tempNames.size());
            temp[i] = tempNames.get(randomCountry);
            tempNames.remove(randomCountry);
        }
    }

    public void print() {
        for (int i = 0; i < arrayConnectionCountry.size() - 1; i++) {
            System.out.println(names.get(i) + ": " +
                    Arrays.toString(arrayConnectionCountry.get(i)));
        }
    }

    public List<String[]> getListConnections() {
        return arrayConnectionCountry;
    }

    public List<String> getListNames() {
        return names;
    }

}
