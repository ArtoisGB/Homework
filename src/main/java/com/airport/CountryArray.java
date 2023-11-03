package com.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class CountryArray {
    CountryCode[] code = CountryCode.values();
    List<String[]> arrayConnectionCountry = new ArrayList<>();
    List<String> names = new ArrayList<>();

    public void fillListWithCountryNames() {
        for (int i = 0; i < code.length - 1; i++) {
            names.add(code[i].codeLabel);
        }
    }

    Random random = new Random();

    public void addArraysToList() {
        fillListWithCountryNames();
        String[] poland = new String[createRandomSize()];
        fillArrayConnection(poland);
        arrayConnectionCountry.add(poland);
        String[] belgium = new String[createRandomSize()];
        fillArrayConnection(belgium);
        arrayConnectionCountry.add(belgium);
        String[] germany = new String[createRandomSize()];
        fillArrayConnection(germany);
        arrayConnectionCountry.add(germany);
        String[] italy = new String[createRandomSize()];
        fillArrayConnection(italy);
        arrayConnectionCountry.add(italy);
        String[] sweden = new String[createRandomSize()];
        fillArrayConnection(sweden);
        arrayConnectionCountry.add(sweden);
        String[] england = new String[createRandomSize()];
        fillArrayConnection(england);
        arrayConnectionCountry.add(england);
        String[] island = new String[createRandomSize()];
        fillArrayConnection(island);
        arrayConnectionCountry.add(island);
        String[] austria = new String[createRandomSize()];
        fillArrayConnection(austria);
        arrayConnectionCountry.add(austria);
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

  /*  public int fillRandomCountryArray(String[] array, int value) {
        int randomInt = newRandomValue();
        String check = code[value].getCodeLabel();
        if (Arrays.asList(array)
                .contains(check)) {
            fillRandomCountryArray(array, randomInt);
        }
        return value;
    }*/

    public void print() {
        for (String[] num : arrayConnectionCountry) {
            System.out.println(Arrays.toString(num));
        }
    }

    public List<String[]> getListConnections() {
        return arrayConnectionCountry;
    }

    public List<String> getListNames() {
        return names;
    }

}
