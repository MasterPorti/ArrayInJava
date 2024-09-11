package dev.pla;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[1]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        int arrayLength = firstTen.length;

        System.out.println(firstTen[0]);
        System.out.println(arrayLength);
        System.out.println(firstTen[arrayLength - 1]);

        int[] newArray;
        //  ❎ newArray = {1,2,3,4,5};
        // newArray = new int[]{1,2,4,5,6,7,8}; /// ✅

        newArray = new int[5];

        for (int i = 0; i < (newArray.length); i++) {
            newArray[i] = i*2;
        }

        for (int element: newArray){
            System.out.print(element + " ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(newArray));

        Object[] objectArray = new Object[3];
        objectArray[0] = "sadfdsf";
        objectArray[1] = 1;
        objectArray[2] = true;

        System.out.println(Arrays.toString(objectArray));

    }
}