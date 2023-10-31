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


        /*int firstArg = 0;
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[0]);
                System.out.println(firstArg);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        int[] array = new int[firstArg];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int k = 0; k < array.length - 1; k++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));*/
    }
}