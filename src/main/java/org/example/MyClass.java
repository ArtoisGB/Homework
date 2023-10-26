package org.example;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        RandomTable randomTable = new RandomTable();
        System.out.println("first task");
        int[] firstTable = {11, 60, 19, 30, 39, 41, 72, 59, 65, 77};

        FirstHomework firstHomework = new FirstHomework();
        firstHomework.bubbleSort(firstTable);
        System.out.println(Arrays.toString(firstTable));
        int[] newTable = randomTable.createTable(10);
        System.out.println(Arrays.toString(newTable));
        System.out.println(Arrays.toString(firstHomework.bubbleSort(newTable)));
    }
}
