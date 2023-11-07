package com.airport;

public interface Menu {
    default void buyAlcohol() {
        System.out.println("better dont drink during fly");
    }
}
