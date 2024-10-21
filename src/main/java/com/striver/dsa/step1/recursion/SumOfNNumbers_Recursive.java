package com.striver.dsa.step1.recursion;

public class SumOfNNumbers_Recursive {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Sum of first N numbers : " + sumOfFirstNNumbers(5));
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int sumOfFirstNNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfFirstNNumbers(n - 1);
    }
}
