package com.striver.dsa.step1.recursion;

public class ReverseArray_Traditional_2nd {
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
        int p1 = 0, p2 = array.length - 1;
        while (p1 < p2) {
            int tmp = array[p1];
            array[p1] = array[p2];
            array[p2] = tmp;
            p1++;
            p2--;
        }
        return array;
    }
}
