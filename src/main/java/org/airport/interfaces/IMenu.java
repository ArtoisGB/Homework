package org.airport.interfaces;

public interface IMenu {
    default void buyAlcohol() {
        System.out.println("better dont drink during fly");
    }
}
