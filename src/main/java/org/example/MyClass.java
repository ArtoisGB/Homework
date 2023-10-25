package org.example;

import java.util.Arrays;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("aloha");
        System.out.println("first task");
        int [] firstTable = {1,3,2,7,6,0};
        int [] secondTable = {1,3,2,7,6,0};
        class bubble{
            public int[] bubbleSort (int[] num){
            for (int i=0,j=num.length-1;i<num.length-1;i++,j--){
                int tempForI;
                int tempForJ;
                //   int position =i+1;
                //   int secondPosition=j-1;
                if (num[i]>num[i+1]){
                    tempForI=num[i];
                    num[i]=num[i+1];
                    num[i+1]=tempForI;
                }
                if(num[j]<num[j-1]){
                    tempForJ=num[j];
                    num[j]=firstTable[j-1];
                    num[j-1]=tempForJ;
                }
            } return num;
         }
        }
        bubble sort = new bubble();
        sort.bubbleSort(firstTable);
        System.out.println(Arrays.toString(firstTable));
        System.out.println(Arrays.toString(sort.bubbleSort(secondTable)));
    }
}
