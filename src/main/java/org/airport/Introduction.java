package org.airport;

import org.airport.exceptions.EmptyListException;
import org.airport.exceptions.TicketCreationException;
import org.airport.exceptions.WrongCalculationException;

public class Introduction extends Base {
    private Customer customer = new Customer("Janusz", "Nowak");
    private Customer customer2 = new Customer("John", "Smith");
    private FlightCompany flightCompany = new FlightCompany();

    public void intro() throws EmptyListException, WrongCalculationException, TicketCreationException {
        LOGGER.info(TextToPrint.CHOOSE.printLabel);
        String type = "First class";    //countryReader.typeFlightScanner(); //First class or Economic class
        String letsFly = "I want to fly";//countryReader.countryReaderScanner();
        switch (letsFly) {              //(countryReader.countryReaderScanner())
            case "I want to fly" -> {
                LOGGER.info(TextToPrint.GREETINGS.printLabel);
                String startPoint = "Poland";//countryReader.countryReaderScanner();
                String endPoint = "Sweden";//countryReader.countryReaderScanner();
                flightCompany.ticket(type, startPoint, endPoint);
                LOGGER.info("Please choose a ticket: ");
                flightCompany.showTickets(customer);
                flightCompany.detailsFly();
            }
            case "Leave" -> LOGGER.info("Good day");
            default -> {
                LOGGER.info("Please choose a option");
                intro();
            }
        }
    }
}
