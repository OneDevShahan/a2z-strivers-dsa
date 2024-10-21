package com.striver.dsa.step1.recursion;

public class ReverseArray_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = {2, 4, 6, 7, 9};
        System.out.println("Passed array is: ");
        printArrayElements(array);
        System.out.println();
        System.out.println("Reverse array is: ");
        reverseTheArray(array, 0, array.length - 1);
        printArrayElements(array);
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void printArrayElements(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    public static void reverseTheArray(int[] array, int start, int end) {
        if (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            reverseTheArray(array, start + 1, end - 1);
        }
    }
}
