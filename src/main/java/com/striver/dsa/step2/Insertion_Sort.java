package com.striver.dsa.step2;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};
        System.out.println("Before insertion sort : ");
        printTheArrayElements(array);
        long startTime = System.currentTimeMillis();
        insertionSorting(array);
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("After insertion sort : ");
        printTheArrayElements(array);
    }

    public static void insertionSorting(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    private static void printTheArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
