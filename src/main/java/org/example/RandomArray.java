package org.example;

import java.util.Random;

public class RandomArray {
    Random random = new Random();

    public int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

}
