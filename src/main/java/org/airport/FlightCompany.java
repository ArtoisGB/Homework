package org.airport;

import org.airport.customlist.CustomLinkedList;
import org.airport.exceptions.EmptyListException;
import org.airport.exceptions.TicketCreationException;
import org.airport.exceptions.WrongCalculationException;
import org.airport.interfaces.ICompany;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FlightCompany extends Base implements ICompany {
    private Map<Customer, CustomLinkedList<Fly>> customerTickets = new HashMap<>();
    private CustomLinkedList<Fly> ticketList = new CustomLinkedList<>();
    private Fly fly;
    private Distance distance = new Distance();
    private static String[] countriesStop;

    @Override
    public int calculateStraightDistance(String countryStart, String countryExit) {
        int km = distance.straightDistance(countryStart, countryExit);
        return km;
    }

    public void calculateDistanceWithStop(String type, String[] stopCountries, String countryStart, String countryExit, int distanceToExit) throws WrongCalculationException, TicketCreationException {
        int km = distanceToExit;
        for (int i = 0; i < stopCountries.length; i++) {
            if (calculateStraightDistance(stopCountries[i], countryExit) == 0) {
                throw new WrongCalculationException();
            }
            km += calculateStraightDistance(stopCountries[i], countryExit);
            fly = typeOfFlight.createTicket(type, countryStart, countryExit, km);
            ticketList.add(fly);
            km = distanceToExit;
        }
    }

    public void ticket(String type, String startCountry, String exitCountry) throws WrongCalculationException, TicketCreationException {
        connections.getStartPoint(startCountry, exitCountry);
        distance.distanceConnection();
        int distanceToExitCountry = 0;
        if (connections.provideFly(startCountry, exitCountry)) {
            distanceToExitCountry = calculateStraightDistance(startCountry, exitCountry);
            fly = typeOfFlight.createTicket(type, startCountry, exitCountry, distanceToExitCountry);
            ticketList.add(fly);
        }
        if (connections.checkFlyWithOneStop(startCountry, exitCountry)) {
            countriesStop = connections.getStopArray();
            calculateDistanceWithStop(type, countriesStop, startCountry, exitCountry, distanceToExitCountry);
        }
    }

    public final void detailsFly() {
        try {
            fly.introduceMenu();
            fly.buyAlcohol();
        } catch (NullPointerException nullPE) {
            LOGGER.error("Ahtung - we notice problem");
        }
    }

    public void showTickets(Customer customer) throws EmptyListException {
        if (ticketList.isEmpty()) {
            LOGGER.info("We cannot provide fly");
            throw new EmptyListException();
        }
        if (!ticketList.isEmpty()) {
            assignCustomerToTicket(customer);
            LOGGER.info(Arrays.asList(ticketList.toString()));
        }
    }

    public void assignCustomerToTicket(Customer customer) {
        customerTickets.put(customer, ticketList);
    }
}
