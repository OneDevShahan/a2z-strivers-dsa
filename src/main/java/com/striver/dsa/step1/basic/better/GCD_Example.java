package com.striver.dsa.step1.basic.better;

public class GCD_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("GCD :" + findGCD(20, 15));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int findGCD(int start, int end) {
        for (int i = Math.min(start, end); i >= 0; i--) {
            if (start % i == 0 && end % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
