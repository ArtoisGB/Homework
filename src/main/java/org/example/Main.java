package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String SIZE_ARRAY = "Put a desire size array with number greater than 1";
        System.out.println("first task");
        ReaderSize sizeArray = new ReaderSize();
        RandomArray randomArray = new RandomArray();
        FirstHomework firstHomework = new FirstHomework();
        System.out.println(SIZE_ARRAY);
        int lengthArray = sizeArray.readSizeOfArray();
        int[] array = randomArray.createArray(lengthArray);
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(array));
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(firstHomework.bubbleSort(array)));

    }
}