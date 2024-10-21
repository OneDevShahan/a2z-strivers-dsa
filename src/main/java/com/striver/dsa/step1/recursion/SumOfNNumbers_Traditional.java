package com.striver.dsa.step1.recursion;

public class SumOfNNumbers_Traditional {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Sum of first N numbers : " + sumOfFirstNNumbers(5));
        System.out.println();
        System.out.println("Total time taken to execute : " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int sumOfFirstNNumbers(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
