package com.striver.dsa.step1.hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementInArray_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Integer[] elements = {2, 5, 2, 1, 3, 2, 9, 5, 1, 3, 4, 7};
        countFrequencyOfArrayElements(elements);
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void countFrequencyOfArrayElements(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Element " + entry.getKey() + " ==> " + entry.getValue() + " times");
        }
    }
}
