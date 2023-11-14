package org.airport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Distance extends Base {
    private Map<String, String[]> mapConnection = new HashMap<>();
    private Map<String, Integer[]> distanceConnection = new HashMap<>();
    private CountryArray countryArray = new CountryArray();
    private List<String> stringList = countryArray.getListNames();
    private List<String[]> connectionList = countryArray.getListConnections();

    public void distanceConnection() { //
        for (int i = 0; i < connectionList.size(); i++) {
            mapConnection.put(stringList.get(i), connectionList.get(i));
            distanceConnection.put(stringList.get(i), distanceBetweenCountries(connectionList.get(i)));
        }
    }

    public int straightDistance(String countryStart, String countryExit) {
        int km = 0;
        String[] list = mapConnection.get(countryStart);
        Integer[] distanceValue = distanceConnection.get(countryStart);
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(countryExit)) {
                km = distanceValue[i];
            }
        }

        return km;
    }

    public Integer[] distanceBetweenCountries(String[] listCountry) {
        Integer[] distance = new Integer[listCountry.length];
        for (int i = 0; i < listCountry.length; i++) {
            distance[i] = random.nextInt(200, 2000);
        }
        return distance;
    }
}
