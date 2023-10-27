package org.example;

import java.util.Scanner;

public class ReaderSize {
    public int readSizeOfArray() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Value is not a number, please try again");
            return readSizeOfArray();
        }
        int size = sc.nextInt();
        if (size <= 1) {
            System.out.println("Value is not greater than 1 or it is decimal number, please try again");
            return readSizeOfArray();
        }
        return size;
    }
}
