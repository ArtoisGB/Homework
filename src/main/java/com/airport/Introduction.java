package com.airport;

public class Introduction {
    final String GREETINGS = "Hello, choose option";
    Connections connections = new Connections();

    public void intro() {
        CountryArray countryArray = new CountryArray();

        System.out.println(GREETINGS);
        String fly = CountryCode.BELGIUM.codeLabel;
        String exitPoint = CountryCode.POLAND.codeLabel;
        // Scanner sc = new Scanner(System.in);
        //  CountryCode cc = CountryCode.valueOf(sc.next());
        //      switch (cc.codeLabel) {
        switch ("Belgium") {
            case "Belgium":
                System.out.println("Let's check fly to Belgium");
                System.out.println("We will start from Poland");
                //Belgium has value 1 and Poland 0
                connections.getStartPoint("Belgium", "Poland");
                break;
            case "Poland":
                System.out.println(" ");
                break;
            case "Leave":
                System.out.println("Good day");
                break;
            default:
                System.out.println("Please choose a option"); //for now infinity loop

        }
    }
}
