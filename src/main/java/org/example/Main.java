package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String SIZE_TABLE = "Put a desire size table with number greater than 1";
        System.out.println("first task");
        SizeOfTable sizeOfTable = new SizeOfTable();
        RandomTable randomTable = new RandomTable();
        FirstHomework firstHomework = new FirstHomework();
        System.out.println(SIZE_TABLE);
        int lengthTable = sizeOfTable.sizeTable();
        int[] newTable = randomTable.createTable(lengthTable);
        System.out.println("Table before sorting:");
        System.out.println(Arrays.toString(newTable));
        System.out.println(Arrays.toString(firstHomework.bubbleSort(newTable)));

    }
}