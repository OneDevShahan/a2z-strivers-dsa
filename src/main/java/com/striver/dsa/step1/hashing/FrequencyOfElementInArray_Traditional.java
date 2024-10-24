package com.striver.dsa.step1.hashing;

public class FrequencyOfElementInArray_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] elements = {2, 5, 2, 1, 3, 2, 9, 5, 1, 3, 4, 7};
        countFrequencyOfArrayElements(elements);
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void countFrequencyOfArrayElements(int[] array) {
        boolean[] res = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (res[i]) continue;
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    res[j] = true;
                    count++;
                }
            }
            System.out.println("Element " + array[i] + " occurs " + count + " times");
        }
    }
}
