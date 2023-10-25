package org.example;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("aloha");
        System.out.println("first task");
        int[] firstTable = {1, 3, 2, 7, 6, 0};
        int[] secondTable = {1, 3, 2, 7, 6, 0};

        FirstHomework firstHomework = new FirstHomework();
        firstHomework.bubbleSort(firstTable);
        System.out.println(Arrays.toString(firstTable));
        System.out.println(Arrays.toString(firstHomework.bubbleSort(secondTable)));
    }
}
