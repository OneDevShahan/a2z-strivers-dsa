package com.striver.dsa.step2;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};
        System.out.println("Before bubble sort : ");
        printTheArrayElements(array);
        long startTime = System.currentTimeMillis();
        bubbleSorting(array);
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("After bubble sort : ");
        printTheArrayElements(array);
    }

    public static void bubbleSorting(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void printTheArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
