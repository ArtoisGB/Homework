package org.airport;

import java.util.HashMap;
import java.util.Map;

public class Introduction extends Base {
    Customer customer = new Customer("Janusz", "Nowak");
    Customer customer2 = new Customer("B", "c");
    private String type = "First class";
    private String letsFly = "I want to fly";
    private Map<Customer, Fly> tickets = new HashMap<>();
    private String startPoint, endPoint;

    // try catch with resources(reader), own exception, logger, zrobic flightcompany i obsługę tego
    //pod spodem
    public void intro() {
        //   System.out.println(customer.toString());
        // System.out.println(customer2.toString());
        System.out.println(TextToPrint.CHOOSE.printLabel); //First class or Economic class
        //    String type = countryReader.countryReaderScanner(); //First class or Economic class
        //   String letsFly = countryReader.countryReaderScanner(); // Choose to fly or just leave

        // switch (countryReader.countryReaderScanner()) {
        switch (letsFly) {
            case "I want to fly" -> {
                System.out.println(TextToPrint.GREETINGS.printLabel);
                //startPoint = countryReader.countryReaderScanner(); endPoint = countryReader.countryReaderScanner();
                //connections.getStartPoint(startPoint,endPoint);
                if (!connections.provideFly("Poland", "Sweden")) {
                    break;
                }
                Fly fly = typeOfFlight.createTicket(type, "Poland", "Sweden", 200);
                //Fly fly1 = typeOfFlight.createTicket(type, startPoint, endPoint, 200);
                tickets.put(customer, fly);
                System.out.println(fly);
                fly.introduceMenu();
                fly.buyAlcohol();
                if (fly instanceof FirstClassFly) {  // to confirm fly is first class fly
                    System.out.println(type);
                }
                if (fly instanceof EconomicFly) {
                    System.out.println(type);
                }
            }
            case "Leave" -> System.out.println("Good day");
            default -> {
                System.out.println("Please choose a option");
                intro();
            }
        }
    }
}
