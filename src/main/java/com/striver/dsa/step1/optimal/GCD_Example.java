package com.striver.dsa.step1.optimal;

public class GCD_Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("GCD :" + findGCD(20, 15));
        System.out.println("Total time taken : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int findGCD(int start, int end) {
        while (start > 0 && end > 0) {
            if (start > end) {
                start = start % end;
            } else {
                end = end % start;
            }
        }
        if (start == 0) {
            return end;
        }
        return start;
    }
}
