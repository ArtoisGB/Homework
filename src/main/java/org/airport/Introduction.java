package org.airport;

public class Introduction extends Base {
    private Customer customer = new Customer("Janusz", "Nowak");
    private Customer customer2 = new Customer("John", "Smith");
    private FlightCompany flightCompany = new FlightCompany();

    public void intro() {
        System.out.println(TextToPrint.CHOOSE.printLabel);
        String type = "First class";    //countryReader.countryReaderScanner(); //First class or Economic class
        String letsFly = "I want to fly";//countryReader.countryReaderScanner();
        switch (letsFly) {              //(countryReader.countryReaderScanner())
            case "I want to fly" -> {
                System.out.println(TextToPrint.GREETINGS.printLabel);
                String startPoint = "Poland";//countryReader.countryReaderScanner();
                String endPoint = "Sweden";//countryReader.countryReaderScanner();
                flightCompany.ticket(type, startPoint, endPoint);
                System.out.println("Please choose a ticket: ");
                flightCompany.showTickets();
                flightCompany.detailsFly();
            }
            case "Leave" -> System.out.println("Good day");
            default -> {
                System.out.println("Please choose a option");
                intro();
            }
        }
    }
}
