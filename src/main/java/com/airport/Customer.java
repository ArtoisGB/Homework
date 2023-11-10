package com.airport;

public class Customer {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final int ID;
    private static int idCounter = 0; //to create immutable autoincrement id


    public Customer(String firstName, String lastName) {
        this.FIRST_NAME = firstName;
        this.LAST_NAME = lastName;
        this.ID = idCounter++;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public int getID() {
        return ID;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + FIRST_NAME + '\'' +
                ", lastName='" + LAST_NAME + '\'' +
                "ID: " + ID +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
