package com.airport.interfaces;

public interface Menu {
    default void buyAlcohol() {
        System.out.println("better dont drink during fly");
    }
}
