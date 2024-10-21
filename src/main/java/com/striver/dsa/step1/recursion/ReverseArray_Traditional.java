package com.striver.dsa.step1.recursion;

public class ReverseArray_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = {2, 4, 6, 7, 9};
        System.out.println("Passed array is: ");
        printArrayElements(array);
        System.out.println();
        System.out.println("Reverse array is: ");
        printArrayElements(reverseTheArray(array));
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printArrayElements(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    public static int[] reverseTheArray(int[] array) {
        int temp = 0;
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (i == j) {
                return array;
            }
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
        return array;
    }
}
