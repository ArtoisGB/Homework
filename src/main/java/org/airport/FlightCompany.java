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

    public void detailsFly() { //exception nullpointerexception
        fly.introduceMenu();
        fly.buyAlcohol();
    }

    public void showTickets(Customer customer) {
        if (!tickets.isEmpty()) {
            assignCustomerToTicket(customer);
            System.out.println(Arrays.asList(tickets.toArray()));
        } else {
            System.out.println("We cannot provide fly");
        }
    }

    public void assignCustomerToTicket(Customer customer) {
        customerTickets.put(customer, tickets);
    }
}
