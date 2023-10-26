package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String SIZE_TABLE = "Put a desire size table with number greater than 1";
        System.out.println("first task");

        RandomTable randomTable = new RandomTable();
        FirstHomework firstHomework = new FirstHomework();
        Scanner sc = new Scanner(System.in);
        System.out.println(SIZE_TABLE);
        int sizeTable = sc.nextInt();
        int[] newTable = randomTable.createTable(sizeTable);
        System.out.println(Arrays.toString(newTable));
        System.out.println(Arrays.toString(firstHomework.bubbleSort(newTable)));

    }
}