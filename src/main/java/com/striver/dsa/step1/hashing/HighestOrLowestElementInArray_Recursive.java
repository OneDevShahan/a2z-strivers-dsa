package com.striver.dsa.step1.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOrLowestElementInArray_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Integer[] elements = {10, 5, 10, 15, 10, 5};
        highestOrLowestElementInArray(elements);
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static void highestOrLowestElementInArray(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int maxEle = 0, maxCount = 0, minCount = array.length, minEle = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                maxEle = element;
            }
            if (count < minCount) {
                minEle = element;
                minCount = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
