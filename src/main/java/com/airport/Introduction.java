package com.airport;

import java.util.Scanner;

public class Introduction {
    final String GREETINGS = "Hello, choose option";
    String flyTo = "I want to fly to:";

    public void intro() {
        System.out.println(GREETINGS);
        String fly = CountryCode.BE.codeLabel;
        Scanner sc = new Scanner(System.in);
        CountryCode cc = CountryCode.valueOf(sc.next());
        //      switch (cc.codeLabel) {
        switch (fly) {
            case "Belgium":
                System.out.println(flyTo + CountryCode.BE.codeLabel);
                break;
            case "Poland":
                System.out.println(flyTo + CountryCode.PL.codeLabel);
                break;
            case "Leave":
                System.out.println("Good day");
                break;
            default:
                System.out.println("Please choose a option"); //for now infinity loop
                intro();
        }
    }
}
