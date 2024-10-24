package com.striver.dsa.step2;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] array = {2, 41, 2, 9, 1, 5, 2, 9};
        System.out.println("Before selection sort : ");
        printTheArrayElements(array);
        long startTime = System.currentTimeMillis();
        selectionSorting(array);
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("After selection sort : ");
        printTheArrayElements(array);
    }

    public static void selectionSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    private static void printTheArrayElements(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
