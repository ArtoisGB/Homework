package org.example;

import java.util.Scanner;

public class SizeOfTable {
    public int sizeTable() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Value is not a number or is less than 2, please try again");
            return sizeTable();
        }
        int size = sc.nextInt();
        if (size <= 1) {
            System.out.println("Value is not greater than 1 or it is decimal number, please try again");
            return sizeTable();
        }
        return size;
    }
}
