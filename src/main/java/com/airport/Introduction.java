package com.airport;

public class Introduction {
    Connections connections = new Connections();
    TypeOfFlight typeOfFlight = new TypeOfFlight();

    public void intro() {
        System.out.println(TextToPrint.CHOOSE); //First class or Economic class
        String type = "First class";
        //String type = countryReader.countryReaderScanner(); //First class or Economic class
        String startPoint, endPoint;
        String letsFly = "I want to fly";

        // switch (countryReader.countryReaderScanner()) {
        switch (letsFly) {
            case "I want to fly" -> {
                System.out.println(TextToPrint.GREETINGS);
                //startPoint = countryReader.countryReaderScanner(); endPoint = countryReader.countryReaderScanner();
                //connections.getStartPoint(startPoint,endPoint);
                connections.getStartPoint("Poland", "Sweden");
                Fly fly = typeOfFlight.createTicket(type, "Poland", "Sweden", 200);
                //Fly fly = typeOfFlight.createTicket(type, startPoint, endPoint, 200);
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
