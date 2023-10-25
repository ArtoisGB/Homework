package org.example;

public class FirstHomework {
    public int[] bubbleSort(int[] num) {
        for (int i = 0, j = num.length - 1; i < num.length - 1; i++, j--) {
            int tempForI;
            int tempForJ;
            //   int position =i+1;
            //   int secondPosition=j-1;
            if (num[i] > num[i + 1]) {
                tempForI = num[i];
                num[i] = num[i + 1];
                num[i + 1] = tempForI;
            }
            if (num[j] < num[j - 1]) {
                tempForJ = num[j];
                num[j] = num[j - 1];
                num[j - 1] = tempForJ;
            }
        }
        return num;
    }
}