package org.airport;

import java.util.*;

public class FlightCompany extends Base {
    private Map<Customer, List<Fly>> customerTickets = new HashMap<>();
    private List<Fly> tickets = new ArrayList<>();
    private Fly fly;
    private Distance distance = new Distance();
    static String[] countriesStop;

    public int calculateStraightDistance(String countryStart, String countryExit) {
        int km = distance.straightDistance(countryStart, countryExit);
        return km;
    }

    public void calculateDistanceWithStop(String type, String[] stopCountries, String countryStart, String countryExit, int distanceToExit) {
        int km = distanceToExit;
        for (int i = 0; i < stopCountries.length; i++) {
            km += calculateStraightDistance(stopCountries[i], countryExit);
            fly = typeOfFlight.createTicket(type, countryStart, countryExit, km);
            tickets.add(fly);
            km = distanceToExit;
        }
    }

    public void ticket(String type, String startCountry, String exitCountry) {
        connections.getStartPoint(startCountry, exitCountry);
        distance.distanceConnection();
        int distanceToExitCountry = 0;
        if (connections.provideFly(startCountry, exitCountry)) {
            distanceToExitCountry = calculateStraightDistance(startCountry, exitCountry);
            fly = typeOfFlight.createTicket(type, startCountry, exitCountry, distanceToExitCountry);
            tickets.add(fly);
        }
        if (connections.checkFlyWithOneStop(startCountry, exitCountry)) {
            countriesStop = connections.getStopArray();
            calculateDistanceWithStop(type, countriesStop, startCountry, exitCountry, distanceToExitCountry);
        }
    }

    public void detailsFly() {
        fly.introduceMenu();
        fly.buyAlcohol();
    }

    public void showTickets() {
        if (!tickets.isEmpty()) {
            System.out.println(Arrays.asList(tickets.toArray()));
        } else {
            System.out.println("we cannot provide fly");
        }
    }
}
