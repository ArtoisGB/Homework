package com.airport;

public class Introduction {
    CountryReader countryReader = new CountryReader();
    final String GREETINGS = "Hello, choose option";
    Connections connections = new Connections();

    // Scanner sc = new Scanner(System.in);
    public void intro() {
        TypeOfFlight typeOfFlight = new TypeOfFlight();
        Fly flyToSomePlace = new Fly(200);
        ExpensiveFly expensiveFly = new ExpensiveFly(200, "Name");

        System.out.println(GREETINGS);
        String fly = "I want to fly";
        //      switch (sc) {
        switch (fly) {
            case "I want to fly":
                connections.getStartPoint(countryReader.countryReaderScanner(),
                        countryReader.countryReaderScanner());
                break;
            case "Leave":
                System.out.println("Good day");
                break;
            default:
                System.out.println("Please choose a option");
                intro();
        }
    }
}
