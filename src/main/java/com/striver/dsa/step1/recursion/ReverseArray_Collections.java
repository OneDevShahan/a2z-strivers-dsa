package com.striver.dsa.step1.recursion;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray_Collections {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Integer[] array = {2, 4, 6, 7, 9};
        System.out.println("Passed array is: ");
        printArrayElements(array);
        System.out.println();
        System.out.println("Reverse array is: ");
        Collections.reverse(Arrays.asList(array));
        printArrayElements(array);
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printArrayElements(Integer[] array) {
        for (Integer i : array) {
            System.out.print(" " + i);
        }
    }
}
