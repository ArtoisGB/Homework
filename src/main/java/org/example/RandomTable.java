package org.example;

import java.util.Random;

public class RandomTable {
    Random random = new Random();

    public int[] createTable(int size) {
        int[] newTable = new int[size];
        for (int i = 0; i < newTable.length; i++) {
            newTable[i] = random.nextInt(100);
        }
        return newTable;
    }

}
