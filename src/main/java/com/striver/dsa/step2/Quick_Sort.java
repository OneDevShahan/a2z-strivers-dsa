package com.striver.dsa.step2;

import java.util.Arrays;
import java.util.List;

public class Quick_Sort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> arr = Arrays.asList(new Integer[]{4, 6, 2, 5, 7, 9, 1, 3});
        System.out.println("Before sorting array: ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.size() - 1);
        System.out.println("After sorting array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void quickSort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int partitionIndex = getPartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int getPartitionIndex(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {

            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }
            while (arr.get(j) > pivot && j >= low - 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
